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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'load'", "'sort'", "':'", "'range'", "'option'", "'completion'", "'Theta'", "'noninertial'", "','", "'xor'", "'mutex'", "'.'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", "'<->'", "'|'", "'&'", "'!='", "'=='", "'>='", "'<='", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'^'", "'reified'"
    };
    public static final int RULE_BOOLEAN=7;
    public static final int RULE_ID=5;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
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




    // $ANTLR start entryRuleModel
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:62:1: ( ruleModel EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:63:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();
            _fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

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
    // $ANTLR end entryRuleModel


    // $ANTLR start ruleModel
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:77:1: ( rule__Model__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleImport
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:89:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:90:1: ( ruleImport EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:91:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_ruleImport_in_entryRuleImport121);
            ruleImport();
            _fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImport128); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:98:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:102:2: ( ( ( rule__Import__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:103:1: ( ( rule__Import__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:103:1: ( ( rule__Import__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:104:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:105:1: ( rule__Import__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:105:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_rule__Import__Group__0_in_ruleImport154);
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


    // $ANTLR start entryRuleDeclaration
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:117:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:118:1: ( ruleDeclaration EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:119:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration181);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration188); 

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
    // $ANTLR end entryRuleDeclaration


    // $ANTLR start ruleDeclaration
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:126:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:130:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:131:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:131:1: ( ( rule__Declaration__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:132:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:133:1: ( rule__Declaration__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:133:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration214);
            rule__Declaration__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDeclarationAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDeclaration


    // $ANTLR start entryRuleDefSort
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:145:1: entryRuleDefSort : ruleDefSort EOF ;
    public final void entryRuleDefSort() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:146:1: ( ruleDefSort EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:147:1: ruleDefSort EOF
            {
             before(grammarAccess.getDefSortRule()); 
            pushFollow(FOLLOW_ruleDefSort_in_entryRuleDefSort241);
            ruleDefSort();
            _fsp--;

             after(grammarAccess.getDefSortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefSort248); 

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
    // $ANTLR end entryRuleDefSort


    // $ANTLR start ruleDefSort
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:154:1: ruleDefSort : ( ( rule__DefSort__Group__0 ) ) ;
    public final void ruleDefSort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:158:2: ( ( ( rule__DefSort__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:159:1: ( ( rule__DefSort__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:159:1: ( ( rule__DefSort__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:160:1: ( rule__DefSort__Group__0 )
            {
             before(grammarAccess.getDefSortAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:161:1: ( rule__DefSort__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:161:2: rule__DefSort__Group__0
            {
            pushFollow(FOLLOW_rule__DefSort__Group__0_in_ruleDefSort274);
            rule__DefSort__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefSortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefSort


    // $ANTLR start entryRuleDefRange
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:173:1: entryRuleDefRange : ruleDefRange EOF ;
    public final void entryRuleDefRange() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:174:1: ( ruleDefRange EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:175:1: ruleDefRange EOF
            {
             before(grammarAccess.getDefRangeRule()); 
            pushFollow(FOLLOW_ruleDefRange_in_entryRuleDefRange301);
            ruleDefRange();
            _fsp--;

             after(grammarAccess.getDefRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRange308); 

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
    // $ANTLR end entryRuleDefRange


    // $ANTLR start ruleDefRange
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:182:1: ruleDefRange : ( ( rule__DefRange__Group__0 ) ) ;
    public final void ruleDefRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:186:2: ( ( ( rule__DefRange__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:187:1: ( ( rule__DefRange__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:187:1: ( ( rule__DefRange__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:188:1: ( rule__DefRange__Group__0 )
            {
             before(grammarAccess.getDefRangeAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:189:1: ( rule__DefRange__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:189:2: rule__DefRange__Group__0
            {
            pushFollow(FOLLOW_rule__DefRange__Group__0_in_ruleDefRange334);
            rule__DefRange__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefRangeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefRange


    // $ANTLR start entryRuleDefOption
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:201:1: entryRuleDefOption : ruleDefOption EOF ;
    public final void entryRuleDefOption() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:202:1: ( ruleDefOption EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:203:1: ruleDefOption EOF
            {
             before(grammarAccess.getDefOptionRule()); 
            pushFollow(FOLLOW_ruleDefOption_in_entryRuleDefOption361);
            ruleDefOption();
            _fsp--;

             after(grammarAccess.getDefOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefOption368); 

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
    // $ANTLR end entryRuleDefOption


    // $ANTLR start ruleDefOption
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:210:1: ruleDefOption : ( ( rule__DefOption__Alternatives ) ) ;
    public final void ruleDefOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:214:2: ( ( ( rule__DefOption__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:215:1: ( ( rule__DefOption__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:215:1: ( ( rule__DefOption__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:216:1: ( rule__DefOption__Alternatives )
            {
             before(grammarAccess.getDefOptionAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:217:1: ( rule__DefOption__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:217:2: rule__DefOption__Alternatives
            {
            pushFollow(FOLLOW_rule__DefOption__Alternatives_in_ruleDefOption394);
            rule__DefOption__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefOption


    // $ANTLR start entryRuleDefCompletion
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:229:1: entryRuleDefCompletion : ruleDefCompletion EOF ;
    public final void entryRuleDefCompletion() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:230:1: ( ruleDefCompletion EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:231:1: ruleDefCompletion EOF
            {
             before(grammarAccess.getDefCompletionRule()); 
            pushFollow(FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion421);
            ruleDefCompletion();
            _fsp--;

             after(grammarAccess.getDefCompletionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefCompletion428); 

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
    // $ANTLR end entryRuleDefCompletion


    // $ANTLR start ruleDefCompletion
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:238:1: ruleDefCompletion : ( ( rule__DefCompletion__Group__0 ) ) ;
    public final void ruleDefCompletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:242:2: ( ( ( rule__DefCompletion__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:243:1: ( ( rule__DefCompletion__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:243:1: ( ( rule__DefCompletion__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:244:1: ( rule__DefCompletion__Group__0 )
            {
             before(grammarAccess.getDefCompletionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:245:1: ( rule__DefCompletion__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:245:2: rule__DefCompletion__Group__0
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__0_in_ruleDefCompletion454);
            rule__DefCompletion__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefCompletionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefCompletion


    // $ANTLR start entryRuleDefNonInertia
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:257:1: entryRuleDefNonInertia : ruleDefNonInertia EOF ;
    public final void entryRuleDefNonInertia() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:258:1: ( ruleDefNonInertia EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:259:1: ruleDefNonInertia EOF
            {
             before(grammarAccess.getDefNonInertiaRule()); 
            pushFollow(FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia481);
            ruleDefNonInertia();
            _fsp--;

             after(grammarAccess.getDefNonInertiaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefNonInertia488); 

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
    // $ANTLR end entryRuleDefNonInertia


    // $ANTLR start ruleDefNonInertia
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:266:1: ruleDefNonInertia : ( ( rule__DefNonInertia__Group__0 ) ) ;
    public final void ruleDefNonInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:270:2: ( ( ( rule__DefNonInertia__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:271:1: ( ( rule__DefNonInertia__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:271:1: ( ( rule__DefNonInertia__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:272:1: ( rule__DefNonInertia__Group__0 )
            {
             before(grammarAccess.getDefNonInertiaAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:273:1: ( rule__DefNonInertia__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:273:2: rule__DefNonInertia__Group__0
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__0_in_ruleDefNonInertia514);
            rule__DefNonInertia__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefNonInertiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefNonInertia


    // $ANTLR start entryRuleDefXor
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:285:1: entryRuleDefXor : ruleDefXor EOF ;
    public final void entryRuleDefXor() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:286:1: ( ruleDefXor EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:287:1: ruleDefXor EOF
            {
             before(grammarAccess.getDefXorRule()); 
            pushFollow(FOLLOW_ruleDefXor_in_entryRuleDefXor541);
            ruleDefXor();
            _fsp--;

             after(grammarAccess.getDefXorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefXor548); 

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
    // $ANTLR end entryRuleDefXor


    // $ANTLR start ruleDefXor
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:294:1: ruleDefXor : ( ( rule__DefXor__Group__0 ) ) ;
    public final void ruleDefXor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:298:2: ( ( ( rule__DefXor__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:299:1: ( ( rule__DefXor__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:299:1: ( ( rule__DefXor__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:300:1: ( rule__DefXor__Group__0 )
            {
             before(grammarAccess.getDefXorAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:301:1: ( rule__DefXor__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:301:2: rule__DefXor__Group__0
            {
            pushFollow(FOLLOW_rule__DefXor__Group__0_in_ruleDefXor574);
            rule__DefXor__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefXorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefXor


    // $ANTLR start entryRuleDefMutex
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:313:1: entryRuleDefMutex : ruleDefMutex EOF ;
    public final void entryRuleDefMutex() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:314:1: ( ruleDefMutex EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:315:1: ruleDefMutex EOF
            {
             before(grammarAccess.getDefMutexRule()); 
            pushFollow(FOLLOW_ruleDefMutex_in_entryRuleDefMutex601);
            ruleDefMutex();
            _fsp--;

             after(grammarAccess.getDefMutexRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefMutex608); 

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
    // $ANTLR end entryRuleDefMutex


    // $ANTLR start ruleDefMutex
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:322:1: ruleDefMutex : ( ( rule__DefMutex__Group__0 ) ) ;
    public final void ruleDefMutex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:326:2: ( ( ( rule__DefMutex__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:327:1: ( ( rule__DefMutex__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:327:1: ( ( rule__DefMutex__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:328:1: ( rule__DefMutex__Group__0 )
            {
             before(grammarAccess.getDefMutexAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:329:1: ( rule__DefMutex__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:329:2: rule__DefMutex__Group__0
            {
            pushFollow(FOLLOW_rule__DefMutex__Group__0_in_ruleDefMutex634);
            rule__DefMutex__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefMutexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefMutex


    // $ANTLR start entryRuleStatement
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:341:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:342:1: ( ruleStatement EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:343:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement661);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement668); 

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
    // $ANTLR end entryRuleStatement


    // $ANTLR start ruleStatement
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:350:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:354:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:355:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:355:1: ( ( rule__Statement__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:356:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:357:1: ( rule__Statement__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:357:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement694);
            rule__Statement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStatement


    // $ANTLR start entryRuleSortDefinition
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:369:1: entryRuleSortDefinition : ruleSortDefinition EOF ;
    public final void entryRuleSortDefinition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:370:1: ( ruleSortDefinition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:371:1: ruleSortDefinition EOF
            {
             before(grammarAccess.getSortDefinitionRule()); 
            pushFollow(FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition721);
            ruleSortDefinition();
            _fsp--;

             after(grammarAccess.getSortDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSortDefinition728); 

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
    // $ANTLR end entryRuleSortDefinition


    // $ANTLR start ruleSortDefinition
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:378:1: ruleSortDefinition : ( ( rule__SortDefinition__Group__0 ) ) ;
    public final void ruleSortDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:382:2: ( ( ( rule__SortDefinition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:383:1: ( ( rule__SortDefinition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:383:1: ( ( rule__SortDefinition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:384:1: ( rule__SortDefinition__Group__0 )
            {
             before(grammarAccess.getSortDefinitionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:385:1: ( rule__SortDefinition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:385:2: rule__SortDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__0_in_ruleSortDefinition754);
            rule__SortDefinition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSortDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSortDefinition


    // $ANTLR start entryRuleDefinition
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:397:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:398:1: ( ruleDefinition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:399:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition781);
            ruleDefinition();
            _fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition788); 

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
    // $ANTLR end entryRuleDefinition


    // $ANTLR start ruleDefinition
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:406:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:410:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:411:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:411:1: ( ( rule__Definition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:412:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:413:1: ( rule__Definition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:413:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition814);
            rule__Definition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDefinition


    // $ANTLR start entryRuleDeclaredParameter
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:425:1: entryRuleDeclaredParameter : ruleDeclaredParameter EOF ;
    public final void entryRuleDeclaredParameter() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:426:1: ( ruleDeclaredParameter EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:427:1: ruleDeclaredParameter EOF
            {
             before(grammarAccess.getDeclaredParameterRule()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter841);
            ruleDeclaredParameter();
            _fsp--;

             after(grammarAccess.getDeclaredParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredParameter848); 

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
    // $ANTLR end entryRuleDeclaredParameter


    // $ANTLR start ruleDeclaredParameter
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:434:1: ruleDeclaredParameter : ( ( rule__DeclaredParameter__Alternatives ) ) ;
    public final void ruleDeclaredParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:438:2: ( ( ( rule__DeclaredParameter__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:439:1: ( ( rule__DeclaredParameter__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:439:1: ( ( rule__DeclaredParameter__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:440:1: ( rule__DeclaredParameter__Alternatives )
            {
             before(grammarAccess.getDeclaredParameterAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:441:1: ( rule__DeclaredParameter__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:441:2: rule__DeclaredParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__DeclaredParameter__Alternatives_in_ruleDeclaredParameter874);
            rule__DeclaredParameter__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDeclaredParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDeclaredParameter


    // $ANTLR start entryRuleExpression
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:453:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:454:1: ( ruleExpression EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:455:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression901);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression908); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:462:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:466:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:467:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:467:1: ( ( rule__Expression__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:468:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:469:1: ( rule__Expression__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:469:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression934);
            rule__Expression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start entryRuleQualifier
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:481:1: entryRuleQualifier : ruleQualifier EOF ;
    public final void entryRuleQualifier() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:482:1: ( ruleQualifier EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:483:1: ruleQualifier EOF
            {
             before(grammarAccess.getQualifierRule()); 
            pushFollow(FOLLOW_ruleQualifier_in_entryRuleQualifier961);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getQualifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifier968); 

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
    // $ANTLR end entryRuleQualifier


    // $ANTLR start ruleQualifier
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:490:1: ruleQualifier : ( ( rule__Qualifier__Alternatives ) ) ;
    public final void ruleQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:494:2: ( ( ( rule__Qualifier__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:495:1: ( ( rule__Qualifier__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:495:1: ( ( rule__Qualifier__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:496:1: ( rule__Qualifier__Alternatives )
            {
             before(grammarAccess.getQualifierAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:497:1: ( rule__Qualifier__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:497:2: rule__Qualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Qualifier__Alternatives_in_ruleQualifier994);
            rule__Qualifier__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getQualifierAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleQualifier


    // $ANTLR start entryRuleExists
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:509:1: entryRuleExists : ruleExists EOF ;
    public final void entryRuleExists() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:510:1: ( ruleExists EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:511:1: ruleExists EOF
            {
             before(grammarAccess.getExistsRule()); 
            pushFollow(FOLLOW_ruleExists_in_entryRuleExists1021);
            ruleExists();
            _fsp--;

             after(grammarAccess.getExistsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExists1028); 

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
    // $ANTLR end entryRuleExists


    // $ANTLR start ruleExists
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:518:1: ruleExists : ( ( rule__Exists__Group__0 ) ) ;
    public final void ruleExists() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:522:2: ( ( ( rule__Exists__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:523:1: ( ( rule__Exists__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:523:1: ( ( rule__Exists__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:524:1: ( rule__Exists__Group__0 )
            {
             before(grammarAccess.getExistsAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:525:1: ( rule__Exists__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:525:2: rule__Exists__Group__0
            {
            pushFollow(FOLLOW_rule__Exists__Group__0_in_ruleExists1054);
            rule__Exists__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExistsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExists


    // $ANTLR start entryRuleForall
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:537:1: entryRuleForall : ruleForall EOF ;
    public final void entryRuleForall() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:538:1: ( ruleForall EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:539:1: ruleForall EOF
            {
             before(grammarAccess.getForallRule()); 
            pushFollow(FOLLOW_ruleForall_in_entryRuleForall1081);
            ruleForall();
            _fsp--;

             after(grammarAccess.getForallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForall1088); 

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
    // $ANTLR end entryRuleForall


    // $ANTLR start ruleForall
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:546:1: ruleForall : ( ( rule__Forall__Group__0 ) ) ;
    public final void ruleForall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:550:2: ( ( ( rule__Forall__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:551:1: ( ( rule__Forall__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:551:1: ( ( rule__Forall__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:552:1: ( rule__Forall__Group__0 )
            {
             before(grammarAccess.getForallAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:553:1: ( rule__Forall__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:553:2: rule__Forall__Group__0
            {
            pushFollow(FOLLOW_rule__Forall__Group__0_in_ruleForall1114);
            rule__Forall__Group__0();
            _fsp--;


            }

             after(grammarAccess.getForallAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleForall


    // $ANTLR start entryRuleAssignmentOp
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:565:1: entryRuleAssignmentOp : ruleAssignmentOp EOF ;
    public final void entryRuleAssignmentOp() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:566:1: ( ruleAssignmentOp EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:567:1: ruleAssignmentOp EOF
            {
             before(grammarAccess.getAssignmentOpRule()); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp1141);
            ruleAssignmentOp();
            _fsp--;

             after(grammarAccess.getAssignmentOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentOp1148); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:574:1: ruleAssignmentOp : ( ( rule__AssignmentOp__Group__0 ) ) ;
    public final void ruleAssignmentOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:578:2: ( ( ( rule__AssignmentOp__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:579:1: ( ( rule__AssignmentOp__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:579:1: ( ( rule__AssignmentOp__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:580:1: ( rule__AssignmentOp__Group__0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:581:1: ( rule__AssignmentOp__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:581:2: rule__AssignmentOp__Group__0
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__0_in_ruleAssignmentOp1174);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:593:1: entryRuleOrExp : ruleOrExp EOF ;
    public final void entryRuleOrExp() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:594:1: ( ruleOrExp EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:595:1: ruleOrExp EOF
            {
             before(grammarAccess.getOrExpRule()); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp1201);
            ruleOrExp();
            _fsp--;

             after(grammarAccess.getOrExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp1208); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:602:1: ruleOrExp : ( ( rule__OrExp__Group__0 ) ) ;
    public final void ruleOrExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:606:2: ( ( ( rule__OrExp__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:607:1: ( ( rule__OrExp__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:607:1: ( ( rule__OrExp__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:608:1: ( rule__OrExp__Group__0 )
            {
             before(grammarAccess.getOrExpAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:609:1: ( rule__OrExp__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:609:2: rule__OrExp__Group__0
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0_in_ruleOrExp1234);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:621:1: entryRuleAndExp : ruleAndExp EOF ;
    public final void entryRuleAndExp() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:622:1: ( ruleAndExp EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:623:1: ruleAndExp EOF
            {
             before(grammarAccess.getAndExpRule()); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp1261);
            ruleAndExp();
            _fsp--;

             after(grammarAccess.getAndExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp1268); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:630:1: ruleAndExp : ( ( rule__AndExp__Group__0 ) ) ;
    public final void ruleAndExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:634:2: ( ( ( rule__AndExp__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:635:1: ( ( rule__AndExp__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:635:1: ( ( rule__AndExp__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:636:1: ( rule__AndExp__Group__0 )
            {
             before(grammarAccess.getAndExpAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:637:1: ( rule__AndExp__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:637:2: rule__AndExp__Group__0
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0_in_ruleAndExp1294);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:649:1: entryRuleRelational : ruleRelational EOF ;
    public final void entryRuleRelational() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:650:1: ( ruleRelational EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:651:1: ruleRelational EOF
            {
             before(grammarAccess.getRelationalRule()); 
            pushFollow(FOLLOW_ruleRelational_in_entryRuleRelational1321);
            ruleRelational();
            _fsp--;

             after(grammarAccess.getRelationalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelational1328); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:658:1: ruleRelational : ( ( rule__Relational__Group__0 ) ) ;
    public final void ruleRelational() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:662:2: ( ( ( rule__Relational__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:663:1: ( ( rule__Relational__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:663:1: ( ( rule__Relational__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:664:1: ( rule__Relational__Group__0 )
            {
             before(grammarAccess.getRelationalAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:665:1: ( rule__Relational__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:665:2: rule__Relational__Group__0
            {
            pushFollow(FOLLOW_rule__Relational__Group__0_in_ruleRelational1354);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:677:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:678:1: ( ruleAddition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:679:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1381);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1388); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:686:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:690:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:691:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:691:1: ( ( rule__Addition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:692:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:693:1: ( rule__Addition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:693:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1414);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:705:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:706:1: ( ruleMultiplication EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:707:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1441);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1448); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:714:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:718:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:719:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:719:1: ( ( rule__Multiplication__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:720:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:721:1: ( rule__Multiplication__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:721:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1474);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:733:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:734:1: ( rulePower EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:735:1: rulePower EOF
            {
             before(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_rulePower_in_entryRulePower1501);
            rulePower();
            _fsp--;

             after(grammarAccess.getPowerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePower1508); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:742:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:746:2: ( ( ( rule__Power__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:747:1: ( ( rule__Power__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:747:1: ( ( rule__Power__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:748:1: ( rule__Power__Group__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:749:1: ( rule__Power__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:749:2: rule__Power__Group__0
            {
            pushFollow(FOLLOW_rule__Power__Group__0_in_rulePower1534);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:761:1: entryRuleUnaryExpr : ruleUnaryExpr EOF ;
    public final void entryRuleUnaryExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:762:1: ( ruleUnaryExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:763:1: ruleUnaryExpr EOF
            {
             before(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr1561);
            ruleUnaryExpr();
            _fsp--;

             after(grammarAccess.getUnaryExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr1568); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:770:1: ruleUnaryExpr : ( ( rule__UnaryExpr__Group__0 ) ) ;
    public final void ruleUnaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:774:2: ( ( ( rule__UnaryExpr__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:775:1: ( ( rule__UnaryExpr__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:775:1: ( ( rule__UnaryExpr__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:776:1: ( rule__UnaryExpr__Group__0 )
            {
             before(grammarAccess.getUnaryExprAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:777:1: ( rule__UnaryExpr__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:777:2: rule__UnaryExpr__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__0_in_ruleUnaryExpr1594);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:789:1: entryRulePrePrimaryExpr : rulePrePrimaryExpr EOF ;
    public final void entryRulePrePrimaryExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:790:1: ( rulePrePrimaryExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:791:1: rulePrePrimaryExpr EOF
            {
             before(grammarAccess.getPrePrimaryExprRule()); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr1621);
            rulePrePrimaryExpr();
            _fsp--;

             after(grammarAccess.getPrePrimaryExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrePrimaryExpr1628); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:798:1: rulePrePrimaryExpr : ( ( rule__PrePrimaryExpr__Alternatives ) ) ;
    public final void rulePrePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:802:2: ( ( ( rule__PrePrimaryExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:803:1: ( ( rule__PrePrimaryExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:803:1: ( ( rule__PrePrimaryExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:804:1: ( rule__PrePrimaryExpr__Alternatives )
            {
             before(grammarAccess.getPrePrimaryExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:805:1: ( rule__PrePrimaryExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:805:2: rule__PrePrimaryExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Alternatives_in_rulePrePrimaryExpr1654);
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


    // $ANTLR start entryRuleAbstractRef
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:817:1: entryRuleAbstractRef : ruleAbstractRef EOF ;
    public final void entryRuleAbstractRef() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:818:1: ( ruleAbstractRef EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:819:1: ruleAbstractRef EOF
            {
             before(grammarAccess.getAbstractRefRule()); 
            pushFollow(FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef1681);
            ruleAbstractRef();
            _fsp--;

             after(grammarAccess.getAbstractRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractRef1688); 

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
    // $ANTLR end entryRuleAbstractRef


    // $ANTLR start ruleAbstractRef
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:826:1: ruleAbstractRef : ( ( rule__AbstractRef__Group__0 ) ) ;
    public final void ruleAbstractRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:830:2: ( ( ( rule__AbstractRef__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:831:1: ( ( rule__AbstractRef__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:831:1: ( ( rule__AbstractRef__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:832:1: ( rule__AbstractRef__Group__0 )
            {
             before(grammarAccess.getAbstractRefAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:833:1: ( rule__AbstractRef__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:833:2: rule__AbstractRef__Group__0
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group__0_in_ruleAbstractRef1714);
            rule__AbstractRef__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAbstractRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAbstractRef


    // $ANTLR start entryRuleTerminalExpression
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:845:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:846:1: ( ruleTerminalExpression EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:847:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1741);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression1748); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:854:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:858:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:859:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:859:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:860:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:861:1: ( rule__TerminalExpression__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:861:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression1774);
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


    // $ANTLR start ruleUnarOp
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:876:1: ruleUnarOp : ( ( '!' ) ) ;
    public final void ruleUnarOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:880:1: ( ( ( '!' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:881:1: ( ( '!' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:881:1: ( ( '!' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:882:1: ( '!' )
            {
             before(grammarAccess.getUnarOpAccess().getNOTEnumLiteralDeclaration()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:883:1: ( '!' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:883:3: '!'
            {
            match(input,12,FOLLOW_12_in_ruleUnarOp1814); 

            }

             after(grammarAccess.getUnarOpAccess().getNOTEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleUnarOp


    // $ANTLR start rule__Model__Alternatives_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:895:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:899:1: ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14||(LA1_0>=16 && LA1_0<=18)||LA1_0==20||(LA1_0>=22 && LA1_0<=23)||LA1_0==47) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_BOOLEAN)||LA1_0==12||LA1_0==25||LA1_0==27||LA1_0==29) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("895:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:900:1: ( ( rule__Model__DeclarationsAssignment_1_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:900:1: ( ( rule__Model__DeclarationsAssignment_1_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:901:1: ( rule__Model__DeclarationsAssignment_1_0 )
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsAssignment_1_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:902:1: ( rule__Model__DeclarationsAssignment_1_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:902:2: rule__Model__DeclarationsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_1_0_in_rule__Model__Alternatives_11851);
                    rule__Model__DeclarationsAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDeclarationsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:906:6: ( ( rule__Model__StatementsAssignment_1_1 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:906:6: ( ( rule__Model__StatementsAssignment_1_1 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:907:1: ( rule__Model__StatementsAssignment_1_1 )
                    {
                     before(grammarAccess.getModelAccess().getStatementsAssignment_1_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:908:1: ( rule__Model__StatementsAssignment_1_1 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:908:2: rule__Model__StatementsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Model__StatementsAssignment_1_1_in_rule__Model__Alternatives_11869);
                    rule__Model__StatementsAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getStatementsAssignment_1_1()); 

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
    // $ANTLR end rule__Model__Alternatives_1


    // $ANTLR start rule__Declaration__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:917:1: rule__Declaration__Alternatives : ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) | ( ruleDefXor ) | ( ruleDefMutex ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:921:1: ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) | ( ruleDefXor ) | ( ruleDefMutex ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 14:
            case 47:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
                {
                alt2=3;
                }
                break;
            case 18:
                {
                alt2=4;
                }
                break;
            case 20:
                {
                alt2=5;
                }
                break;
            case 22:
                {
                alt2=6;
                }
                break;
            case 23:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("917:1: rule__Declaration__Alternatives : ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) | ( ruleDefXor ) | ( ruleDefMutex ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:922:1: ( ruleDefSort )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:922:1: ( ruleDefSort )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:923:1: ruleDefSort
                    {
                     before(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefSort_in_rule__Declaration__Alternatives1902);
                    ruleDefSort();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:928:6: ( ruleDefRange )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:928:6: ( ruleDefRange )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:929:1: ruleDefRange
                    {
                     before(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDefRange_in_rule__Declaration__Alternatives1919);
                    ruleDefRange();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:934:6: ( ruleDefOption )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:934:6: ( ruleDefOption )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:935:1: ruleDefOption
                    {
                     before(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDefOption_in_rule__Declaration__Alternatives1936);
                    ruleDefOption();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:940:6: ( ruleDefCompletion )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:940:6: ( ruleDefCompletion )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:941:1: ruleDefCompletion
                    {
                     before(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDefCompletion_in_rule__Declaration__Alternatives1953);
                    ruleDefCompletion();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:946:6: ( ruleDefNonInertia )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:946:6: ( ruleDefNonInertia )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:947:1: ruleDefNonInertia
                    {
                     before(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDefNonInertia_in_rule__Declaration__Alternatives1970);
                    ruleDefNonInertia();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:952:6: ( ruleDefXor )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:952:6: ( ruleDefXor )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:953:1: ruleDefXor
                    {
                     before(grammarAccess.getDeclarationAccess().getDefXorParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleDefXor_in_rule__Declaration__Alternatives1987);
                    ruleDefXor();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefXorParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:958:6: ( ruleDefMutex )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:958:6: ( ruleDefMutex )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:959:1: ruleDefMutex
                    {
                     before(grammarAccess.getDeclarationAccess().getDefMutexParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDefMutex_in_rule__Declaration__Alternatives2004);
                    ruleDefMutex();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefMutexParserRuleCall_6()); 

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
    // $ANTLR end rule__Declaration__Alternatives


    // $ANTLR start rule__DefOption__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:969:1: rule__DefOption__Alternatives : ( ( ( rule__DefOption__Group_0__0 ) ) | ( ( rule__DefOption__Group_1__0 ) ) );
    public final void rule__DefOption__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:973:1: ( ( ( rule__DefOption__Group_0__0 ) ) | ( ( rule__DefOption__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_ID) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==RULE_ID) ) {
                        alt3=2;
                    }
                    else if ( (LA3_2==RULE_INT) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("969:1: rule__DefOption__Alternatives : ( ( ( rule__DefOption__Group_0__0 ) ) | ( ( rule__DefOption__Group_1__0 ) ) );", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("969:1: rule__DefOption__Alternatives : ( ( ( rule__DefOption__Group_0__0 ) ) | ( ( rule__DefOption__Group_1__0 ) ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("969:1: rule__DefOption__Alternatives : ( ( ( rule__DefOption__Group_0__0 ) ) | ( ( rule__DefOption__Group_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:974:1: ( ( rule__DefOption__Group_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:974:1: ( ( rule__DefOption__Group_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:975:1: ( rule__DefOption__Group_0__0 )
                    {
                     before(grammarAccess.getDefOptionAccess().getGroup_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:976:1: ( rule__DefOption__Group_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:976:2: rule__DefOption__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__DefOption__Group_0__0_in_rule__DefOption__Alternatives2036);
                    rule__DefOption__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDefOptionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:980:6: ( ( rule__DefOption__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:980:6: ( ( rule__DefOption__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:981:1: ( rule__DefOption__Group_1__0 )
                    {
                     before(grammarAccess.getDefOptionAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:982:1: ( rule__DefOption__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:982:2: rule__DefOption__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__DefOption__Group_1__0_in_rule__DefOption__Alternatives2054);
                    rule__DefOption__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDefOptionAccess().getGroup_1()); 

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
    // $ANTLR end rule__DefOption__Alternatives


    // $ANTLR start rule__Statement__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:991:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:995:1: ( ( ruleSortDefinition ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15||(LA4_1>=24 && LA4_1<=25)||(LA4_1>=31 && LA4_1<=46)) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("991:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ( rule__Statement__Group_1__0 ) ) );", 4, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA4_0==RULE_STRING||(LA4_0>=RULE_INT && LA4_0<=RULE_BOOLEAN)||LA4_0==12||LA4_0==25||LA4_0==27||LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("991:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ( rule__Statement__Group_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:996:1: ( ruleSortDefinition )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:996:1: ( ruleSortDefinition )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:997:1: ruleSortDefinition
                    {
                     before(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSortDefinition_in_rule__Statement__Alternatives2087);
                    ruleSortDefinition();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1002:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1002:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1003:1: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1004:1: ( rule__Statement__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1004:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives2104);
                    rule__Statement__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

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
    // $ANTLR end rule__Statement__Alternatives


    // $ANTLR start rule__DeclaredParameter__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1013:1: rule__DeclaredParameter__Alternatives : ( ( ( rule__DeclaredParameter__NameAssignment_0 ) ) | ( ( rule__DeclaredParameter__NameAssignment_1 ) ) );
    public final void rule__DeclaredParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1017:1: ( ( ( rule__DeclaredParameter__NameAssignment_0 ) ) | ( ( rule__DeclaredParameter__NameAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1013:1: rule__DeclaredParameter__Alternatives : ( ( ( rule__DeclaredParameter__NameAssignment_0 ) ) | ( ( rule__DeclaredParameter__NameAssignment_1 ) ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1018:1: ( ( rule__DeclaredParameter__NameAssignment_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1018:1: ( ( rule__DeclaredParameter__NameAssignment_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1019:1: ( rule__DeclaredParameter__NameAssignment_0 )
                    {
                     before(grammarAccess.getDeclaredParameterAccess().getNameAssignment_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1020:1: ( rule__DeclaredParameter__NameAssignment_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1020:2: rule__DeclaredParameter__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DeclaredParameter__NameAssignment_0_in_rule__DeclaredParameter__Alternatives2137);
                    rule__DeclaredParameter__NameAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDeclaredParameterAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1024:6: ( ( rule__DeclaredParameter__NameAssignment_1 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1024:6: ( ( rule__DeclaredParameter__NameAssignment_1 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1025:1: ( rule__DeclaredParameter__NameAssignment_1 )
                    {
                     before(grammarAccess.getDeclaredParameterAccess().getNameAssignment_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1026:1: ( rule__DeclaredParameter__NameAssignment_1 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1026:2: rule__DeclaredParameter__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__DeclaredParameter__NameAssignment_1_in_rule__DeclaredParameter__Alternatives2155);
                    rule__DeclaredParameter__NameAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getDeclaredParameterAccess().getNameAssignment_1()); 

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
    // $ANTLR end rule__DeclaredParameter__Alternatives


    // $ANTLR start rule__Qualifier__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1035:1: rule__Qualifier__Alternatives : ( ( ruleExists ) | ( ruleForall ) );
    public final void rule__Qualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1039:1: ( ( ruleExists ) | ( ruleForall ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            else if ( (LA6_0==29) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1035:1: rule__Qualifier__Alternatives : ( ( ruleExists ) | ( ruleForall ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1040:1: ( ruleExists )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1040:1: ( ruleExists )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1041:1: ruleExists
                    {
                     before(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExists_in_rule__Qualifier__Alternatives2188);
                    ruleExists();
                    _fsp--;

                     after(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1046:6: ( ruleForall )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1046:6: ( ruleForall )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1047:1: ruleForall
                    {
                     before(grammarAccess.getQualifierAccess().getForallParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleForall_in_rule__Qualifier__Alternatives2205);
                    ruleForall();
                    _fsp--;

                     after(grammarAccess.getQualifierAccess().getForallParserRuleCall_1()); 

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
    // $ANTLR end rule__Qualifier__Alternatives


    // $ANTLR start rule__AssignmentOp__Alternatives_1_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1057:1: rule__AssignmentOp__Alternatives_1_0 : ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) );
    public final void rule__AssignmentOp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1061:1: ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1057:1: rule__AssignmentOp__Alternatives_1_0 : ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1062:1: ( ( rule__AssignmentOp__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1062:1: ( ( rule__AssignmentOp__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1063:1: ( rule__AssignmentOp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1064:1: ( rule__AssignmentOp__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1064:2: rule__AssignmentOp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__0_in_rule__AssignmentOp__Alternatives_1_02237);
                    rule__AssignmentOp__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1068:6: ( ( rule__AssignmentOp__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1068:6: ( ( rule__AssignmentOp__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1069:1: ( rule__AssignmentOp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAssignmentOpAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1070:1: ( rule__AssignmentOp__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1070:2: rule__AssignmentOp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__0_in_rule__AssignmentOp__Alternatives_1_02255);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1079:1: rule__Relational__Alternatives_1_0 : ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) );
    public final void rule__Relational__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1083:1: ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            case 38:
                {
                alt8=4;
                }
                break;
            case 39:
                {
                alt8=5;
                }
                break;
            case 40:
                {
                alt8=6;
                }
                break;
            case 41:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1079:1: rule__Relational__Alternatives_1_0 : ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1084:1: ( ( rule__Relational__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1084:1: ( ( rule__Relational__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1085:1: ( rule__Relational__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1086:1: ( rule__Relational__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1086:2: rule__Relational__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_0__0_in_rule__Relational__Alternatives_1_02288);
                    rule__Relational__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1090:6: ( ( rule__Relational__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1090:6: ( ( rule__Relational__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1091:1: ( rule__Relational__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1092:1: ( rule__Relational__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1092:2: rule__Relational__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_1__0_in_rule__Relational__Alternatives_1_02306);
                    rule__Relational__Group_1_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1096:6: ( ( rule__Relational__Group_1_0_2__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1096:6: ( ( rule__Relational__Group_1_0_2__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1097:1: ( rule__Relational__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1098:1: ( rule__Relational__Group_1_0_2__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1098:2: rule__Relational__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_2__0_in_rule__Relational__Alternatives_1_02324);
                    rule__Relational__Group_1_0_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1102:6: ( ( rule__Relational__Group_1_0_3__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1102:6: ( ( rule__Relational__Group_1_0_3__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1103:1: ( rule__Relational__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_3()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1104:1: ( rule__Relational__Group_1_0_3__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1104:2: rule__Relational__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_3__0_in_rule__Relational__Alternatives_1_02342);
                    rule__Relational__Group_1_0_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1108:6: ( ( rule__Relational__Group_1_0_4__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1108:6: ( ( rule__Relational__Group_1_0_4__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1109:1: ( rule__Relational__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_4()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1110:1: ( rule__Relational__Group_1_0_4__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1110:2: rule__Relational__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_4__0_in_rule__Relational__Alternatives_1_02360);
                    rule__Relational__Group_1_0_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1114:6: ( ( rule__Relational__Group_1_0_5__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1114:6: ( ( rule__Relational__Group_1_0_5__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1115:1: ( rule__Relational__Group_1_0_5__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_5()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1116:1: ( rule__Relational__Group_1_0_5__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1116:2: rule__Relational__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_5__0_in_rule__Relational__Alternatives_1_02378);
                    rule__Relational__Group_1_0_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1120:6: ( ( rule__Relational__Group_1_0_6__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1120:6: ( ( rule__Relational__Group_1_0_6__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1121:1: ( rule__Relational__Group_1_0_6__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_6()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1122:1: ( rule__Relational__Group_1_0_6__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1122:2: rule__Relational__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_6__0_in_rule__Relational__Alternatives_1_02396);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1131:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1135:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==42) ) {
                alt9=1;
            }
            else if ( (LA9_0==43) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1131:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1136:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1136:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1137:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1138:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1138:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02429);
                    rule__Addition__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1142:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1142:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1143:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1144:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1144:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02447);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1153:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1157:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==44) ) {
                alt10=1;
            }
            else if ( (LA10_0==45) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1153:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1158:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1158:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1159:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1160:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1160:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02480);
                    rule__Multiplication__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1164:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1164:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1165:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1166:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1166:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02498);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1175:1: rule__PrePrimaryExpr__Alternatives : ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) );
    public final void rule__PrePrimaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1179:1: ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1175:1: rule__PrePrimaryExpr__Alternatives : ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1180:1: ( ruleTerminalExpression )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1180:1: ( ruleTerminalExpression )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1181:1: ruleTerminalExpression
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTerminalExpression_in_rule__PrePrimaryExpr__Alternatives2531);
                    ruleTerminalExpression();
                    _fsp--;

                     after(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1186:6: ( ruleAbstractRef )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1186:6: ( ruleAbstractRef )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1187:1: ruleAbstractRef
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractRef_in_rule__PrePrimaryExpr__Alternatives2548);
                    ruleAbstractRef();
                    _fsp--;

                     after(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1192:6: ( ( rule__PrePrimaryExpr__Group_2__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1192:6: ( ( rule__PrePrimaryExpr__Group_2__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1193:1: ( rule__PrePrimaryExpr__Group_2__0 )
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getGroup_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1194:1: ( rule__PrePrimaryExpr__Group_2__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1194:2: rule__PrePrimaryExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__0_in_rule__PrePrimaryExpr__Alternatives2565);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1203:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1207:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt12=1;
                }
                break;
            case RULE_STRING:
                {
                alt12=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1203:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1208:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1208:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1209:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1210:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1210:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives2598);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1214:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1214:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1215:1: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1216:1: ( rule__TerminalExpression__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1216:2: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives2616);
                    rule__TerminalExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1220:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1220:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1221:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1222:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1222:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives2634);
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


    // $ANTLR start rule__Model__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1233:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1237:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1238:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02665);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02668);
            rule__Model__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1245:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1249:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1250:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1250:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1251:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1252:1: ( rule__Model__ImportsAssignment_0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1252:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2695);
            	    rule__Model__ImportsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getImportsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1262:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1266:1: ( rule__Model__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1267:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12726);
            rule__Model__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1273:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1277:1: ( ( ( rule__Model__Alternatives_1 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1278:1: ( ( rule__Model__Alternatives_1 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1278:1: ( ( rule__Model__Alternatives_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1279:1: ( rule__Model__Alternatives_1 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1280:1: ( rule__Model__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_BOOLEAN)||LA14_0==12||LA14_0==14||(LA14_0>=16 && LA14_0<=18)||LA14_0==20||(LA14_0>=22 && LA14_0<=23)||LA14_0==25||LA14_0==27||LA14_0==29||LA14_0==47) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1280:2: rule__Model__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_1_in_rule__Model__Group__1__Impl2753);
            	    rule__Model__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__Import__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1294:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1298:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1299:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02788);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02791);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1306:1: rule__Import__Group__0__Impl : ( 'load' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1310:1: ( ( 'load' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1311:1: ( 'load' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1311:1: ( 'load' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1312:1: 'load'
            {
             before(grammarAccess.getImportAccess().getLoadKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Import__Group__0__Impl2819); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1325:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1329:1: ( rule__Import__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1330:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12850);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1336:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1340:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1341:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1341:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1342:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1343:1: ( rule__Import__ImportURIAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1343:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2877);
            rule__Import__ImportURIAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__DefSort__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1357:1: rule__DefSort__Group__0 : rule__DefSort__Group__0__Impl rule__DefSort__Group__1 ;
    public final void rule__DefSort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1361:1: ( rule__DefSort__Group__0__Impl rule__DefSort__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1362:2: rule__DefSort__Group__0__Impl rule__DefSort__Group__1
            {
            pushFollow(FOLLOW_rule__DefSort__Group__0__Impl_in_rule__DefSort__Group__02911);
            rule__DefSort__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group__1_in_rule__DefSort__Group__02914);
            rule__DefSort__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group__0


    // $ANTLR start rule__DefSort__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1369:1: rule__DefSort__Group__0__Impl : ( ( rule__DefSort__ReifiedAssignment_0 )? ) ;
    public final void rule__DefSort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1373:1: ( ( ( rule__DefSort__ReifiedAssignment_0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1374:1: ( ( rule__DefSort__ReifiedAssignment_0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1374:1: ( ( rule__DefSort__ReifiedAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1375:1: ( rule__DefSort__ReifiedAssignment_0 )?
            {
             before(grammarAccess.getDefSortAccess().getReifiedAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1376:1: ( rule__DefSort__ReifiedAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==47) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1376:2: rule__DefSort__ReifiedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DefSort__ReifiedAssignment_0_in_rule__DefSort__Group__0__Impl2941);
                    rule__DefSort__ReifiedAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefSortAccess().getReifiedAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group__0__Impl


    // $ANTLR start rule__DefSort__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1386:1: rule__DefSort__Group__1 : rule__DefSort__Group__1__Impl rule__DefSort__Group__2 ;
    public final void rule__DefSort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1390:1: ( rule__DefSort__Group__1__Impl rule__DefSort__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1391:2: rule__DefSort__Group__1__Impl rule__DefSort__Group__2
            {
            pushFollow(FOLLOW_rule__DefSort__Group__1__Impl_in_rule__DefSort__Group__12972);
            rule__DefSort__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group__2_in_rule__DefSort__Group__12975);
            rule__DefSort__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group__1


    // $ANTLR start rule__DefSort__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1398:1: rule__DefSort__Group__1__Impl : ( 'sort' ) ;
    public final void rule__DefSort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1402:1: ( ( 'sort' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1403:1: ( 'sort' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1403:1: ( 'sort' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1404:1: 'sort'
            {
             before(grammarAccess.getDefSortAccess().getSortKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__DefSort__Group__1__Impl3003); 
             after(grammarAccess.getDefSortAccess().getSortKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group__1__Impl


    // $ANTLR start rule__DefSort__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1417:1: rule__DefSort__Group__2 : rule__DefSort__Group__2__Impl rule__DefSort__Group__3 ;
    public final void rule__DefSort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1421:1: ( rule__DefSort__Group__2__Impl rule__DefSort__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1422:2: rule__DefSort__Group__2__Impl rule__DefSort__Group__3
            {
            pushFollow(FOLLOW_rule__DefSort__Group__2__Impl_in_rule__DefSort__Group__23034);
            rule__DefSort__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group__3_in_rule__DefSort__Group__23037);
            rule__DefSort__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group__2


    // $ANTLR start rule__DefSort__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1429:1: rule__DefSort__Group__2__Impl : ( ( rule__DefSort__NameAssignment_2 ) ) ;
    public final void rule__DefSort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1433:1: ( ( ( rule__DefSort__NameAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1434:1: ( ( rule__DefSort__NameAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1434:1: ( ( rule__DefSort__NameAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1435:1: ( rule__DefSort__NameAssignment_2 )
            {
             before(grammarAccess.getDefSortAccess().getNameAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1436:1: ( rule__DefSort__NameAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1436:2: rule__DefSort__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DefSort__NameAssignment_2_in_rule__DefSort__Group__2__Impl3064);
            rule__DefSort__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDefSortAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group__2__Impl


    // $ANTLR start rule__DefSort__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1446:1: rule__DefSort__Group__3 : rule__DefSort__Group__3__Impl ;
    public final void rule__DefSort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1450:1: ( rule__DefSort__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1451:2: rule__DefSort__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DefSort__Group__3__Impl_in_rule__DefSort__Group__33094);
            rule__DefSort__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group__3


    // $ANTLR start rule__DefSort__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1457:1: rule__DefSort__Group__3__Impl : ( ( rule__DefSort__Group_3__0 )? ) ;
    public final void rule__DefSort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1461:1: ( ( ( rule__DefSort__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1462:1: ( ( rule__DefSort__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1462:1: ( ( rule__DefSort__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1463:1: ( rule__DefSort__Group_3__0 )?
            {
             before(grammarAccess.getDefSortAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1464:1: ( rule__DefSort__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==15) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1464:2: rule__DefSort__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DefSort__Group_3__0_in_rule__DefSort__Group__3__Impl3121);
                    rule__DefSort__Group_3__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefSortAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group__3__Impl


    // $ANTLR start rule__DefSort__Group_3__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1482:1: rule__DefSort__Group_3__0 : rule__DefSort__Group_3__0__Impl rule__DefSort__Group_3__1 ;
    public final void rule__DefSort__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1486:1: ( rule__DefSort__Group_3__0__Impl rule__DefSort__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1487:2: rule__DefSort__Group_3__0__Impl rule__DefSort__Group_3__1
            {
            pushFollow(FOLLOW_rule__DefSort__Group_3__0__Impl_in_rule__DefSort__Group_3__03160);
            rule__DefSort__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group_3__1_in_rule__DefSort__Group_3__03163);
            rule__DefSort__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group_3__0


    // $ANTLR start rule__DefSort__Group_3__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1494:1: rule__DefSort__Group_3__0__Impl : ( ':' ) ;
    public final void rule__DefSort__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1498:1: ( ( ':' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1499:1: ( ':' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1499:1: ( ':' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1500:1: ':'
            {
             before(grammarAccess.getDefSortAccess().getColonKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__DefSort__Group_3__0__Impl3191); 
             after(grammarAccess.getDefSortAccess().getColonKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group_3__0__Impl


    // $ANTLR start rule__DefSort__Group_3__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1513:1: rule__DefSort__Group_3__1 : rule__DefSort__Group_3__1__Impl ;
    public final void rule__DefSort__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1517:1: ( rule__DefSort__Group_3__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1518:2: rule__DefSort__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DefSort__Group_3__1__Impl_in_rule__DefSort__Group_3__13222);
            rule__DefSort__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group_3__1


    // $ANTLR start rule__DefSort__Group_3__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1524:1: rule__DefSort__Group_3__1__Impl : ( ( rule__DefSort__TypeAssignment_3_1 ) ) ;
    public final void rule__DefSort__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1528:1: ( ( ( rule__DefSort__TypeAssignment_3_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1529:1: ( ( rule__DefSort__TypeAssignment_3_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1529:1: ( ( rule__DefSort__TypeAssignment_3_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1530:1: ( rule__DefSort__TypeAssignment_3_1 )
            {
             before(grammarAccess.getDefSortAccess().getTypeAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1531:1: ( rule__DefSort__TypeAssignment_3_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1531:2: rule__DefSort__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DefSort__TypeAssignment_3_1_in_rule__DefSort__Group_3__1__Impl3249);
            rule__DefSort__TypeAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getDefSortAccess().getTypeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group_3__1__Impl


    // $ANTLR start rule__DefRange__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1545:1: rule__DefRange__Group__0 : rule__DefRange__Group__0__Impl rule__DefRange__Group__1 ;
    public final void rule__DefRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1549:1: ( rule__DefRange__Group__0__Impl rule__DefRange__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1550:2: rule__DefRange__Group__0__Impl rule__DefRange__Group__1
            {
            pushFollow(FOLLOW_rule__DefRange__Group__0__Impl_in_rule__DefRange__Group__03283);
            rule__DefRange__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefRange__Group__1_in_rule__DefRange__Group__03286);
            rule__DefRange__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__Group__0


    // $ANTLR start rule__DefRange__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1557:1: rule__DefRange__Group__0__Impl : ( 'range' ) ;
    public final void rule__DefRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1561:1: ( ( 'range' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1562:1: ( 'range' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1562:1: ( 'range' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1563:1: 'range'
            {
             before(grammarAccess.getDefRangeAccess().getRangeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__DefRange__Group__0__Impl3314); 
             after(grammarAccess.getDefRangeAccess().getRangeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__Group__0__Impl


    // $ANTLR start rule__DefRange__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1576:1: rule__DefRange__Group__1 : rule__DefRange__Group__1__Impl rule__DefRange__Group__2 ;
    public final void rule__DefRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1580:1: ( rule__DefRange__Group__1__Impl rule__DefRange__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1581:2: rule__DefRange__Group__1__Impl rule__DefRange__Group__2
            {
            pushFollow(FOLLOW_rule__DefRange__Group__1__Impl_in_rule__DefRange__Group__13345);
            rule__DefRange__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefRange__Group__2_in_rule__DefRange__Group__13348);
            rule__DefRange__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__Group__1


    // $ANTLR start rule__DefRange__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1588:1: rule__DefRange__Group__1__Impl : ( ( rule__DefRange__NameAssignment_1 ) ) ;
    public final void rule__DefRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1592:1: ( ( ( rule__DefRange__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1593:1: ( ( rule__DefRange__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1593:1: ( ( rule__DefRange__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1594:1: ( rule__DefRange__NameAssignment_1 )
            {
             before(grammarAccess.getDefRangeAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1595:1: ( rule__DefRange__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1595:2: rule__DefRange__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DefRange__NameAssignment_1_in_rule__DefRange__Group__1__Impl3375);
            rule__DefRange__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDefRangeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__Group__1__Impl


    // $ANTLR start rule__DefRange__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1605:1: rule__DefRange__Group__2 : rule__DefRange__Group__2__Impl rule__DefRange__Group__3 ;
    public final void rule__DefRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1609:1: ( rule__DefRange__Group__2__Impl rule__DefRange__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1610:2: rule__DefRange__Group__2__Impl rule__DefRange__Group__3
            {
            pushFollow(FOLLOW_rule__DefRange__Group__2__Impl_in_rule__DefRange__Group__23405);
            rule__DefRange__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefRange__Group__3_in_rule__DefRange__Group__23408);
            rule__DefRange__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__Group__2


    // $ANTLR start rule__DefRange__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1617:1: rule__DefRange__Group__2__Impl : ( ( rule__DefRange__MinAssignment_2 ) ) ;
    public final void rule__DefRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1621:1: ( ( ( rule__DefRange__MinAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1622:1: ( ( rule__DefRange__MinAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1622:1: ( ( rule__DefRange__MinAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1623:1: ( rule__DefRange__MinAssignment_2 )
            {
             before(grammarAccess.getDefRangeAccess().getMinAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1624:1: ( rule__DefRange__MinAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1624:2: rule__DefRange__MinAssignment_2
            {
            pushFollow(FOLLOW_rule__DefRange__MinAssignment_2_in_rule__DefRange__Group__2__Impl3435);
            rule__DefRange__MinAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDefRangeAccess().getMinAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__Group__2__Impl


    // $ANTLR start rule__DefRange__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1634:1: rule__DefRange__Group__3 : rule__DefRange__Group__3__Impl ;
    public final void rule__DefRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1638:1: ( rule__DefRange__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1639:2: rule__DefRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DefRange__Group__3__Impl_in_rule__DefRange__Group__33465);
            rule__DefRange__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__Group__3


    // $ANTLR start rule__DefRange__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1645:1: rule__DefRange__Group__3__Impl : ( ( rule__DefRange__MaxAssignment_3 ) ) ;
    public final void rule__DefRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1649:1: ( ( ( rule__DefRange__MaxAssignment_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1650:1: ( ( rule__DefRange__MaxAssignment_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1650:1: ( ( rule__DefRange__MaxAssignment_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1651:1: ( rule__DefRange__MaxAssignment_3 )
            {
             before(grammarAccess.getDefRangeAccess().getMaxAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1652:1: ( rule__DefRange__MaxAssignment_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1652:2: rule__DefRange__MaxAssignment_3
            {
            pushFollow(FOLLOW_rule__DefRange__MaxAssignment_3_in_rule__DefRange__Group__3__Impl3492);
            rule__DefRange__MaxAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDefRangeAccess().getMaxAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__Group__3__Impl


    // $ANTLR start rule__DefOption__Group_0__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1670:1: rule__DefOption__Group_0__0 : rule__DefOption__Group_0__0__Impl rule__DefOption__Group_0__1 ;
    public final void rule__DefOption__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1674:1: ( rule__DefOption__Group_0__0__Impl rule__DefOption__Group_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1675:2: rule__DefOption__Group_0__0__Impl rule__DefOption__Group_0__1
            {
            pushFollow(FOLLOW_rule__DefOption__Group_0__0__Impl_in_rule__DefOption__Group_0__03530);
            rule__DefOption__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group_0__1_in_rule__DefOption__Group_0__03533);
            rule__DefOption__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_0__0


    // $ANTLR start rule__DefOption__Group_0__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1682:1: rule__DefOption__Group_0__0__Impl : ( 'option' ) ;
    public final void rule__DefOption__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1686:1: ( ( 'option' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1687:1: ( 'option' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1687:1: ( 'option' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1688:1: 'option'
            {
             before(grammarAccess.getDefOptionAccess().getOptionKeyword_0_0()); 
            match(input,17,FOLLOW_17_in_rule__DefOption__Group_0__0__Impl3561); 
             after(grammarAccess.getDefOptionAccess().getOptionKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_0__0__Impl


    // $ANTLR start rule__DefOption__Group_0__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1701:1: rule__DefOption__Group_0__1 : rule__DefOption__Group_0__1__Impl rule__DefOption__Group_0__2 ;
    public final void rule__DefOption__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1705:1: ( rule__DefOption__Group_0__1__Impl rule__DefOption__Group_0__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1706:2: rule__DefOption__Group_0__1__Impl rule__DefOption__Group_0__2
            {
            pushFollow(FOLLOW_rule__DefOption__Group_0__1__Impl_in_rule__DefOption__Group_0__13592);
            rule__DefOption__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group_0__2_in_rule__DefOption__Group_0__13595);
            rule__DefOption__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_0__1


    // $ANTLR start rule__DefOption__Group_0__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1713:1: rule__DefOption__Group_0__1__Impl : ( ( rule__DefOption__NameAssignment_0_1 ) ) ;
    public final void rule__DefOption__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1717:1: ( ( ( rule__DefOption__NameAssignment_0_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1718:1: ( ( rule__DefOption__NameAssignment_0_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1718:1: ( ( rule__DefOption__NameAssignment_0_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1719:1: ( rule__DefOption__NameAssignment_0_1 )
            {
             before(grammarAccess.getDefOptionAccess().getNameAssignment_0_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1720:1: ( rule__DefOption__NameAssignment_0_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1720:2: rule__DefOption__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__DefOption__NameAssignment_0_1_in_rule__DefOption__Group_0__1__Impl3622);
            rule__DefOption__NameAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_0__1__Impl


    // $ANTLR start rule__DefOption__Group_0__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1730:1: rule__DefOption__Group_0__2 : rule__DefOption__Group_0__2__Impl ;
    public final void rule__DefOption__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1734:1: ( rule__DefOption__Group_0__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1735:2: rule__DefOption__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__DefOption__Group_0__2__Impl_in_rule__DefOption__Group_0__23652);
            rule__DefOption__Group_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_0__2


    // $ANTLR start rule__DefOption__Group_0__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1741:1: rule__DefOption__Group_0__2__Impl : ( ( rule__DefOption__ValueAssignment_0_2 ) ) ;
    public final void rule__DefOption__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1745:1: ( ( ( rule__DefOption__ValueAssignment_0_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1746:1: ( ( rule__DefOption__ValueAssignment_0_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1746:1: ( ( rule__DefOption__ValueAssignment_0_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1747:1: ( rule__DefOption__ValueAssignment_0_2 )
            {
             before(grammarAccess.getDefOptionAccess().getValueAssignment_0_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1748:1: ( rule__DefOption__ValueAssignment_0_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1748:2: rule__DefOption__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_rule__DefOption__ValueAssignment_0_2_in_rule__DefOption__Group_0__2__Impl3679);
            rule__DefOption__ValueAssignment_0_2();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_0__2__Impl


    // $ANTLR start rule__DefOption__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1764:1: rule__DefOption__Group_1__0 : rule__DefOption__Group_1__0__Impl rule__DefOption__Group_1__1 ;
    public final void rule__DefOption__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1768:1: ( rule__DefOption__Group_1__0__Impl rule__DefOption__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1769:2: rule__DefOption__Group_1__0__Impl rule__DefOption__Group_1__1
            {
            pushFollow(FOLLOW_rule__DefOption__Group_1__0__Impl_in_rule__DefOption__Group_1__03715);
            rule__DefOption__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group_1__1_in_rule__DefOption__Group_1__03718);
            rule__DefOption__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1__0


    // $ANTLR start rule__DefOption__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1776:1: rule__DefOption__Group_1__0__Impl : ( 'option' ) ;
    public final void rule__DefOption__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1780:1: ( ( 'option' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1781:1: ( 'option' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1781:1: ( 'option' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1782:1: 'option'
            {
             before(grammarAccess.getDefOptionAccess().getOptionKeyword_1_0()); 
            match(input,17,FOLLOW_17_in_rule__DefOption__Group_1__0__Impl3746); 
             after(grammarAccess.getDefOptionAccess().getOptionKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1__0__Impl


    // $ANTLR start rule__DefOption__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1795:1: rule__DefOption__Group_1__1 : rule__DefOption__Group_1__1__Impl rule__DefOption__Group_1__2 ;
    public final void rule__DefOption__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1799:1: ( rule__DefOption__Group_1__1__Impl rule__DefOption__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1800:2: rule__DefOption__Group_1__1__Impl rule__DefOption__Group_1__2
            {
            pushFollow(FOLLOW_rule__DefOption__Group_1__1__Impl_in_rule__DefOption__Group_1__13777);
            rule__DefOption__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group_1__2_in_rule__DefOption__Group_1__13780);
            rule__DefOption__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1__1


    // $ANTLR start rule__DefOption__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1807:1: rule__DefOption__Group_1__1__Impl : ( ( rule__DefOption__NameAssignment_1_1 ) ) ;
    public final void rule__DefOption__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1811:1: ( ( ( rule__DefOption__NameAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1812:1: ( ( rule__DefOption__NameAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1812:1: ( ( rule__DefOption__NameAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1813:1: ( rule__DefOption__NameAssignment_1_1 )
            {
             before(grammarAccess.getDefOptionAccess().getNameAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1814:1: ( rule__DefOption__NameAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1814:2: rule__DefOption__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__DefOption__NameAssignment_1_1_in_rule__DefOption__Group_1__1__Impl3807);
            rule__DefOption__NameAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1__1__Impl


    // $ANTLR start rule__DefOption__Group_1__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1824:1: rule__DefOption__Group_1__2 : rule__DefOption__Group_1__2__Impl ;
    public final void rule__DefOption__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1828:1: ( rule__DefOption__Group_1__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1829:2: rule__DefOption__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DefOption__Group_1__2__Impl_in_rule__DefOption__Group_1__23837);
            rule__DefOption__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1__2


    // $ANTLR start rule__DefOption__Group_1__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1835:1: rule__DefOption__Group_1__2__Impl : ( ( rule__DefOption__Value2Assignment_1_2 ) ) ;
    public final void rule__DefOption__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1839:1: ( ( ( rule__DefOption__Value2Assignment_1_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1840:1: ( ( rule__DefOption__Value2Assignment_1_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1840:1: ( ( rule__DefOption__Value2Assignment_1_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1841:1: ( rule__DefOption__Value2Assignment_1_2 )
            {
             before(grammarAccess.getDefOptionAccess().getValue2Assignment_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1842:1: ( rule__DefOption__Value2Assignment_1_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1842:2: rule__DefOption__Value2Assignment_1_2
            {
            pushFollow(FOLLOW_rule__DefOption__Value2Assignment_1_2_in_rule__DefOption__Group_1__2__Impl3864);
            rule__DefOption__Value2Assignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getValue2Assignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1__2__Impl


    // $ANTLR start rule__DefCompletion__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1858:1: rule__DefCompletion__Group__0 : rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1 ;
    public final void rule__DefCompletion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1862:1: ( rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1863:2: rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__0__Impl_in_rule__DefCompletion__Group__03900);
            rule__DefCompletion__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefCompletion__Group__1_in_rule__DefCompletion__Group__03903);
            rule__DefCompletion__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__Group__0


    // $ANTLR start rule__DefCompletion__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1870:1: rule__DefCompletion__Group__0__Impl : ( 'completion' ) ;
    public final void rule__DefCompletion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1874:1: ( ( 'completion' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1875:1: ( 'completion' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1875:1: ( 'completion' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1876:1: 'completion'
            {
             before(grammarAccess.getDefCompletionAccess().getCompletionKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__DefCompletion__Group__0__Impl3931); 
             after(grammarAccess.getDefCompletionAccess().getCompletionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__Group__0__Impl


    // $ANTLR start rule__DefCompletion__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1889:1: rule__DefCompletion__Group__1 : rule__DefCompletion__Group__1__Impl rule__DefCompletion__Group__2 ;
    public final void rule__DefCompletion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1893:1: ( rule__DefCompletion__Group__1__Impl rule__DefCompletion__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1894:2: rule__DefCompletion__Group__1__Impl rule__DefCompletion__Group__2
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__1__Impl_in_rule__DefCompletion__Group__13962);
            rule__DefCompletion__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefCompletion__Group__2_in_rule__DefCompletion__Group__13965);
            rule__DefCompletion__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__Group__1


    // $ANTLR start rule__DefCompletion__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1901:1: rule__DefCompletion__Group__1__Impl : ( ( 'Theta' )? ) ;
    public final void rule__DefCompletion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1905:1: ( ( ( 'Theta' )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1906:1: ( ( 'Theta' )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1906:1: ( ( 'Theta' )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1907:1: ( 'Theta' )?
            {
             before(grammarAccess.getDefCompletionAccess().getThetaKeyword_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1908:1: ( 'Theta' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1909:2: 'Theta'
                    {
                    match(input,19,FOLLOW_19_in_rule__DefCompletion__Group__1__Impl3994); 

                    }
                    break;

            }

             after(grammarAccess.getDefCompletionAccess().getThetaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__Group__1__Impl


    // $ANTLR start rule__DefCompletion__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1920:1: rule__DefCompletion__Group__2 : rule__DefCompletion__Group__2__Impl ;
    public final void rule__DefCompletion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1924:1: ( rule__DefCompletion__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1925:2: rule__DefCompletion__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__2__Impl_in_rule__DefCompletion__Group__24027);
            rule__DefCompletion__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__Group__2


    // $ANTLR start rule__DefCompletion__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1931:1: rule__DefCompletion__Group__2__Impl : ( ( rule__DefCompletion__NameAssignment_2 ) ) ;
    public final void rule__DefCompletion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1935:1: ( ( ( rule__DefCompletion__NameAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1936:1: ( ( rule__DefCompletion__NameAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1936:1: ( ( rule__DefCompletion__NameAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1937:1: ( rule__DefCompletion__NameAssignment_2 )
            {
             before(grammarAccess.getDefCompletionAccess().getNameAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1938:1: ( rule__DefCompletion__NameAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1938:2: rule__DefCompletion__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DefCompletion__NameAssignment_2_in_rule__DefCompletion__Group__2__Impl4054);
            rule__DefCompletion__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDefCompletionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__Group__2__Impl


    // $ANTLR start rule__DefNonInertia__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1954:1: rule__DefNonInertia__Group__0 : rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1 ;
    public final void rule__DefNonInertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1958:1: ( rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1959:2: rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__0__Impl_in_rule__DefNonInertia__Group__04090);
            rule__DefNonInertia__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefNonInertia__Group__1_in_rule__DefNonInertia__Group__04093);
            rule__DefNonInertia__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group__0


    // $ANTLR start rule__DefNonInertia__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1966:1: rule__DefNonInertia__Group__0__Impl : ( 'noninertial' ) ;
    public final void rule__DefNonInertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1970:1: ( ( 'noninertial' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1971:1: ( 'noninertial' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1971:1: ( 'noninertial' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1972:1: 'noninertial'
            {
             before(grammarAccess.getDefNonInertiaAccess().getNoninertialKeyword_0()); 
            match(input,20,FOLLOW_20_in_rule__DefNonInertia__Group__0__Impl4121); 
             after(grammarAccess.getDefNonInertiaAccess().getNoninertialKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group__0__Impl


    // $ANTLR start rule__DefNonInertia__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1985:1: rule__DefNonInertia__Group__1 : rule__DefNonInertia__Group__1__Impl rule__DefNonInertia__Group__2 ;
    public final void rule__DefNonInertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1989:1: ( rule__DefNonInertia__Group__1__Impl rule__DefNonInertia__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1990:2: rule__DefNonInertia__Group__1__Impl rule__DefNonInertia__Group__2
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__1__Impl_in_rule__DefNonInertia__Group__14152);
            rule__DefNonInertia__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefNonInertia__Group__2_in_rule__DefNonInertia__Group__14155);
            rule__DefNonInertia__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group__1


    // $ANTLR start rule__DefNonInertia__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1997:1: rule__DefNonInertia__Group__1__Impl : ( ( rule__DefNonInertia__NamesAssignment_1 ) ) ;
    public final void rule__DefNonInertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2001:1: ( ( ( rule__DefNonInertia__NamesAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2002:1: ( ( rule__DefNonInertia__NamesAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2002:1: ( ( rule__DefNonInertia__NamesAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2003:1: ( rule__DefNonInertia__NamesAssignment_1 )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2004:1: ( rule__DefNonInertia__NamesAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2004:2: rule__DefNonInertia__NamesAssignment_1
            {
            pushFollow(FOLLOW_rule__DefNonInertia__NamesAssignment_1_in_rule__DefNonInertia__Group__1__Impl4182);
            rule__DefNonInertia__NamesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDefNonInertiaAccess().getNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group__1__Impl


    // $ANTLR start rule__DefNonInertia__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2014:1: rule__DefNonInertia__Group__2 : rule__DefNonInertia__Group__2__Impl ;
    public final void rule__DefNonInertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2018:1: ( rule__DefNonInertia__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2019:2: rule__DefNonInertia__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__2__Impl_in_rule__DefNonInertia__Group__24212);
            rule__DefNonInertia__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group__2


    // $ANTLR start rule__DefNonInertia__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2025:1: rule__DefNonInertia__Group__2__Impl : ( ( rule__DefNonInertia__Group_2__0 )* ) ;
    public final void rule__DefNonInertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2029:1: ( ( ( rule__DefNonInertia__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2030:1: ( ( rule__DefNonInertia__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2030:1: ( ( rule__DefNonInertia__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2031:1: ( rule__DefNonInertia__Group_2__0 )*
            {
             before(grammarAccess.getDefNonInertiaAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2032:1: ( rule__DefNonInertia__Group_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2032:2: rule__DefNonInertia__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__DefNonInertia__Group_2__0_in_rule__DefNonInertia__Group__2__Impl4239);
            	    rule__DefNonInertia__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDefNonInertiaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group__2__Impl


    // $ANTLR start rule__DefNonInertia__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2048:1: rule__DefNonInertia__Group_2__0 : rule__DefNonInertia__Group_2__0__Impl rule__DefNonInertia__Group_2__1 ;
    public final void rule__DefNonInertia__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2052:1: ( rule__DefNonInertia__Group_2__0__Impl rule__DefNonInertia__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2053:2: rule__DefNonInertia__Group_2__0__Impl rule__DefNonInertia__Group_2__1
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group_2__0__Impl_in_rule__DefNonInertia__Group_2__04276);
            rule__DefNonInertia__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefNonInertia__Group_2__1_in_rule__DefNonInertia__Group_2__04279);
            rule__DefNonInertia__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group_2__0


    // $ANTLR start rule__DefNonInertia__Group_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2060:1: rule__DefNonInertia__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DefNonInertia__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2064:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2065:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2065:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2066:1: ','
            {
             before(grammarAccess.getDefNonInertiaAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__DefNonInertia__Group_2__0__Impl4307); 
             after(grammarAccess.getDefNonInertiaAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group_2__0__Impl


    // $ANTLR start rule__DefNonInertia__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2079:1: rule__DefNonInertia__Group_2__1 : rule__DefNonInertia__Group_2__1__Impl ;
    public final void rule__DefNonInertia__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2083:1: ( rule__DefNonInertia__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2084:2: rule__DefNonInertia__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group_2__1__Impl_in_rule__DefNonInertia__Group_2__14338);
            rule__DefNonInertia__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group_2__1


    // $ANTLR start rule__DefNonInertia__Group_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2090:1: rule__DefNonInertia__Group_2__1__Impl : ( ( rule__DefNonInertia__NamesAssignment_2_1 ) ) ;
    public final void rule__DefNonInertia__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2094:1: ( ( ( rule__DefNonInertia__NamesAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2095:1: ( ( rule__DefNonInertia__NamesAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2095:1: ( ( rule__DefNonInertia__NamesAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2096:1: ( rule__DefNonInertia__NamesAssignment_2_1 )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2097:1: ( rule__DefNonInertia__NamesAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2097:2: rule__DefNonInertia__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DefNonInertia__NamesAssignment_2_1_in_rule__DefNonInertia__Group_2__1__Impl4365);
            rule__DefNonInertia__NamesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDefNonInertiaAccess().getNamesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group_2__1__Impl


    // $ANTLR start rule__DefXor__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2111:1: rule__DefXor__Group__0 : rule__DefXor__Group__0__Impl rule__DefXor__Group__1 ;
    public final void rule__DefXor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2115:1: ( rule__DefXor__Group__0__Impl rule__DefXor__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2116:2: rule__DefXor__Group__0__Impl rule__DefXor__Group__1
            {
            pushFollow(FOLLOW_rule__DefXor__Group__0__Impl_in_rule__DefXor__Group__04399);
            rule__DefXor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefXor__Group__1_in_rule__DefXor__Group__04402);
            rule__DefXor__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group__0


    // $ANTLR start rule__DefXor__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2123:1: rule__DefXor__Group__0__Impl : ( 'xor' ) ;
    public final void rule__DefXor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2127:1: ( ( 'xor' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2128:1: ( 'xor' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2128:1: ( 'xor' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2129:1: 'xor'
            {
             before(grammarAccess.getDefXorAccess().getXorKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__DefXor__Group__0__Impl4430); 
             after(grammarAccess.getDefXorAccess().getXorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group__0__Impl


    // $ANTLR start rule__DefXor__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2142:1: rule__DefXor__Group__1 : rule__DefXor__Group__1__Impl rule__DefXor__Group__2 ;
    public final void rule__DefXor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2146:1: ( rule__DefXor__Group__1__Impl rule__DefXor__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2147:2: rule__DefXor__Group__1__Impl rule__DefXor__Group__2
            {
            pushFollow(FOLLOW_rule__DefXor__Group__1__Impl_in_rule__DefXor__Group__14461);
            rule__DefXor__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefXor__Group__2_in_rule__DefXor__Group__14464);
            rule__DefXor__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group__1


    // $ANTLR start rule__DefXor__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2154:1: rule__DefXor__Group__1__Impl : ( ( rule__DefXor__NamesAssignment_1 ) ) ;
    public final void rule__DefXor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2158:1: ( ( ( rule__DefXor__NamesAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2159:1: ( ( rule__DefXor__NamesAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2159:1: ( ( rule__DefXor__NamesAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2160:1: ( rule__DefXor__NamesAssignment_1 )
            {
             before(grammarAccess.getDefXorAccess().getNamesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2161:1: ( rule__DefXor__NamesAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2161:2: rule__DefXor__NamesAssignment_1
            {
            pushFollow(FOLLOW_rule__DefXor__NamesAssignment_1_in_rule__DefXor__Group__1__Impl4491);
            rule__DefXor__NamesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDefXorAccess().getNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group__1__Impl


    // $ANTLR start rule__DefXor__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2171:1: rule__DefXor__Group__2 : rule__DefXor__Group__2__Impl ;
    public final void rule__DefXor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2175:1: ( rule__DefXor__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2176:2: rule__DefXor__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefXor__Group__2__Impl_in_rule__DefXor__Group__24521);
            rule__DefXor__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group__2


    // $ANTLR start rule__DefXor__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2182:1: rule__DefXor__Group__2__Impl : ( ( rule__DefXor__Group_2__0 )* ) ;
    public final void rule__DefXor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2186:1: ( ( ( rule__DefXor__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2187:1: ( ( rule__DefXor__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2187:1: ( ( rule__DefXor__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2188:1: ( rule__DefXor__Group_2__0 )*
            {
             before(grammarAccess.getDefXorAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2189:1: ( rule__DefXor__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==21) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2189:2: rule__DefXor__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__DefXor__Group_2__0_in_rule__DefXor__Group__2__Impl4548);
            	    rule__DefXor__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDefXorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group__2__Impl


    // $ANTLR start rule__DefXor__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2205:1: rule__DefXor__Group_2__0 : rule__DefXor__Group_2__0__Impl rule__DefXor__Group_2__1 ;
    public final void rule__DefXor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2209:1: ( rule__DefXor__Group_2__0__Impl rule__DefXor__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2210:2: rule__DefXor__Group_2__0__Impl rule__DefXor__Group_2__1
            {
            pushFollow(FOLLOW_rule__DefXor__Group_2__0__Impl_in_rule__DefXor__Group_2__04585);
            rule__DefXor__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefXor__Group_2__1_in_rule__DefXor__Group_2__04588);
            rule__DefXor__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group_2__0


    // $ANTLR start rule__DefXor__Group_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2217:1: rule__DefXor__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DefXor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2221:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2222:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2222:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2223:1: ','
            {
             before(grammarAccess.getDefXorAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__DefXor__Group_2__0__Impl4616); 
             after(grammarAccess.getDefXorAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group_2__0__Impl


    // $ANTLR start rule__DefXor__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2236:1: rule__DefXor__Group_2__1 : rule__DefXor__Group_2__1__Impl ;
    public final void rule__DefXor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2240:1: ( rule__DefXor__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2241:2: rule__DefXor__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DefXor__Group_2__1__Impl_in_rule__DefXor__Group_2__14647);
            rule__DefXor__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group_2__1


    // $ANTLR start rule__DefXor__Group_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2247:1: rule__DefXor__Group_2__1__Impl : ( ( rule__DefXor__NamesAssignment_2_1 ) ) ;
    public final void rule__DefXor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2251:1: ( ( ( rule__DefXor__NamesAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2252:1: ( ( rule__DefXor__NamesAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2252:1: ( ( rule__DefXor__NamesAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2253:1: ( rule__DefXor__NamesAssignment_2_1 )
            {
             before(grammarAccess.getDefXorAccess().getNamesAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2254:1: ( rule__DefXor__NamesAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2254:2: rule__DefXor__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DefXor__NamesAssignment_2_1_in_rule__DefXor__Group_2__1__Impl4674);
            rule__DefXor__NamesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDefXorAccess().getNamesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group_2__1__Impl


    // $ANTLR start rule__DefMutex__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2268:1: rule__DefMutex__Group__0 : rule__DefMutex__Group__0__Impl rule__DefMutex__Group__1 ;
    public final void rule__DefMutex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2272:1: ( rule__DefMutex__Group__0__Impl rule__DefMutex__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2273:2: rule__DefMutex__Group__0__Impl rule__DefMutex__Group__1
            {
            pushFollow(FOLLOW_rule__DefMutex__Group__0__Impl_in_rule__DefMutex__Group__04708);
            rule__DefMutex__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefMutex__Group__1_in_rule__DefMutex__Group__04711);
            rule__DefMutex__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group__0


    // $ANTLR start rule__DefMutex__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2280:1: rule__DefMutex__Group__0__Impl : ( 'mutex' ) ;
    public final void rule__DefMutex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2284:1: ( ( 'mutex' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2285:1: ( 'mutex' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2285:1: ( 'mutex' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2286:1: 'mutex'
            {
             before(grammarAccess.getDefMutexAccess().getMutexKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__DefMutex__Group__0__Impl4739); 
             after(grammarAccess.getDefMutexAccess().getMutexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group__0__Impl


    // $ANTLR start rule__DefMutex__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2299:1: rule__DefMutex__Group__1 : rule__DefMutex__Group__1__Impl rule__DefMutex__Group__2 ;
    public final void rule__DefMutex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2303:1: ( rule__DefMutex__Group__1__Impl rule__DefMutex__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2304:2: rule__DefMutex__Group__1__Impl rule__DefMutex__Group__2
            {
            pushFollow(FOLLOW_rule__DefMutex__Group__1__Impl_in_rule__DefMutex__Group__14770);
            rule__DefMutex__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefMutex__Group__2_in_rule__DefMutex__Group__14773);
            rule__DefMutex__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group__1


    // $ANTLR start rule__DefMutex__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2311:1: rule__DefMutex__Group__1__Impl : ( ( rule__DefMutex__NamesAssignment_1 ) ) ;
    public final void rule__DefMutex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2315:1: ( ( ( rule__DefMutex__NamesAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2316:1: ( ( rule__DefMutex__NamesAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2316:1: ( ( rule__DefMutex__NamesAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2317:1: ( rule__DefMutex__NamesAssignment_1 )
            {
             before(grammarAccess.getDefMutexAccess().getNamesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2318:1: ( rule__DefMutex__NamesAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2318:2: rule__DefMutex__NamesAssignment_1
            {
            pushFollow(FOLLOW_rule__DefMutex__NamesAssignment_1_in_rule__DefMutex__Group__1__Impl4800);
            rule__DefMutex__NamesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDefMutexAccess().getNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group__1__Impl


    // $ANTLR start rule__DefMutex__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2328:1: rule__DefMutex__Group__2 : rule__DefMutex__Group__2__Impl ;
    public final void rule__DefMutex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2332:1: ( rule__DefMutex__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2333:2: rule__DefMutex__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefMutex__Group__2__Impl_in_rule__DefMutex__Group__24830);
            rule__DefMutex__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group__2


    // $ANTLR start rule__DefMutex__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2339:1: rule__DefMutex__Group__2__Impl : ( ( rule__DefMutex__Group_2__0 )* ) ;
    public final void rule__DefMutex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2343:1: ( ( ( rule__DefMutex__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2344:1: ( ( rule__DefMutex__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2344:1: ( ( rule__DefMutex__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2345:1: ( rule__DefMutex__Group_2__0 )*
            {
             before(grammarAccess.getDefMutexAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2346:1: ( rule__DefMutex__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2346:2: rule__DefMutex__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__DefMutex__Group_2__0_in_rule__DefMutex__Group__2__Impl4857);
            	    rule__DefMutex__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getDefMutexAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group__2__Impl


    // $ANTLR start rule__DefMutex__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2362:1: rule__DefMutex__Group_2__0 : rule__DefMutex__Group_2__0__Impl rule__DefMutex__Group_2__1 ;
    public final void rule__DefMutex__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2366:1: ( rule__DefMutex__Group_2__0__Impl rule__DefMutex__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2367:2: rule__DefMutex__Group_2__0__Impl rule__DefMutex__Group_2__1
            {
            pushFollow(FOLLOW_rule__DefMutex__Group_2__0__Impl_in_rule__DefMutex__Group_2__04894);
            rule__DefMutex__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefMutex__Group_2__1_in_rule__DefMutex__Group_2__04897);
            rule__DefMutex__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group_2__0


    // $ANTLR start rule__DefMutex__Group_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2374:1: rule__DefMutex__Group_2__0__Impl : ( ',' ) ;
    public final void rule__DefMutex__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2378:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2379:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2379:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2380:1: ','
            {
             before(grammarAccess.getDefMutexAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__DefMutex__Group_2__0__Impl4925); 
             after(grammarAccess.getDefMutexAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group_2__0__Impl


    // $ANTLR start rule__DefMutex__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2393:1: rule__DefMutex__Group_2__1 : rule__DefMutex__Group_2__1__Impl ;
    public final void rule__DefMutex__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2397:1: ( rule__DefMutex__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2398:2: rule__DefMutex__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__DefMutex__Group_2__1__Impl_in_rule__DefMutex__Group_2__14956);
            rule__DefMutex__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group_2__1


    // $ANTLR start rule__DefMutex__Group_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2404:1: rule__DefMutex__Group_2__1__Impl : ( ( rule__DefMutex__NamesAssignment_2_1 ) ) ;
    public final void rule__DefMutex__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2408:1: ( ( ( rule__DefMutex__NamesAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2409:1: ( ( rule__DefMutex__NamesAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2409:1: ( ( rule__DefMutex__NamesAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2410:1: ( rule__DefMutex__NamesAssignment_2_1 )
            {
             before(grammarAccess.getDefMutexAccess().getNamesAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2411:1: ( rule__DefMutex__NamesAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2411:2: rule__DefMutex__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__DefMutex__NamesAssignment_2_1_in_rule__DefMutex__Group_2__1__Impl4983);
            rule__DefMutex__NamesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDefMutexAccess().getNamesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group_2__1__Impl


    // $ANTLR start rule__Statement__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2425:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2429:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2430:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__05017);
            rule__Statement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__05020);
            rule__Statement__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_1__0


    // $ANTLR start rule__Statement__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2437:1: rule__Statement__Group_1__0__Impl : ( ruleExpression ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2441:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2442:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2442:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2443:1: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Statement__Group_1__0__Impl5047);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_1__0__Impl


    // $ANTLR start rule__Statement__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2454:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2458:1: ( rule__Statement__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2459:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__15076);
            rule__Statement__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_1__1


    // $ANTLR start rule__Statement__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2465:1: rule__Statement__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2469:1: ( ( '.' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2470:1: ( '.' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2470:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2471:1: '.'
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_1_1()); 
            match(input,24,FOLLOW_24_in_rule__Statement__Group_1__1__Impl5104); 
             after(grammarAccess.getStatementAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Statement__Group_1__1__Impl


    // $ANTLR start rule__SortDefinition__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2488:1: rule__SortDefinition__Group__0 : rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1 ;
    public final void rule__SortDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2492:1: ( rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2493:2: rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__0__Impl_in_rule__SortDefinition__Group__05139);
            rule__SortDefinition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SortDefinition__Group__1_in_rule__SortDefinition__Group__05142);
            rule__SortDefinition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__Group__0


    // $ANTLR start rule__SortDefinition__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2500:1: rule__SortDefinition__Group__0__Impl : ( ( rule__SortDefinition__SortAssignment_0 ) ) ;
    public final void rule__SortDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2504:1: ( ( ( rule__SortDefinition__SortAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2505:1: ( ( rule__SortDefinition__SortAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2505:1: ( ( rule__SortDefinition__SortAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2506:1: ( rule__SortDefinition__SortAssignment_0 )
            {
             before(grammarAccess.getSortDefinitionAccess().getSortAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2507:1: ( rule__SortDefinition__SortAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2507:2: rule__SortDefinition__SortAssignment_0
            {
            pushFollow(FOLLOW_rule__SortDefinition__SortAssignment_0_in_rule__SortDefinition__Group__0__Impl5169);
            rule__SortDefinition__SortAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSortDefinitionAccess().getSortAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__Group__0__Impl


    // $ANTLR start rule__SortDefinition__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2517:1: rule__SortDefinition__Group__1 : rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2 ;
    public final void rule__SortDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2521:1: ( rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2522:2: rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__1__Impl_in_rule__SortDefinition__Group__15199);
            rule__SortDefinition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SortDefinition__Group__2_in_rule__SortDefinition__Group__15202);
            rule__SortDefinition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__Group__1


    // $ANTLR start rule__SortDefinition__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2529:1: rule__SortDefinition__Group__1__Impl : ( ( rule__SortDefinition__DefinitionsAssignment_1 ) ) ;
    public final void rule__SortDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2533:1: ( ( ( rule__SortDefinition__DefinitionsAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2534:1: ( ( rule__SortDefinition__DefinitionsAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2534:1: ( ( rule__SortDefinition__DefinitionsAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2535:1: ( rule__SortDefinition__DefinitionsAssignment_1 )
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2536:1: ( rule__SortDefinition__DefinitionsAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2536:2: rule__SortDefinition__DefinitionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SortDefinition__DefinitionsAssignment_1_in_rule__SortDefinition__Group__1__Impl5229);
            rule__SortDefinition__DefinitionsAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__Group__1__Impl


    // $ANTLR start rule__SortDefinition__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2546:1: rule__SortDefinition__Group__2 : rule__SortDefinition__Group__2__Impl ;
    public final void rule__SortDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2550:1: ( rule__SortDefinition__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2551:2: rule__SortDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__2__Impl_in_rule__SortDefinition__Group__25259);
            rule__SortDefinition__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__Group__2


    // $ANTLR start rule__SortDefinition__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2557:1: rule__SortDefinition__Group__2__Impl : ( ( rule__SortDefinition__Group_2__0 )* ) ;
    public final void rule__SortDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2561:1: ( ( ( rule__SortDefinition__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2562:1: ( ( rule__SortDefinition__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2562:1: ( ( rule__SortDefinition__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2563:1: ( rule__SortDefinition__Group_2__0 )*
            {
             before(grammarAccess.getSortDefinitionAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2564:1: ( rule__SortDefinition__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2564:2: rule__SortDefinition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__SortDefinition__Group_2__0_in_rule__SortDefinition__Group__2__Impl5286);
            	    rule__SortDefinition__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getSortDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__Group__2__Impl


    // $ANTLR start rule__SortDefinition__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2580:1: rule__SortDefinition__Group_2__0 : rule__SortDefinition__Group_2__0__Impl rule__SortDefinition__Group_2__1 ;
    public final void rule__SortDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2584:1: ( rule__SortDefinition__Group_2__0__Impl rule__SortDefinition__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2585:2: rule__SortDefinition__Group_2__0__Impl rule__SortDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group_2__0__Impl_in_rule__SortDefinition__Group_2__05323);
            rule__SortDefinition__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SortDefinition__Group_2__1_in_rule__SortDefinition__Group_2__05326);
            rule__SortDefinition__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__Group_2__0


    // $ANTLR start rule__SortDefinition__Group_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2592:1: rule__SortDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SortDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2596:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2597:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2597:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2598:1: ','
            {
             before(grammarAccess.getSortDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__SortDefinition__Group_2__0__Impl5354); 
             after(grammarAccess.getSortDefinitionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__Group_2__0__Impl


    // $ANTLR start rule__SortDefinition__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2611:1: rule__SortDefinition__Group_2__1 : rule__SortDefinition__Group_2__1__Impl ;
    public final void rule__SortDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2615:1: ( rule__SortDefinition__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2616:2: rule__SortDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group_2__1__Impl_in_rule__SortDefinition__Group_2__15385);
            rule__SortDefinition__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__Group_2__1


    // $ANTLR start rule__SortDefinition__Group_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2622:1: rule__SortDefinition__Group_2__1__Impl : ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) ) ;
    public final void rule__SortDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2626:1: ( ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2627:1: ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2627:1: ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2628:1: ( rule__SortDefinition__DefinitionsAssignment_2_1 )
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2629:1: ( rule__SortDefinition__DefinitionsAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2629:2: rule__SortDefinition__DefinitionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SortDefinition__DefinitionsAssignment_2_1_in_rule__SortDefinition__Group_2__1__Impl5412);
            rule__SortDefinition__DefinitionsAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__Group_2__1__Impl


    // $ANTLR start rule__Definition__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2643:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2647:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2648:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__05446);
            rule__Definition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__05449);
            rule__Definition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__0


    // $ANTLR start rule__Definition__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2655:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__NameAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2659:1: ( ( ( rule__Definition__NameAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2660:1: ( ( rule__Definition__NameAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2660:1: ( ( rule__Definition__NameAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2661:1: ( rule__Definition__NameAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2662:1: ( rule__Definition__NameAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2662:2: rule__Definition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_0_in_rule__Definition__Group__0__Impl5476);
            rule__Definition__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__0__Impl


    // $ANTLR start rule__Definition__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2672:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2676:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2677:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__15506);
            rule__Definition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__15509);
            rule__Definition__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__1


    // $ANTLR start rule__Definition__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2684:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__Group_1__0 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2688:1: ( ( ( rule__Definition__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2689:1: ( ( rule__Definition__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2689:1: ( ( rule__Definition__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2690:1: ( rule__Definition__Group_1__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2691:1: ( rule__Definition__Group_1__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==25) ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==RULE_ID) ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3==21) ) {
                        alt22=1;
                    }
                    else if ( (LA22_3==26) ) {
                        int LA22_5 = input.LA(4);

                        if ( (LA22_5==EOF||(LA22_5>=RULE_STRING && LA22_5<=RULE_BOOLEAN)||LA22_5==12||(LA22_5>=14 && LA22_5<=18)||(LA22_5>=20 && LA22_5<=23)||LA22_5==25||LA22_5==27||LA22_5==29||LA22_5==47) ) {
                            alt22=1;
                        }
                    }
                }
                else if ( (LA22_1==21||LA22_1==26) ) {
                    alt22=1;
                }
            }
            switch (alt22) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2691:2: rule__Definition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Definition__Group_1__0_in_rule__Definition__Group__1__Impl5536);
                    rule__Definition__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__1__Impl


    // $ANTLR start rule__Definition__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2701:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2705:1: ( rule__Definition__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2706:2: rule__Definition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__25567);
            rule__Definition__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__2


    // $ANTLR start rule__Definition__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2712:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__Group_2__0 )? ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2716:1: ( ( ( rule__Definition__Group_2__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2717:1: ( ( rule__Definition__Group_2__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2717:1: ( ( rule__Definition__Group_2__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2718:1: ( rule__Definition__Group_2__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2719:1: ( rule__Definition__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2719:2: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Definition__Group_2__0_in_rule__Definition__Group__2__Impl5594);
                    rule__Definition__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group__2__Impl


    // $ANTLR start rule__Definition__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2735:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2739:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2740:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__0__Impl_in_rule__Definition__Group_1__05631);
            rule__Definition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1__1_in_rule__Definition__Group_1__05634);
            rule__Definition__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1__0


    // $ANTLR start rule__Definition__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2747:1: rule__Definition__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2751:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2752:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2752:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2753:1: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,25,FOLLOW_25_in_rule__Definition__Group_1__0__Impl5662); 
             after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1__0__Impl


    // $ANTLR start rule__Definition__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2766:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2770:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2771:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__1__Impl_in_rule__Definition__Group_1__15693);
            rule__Definition__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1__2_in_rule__Definition__Group_1__15696);
            rule__Definition__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1__1


    // $ANTLR start rule__Definition__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2778:1: rule__Definition__Group_1__1__Impl : ( ( rule__Definition__ArgsAssignment_1_1 )? ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2782:1: ( ( ( rule__Definition__ArgsAssignment_1_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2783:1: ( ( rule__Definition__ArgsAssignment_1_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2783:1: ( ( rule__Definition__ArgsAssignment_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2784:1: ( rule__Definition__ArgsAssignment_1_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2785:1: ( rule__Definition__ArgsAssignment_1_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2785:2: rule__Definition__ArgsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Definition__ArgsAssignment_1_1_in_rule__Definition__Group_1__1__Impl5723);
                    rule__Definition__ArgsAssignment_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefinitionAccess().getArgsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1__1__Impl


    // $ANTLR start rule__Definition__Group_1__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2795:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2799:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2800:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__2__Impl_in_rule__Definition__Group_1__25754);
            rule__Definition__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1__3_in_rule__Definition__Group_1__25757);
            rule__Definition__Group_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1__2


    // $ANTLR start rule__Definition__Group_1__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2807:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__Group_1_2__0 )* ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2811:1: ( ( ( rule__Definition__Group_1_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2812:1: ( ( rule__Definition__Group_1_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2812:1: ( ( rule__Definition__Group_1_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2813:1: ( rule__Definition__Group_1_2__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2814:1: ( rule__Definition__Group_1_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2814:2: rule__Definition__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Definition__Group_1_2__0_in_rule__Definition__Group_1__2__Impl5784);
            	    rule__Definition__Group_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getGroup_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1__2__Impl


    // $ANTLR start rule__Definition__Group_1__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2824:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2828:1: ( rule__Definition__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2829:2: rule__Definition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__3__Impl_in_rule__Definition__Group_1__35815);
            rule__Definition__Group_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1__3


    // $ANTLR start rule__Definition__Group_1__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2835:1: rule__Definition__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2839:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2840:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2840:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2841:1: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3()); 
            match(input,26,FOLLOW_26_in_rule__Definition__Group_1__3__Impl5843); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1__3__Impl


    // $ANTLR start rule__Definition__Group_1_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2862:1: rule__Definition__Group_1_2__0 : rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 ;
    public final void rule__Definition__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2866:1: ( rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2867:2: rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_1_2__0__Impl_in_rule__Definition__Group_1_2__05882);
            rule__Definition__Group_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1_2__1_in_rule__Definition__Group_1_2__05885);
            rule__Definition__Group_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1_2__0


    // $ANTLR start rule__Definition__Group_1_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2874:1: rule__Definition__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2878:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2879:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2879:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2880:1: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Definition__Group_1_2__0__Impl5913); 
             after(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1_2__0__Impl


    // $ANTLR start rule__Definition__Group_1_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2893:1: rule__Definition__Group_1_2__1 : rule__Definition__Group_1_2__1__Impl ;
    public final void rule__Definition__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2897:1: ( rule__Definition__Group_1_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2898:2: rule__Definition__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_1_2__1__Impl_in_rule__Definition__Group_1_2__15944);
            rule__Definition__Group_1_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1_2__1


    // $ANTLR start rule__Definition__Group_1_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2904:1: rule__Definition__Group_1_2__1__Impl : ( ( rule__Definition__ArgsAssignment_1_2_1 ) ) ;
    public final void rule__Definition__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2908:1: ( ( ( rule__Definition__ArgsAssignment_1_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2909:1: ( ( rule__Definition__ArgsAssignment_1_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2909:1: ( ( rule__Definition__ArgsAssignment_1_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2910:1: ( rule__Definition__ArgsAssignment_1_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_1_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2911:1: ( rule__Definition__ArgsAssignment_1_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2911:2: rule__Definition__ArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Definition__ArgsAssignment_1_2_1_in_rule__Definition__Group_1_2__1__Impl5971);
            rule__Definition__ArgsAssignment_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getArgsAssignment_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_1_2__1__Impl


    // $ANTLR start rule__Definition__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2925:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2929:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2930:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__0__Impl_in_rule__Definition__Group_2__06005);
            rule__Definition__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_2__1_in_rule__Definition__Group_2__06008);
            rule__Definition__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_2__0


    // $ANTLR start rule__Definition__Group_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2937:1: rule__Definition__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2941:1: ( ( ':' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2942:1: ( ':' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2942:1: ( ':' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2943:1: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Definition__Group_2__0__Impl6036); 
             after(grammarAccess.getDefinitionAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_2__0__Impl


    // $ANTLR start rule__Definition__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2956:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2960:1: ( rule__Definition__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2961:2: rule__Definition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__1__Impl_in_rule__Definition__Group_2__16067);
            rule__Definition__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_2__1


    // $ANTLR start rule__Definition__Group_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2967:1: rule__Definition__Group_2__1__Impl : ( ( rule__Definition__ReturnAssignment_2_1 ) ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2971:1: ( ( ( rule__Definition__ReturnAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2972:1: ( ( rule__Definition__ReturnAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2972:1: ( ( rule__Definition__ReturnAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2973:1: ( rule__Definition__ReturnAssignment_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getReturnAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2974:1: ( rule__Definition__ReturnAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2974:2: rule__Definition__ReturnAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Definition__ReturnAssignment_2_1_in_rule__Definition__Group_2__1__Impl6094);
            rule__Definition__ReturnAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getReturnAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__Group_2__1__Impl


    // $ANTLR start rule__Expression__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2988:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2992:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2993:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__06128);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__06131);
            rule__Expression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__0


    // $ANTLR start rule__Expression__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3000:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__Group_0__0 )? ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3004:1: ( ( ( rule__Expression__Group_0__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3005:1: ( ( rule__Expression__Group_0__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3005:1: ( ( rule__Expression__Group_0__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3006:1: ( rule__Expression__Group_0__0 )?
            {
             before(grammarAccess.getExpressionAccess().getGroup_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3007:1: ( rule__Expression__Group_0__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==15) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3007:2: rule__Expression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_0__0_in_rule__Expression__Group__0__Impl6158);
                    rule__Expression__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExpressionAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__0__Impl


    // $ANTLR start rule__Expression__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3017:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl rule__Expression__Group__2 ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3021:1: ( rule__Expression__Group__1__Impl rule__Expression__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3022:2: rule__Expression__Group__1__Impl rule__Expression__Group__2
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__16189);
            rule__Expression__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__16192);
            rule__Expression__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__1


    // $ANTLR start rule__Expression__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3029:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__QualifiersAssignment_1 )* ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3033:1: ( ( ( rule__Expression__QualifiersAssignment_1 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3034:1: ( ( rule__Expression__QualifiersAssignment_1 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3034:1: ( ( rule__Expression__QualifiersAssignment_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3035:1: ( rule__Expression__QualifiersAssignment_1 )*
            {
             before(grammarAccess.getExpressionAccess().getQualifiersAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3036:1: ( rule__Expression__QualifiersAssignment_1 )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3036:2: rule__Expression__QualifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Expression__QualifiersAssignment_1_in_rule__Expression__Group__1__Impl6219);
            	    rule__Expression__QualifiersAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getQualifiersAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__1__Impl


    // $ANTLR start rule__Expression__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3046:1: rule__Expression__Group__2 : rule__Expression__Group__2__Impl ;
    public final void rule__Expression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3050:1: ( rule__Expression__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3051:2: rule__Expression__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__26250);
            rule__Expression__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__2


    // $ANTLR start rule__Expression__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3057:1: rule__Expression__Group__2__Impl : ( ( rule__Expression__ExprAssignment_2 ) ) ;
    public final void rule__Expression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3061:1: ( ( ( rule__Expression__ExprAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3062:1: ( ( rule__Expression__ExprAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3062:1: ( ( rule__Expression__ExprAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3063:1: ( rule__Expression__ExprAssignment_2 )
            {
             before(grammarAccess.getExpressionAccess().getExprAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3064:1: ( rule__Expression__ExprAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3064:2: rule__Expression__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__Expression__ExprAssignment_2_in_rule__Expression__Group__2__Impl6277);
            rule__Expression__ExprAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group__2__Impl


    // $ANTLR start rule__Expression__Group_0__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3080:1: rule__Expression__Group_0__0 : rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 ;
    public final void rule__Expression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3084:1: ( rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3085:2: rule__Expression__Group_0__0__Impl rule__Expression__Group_0__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_0__0__Impl_in_rule__Expression__Group_0__06313);
            rule__Expression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_0__1_in_rule__Expression__Group_0__06316);
            rule__Expression__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_0__0


    // $ANTLR start rule__Expression__Group_0__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3092:1: rule__Expression__Group_0__0__Impl : ( ( rule__Expression__LabelAssignment_0_0 ) ) ;
    public final void rule__Expression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3096:1: ( ( ( rule__Expression__LabelAssignment_0_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3097:1: ( ( rule__Expression__LabelAssignment_0_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3097:1: ( ( rule__Expression__LabelAssignment_0_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3098:1: ( rule__Expression__LabelAssignment_0_0 )
            {
             before(grammarAccess.getExpressionAccess().getLabelAssignment_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3099:1: ( rule__Expression__LabelAssignment_0_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3099:2: rule__Expression__LabelAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Expression__LabelAssignment_0_0_in_rule__Expression__Group_0__0__Impl6343);
            rule__Expression__LabelAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getLabelAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_0__0__Impl


    // $ANTLR start rule__Expression__Group_0__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3109:1: rule__Expression__Group_0__1 : rule__Expression__Group_0__1__Impl ;
    public final void rule__Expression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3113:1: ( rule__Expression__Group_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3114:2: rule__Expression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_0__1__Impl_in_rule__Expression__Group_0__16373);
            rule__Expression__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_0__1


    // $ANTLR start rule__Expression__Group_0__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3120:1: rule__Expression__Group_0__1__Impl : ( ':' ) ;
    public final void rule__Expression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3124:1: ( ( ':' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3125:1: ( ':' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3125:1: ( ':' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3126:1: ':'
            {
             before(grammarAccess.getExpressionAccess().getColonKeyword_0_1()); 
            match(input,15,FOLLOW_15_in_rule__Expression__Group_0__1__Impl6401); 
             after(grammarAccess.getExpressionAccess().getColonKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_0__1__Impl


    // $ANTLR start rule__Exists__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3143:1: rule__Exists__Group__0 : rule__Exists__Group__0__Impl rule__Exists__Group__1 ;
    public final void rule__Exists__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3147:1: ( rule__Exists__Group__0__Impl rule__Exists__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3148:2: rule__Exists__Group__0__Impl rule__Exists__Group__1
            {
            pushFollow(FOLLOW_rule__Exists__Group__0__Impl_in_rule__Exists__Group__06436);
            rule__Exists__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group__1_in_rule__Exists__Group__06439);
            rule__Exists__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group__0


    // $ANTLR start rule__Exists__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3155:1: rule__Exists__Group__0__Impl : ( '{' ) ;
    public final void rule__Exists__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3159:1: ( ( '{' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3160:1: ( '{' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3160:1: ( '{' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3161:1: '{'
            {
             before(grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Exists__Group__0__Impl6467); 
             after(grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group__0__Impl


    // $ANTLR start rule__Exists__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3174:1: rule__Exists__Group__1 : rule__Exists__Group__1__Impl rule__Exists__Group__2 ;
    public final void rule__Exists__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3178:1: ( rule__Exists__Group__1__Impl rule__Exists__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3179:2: rule__Exists__Group__1__Impl rule__Exists__Group__2
            {
            pushFollow(FOLLOW_rule__Exists__Group__1__Impl_in_rule__Exists__Group__16498);
            rule__Exists__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group__2_in_rule__Exists__Group__16501);
            rule__Exists__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group__1


    // $ANTLR start rule__Exists__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3186:1: rule__Exists__Group__1__Impl : ( ( rule__Exists__NamesAssignment_1 ) ) ;
    public final void rule__Exists__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3190:1: ( ( ( rule__Exists__NamesAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3191:1: ( ( rule__Exists__NamesAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3191:1: ( ( rule__Exists__NamesAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3192:1: ( rule__Exists__NamesAssignment_1 )
            {
             before(grammarAccess.getExistsAccess().getNamesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3193:1: ( rule__Exists__NamesAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3193:2: rule__Exists__NamesAssignment_1
            {
            pushFollow(FOLLOW_rule__Exists__NamesAssignment_1_in_rule__Exists__Group__1__Impl6528);
            rule__Exists__NamesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getExistsAccess().getNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group__1__Impl


    // $ANTLR start rule__Exists__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3203:1: rule__Exists__Group__2 : rule__Exists__Group__2__Impl rule__Exists__Group__3 ;
    public final void rule__Exists__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3207:1: ( rule__Exists__Group__2__Impl rule__Exists__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3208:2: rule__Exists__Group__2__Impl rule__Exists__Group__3
            {
            pushFollow(FOLLOW_rule__Exists__Group__2__Impl_in_rule__Exists__Group__26558);
            rule__Exists__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group__3_in_rule__Exists__Group__26561);
            rule__Exists__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group__2


    // $ANTLR start rule__Exists__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3215:1: rule__Exists__Group__2__Impl : ( ( rule__Exists__Group_2__0 )* ) ;
    public final void rule__Exists__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3219:1: ( ( ( rule__Exists__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3220:1: ( ( rule__Exists__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3220:1: ( ( rule__Exists__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3221:1: ( rule__Exists__Group_2__0 )*
            {
             before(grammarAccess.getExistsAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3222:1: ( rule__Exists__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3222:2: rule__Exists__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Exists__Group_2__0_in_rule__Exists__Group__2__Impl6588);
            	    rule__Exists__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getExistsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group__2__Impl


    // $ANTLR start rule__Exists__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3232:1: rule__Exists__Group__3 : rule__Exists__Group__3__Impl ;
    public final void rule__Exists__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3236:1: ( rule__Exists__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3237:2: rule__Exists__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Exists__Group__3__Impl_in_rule__Exists__Group__36619);
            rule__Exists__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group__3


    // $ANTLR start rule__Exists__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3243:1: rule__Exists__Group__3__Impl : ( '}' ) ;
    public final void rule__Exists__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3247:1: ( ( '}' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3248:1: ( '}' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3248:1: ( '}' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3249:1: '}'
            {
             before(grammarAccess.getExistsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Exists__Group__3__Impl6647); 
             after(grammarAccess.getExistsAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group__3__Impl


    // $ANTLR start rule__Exists__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3270:1: rule__Exists__Group_2__0 : rule__Exists__Group_2__0__Impl rule__Exists__Group_2__1 ;
    public final void rule__Exists__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3274:1: ( rule__Exists__Group_2__0__Impl rule__Exists__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3275:2: rule__Exists__Group_2__0__Impl rule__Exists__Group_2__1
            {
            pushFollow(FOLLOW_rule__Exists__Group_2__0__Impl_in_rule__Exists__Group_2__06686);
            rule__Exists__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group_2__1_in_rule__Exists__Group_2__06689);
            rule__Exists__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group_2__0


    // $ANTLR start rule__Exists__Group_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3282:1: rule__Exists__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Exists__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3286:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3287:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3287:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3288:1: ','
            {
             before(grammarAccess.getExistsAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Exists__Group_2__0__Impl6717); 
             after(grammarAccess.getExistsAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group_2__0__Impl


    // $ANTLR start rule__Exists__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3301:1: rule__Exists__Group_2__1 : rule__Exists__Group_2__1__Impl ;
    public final void rule__Exists__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3305:1: ( rule__Exists__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3306:2: rule__Exists__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Exists__Group_2__1__Impl_in_rule__Exists__Group_2__16748);
            rule__Exists__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group_2__1


    // $ANTLR start rule__Exists__Group_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3312:1: rule__Exists__Group_2__1__Impl : ( ( rule__Exists__NamesAssignment_2_1 ) ) ;
    public final void rule__Exists__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3316:1: ( ( ( rule__Exists__NamesAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3317:1: ( ( rule__Exists__NamesAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3317:1: ( ( rule__Exists__NamesAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3318:1: ( rule__Exists__NamesAssignment_2_1 )
            {
             before(grammarAccess.getExistsAccess().getNamesAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3319:1: ( rule__Exists__NamesAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3319:2: rule__Exists__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Exists__NamesAssignment_2_1_in_rule__Exists__Group_2__1__Impl6775);
            rule__Exists__NamesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getExistsAccess().getNamesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__Group_2__1__Impl


    // $ANTLR start rule__Forall__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3333:1: rule__Forall__Group__0 : rule__Forall__Group__0__Impl rule__Forall__Group__1 ;
    public final void rule__Forall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3337:1: ( rule__Forall__Group__0__Impl rule__Forall__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3338:2: rule__Forall__Group__0__Impl rule__Forall__Group__1
            {
            pushFollow(FOLLOW_rule__Forall__Group__0__Impl_in_rule__Forall__Group__06809);
            rule__Forall__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group__1_in_rule__Forall__Group__06812);
            rule__Forall__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group__0


    // $ANTLR start rule__Forall__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3345:1: rule__Forall__Group__0__Impl : ( '[' ) ;
    public final void rule__Forall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3349:1: ( ( '[' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3350:1: ( '[' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3350:1: ( '[' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3351:1: '['
            {
             before(grammarAccess.getForallAccess().getLeftSquareBracketKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Forall__Group__0__Impl6840); 
             after(grammarAccess.getForallAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group__0__Impl


    // $ANTLR start rule__Forall__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3364:1: rule__Forall__Group__1 : rule__Forall__Group__1__Impl rule__Forall__Group__2 ;
    public final void rule__Forall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3368:1: ( rule__Forall__Group__1__Impl rule__Forall__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3369:2: rule__Forall__Group__1__Impl rule__Forall__Group__2
            {
            pushFollow(FOLLOW_rule__Forall__Group__1__Impl_in_rule__Forall__Group__16871);
            rule__Forall__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group__2_in_rule__Forall__Group__16874);
            rule__Forall__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group__1


    // $ANTLR start rule__Forall__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3376:1: rule__Forall__Group__1__Impl : ( ( rule__Forall__NamesAssignment_1 ) ) ;
    public final void rule__Forall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3380:1: ( ( ( rule__Forall__NamesAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3381:1: ( ( rule__Forall__NamesAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3381:1: ( ( rule__Forall__NamesAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3382:1: ( rule__Forall__NamesAssignment_1 )
            {
             before(grammarAccess.getForallAccess().getNamesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3383:1: ( rule__Forall__NamesAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3383:2: rule__Forall__NamesAssignment_1
            {
            pushFollow(FOLLOW_rule__Forall__NamesAssignment_1_in_rule__Forall__Group__1__Impl6901);
            rule__Forall__NamesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getForallAccess().getNamesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group__1__Impl


    // $ANTLR start rule__Forall__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3393:1: rule__Forall__Group__2 : rule__Forall__Group__2__Impl rule__Forall__Group__3 ;
    public final void rule__Forall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3397:1: ( rule__Forall__Group__2__Impl rule__Forall__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3398:2: rule__Forall__Group__2__Impl rule__Forall__Group__3
            {
            pushFollow(FOLLOW_rule__Forall__Group__2__Impl_in_rule__Forall__Group__26931);
            rule__Forall__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group__3_in_rule__Forall__Group__26934);
            rule__Forall__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group__2


    // $ANTLR start rule__Forall__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3405:1: rule__Forall__Group__2__Impl : ( ( rule__Forall__Group_2__0 )* ) ;
    public final void rule__Forall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3409:1: ( ( ( rule__Forall__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3410:1: ( ( rule__Forall__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3410:1: ( ( rule__Forall__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3411:1: ( rule__Forall__Group_2__0 )*
            {
             before(grammarAccess.getForallAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3412:1: ( rule__Forall__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==21) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3412:2: rule__Forall__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Forall__Group_2__0_in_rule__Forall__Group__2__Impl6961);
            	    rule__Forall__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getForallAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group__2__Impl


    // $ANTLR start rule__Forall__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3422:1: rule__Forall__Group__3 : rule__Forall__Group__3__Impl ;
    public final void rule__Forall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3426:1: ( rule__Forall__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3427:2: rule__Forall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Forall__Group__3__Impl_in_rule__Forall__Group__36992);
            rule__Forall__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group__3


    // $ANTLR start rule__Forall__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3433:1: rule__Forall__Group__3__Impl : ( ']' ) ;
    public final void rule__Forall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3437:1: ( ( ']' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3438:1: ( ']' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3438:1: ( ']' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3439:1: ']'
            {
             before(grammarAccess.getForallAccess().getRightSquareBracketKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Forall__Group__3__Impl7020); 
             after(grammarAccess.getForallAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group__3__Impl


    // $ANTLR start rule__Forall__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3460:1: rule__Forall__Group_2__0 : rule__Forall__Group_2__0__Impl rule__Forall__Group_2__1 ;
    public final void rule__Forall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3464:1: ( rule__Forall__Group_2__0__Impl rule__Forall__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3465:2: rule__Forall__Group_2__0__Impl rule__Forall__Group_2__1
            {
            pushFollow(FOLLOW_rule__Forall__Group_2__0__Impl_in_rule__Forall__Group_2__07059);
            rule__Forall__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group_2__1_in_rule__Forall__Group_2__07062);
            rule__Forall__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group_2__0


    // $ANTLR start rule__Forall__Group_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3472:1: rule__Forall__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Forall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3476:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3477:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3477:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3478:1: ','
            {
             before(grammarAccess.getForallAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Forall__Group_2__0__Impl7090); 
             after(grammarAccess.getForallAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group_2__0__Impl


    // $ANTLR start rule__Forall__Group_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3491:1: rule__Forall__Group_2__1 : rule__Forall__Group_2__1__Impl ;
    public final void rule__Forall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3495:1: ( rule__Forall__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3496:2: rule__Forall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Forall__Group_2__1__Impl_in_rule__Forall__Group_2__17121);
            rule__Forall__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group_2__1


    // $ANTLR start rule__Forall__Group_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3502:1: rule__Forall__Group_2__1__Impl : ( ( rule__Forall__NamesAssignment_2_1 ) ) ;
    public final void rule__Forall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3506:1: ( ( ( rule__Forall__NamesAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3507:1: ( ( rule__Forall__NamesAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3507:1: ( ( rule__Forall__NamesAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3508:1: ( rule__Forall__NamesAssignment_2_1 )
            {
             before(grammarAccess.getForallAccess().getNamesAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3509:1: ( rule__Forall__NamesAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3509:2: rule__Forall__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Forall__NamesAssignment_2_1_in_rule__Forall__Group_2__1__Impl7148);
            rule__Forall__NamesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getForallAccess().getNamesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__Group_2__1__Impl


    // $ANTLR start rule__AssignmentOp__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3523:1: rule__AssignmentOp__Group__0 : rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 ;
    public final void rule__AssignmentOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3527:1: ( rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3528:2: rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__0__Impl_in_rule__AssignmentOp__Group__07182);
            rule__AssignmentOp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group__1_in_rule__AssignmentOp__Group__07185);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3535:1: rule__AssignmentOp__Group__0__Impl : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3539:1: ( ( ruleOrExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3540:1: ( ruleOrExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3540:1: ( ruleOrExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3541:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExp_in_rule__AssignmentOp__Group__0__Impl7212);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3552:1: rule__AssignmentOp__Group__1 : rule__AssignmentOp__Group__1__Impl ;
    public final void rule__AssignmentOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3556:1: ( rule__AssignmentOp__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3557:2: rule__AssignmentOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__1__Impl_in_rule__AssignmentOp__Group__17241);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3563:1: rule__AssignmentOp__Group__1__Impl : ( ( rule__AssignmentOp__Group_1__0 )? ) ;
    public final void rule__AssignmentOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3567:1: ( ( ( rule__AssignmentOp__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3568:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3568:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3569:1: ( rule__AssignmentOp__Group_1__0 )?
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3570:1: ( rule__AssignmentOp__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=31 && LA30_0<=32)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3570:2: rule__AssignmentOp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1__0_in_rule__AssignmentOp__Group__1__Impl7268);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3584:1: rule__AssignmentOp__Group_1__0 : rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 ;
    public final void rule__AssignmentOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3588:1: ( rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3589:2: rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__0__Impl_in_rule__AssignmentOp__Group_1__07303);
            rule__AssignmentOp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__1_in_rule__AssignmentOp__Group_1__07306);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3596:1: rule__AssignmentOp__Group_1__0__Impl : ( ( rule__AssignmentOp__Alternatives_1_0 ) ) ;
    public final void rule__AssignmentOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3600:1: ( ( ( rule__AssignmentOp__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3601:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3601:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3602:1: ( rule__AssignmentOp__Alternatives_1_0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3603:1: ( rule__AssignmentOp__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3603:2: rule__AssignmentOp__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Alternatives_1_0_in_rule__AssignmentOp__Group_1__0__Impl7333);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3613:1: rule__AssignmentOp__Group_1__1 : rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2 ;
    public final void rule__AssignmentOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3617:1: ( rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3618:2: rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__1__Impl_in_rule__AssignmentOp__Group_1__17363);
            rule__AssignmentOp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__2_in_rule__AssignmentOp__Group_1__17366);
            rule__AssignmentOp__Group_1__2();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3625:1: rule__AssignmentOp__Group_1__1__Impl : ( ( rule__AssignmentOp__QualifiersAssignment_1_1 )* ) ;
    public final void rule__AssignmentOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3629:1: ( ( ( rule__AssignmentOp__QualifiersAssignment_1_1 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3630:1: ( ( rule__AssignmentOp__QualifiersAssignment_1_1 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3630:1: ( ( rule__AssignmentOp__QualifiersAssignment_1_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3631:1: ( rule__AssignmentOp__QualifiersAssignment_1_1 )*
            {
             before(grammarAccess.getAssignmentOpAccess().getQualifiersAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3632:1: ( rule__AssignmentOp__QualifiersAssignment_1_1 )*
            loop31:
            do {
                int alt31=2;
                alt31 = dfa31.predict(input);
                switch (alt31) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3632:2: rule__AssignmentOp__QualifiersAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__AssignmentOp__QualifiersAssignment_1_1_in_rule__AssignmentOp__Group_1__1__Impl7393);
            	    rule__AssignmentOp__QualifiersAssignment_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getAssignmentOpAccess().getQualifiersAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start rule__AssignmentOp__Group_1__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3642:1: rule__AssignmentOp__Group_1__2 : rule__AssignmentOp__Group_1__2__Impl ;
    public final void rule__AssignmentOp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3646:1: ( rule__AssignmentOp__Group_1__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3647:2: rule__AssignmentOp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__2__Impl_in_rule__AssignmentOp__Group_1__27424);
            rule__AssignmentOp__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1__2


    // $ANTLR start rule__AssignmentOp__Group_1__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3653:1: rule__AssignmentOp__Group_1__2__Impl : ( ( rule__AssignmentOp__RightAssignment_1_2 ) ) ;
    public final void rule__AssignmentOp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3657:1: ( ( ( rule__AssignmentOp__RightAssignment_1_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3658:1: ( ( rule__AssignmentOp__RightAssignment_1_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3658:1: ( ( rule__AssignmentOp__RightAssignment_1_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3659:1: ( rule__AssignmentOp__RightAssignment_1_2 )
            {
             before(grammarAccess.getAssignmentOpAccess().getRightAssignment_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3660:1: ( rule__AssignmentOp__RightAssignment_1_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3660:2: rule__AssignmentOp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AssignmentOp__RightAssignment_1_2_in_rule__AssignmentOp__Group_1__2__Impl7451);
            rule__AssignmentOp__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getAssignmentOpAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__Group_1__2__Impl


    // $ANTLR start rule__AssignmentOp__Group_1_0_0__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3676:1: rule__AssignmentOp__Group_1_0_0__0 : rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 ;
    public final void rule__AssignmentOp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3680:1: ( rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3681:2: rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__0__Impl_in_rule__AssignmentOp__Group_1_0_0__07487);
            rule__AssignmentOp__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__1_in_rule__AssignmentOp__Group_1_0_0__07490);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3688:1: rule__AssignmentOp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3692:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3693:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3693:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3694:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3695:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3697:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3707:1: rule__AssignmentOp__Group_1_0_0__1 : rule__AssignmentOp__Group_1_0_0__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3711:1: ( rule__AssignmentOp__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3712:2: rule__AssignmentOp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__1__Impl_in_rule__AssignmentOp__Group_1_0_0__17548);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3718:1: rule__AssignmentOp__Group_1_0_0__1__Impl : ( '->' ) ;
    public final void rule__AssignmentOp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3722:1: ( ( '->' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3723:1: ( '->' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3723:1: ( '->' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3724:1: '->'
            {
             before(grammarAccess.getAssignmentOpAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1()); 
            match(input,31,FOLLOW_31_in_rule__AssignmentOp__Group_1_0_0__1__Impl7576); 
             after(grammarAccess.getAssignmentOpAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3741:1: rule__AssignmentOp__Group_1_0_1__0 : rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 ;
    public final void rule__AssignmentOp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3745:1: ( rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3746:2: rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__0__Impl_in_rule__AssignmentOp__Group_1_0_1__07611);
            rule__AssignmentOp__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__1_in_rule__AssignmentOp__Group_1_0_1__07614);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3753:1: rule__AssignmentOp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3757:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3758:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3758:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3759:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3760:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3762:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3772:1: rule__AssignmentOp__Group_1_0_1__1 : rule__AssignmentOp__Group_1_0_1__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3776:1: ( rule__AssignmentOp__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3777:2: rule__AssignmentOp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__1__Impl_in_rule__AssignmentOp__Group_1_0_1__17672);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3783:1: rule__AssignmentOp__Group_1_0_1__1__Impl : ( '<->' ) ;
    public final void rule__AssignmentOp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3787:1: ( ( '<->' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3788:1: ( '<->' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3788:1: ( '<->' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3789:1: '<->'
            {
             before(grammarAccess.getAssignmentOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1()); 
            match(input,32,FOLLOW_32_in_rule__AssignmentOp__Group_1_0_1__1__Impl7700); 
             after(grammarAccess.getAssignmentOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3806:1: rule__OrExp__Group__0 : rule__OrExp__Group__0__Impl rule__OrExp__Group__1 ;
    public final void rule__OrExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3810:1: ( rule__OrExp__Group__0__Impl rule__OrExp__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3811:2: rule__OrExp__Group__0__Impl rule__OrExp__Group__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__07735);
            rule__OrExp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__07738);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3818:1: rule__OrExp__Group__0__Impl : ( ruleAndExp ) ;
    public final void rule__OrExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3822:1: ( ( ruleAndExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3823:1: ( ruleAndExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3823:1: ( ruleAndExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3824:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__Group__0__Impl7765);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3835:1: rule__OrExp__Group__1 : rule__OrExp__Group__1__Impl ;
    public final void rule__OrExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3839:1: ( rule__OrExp__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3840:2: rule__OrExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__17794);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3846:1: rule__OrExp__Group__1__Impl : ( ( rule__OrExp__Group_1__0 )* ) ;
    public final void rule__OrExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3850:1: ( ( ( rule__OrExp__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3851:1: ( ( rule__OrExp__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3851:1: ( ( rule__OrExp__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3852:1: ( rule__OrExp__Group_1__0 )*
            {
             before(grammarAccess.getOrExpAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3853:1: ( rule__OrExp__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==33) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3853:2: rule__OrExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl7821);
            	    rule__OrExp__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3867:1: rule__OrExp__Group_1__0 : rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 ;
    public final void rule__OrExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3871:1: ( rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3872:2: rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__07856);
            rule__OrExp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__07859);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3879:1: rule__OrExp__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3883:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3884:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3884:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3885:1: ()
            {
             before(grammarAccess.getOrExpAccess().getOrLeftAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3886:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3888:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3898:1: rule__OrExp__Group_1__1 : rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 ;
    public final void rule__OrExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3902:1: ( rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3903:2: rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__17917);
            rule__OrExp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__2_in_rule__OrExp__Group_1__17920);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3910:1: rule__OrExp__Group_1__1__Impl : ( '|' ) ;
    public final void rule__OrExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3914:1: ( ( '|' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3915:1: ( '|' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3915:1: ( '|' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3916:1: '|'
            {
             before(grammarAccess.getOrExpAccess().getVerticalLineKeyword_1_1()); 
            match(input,33,FOLLOW_33_in_rule__OrExp__Group_1__1__Impl7948); 
             after(grammarAccess.getOrExpAccess().getVerticalLineKeyword_1_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3929:1: rule__OrExp__Group_1__2 : rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3 ;
    public final void rule__OrExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3933:1: ( rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3934:2: rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__2__Impl_in_rule__OrExp__Group_1__27979);
            rule__OrExp__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__3_in_rule__OrExp__Group_1__27982);
            rule__OrExp__Group_1__3();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3941:1: rule__OrExp__Group_1__2__Impl : ( ( rule__OrExp__QualifiersAssignment_1_2 )* ) ;
    public final void rule__OrExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3945:1: ( ( ( rule__OrExp__QualifiersAssignment_1_2 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3946:1: ( ( rule__OrExp__QualifiersAssignment_1_2 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3946:1: ( ( rule__OrExp__QualifiersAssignment_1_2 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3947:1: ( rule__OrExp__QualifiersAssignment_1_2 )*
            {
             before(grammarAccess.getOrExpAccess().getQualifiersAssignment_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3948:1: ( rule__OrExp__QualifiersAssignment_1_2 )*
            loop33:
            do {
                int alt33=2;
                alt33 = dfa33.predict(input);
                switch (alt33) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3948:2: rule__OrExp__QualifiersAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__OrExp__QualifiersAssignment_1_2_in_rule__OrExp__Group_1__2__Impl8009);
            	    rule__OrExp__QualifiersAssignment_1_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getOrExpAccess().getQualifiersAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start rule__OrExp__Group_1__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3958:1: rule__OrExp__Group_1__3 : rule__OrExp__Group_1__3__Impl ;
    public final void rule__OrExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3962:1: ( rule__OrExp__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3963:2: rule__OrExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__3__Impl_in_rule__OrExp__Group_1__38040);
            rule__OrExp__Group_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group_1__3


    // $ANTLR start rule__OrExp__Group_1__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3969:1: rule__OrExp__Group_1__3__Impl : ( ( rule__OrExp__RightAssignment_1_3 ) ) ;
    public final void rule__OrExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3973:1: ( ( ( rule__OrExp__RightAssignment_1_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3974:1: ( ( rule__OrExp__RightAssignment_1_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3974:1: ( ( rule__OrExp__RightAssignment_1_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3975:1: ( rule__OrExp__RightAssignment_1_3 )
            {
             before(grammarAccess.getOrExpAccess().getRightAssignment_1_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3976:1: ( rule__OrExp__RightAssignment_1_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3976:2: rule__OrExp__RightAssignment_1_3
            {
            pushFollow(FOLLOW_rule__OrExp__RightAssignment_1_3_in_rule__OrExp__Group_1__3__Impl8067);
            rule__OrExp__RightAssignment_1_3();
            _fsp--;


            }

             after(grammarAccess.getOrExpAccess().getRightAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__Group_1__3__Impl


    // $ANTLR start rule__AndExp__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3994:1: rule__AndExp__Group__0 : rule__AndExp__Group__0__Impl rule__AndExp__Group__1 ;
    public final void rule__AndExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3998:1: ( rule__AndExp__Group__0__Impl rule__AndExp__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3999:2: rule__AndExp__Group__0__Impl rule__AndExp__Group__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__08105);
            rule__AndExp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__08108);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4006:1: rule__AndExp__Group__0__Impl : ( ruleRelational ) ;
    public final void rule__AndExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4010:1: ( ( ruleRelational ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4011:1: ( ruleRelational )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4011:1: ( ruleRelational )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4012:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRelational_in_rule__AndExp__Group__0__Impl8135);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4023:1: rule__AndExp__Group__1 : rule__AndExp__Group__1__Impl ;
    public final void rule__AndExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4027:1: ( rule__AndExp__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4028:2: rule__AndExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__18164);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4034:1: rule__AndExp__Group__1__Impl : ( ( rule__AndExp__Group_1__0 )* ) ;
    public final void rule__AndExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4038:1: ( ( ( rule__AndExp__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4039:1: ( ( rule__AndExp__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4039:1: ( ( rule__AndExp__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4040:1: ( rule__AndExp__Group_1__0 )*
            {
             before(grammarAccess.getAndExpAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4041:1: ( rule__AndExp__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==34) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4041:2: rule__AndExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl8191);
            	    rule__AndExp__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4055:1: rule__AndExp__Group_1__0 : rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 ;
    public final void rule__AndExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4059:1: ( rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4060:2: rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__08226);
            rule__AndExp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__08229);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4067:1: rule__AndExp__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4071:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4072:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4072:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4073:1: ()
            {
             before(grammarAccess.getAndExpAccess().getAndLeftAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4074:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4076:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4086:1: rule__AndExp__Group_1__1 : rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 ;
    public final void rule__AndExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4090:1: ( rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4091:2: rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__18287);
            rule__AndExp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__2_in_rule__AndExp__Group_1__18290);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4098:1: rule__AndExp__Group_1__1__Impl : ( '&' ) ;
    public final void rule__AndExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4102:1: ( ( '&' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4103:1: ( '&' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4103:1: ( '&' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4104:1: '&'
            {
             before(grammarAccess.getAndExpAccess().getAmpersandKeyword_1_1()); 
            match(input,34,FOLLOW_34_in_rule__AndExp__Group_1__1__Impl8318); 
             after(grammarAccess.getAndExpAccess().getAmpersandKeyword_1_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4117:1: rule__AndExp__Group_1__2 : rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3 ;
    public final void rule__AndExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4121:1: ( rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4122:2: rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__2__Impl_in_rule__AndExp__Group_1__28349);
            rule__AndExp__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__3_in_rule__AndExp__Group_1__28352);
            rule__AndExp__Group_1__3();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4129:1: rule__AndExp__Group_1__2__Impl : ( ( rule__AndExp__QualifiersAssignment_1_2 )* ) ;
    public final void rule__AndExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4133:1: ( ( ( rule__AndExp__QualifiersAssignment_1_2 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4134:1: ( ( rule__AndExp__QualifiersAssignment_1_2 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4134:1: ( ( rule__AndExp__QualifiersAssignment_1_2 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4135:1: ( rule__AndExp__QualifiersAssignment_1_2 )*
            {
             before(grammarAccess.getAndExpAccess().getQualifiersAssignment_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4136:1: ( rule__AndExp__QualifiersAssignment_1_2 )*
            loop35:
            do {
                int alt35=2;
                alt35 = dfa35.predict(input);
                switch (alt35) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4136:2: rule__AndExp__QualifiersAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__AndExp__QualifiersAssignment_1_2_in_rule__AndExp__Group_1__2__Impl8379);
            	    rule__AndExp__QualifiersAssignment_1_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getAndExpAccess().getQualifiersAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start rule__AndExp__Group_1__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4146:1: rule__AndExp__Group_1__3 : rule__AndExp__Group_1__3__Impl ;
    public final void rule__AndExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4150:1: ( rule__AndExp__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4151:2: rule__AndExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__3__Impl_in_rule__AndExp__Group_1__38410);
            rule__AndExp__Group_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group_1__3


    // $ANTLR start rule__AndExp__Group_1__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4157:1: rule__AndExp__Group_1__3__Impl : ( ( rule__AndExp__RightAssignment_1_3 ) ) ;
    public final void rule__AndExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4161:1: ( ( ( rule__AndExp__RightAssignment_1_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4162:1: ( ( rule__AndExp__RightAssignment_1_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4162:1: ( ( rule__AndExp__RightAssignment_1_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4163:1: ( rule__AndExp__RightAssignment_1_3 )
            {
             before(grammarAccess.getAndExpAccess().getRightAssignment_1_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4164:1: ( rule__AndExp__RightAssignment_1_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4164:2: rule__AndExp__RightAssignment_1_3
            {
            pushFollow(FOLLOW_rule__AndExp__RightAssignment_1_3_in_rule__AndExp__Group_1__3__Impl8437);
            rule__AndExp__RightAssignment_1_3();
            _fsp--;


            }

             after(grammarAccess.getAndExpAccess().getRightAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__Group_1__3__Impl


    // $ANTLR start rule__Relational__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4182:1: rule__Relational__Group__0 : rule__Relational__Group__0__Impl rule__Relational__Group__1 ;
    public final void rule__Relational__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4186:1: ( rule__Relational__Group__0__Impl rule__Relational__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4187:2: rule__Relational__Group__0__Impl rule__Relational__Group__1
            {
            pushFollow(FOLLOW_rule__Relational__Group__0__Impl_in_rule__Relational__Group__08475);
            rule__Relational__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group__1_in_rule__Relational__Group__08478);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4194:1: rule__Relational__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relational__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4198:1: ( ( ruleAddition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4199:1: ( ruleAddition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4199:1: ( ruleAddition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4200:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relational__Group__0__Impl8505);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4211:1: rule__Relational__Group__1 : rule__Relational__Group__1__Impl ;
    public final void rule__Relational__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4215:1: ( rule__Relational__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4216:2: rule__Relational__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group__1__Impl_in_rule__Relational__Group__18534);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4222:1: rule__Relational__Group__1__Impl : ( ( rule__Relational__Group_1__0 )? ) ;
    public final void rule__Relational__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4226:1: ( ( ( rule__Relational__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4227:1: ( ( rule__Relational__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4227:1: ( ( rule__Relational__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4228:1: ( rule__Relational__Group_1__0 )?
            {
             before(grammarAccess.getRelationalAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4229:1: ( rule__Relational__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( ((LA36_0>=35 && LA36_0<=41)) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4229:2: rule__Relational__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1__0_in_rule__Relational__Group__1__Impl8561);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4243:1: rule__Relational__Group_1__0 : rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 ;
    public final void rule__Relational__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4247:1: ( rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4248:2: rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1__0__Impl_in_rule__Relational__Group_1__08596);
            rule__Relational__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1__1_in_rule__Relational__Group_1__08599);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4255:1: rule__Relational__Group_1__0__Impl : ( ( rule__Relational__Alternatives_1_0 ) ) ;
    public final void rule__Relational__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4259:1: ( ( ( rule__Relational__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4260:1: ( ( rule__Relational__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4260:1: ( ( rule__Relational__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4261:1: ( rule__Relational__Alternatives_1_0 )
            {
             before(grammarAccess.getRelationalAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4262:1: ( rule__Relational__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4262:2: rule__Relational__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Relational__Alternatives_1_0_in_rule__Relational__Group_1__0__Impl8626);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4272:1: rule__Relational__Group_1__1 : rule__Relational__Group_1__1__Impl ;
    public final void rule__Relational__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4276:1: ( rule__Relational__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4277:2: rule__Relational__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1__1__Impl_in_rule__Relational__Group_1__18656);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4283:1: rule__Relational__Group_1__1__Impl : ( ( rule__Relational__RightAssignment_1_1 ) ) ;
    public final void rule__Relational__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4287:1: ( ( ( rule__Relational__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4288:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4288:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4289:1: ( rule__Relational__RightAssignment_1_1 )
            {
             before(grammarAccess.getRelationalAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4290:1: ( rule__Relational__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4290:2: rule__Relational__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Relational__RightAssignment_1_1_in_rule__Relational__Group_1__1__Impl8683);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4304:1: rule__Relational__Group_1_0_0__0 : rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 ;
    public final void rule__Relational__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4308:1: ( rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4309:2: rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__0__Impl_in_rule__Relational__Group_1_0_0__08717);
            rule__Relational__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__1_in_rule__Relational__Group_1_0_0__08720);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4316:1: rule__Relational__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4320:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4321:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4321:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4322:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4323:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4325:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4335:1: rule__Relational__Group_1_0_0__1 : rule__Relational__Group_1_0_0__1__Impl ;
    public final void rule__Relational__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4339:1: ( rule__Relational__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4340:2: rule__Relational__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__1__Impl_in_rule__Relational__Group_1_0_0__18778);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4346:1: rule__Relational__Group_1_0_0__1__Impl : ( '!=' ) ;
    public final void rule__Relational__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4350:1: ( ( '!=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4351:1: ( '!=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4351:1: ( '!=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4352:1: '!='
            {
             before(grammarAccess.getRelationalAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1()); 
            match(input,35,FOLLOW_35_in_rule__Relational__Group_1_0_0__1__Impl8806); 
             after(grammarAccess.getRelationalAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4369:1: rule__Relational__Group_1_0_1__0 : rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 ;
    public final void rule__Relational__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4373:1: ( rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4374:2: rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__0__Impl_in_rule__Relational__Group_1_0_1__08841);
            rule__Relational__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__1_in_rule__Relational__Group_1_0_1__08844);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4381:1: rule__Relational__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4385:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4386:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4386:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4387:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4388:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4390:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4400:1: rule__Relational__Group_1_0_1__1 : rule__Relational__Group_1_0_1__1__Impl ;
    public final void rule__Relational__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4404:1: ( rule__Relational__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4405:2: rule__Relational__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__1__Impl_in_rule__Relational__Group_1_0_1__18902);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4411:1: rule__Relational__Group_1_0_1__1__Impl : ( '==' ) ;
    public final void rule__Relational__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4415:1: ( ( '==' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4416:1: ( '==' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4416:1: ( '==' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4417:1: '=='
            {
             before(grammarAccess.getRelationalAccess().getEqualsSignEqualsSignKeyword_1_0_1_1()); 
            match(input,36,FOLLOW_36_in_rule__Relational__Group_1_0_1__1__Impl8930); 
             after(grammarAccess.getRelationalAccess().getEqualsSignEqualsSignKeyword_1_0_1_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4434:1: rule__Relational__Group_1_0_2__0 : rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 ;
    public final void rule__Relational__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4438:1: ( rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4439:2: rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__0__Impl_in_rule__Relational__Group_1_0_2__08965);
            rule__Relational__Group_1_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__1_in_rule__Relational__Group_1_0_2__08968);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4446:1: rule__Relational__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4450:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4451:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4451:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4452:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4453:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4455:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4465:1: rule__Relational__Group_1_0_2__1 : rule__Relational__Group_1_0_2__1__Impl ;
    public final void rule__Relational__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4469:1: ( rule__Relational__Group_1_0_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4470:2: rule__Relational__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__1__Impl_in_rule__Relational__Group_1_0_2__19026);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4476:1: rule__Relational__Group_1_0_2__1__Impl : ( '>=' ) ;
    public final void rule__Relational__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4480:1: ( ( '>=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4481:1: ( '>=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4481:1: ( '>=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4482:1: '>='
            {
             before(grammarAccess.getRelationalAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1()); 
            match(input,37,FOLLOW_37_in_rule__Relational__Group_1_0_2__1__Impl9054); 
             after(grammarAccess.getRelationalAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4499:1: rule__Relational__Group_1_0_3__0 : rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 ;
    public final void rule__Relational__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4503:1: ( rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4504:2: rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__0__Impl_in_rule__Relational__Group_1_0_3__09089);
            rule__Relational__Group_1_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__1_in_rule__Relational__Group_1_0_3__09092);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4511:1: rule__Relational__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4515:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4516:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4516:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4517:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4518:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4520:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4530:1: rule__Relational__Group_1_0_3__1 : rule__Relational__Group_1_0_3__1__Impl ;
    public final void rule__Relational__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4534:1: ( rule__Relational__Group_1_0_3__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4535:2: rule__Relational__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__1__Impl_in_rule__Relational__Group_1_0_3__19150);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4541:1: rule__Relational__Group_1_0_3__1__Impl : ( '<=' ) ;
    public final void rule__Relational__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4545:1: ( ( '<=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4546:1: ( '<=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4546:1: ( '<=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4547:1: '<='
            {
             before(grammarAccess.getRelationalAccess().getLessThanSignEqualsSignKeyword_1_0_3_1()); 
            match(input,38,FOLLOW_38_in_rule__Relational__Group_1_0_3__1__Impl9178); 
             after(grammarAccess.getRelationalAccess().getLessThanSignEqualsSignKeyword_1_0_3_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4564:1: rule__Relational__Group_1_0_4__0 : rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 ;
    public final void rule__Relational__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4568:1: ( rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4569:2: rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__0__Impl_in_rule__Relational__Group_1_0_4__09213);
            rule__Relational__Group_1_0_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__1_in_rule__Relational__Group_1_0_4__09216);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4576:1: rule__Relational__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4580:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4581:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4581:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4582:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4583:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4585:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4595:1: rule__Relational__Group_1_0_4__1 : rule__Relational__Group_1_0_4__1__Impl ;
    public final void rule__Relational__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4599:1: ( rule__Relational__Group_1_0_4__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4600:2: rule__Relational__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__1__Impl_in_rule__Relational__Group_1_0_4__19274);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4606:1: rule__Relational__Group_1_0_4__1__Impl : ( '=' ) ;
    public final void rule__Relational__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4610:1: ( ( '=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4611:1: ( '=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4611:1: ( '=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4612:1: '='
            {
             before(grammarAccess.getRelationalAccess().getEqualsSignKeyword_1_0_4_1()); 
            match(input,39,FOLLOW_39_in_rule__Relational__Group_1_0_4__1__Impl9302); 
             after(grammarAccess.getRelationalAccess().getEqualsSignKeyword_1_0_4_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4629:1: rule__Relational__Group_1_0_5__0 : rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 ;
    public final void rule__Relational__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4633:1: ( rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4634:2: rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__0__Impl_in_rule__Relational__Group_1_0_5__09337);
            rule__Relational__Group_1_0_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__1_in_rule__Relational__Group_1_0_5__09340);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4641:1: rule__Relational__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4645:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4646:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4646:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4647:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4648:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4650:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4660:1: rule__Relational__Group_1_0_5__1 : rule__Relational__Group_1_0_5__1__Impl ;
    public final void rule__Relational__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4664:1: ( rule__Relational__Group_1_0_5__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4665:2: rule__Relational__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__1__Impl_in_rule__Relational__Group_1_0_5__19398);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4671:1: rule__Relational__Group_1_0_5__1__Impl : ( '<' ) ;
    public final void rule__Relational__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4675:1: ( ( '<' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4676:1: ( '<' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4676:1: ( '<' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4677:1: '<'
            {
             before(grammarAccess.getRelationalAccess().getLessThanSignKeyword_1_0_5_1()); 
            match(input,40,FOLLOW_40_in_rule__Relational__Group_1_0_5__1__Impl9426); 
             after(grammarAccess.getRelationalAccess().getLessThanSignKeyword_1_0_5_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4694:1: rule__Relational__Group_1_0_6__0 : rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 ;
    public final void rule__Relational__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4698:1: ( rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4699:2: rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__0__Impl_in_rule__Relational__Group_1_0_6__09461);
            rule__Relational__Group_1_0_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__1_in_rule__Relational__Group_1_0_6__09464);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4706:1: rule__Relational__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4710:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4711:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4711:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4712:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4713:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4715:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4725:1: rule__Relational__Group_1_0_6__1 : rule__Relational__Group_1_0_6__1__Impl ;
    public final void rule__Relational__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4729:1: ( rule__Relational__Group_1_0_6__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4730:2: rule__Relational__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__1__Impl_in_rule__Relational__Group_1_0_6__19522);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4736:1: rule__Relational__Group_1_0_6__1__Impl : ( '>' ) ;
    public final void rule__Relational__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4740:1: ( ( '>' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4741:1: ( '>' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4741:1: ( '>' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4742:1: '>'
            {
             before(grammarAccess.getRelationalAccess().getGreaterThanSignKeyword_1_0_6_1()); 
            match(input,41,FOLLOW_41_in_rule__Relational__Group_1_0_6__1__Impl9550); 
             after(grammarAccess.getRelationalAccess().getGreaterThanSignKeyword_1_0_6_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4759:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4763:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4764:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__09585);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__09588);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4771:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4775:1: ( ( ruleMultiplication ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4776:1: ( ruleMultiplication )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4776:1: ( ruleMultiplication )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4777:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl9615);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4788:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4792:1: ( rule__Addition__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4793:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__19644);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4799:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4803:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4804:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4804:1: ( ( rule__Addition__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4805:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4806:1: ( rule__Addition__Group_1__0 )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=42 && LA37_0<=43)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4806:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl9671);
            	    rule__Addition__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4820:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4824:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4825:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__09706);
            rule__Addition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__09709);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4832:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4836:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4837:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4837:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4838:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4839:1: ( rule__Addition__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4839:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl9736);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4849:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4853:1: ( rule__Addition__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4854:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__19766);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4860:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4864:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4865:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4865:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4866:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4867:1: ( rule__Addition__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4867:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl9793);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4881:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4885:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4886:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__09827);
            rule__Addition__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__09830);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4893:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4897:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4898:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4898:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4899:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4900:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4902:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4912:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4916:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4917:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__19888);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4923:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4927:1: ( ( '+' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4928:1: ( '+' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4928:1: ( '+' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4929:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,42,FOLLOW_42_in_rule__Addition__Group_1_0_0__1__Impl9916); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4946:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4950:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4951:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__09951);
            rule__Addition__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__09954);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4958:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4962:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4963:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4963:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4964:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4965:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4967:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4977:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4981:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4982:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__110012);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4988:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4992:1: ( ( '-' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4993:1: ( '-' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4993:1: ( '-' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4994:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,43,FOLLOW_43_in_rule__Addition__Group_1_0_1__1__Impl10040); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5011:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5015:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5016:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__010075);
            rule__Multiplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__010078);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5023:1: rule__Multiplication__Group__0__Impl : ( rulePower ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5027:1: ( ( rulePower ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5028:1: ( rulePower )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5028:1: ( rulePower )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5029:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl10105);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5040:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5044:1: ( rule__Multiplication__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5045:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__110134);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5051:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5055:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5056:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5056:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5057:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5058:1: ( rule__Multiplication__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=44 && LA38_0<=45)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5058:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl10161);
            	    rule__Multiplication__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5072:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5076:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5077:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__010196);
            rule__Multiplication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__010199);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5084:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5088:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5089:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5089:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5090:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5091:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5091:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl10226);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5101:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5105:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5106:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__110256);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5112:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5116:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5117:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5117:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5118:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5119:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5119:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl10283);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5133:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5137:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5138:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__010317);
            rule__Multiplication__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__010320);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5145:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5149:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5150:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5150:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5151:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5152:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5154:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5164:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5168:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5169:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__110378);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5175:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5179:1: ( ( '*' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5180:1: ( '*' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5180:1: ( '*' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5181:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,44,FOLLOW_44_in_rule__Multiplication__Group_1_0_0__1__Impl10406); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5198:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5202:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5203:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__010441);
            rule__Multiplication__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__010444);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5210:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5214:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5215:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5215:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5216:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5217:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5219:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5229:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5233:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5234:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__110502);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5240:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5244:1: ( ( '/' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5245:1: ( '/' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5245:1: ( '/' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5246:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,45,FOLLOW_45_in_rule__Multiplication__Group_1_0_1__1__Impl10530); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5263:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5267:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5268:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__010565);
            rule__Power__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group__1_in_rule__Power__Group__010568);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5275:1: rule__Power__Group__0__Impl : ( ruleUnaryExpr ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5279:1: ( ( ruleUnaryExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5280:1: ( ruleUnaryExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5280:1: ( ruleUnaryExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5281:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__Power__Group__0__Impl10595);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5292:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5296:1: ( rule__Power__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5297:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__110624);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5303:1: rule__Power__Group__1__Impl : ( ( rule__Power__Group_1__0 )* ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5307:1: ( ( ( rule__Power__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5308:1: ( ( rule__Power__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5308:1: ( ( rule__Power__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5309:1: ( rule__Power__Group_1__0 )*
            {
             before(grammarAccess.getPowerAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5310:1: ( rule__Power__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==46) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5310:2: rule__Power__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl10651);
            	    rule__Power__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5324:1: rule__Power__Group_1__0 : rule__Power__Group_1__0__Impl rule__Power__Group_1__1 ;
    public final void rule__Power__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5328:1: ( rule__Power__Group_1__0__Impl rule__Power__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5329:2: rule__Power__Group_1__0__Impl rule__Power__Group_1__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__010686);
            rule__Power__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__010689);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5336:1: rule__Power__Group_1__0__Impl : ( ( rule__Power__Group_1_0__0 ) ) ;
    public final void rule__Power__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5340:1: ( ( ( rule__Power__Group_1_0__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5341:1: ( ( rule__Power__Group_1_0__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5341:1: ( ( rule__Power__Group_1_0__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5342:1: ( rule__Power__Group_1_0__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5343:1: ( rule__Power__Group_1_0__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5343:2: rule__Power__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl10716);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5353:1: rule__Power__Group_1__1 : rule__Power__Group_1__1__Impl ;
    public final void rule__Power__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5357:1: ( rule__Power__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5358:2: rule__Power__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__110746);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5364:1: rule__Power__Group_1__1__Impl : ( ( rule__Power__RightAssignment_1_1 ) ) ;
    public final void rule__Power__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5368:1: ( ( ( rule__Power__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5369:1: ( ( rule__Power__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5369:1: ( ( rule__Power__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5370:1: ( rule__Power__RightAssignment_1_1 )
            {
             before(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5371:1: ( rule__Power__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5371:2: rule__Power__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl10773);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5385:1: rule__Power__Group_1_0__0 : rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 ;
    public final void rule__Power__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5389:1: ( rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5390:2: rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__010807);
            rule__Power__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__010810);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5397:1: rule__Power__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Power__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5401:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5402:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5402:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5403:1: ()
            {
             before(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5404:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5406:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5416:1: rule__Power__Group_1_0__1 : rule__Power__Group_1_0__1__Impl ;
    public final void rule__Power__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5420:1: ( rule__Power__Group_1_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5421:2: rule__Power__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__110868);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5427:1: rule__Power__Group_1_0__1__Impl : ( '^' ) ;
    public final void rule__Power__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5431:1: ( ( '^' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5432:1: ( '^' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5432:1: ( '^' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5433:1: '^'
            {
             before(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
            match(input,46,FOLLOW_46_in_rule__Power__Group_1_0__1__Impl10896); 
             after(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5450:1: rule__UnaryExpr__Group__0 : rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 ;
    public final void rule__UnaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5454:1: ( rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5455:2: rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__0__Impl_in_rule__UnaryExpr__Group__010931);
            rule__UnaryExpr__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group__1_in_rule__UnaryExpr__Group__010934);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5462:1: rule__UnaryExpr__Group__0__Impl : ( ( rule__UnaryExpr__OpAssignment_0 )? ) ;
    public final void rule__UnaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5466:1: ( ( ( rule__UnaryExpr__OpAssignment_0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5467:1: ( ( rule__UnaryExpr__OpAssignment_0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5467:1: ( ( rule__UnaryExpr__OpAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5468:1: ( rule__UnaryExpr__OpAssignment_0 )?
            {
             before(grammarAccess.getUnaryExprAccess().getOpAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5469:1: ( rule__UnaryExpr__OpAssignment_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==12) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5469:2: rule__UnaryExpr__OpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpr__OpAssignment_0_in_rule__UnaryExpr__Group__0__Impl10961);
                    rule__UnaryExpr__OpAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getUnaryExprAccess().getOpAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5479:1: rule__UnaryExpr__Group__1 : rule__UnaryExpr__Group__1__Impl rule__UnaryExpr__Group__2 ;
    public final void rule__UnaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5483:1: ( rule__UnaryExpr__Group__1__Impl rule__UnaryExpr__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5484:2: rule__UnaryExpr__Group__1__Impl rule__UnaryExpr__Group__2
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__1__Impl_in_rule__UnaryExpr__Group__110992);
            rule__UnaryExpr__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group__2_in_rule__UnaryExpr__Group__110995);
            rule__UnaryExpr__Group__2();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5491:1: rule__UnaryExpr__Group__1__Impl : ( ( rule__UnaryExpr__QualifiersAssignment_1 )* ) ;
    public final void rule__UnaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5495:1: ( ( ( rule__UnaryExpr__QualifiersAssignment_1 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5496:1: ( ( rule__UnaryExpr__QualifiersAssignment_1 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5496:1: ( ( rule__UnaryExpr__QualifiersAssignment_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5497:1: ( rule__UnaryExpr__QualifiersAssignment_1 )*
            {
             before(grammarAccess.getUnaryExprAccess().getQualifiersAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5498:1: ( rule__UnaryExpr__QualifiersAssignment_1 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==27||LA41_0==29) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5498:2: rule__UnaryExpr__QualifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__UnaryExpr__QualifiersAssignment_1_in_rule__UnaryExpr__Group__1__Impl11022);
            	    rule__UnaryExpr__QualifiersAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             after(grammarAccess.getUnaryExprAccess().getQualifiersAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__UnaryExpr__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5508:1: rule__UnaryExpr__Group__2 : rule__UnaryExpr__Group__2__Impl ;
    public final void rule__UnaryExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5512:1: ( rule__UnaryExpr__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5513:2: rule__UnaryExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__2__Impl_in_rule__UnaryExpr__Group__211053);
            rule__UnaryExpr__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__Group__2


    // $ANTLR start rule__UnaryExpr__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5519:1: rule__UnaryExpr__Group__2__Impl : ( ( rule__UnaryExpr__RightAssignment_2 ) ) ;
    public final void rule__UnaryExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5523:1: ( ( ( rule__UnaryExpr__RightAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5524:1: ( ( rule__UnaryExpr__RightAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5524:1: ( ( rule__UnaryExpr__RightAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5525:1: ( rule__UnaryExpr__RightAssignment_2 )
            {
             before(grammarAccess.getUnaryExprAccess().getRightAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5526:1: ( rule__UnaryExpr__RightAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5526:2: rule__UnaryExpr__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__UnaryExpr__RightAssignment_2_in_rule__UnaryExpr__Group__2__Impl11080);
            rule__UnaryExpr__RightAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getUnaryExprAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__Group__2__Impl


    // $ANTLR start rule__PrePrimaryExpr__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5542:1: rule__PrePrimaryExpr__Group_2__0 : rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 ;
    public final void rule__PrePrimaryExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5546:1: ( rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5547:2: rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__0__Impl_in_rule__PrePrimaryExpr__Group_2__011116);
            rule__PrePrimaryExpr__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__1_in_rule__PrePrimaryExpr__Group_2__011119);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5554:1: rule__PrePrimaryExpr__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrePrimaryExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5558:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5559:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5559:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5560:1: '('
            {
             before(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,25,FOLLOW_25_in_rule__PrePrimaryExpr__Group_2__0__Impl11147); 
             after(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5573:1: rule__PrePrimaryExpr__Group_2__1 : rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2 ;
    public final void rule__PrePrimaryExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5577:1: ( rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5578:2: rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__1__Impl_in_rule__PrePrimaryExpr__Group_2__111178);
            rule__PrePrimaryExpr__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__2_in_rule__PrePrimaryExpr__Group_2__111181);
            rule__PrePrimaryExpr__Group_2__2();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5585:1: rule__PrePrimaryExpr__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__PrePrimaryExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5589:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5590:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5590:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5591:1: ruleExpression
            {
             before(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrePrimaryExpr__Group_2__1__Impl11208);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_2_1()); 

            }


            }

        }
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


    // $ANTLR start rule__PrePrimaryExpr__Group_2__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5602:1: rule__PrePrimaryExpr__Group_2__2 : rule__PrePrimaryExpr__Group_2__2__Impl ;
    public final void rule__PrePrimaryExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5606:1: ( rule__PrePrimaryExpr__Group_2__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5607:2: rule__PrePrimaryExpr__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__2__Impl_in_rule__PrePrimaryExpr__Group_2__211237);
            rule__PrePrimaryExpr__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_2__2


    // $ANTLR start rule__PrePrimaryExpr__Group_2__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5613:1: rule__PrePrimaryExpr__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrePrimaryExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5617:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5618:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5618:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5619:1: ')'
            {
             before(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_2_2()); 
            match(input,26,FOLLOW_26_in_rule__PrePrimaryExpr__Group_2__2__Impl11265); 
             after(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_2__2__Impl


    // $ANTLR start rule__AbstractRef__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5638:1: rule__AbstractRef__Group__0 : rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1 ;
    public final void rule__AbstractRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5642:1: ( rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5643:2: rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group__0__Impl_in_rule__AbstractRef__Group__011302);
            rule__AbstractRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group__1_in_rule__AbstractRef__Group__011305);
            rule__AbstractRef__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group__0


    // $ANTLR start rule__AbstractRef__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5650:1: rule__AbstractRef__Group__0__Impl : ( ruleDeclaredParameter ) ;
    public final void rule__AbstractRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5654:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5655:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5655:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5656:1: ruleDeclaredParameter
            {
             before(grammarAccess.getAbstractRefAccess().getDeclaredParameterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__AbstractRef__Group__0__Impl11332);
            ruleDeclaredParameter();
            _fsp--;

             after(grammarAccess.getAbstractRefAccess().getDeclaredParameterParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group__0__Impl


    // $ANTLR start rule__AbstractRef__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5667:1: rule__AbstractRef__Group__1 : rule__AbstractRef__Group__1__Impl ;
    public final void rule__AbstractRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5671:1: ( rule__AbstractRef__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5672:2: rule__AbstractRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group__1__Impl_in_rule__AbstractRef__Group__111361);
            rule__AbstractRef__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group__1


    // $ANTLR start rule__AbstractRef__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5678:1: rule__AbstractRef__Group__1__Impl : ( ( rule__AbstractRef__Group_1__0 )? ) ;
    public final void rule__AbstractRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5682:1: ( ( ( rule__AbstractRef__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5683:1: ( ( rule__AbstractRef__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5683:1: ( ( rule__AbstractRef__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5684:1: ( rule__AbstractRef__Group_1__0 )?
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5685:1: ( rule__AbstractRef__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==25) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5685:2: rule__AbstractRef__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AbstractRef__Group_1__0_in_rule__AbstractRef__Group__1__Impl11388);
                    rule__AbstractRef__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractRefAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group__1__Impl


    // $ANTLR start rule__AbstractRef__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5699:1: rule__AbstractRef__Group_1__0 : rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1 ;
    public final void rule__AbstractRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5703:1: ( rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5704:2: rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1__0__Impl_in_rule__AbstractRef__Group_1__011423);
            rule__AbstractRef__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1__1_in_rule__AbstractRef__Group_1__011426);
            rule__AbstractRef__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1__0


    // $ANTLR start rule__AbstractRef__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5711:1: rule__AbstractRef__Group_1__0__Impl : ( () ) ;
    public final void rule__AbstractRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5715:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5716:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5716:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5717:1: ()
            {
             before(grammarAccess.getAbstractRefAccess().getFunctionRefFuncAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5718:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5720:1: 
            {
            }

             after(grammarAccess.getAbstractRefAccess().getFunctionRefFuncAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1__0__Impl


    // $ANTLR start rule__AbstractRef__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5730:1: rule__AbstractRef__Group_1__1 : rule__AbstractRef__Group_1__1__Impl ;
    public final void rule__AbstractRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5734:1: ( rule__AbstractRef__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5735:2: rule__AbstractRef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1__1__Impl_in_rule__AbstractRef__Group_1__111484);
            rule__AbstractRef__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1__1


    // $ANTLR start rule__AbstractRef__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5741:1: rule__AbstractRef__Group_1__1__Impl : ( ( rule__AbstractRef__Group_1_1__0 ) ) ;
    public final void rule__AbstractRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5745:1: ( ( ( rule__AbstractRef__Group_1_1__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5746:1: ( ( rule__AbstractRef__Group_1_1__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5746:1: ( ( rule__AbstractRef__Group_1_1__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5747:1: ( rule__AbstractRef__Group_1_1__0 )
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5748:1: ( rule__AbstractRef__Group_1_1__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5748:2: rule__AbstractRef__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__0_in_rule__AbstractRef__Group_1__1__Impl11511);
            rule__AbstractRef__Group_1_1__0();
            _fsp--;


            }

             after(grammarAccess.getAbstractRefAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1__1__Impl


    // $ANTLR start rule__AbstractRef__Group_1_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5762:1: rule__AbstractRef__Group_1_1__0 : rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1 ;
    public final void rule__AbstractRef__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5766:1: ( rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5767:2: rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__0__Impl_in_rule__AbstractRef__Group_1_1__011545);
            rule__AbstractRef__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__1_in_rule__AbstractRef__Group_1_1__011548);
            rule__AbstractRef__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1__0


    // $ANTLR start rule__AbstractRef__Group_1_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5774:1: rule__AbstractRef__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__AbstractRef__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5778:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5779:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5779:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5780:1: '('
            {
             before(grammarAccess.getAbstractRefAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,25,FOLLOW_25_in_rule__AbstractRef__Group_1_1__0__Impl11576); 
             after(grammarAccess.getAbstractRefAccess().getLeftParenthesisKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1__0__Impl


    // $ANTLR start rule__AbstractRef__Group_1_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5793:1: rule__AbstractRef__Group_1_1__1 : rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2 ;
    public final void rule__AbstractRef__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5797:1: ( rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5798:2: rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__1__Impl_in_rule__AbstractRef__Group_1_1__111607);
            rule__AbstractRef__Group_1_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__2_in_rule__AbstractRef__Group_1_1__111610);
            rule__AbstractRef__Group_1_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1__1


    // $ANTLR start rule__AbstractRef__Group_1_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5805:1: rule__AbstractRef__Group_1_1__1__Impl : ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? ) ;
    public final void rule__AbstractRef__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5809:1: ( ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5810:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5810:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5811:1: ( rule__AbstractRef__ArgsAssignment_1_1_1 )?
            {
             before(grammarAccess.getAbstractRefAccess().getArgsAssignment_1_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5812:1: ( rule__AbstractRef__ArgsAssignment_1_1_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_STRING && LA43_0<=RULE_BOOLEAN)||LA43_0==12||LA43_0==25||LA43_0==27||LA43_0==29) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5812:2: rule__AbstractRef__ArgsAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_1_in_rule__AbstractRef__Group_1_1__1__Impl11637);
                    rule__AbstractRef__ArgsAssignment_1_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAbstractRefAccess().getArgsAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1__1__Impl


    // $ANTLR start rule__AbstractRef__Group_1_1__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5822:1: rule__AbstractRef__Group_1_1__2 : rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3 ;
    public final void rule__AbstractRef__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5826:1: ( rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5827:2: rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__2__Impl_in_rule__AbstractRef__Group_1_1__211668);
            rule__AbstractRef__Group_1_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__3_in_rule__AbstractRef__Group_1_1__211671);
            rule__AbstractRef__Group_1_1__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1__2


    // $ANTLR start rule__AbstractRef__Group_1_1__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5834:1: rule__AbstractRef__Group_1_1__2__Impl : ( ( rule__AbstractRef__Group_1_1_2__0 )* ) ;
    public final void rule__AbstractRef__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5838:1: ( ( ( rule__AbstractRef__Group_1_1_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5839:1: ( ( rule__AbstractRef__Group_1_1_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5839:1: ( ( rule__AbstractRef__Group_1_1_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5840:1: ( rule__AbstractRef__Group_1_1_2__0 )*
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5841:1: ( rule__AbstractRef__Group_1_1_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==21) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5841:2: rule__AbstractRef__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__0_in_rule__AbstractRef__Group_1_1__2__Impl11698);
            	    rule__AbstractRef__Group_1_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
                }
            } while (true);

             after(grammarAccess.getAbstractRefAccess().getGroup_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1__2__Impl


    // $ANTLR start rule__AbstractRef__Group_1_1__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5851:1: rule__AbstractRef__Group_1_1__3 : rule__AbstractRef__Group_1_1__3__Impl ;
    public final void rule__AbstractRef__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5855:1: ( rule__AbstractRef__Group_1_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5856:2: rule__AbstractRef__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__3__Impl_in_rule__AbstractRef__Group_1_1__311729);
            rule__AbstractRef__Group_1_1__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1__3


    // $ANTLR start rule__AbstractRef__Group_1_1__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5862:1: rule__AbstractRef__Group_1_1__3__Impl : ( ')' ) ;
    public final void rule__AbstractRef__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5866:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5867:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5867:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5868:1: ')'
            {
             before(grammarAccess.getAbstractRefAccess().getRightParenthesisKeyword_1_1_3()); 
            match(input,26,FOLLOW_26_in_rule__AbstractRef__Group_1_1__3__Impl11757); 
             after(grammarAccess.getAbstractRefAccess().getRightParenthesisKeyword_1_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1__3__Impl


    // $ANTLR start rule__AbstractRef__Group_1_1_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5889:1: rule__AbstractRef__Group_1_1_2__0 : rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1 ;
    public final void rule__AbstractRef__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5893:1: ( rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5894:2: rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__0__Impl_in_rule__AbstractRef__Group_1_1_2__011796);
            rule__AbstractRef__Group_1_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__1_in_rule__AbstractRef__Group_1_1_2__011799);
            rule__AbstractRef__Group_1_1_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1_2__0


    // $ANTLR start rule__AbstractRef__Group_1_1_2__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5901:1: rule__AbstractRef__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__AbstractRef__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5905:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5906:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5906:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5907:1: ','
            {
             before(grammarAccess.getAbstractRefAccess().getCommaKeyword_1_1_2_0()); 
            match(input,21,FOLLOW_21_in_rule__AbstractRef__Group_1_1_2__0__Impl11827); 
             after(grammarAccess.getAbstractRefAccess().getCommaKeyword_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1_2__0__Impl


    // $ANTLR start rule__AbstractRef__Group_1_1_2__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5920:1: rule__AbstractRef__Group_1_1_2__1 : rule__AbstractRef__Group_1_1_2__1__Impl ;
    public final void rule__AbstractRef__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5924:1: ( rule__AbstractRef__Group_1_1_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5925:2: rule__AbstractRef__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__1__Impl_in_rule__AbstractRef__Group_1_1_2__111858);
            rule__AbstractRef__Group_1_1_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1_2__1


    // $ANTLR start rule__AbstractRef__Group_1_1_2__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5931:1: rule__AbstractRef__Group_1_1_2__1__Impl : ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) ) ;
    public final void rule__AbstractRef__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5935:1: ( ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5936:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5936:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5937:1: ( rule__AbstractRef__ArgsAssignment_1_1_2_1 )
            {
             before(grammarAccess.getAbstractRefAccess().getArgsAssignment_1_1_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5938:1: ( rule__AbstractRef__ArgsAssignment_1_1_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5938:2: rule__AbstractRef__ArgsAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_2_1_in_rule__AbstractRef__Group_1_1_2__1__Impl11885);
            rule__AbstractRef__ArgsAssignment_1_1_2_1();
            _fsp--;


            }

             after(grammarAccess.getAbstractRefAccess().getArgsAssignment_1_1_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__Group_1_1_2__1__Impl


    // $ANTLR start rule__TerminalExpression__Group_0__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5952:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5956:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5957:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__011919);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__011922);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5964:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5968:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5969:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5969:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5970:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5971:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5973:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5983:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5987:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5988:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__111980);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5994:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5998:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5999:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5999:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6000:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6001:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6001:2: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_0_1_in_rule__TerminalExpression__Group_0__1__Impl12007);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6015:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6019:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6020:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__012041);
            rule__TerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__012044);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6027:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6031:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6032:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6032:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6033:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6034:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6036:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0()); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6046:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6050:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6051:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__112102);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6057:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6061:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6062:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6062:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6063:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6064:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6064:2: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl12129);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6078:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6082:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6083:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__012163);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__012166);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6090:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6094:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6095:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6095:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6096:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6097:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6099:1: 
            {
            }

             after(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0()); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6109:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6113:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6114:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__112224);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6120:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6124:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6125:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6125:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6126:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6127:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6127:2: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl12251);
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


    // $ANTLR start rule__Model__ImportsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6144:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6148:1: ( ( ruleImport ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6149:1: ( ruleImport )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6149:1: ( ruleImport )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6150:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_012292);
            ruleImport();
            _fsp--;

             after(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__ImportsAssignment_0


    // $ANTLR start rule__Model__DeclarationsAssignment_1_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6159:1: rule__Model__DeclarationsAssignment_1_0 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6163:1: ( ( ruleDeclaration ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6164:1: ( ruleDeclaration )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6164:1: ( ruleDeclaration )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6165:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_1_012323);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__DeclarationsAssignment_1_0


    // $ANTLR start rule__Model__StatementsAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6174:1: rule__Model__StatementsAssignment_1_1 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6178:1: ( ( ruleStatement ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6179:1: ( ruleStatement )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6179:1: ( ruleStatement )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6180:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_1_112354);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__StatementsAssignment_1_1


    // $ANTLR start rule__Import__ImportURIAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6189:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6193:1: ( ( RULE_STRING ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6194:1: ( RULE_STRING )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6194:1: ( RULE_STRING )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6195:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_112385); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Import__ImportURIAssignment_1


    // $ANTLR start rule__DefSort__ReifiedAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6204:1: rule__DefSort__ReifiedAssignment_0 : ( ( 'reified' ) ) ;
    public final void rule__DefSort__ReifiedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6208:1: ( ( ( 'reified' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6209:1: ( ( 'reified' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6209:1: ( ( 'reified' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6210:1: ( 'reified' )
            {
             before(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6211:1: ( 'reified' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6212:1: 'reified'
            {
             before(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__DefSort__ReifiedAssignment_012421); 
             after(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_0_0()); 

            }

             after(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__ReifiedAssignment_0


    // $ANTLR start rule__DefSort__NameAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6227:1: rule__DefSort__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefSort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6231:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6232:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6232:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6233:1: RULE_ID
            {
             before(grammarAccess.getDefSortAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefSort__NameAssignment_212460); 
             after(grammarAccess.getDefSortAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__NameAssignment_2


    // $ANTLR start rule__DefSort__TypeAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6242:1: rule__DefSort__TypeAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__DefSort__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6246:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6247:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6247:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6248:1: RULE_ID
            {
             before(grammarAccess.getDefSortAccess().getTypeIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefSort__TypeAssignment_3_112491); 
             after(grammarAccess.getDefSortAccess().getTypeIDTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__TypeAssignment_3_1


    // $ANTLR start rule__DefRange__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6257:1: rule__DefRange__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefRange__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6261:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6262:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6262:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6263:1: ( RULE_ID )
            {
             before(grammarAccess.getDefRangeAccess().getNameDefSortCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6264:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6265:1: RULE_ID
            {
             before(grammarAccess.getDefRangeAccess().getNameDefSortIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefRange__NameAssignment_112526); 
             after(grammarAccess.getDefRangeAccess().getNameDefSortIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefRangeAccess().getNameDefSortCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__NameAssignment_1


    // $ANTLR start rule__DefRange__MinAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6276:1: rule__DefRange__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__DefRange__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6280:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6281:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6281:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6282:1: RULE_INT
            {
             before(grammarAccess.getDefRangeAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DefRange__MinAssignment_212561); 
             after(grammarAccess.getDefRangeAccess().getMinINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__MinAssignment_2


    // $ANTLR start rule__DefRange__MaxAssignment_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6291:1: rule__DefRange__MaxAssignment_3 : ( RULE_INT ) ;
    public final void rule__DefRange__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6295:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6296:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6296:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6297:1: RULE_INT
            {
             before(grammarAccess.getDefRangeAccess().getMaxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DefRange__MaxAssignment_312592); 
             after(grammarAccess.getDefRangeAccess().getMaxINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__MaxAssignment_3


    // $ANTLR start rule__DefOption__NameAssignment_0_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6306:1: rule__DefOption__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__DefOption__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6310:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6311:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6311:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6312:1: RULE_ID
            {
             before(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefOption__NameAssignment_0_112623); 
             after(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__NameAssignment_0_1


    // $ANTLR start rule__DefOption__ValueAssignment_0_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6321:1: rule__DefOption__ValueAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__DefOption__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6325:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6326:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6326:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6327:1: RULE_INT
            {
             before(grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DefOption__ValueAssignment_0_212654); 
             after(grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__ValueAssignment_0_2


    // $ANTLR start rule__DefOption__NameAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6336:1: rule__DefOption__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__DefOption__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6340:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6341:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6341:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6342:1: RULE_ID
            {
             before(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefOption__NameAssignment_1_112685); 
             after(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__NameAssignment_1_1


    // $ANTLR start rule__DefOption__Value2Assignment_1_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6351:1: rule__DefOption__Value2Assignment_1_2 : ( RULE_ID ) ;
    public final void rule__DefOption__Value2Assignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6355:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6356:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6356:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6357:1: RULE_ID
            {
             before(grammarAccess.getDefOptionAccess().getValue2IDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefOption__Value2Assignment_1_212716); 
             after(grammarAccess.getDefOptionAccess().getValue2IDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Value2Assignment_1_2


    // $ANTLR start rule__DefCompletion__NameAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6366:1: rule__DefCompletion__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefCompletion__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6370:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6371:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6371:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6372:1: ( RULE_ID )
            {
             before(grammarAccess.getDefCompletionAccess().getNameDefinitionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6373:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6374:1: RULE_ID
            {
             before(grammarAccess.getDefCompletionAccess().getNameDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefCompletion__NameAssignment_212751); 
             after(grammarAccess.getDefCompletionAccess().getNameDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDefCompletionAccess().getNameDefinitionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__NameAssignment_2


    // $ANTLR start rule__DefNonInertia__NamesAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6385:1: rule__DefNonInertia__NamesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefNonInertia__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6389:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6390:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6390:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6391:1: ( RULE_ID )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6392:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6393:1: RULE_ID
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefNonInertia__NamesAssignment_112790); 
             after(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__NamesAssignment_1


    // $ANTLR start rule__DefNonInertia__NamesAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6404:1: rule__DefNonInertia__NamesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefNonInertia__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6408:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6409:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6409:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6410:1: ( RULE_ID )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6411:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6412:1: RULE_ID
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefNonInertia__NamesAssignment_2_112829); 
             after(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__NamesAssignment_2_1


    // $ANTLR start rule__DefXor__NamesAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6423:1: rule__DefXor__NamesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefXor__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6427:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6428:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6428:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6429:1: ( RULE_ID )
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6430:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6431:1: RULE_ID
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefXor__NamesAssignment_112868); 
             after(grammarAccess.getDefXorAccess().getNamesDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__NamesAssignment_1


    // $ANTLR start rule__DefXor__NamesAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6442:1: rule__DefXor__NamesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefXor__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6446:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6447:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6447:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6448:1: ( RULE_ID )
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6449:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6450:1: RULE_ID
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefXor__NamesAssignment_2_112907); 
             after(grammarAccess.getDefXorAccess().getNamesDefinitionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__NamesAssignment_2_1


    // $ANTLR start rule__DefMutex__NamesAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6461:1: rule__DefMutex__NamesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefMutex__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6465:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6466:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6466:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6467:1: ( RULE_ID )
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6468:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6469:1: RULE_ID
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefMutex__NamesAssignment_112946); 
             after(grammarAccess.getDefMutexAccess().getNamesDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__NamesAssignment_1


    // $ANTLR start rule__DefMutex__NamesAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6480:1: rule__DefMutex__NamesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefMutex__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6484:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6485:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6485:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6486:1: ( RULE_ID )
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6487:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6488:1: RULE_ID
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefMutex__NamesAssignment_2_112985); 
             after(grammarAccess.getDefMutexAccess().getNamesDefinitionIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__NamesAssignment_2_1


    // $ANTLR start rule__SortDefinition__SortAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6499:1: rule__SortDefinition__SortAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SortDefinition__SortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6503:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6504:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6504:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6505:1: ( RULE_ID )
            {
             before(grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6506:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6507:1: RULE_ID
            {
             before(grammarAccess.getSortDefinitionAccess().getSortDefSortIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SortDefinition__SortAssignment_013024); 
             after(grammarAccess.getSortDefinitionAccess().getSortDefSortIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__SortAssignment_0


    // $ANTLR start rule__SortDefinition__DefinitionsAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6518:1: rule__SortDefinition__DefinitionsAssignment_1 : ( ruleDefinition ) ;
    public final void rule__SortDefinition__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6522:1: ( ( ruleDefinition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6523:1: ( ruleDefinition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6523:1: ( ruleDefinition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6524:1: ruleDefinition
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_113059);
            ruleDefinition();
            _fsp--;

             after(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__DefinitionsAssignment_1


    // $ANTLR start rule__SortDefinition__DefinitionsAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6533:1: rule__SortDefinition__DefinitionsAssignment_2_1 : ( ruleDefinition ) ;
    public final void rule__SortDefinition__DefinitionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6537:1: ( ( ruleDefinition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6538:1: ( ruleDefinition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6538:1: ( ruleDefinition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6539:1: ruleDefinition
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_2_113090);
            ruleDefinition();
            _fsp--;

             after(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SortDefinition__DefinitionsAssignment_2_1


    // $ANTLR start rule__Definition__NameAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6548:1: rule__Definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6552:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6553:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6553:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6554:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_013121); 
             after(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__NameAssignment_0


    // $ANTLR start rule__Definition__ArgsAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6563:1: rule__Definition__ArgsAssignment_1_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6567:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6568:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6568:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6569:1: ruleDeclaredParameter
            {
             before(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_1_113152);
            ruleDeclaredParameter();
            _fsp--;

             after(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__ArgsAssignment_1_1


    // $ANTLR start rule__Definition__ArgsAssignment_1_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6578:1: rule__Definition__ArgsAssignment_1_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6582:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6583:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6583:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6584:1: ruleDeclaredParameter
            {
             before(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_1_2_113183);
            ruleDeclaredParameter();
            _fsp--;

             after(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__ArgsAssignment_1_2_1


    // $ANTLR start rule__Definition__ReturnAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6593:1: rule__Definition__ReturnAssignment_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ReturnAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6597:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6598:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6598:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6599:1: ruleDeclaredParameter
            {
             before(grammarAccess.getDefinitionAccess().getReturnDeclaredParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Definition__ReturnAssignment_2_113214);
            ruleDeclaredParameter();
            _fsp--;

             after(grammarAccess.getDefinitionAccess().getReturnDeclaredParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Definition__ReturnAssignment_2_1


    // $ANTLR start rule__DeclaredParameter__NameAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6608:1: rule__DeclaredParameter__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6612:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6613:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6613:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6614:1: ( RULE_ID )
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameDefSortCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6615:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6616:1: RULE_ID
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameDefSortIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeclaredParameter__NameAssignment_013249); 
             after(grammarAccess.getDeclaredParameterAccess().getNameDefSortIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getDeclaredParameterAccess().getNameDefSortCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DeclaredParameter__NameAssignment_0


    // $ANTLR start rule__DeclaredParameter__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6627:1: rule__DeclaredParameter__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6631:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6632:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6632:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6633:1: ( RULE_ID )
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameDefinitionCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6634:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6635:1: RULE_ID
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeclaredParameter__NameAssignment_113288); 
             after(grammarAccess.getDeclaredParameterAccess().getNameDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDeclaredParameterAccess().getNameDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DeclaredParameter__NameAssignment_1


    // $ANTLR start rule__Expression__LabelAssignment_0_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6646:1: rule__Expression__LabelAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Expression__LabelAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6650:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6651:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6651:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6652:1: RULE_ID
            {
             before(grammarAccess.getExpressionAccess().getLabelIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Expression__LabelAssignment_0_013323); 
             after(grammarAccess.getExpressionAccess().getLabelIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__LabelAssignment_0_0


    // $ANTLR start rule__Expression__QualifiersAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6661:1: rule__Expression__QualifiersAssignment_1 : ( ruleQualifier ) ;
    public final void rule__Expression__QualifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6665:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6666:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6666:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6667:1: ruleQualifier
            {
             before(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__Expression__QualifiersAssignment_113354);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__QualifiersAssignment_1


    // $ANTLR start rule__Expression__ExprAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6676:1: rule__Expression__ExprAssignment_2 : ( ruleAssignmentOp ) ;
    public final void rule__Expression__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6680:1: ( ( ruleAssignmentOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6681:1: ( ruleAssignmentOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6681:1: ( ruleAssignmentOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6682:1: ruleAssignmentOp
            {
             before(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_rule__Expression__ExprAssignment_213385);
            ruleAssignmentOp();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__ExprAssignment_2


    // $ANTLR start rule__Exists__NamesAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6691:1: rule__Exists__NamesAssignment_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Exists__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6695:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6696:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6696:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6697:1: ruleDeclaredParameter
            {
             before(grammarAccess.getExistsAccess().getNamesDeclaredParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Exists__NamesAssignment_113416);
            ruleDeclaredParameter();
            _fsp--;

             after(grammarAccess.getExistsAccess().getNamesDeclaredParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__NamesAssignment_1


    // $ANTLR start rule__Exists__NamesAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6706:1: rule__Exists__NamesAssignment_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Exists__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6710:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6711:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6711:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6712:1: ruleDeclaredParameter
            {
             before(grammarAccess.getExistsAccess().getNamesDeclaredParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Exists__NamesAssignment_2_113447);
            ruleDeclaredParameter();
            _fsp--;

             after(grammarAccess.getExistsAccess().getNamesDeclaredParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__NamesAssignment_2_1


    // $ANTLR start rule__Forall__NamesAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6721:1: rule__Forall__NamesAssignment_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Forall__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6725:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6726:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6726:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6727:1: ruleDeclaredParameter
            {
             before(grammarAccess.getForallAccess().getNamesDeclaredParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Forall__NamesAssignment_113478);
            ruleDeclaredParameter();
            _fsp--;

             after(grammarAccess.getForallAccess().getNamesDeclaredParameterParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__NamesAssignment_1


    // $ANTLR start rule__Forall__NamesAssignment_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6736:1: rule__Forall__NamesAssignment_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Forall__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6740:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6741:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6741:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6742:1: ruleDeclaredParameter
            {
             before(grammarAccess.getForallAccess().getNamesDeclaredParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Forall__NamesAssignment_2_113509);
            ruleDeclaredParameter();
            _fsp--;

             after(grammarAccess.getForallAccess().getNamesDeclaredParameterParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__NamesAssignment_2_1


    // $ANTLR start rule__AssignmentOp__QualifiersAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6751:1: rule__AssignmentOp__QualifiersAssignment_1_1 : ( ruleQualifier ) ;
    public final void rule__AssignmentOp__QualifiersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6755:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6756:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6756:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6757:1: ruleQualifier
            {
             before(grammarAccess.getAssignmentOpAccess().getQualifiersQualifierParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__AssignmentOp__QualifiersAssignment_1_113540);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getAssignmentOpAccess().getQualifiersQualifierParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__QualifiersAssignment_1_1


    // $ANTLR start rule__AssignmentOp__RightAssignment_1_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6766:1: rule__AssignmentOp__RightAssignment_1_2 : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6770:1: ( ( ruleOrExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6771:1: ( ruleOrExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6771:1: ( ruleOrExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6772:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOrExp_in_rule__AssignmentOp__RightAssignment_1_213571);
            ruleOrExp();
            _fsp--;

             after(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__RightAssignment_1_2


    // $ANTLR start rule__OrExp__QualifiersAssignment_1_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6781:1: rule__OrExp__QualifiersAssignment_1_2 : ( ruleQualifier ) ;
    public final void rule__OrExp__QualifiersAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6785:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6786:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6786:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6787:1: ruleQualifier
            {
             before(grammarAccess.getOrExpAccess().getQualifiersQualifierParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__OrExp__QualifiersAssignment_1_213602);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getOrExpAccess().getQualifiersQualifierParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__QualifiersAssignment_1_2


    // $ANTLR start rule__OrExp__RightAssignment_1_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6796:1: rule__OrExp__RightAssignment_1_3 : ( ruleAndExp ) ;
    public final void rule__OrExp__RightAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6800:1: ( ( ruleAndExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6801:1: ( ruleAndExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6801:1: ( ruleAndExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6802:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__RightAssignment_1_313633);
            ruleAndExp();
            _fsp--;

             after(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__RightAssignment_1_3


    // $ANTLR start rule__AndExp__QualifiersAssignment_1_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6811:1: rule__AndExp__QualifiersAssignment_1_2 : ( ruleQualifier ) ;
    public final void rule__AndExp__QualifiersAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6815:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6816:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6816:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6817:1: ruleQualifier
            {
             before(grammarAccess.getAndExpAccess().getQualifiersQualifierParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__AndExp__QualifiersAssignment_1_213664);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getAndExpAccess().getQualifiersQualifierParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__QualifiersAssignment_1_2


    // $ANTLR start rule__AndExp__RightAssignment_1_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6826:1: rule__AndExp__RightAssignment_1_3 : ( ruleRelational ) ;
    public final void rule__AndExp__RightAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6830:1: ( ( ruleRelational ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6831:1: ( ruleRelational )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6831:1: ( ruleRelational )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6832:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleRelational_in_rule__AndExp__RightAssignment_1_313695);
            ruleRelational();
            _fsp--;

             after(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__RightAssignment_1_3


    // $ANTLR start rule__Relational__RightAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6841:1: rule__Relational__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__Relational__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6845:1: ( ( ruleAddition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6846:1: ( ruleAddition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6846:1: ( ruleAddition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6847:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relational__RightAssignment_1_113726);
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


    // $ANTLR start rule__Addition__RightAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6856:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6860:1: ( ( ruleMultiplication ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6861:1: ( ruleMultiplication )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6861:1: ( ruleMultiplication )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6862:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_113757);
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


    // $ANTLR start rule__Multiplication__RightAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6871:1: rule__Multiplication__RightAssignment_1_1 : ( rulePower ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6875:1: ( ( rulePower ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6876:1: ( rulePower )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6876:1: ( rulePower )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6877:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_113788);
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


    // $ANTLR start rule__Power__RightAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6886:1: rule__Power__RightAssignment_1_1 : ( ruleUnaryExpr ) ;
    public final void rule__Power__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6890:1: ( ( ruleUnaryExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6891:1: ( ruleUnaryExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6891:1: ( ruleUnaryExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6892:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__Power__RightAssignment_1_113819);
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


    // $ANTLR start rule__UnaryExpr__OpAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6901:1: rule__UnaryExpr__OpAssignment_0 : ( ruleUnarOp ) ;
    public final void rule__UnaryExpr__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6905:1: ( ( ruleUnarOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6906:1: ( ruleUnarOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6906:1: ( ruleUnarOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6907:1: ruleUnarOp
            {
             before(grammarAccess.getUnaryExprAccess().getOpUnarOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnarOp_in_rule__UnaryExpr__OpAssignment_013850);
            ruleUnarOp();
            _fsp--;

             after(grammarAccess.getUnaryExprAccess().getOpUnarOpEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__OpAssignment_0


    // $ANTLR start rule__UnaryExpr__QualifiersAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6916:1: rule__UnaryExpr__QualifiersAssignment_1 : ( ruleQualifier ) ;
    public final void rule__UnaryExpr__QualifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6920:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6921:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6921:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6922:1: ruleQualifier
            {
             before(grammarAccess.getUnaryExprAccess().getQualifiersQualifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__UnaryExpr__QualifiersAssignment_113881);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getUnaryExprAccess().getQualifiersQualifierParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__QualifiersAssignment_1


    // $ANTLR start rule__UnaryExpr__RightAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6931:1: rule__UnaryExpr__RightAssignment_2 : ( rulePrePrimaryExpr ) ;
    public final void rule__UnaryExpr__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6935:1: ( ( rulePrePrimaryExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6936:1: ( rulePrePrimaryExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6936:1: ( rulePrePrimaryExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6937:1: rulePrePrimaryExpr
            {
             before(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_rule__UnaryExpr__RightAssignment_213912);
            rulePrePrimaryExpr();
            _fsp--;

             after(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__UnaryExpr__RightAssignment_2


    // $ANTLR start rule__AbstractRef__ArgsAssignment_1_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6946:1: rule__AbstractRef__ArgsAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__AbstractRef__ArgsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6950:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6951:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6951:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6952:1: ruleExpression
            {
             before(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_113943);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__ArgsAssignment_1_1_1


    // $ANTLR start rule__AbstractRef__ArgsAssignment_1_1_2_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6961:1: rule__AbstractRef__ArgsAssignment_1_1_2_1 : ( ruleExpression ) ;
    public final void rule__AbstractRef__ArgsAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6965:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6966:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6966:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6967:1: ruleExpression
            {
             before(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_2_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_2_113974);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__ArgsAssignment_1_1_2_1


    // $ANTLR start rule__TerminalExpression__ValueAssignment_0_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6976:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6980:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6981:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6981:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6982:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_0_114005); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6991:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6995:1: ( ( RULE_STRING ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6996:1: ( RULE_STRING )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6996:1: ( RULE_STRING )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6997:1: RULE_STRING
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_1_114036); 
             after(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7006:1: rule__TerminalExpression__ValueAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7010:1: ( ( RULE_BOOLEAN ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7011:1: ( RULE_BOOLEAN )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7011:1: ( RULE_BOOLEAN )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7012:1: RULE_BOOLEAN
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__TerminalExpression__ValueAssignment_2_114067); 
             after(grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 

            }


            }

        }
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


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA33 dfa33 = new DFA33(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA27_eotS =
        "\14\uffff";
    static final String DFA27_eofS =
        "\14\uffff";
    static final String DFA27_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA27_maxS =
        "\1\35\1\uffff\2\5\1\34\1\36\1\5\1\uffff\1\5\1\uffff\1\34\1\36";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA27_specialS =
        "\14\uffff}>";
    static final String[] DFA27_transitionS = {
            "\4\1\4\uffff\1\1\14\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11"
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 3036:1: ( rule__Expression__QualifiersAssignment_1 )*";
        }
    }
    static final String DFA31_eotS =
        "\14\uffff";
    static final String DFA31_eofS =
        "\14\uffff";
    static final String DFA31_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA31_maxS =
        "\1\35\1\uffff\2\5\1\34\1\36\1\5\1\uffff\1\5\1\uffff\1\34\1\36";
    static final String DFA31_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA31_specialS =
        "\14\uffff}>";
    static final String[] DFA31_transitionS = {
            "\4\1\4\uffff\1\1\14\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11"
    };

    static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
    static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
    static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
    static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
    static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
    static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
    static final short[][] DFA31_transition;

    static {
        int numStates = DFA31_transitionS.length;
        DFA31_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
        }
    }

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = DFA31_eot;
            this.eof = DFA31_eof;
            this.min = DFA31_min;
            this.max = DFA31_max;
            this.accept = DFA31_accept;
            this.special = DFA31_special;
            this.transition = DFA31_transition;
        }
        public String getDescription() {
            return "()* loopback of 3632:1: ( rule__AssignmentOp__QualifiersAssignment_1_1 )*";
        }
    }
    static final String DFA33_eotS =
        "\14\uffff";
    static final String DFA33_eofS =
        "\14\uffff";
    static final String DFA33_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA33_maxS =
        "\1\35\1\uffff\2\5\1\34\1\36\1\5\1\uffff\1\5\1\uffff\1\34\1\36";
    static final String DFA33_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA33_specialS =
        "\14\uffff}>";
    static final String[] DFA33_transitionS = {
            "\4\1\4\uffff\1\1\14\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11"
    };

    static final short[] DFA33_eot = DFA.unpackEncodedString(DFA33_eotS);
    static final short[] DFA33_eof = DFA.unpackEncodedString(DFA33_eofS);
    static final char[] DFA33_min = DFA.unpackEncodedStringToUnsignedChars(DFA33_minS);
    static final char[] DFA33_max = DFA.unpackEncodedStringToUnsignedChars(DFA33_maxS);
    static final short[] DFA33_accept = DFA.unpackEncodedString(DFA33_acceptS);
    static final short[] DFA33_special = DFA.unpackEncodedString(DFA33_specialS);
    static final short[][] DFA33_transition;

    static {
        int numStates = DFA33_transitionS.length;
        DFA33_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA33_transition[i] = DFA.unpackEncodedString(DFA33_transitionS[i]);
        }
    }

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = DFA33_eot;
            this.eof = DFA33_eof;
            this.min = DFA33_min;
            this.max = DFA33_max;
            this.accept = DFA33_accept;
            this.special = DFA33_special;
            this.transition = DFA33_transition;
        }
        public String getDescription() {
            return "()* loopback of 3948:1: ( rule__OrExp__QualifiersAssignment_1_2 )*";
        }
    }
    static final String DFA35_eotS =
        "\14\uffff";
    static final String DFA35_eofS =
        "\14\uffff";
    static final String DFA35_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA35_maxS =
        "\1\35\1\uffff\2\5\1\34\1\36\1\5\1\uffff\1\5\1\uffff\1\34\1\36";
    static final String DFA35_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA35_specialS =
        "\14\uffff}>";
    static final String[] DFA35_transitionS = {
            "\4\1\4\uffff\1\1\14\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\6\uffff\1\7",
            "\1\10\10\uffff\1\11"
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "()* loopback of 4136:1: ( rule__AndExp__QualifiersAssignment_1_2 )*";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefSort_in_entryRuleDefSort241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefSort248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__0_in_ruleDefSort274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRange_in_entryRuleDefRange301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRange308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__0_in_ruleDefRange334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefOption_in_entryRuleDefOption361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefOption368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Alternatives_in_ruleDefOption394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefCompletion428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__0_in_ruleDefCompletion454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefNonInertia488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__0_in_ruleDefNonInertia514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefXor_in_entryRuleDefXor541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefXor548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__0_in_ruleDefXor574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefMutex_in_entryRuleDefMutex601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefMutex608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__0_in_ruleDefMutex634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSortDefinition728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__0_in_ruleSortDefinition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameter848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredParameter__Alternatives_in_ruleDeclaredParameter874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_entryRuleQualifier961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifier968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Qualifier__Alternatives_in_ruleQualifier994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_entryRuleExists1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExists1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__0_in_ruleExists1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_entryRuleForall1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForall1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__0_in_ruleForall1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentOp1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__0_in_ruleAssignmentOp1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0_in_ruleOrExp1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0_in_ruleAndExp1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_entryRuleRelational1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelational1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__0_in_ruleRelational1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0_in_rulePower1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__0_in_ruleUnaryExpr1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrePrimaryExpr1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Alternatives_in_rulePrePrimaryExpr1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef1681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractRef1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__0_in_ruleAbstractRef1714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1741 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression1748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleUnarOp1814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_1_0_in_rule__Model__Alternatives_11851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatementsAssignment_1_1_in_rule__Model__Alternatives_11869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefSort_in_rule__Declaration__Alternatives1902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRange_in_rule__Declaration__Alternatives1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefOption_in_rule__Declaration__Alternatives1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_rule__Declaration__Alternatives1953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_rule__Declaration__Alternatives1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefXor_in_rule__Declaration__Alternatives1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefMutex_in_rule__Declaration__Alternatives2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_0__0_in_rule__DefOption__Alternatives2036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1__0_in_rule__DefOption__Alternatives2054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_rule__Statement__Alternatives2087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives2104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredParameter__NameAssignment_0_in_rule__DeclaredParameter__Alternatives2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredParameter__NameAssignment_1_in_rule__DeclaredParameter__Alternatives2155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_rule__Qualifier__Alternatives2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_rule__Qualifier__Alternatives2205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__0_in_rule__AssignmentOp__Alternatives_1_02237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__0_in_rule__AssignmentOp__Alternatives_1_02255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__0_in_rule__Relational__Alternatives_1_02288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__0_in_rule__Relational__Alternatives_1_02306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__0_in_rule__Relational__Alternatives_1_02324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__0_in_rule__Relational__Alternatives_1_02342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__0_in_rule__Relational__Alternatives_1_02360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__0_in_rule__Relational__Alternatives_1_02378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__0_in_rule__Relational__Alternatives_1_02396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__PrePrimaryExpr__Alternatives2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_rule__PrePrimaryExpr__Alternatives2548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__0_in_rule__PrePrimaryExpr__Alternatives2565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives2598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives2634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02665 = new BitSet(new long[]{0x000080002AD750F2L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2695 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_1_in_rule__Model__Group__1__Impl2753 = new BitSet(new long[]{0x000080002AD750F2L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Import__Group__0__Impl2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__0__Impl_in_rule__DefSort__Group__02911 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DefSort__Group__1_in_rule__DefSort__Group__02914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__ReifiedAssignment_0_in_rule__DefSort__Group__0__Impl2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__1__Impl_in_rule__DefSort__Group__12972 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefSort__Group__2_in_rule__DefSort__Group__12975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DefSort__Group__1__Impl3003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__2__Impl_in_rule__DefSort__Group__23034 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__3_in_rule__DefSort__Group__23037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__NameAssignment_2_in_rule__DefSort__Group__2__Impl3064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__3__Impl_in_rule__DefSort__Group__33094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group_3__0_in_rule__DefSort__Group__3__Impl3121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group_3__0__Impl_in_rule__DefSort__Group_3__03160 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefSort__Group_3__1_in_rule__DefSort__Group_3__03163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DefSort__Group_3__0__Impl3191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group_3__1__Impl_in_rule__DefSort__Group_3__13222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__TypeAssignment_3_1_in_rule__DefSort__Group_3__1__Impl3249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__0__Impl_in_rule__DefRange__Group__03283 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefRange__Group__1_in_rule__DefRange__Group__03286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DefRange__Group__0__Impl3314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__1__Impl_in_rule__DefRange__Group__13345 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefRange__Group__2_in_rule__DefRange__Group__13348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__NameAssignment_1_in_rule__DefRange__Group__1__Impl3375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__2__Impl_in_rule__DefRange__Group__23405 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefRange__Group__3_in_rule__DefRange__Group__23408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__MinAssignment_2_in_rule__DefRange__Group__2__Impl3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__3__Impl_in_rule__DefRange__Group__33465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__MaxAssignment_3_in_rule__DefRange__Group__3__Impl3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_0__0__Impl_in_rule__DefOption__Group_0__03530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefOption__Group_0__1_in_rule__DefOption__Group_0__03533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DefOption__Group_0__0__Impl3561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_0__1__Impl_in_rule__DefOption__Group_0__13592 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefOption__Group_0__2_in_rule__DefOption__Group_0__13595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__NameAssignment_0_1_in_rule__DefOption__Group_0__1__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_0__2__Impl_in_rule__DefOption__Group_0__23652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__ValueAssignment_0_2_in_rule__DefOption__Group_0__2__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1__0__Impl_in_rule__DefOption__Group_1__03715 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1__1_in_rule__DefOption__Group_1__03718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DefOption__Group_1__0__Impl3746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1__1__Impl_in_rule__DefOption__Group_1__13777 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1__2_in_rule__DefOption__Group_1__13780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__NameAssignment_1_1_in_rule__DefOption__Group_1__1__Impl3807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1__2__Impl_in_rule__DefOption__Group_1__23837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Value2Assignment_1_2_in_rule__DefOption__Group_1__2__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__0__Impl_in_rule__DefCompletion__Group__03900 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__1_in_rule__DefCompletion__Group__03903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DefCompletion__Group__0__Impl3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__1__Impl_in_rule__DefCompletion__Group__13962 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__2_in_rule__DefCompletion__Group__13965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DefCompletion__Group__1__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__2__Impl_in_rule__DefCompletion__Group__24027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__NameAssignment_2_in_rule__DefCompletion__Group__2__Impl4054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__0__Impl_in_rule__DefNonInertia__Group__04090 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__1_in_rule__DefNonInertia__Group__04093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DefNonInertia__Group__0__Impl4121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__1__Impl_in_rule__DefNonInertia__Group__14152 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__2_in_rule__DefNonInertia__Group__14155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__NamesAssignment_1_in_rule__DefNonInertia__Group__1__Impl4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__2__Impl_in_rule__DefNonInertia__Group__24212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group_2__0_in_rule__DefNonInertia__Group__2__Impl4239 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group_2__0__Impl_in_rule__DefNonInertia__Group_2__04276 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group_2__1_in_rule__DefNonInertia__Group_2__04279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DefNonInertia__Group_2__0__Impl4307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group_2__1__Impl_in_rule__DefNonInertia__Group_2__14338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__NamesAssignment_2_1_in_rule__DefNonInertia__Group_2__1__Impl4365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__0__Impl_in_rule__DefXor__Group__04399 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefXor__Group__1_in_rule__DefXor__Group__04402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DefXor__Group__0__Impl4430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__1__Impl_in_rule__DefXor__Group__14461 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__2_in_rule__DefXor__Group__14464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__NamesAssignment_1_in_rule__DefXor__Group__1__Impl4491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__2__Impl_in_rule__DefXor__Group__24521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group_2__0_in_rule__DefXor__Group__2__Impl4548 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__DefXor__Group_2__0__Impl_in_rule__DefXor__Group_2__04585 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefXor__Group_2__1_in_rule__DefXor__Group_2__04588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DefXor__Group_2__0__Impl4616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group_2__1__Impl_in_rule__DefXor__Group_2__14647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__NamesAssignment_2_1_in_rule__DefXor__Group_2__1__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__0__Impl_in_rule__DefMutex__Group__04708 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__1_in_rule__DefMutex__Group__04711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DefMutex__Group__0__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__1__Impl_in_rule__DefMutex__Group__14770 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__2_in_rule__DefMutex__Group__14773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__NamesAssignment_1_in_rule__DefMutex__Group__1__Impl4800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__2__Impl_in_rule__DefMutex__Group__24830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group_2__0_in_rule__DefMutex__Group__2__Impl4857 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group_2__0__Impl_in_rule__DefMutex__Group_2__04894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefMutex__Group_2__1_in_rule__DefMutex__Group_2__04897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DefMutex__Group_2__0__Impl4925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group_2__1__Impl_in_rule__DefMutex__Group_2__14956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__NamesAssignment_2_1_in_rule__DefMutex__Group_2__1__Impl4983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__05017 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__05020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Statement__Group_1__0__Impl5047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__15076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Statement__Group_1__1__Impl5104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__0__Impl_in_rule__SortDefinition__Group__05139 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__1_in_rule__SortDefinition__Group__05142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__SortAssignment_0_in_rule__SortDefinition__Group__0__Impl5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__1__Impl_in_rule__SortDefinition__Group__15199 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__2_in_rule__SortDefinition__Group__15202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__DefinitionsAssignment_1_in_rule__SortDefinition__Group__1__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__2__Impl_in_rule__SortDefinition__Group__25259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__0_in_rule__SortDefinition__Group__2__Impl5286 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__0__Impl_in_rule__SortDefinition__Group_2__05323 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__1_in_rule__SortDefinition__Group_2__05326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SortDefinition__Group_2__0__Impl5354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__1__Impl_in_rule__SortDefinition__Group_2__15385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__DefinitionsAssignment_2_1_in_rule__SortDefinition__Group_2__1__Impl5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__05446 = new BitSet(new long[]{0x0000000002008002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__05449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_0_in_rule__Definition__Group__0__Impl5476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__15506 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__15509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__0_in_rule__Definition__Group__1__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__25567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__0_in_rule__Definition__Group__2__Impl5594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__0__Impl_in_rule__Definition__Group_1__05631 = new BitSet(new long[]{0x0000000004200020L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__1_in_rule__Definition__Group_1__05634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Definition__Group_1__0__Impl5662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__1__Impl_in_rule__Definition__Group_1__15693 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__2_in_rule__Definition__Group_1__15696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ArgsAssignment_1_1_in_rule__Definition__Group_1__1__Impl5723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__2__Impl_in_rule__Definition__Group_1__25754 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__3_in_rule__Definition__Group_1__25757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__0_in_rule__Definition__Group_1__2__Impl5784 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__3__Impl_in_rule__Definition__Group_1__35815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Definition__Group_1__3__Impl5843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__0__Impl_in_rule__Definition__Group_1_2__05882 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__1_in_rule__Definition__Group_1_2__05885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Definition__Group_1_2__0__Impl5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__1__Impl_in_rule__Definition__Group_1_2__15944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ArgsAssignment_1_2_1_in_rule__Definition__Group_1_2__1__Impl5971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__0__Impl_in_rule__Definition__Group_2__06005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__1_in_rule__Definition__Group_2__06008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Definition__Group_2__0__Impl6036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__1__Impl_in_rule__Definition__Group_2__16067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ReturnAssignment_2_1_in_rule__Definition__Group_2__1__Impl6094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__06128 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__06131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__0_in_rule__Expression__Group__0__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__16189 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__Expression__Group__2_in_rule__Expression__Group__16192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__QualifiersAssignment_1_in_rule__Expression__Group__1__Impl6219 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__2__Impl_in_rule__Expression__Group__26250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ExprAssignment_2_in_rule__Expression__Group__2__Impl6277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__0__Impl_in_rule__Expression__Group_0__06313 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__1_in_rule__Expression__Group_0__06316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__LabelAssignment_0_0_in_rule__Expression__Group_0__0__Impl6343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_0__1__Impl_in_rule__Expression__Group_0__16373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Expression__Group_0__1__Impl6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__0__Impl_in_rule__Exists__Group__06436 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Exists__Group__1_in_rule__Exists__Group__06439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Exists__Group__0__Impl6467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__1__Impl_in_rule__Exists__Group__16498 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_rule__Exists__Group__2_in_rule__Exists__Group__16501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__NamesAssignment_1_in_rule__Exists__Group__1__Impl6528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__2__Impl_in_rule__Exists__Group__26558 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Exists__Group__3_in_rule__Exists__Group__26561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group_2__0_in_rule__Exists__Group__2__Impl6588 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Exists__Group__3__Impl_in_rule__Exists__Group__36619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Exists__Group__3__Impl6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group_2__0__Impl_in_rule__Exists__Group_2__06686 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Exists__Group_2__1_in_rule__Exists__Group_2__06689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Exists__Group_2__0__Impl6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group_2__1__Impl_in_rule__Exists__Group_2__16748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__NamesAssignment_2_1_in_rule__Exists__Group_2__1__Impl6775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__0__Impl_in_rule__Forall__Group__06809 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Forall__Group__1_in_rule__Forall__Group__06812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Forall__Group__0__Impl6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__1__Impl_in_rule__Forall__Group__16871 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_rule__Forall__Group__2_in_rule__Forall__Group__16874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__NamesAssignment_1_in_rule__Forall__Group__1__Impl6901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__2__Impl_in_rule__Forall__Group__26931 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Forall__Group__3_in_rule__Forall__Group__26934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group_2__0_in_rule__Forall__Group__2__Impl6961 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Forall__Group__3__Impl_in_rule__Forall__Group__36992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Forall__Group__3__Impl7020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group_2__0__Impl_in_rule__Forall__Group_2__07059 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Forall__Group_2__1_in_rule__Forall__Group_2__07062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Forall__Group_2__0__Impl7090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group_2__1__Impl_in_rule__Forall__Group_2__17121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__NamesAssignment_2_1_in_rule__Forall__Group_2__1__Impl7148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__0__Impl_in_rule__AssignmentOp__Group__07182 = new BitSet(new long[]{0x0000000180000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__1_in_rule__AssignmentOp__Group__07185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__AssignmentOp__Group__0__Impl7212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__1__Impl_in_rule__AssignmentOp__Group__17241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__0_in_rule__AssignmentOp__Group__1__Impl7268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__0__Impl_in_rule__AssignmentOp__Group_1__07303 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__1_in_rule__AssignmentOp__Group_1__07306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Alternatives_1_0_in_rule__AssignmentOp__Group_1__0__Impl7333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__1__Impl_in_rule__AssignmentOp__Group_1__17363 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__2_in_rule__AssignmentOp__Group_1__17366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__QualifiersAssignment_1_1_in_rule__AssignmentOp__Group_1__1__Impl7393 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__2__Impl_in_rule__AssignmentOp__Group_1__27424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__RightAssignment_1_2_in_rule__AssignmentOp__Group_1__2__Impl7451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__0__Impl_in_rule__AssignmentOp__Group_1_0_0__07487 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__1_in_rule__AssignmentOp__Group_1_0_0__07490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__1__Impl_in_rule__AssignmentOp__Group_1_0_0__17548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AssignmentOp__Group_1_0_0__1__Impl7576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__0__Impl_in_rule__AssignmentOp__Group_1_0_1__07611 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__1_in_rule__AssignmentOp__Group_1_0_1__07614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__1__Impl_in_rule__AssignmentOp__Group_1_0_1__17672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AssignmentOp__Group_1_0_1__1__Impl7700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__07735 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__07738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__Group__0__Impl7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__17794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl7821 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__07856 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__07859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__17917 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__2_in_rule__OrExp__Group_1__17920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__OrExp__Group_1__1__Impl7948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__2__Impl_in_rule__OrExp__Group_1__27979 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__3_in_rule__OrExp__Group_1__27982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__QualifiersAssignment_1_2_in_rule__OrExp__Group_1__2__Impl8009 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__3__Impl_in_rule__OrExp__Group_1__38040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__RightAssignment_1_3_in_rule__OrExp__Group_1__3__Impl8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__08105 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__08108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_rule__AndExp__Group__0__Impl8135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__18164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl8191 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__08226 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__08229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__18287 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__2_in_rule__AndExp__Group_1__18290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AndExp__Group_1__1__Impl8318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__2__Impl_in_rule__AndExp__Group_1__28349 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__3_in_rule__AndExp__Group_1__28352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__QualifiersAssignment_1_2_in_rule__AndExp__Group_1__2__Impl8379 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__3__Impl_in_rule__AndExp__Group_1__38410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__RightAssignment_1_3_in_rule__AndExp__Group_1__3__Impl8437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__0__Impl_in_rule__Relational__Group__08475 = new BitSet(new long[]{0x000003F800000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__1_in_rule__Relational__Group__08478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relational__Group__0__Impl8505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__1__Impl_in_rule__Relational__Group__18534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__0_in_rule__Relational__Group__1__Impl8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__0__Impl_in_rule__Relational__Group_1__08596 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__1_in_rule__Relational__Group_1__08599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Alternatives_1_0_in_rule__Relational__Group_1__0__Impl8626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__1__Impl_in_rule__Relational__Group_1__18656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__RightAssignment_1_1_in_rule__Relational__Group_1__1__Impl8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__0__Impl_in_rule__Relational__Group_1_0_0__08717 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__1_in_rule__Relational__Group_1_0_0__08720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__1__Impl_in_rule__Relational__Group_1_0_0__18778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Relational__Group_1_0_0__1__Impl8806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__0__Impl_in_rule__Relational__Group_1_0_1__08841 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__1_in_rule__Relational__Group_1_0_1__08844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__1__Impl_in_rule__Relational__Group_1_0_1__18902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Relational__Group_1_0_1__1__Impl8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__0__Impl_in_rule__Relational__Group_1_0_2__08965 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__1_in_rule__Relational__Group_1_0_2__08968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__1__Impl_in_rule__Relational__Group_1_0_2__19026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Relational__Group_1_0_2__1__Impl9054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__0__Impl_in_rule__Relational__Group_1_0_3__09089 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__1_in_rule__Relational__Group_1_0_3__09092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__1__Impl_in_rule__Relational__Group_1_0_3__19150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Relational__Group_1_0_3__1__Impl9178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__0__Impl_in_rule__Relational__Group_1_0_4__09213 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__1_in_rule__Relational__Group_1_0_4__09216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__1__Impl_in_rule__Relational__Group_1_0_4__19274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Relational__Group_1_0_4__1__Impl9302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__0__Impl_in_rule__Relational__Group_1_0_5__09337 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__1_in_rule__Relational__Group_1_0_5__09340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__1__Impl_in_rule__Relational__Group_1_0_5__19398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Relational__Group_1_0_5__1__Impl9426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__0__Impl_in_rule__Relational__Group_1_0_6__09461 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__1_in_rule__Relational__Group_1_0_6__09464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__1__Impl_in_rule__Relational__Group_1_0_6__19522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Relational__Group_1_0_6__1__Impl9550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__09585 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__09588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl9615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__19644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl9671 = new BitSet(new long[]{0x00000C0000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__09706 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__09709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl9736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__19766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl9793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__09827 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__09830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__19888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Addition__Group_1_0_0__1__Impl9916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__09951 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__09954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__110012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Addition__Group_1_0_1__1__Impl10040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__010075 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__010078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl10105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__110134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl10161 = new BitSet(new long[]{0x0000300000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__010196 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__010199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl10226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__110256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl10283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__010317 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__010320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__110378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Multiplication__Group_1_0_0__1__Impl10406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__010441 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__010444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__110502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Multiplication__Group_1_0_1__1__Impl10530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__010565 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1_in_rule__Power__Group__010568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__Power__Group__0__Impl10595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__110624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl10651 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__010686 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__010689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl10716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__110746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl10773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__010807 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__010810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__110868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Power__Group_1_0__1__Impl10896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__0__Impl_in_rule__UnaryExpr__Group__010931 = new BitSet(new long[]{0x000000002A0000F0L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__1_in_rule__UnaryExpr__Group__010934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__OpAssignment_0_in_rule__UnaryExpr__Group__0__Impl10961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__1__Impl_in_rule__UnaryExpr__Group__110992 = new BitSet(new long[]{0x00000000020000F0L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__2_in_rule__UnaryExpr__Group__110995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__QualifiersAssignment_1_in_rule__UnaryExpr__Group__1__Impl11022 = new BitSet(new long[]{0x0000000028000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__2__Impl_in_rule__UnaryExpr__Group__211053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__RightAssignment_2_in_rule__UnaryExpr__Group__2__Impl11080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__0__Impl_in_rule__PrePrimaryExpr__Group_2__011116 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__1_in_rule__PrePrimaryExpr__Group_2__011119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__PrePrimaryExpr__Group_2__0__Impl11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__1__Impl_in_rule__PrePrimaryExpr__Group_2__111178 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__2_in_rule__PrePrimaryExpr__Group_2__111181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrePrimaryExpr__Group_2__1__Impl11208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__2__Impl_in_rule__PrePrimaryExpr__Group_2__211237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PrePrimaryExpr__Group_2__2__Impl11265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__0__Impl_in_rule__AbstractRef__Group__011302 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__1_in_rule__AbstractRef__Group__011305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__AbstractRef__Group__0__Impl11332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__1__Impl_in_rule__AbstractRef__Group__111361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__0_in_rule__AbstractRef__Group__1__Impl11388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__0__Impl_in_rule__AbstractRef__Group_1__011423 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__1_in_rule__AbstractRef__Group_1__011426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__1__Impl_in_rule__AbstractRef__Group_1__111484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__0_in_rule__AbstractRef__Group_1__1__Impl11511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__0__Impl_in_rule__AbstractRef__Group_1_1__011545 = new BitSet(new long[]{0x000000002E2010F0L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__1_in_rule__AbstractRef__Group_1_1__011548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AbstractRef__Group_1_1__0__Impl11576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__1__Impl_in_rule__AbstractRef__Group_1_1__111607 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__2_in_rule__AbstractRef__Group_1_1__111610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_1_in_rule__AbstractRef__Group_1_1__1__Impl11637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__2__Impl_in_rule__AbstractRef__Group_1_1__211668 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__3_in_rule__AbstractRef__Group_1_1__211671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__0_in_rule__AbstractRef__Group_1_1__2__Impl11698 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__3__Impl_in_rule__AbstractRef__Group_1_1__311729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AbstractRef__Group_1_1__3__Impl11757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__0__Impl_in_rule__AbstractRef__Group_1_1_2__011796 = new BitSet(new long[]{0x000000002A0010F0L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__1_in_rule__AbstractRef__Group_1_1_2__011799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AbstractRef__Group_1_1_2__0__Impl11827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__1__Impl_in_rule__AbstractRef__Group_1_1_2__111858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_2_1_in_rule__AbstractRef__Group_1_1_2__1__Impl11885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__011919 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__011922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__111980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_0_1_in_rule__TerminalExpression__Group_0__1__Impl12007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__012041 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__012044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__112102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl12129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__012163 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__012166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__112224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl12251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_012292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_1_012323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_1_112354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_112385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__DefSort__ReifiedAssignment_012421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefSort__NameAssignment_212460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefSort__TypeAssignment_3_112491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefRange__NameAssignment_112526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DefRange__MinAssignment_212561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DefRange__MaxAssignment_312592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefOption__NameAssignment_0_112623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DefOption__ValueAssignment_0_212654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefOption__NameAssignment_1_112685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefOption__Value2Assignment_1_212716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefCompletion__NameAssignment_212751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefNonInertia__NamesAssignment_112790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefNonInertia__NamesAssignment_2_112829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefXor__NamesAssignment_112868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefXor__NamesAssignment_2_112907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefMutex__NamesAssignment_112946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefMutex__NamesAssignment_2_112985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SortDefinition__SortAssignment_013024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_113059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_2_113090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_013121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_1_113152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_1_2_113183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Definition__ReturnAssignment_2_113214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeclaredParameter__NameAssignment_013249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeclaredParameter__NameAssignment_113288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Expression__LabelAssignment_0_013323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__Expression__QualifiersAssignment_113354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_rule__Expression__ExprAssignment_213385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Exists__NamesAssignment_113416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Exists__NamesAssignment_2_113447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Forall__NamesAssignment_113478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Forall__NamesAssignment_2_113509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__AssignmentOp__QualifiersAssignment_1_113540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__AssignmentOp__RightAssignment_1_213571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__OrExp__QualifiersAssignment_1_213602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__RightAssignment_1_313633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__AndExp__QualifiersAssignment_1_213664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_rule__AndExp__RightAssignment_1_313695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relational__RightAssignment_1_113726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_113757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_113788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__Power__RightAssignment_1_113819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnarOp_in_rule__UnaryExpr__OpAssignment_013850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__UnaryExpr__QualifiersAssignment_113881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_rule__UnaryExpr__RightAssignment_213912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_113943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_2_113974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_0_114005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_1_114036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__TerminalExpression__ValueAssignment_2_114067 = new BitSet(new long[]{0x0000000000000002L});

}