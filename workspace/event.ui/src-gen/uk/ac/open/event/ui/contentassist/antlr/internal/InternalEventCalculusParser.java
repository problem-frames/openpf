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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'load'", "'sort'", "':'", "'range'", "'option'", "'completion'", "'noninertial'", "'.'", "','", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", "'<->'", "'|'", "'&'", "'!='", "'=='", "'>='", "'<='", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'^'", "'reified'"
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:210:1: ruleDefOption : ( ( rule__DefOption__Group__0 ) ) ;
    public final void ruleDefOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:214:2: ( ( ( rule__DefOption__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:215:1: ( ( rule__DefOption__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:215:1: ( ( rule__DefOption__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:216:1: ( rule__DefOption__Group__0 )
            {
             before(grammarAccess.getDefOptionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:217:1: ( rule__DefOption__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:217:2: rule__DefOption__Group__0
            {
            pushFollow(FOLLOW_rule__DefOption__Group__0_in_ruleDefOption394);
            rule__DefOption__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start entryRuleStatement
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:285:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:286:1: ( ruleStatement EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:287:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement541);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement548); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:294:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:298:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:299:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:299:1: ( ( rule__Statement__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:300:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:301:1: ( rule__Statement__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:301:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement574);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:313:1: entryRuleSortDefinition : ruleSortDefinition EOF ;
    public final void entryRuleSortDefinition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:314:1: ( ruleSortDefinition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:315:1: ruleSortDefinition EOF
            {
             before(grammarAccess.getSortDefinitionRule()); 
            pushFollow(FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition601);
            ruleSortDefinition();
            _fsp--;

             after(grammarAccess.getSortDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSortDefinition608); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:322:1: ruleSortDefinition : ( ( rule__SortDefinition__Group__0 ) ) ;
    public final void ruleSortDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:326:2: ( ( ( rule__SortDefinition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:327:1: ( ( rule__SortDefinition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:327:1: ( ( rule__SortDefinition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:328:1: ( rule__SortDefinition__Group__0 )
            {
             before(grammarAccess.getSortDefinitionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:329:1: ( rule__SortDefinition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:329:2: rule__SortDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__0_in_ruleSortDefinition634);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:341:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:342:1: ( ruleDefinition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:343:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition661);
            ruleDefinition();
            _fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition668); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:350:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:354:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:355:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:355:1: ( ( rule__Definition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:356:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:357:1: ( rule__Definition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:357:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition694);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:369:1: entryRuleDeclaredParameter : ruleDeclaredParameter EOF ;
    public final void entryRuleDeclaredParameter() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:370:1: ( ruleDeclaredParameter EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:371:1: ruleDeclaredParameter EOF
            {
             before(grammarAccess.getDeclaredParameterRule()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter721);
            ruleDeclaredParameter();
            _fsp--;

             after(grammarAccess.getDeclaredParameterRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaredParameter728); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:378:1: ruleDeclaredParameter : ( ( rule__DeclaredParameter__Alternatives ) ) ;
    public final void ruleDeclaredParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:382:2: ( ( ( rule__DeclaredParameter__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:383:1: ( ( rule__DeclaredParameter__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:383:1: ( ( rule__DeclaredParameter__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:384:1: ( rule__DeclaredParameter__Alternatives )
            {
             before(grammarAccess.getDeclaredParameterAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:385:1: ( rule__DeclaredParameter__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:385:2: rule__DeclaredParameter__Alternatives
            {
            pushFollow(FOLLOW_rule__DeclaredParameter__Alternatives_in_ruleDeclaredParameter754);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:397:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:398:1: ( ruleExpression EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:399:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression781);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression788); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:406:1: ruleExpression : ( ( rule__Expression__Group__0 ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:410:2: ( ( ( rule__Expression__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:411:1: ( ( rule__Expression__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:411:1: ( ( rule__Expression__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:412:1: ( rule__Expression__Group__0 )
            {
             before(grammarAccess.getExpressionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:413:1: ( rule__Expression__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:413:2: rule__Expression__Group__0
            {
            pushFollow(FOLLOW_rule__Expression__Group__0_in_ruleExpression814);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:425:1: entryRuleQualifier : ruleQualifier EOF ;
    public final void entryRuleQualifier() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:426:1: ( ruleQualifier EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:427:1: ruleQualifier EOF
            {
             before(grammarAccess.getQualifierRule()); 
            pushFollow(FOLLOW_ruleQualifier_in_entryRuleQualifier841);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getQualifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifier848); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:434:1: ruleQualifier : ( ( rule__Qualifier__Alternatives ) ) ;
    public final void ruleQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:438:2: ( ( ( rule__Qualifier__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:439:1: ( ( rule__Qualifier__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:439:1: ( ( rule__Qualifier__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:440:1: ( rule__Qualifier__Alternatives )
            {
             before(grammarAccess.getQualifierAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:441:1: ( rule__Qualifier__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:441:2: rule__Qualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Qualifier__Alternatives_in_ruleQualifier874);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:453:1: entryRuleExists : ruleExists EOF ;
    public final void entryRuleExists() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:454:1: ( ruleExists EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:455:1: ruleExists EOF
            {
             before(grammarAccess.getExistsRule()); 
            pushFollow(FOLLOW_ruleExists_in_entryRuleExists901);
            ruleExists();
            _fsp--;

             after(grammarAccess.getExistsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExists908); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:462:1: ruleExists : ( ( rule__Exists__Group__0 ) ) ;
    public final void ruleExists() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:466:2: ( ( ( rule__Exists__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:467:1: ( ( rule__Exists__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:467:1: ( ( rule__Exists__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:468:1: ( rule__Exists__Group__0 )
            {
             before(grammarAccess.getExistsAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:469:1: ( rule__Exists__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:469:2: rule__Exists__Group__0
            {
            pushFollow(FOLLOW_rule__Exists__Group__0_in_ruleExists934);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:481:1: entryRuleForall : ruleForall EOF ;
    public final void entryRuleForall() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:482:1: ( ruleForall EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:483:1: ruleForall EOF
            {
             before(grammarAccess.getForallRule()); 
            pushFollow(FOLLOW_ruleForall_in_entryRuleForall961);
            ruleForall();
            _fsp--;

             after(grammarAccess.getForallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForall968); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:490:1: ruleForall : ( ( rule__Forall__Group__0 ) ) ;
    public final void ruleForall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:494:2: ( ( ( rule__Forall__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:495:1: ( ( rule__Forall__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:495:1: ( ( rule__Forall__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:496:1: ( rule__Forall__Group__0 )
            {
             before(grammarAccess.getForallAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:497:1: ( rule__Forall__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:497:2: rule__Forall__Group__0
            {
            pushFollow(FOLLOW_rule__Forall__Group__0_in_ruleForall994);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:509:1: entryRuleAssignmentOp : ruleAssignmentOp EOF ;
    public final void entryRuleAssignmentOp() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:510:1: ( ruleAssignmentOp EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:511:1: ruleAssignmentOp EOF
            {
             before(grammarAccess.getAssignmentOpRule()); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp1021);
            ruleAssignmentOp();
            _fsp--;

             after(grammarAccess.getAssignmentOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentOp1028); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:518:1: ruleAssignmentOp : ( ( rule__AssignmentOp__Group__0 ) ) ;
    public final void ruleAssignmentOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:522:2: ( ( ( rule__AssignmentOp__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:523:1: ( ( rule__AssignmentOp__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:523:1: ( ( rule__AssignmentOp__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:524:1: ( rule__AssignmentOp__Group__0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:525:1: ( rule__AssignmentOp__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:525:2: rule__AssignmentOp__Group__0
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__0_in_ruleAssignmentOp1054);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:537:1: entryRuleOrExp : ruleOrExp EOF ;
    public final void entryRuleOrExp() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:538:1: ( ruleOrExp EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:539:1: ruleOrExp EOF
            {
             before(grammarAccess.getOrExpRule()); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp1081);
            ruleOrExp();
            _fsp--;

             after(grammarAccess.getOrExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp1088); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:546:1: ruleOrExp : ( ( rule__OrExp__Group__0 ) ) ;
    public final void ruleOrExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:550:2: ( ( ( rule__OrExp__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:551:1: ( ( rule__OrExp__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:551:1: ( ( rule__OrExp__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:552:1: ( rule__OrExp__Group__0 )
            {
             before(grammarAccess.getOrExpAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:553:1: ( rule__OrExp__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:553:2: rule__OrExp__Group__0
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0_in_ruleOrExp1114);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:565:1: entryRuleAndExp : ruleAndExp EOF ;
    public final void entryRuleAndExp() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:566:1: ( ruleAndExp EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:567:1: ruleAndExp EOF
            {
             before(grammarAccess.getAndExpRule()); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp1141);
            ruleAndExp();
            _fsp--;

             after(grammarAccess.getAndExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp1148); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:574:1: ruleAndExp : ( ( rule__AndExp__Group__0 ) ) ;
    public final void ruleAndExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:578:2: ( ( ( rule__AndExp__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:579:1: ( ( rule__AndExp__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:579:1: ( ( rule__AndExp__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:580:1: ( rule__AndExp__Group__0 )
            {
             before(grammarAccess.getAndExpAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:581:1: ( rule__AndExp__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:581:2: rule__AndExp__Group__0
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0_in_ruleAndExp1174);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:593:1: entryRuleRelational : ruleRelational EOF ;
    public final void entryRuleRelational() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:594:1: ( ruleRelational EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:595:1: ruleRelational EOF
            {
             before(grammarAccess.getRelationalRule()); 
            pushFollow(FOLLOW_ruleRelational_in_entryRuleRelational1201);
            ruleRelational();
            _fsp--;

             after(grammarAccess.getRelationalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelational1208); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:602:1: ruleRelational : ( ( rule__Relational__Group__0 ) ) ;
    public final void ruleRelational() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:606:2: ( ( ( rule__Relational__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:607:1: ( ( rule__Relational__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:607:1: ( ( rule__Relational__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:608:1: ( rule__Relational__Group__0 )
            {
             before(grammarAccess.getRelationalAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:609:1: ( rule__Relational__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:609:2: rule__Relational__Group__0
            {
            pushFollow(FOLLOW_rule__Relational__Group__0_in_ruleRelational1234);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:621:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:622:1: ( ruleAddition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:623:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1261);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1268); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:630:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:634:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:635:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:635:1: ( ( rule__Addition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:636:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:637:1: ( rule__Addition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:637:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1294);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:649:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:650:1: ( ruleMultiplication EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:651:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1321);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1328); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:658:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:662:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:663:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:663:1: ( ( rule__Multiplication__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:664:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:665:1: ( rule__Multiplication__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:665:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1354);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:677:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:678:1: ( rulePower EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:679:1: rulePower EOF
            {
             before(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_rulePower_in_entryRulePower1381);
            rulePower();
            _fsp--;

             after(grammarAccess.getPowerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePower1388); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:686:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:690:2: ( ( ( rule__Power__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:691:1: ( ( rule__Power__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:691:1: ( ( rule__Power__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:692:1: ( rule__Power__Group__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:693:1: ( rule__Power__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:693:2: rule__Power__Group__0
            {
            pushFollow(FOLLOW_rule__Power__Group__0_in_rulePower1414);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:705:1: entryRuleUnaryExpr : ruleUnaryExpr EOF ;
    public final void entryRuleUnaryExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:706:1: ( ruleUnaryExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:707:1: ruleUnaryExpr EOF
            {
             before(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr1441);
            ruleUnaryExpr();
            _fsp--;

             after(grammarAccess.getUnaryExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr1448); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:714:1: ruleUnaryExpr : ( ( rule__UnaryExpr__Group__0 ) ) ;
    public final void ruleUnaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:718:2: ( ( ( rule__UnaryExpr__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:719:1: ( ( rule__UnaryExpr__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:719:1: ( ( rule__UnaryExpr__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:720:1: ( rule__UnaryExpr__Group__0 )
            {
             before(grammarAccess.getUnaryExprAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:721:1: ( rule__UnaryExpr__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:721:2: rule__UnaryExpr__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__0_in_ruleUnaryExpr1474);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:733:1: entryRulePrePrimaryExpr : rulePrePrimaryExpr EOF ;
    public final void entryRulePrePrimaryExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:734:1: ( rulePrePrimaryExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:735:1: rulePrePrimaryExpr EOF
            {
             before(grammarAccess.getPrePrimaryExprRule()); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr1501);
            rulePrePrimaryExpr();
            _fsp--;

             after(grammarAccess.getPrePrimaryExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrePrimaryExpr1508); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:742:1: rulePrePrimaryExpr : ( ( rule__PrePrimaryExpr__Alternatives ) ) ;
    public final void rulePrePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:746:2: ( ( ( rule__PrePrimaryExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:747:1: ( ( rule__PrePrimaryExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:747:1: ( ( rule__PrePrimaryExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:748:1: ( rule__PrePrimaryExpr__Alternatives )
            {
             before(grammarAccess.getPrePrimaryExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:749:1: ( rule__PrePrimaryExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:749:2: rule__PrePrimaryExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Alternatives_in_rulePrePrimaryExpr1534);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:761:1: entryRuleAbstractRef : ruleAbstractRef EOF ;
    public final void entryRuleAbstractRef() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:762:1: ( ruleAbstractRef EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:763:1: ruleAbstractRef EOF
            {
             before(grammarAccess.getAbstractRefRule()); 
            pushFollow(FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef1561);
            ruleAbstractRef();
            _fsp--;

             after(grammarAccess.getAbstractRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractRef1568); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:770:1: ruleAbstractRef : ( ( rule__AbstractRef__Group__0 ) ) ;
    public final void ruleAbstractRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:774:2: ( ( ( rule__AbstractRef__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:775:1: ( ( rule__AbstractRef__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:775:1: ( ( rule__AbstractRef__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:776:1: ( rule__AbstractRef__Group__0 )
            {
             before(grammarAccess.getAbstractRefAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:777:1: ( rule__AbstractRef__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:777:2: rule__AbstractRef__Group__0
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group__0_in_ruleAbstractRef1594);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:789:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:790:1: ( ruleTerminalExpression EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:791:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1621);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression1628); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:798:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:802:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:803:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:803:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:804:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:805:1: ( rule__TerminalExpression__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:805:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression1654);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:820:1: ruleUnarOp : ( ( '!' ) ) ;
    public final void ruleUnarOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:824:1: ( ( ( '!' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:825:1: ( ( '!' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:825:1: ( ( '!' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:826:1: ( '!' )
            {
             before(grammarAccess.getUnarOpAccess().getNOTEnumLiteralDeclaration()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:827:1: ( '!' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:827:3: '!'
            {
            match(input,12,FOLLOW_12_in_ruleUnarOp1694); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:839:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:843:1: ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14||(LA1_0>=16 && LA1_0<=19)||LA1_0==44) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_BOOLEAN)||LA1_0==12||LA1_0==22||LA1_0==24||LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("839:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:844:1: ( ( rule__Model__DeclarationsAssignment_1_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:844:1: ( ( rule__Model__DeclarationsAssignment_1_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:845:1: ( rule__Model__DeclarationsAssignment_1_0 )
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsAssignment_1_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:846:1: ( rule__Model__DeclarationsAssignment_1_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:846:2: rule__Model__DeclarationsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_1_0_in_rule__Model__Alternatives_11731);
                    rule__Model__DeclarationsAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDeclarationsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:850:6: ( ( rule__Model__StatementsAssignment_1_1 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:850:6: ( ( rule__Model__StatementsAssignment_1_1 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:851:1: ( rule__Model__StatementsAssignment_1_1 )
                    {
                     before(grammarAccess.getModelAccess().getStatementsAssignment_1_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:852:1: ( rule__Model__StatementsAssignment_1_1 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:852:2: rule__Model__StatementsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Model__StatementsAssignment_1_1_in_rule__Model__Alternatives_11749);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:861:1: rule__Declaration__Alternatives : ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:865:1: ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 14:
            case 44:
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
            case 19:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("861:1: rule__Declaration__Alternatives : ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:866:1: ( ruleDefSort )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:866:1: ( ruleDefSort )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:867:1: ruleDefSort
                    {
                     before(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefSort_in_rule__Declaration__Alternatives1782);
                    ruleDefSort();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:872:6: ( ruleDefRange )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:872:6: ( ruleDefRange )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:873:1: ruleDefRange
                    {
                     before(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDefRange_in_rule__Declaration__Alternatives1799);
                    ruleDefRange();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:878:6: ( ruleDefOption )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:878:6: ( ruleDefOption )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:879:1: ruleDefOption
                    {
                     before(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDefOption_in_rule__Declaration__Alternatives1816);
                    ruleDefOption();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:884:6: ( ruleDefCompletion )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:884:6: ( ruleDefCompletion )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:885:1: ruleDefCompletion
                    {
                     before(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDefCompletion_in_rule__Declaration__Alternatives1833);
                    ruleDefCompletion();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:890:6: ( ruleDefNonInertia )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:890:6: ( ruleDefNonInertia )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:891:1: ruleDefNonInertia
                    {
                     before(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDefNonInertia_in_rule__Declaration__Alternatives1850);
                    ruleDefNonInertia();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4()); 

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


    // $ANTLR start rule__Statement__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:901:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ( rule__Statement__Group_1__0 ) ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:905:1: ( ( ruleSortDefinition ) | ( ( rule__Statement__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==20||LA3_1==22||(LA3_1>=28 && LA3_1<=43)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==RULE_ID) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("901:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ( rule__Statement__Group_1__0 ) ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==RULE_STRING||(LA3_0>=RULE_INT && LA3_0<=RULE_BOOLEAN)||LA3_0==12||LA3_0==22||LA3_0==24||LA3_0==26) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("901:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ( rule__Statement__Group_1__0 ) ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:906:1: ( ruleSortDefinition )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:906:1: ( ruleSortDefinition )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:907:1: ruleSortDefinition
                    {
                     before(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSortDefinition_in_rule__Statement__Alternatives1882);
                    ruleSortDefinition();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:912:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:912:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:913:1: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:914:1: ( rule__Statement__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:914:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1899);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:923:1: rule__DeclaredParameter__Alternatives : ( ( ( rule__DeclaredParameter__NameAssignment_0 ) ) | ( ( rule__DeclaredParameter__NameAssignment_1 ) ) );
    public final void rule__DeclaredParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:927:1: ( ( ( rule__DeclaredParameter__NameAssignment_0 ) ) | ( ( rule__DeclaredParameter__NameAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("923:1: rule__DeclaredParameter__Alternatives : ( ( ( rule__DeclaredParameter__NameAssignment_0 ) ) | ( ( rule__DeclaredParameter__NameAssignment_1 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:928:1: ( ( rule__DeclaredParameter__NameAssignment_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:928:1: ( ( rule__DeclaredParameter__NameAssignment_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:929:1: ( rule__DeclaredParameter__NameAssignment_0 )
                    {
                     before(grammarAccess.getDeclaredParameterAccess().getNameAssignment_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:930:1: ( rule__DeclaredParameter__NameAssignment_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:930:2: rule__DeclaredParameter__NameAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DeclaredParameter__NameAssignment_0_in_rule__DeclaredParameter__Alternatives1932);
                    rule__DeclaredParameter__NameAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getDeclaredParameterAccess().getNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:934:6: ( ( rule__DeclaredParameter__NameAssignment_1 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:934:6: ( ( rule__DeclaredParameter__NameAssignment_1 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:935:1: ( rule__DeclaredParameter__NameAssignment_1 )
                    {
                     before(grammarAccess.getDeclaredParameterAccess().getNameAssignment_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:936:1: ( rule__DeclaredParameter__NameAssignment_1 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:936:2: rule__DeclaredParameter__NameAssignment_1
                    {
                    pushFollow(FOLLOW_rule__DeclaredParameter__NameAssignment_1_in_rule__DeclaredParameter__Alternatives1950);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:945:1: rule__Qualifier__Alternatives : ( ( ruleExists ) | ( ruleForall ) );
    public final void rule__Qualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:949:1: ( ( ruleExists ) | ( ruleForall ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==26) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("945:1: rule__Qualifier__Alternatives : ( ( ruleExists ) | ( ruleForall ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:950:1: ( ruleExists )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:950:1: ( ruleExists )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:951:1: ruleExists
                    {
                     before(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExists_in_rule__Qualifier__Alternatives1983);
                    ruleExists();
                    _fsp--;

                     after(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:956:6: ( ruleForall )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:956:6: ( ruleForall )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:957:1: ruleForall
                    {
                     before(grammarAccess.getQualifierAccess().getForallParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleForall_in_rule__Qualifier__Alternatives2000);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:967:1: rule__AssignmentOp__Alternatives_1_0 : ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) );
    public final void rule__AssignmentOp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:971:1: ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==29) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("967:1: rule__AssignmentOp__Alternatives_1_0 : ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:972:1: ( ( rule__AssignmentOp__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:972:1: ( ( rule__AssignmentOp__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:973:1: ( rule__AssignmentOp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:974:1: ( rule__AssignmentOp__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:974:2: rule__AssignmentOp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__0_in_rule__AssignmentOp__Alternatives_1_02032);
                    rule__AssignmentOp__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:978:6: ( ( rule__AssignmentOp__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:978:6: ( ( rule__AssignmentOp__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:979:1: ( rule__AssignmentOp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAssignmentOpAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:980:1: ( rule__AssignmentOp__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:980:2: rule__AssignmentOp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__0_in_rule__AssignmentOp__Alternatives_1_02050);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:989:1: rule__Relational__Alternatives_1_0 : ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) );
    public final void rule__Relational__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:993:1: ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt7=1;
                }
                break;
            case 33:
                {
                alt7=2;
                }
                break;
            case 34:
                {
                alt7=3;
                }
                break;
            case 35:
                {
                alt7=4;
                }
                break;
            case 36:
                {
                alt7=5;
                }
                break;
            case 37:
                {
                alt7=6;
                }
                break;
            case 38:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("989:1: rule__Relational__Alternatives_1_0 : ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:994:1: ( ( rule__Relational__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:994:1: ( ( rule__Relational__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:995:1: ( rule__Relational__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:996:1: ( rule__Relational__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:996:2: rule__Relational__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_0__0_in_rule__Relational__Alternatives_1_02083);
                    rule__Relational__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1000:6: ( ( rule__Relational__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1000:6: ( ( rule__Relational__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1001:1: ( rule__Relational__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1002:1: ( rule__Relational__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1002:2: rule__Relational__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_1__0_in_rule__Relational__Alternatives_1_02101);
                    rule__Relational__Group_1_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1006:6: ( ( rule__Relational__Group_1_0_2__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1006:6: ( ( rule__Relational__Group_1_0_2__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1007:1: ( rule__Relational__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1008:1: ( rule__Relational__Group_1_0_2__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1008:2: rule__Relational__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_2__0_in_rule__Relational__Alternatives_1_02119);
                    rule__Relational__Group_1_0_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1012:6: ( ( rule__Relational__Group_1_0_3__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1012:6: ( ( rule__Relational__Group_1_0_3__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1013:1: ( rule__Relational__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_3()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1014:1: ( rule__Relational__Group_1_0_3__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1014:2: rule__Relational__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_3__0_in_rule__Relational__Alternatives_1_02137);
                    rule__Relational__Group_1_0_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1018:6: ( ( rule__Relational__Group_1_0_4__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1018:6: ( ( rule__Relational__Group_1_0_4__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1019:1: ( rule__Relational__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_4()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1020:1: ( rule__Relational__Group_1_0_4__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1020:2: rule__Relational__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_4__0_in_rule__Relational__Alternatives_1_02155);
                    rule__Relational__Group_1_0_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1024:6: ( ( rule__Relational__Group_1_0_5__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1024:6: ( ( rule__Relational__Group_1_0_5__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1025:1: ( rule__Relational__Group_1_0_5__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_5()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1026:1: ( rule__Relational__Group_1_0_5__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1026:2: rule__Relational__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_5__0_in_rule__Relational__Alternatives_1_02173);
                    rule__Relational__Group_1_0_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1030:6: ( ( rule__Relational__Group_1_0_6__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1030:6: ( ( rule__Relational__Group_1_0_6__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1031:1: ( rule__Relational__Group_1_0_6__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_6()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1032:1: ( rule__Relational__Group_1_0_6__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1032:2: rule__Relational__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_6__0_in_rule__Relational__Alternatives_1_02191);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1041:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1045:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==39) ) {
                alt8=1;
            }
            else if ( (LA8_0==40) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1041:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1046:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1046:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1047:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1048:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1048:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02224);
                    rule__Addition__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1052:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1052:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1053:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1054:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1054:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02242);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1063:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1067:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==41) ) {
                alt9=1;
            }
            else if ( (LA9_0==42) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1063:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1068:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1068:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1069:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1070:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1070:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02275);
                    rule__Multiplication__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1074:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1074:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1075:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1076:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1076:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02293);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1085:1: rule__PrePrimaryExpr__Alternatives : ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) );
    public final void rule__PrePrimaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1089:1: ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
                {
                alt10=1;
                }
                break;
            case RULE_ID:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1085:1: rule__PrePrimaryExpr__Alternatives : ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1090:1: ( ruleTerminalExpression )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1090:1: ( ruleTerminalExpression )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1091:1: ruleTerminalExpression
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTerminalExpression_in_rule__PrePrimaryExpr__Alternatives2326);
                    ruleTerminalExpression();
                    _fsp--;

                     after(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1096:6: ( ruleAbstractRef )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1096:6: ( ruleAbstractRef )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1097:1: ruleAbstractRef
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractRef_in_rule__PrePrimaryExpr__Alternatives2343);
                    ruleAbstractRef();
                    _fsp--;

                     after(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1102:6: ( ( rule__PrePrimaryExpr__Group_2__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1102:6: ( ( rule__PrePrimaryExpr__Group_2__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1103:1: ( rule__PrePrimaryExpr__Group_2__0 )
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getGroup_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1104:1: ( rule__PrePrimaryExpr__Group_2__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1104:2: rule__PrePrimaryExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__0_in_rule__PrePrimaryExpr__Alternatives2360);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1113:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1117:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case RULE_STRING:
                {
                alt11=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1113:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1118:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1118:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1119:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1120:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1120:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives2393);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1124:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1124:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1125:1: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1126:1: ( rule__TerminalExpression__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1126:2: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives2411);
                    rule__TerminalExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1130:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1130:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1131:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1132:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1132:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives2429);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1143:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1147:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1148:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02460);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02463);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1155:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1159:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1160:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1160:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1161:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1162:1: ( rule__Model__ImportsAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==13) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1162:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2490);
            	    rule__Model__ImportsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1172:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1176:1: ( rule__Model__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1177:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12521);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1183:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1187:1: ( ( ( rule__Model__Alternatives_1 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1188:1: ( ( rule__Model__Alternatives_1 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1188:1: ( ( rule__Model__Alternatives_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1189:1: ( rule__Model__Alternatives_1 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1190:1: ( rule__Model__Alternatives_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_BOOLEAN)||LA13_0==12||LA13_0==14||(LA13_0>=16 && LA13_0<=19)||LA13_0==22||LA13_0==24||LA13_0==26||LA13_0==44) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1190:2: rule__Model__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_1_in_rule__Model__Group__1__Impl2548);
            	    rule__Model__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1204:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1208:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1209:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02583);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02586);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1216:1: rule__Import__Group__0__Impl : ( 'load' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1220:1: ( ( 'load' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1221:1: ( 'load' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1221:1: ( 'load' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1222:1: 'load'
            {
             before(grammarAccess.getImportAccess().getLoadKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__Import__Group__0__Impl2614); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1235:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1239:1: ( rule__Import__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1240:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12645);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1246:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1250:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1251:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1251:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1252:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1253:1: ( rule__Import__ImportURIAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1253:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2672);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1267:1: rule__DefSort__Group__0 : rule__DefSort__Group__0__Impl rule__DefSort__Group__1 ;
    public final void rule__DefSort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1271:1: ( rule__DefSort__Group__0__Impl rule__DefSort__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1272:2: rule__DefSort__Group__0__Impl rule__DefSort__Group__1
            {
            pushFollow(FOLLOW_rule__DefSort__Group__0__Impl_in_rule__DefSort__Group__02706);
            rule__DefSort__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group__1_in_rule__DefSort__Group__02709);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1279:1: rule__DefSort__Group__0__Impl : ( ( rule__DefSort__ReifiedAssignment_0 )? ) ;
    public final void rule__DefSort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1283:1: ( ( ( rule__DefSort__ReifiedAssignment_0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1284:1: ( ( rule__DefSort__ReifiedAssignment_0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1284:1: ( ( rule__DefSort__ReifiedAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1285:1: ( rule__DefSort__ReifiedAssignment_0 )?
            {
             before(grammarAccess.getDefSortAccess().getReifiedAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1286:1: ( rule__DefSort__ReifiedAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==44) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1286:2: rule__DefSort__ReifiedAssignment_0
                    {
                    pushFollow(FOLLOW_rule__DefSort__ReifiedAssignment_0_in_rule__DefSort__Group__0__Impl2736);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1296:1: rule__DefSort__Group__1 : rule__DefSort__Group__1__Impl rule__DefSort__Group__2 ;
    public final void rule__DefSort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1300:1: ( rule__DefSort__Group__1__Impl rule__DefSort__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1301:2: rule__DefSort__Group__1__Impl rule__DefSort__Group__2
            {
            pushFollow(FOLLOW_rule__DefSort__Group__1__Impl_in_rule__DefSort__Group__12767);
            rule__DefSort__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group__2_in_rule__DefSort__Group__12770);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1308:1: rule__DefSort__Group__1__Impl : ( 'sort' ) ;
    public final void rule__DefSort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1312:1: ( ( 'sort' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1313:1: ( 'sort' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1313:1: ( 'sort' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1314:1: 'sort'
            {
             before(grammarAccess.getDefSortAccess().getSortKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__DefSort__Group__1__Impl2798); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1327:1: rule__DefSort__Group__2 : rule__DefSort__Group__2__Impl rule__DefSort__Group__3 ;
    public final void rule__DefSort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1331:1: ( rule__DefSort__Group__2__Impl rule__DefSort__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1332:2: rule__DefSort__Group__2__Impl rule__DefSort__Group__3
            {
            pushFollow(FOLLOW_rule__DefSort__Group__2__Impl_in_rule__DefSort__Group__22829);
            rule__DefSort__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group__3_in_rule__DefSort__Group__22832);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1339:1: rule__DefSort__Group__2__Impl : ( ( rule__DefSort__NameAssignment_2 ) ) ;
    public final void rule__DefSort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1343:1: ( ( ( rule__DefSort__NameAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1344:1: ( ( rule__DefSort__NameAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1344:1: ( ( rule__DefSort__NameAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1345:1: ( rule__DefSort__NameAssignment_2 )
            {
             before(grammarAccess.getDefSortAccess().getNameAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1346:1: ( rule__DefSort__NameAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1346:2: rule__DefSort__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DefSort__NameAssignment_2_in_rule__DefSort__Group__2__Impl2859);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1356:1: rule__DefSort__Group__3 : rule__DefSort__Group__3__Impl ;
    public final void rule__DefSort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1360:1: ( rule__DefSort__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1361:2: rule__DefSort__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DefSort__Group__3__Impl_in_rule__DefSort__Group__32889);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1367:1: rule__DefSort__Group__3__Impl : ( ( rule__DefSort__Group_3__0 )? ) ;
    public final void rule__DefSort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1371:1: ( ( ( rule__DefSort__Group_3__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1372:1: ( ( rule__DefSort__Group_3__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1372:1: ( ( rule__DefSort__Group_3__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1373:1: ( rule__DefSort__Group_3__0 )?
            {
             before(grammarAccess.getDefSortAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1374:1: ( rule__DefSort__Group_3__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1374:2: rule__DefSort__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__DefSort__Group_3__0_in_rule__DefSort__Group__3__Impl2916);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1392:1: rule__DefSort__Group_3__0 : rule__DefSort__Group_3__0__Impl rule__DefSort__Group_3__1 ;
    public final void rule__DefSort__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1396:1: ( rule__DefSort__Group_3__0__Impl rule__DefSort__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1397:2: rule__DefSort__Group_3__0__Impl rule__DefSort__Group_3__1
            {
            pushFollow(FOLLOW_rule__DefSort__Group_3__0__Impl_in_rule__DefSort__Group_3__02955);
            rule__DefSort__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group_3__1_in_rule__DefSort__Group_3__02958);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1404:1: rule__DefSort__Group_3__0__Impl : ( ':' ) ;
    public final void rule__DefSort__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1408:1: ( ( ':' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1409:1: ( ':' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1409:1: ( ':' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1410:1: ':'
            {
             before(grammarAccess.getDefSortAccess().getColonKeyword_3_0()); 
            match(input,15,FOLLOW_15_in_rule__DefSort__Group_3__0__Impl2986); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1423:1: rule__DefSort__Group_3__1 : rule__DefSort__Group_3__1__Impl ;
    public final void rule__DefSort__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1427:1: ( rule__DefSort__Group_3__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1428:2: rule__DefSort__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DefSort__Group_3__1__Impl_in_rule__DefSort__Group_3__13017);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1434:1: rule__DefSort__Group_3__1__Impl : ( ( rule__DefSort__TypeAssignment_3_1 ) ) ;
    public final void rule__DefSort__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1438:1: ( ( ( rule__DefSort__TypeAssignment_3_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1439:1: ( ( rule__DefSort__TypeAssignment_3_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1439:1: ( ( rule__DefSort__TypeAssignment_3_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1440:1: ( rule__DefSort__TypeAssignment_3_1 )
            {
             before(grammarAccess.getDefSortAccess().getTypeAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1441:1: ( rule__DefSort__TypeAssignment_3_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1441:2: rule__DefSort__TypeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DefSort__TypeAssignment_3_1_in_rule__DefSort__Group_3__1__Impl3044);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1455:1: rule__DefRange__Group__0 : rule__DefRange__Group__0__Impl rule__DefRange__Group__1 ;
    public final void rule__DefRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1459:1: ( rule__DefRange__Group__0__Impl rule__DefRange__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1460:2: rule__DefRange__Group__0__Impl rule__DefRange__Group__1
            {
            pushFollow(FOLLOW_rule__DefRange__Group__0__Impl_in_rule__DefRange__Group__03078);
            rule__DefRange__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefRange__Group__1_in_rule__DefRange__Group__03081);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1467:1: rule__DefRange__Group__0__Impl : ( 'range' ) ;
    public final void rule__DefRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1471:1: ( ( 'range' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1472:1: ( 'range' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1472:1: ( 'range' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1473:1: 'range'
            {
             before(grammarAccess.getDefRangeAccess().getRangeKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__DefRange__Group__0__Impl3109); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1486:1: rule__DefRange__Group__1 : rule__DefRange__Group__1__Impl rule__DefRange__Group__2 ;
    public final void rule__DefRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1490:1: ( rule__DefRange__Group__1__Impl rule__DefRange__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1491:2: rule__DefRange__Group__1__Impl rule__DefRange__Group__2
            {
            pushFollow(FOLLOW_rule__DefRange__Group__1__Impl_in_rule__DefRange__Group__13140);
            rule__DefRange__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefRange__Group__2_in_rule__DefRange__Group__13143);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1498:1: rule__DefRange__Group__1__Impl : ( ( rule__DefRange__NameAssignment_1 ) ) ;
    public final void rule__DefRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1502:1: ( ( ( rule__DefRange__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1503:1: ( ( rule__DefRange__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1503:1: ( ( rule__DefRange__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1504:1: ( rule__DefRange__NameAssignment_1 )
            {
             before(grammarAccess.getDefRangeAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1505:1: ( rule__DefRange__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1505:2: rule__DefRange__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DefRange__NameAssignment_1_in_rule__DefRange__Group__1__Impl3170);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1515:1: rule__DefRange__Group__2 : rule__DefRange__Group__2__Impl rule__DefRange__Group__3 ;
    public final void rule__DefRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1519:1: ( rule__DefRange__Group__2__Impl rule__DefRange__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1520:2: rule__DefRange__Group__2__Impl rule__DefRange__Group__3
            {
            pushFollow(FOLLOW_rule__DefRange__Group__2__Impl_in_rule__DefRange__Group__23200);
            rule__DefRange__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefRange__Group__3_in_rule__DefRange__Group__23203);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1527:1: rule__DefRange__Group__2__Impl : ( ( rule__DefRange__MinAssignment_2 ) ) ;
    public final void rule__DefRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1531:1: ( ( ( rule__DefRange__MinAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1532:1: ( ( rule__DefRange__MinAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1532:1: ( ( rule__DefRange__MinAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1533:1: ( rule__DefRange__MinAssignment_2 )
            {
             before(grammarAccess.getDefRangeAccess().getMinAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1534:1: ( rule__DefRange__MinAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1534:2: rule__DefRange__MinAssignment_2
            {
            pushFollow(FOLLOW_rule__DefRange__MinAssignment_2_in_rule__DefRange__Group__2__Impl3230);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1544:1: rule__DefRange__Group__3 : rule__DefRange__Group__3__Impl ;
    public final void rule__DefRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1548:1: ( rule__DefRange__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1549:2: rule__DefRange__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DefRange__Group__3__Impl_in_rule__DefRange__Group__33260);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1555:1: rule__DefRange__Group__3__Impl : ( ( rule__DefRange__MaxAssignment_3 ) ) ;
    public final void rule__DefRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1559:1: ( ( ( rule__DefRange__MaxAssignment_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1560:1: ( ( rule__DefRange__MaxAssignment_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1560:1: ( ( rule__DefRange__MaxAssignment_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1561:1: ( rule__DefRange__MaxAssignment_3 )
            {
             before(grammarAccess.getDefRangeAccess().getMaxAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1562:1: ( rule__DefRange__MaxAssignment_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1562:2: rule__DefRange__MaxAssignment_3
            {
            pushFollow(FOLLOW_rule__DefRange__MaxAssignment_3_in_rule__DefRange__Group__3__Impl3287);
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


    // $ANTLR start rule__DefOption__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1580:1: rule__DefOption__Group__0 : rule__DefOption__Group__0__Impl rule__DefOption__Group__1 ;
    public final void rule__DefOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1584:1: ( rule__DefOption__Group__0__Impl rule__DefOption__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1585:2: rule__DefOption__Group__0__Impl rule__DefOption__Group__1
            {
            pushFollow(FOLLOW_rule__DefOption__Group__0__Impl_in_rule__DefOption__Group__03325);
            rule__DefOption__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group__1_in_rule__DefOption__Group__03328);
            rule__DefOption__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group__0


    // $ANTLR start rule__DefOption__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1592:1: rule__DefOption__Group__0__Impl : ( 'option' ) ;
    public final void rule__DefOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1596:1: ( ( 'option' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1597:1: ( 'option' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1597:1: ( 'option' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1598:1: 'option'
            {
             before(grammarAccess.getDefOptionAccess().getOptionKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__DefOption__Group__0__Impl3356); 
             after(grammarAccess.getDefOptionAccess().getOptionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group__0__Impl


    // $ANTLR start rule__DefOption__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1611:1: rule__DefOption__Group__1 : rule__DefOption__Group__1__Impl rule__DefOption__Group__2 ;
    public final void rule__DefOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1615:1: ( rule__DefOption__Group__1__Impl rule__DefOption__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1616:2: rule__DefOption__Group__1__Impl rule__DefOption__Group__2
            {
            pushFollow(FOLLOW_rule__DefOption__Group__1__Impl_in_rule__DefOption__Group__13387);
            rule__DefOption__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group__2_in_rule__DefOption__Group__13390);
            rule__DefOption__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group__1


    // $ANTLR start rule__DefOption__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1623:1: rule__DefOption__Group__1__Impl : ( ( rule__DefOption__NameAssignment_1 ) ) ;
    public final void rule__DefOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1627:1: ( ( ( rule__DefOption__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1628:1: ( ( rule__DefOption__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1628:1: ( ( rule__DefOption__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1629:1: ( rule__DefOption__NameAssignment_1 )
            {
             before(grammarAccess.getDefOptionAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1630:1: ( rule__DefOption__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1630:2: rule__DefOption__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DefOption__NameAssignment_1_in_rule__DefOption__Group__1__Impl3417);
            rule__DefOption__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group__1__Impl


    // $ANTLR start rule__DefOption__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1640:1: rule__DefOption__Group__2 : rule__DefOption__Group__2__Impl ;
    public final void rule__DefOption__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1644:1: ( rule__DefOption__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1645:2: rule__DefOption__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__DefOption__Group__2__Impl_in_rule__DefOption__Group__23447);
            rule__DefOption__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group__2


    // $ANTLR start rule__DefOption__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1651:1: rule__DefOption__Group__2__Impl : ( ( rule__DefOption__ValueAssignment_2 ) ) ;
    public final void rule__DefOption__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1655:1: ( ( ( rule__DefOption__ValueAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1656:1: ( ( rule__DefOption__ValueAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1656:1: ( ( rule__DefOption__ValueAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1657:1: ( rule__DefOption__ValueAssignment_2 )
            {
             before(grammarAccess.getDefOptionAccess().getValueAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1658:1: ( rule__DefOption__ValueAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1658:2: rule__DefOption__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__DefOption__ValueAssignment_2_in_rule__DefOption__Group__2__Impl3474);
            rule__DefOption__ValueAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group__2__Impl


    // $ANTLR start rule__DefCompletion__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1674:1: rule__DefCompletion__Group__0 : rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1 ;
    public final void rule__DefCompletion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1678:1: ( rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1679:2: rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__0__Impl_in_rule__DefCompletion__Group__03510);
            rule__DefCompletion__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefCompletion__Group__1_in_rule__DefCompletion__Group__03513);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1686:1: rule__DefCompletion__Group__0__Impl : ( 'completion' ) ;
    public final void rule__DefCompletion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1690:1: ( ( 'completion' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1691:1: ( 'completion' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1691:1: ( 'completion' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1692:1: 'completion'
            {
             before(grammarAccess.getDefCompletionAccess().getCompletionKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__DefCompletion__Group__0__Impl3541); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1705:1: rule__DefCompletion__Group__1 : rule__DefCompletion__Group__1__Impl ;
    public final void rule__DefCompletion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1709:1: ( rule__DefCompletion__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1710:2: rule__DefCompletion__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__1__Impl_in_rule__DefCompletion__Group__13572);
            rule__DefCompletion__Group__1__Impl();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1716:1: rule__DefCompletion__Group__1__Impl : ( ( rule__DefCompletion__NameAssignment_1 ) ) ;
    public final void rule__DefCompletion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1720:1: ( ( ( rule__DefCompletion__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1721:1: ( ( rule__DefCompletion__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1721:1: ( ( rule__DefCompletion__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1722:1: ( rule__DefCompletion__NameAssignment_1 )
            {
             before(grammarAccess.getDefCompletionAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1723:1: ( rule__DefCompletion__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1723:2: rule__DefCompletion__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DefCompletion__NameAssignment_1_in_rule__DefCompletion__Group__1__Impl3599);
            rule__DefCompletion__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDefCompletionAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__DefNonInertia__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1737:1: rule__DefNonInertia__Group__0 : rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1 ;
    public final void rule__DefNonInertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1741:1: ( rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1742:2: rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__0__Impl_in_rule__DefNonInertia__Group__03633);
            rule__DefNonInertia__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefNonInertia__Group__1_in_rule__DefNonInertia__Group__03636);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1749:1: rule__DefNonInertia__Group__0__Impl : ( 'noninertial' ) ;
    public final void rule__DefNonInertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1753:1: ( ( 'noninertial' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1754:1: ( 'noninertial' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1754:1: ( 'noninertial' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1755:1: 'noninertial'
            {
             before(grammarAccess.getDefNonInertiaAccess().getNoninertialKeyword_0()); 
            match(input,19,FOLLOW_19_in_rule__DefNonInertia__Group__0__Impl3664); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1768:1: rule__DefNonInertia__Group__1 : rule__DefNonInertia__Group__1__Impl ;
    public final void rule__DefNonInertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1772:1: ( rule__DefNonInertia__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1773:2: rule__DefNonInertia__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__1__Impl_in_rule__DefNonInertia__Group__13695);
            rule__DefNonInertia__Group__1__Impl();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1779:1: rule__DefNonInertia__Group__1__Impl : ( ( rule__DefNonInertia__NameAssignment_1 ) ) ;
    public final void rule__DefNonInertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1783:1: ( ( ( rule__DefNonInertia__NameAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1784:1: ( ( rule__DefNonInertia__NameAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1784:1: ( ( rule__DefNonInertia__NameAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1785:1: ( rule__DefNonInertia__NameAssignment_1 )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNameAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1786:1: ( rule__DefNonInertia__NameAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1786:2: rule__DefNonInertia__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DefNonInertia__NameAssignment_1_in_rule__DefNonInertia__Group__1__Impl3722);
            rule__DefNonInertia__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDefNonInertiaAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Statement__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1800:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1804:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1805:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__03756);
            rule__Statement__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__03759);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1812:1: rule__Statement__Group_1__0__Impl : ( ruleExpression ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1816:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1817:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1817:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1818:1: ruleExpression
            {
             before(grammarAccess.getStatementAccess().getExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Statement__Group_1__0__Impl3786);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1829:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1833:1: ( rule__Statement__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1834:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__13815);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1840:1: rule__Statement__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1844:1: ( ( '.' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1845:1: ( '.' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1845:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1846:1: '.'
            {
             before(grammarAccess.getStatementAccess().getFullStopKeyword_1_1()); 
            match(input,20,FOLLOW_20_in_rule__Statement__Group_1__1__Impl3843); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1863:1: rule__SortDefinition__Group__0 : rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1 ;
    public final void rule__SortDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1867:1: ( rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1868:2: rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__0__Impl_in_rule__SortDefinition__Group__03878);
            rule__SortDefinition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SortDefinition__Group__1_in_rule__SortDefinition__Group__03881);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1875:1: rule__SortDefinition__Group__0__Impl : ( ( rule__SortDefinition__SortAssignment_0 ) ) ;
    public final void rule__SortDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1879:1: ( ( ( rule__SortDefinition__SortAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1880:1: ( ( rule__SortDefinition__SortAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1880:1: ( ( rule__SortDefinition__SortAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1881:1: ( rule__SortDefinition__SortAssignment_0 )
            {
             before(grammarAccess.getSortDefinitionAccess().getSortAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1882:1: ( rule__SortDefinition__SortAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1882:2: rule__SortDefinition__SortAssignment_0
            {
            pushFollow(FOLLOW_rule__SortDefinition__SortAssignment_0_in_rule__SortDefinition__Group__0__Impl3908);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1892:1: rule__SortDefinition__Group__1 : rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2 ;
    public final void rule__SortDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1896:1: ( rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1897:2: rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__1__Impl_in_rule__SortDefinition__Group__13938);
            rule__SortDefinition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SortDefinition__Group__2_in_rule__SortDefinition__Group__13941);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1904:1: rule__SortDefinition__Group__1__Impl : ( ( rule__SortDefinition__DefinitionsAssignment_1 ) ) ;
    public final void rule__SortDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1908:1: ( ( ( rule__SortDefinition__DefinitionsAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1909:1: ( ( rule__SortDefinition__DefinitionsAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1909:1: ( ( rule__SortDefinition__DefinitionsAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1910:1: ( rule__SortDefinition__DefinitionsAssignment_1 )
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1911:1: ( rule__SortDefinition__DefinitionsAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1911:2: rule__SortDefinition__DefinitionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SortDefinition__DefinitionsAssignment_1_in_rule__SortDefinition__Group__1__Impl3968);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1921:1: rule__SortDefinition__Group__2 : rule__SortDefinition__Group__2__Impl ;
    public final void rule__SortDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1925:1: ( rule__SortDefinition__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1926:2: rule__SortDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__2__Impl_in_rule__SortDefinition__Group__23998);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1932:1: rule__SortDefinition__Group__2__Impl : ( ( rule__SortDefinition__Group_2__0 )* ) ;
    public final void rule__SortDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1936:1: ( ( ( rule__SortDefinition__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1937:1: ( ( rule__SortDefinition__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1937:1: ( ( rule__SortDefinition__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1938:1: ( rule__SortDefinition__Group_2__0 )*
            {
             before(grammarAccess.getSortDefinitionAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1939:1: ( rule__SortDefinition__Group_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==21) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1939:2: rule__SortDefinition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__SortDefinition__Group_2__0_in_rule__SortDefinition__Group__2__Impl4025);
            	    rule__SortDefinition__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1955:1: rule__SortDefinition__Group_2__0 : rule__SortDefinition__Group_2__0__Impl rule__SortDefinition__Group_2__1 ;
    public final void rule__SortDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1959:1: ( rule__SortDefinition__Group_2__0__Impl rule__SortDefinition__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1960:2: rule__SortDefinition__Group_2__0__Impl rule__SortDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group_2__0__Impl_in_rule__SortDefinition__Group_2__04062);
            rule__SortDefinition__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SortDefinition__Group_2__1_in_rule__SortDefinition__Group_2__04065);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1967:1: rule__SortDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SortDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1971:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1972:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1972:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1973:1: ','
            {
             before(grammarAccess.getSortDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__SortDefinition__Group_2__0__Impl4093); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1986:1: rule__SortDefinition__Group_2__1 : rule__SortDefinition__Group_2__1__Impl ;
    public final void rule__SortDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1990:1: ( rule__SortDefinition__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1991:2: rule__SortDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group_2__1__Impl_in_rule__SortDefinition__Group_2__14124);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1997:1: rule__SortDefinition__Group_2__1__Impl : ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) ) ;
    public final void rule__SortDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2001:1: ( ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2002:1: ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2002:1: ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2003:1: ( rule__SortDefinition__DefinitionsAssignment_2_1 )
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2004:1: ( rule__SortDefinition__DefinitionsAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2004:2: rule__SortDefinition__DefinitionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SortDefinition__DefinitionsAssignment_2_1_in_rule__SortDefinition__Group_2__1__Impl4151);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2018:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2022:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2023:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__04185);
            rule__Definition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__04188);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2030:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__NameAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2034:1: ( ( ( rule__Definition__NameAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2035:1: ( ( rule__Definition__NameAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2035:1: ( ( rule__Definition__NameAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2036:1: ( rule__Definition__NameAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2037:1: ( rule__Definition__NameAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2037:2: rule__Definition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_0_in_rule__Definition__Group__0__Impl4215);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2047:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2051:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2052:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__14245);
            rule__Definition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__14248);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2059:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__Group_1__0 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2063:1: ( ( ( rule__Definition__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2064:1: ( ( rule__Definition__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2064:1: ( ( rule__Definition__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2065:1: ( rule__Definition__Group_1__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2066:1: ( rule__Definition__Group_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==RULE_ID) ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3==23) ) {
                        int LA17_5 = input.LA(4);

                        if ( (LA17_5==EOF||(LA17_5>=RULE_STRING && LA17_5<=RULE_BOOLEAN)||LA17_5==12||(LA17_5>=14 && LA17_5<=19)||(LA17_5>=21 && LA17_5<=22)||LA17_5==24||LA17_5==26||LA17_5==44) ) {
                            alt17=1;
                        }
                    }
                    else if ( (LA17_3==21) ) {
                        alt17=1;
                    }
                }
                else if ( (LA17_1==21||LA17_1==23) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2066:2: rule__Definition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Definition__Group_1__0_in_rule__Definition__Group__1__Impl4275);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2076:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2080:1: ( rule__Definition__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2081:2: rule__Definition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__24306);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2087:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__Group_2__0 )? ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2091:1: ( ( ( rule__Definition__Group_2__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2092:1: ( ( rule__Definition__Group_2__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2092:1: ( ( rule__Definition__Group_2__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2093:1: ( rule__Definition__Group_2__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2094:1: ( rule__Definition__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2094:2: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Definition__Group_2__0_in_rule__Definition__Group__2__Impl4333);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2110:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2114:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2115:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__0__Impl_in_rule__Definition__Group_1__04370);
            rule__Definition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1__1_in_rule__Definition__Group_1__04373);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2122:1: rule__Definition__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2126:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2127:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2127:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2128:1: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,22,FOLLOW_22_in_rule__Definition__Group_1__0__Impl4401); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2141:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2145:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2146:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__1__Impl_in_rule__Definition__Group_1__14432);
            rule__Definition__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1__2_in_rule__Definition__Group_1__14435);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2153:1: rule__Definition__Group_1__1__Impl : ( ( rule__Definition__ArgsAssignment_1_1 )? ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2157:1: ( ( ( rule__Definition__ArgsAssignment_1_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2158:1: ( ( rule__Definition__ArgsAssignment_1_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2158:1: ( ( rule__Definition__ArgsAssignment_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2159:1: ( rule__Definition__ArgsAssignment_1_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2160:1: ( rule__Definition__ArgsAssignment_1_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2160:2: rule__Definition__ArgsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Definition__ArgsAssignment_1_1_in_rule__Definition__Group_1__1__Impl4462);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2170:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2174:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2175:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__2__Impl_in_rule__Definition__Group_1__24493);
            rule__Definition__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1__3_in_rule__Definition__Group_1__24496);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2182:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__Group_1_2__0 )* ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2186:1: ( ( ( rule__Definition__Group_1_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2187:1: ( ( rule__Definition__Group_1_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2187:1: ( ( rule__Definition__Group_1_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2188:1: ( rule__Definition__Group_1_2__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2189:1: ( rule__Definition__Group_1_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==21) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2189:2: rule__Definition__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Definition__Group_1_2__0_in_rule__Definition__Group_1__2__Impl4523);
            	    rule__Definition__Group_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2199:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2203:1: ( rule__Definition__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2204:2: rule__Definition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__3__Impl_in_rule__Definition__Group_1__34554);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2210:1: rule__Definition__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2214:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2215:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2215:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2216:1: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3()); 
            match(input,23,FOLLOW_23_in_rule__Definition__Group_1__3__Impl4582); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2237:1: rule__Definition__Group_1_2__0 : rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 ;
    public final void rule__Definition__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2241:1: ( rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2242:2: rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_1_2__0__Impl_in_rule__Definition__Group_1_2__04621);
            rule__Definition__Group_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1_2__1_in_rule__Definition__Group_1_2__04624);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2249:1: rule__Definition__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2253:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2254:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2254:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2255:1: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Definition__Group_1_2__0__Impl4652); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2268:1: rule__Definition__Group_1_2__1 : rule__Definition__Group_1_2__1__Impl ;
    public final void rule__Definition__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2272:1: ( rule__Definition__Group_1_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2273:2: rule__Definition__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_1_2__1__Impl_in_rule__Definition__Group_1_2__14683);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2279:1: rule__Definition__Group_1_2__1__Impl : ( ( rule__Definition__ArgsAssignment_1_2_1 ) ) ;
    public final void rule__Definition__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2283:1: ( ( ( rule__Definition__ArgsAssignment_1_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2284:1: ( ( rule__Definition__ArgsAssignment_1_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2284:1: ( ( rule__Definition__ArgsAssignment_1_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2285:1: ( rule__Definition__ArgsAssignment_1_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_1_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2286:1: ( rule__Definition__ArgsAssignment_1_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2286:2: rule__Definition__ArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Definition__ArgsAssignment_1_2_1_in_rule__Definition__Group_1_2__1__Impl4710);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2300:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2304:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2305:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__0__Impl_in_rule__Definition__Group_2__04744);
            rule__Definition__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_2__1_in_rule__Definition__Group_2__04747);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2312:1: rule__Definition__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2316:1: ( ( ':' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2317:1: ( ':' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2317:1: ( ':' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2318:1: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_2_0()); 
            match(input,15,FOLLOW_15_in_rule__Definition__Group_2__0__Impl4775); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2331:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2335:1: ( rule__Definition__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2336:2: rule__Definition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__1__Impl_in_rule__Definition__Group_2__14806);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2342:1: rule__Definition__Group_2__1__Impl : ( ( rule__Definition__ReturnAssignment_2_1 ) ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2346:1: ( ( ( rule__Definition__ReturnAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2347:1: ( ( rule__Definition__ReturnAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2347:1: ( ( rule__Definition__ReturnAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2348:1: ( rule__Definition__ReturnAssignment_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getReturnAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2349:1: ( rule__Definition__ReturnAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2349:2: rule__Definition__ReturnAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Definition__ReturnAssignment_2_1_in_rule__Definition__Group_2__1__Impl4833);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2363:1: rule__Expression__Group__0 : rule__Expression__Group__0__Impl rule__Expression__Group__1 ;
    public final void rule__Expression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2367:1: ( rule__Expression__Group__0__Impl rule__Expression__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2368:2: rule__Expression__Group__0__Impl rule__Expression__Group__1
            {
            pushFollow(FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04867);
            rule__Expression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04870);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2375:1: rule__Expression__Group__0__Impl : ( ( rule__Expression__QualifiersAssignment_0 )* ) ;
    public final void rule__Expression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2379:1: ( ( ( rule__Expression__QualifiersAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2380:1: ( ( rule__Expression__QualifiersAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2380:1: ( ( rule__Expression__QualifiersAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2381:1: ( rule__Expression__QualifiersAssignment_0 )*
            {
             before(grammarAccess.getExpressionAccess().getQualifiersAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2382:1: ( rule__Expression__QualifiersAssignment_0 )*
            loop21:
            do {
                int alt21=2;
                alt21 = dfa21.predict(input);
                switch (alt21) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2382:2: rule__Expression__QualifiersAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Expression__QualifiersAssignment_0_in_rule__Expression__Group__0__Impl4897);
            	    rule__Expression__QualifiersAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getExpressionAccess().getQualifiersAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2392:1: rule__Expression__Group__1 : rule__Expression__Group__1__Impl ;
    public final void rule__Expression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2396:1: ( rule__Expression__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2397:2: rule__Expression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14928);
            rule__Expression__Group__1__Impl();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2403:1: rule__Expression__Group__1__Impl : ( ( rule__Expression__ExprAssignment_1 ) ) ;
    public final void rule__Expression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2407:1: ( ( ( rule__Expression__ExprAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2408:1: ( ( rule__Expression__ExprAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2408:1: ( ( rule__Expression__ExprAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2409:1: ( rule__Expression__ExprAssignment_1 )
            {
             before(grammarAccess.getExpressionAccess().getExprAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2410:1: ( rule__Expression__ExprAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2410:2: rule__Expression__ExprAssignment_1
            {
            pushFollow(FOLLOW_rule__Expression__ExprAssignment_1_in_rule__Expression__Group__1__Impl4955);
            rule__Expression__ExprAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExprAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Exists__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2424:1: rule__Exists__Group__0 : rule__Exists__Group__0__Impl rule__Exists__Group__1 ;
    public final void rule__Exists__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2428:1: ( rule__Exists__Group__0__Impl rule__Exists__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2429:2: rule__Exists__Group__0__Impl rule__Exists__Group__1
            {
            pushFollow(FOLLOW_rule__Exists__Group__0__Impl_in_rule__Exists__Group__04989);
            rule__Exists__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group__1_in_rule__Exists__Group__04992);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2436:1: rule__Exists__Group__0__Impl : ( '{' ) ;
    public final void rule__Exists__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2440:1: ( ( '{' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2441:1: ( '{' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2441:1: ( '{' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2442:1: '{'
            {
             before(grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Exists__Group__0__Impl5020); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2455:1: rule__Exists__Group__1 : rule__Exists__Group__1__Impl rule__Exists__Group__2 ;
    public final void rule__Exists__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2459:1: ( rule__Exists__Group__1__Impl rule__Exists__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2460:2: rule__Exists__Group__1__Impl rule__Exists__Group__2
            {
            pushFollow(FOLLOW_rule__Exists__Group__1__Impl_in_rule__Exists__Group__15051);
            rule__Exists__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group__2_in_rule__Exists__Group__15054);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2467:1: rule__Exists__Group__1__Impl : ( ( rule__Exists__NamesAssignment_1 ) ) ;
    public final void rule__Exists__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2471:1: ( ( ( rule__Exists__NamesAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2472:1: ( ( rule__Exists__NamesAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2472:1: ( ( rule__Exists__NamesAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2473:1: ( rule__Exists__NamesAssignment_1 )
            {
             before(grammarAccess.getExistsAccess().getNamesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2474:1: ( rule__Exists__NamesAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2474:2: rule__Exists__NamesAssignment_1
            {
            pushFollow(FOLLOW_rule__Exists__NamesAssignment_1_in_rule__Exists__Group__1__Impl5081);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2484:1: rule__Exists__Group__2 : rule__Exists__Group__2__Impl rule__Exists__Group__3 ;
    public final void rule__Exists__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2488:1: ( rule__Exists__Group__2__Impl rule__Exists__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2489:2: rule__Exists__Group__2__Impl rule__Exists__Group__3
            {
            pushFollow(FOLLOW_rule__Exists__Group__2__Impl_in_rule__Exists__Group__25111);
            rule__Exists__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group__3_in_rule__Exists__Group__25114);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2496:1: rule__Exists__Group__2__Impl : ( ( rule__Exists__Group_2__0 )* ) ;
    public final void rule__Exists__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2500:1: ( ( ( rule__Exists__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2501:1: ( ( rule__Exists__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2501:1: ( ( rule__Exists__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2502:1: ( rule__Exists__Group_2__0 )*
            {
             before(grammarAccess.getExistsAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2503:1: ( rule__Exists__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2503:2: rule__Exists__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Exists__Group_2__0_in_rule__Exists__Group__2__Impl5141);
            	    rule__Exists__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2513:1: rule__Exists__Group__3 : rule__Exists__Group__3__Impl ;
    public final void rule__Exists__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2517:1: ( rule__Exists__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2518:2: rule__Exists__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Exists__Group__3__Impl_in_rule__Exists__Group__35172);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2524:1: rule__Exists__Group__3__Impl : ( '}' ) ;
    public final void rule__Exists__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2528:1: ( ( '}' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2529:1: ( '}' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2529:1: ( '}' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2530:1: '}'
            {
             before(grammarAccess.getExistsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Exists__Group__3__Impl5200); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2551:1: rule__Exists__Group_2__0 : rule__Exists__Group_2__0__Impl rule__Exists__Group_2__1 ;
    public final void rule__Exists__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2555:1: ( rule__Exists__Group_2__0__Impl rule__Exists__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2556:2: rule__Exists__Group_2__0__Impl rule__Exists__Group_2__1
            {
            pushFollow(FOLLOW_rule__Exists__Group_2__0__Impl_in_rule__Exists__Group_2__05239);
            rule__Exists__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group_2__1_in_rule__Exists__Group_2__05242);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2563:1: rule__Exists__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Exists__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2567:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2568:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2568:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2569:1: ','
            {
             before(grammarAccess.getExistsAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Exists__Group_2__0__Impl5270); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2582:1: rule__Exists__Group_2__1 : rule__Exists__Group_2__1__Impl ;
    public final void rule__Exists__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2586:1: ( rule__Exists__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2587:2: rule__Exists__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Exists__Group_2__1__Impl_in_rule__Exists__Group_2__15301);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2593:1: rule__Exists__Group_2__1__Impl : ( ( rule__Exists__NamesAssignment_2_1 ) ) ;
    public final void rule__Exists__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2597:1: ( ( ( rule__Exists__NamesAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2598:1: ( ( rule__Exists__NamesAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2598:1: ( ( rule__Exists__NamesAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2599:1: ( rule__Exists__NamesAssignment_2_1 )
            {
             before(grammarAccess.getExistsAccess().getNamesAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2600:1: ( rule__Exists__NamesAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2600:2: rule__Exists__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Exists__NamesAssignment_2_1_in_rule__Exists__Group_2__1__Impl5328);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2614:1: rule__Forall__Group__0 : rule__Forall__Group__0__Impl rule__Forall__Group__1 ;
    public final void rule__Forall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2618:1: ( rule__Forall__Group__0__Impl rule__Forall__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2619:2: rule__Forall__Group__0__Impl rule__Forall__Group__1
            {
            pushFollow(FOLLOW_rule__Forall__Group__0__Impl_in_rule__Forall__Group__05362);
            rule__Forall__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group__1_in_rule__Forall__Group__05365);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2626:1: rule__Forall__Group__0__Impl : ( '[' ) ;
    public final void rule__Forall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2630:1: ( ( '[' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2631:1: ( '[' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2631:1: ( '[' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2632:1: '['
            {
             before(grammarAccess.getForallAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__Forall__Group__0__Impl5393); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2645:1: rule__Forall__Group__1 : rule__Forall__Group__1__Impl rule__Forall__Group__2 ;
    public final void rule__Forall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2649:1: ( rule__Forall__Group__1__Impl rule__Forall__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2650:2: rule__Forall__Group__1__Impl rule__Forall__Group__2
            {
            pushFollow(FOLLOW_rule__Forall__Group__1__Impl_in_rule__Forall__Group__15424);
            rule__Forall__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group__2_in_rule__Forall__Group__15427);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2657:1: rule__Forall__Group__1__Impl : ( ( rule__Forall__NamesAssignment_1 ) ) ;
    public final void rule__Forall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2661:1: ( ( ( rule__Forall__NamesAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2662:1: ( ( rule__Forall__NamesAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2662:1: ( ( rule__Forall__NamesAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2663:1: ( rule__Forall__NamesAssignment_1 )
            {
             before(grammarAccess.getForallAccess().getNamesAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2664:1: ( rule__Forall__NamesAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2664:2: rule__Forall__NamesAssignment_1
            {
            pushFollow(FOLLOW_rule__Forall__NamesAssignment_1_in_rule__Forall__Group__1__Impl5454);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2674:1: rule__Forall__Group__2 : rule__Forall__Group__2__Impl rule__Forall__Group__3 ;
    public final void rule__Forall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2678:1: ( rule__Forall__Group__2__Impl rule__Forall__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2679:2: rule__Forall__Group__2__Impl rule__Forall__Group__3
            {
            pushFollow(FOLLOW_rule__Forall__Group__2__Impl_in_rule__Forall__Group__25484);
            rule__Forall__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group__3_in_rule__Forall__Group__25487);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2686:1: rule__Forall__Group__2__Impl : ( ( rule__Forall__Group_2__0 )* ) ;
    public final void rule__Forall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2690:1: ( ( ( rule__Forall__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2691:1: ( ( rule__Forall__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2691:1: ( ( rule__Forall__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2692:1: ( rule__Forall__Group_2__0 )*
            {
             before(grammarAccess.getForallAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2693:1: ( rule__Forall__Group_2__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2693:2: rule__Forall__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Forall__Group_2__0_in_rule__Forall__Group__2__Impl5514);
            	    rule__Forall__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2703:1: rule__Forall__Group__3 : rule__Forall__Group__3__Impl ;
    public final void rule__Forall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2707:1: ( rule__Forall__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2708:2: rule__Forall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Forall__Group__3__Impl_in_rule__Forall__Group__35545);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2714:1: rule__Forall__Group__3__Impl : ( ']' ) ;
    public final void rule__Forall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2718:1: ( ( ']' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2719:1: ( ']' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2719:1: ( ']' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2720:1: ']'
            {
             before(grammarAccess.getForallAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_27_in_rule__Forall__Group__3__Impl5573); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2741:1: rule__Forall__Group_2__0 : rule__Forall__Group_2__0__Impl rule__Forall__Group_2__1 ;
    public final void rule__Forall__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2745:1: ( rule__Forall__Group_2__0__Impl rule__Forall__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2746:2: rule__Forall__Group_2__0__Impl rule__Forall__Group_2__1
            {
            pushFollow(FOLLOW_rule__Forall__Group_2__0__Impl_in_rule__Forall__Group_2__05612);
            rule__Forall__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group_2__1_in_rule__Forall__Group_2__05615);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2753:1: rule__Forall__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Forall__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2757:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2758:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2758:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2759:1: ','
            {
             before(grammarAccess.getForallAccess().getCommaKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Forall__Group_2__0__Impl5643); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2772:1: rule__Forall__Group_2__1 : rule__Forall__Group_2__1__Impl ;
    public final void rule__Forall__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2776:1: ( rule__Forall__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2777:2: rule__Forall__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Forall__Group_2__1__Impl_in_rule__Forall__Group_2__15674);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2783:1: rule__Forall__Group_2__1__Impl : ( ( rule__Forall__NamesAssignment_2_1 ) ) ;
    public final void rule__Forall__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2787:1: ( ( ( rule__Forall__NamesAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2788:1: ( ( rule__Forall__NamesAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2788:1: ( ( rule__Forall__NamesAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2789:1: ( rule__Forall__NamesAssignment_2_1 )
            {
             before(grammarAccess.getForallAccess().getNamesAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2790:1: ( rule__Forall__NamesAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2790:2: rule__Forall__NamesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Forall__NamesAssignment_2_1_in_rule__Forall__Group_2__1__Impl5701);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2804:1: rule__AssignmentOp__Group__0 : rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 ;
    public final void rule__AssignmentOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2808:1: ( rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2809:2: rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__0__Impl_in_rule__AssignmentOp__Group__05735);
            rule__AssignmentOp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group__1_in_rule__AssignmentOp__Group__05738);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2816:1: rule__AssignmentOp__Group__0__Impl : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2820:1: ( ( ruleOrExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2821:1: ( ruleOrExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2821:1: ( ruleOrExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2822:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExp_in_rule__AssignmentOp__Group__0__Impl5765);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2833:1: rule__AssignmentOp__Group__1 : rule__AssignmentOp__Group__1__Impl ;
    public final void rule__AssignmentOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2837:1: ( rule__AssignmentOp__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2838:2: rule__AssignmentOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__1__Impl_in_rule__AssignmentOp__Group__15794);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2844:1: rule__AssignmentOp__Group__1__Impl : ( ( rule__AssignmentOp__Group_1__0 )? ) ;
    public final void rule__AssignmentOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2848:1: ( ( ( rule__AssignmentOp__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2849:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2849:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2850:1: ( rule__AssignmentOp__Group_1__0 )?
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2851:1: ( rule__AssignmentOp__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=28 && LA24_0<=29)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2851:2: rule__AssignmentOp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1__0_in_rule__AssignmentOp__Group__1__Impl5821);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2865:1: rule__AssignmentOp__Group_1__0 : rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 ;
    public final void rule__AssignmentOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2869:1: ( rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2870:2: rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__0__Impl_in_rule__AssignmentOp__Group_1__05856);
            rule__AssignmentOp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__1_in_rule__AssignmentOp__Group_1__05859);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2877:1: rule__AssignmentOp__Group_1__0__Impl : ( ( rule__AssignmentOp__Alternatives_1_0 ) ) ;
    public final void rule__AssignmentOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2881:1: ( ( ( rule__AssignmentOp__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2882:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2882:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2883:1: ( rule__AssignmentOp__Alternatives_1_0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2884:1: ( rule__AssignmentOp__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2884:2: rule__AssignmentOp__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Alternatives_1_0_in_rule__AssignmentOp__Group_1__0__Impl5886);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2894:1: rule__AssignmentOp__Group_1__1 : rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2 ;
    public final void rule__AssignmentOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2898:1: ( rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2899:2: rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__1__Impl_in_rule__AssignmentOp__Group_1__15916);
            rule__AssignmentOp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__2_in_rule__AssignmentOp__Group_1__15919);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2906:1: rule__AssignmentOp__Group_1__1__Impl : ( ( rule__AssignmentOp__QualifiersAssignment_1_1 )* ) ;
    public final void rule__AssignmentOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2910:1: ( ( ( rule__AssignmentOp__QualifiersAssignment_1_1 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2911:1: ( ( rule__AssignmentOp__QualifiersAssignment_1_1 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2911:1: ( ( rule__AssignmentOp__QualifiersAssignment_1_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2912:1: ( rule__AssignmentOp__QualifiersAssignment_1_1 )*
            {
             before(grammarAccess.getAssignmentOpAccess().getQualifiersAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2913:1: ( rule__AssignmentOp__QualifiersAssignment_1_1 )*
            loop25:
            do {
                int alt25=2;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2913:2: rule__AssignmentOp__QualifiersAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_rule__AssignmentOp__QualifiersAssignment_1_1_in_rule__AssignmentOp__Group_1__1__Impl5946);
            	    rule__AssignmentOp__QualifiersAssignment_1_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2923:1: rule__AssignmentOp__Group_1__2 : rule__AssignmentOp__Group_1__2__Impl ;
    public final void rule__AssignmentOp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2927:1: ( rule__AssignmentOp__Group_1__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2928:2: rule__AssignmentOp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__2__Impl_in_rule__AssignmentOp__Group_1__25977);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2934:1: rule__AssignmentOp__Group_1__2__Impl : ( ( rule__AssignmentOp__RightAssignment_1_2 ) ) ;
    public final void rule__AssignmentOp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2938:1: ( ( ( rule__AssignmentOp__RightAssignment_1_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2939:1: ( ( rule__AssignmentOp__RightAssignment_1_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2939:1: ( ( rule__AssignmentOp__RightAssignment_1_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2940:1: ( rule__AssignmentOp__RightAssignment_1_2 )
            {
             before(grammarAccess.getAssignmentOpAccess().getRightAssignment_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2941:1: ( rule__AssignmentOp__RightAssignment_1_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2941:2: rule__AssignmentOp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AssignmentOp__RightAssignment_1_2_in_rule__AssignmentOp__Group_1__2__Impl6004);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2957:1: rule__AssignmentOp__Group_1_0_0__0 : rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 ;
    public final void rule__AssignmentOp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2961:1: ( rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2962:2: rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__0__Impl_in_rule__AssignmentOp__Group_1_0_0__06040);
            rule__AssignmentOp__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__1_in_rule__AssignmentOp__Group_1_0_0__06043);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2969:1: rule__AssignmentOp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2973:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2974:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2974:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2975:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2976:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2978:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2988:1: rule__AssignmentOp__Group_1_0_0__1 : rule__AssignmentOp__Group_1_0_0__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2992:1: ( rule__AssignmentOp__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2993:2: rule__AssignmentOp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__1__Impl_in_rule__AssignmentOp__Group_1_0_0__16101);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2999:1: rule__AssignmentOp__Group_1_0_0__1__Impl : ( '->' ) ;
    public final void rule__AssignmentOp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3003:1: ( ( '->' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3004:1: ( '->' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3004:1: ( '->' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3005:1: '->'
            {
             before(grammarAccess.getAssignmentOpAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1()); 
            match(input,28,FOLLOW_28_in_rule__AssignmentOp__Group_1_0_0__1__Impl6129); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3022:1: rule__AssignmentOp__Group_1_0_1__0 : rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 ;
    public final void rule__AssignmentOp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3026:1: ( rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3027:2: rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__0__Impl_in_rule__AssignmentOp__Group_1_0_1__06164);
            rule__AssignmentOp__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__1_in_rule__AssignmentOp__Group_1_0_1__06167);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3034:1: rule__AssignmentOp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3038:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3039:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3039:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3040:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3041:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3043:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3053:1: rule__AssignmentOp__Group_1_0_1__1 : rule__AssignmentOp__Group_1_0_1__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3057:1: ( rule__AssignmentOp__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3058:2: rule__AssignmentOp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__1__Impl_in_rule__AssignmentOp__Group_1_0_1__16225);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3064:1: rule__AssignmentOp__Group_1_0_1__1__Impl : ( '<->' ) ;
    public final void rule__AssignmentOp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3068:1: ( ( '<->' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3069:1: ( '<->' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3069:1: ( '<->' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3070:1: '<->'
            {
             before(grammarAccess.getAssignmentOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1()); 
            match(input,29,FOLLOW_29_in_rule__AssignmentOp__Group_1_0_1__1__Impl6253); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3087:1: rule__OrExp__Group__0 : rule__OrExp__Group__0__Impl rule__OrExp__Group__1 ;
    public final void rule__OrExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3091:1: ( rule__OrExp__Group__0__Impl rule__OrExp__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3092:2: rule__OrExp__Group__0__Impl rule__OrExp__Group__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__06288);
            rule__OrExp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__06291);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3099:1: rule__OrExp__Group__0__Impl : ( ruleAndExp ) ;
    public final void rule__OrExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3103:1: ( ( ruleAndExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3104:1: ( ruleAndExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3104:1: ( ruleAndExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3105:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__Group__0__Impl6318);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3116:1: rule__OrExp__Group__1 : rule__OrExp__Group__1__Impl ;
    public final void rule__OrExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3120:1: ( rule__OrExp__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3121:2: rule__OrExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__16347);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3127:1: rule__OrExp__Group__1__Impl : ( ( rule__OrExp__Group_1__0 )* ) ;
    public final void rule__OrExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3131:1: ( ( ( rule__OrExp__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3132:1: ( ( rule__OrExp__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3132:1: ( ( rule__OrExp__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3133:1: ( rule__OrExp__Group_1__0 )*
            {
             before(grammarAccess.getOrExpAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3134:1: ( rule__OrExp__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3134:2: rule__OrExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl6374);
            	    rule__OrExp__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3148:1: rule__OrExp__Group_1__0 : rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 ;
    public final void rule__OrExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3152:1: ( rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3153:2: rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__06409);
            rule__OrExp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__06412);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3160:1: rule__OrExp__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3164:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3165:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3165:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3166:1: ()
            {
             before(grammarAccess.getOrExpAccess().getOrLeftAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3167:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3169:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3179:1: rule__OrExp__Group_1__1 : rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 ;
    public final void rule__OrExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3183:1: ( rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3184:2: rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__16470);
            rule__OrExp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__2_in_rule__OrExp__Group_1__16473);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3191:1: rule__OrExp__Group_1__1__Impl : ( '|' ) ;
    public final void rule__OrExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3195:1: ( ( '|' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3196:1: ( '|' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3196:1: ( '|' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3197:1: '|'
            {
             before(grammarAccess.getOrExpAccess().getVerticalLineKeyword_1_1()); 
            match(input,30,FOLLOW_30_in_rule__OrExp__Group_1__1__Impl6501); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3210:1: rule__OrExp__Group_1__2 : rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3 ;
    public final void rule__OrExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3214:1: ( rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3215:2: rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__2__Impl_in_rule__OrExp__Group_1__26532);
            rule__OrExp__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__3_in_rule__OrExp__Group_1__26535);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3222:1: rule__OrExp__Group_1__2__Impl : ( ( rule__OrExp__QualifiersAssignment_1_2 )* ) ;
    public final void rule__OrExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3226:1: ( ( ( rule__OrExp__QualifiersAssignment_1_2 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3227:1: ( ( rule__OrExp__QualifiersAssignment_1_2 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3227:1: ( ( rule__OrExp__QualifiersAssignment_1_2 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3228:1: ( rule__OrExp__QualifiersAssignment_1_2 )*
            {
             before(grammarAccess.getOrExpAccess().getQualifiersAssignment_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3229:1: ( rule__OrExp__QualifiersAssignment_1_2 )*
            loop27:
            do {
                int alt27=2;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3229:2: rule__OrExp__QualifiersAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__OrExp__QualifiersAssignment_1_2_in_rule__OrExp__Group_1__2__Impl6562);
            	    rule__OrExp__QualifiersAssignment_1_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3239:1: rule__OrExp__Group_1__3 : rule__OrExp__Group_1__3__Impl ;
    public final void rule__OrExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3243:1: ( rule__OrExp__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3244:2: rule__OrExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__3__Impl_in_rule__OrExp__Group_1__36593);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3250:1: rule__OrExp__Group_1__3__Impl : ( ( rule__OrExp__RightAssignment_1_3 ) ) ;
    public final void rule__OrExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3254:1: ( ( ( rule__OrExp__RightAssignment_1_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3255:1: ( ( rule__OrExp__RightAssignment_1_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3255:1: ( ( rule__OrExp__RightAssignment_1_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3256:1: ( rule__OrExp__RightAssignment_1_3 )
            {
             before(grammarAccess.getOrExpAccess().getRightAssignment_1_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3257:1: ( rule__OrExp__RightAssignment_1_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3257:2: rule__OrExp__RightAssignment_1_3
            {
            pushFollow(FOLLOW_rule__OrExp__RightAssignment_1_3_in_rule__OrExp__Group_1__3__Impl6620);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3275:1: rule__AndExp__Group__0 : rule__AndExp__Group__0__Impl rule__AndExp__Group__1 ;
    public final void rule__AndExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3279:1: ( rule__AndExp__Group__0__Impl rule__AndExp__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3280:2: rule__AndExp__Group__0__Impl rule__AndExp__Group__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__06658);
            rule__AndExp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__06661);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3287:1: rule__AndExp__Group__0__Impl : ( ruleRelational ) ;
    public final void rule__AndExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3291:1: ( ( ruleRelational ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3292:1: ( ruleRelational )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3292:1: ( ruleRelational )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3293:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRelational_in_rule__AndExp__Group__0__Impl6688);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3304:1: rule__AndExp__Group__1 : rule__AndExp__Group__1__Impl ;
    public final void rule__AndExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3308:1: ( rule__AndExp__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3309:2: rule__AndExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__16717);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3315:1: rule__AndExp__Group__1__Impl : ( ( rule__AndExp__Group_1__0 )* ) ;
    public final void rule__AndExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3319:1: ( ( ( rule__AndExp__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3320:1: ( ( rule__AndExp__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3320:1: ( ( rule__AndExp__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3321:1: ( rule__AndExp__Group_1__0 )*
            {
             before(grammarAccess.getAndExpAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3322:1: ( rule__AndExp__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==31) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3322:2: rule__AndExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl6744);
            	    rule__AndExp__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3336:1: rule__AndExp__Group_1__0 : rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 ;
    public final void rule__AndExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3340:1: ( rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3341:2: rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__06779);
            rule__AndExp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__06782);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3348:1: rule__AndExp__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3352:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3353:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3353:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3354:1: ()
            {
             before(grammarAccess.getAndExpAccess().getAndLeftAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3355:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3357:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3367:1: rule__AndExp__Group_1__1 : rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 ;
    public final void rule__AndExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3371:1: ( rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3372:2: rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__16840);
            rule__AndExp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__2_in_rule__AndExp__Group_1__16843);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3379:1: rule__AndExp__Group_1__1__Impl : ( '&' ) ;
    public final void rule__AndExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3383:1: ( ( '&' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3384:1: ( '&' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3384:1: ( '&' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3385:1: '&'
            {
             before(grammarAccess.getAndExpAccess().getAmpersandKeyword_1_1()); 
            match(input,31,FOLLOW_31_in_rule__AndExp__Group_1__1__Impl6871); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3398:1: rule__AndExp__Group_1__2 : rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3 ;
    public final void rule__AndExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3402:1: ( rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3403:2: rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__2__Impl_in_rule__AndExp__Group_1__26902);
            rule__AndExp__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__3_in_rule__AndExp__Group_1__26905);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3410:1: rule__AndExp__Group_1__2__Impl : ( ( rule__AndExp__QualifiersAssignment_1_2 )* ) ;
    public final void rule__AndExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3414:1: ( ( ( rule__AndExp__QualifiersAssignment_1_2 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3415:1: ( ( rule__AndExp__QualifiersAssignment_1_2 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3415:1: ( ( rule__AndExp__QualifiersAssignment_1_2 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3416:1: ( rule__AndExp__QualifiersAssignment_1_2 )*
            {
             before(grammarAccess.getAndExpAccess().getQualifiersAssignment_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3417:1: ( rule__AndExp__QualifiersAssignment_1_2 )*
            loop29:
            do {
                int alt29=2;
                alt29 = dfa29.predict(input);
                switch (alt29) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3417:2: rule__AndExp__QualifiersAssignment_1_2
            	    {
            	    pushFollow(FOLLOW_rule__AndExp__QualifiersAssignment_1_2_in_rule__AndExp__Group_1__2__Impl6932);
            	    rule__AndExp__QualifiersAssignment_1_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3427:1: rule__AndExp__Group_1__3 : rule__AndExp__Group_1__3__Impl ;
    public final void rule__AndExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3431:1: ( rule__AndExp__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3432:2: rule__AndExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__3__Impl_in_rule__AndExp__Group_1__36963);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3438:1: rule__AndExp__Group_1__3__Impl : ( ( rule__AndExp__RightAssignment_1_3 ) ) ;
    public final void rule__AndExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3442:1: ( ( ( rule__AndExp__RightAssignment_1_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3443:1: ( ( rule__AndExp__RightAssignment_1_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3443:1: ( ( rule__AndExp__RightAssignment_1_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3444:1: ( rule__AndExp__RightAssignment_1_3 )
            {
             before(grammarAccess.getAndExpAccess().getRightAssignment_1_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3445:1: ( rule__AndExp__RightAssignment_1_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3445:2: rule__AndExp__RightAssignment_1_3
            {
            pushFollow(FOLLOW_rule__AndExp__RightAssignment_1_3_in_rule__AndExp__Group_1__3__Impl6990);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3463:1: rule__Relational__Group__0 : rule__Relational__Group__0__Impl rule__Relational__Group__1 ;
    public final void rule__Relational__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3467:1: ( rule__Relational__Group__0__Impl rule__Relational__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3468:2: rule__Relational__Group__0__Impl rule__Relational__Group__1
            {
            pushFollow(FOLLOW_rule__Relational__Group__0__Impl_in_rule__Relational__Group__07028);
            rule__Relational__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group__1_in_rule__Relational__Group__07031);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3475:1: rule__Relational__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relational__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3479:1: ( ( ruleAddition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3480:1: ( ruleAddition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3480:1: ( ruleAddition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3481:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relational__Group__0__Impl7058);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3492:1: rule__Relational__Group__1 : rule__Relational__Group__1__Impl ;
    public final void rule__Relational__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3496:1: ( rule__Relational__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3497:2: rule__Relational__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group__1__Impl_in_rule__Relational__Group__17087);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3503:1: rule__Relational__Group__1__Impl : ( ( rule__Relational__Group_1__0 )? ) ;
    public final void rule__Relational__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3507:1: ( ( ( rule__Relational__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3508:1: ( ( rule__Relational__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3508:1: ( ( rule__Relational__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3509:1: ( rule__Relational__Group_1__0 )?
            {
             before(grammarAccess.getRelationalAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3510:1: ( rule__Relational__Group_1__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=32 && LA30_0<=38)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3510:2: rule__Relational__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1__0_in_rule__Relational__Group__1__Impl7114);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3524:1: rule__Relational__Group_1__0 : rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 ;
    public final void rule__Relational__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3528:1: ( rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3529:2: rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1__0__Impl_in_rule__Relational__Group_1__07149);
            rule__Relational__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1__1_in_rule__Relational__Group_1__07152);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3536:1: rule__Relational__Group_1__0__Impl : ( ( rule__Relational__Alternatives_1_0 ) ) ;
    public final void rule__Relational__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3540:1: ( ( ( rule__Relational__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3541:1: ( ( rule__Relational__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3541:1: ( ( rule__Relational__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3542:1: ( rule__Relational__Alternatives_1_0 )
            {
             before(grammarAccess.getRelationalAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3543:1: ( rule__Relational__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3543:2: rule__Relational__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Relational__Alternatives_1_0_in_rule__Relational__Group_1__0__Impl7179);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3553:1: rule__Relational__Group_1__1 : rule__Relational__Group_1__1__Impl ;
    public final void rule__Relational__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3557:1: ( rule__Relational__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3558:2: rule__Relational__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1__1__Impl_in_rule__Relational__Group_1__17209);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3564:1: rule__Relational__Group_1__1__Impl : ( ( rule__Relational__RightAssignment_1_1 ) ) ;
    public final void rule__Relational__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3568:1: ( ( ( rule__Relational__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3569:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3569:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3570:1: ( rule__Relational__RightAssignment_1_1 )
            {
             before(grammarAccess.getRelationalAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3571:1: ( rule__Relational__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3571:2: rule__Relational__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Relational__RightAssignment_1_1_in_rule__Relational__Group_1__1__Impl7236);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3585:1: rule__Relational__Group_1_0_0__0 : rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 ;
    public final void rule__Relational__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3589:1: ( rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3590:2: rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__0__Impl_in_rule__Relational__Group_1_0_0__07270);
            rule__Relational__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__1_in_rule__Relational__Group_1_0_0__07273);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3597:1: rule__Relational__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3601:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3602:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3602:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3603:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3604:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3606:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3616:1: rule__Relational__Group_1_0_0__1 : rule__Relational__Group_1_0_0__1__Impl ;
    public final void rule__Relational__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3620:1: ( rule__Relational__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3621:2: rule__Relational__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__1__Impl_in_rule__Relational__Group_1_0_0__17331);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3627:1: rule__Relational__Group_1_0_0__1__Impl : ( '!=' ) ;
    public final void rule__Relational__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3631:1: ( ( '!=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3632:1: ( '!=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3632:1: ( '!=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3633:1: '!='
            {
             before(grammarAccess.getRelationalAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1()); 
            match(input,32,FOLLOW_32_in_rule__Relational__Group_1_0_0__1__Impl7359); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3650:1: rule__Relational__Group_1_0_1__0 : rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 ;
    public final void rule__Relational__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3654:1: ( rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3655:2: rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__0__Impl_in_rule__Relational__Group_1_0_1__07394);
            rule__Relational__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__1_in_rule__Relational__Group_1_0_1__07397);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3662:1: rule__Relational__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3666:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3667:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3667:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3668:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3669:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3671:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3681:1: rule__Relational__Group_1_0_1__1 : rule__Relational__Group_1_0_1__1__Impl ;
    public final void rule__Relational__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3685:1: ( rule__Relational__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3686:2: rule__Relational__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__1__Impl_in_rule__Relational__Group_1_0_1__17455);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3692:1: rule__Relational__Group_1_0_1__1__Impl : ( '==' ) ;
    public final void rule__Relational__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3696:1: ( ( '==' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3697:1: ( '==' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3697:1: ( '==' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3698:1: '=='
            {
             before(grammarAccess.getRelationalAccess().getEqualsSignEqualsSignKeyword_1_0_1_1()); 
            match(input,33,FOLLOW_33_in_rule__Relational__Group_1_0_1__1__Impl7483); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3715:1: rule__Relational__Group_1_0_2__0 : rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 ;
    public final void rule__Relational__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3719:1: ( rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3720:2: rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__0__Impl_in_rule__Relational__Group_1_0_2__07518);
            rule__Relational__Group_1_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__1_in_rule__Relational__Group_1_0_2__07521);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3727:1: rule__Relational__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3731:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3732:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3732:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3733:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3734:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3736:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3746:1: rule__Relational__Group_1_0_2__1 : rule__Relational__Group_1_0_2__1__Impl ;
    public final void rule__Relational__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3750:1: ( rule__Relational__Group_1_0_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3751:2: rule__Relational__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__1__Impl_in_rule__Relational__Group_1_0_2__17579);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3757:1: rule__Relational__Group_1_0_2__1__Impl : ( '>=' ) ;
    public final void rule__Relational__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3761:1: ( ( '>=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3762:1: ( '>=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3762:1: ( '>=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3763:1: '>='
            {
             before(grammarAccess.getRelationalAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1()); 
            match(input,34,FOLLOW_34_in_rule__Relational__Group_1_0_2__1__Impl7607); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3780:1: rule__Relational__Group_1_0_3__0 : rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 ;
    public final void rule__Relational__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3784:1: ( rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3785:2: rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__0__Impl_in_rule__Relational__Group_1_0_3__07642);
            rule__Relational__Group_1_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__1_in_rule__Relational__Group_1_0_3__07645);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3792:1: rule__Relational__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3796:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3797:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3797:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3798:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3799:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3801:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3811:1: rule__Relational__Group_1_0_3__1 : rule__Relational__Group_1_0_3__1__Impl ;
    public final void rule__Relational__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3815:1: ( rule__Relational__Group_1_0_3__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3816:2: rule__Relational__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__1__Impl_in_rule__Relational__Group_1_0_3__17703);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3822:1: rule__Relational__Group_1_0_3__1__Impl : ( '<=' ) ;
    public final void rule__Relational__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3826:1: ( ( '<=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3827:1: ( '<=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3827:1: ( '<=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3828:1: '<='
            {
             before(grammarAccess.getRelationalAccess().getLessThanSignEqualsSignKeyword_1_0_3_1()); 
            match(input,35,FOLLOW_35_in_rule__Relational__Group_1_0_3__1__Impl7731); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3845:1: rule__Relational__Group_1_0_4__0 : rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 ;
    public final void rule__Relational__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3849:1: ( rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3850:2: rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__0__Impl_in_rule__Relational__Group_1_0_4__07766);
            rule__Relational__Group_1_0_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__1_in_rule__Relational__Group_1_0_4__07769);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3857:1: rule__Relational__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3861:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3862:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3862:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3863:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3864:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3866:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3876:1: rule__Relational__Group_1_0_4__1 : rule__Relational__Group_1_0_4__1__Impl ;
    public final void rule__Relational__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3880:1: ( rule__Relational__Group_1_0_4__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3881:2: rule__Relational__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__1__Impl_in_rule__Relational__Group_1_0_4__17827);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3887:1: rule__Relational__Group_1_0_4__1__Impl : ( '=' ) ;
    public final void rule__Relational__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3891:1: ( ( '=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3892:1: ( '=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3892:1: ( '=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3893:1: '='
            {
             before(grammarAccess.getRelationalAccess().getEqualsSignKeyword_1_0_4_1()); 
            match(input,36,FOLLOW_36_in_rule__Relational__Group_1_0_4__1__Impl7855); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3910:1: rule__Relational__Group_1_0_5__0 : rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 ;
    public final void rule__Relational__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3914:1: ( rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3915:2: rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__0__Impl_in_rule__Relational__Group_1_0_5__07890);
            rule__Relational__Group_1_0_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__1_in_rule__Relational__Group_1_0_5__07893);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3922:1: rule__Relational__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3926:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3927:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3927:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3928:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3929:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3931:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3941:1: rule__Relational__Group_1_0_5__1 : rule__Relational__Group_1_0_5__1__Impl ;
    public final void rule__Relational__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3945:1: ( rule__Relational__Group_1_0_5__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3946:2: rule__Relational__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__1__Impl_in_rule__Relational__Group_1_0_5__17951);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3952:1: rule__Relational__Group_1_0_5__1__Impl : ( '<' ) ;
    public final void rule__Relational__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3956:1: ( ( '<' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3957:1: ( '<' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3957:1: ( '<' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3958:1: '<'
            {
             before(grammarAccess.getRelationalAccess().getLessThanSignKeyword_1_0_5_1()); 
            match(input,37,FOLLOW_37_in_rule__Relational__Group_1_0_5__1__Impl7979); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3975:1: rule__Relational__Group_1_0_6__0 : rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 ;
    public final void rule__Relational__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3979:1: ( rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3980:2: rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__0__Impl_in_rule__Relational__Group_1_0_6__08014);
            rule__Relational__Group_1_0_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__1_in_rule__Relational__Group_1_0_6__08017);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3987:1: rule__Relational__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3991:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3992:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3992:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3993:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3994:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3996:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4006:1: rule__Relational__Group_1_0_6__1 : rule__Relational__Group_1_0_6__1__Impl ;
    public final void rule__Relational__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4010:1: ( rule__Relational__Group_1_0_6__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4011:2: rule__Relational__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__1__Impl_in_rule__Relational__Group_1_0_6__18075);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4017:1: rule__Relational__Group_1_0_6__1__Impl : ( '>' ) ;
    public final void rule__Relational__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4021:1: ( ( '>' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4022:1: ( '>' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4022:1: ( '>' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4023:1: '>'
            {
             before(grammarAccess.getRelationalAccess().getGreaterThanSignKeyword_1_0_6_1()); 
            match(input,38,FOLLOW_38_in_rule__Relational__Group_1_0_6__1__Impl8103); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4040:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4044:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4045:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__08138);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__08141);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4052:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4056:1: ( ( ruleMultiplication ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4057:1: ( ruleMultiplication )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4057:1: ( ruleMultiplication )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4058:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl8168);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4069:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4073:1: ( rule__Addition__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4074:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__18197);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4080:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4084:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4085:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4085:1: ( ( rule__Addition__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4086:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4087:1: ( rule__Addition__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=39 && LA31_0<=40)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4087:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl8224);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4101:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4105:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4106:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__08259);
            rule__Addition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__08262);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4113:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4117:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4118:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4118:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4119:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4120:1: ( rule__Addition__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4120:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl8289);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4130:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4134:1: ( rule__Addition__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4135:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__18319);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4141:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4145:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4146:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4146:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4147:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4148:1: ( rule__Addition__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4148:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl8346);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4162:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4166:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4167:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__08380);
            rule__Addition__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__08383);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4174:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4178:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4179:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4179:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4180:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4181:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4183:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4193:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4197:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4198:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__18441);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4204:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4208:1: ( ( '+' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4209:1: ( '+' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4209:1: ( '+' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4210:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,39,FOLLOW_39_in_rule__Addition__Group_1_0_0__1__Impl8469); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4227:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4231:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4232:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__08504);
            rule__Addition__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__08507);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4239:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4243:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4244:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4244:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4245:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4246:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4248:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4258:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4262:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4263:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__18565);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4269:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4273:1: ( ( '-' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4274:1: ( '-' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4274:1: ( '-' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4275:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,40,FOLLOW_40_in_rule__Addition__Group_1_0_1__1__Impl8593); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4292:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4296:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4297:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__08628);
            rule__Multiplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__08631);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4304:1: rule__Multiplication__Group__0__Impl : ( rulePower ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4308:1: ( ( rulePower ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4309:1: ( rulePower )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4309:1: ( rulePower )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4310:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl8658);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4321:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4325:1: ( rule__Multiplication__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4326:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__18687);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4332:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4336:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4337:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4337:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4338:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4339:1: ( rule__Multiplication__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=41 && LA32_0<=42)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4339:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl8714);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4353:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4357:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4358:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__08749);
            rule__Multiplication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__08752);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4365:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4369:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4370:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4370:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4371:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4372:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4372:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl8779);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4382:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4386:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4387:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__18809);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4393:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4397:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4398:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4398:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4399:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4400:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4400:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl8836);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4414:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4418:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4419:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__08870);
            rule__Multiplication__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__08873);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4426:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4430:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4431:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4431:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4432:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4433:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4435:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4445:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4449:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4450:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__18931);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4456:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4460:1: ( ( '*' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4461:1: ( '*' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4461:1: ( '*' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4462:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,41,FOLLOW_41_in_rule__Multiplication__Group_1_0_0__1__Impl8959); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4479:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4483:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4484:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__08994);
            rule__Multiplication__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__08997);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4491:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4495:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4496:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4496:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4497:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4498:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4500:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4510:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4514:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4515:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__19055);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4521:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4525:1: ( ( '/' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4526:1: ( '/' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4526:1: ( '/' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4527:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,42,FOLLOW_42_in_rule__Multiplication__Group_1_0_1__1__Impl9083); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4544:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4548:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4549:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__09118);
            rule__Power__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group__1_in_rule__Power__Group__09121);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4556:1: rule__Power__Group__0__Impl : ( ruleUnaryExpr ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4560:1: ( ( ruleUnaryExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4561:1: ( ruleUnaryExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4561:1: ( ruleUnaryExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4562:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__Power__Group__0__Impl9148);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4573:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4577:1: ( rule__Power__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4578:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__19177);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4584:1: rule__Power__Group__1__Impl : ( ( rule__Power__Group_1__0 )* ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4588:1: ( ( ( rule__Power__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4589:1: ( ( rule__Power__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4589:1: ( ( rule__Power__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4590:1: ( rule__Power__Group_1__0 )*
            {
             before(grammarAccess.getPowerAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4591:1: ( rule__Power__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4591:2: rule__Power__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl9204);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4605:1: rule__Power__Group_1__0 : rule__Power__Group_1__0__Impl rule__Power__Group_1__1 ;
    public final void rule__Power__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4609:1: ( rule__Power__Group_1__0__Impl rule__Power__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4610:2: rule__Power__Group_1__0__Impl rule__Power__Group_1__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__09239);
            rule__Power__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__09242);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4617:1: rule__Power__Group_1__0__Impl : ( ( rule__Power__Group_1_0__0 ) ) ;
    public final void rule__Power__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4621:1: ( ( ( rule__Power__Group_1_0__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4622:1: ( ( rule__Power__Group_1_0__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4622:1: ( ( rule__Power__Group_1_0__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4623:1: ( rule__Power__Group_1_0__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4624:1: ( rule__Power__Group_1_0__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4624:2: rule__Power__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl9269);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4634:1: rule__Power__Group_1__1 : rule__Power__Group_1__1__Impl ;
    public final void rule__Power__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4638:1: ( rule__Power__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4639:2: rule__Power__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__19299);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4645:1: rule__Power__Group_1__1__Impl : ( ( rule__Power__RightAssignment_1_1 ) ) ;
    public final void rule__Power__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4649:1: ( ( ( rule__Power__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4650:1: ( ( rule__Power__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4650:1: ( ( rule__Power__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4651:1: ( rule__Power__RightAssignment_1_1 )
            {
             before(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4652:1: ( rule__Power__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4652:2: rule__Power__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl9326);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4666:1: rule__Power__Group_1_0__0 : rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 ;
    public final void rule__Power__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4670:1: ( rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4671:2: rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__09360);
            rule__Power__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__09363);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4678:1: rule__Power__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Power__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4682:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4683:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4683:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4684:1: ()
            {
             before(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4685:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4687:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4697:1: rule__Power__Group_1_0__1 : rule__Power__Group_1_0__1__Impl ;
    public final void rule__Power__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4701:1: ( rule__Power__Group_1_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4702:2: rule__Power__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__19421);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4708:1: rule__Power__Group_1_0__1__Impl : ( '^' ) ;
    public final void rule__Power__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4712:1: ( ( '^' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4713:1: ( '^' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4713:1: ( '^' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4714:1: '^'
            {
             before(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
            match(input,43,FOLLOW_43_in_rule__Power__Group_1_0__1__Impl9449); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4731:1: rule__UnaryExpr__Group__0 : rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 ;
    public final void rule__UnaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4735:1: ( rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4736:2: rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__0__Impl_in_rule__UnaryExpr__Group__09484);
            rule__UnaryExpr__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group__1_in_rule__UnaryExpr__Group__09487);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4743:1: rule__UnaryExpr__Group__0__Impl : ( ( rule__UnaryExpr__OpAssignment_0 )? ) ;
    public final void rule__UnaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4747:1: ( ( ( rule__UnaryExpr__OpAssignment_0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4748:1: ( ( rule__UnaryExpr__OpAssignment_0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4748:1: ( ( rule__UnaryExpr__OpAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4749:1: ( rule__UnaryExpr__OpAssignment_0 )?
            {
             before(grammarAccess.getUnaryExprAccess().getOpAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4750:1: ( rule__UnaryExpr__OpAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==12) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4750:2: rule__UnaryExpr__OpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpr__OpAssignment_0_in_rule__UnaryExpr__Group__0__Impl9514);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4760:1: rule__UnaryExpr__Group__1 : rule__UnaryExpr__Group__1__Impl rule__UnaryExpr__Group__2 ;
    public final void rule__UnaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4764:1: ( rule__UnaryExpr__Group__1__Impl rule__UnaryExpr__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4765:2: rule__UnaryExpr__Group__1__Impl rule__UnaryExpr__Group__2
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__1__Impl_in_rule__UnaryExpr__Group__19545);
            rule__UnaryExpr__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group__2_in_rule__UnaryExpr__Group__19548);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4772:1: rule__UnaryExpr__Group__1__Impl : ( ( rule__UnaryExpr__QualifiersAssignment_1 )* ) ;
    public final void rule__UnaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4776:1: ( ( ( rule__UnaryExpr__QualifiersAssignment_1 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4777:1: ( ( rule__UnaryExpr__QualifiersAssignment_1 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4777:1: ( ( rule__UnaryExpr__QualifiersAssignment_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4778:1: ( rule__UnaryExpr__QualifiersAssignment_1 )*
            {
             before(grammarAccess.getUnaryExprAccess().getQualifiersAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4779:1: ( rule__UnaryExpr__QualifiersAssignment_1 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==24||LA35_0==26) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4779:2: rule__UnaryExpr__QualifiersAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__UnaryExpr__QualifiersAssignment_1_in_rule__UnaryExpr__Group__1__Impl9575);
            	    rule__UnaryExpr__QualifiersAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4789:1: rule__UnaryExpr__Group__2 : rule__UnaryExpr__Group__2__Impl ;
    public final void rule__UnaryExpr__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4793:1: ( rule__UnaryExpr__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4794:2: rule__UnaryExpr__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__2__Impl_in_rule__UnaryExpr__Group__29606);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4800:1: rule__UnaryExpr__Group__2__Impl : ( ( rule__UnaryExpr__RightAssignment_2 ) ) ;
    public final void rule__UnaryExpr__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4804:1: ( ( ( rule__UnaryExpr__RightAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4805:1: ( ( rule__UnaryExpr__RightAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4805:1: ( ( rule__UnaryExpr__RightAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4806:1: ( rule__UnaryExpr__RightAssignment_2 )
            {
             before(grammarAccess.getUnaryExprAccess().getRightAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4807:1: ( rule__UnaryExpr__RightAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4807:2: rule__UnaryExpr__RightAssignment_2
            {
            pushFollow(FOLLOW_rule__UnaryExpr__RightAssignment_2_in_rule__UnaryExpr__Group__2__Impl9633);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4823:1: rule__PrePrimaryExpr__Group_2__0 : rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 ;
    public final void rule__PrePrimaryExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4827:1: ( rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4828:2: rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__0__Impl_in_rule__PrePrimaryExpr__Group_2__09669);
            rule__PrePrimaryExpr__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__1_in_rule__PrePrimaryExpr__Group_2__09672);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4835:1: rule__PrePrimaryExpr__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrePrimaryExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4839:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4840:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4840:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4841:1: '('
            {
             before(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,22,FOLLOW_22_in_rule__PrePrimaryExpr__Group_2__0__Impl9700); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4854:1: rule__PrePrimaryExpr__Group_2__1 : rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2 ;
    public final void rule__PrePrimaryExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4858:1: ( rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4859:2: rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__1__Impl_in_rule__PrePrimaryExpr__Group_2__19731);
            rule__PrePrimaryExpr__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__2_in_rule__PrePrimaryExpr__Group_2__19734);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4866:1: rule__PrePrimaryExpr__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__PrePrimaryExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4870:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4871:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4871:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4872:1: ruleExpression
            {
             before(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrePrimaryExpr__Group_2__1__Impl9761);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4883:1: rule__PrePrimaryExpr__Group_2__2 : rule__PrePrimaryExpr__Group_2__2__Impl ;
    public final void rule__PrePrimaryExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4887:1: ( rule__PrePrimaryExpr__Group_2__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4888:2: rule__PrePrimaryExpr__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__2__Impl_in_rule__PrePrimaryExpr__Group_2__29790);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4894:1: rule__PrePrimaryExpr__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrePrimaryExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4898:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4899:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4899:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4900:1: ')'
            {
             before(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_2_2()); 
            match(input,23,FOLLOW_23_in_rule__PrePrimaryExpr__Group_2__2__Impl9818); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4919:1: rule__AbstractRef__Group__0 : rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1 ;
    public final void rule__AbstractRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4923:1: ( rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4924:2: rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group__0__Impl_in_rule__AbstractRef__Group__09855);
            rule__AbstractRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group__1_in_rule__AbstractRef__Group__09858);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4931:1: rule__AbstractRef__Group__0__Impl : ( ruleDeclaredParameter ) ;
    public final void rule__AbstractRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4935:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4936:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4936:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4937:1: ruleDeclaredParameter
            {
             before(grammarAccess.getAbstractRefAccess().getDeclaredParameterParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__AbstractRef__Group__0__Impl9885);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4948:1: rule__AbstractRef__Group__1 : rule__AbstractRef__Group__1__Impl ;
    public final void rule__AbstractRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4952:1: ( rule__AbstractRef__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4953:2: rule__AbstractRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group__1__Impl_in_rule__AbstractRef__Group__19914);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4959:1: rule__AbstractRef__Group__1__Impl : ( ( rule__AbstractRef__Group_1__0 )? ) ;
    public final void rule__AbstractRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4963:1: ( ( ( rule__AbstractRef__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4964:1: ( ( rule__AbstractRef__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4964:1: ( ( rule__AbstractRef__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4965:1: ( rule__AbstractRef__Group_1__0 )?
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4966:1: ( rule__AbstractRef__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==22) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4966:2: rule__AbstractRef__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AbstractRef__Group_1__0_in_rule__AbstractRef__Group__1__Impl9941);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4980:1: rule__AbstractRef__Group_1__0 : rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1 ;
    public final void rule__AbstractRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4984:1: ( rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4985:2: rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1__0__Impl_in_rule__AbstractRef__Group_1__09976);
            rule__AbstractRef__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1__1_in_rule__AbstractRef__Group_1__09979);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4992:1: rule__AbstractRef__Group_1__0__Impl : ( () ) ;
    public final void rule__AbstractRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4996:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4997:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4997:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4998:1: ()
            {
             before(grammarAccess.getAbstractRefAccess().getFunctionRefFuncAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4999:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5001:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5011:1: rule__AbstractRef__Group_1__1 : rule__AbstractRef__Group_1__1__Impl ;
    public final void rule__AbstractRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5015:1: ( rule__AbstractRef__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5016:2: rule__AbstractRef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1__1__Impl_in_rule__AbstractRef__Group_1__110037);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5022:1: rule__AbstractRef__Group_1__1__Impl : ( ( rule__AbstractRef__Group_1_1__0 ) ) ;
    public final void rule__AbstractRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5026:1: ( ( ( rule__AbstractRef__Group_1_1__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5027:1: ( ( rule__AbstractRef__Group_1_1__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5027:1: ( ( rule__AbstractRef__Group_1_1__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5028:1: ( rule__AbstractRef__Group_1_1__0 )
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5029:1: ( rule__AbstractRef__Group_1_1__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5029:2: rule__AbstractRef__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__0_in_rule__AbstractRef__Group_1__1__Impl10064);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5043:1: rule__AbstractRef__Group_1_1__0 : rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1 ;
    public final void rule__AbstractRef__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5047:1: ( rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5048:2: rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__0__Impl_in_rule__AbstractRef__Group_1_1__010098);
            rule__AbstractRef__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__1_in_rule__AbstractRef__Group_1_1__010101);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5055:1: rule__AbstractRef__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__AbstractRef__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5059:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5060:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5060:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5061:1: '('
            {
             before(grammarAccess.getAbstractRefAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,22,FOLLOW_22_in_rule__AbstractRef__Group_1_1__0__Impl10129); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5074:1: rule__AbstractRef__Group_1_1__1 : rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2 ;
    public final void rule__AbstractRef__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5078:1: ( rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5079:2: rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__1__Impl_in_rule__AbstractRef__Group_1_1__110160);
            rule__AbstractRef__Group_1_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__2_in_rule__AbstractRef__Group_1_1__110163);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5086:1: rule__AbstractRef__Group_1_1__1__Impl : ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? ) ;
    public final void rule__AbstractRef__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5090:1: ( ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5091:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5091:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5092:1: ( rule__AbstractRef__ArgsAssignment_1_1_1 )?
            {
             before(grammarAccess.getAbstractRefAccess().getArgsAssignment_1_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5093:1: ( rule__AbstractRef__ArgsAssignment_1_1_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( ((LA37_0>=RULE_STRING && LA37_0<=RULE_BOOLEAN)||LA37_0==12||LA37_0==22||LA37_0==24||LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5093:2: rule__AbstractRef__ArgsAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_1_in_rule__AbstractRef__Group_1_1__1__Impl10190);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5103:1: rule__AbstractRef__Group_1_1__2 : rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3 ;
    public final void rule__AbstractRef__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5107:1: ( rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5108:2: rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__2__Impl_in_rule__AbstractRef__Group_1_1__210221);
            rule__AbstractRef__Group_1_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__3_in_rule__AbstractRef__Group_1_1__210224);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5115:1: rule__AbstractRef__Group_1_1__2__Impl : ( ( rule__AbstractRef__Group_1_1_2__0 )* ) ;
    public final void rule__AbstractRef__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5119:1: ( ( ( rule__AbstractRef__Group_1_1_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5120:1: ( ( rule__AbstractRef__Group_1_1_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5120:1: ( ( rule__AbstractRef__Group_1_1_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5121:1: ( rule__AbstractRef__Group_1_1_2__0 )*
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5122:1: ( rule__AbstractRef__Group_1_1_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==21) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5122:2: rule__AbstractRef__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__0_in_rule__AbstractRef__Group_1_1__2__Impl10251);
            	    rule__AbstractRef__Group_1_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5132:1: rule__AbstractRef__Group_1_1__3 : rule__AbstractRef__Group_1_1__3__Impl ;
    public final void rule__AbstractRef__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5136:1: ( rule__AbstractRef__Group_1_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5137:2: rule__AbstractRef__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__3__Impl_in_rule__AbstractRef__Group_1_1__310282);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5143:1: rule__AbstractRef__Group_1_1__3__Impl : ( ')' ) ;
    public final void rule__AbstractRef__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5147:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5148:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5148:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5149:1: ')'
            {
             before(grammarAccess.getAbstractRefAccess().getRightParenthesisKeyword_1_1_3()); 
            match(input,23,FOLLOW_23_in_rule__AbstractRef__Group_1_1__3__Impl10310); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5170:1: rule__AbstractRef__Group_1_1_2__0 : rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1 ;
    public final void rule__AbstractRef__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5174:1: ( rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5175:2: rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__0__Impl_in_rule__AbstractRef__Group_1_1_2__010349);
            rule__AbstractRef__Group_1_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__1_in_rule__AbstractRef__Group_1_1_2__010352);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5182:1: rule__AbstractRef__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__AbstractRef__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5186:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5187:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5187:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5188:1: ','
            {
             before(grammarAccess.getAbstractRefAccess().getCommaKeyword_1_1_2_0()); 
            match(input,21,FOLLOW_21_in_rule__AbstractRef__Group_1_1_2__0__Impl10380); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5201:1: rule__AbstractRef__Group_1_1_2__1 : rule__AbstractRef__Group_1_1_2__1__Impl ;
    public final void rule__AbstractRef__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5205:1: ( rule__AbstractRef__Group_1_1_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5206:2: rule__AbstractRef__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__1__Impl_in_rule__AbstractRef__Group_1_1_2__110411);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5212:1: rule__AbstractRef__Group_1_1_2__1__Impl : ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) ) ;
    public final void rule__AbstractRef__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5216:1: ( ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5217:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5217:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5218:1: ( rule__AbstractRef__ArgsAssignment_1_1_2_1 )
            {
             before(grammarAccess.getAbstractRefAccess().getArgsAssignment_1_1_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5219:1: ( rule__AbstractRef__ArgsAssignment_1_1_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5219:2: rule__AbstractRef__ArgsAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_2_1_in_rule__AbstractRef__Group_1_1_2__1__Impl10438);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5233:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5237:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5238:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__010472);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__010475);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5245:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5249:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5250:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5250:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5251:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5252:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5254:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5264:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5268:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5269:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__110533);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5275:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5279:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5280:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5280:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5281:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5282:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5282:2: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_0_1_in_rule__TerminalExpression__Group_0__1__Impl10560);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5296:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5300:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5301:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__010594);
            rule__TerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__010597);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5308:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5312:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5313:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5313:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5314:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5315:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5317:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5327:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5331:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5332:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__110655);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5338:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5342:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5343:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5343:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5344:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5345:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5345:2: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl10682);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5359:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5363:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5364:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__010716);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__010719);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5371:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5375:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5376:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5376:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5377:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5378:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5380:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5390:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5394:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5395:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__110777);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5401:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5405:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5406:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5406:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5407:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5408:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5408:2: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl10804);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5425:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5429:1: ( ( ruleImport ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5430:1: ( ruleImport )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5430:1: ( ruleImport )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5431:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_010845);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5440:1: rule__Model__DeclarationsAssignment_1_0 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5444:1: ( ( ruleDeclaration ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5445:1: ( ruleDeclaration )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5445:1: ( ruleDeclaration )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5446:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_1_010876);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5455:1: rule__Model__StatementsAssignment_1_1 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5459:1: ( ( ruleStatement ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5460:1: ( ruleStatement )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5460:1: ( ruleStatement )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5461:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_1_110907);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5470:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5474:1: ( ( RULE_STRING ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5475:1: ( RULE_STRING )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5475:1: ( RULE_STRING )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5476:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_110938); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5485:1: rule__DefSort__ReifiedAssignment_0 : ( ( 'reified' ) ) ;
    public final void rule__DefSort__ReifiedAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5489:1: ( ( ( 'reified' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5490:1: ( ( 'reified' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5490:1: ( ( 'reified' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5491:1: ( 'reified' )
            {
             before(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5492:1: ( 'reified' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5493:1: 'reified'
            {
             before(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_0_0()); 
            match(input,44,FOLLOW_44_in_rule__DefSort__ReifiedAssignment_010974); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5508:1: rule__DefSort__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__DefSort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5512:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5513:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5513:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5514:1: RULE_ID
            {
             before(grammarAccess.getDefSortAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefSort__NameAssignment_211013); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5523:1: rule__DefSort__TypeAssignment_3_1 : ( RULE_ID ) ;
    public final void rule__DefSort__TypeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5527:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5528:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5528:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5529:1: RULE_ID
            {
             before(grammarAccess.getDefSortAccess().getTypeIDTerminalRuleCall_3_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefSort__TypeAssignment_3_111044); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5538:1: rule__DefRange__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefRange__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5542:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5543:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5543:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5544:1: ( RULE_ID )
            {
             before(grammarAccess.getDefRangeAccess().getNameDefSortCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5545:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5546:1: RULE_ID
            {
             before(grammarAccess.getDefRangeAccess().getNameDefSortIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefRange__NameAssignment_111079); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5557:1: rule__DefRange__MinAssignment_2 : ( RULE_INT ) ;
    public final void rule__DefRange__MinAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5561:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5562:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5562:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5563:1: RULE_INT
            {
             before(grammarAccess.getDefRangeAccess().getMinINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DefRange__MinAssignment_211114); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5572:1: rule__DefRange__MaxAssignment_3 : ( RULE_INT ) ;
    public final void rule__DefRange__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5576:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5577:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5577:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5578:1: RULE_INT
            {
             before(grammarAccess.getDefRangeAccess().getMaxINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DefRange__MaxAssignment_311145); 
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


    // $ANTLR start rule__DefOption__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5587:1: rule__DefOption__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DefOption__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5591:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5592:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5592:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5593:1: RULE_ID
            {
             before(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefOption__NameAssignment_111176); 
             after(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__NameAssignment_1


    // $ANTLR start rule__DefOption__ValueAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5602:1: rule__DefOption__ValueAssignment_2 : ( RULE_INT ) ;
    public final void rule__DefOption__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5606:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5607:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5607:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5608:1: RULE_INT
            {
             before(grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DefOption__ValueAssignment_211207); 
             after(grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__ValueAssignment_2


    // $ANTLR start rule__DefCompletion__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5617:1: rule__DefCompletion__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefCompletion__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5621:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5622:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5622:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5623:1: ( RULE_ID )
            {
             before(grammarAccess.getDefCompletionAccess().getNameDefinitionCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5624:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5625:1: RULE_ID
            {
             before(grammarAccess.getDefCompletionAccess().getNameDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefCompletion__NameAssignment_111242); 
             after(grammarAccess.getDefCompletionAccess().getNameDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefCompletionAccess().getNameDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__NameAssignment_1


    // $ANTLR start rule__DefNonInertia__NameAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5636:1: rule__DefNonInertia__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefNonInertia__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5640:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5641:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5641:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5642:1: ( RULE_ID )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNameDefinitionCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5643:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5644:1: RULE_ID
            {
             before(grammarAccess.getDefNonInertiaAccess().getNameDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefNonInertia__NameAssignment_111281); 
             after(grammarAccess.getDefNonInertiaAccess().getNameDefinitionIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefNonInertiaAccess().getNameDefinitionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__NameAssignment_1


    // $ANTLR start rule__SortDefinition__SortAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5655:1: rule__SortDefinition__SortAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SortDefinition__SortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5659:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5660:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5660:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5661:1: ( RULE_ID )
            {
             before(grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5662:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5663:1: RULE_ID
            {
             before(grammarAccess.getSortDefinitionAccess().getSortDefSortIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SortDefinition__SortAssignment_011320); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5674:1: rule__SortDefinition__DefinitionsAssignment_1 : ( ruleDefinition ) ;
    public final void rule__SortDefinition__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5678:1: ( ( ruleDefinition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5679:1: ( ruleDefinition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5679:1: ( ruleDefinition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5680:1: ruleDefinition
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_111355);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5689:1: rule__SortDefinition__DefinitionsAssignment_2_1 : ( ruleDefinition ) ;
    public final void rule__SortDefinition__DefinitionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5693:1: ( ( ruleDefinition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5694:1: ( ruleDefinition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5694:1: ( ruleDefinition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5695:1: ruleDefinition
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_2_111386);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5704:1: rule__Definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5708:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5709:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5709:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5710:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_011417); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5719:1: rule__Definition__ArgsAssignment_1_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5723:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5724:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5724:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5725:1: ruleDeclaredParameter
            {
             before(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_1_111448);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5734:1: rule__Definition__ArgsAssignment_1_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5738:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5739:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5739:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5740:1: ruleDeclaredParameter
            {
             before(grammarAccess.getDefinitionAccess().getArgsDeclaredParameterParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_1_2_111479);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5749:1: rule__Definition__ReturnAssignment_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Definition__ReturnAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5753:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5754:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5754:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5755:1: ruleDeclaredParameter
            {
             before(grammarAccess.getDefinitionAccess().getReturnDeclaredParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Definition__ReturnAssignment_2_111510);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5764:1: rule__DeclaredParameter__NameAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredParameter__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5768:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5769:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5769:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5770:1: ( RULE_ID )
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameDefSortCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5771:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5772:1: RULE_ID
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameDefSortIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeclaredParameter__NameAssignment_011545); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5783:1: rule__DeclaredParameter__NameAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__DeclaredParameter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5787:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5788:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5788:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5789:1: ( RULE_ID )
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameDefinitionCrossReference_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5790:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5791:1: RULE_ID
            {
             before(grammarAccess.getDeclaredParameterAccess().getNameDefinitionIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DeclaredParameter__NameAssignment_111584); 
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


    // $ANTLR start rule__Expression__QualifiersAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5802:1: rule__Expression__QualifiersAssignment_0 : ( ruleQualifier ) ;
    public final void rule__Expression__QualifiersAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5806:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5807:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5807:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5808:1: ruleQualifier
            {
             before(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__Expression__QualifiersAssignment_011619);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__QualifiersAssignment_0


    // $ANTLR start rule__Expression__ExprAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5817:1: rule__Expression__ExprAssignment_1 : ( ruleAssignmentOp ) ;
    public final void rule__Expression__ExprAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5821:1: ( ( ruleAssignmentOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5822:1: ( ruleAssignmentOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5822:1: ( ruleAssignmentOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5823:1: ruleAssignmentOp
            {
             before(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_rule__Expression__ExprAssignment_111650);
            ruleAssignmentOp();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__ExprAssignment_1


    // $ANTLR start rule__Exists__NamesAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5832:1: rule__Exists__NamesAssignment_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Exists__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5836:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5837:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5837:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5838:1: ruleDeclaredParameter
            {
             before(grammarAccess.getExistsAccess().getNamesDeclaredParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Exists__NamesAssignment_111681);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5847:1: rule__Exists__NamesAssignment_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Exists__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5851:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5852:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5852:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5853:1: ruleDeclaredParameter
            {
             before(grammarAccess.getExistsAccess().getNamesDeclaredParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Exists__NamesAssignment_2_111712);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5862:1: rule__Forall__NamesAssignment_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Forall__NamesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5866:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5867:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5867:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5868:1: ruleDeclaredParameter
            {
             before(grammarAccess.getForallAccess().getNamesDeclaredParameterParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Forall__NamesAssignment_111743);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5877:1: rule__Forall__NamesAssignment_2_1 : ( ruleDeclaredParameter ) ;
    public final void rule__Forall__NamesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5881:1: ( ( ruleDeclaredParameter ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5882:1: ( ruleDeclaredParameter )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5882:1: ( ruleDeclaredParameter )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5883:1: ruleDeclaredParameter
            {
             before(grammarAccess.getForallAccess().getNamesDeclaredParameterParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDeclaredParameter_in_rule__Forall__NamesAssignment_2_111774);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5892:1: rule__AssignmentOp__QualifiersAssignment_1_1 : ( ruleQualifier ) ;
    public final void rule__AssignmentOp__QualifiersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5896:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5897:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5897:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5898:1: ruleQualifier
            {
             before(grammarAccess.getAssignmentOpAccess().getQualifiersQualifierParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__AssignmentOp__QualifiersAssignment_1_111805);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5907:1: rule__AssignmentOp__RightAssignment_1_2 : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5911:1: ( ( ruleOrExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5912:1: ( ruleOrExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5912:1: ( ruleOrExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5913:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOrExp_in_rule__AssignmentOp__RightAssignment_1_211836);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5922:1: rule__OrExp__QualifiersAssignment_1_2 : ( ruleQualifier ) ;
    public final void rule__OrExp__QualifiersAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5926:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5927:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5927:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5928:1: ruleQualifier
            {
             before(grammarAccess.getOrExpAccess().getQualifiersQualifierParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__OrExp__QualifiersAssignment_1_211867);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5937:1: rule__OrExp__RightAssignment_1_3 : ( ruleAndExp ) ;
    public final void rule__OrExp__RightAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5941:1: ( ( ruleAndExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5942:1: ( ruleAndExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5942:1: ( ruleAndExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5943:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__RightAssignment_1_311898);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5952:1: rule__AndExp__QualifiersAssignment_1_2 : ( ruleQualifier ) ;
    public final void rule__AndExp__QualifiersAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5956:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5957:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5957:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5958:1: ruleQualifier
            {
             before(grammarAccess.getAndExpAccess().getQualifiersQualifierParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__AndExp__QualifiersAssignment_1_211929);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5967:1: rule__AndExp__RightAssignment_1_3 : ( ruleRelational ) ;
    public final void rule__AndExp__RightAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5971:1: ( ( ruleRelational ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5972:1: ( ruleRelational )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5972:1: ( ruleRelational )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5973:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleRelational_in_rule__AndExp__RightAssignment_1_311960);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5982:1: rule__Relational__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__Relational__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5986:1: ( ( ruleAddition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5987:1: ( ruleAddition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5987:1: ( ruleAddition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5988:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relational__RightAssignment_1_111991);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5997:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6001:1: ( ( ruleMultiplication ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6002:1: ( ruleMultiplication )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6002:1: ( ruleMultiplication )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6003:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_112022);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6012:1: rule__Multiplication__RightAssignment_1_1 : ( rulePower ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6016:1: ( ( rulePower ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6017:1: ( rulePower )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6017:1: ( rulePower )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6018:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_112053);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6027:1: rule__Power__RightAssignment_1_1 : ( ruleUnaryExpr ) ;
    public final void rule__Power__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6031:1: ( ( ruleUnaryExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6032:1: ( ruleUnaryExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6032:1: ( ruleUnaryExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6033:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__Power__RightAssignment_1_112084);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6042:1: rule__UnaryExpr__OpAssignment_0 : ( ruleUnarOp ) ;
    public final void rule__UnaryExpr__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6046:1: ( ( ruleUnarOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6047:1: ( ruleUnarOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6047:1: ( ruleUnarOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6048:1: ruleUnarOp
            {
             before(grammarAccess.getUnaryExprAccess().getOpUnarOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnarOp_in_rule__UnaryExpr__OpAssignment_012115);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6057:1: rule__UnaryExpr__QualifiersAssignment_1 : ( ruleQualifier ) ;
    public final void rule__UnaryExpr__QualifiersAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6061:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6062:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6062:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6063:1: ruleQualifier
            {
             before(grammarAccess.getUnaryExprAccess().getQualifiersQualifierParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__UnaryExpr__QualifiersAssignment_112146);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6072:1: rule__UnaryExpr__RightAssignment_2 : ( rulePrePrimaryExpr ) ;
    public final void rule__UnaryExpr__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6076:1: ( ( rulePrePrimaryExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6077:1: ( rulePrePrimaryExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6077:1: ( rulePrePrimaryExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6078:1: rulePrePrimaryExpr
            {
             before(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_rule__UnaryExpr__RightAssignment_212177);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6087:1: rule__AbstractRef__ArgsAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__AbstractRef__ArgsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6091:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6092:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6092:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6093:1: ruleExpression
            {
             before(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_112208);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6102:1: rule__AbstractRef__ArgsAssignment_1_1_2_1 : ( ruleExpression ) ;
    public final void rule__AbstractRef__ArgsAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6106:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6107:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6107:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6108:1: ruleExpression
            {
             before(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_2_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_2_112239);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6117:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6121:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6122:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6122:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6123:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_0_112270); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6132:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6136:1: ( ( RULE_STRING ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6137:1: ( RULE_STRING )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6137:1: ( RULE_STRING )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6138:1: RULE_STRING
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_1_112301); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6147:1: rule__TerminalExpression__ValueAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6151:1: ( ( RULE_BOOLEAN ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6152:1: ( RULE_BOOLEAN )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6152:1: ( RULE_BOOLEAN )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6153:1: RULE_BOOLEAN
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__TerminalExpression__ValueAssignment_2_112332); 
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


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA21_eotS =
        "\14\uffff";
    static final String DFA21_eofS =
        "\14\uffff";
    static final String DFA21_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA21_maxS =
        "\1\32\1\uffff\2\5\1\31\1\33\1\5\1\uffff\1\5\1\uffff\1\31\1\33";
    static final String DFA21_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA21_specialS =
        "\14\uffff}>";
    static final String[] DFA21_transitionS = {
            "\4\1\4\uffff\1\1\11\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11"
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "()* loopback of 2382:1: ( rule__Expression__QualifiersAssignment_0 )*";
        }
    }
    static final String DFA25_eotS =
        "\14\uffff";
    static final String DFA25_eofS =
        "\14\uffff";
    static final String DFA25_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA25_maxS =
        "\1\32\1\uffff\2\5\1\31\1\33\1\5\1\uffff\1\5\1\uffff\1\31\1\33";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA25_specialS =
        "\14\uffff}>";
    static final String[] DFA25_transitionS = {
            "\4\1\4\uffff\1\1\11\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11"
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()* loopback of 2913:1: ( rule__AssignmentOp__QualifiersAssignment_1_1 )*";
        }
    }
    static final String DFA27_eotS =
        "\14\uffff";
    static final String DFA27_eofS =
        "\14\uffff";
    static final String DFA27_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA27_maxS =
        "\1\32\1\uffff\2\5\1\31\1\33\1\5\1\uffff\1\5\1\uffff\1\31\1\33";
    static final String DFA27_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA27_specialS =
        "\14\uffff}>";
    static final String[] DFA27_transitionS = {
            "\4\1\4\uffff\1\1\11\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11"
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
            return "()* loopback of 3229:1: ( rule__OrExp__QualifiersAssignment_1_2 )*";
        }
    }
    static final String DFA29_eotS =
        "\14\uffff";
    static final String DFA29_eofS =
        "\14\uffff";
    static final String DFA29_minS =
        "\1\4\1\uffff\2\5\2\25\1\5\1\uffff\1\5\1\uffff\2\25";
    static final String DFA29_maxS =
        "\1\32\1\uffff\2\5\1\31\1\33\1\5\1\uffff\1\5\1\uffff\1\31\1\33";
    static final String DFA29_acceptS =
        "\1\uffff\1\2\5\uffff\1\1\1\uffff\1\1\2\uffff";
    static final String DFA29_specialS =
        "\14\uffff}>";
    static final String[] DFA29_transitionS = {
            "\4\1\4\uffff\1\1\11\uffff\1\1\1\uffff\1\2\1\uffff\1\3",
            "",
            "\1\4",
            "\1\5",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11",
            "\1\12",
            "",
            "\1\13",
            "",
            "\1\6\3\uffff\1\7",
            "\1\10\5\uffff\1\11"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "()* loopback of 3417:1: ( rule__AndExp__QualifiersAssignment_1_2 )*";
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
    public static final BitSet FOLLOW_rule__DefOption__Group__0_in_ruleDefOption394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefCompletion428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__0_in_ruleDefCompletion454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefNonInertia488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__0_in_ruleDefNonInertia514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSortDefinition608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__0_in_ruleSortDefinition634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_entryRuleDeclaredParameter721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaredParameter728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredParameter__Alternatives_in_ruleDeclaredParameter754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0_in_ruleExpression814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_entryRuleQualifier841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifier848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Qualifier__Alternatives_in_ruleQualifier874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_entryRuleExists901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExists908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__0_in_ruleExists934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_entryRuleForall961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForall968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__0_in_ruleForall994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp1021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentOp1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__0_in_ruleAssignmentOp1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp1081 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0_in_ruleOrExp1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp1141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp1148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0_in_ruleAndExp1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_entryRuleRelational1201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelational1208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__0_in_ruleRelational1234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower1381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0_in_rulePower1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr1441 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr1448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__0_in_ruleUnaryExpr1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr1501 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrePrimaryExpr1508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Alternatives_in_rulePrePrimaryExpr1534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef1561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractRef1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__0_in_ruleAbstractRef1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression1654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleUnarOp1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_1_0_in_rule__Model__Alternatives_11731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatementsAssignment_1_1_in_rule__Model__Alternatives_11749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefSort_in_rule__Declaration__Alternatives1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRange_in_rule__Declaration__Alternatives1799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefOption_in_rule__Declaration__Alternatives1816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_rule__Declaration__Alternatives1833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_rule__Declaration__Alternatives1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_rule__Statement__Alternatives1882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives1899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredParameter__NameAssignment_0_in_rule__DeclaredParameter__Alternatives1932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DeclaredParameter__NameAssignment_1_in_rule__DeclaredParameter__Alternatives1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_rule__Qualifier__Alternatives1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_rule__Qualifier__Alternatives2000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__0_in_rule__AssignmentOp__Alternatives_1_02032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__0_in_rule__AssignmentOp__Alternatives_1_02050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__0_in_rule__Relational__Alternatives_1_02083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__0_in_rule__Relational__Alternatives_1_02101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__0_in_rule__Relational__Alternatives_1_02119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__0_in_rule__Relational__Alternatives_1_02137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__0_in_rule__Relational__Alternatives_1_02155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__0_in_rule__Relational__Alternatives_1_02173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__0_in_rule__Relational__Alternatives_1_02191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__PrePrimaryExpr__Alternatives2326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_rule__PrePrimaryExpr__Alternatives2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__0_in_rule__PrePrimaryExpr__Alternatives2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives2429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02460 = new BitSet(new long[]{0x00001000054F50F2L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl2490 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_1_in_rule__Model__Group__1__Impl2548 = new BitSet(new long[]{0x00001000054F50F2L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__02583 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__02586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Import__Group__0__Impl2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__12645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__0__Impl_in_rule__DefSort__Group__02706 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__DefSort__Group__1_in_rule__DefSort__Group__02709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__ReifiedAssignment_0_in_rule__DefSort__Group__0__Impl2736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__1__Impl_in_rule__DefSort__Group__12767 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefSort__Group__2_in_rule__DefSort__Group__12770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DefSort__Group__1__Impl2798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__2__Impl_in_rule__DefSort__Group__22829 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__3_in_rule__DefSort__Group__22832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__NameAssignment_2_in_rule__DefSort__Group__2__Impl2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__3__Impl_in_rule__DefSort__Group__32889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group_3__0_in_rule__DefSort__Group__3__Impl2916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group_3__0__Impl_in_rule__DefSort__Group_3__02955 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefSort__Group_3__1_in_rule__DefSort__Group_3__02958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DefSort__Group_3__0__Impl2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group_3__1__Impl_in_rule__DefSort__Group_3__13017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__TypeAssignment_3_1_in_rule__DefSort__Group_3__1__Impl3044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__0__Impl_in_rule__DefRange__Group__03078 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefRange__Group__1_in_rule__DefRange__Group__03081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DefRange__Group__0__Impl3109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__1__Impl_in_rule__DefRange__Group__13140 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefRange__Group__2_in_rule__DefRange__Group__13143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__NameAssignment_1_in_rule__DefRange__Group__1__Impl3170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__2__Impl_in_rule__DefRange__Group__23200 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefRange__Group__3_in_rule__DefRange__Group__23203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__MinAssignment_2_in_rule__DefRange__Group__2__Impl3230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__3__Impl_in_rule__DefRange__Group__33260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__MaxAssignment_3_in_rule__DefRange__Group__3__Impl3287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group__0__Impl_in_rule__DefOption__Group__03325 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefOption__Group__1_in_rule__DefOption__Group__03328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DefOption__Group__0__Impl3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group__1__Impl_in_rule__DefOption__Group__13387 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefOption__Group__2_in_rule__DefOption__Group__13390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__NameAssignment_1_in_rule__DefOption__Group__1__Impl3417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group__2__Impl_in_rule__DefOption__Group__23447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__ValueAssignment_2_in_rule__DefOption__Group__2__Impl3474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__0__Impl_in_rule__DefCompletion__Group__03510 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__1_in_rule__DefCompletion__Group__03513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DefCompletion__Group__0__Impl3541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__1__Impl_in_rule__DefCompletion__Group__13572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__NameAssignment_1_in_rule__DefCompletion__Group__1__Impl3599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__0__Impl_in_rule__DefNonInertia__Group__03633 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__1_in_rule__DefNonInertia__Group__03636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DefNonInertia__Group__0__Impl3664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__1__Impl_in_rule__DefNonInertia__Group__13695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__NameAssignment_1_in_rule__DefNonInertia__Group__1__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__03756 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__03759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Statement__Group_1__0__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__13815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Statement__Group_1__1__Impl3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__0__Impl_in_rule__SortDefinition__Group__03878 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__1_in_rule__SortDefinition__Group__03881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__SortAssignment_0_in_rule__SortDefinition__Group__0__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__1__Impl_in_rule__SortDefinition__Group__13938 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__2_in_rule__SortDefinition__Group__13941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__DefinitionsAssignment_1_in_rule__SortDefinition__Group__1__Impl3968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__2__Impl_in_rule__SortDefinition__Group__23998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__0_in_rule__SortDefinition__Group__2__Impl4025 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__0__Impl_in_rule__SortDefinition__Group_2__04062 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__1_in_rule__SortDefinition__Group_2__04065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__SortDefinition__Group_2__0__Impl4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__1__Impl_in_rule__SortDefinition__Group_2__14124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__DefinitionsAssignment_2_1_in_rule__SortDefinition__Group_2__1__Impl4151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__04185 = new BitSet(new long[]{0x0000000000408002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__04188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_0_in_rule__Definition__Group__0__Impl4215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__14245 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__14248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__0_in_rule__Definition__Group__1__Impl4275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__24306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__0_in_rule__Definition__Group__2__Impl4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__0__Impl_in_rule__Definition__Group_1__04370 = new BitSet(new long[]{0x0000000000A00020L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__1_in_rule__Definition__Group_1__04373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Definition__Group_1__0__Impl4401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__1__Impl_in_rule__Definition__Group_1__14432 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__2_in_rule__Definition__Group_1__14435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ArgsAssignment_1_1_in_rule__Definition__Group_1__1__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__2__Impl_in_rule__Definition__Group_1__24493 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__3_in_rule__Definition__Group_1__24496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__0_in_rule__Definition__Group_1__2__Impl4523 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__3__Impl_in_rule__Definition__Group_1__34554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Definition__Group_1__3__Impl4582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__0__Impl_in_rule__Definition__Group_1_2__04621 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__1_in_rule__Definition__Group_1_2__04624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Definition__Group_1_2__0__Impl4652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__1__Impl_in_rule__Definition__Group_1_2__14683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ArgsAssignment_1_2_1_in_rule__Definition__Group_1_2__1__Impl4710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__0__Impl_in_rule__Definition__Group_2__04744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__1_in_rule__Definition__Group_2__04747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Definition__Group_2__0__Impl4775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__1__Impl_in_rule__Definition__Group_2__14806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ReturnAssignment_2_1_in_rule__Definition__Group_2__1__Impl4833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__0__Impl_in_rule__Expression__Group__04867 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__Expression__Group__1_in_rule__Expression__Group__04870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__QualifiersAssignment_0_in_rule__Expression__Group__0__Impl4897 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_rule__Expression__Group__1__Impl_in_rule__Expression__Group__14928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ExprAssignment_1_in_rule__Expression__Group__1__Impl4955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__0__Impl_in_rule__Exists__Group__04989 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Exists__Group__1_in_rule__Exists__Group__04992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Exists__Group__0__Impl5020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__1__Impl_in_rule__Exists__Group__15051 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_rule__Exists__Group__2_in_rule__Exists__Group__15054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__NamesAssignment_1_in_rule__Exists__Group__1__Impl5081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__2__Impl_in_rule__Exists__Group__25111 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Exists__Group__3_in_rule__Exists__Group__25114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group_2__0_in_rule__Exists__Group__2__Impl5141 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Exists__Group__3__Impl_in_rule__Exists__Group__35172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Exists__Group__3__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group_2__0__Impl_in_rule__Exists__Group_2__05239 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Exists__Group_2__1_in_rule__Exists__Group_2__05242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Exists__Group_2__0__Impl5270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group_2__1__Impl_in_rule__Exists__Group_2__15301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__NamesAssignment_2_1_in_rule__Exists__Group_2__1__Impl5328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__0__Impl_in_rule__Forall__Group__05362 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Forall__Group__1_in_rule__Forall__Group__05365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Forall__Group__0__Impl5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__1__Impl_in_rule__Forall__Group__15424 = new BitSet(new long[]{0x0000000008200000L});
    public static final BitSet FOLLOW_rule__Forall__Group__2_in_rule__Forall__Group__15427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__NamesAssignment_1_in_rule__Forall__Group__1__Impl5454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__2__Impl_in_rule__Forall__Group__25484 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Forall__Group__3_in_rule__Forall__Group__25487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group_2__0_in_rule__Forall__Group__2__Impl5514 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Forall__Group__3__Impl_in_rule__Forall__Group__35545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Forall__Group__3__Impl5573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group_2__0__Impl_in_rule__Forall__Group_2__05612 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Forall__Group_2__1_in_rule__Forall__Group_2__05615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Forall__Group_2__0__Impl5643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group_2__1__Impl_in_rule__Forall__Group_2__15674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__NamesAssignment_2_1_in_rule__Forall__Group_2__1__Impl5701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__0__Impl_in_rule__AssignmentOp__Group__05735 = new BitSet(new long[]{0x0000000030000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__1_in_rule__AssignmentOp__Group__05738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__AssignmentOp__Group__0__Impl5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__1__Impl_in_rule__AssignmentOp__Group__15794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__0_in_rule__AssignmentOp__Group__1__Impl5821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__0__Impl_in_rule__AssignmentOp__Group_1__05856 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__1_in_rule__AssignmentOp__Group_1__05859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Alternatives_1_0_in_rule__AssignmentOp__Group_1__0__Impl5886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__1__Impl_in_rule__AssignmentOp__Group_1__15916 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__2_in_rule__AssignmentOp__Group_1__15919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__QualifiersAssignment_1_1_in_rule__AssignmentOp__Group_1__1__Impl5946 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__2__Impl_in_rule__AssignmentOp__Group_1__25977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__RightAssignment_1_2_in_rule__AssignmentOp__Group_1__2__Impl6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__0__Impl_in_rule__AssignmentOp__Group_1_0_0__06040 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__1_in_rule__AssignmentOp__Group_1_0_0__06043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__1__Impl_in_rule__AssignmentOp__Group_1_0_0__16101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AssignmentOp__Group_1_0_0__1__Impl6129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__0__Impl_in_rule__AssignmentOp__Group_1_0_1__06164 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__1_in_rule__AssignmentOp__Group_1_0_1__06167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__1__Impl_in_rule__AssignmentOp__Group_1_0_1__16225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AssignmentOp__Group_1_0_1__1__Impl6253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__06288 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__06291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__Group__0__Impl6318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__16347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl6374 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__06409 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__06412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__16470 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__2_in_rule__OrExp__Group_1__16473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__OrExp__Group_1__1__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__2__Impl_in_rule__OrExp__Group_1__26532 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__3_in_rule__OrExp__Group_1__26535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__QualifiersAssignment_1_2_in_rule__OrExp__Group_1__2__Impl6562 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__3__Impl_in_rule__OrExp__Group_1__36593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__RightAssignment_1_3_in_rule__OrExp__Group_1__3__Impl6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__06658 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__06661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_rule__AndExp__Group__0__Impl6688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__16717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl6744 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__06779 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__06782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__16840 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__2_in_rule__AndExp__Group_1__16843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AndExp__Group_1__1__Impl6871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__2__Impl_in_rule__AndExp__Group_1__26902 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__3_in_rule__AndExp__Group_1__26905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__QualifiersAssignment_1_2_in_rule__AndExp__Group_1__2__Impl6932 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__3__Impl_in_rule__AndExp__Group_1__36963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__RightAssignment_1_3_in_rule__AndExp__Group_1__3__Impl6990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__0__Impl_in_rule__Relational__Group__07028 = new BitSet(new long[]{0x0000007F00000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__1_in_rule__Relational__Group__07031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relational__Group__0__Impl7058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__1__Impl_in_rule__Relational__Group__17087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__0_in_rule__Relational__Group__1__Impl7114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__0__Impl_in_rule__Relational__Group_1__07149 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__1_in_rule__Relational__Group_1__07152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Alternatives_1_0_in_rule__Relational__Group_1__0__Impl7179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__1__Impl_in_rule__Relational__Group_1__17209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__RightAssignment_1_1_in_rule__Relational__Group_1__1__Impl7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__0__Impl_in_rule__Relational__Group_1_0_0__07270 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__1_in_rule__Relational__Group_1_0_0__07273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__1__Impl_in_rule__Relational__Group_1_0_0__17331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Relational__Group_1_0_0__1__Impl7359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__0__Impl_in_rule__Relational__Group_1_0_1__07394 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__1_in_rule__Relational__Group_1_0_1__07397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__1__Impl_in_rule__Relational__Group_1_0_1__17455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Relational__Group_1_0_1__1__Impl7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__0__Impl_in_rule__Relational__Group_1_0_2__07518 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__1_in_rule__Relational__Group_1_0_2__07521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__1__Impl_in_rule__Relational__Group_1_0_2__17579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Relational__Group_1_0_2__1__Impl7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__0__Impl_in_rule__Relational__Group_1_0_3__07642 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__1_in_rule__Relational__Group_1_0_3__07645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__1__Impl_in_rule__Relational__Group_1_0_3__17703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Relational__Group_1_0_3__1__Impl7731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__0__Impl_in_rule__Relational__Group_1_0_4__07766 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__1_in_rule__Relational__Group_1_0_4__07769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__1__Impl_in_rule__Relational__Group_1_0_4__17827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Relational__Group_1_0_4__1__Impl7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__0__Impl_in_rule__Relational__Group_1_0_5__07890 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__1_in_rule__Relational__Group_1_0_5__07893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__1__Impl_in_rule__Relational__Group_1_0_5__17951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Relational__Group_1_0_5__1__Impl7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__0__Impl_in_rule__Relational__Group_1_0_6__08014 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__1_in_rule__Relational__Group_1_0_6__08017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__1__Impl_in_rule__Relational__Group_1_0_6__18075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Relational__Group_1_0_6__1__Impl8103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__08138 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__08141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl8168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__18197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl8224 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__08259 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__08262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl8289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__18319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl8346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__08380 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__08383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__18441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Addition__Group_1_0_0__1__Impl8469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__08504 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__08507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__18565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Addition__Group_1_0_1__1__Impl8593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__08628 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__08631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl8658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__18687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl8714 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__08749 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__08752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl8779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__18809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl8836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__08870 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__08873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__18931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Multiplication__Group_1_0_0__1__Impl8959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__08994 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__08997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__19055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Multiplication__Group_1_0_1__1__Impl9083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__09118 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1_in_rule__Power__Group__09121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__Power__Group__0__Impl9148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__19177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl9204 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__09239 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__09242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl9269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__19299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl9326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__09360 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__09363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__19421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Power__Group_1_0__1__Impl9449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__0__Impl_in_rule__UnaryExpr__Group__09484 = new BitSet(new long[]{0x00000000054000F0L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__1_in_rule__UnaryExpr__Group__09487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__OpAssignment_0_in_rule__UnaryExpr__Group__0__Impl9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__1__Impl_in_rule__UnaryExpr__Group__19545 = new BitSet(new long[]{0x00000000004000F0L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__2_in_rule__UnaryExpr__Group__19548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__QualifiersAssignment_1_in_rule__UnaryExpr__Group__1__Impl9575 = new BitSet(new long[]{0x0000000005000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__2__Impl_in_rule__UnaryExpr__Group__29606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__RightAssignment_2_in_rule__UnaryExpr__Group__2__Impl9633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__0__Impl_in_rule__PrePrimaryExpr__Group_2__09669 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__1_in_rule__PrePrimaryExpr__Group_2__09672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__PrePrimaryExpr__Group_2__0__Impl9700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__1__Impl_in_rule__PrePrimaryExpr__Group_2__19731 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__2_in_rule__PrePrimaryExpr__Group_2__19734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrePrimaryExpr__Group_2__1__Impl9761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__2__Impl_in_rule__PrePrimaryExpr__Group_2__29790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__PrePrimaryExpr__Group_2__2__Impl9818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__0__Impl_in_rule__AbstractRef__Group__09855 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__1_in_rule__AbstractRef__Group__09858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__AbstractRef__Group__0__Impl9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__1__Impl_in_rule__AbstractRef__Group__19914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__0_in_rule__AbstractRef__Group__1__Impl9941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__0__Impl_in_rule__AbstractRef__Group_1__09976 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__1_in_rule__AbstractRef__Group_1__09979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__1__Impl_in_rule__AbstractRef__Group_1__110037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__0_in_rule__AbstractRef__Group_1__1__Impl10064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__0__Impl_in_rule__AbstractRef__Group_1_1__010098 = new BitSet(new long[]{0x0000000005E010F0L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__1_in_rule__AbstractRef__Group_1_1__010101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AbstractRef__Group_1_1__0__Impl10129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__1__Impl_in_rule__AbstractRef__Group_1_1__110160 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__2_in_rule__AbstractRef__Group_1_1__110163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_1_in_rule__AbstractRef__Group_1_1__1__Impl10190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__2__Impl_in_rule__AbstractRef__Group_1_1__210221 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__3_in_rule__AbstractRef__Group_1_1__210224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__0_in_rule__AbstractRef__Group_1_1__2__Impl10251 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__3__Impl_in_rule__AbstractRef__Group_1_1__310282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AbstractRef__Group_1_1__3__Impl10310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__0__Impl_in_rule__AbstractRef__Group_1_1_2__010349 = new BitSet(new long[]{0x00000000054010F0L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__1_in_rule__AbstractRef__Group_1_1_2__010352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AbstractRef__Group_1_1_2__0__Impl10380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__1__Impl_in_rule__AbstractRef__Group_1_1_2__110411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_2_1_in_rule__AbstractRef__Group_1_1_2__1__Impl10438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__010472 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__010475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__110533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_0_1_in_rule__TerminalExpression__Group_0__1__Impl10560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__010594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__010597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__110655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl10682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__010716 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__010719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__110777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl10804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_010845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_1_010876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_1_110907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_110938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__DefSort__ReifiedAssignment_010974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefSort__NameAssignment_211013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefSort__TypeAssignment_3_111044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefRange__NameAssignment_111079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DefRange__MinAssignment_211114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DefRange__MaxAssignment_311145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefOption__NameAssignment_111176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DefOption__ValueAssignment_211207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefCompletion__NameAssignment_111242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefNonInertia__NameAssignment_111281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SortDefinition__SortAssignment_011320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_111355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_2_111386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_011417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_1_111448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Definition__ArgsAssignment_1_2_111479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Definition__ReturnAssignment_2_111510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeclaredParameter__NameAssignment_011545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DeclaredParameter__NameAssignment_111584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__Expression__QualifiersAssignment_011619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_rule__Expression__ExprAssignment_111650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Exists__NamesAssignment_111681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Exists__NamesAssignment_2_111712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Forall__NamesAssignment_111743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaredParameter_in_rule__Forall__NamesAssignment_2_111774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__AssignmentOp__QualifiersAssignment_1_111805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__AssignmentOp__RightAssignment_1_211836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__OrExp__QualifiersAssignment_1_211867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__RightAssignment_1_311898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__AndExp__QualifiersAssignment_1_211929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_rule__AndExp__RightAssignment_1_311960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relational__RightAssignment_1_111991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_112022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_112053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__Power__RightAssignment_1_112084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnarOp_in_rule__UnaryExpr__OpAssignment_012115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__UnaryExpr__QualifiersAssignment_112146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_rule__UnaryExpr__RightAssignment_212177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_112208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_2_112239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_0_112270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_1_112301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__TerminalExpression__ValueAssignment_2_112332 = new BitSet(new long[]{0x0000000000000002L});

}