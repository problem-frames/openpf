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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_SL_COMMENT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'+'", "'-'", "'->'", "'<->'", "'&'", "'|'", "'.'", "'['", "']'", "','", "'('", "')'", "'sort'", "'load'", "'range'", "'fluent'", "'event'", "'HoldsAt'", "'Happens'", "'Initiates'", "'Terminates'", "'/'", "'actor'", "'{'", "'}'", "'agent'", "'role'", "'position'", "'goal'", "'soft'", "'task'", "'resource'", "'belief'", "'~~>'", "'~>'", "'<-(and)-'", "'<-(or)-'", "'-(and)->'", "'-(or)->'", "'-(+)->'", "'-(++)->'", "'-(-)->'", "'-(--)->'"
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


    // $ANTLR start entryRuleContainer
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:683:1: entryRuleContainer : ruleContainer EOF ;
    public final void entryRuleContainer() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:683:20: ( ruleContainer EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:684:1: ruleContainer EOF
            {
             before(grammarAccess.getContainerRule()); 
            pushFollow(FOLLOW_ruleContainer_in_entryRuleContainer1442);
            ruleContainer();
            _fsp--;

             after(grammarAccess.getContainerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContainer1449); 

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
    // $ANTLR end entryRuleContainer


    // $ANTLR start ruleContainer
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:691:1: ruleContainer : ( ( rule__Container__Alternatives ) ) ;
    public final void ruleContainer() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:695:2: ( ( ( rule__Container__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:696:1: ( ( rule__Container__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:696:1: ( ( rule__Container__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:697:1: ( rule__Container__Alternatives )
            {
             before(grammarAccess.getContainerAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:698:1: ( rule__Container__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:698:2: rule__Container__Alternatives
            {
            pushFollow(FOLLOW_rule__Container__Alternatives_in_ruleContainer1476);
            rule__Container__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getContainerAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleContainer


    // $ANTLR start entryRuleActor
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:710:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:710:16: ( ruleActor EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:711:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1502);
            ruleActor();
            _fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1509); 

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
    // $ANTLR end entryRuleActor


    // $ANTLR start ruleActor
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:718:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:722:2: ( ( ( rule__Actor__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:723:1: ( ( rule__Actor__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:723:1: ( ( rule__Actor__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:724:1: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:725:1: ( rule__Actor__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:725:2: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_rule__Actor__Group__0_in_ruleActor1536);
            rule__Actor__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleActor


    // $ANTLR start entryRuleAgent
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:737:1: entryRuleAgent : ruleAgent EOF ;
    public final void entryRuleAgent() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:737:16: ( ruleAgent EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:738:1: ruleAgent EOF
            {
             before(grammarAccess.getAgentRule()); 
            pushFollow(FOLLOW_ruleAgent_in_entryRuleAgent1562);
            ruleAgent();
            _fsp--;

             after(grammarAccess.getAgentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAgent1569); 

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
    // $ANTLR end entryRuleAgent


    // $ANTLR start ruleAgent
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:745:1: ruleAgent : ( ( rule__Agent__Group__0 ) ) ;
    public final void ruleAgent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:749:2: ( ( ( rule__Agent__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:750:1: ( ( rule__Agent__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:750:1: ( ( rule__Agent__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:751:1: ( rule__Agent__Group__0 )
            {
             before(grammarAccess.getAgentAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:752:1: ( rule__Agent__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:752:2: rule__Agent__Group__0
            {
            pushFollow(FOLLOW_rule__Agent__Group__0_in_ruleAgent1596);
            rule__Agent__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAgentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAgent


    // $ANTLR start entryRuleRole
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:764:1: entryRuleRole : ruleRole EOF ;
    public final void entryRuleRole() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:764:15: ( ruleRole EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:765:1: ruleRole EOF
            {
             before(grammarAccess.getRoleRule()); 
            pushFollow(FOLLOW_ruleRole_in_entryRuleRole1622);
            ruleRole();
            _fsp--;

             after(grammarAccess.getRoleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRole1629); 

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
    // $ANTLR end entryRuleRole


    // $ANTLR start ruleRole
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:772:1: ruleRole : ( ( rule__Role__Group__0 ) ) ;
    public final void ruleRole() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:776:2: ( ( ( rule__Role__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:777:1: ( ( rule__Role__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:777:1: ( ( rule__Role__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:778:1: ( rule__Role__Group__0 )
            {
             before(grammarAccess.getRoleAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:779:1: ( rule__Role__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:779:2: rule__Role__Group__0
            {
            pushFollow(FOLLOW_rule__Role__Group__0_in_ruleRole1656);
            rule__Role__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRoleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRole


    // $ANTLR start entryRulePosition
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:791:1: entryRulePosition : rulePosition EOF ;
    public final void entryRulePosition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:791:19: ( rulePosition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:792:1: rulePosition EOF
            {
             before(grammarAccess.getPositionRule()); 
            pushFollow(FOLLOW_rulePosition_in_entryRulePosition1682);
            rulePosition();
            _fsp--;

             after(grammarAccess.getPositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePosition1689); 

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
    // $ANTLR end entryRulePosition


    // $ANTLR start rulePosition
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:799:1: rulePosition : ( ( rule__Position__Group__0 ) ) ;
    public final void rulePosition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:803:2: ( ( ( rule__Position__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:804:1: ( ( rule__Position__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:804:1: ( ( rule__Position__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:805:1: ( rule__Position__Group__0 )
            {
             before(grammarAccess.getPositionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:806:1: ( rule__Position__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:806:2: rule__Position__Group__0
            {
            pushFollow(FOLLOW_rule__Position__Group__0_in_rulePosition1716);
            rule__Position__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePosition


    // $ANTLR start entryRuleIntention
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:818:1: entryRuleIntention : ruleIntention EOF ;
    public final void entryRuleIntention() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:818:20: ( ruleIntention EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:819:1: ruleIntention EOF
            {
             before(grammarAccess.getIntentionRule()); 
            pushFollow(FOLLOW_ruleIntention_in_entryRuleIntention1742);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getIntentionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntention1749); 

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
    // $ANTLR end entryRuleIntention


    // $ANTLR start ruleIntention
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:826:1: ruleIntention : ( ( rule__Intention__Alternatives ) ) ;
    public final void ruleIntention() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:830:2: ( ( ( rule__Intention__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:831:1: ( ( rule__Intention__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:831:1: ( ( rule__Intention__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:832:1: ( rule__Intention__Alternatives )
            {
             before(grammarAccess.getIntentionAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:833:1: ( rule__Intention__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:833:2: rule__Intention__Alternatives
            {
            pushFollow(FOLLOW_rule__Intention__Alternatives_in_ruleIntention1776);
            rule__Intention__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getIntentionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleIntention


    // $ANTLR start entryRuleGoal
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:845:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:845:15: ( ruleGoal EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:846:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1802);
            ruleGoal();
            _fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1809); 

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
    // $ANTLR end entryRuleGoal


    // $ANTLR start ruleGoal
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:853:1: ruleGoal : ( ( rule__Goal__Group__0 ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:857:2: ( ( ( rule__Goal__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:858:1: ( ( rule__Goal__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:858:1: ( ( rule__Goal__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:859:1: ( rule__Goal__Group__0 )
            {
             before(grammarAccess.getGoalAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:860:1: ( rule__Goal__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:860:2: rule__Goal__Group__0
            {
            pushFollow(FOLLOW_rule__Goal__Group__0_in_ruleGoal1836);
            rule__Goal__Group__0();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleGoal


    // $ANTLR start entryRuleSoftgoal
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:872:1: entryRuleSoftgoal : ruleSoftgoal EOF ;
    public final void entryRuleSoftgoal() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:872:19: ( ruleSoftgoal EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:873:1: ruleSoftgoal EOF
            {
             before(grammarAccess.getSoftgoalRule()); 
            pushFollow(FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1862);
            ruleSoftgoal();
            _fsp--;

             after(grammarAccess.getSoftgoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftgoal1869); 

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
    // $ANTLR end entryRuleSoftgoal


    // $ANTLR start ruleSoftgoal
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:880:1: ruleSoftgoal : ( ( rule__Softgoal__Group__0 ) ) ;
    public final void ruleSoftgoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:884:2: ( ( ( rule__Softgoal__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:885:1: ( ( rule__Softgoal__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:885:1: ( ( rule__Softgoal__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:886:1: ( rule__Softgoal__Group__0 )
            {
             before(grammarAccess.getSoftgoalAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:887:1: ( rule__Softgoal__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:887:2: rule__Softgoal__Group__0
            {
            pushFollow(FOLLOW_rule__Softgoal__Group__0_in_ruleSoftgoal1896);
            rule__Softgoal__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSoftgoalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSoftgoal


    // $ANTLR start entryRuleTask
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:899:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:899:15: ( ruleTask EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:900:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_ruleTask_in_entryRuleTask1922);
            ruleTask();
            _fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTask1929); 

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
    // $ANTLR end entryRuleTask


    // $ANTLR start ruleTask
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:907:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:911:2: ( ( ( rule__Task__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:912:1: ( ( rule__Task__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:912:1: ( ( rule__Task__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:913:1: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:914:1: ( rule__Task__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:914:2: rule__Task__Group__0
            {
            pushFollow(FOLLOW_rule__Task__Group__0_in_ruleTask1956);
            rule__Task__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTask


    // $ANTLR start entryRuleResource
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:926:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:926:19: ( ruleResource EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:927:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1982);
            ruleResource();
            _fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1989); 

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
    // $ANTLR end entryRuleResource


    // $ANTLR start ruleResource
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:934:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:938:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:939:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:939:1: ( ( rule__Resource__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:940:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:941:1: ( rule__Resource__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:941:2: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_rule__Resource__Group__0_in_ruleResource2016);
            rule__Resource__Group__0();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleResource


    // $ANTLR start entryRuleBelief
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:953:1: entryRuleBelief : ruleBelief EOF ;
    public final void entryRuleBelief() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:953:17: ( ruleBelief EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:954:1: ruleBelief EOF
            {
             before(grammarAccess.getBeliefRule()); 
            pushFollow(FOLLOW_ruleBelief_in_entryRuleBelief2042);
            ruleBelief();
            _fsp--;

             after(grammarAccess.getBeliefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBelief2049); 

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
    // $ANTLR end entryRuleBelief


    // $ANTLR start ruleBelief
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:961:1: ruleBelief : ( ( rule__Belief__Group__0 ) ) ;
    public final void ruleBelief() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:965:2: ( ( ( rule__Belief__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:966:1: ( ( rule__Belief__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:966:1: ( ( rule__Belief__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:967:1: ( rule__Belief__Group__0 )
            {
             before(grammarAccess.getBeliefAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:968:1: ( rule__Belief__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:968:2: rule__Belief__Group__0
            {
            pushFollow(FOLLOW_rule__Belief__Group__0_in_ruleBelief2076);
            rule__Belief__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBeliefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBelief


    // $ANTLR start entryRuleAssociation
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:984:1: entryRuleAssociation : ruleAssociation EOF ;
    public final void entryRuleAssociation() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:984:22: ( ruleAssociation EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:985:1: ruleAssociation EOF
            {
             before(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_ruleAssociation_in_entryRuleAssociation2106);
            ruleAssociation();
            _fsp--;

             after(grammarAccess.getAssociationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssociation2113); 

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
    // $ANTLR end entryRuleAssociation


    // $ANTLR start ruleAssociation
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:992:1: ruleAssociation : ( ( rule__Association__Group__0 ) ) ;
    public final void ruleAssociation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:996:2: ( ( ( rule__Association__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:997:1: ( ( rule__Association__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:997:1: ( ( rule__Association__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:998:1: ( rule__Association__Group__0 )
            {
             before(grammarAccess.getAssociationAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:999:1: ( rule__Association__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:999:2: rule__Association__Group__0
            {
            pushFollow(FOLLOW_rule__Association__Group__0_in_ruleAssociation2140);
            rule__Association__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAssociation


    // $ANTLR start entryRuleDependency
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1011:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1011:21: ( ruleDependency EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1012:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency2166);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency2173); 

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
    // $ANTLR end entryRuleDependency


    // $ANTLR start ruleDependency
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1019:1: ruleDependency : ( ( rule__Dependency__Group__0 ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1023:2: ( ( ( rule__Dependency__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1024:1: ( ( rule__Dependency__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1024:1: ( ( rule__Dependency__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1025:1: ( rule__Dependency__Group__0 )
            {
             before(grammarAccess.getDependencyAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1026:1: ( rule__Dependency__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1026:2: rule__Dependency__Group__0
            {
            pushFollow(FOLLOW_rule__Dependency__Group__0_in_ruleDependency2200);
            rule__Dependency__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDependency


    // $ANTLR start entryRuleDecomposition
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1038:1: entryRuleDecomposition : ruleDecomposition EOF ;
    public final void entryRuleDecomposition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1038:24: ( ruleDecomposition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1039:1: ruleDecomposition EOF
            {
             before(grammarAccess.getDecompositionRule()); 
            pushFollow(FOLLOW_ruleDecomposition_in_entryRuleDecomposition2226);
            ruleDecomposition();
            _fsp--;

             after(grammarAccess.getDecompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposition2233); 

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
    // $ANTLR end entryRuleDecomposition


    // $ANTLR start ruleDecomposition
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1046:1: ruleDecomposition : ( ( rule__Decomposition__Alternatives ) ) ;
    public final void ruleDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1050:2: ( ( ( rule__Decomposition__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1051:1: ( ( rule__Decomposition__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1051:1: ( ( rule__Decomposition__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1052:1: ( rule__Decomposition__Alternatives )
            {
             before(grammarAccess.getDecompositionAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1053:1: ( rule__Decomposition__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1053:2: rule__Decomposition__Alternatives
            {
            pushFollow(FOLLOW_rule__Decomposition__Alternatives_in_ruleDecomposition2260);
            rule__Decomposition__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDecompositionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDecomposition


    // $ANTLR start entryRuleAndDecomposition
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1065:1: entryRuleAndDecomposition : ruleAndDecomposition EOF ;
    public final void entryRuleAndDecomposition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1065:27: ( ruleAndDecomposition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1066:1: ruleAndDecomposition EOF
            {
             before(grammarAccess.getAndDecompositionRule()); 
            pushFollow(FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition2286);
            ruleAndDecomposition();
            _fsp--;

             after(grammarAccess.getAndDecompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndDecomposition2293); 

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
    // $ANTLR end entryRuleAndDecomposition


    // $ANTLR start ruleAndDecomposition
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1073:1: ruleAndDecomposition : ( ( rule__AndDecomposition__Group__0 ) ) ;
    public final void ruleAndDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1077:2: ( ( ( rule__AndDecomposition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1078:1: ( ( rule__AndDecomposition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1078:1: ( ( rule__AndDecomposition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1079:1: ( rule__AndDecomposition__Group__0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1080:1: ( rule__AndDecomposition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1080:2: rule__AndDecomposition__Group__0
            {
            pushFollow(FOLLOW_rule__AndDecomposition__Group__0_in_ruleAndDecomposition2320);
            rule__AndDecomposition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAndDecompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAndDecomposition


    // $ANTLR start entryRuleOrDecomposition
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1092:1: entryRuleOrDecomposition : ruleOrDecomposition EOF ;
    public final void entryRuleOrDecomposition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1092:26: ( ruleOrDecomposition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1093:1: ruleOrDecomposition EOF
            {
             before(grammarAccess.getOrDecompositionRule()); 
            pushFollow(FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition2346);
            ruleOrDecomposition();
            _fsp--;

             after(grammarAccess.getOrDecompositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrDecomposition2353); 

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
    // $ANTLR end entryRuleOrDecomposition


    // $ANTLR start ruleOrDecomposition
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1100:1: ruleOrDecomposition : ( ( rule__OrDecomposition__Group__0 ) ) ;
    public final void ruleOrDecomposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1104:2: ( ( ( rule__OrDecomposition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1105:1: ( ( rule__OrDecomposition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1105:1: ( ( rule__OrDecomposition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1106:1: ( rule__OrDecomposition__Group__0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1107:1: ( rule__OrDecomposition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1107:2: rule__OrDecomposition__Group__0
            {
            pushFollow(FOLLOW_rule__OrDecomposition__Group__0_in_ruleOrDecomposition2380);
            rule__OrDecomposition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOrDecompositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOrDecomposition


    // $ANTLR start entryRuleContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1119:1: entryRuleContribution : ruleContribution EOF ;
    public final void entryRuleContribution() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1119:23: ( ruleContribution EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1120:1: ruleContribution EOF
            {
             before(grammarAccess.getContributionRule()); 
            pushFollow(FOLLOW_ruleContribution_in_entryRuleContribution2406);
            ruleContribution();
            _fsp--;

             after(grammarAccess.getContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContribution2413); 

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
    // $ANTLR end entryRuleContribution


    // $ANTLR start ruleContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1127:1: ruleContribution : ( ( rule__Contribution__Alternatives ) ) ;
    public final void ruleContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1131:2: ( ( ( rule__Contribution__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1132:1: ( ( rule__Contribution__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1132:1: ( ( rule__Contribution__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1133:1: ( rule__Contribution__Alternatives )
            {
             before(grammarAccess.getContributionAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1134:1: ( rule__Contribution__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1134:2: rule__Contribution__Alternatives
            {
            pushFollow(FOLLOW_rule__Contribution__Alternatives_in_ruleContribution2440);
            rule__Contribution__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getContributionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleContribution


    // $ANTLR start entryRuleAndContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1146:1: entryRuleAndContribution : ruleAndContribution EOF ;
    public final void entryRuleAndContribution() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1146:26: ( ruleAndContribution EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1147:1: ruleAndContribution EOF
            {
             before(grammarAccess.getAndContributionRule()); 
            pushFollow(FOLLOW_ruleAndContribution_in_entryRuleAndContribution2466);
            ruleAndContribution();
            _fsp--;

             after(grammarAccess.getAndContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndContribution2473); 

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
    // $ANTLR end entryRuleAndContribution


    // $ANTLR start ruleAndContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1154:1: ruleAndContribution : ( ( rule__AndContribution__Group__0 ) ) ;
    public final void ruleAndContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1158:2: ( ( ( rule__AndContribution__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1159:1: ( ( rule__AndContribution__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1159:1: ( ( rule__AndContribution__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1160:1: ( rule__AndContribution__Group__0 )
            {
             before(grammarAccess.getAndContributionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1161:1: ( rule__AndContribution__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1161:2: rule__AndContribution__Group__0
            {
            pushFollow(FOLLOW_rule__AndContribution__Group__0_in_ruleAndContribution2500);
            rule__AndContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAndContributionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAndContribution


    // $ANTLR start entryRuleOrContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1173:1: entryRuleOrContribution : ruleOrContribution EOF ;
    public final void entryRuleOrContribution() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1173:25: ( ruleOrContribution EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1174:1: ruleOrContribution EOF
            {
             before(grammarAccess.getOrContributionRule()); 
            pushFollow(FOLLOW_ruleOrContribution_in_entryRuleOrContribution2526);
            ruleOrContribution();
            _fsp--;

             after(grammarAccess.getOrContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrContribution2533); 

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
    // $ANTLR end entryRuleOrContribution


    // $ANTLR start ruleOrContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1181:1: ruleOrContribution : ( ( rule__OrContribution__Group__0 ) ) ;
    public final void ruleOrContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1185:2: ( ( ( rule__OrContribution__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1186:1: ( ( rule__OrContribution__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1186:1: ( ( rule__OrContribution__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1187:1: ( rule__OrContribution__Group__0 )
            {
             before(grammarAccess.getOrContributionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1188:1: ( rule__OrContribution__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1188:2: rule__OrContribution__Group__0
            {
            pushFollow(FOLLOW_rule__OrContribution__Group__0_in_ruleOrContribution2560);
            rule__OrContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getOrContributionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleOrContribution


    // $ANTLR start entryRuleHelpContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1200:1: entryRuleHelpContribution : ruleHelpContribution EOF ;
    public final void entryRuleHelpContribution() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1200:27: ( ruleHelpContribution EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1201:1: ruleHelpContribution EOF
            {
             before(grammarAccess.getHelpContributionRule()); 
            pushFollow(FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution2586);
            ruleHelpContribution();
            _fsp--;

             after(grammarAccess.getHelpContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHelpContribution2593); 

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
    // $ANTLR end entryRuleHelpContribution


    // $ANTLR start ruleHelpContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1208:1: ruleHelpContribution : ( ( rule__HelpContribution__Group__0 ) ) ;
    public final void ruleHelpContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1212:2: ( ( ( rule__HelpContribution__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1213:1: ( ( rule__HelpContribution__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1213:1: ( ( rule__HelpContribution__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1214:1: ( rule__HelpContribution__Group__0 )
            {
             before(grammarAccess.getHelpContributionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1215:1: ( rule__HelpContribution__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1215:2: rule__HelpContribution__Group__0
            {
            pushFollow(FOLLOW_rule__HelpContribution__Group__0_in_ruleHelpContribution2620);
            rule__HelpContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getHelpContributionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleHelpContribution


    // $ANTLR start entryRuleMakeContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1227:1: entryRuleMakeContribution : ruleMakeContribution EOF ;
    public final void entryRuleMakeContribution() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1227:27: ( ruleMakeContribution EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1228:1: ruleMakeContribution EOF
            {
             before(grammarAccess.getMakeContributionRule()); 
            pushFollow(FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution2646);
            ruleMakeContribution();
            _fsp--;

             after(grammarAccess.getMakeContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMakeContribution2653); 

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
    // $ANTLR end entryRuleMakeContribution


    // $ANTLR start ruleMakeContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1235:1: ruleMakeContribution : ( ( rule__MakeContribution__Group__0 ) ) ;
    public final void ruleMakeContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1239:2: ( ( ( rule__MakeContribution__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1240:1: ( ( rule__MakeContribution__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1240:1: ( ( rule__MakeContribution__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1241:1: ( rule__MakeContribution__Group__0 )
            {
             before(grammarAccess.getMakeContributionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1242:1: ( rule__MakeContribution__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1242:2: rule__MakeContribution__Group__0
            {
            pushFollow(FOLLOW_rule__MakeContribution__Group__0_in_ruleMakeContribution2680);
            rule__MakeContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getMakeContributionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleMakeContribution


    // $ANTLR start entryRuleHurtContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1254:1: entryRuleHurtContribution : ruleHurtContribution EOF ;
    public final void entryRuleHurtContribution() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1254:27: ( ruleHurtContribution EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1255:1: ruleHurtContribution EOF
            {
             before(grammarAccess.getHurtContributionRule()); 
            pushFollow(FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution2706);
            ruleHurtContribution();
            _fsp--;

             after(grammarAccess.getHurtContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHurtContribution2713); 

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
    // $ANTLR end entryRuleHurtContribution


    // $ANTLR start ruleHurtContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1262:1: ruleHurtContribution : ( ( rule__HurtContribution__Group__0 ) ) ;
    public final void ruleHurtContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1266:2: ( ( ( rule__HurtContribution__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1267:1: ( ( rule__HurtContribution__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1267:1: ( ( rule__HurtContribution__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1268:1: ( rule__HurtContribution__Group__0 )
            {
             before(grammarAccess.getHurtContributionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1269:1: ( rule__HurtContribution__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1269:2: rule__HurtContribution__Group__0
            {
            pushFollow(FOLLOW_rule__HurtContribution__Group__0_in_ruleHurtContribution2740);
            rule__HurtContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getHurtContributionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleHurtContribution


    // $ANTLR start entryRuleBreakContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1281:1: entryRuleBreakContribution : ruleBreakContribution EOF ;
    public final void entryRuleBreakContribution() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1281:28: ( ruleBreakContribution EOF )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1282:1: ruleBreakContribution EOF
            {
             before(grammarAccess.getBreakContributionRule()); 
            pushFollow(FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution2766);
            ruleBreakContribution();
            _fsp--;

             after(grammarAccess.getBreakContributionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBreakContribution2773); 

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
    // $ANTLR end entryRuleBreakContribution


    // $ANTLR start ruleBreakContribution
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1289:1: ruleBreakContribution : ( ( rule__BreakContribution__Group__0 ) ) ;
    public final void ruleBreakContribution() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1293:2: ( ( ( rule__BreakContribution__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1294:1: ( ( rule__BreakContribution__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1294:1: ( ( rule__BreakContribution__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1295:1: ( rule__BreakContribution__Group__0 )
            {
             before(grammarAccess.getBreakContributionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1296:1: ( rule__BreakContribution__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1296:2: rule__BreakContribution__Group__0
            {
            pushFollow(FOLLOW_rule__BreakContribution__Group__0_in_ruleBreakContribution2800);
            rule__BreakContribution__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBreakContributionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBreakContribution


    // $ANTLR start ruleBinaryIntOp
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1309:1: ruleBinaryIntOp : ( ( rule__BinaryIntOp__Alternatives ) ) ;
    public final void ruleBinaryIntOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1313:1: ( ( ( rule__BinaryIntOp__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1314:1: ( ( rule__BinaryIntOp__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1314:1: ( ( rule__BinaryIntOp__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1315:1: ( rule__BinaryIntOp__Alternatives )
            {
             before(grammarAccess.getBinaryIntOpAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1316:1: ( rule__BinaryIntOp__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1316:2: rule__BinaryIntOp__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryIntOp__Alternatives_in_ruleBinaryIntOp2837);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1328:1: ruleUnaryBoolOp : ( ( '!' ) ) ;
    public final void ruleUnaryBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1332:1: ( ( ( '!' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1333:1: ( ( '!' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1333:1: ( ( '!' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1334:1: ( '!' )
            {
             before(grammarAccess.getUnaryBoolOpAccess().getNEGATIONEnumLiteralDeclaration()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1335:1: ( '!' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1335:3: '!'
            {
            match(input,11,FOLLOW_11_in_ruleUnaryBoolOp2874); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1348:1: ruleBinaryBoolOp : ( ( rule__BinaryBoolOp__Alternatives ) ) ;
    public final void ruleBinaryBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1352:1: ( ( ( rule__BinaryBoolOp__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1353:1: ( ( rule__BinaryBoolOp__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1353:1: ( ( rule__BinaryBoolOp__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1354:1: ( rule__BinaryBoolOp__Alternatives )
            {
             before(grammarAccess.getBinaryBoolOpAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1355:1: ( rule__BinaryBoolOp__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1355:2: rule__BinaryBoolOp__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryBoolOp__Alternatives_in_ruleBinaryBoolOp2912);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1366:1: rule__IntTerm__Alternatives : ( ( ( rule__IntTerm__ConstAssignment_0 ) ) | ( ( rule__IntTerm__VarAssignment_1 ) ) );
    public final void rule__IntTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1370:1: ( ( ( rule__IntTerm__ConstAssignment_0 ) ) | ( ( rule__IntTerm__VarAssignment_1 ) ) )
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
                    new NoViableAltException("1366:1: rule__IntTerm__Alternatives : ( ( ( rule__IntTerm__ConstAssignment_0 ) ) | ( ( rule__IntTerm__VarAssignment_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1371:1: ( ( rule__IntTerm__ConstAssignment_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1371:1: ( ( rule__IntTerm__ConstAssignment_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1372:1: ( rule__IntTerm__ConstAssignment_0 )
                    {
                     before(grammarAccess.getIntTermAccess().getConstAssignment_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1373:1: ( rule__IntTerm__ConstAssignment_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1373:2: rule__IntTerm__ConstAssignment_0
                    {
                    pushFollow(FOLLOW_rule__IntTerm__ConstAssignment_0_in_rule__IntTerm__Alternatives2947);
                    rule__IntTerm__ConstAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getIntTermAccess().getConstAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1377:6: ( ( rule__IntTerm__VarAssignment_1 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1377:6: ( ( rule__IntTerm__VarAssignment_1 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1378:1: ( rule__IntTerm__VarAssignment_1 )
                    {
                     before(grammarAccess.getIntTermAccess().getVarAssignment_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1379:1: ( rule__IntTerm__VarAssignment_1 )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1379:2: rule__IntTerm__VarAssignment_1
                    {
                    pushFollow(FOLLOW_rule__IntTerm__VarAssignment_1_in_rule__IntTerm__Alternatives2965);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1388:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );
    public final void rule__IntExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1392:1: ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) )
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
                        new NoViableAltException("1388:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 1, input);

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
                        new NoViableAltException("1388:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1388:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1393:1: ( ruleIntTerm )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1393:1: ( ruleIntTerm )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1394:1: ruleIntTerm
                    {
                     before(grammarAccess.getIntExprAccess().getIntTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntTerm_in_rule__IntExpr__Alternatives2998);
                    ruleIntTerm();
                    _fsp--;

                     after(grammarAccess.getIntExprAccess().getIntTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1399:6: ( ruleBinaryIntExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1399:6: ( ruleBinaryIntExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1400:1: ruleBinaryIntExpr
                    {
                     before(grammarAccess.getIntExprAccess().getBinaryIntExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBinaryIntExpr_in_rule__IntExpr__Alternatives3015);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1410:1: rule__TemporalPredicate__Alternatives : ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) );
    public final void rule__TemporalPredicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1414:1: ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) )
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
                    new NoViableAltException("1410:1: rule__TemporalPredicate__Alternatives : ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1415:1: ( ruleHoldsAt )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1415:1: ( ruleHoldsAt )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1416:1: ruleHoldsAt
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getHoldsAtParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHoldsAt_in_rule__TemporalPredicate__Alternatives3047);
                    ruleHoldsAt();
                    _fsp--;

                     after(grammarAccess.getTemporalPredicateAccess().getHoldsAtParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1421:6: ( ruleHappens )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1421:6: ( ruleHappens )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1422:1: ruleHappens
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getHappensParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHappens_in_rule__TemporalPredicate__Alternatives3064);
                    ruleHappens();
                    _fsp--;

                     after(grammarAccess.getTemporalPredicateAccess().getHappensParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1427:6: ( ruleInitiates )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1427:6: ( ruleInitiates )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1428:1: ruleInitiates
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getInitiatesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInitiates_in_rule__TemporalPredicate__Alternatives3081);
                    ruleInitiates();
                    _fsp--;

                     after(grammarAccess.getTemporalPredicateAccess().getInitiatesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1433:6: ( ruleTerminates )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1433:6: ( ruleTerminates )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1434:1: ruleTerminates
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getTerminatesParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTerminates_in_rule__TemporalPredicate__Alternatives3098);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1444:1: rule__BoolExpr__Alternatives : ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) );
    public final void rule__BoolExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1448:1: ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1449:1: ( ruleTemporalPredicate )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1449:1: ( ruleTemporalPredicate )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1450:1: ruleTemporalPredicate
                    {
                     before(grammarAccess.getBoolExprAccess().getTemporalPredicateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTemporalPredicate_in_rule__BoolExpr__Alternatives3130);
                    ruleTemporalPredicate();
                    _fsp--;

                     after(grammarAccess.getBoolExprAccess().getTemporalPredicateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1455:6: ( ruleUnaryBoolExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1455:6: ( ruleUnaryBoolExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1456:1: ruleUnaryBoolExpr
                    {
                     before(grammarAccess.getBoolExprAccess().getUnaryBoolExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnaryBoolExpr_in_rule__BoolExpr__Alternatives3147);
                    ruleUnaryBoolExpr();
                    _fsp--;

                     after(grammarAccess.getBoolExprAccess().getUnaryBoolExprParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1461:6: ( ruleBinaryBoolExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1461:6: ( ruleBinaryBoolExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1462:1: ruleBinaryBoolExpr
                    {
                     before(grammarAccess.getBoolExprAccess().getBinaryBoolExprParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBinaryBoolExpr_in_rule__BoolExpr__Alternatives3164);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1472:1: rule__UnaryBoolExpr__Alternatives : ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) );
    public final void rule__UnaryBoolExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1476:1: ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) )
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
                    new NoViableAltException("1472:1: rule__UnaryBoolExpr__Alternatives : ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1477:1: ( ( rule__UnaryBoolExpr__Group_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1477:1: ( ( rule__UnaryBoolExpr__Group_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1478:1: ( rule__UnaryBoolExpr__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryBoolExprAccess().getGroup_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1479:1: ( rule__UnaryBoolExpr__Group_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1479:2: rule__UnaryBoolExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__0_in_rule__UnaryBoolExpr__Alternatives3196);
                    rule__UnaryBoolExpr__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getUnaryBoolExprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1483:6: ( ( rule__UnaryBoolExpr__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1483:6: ( ( rule__UnaryBoolExpr__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1484:1: ( rule__UnaryBoolExpr__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryBoolExprAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1485:1: ( rule__UnaryBoolExpr__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1485:2: rule__UnaryBoolExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__0_in_rule__UnaryBoolExpr__Alternatives3214);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1494:1: rule__Entity__Alternatives : ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1498:1: ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) )
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
                    new NoViableAltException("1494:1: rule__Entity__Alternatives : ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1499:1: ( ruleFluent )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1499:1: ( ruleFluent )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1500:1: ruleFluent
                    {
                     before(grammarAccess.getEntityAccess().getFluentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFluent_in_rule__Entity__Alternatives3247);
                    ruleFluent();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getFluentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1505:6: ( ruleEvent )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1505:6: ( ruleEvent )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1506:1: ruleEvent
                    {
                     before(grammarAccess.getEntityAccess().getEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEvent_in_rule__Entity__Alternatives3264);
                    ruleEvent();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getEventParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1511:6: ( ruleSort )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1511:6: ( ruleSort )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1512:1: ruleSort
                    {
                     before(grammarAccess.getEntityAccess().getSortParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSort_in_rule__Entity__Alternatives3281);
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


    // $ANTLR start rule__Container__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1523:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );
    public final void rule__Container__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1527:1: ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt7=1;
                }
                break;
            case 37:
                {
                alt7=2;
                }
                break;
            case 38:
                {
                alt7=3;
                }
                break;
            case 39:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1523:1: rule__Container__Alternatives : ( ( ruleActor ) | ( ruleAgent ) | ( ruleRole ) | ( rulePosition ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1528:1: ( ruleActor )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1528:1: ( ruleActor )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1529:1: ruleActor
                    {
                     before(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Container__Alternatives3314);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1534:6: ( ruleAgent )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1534:6: ( ruleAgent )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1535:1: ruleAgent
                    {
                     before(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAgent_in_rule__Container__Alternatives3331);
                    ruleAgent();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getAgentParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1540:6: ( ruleRole )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1540:6: ( ruleRole )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1541:1: ruleRole
                    {
                     before(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRole_in_rule__Container__Alternatives3348);
                    ruleRole();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getRoleParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1546:6: ( rulePosition )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1546:6: ( rulePosition )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1547:1: rulePosition
                    {
                     before(grammarAccess.getContainerAccess().getPositionParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePosition_in_rule__Container__Alternatives3365);
                    rulePosition();
                    _fsp--;

                     after(grammarAccess.getContainerAccess().getPositionParserRuleCall_3()); 

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
    // $ANTLR end rule__Container__Alternatives


    // $ANTLR start rule__Actor__Alternatives_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1557:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );
    public final void rule__Actor__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1561:1: ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                alt8=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1557:1: rule__Actor__Alternatives_2 : ( ( ( rule__Actor__Is_aAssignment_2_0 ) ) | ( ( rule__Actor__Is_part_ofAssignment_2_1 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1562:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1562:1: ( ( rule__Actor__Is_aAssignment_2_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1563:1: ( rule__Actor__Is_aAssignment_2_0 )
                    {
                     before(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1564:1: ( rule__Actor__Is_aAssignment_2_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1564:2: rule__Actor__Is_aAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_23397);
                    rule__Actor__Is_aAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getActorAccess().getIs_aAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1568:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1568:6: ( ( rule__Actor__Is_part_ofAssignment_2_1 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1569:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    {
                     before(grammarAccess.getActorAccess().getIs_part_ofAssignment_2_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1570:1: ( rule__Actor__Is_part_ofAssignment_2_1 )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1570:2: rule__Actor__Is_part_ofAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_23415);
                    rule__Actor__Is_part_ofAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getActorAccess().getIs_part_ofAssignment_2_1()); 

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
    // $ANTLR end rule__Actor__Alternatives_2


    // $ANTLR start rule__Intention__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1579:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );
    public final void rule__Intention__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1583:1: ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt9=1;
                }
                break;
            case 41:
                {
                alt9=2;
                }
                break;
            case 42:
                {
                alt9=3;
                }
                break;
            case 43:
                {
                alt9=4;
                }
                break;
            case 44:
                {
                alt9=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1579:1: rule__Intention__Alternatives : ( ( ruleGoal ) | ( ruleSoftgoal ) | ( ruleTask ) | ( ruleResource ) | ( ruleBelief ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1584:1: ( ruleGoal )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1584:1: ( ruleGoal )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1585:1: ruleGoal
                    {
                     before(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGoal_in_rule__Intention__Alternatives3448);
                    ruleGoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getGoalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1590:6: ( ruleSoftgoal )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1590:6: ( ruleSoftgoal )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1591:1: ruleSoftgoal
                    {
                     before(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives3465);
                    ruleSoftgoal();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getSoftgoalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1596:6: ( ruleTask )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1596:6: ( ruleTask )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1597:1: ruleTask
                    {
                     before(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleTask_in_rule__Intention__Alternatives3482);
                    ruleTask();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getTaskParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1602:6: ( ruleResource )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1602:6: ( ruleResource )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1603:1: ruleResource
                    {
                     before(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Intention__Alternatives3499);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getResourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1608:6: ( ruleBelief )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1608:6: ( ruleBelief )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1609:1: ruleBelief
                    {
                     before(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleBelief_in_rule__Intention__Alternatives3516);
                    ruleBelief();
                    _fsp--;

                     after(grammarAccess.getIntentionAccess().getBeliefParserRuleCall_4()); 

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
    // $ANTLR end rule__Intention__Alternatives


    // $ANTLR start rule__Decomposition__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1621:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );
    public final void rule__Decomposition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1625:1: ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==47) ) {
                    alt10=1;
                }
                else if ( (LA10_1==48) ) {
                    alt10=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1621:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1621:1: rule__Decomposition__Alternatives : ( ( ruleAndDecomposition ) | ( ruleOrDecomposition ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1626:1: ( ruleAndDecomposition )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1626:1: ( ruleAndDecomposition )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1627:1: ruleAndDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives3550);
                    ruleAndDecomposition();
                    _fsp--;

                     after(grammarAccess.getDecompositionAccess().getAndDecompositionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1632:6: ( ruleOrDecomposition )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1632:6: ( ruleOrDecomposition )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1633:1: ruleOrDecomposition
                    {
                     before(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives3567);
                    ruleOrDecomposition();
                    _fsp--;

                     after(grammarAccess.getDecompositionAccess().getOrDecompositionParserRuleCall_1()); 

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
    // $ANTLR end rule__Decomposition__Alternatives


    // $ANTLR start rule__Contribution__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1643:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );
    public final void rule__Contribution__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1647:1: ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) )
            int alt11=6;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 51:
                    {
                    alt11=3;
                    }
                    break;
                case 49:
                    {
                    alt11=1;
                    }
                    break;
                case 53:
                    {
                    alt11=4;
                    }
                    break;
                case 52:
                    {
                    alt11=5;
                    }
                    break;
                case 54:
                    {
                    alt11=6;
                    }
                    break;
                case 50:
                    {
                    alt11=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("1643:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 11, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1643:1: rule__Contribution__Alternatives : ( ( ruleAndContribution ) | ( ruleOrContribution ) | ( ruleHelpContribution ) | ( ruleHurtContribution ) | ( ruleMakeContribution ) | ( ruleBreakContribution ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1648:1: ( ruleAndContribution )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1648:1: ( ruleAndContribution )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1649:1: ruleAndContribution
                    {
                     before(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives3599);
                    ruleAndContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getAndContributionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1654:6: ( ruleOrContribution )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1654:6: ( ruleOrContribution )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1655:1: ruleOrContribution
                    {
                     before(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives3616);
                    ruleOrContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getOrContributionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1660:6: ( ruleHelpContribution )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1660:6: ( ruleHelpContribution )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1661:1: ruleHelpContribution
                    {
                     before(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives3633);
                    ruleHelpContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHelpContributionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1666:6: ( ruleHurtContribution )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1666:6: ( ruleHurtContribution )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1667:1: ruleHurtContribution
                    {
                     before(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives3650);
                    ruleHurtContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getHurtContributionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1672:6: ( ruleMakeContribution )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1672:6: ( ruleMakeContribution )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1673:1: ruleMakeContribution
                    {
                     before(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives3667);
                    ruleMakeContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getMakeContributionParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1678:6: ( ruleBreakContribution )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1678:6: ( ruleBreakContribution )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1679:1: ruleBreakContribution
                    {
                     before(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives3684);
                    ruleBreakContribution();
                    _fsp--;

                     after(grammarAccess.getContributionAccess().getBreakContributionParserRuleCall_5()); 

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
    // $ANTLR end rule__Contribution__Alternatives


    // $ANTLR start rule__BinaryIntOp__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1689:1: rule__BinaryIntOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__BinaryIntOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1693:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==12) ) {
                alt12=1;
            }
            else if ( (LA12_0==13) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1689:1: rule__BinaryIntOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1694:1: ( ( '+' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1694:1: ( ( '+' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1695:1: ( '+' )
                    {
                     before(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1696:1: ( '+' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1696:3: '+'
                    {
                    match(input,12,FOLLOW_12_in_rule__BinaryIntOp__Alternatives3717); 

                    }

                     after(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1701:6: ( ( '-' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1701:6: ( ( '-' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1702:1: ( '-' )
                    {
                     before(grammarAccess.getBinaryIntOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1703:1: ( '-' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1703:3: '-'
                    {
                    match(input,13,FOLLOW_13_in_rule__BinaryIntOp__Alternatives3738); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1713:1: rule__BinaryBoolOp__Alternatives : ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BinaryBoolOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1717:1: ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt13=1;
                }
                break;
            case 15:
                {
                alt13=2;
                }
                break;
            case 16:
                {
                alt13=3;
                }
                break;
            case 17:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1713:1: rule__BinaryBoolOp__Alternatives : ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1718:1: ( ( '->' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1718:1: ( ( '->' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1719:1: ( '->' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1720:1: ( '->' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1720:3: '->'
                    {
                    match(input,14,FOLLOW_14_in_rule__BinaryBoolOp__Alternatives3774); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1725:6: ( ( '<->' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1725:6: ( ( '<->' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1726:1: ( '<->' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1727:1: ( '<->' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1727:3: '<->'
                    {
                    match(input,15,FOLLOW_15_in_rule__BinaryBoolOp__Alternatives3795); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1732:6: ( ( '&' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1732:6: ( ( '&' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1733:1: ( '&' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1734:1: ( '&' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1734:3: '&'
                    {
                    match(input,16,FOLLOW_16_in_rule__BinaryBoolOp__Alternatives3816); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1739:6: ( ( '|' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1739:6: ( ( '|' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1740:1: ( '|' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getOREnumLiteralDeclaration_3()); 
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1741:1: ( '|' )
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1741:3: '|'
                    {
                    match(input,17,FOLLOW_17_in_rule__BinaryBoolOp__Alternatives3837); 

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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1753:1: rule__Knowledge__Group__0 : ( ( rule__Knowledge__ImportsAssignment_0 )* ) rule__Knowledge__Group__1 ;
    public final void rule__Knowledge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1757:1: ( ( ( rule__Knowledge__ImportsAssignment_0 )* ) rule__Knowledge__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1758:1: ( ( rule__Knowledge__ImportsAssignment_0 )* ) rule__Knowledge__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1758:1: ( ( rule__Knowledge__ImportsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1759:1: ( rule__Knowledge__ImportsAssignment_0 )*
            {
             before(grammarAccess.getKnowledgeAccess().getImportsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1760:1: ( rule__Knowledge__ImportsAssignment_0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==25) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1760:2: rule__Knowledge__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__ImportsAssignment_0_in_rule__Knowledge__Group__03874);
            	    rule__Knowledge__ImportsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getKnowledgeAccess().getImportsAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Knowledge__Group__1_in_rule__Knowledge__Group__03884);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1771:1: rule__Knowledge__Group__1 : ( ( rule__Knowledge__EntitiesAssignment_1 )* ) rule__Knowledge__Group__2 ;
    public final void rule__Knowledge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1775:1: ( ( ( rule__Knowledge__EntitiesAssignment_1 )* ) rule__Knowledge__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1776:1: ( ( rule__Knowledge__EntitiesAssignment_1 )* ) rule__Knowledge__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1776:1: ( ( rule__Knowledge__EntitiesAssignment_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1777:1: ( rule__Knowledge__EntitiesAssignment_1 )*
            {
             before(grammarAccess.getKnowledgeAccess().getEntitiesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1778:1: ( rule__Knowledge__EntitiesAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==24||(LA15_0>=27 && LA15_0<=28)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1778:2: rule__Knowledge__EntitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__EntitiesAssignment_1_in_rule__Knowledge__Group__13912);
            	    rule__Knowledge__EntitiesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getKnowledgeAccess().getEntitiesAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Knowledge__Group__2_in_rule__Knowledge__Group__13922);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1789:1: rule__Knowledge__Group__2 : ( ( rule__Knowledge__Group_2__0 )* ) rule__Knowledge__Group__3 ;
    public final void rule__Knowledge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1793:1: ( ( ( rule__Knowledge__Group_2__0 )* ) rule__Knowledge__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1794:1: ( ( rule__Knowledge__Group_2__0 )* ) rule__Knowledge__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1794:1: ( ( rule__Knowledge__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1795:1: ( rule__Knowledge__Group_2__0 )*
            {
             before(grammarAccess.getKnowledgeAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1796:1: ( rule__Knowledge__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==11||LA16_0==19||LA16_0==22||(LA16_0>=29 && LA16_0<=32)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1796:2: rule__Knowledge__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__Group_2__0_in_rule__Knowledge__Group__23950);
            	    rule__Knowledge__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getKnowledgeAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__Knowledge__Group__3_in_rule__Knowledge__Group__23960);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1807:1: rule__Knowledge__Group__3 : ( ( rule__Knowledge__VarsAssignment_3 )* ) ;
    public final void rule__Knowledge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1811:1: ( ( ( rule__Knowledge__VarsAssignment_3 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1812:1: ( ( rule__Knowledge__VarsAssignment_3 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1812:1: ( ( rule__Knowledge__VarsAssignment_3 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1813:1: ( rule__Knowledge__VarsAssignment_3 )*
            {
             before(grammarAccess.getKnowledgeAccess().getVarsAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1814:1: ( rule__Knowledge__VarsAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==26) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1814:2: rule__Knowledge__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__VarsAssignment_3_in_rule__Knowledge__Group__33988);
            	    rule__Knowledge__VarsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1832:1: rule__Knowledge__Group_2__0 : ( ( rule__Knowledge__RulesAssignment_2_0 ) ) rule__Knowledge__Group_2__1 ;
    public final void rule__Knowledge__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1836:1: ( ( ( rule__Knowledge__RulesAssignment_2_0 ) ) rule__Knowledge__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1837:1: ( ( rule__Knowledge__RulesAssignment_2_0 ) ) rule__Knowledge__Group_2__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1837:1: ( ( rule__Knowledge__RulesAssignment_2_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1838:1: ( rule__Knowledge__RulesAssignment_2_0 )
            {
             before(grammarAccess.getKnowledgeAccess().getRulesAssignment_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1839:1: ( rule__Knowledge__RulesAssignment_2_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1839:2: rule__Knowledge__RulesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Knowledge__RulesAssignment_2_0_in_rule__Knowledge__Group_2__04031);
            rule__Knowledge__RulesAssignment_2_0();
            _fsp--;


            }

             after(grammarAccess.getKnowledgeAccess().getRulesAssignment_2_0()); 

            }

            pushFollow(FOLLOW_rule__Knowledge__Group_2__1_in_rule__Knowledge__Group_2__04040);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1850:1: rule__Knowledge__Group_2__1 : ( '.' ) ;
    public final void rule__Knowledge__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1854:1: ( ( '.' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1855:1: ( '.' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1855:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1856:1: '.'
            {
             before(grammarAccess.getKnowledgeAccess().getFullStopKeyword_2_1()); 
            match(input,18,FOLLOW_18_in_rule__Knowledge__Group_2__14069); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1873:1: rule__Rule__Group__0 : ( ( rule__Rule__DeclAssignment_0 )? ) rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1877:1: ( ( ( rule__Rule__DeclAssignment_0 )? ) rule__Rule__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1878:1: ( ( rule__Rule__DeclAssignment_0 )? ) rule__Rule__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1878:1: ( ( rule__Rule__DeclAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1879:1: ( rule__Rule__DeclAssignment_0 )?
            {
             before(grammarAccess.getRuleAccess().getDeclAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1880:1: ( rule__Rule__DeclAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1880:2: rule__Rule__DeclAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Rule__DeclAssignment_0_in_rule__Rule__Group__04108);
                    rule__Rule__DeclAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getDeclAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__04118);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1891:1: rule__Rule__Group__1 : ( ( rule__Rule__ExprAssignment_1 ) ) ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1895:1: ( ( ( rule__Rule__ExprAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1896:1: ( ( rule__Rule__ExprAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1896:1: ( ( rule__Rule__ExprAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1897:1: ( rule__Rule__ExprAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getExprAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1898:1: ( rule__Rule__ExprAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1898:2: rule__Rule__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__ExprAssignment_1_in_rule__Rule__Group__14146);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1912:1: rule__VarDecl__Group__0 : ( '[' ) rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1916:1: ( ( '[' ) rule__VarDecl__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1917:1: ( '[' ) rule__VarDecl__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1917:1: ( '[' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1918:1: '['
            {
             before(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__VarDecl__Group__04185); 
             after(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__04195);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1932:1: rule__VarDecl__Group__1 : ( ( rule__VarDecl__VarsAssignment_1 ) ) rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1936:1: ( ( ( rule__VarDecl__VarsAssignment_1 ) ) rule__VarDecl__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1937:1: ( ( rule__VarDecl__VarsAssignment_1 ) ) rule__VarDecl__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1937:1: ( ( rule__VarDecl__VarsAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1938:1: ( rule__VarDecl__VarsAssignment_1 )
            {
             before(grammarAccess.getVarDeclAccess().getVarsAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1939:1: ( rule__VarDecl__VarsAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1939:2: rule__VarDecl__VarsAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDecl__VarsAssignment_1_in_rule__VarDecl__Group__14223);
            rule__VarDecl__VarsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVarDeclAccess().getVarsAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__14232);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1950:1: rule__VarDecl__Group__2 : ( ( rule__VarDecl__Group_2__0 )* ) rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1954:1: ( ( ( rule__VarDecl__Group_2__0 )* ) rule__VarDecl__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1955:1: ( ( rule__VarDecl__Group_2__0 )* ) rule__VarDecl__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1955:1: ( ( rule__VarDecl__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1956:1: ( rule__VarDecl__Group_2__0 )*
            {
             before(grammarAccess.getVarDeclAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1957:1: ( rule__VarDecl__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1957:2: rule__VarDecl__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VarDecl__Group_2__0_in_rule__VarDecl__Group__24260);
            	    rule__VarDecl__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getVarDeclAccess().getGroup_2()); 

            }

            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__24270);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1968:1: rule__VarDecl__Group__3 : ( ']' ) ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1972:1: ( ( ']' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1973:1: ( ']' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1973:1: ( ']' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1974:1: ']'
            {
             before(grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__VarDecl__Group__34299); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1995:1: rule__VarDecl__Group_2__0 : ( ',' ) rule__VarDecl__Group_2__1 ;
    public final void rule__VarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:1999:1: ( ( ',' ) rule__VarDecl__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2000:1: ( ',' ) rule__VarDecl__Group_2__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2000:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2001:1: ','
            {
             before(grammarAccess.getVarDeclAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__VarDecl__Group_2__04343); 
             after(grammarAccess.getVarDeclAccess().getCommaKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__VarDecl__Group_2__1_in_rule__VarDecl__Group_2__04353);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2015:1: rule__VarDecl__Group_2__1 : ( ( rule__VarDecl__VarsAssignment_2_1 ) ) ;
    public final void rule__VarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2019:1: ( ( ( rule__VarDecl__VarsAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2020:1: ( ( rule__VarDecl__VarsAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2020:1: ( ( rule__VarDecl__VarsAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2021:1: ( rule__VarDecl__VarsAssignment_2_1 )
            {
             before(grammarAccess.getVarDeclAccess().getVarsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2022:1: ( rule__VarDecl__VarsAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2022:2: rule__VarDecl__VarsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VarDecl__VarsAssignment_2_1_in_rule__VarDecl__Group_2__14381);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2036:1: rule__BinaryIntExpr__Group__0 : ( ( rule__BinaryIntExpr__OprAssignment_0 ) ) rule__BinaryIntExpr__Group__1 ;
    public final void rule__BinaryIntExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2040:1: ( ( ( rule__BinaryIntExpr__OprAssignment_0 ) ) rule__BinaryIntExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2041:1: ( ( rule__BinaryIntExpr__OprAssignment_0 ) ) rule__BinaryIntExpr__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2041:1: ( ( rule__BinaryIntExpr__OprAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2042:1: ( rule__BinaryIntExpr__OprAssignment_0 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2043:1: ( rule__BinaryIntExpr__OprAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2043:2: rule__BinaryIntExpr__OprAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__OprAssignment_0_in_rule__BinaryIntExpr__Group__04419);
            rule__BinaryIntExpr__OprAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBinaryIntExprAccess().getOprAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__1_in_rule__BinaryIntExpr__Group__04428);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2054:1: rule__BinaryIntExpr__Group__1 : ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) ) rule__BinaryIntExpr__Group__2 ;
    public final void rule__BinaryIntExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2058:1: ( ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) ) rule__BinaryIntExpr__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2059:1: ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) ) rule__BinaryIntExpr__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2059:1: ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2060:1: ( rule__BinaryIntExpr__BinaryopAssignment_1 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getBinaryopAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2061:1: ( rule__BinaryIntExpr__BinaryopAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2061:2: rule__BinaryIntExpr__BinaryopAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__BinaryopAssignment_1_in_rule__BinaryIntExpr__Group__14456);
            rule__BinaryIntExpr__BinaryopAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBinaryIntExprAccess().getBinaryopAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__2_in_rule__BinaryIntExpr__Group__14465);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2072:1: rule__BinaryIntExpr__Group__2 : ( ( rule__BinaryIntExpr__OprAssignment_2 ) ) ;
    public final void rule__BinaryIntExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2076:1: ( ( ( rule__BinaryIntExpr__OprAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2077:1: ( ( rule__BinaryIntExpr__OprAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2077:1: ( ( rule__BinaryIntExpr__OprAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2078:1: ( rule__BinaryIntExpr__OprAssignment_2 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2079:1: ( rule__BinaryIntExpr__OprAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2079:2: rule__BinaryIntExpr__OprAssignment_2
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__OprAssignment_2_in_rule__BinaryIntExpr__Group__24493);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2095:1: rule__UnaryBoolExpr__Group_0__0 : ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) ) rule__UnaryBoolExpr__Group_0__1 ;
    public final void rule__UnaryBoolExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2099:1: ( ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) ) rule__UnaryBoolExpr__Group_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2100:1: ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) ) rule__UnaryBoolExpr__Group_0__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2100:1: ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2101:1: ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsAssignment_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2102:1: ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2102:2: rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0_in_rule__UnaryBoolExpr__Group_0__04533);
            rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsAssignment_0_0()); 

            }

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__1_in_rule__UnaryBoolExpr__Group_0__04542);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2113:1: rule__UnaryBoolExpr__Group_0__1 : ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) ) ;
    public final void rule__UnaryBoolExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2117:1: ( ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2118:1: ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2118:1: ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2119:1: ( rule__UnaryBoolExpr__OprAssignment_0_1 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOprAssignment_0_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2120:1: ( rule__UnaryBoolExpr__OprAssignment_0_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2120:2: rule__UnaryBoolExpr__OprAssignment_0_1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__OprAssignment_0_1_in_rule__UnaryBoolExpr__Group_0__14570);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2134:1: rule__UnaryBoolExpr__Group_1__0 : ( '(' ) rule__UnaryBoolExpr__Group_1__1 ;
    public final void rule__UnaryBoolExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2138:1: ( ( '(' ) rule__UnaryBoolExpr__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2139:1: ( '(' ) rule__UnaryBoolExpr__Group_1__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2139:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2140:1: '('
            {
             before(grammarAccess.getUnaryBoolExprAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__UnaryBoolExpr__Group_1__04609); 
             after(grammarAccess.getUnaryBoolExprAccess().getLeftParenthesisKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__1_in_rule__UnaryBoolExpr__Group_1__04619);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2154:1: rule__UnaryBoolExpr__Group_1__1 : ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) ) rule__UnaryBoolExpr__Group_1__2 ;
    public final void rule__UnaryBoolExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2158:1: ( ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) ) rule__UnaryBoolExpr__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2159:1: ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) ) rule__UnaryBoolExpr__Group_1__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2159:1: ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2160:1: ( rule__UnaryBoolExpr__OpsAssignment_1_1 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOpsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2161:1: ( rule__UnaryBoolExpr__OpsAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2161:2: rule__UnaryBoolExpr__OpsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__OpsAssignment_1_1_in_rule__UnaryBoolExpr__Group_1__14647);
            rule__UnaryBoolExpr__OpsAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getUnaryBoolExprAccess().getOpsAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__2_in_rule__UnaryBoolExpr__Group_1__14656);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2172:1: rule__UnaryBoolExpr__Group_1__2 : ( ')' ) ;
    public final void rule__UnaryBoolExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2176:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2177:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2177:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2178:1: ')'
            {
             before(grammarAccess.getUnaryBoolExprAccess().getRightParenthesisKeyword_1_2()); 
            match(input,23,FOLLOW_23_in_rule__UnaryBoolExpr__Group_1__24685); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2197:1: rule__BinaryBoolExpr__Group__0 : ( ( rule__BinaryBoolExpr__OprAssignment_0 ) ) rule__BinaryBoolExpr__Group__1 ;
    public final void rule__BinaryBoolExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2201:1: ( ( ( rule__BinaryBoolExpr__OprAssignment_0 ) ) rule__BinaryBoolExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2202:1: ( ( rule__BinaryBoolExpr__OprAssignment_0 ) ) rule__BinaryBoolExpr__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2202:1: ( ( rule__BinaryBoolExpr__OprAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2203:1: ( rule__BinaryBoolExpr__OprAssignment_0 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2204:1: ( rule__BinaryBoolExpr__OprAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2204:2: rule__BinaryBoolExpr__OprAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__OprAssignment_0_in_rule__BinaryBoolExpr__Group__04726);
            rule__BinaryBoolExpr__OprAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__1_in_rule__BinaryBoolExpr__Group__04735);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2215:1: rule__BinaryBoolExpr__Group__1 : ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) ) rule__BinaryBoolExpr__Group__2 ;
    public final void rule__BinaryBoolExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2219:1: ( ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) ) rule__BinaryBoolExpr__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2220:1: ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) ) rule__BinaryBoolExpr__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2220:1: ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2221:1: ( rule__BinaryBoolExpr__BinaryopAssignment_1 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getBinaryopAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2222:1: ( rule__BinaryBoolExpr__BinaryopAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2222:2: rule__BinaryBoolExpr__BinaryopAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__BinaryopAssignment_1_in_rule__BinaryBoolExpr__Group__14763);
            rule__BinaryBoolExpr__BinaryopAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBinaryBoolExprAccess().getBinaryopAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__2_in_rule__BinaryBoolExpr__Group__14772);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2233:1: rule__BinaryBoolExpr__Group__2 : ( ( rule__BinaryBoolExpr__OprAssignment_2 ) ) ;
    public final void rule__BinaryBoolExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2237:1: ( ( ( rule__BinaryBoolExpr__OprAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2238:1: ( ( rule__BinaryBoolExpr__OprAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2238:1: ( ( rule__BinaryBoolExpr__OprAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2239:1: ( rule__BinaryBoolExpr__OprAssignment_2 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2240:1: ( rule__BinaryBoolExpr__OprAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2240:2: rule__BinaryBoolExpr__OprAssignment_2
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__OprAssignment_2_in_rule__BinaryBoolExpr__Group__24800);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2256:1: rule__Sort__Group__0 : ( 'sort' ) rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2260:1: ( ( 'sort' ) rule__Sort__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2261:1: ( 'sort' ) rule__Sort__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2261:1: ( 'sort' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2262:1: 'sort'
            {
             before(grammarAccess.getSortAccess().getSortKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Sort__Group__04841); 
             after(grammarAccess.getSortAccess().getSortKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__04851);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2276:1: rule__Sort__Group__1 : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2280:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2281:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2281:1: ( ( rule__Sort__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2282:1: ( rule__Sort__NameAssignment_1 )
            {
             before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2283:1: ( rule__Sort__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2283:2: rule__Sort__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__14879);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2297:1: rule__Import__Group__0 : ( 'load' ) rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2301:1: ( ( 'load' ) rule__Import__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2302:1: ( 'load' ) rule__Import__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2302:1: ( 'load' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2303:1: 'load'
            {
             before(grammarAccess.getImportAccess().getLoadKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__04918); 
             after(grammarAccess.getImportAccess().getLoadKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04928);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2317:1: rule__Import__Group__1 : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2321:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2322:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2322:1: ( ( rule__Import__PathAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2323:1: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2324:1: ( rule__Import__PathAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2324:2: rule__Import__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__PathAssignment_1_in_rule__Import__Group__14956);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2338:1: rule__Var__Group__0 : ( 'range' ) rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2342:1: ( ( 'range' ) rule__Var__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2343:1: ( 'range' ) rule__Var__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2343:1: ( 'range' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2344:1: 'range'
            {
             before(grammarAccess.getVarAccess().getRangeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Var__Group__04995); 
             after(grammarAccess.getVarAccess().getRangeKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Var__Group__1_in_rule__Var__Group__05005);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2358:1: rule__Var__Group__1 : ( ( rule__Var__NameAssignment_1 ) ) rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2362:1: ( ( ( rule__Var__NameAssignment_1 ) ) rule__Var__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2363:1: ( ( rule__Var__NameAssignment_1 ) ) rule__Var__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2363:1: ( ( rule__Var__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2364:1: ( rule__Var__NameAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2365:1: ( rule__Var__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2365:2: rule__Var__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Var__NameAssignment_1_in_rule__Var__Group__15033);
            rule__Var__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getVarAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Var__Group__2_in_rule__Var__Group__15042);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2376:1: rule__Var__Group__2 : ( ( rule__Var__MinAssignment_2 ) ) rule__Var__Group__3 ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2380:1: ( ( ( rule__Var__MinAssignment_2 ) ) rule__Var__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2381:1: ( ( rule__Var__MinAssignment_2 ) ) rule__Var__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2381:1: ( ( rule__Var__MinAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2382:1: ( rule__Var__MinAssignment_2 )
            {
             before(grammarAccess.getVarAccess().getMinAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2383:1: ( rule__Var__MinAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2383:2: rule__Var__MinAssignment_2
            {
            pushFollow(FOLLOW_rule__Var__MinAssignment_2_in_rule__Var__Group__25070);
            rule__Var__MinAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getVarAccess().getMinAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Var__Group__3_in_rule__Var__Group__25079);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2394:1: rule__Var__Group__3 : ( ( rule__Var__MaxAssignment_3 ) ) ;
    public final void rule__Var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2398:1: ( ( ( rule__Var__MaxAssignment_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2399:1: ( ( rule__Var__MaxAssignment_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2399:1: ( ( rule__Var__MaxAssignment_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2400:1: ( rule__Var__MaxAssignment_3 )
            {
             before(grammarAccess.getVarAccess().getMaxAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2401:1: ( rule__Var__MaxAssignment_3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2401:2: rule__Var__MaxAssignment_3
            {
            pushFollow(FOLLOW_rule__Var__MaxAssignment_3_in_rule__Var__Group__35107);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2419:1: rule__Fluent__Group__0 : ( 'fluent' ) rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2423:1: ( ( 'fluent' ) rule__Fluent__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2424:1: ( 'fluent' ) rule__Fluent__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2424:1: ( 'fluent' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2425:1: 'fluent'
            {
             before(grammarAccess.getFluentAccess().getFluentKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Fluent__Group__05150); 
             after(grammarAccess.getFluentAccess().getFluentKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__05160);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2439:1: rule__Fluent__Group__1 : ( ( rule__Fluent__TermAssignment_1 ) ) ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2443:1: ( ( ( rule__Fluent__TermAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2444:1: ( ( rule__Fluent__TermAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2444:1: ( ( rule__Fluent__TermAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2445:1: ( rule__Fluent__TermAssignment_1 )
            {
             before(grammarAccess.getFluentAccess().getTermAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2446:1: ( rule__Fluent__TermAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2446:2: rule__Fluent__TermAssignment_1
            {
            pushFollow(FOLLOW_rule__Fluent__TermAssignment_1_in_rule__Fluent__Group__15188);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2460:1: rule__Event__Group__0 : ( 'event' ) rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2464:1: ( ( 'event' ) rule__Event__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2465:1: ( 'event' ) rule__Event__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2465:1: ( 'event' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2466:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Event__Group__05227); 
             after(grammarAccess.getEventAccess().getEventKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__05237);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2480:1: rule__Event__Group__1 : ( ( rule__Event__TermAssignment_1 ) ) ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2484:1: ( ( ( rule__Event__TermAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2485:1: ( ( rule__Event__TermAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2485:1: ( ( rule__Event__TermAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2486:1: ( rule__Event__TermAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getTermAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2487:1: ( rule__Event__TermAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2487:2: rule__Event__TermAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__TermAssignment_1_in_rule__Event__Group__15265);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2501:1: rule__Term__Group__0 : ( ( rule__Term__NameAssignment_0 ) ) rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2505:1: ( ( ( rule__Term__NameAssignment_0 ) ) rule__Term__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2506:1: ( ( rule__Term__NameAssignment_0 ) ) rule__Term__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2506:1: ( ( rule__Term__NameAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2507:1: ( rule__Term__NameAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getNameAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2508:1: ( rule__Term__NameAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2508:2: rule__Term__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Term__NameAssignment_0_in_rule__Term__Group__05303);
            rule__Term__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTermAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__05312);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2519:1: rule__Term__Group__1 : ( ( rule__Term__Group_1__0 )? ) ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2523:1: ( ( ( rule__Term__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2524:1: ( ( rule__Term__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2524:1: ( ( rule__Term__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2525:1: ( rule__Term__Group_1__0 )?
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2526:1: ( rule__Term__Group_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_ID||LA20_1==21||LA20_1==23) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2526:2: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__15340);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2540:1: rule__Term__Group_1__0 : ( '(' ) rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2544:1: ( ( '(' ) rule__Term__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2545:1: ( '(' ) rule__Term__Group_1__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2545:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2546:1: '('
            {
             before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Term__Group_1__05380); 
             after(grammarAccess.getTermAccess().getLeftParenthesisKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__05390);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2560:1: rule__Term__Group_1__1 : ( ( rule__Term__ArgsAssignment_1_1 )? ) rule__Term__Group_1__2 ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2564:1: ( ( ( rule__Term__ArgsAssignment_1_1 )? ) rule__Term__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2565:1: ( ( rule__Term__ArgsAssignment_1_1 )? ) rule__Term__Group_1__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2565:1: ( ( rule__Term__ArgsAssignment_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2566:1: ( rule__Term__ArgsAssignment_1_1 )?
            {
             before(grammarAccess.getTermAccess().getArgsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2567:1: ( rule__Term__ArgsAssignment_1_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2567:2: rule__Term__ArgsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Term__ArgsAssignment_1_1_in_rule__Term__Group_1__15418);
                    rule__Term__ArgsAssignment_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTermAccess().getArgsAssignment_1_1()); 

            }

            pushFollow(FOLLOW_rule__Term__Group_1__2_in_rule__Term__Group_1__15428);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2578:1: rule__Term__Group_1__2 : ( ( rule__Term__Group_1_2__0 )* ) rule__Term__Group_1__3 ;
    public final void rule__Term__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2582:1: ( ( ( rule__Term__Group_1_2__0 )* ) rule__Term__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2583:1: ( ( rule__Term__Group_1_2__0 )* ) rule__Term__Group_1__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2583:1: ( ( rule__Term__Group_1_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2584:1: ( rule__Term__Group_1_2__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2585:1: ( rule__Term__Group_1_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2585:2: rule__Term__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1_2__0_in_rule__Term__Group_1__25456);
            	    rule__Term__Group_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTermAccess().getGroup_1_2()); 

            }

            pushFollow(FOLLOW_rule__Term__Group_1__3_in_rule__Term__Group_1__25466);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2596:1: rule__Term__Group_1__3 : ( ')' ) ;
    public final void rule__Term__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2600:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2601:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2601:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2602:1: ')'
            {
             before(grammarAccess.getTermAccess().getRightParenthesisKeyword_1_3()); 
            match(input,23,FOLLOW_23_in_rule__Term__Group_1__35495); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2623:1: rule__Term__Group_1_2__0 : ( ',' ) rule__Term__Group_1_2__1 ;
    public final void rule__Term__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2627:1: ( ( ',' ) rule__Term__Group_1_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2628:1: ( ',' ) rule__Term__Group_1_2__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2628:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2629:1: ','
            {
             before(grammarAccess.getTermAccess().getCommaKeyword_1_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Term__Group_1_2__05539); 
             after(grammarAccess.getTermAccess().getCommaKeyword_1_2_0()); 

            }

            pushFollow(FOLLOW_rule__Term__Group_1_2__1_in_rule__Term__Group_1_2__05549);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2643:1: rule__Term__Group_1_2__1 : ( ( rule__Term__ArgsAssignment_1_2_1 ) ) ;
    public final void rule__Term__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2647:1: ( ( ( rule__Term__ArgsAssignment_1_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2648:1: ( ( rule__Term__ArgsAssignment_1_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2648:1: ( ( rule__Term__ArgsAssignment_1_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2649:1: ( rule__Term__ArgsAssignment_1_2_1 )
            {
             before(grammarAccess.getTermAccess().getArgsAssignment_1_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2650:1: ( rule__Term__ArgsAssignment_1_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2650:2: rule__Term__ArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Term__ArgsAssignment_1_2_1_in_rule__Term__Group_1_2__15577);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2664:1: rule__HoldsAt__Group__0 : ( 'HoldsAt' ) rule__HoldsAt__Group__1 ;
    public final void rule__HoldsAt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2668:1: ( ( 'HoldsAt' ) rule__HoldsAt__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2669:1: ( 'HoldsAt' ) rule__HoldsAt__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2669:1: ( 'HoldsAt' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2670:1: 'HoldsAt'
            {
             before(grammarAccess.getHoldsAtAccess().getHoldsAtKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__HoldsAt__Group__05616); 
             after(grammarAccess.getHoldsAtAccess().getHoldsAtKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__HoldsAt__Group__1_in_rule__HoldsAt__Group__05626);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2684:1: rule__HoldsAt__Group__1 : ( '(' ) rule__HoldsAt__Group__2 ;
    public final void rule__HoldsAt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2688:1: ( ( '(' ) rule__HoldsAt__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2689:1: ( '(' ) rule__HoldsAt__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2689:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2690:1: '('
            {
             before(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__HoldsAt__Group__15655); 
             after(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HoldsAt__Group__2_in_rule__HoldsAt__Group__15665);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2704:1: rule__HoldsAt__Group__2 : ( ( rule__HoldsAt__FluentAssignment_2 ) ) rule__HoldsAt__Group__3 ;
    public final void rule__HoldsAt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2708:1: ( ( ( rule__HoldsAt__FluentAssignment_2 ) ) rule__HoldsAt__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2709:1: ( ( rule__HoldsAt__FluentAssignment_2 ) ) rule__HoldsAt__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2709:1: ( ( rule__HoldsAt__FluentAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2710:1: ( rule__HoldsAt__FluentAssignment_2 )
            {
             before(grammarAccess.getHoldsAtAccess().getFluentAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2711:1: ( rule__HoldsAt__FluentAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2711:2: rule__HoldsAt__FluentAssignment_2
            {
            pushFollow(FOLLOW_rule__HoldsAt__FluentAssignment_2_in_rule__HoldsAt__Group__25693);
            rule__HoldsAt__FluentAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHoldsAtAccess().getFluentAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__HoldsAt__Group__3_in_rule__HoldsAt__Group__25702);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2722:1: rule__HoldsAt__Group__3 : ( ',' ) rule__HoldsAt__Group__4 ;
    public final void rule__HoldsAt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2726:1: ( ( ',' ) rule__HoldsAt__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2727:1: ( ',' ) rule__HoldsAt__Group__4
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2727:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2728:1: ','
            {
             before(grammarAccess.getHoldsAtAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__HoldsAt__Group__35731); 
             after(grammarAccess.getHoldsAtAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__HoldsAt__Group__4_in_rule__HoldsAt__Group__35741);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2742:1: rule__HoldsAt__Group__4 : ( ( rule__HoldsAt__TimeAssignment_4 ) ) rule__HoldsAt__Group__5 ;
    public final void rule__HoldsAt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2746:1: ( ( ( rule__HoldsAt__TimeAssignment_4 ) ) rule__HoldsAt__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2747:1: ( ( rule__HoldsAt__TimeAssignment_4 ) ) rule__HoldsAt__Group__5
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2747:1: ( ( rule__HoldsAt__TimeAssignment_4 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2748:1: ( rule__HoldsAt__TimeAssignment_4 )
            {
             before(grammarAccess.getHoldsAtAccess().getTimeAssignment_4()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2749:1: ( rule__HoldsAt__TimeAssignment_4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2749:2: rule__HoldsAt__TimeAssignment_4
            {
            pushFollow(FOLLOW_rule__HoldsAt__TimeAssignment_4_in_rule__HoldsAt__Group__45769);
            rule__HoldsAt__TimeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getHoldsAtAccess().getTimeAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__HoldsAt__Group__5_in_rule__HoldsAt__Group__45778);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2760:1: rule__HoldsAt__Group__5 : ( ')' ) ;
    public final void rule__HoldsAt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2764:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2765:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2765:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2766:1: ')'
            {
             before(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__HoldsAt__Group__55807); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2791:1: rule__Happens__Group__0 : ( 'Happens' ) rule__Happens__Group__1 ;
    public final void rule__Happens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2795:1: ( ( 'Happens' ) rule__Happens__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2796:1: ( 'Happens' ) rule__Happens__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2796:1: ( 'Happens' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2797:1: 'Happens'
            {
             before(grammarAccess.getHappensAccess().getHappensKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Happens__Group__05855); 
             after(grammarAccess.getHappensAccess().getHappensKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Happens__Group__1_in_rule__Happens__Group__05865);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2811:1: rule__Happens__Group__1 : ( '(' ) rule__Happens__Group__2 ;
    public final void rule__Happens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2815:1: ( ( '(' ) rule__Happens__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2816:1: ( '(' ) rule__Happens__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2816:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2817:1: '('
            {
             before(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Happens__Group__15894); 
             after(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Happens__Group__2_in_rule__Happens__Group__15904);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2831:1: rule__Happens__Group__2 : ( ( rule__Happens__EventAssignment_2 ) ) rule__Happens__Group__3 ;
    public final void rule__Happens__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2835:1: ( ( ( rule__Happens__EventAssignment_2 ) ) rule__Happens__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2836:1: ( ( rule__Happens__EventAssignment_2 ) ) rule__Happens__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2836:1: ( ( rule__Happens__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2837:1: ( rule__Happens__EventAssignment_2 )
            {
             before(grammarAccess.getHappensAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2838:1: ( rule__Happens__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2838:2: rule__Happens__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Happens__EventAssignment_2_in_rule__Happens__Group__25932);
            rule__Happens__EventAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHappensAccess().getEventAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Happens__Group__3_in_rule__Happens__Group__25941);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2849:1: rule__Happens__Group__3 : ( ',' ) rule__Happens__Group__4 ;
    public final void rule__Happens__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2853:1: ( ( ',' ) rule__Happens__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2854:1: ( ',' ) rule__Happens__Group__4
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2854:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2855:1: ','
            {
             before(grammarAccess.getHappensAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Happens__Group__35970); 
             after(grammarAccess.getHappensAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Happens__Group__4_in_rule__Happens__Group__35980);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2869:1: rule__Happens__Group__4 : ( ( rule__Happens__TimeAssignment_4 ) ) rule__Happens__Group__5 ;
    public final void rule__Happens__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2873:1: ( ( ( rule__Happens__TimeAssignment_4 ) ) rule__Happens__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2874:1: ( ( rule__Happens__TimeAssignment_4 ) ) rule__Happens__Group__5
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2874:1: ( ( rule__Happens__TimeAssignment_4 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2875:1: ( rule__Happens__TimeAssignment_4 )
            {
             before(grammarAccess.getHappensAccess().getTimeAssignment_4()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2876:1: ( rule__Happens__TimeAssignment_4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2876:2: rule__Happens__TimeAssignment_4
            {
            pushFollow(FOLLOW_rule__Happens__TimeAssignment_4_in_rule__Happens__Group__46008);
            rule__Happens__TimeAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getHappensAccess().getTimeAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Happens__Group__5_in_rule__Happens__Group__46017);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2887:1: rule__Happens__Group__5 : ( ')' ) ;
    public final void rule__Happens__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2891:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2892:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2892:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2893:1: ')'
            {
             before(grammarAccess.getHappensAccess().getRightParenthesisKeyword_5()); 
            match(input,23,FOLLOW_23_in_rule__Happens__Group__56046); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2918:1: rule__Initiates__Group__0 : ( 'Initiates' ) rule__Initiates__Group__1 ;
    public final void rule__Initiates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2922:1: ( ( 'Initiates' ) rule__Initiates__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2923:1: ( 'Initiates' ) rule__Initiates__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2923:1: ( 'Initiates' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2924:1: 'Initiates'
            {
             before(grammarAccess.getInitiatesAccess().getInitiatesKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Initiates__Group__06094); 
             after(grammarAccess.getInitiatesAccess().getInitiatesKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__1_in_rule__Initiates__Group__06104);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2938:1: rule__Initiates__Group__1 : ( '(' ) rule__Initiates__Group__2 ;
    public final void rule__Initiates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2942:1: ( ( '(' ) rule__Initiates__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2943:1: ( '(' ) rule__Initiates__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2943:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2944:1: '('
            {
             before(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Initiates__Group__16133); 
             after(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__2_in_rule__Initiates__Group__16143);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2958:1: rule__Initiates__Group__2 : ( ( rule__Initiates__EventAssignment_2 ) ) rule__Initiates__Group__3 ;
    public final void rule__Initiates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2962:1: ( ( ( rule__Initiates__EventAssignment_2 ) ) rule__Initiates__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2963:1: ( ( rule__Initiates__EventAssignment_2 ) ) rule__Initiates__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2963:1: ( ( rule__Initiates__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2964:1: ( rule__Initiates__EventAssignment_2 )
            {
             before(grammarAccess.getInitiatesAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2965:1: ( rule__Initiates__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2965:2: rule__Initiates__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Initiates__EventAssignment_2_in_rule__Initiates__Group__26171);
            rule__Initiates__EventAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getEventAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__3_in_rule__Initiates__Group__26180);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2976:1: rule__Initiates__Group__3 : ( ',' ) rule__Initiates__Group__4 ;
    public final void rule__Initiates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2980:1: ( ( ',' ) rule__Initiates__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2981:1: ( ',' ) rule__Initiates__Group__4
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2981:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2982:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group__36209); 
             after(grammarAccess.getInitiatesAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__4_in_rule__Initiates__Group__36219);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:2996:1: rule__Initiates__Group__4 : ( ( rule__Initiates__FluentAssignment_4 ) ) rule__Initiates__Group__5 ;
    public final void rule__Initiates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3000:1: ( ( ( rule__Initiates__FluentAssignment_4 ) ) rule__Initiates__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3001:1: ( ( rule__Initiates__FluentAssignment_4 ) ) rule__Initiates__Group__5
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3001:1: ( ( rule__Initiates__FluentAssignment_4 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3002:1: ( rule__Initiates__FluentAssignment_4 )
            {
             before(grammarAccess.getInitiatesAccess().getFluentAssignment_4()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3003:1: ( rule__Initiates__FluentAssignment_4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3003:2: rule__Initiates__FluentAssignment_4
            {
            pushFollow(FOLLOW_rule__Initiates__FluentAssignment_4_in_rule__Initiates__Group__46247);
            rule__Initiates__FluentAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getFluentAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__5_in_rule__Initiates__Group__46256);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3014:1: rule__Initiates__Group__5 : ( ',' ) rule__Initiates__Group__6 ;
    public final void rule__Initiates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3018:1: ( ( ',' ) rule__Initiates__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3019:1: ( ',' ) rule__Initiates__Group__6
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3019:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3020:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group__56285); 
             after(grammarAccess.getInitiatesAccess().getCommaKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__6_in_rule__Initiates__Group__56295);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3034:1: rule__Initiates__Group__6 : ( ( rule__Initiates__TimeAssignment_6 ) ) rule__Initiates__Group__7 ;
    public final void rule__Initiates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3038:1: ( ( ( rule__Initiates__TimeAssignment_6 ) ) rule__Initiates__Group__7 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3039:1: ( ( rule__Initiates__TimeAssignment_6 ) ) rule__Initiates__Group__7
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3039:1: ( ( rule__Initiates__TimeAssignment_6 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3040:1: ( rule__Initiates__TimeAssignment_6 )
            {
             before(grammarAccess.getInitiatesAccess().getTimeAssignment_6()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3041:1: ( rule__Initiates__TimeAssignment_6 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3041:2: rule__Initiates__TimeAssignment_6
            {
            pushFollow(FOLLOW_rule__Initiates__TimeAssignment_6_in_rule__Initiates__Group__66323);
            rule__Initiates__TimeAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getInitiatesAccess().getTimeAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Initiates__Group__7_in_rule__Initiates__Group__66332);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3052:1: rule__Initiates__Group__7 : ( ')' ) ;
    public final void rule__Initiates__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3056:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3057:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3057:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3058:1: ')'
            {
             before(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Initiates__Group__76361); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3087:1: rule__Terminates__Group__0 : ( 'Terminates' ) rule__Terminates__Group__1 ;
    public final void rule__Terminates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3091:1: ( ( 'Terminates' ) rule__Terminates__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3092:1: ( 'Terminates' ) rule__Terminates__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3092:1: ( 'Terminates' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3093:1: 'Terminates'
            {
             before(grammarAccess.getTerminatesAccess().getTerminatesKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Terminates__Group__06413); 
             after(grammarAccess.getTerminatesAccess().getTerminatesKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__1_in_rule__Terminates__Group__06423);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3107:1: rule__Terminates__Group__1 : ( '(' ) rule__Terminates__Group__2 ;
    public final void rule__Terminates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3111:1: ( ( '(' ) rule__Terminates__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3112:1: ( '(' ) rule__Terminates__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3112:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3113:1: '('
            {
             before(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Terminates__Group__16452); 
             after(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__2_in_rule__Terminates__Group__16462);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3127:1: rule__Terminates__Group__2 : ( ( rule__Terminates__EventAssignment_2 ) ) rule__Terminates__Group__3 ;
    public final void rule__Terminates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3131:1: ( ( ( rule__Terminates__EventAssignment_2 ) ) rule__Terminates__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3132:1: ( ( rule__Terminates__EventAssignment_2 ) ) rule__Terminates__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3132:1: ( ( rule__Terminates__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3133:1: ( rule__Terminates__EventAssignment_2 )
            {
             before(grammarAccess.getTerminatesAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3134:1: ( rule__Terminates__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3134:2: rule__Terminates__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Terminates__EventAssignment_2_in_rule__Terminates__Group__26490);
            rule__Terminates__EventAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getEventAssignment_2()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__3_in_rule__Terminates__Group__26499);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3145:1: rule__Terminates__Group__3 : ( ',' ) rule__Terminates__Group__4 ;
    public final void rule__Terminates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3149:1: ( ( ',' ) rule__Terminates__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3150:1: ( ',' ) rule__Terminates__Group__4
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3150:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3151:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_3()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group__36528); 
             after(grammarAccess.getTerminatesAccess().getCommaKeyword_3()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__4_in_rule__Terminates__Group__36538);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3165:1: rule__Terminates__Group__4 : ( ( rule__Terminates__FluentAssignment_4 ) ) rule__Terminates__Group__5 ;
    public final void rule__Terminates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3169:1: ( ( ( rule__Terminates__FluentAssignment_4 ) ) rule__Terminates__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3170:1: ( ( rule__Terminates__FluentAssignment_4 ) ) rule__Terminates__Group__5
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3170:1: ( ( rule__Terminates__FluentAssignment_4 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3171:1: ( rule__Terminates__FluentAssignment_4 )
            {
             before(grammarAccess.getTerminatesAccess().getFluentAssignment_4()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3172:1: ( rule__Terminates__FluentAssignment_4 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3172:2: rule__Terminates__FluentAssignment_4
            {
            pushFollow(FOLLOW_rule__Terminates__FluentAssignment_4_in_rule__Terminates__Group__46566);
            rule__Terminates__FluentAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getFluentAssignment_4()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__5_in_rule__Terminates__Group__46575);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3183:1: rule__Terminates__Group__5 : ( ',' ) rule__Terminates__Group__6 ;
    public final void rule__Terminates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3187:1: ( ( ',' ) rule__Terminates__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3188:1: ( ',' ) rule__Terminates__Group__6
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3188:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3189:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_5()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group__56604); 
             after(grammarAccess.getTerminatesAccess().getCommaKeyword_5()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__6_in_rule__Terminates__Group__56614);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3203:1: rule__Terminates__Group__6 : ( ( rule__Terminates__TimeAssignment_6 ) ) rule__Terminates__Group__7 ;
    public final void rule__Terminates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3207:1: ( ( ( rule__Terminates__TimeAssignment_6 ) ) rule__Terminates__Group__7 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3208:1: ( ( rule__Terminates__TimeAssignment_6 ) ) rule__Terminates__Group__7
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3208:1: ( ( rule__Terminates__TimeAssignment_6 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3209:1: ( rule__Terminates__TimeAssignment_6 )
            {
             before(grammarAccess.getTerminatesAccess().getTimeAssignment_6()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3210:1: ( rule__Terminates__TimeAssignment_6 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3210:2: rule__Terminates__TimeAssignment_6
            {
            pushFollow(FOLLOW_rule__Terminates__TimeAssignment_6_in_rule__Terminates__Group__66642);
            rule__Terminates__TimeAssignment_6();
            _fsp--;


            }

             after(grammarAccess.getTerminatesAccess().getTimeAssignment_6()); 

            }

            pushFollow(FOLLOW_rule__Terminates__Group__7_in_rule__Terminates__Group__66651);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3221:1: rule__Terminates__Group__7 : ( ')' ) ;
    public final void rule__Terminates__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3225:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3226:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3226:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3227:1: ')'
            {
             before(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_7()); 
            match(input,23,FOLLOW_23_in_rule__Terminates__Group__76680); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3256:1: rule__Path__Group__0 : ( ( rule__Path__FileAssignment_0 ) ) rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3260:1: ( ( ( rule__Path__FileAssignment_0 ) ) rule__Path__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3261:1: ( ( rule__Path__FileAssignment_0 ) ) rule__Path__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3261:1: ( ( rule__Path__FileAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3262:1: ( rule__Path__FileAssignment_0 )
            {
             before(grammarAccess.getPathAccess().getFileAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3263:1: ( rule__Path__FileAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3263:2: rule__Path__FileAssignment_0
            {
            pushFollow(FOLLOW_rule__Path__FileAssignment_0_in_rule__Path__Group__06731);
            rule__Path__FileAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPathAccess().getFileAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Path__Group__1_in_rule__Path__Group__06740);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3274:1: rule__Path__Group__1 : ( ( rule__Path__Group_1__0 )* ) ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3278:1: ( ( ( rule__Path__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3279:1: ( ( rule__Path__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3279:1: ( ( rule__Path__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3280:1: ( rule__Path__Group_1__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3281:1: ( rule__Path__Group_1__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==33) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3281:2: rule__Path__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__16768);
            	    rule__Path__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3295:1: rule__Path__Group_1__0 : ( '/' ) rule__Path__Group_1__1 ;
    public final void rule__Path__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3299:1: ( ( '/' ) rule__Path__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3300:1: ( '/' ) rule__Path__Group_1__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3300:1: ( '/' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3301:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Path__Group_1__06808); 
             after(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__06818);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3315:1: rule__Path__Group_1__1 : ( ( rule__Path__FileAssignment_1_1 ) ) ;
    public final void rule__Path__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3319:1: ( ( ( rule__Path__FileAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3320:1: ( ( rule__Path__FileAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3320:1: ( ( rule__Path__FileAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3321:1: ( rule__Path__FileAssignment_1_1 )
            {
             before(grammarAccess.getPathAccess().getFileAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3322:1: ( rule__Path__FileAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3322:2: rule__Path__FileAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Path__FileAssignment_1_1_in_rule__Path__Group_1__16846);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3336:1: rule__File__Group__0 : ( ( rule__File__NameAssignment_0 ) ) rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3340:1: ( ( ( rule__File__NameAssignment_0 ) ) rule__File__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3341:1: ( ( rule__File__NameAssignment_0 ) ) rule__File__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3341:1: ( ( rule__File__NameAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3342:1: ( rule__File__NameAssignment_0 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3343:1: ( rule__File__NameAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3343:2: rule__File__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__File__NameAssignment_0_in_rule__File__Group__06884);
            rule__File__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFileAccess().getNameAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__File__Group__1_in_rule__File__Group__06893);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3354:1: rule__File__Group__1 : ( ( rule__File__Group_1__0 )* ) ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3358:1: ( ( ( rule__File__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3359:1: ( ( rule__File__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3359:1: ( ( rule__File__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3360:1: ( rule__File__Group_1__0 )*
            {
             before(grammarAccess.getFileAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3361:1: ( rule__File__Group_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3361:2: rule__File__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__File__Group_1__0_in_rule__File__Group__16921);
            	    rule__File__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3375:1: rule__File__Group_1__0 : ( '.' ) rule__File__Group_1__1 ;
    public final void rule__File__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3379:1: ( ( '.' ) rule__File__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3380:1: ( '.' ) rule__File__Group_1__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3380:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3381:1: '.'
            {
             before(grammarAccess.getFileAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__File__Group_1__06961); 
             after(grammarAccess.getFileAccess().getFullStopKeyword_1_0()); 

            }

            pushFollow(FOLLOW_rule__File__Group_1__1_in_rule__File__Group_1__06971);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3395:1: rule__File__Group_1__1 : ( ( rule__File__NameAssignment_1_1 ) ) ;
    public final void rule__File__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3399:1: ( ( ( rule__File__NameAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3400:1: ( ( rule__File__NameAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3400:1: ( ( rule__File__NameAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3401:1: ( rule__File__NameAssignment_1_1 )
            {
             before(grammarAccess.getFileAccess().getNameAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3402:1: ( rule__File__NameAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3402:2: rule__File__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__File__NameAssignment_1_1_in_rule__File__Group_1__16999);
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


    // $ANTLR start rule__Actor__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3417:1: rule__Actor__Group__0 : ( 'actor' ) rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3421:1: ( ( 'actor' ) rule__Actor__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3422:1: ( 'actor' ) rule__Actor__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3422:1: ( 'actor' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3423:1: 'actor'
            {
             before(grammarAccess.getActorAccess().getActorKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Actor__Group__07039); 
             after(grammarAccess.getActorAccess().getActorKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__07049);
            rule__Actor__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group__0


    // $ANTLR start rule__Actor__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3437:1: rule__Actor__Group__1 : ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3441:1: ( ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3442:1: ( ( rule__Actor__NameAssignment_1 ) ) rule__Actor__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3442:1: ( ( rule__Actor__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3443:1: ( rule__Actor__NameAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3444:1: ( rule__Actor__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3444:2: rule__Actor__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__17077);
            rule__Actor__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__17086);
            rule__Actor__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group__1


    // $ANTLR start rule__Actor__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3455:1: rule__Actor__Group__2 : ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3459:1: ( ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3460:1: ( ( rule__Actor__Alternatives_2 )* ) rule__Actor__Group__3
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3460:1: ( ( rule__Actor__Alternatives_2 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3461:1: ( rule__Actor__Alternatives_2 )*
            {
             before(grammarAccess.getActorAccess().getAlternatives_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3462:1: ( rule__Actor__Alternatives_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_ID) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3462:2: rule__Actor__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__27114);
            	    rule__Actor__Alternatives_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getAlternatives_2()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__27124);
            rule__Actor__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group__2


    // $ANTLR start rule__Actor__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3473:1: rule__Actor__Group__3 : ( ( rule__Actor__Group_3__0 )? ) ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3477:1: ( ( ( rule__Actor__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3478:1: ( ( rule__Actor__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3478:1: ( ( rule__Actor__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3479:1: ( rule__Actor__Group_3__0 )?
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3480:1: ( rule__Actor__Group_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3480:2: rule__Actor__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__37152);
                    rule__Actor__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group__3


    // $ANTLR start rule__Actor__Group_3__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3498:1: rule__Actor__Group_3__0 : ( '{' ) rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3502:1: ( ( '{' ) rule__Actor__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3503:1: ( '{' ) rule__Actor__Group_3__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3503:1: ( '{' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3504:1: '{'
            {
             before(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,35,FOLLOW_35_in_rule__Actor__Group_3__07196); 
             after(grammarAccess.getActorAccess().getLeftCurlyBracketKeyword_3_0()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__07206);
            rule__Actor__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_3__0


    // $ANTLR start rule__Actor__Group_3__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3518:1: rule__Actor__Group_3__1 : ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2 ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3522:1: ( ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3523:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* ) rule__Actor__Group_3__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3523:1: ( ( rule__Actor__IntentionsAssignment_3_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3524:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            {
             before(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3525:1: ( rule__Actor__IntentionsAssignment_3_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=40 && LA27_0<=44)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3525:2: rule__Actor__IntentionsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__17234);
            	    rule__Actor__IntentionsAssignment_3_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getIntentionsAssignment_3_1()); 

            }

            pushFollow(FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__17244);
            rule__Actor__Group_3__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_3__1


    // $ANTLR start rule__Actor__Group_3__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3536:1: rule__Actor__Group_3__2 : ( '}' ) ;
    public final void rule__Actor__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3540:1: ( ( '}' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3541:1: ( '}' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3541:1: ( '}' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3542:1: '}'
            {
             before(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,36,FOLLOW_36_in_rule__Actor__Group_3__27273); 
             after(grammarAccess.getActorAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_3__2


    // $ANTLR start rule__Agent__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3561:1: rule__Agent__Group__0 : ( 'agent' ) rule__Agent__Group__1 ;
    public final void rule__Agent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3565:1: ( ( 'agent' ) rule__Agent__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3566:1: ( 'agent' ) rule__Agent__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3566:1: ( 'agent' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3567:1: 'agent'
            {
             before(grammarAccess.getAgentAccess().getAgentKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Agent__Group__07315); 
             after(grammarAccess.getAgentAccess().getAgentKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__07325);
            rule__Agent__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Agent__Group__0


    // $ANTLR start rule__Agent__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3581:1: rule__Agent__Group__1 : ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2 ;
    public final void rule__Agent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3585:1: ( ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3586:1: ( ( rule__Agent__NameAssignment_1 ) ) rule__Agent__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3586:1: ( ( rule__Agent__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3587:1: ( rule__Agent__NameAssignment_1 )
            {
             before(grammarAccess.getAgentAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3588:1: ( rule__Agent__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3588:2: rule__Agent__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__17353);
            rule__Agent__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAgentAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__17362);
            rule__Agent__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Agent__Group__1


    // $ANTLR start rule__Agent__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3599:1: rule__Agent__Group__2 : ( ( rule__Agent__Group_2__0 )? ) ;
    public final void rule__Agent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3603:1: ( ( ( rule__Agent__Group_2__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3604:1: ( ( rule__Agent__Group_2__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3604:1: ( ( rule__Agent__Group_2__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3605:1: ( rule__Agent__Group_2__0 )?
            {
             before(grammarAccess.getAgentAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3606:1: ( rule__Agent__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==35) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3606:2: rule__Agent__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__27390);
                    rule__Agent__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAgentAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Agent__Group__2


    // $ANTLR start rule__Agent__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3622:1: rule__Agent__Group_2__0 : ( '{' ) rule__Agent__Group_2__1 ;
    public final void rule__Agent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3626:1: ( ( '{' ) rule__Agent__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3627:1: ( '{' ) rule__Agent__Group_2__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3627:1: ( '{' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3628:1: '{'
            {
             before(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Agent__Group_2__07432); 
             after(grammarAccess.getAgentAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__07442);
            rule__Agent__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Agent__Group_2__0


    // $ANTLR start rule__Agent__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3642:1: rule__Agent__Group_2__1 : ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2 ;
    public final void rule__Agent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3646:1: ( ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3647:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* ) rule__Agent__Group_2__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3647:1: ( ( rule__Agent__IntentionsAssignment_2_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3648:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3649:1: ( rule__Agent__IntentionsAssignment_2_1 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=40 && LA29_0<=44)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3649:2: rule__Agent__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__17470);
            	    rule__Agent__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getAgentAccess().getIntentionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__17480);
            rule__Agent__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Agent__Group_2__1


    // $ANTLR start rule__Agent__Group_2__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3660:1: rule__Agent__Group_2__2 : ( '}' ) ;
    public final void rule__Agent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3664:1: ( ( '}' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3665:1: ( '}' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3665:1: ( '}' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3666:1: '}'
            {
             before(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,36,FOLLOW_36_in_rule__Agent__Group_2__27509); 
             after(grammarAccess.getAgentAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Agent__Group_2__2


    // $ANTLR start rule__Role__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3685:1: rule__Role__Group__0 : ( 'role' ) rule__Role__Group__1 ;
    public final void rule__Role__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3689:1: ( ( 'role' ) rule__Role__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3690:1: ( 'role' ) rule__Role__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3690:1: ( 'role' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3691:1: 'role'
            {
             before(grammarAccess.getRoleAccess().getRoleKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Role__Group__07551); 
             after(grammarAccess.getRoleAccess().getRoleKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Role__Group__1_in_rule__Role__Group__07561);
            rule__Role__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__Group__0


    // $ANTLR start rule__Role__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3705:1: rule__Role__Group__1 : ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2 ;
    public final void rule__Role__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3709:1: ( ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3710:1: ( ( rule__Role__NameAssignment_1 ) ) rule__Role__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3710:1: ( ( rule__Role__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3711:1: ( rule__Role__NameAssignment_1 )
            {
             before(grammarAccess.getRoleAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3712:1: ( rule__Role__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3712:2: rule__Role__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__17589);
            rule__Role__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRoleAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Role__Group__2_in_rule__Role__Group__17598);
            rule__Role__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__Group__1


    // $ANTLR start rule__Role__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3723:1: rule__Role__Group__2 : ( ( rule__Role__Group_2__0 )? ) ;
    public final void rule__Role__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3727:1: ( ( ( rule__Role__Group_2__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3728:1: ( ( rule__Role__Group_2__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3728:1: ( ( rule__Role__Group_2__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3729:1: ( rule__Role__Group_2__0 )?
            {
             before(grammarAccess.getRoleAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3730:1: ( rule__Role__Group_2__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3730:2: rule__Role__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__27626);
                    rule__Role__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRoleAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__Group__2


    // $ANTLR start rule__Role__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3746:1: rule__Role__Group_2__0 : ( '{' ) rule__Role__Group_2__1 ;
    public final void rule__Role__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3750:1: ( ( '{' ) rule__Role__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3751:1: ( '{' ) rule__Role__Group_2__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3751:1: ( '{' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3752:1: '{'
            {
             before(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Role__Group_2__07668); 
             after(grammarAccess.getRoleAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__07678);
            rule__Role__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__Group_2__0


    // $ANTLR start rule__Role__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3766:1: rule__Role__Group_2__1 : ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2 ;
    public final void rule__Role__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3770:1: ( ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3771:1: ( ( rule__Role__IntentionsAssignment_2_1 )* ) rule__Role__Group_2__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3771:1: ( ( rule__Role__IntentionsAssignment_2_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3772:1: ( rule__Role__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3773:1: ( rule__Role__IntentionsAssignment_2_1 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=40 && LA31_0<=44)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3773:2: rule__Role__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__17706);
            	    rule__Role__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getRoleAccess().getIntentionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__17716);
            rule__Role__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__Group_2__1


    // $ANTLR start rule__Role__Group_2__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3784:1: rule__Role__Group_2__2 : ( '}' ) ;
    public final void rule__Role__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3788:1: ( ( '}' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3789:1: ( '}' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3789:1: ( '}' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3790:1: '}'
            {
             before(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,36,FOLLOW_36_in_rule__Role__Group_2__27745); 
             after(grammarAccess.getRoleAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__Group_2__2


    // $ANTLR start rule__Position__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3809:1: rule__Position__Group__0 : ( 'position' ) rule__Position__Group__1 ;
    public final void rule__Position__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3813:1: ( ( 'position' ) rule__Position__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3814:1: ( 'position' ) rule__Position__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3814:1: ( 'position' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3815:1: 'position'
            {
             before(grammarAccess.getPositionAccess().getPositionKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Position__Group__07787); 
             after(grammarAccess.getPositionAccess().getPositionKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Position__Group__1_in_rule__Position__Group__07797);
            rule__Position__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Position__Group__0


    // $ANTLR start rule__Position__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3829:1: rule__Position__Group__1 : ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2 ;
    public final void rule__Position__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3833:1: ( ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3834:1: ( ( rule__Position__NameAssignment_1 ) ) rule__Position__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3834:1: ( ( rule__Position__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3835:1: ( rule__Position__NameAssignment_1 )
            {
             before(grammarAccess.getPositionAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3836:1: ( rule__Position__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3836:2: rule__Position__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__17825);
            rule__Position__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPositionAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Position__Group__2_in_rule__Position__Group__17834);
            rule__Position__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Position__Group__1


    // $ANTLR start rule__Position__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3847:1: rule__Position__Group__2 : ( ( rule__Position__Group_2__0 )? ) ;
    public final void rule__Position__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3851:1: ( ( ( rule__Position__Group_2__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3852:1: ( ( rule__Position__Group_2__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3852:1: ( ( rule__Position__Group_2__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3853:1: ( rule__Position__Group_2__0 )?
            {
             before(grammarAccess.getPositionAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3854:1: ( rule__Position__Group_2__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3854:2: rule__Position__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__27862);
                    rule__Position__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPositionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Position__Group__2


    // $ANTLR start rule__Position__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3870:1: rule__Position__Group_2__0 : ( '{' ) rule__Position__Group_2__1 ;
    public final void rule__Position__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3874:1: ( ( '{' ) rule__Position__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3875:1: ( '{' ) rule__Position__Group_2__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3875:1: ( '{' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3876:1: '{'
            {
             before(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Position__Group_2__07904); 
             after(grammarAccess.getPositionAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__07914);
            rule__Position__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Position__Group_2__0


    // $ANTLR start rule__Position__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3890:1: rule__Position__Group_2__1 : ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2 ;
    public final void rule__Position__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3894:1: ( ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3895:1: ( ( rule__Position__IntentionsAssignment_2_1 )* ) rule__Position__Group_2__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3895:1: ( ( rule__Position__IntentionsAssignment_2_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3896:1: ( rule__Position__IntentionsAssignment_2_1 )*
            {
             before(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3897:1: ( rule__Position__IntentionsAssignment_2_1 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=40 && LA33_0<=44)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3897:2: rule__Position__IntentionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__17942);
            	    rule__Position__IntentionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getPositionAccess().getIntentionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__17952);
            rule__Position__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Position__Group_2__1


    // $ANTLR start rule__Position__Group_2__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3908:1: rule__Position__Group_2__2 : ( '}' ) ;
    public final void rule__Position__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3912:1: ( ( '}' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3913:1: ( '}' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3913:1: ( '}' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3914:1: '}'
            {
             before(grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,36,FOLLOW_36_in_rule__Position__Group_2__27981); 
             after(grammarAccess.getPositionAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Position__Group_2__2


    // $ANTLR start rule__Goal__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3933:1: rule__Goal__Group__0 : ( 'goal' ) rule__Goal__Group__1 ;
    public final void rule__Goal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3937:1: ( ( 'goal' ) rule__Goal__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3938:1: ( 'goal' ) rule__Goal__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3938:1: ( 'goal' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3939:1: 'goal'
            {
             before(grammarAccess.getGoalAccess().getGoalKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Goal__Group__08023); 
             after(grammarAccess.getGoalAccess().getGoalKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__08033);
            rule__Goal__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group__0


    // $ANTLR start rule__Goal__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3953:1: rule__Goal__Group__1 : ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2 ;
    public final void rule__Goal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3957:1: ( ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3958:1: ( ( rule__Goal__NameAssignment_1 ) ) rule__Goal__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3958:1: ( ( rule__Goal__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3959:1: ( rule__Goal__NameAssignment_1 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3960:1: ( rule__Goal__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3960:2: rule__Goal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__18061);
            rule__Goal__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getNameAssignment_1()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__18070);
            rule__Goal__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group__1


    // $ANTLR start rule__Goal__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3971:1: rule__Goal__Group__2 : ( ( rule__Goal__Group_2__0 )? ) ;
    public final void rule__Goal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3975:1: ( ( ( rule__Goal__Group_2__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3976:1: ( ( rule__Goal__Group_2__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3976:1: ( ( rule__Goal__Group_2__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3977:1: ( rule__Goal__Group_2__0 )?
            {
             before(grammarAccess.getGoalAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3978:1: ( rule__Goal__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3978:2: rule__Goal__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__28098);
                    rule__Goal__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group__2


    // $ANTLR start rule__Goal__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3994:1: rule__Goal__Group_2__0 : ( '{' ) rule__Goal__Group_2__1 ;
    public final void rule__Goal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3998:1: ( ( '{' ) rule__Goal__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3999:1: ( '{' ) rule__Goal__Group_2__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:3999:1: ( '{' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4000:1: '{'
            {
             before(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Goal__Group_2__08140); 
             after(grammarAccess.getGoalAccess().getLeftCurlyBracketKeyword_2_0()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__08150);
            rule__Goal__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_2__0


    // $ANTLR start rule__Goal__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4014:1: rule__Goal__Group_2__1 : ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2 ;
    public final void rule__Goal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4018:1: ( ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4019:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* ) rule__Goal__Group_2__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4019:1: ( ( rule__Goal__DecompositionsAssignment_2_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4020:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            {
             before(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4021:1: ( rule__Goal__DecompositionsAssignment_2_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4021:2: rule__Goal__DecompositionsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__18178);
            	    rule__Goal__DecompositionsAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getGoalAccess().getDecompositionsAssignment_2_1()); 

            }

            pushFollow(FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__18188);
            rule__Goal__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_2__1


    // $ANTLR start rule__Goal__Group_2__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4032:1: rule__Goal__Group_2__2 : ( '}' ) ;
    public final void rule__Goal__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4036:1: ( ( '}' ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4037:1: ( '}' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4037:1: ( '}' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4038:1: '}'
            {
             before(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,36,FOLLOW_36_in_rule__Goal__Group_2__28217); 
             after(grammarAccess.getGoalAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_2__2


    // $ANTLR start rule__Softgoal__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4057:1: rule__Softgoal__Group__0 : ( 'soft' ) rule__Softgoal__Group__1 ;
    public final void rule__Softgoal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4061:1: ( ( 'soft' ) rule__Softgoal__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4062:1: ( 'soft' ) rule__Softgoal__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4062:1: ( 'soft' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4063:1: 'soft'
            {
             before(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Softgoal__Group__08259); 
             after(grammarAccess.getSoftgoalAccess().getSoftKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__08269);
            rule__Softgoal__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Softgoal__Group__0


    // $ANTLR start rule__Softgoal__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4077:1: rule__Softgoal__Group__1 : ( ( rule__Softgoal__NameAssignment_1 ) ) ;
    public final void rule__Softgoal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4081:1: ( ( ( rule__Softgoal__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4082:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4082:1: ( ( rule__Softgoal__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4083:1: ( rule__Softgoal__NameAssignment_1 )
            {
             before(grammarAccess.getSoftgoalAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4084:1: ( rule__Softgoal__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4084:2: rule__Softgoal__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__18297);
            rule__Softgoal__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSoftgoalAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Softgoal__Group__1


    // $ANTLR start rule__Task__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4098:1: rule__Task__Group__0 : ( 'task' ) rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4102:1: ( ( 'task' ) rule__Task__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4103:1: ( 'task' ) rule__Task__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4103:1: ( 'task' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4104:1: 'task'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__Task__Group__08336); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Task__Group__1_in_rule__Task__Group__08346);
            rule__Task__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Task__Group__0


    // $ANTLR start rule__Task__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4118:1: rule__Task__Group__1 : ( ( rule__Task__NameAssignment_1 ) ) ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4122:1: ( ( ( rule__Task__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4123:1: ( ( rule__Task__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4123:1: ( ( rule__Task__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4124:1: ( rule__Task__NameAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4125:1: ( rule__Task__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4125:2: rule__Task__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__18374);
            rule__Task__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getTaskAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Task__Group__1


    // $ANTLR start rule__Resource__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4139:1: rule__Resource__Group__0 : ( 'resource' ) rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4143:1: ( ( 'resource' ) rule__Resource__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4144:1: ( 'resource' ) rule__Resource__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4144:1: ( 'resource' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4145:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0()); 
            match(input,43,FOLLOW_43_in_rule__Resource__Group__08413); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__08423);
            rule__Resource__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group__0


    // $ANTLR start rule__Resource__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4159:1: rule__Resource__Group__1 : ( ( rule__Resource__NameAssignment_1 ) ) ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4163:1: ( ( ( rule__Resource__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4164:1: ( ( rule__Resource__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4164:1: ( ( rule__Resource__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4165:1: ( rule__Resource__NameAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4166:1: ( rule__Resource__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4166:2: rule__Resource__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__18451);
            rule__Resource__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group__1


    // $ANTLR start rule__Belief__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4180:1: rule__Belief__Group__0 : ( 'belief' ) rule__Belief__Group__1 ;
    public final void rule__Belief__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4184:1: ( ( 'belief' ) rule__Belief__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4185:1: ( 'belief' ) rule__Belief__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4185:1: ( 'belief' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4186:1: 'belief'
            {
             before(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Belief__Group__08490); 
             after(grammarAccess.getBeliefAccess().getBeliefKeyword_0()); 

            }

            pushFollow(FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__08500);
            rule__Belief__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Belief__Group__0


    // $ANTLR start rule__Belief__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4200:1: rule__Belief__Group__1 : ( ( rule__Belief__NameAssignment_1 ) ) ;
    public final void rule__Belief__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4204:1: ( ( ( rule__Belief__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4205:1: ( ( rule__Belief__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4205:1: ( ( rule__Belief__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4206:1: ( rule__Belief__NameAssignment_1 )
            {
             before(grammarAccess.getBeliefAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4207:1: ( rule__Belief__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4207:2: rule__Belief__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__18528);
            rule__Belief__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getBeliefAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Belief__Group__1


    // $ANTLR start rule__Association__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4221:1: rule__Association__Group__0 : ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1 ;
    public final void rule__Association__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4225:1: ( ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4226:1: ( ( rule__Association__SourceAssignment_0 ) ) rule__Association__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4226:1: ( ( rule__Association__SourceAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4227:1: ( rule__Association__SourceAssignment_0 )
            {
             before(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4228:1: ( rule__Association__SourceAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4228:2: rule__Association__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__08566);
            rule__Association__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__1_in_rule__Association__Group__08575);
            rule__Association__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__0


    // $ANTLR start rule__Association__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4239:1: rule__Association__Group__1 : ( '~~>' ) rule__Association__Group__2 ;
    public final void rule__Association__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4243:1: ( ( '~~>' ) rule__Association__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4244:1: ( '~~>' ) rule__Association__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4244:1: ( '~~>' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4245:1: '~~>'
            {
             before(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 
            match(input,45,FOLLOW_45_in_rule__Association__Group__18604); 
             after(grammarAccess.getAssociationAccess().getTildeTildeGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Association__Group__2_in_rule__Association__Group__18614);
            rule__Association__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__1


    // $ANTLR start rule__Association__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4259:1: rule__Association__Group__2 : ( ( rule__Association__TargetAssignment_2 ) ) ;
    public final void rule__Association__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4263:1: ( ( ( rule__Association__TargetAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4264:1: ( ( rule__Association__TargetAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4264:1: ( ( rule__Association__TargetAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4265:1: ( rule__Association__TargetAssignment_2 )
            {
             before(grammarAccess.getAssociationAccess().getTargetAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4266:1: ( rule__Association__TargetAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4266:2: rule__Association__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__28642);
            rule__Association__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAssociationAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__Group__2


    // $ANTLR start rule__Dependency__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4282:1: rule__Dependency__Group__0 : ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1 ;
    public final void rule__Dependency__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4286:1: ( ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4287:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) ) rule__Dependency__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4287:1: ( ( rule__Dependency__DependencyFromAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4288:1: ( rule__Dependency__DependencyFromAssignment_0 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4289:1: ( rule__Dependency__DependencyFromAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4289:2: rule__Dependency__DependencyFromAssignment_0
            {
            pushFollow(FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__08682);
            rule__Dependency__DependencyFromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDependencyFromAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__08691);
            rule__Dependency__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__0


    // $ANTLR start rule__Dependency__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4300:1: rule__Dependency__Group__1 : ( '~>' ) rule__Dependency__Group__2 ;
    public final void rule__Dependency__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4304:1: ( ( '~>' ) rule__Dependency__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4305:1: ( '~>' ) rule__Dependency__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4305:1: ( '~>' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4306:1: '~>'
            {
             before(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 
            match(input,46,FOLLOW_46_in_rule__Dependency__Group__18720); 
             after(grammarAccess.getDependencyAccess().getTildeGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__18730);
            rule__Dependency__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__1


    // $ANTLR start rule__Dependency__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4320:1: rule__Dependency__Group__2 : ( ( rule__Dependency__DependencyToAssignment_2 ) ) ;
    public final void rule__Dependency__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4324:1: ( ( ( rule__Dependency__DependencyToAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4325:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4325:1: ( ( rule__Dependency__DependencyToAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4326:1: ( rule__Dependency__DependencyToAssignment_2 )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4327:1: ( rule__Dependency__DependencyToAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4327:2: rule__Dependency__DependencyToAssignment_2
            {
            pushFollow(FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__28758);
            rule__Dependency__DependencyToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getDependencyToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__Group__2


    // $ANTLR start rule__AndDecomposition__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4343:1: rule__AndDecomposition__Group__0 : ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1 ;
    public final void rule__AndDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4347:1: ( ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4348:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) ) rule__AndDecomposition__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4348:1: ( ( rule__AndDecomposition__TargetAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4349:1: ( rule__AndDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4350:1: ( rule__AndDecomposition__TargetAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4350:2: rule__AndDecomposition__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__08798);
            rule__AndDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndDecompositionAccess().getTargetAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__08807);
            rule__AndDecomposition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndDecomposition__Group__0


    // $ANTLR start rule__AndDecomposition__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4361:1: rule__AndDecomposition__Group__1 : ( '<-(and)-' ) rule__AndDecomposition__Group__2 ;
    public final void rule__AndDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4365:1: ( ( '<-(and)-' ) rule__AndDecomposition__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4366:1: ( '<-(and)-' ) rule__AndDecomposition__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4366:1: ( '<-(and)-' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4367:1: '<-(and)-'
            {
             before(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__AndDecomposition__Group__18836); 
             after(grammarAccess.getAndDecompositionAccess().getAndKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__18846);
            rule__AndDecomposition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndDecomposition__Group__1


    // $ANTLR start rule__AndDecomposition__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4381:1: rule__AndDecomposition__Group__2 : ( ( rule__AndDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__AndDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4385:1: ( ( ( rule__AndDecomposition__SourceAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4386:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4386:1: ( ( rule__AndDecomposition__SourceAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4387:1: ( rule__AndDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4388:1: ( rule__AndDecomposition__SourceAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4388:2: rule__AndDecomposition__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__28874);
            rule__AndDecomposition__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAndDecompositionAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndDecomposition__Group__2


    // $ANTLR start rule__OrDecomposition__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4404:1: rule__OrDecomposition__Group__0 : ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1 ;
    public final void rule__OrDecomposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4408:1: ( ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4409:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) ) rule__OrDecomposition__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4409:1: ( ( rule__OrDecomposition__TargetAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4410:1: ( rule__OrDecomposition__TargetAssignment_0 )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4411:1: ( rule__OrDecomposition__TargetAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4411:2: rule__OrDecomposition__TargetAssignment_0
            {
            pushFollow(FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__08914);
            rule__OrDecomposition__TargetAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrDecompositionAccess().getTargetAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__08923);
            rule__OrDecomposition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrDecomposition__Group__0


    // $ANTLR start rule__OrDecomposition__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4422:1: rule__OrDecomposition__Group__1 : ( '<-(or)-' ) rule__OrDecomposition__Group__2 ;
    public final void rule__OrDecomposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4426:1: ( ( '<-(or)-' ) rule__OrDecomposition__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4427:1: ( '<-(or)-' ) rule__OrDecomposition__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4427:1: ( '<-(or)-' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4428:1: '<-(or)-'
            {
             before(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 
            match(input,48,FOLLOW_48_in_rule__OrDecomposition__Group__18952); 
             after(grammarAccess.getOrDecompositionAccess().getOrKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__18962);
            rule__OrDecomposition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrDecomposition__Group__1


    // $ANTLR start rule__OrDecomposition__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4442:1: rule__OrDecomposition__Group__2 : ( ( rule__OrDecomposition__SourceAssignment_2 ) ) ;
    public final void rule__OrDecomposition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4446:1: ( ( ( rule__OrDecomposition__SourceAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4447:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4447:1: ( ( rule__OrDecomposition__SourceAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4448:1: ( rule__OrDecomposition__SourceAssignment_2 )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4449:1: ( rule__OrDecomposition__SourceAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4449:2: rule__OrDecomposition__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__28990);
            rule__OrDecomposition__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getOrDecompositionAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrDecomposition__Group__2


    // $ANTLR start rule__AndContribution__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4465:1: rule__AndContribution__Group__0 : ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1 ;
    public final void rule__AndContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4469:1: ( ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4470:1: ( ( rule__AndContribution__SourceAssignment_0 ) ) rule__AndContribution__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4470:1: ( ( rule__AndContribution__SourceAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4471:1: ( rule__AndContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4472:1: ( rule__AndContribution__SourceAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4472:2: rule__AndContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__09030);
            rule__AndContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAndContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__09039);
            rule__AndContribution__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndContribution__Group__0


    // $ANTLR start rule__AndContribution__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4483:1: rule__AndContribution__Group__1 : ( '-(and)->' ) rule__AndContribution__Group__2 ;
    public final void rule__AndContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4487:1: ( ( '-(and)->' ) rule__AndContribution__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4488:1: ( '-(and)->' ) rule__AndContribution__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4488:1: ( '-(and)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4489:1: '-(and)->'
            {
             before(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 
            match(input,49,FOLLOW_49_in_rule__AndContribution__Group__19068); 
             after(grammarAccess.getAndContributionAccess().getAndKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__19078);
            rule__AndContribution__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndContribution__Group__1


    // $ANTLR start rule__AndContribution__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4503:1: rule__AndContribution__Group__2 : ( ( rule__AndContribution__TargetAssignment_2 ) ) ;
    public final void rule__AndContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4507:1: ( ( ( rule__AndContribution__TargetAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4508:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4508:1: ( ( rule__AndContribution__TargetAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4509:1: ( rule__AndContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getAndContributionAccess().getTargetAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4510:1: ( rule__AndContribution__TargetAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4510:2: rule__AndContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__29106);
            rule__AndContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAndContributionAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndContribution__Group__2


    // $ANTLR start rule__OrContribution__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4526:1: rule__OrContribution__Group__0 : ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1 ;
    public final void rule__OrContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4530:1: ( ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4531:1: ( ( rule__OrContribution__SourceAssignment_0 ) ) rule__OrContribution__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4531:1: ( ( rule__OrContribution__SourceAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4532:1: ( rule__OrContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4533:1: ( rule__OrContribution__SourceAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4533:2: rule__OrContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__09146);
            rule__OrContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getOrContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__09155);
            rule__OrContribution__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrContribution__Group__0


    // $ANTLR start rule__OrContribution__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4544:1: rule__OrContribution__Group__1 : ( '-(or)->' ) rule__OrContribution__Group__2 ;
    public final void rule__OrContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4548:1: ( ( '-(or)->' ) rule__OrContribution__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4549:1: ( '-(or)->' ) rule__OrContribution__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4549:1: ( '-(or)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4550:1: '-(or)->'
            {
             before(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 
            match(input,50,FOLLOW_50_in_rule__OrContribution__Group__19184); 
             after(grammarAccess.getOrContributionAccess().getOrKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__19194);
            rule__OrContribution__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrContribution__Group__1


    // $ANTLR start rule__OrContribution__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4564:1: rule__OrContribution__Group__2 : ( ( rule__OrContribution__TargetAssignment_2 ) ) ;
    public final void rule__OrContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4568:1: ( ( ( rule__OrContribution__TargetAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4569:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4569:1: ( ( rule__OrContribution__TargetAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4570:1: ( rule__OrContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getOrContributionAccess().getTargetAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4571:1: ( rule__OrContribution__TargetAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4571:2: rule__OrContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__29222);
            rule__OrContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getOrContributionAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrContribution__Group__2


    // $ANTLR start rule__HelpContribution__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4587:1: rule__HelpContribution__Group__0 : ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1 ;
    public final void rule__HelpContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4591:1: ( ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4592:1: ( ( rule__HelpContribution__SourceAssignment_0 ) ) rule__HelpContribution__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4592:1: ( ( rule__HelpContribution__SourceAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4593:1: ( rule__HelpContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4594:1: ( rule__HelpContribution__SourceAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4594:2: rule__HelpContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__09262);
            rule__HelpContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHelpContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__09271);
            rule__HelpContribution__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HelpContribution__Group__0


    // $ANTLR start rule__HelpContribution__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4605:1: rule__HelpContribution__Group__1 : ( '-(+)->' ) rule__HelpContribution__Group__2 ;
    public final void rule__HelpContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4609:1: ( ( '-(+)->' ) rule__HelpContribution__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4610:1: ( '-(+)->' ) rule__HelpContribution__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4610:1: ( '-(+)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4611:1: '-(+)->'
            {
             before(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,51,FOLLOW_51_in_rule__HelpContribution__Group__19300); 
             after(grammarAccess.getHelpContributionAccess().getHyphenMinusLeftParenthesisPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__19310);
            rule__HelpContribution__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HelpContribution__Group__1


    // $ANTLR start rule__HelpContribution__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4625:1: rule__HelpContribution__Group__2 : ( ( rule__HelpContribution__TargetAssignment_2 ) ) ;
    public final void rule__HelpContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4629:1: ( ( ( rule__HelpContribution__TargetAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4630:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4630:1: ( ( rule__HelpContribution__TargetAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4631:1: ( rule__HelpContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4632:1: ( rule__HelpContribution__TargetAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4632:2: rule__HelpContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__29338);
            rule__HelpContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHelpContributionAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HelpContribution__Group__2


    // $ANTLR start rule__MakeContribution__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4648:1: rule__MakeContribution__Group__0 : ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1 ;
    public final void rule__MakeContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4652:1: ( ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4653:1: ( ( rule__MakeContribution__SourceAssignment_0 ) ) rule__MakeContribution__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4653:1: ( ( rule__MakeContribution__SourceAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4654:1: ( rule__MakeContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4655:1: ( rule__MakeContribution__SourceAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4655:2: rule__MakeContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__09378);
            rule__MakeContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getMakeContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__09387);
            rule__MakeContribution__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MakeContribution__Group__0


    // $ANTLR start rule__MakeContribution__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4666:1: rule__MakeContribution__Group__1 : ( '-(++)->' ) rule__MakeContribution__Group__2 ;
    public final void rule__MakeContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4670:1: ( ( '-(++)->' ) rule__MakeContribution__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4671:1: ( '-(++)->' ) rule__MakeContribution__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4671:1: ( '-(++)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4672:1: '-(++)->'
            {
             before(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,52,FOLLOW_52_in_rule__MakeContribution__Group__19416); 
             after(grammarAccess.getMakeContributionAccess().getHyphenMinusLeftParenthesisPlusSignPlusSignRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__19426);
            rule__MakeContribution__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MakeContribution__Group__1


    // $ANTLR start rule__MakeContribution__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4686:1: rule__MakeContribution__Group__2 : ( ( rule__MakeContribution__TargetAssignment_2 ) ) ;
    public final void rule__MakeContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4690:1: ( ( ( rule__MakeContribution__TargetAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4691:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4691:1: ( ( rule__MakeContribution__TargetAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4692:1: ( rule__MakeContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4693:1: ( rule__MakeContribution__TargetAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4693:2: rule__MakeContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__29454);
            rule__MakeContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getMakeContributionAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MakeContribution__Group__2


    // $ANTLR start rule__HurtContribution__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4709:1: rule__HurtContribution__Group__0 : ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1 ;
    public final void rule__HurtContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4713:1: ( ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4714:1: ( ( rule__HurtContribution__SourceAssignment_0 ) ) rule__HurtContribution__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4714:1: ( ( rule__HurtContribution__SourceAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4715:1: ( rule__HurtContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4716:1: ( rule__HurtContribution__SourceAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4716:2: rule__HurtContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__09494);
            rule__HurtContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getHurtContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__09503);
            rule__HurtContribution__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HurtContribution__Group__0


    // $ANTLR start rule__HurtContribution__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4727:1: rule__HurtContribution__Group__1 : ( '-(-)->' ) rule__HurtContribution__Group__2 ;
    public final void rule__HurtContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4731:1: ( ( '-(-)->' ) rule__HurtContribution__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4732:1: ( '-(-)->' ) rule__HurtContribution__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4732:1: ( '-(-)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4733:1: '-(-)->'
            {
             before(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,53,FOLLOW_53_in_rule__HurtContribution__Group__19532); 
             after(grammarAccess.getHurtContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__19542);
            rule__HurtContribution__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HurtContribution__Group__1


    // $ANTLR start rule__HurtContribution__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4747:1: rule__HurtContribution__Group__2 : ( ( rule__HurtContribution__TargetAssignment_2 ) ) ;
    public final void rule__HurtContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4751:1: ( ( ( rule__HurtContribution__TargetAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4752:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4752:1: ( ( rule__HurtContribution__TargetAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4753:1: ( rule__HurtContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4754:1: ( rule__HurtContribution__TargetAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4754:2: rule__HurtContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__29570);
            rule__HurtContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHurtContributionAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HurtContribution__Group__2


    // $ANTLR start rule__BreakContribution__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4770:1: rule__BreakContribution__Group__0 : ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1 ;
    public final void rule__BreakContribution__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4774:1: ( ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4775:1: ( ( rule__BreakContribution__SourceAssignment_0 ) ) rule__BreakContribution__Group__1
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4775:1: ( ( rule__BreakContribution__SourceAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4776:1: ( rule__BreakContribution__SourceAssignment_0 )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4777:1: ( rule__BreakContribution__SourceAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4777:2: rule__BreakContribution__SourceAssignment_0
            {
            pushFollow(FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__09610);
            rule__BreakContribution__SourceAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getBreakContributionAccess().getSourceAssignment_0()); 

            }

            pushFollow(FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__09619);
            rule__BreakContribution__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BreakContribution__Group__0


    // $ANTLR start rule__BreakContribution__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4788:1: rule__BreakContribution__Group__1 : ( '-(--)->' ) rule__BreakContribution__Group__2 ;
    public final void rule__BreakContribution__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4792:1: ( ( '-(--)->' ) rule__BreakContribution__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4793:1: ( '-(--)->' ) rule__BreakContribution__Group__2
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4793:1: ( '-(--)->' )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4794:1: '-(--)->'
            {
             before(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,54,FOLLOW_54_in_rule__BreakContribution__Group__19648); 
             after(grammarAccess.getBreakContributionAccess().getHyphenMinusLeftParenthesisHyphenMinusHyphenMinusRightParenthesisHyphenMinusGreaterThanSignKeyword_1()); 

            }

            pushFollow(FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__19658);
            rule__BreakContribution__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BreakContribution__Group__1


    // $ANTLR start rule__BreakContribution__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4808:1: rule__BreakContribution__Group__2 : ( ( rule__BreakContribution__TargetAssignment_2 ) ) ;
    public final void rule__BreakContribution__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4812:1: ( ( ( rule__BreakContribution__TargetAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4813:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4813:1: ( ( rule__BreakContribution__TargetAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4814:1: ( rule__BreakContribution__TargetAssignment_2 )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4815:1: ( rule__BreakContribution__TargetAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4815:2: rule__BreakContribution__TargetAssignment_2
            {
            pushFollow(FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__29686);
            rule__BreakContribution__TargetAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getBreakContributionAccess().getTargetAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BreakContribution__Group__2


    // $ANTLR start rule__Knowledge__ImportsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4831:1: rule__Knowledge__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Knowledge__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4835:1: ( ( ruleImport ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4836:1: ( ruleImport )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4836:1: ( ruleImport )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4837:1: ruleImport
            {
             before(grammarAccess.getKnowledgeAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Knowledge__ImportsAssignment_09726);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4846:1: rule__Knowledge__EntitiesAssignment_1 : ( ruleEntity ) ;
    public final void rule__Knowledge__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4850:1: ( ( ruleEntity ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4851:1: ( ruleEntity )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4851:1: ( ruleEntity )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4852:1: ruleEntity
            {
             before(grammarAccess.getKnowledgeAccess().getEntitiesEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Knowledge__EntitiesAssignment_19757);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4861:1: rule__Knowledge__RulesAssignment_2_0 : ( ruleRule ) ;
    public final void rule__Knowledge__RulesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4865:1: ( ( ruleRule ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4866:1: ( ruleRule )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4866:1: ( ruleRule )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4867:1: ruleRule
            {
             before(grammarAccess.getKnowledgeAccess().getRulesRuleParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Knowledge__RulesAssignment_2_09788);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4876:1: rule__Knowledge__VarsAssignment_3 : ( ruleVar ) ;
    public final void rule__Knowledge__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4880:1: ( ( ruleVar ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4881:1: ( ruleVar )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4881:1: ( ruleVar )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4882:1: ruleVar
            {
             before(grammarAccess.getKnowledgeAccess().getVarsVarParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__Knowledge__VarsAssignment_39819);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4891:1: rule__Rule__DeclAssignment_0 : ( ruleVarDecl ) ;
    public final void rule__Rule__DeclAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4895:1: ( ( ruleVarDecl ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4896:1: ( ruleVarDecl )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4896:1: ( ruleVarDecl )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4897:1: ruleVarDecl
            {
             before(grammarAccess.getRuleAccess().getDeclVarDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVarDecl_in_rule__Rule__DeclAssignment_09850);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4906:1: rule__Rule__ExprAssignment_1 : ( ruleBoolExpr ) ;
    public final void rule__Rule__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4910:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4911:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4911:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4912:1: ruleBoolExpr
            {
             before(grammarAccess.getRuleAccess().getExprBoolExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__Rule__ExprAssignment_19881);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4921:1: rule__VarDecl__VarsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4925:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4926:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4926:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4927:1: ( RULE_ID )
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4928:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4929:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_19916); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4940:1: rule__VarDecl__VarsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__VarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4944:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4945:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4945:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4946:1: ( RULE_ID )
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4947:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4948:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_2_19955); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4959:1: rule__IntTerm__ConstAssignment_0 : ( RULE_INT ) ;
    public final void rule__IntTerm__ConstAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4963:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4964:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4964:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4965:1: RULE_INT
            {
             before(grammarAccess.getIntTermAccess().getConstINTTerminalRuleCall_0_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__IntTerm__ConstAssignment_09990); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4974:1: rule__IntTerm__VarAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__IntTerm__VarAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4978:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4979:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4979:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4980:1: ( RULE_ID )
            {
             before(grammarAccess.getIntTermAccess().getVarVarCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4981:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4982:1: RULE_ID
            {
             before(grammarAccess.getIntTermAccess().getVarVarIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__IntTerm__VarAssignment_110025); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4993:1: rule__BinaryIntExpr__OprAssignment_0 : ( ruleIntTerm ) ;
    public final void rule__BinaryIntExpr__OprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4997:1: ( ( ruleIntTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4998:1: ( ruleIntTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4998:1: ( ruleIntTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:4999:1: ruleIntTerm
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_010060);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5008:1: rule__BinaryIntExpr__BinaryopAssignment_1 : ( ruleBinaryIntOp ) ;
    public final void rule__BinaryIntExpr__BinaryopAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5012:1: ( ( ruleBinaryIntOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5013:1: ( ruleBinaryIntOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5013:1: ( ruleBinaryIntOp )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5014:1: ruleBinaryIntOp
            {
             before(grammarAccess.getBinaryIntExprAccess().getBinaryopBinaryIntOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryIntOp_in_rule__BinaryIntExpr__BinaryopAssignment_110091);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5023:1: rule__BinaryIntExpr__OprAssignment_2 : ( ruleIntTerm ) ;
    public final void rule__BinaryIntExpr__OprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5027:1: ( ( ruleIntTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5028:1: ( ruleIntTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5028:1: ( ruleIntTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5029:1: ruleIntTerm
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_210122);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5038:1: rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 : ( ruleUnaryBoolOp ) ;
    public final void rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5042:1: ( ( ruleUnaryBoolOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5043:1: ( ruleUnaryBoolOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5043:1: ( ruleUnaryBoolOp )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5044:1: ruleUnaryBoolOp
            {
             before(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsUnaryBoolOpEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleUnaryBoolOp_in_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_010153);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5053:1: rule__UnaryBoolExpr__OprAssignment_0_1 : ( ruleBoolExpr ) ;
    public final void rule__UnaryBoolExpr__OprAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5057:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5058:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5058:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5059:1: ruleBoolExpr
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOprBoolExprParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OprAssignment_0_110184);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5068:1: rule__UnaryBoolExpr__OpsAssignment_1_1 : ( ruleBoolExpr ) ;
    public final void rule__UnaryBoolExpr__OpsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5072:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5073:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5073:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5074:1: ruleBoolExpr
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOpsBoolExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OpsAssignment_1_110215);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5083:1: rule__BinaryBoolExpr__OprAssignment_0 : ( ruleTemporalPredicate ) ;
    public final void rule__BinaryBoolExpr__OprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5087:1: ( ( ruleTemporalPredicate ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5088:1: ( ruleTemporalPredicate )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5088:1: ( ruleTemporalPredicate )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5089:1: ruleTemporalPredicate
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprTemporalPredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTemporalPredicate_in_rule__BinaryBoolExpr__OprAssignment_010246);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5098:1: rule__BinaryBoolExpr__BinaryopAssignment_1 : ( ruleBinaryBoolOp ) ;
    public final void rule__BinaryBoolExpr__BinaryopAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5102:1: ( ( ruleBinaryBoolOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5103:1: ( ruleBinaryBoolOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5103:1: ( ruleBinaryBoolOp )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5104:1: ruleBinaryBoolOp
            {
             before(grammarAccess.getBinaryBoolExprAccess().getBinaryopBinaryBoolOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryBoolOp_in_rule__BinaryBoolExpr__BinaryopAssignment_110277);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5113:1: rule__BinaryBoolExpr__OprAssignment_2 : ( ruleBoolExpr ) ;
    public final void rule__BinaryBoolExpr__OprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5117:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5118:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5118:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5119:1: ruleBoolExpr
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprBoolExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__BinaryBoolExpr__OprAssignment_210308);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5128:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5132:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5133:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5133:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5134:1: RULE_ID
            {
             before(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_110339); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5143:1: rule__Import__PathAssignment_1 : ( rulePath ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5147:1: ( ( rulePath ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5148:1: ( rulePath )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5148:1: ( rulePath )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5149:1: rulePath
            {
             before(grammarAccess.getImportAccess().getPathPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePath_in_rule__Import__PathAssignment_110370);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5158:1: rule__Var__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5162:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5163:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5163:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5164:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__NameAssignment_110401); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5173:1: rule__Var__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__Var__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5177:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5178:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5178:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5179:1: RULE_INT
            {
             before(grammarAccess.getVarAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Var__MinAssignment_210432); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5188:1: rule__Var__MaxAssignment_3 : ( RULE_INT ) ;
    public final void rule__Var__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5192:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5193:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5193:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5194:1: RULE_INT
            {
             before(grammarAccess.getVarAccess().getMaxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Var__MaxAssignment_310463); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5203:1: rule__Fluent__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__Fluent__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5207:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5208:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5208:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5209:1: ruleTerm
            {
             before(grammarAccess.getFluentAccess().getTermTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Fluent__TermAssignment_110494);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5218:1: rule__Event__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__Event__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5222:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5223:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5223:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5224:1: ruleTerm
            {
             before(grammarAccess.getEventAccess().getTermTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Event__TermAssignment_110525);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5233:1: rule__Term__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Term__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5237:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5238:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5238:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5239:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__NameAssignment_010556); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5248:1: rule__Term__ArgsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Term__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5252:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5253:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5253:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5254:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_110587); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5263:1: rule__Term__ArgsAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__Term__ArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5267:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5268:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5268:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5269:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_2_110618); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5278:1: rule__HoldsAt__FluentAssignment_2 : ( ruleTerm ) ;
    public final void rule__HoldsAt__FluentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5282:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5283:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5283:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5284:1: ruleTerm
            {
             before(grammarAccess.getHoldsAtAccess().getFluentTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__HoldsAt__FluentAssignment_210649);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5293:1: rule__HoldsAt__TimeAssignment_4 : ( ruleIntExpr ) ;
    public final void rule__HoldsAt__TimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5297:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5298:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5298:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5299:1: ruleIntExpr
            {
             before(grammarAccess.getHoldsAtAccess().getTimeIntExprParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__HoldsAt__TimeAssignment_410680);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5308:1: rule__Happens__EventAssignment_2 : ( ruleTerm ) ;
    public final void rule__Happens__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5312:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5313:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5313:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5314:1: ruleTerm
            {
             before(grammarAccess.getHappensAccess().getEventTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Happens__EventAssignment_210711);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5323:1: rule__Happens__TimeAssignment_4 : ( ruleIntExpr ) ;
    public final void rule__Happens__TimeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5327:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5328:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5328:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5329:1: ruleIntExpr
            {
             before(grammarAccess.getHappensAccess().getTimeIntExprParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Happens__TimeAssignment_410742);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5338:1: rule__Initiates__EventAssignment_2 : ( ruleTerm ) ;
    public final void rule__Initiates__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5342:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5343:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5343:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5344:1: ruleTerm
            {
             before(grammarAccess.getInitiatesAccess().getEventTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Initiates__EventAssignment_210773);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5353:1: rule__Initiates__FluentAssignment_4 : ( ruleTerm ) ;
    public final void rule__Initiates__FluentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5357:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5358:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5358:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5359:1: ruleTerm
            {
             before(grammarAccess.getInitiatesAccess().getFluentTermParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Initiates__FluentAssignment_410804);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5368:1: rule__Initiates__TimeAssignment_6 : ( ruleIntExpr ) ;
    public final void rule__Initiates__TimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5372:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5373:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5373:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5374:1: ruleIntExpr
            {
             before(grammarAccess.getInitiatesAccess().getTimeIntExprParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Initiates__TimeAssignment_610835);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5383:1: rule__Terminates__EventAssignment_2 : ( ruleTerm ) ;
    public final void rule__Terminates__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5387:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5388:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5388:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5389:1: ruleTerm
            {
             before(grammarAccess.getTerminatesAccess().getEventTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Terminates__EventAssignment_210866);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5398:1: rule__Terminates__FluentAssignment_4 : ( ruleTerm ) ;
    public final void rule__Terminates__FluentAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5402:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5403:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5403:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5404:1: ruleTerm
            {
             before(grammarAccess.getTerminatesAccess().getFluentTermParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Terminates__FluentAssignment_410897);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5413:1: rule__Terminates__TimeAssignment_6 : ( ruleIntExpr ) ;
    public final void rule__Terminates__TimeAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5417:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5418:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5418:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5419:1: ruleIntExpr
            {
             before(grammarAccess.getTerminatesAccess().getTimeIntExprParserRuleCall_6_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Terminates__TimeAssignment_610928);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5428:1: rule__Path__FileAssignment_0 : ( ruleFile ) ;
    public final void rule__Path__FileAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5432:1: ( ( ruleFile ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5433:1: ( ruleFile )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5433:1: ( ruleFile )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5434:1: ruleFile
            {
             before(grammarAccess.getPathAccess().getFileFileParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFile_in_rule__Path__FileAssignment_010959);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5443:1: rule__Path__FileAssignment_1_1 : ( ruleFile ) ;
    public final void rule__Path__FileAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5447:1: ( ( ruleFile ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5448:1: ( ruleFile )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5448:1: ( ruleFile )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5449:1: ruleFile
            {
             before(grammarAccess.getPathAccess().getFileFileParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFile_in_rule__Path__FileAssignment_1_110990);
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5458:1: rule__File__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__File__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5462:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5463:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5463:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5464:1: RULE_ID
            {
             before(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__File__NameAssignment_011021); 
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
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5473:1: rule__File__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__File__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5477:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5478:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5478:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5479:1: RULE_ID
            {
             before(grammarAccess.getFileAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__File__NameAssignment_1_111052); 
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


    // $ANTLR start rule__Actor__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5495:1: rule__Actor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5499:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5500:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5500:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5501:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_111090); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__NameAssignment_1


    // $ANTLR start rule__Actor__Is_aAssignment_2_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5510:1: rule__Actor__Is_aAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_aAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5514:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5515:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5515:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5516:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5517:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5518:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_aActorIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_011125); 
             after(grammarAccess.getActorAccess().getIs_aActorIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getActorAccess().getIs_aActorCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Is_aAssignment_2_0


    // $ANTLR start rule__Actor__Is_part_ofAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5529:1: rule__Actor__Is_part_ofAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Actor__Is_part_ofAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5533:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5534:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5534:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5535:1: ( RULE_ID )
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5536:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5537:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getIs_part_ofActorIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_111164); 
             after(grammarAccess.getActorAccess().getIs_part_ofActorIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getActorAccess().getIs_part_ofActorCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Is_part_ofAssignment_2_1


    // $ANTLR start rule__Actor__IntentionsAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5548:1: rule__Actor__IntentionsAssignment_3_1 : ( ruleIntention ) ;
    public final void rule__Actor__IntentionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5552:1: ( ( ruleIntention ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5553:1: ( ruleIntention )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5553:1: ( ruleIntention )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5554:1: ruleIntention
            {
             before(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_111199);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getActorAccess().getIntentionsIntentionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__IntentionsAssignment_3_1


    // $ANTLR start rule__Agent__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5563:1: rule__Agent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Agent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5567:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5568:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5568:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5569:1: RULE_ID
            {
             before(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_111230); 
             after(grammarAccess.getAgentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Agent__NameAssignment_1


    // $ANTLR start rule__Agent__IntentionsAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5578:1: rule__Agent__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Agent__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5582:1: ( ( ruleIntention ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5583:1: ( ruleIntention )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5583:1: ( ruleIntention )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5584:1: ruleIntention
            {
             before(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_111261);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getAgentAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Agent__IntentionsAssignment_2_1


    // $ANTLR start rule__Role__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5593:1: rule__Role__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Role__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5597:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5598:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5598:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5599:1: RULE_ID
            {
             before(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Role__NameAssignment_111292); 
             after(grammarAccess.getRoleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__NameAssignment_1


    // $ANTLR start rule__Role__IntentionsAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5608:1: rule__Role__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Role__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5612:1: ( ( ruleIntention ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5613:1: ( ruleIntention )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5613:1: ( ruleIntention )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5614:1: ruleIntention
            {
             before(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_111323);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getRoleAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Role__IntentionsAssignment_2_1


    // $ANTLR start rule__Position__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5623:1: rule__Position__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Position__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5627:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5628:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5628:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5629:1: RULE_ID
            {
             before(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Position__NameAssignment_111354); 
             after(grammarAccess.getPositionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Position__NameAssignment_1


    // $ANTLR start rule__Position__IntentionsAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5638:1: rule__Position__IntentionsAssignment_2_1 : ( ruleIntention ) ;
    public final void rule__Position__IntentionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5642:1: ( ( ruleIntention ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5643:1: ( ruleIntention )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5643:1: ( ruleIntention )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5644:1: ruleIntention
            {
             before(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_111385);
            ruleIntention();
            _fsp--;

             after(grammarAccess.getPositionAccess().getIntentionsIntentionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Position__IntentionsAssignment_2_1


    // $ANTLR start rule__Goal__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5653:1: rule__Goal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5657:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5658:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5658:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5659:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_111416); 
             after(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__NameAssignment_1


    // $ANTLR start rule__Goal__DecompositionsAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5668:1: rule__Goal__DecompositionsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Goal__DecompositionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5672:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5673:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5673:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5674:1: ( RULE_ID )
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5675:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5676:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getDecompositionsDecompositionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_111451); 
             after(grammarAccess.getGoalAccess().getDecompositionsDecompositionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getGoalAccess().getDecompositionsDecompositionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__DecompositionsAssignment_2_1


    // $ANTLR start rule__Softgoal__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5687:1: rule__Softgoal__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Softgoal__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5691:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5692:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5692:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5693:1: RULE_ID
            {
             before(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_111486); 
             after(grammarAccess.getSoftgoalAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Softgoal__NameAssignment_1


    // $ANTLR start rule__Task__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5702:1: rule__Task__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Task__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5706:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5707:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5707:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5708:1: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Task__NameAssignment_111517); 
             after(grammarAccess.getTaskAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Task__NameAssignment_1


    // $ANTLR start rule__Resource__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5717:1: rule__Resource__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5721:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5722:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5722:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5723:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_111548); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__NameAssignment_1


    // $ANTLR start rule__Belief__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5732:1: rule__Belief__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Belief__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5736:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5737:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5737:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5738:1: RULE_ID
            {
             before(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_111579); 
             after(grammarAccess.getBeliefAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Belief__NameAssignment_1


    // $ANTLR start rule__Association__SourceAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5747:1: rule__Association__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Association__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5751:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5752:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5752:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5753:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5754:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5755:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getSourceContainerIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_011614); 
             after(grammarAccess.getAssociationAccess().getSourceContainerIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getSourceContainerCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__SourceAssignment_0


    // $ANTLR start rule__Association__TargetAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5766:1: rule__Association__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Association__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5770:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5771:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5771:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5772:1: ( RULE_ID )
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5773:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5774:1: RULE_ID
            {
             before(grammarAccess.getAssociationAccess().getTargetContainerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_211653); 
             after(grammarAccess.getAssociationAccess().getTargetContainerIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAssociationAccess().getTargetContainerCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Association__TargetAssignment_2


    // $ANTLR start rule__Dependency__DependencyFromAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5785:1: rule__Dependency__DependencyFromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyFromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5789:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5790:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5790:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5791:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5792:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5793:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyFromDependableIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_011692); 
             after(grammarAccess.getDependencyAccess().getDependencyFromDependableIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getDependencyFromDependableCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__DependencyFromAssignment_0


    // $ANTLR start rule__Dependency__DependencyToAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5804:1: rule__Dependency__DependencyToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Dependency__DependencyToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5808:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5809:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5809:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5810:1: ( RULE_ID )
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5811:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5812:1: RULE_ID
            {
             before(grammarAccess.getDependencyAccess().getDependencyToDependableIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_211731); 
             after(grammarAccess.getDependencyAccess().getDependencyToDependableIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDependencyAccess().getDependencyToDependableCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Dependency__DependencyToAssignment_2


    // $ANTLR start rule__AndDecomposition__TargetAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5823:1: rule__AndDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5827:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5828:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5828:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5829:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5830:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5831:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_011770); 
             after(grammarAccess.getAndDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAndDecompositionAccess().getTargetIntentionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndDecomposition__TargetAssignment_0


    // $ANTLR start rule__AndDecomposition__SourceAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5842:1: rule__AndDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5846:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5847:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5847:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5848:1: ( RULE_ID )
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5849:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5850:1: RULE_ID
            {
             before(grammarAccess.getAndDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_211809); 
             after(grammarAccess.getAndDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAndDecompositionAccess().getSourceIntentionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndDecomposition__SourceAssignment_2


    // $ANTLR start rule__OrDecomposition__TargetAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5861:1: rule__OrDecomposition__TargetAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__TargetAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5865:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5866:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5866:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5867:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5868:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5869:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_011848); 
             after(grammarAccess.getOrDecompositionAccess().getTargetIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOrDecompositionAccess().getTargetIntentionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrDecomposition__TargetAssignment_0


    // $ANTLR start rule__OrDecomposition__SourceAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5880:1: rule__OrDecomposition__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrDecomposition__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5884:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5885:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5885:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5886:1: ( RULE_ID )
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5887:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5888:1: RULE_ID
            {
             before(grammarAccess.getOrDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_211887); 
             after(grammarAccess.getOrDecompositionAccess().getSourceIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getOrDecompositionAccess().getSourceIntentionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrDecomposition__SourceAssignment_2


    // $ANTLR start rule__AndContribution__SourceAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5899:1: rule__AndContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5903:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5904:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5904:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5905:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5906:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5907:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_011926); 
             after(grammarAccess.getAndContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAndContributionAccess().getSourceIntentionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndContribution__SourceAssignment_0


    // $ANTLR start rule__AndContribution__TargetAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5918:1: rule__AndContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__AndContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5922:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5923:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5923:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5924:1: ( RULE_ID )
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5925:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5926:1: RULE_ID
            {
             before(grammarAccess.getAndContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_211965); 
             after(grammarAccess.getAndContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAndContributionAccess().getTargetIntentionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndContribution__TargetAssignment_2


    // $ANTLR start rule__OrContribution__SourceAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5937:1: rule__OrContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5941:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5942:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5942:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5943:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5944:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5945:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_012004); 
             after(grammarAccess.getOrContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getOrContributionAccess().getSourceIntentionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrContribution__SourceAssignment_0


    // $ANTLR start rule__OrContribution__TargetAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5956:1: rule__OrContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__OrContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5960:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5961:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5961:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5962:1: ( RULE_ID )
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5963:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5964:1: RULE_ID
            {
             before(grammarAccess.getOrContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_212043); 
             after(grammarAccess.getOrContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getOrContributionAccess().getTargetIntentionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrContribution__TargetAssignment_2


    // $ANTLR start rule__HelpContribution__SourceAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5975:1: rule__HelpContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5979:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5980:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5980:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5981:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5982:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5983:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_012082); 
             after(grammarAccess.getHelpContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getHelpContributionAccess().getSourceIntentionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HelpContribution__SourceAssignment_0


    // $ANTLR start rule__HelpContribution__TargetAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5994:1: rule__HelpContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HelpContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5998:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5999:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:5999:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6000:1: ( RULE_ID )
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6001:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6002:1: RULE_ID
            {
             before(grammarAccess.getHelpContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_212121); 
             after(grammarAccess.getHelpContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getHelpContributionAccess().getTargetIntentionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HelpContribution__TargetAssignment_2


    // $ANTLR start rule__MakeContribution__SourceAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6013:1: rule__MakeContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6017:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6018:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6018:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6019:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6020:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6021:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_012160); 
             after(grammarAccess.getMakeContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getMakeContributionAccess().getSourceIntentionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MakeContribution__SourceAssignment_0


    // $ANTLR start rule__MakeContribution__TargetAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6032:1: rule__MakeContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MakeContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6036:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6037:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6037:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6038:1: ( RULE_ID )
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6039:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6040:1: RULE_ID
            {
             before(grammarAccess.getMakeContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_212199); 
             after(grammarAccess.getMakeContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMakeContributionAccess().getTargetIntentionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__MakeContribution__TargetAssignment_2


    // $ANTLR start rule__HurtContribution__SourceAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6051:1: rule__HurtContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6055:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6056:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6056:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6057:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6058:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6059:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_012238); 
             after(grammarAccess.getHurtContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getHurtContributionAccess().getSourceIntentionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HurtContribution__SourceAssignment_0


    // $ANTLR start rule__HurtContribution__TargetAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6070:1: rule__HurtContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HurtContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6074:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6075:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6075:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6076:1: ( RULE_ID )
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6077:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6078:1: RULE_ID
            {
             before(grammarAccess.getHurtContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_212277); 
             after(grammarAccess.getHurtContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getHurtContributionAccess().getTargetIntentionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HurtContribution__TargetAssignment_2


    // $ANTLR start rule__BreakContribution__SourceAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6089:1: rule__BreakContribution__SourceAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__SourceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6093:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6094:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6094:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6095:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6096:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6097:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_012316); 
             after(grammarAccess.getBreakContributionAccess().getSourceIntentionIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getBreakContributionAccess().getSourceIntentionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BreakContribution__SourceAssignment_0


    // $ANTLR start rule__BreakContribution__TargetAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6108:1: rule__BreakContribution__TargetAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__BreakContribution__TargetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6112:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6113:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6113:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6114:1: ( RULE_ID )
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6115:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/contentassist/antlr/internal/InternalEventCalculus.g:6116:1: RULE_ID
            {
             before(grammarAccess.getBreakContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_212355); 
             after(grammarAccess.getBreakContributionAccess().getTargetIntentionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getBreakContributionAccess().getTargetIntentionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BreakContribution__TargetAssignment_2


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\122\uffff";
    static final String DFA4_eofS =
        "\51\uffff\1\67\5\uffff\1\67\31\uffff\1\67\1\uffff\1\67\6\uffff";
    static final String DFA4_minS =
        "\1\13\4\26\1\uffff\4\4\4\25\10\4\1\25\1\4\1\25\2\14\1\25\1\4\1\25"+
        "\2\14\1\25\1\4\3\25\1\4\3\25\1\16\2\4\1\25\2\4\1\16\1\25\2\4\1\25"+
        "\2\4\2\uffff\4\27\1\25\1\4\1\25\2\14\1\25\1\4\1\25\2\14\1\25\2\4"+
        "\1\16\1\25\1\16\2\4\4\27";
    static final String DFA4_maxS =
        "\1\40\4\26\1\uffff\4\4\4\26\1\27\1\5\1\27\1\5\1\27\1\4\1\27\1\4"+
        "\1\27\1\4\1\25\3\27\1\4\1\25\3\27\1\4\1\25\1\26\1\27\1\4\1\25\1"+
        "\26\2\27\2\5\1\27\2\5\3\27\1\5\2\27\1\5\2\uffff\5\27\1\4\1\25\3"+
        "\27\1\4\1\25\3\27\2\5\3\27\2\5\4\27";
    static final String DFA4_acceptS =
        "\5\uffff\1\2\60\uffff\1\3\1\1\32\uffff";
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
            "\4\66\1\67\4\uffff\1\67",
            "\1\71\1\70",
            "\1\71\1\70",
            "\1\34\1\uffff\1\35",
            "\1\73\1\72",
            "\1\73\1\72",
            "\4\66\1\67\4\uffff\1\67",
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
            "\1\107\1\110\11\uffff\1\111",
            "\1\107\1\110\11\uffff\1\111",
            "\1\102\1\uffff\1\103",
            "\1\112",
            "\1\65",
            "\1\114\1\115\11\uffff\1\113",
            "\1\114\1\115\11\uffff\1\113",
            "\1\75\1\uffff\1\76",
            "\1\117\1\116",
            "\1\117\1\116",
            "\4\66\1\67\4\uffff\1\67",
            "\1\102\1\uffff\1\103",
            "\4\66\1\67\4\uffff\1\67",
            "\1\121\1\120",
            "\1\121\1\120",
            "\1\111",
            "\1\111",
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
            return "1444:1: rule__BoolExpr__Alternatives : ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) );";
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
    public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer1442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContainer1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Container__Alternatives_in_ruleContainer1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__0_in_ruleActor1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_entryRuleAgent1562 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAgent1569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__0_in_ruleAgent1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_entryRuleRole1622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRole1629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group__0_in_ruleRole1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_entryRulePosition1682 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePosition1689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__Group__0_in_rulePosition1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_entryRuleIntention1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntention1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Intention__Alternatives_in_ruleIntention1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__0_in_ruleGoal1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_entryRuleSoftgoal1862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftgoal1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Softgoal__Group__0_in_ruleSoftgoal1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_entryRuleTask1922 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTask1929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__Group__0_in_ruleTask1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_entryRuleBelief2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBelief2049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__Group__0_in_ruleBelief2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssociation_in_entryRuleAssociation2106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssociation2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__Group__0_in_ruleAssociation2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency2166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Group__0_in_ruleDependency2200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposition_in_entryRuleDecomposition2226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposition2233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposition__Alternatives_in_ruleDecomposition2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_entryRuleAndDecomposition2286 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndDecomposition2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__0_in_ruleAndDecomposition2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_entryRuleOrDecomposition2346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrDecomposition2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__0_in_ruleOrDecomposition2380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContribution_in_entryRuleContribution2406 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContribution2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contribution__Alternatives_in_ruleContribution2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_entryRuleAndContribution2466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndContribution2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__0_in_ruleAndContribution2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_entryRuleOrContribution2526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrContribution2533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__0_in_ruleOrContribution2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_entryRuleHelpContribution2586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHelpContribution2593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__0_in_ruleHelpContribution2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_entryRuleMakeContribution2646 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMakeContribution2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__0_in_ruleMakeContribution2680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_entryRuleHurtContribution2706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHurtContribution2713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__0_in_ruleHurtContribution2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_entryRuleBreakContribution2766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBreakContribution2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__0_in_ruleBreakContribution2800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntOp__Alternatives_in_ruleBinaryIntOp2837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleUnaryBoolOp2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolOp__Alternatives_in_ruleBinaryBoolOp2912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntTerm__ConstAssignment_0_in_rule__IntTerm__Alternatives2947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntTerm__VarAssignment_1_in_rule__IntTerm__Alternatives2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__IntExpr__Alternatives2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntExpr_in_rule__IntExpr__Alternatives3015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoldsAt_in_rule__TemporalPredicate__Alternatives3047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHappens_in_rule__TemporalPredicate__Alternatives3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitiates_in_rule__TemporalPredicate__Alternatives3081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminates_in_rule__TemporalPredicate__Alternatives3098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_rule__BoolExpr__Alternatives3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolExpr_in_rule__BoolExpr__Alternatives3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_rule__BoolExpr__Alternatives3164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__0_in_rule__UnaryBoolExpr__Alternatives3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__0_in_rule__UnaryBoolExpr__Alternatives3214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Entity__Alternatives3247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Entity__Alternatives3264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSort_in_rule__Entity__Alternatives3281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__Container__Alternatives3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAgent_in_rule__Container__Alternatives3331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRole_in_rule__Container__Alternatives3348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePosition_in_rule__Container__Alternatives3365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Is_aAssignment_2_0_in_rule__Actor__Alternatives_23397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Is_part_ofAssignment_2_1_in_rule__Actor__Alternatives_23415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_rule__Intention__Alternatives3448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftgoal_in_rule__Intention__Alternatives3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTask_in_rule__Intention__Alternatives3482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Intention__Alternatives3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBelief_in_rule__Intention__Alternatives3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndDecomposition_in_rule__Decomposition__Alternatives3550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrDecomposition_in_rule__Decomposition__Alternatives3567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndContribution_in_rule__Contribution__Alternatives3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrContribution_in_rule__Contribution__Alternatives3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHelpContribution_in_rule__Contribution__Alternatives3633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHurtContribution_in_rule__Contribution__Alternatives3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMakeContribution_in_rule__Contribution__Alternatives3667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBreakContribution_in_rule__Contribution__Alternatives3684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BinaryIntOp__Alternatives3717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BinaryIntOp__Alternatives3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BinaryBoolOp__Alternatives3774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BinaryBoolOp__Alternatives3795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BinaryBoolOp__Alternatives3816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BinaryBoolOp__Alternatives3837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__ImportsAssignment_0_in_rule__Knowledge__Group__03874 = new BitSet(new long[]{0x00000001FF480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__1_in_rule__Knowledge__Group__03884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__EntitiesAssignment_1_in_rule__Knowledge__Group__13912 = new BitSet(new long[]{0x00000001FD480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__2_in_rule__Knowledge__Group__13922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__0_in_rule__Knowledge__Group__23950 = new BitSet(new long[]{0x00000001E4480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__3_in_rule__Knowledge__Group__23960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__VarsAssignment_3_in_rule__Knowledge__Group__33988 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Knowledge__RulesAssignment_2_0_in_rule__Knowledge__Group_2__04031 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__1_in_rule__Knowledge__Group_2__04040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Knowledge__Group_2__14069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__DeclAssignment_0_in_rule__Rule__Group__04108 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__04118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ExprAssignment_1_in_rule__Rule__Group__14146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VarDecl__Group__04185 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__04195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__VarsAssignment_1_in_rule__VarDecl__Group__14223 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__14232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__0_in_rule__VarDecl__Group__24260 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__24270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VarDecl__Group__34299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarDecl__Group_2__04343 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__1_in_rule__VarDecl__Group_2__04353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__VarsAssignment_2_1_in_rule__VarDecl__Group_2__14381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__OprAssignment_0_in_rule__BinaryIntExpr__Group__04419 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__1_in_rule__BinaryIntExpr__Group__04428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__BinaryopAssignment_1_in_rule__BinaryIntExpr__Group__14456 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__2_in_rule__BinaryIntExpr__Group__14465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__OprAssignment_2_in_rule__BinaryIntExpr__Group__24493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0_in_rule__UnaryBoolExpr__Group_0__04533 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__1_in_rule__UnaryBoolExpr__Group_0__04542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__OprAssignment_0_1_in_rule__UnaryBoolExpr__Group_0__14570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UnaryBoolExpr__Group_1__04609 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__1_in_rule__UnaryBoolExpr__Group_1__04619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__OpsAssignment_1_1_in_rule__UnaryBoolExpr__Group_1__14647 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__2_in_rule__UnaryBoolExpr__Group_1__14656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UnaryBoolExpr__Group_1__24685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__OprAssignment_0_in_rule__BinaryBoolExpr__Group__04726 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__1_in_rule__BinaryBoolExpr__Group__04735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__BinaryopAssignment_1_in_rule__BinaryBoolExpr__Group__14763 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__2_in_rule__BinaryBoolExpr__Group__14772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__OprAssignment_2_in_rule__BinaryBoolExpr__Group__24800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Sort__Group__04841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__04851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__14879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__04918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__04928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__PathAssignment_1_in_rule__Import__Group__14956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Var__Group__04995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Var__Group__1_in_rule__Var__Group__05005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__NameAssignment_1_in_rule__Var__Group__15033 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Var__Group__2_in_rule__Var__Group__15042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__MinAssignment_2_in_rule__Var__Group__25070 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Var__Group__3_in_rule__Var__Group__25079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__MaxAssignment_3_in_rule__Var__Group__35107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Fluent__Group__05150 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__05160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TermAssignment_1_in_rule__Fluent__Group__15188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Event__Group__05227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__05237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__TermAssignment_1_in_rule__Event__Group__15265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__NameAssignment_0_in_rule__Term__Group__05303 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__05312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__15340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Term__Group_1__05380 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__05390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ArgsAssignment_1_1_in_rule__Term__Group_1__15418 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Term__Group_1__2_in_rule__Term__Group_1__15428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__0_in_rule__Term__Group_1__25456 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Term__Group_1__3_in_rule__Term__Group_1__25466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Term__Group_1__35495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Term__Group_1_2__05539 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__1_in_rule__Term__Group_1_2__05549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ArgsAssignment_1_2_1_in_rule__Term__Group_1_2__15577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__HoldsAt__Group__05616 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__1_in_rule__HoldsAt__Group__05626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HoldsAt__Group__15655 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__2_in_rule__HoldsAt__Group__15665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__FluentAssignment_2_in_rule__HoldsAt__Group__25693 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__3_in_rule__HoldsAt__Group__25702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HoldsAt__Group__35731 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__4_in_rule__HoldsAt__Group__35741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__TimeAssignment_4_in_rule__HoldsAt__Group__45769 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__5_in_rule__HoldsAt__Group__45778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HoldsAt__Group__55807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Happens__Group__05855 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Happens__Group__1_in_rule__Happens__Group__05865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Happens__Group__15894 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Happens__Group__2_in_rule__Happens__Group__15904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__EventAssignment_2_in_rule__Happens__Group__25932 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Happens__Group__3_in_rule__Happens__Group__25941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Happens__Group__35970 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Happens__Group__4_in_rule__Happens__Group__35980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__TimeAssignment_4_in_rule__Happens__Group__46008 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Happens__Group__5_in_rule__Happens__Group__46017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Happens__Group__56046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Initiates__Group__06094 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__1_in_rule__Initiates__Group__06104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Initiates__Group__16133 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group__2_in_rule__Initiates__Group__16143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__EventAssignment_2_in_rule__Initiates__Group__26171 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__3_in_rule__Initiates__Group__26180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group__36209 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group__4_in_rule__Initiates__Group__36219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__FluentAssignment_4_in_rule__Initiates__Group__46247 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__5_in_rule__Initiates__Group__46256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group__56285 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Initiates__Group__6_in_rule__Initiates__Group__56295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__TimeAssignment_6_in_rule__Initiates__Group__66323 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__7_in_rule__Initiates__Group__66332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Initiates__Group__76361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Terminates__Group__06413 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__1_in_rule__Terminates__Group__06423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Terminates__Group__16452 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group__2_in_rule__Terminates__Group__16462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__EventAssignment_2_in_rule__Terminates__Group__26490 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__3_in_rule__Terminates__Group__26499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group__36528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group__4_in_rule__Terminates__Group__36538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__FluentAssignment_4_in_rule__Terminates__Group__46566 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__5_in_rule__Terminates__Group__46575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group__56604 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Terminates__Group__6_in_rule__Terminates__Group__56614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__TimeAssignment_6_in_rule__Terminates__Group__66642 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__7_in_rule__Terminates__Group__66651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Terminates__Group__76680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__FileAssignment_0_in_rule__Path__Group__06731 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__06740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__16768 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_rule__Path__Group_1__06808 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__06818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__FileAssignment_1_1_in_rule__Path__Group_1__16846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NameAssignment_0_in_rule__File__Group__06884 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__06893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_1__0_in_rule__File__Group__16921 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_18_in_rule__File__Group_1__06961 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__File__Group_1__1_in_rule__File__Group_1__06971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NameAssignment_1_1_in_rule__File__Group_1__16999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Actor__Group__07039 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__07049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_1_in_rule__Actor__Group__17077 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__17086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Alternatives_2_in_rule__Actor__Group__27114 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__27124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__37152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Actor__Group_3__07196 = new BitSet(new long[]{0x00001F1000000000L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__07206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__IntentionsAssignment_3_1_in_rule__Actor__Group_3__17234 = new BitSet(new long[]{0x00001F1000000000L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__2_in_rule__Actor__Group_3__17244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Actor__Group_3__27273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Agent__Group__07315 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Agent__Group__1_in_rule__Agent__Group__07325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__NameAssignment_1_in_rule__Agent__Group__17353 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Agent__Group__2_in_rule__Agent__Group__17362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__0_in_rule__Agent__Group__27390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Agent__Group_2__07432 = new BitSet(new long[]{0x00001F1000000000L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__1_in_rule__Agent__Group_2__07442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Agent__IntentionsAssignment_2_1_in_rule__Agent__Group_2__17470 = new BitSet(new long[]{0x00001F1000000000L});
    public static final BitSet FOLLOW_rule__Agent__Group_2__2_in_rule__Agent__Group_2__17480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Agent__Group_2__27509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Role__Group__07551 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Role__Group__1_in_rule__Role__Group__07561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__NameAssignment_1_in_rule__Role__Group__17589 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Role__Group__2_in_rule__Role__Group__17598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__Group_2__0_in_rule__Role__Group__27626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Role__Group_2__07668 = new BitSet(new long[]{0x00001F1000000000L});
    public static final BitSet FOLLOW_rule__Role__Group_2__1_in_rule__Role__Group_2__07678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Role__IntentionsAssignment_2_1_in_rule__Role__Group_2__17706 = new BitSet(new long[]{0x00001F1000000000L});
    public static final BitSet FOLLOW_rule__Role__Group_2__2_in_rule__Role__Group_2__17716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Role__Group_2__27745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Position__Group__07787 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Position__Group__1_in_rule__Position__Group__07797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__NameAssignment_1_in_rule__Position__Group__17825 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Position__Group__2_in_rule__Position__Group__17834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__Group_2__0_in_rule__Position__Group__27862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Position__Group_2__07904 = new BitSet(new long[]{0x00001F1000000000L});
    public static final BitSet FOLLOW_rule__Position__Group_2__1_in_rule__Position__Group_2__07914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Position__IntentionsAssignment_2_1_in_rule__Position__Group_2__17942 = new BitSet(new long[]{0x00001F1000000000L});
    public static final BitSet FOLLOW_rule__Position__Group_2__2_in_rule__Position__Group_2__17952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Position__Group_2__27981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Goal__Group__08023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Goal__Group__1_in_rule__Goal__Group__08033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__NameAssignment_1_in_rule__Goal__Group__18061 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Goal__Group__2_in_rule__Goal__Group__18070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__0_in_rule__Goal__Group__28098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Goal__Group_2__08140 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__1_in_rule__Goal__Group_2__08150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__DecompositionsAssignment_2_1_in_rule__Goal__Group_2__18178 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__Goal__Group_2__2_in_rule__Goal__Group_2__18188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Goal__Group_2__28217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Softgoal__Group__08259 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Softgoal__Group__1_in_rule__Softgoal__Group__08269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Softgoal__NameAssignment_1_in_rule__Softgoal__Group__18297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Task__Group__08336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Task__Group__1_in_rule__Task__Group__08346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Task__NameAssignment_1_in_rule__Task__Group__18374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Resource__Group__08413 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__08423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_1_in_rule__Resource__Group__18451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Belief__Group__08490 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Belief__Group__1_in_rule__Belief__Group__08500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Belief__NameAssignment_1_in_rule__Belief__Group__18528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__SourceAssignment_0_in_rule__Association__Group__08566 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Association__Group__1_in_rule__Association__Group__08575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Association__Group__18604 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Association__Group__2_in_rule__Association__Group__18614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Association__TargetAssignment_2_in_rule__Association__Group__28642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__DependencyFromAssignment_0_in_rule__Dependency__Group__08682 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Dependency__Group__1_in_rule__Dependency__Group__08691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Dependency__Group__18720 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Dependency__Group__2_in_rule__Dependency__Group__18730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__DependencyToAssignment_2_in_rule__Dependency__Group__28758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__TargetAssignment_0_in_rule__AndDecomposition__Group__08798 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__1_in_rule__AndDecomposition__Group__08807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__AndDecomposition__Group__18836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AndDecomposition__Group__2_in_rule__AndDecomposition__Group__18846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndDecomposition__SourceAssignment_2_in_rule__AndDecomposition__Group__28874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__TargetAssignment_0_in_rule__OrDecomposition__Group__08914 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__1_in_rule__OrDecomposition__Group__08923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__OrDecomposition__Group__18952 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OrDecomposition__Group__2_in_rule__OrDecomposition__Group__18962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrDecomposition__SourceAssignment_2_in_rule__OrDecomposition__Group__28990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__SourceAssignment_0_in_rule__AndContribution__Group__09030 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__1_in_rule__AndContribution__Group__09039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__AndContribution__Group__19068 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AndContribution__Group__2_in_rule__AndContribution__Group__19078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndContribution__TargetAssignment_2_in_rule__AndContribution__Group__29106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__SourceAssignment_0_in_rule__OrContribution__Group__09146 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__1_in_rule__OrContribution__Group__09155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__OrContribution__Group__19184 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__OrContribution__Group__2_in_rule__OrContribution__Group__19194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrContribution__TargetAssignment_2_in_rule__OrContribution__Group__29222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__SourceAssignment_0_in_rule__HelpContribution__Group__09262 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__1_in_rule__HelpContribution__Group__09271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__HelpContribution__Group__19300 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HelpContribution__Group__2_in_rule__HelpContribution__Group__19310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HelpContribution__TargetAssignment_2_in_rule__HelpContribution__Group__29338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__SourceAssignment_0_in_rule__MakeContribution__Group__09378 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__1_in_rule__MakeContribution__Group__09387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__MakeContribution__Group__19416 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__MakeContribution__Group__2_in_rule__MakeContribution__Group__19426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MakeContribution__TargetAssignment_2_in_rule__MakeContribution__Group__29454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__SourceAssignment_0_in_rule__HurtContribution__Group__09494 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__1_in_rule__HurtContribution__Group__09503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__HurtContribution__Group__19532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HurtContribution__Group__2_in_rule__HurtContribution__Group__19542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HurtContribution__TargetAssignment_2_in_rule__HurtContribution__Group__29570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__SourceAssignment_0_in_rule__BreakContribution__Group__09610 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__1_in_rule__BreakContribution__Group__09619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_rule__BreakContribution__Group__19648 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__BreakContribution__Group__2_in_rule__BreakContribution__Group__19658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BreakContribution__TargetAssignment_2_in_rule__BreakContribution__Group__29686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Knowledge__ImportsAssignment_09726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Knowledge__EntitiesAssignment_19757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Knowledge__RulesAssignment_2_09788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Knowledge__VarsAssignment_39819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Rule__DeclAssignment_09850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__Rule__ExprAssignment_19881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_19916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_2_19955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__IntTerm__ConstAssignment_09990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__IntTerm__VarAssignment_110025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_010060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntOp_in_rule__BinaryIntExpr__BinaryopAssignment_110091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_210122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolOp_in_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_010153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OprAssignment_0_110184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OpsAssignment_1_110215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_rule__BinaryBoolExpr__OprAssignment_010246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolOp_in_rule__BinaryBoolExpr__BinaryopAssignment_110277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__BinaryBoolExpr__OprAssignment_210308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_110339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rule__Import__PathAssignment_110370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__NameAssignment_110401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Var__MinAssignment_210432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Var__MaxAssignment_310463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Fluent__TermAssignment_110494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Event__TermAssignment_110525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__NameAssignment_010556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_110587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_2_110618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__HoldsAt__FluentAssignment_210649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__HoldsAt__TimeAssignment_410680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Happens__EventAssignment_210711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Happens__TimeAssignment_410742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Initiates__EventAssignment_210773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Initiates__FluentAssignment_410804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Initiates__TimeAssignment_610835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Terminates__EventAssignment_210866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Terminates__FluentAssignment_410897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Terminates__TimeAssignment_610928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__Path__FileAssignment_010959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__Path__FileAssignment_1_110990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__File__NameAssignment_011021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__File__NameAssignment_1_111052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_111090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_aAssignment_2_011125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__Is_part_ofAssignment_2_111164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Actor__IntentionsAssignment_3_111199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Agent__NameAssignment_111230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Agent__IntentionsAssignment_2_111261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Role__NameAssignment_111292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Role__IntentionsAssignment_2_111323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Position__NameAssignment_111354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntention_in_rule__Position__IntentionsAssignment_2_111385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_111416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__DecompositionsAssignment_2_111451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Softgoal__NameAssignment_111486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Task__NameAssignment_111517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_111548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Belief__NameAssignment_111579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__SourceAssignment_011614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Association__TargetAssignment_211653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyFromAssignment_011692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Dependency__DependencyToAssignment_211731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__TargetAssignment_011770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndDecomposition__SourceAssignment_211809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__TargetAssignment_011848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrDecomposition__SourceAssignment_211887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__SourceAssignment_011926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AndContribution__TargetAssignment_211965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__SourceAssignment_012004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__OrContribution__TargetAssignment_212043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__SourceAssignment_012082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HelpContribution__TargetAssignment_212121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__SourceAssignment_012160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__MakeContribution__TargetAssignment_212199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__SourceAssignment_012238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HurtContribution__TargetAssignment_212277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__SourceAssignment_012316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BreakContribution__TargetAssignment_212355 = new BitSet(new long[]{0x0000000000000002L});

}