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


    // $ANTLR start entryRuleConstTerm
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:173:1: entryRuleConstTerm : ruleConstTerm EOF ;
    public final void entryRuleConstTerm() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:174:1: ( ruleConstTerm EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:175:1: ruleConstTerm EOF
            {
             before(grammarAccess.getConstTermRule()); 
            pushFollow(FOLLOW_ruleConstTerm_in_entryRuleConstTerm301);
            ruleConstTerm();
            _fsp--;

             after(grammarAccess.getConstTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConstTerm308); 

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
    // $ANTLR end entryRuleConstTerm


    // $ANTLR start ruleConstTerm
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:182:1: ruleConstTerm : ( ( rule__ConstTerm__ValueAssignment ) ) ;
    public final void ruleConstTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:186:2: ( ( ( rule__ConstTerm__ValueAssignment ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:187:1: ( ( rule__ConstTerm__ValueAssignment ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:187:1: ( ( rule__ConstTerm__ValueAssignment ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:188:1: ( rule__ConstTerm__ValueAssignment )
            {
             before(grammarAccess.getConstTermAccess().getValueAssignment()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:189:1: ( rule__ConstTerm__ValueAssignment )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:189:2: rule__ConstTerm__ValueAssignment
            {
            pushFollow(FOLLOW_rule__ConstTerm__ValueAssignment_in_ruleConstTerm334);
            rule__ConstTerm__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getConstTermAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConstTerm


    // $ANTLR start entryRuleVarTerm
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:201:1: entryRuleVarTerm : ruleVarTerm EOF ;
    public final void entryRuleVarTerm() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:202:1: ( ruleVarTerm EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:203:1: ruleVarTerm EOF
            {
             before(grammarAccess.getVarTermRule()); 
            pushFollow(FOLLOW_ruleVarTerm_in_entryRuleVarTerm361);
            ruleVarTerm();
            _fsp--;

             after(grammarAccess.getVarTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVarTerm368); 

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
    // $ANTLR end entryRuleVarTerm


    // $ANTLR start ruleVarTerm
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:210:1: ruleVarTerm : ( ( rule__VarTerm__ValueAssignment ) ) ;
    public final void ruleVarTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:214:2: ( ( ( rule__VarTerm__ValueAssignment ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:215:1: ( ( rule__VarTerm__ValueAssignment ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:215:1: ( ( rule__VarTerm__ValueAssignment ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:216:1: ( rule__VarTerm__ValueAssignment )
            {
             before(grammarAccess.getVarTermAccess().getValueAssignment()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:217:1: ( rule__VarTerm__ValueAssignment )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:217:2: rule__VarTerm__ValueAssignment
            {
            pushFollow(FOLLOW_rule__VarTerm__ValueAssignment_in_ruleVarTerm394);
            rule__VarTerm__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getVarTermAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleVarTerm


    // $ANTLR start entryRuleIntExpr
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:229:1: entryRuleIntExpr : ruleIntExpr EOF ;
    public final void entryRuleIntExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:230:1: ( ruleIntExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:231:1: ruleIntExpr EOF
            {
             before(grammarAccess.getIntExprRule()); 
            pushFollow(FOLLOW_ruleIntExpr_in_entryRuleIntExpr421);
            ruleIntExpr();
            _fsp--;

             after(grammarAccess.getIntExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleIntExpr428); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:238:1: ruleIntExpr : ( ( rule__IntExpr__Alternatives ) ) ;
    public final void ruleIntExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:242:2: ( ( ( rule__IntExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:243:1: ( ( rule__IntExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:243:1: ( ( rule__IntExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:244:1: ( rule__IntExpr__Alternatives )
            {
             before(grammarAccess.getIntExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:245:1: ( rule__IntExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:245:2: rule__IntExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__IntExpr__Alternatives_in_ruleIntExpr454);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:257:1: entryRuleBinaryIntExpr : ruleBinaryIntExpr EOF ;
    public final void entryRuleBinaryIntExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:258:1: ( ruleBinaryIntExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:259:1: ruleBinaryIntExpr EOF
            {
             before(grammarAccess.getBinaryIntExprRule()); 
            pushFollow(FOLLOW_ruleBinaryIntExpr_in_entryRuleBinaryIntExpr481);
            ruleBinaryIntExpr();
            _fsp--;

             after(grammarAccess.getBinaryIntExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryIntExpr488); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:266:1: ruleBinaryIntExpr : ( ( rule__BinaryIntExpr__Group__0 ) ) ;
    public final void ruleBinaryIntExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:270:2: ( ( ( rule__BinaryIntExpr__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:271:1: ( ( rule__BinaryIntExpr__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:271:1: ( ( rule__BinaryIntExpr__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:272:1: ( rule__BinaryIntExpr__Group__0 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:273:1: ( rule__BinaryIntExpr__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:273:2: rule__BinaryIntExpr__Group__0
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__0_in_ruleBinaryIntExpr514);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:285:1: entryRuleTemporalPredicate : ruleTemporalPredicate EOF ;
    public final void entryRuleTemporalPredicate() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:286:1: ( ruleTemporalPredicate EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:287:1: ruleTemporalPredicate EOF
            {
             before(grammarAccess.getTemporalPredicateRule()); 
            pushFollow(FOLLOW_ruleTemporalPredicate_in_entryRuleTemporalPredicate541);
            ruleTemporalPredicate();
            _fsp--;

             after(grammarAccess.getTemporalPredicateRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTemporalPredicate548); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:294:1: ruleTemporalPredicate : ( ( rule__TemporalPredicate__Alternatives ) ) ;
    public final void ruleTemporalPredicate() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:298:2: ( ( ( rule__TemporalPredicate__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:299:1: ( ( rule__TemporalPredicate__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:299:1: ( ( rule__TemporalPredicate__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:300:1: ( rule__TemporalPredicate__Alternatives )
            {
             before(grammarAccess.getTemporalPredicateAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:301:1: ( rule__TemporalPredicate__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:301:2: rule__TemporalPredicate__Alternatives
            {
            pushFollow(FOLLOW_rule__TemporalPredicate__Alternatives_in_ruleTemporalPredicate574);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:313:1: entryRuleBoolExpr : ruleBoolExpr EOF ;
    public final void entryRuleBoolExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:314:1: ( ruleBoolExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:315:1: ruleBoolExpr EOF
            {
             before(grammarAccess.getBoolExprRule()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr601);
            ruleBoolExpr();
            _fsp--;

             after(grammarAccess.getBoolExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBoolExpr608); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:322:1: ruleBoolExpr : ( ( rule__BoolExpr__Alternatives ) ) ;
    public final void ruleBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:326:2: ( ( ( rule__BoolExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:327:1: ( ( rule__BoolExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:327:1: ( ( rule__BoolExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:328:1: ( rule__BoolExpr__Alternatives )
            {
             before(grammarAccess.getBoolExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:329:1: ( rule__BoolExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:329:2: rule__BoolExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__BoolExpr__Alternatives_in_ruleBoolExpr634);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:341:1: entryRuleUnaryBoolExpr : ruleUnaryBoolExpr EOF ;
    public final void entryRuleUnaryBoolExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:342:1: ( ruleUnaryBoolExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:343:1: ruleUnaryBoolExpr EOF
            {
             before(grammarAccess.getUnaryBoolExprRule()); 
            pushFollow(FOLLOW_ruleUnaryBoolExpr_in_entryRuleUnaryBoolExpr661);
            ruleUnaryBoolExpr();
            _fsp--;

             after(grammarAccess.getUnaryBoolExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryBoolExpr668); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:350:1: ruleUnaryBoolExpr : ( ( rule__UnaryBoolExpr__Alternatives ) ) ;
    public final void ruleUnaryBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:354:2: ( ( ( rule__UnaryBoolExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:355:1: ( ( rule__UnaryBoolExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:355:1: ( ( rule__UnaryBoolExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:356:1: ( rule__UnaryBoolExpr__Alternatives )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:357:1: ( rule__UnaryBoolExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:357:2: rule__UnaryBoolExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Alternatives_in_ruleUnaryBoolExpr694);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:369:1: entryRuleBinaryBoolExpr : ruleBinaryBoolExpr EOF ;
    public final void entryRuleBinaryBoolExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:370:1: ( ruleBinaryBoolExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:371:1: ruleBinaryBoolExpr EOF
            {
             before(grammarAccess.getBinaryBoolExprRule()); 
            pushFollow(FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr721);
            ruleBinaryBoolExpr();
            _fsp--;

             after(grammarAccess.getBinaryBoolExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBinaryBoolExpr728); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:378:1: ruleBinaryBoolExpr : ( ( rule__BinaryBoolExpr__Group__0 ) ) ;
    public final void ruleBinaryBoolExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:382:2: ( ( ( rule__BinaryBoolExpr__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:383:1: ( ( rule__BinaryBoolExpr__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:383:1: ( ( rule__BinaryBoolExpr__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:384:1: ( rule__BinaryBoolExpr__Group__0 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:385:1: ( rule__BinaryBoolExpr__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:385:2: rule__BinaryBoolExpr__Group__0
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__0_in_ruleBinaryBoolExpr754);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:397:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:398:1: ( ruleEntity EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:399:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity781);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity788); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:406:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:410:2: ( ( ( rule__Entity__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:411:1: ( ( rule__Entity__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:411:1: ( ( rule__Entity__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:412:1: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:413:1: ( rule__Entity__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:413:2: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_rule__Entity__Alternatives_in_ruleEntity814);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:425:1: entryRuleSort : ruleSort EOF ;
    public final void entryRuleSort() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:426:1: ( ruleSort EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:427:1: ruleSort EOF
            {
             before(grammarAccess.getSortRule()); 
            pushFollow(FOLLOW_ruleSort_in_entryRuleSort841);
            ruleSort();
            _fsp--;

             after(grammarAccess.getSortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSort848); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:434:1: ruleSort : ( ( rule__Sort__Group__0 ) ) ;
    public final void ruleSort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:438:2: ( ( ( rule__Sort__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:439:1: ( ( rule__Sort__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:439:1: ( ( rule__Sort__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:440:1: ( rule__Sort__Group__0 )
            {
             before(grammarAccess.getSortAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:441:1: ( rule__Sort__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:441:2: rule__Sort__Group__0
            {
            pushFollow(FOLLOW_rule__Sort__Group__0_in_ruleSort874);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:453:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:454:1: ( ruleImport EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:455:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport901);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport908); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:462:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:466:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:467:1: ( ( rule__Import__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:467:1: ( ( rule__Import__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:468:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:469:1: ( rule__Import__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:469:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport934);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:481:1: entryRuleVar : ruleVar EOF ;
    public final void entryRuleVar() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:482:1: ( ruleVar EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:483:1: ruleVar EOF
            {
             before(grammarAccess.getVarRule()); 
            pushFollow(FOLLOW_ruleVar_in_entryRuleVar961);
            ruleVar();
            _fsp--;

             after(grammarAccess.getVarRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVar968); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:490:1: ruleVar : ( ( rule__Var__Group__0 ) ) ;
    public final void ruleVar() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:494:2: ( ( ( rule__Var__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:495:1: ( ( rule__Var__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:495:1: ( ( rule__Var__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:496:1: ( rule__Var__Group__0 )
            {
             before(grammarAccess.getVarAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:497:1: ( rule__Var__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:497:2: rule__Var__Group__0
            {
            pushFollow(FOLLOW_rule__Var__Group__0_in_ruleVar994);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:509:1: entryRuleFluent : ruleFluent EOF ;
    public final void entryRuleFluent() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:510:1: ( ruleFluent EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:511:1: ruleFluent EOF
            {
             before(grammarAccess.getFluentRule()); 
            pushFollow(FOLLOW_ruleFluent_in_entryRuleFluent1021);
            ruleFluent();
            _fsp--;

             after(grammarAccess.getFluentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFluent1028); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:518:1: ruleFluent : ( ( rule__Fluent__Group__0 ) ) ;
    public final void ruleFluent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:522:2: ( ( ( rule__Fluent__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:523:1: ( ( rule__Fluent__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:523:1: ( ( rule__Fluent__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:524:1: ( rule__Fluent__Group__0 )
            {
             before(grammarAccess.getFluentAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:525:1: ( rule__Fluent__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:525:2: rule__Fluent__Group__0
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0_in_ruleFluent1054);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:537:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:538:1: ( ruleEvent EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:539:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent1081);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent1088); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:546:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:550:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:551:1: ( ( rule__Event__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:551:1: ( ( rule__Event__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:552:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:553:1: ( rule__Event__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:553:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent1114);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:565:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:566:1: ( ruleTerm EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:567:1: ruleTerm EOF
            {
             before(grammarAccess.getTermRule()); 
            pushFollow(FOLLOW_ruleTerm_in_entryRuleTerm1141);
            ruleTerm();
            _fsp--;

             after(grammarAccess.getTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerm1148); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:574:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:578:2: ( ( ( rule__Term__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:579:1: ( ( rule__Term__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:579:1: ( ( rule__Term__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:580:1: ( rule__Term__Group__0 )
            {
             before(grammarAccess.getTermAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:581:1: ( rule__Term__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:581:2: rule__Term__Group__0
            {
            pushFollow(FOLLOW_rule__Term__Group__0_in_ruleTerm1174);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:593:1: entryRuleHoldsAt : ruleHoldsAt EOF ;
    public final void entryRuleHoldsAt() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:594:1: ( ruleHoldsAt EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:595:1: ruleHoldsAt EOF
            {
             before(grammarAccess.getHoldsAtRule()); 
            pushFollow(FOLLOW_ruleHoldsAt_in_entryRuleHoldsAt1201);
            ruleHoldsAt();
            _fsp--;

             after(grammarAccess.getHoldsAtRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHoldsAt1208); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:602:1: ruleHoldsAt : ( ( rule__HoldsAt__Group__0 ) ) ;
    public final void ruleHoldsAt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:606:2: ( ( ( rule__HoldsAt__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:607:1: ( ( rule__HoldsAt__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:607:1: ( ( rule__HoldsAt__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:608:1: ( rule__HoldsAt__Group__0 )
            {
             before(grammarAccess.getHoldsAtAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:609:1: ( rule__HoldsAt__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:609:2: rule__HoldsAt__Group__0
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__0_in_ruleHoldsAt1234);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:621:1: entryRuleHappens : ruleHappens EOF ;
    public final void entryRuleHappens() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:622:1: ( ruleHappens EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:623:1: ruleHappens EOF
            {
             before(grammarAccess.getHappensRule()); 
            pushFollow(FOLLOW_ruleHappens_in_entryRuleHappens1261);
            ruleHappens();
            _fsp--;

             after(grammarAccess.getHappensRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHappens1268); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:630:1: ruleHappens : ( ( rule__Happens__Group__0 ) ) ;
    public final void ruleHappens() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:634:2: ( ( ( rule__Happens__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:635:1: ( ( rule__Happens__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:635:1: ( ( rule__Happens__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:636:1: ( rule__Happens__Group__0 )
            {
             before(grammarAccess.getHappensAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:637:1: ( rule__Happens__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:637:2: rule__Happens__Group__0
            {
            pushFollow(FOLLOW_rule__Happens__Group__0_in_ruleHappens1294);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:649:1: entryRuleInitiates : ruleInitiates EOF ;
    public final void entryRuleInitiates() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:650:1: ( ruleInitiates EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:651:1: ruleInitiates EOF
            {
             before(grammarAccess.getInitiatesRule()); 
            pushFollow(FOLLOW_ruleInitiates_in_entryRuleInitiates1321);
            ruleInitiates();
            _fsp--;

             after(grammarAccess.getInitiatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInitiates1328); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:658:1: ruleInitiates : ( ( rule__Initiates__Group__0 ) ) ;
    public final void ruleInitiates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:662:2: ( ( ( rule__Initiates__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:663:1: ( ( rule__Initiates__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:663:1: ( ( rule__Initiates__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:664:1: ( rule__Initiates__Group__0 )
            {
             before(grammarAccess.getInitiatesAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:665:1: ( rule__Initiates__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:665:2: rule__Initiates__Group__0
            {
            pushFollow(FOLLOW_rule__Initiates__Group__0_in_ruleInitiates1354);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:677:1: entryRuleTerminates : ruleTerminates EOF ;
    public final void entryRuleTerminates() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:678:1: ( ruleTerminates EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:679:1: ruleTerminates EOF
            {
             before(grammarAccess.getTerminatesRule()); 
            pushFollow(FOLLOW_ruleTerminates_in_entryRuleTerminates1381);
            ruleTerminates();
            _fsp--;

             after(grammarAccess.getTerminatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminates1388); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:686:1: ruleTerminates : ( ( rule__Terminates__Group__0 ) ) ;
    public final void ruleTerminates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:690:2: ( ( ( rule__Terminates__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:691:1: ( ( rule__Terminates__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:691:1: ( ( rule__Terminates__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:692:1: ( rule__Terminates__Group__0 )
            {
             before(grammarAccess.getTerminatesAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:693:1: ( rule__Terminates__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:693:2: rule__Terminates__Group__0
            {
            pushFollow(FOLLOW_rule__Terminates__Group__0_in_ruleTerminates1414);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:705:1: entryRulePath : rulePath EOF ;
    public final void entryRulePath() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:706:1: ( rulePath EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:707:1: rulePath EOF
            {
             before(grammarAccess.getPathRule()); 
            pushFollow(FOLLOW_rulePath_in_entryRulePath1441);
            rulePath();
            _fsp--;

             after(grammarAccess.getPathRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePath1448); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:714:1: rulePath : ( ( rule__Path__Group__0 ) ) ;
    public final void rulePath() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:718:2: ( ( ( rule__Path__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:719:1: ( ( rule__Path__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:719:1: ( ( rule__Path__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:720:1: ( rule__Path__Group__0 )
            {
             before(grammarAccess.getPathAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:721:1: ( rule__Path__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:721:2: rule__Path__Group__0
            {
            pushFollow(FOLLOW_rule__Path__Group__0_in_rulePath1474);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:733:1: entryRuleFile : ruleFile EOF ;
    public final void entryRuleFile() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:734:1: ( ruleFile EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:735:1: ruleFile EOF
            {
             before(grammarAccess.getFileRule()); 
            pushFollow(FOLLOW_ruleFile_in_entryRuleFile1501);
            ruleFile();
            _fsp--;

             after(grammarAccess.getFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFile1508); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:742:1: ruleFile : ( ( rule__File__Group__0 ) ) ;
    public final void ruleFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:746:2: ( ( ( rule__File__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:747:1: ( ( rule__File__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:747:1: ( ( rule__File__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:748:1: ( rule__File__Group__0 )
            {
             before(grammarAccess.getFileAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:749:1: ( rule__File__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:749:2: rule__File__Group__0
            {
            pushFollow(FOLLOW_rule__File__Group__0_in_ruleFile1534);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:762:1: ruleBinaryIntOp : ( ( rule__BinaryIntOp__Alternatives ) ) ;
    public final void ruleBinaryIntOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:766:1: ( ( ( rule__BinaryIntOp__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:767:1: ( ( rule__BinaryIntOp__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:767:1: ( ( rule__BinaryIntOp__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:768:1: ( rule__BinaryIntOp__Alternatives )
            {
             before(grammarAccess.getBinaryIntOpAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:769:1: ( rule__BinaryIntOp__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:769:2: rule__BinaryIntOp__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryIntOp__Alternatives_in_ruleBinaryIntOp1571);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:781:1: ruleUnaryBoolOp : ( ( '!' ) ) ;
    public final void ruleUnaryBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:785:1: ( ( ( '!' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:786:1: ( ( '!' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:786:1: ( ( '!' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:787:1: ( '!' )
            {
             before(grammarAccess.getUnaryBoolOpAccess().getNEGATIONEnumLiteralDeclaration()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:788:1: ( '!' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:788:3: '!'
            {
            match(input,11,FOLLOW_11_in_ruleUnaryBoolOp1608); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:801:1: ruleBinaryBoolOp : ( ( rule__BinaryBoolOp__Alternatives ) ) ;
    public final void ruleBinaryBoolOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:805:1: ( ( ( rule__BinaryBoolOp__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:806:1: ( ( rule__BinaryBoolOp__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:806:1: ( ( rule__BinaryBoolOp__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:807:1: ( rule__BinaryBoolOp__Alternatives )
            {
             before(grammarAccess.getBinaryBoolOpAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:808:1: ( rule__BinaryBoolOp__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:808:2: rule__BinaryBoolOp__Alternatives
            {
            pushFollow(FOLLOW_rule__BinaryBoolOp__Alternatives_in_ruleBinaryBoolOp1646);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:819:1: rule__IntTerm__Alternatives : ( ( ruleConstTerm ) | ( ruleVarTerm ) );
    public final void rule__IntTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:823:1: ( ( ruleConstTerm ) | ( ruleVarTerm ) )
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
                    new NoViableAltException("819:1: rule__IntTerm__Alternatives : ( ( ruleConstTerm ) | ( ruleVarTerm ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:824:1: ( ruleConstTerm )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:824:1: ( ruleConstTerm )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:825:1: ruleConstTerm
                    {
                     before(grammarAccess.getIntTermAccess().getConstTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleConstTerm_in_rule__IntTerm__Alternatives1681);
                    ruleConstTerm();
                    _fsp--;

                     after(grammarAccess.getIntTermAccess().getConstTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:830:6: ( ruleVarTerm )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:830:6: ( ruleVarTerm )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:831:1: ruleVarTerm
                    {
                     before(grammarAccess.getIntTermAccess().getVarTermParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleVarTerm_in_rule__IntTerm__Alternatives1698);
                    ruleVarTerm();
                    _fsp--;

                     after(grammarAccess.getIntTermAccess().getVarTermParserRuleCall_1()); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:841:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );
    public final void rule__IntExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:845:1: ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) )
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
                        new NoViableAltException("841:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 1, input);

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
                        new NoViableAltException("841:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("841:1: rule__IntExpr__Alternatives : ( ( ruleIntTerm ) | ( ruleBinaryIntExpr ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:846:1: ( ruleIntTerm )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:846:1: ( ruleIntTerm )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:847:1: ruleIntTerm
                    {
                     before(grammarAccess.getIntExprAccess().getIntTermParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleIntTerm_in_rule__IntExpr__Alternatives1730);
                    ruleIntTerm();
                    _fsp--;

                     after(grammarAccess.getIntExprAccess().getIntTermParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:852:6: ( ruleBinaryIntExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:852:6: ( ruleBinaryIntExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:853:1: ruleBinaryIntExpr
                    {
                     before(grammarAccess.getIntExprAccess().getBinaryIntExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleBinaryIntExpr_in_rule__IntExpr__Alternatives1747);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:863:1: rule__TemporalPredicate__Alternatives : ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) );
    public final void rule__TemporalPredicate__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:867:1: ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) )
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
                    new NoViableAltException("863:1: rule__TemporalPredicate__Alternatives : ( ( ruleHoldsAt ) | ( ruleHappens ) | ( ruleInitiates ) | ( ruleTerminates ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:868:1: ( ruleHoldsAt )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:868:1: ( ruleHoldsAt )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:869:1: ruleHoldsAt
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getHoldsAtParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleHoldsAt_in_rule__TemporalPredicate__Alternatives1779);
                    ruleHoldsAt();
                    _fsp--;

                     after(grammarAccess.getTemporalPredicateAccess().getHoldsAtParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:874:6: ( ruleHappens )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:874:6: ( ruleHappens )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:875:1: ruleHappens
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getHappensParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHappens_in_rule__TemporalPredicate__Alternatives1796);
                    ruleHappens();
                    _fsp--;

                     after(grammarAccess.getTemporalPredicateAccess().getHappensParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:880:6: ( ruleInitiates )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:880:6: ( ruleInitiates )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:881:1: ruleInitiates
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getInitiatesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleInitiates_in_rule__TemporalPredicate__Alternatives1813);
                    ruleInitiates();
                    _fsp--;

                     after(grammarAccess.getTemporalPredicateAccess().getInitiatesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:886:6: ( ruleTerminates )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:886:6: ( ruleTerminates )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:887:1: ruleTerminates
                    {
                     before(grammarAccess.getTemporalPredicateAccess().getTerminatesParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTerminates_in_rule__TemporalPredicate__Alternatives1830);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:897:1: rule__BoolExpr__Alternatives : ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) );
    public final void rule__BoolExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:901:1: ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:902:1: ( ruleTemporalPredicate )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:902:1: ( ruleTemporalPredicate )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:903:1: ruleTemporalPredicate
                    {
                     before(grammarAccess.getBoolExprAccess().getTemporalPredicateParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTemporalPredicate_in_rule__BoolExpr__Alternatives1862);
                    ruleTemporalPredicate();
                    _fsp--;

                     after(grammarAccess.getBoolExprAccess().getTemporalPredicateParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:908:6: ( ruleUnaryBoolExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:908:6: ( ruleUnaryBoolExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:909:1: ruleUnaryBoolExpr
                    {
                     before(grammarAccess.getBoolExprAccess().getUnaryBoolExprParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleUnaryBoolExpr_in_rule__BoolExpr__Alternatives1879);
                    ruleUnaryBoolExpr();
                    _fsp--;

                     after(grammarAccess.getBoolExprAccess().getUnaryBoolExprParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:914:6: ( ruleBinaryBoolExpr )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:914:6: ( ruleBinaryBoolExpr )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:915:1: ruleBinaryBoolExpr
                    {
                     before(grammarAccess.getBoolExprAccess().getBinaryBoolExprParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleBinaryBoolExpr_in_rule__BoolExpr__Alternatives1896);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:925:1: rule__UnaryBoolExpr__Alternatives : ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) );
    public final void rule__UnaryBoolExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:929:1: ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) )
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
                    new NoViableAltException("925:1: rule__UnaryBoolExpr__Alternatives : ( ( ( rule__UnaryBoolExpr__Group_0__0 ) ) | ( ( rule__UnaryBoolExpr__Group_1__0 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:930:1: ( ( rule__UnaryBoolExpr__Group_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:930:1: ( ( rule__UnaryBoolExpr__Group_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:931:1: ( rule__UnaryBoolExpr__Group_0__0 )
                    {
                     before(grammarAccess.getUnaryBoolExprAccess().getGroup_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:932:1: ( rule__UnaryBoolExpr__Group_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:932:2: rule__UnaryBoolExpr__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__0_in_rule__UnaryBoolExpr__Alternatives1928);
                    rule__UnaryBoolExpr__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getUnaryBoolExprAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:936:6: ( ( rule__UnaryBoolExpr__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:936:6: ( ( rule__UnaryBoolExpr__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:937:1: ( rule__UnaryBoolExpr__Group_1__0 )
                    {
                     before(grammarAccess.getUnaryBoolExprAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:938:1: ( rule__UnaryBoolExpr__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:938:2: rule__UnaryBoolExpr__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__0_in_rule__UnaryBoolExpr__Alternatives1946);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:947:1: rule__Entity__Alternatives : ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:951:1: ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) )
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
                    new NoViableAltException("947:1: rule__Entity__Alternatives : ( ( ruleFluent ) | ( ruleEvent ) | ( ruleSort ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:952:1: ( ruleFluent )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:952:1: ( ruleFluent )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:953:1: ruleFluent
                    {
                     before(grammarAccess.getEntityAccess().getFluentParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFluent_in_rule__Entity__Alternatives1979);
                    ruleFluent();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getFluentParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:958:6: ( ruleEvent )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:958:6: ( ruleEvent )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:959:1: ruleEvent
                    {
                     before(grammarAccess.getEntityAccess().getEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEvent_in_rule__Entity__Alternatives1996);
                    ruleEvent();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getEventParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:964:6: ( ruleSort )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:964:6: ( ruleSort )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:965:1: ruleSort
                    {
                     before(grammarAccess.getEntityAccess().getSortParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleSort_in_rule__Entity__Alternatives2013);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:975:1: rule__BinaryIntOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );
    public final void rule__BinaryIntOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:979:1: ( ( ( '+' ) ) | ( ( '-' ) ) )
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
                    new NoViableAltException("975:1: rule__BinaryIntOp__Alternatives : ( ( ( '+' ) ) | ( ( '-' ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:980:1: ( ( '+' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:980:1: ( ( '+' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:981:1: ( '+' )
                    {
                     before(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:982:1: ( '+' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:982:3: '+'
                    {
                    match(input,12,FOLLOW_12_in_rule__BinaryIntOp__Alternatives2046); 

                    }

                     after(grammarAccess.getBinaryIntOpAccess().getPLUSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:987:6: ( ( '-' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:987:6: ( ( '-' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:988:1: ( '-' )
                    {
                     before(grammarAccess.getBinaryIntOpAccess().getMINUSEnumLiteralDeclaration_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:989:1: ( '-' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:989:3: '-'
                    {
                    match(input,13,FOLLOW_13_in_rule__BinaryIntOp__Alternatives2067); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:999:1: rule__BinaryBoolOp__Alternatives : ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) );
    public final void rule__BinaryBoolOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1003:1: ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) )
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
                    new NoViableAltException("999:1: rule__BinaryBoolOp__Alternatives : ( ( ( '->' ) ) | ( ( '<->' ) ) | ( ( '&' ) ) | ( ( '|' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1004:1: ( ( '->' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1004:1: ( ( '->' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1005:1: ( '->' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1006:1: ( '->' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1006:3: '->'
                    {
                    match(input,14,FOLLOW_14_in_rule__BinaryBoolOp__Alternatives2103); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getIMPLICATIONEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1011:6: ( ( '<->' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1011:6: ( ( '<->' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1012:1: ( '<->' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1013:1: ( '<->' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1013:3: '<->'
                    {
                    match(input,15,FOLLOW_15_in_rule__BinaryBoolOp__Alternatives2124); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getEQUIVALENCEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1018:6: ( ( '&' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1018:6: ( ( '&' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1019:1: ( '&' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1020:1: ( '&' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1020:3: '&'
                    {
                    match(input,16,FOLLOW_16_in_rule__BinaryBoolOp__Alternatives2145); 

                    }

                     after(grammarAccess.getBinaryBoolOpAccess().getANDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1025:6: ( ( '|' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1025:6: ( ( '|' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1026:1: ( '|' )
                    {
                     before(grammarAccess.getBinaryBoolOpAccess().getOREnumLiteralDeclaration_3()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1027:1: ( '|' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1027:3: '|'
                    {
                    match(input,17,FOLLOW_17_in_rule__BinaryBoolOp__Alternatives2166); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1039:1: rule__Knowledge__Group__0 : rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1 ;
    public final void rule__Knowledge__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1043:1: ( rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1044:2: rule__Knowledge__Group__0__Impl rule__Knowledge__Group__1
            {
            pushFollow(FOLLOW_rule__Knowledge__Group__0__Impl_in_rule__Knowledge__Group__02199);
            rule__Knowledge__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Knowledge__Group__1_in_rule__Knowledge__Group__02202);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1051:1: rule__Knowledge__Group__0__Impl : ( ( rule__Knowledge__ImportsAssignment_0 )* ) ;
    public final void rule__Knowledge__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1055:1: ( ( ( rule__Knowledge__ImportsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1056:1: ( ( rule__Knowledge__ImportsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1056:1: ( ( rule__Knowledge__ImportsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1057:1: ( rule__Knowledge__ImportsAssignment_0 )*
            {
             before(grammarAccess.getKnowledgeAccess().getImportsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1058:1: ( rule__Knowledge__ImportsAssignment_0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==25) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1058:2: rule__Knowledge__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__ImportsAssignment_0_in_rule__Knowledge__Group__0__Impl2229);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1068:1: rule__Knowledge__Group__1 : rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2 ;
    public final void rule__Knowledge__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1072:1: ( rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1073:2: rule__Knowledge__Group__1__Impl rule__Knowledge__Group__2
            {
            pushFollow(FOLLOW_rule__Knowledge__Group__1__Impl_in_rule__Knowledge__Group__12260);
            rule__Knowledge__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Knowledge__Group__2_in_rule__Knowledge__Group__12263);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1080:1: rule__Knowledge__Group__1__Impl : ( ( rule__Knowledge__EntitiesAssignment_1 )* ) ;
    public final void rule__Knowledge__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1084:1: ( ( ( rule__Knowledge__EntitiesAssignment_1 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1085:1: ( ( rule__Knowledge__EntitiesAssignment_1 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1085:1: ( ( rule__Knowledge__EntitiesAssignment_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1086:1: ( rule__Knowledge__EntitiesAssignment_1 )*
            {
             before(grammarAccess.getKnowledgeAccess().getEntitiesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1087:1: ( rule__Knowledge__EntitiesAssignment_1 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==24||(LA10_0>=27 && LA10_0<=28)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1087:2: rule__Knowledge__EntitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__EntitiesAssignment_1_in_rule__Knowledge__Group__1__Impl2290);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1097:1: rule__Knowledge__Group__2 : rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3 ;
    public final void rule__Knowledge__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1101:1: ( rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1102:2: rule__Knowledge__Group__2__Impl rule__Knowledge__Group__3
            {
            pushFollow(FOLLOW_rule__Knowledge__Group__2__Impl_in_rule__Knowledge__Group__22321);
            rule__Knowledge__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Knowledge__Group__3_in_rule__Knowledge__Group__22324);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1109:1: rule__Knowledge__Group__2__Impl : ( ( rule__Knowledge__Group_2__0 )* ) ;
    public final void rule__Knowledge__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1113:1: ( ( ( rule__Knowledge__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1114:1: ( ( rule__Knowledge__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1114:1: ( ( rule__Knowledge__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1115:1: ( rule__Knowledge__Group_2__0 )*
            {
             before(grammarAccess.getKnowledgeAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1116:1: ( rule__Knowledge__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==11||LA11_0==19||LA11_0==22||(LA11_0>=29 && LA11_0<=32)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1116:2: rule__Knowledge__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__Group_2__0_in_rule__Knowledge__Group__2__Impl2351);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1126:1: rule__Knowledge__Group__3 : rule__Knowledge__Group__3__Impl ;
    public final void rule__Knowledge__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1130:1: ( rule__Knowledge__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1131:2: rule__Knowledge__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Knowledge__Group__3__Impl_in_rule__Knowledge__Group__32382);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1137:1: rule__Knowledge__Group__3__Impl : ( ( rule__Knowledge__VarsAssignment_3 )* ) ;
    public final void rule__Knowledge__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1141:1: ( ( ( rule__Knowledge__VarsAssignment_3 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1142:1: ( ( rule__Knowledge__VarsAssignment_3 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1142:1: ( ( rule__Knowledge__VarsAssignment_3 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1143:1: ( rule__Knowledge__VarsAssignment_3 )*
            {
             before(grammarAccess.getKnowledgeAccess().getVarsAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1144:1: ( rule__Knowledge__VarsAssignment_3 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==26) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1144:2: rule__Knowledge__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Knowledge__VarsAssignment_3_in_rule__Knowledge__Group__3__Impl2409);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1162:1: rule__Knowledge__Group_2__0 : rule__Knowledge__Group_2__0__Impl rule__Knowledge__Group_2__1 ;
    public final void rule__Knowledge__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1166:1: ( rule__Knowledge__Group_2__0__Impl rule__Knowledge__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1167:2: rule__Knowledge__Group_2__0__Impl rule__Knowledge__Group_2__1
            {
            pushFollow(FOLLOW_rule__Knowledge__Group_2__0__Impl_in_rule__Knowledge__Group_2__02448);
            rule__Knowledge__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Knowledge__Group_2__1_in_rule__Knowledge__Group_2__02451);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1174:1: rule__Knowledge__Group_2__0__Impl : ( ( rule__Knowledge__RulesAssignment_2_0 ) ) ;
    public final void rule__Knowledge__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1178:1: ( ( ( rule__Knowledge__RulesAssignment_2_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1179:1: ( ( rule__Knowledge__RulesAssignment_2_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1179:1: ( ( rule__Knowledge__RulesAssignment_2_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1180:1: ( rule__Knowledge__RulesAssignment_2_0 )
            {
             before(grammarAccess.getKnowledgeAccess().getRulesAssignment_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1181:1: ( rule__Knowledge__RulesAssignment_2_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1181:2: rule__Knowledge__RulesAssignment_2_0
            {
            pushFollow(FOLLOW_rule__Knowledge__RulesAssignment_2_0_in_rule__Knowledge__Group_2__0__Impl2478);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1191:1: rule__Knowledge__Group_2__1 : rule__Knowledge__Group_2__1__Impl ;
    public final void rule__Knowledge__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1195:1: ( rule__Knowledge__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1196:2: rule__Knowledge__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Knowledge__Group_2__1__Impl_in_rule__Knowledge__Group_2__12508);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1202:1: rule__Knowledge__Group_2__1__Impl : ( '.' ) ;
    public final void rule__Knowledge__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1206:1: ( ( '.' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1207:1: ( '.' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1207:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1208:1: '.'
            {
             before(grammarAccess.getKnowledgeAccess().getFullStopKeyword_2_1()); 
            match(input,18,FOLLOW_18_in_rule__Knowledge__Group_2__1__Impl2536); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1225:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1229:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1230:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02571);
            rule__Rule__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02574);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1237:1: rule__Rule__Group__0__Impl : ( ( rule__Rule__DeclAssignment_0 )? ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1241:1: ( ( ( rule__Rule__DeclAssignment_0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1242:1: ( ( rule__Rule__DeclAssignment_0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1242:1: ( ( rule__Rule__DeclAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1243:1: ( rule__Rule__DeclAssignment_0 )?
            {
             before(grammarAccess.getRuleAccess().getDeclAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1244:1: ( rule__Rule__DeclAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1244:2: rule__Rule__DeclAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Rule__DeclAssignment_0_in_rule__Rule__Group__0__Impl2601);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1254:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1258:1: ( rule__Rule__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1259:2: rule__Rule__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12632);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1265:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__ExprAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1269:1: ( ( ( rule__Rule__ExprAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1270:1: ( ( rule__Rule__ExprAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1270:1: ( ( rule__Rule__ExprAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1271:1: ( rule__Rule__ExprAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getExprAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1272:1: ( rule__Rule__ExprAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1272:2: rule__Rule__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__ExprAssignment_1_in_rule__Rule__Group__1__Impl2659);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1286:1: rule__VarDecl__Group__0 : rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 ;
    public final void rule__VarDecl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1290:1: ( rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1291:2: rule__VarDecl__Group__0__Impl rule__VarDecl__Group__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__02693);
            rule__VarDecl__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__02696);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1298:1: rule__VarDecl__Group__0__Impl : ( '[' ) ;
    public final void rule__VarDecl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1302:1: ( ( '[' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1303:1: ( '[' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1303:1: ( '[' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1304:1: '['
            {
             before(grammarAccess.getVarDeclAccess().getLeftSquareBracketKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__VarDecl__Group__0__Impl2724); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1317:1: rule__VarDecl__Group__1 : rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 ;
    public final void rule__VarDecl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1321:1: ( rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1322:2: rule__VarDecl__Group__1__Impl rule__VarDecl__Group__2
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__12755);
            rule__VarDecl__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__12758);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1329:1: rule__VarDecl__Group__1__Impl : ( ( rule__VarDecl__VarsAssignment_1 ) ) ;
    public final void rule__VarDecl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1333:1: ( ( ( rule__VarDecl__VarsAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1334:1: ( ( rule__VarDecl__VarsAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1334:1: ( ( rule__VarDecl__VarsAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1335:1: ( rule__VarDecl__VarsAssignment_1 )
            {
             before(grammarAccess.getVarDeclAccess().getVarsAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1336:1: ( rule__VarDecl__VarsAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1336:2: rule__VarDecl__VarsAssignment_1
            {
            pushFollow(FOLLOW_rule__VarDecl__VarsAssignment_1_in_rule__VarDecl__Group__1__Impl2785);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1346:1: rule__VarDecl__Group__2 : rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 ;
    public final void rule__VarDecl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1350:1: ( rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1351:2: rule__VarDecl__Group__2__Impl rule__VarDecl__Group__3
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22815);
            rule__VarDecl__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22818);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1358:1: rule__VarDecl__Group__2__Impl : ( ( rule__VarDecl__Group_2__0 )* ) ;
    public final void rule__VarDecl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1362:1: ( ( ( rule__VarDecl__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1363:1: ( ( rule__VarDecl__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1363:1: ( ( rule__VarDecl__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1364:1: ( rule__VarDecl__Group_2__0 )*
            {
             before(grammarAccess.getVarDeclAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1365:1: ( rule__VarDecl__Group_2__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1365:2: rule__VarDecl__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__VarDecl__Group_2__0_in_rule__VarDecl__Group__2__Impl2845);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1375:1: rule__VarDecl__Group__3 : rule__VarDecl__Group__3__Impl ;
    public final void rule__VarDecl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1379:1: ( rule__VarDecl__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1380:2: rule__VarDecl__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32876);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1386:1: rule__VarDecl__Group__3__Impl : ( ']' ) ;
    public final void rule__VarDecl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1390:1: ( ( ']' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1391:1: ( ']' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1391:1: ( ']' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1392:1: ']'
            {
             before(grammarAccess.getVarDeclAccess().getRightSquareBracketKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__VarDecl__Group__3__Impl2904); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1413:1: rule__VarDecl__Group_2__0 : rule__VarDecl__Group_2__0__Impl rule__VarDecl__Group_2__1 ;
    public final void rule__VarDecl__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1417:1: ( rule__VarDecl__Group_2__0__Impl rule__VarDecl__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1418:2: rule__VarDecl__Group_2__0__Impl rule__VarDecl__Group_2__1
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2__0__Impl_in_rule__VarDecl__Group_2__02943);
            rule__VarDecl__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__VarDecl__Group_2__1_in_rule__VarDecl__Group_2__02946);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1425:1: rule__VarDecl__Group_2__0__Impl : ( ',' ) ;
    public final void rule__VarDecl__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1429:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1430:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1430:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1431:1: ','
            {
             before(grammarAccess.getVarDeclAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__VarDecl__Group_2__0__Impl2974); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1444:1: rule__VarDecl__Group_2__1 : rule__VarDecl__Group_2__1__Impl ;
    public final void rule__VarDecl__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1448:1: ( rule__VarDecl__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1449:2: rule__VarDecl__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__VarDecl__Group_2__1__Impl_in_rule__VarDecl__Group_2__13005);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1455:1: rule__VarDecl__Group_2__1__Impl : ( ( rule__VarDecl__VarsAssignment_2_1 ) ) ;
    public final void rule__VarDecl__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1459:1: ( ( ( rule__VarDecl__VarsAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1460:1: ( ( rule__VarDecl__VarsAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1460:1: ( ( rule__VarDecl__VarsAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1461:1: ( rule__VarDecl__VarsAssignment_2_1 )
            {
             before(grammarAccess.getVarDeclAccess().getVarsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1462:1: ( rule__VarDecl__VarsAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1462:2: rule__VarDecl__VarsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__VarDecl__VarsAssignment_2_1_in_rule__VarDecl__Group_2__1__Impl3032);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1476:1: rule__BinaryIntExpr__Group__0 : rule__BinaryIntExpr__Group__0__Impl rule__BinaryIntExpr__Group__1 ;
    public final void rule__BinaryIntExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1480:1: ( rule__BinaryIntExpr__Group__0__Impl rule__BinaryIntExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1481:2: rule__BinaryIntExpr__Group__0__Impl rule__BinaryIntExpr__Group__1
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__0__Impl_in_rule__BinaryIntExpr__Group__03066);
            rule__BinaryIntExpr__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__1_in_rule__BinaryIntExpr__Group__03069);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1488:1: rule__BinaryIntExpr__Group__0__Impl : ( ( rule__BinaryIntExpr__OprAssignment_0 ) ) ;
    public final void rule__BinaryIntExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1492:1: ( ( ( rule__BinaryIntExpr__OprAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1493:1: ( ( rule__BinaryIntExpr__OprAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1493:1: ( ( rule__BinaryIntExpr__OprAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1494:1: ( rule__BinaryIntExpr__OprAssignment_0 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1495:1: ( rule__BinaryIntExpr__OprAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1495:2: rule__BinaryIntExpr__OprAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__OprAssignment_0_in_rule__BinaryIntExpr__Group__0__Impl3096);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1505:1: rule__BinaryIntExpr__Group__1 : rule__BinaryIntExpr__Group__1__Impl rule__BinaryIntExpr__Group__2 ;
    public final void rule__BinaryIntExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1509:1: ( rule__BinaryIntExpr__Group__1__Impl rule__BinaryIntExpr__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1510:2: rule__BinaryIntExpr__Group__1__Impl rule__BinaryIntExpr__Group__2
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__1__Impl_in_rule__BinaryIntExpr__Group__13126);
            rule__BinaryIntExpr__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__2_in_rule__BinaryIntExpr__Group__13129);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1517:1: rule__BinaryIntExpr__Group__1__Impl : ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) ) ;
    public final void rule__BinaryIntExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1521:1: ( ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1522:1: ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1522:1: ( ( rule__BinaryIntExpr__BinaryopAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1523:1: ( rule__BinaryIntExpr__BinaryopAssignment_1 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getBinaryopAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1524:1: ( rule__BinaryIntExpr__BinaryopAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1524:2: rule__BinaryIntExpr__BinaryopAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__BinaryopAssignment_1_in_rule__BinaryIntExpr__Group__1__Impl3156);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1534:1: rule__BinaryIntExpr__Group__2 : rule__BinaryIntExpr__Group__2__Impl ;
    public final void rule__BinaryIntExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1538:1: ( rule__BinaryIntExpr__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1539:2: rule__BinaryIntExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__Group__2__Impl_in_rule__BinaryIntExpr__Group__23186);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1545:1: rule__BinaryIntExpr__Group__2__Impl : ( ( rule__BinaryIntExpr__OprAssignment_2 ) ) ;
    public final void rule__BinaryIntExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1549:1: ( ( ( rule__BinaryIntExpr__OprAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1550:1: ( ( rule__BinaryIntExpr__OprAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1550:1: ( ( rule__BinaryIntExpr__OprAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1551:1: ( rule__BinaryIntExpr__OprAssignment_2 )
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1552:1: ( rule__BinaryIntExpr__OprAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1552:2: rule__BinaryIntExpr__OprAssignment_2
            {
            pushFollow(FOLLOW_rule__BinaryIntExpr__OprAssignment_2_in_rule__BinaryIntExpr__Group__2__Impl3213);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1568:1: rule__UnaryBoolExpr__Group_0__0 : rule__UnaryBoolExpr__Group_0__0__Impl rule__UnaryBoolExpr__Group_0__1 ;
    public final void rule__UnaryBoolExpr__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1572:1: ( rule__UnaryBoolExpr__Group_0__0__Impl rule__UnaryBoolExpr__Group_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1573:2: rule__UnaryBoolExpr__Group_0__0__Impl rule__UnaryBoolExpr__Group_0__1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__0__Impl_in_rule__UnaryBoolExpr__Group_0__03249);
            rule__UnaryBoolExpr__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__1_in_rule__UnaryBoolExpr__Group_0__03252);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1580:1: rule__UnaryBoolExpr__Group_0__0__Impl : ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) ) ;
    public final void rule__UnaryBoolExpr__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1584:1: ( ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1585:1: ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1585:1: ( ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1586:1: ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsAssignment_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1587:1: ( rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1587:2: rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0_in_rule__UnaryBoolExpr__Group_0__0__Impl3279);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1597:1: rule__UnaryBoolExpr__Group_0__1 : rule__UnaryBoolExpr__Group_0__1__Impl ;
    public final void rule__UnaryBoolExpr__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1601:1: ( rule__UnaryBoolExpr__Group_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1602:2: rule__UnaryBoolExpr__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_0__1__Impl_in_rule__UnaryBoolExpr__Group_0__13309);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1608:1: rule__UnaryBoolExpr__Group_0__1__Impl : ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) ) ;
    public final void rule__UnaryBoolExpr__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1612:1: ( ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1613:1: ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1613:1: ( ( rule__UnaryBoolExpr__OprAssignment_0_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1614:1: ( rule__UnaryBoolExpr__OprAssignment_0_1 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOprAssignment_0_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1615:1: ( rule__UnaryBoolExpr__OprAssignment_0_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1615:2: rule__UnaryBoolExpr__OprAssignment_0_1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__OprAssignment_0_1_in_rule__UnaryBoolExpr__Group_0__1__Impl3336);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1629:1: rule__UnaryBoolExpr__Group_1__0 : rule__UnaryBoolExpr__Group_1__0__Impl rule__UnaryBoolExpr__Group_1__1 ;
    public final void rule__UnaryBoolExpr__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1633:1: ( rule__UnaryBoolExpr__Group_1__0__Impl rule__UnaryBoolExpr__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1634:2: rule__UnaryBoolExpr__Group_1__0__Impl rule__UnaryBoolExpr__Group_1__1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__0__Impl_in_rule__UnaryBoolExpr__Group_1__03370);
            rule__UnaryBoolExpr__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__1_in_rule__UnaryBoolExpr__Group_1__03373);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1641:1: rule__UnaryBoolExpr__Group_1__0__Impl : ( '(' ) ;
    public final void rule__UnaryBoolExpr__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1645:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1646:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1646:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1647:1: '('
            {
             before(grammarAccess.getUnaryBoolExprAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__UnaryBoolExpr__Group_1__0__Impl3401); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1660:1: rule__UnaryBoolExpr__Group_1__1 : rule__UnaryBoolExpr__Group_1__1__Impl rule__UnaryBoolExpr__Group_1__2 ;
    public final void rule__UnaryBoolExpr__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1664:1: ( rule__UnaryBoolExpr__Group_1__1__Impl rule__UnaryBoolExpr__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1665:2: rule__UnaryBoolExpr__Group_1__1__Impl rule__UnaryBoolExpr__Group_1__2
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__1__Impl_in_rule__UnaryBoolExpr__Group_1__13432);
            rule__UnaryBoolExpr__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__2_in_rule__UnaryBoolExpr__Group_1__13435);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1672:1: rule__UnaryBoolExpr__Group_1__1__Impl : ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) ) ;
    public final void rule__UnaryBoolExpr__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1676:1: ( ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1677:1: ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1677:1: ( ( rule__UnaryBoolExpr__OpsAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1678:1: ( rule__UnaryBoolExpr__OpsAssignment_1_1 )
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOpsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1679:1: ( rule__UnaryBoolExpr__OpsAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1679:2: rule__UnaryBoolExpr__OpsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__OpsAssignment_1_1_in_rule__UnaryBoolExpr__Group_1__1__Impl3462);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1689:1: rule__UnaryBoolExpr__Group_1__2 : rule__UnaryBoolExpr__Group_1__2__Impl ;
    public final void rule__UnaryBoolExpr__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1693:1: ( rule__UnaryBoolExpr__Group_1__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1694:2: rule__UnaryBoolExpr__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__UnaryBoolExpr__Group_1__2__Impl_in_rule__UnaryBoolExpr__Group_1__23492);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1700:1: rule__UnaryBoolExpr__Group_1__2__Impl : ( ')' ) ;
    public final void rule__UnaryBoolExpr__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1704:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1705:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1705:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1706:1: ')'
            {
             before(grammarAccess.getUnaryBoolExprAccess().getRightParenthesisKeyword_1_2()); 
            match(input,23,FOLLOW_23_in_rule__UnaryBoolExpr__Group_1__2__Impl3520); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1725:1: rule__BinaryBoolExpr__Group__0 : rule__BinaryBoolExpr__Group__0__Impl rule__BinaryBoolExpr__Group__1 ;
    public final void rule__BinaryBoolExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1729:1: ( rule__BinaryBoolExpr__Group__0__Impl rule__BinaryBoolExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1730:2: rule__BinaryBoolExpr__Group__0__Impl rule__BinaryBoolExpr__Group__1
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__0__Impl_in_rule__BinaryBoolExpr__Group__03557);
            rule__BinaryBoolExpr__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__1_in_rule__BinaryBoolExpr__Group__03560);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1737:1: rule__BinaryBoolExpr__Group__0__Impl : ( ( rule__BinaryBoolExpr__OprAssignment_0 ) ) ;
    public final void rule__BinaryBoolExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1741:1: ( ( ( rule__BinaryBoolExpr__OprAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1742:1: ( ( rule__BinaryBoolExpr__OprAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1742:1: ( ( rule__BinaryBoolExpr__OprAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1743:1: ( rule__BinaryBoolExpr__OprAssignment_0 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1744:1: ( rule__BinaryBoolExpr__OprAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1744:2: rule__BinaryBoolExpr__OprAssignment_0
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__OprAssignment_0_in_rule__BinaryBoolExpr__Group__0__Impl3587);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1754:1: rule__BinaryBoolExpr__Group__1 : rule__BinaryBoolExpr__Group__1__Impl rule__BinaryBoolExpr__Group__2 ;
    public final void rule__BinaryBoolExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1758:1: ( rule__BinaryBoolExpr__Group__1__Impl rule__BinaryBoolExpr__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1759:2: rule__BinaryBoolExpr__Group__1__Impl rule__BinaryBoolExpr__Group__2
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__1__Impl_in_rule__BinaryBoolExpr__Group__13617);
            rule__BinaryBoolExpr__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__2_in_rule__BinaryBoolExpr__Group__13620);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1766:1: rule__BinaryBoolExpr__Group__1__Impl : ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) ) ;
    public final void rule__BinaryBoolExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1770:1: ( ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1771:1: ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1771:1: ( ( rule__BinaryBoolExpr__BinaryopAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1772:1: ( rule__BinaryBoolExpr__BinaryopAssignment_1 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getBinaryopAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1773:1: ( rule__BinaryBoolExpr__BinaryopAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1773:2: rule__BinaryBoolExpr__BinaryopAssignment_1
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__BinaryopAssignment_1_in_rule__BinaryBoolExpr__Group__1__Impl3647);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1783:1: rule__BinaryBoolExpr__Group__2 : rule__BinaryBoolExpr__Group__2__Impl ;
    public final void rule__BinaryBoolExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1787:1: ( rule__BinaryBoolExpr__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1788:2: rule__BinaryBoolExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__Group__2__Impl_in_rule__BinaryBoolExpr__Group__23677);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1794:1: rule__BinaryBoolExpr__Group__2__Impl : ( ( rule__BinaryBoolExpr__OprAssignment_2 ) ) ;
    public final void rule__BinaryBoolExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1798:1: ( ( ( rule__BinaryBoolExpr__OprAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1799:1: ( ( rule__BinaryBoolExpr__OprAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1799:1: ( ( rule__BinaryBoolExpr__OprAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1800:1: ( rule__BinaryBoolExpr__OprAssignment_2 )
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1801:1: ( rule__BinaryBoolExpr__OprAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1801:2: rule__BinaryBoolExpr__OprAssignment_2
            {
            pushFollow(FOLLOW_rule__BinaryBoolExpr__OprAssignment_2_in_rule__BinaryBoolExpr__Group__2__Impl3704);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1817:1: rule__Sort__Group__0 : rule__Sort__Group__0__Impl rule__Sort__Group__1 ;
    public final void rule__Sort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1821:1: ( rule__Sort__Group__0__Impl rule__Sort__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1822:2: rule__Sort__Group__0__Impl rule__Sort__Group__1
            {
            pushFollow(FOLLOW_rule__Sort__Group__0__Impl_in_rule__Sort__Group__03740);
            rule__Sort__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__03743);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1829:1: rule__Sort__Group__0__Impl : ( 'sort' ) ;
    public final void rule__Sort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1833:1: ( ( 'sort' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1834:1: ( 'sort' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1834:1: ( 'sort' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1835:1: 'sort'
            {
             before(grammarAccess.getSortAccess().getSortKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Sort__Group__0__Impl3771); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1848:1: rule__Sort__Group__1 : rule__Sort__Group__1__Impl ;
    public final void rule__Sort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1852:1: ( rule__Sort__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1853:2: rule__Sort__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Sort__Group__1__Impl_in_rule__Sort__Group__13802);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1859:1: rule__Sort__Group__1__Impl : ( ( rule__Sort__NameAssignment_1 ) ) ;
    public final void rule__Sort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1863:1: ( ( ( rule__Sort__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1864:1: ( ( rule__Sort__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1864:1: ( ( rule__Sort__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1865:1: ( rule__Sort__NameAssignment_1 )
            {
             before(grammarAccess.getSortAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1866:1: ( rule__Sort__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1866:2: rule__Sort__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__1__Impl3829);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1880:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1884:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1885:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03863);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03866);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1892:1: rule__Import__Group__0__Impl : ( 'load' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1896:1: ( ( 'load' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1897:1: ( 'load' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1897:1: ( 'load' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1898:1: 'load'
            {
             before(grammarAccess.getImportAccess().getLoadKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__Import__Group__0__Impl3894); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1911:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1915:1: ( rule__Import__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1916:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13925);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1922:1: rule__Import__Group__1__Impl : ( ( rule__Import__PathAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1926:1: ( ( ( rule__Import__PathAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1927:1: ( ( rule__Import__PathAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1927:1: ( ( rule__Import__PathAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1928:1: ( rule__Import__PathAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getPathAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1929:1: ( rule__Import__PathAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1929:2: rule__Import__PathAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__PathAssignment_1_in_rule__Import__Group__1__Impl3952);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1943:1: rule__Var__Group__0 : rule__Var__Group__0__Impl rule__Var__Group__1 ;
    public final void rule__Var__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1947:1: ( rule__Var__Group__0__Impl rule__Var__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1948:2: rule__Var__Group__0__Impl rule__Var__Group__1
            {
            pushFollow(FOLLOW_rule__Var__Group__0__Impl_in_rule__Var__Group__03986);
            rule__Var__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Var__Group__1_in_rule__Var__Group__03989);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1955:1: rule__Var__Group__0__Impl : ( 'range' ) ;
    public final void rule__Var__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1959:1: ( ( 'range' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1960:1: ( 'range' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1960:1: ( 'range' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1961:1: 'range'
            {
             before(grammarAccess.getVarAccess().getRangeKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Var__Group__0__Impl4017); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1974:1: rule__Var__Group__1 : rule__Var__Group__1__Impl rule__Var__Group__2 ;
    public final void rule__Var__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1978:1: ( rule__Var__Group__1__Impl rule__Var__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1979:2: rule__Var__Group__1__Impl rule__Var__Group__2
            {
            pushFollow(FOLLOW_rule__Var__Group__1__Impl_in_rule__Var__Group__14048);
            rule__Var__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Var__Group__2_in_rule__Var__Group__14051);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1986:1: rule__Var__Group__1__Impl : ( ( rule__Var__NameAssignment_1 ) ) ;
    public final void rule__Var__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1990:1: ( ( ( rule__Var__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1991:1: ( ( rule__Var__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1991:1: ( ( rule__Var__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1992:1: ( rule__Var__NameAssignment_1 )
            {
             before(grammarAccess.getVarAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1993:1: ( rule__Var__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1993:2: rule__Var__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Var__NameAssignment_1_in_rule__Var__Group__1__Impl4078);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2003:1: rule__Var__Group__2 : rule__Var__Group__2__Impl rule__Var__Group__3 ;
    public final void rule__Var__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2007:1: ( rule__Var__Group__2__Impl rule__Var__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2008:2: rule__Var__Group__2__Impl rule__Var__Group__3
            {
            pushFollow(FOLLOW_rule__Var__Group__2__Impl_in_rule__Var__Group__24108);
            rule__Var__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Var__Group__3_in_rule__Var__Group__24111);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2015:1: rule__Var__Group__2__Impl : ( ( rule__Var__MinAssignment_2 ) ) ;
    public final void rule__Var__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2019:1: ( ( ( rule__Var__MinAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2020:1: ( ( rule__Var__MinAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2020:1: ( ( rule__Var__MinAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2021:1: ( rule__Var__MinAssignment_2 )
            {
             before(grammarAccess.getVarAccess().getMinAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2022:1: ( rule__Var__MinAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2022:2: rule__Var__MinAssignment_2
            {
            pushFollow(FOLLOW_rule__Var__MinAssignment_2_in_rule__Var__Group__2__Impl4138);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2032:1: rule__Var__Group__3 : rule__Var__Group__3__Impl ;
    public final void rule__Var__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2036:1: ( rule__Var__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2037:2: rule__Var__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Var__Group__3__Impl_in_rule__Var__Group__34168);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2043:1: rule__Var__Group__3__Impl : ( ( rule__Var__MaxAssignment_3 ) ) ;
    public final void rule__Var__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2047:1: ( ( ( rule__Var__MaxAssignment_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2048:1: ( ( rule__Var__MaxAssignment_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2048:1: ( ( rule__Var__MaxAssignment_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2049:1: ( rule__Var__MaxAssignment_3 )
            {
             before(grammarAccess.getVarAccess().getMaxAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2050:1: ( rule__Var__MaxAssignment_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2050:2: rule__Var__MaxAssignment_3
            {
            pushFollow(FOLLOW_rule__Var__MaxAssignment_3_in_rule__Var__Group__3__Impl4195);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2068:1: rule__Fluent__Group__0 : rule__Fluent__Group__0__Impl rule__Fluent__Group__1 ;
    public final void rule__Fluent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2072:1: ( rule__Fluent__Group__0__Impl rule__Fluent__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2073:2: rule__Fluent__Group__0__Impl rule__Fluent__Group__1
            {
            pushFollow(FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__04233);
            rule__Fluent__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__04236);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2080:1: rule__Fluent__Group__0__Impl : ( 'fluent' ) ;
    public final void rule__Fluent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2084:1: ( ( 'fluent' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2085:1: ( 'fluent' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2085:1: ( 'fluent' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2086:1: 'fluent'
            {
             before(grammarAccess.getFluentAccess().getFluentKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Fluent__Group__0__Impl4264); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2099:1: rule__Fluent__Group__1 : rule__Fluent__Group__1__Impl ;
    public final void rule__Fluent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2103:1: ( rule__Fluent__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2104:2: rule__Fluent__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__14295);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2110:1: rule__Fluent__Group__1__Impl : ( ( rule__Fluent__TermAssignment_1 ) ) ;
    public final void rule__Fluent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2114:1: ( ( ( rule__Fluent__TermAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2115:1: ( ( rule__Fluent__TermAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2115:1: ( ( rule__Fluent__TermAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2116:1: ( rule__Fluent__TermAssignment_1 )
            {
             before(grammarAccess.getFluentAccess().getTermAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2117:1: ( rule__Fluent__TermAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2117:2: rule__Fluent__TermAssignment_1
            {
            pushFollow(FOLLOW_rule__Fluent__TermAssignment_1_in_rule__Fluent__Group__1__Impl4322);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2131:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2135:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2136:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04356);
            rule__Event__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04359);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2143:1: rule__Event__Group__0__Impl : ( 'event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2147:1: ( ( 'event' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2148:1: ( 'event' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2148:1: ( 'event' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2149:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__Event__Group__0__Impl4387); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2162:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2166:1: ( rule__Event__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2167:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14418);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2173:1: rule__Event__Group__1__Impl : ( ( rule__Event__TermAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2177:1: ( ( ( rule__Event__TermAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2178:1: ( ( rule__Event__TermAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2178:1: ( ( rule__Event__TermAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2179:1: ( rule__Event__TermAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getTermAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2180:1: ( rule__Event__TermAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2180:2: rule__Event__TermAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__TermAssignment_1_in_rule__Event__Group__1__Impl4445);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2194:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2198:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2199:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__04479);
            rule__Term__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group__1_in_rule__Term__Group__04482);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2206:1: rule__Term__Group__0__Impl : ( ( rule__Term__NameAssignment_0 ) ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2210:1: ( ( ( rule__Term__NameAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2211:1: ( ( rule__Term__NameAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2211:1: ( ( rule__Term__NameAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2212:1: ( rule__Term__NameAssignment_0 )
            {
             before(grammarAccess.getTermAccess().getNameAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2213:1: ( rule__Term__NameAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2213:2: rule__Term__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Term__NameAssignment_0_in_rule__Term__Group__0__Impl4509);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2223:1: rule__Term__Group__1 : rule__Term__Group__1__Impl ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2227:1: ( rule__Term__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2228:2: rule__Term__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__14539);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2234:1: rule__Term__Group__1__Impl : ( ( rule__Term__Group_1__0 )? ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2238:1: ( ( ( rule__Term__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2239:1: ( ( rule__Term__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2239:1: ( ( rule__Term__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2240:1: ( rule__Term__Group_1__0 )?
            {
             before(grammarAccess.getTermAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2241:1: ( rule__Term__Group_1__0 )?
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
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2241:2: rule__Term__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl4566);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2255:1: rule__Term__Group_1__0 : rule__Term__Group_1__0__Impl rule__Term__Group_1__1 ;
    public final void rule__Term__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2259:1: ( rule__Term__Group_1__0__Impl rule__Term__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2260:2: rule__Term__Group_1__0__Impl rule__Term__Group_1__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04601);
            rule__Term__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04604);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2267:1: rule__Term__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Term__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2271:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2272:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2272:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2273:1: '('
            {
             before(grammarAccess.getTermAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Term__Group_1__0__Impl4632); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2286:1: rule__Term__Group_1__1 : rule__Term__Group_1__1__Impl rule__Term__Group_1__2 ;
    public final void rule__Term__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2290:1: ( rule__Term__Group_1__1__Impl rule__Term__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2291:2: rule__Term__Group_1__1__Impl rule__Term__Group_1__2
            {
            pushFollow(FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14663);
            rule__Term__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__2_in_rule__Term__Group_1__14666);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2298:1: rule__Term__Group_1__1__Impl : ( ( rule__Term__ArgsAssignment_1_1 )? ) ;
    public final void rule__Term__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2302:1: ( ( ( rule__Term__ArgsAssignment_1_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2303:1: ( ( rule__Term__ArgsAssignment_1_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2303:1: ( ( rule__Term__ArgsAssignment_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2304:1: ( rule__Term__ArgsAssignment_1_1 )?
            {
             before(grammarAccess.getTermAccess().getArgsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2305:1: ( rule__Term__ArgsAssignment_1_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2305:2: rule__Term__ArgsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Term__ArgsAssignment_1_1_in_rule__Term__Group_1__1__Impl4693);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2315:1: rule__Term__Group_1__2 : rule__Term__Group_1__2__Impl rule__Term__Group_1__3 ;
    public final void rule__Term__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2319:1: ( rule__Term__Group_1__2__Impl rule__Term__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2320:2: rule__Term__Group_1__2__Impl rule__Term__Group_1__3
            {
            pushFollow(FOLLOW_rule__Term__Group_1__2__Impl_in_rule__Term__Group_1__24724);
            rule__Term__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1__3_in_rule__Term__Group_1__24727);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2327:1: rule__Term__Group_1__2__Impl : ( ( rule__Term__Group_1_2__0 )* ) ;
    public final void rule__Term__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2331:1: ( ( ( rule__Term__Group_1_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2332:1: ( ( rule__Term__Group_1_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2332:1: ( ( rule__Term__Group_1_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2333:1: ( rule__Term__Group_1_2__0 )*
            {
             before(grammarAccess.getTermAccess().getGroup_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2334:1: ( rule__Term__Group_1_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2334:2: rule__Term__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Term__Group_1_2__0_in_rule__Term__Group_1__2__Impl4754);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2344:1: rule__Term__Group_1__3 : rule__Term__Group_1__3__Impl ;
    public final void rule__Term__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2348:1: ( rule__Term__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2349:2: rule__Term__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1__3__Impl_in_rule__Term__Group_1__34785);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2355:1: rule__Term__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Term__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2359:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2360:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2360:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2361:1: ')'
            {
             before(grammarAccess.getTermAccess().getRightParenthesisKeyword_1_3()); 
            match(input,23,FOLLOW_23_in_rule__Term__Group_1__3__Impl4813); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2382:1: rule__Term__Group_1_2__0 : rule__Term__Group_1_2__0__Impl rule__Term__Group_1_2__1 ;
    public final void rule__Term__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2386:1: ( rule__Term__Group_1_2__0__Impl rule__Term__Group_1_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2387:2: rule__Term__Group_1_2__0__Impl rule__Term__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Term__Group_1_2__0__Impl_in_rule__Term__Group_1_2__04852);
            rule__Term__Group_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Term__Group_1_2__1_in_rule__Term__Group_1_2__04855);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2394:1: rule__Term__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Term__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2398:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2399:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2399:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2400:1: ','
            {
             before(grammarAccess.getTermAccess().getCommaKeyword_1_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Term__Group_1_2__0__Impl4883); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2413:1: rule__Term__Group_1_2__1 : rule__Term__Group_1_2__1__Impl ;
    public final void rule__Term__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2417:1: ( rule__Term__Group_1_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2418:2: rule__Term__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Term__Group_1_2__1__Impl_in_rule__Term__Group_1_2__14914);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2424:1: rule__Term__Group_1_2__1__Impl : ( ( rule__Term__ArgsAssignment_1_2_1 ) ) ;
    public final void rule__Term__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2428:1: ( ( ( rule__Term__ArgsAssignment_1_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2429:1: ( ( rule__Term__ArgsAssignment_1_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2429:1: ( ( rule__Term__ArgsAssignment_1_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2430:1: ( rule__Term__ArgsAssignment_1_2_1 )
            {
             before(grammarAccess.getTermAccess().getArgsAssignment_1_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2431:1: ( rule__Term__ArgsAssignment_1_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2431:2: rule__Term__ArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Term__ArgsAssignment_1_2_1_in_rule__Term__Group_1_2__1__Impl4941);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2445:1: rule__HoldsAt__Group__0 : rule__HoldsAt__Group__0__Impl rule__HoldsAt__Group__1 ;
    public final void rule__HoldsAt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2449:1: ( rule__HoldsAt__Group__0__Impl rule__HoldsAt__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2450:2: rule__HoldsAt__Group__0__Impl rule__HoldsAt__Group__1
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__0__Impl_in_rule__HoldsAt__Group__04975);
            rule__HoldsAt__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__1_in_rule__HoldsAt__Group__04978);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2457:1: rule__HoldsAt__Group__0__Impl : ( 'HoldsAt' ) ;
    public final void rule__HoldsAt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2461:1: ( ( 'HoldsAt' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2462:1: ( 'HoldsAt' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2462:1: ( 'HoldsAt' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2463:1: 'HoldsAt'
            {
             before(grammarAccess.getHoldsAtAccess().getHoldsAtKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__HoldsAt__Group__0__Impl5006); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2476:1: rule__HoldsAt__Group__1 : rule__HoldsAt__Group__1__Impl rule__HoldsAt__Group__2 ;
    public final void rule__HoldsAt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2480:1: ( rule__HoldsAt__Group__1__Impl rule__HoldsAt__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2481:2: rule__HoldsAt__Group__1__Impl rule__HoldsAt__Group__2
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__1__Impl_in_rule__HoldsAt__Group__15037);
            rule__HoldsAt__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__2_in_rule__HoldsAt__Group__15040);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2488:1: rule__HoldsAt__Group__1__Impl : ( '(' ) ;
    public final void rule__HoldsAt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2492:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2493:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2493:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2494:1: '('
            {
             before(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__HoldsAt__Group__1__Impl5068); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2507:1: rule__HoldsAt__Group__2 : rule__HoldsAt__Group__2__Impl rule__HoldsAt__Group__3 ;
    public final void rule__HoldsAt__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2511:1: ( rule__HoldsAt__Group__2__Impl rule__HoldsAt__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2512:2: rule__HoldsAt__Group__2__Impl rule__HoldsAt__Group__3
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__2__Impl_in_rule__HoldsAt__Group__25099);
            rule__HoldsAt__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__3_in_rule__HoldsAt__Group__25102);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2519:1: rule__HoldsAt__Group__2__Impl : ( ( rule__HoldsAt__FluentAssignment_2 ) ) ;
    public final void rule__HoldsAt__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2523:1: ( ( ( rule__HoldsAt__FluentAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2524:1: ( ( rule__HoldsAt__FluentAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2524:1: ( ( rule__HoldsAt__FluentAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2525:1: ( rule__HoldsAt__FluentAssignment_2 )
            {
             before(grammarAccess.getHoldsAtAccess().getFluentAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2526:1: ( rule__HoldsAt__FluentAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2526:2: rule__HoldsAt__FluentAssignment_2
            {
            pushFollow(FOLLOW_rule__HoldsAt__FluentAssignment_2_in_rule__HoldsAt__Group__2__Impl5129);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2536:1: rule__HoldsAt__Group__3 : rule__HoldsAt__Group__3__Impl rule__HoldsAt__Group__4 ;
    public final void rule__HoldsAt__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2540:1: ( rule__HoldsAt__Group__3__Impl rule__HoldsAt__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2541:2: rule__HoldsAt__Group__3__Impl rule__HoldsAt__Group__4
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__3__Impl_in_rule__HoldsAt__Group__35159);
            rule__HoldsAt__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__4_in_rule__HoldsAt__Group__35162);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2548:1: rule__HoldsAt__Group__3__Impl : ( ( rule__HoldsAt__Group_3__0 )? ) ;
    public final void rule__HoldsAt__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2552:1: ( ( ( rule__HoldsAt__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2553:1: ( ( rule__HoldsAt__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2553:1: ( ( rule__HoldsAt__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2554:1: ( rule__HoldsAt__Group_3__0 )?
            {
             before(grammarAccess.getHoldsAtAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2555:1: ( rule__HoldsAt__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2555:2: rule__HoldsAt__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__HoldsAt__Group_3__0_in_rule__HoldsAt__Group__3__Impl5189);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2565:1: rule__HoldsAt__Group__4 : rule__HoldsAt__Group__4__Impl rule__HoldsAt__Group__5 ;
    public final void rule__HoldsAt__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2569:1: ( rule__HoldsAt__Group__4__Impl rule__HoldsAt__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2570:2: rule__HoldsAt__Group__4__Impl rule__HoldsAt__Group__5
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__4__Impl_in_rule__HoldsAt__Group__45220);
            rule__HoldsAt__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__5_in_rule__HoldsAt__Group__45223);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2577:1: rule__HoldsAt__Group__4__Impl : ( ',' ) ;
    public final void rule__HoldsAt__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2581:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2582:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2582:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2583:1: ','
            {
             before(grammarAccess.getHoldsAtAccess().getCommaKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__HoldsAt__Group__4__Impl5251); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2596:1: rule__HoldsAt__Group__5 : rule__HoldsAt__Group__5__Impl rule__HoldsAt__Group__6 ;
    public final void rule__HoldsAt__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2600:1: ( rule__HoldsAt__Group__5__Impl rule__HoldsAt__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2601:2: rule__HoldsAt__Group__5__Impl rule__HoldsAt__Group__6
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__5__Impl_in_rule__HoldsAt__Group__55282);
            rule__HoldsAt__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group__6_in_rule__HoldsAt__Group__55285);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2608:1: rule__HoldsAt__Group__5__Impl : ( ( rule__HoldsAt__TimeAssignment_5 ) ) ;
    public final void rule__HoldsAt__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2612:1: ( ( ( rule__HoldsAt__TimeAssignment_5 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2613:1: ( ( rule__HoldsAt__TimeAssignment_5 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2613:1: ( ( rule__HoldsAt__TimeAssignment_5 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2614:1: ( rule__HoldsAt__TimeAssignment_5 )
            {
             before(grammarAccess.getHoldsAtAccess().getTimeAssignment_5()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2615:1: ( rule__HoldsAt__TimeAssignment_5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2615:2: rule__HoldsAt__TimeAssignment_5
            {
            pushFollow(FOLLOW_rule__HoldsAt__TimeAssignment_5_in_rule__HoldsAt__Group__5__Impl5312);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2625:1: rule__HoldsAt__Group__6 : rule__HoldsAt__Group__6__Impl ;
    public final void rule__HoldsAt__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2629:1: ( rule__HoldsAt__Group__6__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2630:2: rule__HoldsAt__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group__6__Impl_in_rule__HoldsAt__Group__65342);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2636:1: rule__HoldsAt__Group__6__Impl : ( ')' ) ;
    public final void rule__HoldsAt__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2640:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2641:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2641:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2642:1: ')'
            {
             before(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__HoldsAt__Group__6__Impl5370); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2669:1: rule__HoldsAt__Group_3__0 : rule__HoldsAt__Group_3__0__Impl rule__HoldsAt__Group_3__1 ;
    public final void rule__HoldsAt__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2673:1: ( rule__HoldsAt__Group_3__0__Impl rule__HoldsAt__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2674:2: rule__HoldsAt__Group_3__0__Impl rule__HoldsAt__Group_3__1
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3__0__Impl_in_rule__HoldsAt__Group_3__05415);
            rule__HoldsAt__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group_3__1_in_rule__HoldsAt__Group_3__05418);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2681:1: rule__HoldsAt__Group_3__0__Impl : ( '(' ) ;
    public final void rule__HoldsAt__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2685:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2686:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2686:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2687:1: '('
            {
             before(grammarAccess.getHoldsAtAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__HoldsAt__Group_3__0__Impl5446); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2700:1: rule__HoldsAt__Group_3__1 : rule__HoldsAt__Group_3__1__Impl rule__HoldsAt__Group_3__2 ;
    public final void rule__HoldsAt__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2704:1: ( rule__HoldsAt__Group_3__1__Impl rule__HoldsAt__Group_3__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2705:2: rule__HoldsAt__Group_3__1__Impl rule__HoldsAt__Group_3__2
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3__1__Impl_in_rule__HoldsAt__Group_3__15477);
            rule__HoldsAt__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group_3__2_in_rule__HoldsAt__Group_3__15480);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2712:1: rule__HoldsAt__Group_3__1__Impl : ( ( rule__HoldsAt__ArgsAssignment_3_1 )? ) ;
    public final void rule__HoldsAt__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2716:1: ( ( ( rule__HoldsAt__ArgsAssignment_3_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2717:1: ( ( rule__HoldsAt__ArgsAssignment_3_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2717:1: ( ( rule__HoldsAt__ArgsAssignment_3_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2718:1: ( rule__HoldsAt__ArgsAssignment_3_1 )?
            {
             before(grammarAccess.getHoldsAtAccess().getArgsAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2719:1: ( rule__HoldsAt__ArgsAssignment_3_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2719:2: rule__HoldsAt__ArgsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__HoldsAt__ArgsAssignment_3_1_in_rule__HoldsAt__Group_3__1__Impl5507);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2729:1: rule__HoldsAt__Group_3__2 : rule__HoldsAt__Group_3__2__Impl rule__HoldsAt__Group_3__3 ;
    public final void rule__HoldsAt__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2733:1: ( rule__HoldsAt__Group_3__2__Impl rule__HoldsAt__Group_3__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2734:2: rule__HoldsAt__Group_3__2__Impl rule__HoldsAt__Group_3__3
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3__2__Impl_in_rule__HoldsAt__Group_3__25538);
            rule__HoldsAt__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group_3__3_in_rule__HoldsAt__Group_3__25541);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2741:1: rule__HoldsAt__Group_3__2__Impl : ( ( rule__HoldsAt__Group_3_2__0 )* ) ;
    public final void rule__HoldsAt__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2745:1: ( ( ( rule__HoldsAt__Group_3_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2746:1: ( ( rule__HoldsAt__Group_3_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2746:1: ( ( rule__HoldsAt__Group_3_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2747:1: ( rule__HoldsAt__Group_3_2__0 )*
            {
             before(grammarAccess.getHoldsAtAccess().getGroup_3_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2748:1: ( rule__HoldsAt__Group_3_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2748:2: rule__HoldsAt__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__HoldsAt__Group_3_2__0_in_rule__HoldsAt__Group_3__2__Impl5568);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2758:1: rule__HoldsAt__Group_3__3 : rule__HoldsAt__Group_3__3__Impl ;
    public final void rule__HoldsAt__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2762:1: ( rule__HoldsAt__Group_3__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2763:2: rule__HoldsAt__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3__3__Impl_in_rule__HoldsAt__Group_3__35599);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2769:1: rule__HoldsAt__Group_3__3__Impl : ( ')' ) ;
    public final void rule__HoldsAt__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2773:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2774:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2774:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2775:1: ')'
            {
             before(grammarAccess.getHoldsAtAccess().getRightParenthesisKeyword_3_3()); 
            match(input,23,FOLLOW_23_in_rule__HoldsAt__Group_3__3__Impl5627); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2796:1: rule__HoldsAt__Group_3_2__0 : rule__HoldsAt__Group_3_2__0__Impl rule__HoldsAt__Group_3_2__1 ;
    public final void rule__HoldsAt__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2800:1: ( rule__HoldsAt__Group_3_2__0__Impl rule__HoldsAt__Group_3_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2801:2: rule__HoldsAt__Group_3_2__0__Impl rule__HoldsAt__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3_2__0__Impl_in_rule__HoldsAt__Group_3_2__05666);
            rule__HoldsAt__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HoldsAt__Group_3_2__1_in_rule__HoldsAt__Group_3_2__05669);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2808:1: rule__HoldsAt__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__HoldsAt__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2812:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2813:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2813:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2814:1: ','
            {
             before(grammarAccess.getHoldsAtAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_21_in_rule__HoldsAt__Group_3_2__0__Impl5697); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2827:1: rule__HoldsAt__Group_3_2__1 : rule__HoldsAt__Group_3_2__1__Impl ;
    public final void rule__HoldsAt__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2831:1: ( rule__HoldsAt__Group_3_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2832:2: rule__HoldsAt__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__HoldsAt__Group_3_2__1__Impl_in_rule__HoldsAt__Group_3_2__15728);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2838:1: rule__HoldsAt__Group_3_2__1__Impl : ( ( rule__HoldsAt__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__HoldsAt__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2842:1: ( ( ( rule__HoldsAt__ArgsAssignment_3_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2843:1: ( ( rule__HoldsAt__ArgsAssignment_3_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2843:1: ( ( rule__HoldsAt__ArgsAssignment_3_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2844:1: ( rule__HoldsAt__ArgsAssignment_3_2_1 )
            {
             before(grammarAccess.getHoldsAtAccess().getArgsAssignment_3_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2845:1: ( rule__HoldsAt__ArgsAssignment_3_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2845:2: rule__HoldsAt__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__HoldsAt__ArgsAssignment_3_2_1_in_rule__HoldsAt__Group_3_2__1__Impl5755);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2859:1: rule__Happens__Group__0 : rule__Happens__Group__0__Impl rule__Happens__Group__1 ;
    public final void rule__Happens__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2863:1: ( rule__Happens__Group__0__Impl rule__Happens__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2864:2: rule__Happens__Group__0__Impl rule__Happens__Group__1
            {
            pushFollow(FOLLOW_rule__Happens__Group__0__Impl_in_rule__Happens__Group__05789);
            rule__Happens__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__1_in_rule__Happens__Group__05792);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2871:1: rule__Happens__Group__0__Impl : ( 'Happens' ) ;
    public final void rule__Happens__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2875:1: ( ( 'Happens' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2876:1: ( 'Happens' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2876:1: ( 'Happens' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2877:1: 'Happens'
            {
             before(grammarAccess.getHappensAccess().getHappensKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Happens__Group__0__Impl5820); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2890:1: rule__Happens__Group__1 : rule__Happens__Group__1__Impl rule__Happens__Group__2 ;
    public final void rule__Happens__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2894:1: ( rule__Happens__Group__1__Impl rule__Happens__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2895:2: rule__Happens__Group__1__Impl rule__Happens__Group__2
            {
            pushFollow(FOLLOW_rule__Happens__Group__1__Impl_in_rule__Happens__Group__15851);
            rule__Happens__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__2_in_rule__Happens__Group__15854);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2902:1: rule__Happens__Group__1__Impl : ( '(' ) ;
    public final void rule__Happens__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2906:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2907:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2907:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2908:1: '('
            {
             before(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Happens__Group__1__Impl5882); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2921:1: rule__Happens__Group__2 : rule__Happens__Group__2__Impl rule__Happens__Group__3 ;
    public final void rule__Happens__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2925:1: ( rule__Happens__Group__2__Impl rule__Happens__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2926:2: rule__Happens__Group__2__Impl rule__Happens__Group__3
            {
            pushFollow(FOLLOW_rule__Happens__Group__2__Impl_in_rule__Happens__Group__25913);
            rule__Happens__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__3_in_rule__Happens__Group__25916);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2933:1: rule__Happens__Group__2__Impl : ( ( rule__Happens__EventAssignment_2 ) ) ;
    public final void rule__Happens__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2937:1: ( ( ( rule__Happens__EventAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2938:1: ( ( rule__Happens__EventAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2938:1: ( ( rule__Happens__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2939:1: ( rule__Happens__EventAssignment_2 )
            {
             before(grammarAccess.getHappensAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2940:1: ( rule__Happens__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2940:2: rule__Happens__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Happens__EventAssignment_2_in_rule__Happens__Group__2__Impl5943);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2950:1: rule__Happens__Group__3 : rule__Happens__Group__3__Impl rule__Happens__Group__4 ;
    public final void rule__Happens__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2954:1: ( rule__Happens__Group__3__Impl rule__Happens__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2955:2: rule__Happens__Group__3__Impl rule__Happens__Group__4
            {
            pushFollow(FOLLOW_rule__Happens__Group__3__Impl_in_rule__Happens__Group__35973);
            rule__Happens__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__4_in_rule__Happens__Group__35976);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2962:1: rule__Happens__Group__3__Impl : ( ( rule__Happens__Group_3__0 )? ) ;
    public final void rule__Happens__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2966:1: ( ( ( rule__Happens__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2967:1: ( ( rule__Happens__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2967:1: ( ( rule__Happens__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2968:1: ( rule__Happens__Group_3__0 )?
            {
             before(grammarAccess.getHappensAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2969:1: ( rule__Happens__Group_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==22) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2969:2: rule__Happens__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Happens__Group_3__0_in_rule__Happens__Group__3__Impl6003);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2979:1: rule__Happens__Group__4 : rule__Happens__Group__4__Impl rule__Happens__Group__5 ;
    public final void rule__Happens__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2983:1: ( rule__Happens__Group__4__Impl rule__Happens__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2984:2: rule__Happens__Group__4__Impl rule__Happens__Group__5
            {
            pushFollow(FOLLOW_rule__Happens__Group__4__Impl_in_rule__Happens__Group__46034);
            rule__Happens__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__5_in_rule__Happens__Group__46037);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2991:1: rule__Happens__Group__4__Impl : ( ',' ) ;
    public final void rule__Happens__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2995:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2996:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2996:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2997:1: ','
            {
             before(grammarAccess.getHappensAccess().getCommaKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Happens__Group__4__Impl6065); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3010:1: rule__Happens__Group__5 : rule__Happens__Group__5__Impl rule__Happens__Group__6 ;
    public final void rule__Happens__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3014:1: ( rule__Happens__Group__5__Impl rule__Happens__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3015:2: rule__Happens__Group__5__Impl rule__Happens__Group__6
            {
            pushFollow(FOLLOW_rule__Happens__Group__5__Impl_in_rule__Happens__Group__56096);
            rule__Happens__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group__6_in_rule__Happens__Group__56099);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3022:1: rule__Happens__Group__5__Impl : ( ( rule__Happens__TimeAssignment_5 ) ) ;
    public final void rule__Happens__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3026:1: ( ( ( rule__Happens__TimeAssignment_5 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3027:1: ( ( rule__Happens__TimeAssignment_5 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3027:1: ( ( rule__Happens__TimeAssignment_5 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3028:1: ( rule__Happens__TimeAssignment_5 )
            {
             before(grammarAccess.getHappensAccess().getTimeAssignment_5()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3029:1: ( rule__Happens__TimeAssignment_5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3029:2: rule__Happens__TimeAssignment_5
            {
            pushFollow(FOLLOW_rule__Happens__TimeAssignment_5_in_rule__Happens__Group__5__Impl6126);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3039:1: rule__Happens__Group__6 : rule__Happens__Group__6__Impl ;
    public final void rule__Happens__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3043:1: ( rule__Happens__Group__6__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3044:2: rule__Happens__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Happens__Group__6__Impl_in_rule__Happens__Group__66156);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3050:1: rule__Happens__Group__6__Impl : ( ')' ) ;
    public final void rule__Happens__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3054:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3055:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3055:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3056:1: ')'
            {
             before(grammarAccess.getHappensAccess().getRightParenthesisKeyword_6()); 
            match(input,23,FOLLOW_23_in_rule__Happens__Group__6__Impl6184); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3083:1: rule__Happens__Group_3__0 : rule__Happens__Group_3__0__Impl rule__Happens__Group_3__1 ;
    public final void rule__Happens__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3087:1: ( rule__Happens__Group_3__0__Impl rule__Happens__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3088:2: rule__Happens__Group_3__0__Impl rule__Happens__Group_3__1
            {
            pushFollow(FOLLOW_rule__Happens__Group_3__0__Impl_in_rule__Happens__Group_3__06229);
            rule__Happens__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group_3__1_in_rule__Happens__Group_3__06232);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3095:1: rule__Happens__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Happens__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3099:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3100:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3100:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3101:1: '('
            {
             before(grammarAccess.getHappensAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Happens__Group_3__0__Impl6260); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3114:1: rule__Happens__Group_3__1 : rule__Happens__Group_3__1__Impl rule__Happens__Group_3__2 ;
    public final void rule__Happens__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3118:1: ( rule__Happens__Group_3__1__Impl rule__Happens__Group_3__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3119:2: rule__Happens__Group_3__1__Impl rule__Happens__Group_3__2
            {
            pushFollow(FOLLOW_rule__Happens__Group_3__1__Impl_in_rule__Happens__Group_3__16291);
            rule__Happens__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group_3__2_in_rule__Happens__Group_3__16294);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3126:1: rule__Happens__Group_3__1__Impl : ( ( rule__Happens__ArgsAssignment_3_1 )? ) ;
    public final void rule__Happens__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3130:1: ( ( ( rule__Happens__ArgsAssignment_3_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3131:1: ( ( rule__Happens__ArgsAssignment_3_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3131:1: ( ( rule__Happens__ArgsAssignment_3_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3132:1: ( rule__Happens__ArgsAssignment_3_1 )?
            {
             before(grammarAccess.getHappensAccess().getArgsAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3133:1: ( rule__Happens__ArgsAssignment_3_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_ID) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3133:2: rule__Happens__ArgsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Happens__ArgsAssignment_3_1_in_rule__Happens__Group_3__1__Impl6321);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3143:1: rule__Happens__Group_3__2 : rule__Happens__Group_3__2__Impl rule__Happens__Group_3__3 ;
    public final void rule__Happens__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3147:1: ( rule__Happens__Group_3__2__Impl rule__Happens__Group_3__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3148:2: rule__Happens__Group_3__2__Impl rule__Happens__Group_3__3
            {
            pushFollow(FOLLOW_rule__Happens__Group_3__2__Impl_in_rule__Happens__Group_3__26352);
            rule__Happens__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group_3__3_in_rule__Happens__Group_3__26355);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3155:1: rule__Happens__Group_3__2__Impl : ( ( rule__Happens__Group_3_2__0 )* ) ;
    public final void rule__Happens__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3159:1: ( ( ( rule__Happens__Group_3_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3160:1: ( ( rule__Happens__Group_3_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3160:1: ( ( rule__Happens__Group_3_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3161:1: ( rule__Happens__Group_3_2__0 )*
            {
             before(grammarAccess.getHappensAccess().getGroup_3_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3162:1: ( rule__Happens__Group_3_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3162:2: rule__Happens__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Happens__Group_3_2__0_in_rule__Happens__Group_3__2__Impl6382);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3172:1: rule__Happens__Group_3__3 : rule__Happens__Group_3__3__Impl ;
    public final void rule__Happens__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3176:1: ( rule__Happens__Group_3__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3177:2: rule__Happens__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Happens__Group_3__3__Impl_in_rule__Happens__Group_3__36413);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3183:1: rule__Happens__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Happens__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3187:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3188:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3188:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3189:1: ')'
            {
             before(grammarAccess.getHappensAccess().getRightParenthesisKeyword_3_3()); 
            match(input,23,FOLLOW_23_in_rule__Happens__Group_3__3__Impl6441); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3210:1: rule__Happens__Group_3_2__0 : rule__Happens__Group_3_2__0__Impl rule__Happens__Group_3_2__1 ;
    public final void rule__Happens__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3214:1: ( rule__Happens__Group_3_2__0__Impl rule__Happens__Group_3_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3215:2: rule__Happens__Group_3_2__0__Impl rule__Happens__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Happens__Group_3_2__0__Impl_in_rule__Happens__Group_3_2__06480);
            rule__Happens__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Happens__Group_3_2__1_in_rule__Happens__Group_3_2__06483);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3222:1: rule__Happens__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Happens__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3226:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3227:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3227:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3228:1: ','
            {
             before(grammarAccess.getHappensAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Happens__Group_3_2__0__Impl6511); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3241:1: rule__Happens__Group_3_2__1 : rule__Happens__Group_3_2__1__Impl ;
    public final void rule__Happens__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3245:1: ( rule__Happens__Group_3_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3246:2: rule__Happens__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Happens__Group_3_2__1__Impl_in_rule__Happens__Group_3_2__16542);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3252:1: rule__Happens__Group_3_2__1__Impl : ( ( rule__Happens__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__Happens__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3256:1: ( ( ( rule__Happens__ArgsAssignment_3_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3257:1: ( ( rule__Happens__ArgsAssignment_3_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3257:1: ( ( rule__Happens__ArgsAssignment_3_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3258:1: ( rule__Happens__ArgsAssignment_3_2_1 )
            {
             before(grammarAccess.getHappensAccess().getArgsAssignment_3_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3259:1: ( rule__Happens__ArgsAssignment_3_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3259:2: rule__Happens__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Happens__ArgsAssignment_3_2_1_in_rule__Happens__Group_3_2__1__Impl6569);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3273:1: rule__Initiates__Group__0 : rule__Initiates__Group__0__Impl rule__Initiates__Group__1 ;
    public final void rule__Initiates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3277:1: ( rule__Initiates__Group__0__Impl rule__Initiates__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3278:2: rule__Initiates__Group__0__Impl rule__Initiates__Group__1
            {
            pushFollow(FOLLOW_rule__Initiates__Group__0__Impl_in_rule__Initiates__Group__06603);
            rule__Initiates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__1_in_rule__Initiates__Group__06606);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3285:1: rule__Initiates__Group__0__Impl : ( 'Initiates' ) ;
    public final void rule__Initiates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3289:1: ( ( 'Initiates' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3290:1: ( 'Initiates' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3290:1: ( 'Initiates' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3291:1: 'Initiates'
            {
             before(grammarAccess.getInitiatesAccess().getInitiatesKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Initiates__Group__0__Impl6634); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3304:1: rule__Initiates__Group__1 : rule__Initiates__Group__1__Impl rule__Initiates__Group__2 ;
    public final void rule__Initiates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3308:1: ( rule__Initiates__Group__1__Impl rule__Initiates__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3309:2: rule__Initiates__Group__1__Impl rule__Initiates__Group__2
            {
            pushFollow(FOLLOW_rule__Initiates__Group__1__Impl_in_rule__Initiates__Group__16665);
            rule__Initiates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__2_in_rule__Initiates__Group__16668);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3316:1: rule__Initiates__Group__1__Impl : ( '(' ) ;
    public final void rule__Initiates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3320:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3321:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3321:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3322:1: '('
            {
             before(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Initiates__Group__1__Impl6696); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3335:1: rule__Initiates__Group__2 : rule__Initiates__Group__2__Impl rule__Initiates__Group__3 ;
    public final void rule__Initiates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3339:1: ( rule__Initiates__Group__2__Impl rule__Initiates__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3340:2: rule__Initiates__Group__2__Impl rule__Initiates__Group__3
            {
            pushFollow(FOLLOW_rule__Initiates__Group__2__Impl_in_rule__Initiates__Group__26727);
            rule__Initiates__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__3_in_rule__Initiates__Group__26730);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3347:1: rule__Initiates__Group__2__Impl : ( ( rule__Initiates__EventAssignment_2 ) ) ;
    public final void rule__Initiates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3351:1: ( ( ( rule__Initiates__EventAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3352:1: ( ( rule__Initiates__EventAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3352:1: ( ( rule__Initiates__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3353:1: ( rule__Initiates__EventAssignment_2 )
            {
             before(grammarAccess.getInitiatesAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3354:1: ( rule__Initiates__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3354:2: rule__Initiates__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Initiates__EventAssignment_2_in_rule__Initiates__Group__2__Impl6757);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3364:1: rule__Initiates__Group__3 : rule__Initiates__Group__3__Impl rule__Initiates__Group__4 ;
    public final void rule__Initiates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3368:1: ( rule__Initiates__Group__3__Impl rule__Initiates__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3369:2: rule__Initiates__Group__3__Impl rule__Initiates__Group__4
            {
            pushFollow(FOLLOW_rule__Initiates__Group__3__Impl_in_rule__Initiates__Group__36787);
            rule__Initiates__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__4_in_rule__Initiates__Group__36790);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3376:1: rule__Initiates__Group__3__Impl : ( ( rule__Initiates__Group_3__0 )? ) ;
    public final void rule__Initiates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3380:1: ( ( ( rule__Initiates__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3381:1: ( ( rule__Initiates__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3381:1: ( ( rule__Initiates__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3382:1: ( rule__Initiates__Group_3__0 )?
            {
             before(grammarAccess.getInitiatesAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3383:1: ( rule__Initiates__Group_3__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==22) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3383:2: rule__Initiates__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Initiates__Group_3__0_in_rule__Initiates__Group__3__Impl6817);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3393:1: rule__Initiates__Group__4 : rule__Initiates__Group__4__Impl rule__Initiates__Group__5 ;
    public final void rule__Initiates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3397:1: ( rule__Initiates__Group__4__Impl rule__Initiates__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3398:2: rule__Initiates__Group__4__Impl rule__Initiates__Group__5
            {
            pushFollow(FOLLOW_rule__Initiates__Group__4__Impl_in_rule__Initiates__Group__46848);
            rule__Initiates__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__5_in_rule__Initiates__Group__46851);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3405:1: rule__Initiates__Group__4__Impl : ( ',' ) ;
    public final void rule__Initiates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3409:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3410:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3410:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3411:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group__4__Impl6879); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3424:1: rule__Initiates__Group__5 : rule__Initiates__Group__5__Impl rule__Initiates__Group__6 ;
    public final void rule__Initiates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3428:1: ( rule__Initiates__Group__5__Impl rule__Initiates__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3429:2: rule__Initiates__Group__5__Impl rule__Initiates__Group__6
            {
            pushFollow(FOLLOW_rule__Initiates__Group__5__Impl_in_rule__Initiates__Group__56910);
            rule__Initiates__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__6_in_rule__Initiates__Group__56913);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3436:1: rule__Initiates__Group__5__Impl : ( ( rule__Initiates__FluentAssignment_5 ) ) ;
    public final void rule__Initiates__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3440:1: ( ( ( rule__Initiates__FluentAssignment_5 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3441:1: ( ( rule__Initiates__FluentAssignment_5 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3441:1: ( ( rule__Initiates__FluentAssignment_5 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3442:1: ( rule__Initiates__FluentAssignment_5 )
            {
             before(grammarAccess.getInitiatesAccess().getFluentAssignment_5()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3443:1: ( rule__Initiates__FluentAssignment_5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3443:2: rule__Initiates__FluentAssignment_5
            {
            pushFollow(FOLLOW_rule__Initiates__FluentAssignment_5_in_rule__Initiates__Group__5__Impl6940);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3453:1: rule__Initiates__Group__6 : rule__Initiates__Group__6__Impl rule__Initiates__Group__7 ;
    public final void rule__Initiates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3457:1: ( rule__Initiates__Group__6__Impl rule__Initiates__Group__7 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3458:2: rule__Initiates__Group__6__Impl rule__Initiates__Group__7
            {
            pushFollow(FOLLOW_rule__Initiates__Group__6__Impl_in_rule__Initiates__Group__66970);
            rule__Initiates__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__7_in_rule__Initiates__Group__66973);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3465:1: rule__Initiates__Group__6__Impl : ( ( rule__Initiates__Group_6__0 )? ) ;
    public final void rule__Initiates__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3469:1: ( ( ( rule__Initiates__Group_6__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3470:1: ( ( rule__Initiates__Group_6__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3470:1: ( ( rule__Initiates__Group_6__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3471:1: ( rule__Initiates__Group_6__0 )?
            {
             before(grammarAccess.getInitiatesAccess().getGroup_6()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3472:1: ( rule__Initiates__Group_6__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==22) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3472:2: rule__Initiates__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Initiates__Group_6__0_in_rule__Initiates__Group__6__Impl7000);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3482:1: rule__Initiates__Group__7 : rule__Initiates__Group__7__Impl rule__Initiates__Group__8 ;
    public final void rule__Initiates__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3486:1: ( rule__Initiates__Group__7__Impl rule__Initiates__Group__8 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3487:2: rule__Initiates__Group__7__Impl rule__Initiates__Group__8
            {
            pushFollow(FOLLOW_rule__Initiates__Group__7__Impl_in_rule__Initiates__Group__77031);
            rule__Initiates__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__8_in_rule__Initiates__Group__77034);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3494:1: rule__Initiates__Group__7__Impl : ( ',' ) ;
    public final void rule__Initiates__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3498:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3499:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3499:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3500:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group__7__Impl7062); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3513:1: rule__Initiates__Group__8 : rule__Initiates__Group__8__Impl rule__Initiates__Group__9 ;
    public final void rule__Initiates__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3517:1: ( rule__Initiates__Group__8__Impl rule__Initiates__Group__9 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3518:2: rule__Initiates__Group__8__Impl rule__Initiates__Group__9
            {
            pushFollow(FOLLOW_rule__Initiates__Group__8__Impl_in_rule__Initiates__Group__87093);
            rule__Initiates__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group__9_in_rule__Initiates__Group__87096);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3525:1: rule__Initiates__Group__8__Impl : ( ( rule__Initiates__TimeAssignment_8 ) ) ;
    public final void rule__Initiates__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3529:1: ( ( ( rule__Initiates__TimeAssignment_8 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3530:1: ( ( rule__Initiates__TimeAssignment_8 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3530:1: ( ( rule__Initiates__TimeAssignment_8 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3531:1: ( rule__Initiates__TimeAssignment_8 )
            {
             before(grammarAccess.getInitiatesAccess().getTimeAssignment_8()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3532:1: ( rule__Initiates__TimeAssignment_8 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3532:2: rule__Initiates__TimeAssignment_8
            {
            pushFollow(FOLLOW_rule__Initiates__TimeAssignment_8_in_rule__Initiates__Group__8__Impl7123);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3542:1: rule__Initiates__Group__9 : rule__Initiates__Group__9__Impl ;
    public final void rule__Initiates__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3546:1: ( rule__Initiates__Group__9__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3547:2: rule__Initiates__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Initiates__Group__9__Impl_in_rule__Initiates__Group__97153);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3553:1: rule__Initiates__Group__9__Impl : ( ')' ) ;
    public final void rule__Initiates__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3557:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3558:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3558:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3559:1: ')'
            {
             before(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Initiates__Group__9__Impl7181); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3592:1: rule__Initiates__Group_3__0 : rule__Initiates__Group_3__0__Impl rule__Initiates__Group_3__1 ;
    public final void rule__Initiates__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3596:1: ( rule__Initiates__Group_3__0__Impl rule__Initiates__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3597:2: rule__Initiates__Group_3__0__Impl rule__Initiates__Group_3__1
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3__0__Impl_in_rule__Initiates__Group_3__07232);
            rule__Initiates__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_3__1_in_rule__Initiates__Group_3__07235);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3604:1: rule__Initiates__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Initiates__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3608:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3609:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3609:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3610:1: '('
            {
             before(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Initiates__Group_3__0__Impl7263); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3623:1: rule__Initiates__Group_3__1 : rule__Initiates__Group_3__1__Impl rule__Initiates__Group_3__2 ;
    public final void rule__Initiates__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3627:1: ( rule__Initiates__Group_3__1__Impl rule__Initiates__Group_3__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3628:2: rule__Initiates__Group_3__1__Impl rule__Initiates__Group_3__2
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3__1__Impl_in_rule__Initiates__Group_3__17294);
            rule__Initiates__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_3__2_in_rule__Initiates__Group_3__17297);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3635:1: rule__Initiates__Group_3__1__Impl : ( ( rule__Initiates__ArgsAssignment_3_1 )? ) ;
    public final void rule__Initiates__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3639:1: ( ( ( rule__Initiates__ArgsAssignment_3_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3640:1: ( ( rule__Initiates__ArgsAssignment_3_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3640:1: ( ( rule__Initiates__ArgsAssignment_3_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3641:1: ( rule__Initiates__ArgsAssignment_3_1 )?
            {
             before(grammarAccess.getInitiatesAccess().getArgsAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3642:1: ( rule__Initiates__ArgsAssignment_3_1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3642:2: rule__Initiates__ArgsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Initiates__ArgsAssignment_3_1_in_rule__Initiates__Group_3__1__Impl7324);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3652:1: rule__Initiates__Group_3__2 : rule__Initiates__Group_3__2__Impl rule__Initiates__Group_3__3 ;
    public final void rule__Initiates__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3656:1: ( rule__Initiates__Group_3__2__Impl rule__Initiates__Group_3__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3657:2: rule__Initiates__Group_3__2__Impl rule__Initiates__Group_3__3
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3__2__Impl_in_rule__Initiates__Group_3__27355);
            rule__Initiates__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_3__3_in_rule__Initiates__Group_3__27358);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3664:1: rule__Initiates__Group_3__2__Impl : ( ( rule__Initiates__Group_3_2__0 )* ) ;
    public final void rule__Initiates__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3668:1: ( ( ( rule__Initiates__Group_3_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3669:1: ( ( rule__Initiates__Group_3_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3669:1: ( ( rule__Initiates__Group_3_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3670:1: ( rule__Initiates__Group_3_2__0 )*
            {
             before(grammarAccess.getInitiatesAccess().getGroup_3_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3671:1: ( rule__Initiates__Group_3_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3671:2: rule__Initiates__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Initiates__Group_3_2__0_in_rule__Initiates__Group_3__2__Impl7385);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3681:1: rule__Initiates__Group_3__3 : rule__Initiates__Group_3__3__Impl ;
    public final void rule__Initiates__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3685:1: ( rule__Initiates__Group_3__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3686:2: rule__Initiates__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3__3__Impl_in_rule__Initiates__Group_3__37416);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3692:1: rule__Initiates__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Initiates__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3696:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3697:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3697:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3698:1: ')'
            {
             before(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_3_3()); 
            match(input,23,FOLLOW_23_in_rule__Initiates__Group_3__3__Impl7444); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3719:1: rule__Initiates__Group_3_2__0 : rule__Initiates__Group_3_2__0__Impl rule__Initiates__Group_3_2__1 ;
    public final void rule__Initiates__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3723:1: ( rule__Initiates__Group_3_2__0__Impl rule__Initiates__Group_3_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3724:2: rule__Initiates__Group_3_2__0__Impl rule__Initiates__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3_2__0__Impl_in_rule__Initiates__Group_3_2__07483);
            rule__Initiates__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_3_2__1_in_rule__Initiates__Group_3_2__07486);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3731:1: rule__Initiates__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Initiates__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3735:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3736:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3736:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3737:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group_3_2__0__Impl7514); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3750:1: rule__Initiates__Group_3_2__1 : rule__Initiates__Group_3_2__1__Impl ;
    public final void rule__Initiates__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3754:1: ( rule__Initiates__Group_3_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3755:2: rule__Initiates__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Initiates__Group_3_2__1__Impl_in_rule__Initiates__Group_3_2__17545);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3761:1: rule__Initiates__Group_3_2__1__Impl : ( ( rule__Initiates__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__Initiates__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3765:1: ( ( ( rule__Initiates__ArgsAssignment_3_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3766:1: ( ( rule__Initiates__ArgsAssignment_3_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3766:1: ( ( rule__Initiates__ArgsAssignment_3_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3767:1: ( rule__Initiates__ArgsAssignment_3_2_1 )
            {
             before(grammarAccess.getInitiatesAccess().getArgsAssignment_3_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3768:1: ( rule__Initiates__ArgsAssignment_3_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3768:2: rule__Initiates__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Initiates__ArgsAssignment_3_2_1_in_rule__Initiates__Group_3_2__1__Impl7572);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3782:1: rule__Initiates__Group_6__0 : rule__Initiates__Group_6__0__Impl rule__Initiates__Group_6__1 ;
    public final void rule__Initiates__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3786:1: ( rule__Initiates__Group_6__0__Impl rule__Initiates__Group_6__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3787:2: rule__Initiates__Group_6__0__Impl rule__Initiates__Group_6__1
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6__0__Impl_in_rule__Initiates__Group_6__07606);
            rule__Initiates__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_6__1_in_rule__Initiates__Group_6__07609);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3794:1: rule__Initiates__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Initiates__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3798:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3799:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3799:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3800:1: '('
            {
             before(grammarAccess.getInitiatesAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,22,FOLLOW_22_in_rule__Initiates__Group_6__0__Impl7637); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3813:1: rule__Initiates__Group_6__1 : rule__Initiates__Group_6__1__Impl rule__Initiates__Group_6__2 ;
    public final void rule__Initiates__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3817:1: ( rule__Initiates__Group_6__1__Impl rule__Initiates__Group_6__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3818:2: rule__Initiates__Group_6__1__Impl rule__Initiates__Group_6__2
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6__1__Impl_in_rule__Initiates__Group_6__17668);
            rule__Initiates__Group_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_6__2_in_rule__Initiates__Group_6__17671);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3825:1: rule__Initiates__Group_6__1__Impl : ( ( rule__Initiates__Args2Assignment_6_1 )? ) ;
    public final void rule__Initiates__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3829:1: ( ( ( rule__Initiates__Args2Assignment_6_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3830:1: ( ( rule__Initiates__Args2Assignment_6_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3830:1: ( ( rule__Initiates__Args2Assignment_6_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3831:1: ( rule__Initiates__Args2Assignment_6_1 )?
            {
             before(grammarAccess.getInitiatesAccess().getArgs2Assignment_6_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3832:1: ( rule__Initiates__Args2Assignment_6_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_ID) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3832:2: rule__Initiates__Args2Assignment_6_1
                    {
                    pushFollow(FOLLOW_rule__Initiates__Args2Assignment_6_1_in_rule__Initiates__Group_6__1__Impl7698);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3842:1: rule__Initiates__Group_6__2 : rule__Initiates__Group_6__2__Impl rule__Initiates__Group_6__3 ;
    public final void rule__Initiates__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3846:1: ( rule__Initiates__Group_6__2__Impl rule__Initiates__Group_6__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3847:2: rule__Initiates__Group_6__2__Impl rule__Initiates__Group_6__3
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6__2__Impl_in_rule__Initiates__Group_6__27729);
            rule__Initiates__Group_6__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_6__3_in_rule__Initiates__Group_6__27732);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3854:1: rule__Initiates__Group_6__2__Impl : ( ( rule__Initiates__Group_6_2__0 )* ) ;
    public final void rule__Initiates__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3858:1: ( ( ( rule__Initiates__Group_6_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3859:1: ( ( rule__Initiates__Group_6_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3859:1: ( ( rule__Initiates__Group_6_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3860:1: ( rule__Initiates__Group_6_2__0 )*
            {
             before(grammarAccess.getInitiatesAccess().getGroup_6_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3861:1: ( rule__Initiates__Group_6_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3861:2: rule__Initiates__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Initiates__Group_6_2__0_in_rule__Initiates__Group_6__2__Impl7759);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3871:1: rule__Initiates__Group_6__3 : rule__Initiates__Group_6__3__Impl ;
    public final void rule__Initiates__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3875:1: ( rule__Initiates__Group_6__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3876:2: rule__Initiates__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6__3__Impl_in_rule__Initiates__Group_6__37790);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3882:1: rule__Initiates__Group_6__3__Impl : ( ')' ) ;
    public final void rule__Initiates__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3886:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3887:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3887:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3888:1: ')'
            {
             before(grammarAccess.getInitiatesAccess().getRightParenthesisKeyword_6_3()); 
            match(input,23,FOLLOW_23_in_rule__Initiates__Group_6__3__Impl7818); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3909:1: rule__Initiates__Group_6_2__0 : rule__Initiates__Group_6_2__0__Impl rule__Initiates__Group_6_2__1 ;
    public final void rule__Initiates__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3913:1: ( rule__Initiates__Group_6_2__0__Impl rule__Initiates__Group_6_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3914:2: rule__Initiates__Group_6_2__0__Impl rule__Initiates__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6_2__0__Impl_in_rule__Initiates__Group_6_2__07857);
            rule__Initiates__Group_6_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Initiates__Group_6_2__1_in_rule__Initiates__Group_6_2__07860);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3921:1: rule__Initiates__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Initiates__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3925:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3926:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3926:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3927:1: ','
            {
             before(grammarAccess.getInitiatesAccess().getCommaKeyword_6_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Initiates__Group_6_2__0__Impl7888); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3940:1: rule__Initiates__Group_6_2__1 : rule__Initiates__Group_6_2__1__Impl ;
    public final void rule__Initiates__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3944:1: ( rule__Initiates__Group_6_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3945:2: rule__Initiates__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Initiates__Group_6_2__1__Impl_in_rule__Initiates__Group_6_2__17919);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3951:1: rule__Initiates__Group_6_2__1__Impl : ( ( rule__Initiates__Args2Assignment_6_2_1 ) ) ;
    public final void rule__Initiates__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3955:1: ( ( ( rule__Initiates__Args2Assignment_6_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3956:1: ( ( rule__Initiates__Args2Assignment_6_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3956:1: ( ( rule__Initiates__Args2Assignment_6_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3957:1: ( rule__Initiates__Args2Assignment_6_2_1 )
            {
             before(grammarAccess.getInitiatesAccess().getArgs2Assignment_6_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3958:1: ( rule__Initiates__Args2Assignment_6_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3958:2: rule__Initiates__Args2Assignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Initiates__Args2Assignment_6_2_1_in_rule__Initiates__Group_6_2__1__Impl7946);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3972:1: rule__Terminates__Group__0 : rule__Terminates__Group__0__Impl rule__Terminates__Group__1 ;
    public final void rule__Terminates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3976:1: ( rule__Terminates__Group__0__Impl rule__Terminates__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3977:2: rule__Terminates__Group__0__Impl rule__Terminates__Group__1
            {
            pushFollow(FOLLOW_rule__Terminates__Group__0__Impl_in_rule__Terminates__Group__07980);
            rule__Terminates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__1_in_rule__Terminates__Group__07983);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3984:1: rule__Terminates__Group__0__Impl : ( 'Terminates' ) ;
    public final void rule__Terminates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3988:1: ( ( 'Terminates' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3989:1: ( 'Terminates' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3989:1: ( 'Terminates' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3990:1: 'Terminates'
            {
             before(grammarAccess.getTerminatesAccess().getTerminatesKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Terminates__Group__0__Impl8011); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4003:1: rule__Terminates__Group__1 : rule__Terminates__Group__1__Impl rule__Terminates__Group__2 ;
    public final void rule__Terminates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4007:1: ( rule__Terminates__Group__1__Impl rule__Terminates__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4008:2: rule__Terminates__Group__1__Impl rule__Terminates__Group__2
            {
            pushFollow(FOLLOW_rule__Terminates__Group__1__Impl_in_rule__Terminates__Group__18042);
            rule__Terminates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__2_in_rule__Terminates__Group__18045);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4015:1: rule__Terminates__Group__1__Impl : ( '(' ) ;
    public final void rule__Terminates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4019:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4020:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4020:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4021:1: '('
            {
             before(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__Terminates__Group__1__Impl8073); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4034:1: rule__Terminates__Group__2 : rule__Terminates__Group__2__Impl rule__Terminates__Group__3 ;
    public final void rule__Terminates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4038:1: ( rule__Terminates__Group__2__Impl rule__Terminates__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4039:2: rule__Terminates__Group__2__Impl rule__Terminates__Group__3
            {
            pushFollow(FOLLOW_rule__Terminates__Group__2__Impl_in_rule__Terminates__Group__28104);
            rule__Terminates__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__3_in_rule__Terminates__Group__28107);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4046:1: rule__Terminates__Group__2__Impl : ( ( rule__Terminates__EventAssignment_2 ) ) ;
    public final void rule__Terminates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4050:1: ( ( ( rule__Terminates__EventAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4051:1: ( ( rule__Terminates__EventAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4051:1: ( ( rule__Terminates__EventAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4052:1: ( rule__Terminates__EventAssignment_2 )
            {
             before(grammarAccess.getTerminatesAccess().getEventAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4053:1: ( rule__Terminates__EventAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4053:2: rule__Terminates__EventAssignment_2
            {
            pushFollow(FOLLOW_rule__Terminates__EventAssignment_2_in_rule__Terminates__Group__2__Impl8134);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4063:1: rule__Terminates__Group__3 : rule__Terminates__Group__3__Impl rule__Terminates__Group__4 ;
    public final void rule__Terminates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4067:1: ( rule__Terminates__Group__3__Impl rule__Terminates__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4068:2: rule__Terminates__Group__3__Impl rule__Terminates__Group__4
            {
            pushFollow(FOLLOW_rule__Terminates__Group__3__Impl_in_rule__Terminates__Group__38164);
            rule__Terminates__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__4_in_rule__Terminates__Group__38167);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4075:1: rule__Terminates__Group__3__Impl : ( ( rule__Terminates__Group_3__0 )? ) ;
    public final void rule__Terminates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4079:1: ( ( ( rule__Terminates__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4080:1: ( ( rule__Terminates__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4080:1: ( ( rule__Terminates__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4081:1: ( rule__Terminates__Group_3__0 )?
            {
             before(grammarAccess.getTerminatesAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4082:1: ( rule__Terminates__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==22) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4082:2: rule__Terminates__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Terminates__Group_3__0_in_rule__Terminates__Group__3__Impl8194);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4092:1: rule__Terminates__Group__4 : rule__Terminates__Group__4__Impl rule__Terminates__Group__5 ;
    public final void rule__Terminates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4096:1: ( rule__Terminates__Group__4__Impl rule__Terminates__Group__5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4097:2: rule__Terminates__Group__4__Impl rule__Terminates__Group__5
            {
            pushFollow(FOLLOW_rule__Terminates__Group__4__Impl_in_rule__Terminates__Group__48225);
            rule__Terminates__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__5_in_rule__Terminates__Group__48228);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4104:1: rule__Terminates__Group__4__Impl : ( ',' ) ;
    public final void rule__Terminates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4108:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4109:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4109:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4110:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_4()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group__4__Impl8256); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4123:1: rule__Terminates__Group__5 : rule__Terminates__Group__5__Impl rule__Terminates__Group__6 ;
    public final void rule__Terminates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4127:1: ( rule__Terminates__Group__5__Impl rule__Terminates__Group__6 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4128:2: rule__Terminates__Group__5__Impl rule__Terminates__Group__6
            {
            pushFollow(FOLLOW_rule__Terminates__Group__5__Impl_in_rule__Terminates__Group__58287);
            rule__Terminates__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__6_in_rule__Terminates__Group__58290);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4135:1: rule__Terminates__Group__5__Impl : ( ( rule__Terminates__FluentAssignment_5 ) ) ;
    public final void rule__Terminates__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4139:1: ( ( ( rule__Terminates__FluentAssignment_5 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4140:1: ( ( rule__Terminates__FluentAssignment_5 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4140:1: ( ( rule__Terminates__FluentAssignment_5 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4141:1: ( rule__Terminates__FluentAssignment_5 )
            {
             before(grammarAccess.getTerminatesAccess().getFluentAssignment_5()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4142:1: ( rule__Terminates__FluentAssignment_5 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4142:2: rule__Terminates__FluentAssignment_5
            {
            pushFollow(FOLLOW_rule__Terminates__FluentAssignment_5_in_rule__Terminates__Group__5__Impl8317);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4152:1: rule__Terminates__Group__6 : rule__Terminates__Group__6__Impl rule__Terminates__Group__7 ;
    public final void rule__Terminates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4156:1: ( rule__Terminates__Group__6__Impl rule__Terminates__Group__7 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4157:2: rule__Terminates__Group__6__Impl rule__Terminates__Group__7
            {
            pushFollow(FOLLOW_rule__Terminates__Group__6__Impl_in_rule__Terminates__Group__68347);
            rule__Terminates__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__7_in_rule__Terminates__Group__68350);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4164:1: rule__Terminates__Group__6__Impl : ( ( rule__Terminates__Group_6__0 )? ) ;
    public final void rule__Terminates__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4168:1: ( ( ( rule__Terminates__Group_6__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4169:1: ( ( rule__Terminates__Group_6__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4169:1: ( ( rule__Terminates__Group_6__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4170:1: ( rule__Terminates__Group_6__0 )?
            {
             before(grammarAccess.getTerminatesAccess().getGroup_6()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4171:1: ( rule__Terminates__Group_6__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==22) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4171:2: rule__Terminates__Group_6__0
                    {
                    pushFollow(FOLLOW_rule__Terminates__Group_6__0_in_rule__Terminates__Group__6__Impl8377);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4181:1: rule__Terminates__Group__7 : rule__Terminates__Group__7__Impl rule__Terminates__Group__8 ;
    public final void rule__Terminates__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4185:1: ( rule__Terminates__Group__7__Impl rule__Terminates__Group__8 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4186:2: rule__Terminates__Group__7__Impl rule__Terminates__Group__8
            {
            pushFollow(FOLLOW_rule__Terminates__Group__7__Impl_in_rule__Terminates__Group__78408);
            rule__Terminates__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__8_in_rule__Terminates__Group__78411);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4193:1: rule__Terminates__Group__7__Impl : ( ',' ) ;
    public final void rule__Terminates__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4197:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4198:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4198:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4199:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_7()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group__7__Impl8439); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4212:1: rule__Terminates__Group__8 : rule__Terminates__Group__8__Impl rule__Terminates__Group__9 ;
    public final void rule__Terminates__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4216:1: ( rule__Terminates__Group__8__Impl rule__Terminates__Group__9 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4217:2: rule__Terminates__Group__8__Impl rule__Terminates__Group__9
            {
            pushFollow(FOLLOW_rule__Terminates__Group__8__Impl_in_rule__Terminates__Group__88470);
            rule__Terminates__Group__8__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group__9_in_rule__Terminates__Group__88473);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4224:1: rule__Terminates__Group__8__Impl : ( ( rule__Terminates__TimeAssignment_8 ) ) ;
    public final void rule__Terminates__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4228:1: ( ( ( rule__Terminates__TimeAssignment_8 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4229:1: ( ( rule__Terminates__TimeAssignment_8 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4229:1: ( ( rule__Terminates__TimeAssignment_8 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4230:1: ( rule__Terminates__TimeAssignment_8 )
            {
             before(grammarAccess.getTerminatesAccess().getTimeAssignment_8()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4231:1: ( rule__Terminates__TimeAssignment_8 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4231:2: rule__Terminates__TimeAssignment_8
            {
            pushFollow(FOLLOW_rule__Terminates__TimeAssignment_8_in_rule__Terminates__Group__8__Impl8500);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4241:1: rule__Terminates__Group__9 : rule__Terminates__Group__9__Impl ;
    public final void rule__Terminates__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4245:1: ( rule__Terminates__Group__9__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4246:2: rule__Terminates__Group__9__Impl
            {
            pushFollow(FOLLOW_rule__Terminates__Group__9__Impl_in_rule__Terminates__Group__98530);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4252:1: rule__Terminates__Group__9__Impl : ( ')' ) ;
    public final void rule__Terminates__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4256:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4257:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4257:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4258:1: ')'
            {
             before(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_9()); 
            match(input,23,FOLLOW_23_in_rule__Terminates__Group__9__Impl8558); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4291:1: rule__Terminates__Group_3__0 : rule__Terminates__Group_3__0__Impl rule__Terminates__Group_3__1 ;
    public final void rule__Terminates__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4295:1: ( rule__Terminates__Group_3__0__Impl rule__Terminates__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4296:2: rule__Terminates__Group_3__0__Impl rule__Terminates__Group_3__1
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3__0__Impl_in_rule__Terminates__Group_3__08609);
            rule__Terminates__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_3__1_in_rule__Terminates__Group_3__08612);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4303:1: rule__Terminates__Group_3__0__Impl : ( '(' ) ;
    public final void rule__Terminates__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4307:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4308:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4308:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4309:1: '('
            {
             before(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Terminates__Group_3__0__Impl8640); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4322:1: rule__Terminates__Group_3__1 : rule__Terminates__Group_3__1__Impl rule__Terminates__Group_3__2 ;
    public final void rule__Terminates__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4326:1: ( rule__Terminates__Group_3__1__Impl rule__Terminates__Group_3__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4327:2: rule__Terminates__Group_3__1__Impl rule__Terminates__Group_3__2
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3__1__Impl_in_rule__Terminates__Group_3__18671);
            rule__Terminates__Group_3__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_3__2_in_rule__Terminates__Group_3__18674);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4334:1: rule__Terminates__Group_3__1__Impl : ( ( rule__Terminates__ArgsAssignment_3_1 )? ) ;
    public final void rule__Terminates__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4338:1: ( ( ( rule__Terminates__ArgsAssignment_3_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4339:1: ( ( rule__Terminates__ArgsAssignment_3_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4339:1: ( ( rule__Terminates__ArgsAssignment_3_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4340:1: ( rule__Terminates__ArgsAssignment_3_1 )?
            {
             before(grammarAccess.getTerminatesAccess().getArgsAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4341:1: ( rule__Terminates__ArgsAssignment_3_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4341:2: rule__Terminates__ArgsAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Terminates__ArgsAssignment_3_1_in_rule__Terminates__Group_3__1__Impl8701);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4351:1: rule__Terminates__Group_3__2 : rule__Terminates__Group_3__2__Impl rule__Terminates__Group_3__3 ;
    public final void rule__Terminates__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4355:1: ( rule__Terminates__Group_3__2__Impl rule__Terminates__Group_3__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4356:2: rule__Terminates__Group_3__2__Impl rule__Terminates__Group_3__3
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3__2__Impl_in_rule__Terminates__Group_3__28732);
            rule__Terminates__Group_3__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_3__3_in_rule__Terminates__Group_3__28735);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4363:1: rule__Terminates__Group_3__2__Impl : ( ( rule__Terminates__Group_3_2__0 )* ) ;
    public final void rule__Terminates__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4367:1: ( ( ( rule__Terminates__Group_3_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4368:1: ( ( rule__Terminates__Group_3_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4368:1: ( ( rule__Terminates__Group_3_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4369:1: ( rule__Terminates__Group_3_2__0 )*
            {
             before(grammarAccess.getTerminatesAccess().getGroup_3_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4370:1: ( rule__Terminates__Group_3_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==21) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4370:2: rule__Terminates__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Terminates__Group_3_2__0_in_rule__Terminates__Group_3__2__Impl8762);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4380:1: rule__Terminates__Group_3__3 : rule__Terminates__Group_3__3__Impl ;
    public final void rule__Terminates__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4384:1: ( rule__Terminates__Group_3__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4385:2: rule__Terminates__Group_3__3__Impl
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3__3__Impl_in_rule__Terminates__Group_3__38793);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4391:1: rule__Terminates__Group_3__3__Impl : ( ')' ) ;
    public final void rule__Terminates__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4395:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4396:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4396:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4397:1: ')'
            {
             before(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_3_3()); 
            match(input,23,FOLLOW_23_in_rule__Terminates__Group_3__3__Impl8821); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4418:1: rule__Terminates__Group_3_2__0 : rule__Terminates__Group_3_2__0__Impl rule__Terminates__Group_3_2__1 ;
    public final void rule__Terminates__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4422:1: ( rule__Terminates__Group_3_2__0__Impl rule__Terminates__Group_3_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4423:2: rule__Terminates__Group_3_2__0__Impl rule__Terminates__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3_2__0__Impl_in_rule__Terminates__Group_3_2__08860);
            rule__Terminates__Group_3_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_3_2__1_in_rule__Terminates__Group_3_2__08863);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4430:1: rule__Terminates__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__Terminates__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4434:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4435:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4435:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4436:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_3_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group_3_2__0__Impl8891); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4449:1: rule__Terminates__Group_3_2__1 : rule__Terminates__Group_3_2__1__Impl ;
    public final void rule__Terminates__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4453:1: ( rule__Terminates__Group_3_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4454:2: rule__Terminates__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Terminates__Group_3_2__1__Impl_in_rule__Terminates__Group_3_2__18922);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4460:1: rule__Terminates__Group_3_2__1__Impl : ( ( rule__Terminates__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__Terminates__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4464:1: ( ( ( rule__Terminates__ArgsAssignment_3_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4465:1: ( ( rule__Terminates__ArgsAssignment_3_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4465:1: ( ( rule__Terminates__ArgsAssignment_3_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4466:1: ( rule__Terminates__ArgsAssignment_3_2_1 )
            {
             before(grammarAccess.getTerminatesAccess().getArgsAssignment_3_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4467:1: ( rule__Terminates__ArgsAssignment_3_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4467:2: rule__Terminates__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Terminates__ArgsAssignment_3_2_1_in_rule__Terminates__Group_3_2__1__Impl8949);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4481:1: rule__Terminates__Group_6__0 : rule__Terminates__Group_6__0__Impl rule__Terminates__Group_6__1 ;
    public final void rule__Terminates__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4485:1: ( rule__Terminates__Group_6__0__Impl rule__Terminates__Group_6__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4486:2: rule__Terminates__Group_6__0__Impl rule__Terminates__Group_6__1
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6__0__Impl_in_rule__Terminates__Group_6__08983);
            rule__Terminates__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_6__1_in_rule__Terminates__Group_6__08986);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4493:1: rule__Terminates__Group_6__0__Impl : ( '(' ) ;
    public final void rule__Terminates__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4497:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4498:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4498:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4499:1: '('
            {
             before(grammarAccess.getTerminatesAccess().getLeftParenthesisKeyword_6_0()); 
            match(input,22,FOLLOW_22_in_rule__Terminates__Group_6__0__Impl9014); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4512:1: rule__Terminates__Group_6__1 : rule__Terminates__Group_6__1__Impl rule__Terminates__Group_6__2 ;
    public final void rule__Terminates__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4516:1: ( rule__Terminates__Group_6__1__Impl rule__Terminates__Group_6__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4517:2: rule__Terminates__Group_6__1__Impl rule__Terminates__Group_6__2
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6__1__Impl_in_rule__Terminates__Group_6__19045);
            rule__Terminates__Group_6__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_6__2_in_rule__Terminates__Group_6__19048);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4524:1: rule__Terminates__Group_6__1__Impl : ( ( rule__Terminates__Args2Assignment_6_1 )? ) ;
    public final void rule__Terminates__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4528:1: ( ( ( rule__Terminates__Args2Assignment_6_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4529:1: ( ( rule__Terminates__Args2Assignment_6_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4529:1: ( ( rule__Terminates__Args2Assignment_6_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4530:1: ( rule__Terminates__Args2Assignment_6_1 )?
            {
             before(grammarAccess.getTerminatesAccess().getArgs2Assignment_6_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4531:1: ( rule__Terminates__Args2Assignment_6_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_ID) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4531:2: rule__Terminates__Args2Assignment_6_1
                    {
                    pushFollow(FOLLOW_rule__Terminates__Args2Assignment_6_1_in_rule__Terminates__Group_6__1__Impl9075);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4541:1: rule__Terminates__Group_6__2 : rule__Terminates__Group_6__2__Impl rule__Terminates__Group_6__3 ;
    public final void rule__Terminates__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4545:1: ( rule__Terminates__Group_6__2__Impl rule__Terminates__Group_6__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4546:2: rule__Terminates__Group_6__2__Impl rule__Terminates__Group_6__3
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6__2__Impl_in_rule__Terminates__Group_6__29106);
            rule__Terminates__Group_6__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_6__3_in_rule__Terminates__Group_6__29109);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4553:1: rule__Terminates__Group_6__2__Impl : ( ( rule__Terminates__Group_6_2__0 )* ) ;
    public final void rule__Terminates__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4557:1: ( ( ( rule__Terminates__Group_6_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4558:1: ( ( rule__Terminates__Group_6_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4558:1: ( ( rule__Terminates__Group_6_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4559:1: ( rule__Terminates__Group_6_2__0 )*
            {
             before(grammarAccess.getTerminatesAccess().getGroup_6_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4560:1: ( rule__Terminates__Group_6_2__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==21) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4560:2: rule__Terminates__Group_6_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Terminates__Group_6_2__0_in_rule__Terminates__Group_6__2__Impl9136);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4570:1: rule__Terminates__Group_6__3 : rule__Terminates__Group_6__3__Impl ;
    public final void rule__Terminates__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4574:1: ( rule__Terminates__Group_6__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4575:2: rule__Terminates__Group_6__3__Impl
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6__3__Impl_in_rule__Terminates__Group_6__39167);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4581:1: rule__Terminates__Group_6__3__Impl : ( ')' ) ;
    public final void rule__Terminates__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4585:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4586:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4586:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4587:1: ')'
            {
             before(grammarAccess.getTerminatesAccess().getRightParenthesisKeyword_6_3()); 
            match(input,23,FOLLOW_23_in_rule__Terminates__Group_6__3__Impl9195); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4608:1: rule__Terminates__Group_6_2__0 : rule__Terminates__Group_6_2__0__Impl rule__Terminates__Group_6_2__1 ;
    public final void rule__Terminates__Group_6_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4612:1: ( rule__Terminates__Group_6_2__0__Impl rule__Terminates__Group_6_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4613:2: rule__Terminates__Group_6_2__0__Impl rule__Terminates__Group_6_2__1
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6_2__0__Impl_in_rule__Terminates__Group_6_2__09234);
            rule__Terminates__Group_6_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Terminates__Group_6_2__1_in_rule__Terminates__Group_6_2__09237);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4620:1: rule__Terminates__Group_6_2__0__Impl : ( ',' ) ;
    public final void rule__Terminates__Group_6_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4624:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4625:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4625:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4626:1: ','
            {
             before(grammarAccess.getTerminatesAccess().getCommaKeyword_6_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Terminates__Group_6_2__0__Impl9265); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4639:1: rule__Terminates__Group_6_2__1 : rule__Terminates__Group_6_2__1__Impl ;
    public final void rule__Terminates__Group_6_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4643:1: ( rule__Terminates__Group_6_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4644:2: rule__Terminates__Group_6_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Terminates__Group_6_2__1__Impl_in_rule__Terminates__Group_6_2__19296);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4650:1: rule__Terminates__Group_6_2__1__Impl : ( ( rule__Terminates__Args2Assignment_6_2_1 ) ) ;
    public final void rule__Terminates__Group_6_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4654:1: ( ( ( rule__Terminates__Args2Assignment_6_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4655:1: ( ( rule__Terminates__Args2Assignment_6_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4655:1: ( ( rule__Terminates__Args2Assignment_6_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4656:1: ( rule__Terminates__Args2Assignment_6_2_1 )
            {
             before(grammarAccess.getTerminatesAccess().getArgs2Assignment_6_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4657:1: ( rule__Terminates__Args2Assignment_6_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4657:2: rule__Terminates__Args2Assignment_6_2_1
            {
            pushFollow(FOLLOW_rule__Terminates__Args2Assignment_6_2_1_in_rule__Terminates__Group_6_2__1__Impl9323);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4671:1: rule__Path__Group__0 : rule__Path__Group__0__Impl rule__Path__Group__1 ;
    public final void rule__Path__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4675:1: ( rule__Path__Group__0__Impl rule__Path__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4676:2: rule__Path__Group__0__Impl rule__Path__Group__1
            {
            pushFollow(FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__09357);
            rule__Path__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Path__Group__1_in_rule__Path__Group__09360);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4683:1: rule__Path__Group__0__Impl : ( ( rule__Path__FilesAssignment_0 ) ) ;
    public final void rule__Path__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4687:1: ( ( ( rule__Path__FilesAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4688:1: ( ( rule__Path__FilesAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4688:1: ( ( rule__Path__FilesAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4689:1: ( rule__Path__FilesAssignment_0 )
            {
             before(grammarAccess.getPathAccess().getFilesAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4690:1: ( rule__Path__FilesAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4690:2: rule__Path__FilesAssignment_0
            {
            pushFollow(FOLLOW_rule__Path__FilesAssignment_0_in_rule__Path__Group__0__Impl9387);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4700:1: rule__Path__Group__1 : rule__Path__Group__1__Impl ;
    public final void rule__Path__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4704:1: ( rule__Path__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4705:2: rule__Path__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__19417);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4711:1: rule__Path__Group__1__Impl : ( ( rule__Path__Group_1__0 )* ) ;
    public final void rule__Path__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4715:1: ( ( ( rule__Path__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4716:1: ( ( rule__Path__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4716:1: ( ( rule__Path__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4717:1: ( rule__Path__Group_1__0 )*
            {
             before(grammarAccess.getPathAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4718:1: ( rule__Path__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==33) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4718:2: rule__Path__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__1__Impl9444);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4732:1: rule__Path__Group_1__0 : rule__Path__Group_1__0__Impl rule__Path__Group_1__1 ;
    public final void rule__Path__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4736:1: ( rule__Path__Group_1__0__Impl rule__Path__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4737:2: rule__Path__Group_1__0__Impl rule__Path__Group_1__1
            {
            pushFollow(FOLLOW_rule__Path__Group_1__0__Impl_in_rule__Path__Group_1__09479);
            rule__Path__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__09482);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4744:1: rule__Path__Group_1__0__Impl : ( '/' ) ;
    public final void rule__Path__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4748:1: ( ( '/' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4749:1: ( '/' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4749:1: ( '/' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4750:1: '/'
            {
             before(grammarAccess.getPathAccess().getSolidusKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Path__Group_1__0__Impl9510); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4763:1: rule__Path__Group_1__1 : rule__Path__Group_1__1__Impl ;
    public final void rule__Path__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4767:1: ( rule__Path__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4768:2: rule__Path__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Path__Group_1__1__Impl_in_rule__Path__Group_1__19541);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4774:1: rule__Path__Group_1__1__Impl : ( ( rule__Path__FilesAssignment_1_1 ) ) ;
    public final void rule__Path__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4778:1: ( ( ( rule__Path__FilesAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4779:1: ( ( rule__Path__FilesAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4779:1: ( ( rule__Path__FilesAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4780:1: ( rule__Path__FilesAssignment_1_1 )
            {
             before(grammarAccess.getPathAccess().getFilesAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4781:1: ( rule__Path__FilesAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4781:2: rule__Path__FilesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Path__FilesAssignment_1_1_in_rule__Path__Group_1__1__Impl9568);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4795:1: rule__File__Group__0 : rule__File__Group__0__Impl rule__File__Group__1 ;
    public final void rule__File__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4799:1: ( rule__File__Group__0__Impl rule__File__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4800:2: rule__File__Group__0__Impl rule__File__Group__1
            {
            pushFollow(FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__09602);
            rule__File__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__File__Group__1_in_rule__File__Group__09605);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4807:1: rule__File__Group__0__Impl : ( ( rule__File__NamesAssignment_0 ) ) ;
    public final void rule__File__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4811:1: ( ( ( rule__File__NamesAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4812:1: ( ( rule__File__NamesAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4812:1: ( ( rule__File__NamesAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4813:1: ( rule__File__NamesAssignment_0 )
            {
             before(grammarAccess.getFileAccess().getNamesAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4814:1: ( rule__File__NamesAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4814:2: rule__File__NamesAssignment_0
            {
            pushFollow(FOLLOW_rule__File__NamesAssignment_0_in_rule__File__Group__0__Impl9632);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4824:1: rule__File__Group__1 : rule__File__Group__1__Impl ;
    public final void rule__File__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4828:1: ( rule__File__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4829:2: rule__File__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__19662);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4835:1: rule__File__Group__1__Impl : ( ( rule__File__Group_1__0 )* ) ;
    public final void rule__File__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4839:1: ( ( ( rule__File__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4840:1: ( ( rule__File__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4840:1: ( ( rule__File__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4841:1: ( rule__File__Group_1__0 )*
            {
             before(grammarAccess.getFileAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4842:1: ( rule__File__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==18) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4842:2: rule__File__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__File__Group_1__0_in_rule__File__Group__1__Impl9689);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4856:1: rule__File__Group_1__0 : rule__File__Group_1__0__Impl rule__File__Group_1__1 ;
    public final void rule__File__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4860:1: ( rule__File__Group_1__0__Impl rule__File__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4861:2: rule__File__Group_1__0__Impl rule__File__Group_1__1
            {
            pushFollow(FOLLOW_rule__File__Group_1__0__Impl_in_rule__File__Group_1__09724);
            rule__File__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__File__Group_1__1_in_rule__File__Group_1__09727);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4868:1: rule__File__Group_1__0__Impl : ( '.' ) ;
    public final void rule__File__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4872:1: ( ( '.' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4873:1: ( '.' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4873:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4874:1: '.'
            {
             before(grammarAccess.getFileAccess().getFullStopKeyword_1_0()); 
            match(input,18,FOLLOW_18_in_rule__File__Group_1__0__Impl9755); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4887:1: rule__File__Group_1__1 : rule__File__Group_1__1__Impl ;
    public final void rule__File__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4891:1: ( rule__File__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4892:2: rule__File__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__File__Group_1__1__Impl_in_rule__File__Group_1__19786);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4898:1: rule__File__Group_1__1__Impl : ( ( rule__File__NamesAssignment_1_1 ) ) ;
    public final void rule__File__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4902:1: ( ( ( rule__File__NamesAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4903:1: ( ( rule__File__NamesAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4903:1: ( ( rule__File__NamesAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4904:1: ( rule__File__NamesAssignment_1_1 )
            {
             before(grammarAccess.getFileAccess().getNamesAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4905:1: ( rule__File__NamesAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4905:2: rule__File__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__File__NamesAssignment_1_1_in_rule__File__Group_1__1__Impl9813);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4920:1: rule__Knowledge__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Knowledge__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4924:1: ( ( ruleImport ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4925:1: ( ruleImport )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4925:1: ( ruleImport )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4926:1: ruleImport
            {
             before(grammarAccess.getKnowledgeAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Knowledge__ImportsAssignment_09852);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4935:1: rule__Knowledge__EntitiesAssignment_1 : ( ruleEntity ) ;
    public final void rule__Knowledge__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4939:1: ( ( ruleEntity ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4940:1: ( ruleEntity )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4940:1: ( ruleEntity )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4941:1: ruleEntity
            {
             before(grammarAccess.getKnowledgeAccess().getEntitiesEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Knowledge__EntitiesAssignment_19883);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4950:1: rule__Knowledge__RulesAssignment_2_0 : ( ruleRule ) ;
    public final void rule__Knowledge__RulesAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4954:1: ( ( ruleRule ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4955:1: ( ruleRule )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4955:1: ( ruleRule )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4956:1: ruleRule
            {
             before(grammarAccess.getKnowledgeAccess().getRulesRuleParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Knowledge__RulesAssignment_2_09914);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4965:1: rule__Knowledge__VarsAssignment_3 : ( ruleVar ) ;
    public final void rule__Knowledge__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4969:1: ( ( ruleVar ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4970:1: ( ruleVar )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4970:1: ( ruleVar )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4971:1: ruleVar
            {
             before(grammarAccess.getKnowledgeAccess().getVarsVarParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleVar_in_rule__Knowledge__VarsAssignment_39945);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4980:1: rule__Rule__DeclAssignment_0 : ( ruleVarDecl ) ;
    public final void rule__Rule__DeclAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4984:1: ( ( ruleVarDecl ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4985:1: ( ruleVarDecl )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4985:1: ( ruleVarDecl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4986:1: ruleVarDecl
            {
             before(grammarAccess.getRuleAccess().getDeclVarDeclParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleVarDecl_in_rule__Rule__DeclAssignment_09976);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4995:1: rule__Rule__ExprAssignment_1 : ( ruleBoolExpr ) ;
    public final void rule__Rule__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4999:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5000:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5000:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5001:1: ruleBoolExpr
            {
             before(grammarAccess.getRuleAccess().getExprBoolExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__Rule__ExprAssignment_110007);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5010:1: rule__VarDecl__VarsAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__VarsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5014:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5015:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5015:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5016:1: ( RULE_ID )
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5017:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5018:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_110042); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5029:1: rule__VarDecl__VarsAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__VarDecl__VarsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5033:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5034:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5034:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5035:1: ( RULE_ID )
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarCrossReference_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5036:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5037:1: RULE_ID
            {
             before(grammarAccess.getVarDeclAccess().getVarsVarIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_2_110081); 
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


    // $ANTLR start rule__ConstTerm__ValueAssignment
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5048:1: rule__ConstTerm__ValueAssignment : ( RULE_INT ) ;
    public final void rule__ConstTerm__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5052:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5053:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5053:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5054:1: RULE_INT
            {
             before(grammarAccess.getConstTermAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__ConstTerm__ValueAssignment10116); 
             after(grammarAccess.getConstTermAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ConstTerm__ValueAssignment


    // $ANTLR start rule__VarTerm__ValueAssignment
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5063:1: rule__VarTerm__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarTerm__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5067:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5068:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5068:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5069:1: ( RULE_ID )
            {
             before(grammarAccess.getVarTermAccess().getValueVarCrossReference_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5070:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5071:1: RULE_ID
            {
             before(grammarAccess.getVarTermAccess().getValueVarIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__VarTerm__ValueAssignment10151); 
             after(grammarAccess.getVarTermAccess().getValueVarIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVarTermAccess().getValueVarCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__VarTerm__ValueAssignment


    // $ANTLR start rule__BinaryIntExpr__OprAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5082:1: rule__BinaryIntExpr__OprAssignment_0 : ( ruleIntTerm ) ;
    public final void rule__BinaryIntExpr__OprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5086:1: ( ( ruleIntTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5087:1: ( ruleIntTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5087:1: ( ruleIntTerm )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5088:1: ruleIntTerm
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_010186);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5097:1: rule__BinaryIntExpr__BinaryopAssignment_1 : ( ruleBinaryIntOp ) ;
    public final void rule__BinaryIntExpr__BinaryopAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5101:1: ( ( ruleBinaryIntOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5102:1: ( ruleBinaryIntOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5102:1: ( ruleBinaryIntOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5103:1: ruleBinaryIntOp
            {
             before(grammarAccess.getBinaryIntExprAccess().getBinaryopBinaryIntOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryIntOp_in_rule__BinaryIntExpr__BinaryopAssignment_110217);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5112:1: rule__BinaryIntExpr__OprAssignment_2 : ( ruleIntTerm ) ;
    public final void rule__BinaryIntExpr__OprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5116:1: ( ( ruleIntTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5117:1: ( ruleIntTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5117:1: ( ruleIntTerm )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5118:1: ruleIntTerm
            {
             before(grammarAccess.getBinaryIntExprAccess().getOprIntTermParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_210248);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5127:1: rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0 : ( ruleUnaryBoolOp ) ;
    public final void rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5131:1: ( ( ruleUnaryBoolOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5132:1: ( ruleUnaryBoolOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5132:1: ( ruleUnaryBoolOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5133:1: ruleUnaryBoolOp
            {
             before(grammarAccess.getUnaryBoolExprAccess().getUnaryop_lhsUnaryBoolOpEnumRuleCall_0_0_0()); 
            pushFollow(FOLLOW_ruleUnaryBoolOp_in_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_010279);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5142:1: rule__UnaryBoolExpr__OprAssignment_0_1 : ( ruleBoolExpr ) ;
    public final void rule__UnaryBoolExpr__OprAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5146:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5147:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5147:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5148:1: ruleBoolExpr
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOprBoolExprParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OprAssignment_0_110310);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5157:1: rule__UnaryBoolExpr__OpsAssignment_1_1 : ( ruleBoolExpr ) ;
    public final void rule__UnaryBoolExpr__OpsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5161:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5162:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5162:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5163:1: ruleBoolExpr
            {
             before(grammarAccess.getUnaryBoolExprAccess().getOpsBoolExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OpsAssignment_1_110341);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5172:1: rule__BinaryBoolExpr__OprAssignment_0 : ( ruleTemporalPredicate ) ;
    public final void rule__BinaryBoolExpr__OprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5176:1: ( ( ruleTemporalPredicate ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5177:1: ( ruleTemporalPredicate )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5177:1: ( ruleTemporalPredicate )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5178:1: ruleTemporalPredicate
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprTemporalPredicateParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleTemporalPredicate_in_rule__BinaryBoolExpr__OprAssignment_010372);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5187:1: rule__BinaryBoolExpr__BinaryopAssignment_1 : ( ruleBinaryBoolOp ) ;
    public final void rule__BinaryBoolExpr__BinaryopAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5191:1: ( ( ruleBinaryBoolOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5192:1: ( ruleBinaryBoolOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5192:1: ( ruleBinaryBoolOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5193:1: ruleBinaryBoolOp
            {
             before(grammarAccess.getBinaryBoolExprAccess().getBinaryopBinaryBoolOpEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleBinaryBoolOp_in_rule__BinaryBoolExpr__BinaryopAssignment_110403);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5202:1: rule__BinaryBoolExpr__OprAssignment_2 : ( ruleBoolExpr ) ;
    public final void rule__BinaryBoolExpr__OprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5206:1: ( ( ruleBoolExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5207:1: ( ruleBoolExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5207:1: ( ruleBoolExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5208:1: ruleBoolExpr
            {
             before(grammarAccess.getBinaryBoolExprAccess().getOprBoolExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBoolExpr_in_rule__BinaryBoolExpr__OprAssignment_210434);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5217:1: rule__Sort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5221:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5222:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5222:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5223:1: RULE_ID
            {
             before(grammarAccess.getSortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_110465); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5232:1: rule__Import__PathAssignment_1 : ( rulePath ) ;
    public final void rule__Import__PathAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5236:1: ( ( rulePath ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5237:1: ( rulePath )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5237:1: ( rulePath )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5238:1: rulePath
            {
             before(grammarAccess.getImportAccess().getPathPathParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePath_in_rule__Import__PathAssignment_110496);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5247:1: rule__Var__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Var__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5251:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5252:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5252:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5253:1: RULE_ID
            {
             before(grammarAccess.getVarAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Var__NameAssignment_110527); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5262:1: rule__Var__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__Var__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5266:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5267:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5267:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5268:1: RULE_INT
            {
             before(grammarAccess.getVarAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Var__MinAssignment_210558); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5277:1: rule__Var__MaxAssignment_3 : ( RULE_INT ) ;
    public final void rule__Var__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5281:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5282:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5282:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5283:1: RULE_INT
            {
             before(grammarAccess.getVarAccess().getMaxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Var__MaxAssignment_310589); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5292:1: rule__Fluent__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__Fluent__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5296:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5297:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5297:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5298:1: ruleTerm
            {
             before(grammarAccess.getFluentAccess().getTermTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Fluent__TermAssignment_110620);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5307:1: rule__Event__TermAssignment_1 : ( ruleTerm ) ;
    public final void rule__Event__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5311:1: ( ( ruleTerm ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5312:1: ( ruleTerm )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5312:1: ( ruleTerm )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5313:1: ruleTerm
            {
             before(grammarAccess.getEventAccess().getTermTermParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleTerm_in_rule__Event__TermAssignment_110651);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5322:1: rule__Term__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Term__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5326:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5327:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5327:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5328:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__NameAssignment_010682); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5337:1: rule__Term__ArgsAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Term__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5341:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5342:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5342:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5343:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_110713); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5352:1: rule__Term__ArgsAssignment_1_2_1 : ( RULE_ID ) ;
    public final void rule__Term__ArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5356:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5357:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5357:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5358:1: RULE_ID
            {
             before(grammarAccess.getTermAccess().getArgsIDTerminalRuleCall_1_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_2_110744); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5367:1: rule__HoldsAt__FluentAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__HoldsAt__FluentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5371:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5372:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5372:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5373:1: ( RULE_ID )
            {
             before(grammarAccess.getHoldsAtAccess().getFluentTermCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5374:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5375:1: RULE_ID
            {
             before(grammarAccess.getHoldsAtAccess().getFluentTermIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HoldsAt__FluentAssignment_210779); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5386:1: rule__HoldsAt__ArgsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__HoldsAt__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5390:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5391:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5391:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5392:1: RULE_ID
            {
             before(grammarAccess.getHoldsAtAccess().getArgsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HoldsAt__ArgsAssignment_3_110814); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5401:1: rule__HoldsAt__ArgsAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__HoldsAt__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5405:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5406:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5406:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5407:1: RULE_ID
            {
             before(grammarAccess.getHoldsAtAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HoldsAt__ArgsAssignment_3_2_110845); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5416:1: rule__HoldsAt__TimeAssignment_5 : ( ruleIntExpr ) ;
    public final void rule__HoldsAt__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5420:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5421:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5421:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5422:1: ruleIntExpr
            {
             before(grammarAccess.getHoldsAtAccess().getTimeIntExprParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__HoldsAt__TimeAssignment_510876);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5431:1: rule__Happens__EventAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Happens__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5435:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5436:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5436:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5437:1: ( RULE_ID )
            {
             before(grammarAccess.getHappensAccess().getEventTermCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5438:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5439:1: RULE_ID
            {
             before(grammarAccess.getHappensAccess().getEventTermIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Happens__EventAssignment_210911); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5450:1: rule__Happens__ArgsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Happens__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5454:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5455:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5455:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5456:1: RULE_ID
            {
             before(grammarAccess.getHappensAccess().getArgsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Happens__ArgsAssignment_3_110946); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5465:1: rule__Happens__ArgsAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Happens__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5469:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5470:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5470:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5471:1: RULE_ID
            {
             before(grammarAccess.getHappensAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Happens__ArgsAssignment_3_2_110977); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5480:1: rule__Happens__TimeAssignment_5 : ( ruleIntExpr ) ;
    public final void rule__Happens__TimeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5484:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5485:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5485:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5486:1: ruleIntExpr
            {
             before(grammarAccess.getHappensAccess().getTimeIntExprParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Happens__TimeAssignment_511008);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5495:1: rule__Initiates__EventAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Initiates__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5499:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5500:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5500:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5501:1: ( RULE_ID )
            {
             before(grammarAccess.getInitiatesAccess().getEventTermCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5502:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5503:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getEventTermIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__EventAssignment_211043); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5514:1: rule__Initiates__ArgsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Initiates__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5518:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5519:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5519:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5520:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getArgsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__ArgsAssignment_3_111078); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5529:1: rule__Initiates__ArgsAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Initiates__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5533:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5534:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5534:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5535:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__ArgsAssignment_3_2_111109); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5544:1: rule__Initiates__FluentAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Initiates__FluentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5548:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5549:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5549:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5550:1: ( RULE_ID )
            {
             before(grammarAccess.getInitiatesAccess().getFluentTermCrossReference_5_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5551:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5552:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getFluentTermIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__FluentAssignment_511144); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5563:1: rule__Initiates__Args2Assignment_6_1 : ( RULE_ID ) ;
    public final void rule__Initiates__Args2Assignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5567:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5568:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5568:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5569:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getArgs2IDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__Args2Assignment_6_111179); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5578:1: rule__Initiates__Args2Assignment_6_2_1 : ( RULE_ID ) ;
    public final void rule__Initiates__Args2Assignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5582:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5583:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5583:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5584:1: RULE_ID
            {
             before(grammarAccess.getInitiatesAccess().getArgs2IDTerminalRuleCall_6_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Initiates__Args2Assignment_6_2_111210); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5593:1: rule__Initiates__TimeAssignment_8 : ( ruleIntExpr ) ;
    public final void rule__Initiates__TimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5597:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5598:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5598:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5599:1: ruleIntExpr
            {
             before(grammarAccess.getInitiatesAccess().getTimeIntExprParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Initiates__TimeAssignment_811241);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5608:1: rule__Terminates__EventAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Terminates__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5612:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5613:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5613:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5614:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminatesAccess().getEventTermCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5615:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5616:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getEventTermIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__EventAssignment_211276); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5627:1: rule__Terminates__ArgsAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__Terminates__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5631:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5632:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5632:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5633:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getArgsIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__ArgsAssignment_3_111311); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5642:1: rule__Terminates__ArgsAssignment_3_2_1 : ( RULE_ID ) ;
    public final void rule__Terminates__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5646:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5647:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5647:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5648:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getArgsIDTerminalRuleCall_3_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__ArgsAssignment_3_2_111342); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5657:1: rule__Terminates__FluentAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Terminates__FluentAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5661:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5662:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5662:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5663:1: ( RULE_ID )
            {
             before(grammarAccess.getTerminatesAccess().getFluentTermCrossReference_5_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5664:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5665:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getFluentTermIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__FluentAssignment_511377); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5676:1: rule__Terminates__Args2Assignment_6_1 : ( RULE_ID ) ;
    public final void rule__Terminates__Args2Assignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5680:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5681:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5681:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5682:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getArgs2IDTerminalRuleCall_6_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__Args2Assignment_6_111412); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5691:1: rule__Terminates__Args2Assignment_6_2_1 : ( RULE_ID ) ;
    public final void rule__Terminates__Args2Assignment_6_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5695:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5696:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5696:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5697:1: RULE_ID
            {
             before(grammarAccess.getTerminatesAccess().getArgs2IDTerminalRuleCall_6_2_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Terminates__Args2Assignment_6_2_111443); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5706:1: rule__Terminates__TimeAssignment_8 : ( ruleIntExpr ) ;
    public final void rule__Terminates__TimeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5710:1: ( ( ruleIntExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5711:1: ( ruleIntExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5711:1: ( ruleIntExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5712:1: ruleIntExpr
            {
             before(grammarAccess.getTerminatesAccess().getTimeIntExprParserRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleIntExpr_in_rule__Terminates__TimeAssignment_811474);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5721:1: rule__Path__FilesAssignment_0 : ( ruleFile ) ;
    public final void rule__Path__FilesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5725:1: ( ( ruleFile ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5726:1: ( ruleFile )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5726:1: ( ruleFile )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5727:1: ruleFile
            {
             before(grammarAccess.getPathAccess().getFilesFileParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFile_in_rule__Path__FilesAssignment_011505);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5736:1: rule__Path__FilesAssignment_1_1 : ( ruleFile ) ;
    public final void rule__Path__FilesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5740:1: ( ( ruleFile ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5741:1: ( ruleFile )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5741:1: ( ruleFile )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5742:1: ruleFile
            {
             before(grammarAccess.getPathAccess().getFilesFileParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleFile_in_rule__Path__FilesAssignment_1_111536);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5751:1: rule__File__NamesAssignment_0 : ( RULE_ID ) ;
    public final void rule__File__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5755:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5756:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5756:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5757:1: RULE_ID
            {
             before(grammarAccess.getFileAccess().getNamesIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__File__NamesAssignment_011567); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5766:1: rule__File__NamesAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__File__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5770:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5771:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5771:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5772:1: RULE_ID
            {
             before(grammarAccess.getFileAccess().getNamesIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__File__NamesAssignment_1_111598); 
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
        "\51\uffff\1\66\5\uffff\1\66\31\uffff\1\66\3\uffff\1\66\4\uffff";
    static final String DFA4_minS =
        "\1\13\4\26\1\uffff\4\4\4\25\10\4\1\25\1\4\1\25\2\14\1\25\1\4\1\25"+
        "\2\14\1\25\1\4\3\25\1\4\3\25\1\16\2\4\1\25\2\4\1\16\1\25\2\4\1\25"+
        "\2\4\2\uffff\4\27\1\25\1\4\1\25\2\14\1\25\1\4\1\25\2\14\1\25\2\4"+
        "\1\16\1\25\2\4\1\16\4\27";
    static final String DFA4_maxS =
        "\1\40\4\26\1\uffff\4\4\4\26\1\27\1\5\1\27\1\5\1\27\1\4\1\27\1\4"+
        "\1\27\1\4\1\25\3\27\1\4\1\25\3\27\1\4\1\25\1\26\1\27\1\4\1\25\1"+
        "\26\2\27\2\5\1\27\2\5\3\27\1\5\2\27\1\5\2\uffff\5\27\1\4\1\25\3"+
        "\27\1\4\1\25\3\27\2\5\2\27\2\5\5\27";
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
            "\1\107\1\110\11\uffff\1\111",
            "\1\107\1\110\11\uffff\1\111",
            "\1\102\1\uffff\1\103",
            "\1\112",
            "\1\65",
            "\1\113\1\114\11\uffff\1\115",
            "\1\113\1\114\11\uffff\1\115",
            "\1\75\1\uffff\1\76",
            "\1\117\1\116",
            "\1\117\1\116",
            "\4\67\1\66\4\uffff\1\66",
            "\1\102\1\uffff\1\103",
            "\1\121\1\120",
            "\1\121\1\120",
            "\4\67\1\66\4\uffff\1\66",
            "\1\111",
            "\1\111",
            "\1\115",
            "\1\115"
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
            return "897:1: rule__BoolExpr__Alternatives : ( ( ruleTemporalPredicate ) | ( ruleUnaryBoolExpr ) | ( ruleBinaryBoolExpr ) );";
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
    public static final BitSet FOLLOW_ruleConstTerm_in_entryRuleConstTerm301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConstTerm308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConstTerm__ValueAssignment_in_ruleConstTerm334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarTerm_in_entryRuleVarTerm361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVarTerm368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarTerm__ValueAssignment_in_ruleVarTerm394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_entryRuleIntExpr421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIntExpr428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__IntExpr__Alternatives_in_ruleIntExpr454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntExpr_in_entryRuleBinaryIntExpr481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryIntExpr488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__0_in_ruleBinaryIntExpr514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_entryRuleTemporalPredicate541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTemporalPredicate548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TemporalPredicate__Alternatives_in_ruleTemporalPredicate574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_entryRuleBoolExpr601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBoolExpr608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BoolExpr__Alternatives_in_ruleBoolExpr634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolExpr_in_entryRuleUnaryBoolExpr661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryBoolExpr668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Alternatives_in_ruleUnaryBoolExpr694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_entryRuleBinaryBoolExpr721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBinaryBoolExpr728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__0_in_ruleBinaryBoolExpr754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_in_ruleEntity814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSort_in_entryRuleSort841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSort848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__Group__0_in_ruleSort874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_entryRuleVar961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVar968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0_in_ruleVar994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_entryRuleFluent1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFluent1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0_in_ruleFluent1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_entryRuleTerm1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerm1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0_in_ruleTerm1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoldsAt_in_entryRuleHoldsAt1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHoldsAt1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__0_in_ruleHoldsAt1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHappens_in_entryRuleHappens1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHappens1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__0_in_ruleHappens1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitiates_in_entryRuleInitiates1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInitiates1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__0_in_ruleInitiates1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminates_in_entryRuleTerminates1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminates1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__0_in_ruleTerminates1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_entryRulePath1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePath1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0_in_rulePath1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_entryRuleFile1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFile1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0_in_ruleFile1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntOp__Alternatives_in_ruleBinaryIntOp1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleUnaryBoolOp1608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolOp__Alternatives_in_ruleBinaryBoolOp1646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConstTerm_in_rule__IntTerm__Alternatives1681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarTerm_in_rule__IntTerm__Alternatives1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__IntExpr__Alternatives1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntExpr_in_rule__IntExpr__Alternatives1747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHoldsAt_in_rule__TemporalPredicate__Alternatives1779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHappens_in_rule__TemporalPredicate__Alternatives1796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInitiates_in_rule__TemporalPredicate__Alternatives1813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminates_in_rule__TemporalPredicate__Alternatives1830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_rule__BoolExpr__Alternatives1862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolExpr_in_rule__BoolExpr__Alternatives1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolExpr_in_rule__BoolExpr__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__0_in_rule__UnaryBoolExpr__Alternatives1928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__0_in_rule__UnaryBoolExpr__Alternatives1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFluent_in_rule__Entity__Alternatives1979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_rule__Entity__Alternatives1996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSort_in_rule__Entity__Alternatives2013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__BinaryIntOp__Alternatives2046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__BinaryIntOp__Alternatives2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__BinaryBoolOp__Alternatives2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__BinaryBoolOp__Alternatives2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__BinaryBoolOp__Alternatives2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__BinaryBoolOp__Alternatives2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__0__Impl_in_rule__Knowledge__Group__02199 = new BitSet(new long[]{0x00000001FD480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__1_in_rule__Knowledge__Group__02202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__ImportsAssignment_0_in_rule__Knowledge__Group__0__Impl2229 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__1__Impl_in_rule__Knowledge__Group__12260 = new BitSet(new long[]{0x00000001E4480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__2_in_rule__Knowledge__Group__12263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__EntitiesAssignment_1_in_rule__Knowledge__Group__1__Impl2290 = new BitSet(new long[]{0x0000000019000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__2__Impl_in_rule__Knowledge__Group__22321 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__3_in_rule__Knowledge__Group__22324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__0_in_rule__Knowledge__Group__2__Impl2351 = new BitSet(new long[]{0x00000001E0480802L});
    public static final BitSet FOLLOW_rule__Knowledge__Group__3__Impl_in_rule__Knowledge__Group__32382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__VarsAssignment_3_in_rule__Knowledge__Group__3__Impl2409 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__0__Impl_in_rule__Knowledge__Group_2__02448 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__1_in_rule__Knowledge__Group_2__02451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__RulesAssignment_2_0_in_rule__Knowledge__Group_2__0__Impl2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Knowledge__Group_2__1__Impl_in_rule__Knowledge__Group_2__12508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Knowledge__Group_2__1__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02571 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__DeclAssignment_0_in_rule__Rule__Group__0__Impl2601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__ExprAssignment_1_in_rule__Rule__Group__1__Impl2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__0__Impl_in_rule__VarDecl__Group__02693 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1_in_rule__VarDecl__Group__02696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__VarDecl__Group__0__Impl2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__1__Impl_in_rule__VarDecl__Group__12755 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2_in_rule__VarDecl__Group__12758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__VarsAssignment_1_in_rule__VarDecl__Group__1__Impl2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__2__Impl_in_rule__VarDecl__Group__22815 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3_in_rule__VarDecl__Group__22818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__0_in_rule__VarDecl__Group__2__Impl2845 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group__3__Impl_in_rule__VarDecl__Group__32876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__VarDecl__Group__3__Impl2904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__0__Impl_in_rule__VarDecl__Group_2__02943 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__1_in_rule__VarDecl__Group_2__02946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VarDecl__Group_2__0__Impl2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__Group_2__1__Impl_in_rule__VarDecl__Group_2__13005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VarDecl__VarsAssignment_2_1_in_rule__VarDecl__Group_2__1__Impl3032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__0__Impl_in_rule__BinaryIntExpr__Group__03066 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__1_in_rule__BinaryIntExpr__Group__03069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__OprAssignment_0_in_rule__BinaryIntExpr__Group__0__Impl3096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__1__Impl_in_rule__BinaryIntExpr__Group__13126 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__2_in_rule__BinaryIntExpr__Group__13129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__BinaryopAssignment_1_in_rule__BinaryIntExpr__Group__1__Impl3156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__Group__2__Impl_in_rule__BinaryIntExpr__Group__23186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryIntExpr__OprAssignment_2_in_rule__BinaryIntExpr__Group__2__Impl3213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__0__Impl_in_rule__UnaryBoolExpr__Group_0__03249 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__1_in_rule__UnaryBoolExpr__Group_0__03252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_0_in_rule__UnaryBoolExpr__Group_0__0__Impl3279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_0__1__Impl_in_rule__UnaryBoolExpr__Group_0__13309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__OprAssignment_0_1_in_rule__UnaryBoolExpr__Group_0__1__Impl3336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__0__Impl_in_rule__UnaryBoolExpr__Group_1__03370 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__1_in_rule__UnaryBoolExpr__Group_1__03373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__UnaryBoolExpr__Group_1__0__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__1__Impl_in_rule__UnaryBoolExpr__Group_1__13432 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__2_in_rule__UnaryBoolExpr__Group_1__13435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__OpsAssignment_1_1_in_rule__UnaryBoolExpr__Group_1__1__Impl3462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryBoolExpr__Group_1__2__Impl_in_rule__UnaryBoolExpr__Group_1__23492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__UnaryBoolExpr__Group_1__2__Impl3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__0__Impl_in_rule__BinaryBoolExpr__Group__03557 = new BitSet(new long[]{0x000000000003C000L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__1_in_rule__BinaryBoolExpr__Group__03560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__OprAssignment_0_in_rule__BinaryBoolExpr__Group__0__Impl3587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__1__Impl_in_rule__BinaryBoolExpr__Group__13617 = new BitSet(new long[]{0x00000001E0400800L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__2_in_rule__BinaryBoolExpr__Group__13620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__BinaryopAssignment_1_in_rule__BinaryBoolExpr__Group__1__Impl3647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__Group__2__Impl_in_rule__BinaryBoolExpr__Group__23677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BinaryBoolExpr__OprAssignment_2_in_rule__BinaryBoolExpr__Group__2__Impl3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__Group__0__Impl_in_rule__Sort__Group__03740 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sort__Group__1_in_rule__Sort__Group__03743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Sort__Group__0__Impl3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__Group__1__Impl_in_rule__Sort__Group__13802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sort__NameAssignment_1_in_rule__Sort__Group__1__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Import__Group__0__Impl3894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__PathAssignment_1_in_rule__Import__Group__1__Impl3952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__0__Impl_in_rule__Var__Group__03986 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Var__Group__1_in_rule__Var__Group__03989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Var__Group__0__Impl4017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__1__Impl_in_rule__Var__Group__14048 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Var__Group__2_in_rule__Var__Group__14051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__NameAssignment_1_in_rule__Var__Group__1__Impl4078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__2__Impl_in_rule__Var__Group__24108 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Var__Group__3_in_rule__Var__Group__24111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__MinAssignment_2_in_rule__Var__Group__2__Impl4138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__Group__3__Impl_in_rule__Var__Group__34168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Var__MaxAssignment_3_in_rule__Var__Group__3__Impl4195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__0__Impl_in_rule__Fluent__Group__04233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1_in_rule__Fluent__Group__04236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Fluent__Group__0__Impl4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__Group__1__Impl_in_rule__Fluent__Group__14295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fluent__TermAssignment_1_in_rule__Fluent__Group__1__Impl4322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Event__Group__0__Impl4387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__TermAssignment_1_in_rule__Event__Group__1__Impl4445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__0__Impl_in_rule__Term__Group__04479 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__Term__Group__1_in_rule__Term__Group__04482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__NameAssignment_0_in_rule__Term__Group__0__Impl4509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group__1__Impl_in_rule__Term__Group__14539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0_in_rule__Term__Group__1__Impl4566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__0__Impl_in_rule__Term__Group_1__04601 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1_in_rule__Term__Group_1__04604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Term__Group_1__0__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__1__Impl_in_rule__Term__Group_1__14663 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Term__Group_1__2_in_rule__Term__Group_1__14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ArgsAssignment_1_1_in_rule__Term__Group_1__1__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__2__Impl_in_rule__Term__Group_1__24724 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Term__Group_1__3_in_rule__Term__Group_1__24727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__0_in_rule__Term__Group_1__2__Impl4754 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Term__Group_1__3__Impl_in_rule__Term__Group_1__34785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Term__Group_1__3__Impl4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__0__Impl_in_rule__Term__Group_1_2__04852 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__1_in_rule__Term__Group_1_2__04855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Term__Group_1_2__0__Impl4883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__Group_1_2__1__Impl_in_rule__Term__Group_1_2__14914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Term__ArgsAssignment_1_2_1_in_rule__Term__Group_1_2__1__Impl4941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__0__Impl_in_rule__HoldsAt__Group__04975 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__1_in_rule__HoldsAt__Group__04978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__HoldsAt__Group__0__Impl5006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__1__Impl_in_rule__HoldsAt__Group__15037 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__2_in_rule__HoldsAt__Group__15040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HoldsAt__Group__1__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__2__Impl_in_rule__HoldsAt__Group__25099 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__3_in_rule__HoldsAt__Group__25102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__FluentAssignment_2_in_rule__HoldsAt__Group__2__Impl5129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__3__Impl_in_rule__HoldsAt__Group__35159 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__4_in_rule__HoldsAt__Group__35162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__0_in_rule__HoldsAt__Group__3__Impl5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__4__Impl_in_rule__HoldsAt__Group__45220 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__5_in_rule__HoldsAt__Group__45223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HoldsAt__Group__4__Impl5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__5__Impl_in_rule__HoldsAt__Group__55282 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__6_in_rule__HoldsAt__Group__55285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__TimeAssignment_5_in_rule__HoldsAt__Group__5__Impl5312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group__6__Impl_in_rule__HoldsAt__Group__65342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HoldsAt__Group__6__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__0__Impl_in_rule__HoldsAt__Group_3__05415 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__1_in_rule__HoldsAt__Group_3__05418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__HoldsAt__Group_3__0__Impl5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__1__Impl_in_rule__HoldsAt__Group_3__15477 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__2_in_rule__HoldsAt__Group_3__15480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__ArgsAssignment_3_1_in_rule__HoldsAt__Group_3__1__Impl5507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__2__Impl_in_rule__HoldsAt__Group_3__25538 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__3_in_rule__HoldsAt__Group_3__25541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3_2__0_in_rule__HoldsAt__Group_3__2__Impl5568 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3__3__Impl_in_rule__HoldsAt__Group_3__35599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__HoldsAt__Group_3__3__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3_2__0__Impl_in_rule__HoldsAt__Group_3_2__05666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3_2__1_in_rule__HoldsAt__Group_3_2__05669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__HoldsAt__Group_3_2__0__Impl5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__Group_3_2__1__Impl_in_rule__HoldsAt__Group_3_2__15728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HoldsAt__ArgsAssignment_3_2_1_in_rule__HoldsAt__Group_3_2__1__Impl5755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__0__Impl_in_rule__Happens__Group__05789 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Happens__Group__1_in_rule__Happens__Group__05792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Happens__Group__0__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__1__Impl_in_rule__Happens__Group__15851 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Happens__Group__2_in_rule__Happens__Group__15854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Happens__Group__1__Impl5882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__2__Impl_in_rule__Happens__Group__25913 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Happens__Group__3_in_rule__Happens__Group__25916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__EventAssignment_2_in_rule__Happens__Group__2__Impl5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__3__Impl_in_rule__Happens__Group__35973 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Happens__Group__4_in_rule__Happens__Group__35976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__0_in_rule__Happens__Group__3__Impl6003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__4__Impl_in_rule__Happens__Group__46034 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Happens__Group__5_in_rule__Happens__Group__46037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Happens__Group__4__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__5__Impl_in_rule__Happens__Group__56096 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Happens__Group__6_in_rule__Happens__Group__56099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__TimeAssignment_5_in_rule__Happens__Group__5__Impl6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group__6__Impl_in_rule__Happens__Group__66156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Happens__Group__6__Impl6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__0__Impl_in_rule__Happens__Group_3__06229 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__1_in_rule__Happens__Group_3__06232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Happens__Group_3__0__Impl6260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__1__Impl_in_rule__Happens__Group_3__16291 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__2_in_rule__Happens__Group_3__16294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__ArgsAssignment_3_1_in_rule__Happens__Group_3__1__Impl6321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__2__Impl_in_rule__Happens__Group_3__26352 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__3_in_rule__Happens__Group_3__26355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3_2__0_in_rule__Happens__Group_3__2__Impl6382 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3__3__Impl_in_rule__Happens__Group_3__36413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Happens__Group_3__3__Impl6441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3_2__0__Impl_in_rule__Happens__Group_3_2__06480 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Happens__Group_3_2__1_in_rule__Happens__Group_3_2__06483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Happens__Group_3_2__0__Impl6511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__Group_3_2__1__Impl_in_rule__Happens__Group_3_2__16542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Happens__ArgsAssignment_3_2_1_in_rule__Happens__Group_3_2__1__Impl6569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__0__Impl_in_rule__Initiates__Group__06603 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__1_in_rule__Initiates__Group__06606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Initiates__Group__0__Impl6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__1__Impl_in_rule__Initiates__Group__16665 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group__2_in_rule__Initiates__Group__16668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Initiates__Group__1__Impl6696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__2__Impl_in_rule__Initiates__Group__26727 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__3_in_rule__Initiates__Group__26730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__EventAssignment_2_in_rule__Initiates__Group__2__Impl6757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__3__Impl_in_rule__Initiates__Group__36787 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__4_in_rule__Initiates__Group__36790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__0_in_rule__Initiates__Group__3__Impl6817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__4__Impl_in_rule__Initiates__Group__46848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group__5_in_rule__Initiates__Group__46851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group__4__Impl6879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__5__Impl_in_rule__Initiates__Group__56910 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__6_in_rule__Initiates__Group__56913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__FluentAssignment_5_in_rule__Initiates__Group__5__Impl6940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__6__Impl_in_rule__Initiates__Group__66970 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__7_in_rule__Initiates__Group__66973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__0_in_rule__Initiates__Group__6__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__7__Impl_in_rule__Initiates__Group__77031 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Initiates__Group__8_in_rule__Initiates__Group__77034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group__7__Impl7062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__8__Impl_in_rule__Initiates__Group__87093 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Initiates__Group__9_in_rule__Initiates__Group__87096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__TimeAssignment_8_in_rule__Initiates__Group__8__Impl7123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group__9__Impl_in_rule__Initiates__Group__97153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Initiates__Group__9__Impl7181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__0__Impl_in_rule__Initiates__Group_3__07232 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__1_in_rule__Initiates__Group_3__07235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Initiates__Group_3__0__Impl7263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__1__Impl_in_rule__Initiates__Group_3__17294 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__2_in_rule__Initiates__Group_3__17297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__ArgsAssignment_3_1_in_rule__Initiates__Group_3__1__Impl7324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__2__Impl_in_rule__Initiates__Group_3__27355 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__3_in_rule__Initiates__Group_3__27358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3_2__0_in_rule__Initiates__Group_3__2__Impl7385 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3__3__Impl_in_rule__Initiates__Group_3__37416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Initiates__Group_3__3__Impl7444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3_2__0__Impl_in_rule__Initiates__Group_3_2__07483 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3_2__1_in_rule__Initiates__Group_3_2__07486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group_3_2__0__Impl7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_3_2__1__Impl_in_rule__Initiates__Group_3_2__17545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__ArgsAssignment_3_2_1_in_rule__Initiates__Group_3_2__1__Impl7572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__0__Impl_in_rule__Initiates__Group_6__07606 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__1_in_rule__Initiates__Group_6__07609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Initiates__Group_6__0__Impl7637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__1__Impl_in_rule__Initiates__Group_6__17668 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__2_in_rule__Initiates__Group_6__17671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Args2Assignment_6_1_in_rule__Initiates__Group_6__1__Impl7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__2__Impl_in_rule__Initiates__Group_6__27729 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__3_in_rule__Initiates__Group_6__27732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6_2__0_in_rule__Initiates__Group_6__2__Impl7759 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6__3__Impl_in_rule__Initiates__Group_6__37790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Initiates__Group_6__3__Impl7818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6_2__0__Impl_in_rule__Initiates__Group_6_2__07857 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6_2__1_in_rule__Initiates__Group_6_2__07860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Initiates__Group_6_2__0__Impl7888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Group_6_2__1__Impl_in_rule__Initiates__Group_6_2__17919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Initiates__Args2Assignment_6_2_1_in_rule__Initiates__Group_6_2__1__Impl7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__0__Impl_in_rule__Terminates__Group__07980 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__1_in_rule__Terminates__Group__07983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Terminates__Group__0__Impl8011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__1__Impl_in_rule__Terminates__Group__18042 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group__2_in_rule__Terminates__Group__18045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Terminates__Group__1__Impl8073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__2__Impl_in_rule__Terminates__Group__28104 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__3_in_rule__Terminates__Group__28107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__EventAssignment_2_in_rule__Terminates__Group__2__Impl8134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__3__Impl_in_rule__Terminates__Group__38164 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__4_in_rule__Terminates__Group__38167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__0_in_rule__Terminates__Group__3__Impl8194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__4__Impl_in_rule__Terminates__Group__48225 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group__5_in_rule__Terminates__Group__48228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group__4__Impl8256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__5__Impl_in_rule__Terminates__Group__58287 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__6_in_rule__Terminates__Group__58290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__FluentAssignment_5_in_rule__Terminates__Group__5__Impl8317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__6__Impl_in_rule__Terminates__Group__68347 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__7_in_rule__Terminates__Group__68350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__0_in_rule__Terminates__Group__6__Impl8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__7__Impl_in_rule__Terminates__Group__78408 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_rule__Terminates__Group__8_in_rule__Terminates__Group__78411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group__7__Impl8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__8__Impl_in_rule__Terminates__Group__88470 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Terminates__Group__9_in_rule__Terminates__Group__88473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__TimeAssignment_8_in_rule__Terminates__Group__8__Impl8500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group__9__Impl_in_rule__Terminates__Group__98530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Terminates__Group__9__Impl8558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__0__Impl_in_rule__Terminates__Group_3__08609 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__1_in_rule__Terminates__Group_3__08612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Terminates__Group_3__0__Impl8640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__1__Impl_in_rule__Terminates__Group_3__18671 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__2_in_rule__Terminates__Group_3__18674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__ArgsAssignment_3_1_in_rule__Terminates__Group_3__1__Impl8701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__2__Impl_in_rule__Terminates__Group_3__28732 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__3_in_rule__Terminates__Group_3__28735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3_2__0_in_rule__Terminates__Group_3__2__Impl8762 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3__3__Impl_in_rule__Terminates__Group_3__38793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Terminates__Group_3__3__Impl8821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3_2__0__Impl_in_rule__Terminates__Group_3_2__08860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3_2__1_in_rule__Terminates__Group_3_2__08863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group_3_2__0__Impl8891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_3_2__1__Impl_in_rule__Terminates__Group_3_2__18922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__ArgsAssignment_3_2_1_in_rule__Terminates__Group_3_2__1__Impl8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__0__Impl_in_rule__Terminates__Group_6__08983 = new BitSet(new long[]{0x0000000000A00010L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__1_in_rule__Terminates__Group_6__08986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Terminates__Group_6__0__Impl9014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__1__Impl_in_rule__Terminates__Group_6__19045 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__2_in_rule__Terminates__Group_6__19048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Args2Assignment_6_1_in_rule__Terminates__Group_6__1__Impl9075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__2__Impl_in_rule__Terminates__Group_6__29106 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__3_in_rule__Terminates__Group_6__29109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6_2__0_in_rule__Terminates__Group_6__2__Impl9136 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6__3__Impl_in_rule__Terminates__Group_6__39167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Terminates__Group_6__3__Impl9195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6_2__0__Impl_in_rule__Terminates__Group_6_2__09234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6_2__1_in_rule__Terminates__Group_6_2__09237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Terminates__Group_6_2__0__Impl9265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Group_6_2__1__Impl_in_rule__Terminates__Group_6_2__19296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Terminates__Args2Assignment_6_2_1_in_rule__Terminates__Group_6_2__1__Impl9323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__0__Impl_in_rule__Path__Group__09357 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Path__Group__1_in_rule__Path__Group__09360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__FilesAssignment_0_in_rule__Path__Group__0__Impl9387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group__1__Impl_in_rule__Path__Group__19417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__0_in_rule__Path__Group__1__Impl9444 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__0__Impl_in_rule__Path__Group_1__09479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Path__Group_1__1_in_rule__Path__Group_1__09482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Path__Group_1__0__Impl9510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__Group_1__1__Impl_in_rule__Path__Group_1__19541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Path__FilesAssignment_1_1_in_rule__Path__Group_1__1__Impl9568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__0__Impl_in_rule__File__Group__09602 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__File__Group__1_in_rule__File__Group__09605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NamesAssignment_0_in_rule__File__Group__0__Impl9632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group__1__Impl_in_rule__File__Group__19662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_1__0_in_rule__File__Group__1__Impl9689 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__File__Group_1__0__Impl_in_rule__File__Group_1__09724 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__File__Group_1__1_in_rule__File__Group_1__09727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__File__Group_1__0__Impl9755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__Group_1__1__Impl_in_rule__File__Group_1__19786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__File__NamesAssignment_1_1_in_rule__File__Group_1__1__Impl9813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Knowledge__ImportsAssignment_09852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Knowledge__EntitiesAssignment_19883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Knowledge__RulesAssignment_2_09914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVar_in_rule__Knowledge__VarsAssignment_39945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVarDecl_in_rule__Rule__DeclAssignment_09976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__Rule__ExprAssignment_110007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_110042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarDecl__VarsAssignment_2_110081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__ConstTerm__ValueAssignment10116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__VarTerm__ValueAssignment10151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_010186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryIntOp_in_rule__BinaryIntExpr__BinaryopAssignment_110217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntTerm_in_rule__BinaryIntExpr__OprAssignment_210248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryBoolOp_in_rule__UnaryBoolExpr__Unaryop_lhsAssignment_0_010279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OprAssignment_0_110310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__UnaryBoolExpr__OpsAssignment_1_110341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTemporalPredicate_in_rule__BinaryBoolExpr__OprAssignment_010372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBinaryBoolOp_in_rule__BinaryBoolExpr__BinaryopAssignment_110403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBoolExpr_in_rule__BinaryBoolExpr__OprAssignment_210434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sort__NameAssignment_110465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePath_in_rule__Import__PathAssignment_110496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Var__NameAssignment_110527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Var__MinAssignment_210558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Var__MaxAssignment_310589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Fluent__TermAssignment_110620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerm_in_rule__Event__TermAssignment_110651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__NameAssignment_010682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_110713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Term__ArgsAssignment_1_2_110744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HoldsAt__FluentAssignment_210779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HoldsAt__ArgsAssignment_3_110814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HoldsAt__ArgsAssignment_3_2_110845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__HoldsAt__TimeAssignment_510876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Happens__EventAssignment_210911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Happens__ArgsAssignment_3_110946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Happens__ArgsAssignment_3_2_110977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Happens__TimeAssignment_511008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__EventAssignment_211043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__ArgsAssignment_3_111078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__ArgsAssignment_3_2_111109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__FluentAssignment_511144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__Args2Assignment_6_111179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Initiates__Args2Assignment_6_2_111210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Initiates__TimeAssignment_811241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__EventAssignment_211276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__ArgsAssignment_3_111311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__ArgsAssignment_3_2_111342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__FluentAssignment_511377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__Args2Assignment_6_111412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Terminates__Args2Assignment_6_2_111443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIntExpr_in_rule__Terminates__TimeAssignment_811474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__Path__FilesAssignment_011505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFile_in_rule__Path__FilesAssignment_1_111536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__File__NamesAssignment_011567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__File__NamesAssignment_1_111598 = new BitSet(new long[]{0x0000000000000002L});

}