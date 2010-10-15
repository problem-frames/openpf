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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'!'", "'generated'", "'author'", "'Theta'", "'Delta'", "'load'", "';'", "'#'", "'sort'", "':'", "'range'", "'option'", "'completion'", "'noninertial'", "','", "'xor'", "'mutex'", "'.'", "'('", "')'", "'{'", "'}'", "'['", "']'", "'->'", "'<->'", "'|'", "'&'", "'!='", "'=='", "'>='", "'<='", "'='", "'<'", "'>'", "'+'", "'-'", "'*'", "'/'", "'^'", "'not'", "'reified'"
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


    // $ANTLR start entryRuleAnnotation
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:117:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:118:1: ( ruleAnnotation EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:119:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_ruleAnnotation_in_entryRuleAnnotation181);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAnnotation188); 

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
    // $ANTLR end entryRuleAnnotation


    // $ANTLR start ruleAnnotation
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:126:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:130:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:131:1: ( ( rule__Annotation__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:131:1: ( ( rule__Annotation__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:132:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:133:1: ( rule__Annotation__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:133:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation214);
            rule__Annotation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAnnotation


    // $ANTLR start entryRuleDeclaration
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:145:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:146:1: ( ruleDeclaration EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:147:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_ruleDeclaration_in_entryRuleDeclaration241);
            ruleDeclaration();
            _fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDeclaration248); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:154:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:158:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:159:1: ( ( rule__Declaration__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:159:1: ( ( rule__Declaration__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:160:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:161:1: ( rule__Declaration__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:161:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration274);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:175:1: entryRuleDefSort : ruleDefSort EOF ;
    public final void entryRuleDefSort() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:176:1: ( ruleDefSort EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:177:1: ruleDefSort EOF
            {
             before(grammarAccess.getDefSortRule()); 
            pushFollow(FOLLOW_ruleDefSort_in_entryRuleDefSort303);
            ruleDefSort();
            _fsp--;

             after(grammarAccess.getDefSortRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefSort310); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:184:1: ruleDefSort : ( ( rule__DefSort__Group__0 ) ) ;
    public final void ruleDefSort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:188:2: ( ( ( rule__DefSort__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:189:1: ( ( rule__DefSort__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:189:1: ( ( rule__DefSort__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:190:1: ( rule__DefSort__Group__0 )
            {
             before(grammarAccess.getDefSortAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:191:1: ( rule__DefSort__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:191:2: rule__DefSort__Group__0
            {
            pushFollow(FOLLOW_rule__DefSort__Group__0_in_ruleDefSort336);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:203:1: entryRuleDefRange : ruleDefRange EOF ;
    public final void entryRuleDefRange() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:204:1: ( ruleDefRange EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:205:1: ruleDefRange EOF
            {
             before(grammarAccess.getDefRangeRule()); 
            pushFollow(FOLLOW_ruleDefRange_in_entryRuleDefRange363);
            ruleDefRange();
            _fsp--;

             after(grammarAccess.getDefRangeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefRange370); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:212:1: ruleDefRange : ( ( rule__DefRange__Group__0 ) ) ;
    public final void ruleDefRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:216:2: ( ( ( rule__DefRange__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:217:1: ( ( rule__DefRange__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:217:1: ( ( rule__DefRange__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:218:1: ( rule__DefRange__Group__0 )
            {
             before(grammarAccess.getDefRangeAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:219:1: ( rule__DefRange__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:219:2: rule__DefRange__Group__0
            {
            pushFollow(FOLLOW_rule__DefRange__Group__0_in_ruleDefRange396);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:231:1: entryRuleDefOption : ruleDefOption EOF ;
    public final void entryRuleDefOption() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:232:1: ( ruleDefOption EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:233:1: ruleDefOption EOF
            {
             before(grammarAccess.getDefOptionRule()); 
            pushFollow(FOLLOW_ruleDefOption_in_entryRuleDefOption423);
            ruleDefOption();
            _fsp--;

             after(grammarAccess.getDefOptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefOption430); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:240:1: ruleDefOption : ( ( rule__DefOption__Group__0 ) ) ;
    public final void ruleDefOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:244:2: ( ( ( rule__DefOption__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:245:1: ( ( rule__DefOption__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:245:1: ( ( rule__DefOption__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:246:1: ( rule__DefOption__Group__0 )
            {
             before(grammarAccess.getDefOptionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:247:1: ( rule__DefOption__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:247:2: rule__DefOption__Group__0
            {
            pushFollow(FOLLOW_rule__DefOption__Group__0_in_ruleDefOption456);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:259:1: entryRuleDefCompletion : ruleDefCompletion EOF ;
    public final void entryRuleDefCompletion() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:260:1: ( ruleDefCompletion EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:261:1: ruleDefCompletion EOF
            {
             before(grammarAccess.getDefCompletionRule()); 
            pushFollow(FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion483);
            ruleDefCompletion();
            _fsp--;

             after(grammarAccess.getDefCompletionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefCompletion490); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:268:1: ruleDefCompletion : ( ( rule__DefCompletion__Group__0 ) ) ;
    public final void ruleDefCompletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:272:2: ( ( ( rule__DefCompletion__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:273:1: ( ( rule__DefCompletion__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:273:1: ( ( rule__DefCompletion__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:274:1: ( rule__DefCompletion__Group__0 )
            {
             before(grammarAccess.getDefCompletionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:275:1: ( rule__DefCompletion__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:275:2: rule__DefCompletion__Group__0
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__0_in_ruleDefCompletion516);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:287:1: entryRuleDefNonInertia : ruleDefNonInertia EOF ;
    public final void entryRuleDefNonInertia() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:288:1: ( ruleDefNonInertia EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:289:1: ruleDefNonInertia EOF
            {
             before(grammarAccess.getDefNonInertiaRule()); 
            pushFollow(FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia543);
            ruleDefNonInertia();
            _fsp--;

             after(grammarAccess.getDefNonInertiaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefNonInertia550); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:296:1: ruleDefNonInertia : ( ( rule__DefNonInertia__Group__0 ) ) ;
    public final void ruleDefNonInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:300:2: ( ( ( rule__DefNonInertia__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:301:1: ( ( rule__DefNonInertia__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:301:1: ( ( rule__DefNonInertia__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:302:1: ( rule__DefNonInertia__Group__0 )
            {
             before(grammarAccess.getDefNonInertiaAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:303:1: ( rule__DefNonInertia__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:303:2: rule__DefNonInertia__Group__0
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__0_in_ruleDefNonInertia576);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:315:1: entryRuleDefXor : ruleDefXor EOF ;
    public final void entryRuleDefXor() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:316:1: ( ruleDefXor EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:317:1: ruleDefXor EOF
            {
             before(grammarAccess.getDefXorRule()); 
            pushFollow(FOLLOW_ruleDefXor_in_entryRuleDefXor603);
            ruleDefXor();
            _fsp--;

             after(grammarAccess.getDefXorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefXor610); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:324:1: ruleDefXor : ( ( rule__DefXor__Group__0 ) ) ;
    public final void ruleDefXor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:328:2: ( ( ( rule__DefXor__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:329:1: ( ( rule__DefXor__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:329:1: ( ( rule__DefXor__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:330:1: ( rule__DefXor__Group__0 )
            {
             before(grammarAccess.getDefXorAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:331:1: ( rule__DefXor__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:331:2: rule__DefXor__Group__0
            {
            pushFollow(FOLLOW_rule__DefXor__Group__0_in_ruleDefXor636);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:343:1: entryRuleDefMutex : ruleDefMutex EOF ;
    public final void entryRuleDefMutex() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:344:1: ( ruleDefMutex EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:345:1: ruleDefMutex EOF
            {
             before(grammarAccess.getDefMutexRule()); 
            pushFollow(FOLLOW_ruleDefMutex_in_entryRuleDefMutex663);
            ruleDefMutex();
            _fsp--;

             after(grammarAccess.getDefMutexRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefMutex670); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:352:1: ruleDefMutex : ( ( rule__DefMutex__Group__0 ) ) ;
    public final void ruleDefMutex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:356:2: ( ( ( rule__DefMutex__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:357:1: ( ( rule__DefMutex__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:357:1: ( ( rule__DefMutex__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:358:1: ( rule__DefMutex__Group__0 )
            {
             before(grammarAccess.getDefMutexAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:359:1: ( rule__DefMutex__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:359:2: rule__DefMutex__Group__0
            {
            pushFollow(FOLLOW_rule__DefMutex__Group__0_in_ruleDefMutex696);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:371:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:372:1: ( ruleStatement EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:373:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement723);
            ruleStatement();
            _fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement730); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:380:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:384:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:385:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:385:1: ( ( rule__Statement__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:386:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:387:1: ( rule__Statement__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:387:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement756);
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


    // $ANTLR start entryRuleLabeledExpression
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:399:1: entryRuleLabeledExpression : ruleLabeledExpression EOF ;
    public final void entryRuleLabeledExpression() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:400:1: ( ruleLabeledExpression EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:401:1: ruleLabeledExpression EOF
            {
             before(grammarAccess.getLabeledExpressionRule()); 
            pushFollow(FOLLOW_ruleLabeledExpression_in_entryRuleLabeledExpression783);
            ruleLabeledExpression();
            _fsp--;

             after(grammarAccess.getLabeledExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabeledExpression790); 

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
    // $ANTLR end entryRuleLabeledExpression


    // $ANTLR start ruleLabeledExpression
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:408:1: ruleLabeledExpression : ( ( rule__LabeledExpression__Group__0 ) ) ;
    public final void ruleLabeledExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:412:2: ( ( ( rule__LabeledExpression__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:413:1: ( ( rule__LabeledExpression__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:413:1: ( ( rule__LabeledExpression__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:414:1: ( rule__LabeledExpression__Group__0 )
            {
             before(grammarAccess.getLabeledExpressionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:415:1: ( rule__LabeledExpression__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:415:2: rule__LabeledExpression__Group__0
            {
            pushFollow(FOLLOW_rule__LabeledExpression__Group__0_in_ruleLabeledExpression816);
            rule__LabeledExpression__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLabeledExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLabeledExpression


    // $ANTLR start entryRuleSortDefinition
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:427:1: entryRuleSortDefinition : ruleSortDefinition EOF ;
    public final void entryRuleSortDefinition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:428:1: ( ruleSortDefinition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:429:1: ruleSortDefinition EOF
            {
             before(grammarAccess.getSortDefinitionRule()); 
            pushFollow(FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition843);
            ruleSortDefinition();
            _fsp--;

             after(grammarAccess.getSortDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSortDefinition850); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:436:1: ruleSortDefinition : ( ( rule__SortDefinition__Group__0 ) ) ;
    public final void ruleSortDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:440:2: ( ( ( rule__SortDefinition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:441:1: ( ( rule__SortDefinition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:441:1: ( ( rule__SortDefinition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:442:1: ( rule__SortDefinition__Group__0 )
            {
             before(grammarAccess.getSortDefinitionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:443:1: ( rule__SortDefinition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:443:2: rule__SortDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__0_in_ruleSortDefinition876);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:455:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:456:1: ( ruleDefinition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:457:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_ruleDefinition_in_entryRuleDefinition903);
            ruleDefinition();
            _fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDefinition910); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:464:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:468:2: ( ( ( rule__Definition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:469:1: ( ( rule__Definition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:469:1: ( ( rule__Definition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:470:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:471:1: ( rule__Definition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:471:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_rule__Definition__Group__0_in_ruleDefinition936);
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


    // $ANTLR start entryRuleExpression
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:483:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:484:1: ( ruleExpression EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:485:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression963);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression970); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:492:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:496:2: ( ( ( rule__Expression__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:497:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:497:1: ( ( rule__Expression__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:498:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:499:1: ( rule__Expression__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:499:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_rule__Expression__Alternatives_in_ruleExpression996);
            rule__Expression__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:511:1: entryRuleQualifier : ruleQualifier EOF ;
    public final void entryRuleQualifier() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:512:1: ( ruleQualifier EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:513:1: ruleQualifier EOF
            {
             before(grammarAccess.getQualifierRule()); 
            pushFollow(FOLLOW_ruleQualifier_in_entryRuleQualifier1023);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getQualifierRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifier1030); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:520:1: ruleQualifier : ( ( rule__Qualifier__Alternatives ) ) ;
    public final void ruleQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:524:2: ( ( ( rule__Qualifier__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:525:1: ( ( rule__Qualifier__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:525:1: ( ( rule__Qualifier__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:526:1: ( rule__Qualifier__Alternatives )
            {
             before(grammarAccess.getQualifierAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:527:1: ( rule__Qualifier__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:527:2: rule__Qualifier__Alternatives
            {
            pushFollow(FOLLOW_rule__Qualifier__Alternatives_in_ruleQualifier1056);
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


    // $ANTLR start entryRuleParameters
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:539:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:540:1: ( ruleParameters EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:541:1: ruleParameters EOF
            {
             before(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_ruleParameters_in_entryRuleParameters1083);
            ruleParameters();
            _fsp--;

             after(grammarAccess.getParametersRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleParameters1090); 

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
    // $ANTLR end entryRuleParameters


    // $ANTLR start ruleParameters
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:548:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:552:2: ( ( ( rule__Parameters__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:553:1: ( ( rule__Parameters__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:553:1: ( ( rule__Parameters__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:554:1: ( rule__Parameters__Group__0 )
            {
             before(grammarAccess.getParametersAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:555:1: ( rule__Parameters__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:555:2: rule__Parameters__Group__0
            {
            pushFollow(FOLLOW_rule__Parameters__Group__0_in_ruleParameters1116);
            rule__Parameters__Group__0();
            _fsp--;


            }

             after(grammarAccess.getParametersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleParameters


    // $ANTLR start entryRuleExists
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:567:1: entryRuleExists : ruleExists EOF ;
    public final void entryRuleExists() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:568:1: ( ruleExists EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:569:1: ruleExists EOF
            {
             before(grammarAccess.getExistsRule()); 
            pushFollow(FOLLOW_ruleExists_in_entryRuleExists1143);
            ruleExists();
            _fsp--;

             after(grammarAccess.getExistsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExists1150); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:576:1: ruleExists : ( ( rule__Exists__Group__0 ) ) ;
    public final void ruleExists() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:580:2: ( ( ( rule__Exists__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:581:1: ( ( rule__Exists__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:581:1: ( ( rule__Exists__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:582:1: ( rule__Exists__Group__0 )
            {
             before(grammarAccess.getExistsAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:583:1: ( rule__Exists__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:583:2: rule__Exists__Group__0
            {
            pushFollow(FOLLOW_rule__Exists__Group__0_in_ruleExists1176);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:595:1: entryRuleForall : ruleForall EOF ;
    public final void entryRuleForall() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:596:1: ( ruleForall EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:597:1: ruleForall EOF
            {
             before(grammarAccess.getForallRule()); 
            pushFollow(FOLLOW_ruleForall_in_entryRuleForall1203);
            ruleForall();
            _fsp--;

             after(grammarAccess.getForallRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleForall1210); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:604:1: ruleForall : ( ( rule__Forall__Group__0 ) ) ;
    public final void ruleForall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:608:2: ( ( ( rule__Forall__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:609:1: ( ( rule__Forall__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:609:1: ( ( rule__Forall__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:610:1: ( rule__Forall__Group__0 )
            {
             before(grammarAccess.getForallAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:611:1: ( rule__Forall__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:611:2: rule__Forall__Group__0
            {
            pushFollow(FOLLOW_rule__Forall__Group__0_in_ruleForall1236);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:623:1: entryRuleAssignmentOp : ruleAssignmentOp EOF ;
    public final void entryRuleAssignmentOp() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:624:1: ( ruleAssignmentOp EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:625:1: ruleAssignmentOp EOF
            {
             before(grammarAccess.getAssignmentOpRule()); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp1263);
            ruleAssignmentOp();
            _fsp--;

             after(grammarAccess.getAssignmentOpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignmentOp1270); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:632:1: ruleAssignmentOp : ( ( rule__AssignmentOp__Group__0 ) ) ;
    public final void ruleAssignmentOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:636:2: ( ( ( rule__AssignmentOp__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:637:1: ( ( rule__AssignmentOp__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:637:1: ( ( rule__AssignmentOp__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:638:1: ( rule__AssignmentOp__Group__0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:639:1: ( rule__AssignmentOp__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:639:2: rule__AssignmentOp__Group__0
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__0_in_ruleAssignmentOp1296);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:651:1: entryRuleOrExp : ruleOrExp EOF ;
    public final void entryRuleOrExp() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:652:1: ( ruleOrExp EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:653:1: ruleOrExp EOF
            {
             before(grammarAccess.getOrExpRule()); 
            pushFollow(FOLLOW_ruleOrExp_in_entryRuleOrExp1323);
            ruleOrExp();
            _fsp--;

             after(grammarAccess.getOrExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExp1330); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:660:1: ruleOrExp : ( ( rule__OrExp__Group__0 ) ) ;
    public final void ruleOrExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:664:2: ( ( ( rule__OrExp__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:665:1: ( ( rule__OrExp__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:665:1: ( ( rule__OrExp__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:666:1: ( rule__OrExp__Group__0 )
            {
             before(grammarAccess.getOrExpAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:667:1: ( rule__OrExp__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:667:2: rule__OrExp__Group__0
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0_in_ruleOrExp1356);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:679:1: entryRuleAndExp : ruleAndExp EOF ;
    public final void entryRuleAndExp() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:680:1: ( ruleAndExp EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:681:1: ruleAndExp EOF
            {
             before(grammarAccess.getAndExpRule()); 
            pushFollow(FOLLOW_ruleAndExp_in_entryRuleAndExp1383);
            ruleAndExp();
            _fsp--;

             after(grammarAccess.getAndExpRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExp1390); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:688:1: ruleAndExp : ( ( rule__AndExp__Group__0 ) ) ;
    public final void ruleAndExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:692:2: ( ( ( rule__AndExp__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:693:1: ( ( rule__AndExp__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:693:1: ( ( rule__AndExp__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:694:1: ( rule__AndExp__Group__0 )
            {
             before(grammarAccess.getAndExpAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:695:1: ( rule__AndExp__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:695:2: rule__AndExp__Group__0
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0_in_ruleAndExp1416);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:707:1: entryRuleRelational : ruleRelational EOF ;
    public final void entryRuleRelational() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:708:1: ( ruleRelational EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:709:1: ruleRelational EOF
            {
             before(grammarAccess.getRelationalRule()); 
            pushFollow(FOLLOW_ruleRelational_in_entryRuleRelational1443);
            ruleRelational();
            _fsp--;

             after(grammarAccess.getRelationalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelational1450); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:716:1: ruleRelational : ( ( rule__Relational__Group__0 ) ) ;
    public final void ruleRelational() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:720:2: ( ( ( rule__Relational__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:721:1: ( ( rule__Relational__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:721:1: ( ( rule__Relational__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:722:1: ( rule__Relational__Group__0 )
            {
             before(grammarAccess.getRelationalAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:723:1: ( rule__Relational__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:723:2: rule__Relational__Group__0
            {
            pushFollow(FOLLOW_rule__Relational__Group__0_in_ruleRelational1476);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:735:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:736:1: ( ruleAddition EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:737:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_ruleAddition_in_entryRuleAddition1503);
            ruleAddition();
            _fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAddition1510); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:744:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:748:2: ( ( ( rule__Addition__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:749:1: ( ( rule__Addition__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:749:1: ( ( rule__Addition__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:750:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:751:1: ( rule__Addition__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:751:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_rule__Addition__Group__0_in_ruleAddition1536);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:763:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:764:1: ( ruleMultiplication EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:765:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_ruleMultiplication_in_entryRuleMultiplication1563);
            ruleMultiplication();
            _fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplication1570); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:772:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:776:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:777:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:777:1: ( ( rule__Multiplication__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:778:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:779:1: ( rule__Multiplication__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:779:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1596);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:791:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:792:1: ( rulePower EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:793:1: rulePower EOF
            {
             before(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_rulePower_in_entryRulePower1623);
            rulePower();
            _fsp--;

             after(grammarAccess.getPowerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePower1630); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:800:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:804:2: ( ( ( rule__Power__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:805:1: ( ( rule__Power__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:805:1: ( ( rule__Power__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:806:1: ( rule__Power__Group__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:807:1: ( rule__Power__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:807:2: rule__Power__Group__0
            {
            pushFollow(FOLLOW_rule__Power__Group__0_in_rulePower1656);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:819:1: entryRuleUnaryExpr : ruleUnaryExpr EOF ;
    public final void entryRuleUnaryExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:820:1: ( ruleUnaryExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:821:1: ruleUnaryExpr EOF
            {
             before(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr1683);
            ruleUnaryExpr();
            _fsp--;

             after(grammarAccess.getUnaryExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnaryExpr1690); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:828:1: ruleUnaryExpr : ( ( rule__UnaryExpr__Group__0 ) ) ;
    public final void ruleUnaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:832:2: ( ( ( rule__UnaryExpr__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:833:1: ( ( rule__UnaryExpr__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:833:1: ( ( rule__UnaryExpr__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:834:1: ( rule__UnaryExpr__Group__0 )
            {
             before(grammarAccess.getUnaryExprAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:835:1: ( rule__UnaryExpr__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:835:2: rule__UnaryExpr__Group__0
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__0_in_ruleUnaryExpr1716);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:847:1: entryRulePrePrimaryExpr : rulePrePrimaryExpr EOF ;
    public final void entryRulePrePrimaryExpr() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:848:1: ( rulePrePrimaryExpr EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:849:1: rulePrePrimaryExpr EOF
            {
             before(grammarAccess.getPrePrimaryExprRule()); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr1743);
            rulePrePrimaryExpr();
            _fsp--;

             after(grammarAccess.getPrePrimaryExprRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrePrimaryExpr1750); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:856:1: rulePrePrimaryExpr : ( ( rule__PrePrimaryExpr__Alternatives ) ) ;
    public final void rulePrePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:860:2: ( ( ( rule__PrePrimaryExpr__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:861:1: ( ( rule__PrePrimaryExpr__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:861:1: ( ( rule__PrePrimaryExpr__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:862:1: ( rule__PrePrimaryExpr__Alternatives )
            {
             before(grammarAccess.getPrePrimaryExprAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:863:1: ( rule__PrePrimaryExpr__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:863:2: rule__PrePrimaryExpr__Alternatives
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Alternatives_in_rulePrePrimaryExpr1776);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:875:1: entryRuleAbstractRef : ruleAbstractRef EOF ;
    public final void entryRuleAbstractRef() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:876:1: ( ruleAbstractRef EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:877:1: ruleAbstractRef EOF
            {
             before(grammarAccess.getAbstractRefRule()); 
            pushFollow(FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef1803);
            ruleAbstractRef();
            _fsp--;

             after(grammarAccess.getAbstractRefRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbstractRef1810); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:884:1: ruleAbstractRef : ( ( rule__AbstractRef__Group__0 ) ) ;
    public final void ruleAbstractRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:888:2: ( ( ( rule__AbstractRef__Group__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:889:1: ( ( rule__AbstractRef__Group__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:889:1: ( ( rule__AbstractRef__Group__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:890:1: ( rule__AbstractRef__Group__0 )
            {
             before(grammarAccess.getAbstractRefAccess().getGroup()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:891:1: ( rule__AbstractRef__Group__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:891:2: rule__AbstractRef__Group__0
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group__0_in_ruleAbstractRef1836);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:903:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:904:1: ( ruleTerminalExpression EOF )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:905:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1863);
            ruleTerminalExpression();
            _fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTerminalExpression1870); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:912:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:916:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:917:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:917:1: ( ( rule__TerminalExpression__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:918:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:919:1: ( rule__TerminalExpression__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:919:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression1896);
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


    // $ANTLR start ruleANNOTATION_TYPE
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:934:1: ruleANNOTATION_TYPE : ( ( rule__ANNOTATION_TYPE__Alternatives ) ) ;
    public final void ruleANNOTATION_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:938:1: ( ( ( rule__ANNOTATION_TYPE__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:939:1: ( ( rule__ANNOTATION_TYPE__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:939:1: ( ( rule__ANNOTATION_TYPE__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:940:1: ( rule__ANNOTATION_TYPE__Alternatives )
            {
             before(grammarAccess.getANNOTATION_TYPEAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:941:1: ( rule__ANNOTATION_TYPE__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:941:2: rule__ANNOTATION_TYPE__Alternatives
            {
            pushFollow(FOLLOW_rule__ANNOTATION_TYPE__Alternatives_in_ruleANNOTATION_TYPE1935);
            rule__ANNOTATION_TYPE__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getANNOTATION_TYPEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleANNOTATION_TYPE


    // $ANTLR start ruleLabelType
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:953:1: ruleLabelType : ( ( rule__LabelType__Alternatives ) ) ;
    public final void ruleLabelType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:957:1: ( ( ( rule__LabelType__Alternatives ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:958:1: ( ( rule__LabelType__Alternatives ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:958:1: ( ( rule__LabelType__Alternatives ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:959:1: ( rule__LabelType__Alternatives )
            {
             before(grammarAccess.getLabelTypeAccess().getAlternatives()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:960:1: ( rule__LabelType__Alternatives )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:960:2: rule__LabelType__Alternatives
            {
            pushFollow(FOLLOW_rule__LabelType__Alternatives_in_ruleLabelType1971);
            rule__LabelType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLabelTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLabelType


    // $ANTLR start ruleUnaryOp
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:972:1: ruleUnaryOp : ( ( '!' ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:976:1: ( ( ( '!' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:977:1: ( ( '!' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:977:1: ( ( '!' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:978:1: ( '!' )
            {
             before(grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:979:1: ( '!' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:979:3: '!'
            {
            match(input,12,FOLLOW_12_in_ruleUnaryOp2008); 

            }

             after(grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration()); 

            }


            }

        }
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


    // $ANTLR start rule__Model__Alternatives_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:991:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:995:1: ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:996:1: ( ( rule__Model__DeclarationsAssignment_1_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:996:1: ( ( rule__Model__DeclarationsAssignment_1_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:997:1: ( rule__Model__DeclarationsAssignment_1_0 )
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsAssignment_1_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:998:1: ( rule__Model__DeclarationsAssignment_1_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:998:2: rule__Model__DeclarationsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Model__DeclarationsAssignment_1_0_in_rule__Model__Alternatives_12045);
                    rule__Model__DeclarationsAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDeclarationsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1002:6: ( ( rule__Model__StatementsAssignment_1_1 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1002:6: ( ( rule__Model__StatementsAssignment_1_1 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1003:1: ( rule__Model__StatementsAssignment_1_1 )
                    {
                     before(grammarAccess.getModelAccess().getStatementsAssignment_1_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1004:1: ( rule__Model__StatementsAssignment_1_1 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1004:2: rule__Model__StatementsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Model__StatementsAssignment_1_1_in_rule__Model__Alternatives_12063);
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


    // $ANTLR start rule__Annotation__Alternatives_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1013:1: rule__Annotation__Alternatives_3 : ( ( ( rule__Annotation__ValueAssignment_3_0 ) ) | ( ( rule__Annotation__ValueAssignment_3_1 ) ) );
    public final void rule__Annotation__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1017:1: ( ( ( rule__Annotation__ValueAssignment_3_0 ) ) | ( ( rule__Annotation__ValueAssignment_3_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==52) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1013:1: rule__Annotation__Alternatives_3 : ( ( ( rule__Annotation__ValueAssignment_3_0 ) ) | ( ( rule__Annotation__ValueAssignment_3_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1018:1: ( ( rule__Annotation__ValueAssignment_3_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1018:1: ( ( rule__Annotation__ValueAssignment_3_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1019:1: ( rule__Annotation__ValueAssignment_3_0 )
                    {
                     before(grammarAccess.getAnnotationAccess().getValueAssignment_3_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1020:1: ( rule__Annotation__ValueAssignment_3_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1020:2: rule__Annotation__ValueAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__Annotation__ValueAssignment_3_0_in_rule__Annotation__Alternatives_32096);
                    rule__Annotation__ValueAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getAnnotationAccess().getValueAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1024:6: ( ( rule__Annotation__ValueAssignment_3_1 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1024:6: ( ( rule__Annotation__ValueAssignment_3_1 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1025:1: ( rule__Annotation__ValueAssignment_3_1 )
                    {
                     before(grammarAccess.getAnnotationAccess().getValueAssignment_3_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1026:1: ( rule__Annotation__ValueAssignment_3_1 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1026:2: rule__Annotation__ValueAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__Annotation__ValueAssignment_3_1_in_rule__Annotation__Alternatives_32114);
                    rule__Annotation__ValueAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getAnnotationAccess().getValueAssignment_3_1()); 

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
    // $ANTLR end rule__Annotation__Alternatives_3


    // $ANTLR start rule__Declaration__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1035:1: rule__Declaration__Alternatives : ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) | ( ruleDefXor ) | ( ruleDefMutex ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1039:1: ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) | ( ruleDefXor ) | ( ruleDefMutex ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1040:1: ( ruleDefSort )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1040:1: ( ruleDefSort )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1041:1: ruleDefSort
                    {
                     before(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDefSort_in_rule__Declaration__Alternatives2147);
                    ruleDefSort();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1046:6: ( ruleDefRange )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1046:6: ( ruleDefRange )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1047:1: ruleDefRange
                    {
                     before(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDefRange_in_rule__Declaration__Alternatives2164);
                    ruleDefRange();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1052:6: ( ruleDefOption )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1052:6: ( ruleDefOption )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1053:1: ruleDefOption
                    {
                     before(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDefOption_in_rule__Declaration__Alternatives2181);
                    ruleDefOption();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1058:6: ( ruleDefCompletion )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1058:6: ( ruleDefCompletion )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1059:1: ruleDefCompletion
                    {
                     before(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleDefCompletion_in_rule__Declaration__Alternatives2198);
                    ruleDefCompletion();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1064:6: ( ruleDefNonInertia )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1064:6: ( ruleDefNonInertia )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1065:1: ruleDefNonInertia
                    {
                     before(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDefNonInertia_in_rule__Declaration__Alternatives2215);
                    ruleDefNonInertia();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1070:6: ( ruleDefXor )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1070:6: ( ruleDefXor )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1071:1: ruleDefXor
                    {
                     before(grammarAccess.getDeclarationAccess().getDefXorParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleDefXor_in_rule__Declaration__Alternatives2232);
                    ruleDefXor();
                    _fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefXorParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1076:6: ( ruleDefMutex )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1076:6: ( ruleDefMutex )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1077:1: ruleDefMutex
                    {
                     before(grammarAccess.getDeclarationAccess().getDefMutexParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleDefMutex_in_rule__Declaration__Alternatives2249);
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


    // $ANTLR start rule__DefOption__Alternatives_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1088:1: rule__DefOption__Alternatives_1 : ( ( ( rule__DefOption__Group_1_0__0 ) ) | ( ( rule__DefOption__Group_1_1__0 ) ) );
    public final void rule__DefOption__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1092:1: ( ( ( rule__DefOption__Group_1_0__0 ) ) | ( ( rule__DefOption__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_INT) ) {
                        alt4=1;
                    }
                    else if ( (LA4_2==RULE_ID) ) {
                        alt4=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("1088:1: rule__DefOption__Alternatives_1 : ( ( ( rule__DefOption__Group_1_0__0 ) ) | ( ( rule__DefOption__Group_1_1__0 ) ) );", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1088:1: rule__DefOption__Alternatives_1 : ( ( ( rule__DefOption__Group_1_0__0 ) ) | ( ( rule__DefOption__Group_1_1__0 ) ) );", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1088:1: rule__DefOption__Alternatives_1 : ( ( ( rule__DefOption__Group_1_0__0 ) ) | ( ( rule__DefOption__Group_1_1__0 ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1093:1: ( ( rule__DefOption__Group_1_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1093:1: ( ( rule__DefOption__Group_1_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1094:1: ( rule__DefOption__Group_1_0__0 )
                    {
                     before(grammarAccess.getDefOptionAccess().getGroup_1_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1095:1: ( rule__DefOption__Group_1_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1095:2: rule__DefOption__Group_1_0__0
                    {
                    pushFollow(FOLLOW_rule__DefOption__Group_1_0__0_in_rule__DefOption__Alternatives_12282);
                    rule__DefOption__Group_1_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDefOptionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1099:6: ( ( rule__DefOption__Group_1_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1099:6: ( ( rule__DefOption__Group_1_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1100:1: ( rule__DefOption__Group_1_1__0 )
                    {
                     before(grammarAccess.getDefOptionAccess().getGroup_1_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1101:1: ( rule__DefOption__Group_1_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1101:2: rule__DefOption__Group_1_1__0
                    {
                    pushFollow(FOLLOW_rule__DefOption__Group_1_1__0_in_rule__DefOption__Alternatives_12300);
                    rule__DefOption__Group_1_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDefOptionAccess().getGroup_1_1()); 

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
    // $ANTLR end rule__DefOption__Alternatives_1


    // $ANTLR start rule__Statement__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1110:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ruleLabeledExpression ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1114:1: ( ( ruleSortDefinition ) | ( ruleLabeledExpression ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                int LA5_1 = input.LA(2);

                if ( ((LA5_1>=29 && LA5_1<=30)||(LA5_1>=36 && LA5_1<=51)) ) {
                    alt5=2;
                }
                else if ( (LA5_1==RULE_ID) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1110:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ruleLabeledExpression ) );", 5, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA5_0==RULE_STRING||(LA5_0>=RULE_INT && LA5_0<=RULE_BOOLEAN)||LA5_0==12||(LA5_0>=15 && LA5_0<=16)||LA5_0==18||LA5_0==30||LA5_0==32||LA5_0==34||LA5_0==48) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1110:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ruleLabeledExpression ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1115:1: ( ruleSortDefinition )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1115:1: ( ruleSortDefinition )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1116:1: ruleSortDefinition
                    {
                     before(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSortDefinition_in_rule__Statement__Alternatives2333);
                    ruleSortDefinition();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1121:6: ( ruleLabeledExpression )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1121:6: ( ruleLabeledExpression )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1122:1: ruleLabeledExpression
                    {
                     before(grammarAccess.getStatementAccess().getLabeledExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleLabeledExpression_in_rule__Statement__Alternatives2350);
                    ruleLabeledExpression();
                    _fsp--;

                     after(grammarAccess.getStatementAccess().getLabeledExpressionParserRuleCall_1()); 

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


    // $ANTLR start rule__Expression__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1132:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ExprAssignment_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1136:1: ( ( ( rule__Expression__ExprAssignment_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA6_1 = input.LA(2);

                if ( ((LA6_1>=RULE_STRING && LA6_1<=RULE_BOOLEAN)||LA6_1==30||LA6_1==48) ) {
                    alt6=1;
                }
                else if ( (LA6_1==32||LA6_1==34) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1132:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ExprAssignment_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_BOOLEAN:
            case 30:
            case 48:
                {
                alt6=1;
                }
                break;
            case 32:
            case 34:
                {
                alt6=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1132:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ExprAssignment_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1137:1: ( ( rule__Expression__ExprAssignment_0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1137:1: ( ( rule__Expression__ExprAssignment_0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1138:1: ( rule__Expression__ExprAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getExprAssignment_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1139:1: ( rule__Expression__ExprAssignment_0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1139:2: rule__Expression__ExprAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Expression__ExprAssignment_0_in_rule__Expression__Alternatives2382);
                    rule__Expression__ExprAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getExprAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1143:6: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1143:6: ( ( rule__Expression__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1144:1: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1145:1: ( rule__Expression__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1145:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Alternatives2400);
                    rule__Expression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getGroup_1()); 

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
    // $ANTLR end rule__Expression__Alternatives


    // $ANTLR start rule__Qualifier__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1154:1: rule__Qualifier__Alternatives : ( ( ruleExists ) | ( ruleForall ) );
    public final void rule__Qualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1158:1: ( ( ruleExists ) | ( ruleForall ) )
            int alt7=2;
            switch ( input.LA(1) ) {
            case 12:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==34) ) {
                    alt7=2;
                }
                else if ( (LA7_1==32) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("1154:1: rule__Qualifier__Alternatives : ( ( ruleExists ) | ( ruleForall ) );", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                alt7=1;
                }
                break;
            case 34:
                {
                alt7=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1154:1: rule__Qualifier__Alternatives : ( ( ruleExists ) | ( ruleForall ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1159:1: ( ruleExists )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1159:1: ( ruleExists )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1160:1: ruleExists
                    {
                     before(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleExists_in_rule__Qualifier__Alternatives2433);
                    ruleExists();
                    _fsp--;

                     after(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1165:6: ( ruleForall )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1165:6: ( ruleForall )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1166:1: ruleForall
                    {
                     before(grammarAccess.getQualifierAccess().getForallParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleForall_in_rule__Qualifier__Alternatives2450);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1176:1: rule__AssignmentOp__Alternatives_1_0 : ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) );
    public final void rule__AssignmentOp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1180:1: ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==36) ) {
                alt8=1;
            }
            else if ( (LA8_0==37) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1176:1: rule__AssignmentOp__Alternatives_1_0 : ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1181:1: ( ( rule__AssignmentOp__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1181:1: ( ( rule__AssignmentOp__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1182:1: ( rule__AssignmentOp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1183:1: ( rule__AssignmentOp__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1183:2: rule__AssignmentOp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__0_in_rule__AssignmentOp__Alternatives_1_02482);
                    rule__AssignmentOp__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1187:6: ( ( rule__AssignmentOp__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1187:6: ( ( rule__AssignmentOp__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1188:1: ( rule__AssignmentOp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAssignmentOpAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1189:1: ( rule__AssignmentOp__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1189:2: rule__AssignmentOp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__0_in_rule__AssignmentOp__Alternatives_1_02500);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1198:1: rule__Relational__Alternatives_1_0 : ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) );
    public final void rule__Relational__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1202:1: ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) )
            int alt9=7;
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
            case 45:
                {
                alt9=6;
                }
                break;
            case 46:
                {
                alt9=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1198:1: rule__Relational__Alternatives_1_0 : ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1203:1: ( ( rule__Relational__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1203:1: ( ( rule__Relational__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1204:1: ( rule__Relational__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1205:1: ( rule__Relational__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1205:2: rule__Relational__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_0__0_in_rule__Relational__Alternatives_1_02533);
                    rule__Relational__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1209:6: ( ( rule__Relational__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1209:6: ( ( rule__Relational__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1210:1: ( rule__Relational__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1211:1: ( rule__Relational__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1211:2: rule__Relational__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_1__0_in_rule__Relational__Alternatives_1_02551);
                    rule__Relational__Group_1_0_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1215:6: ( ( rule__Relational__Group_1_0_2__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1215:6: ( ( rule__Relational__Group_1_0_2__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1216:1: ( rule__Relational__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1217:1: ( rule__Relational__Group_1_0_2__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1217:2: rule__Relational__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_2__0_in_rule__Relational__Alternatives_1_02569);
                    rule__Relational__Group_1_0_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1221:6: ( ( rule__Relational__Group_1_0_3__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1221:6: ( ( rule__Relational__Group_1_0_3__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1222:1: ( rule__Relational__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_3()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1223:1: ( rule__Relational__Group_1_0_3__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1223:2: rule__Relational__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_3__0_in_rule__Relational__Alternatives_1_02587);
                    rule__Relational__Group_1_0_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1227:6: ( ( rule__Relational__Group_1_0_4__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1227:6: ( ( rule__Relational__Group_1_0_4__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1228:1: ( rule__Relational__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_4()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1229:1: ( rule__Relational__Group_1_0_4__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1229:2: rule__Relational__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_4__0_in_rule__Relational__Alternatives_1_02605);
                    rule__Relational__Group_1_0_4__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1233:6: ( ( rule__Relational__Group_1_0_5__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1233:6: ( ( rule__Relational__Group_1_0_5__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1234:1: ( rule__Relational__Group_1_0_5__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_5()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1235:1: ( rule__Relational__Group_1_0_5__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1235:2: rule__Relational__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_5__0_in_rule__Relational__Alternatives_1_02623);
                    rule__Relational__Group_1_0_5__0();
                    _fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1239:6: ( ( rule__Relational__Group_1_0_6__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1239:6: ( ( rule__Relational__Group_1_0_6__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1240:1: ( rule__Relational__Group_1_0_6__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_6()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1241:1: ( rule__Relational__Group_1_0_6__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1241:2: rule__Relational__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1_0_6__0_in_rule__Relational__Alternatives_1_02641);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1250:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1254:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==47) ) {
                alt10=1;
            }
            else if ( (LA10_0==48) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1250:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1255:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1255:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1256:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1257:1: ( rule__Addition__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1257:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02674);
                    rule__Addition__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1261:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1261:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1262:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1263:1: ( rule__Addition__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1263:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02692);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1272:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1276:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==49) ) {
                alt11=1;
            }
            else if ( (LA11_0==50) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1272:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1277:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1277:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1278:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1279:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1279:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02725);
                    rule__Multiplication__Group_1_0_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1283:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1283:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1284:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1285:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1285:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02743);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1294:1: rule__PrePrimaryExpr__Alternatives : ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) | ( ( rule__PrePrimaryExpr__Group_3__0 ) ) );
    public final void rule__PrePrimaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1298:1: ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) | ( ( rule__PrePrimaryExpr__Group_3__0 ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
            case RULE_BOOLEAN:
                {
                alt12=1;
                }
                break;
            case RULE_ID:
                {
                alt12=2;
                }
                break;
            case 30:
                {
                alt12=3;
                }
                break;
            case 48:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1294:1: rule__PrePrimaryExpr__Alternatives : ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) | ( ( rule__PrePrimaryExpr__Group_3__0 ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1299:1: ( ruleTerminalExpression )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1299:1: ( ruleTerminalExpression )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1300:1: ruleTerminalExpression
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTerminalExpression_in_rule__PrePrimaryExpr__Alternatives2776);
                    ruleTerminalExpression();
                    _fsp--;

                     after(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1305:6: ( ruleAbstractRef )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1305:6: ( ruleAbstractRef )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1306:1: ruleAbstractRef
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAbstractRef_in_rule__PrePrimaryExpr__Alternatives2793);
                    ruleAbstractRef();
                    _fsp--;

                     after(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1311:6: ( ( rule__PrePrimaryExpr__Group_2__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1311:6: ( ( rule__PrePrimaryExpr__Group_2__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1312:1: ( rule__PrePrimaryExpr__Group_2__0 )
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getGroup_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1313:1: ( rule__PrePrimaryExpr__Group_2__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1313:2: rule__PrePrimaryExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__0_in_rule__PrePrimaryExpr__Alternatives2810);
                    rule__PrePrimaryExpr__Group_2__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrePrimaryExprAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1317:6: ( ( rule__PrePrimaryExpr__Group_3__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1317:6: ( ( rule__PrePrimaryExpr__Group_3__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1318:1: ( rule__PrePrimaryExpr__Group_3__0 )
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getGroup_3()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1319:1: ( rule__PrePrimaryExpr__Group_3__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1319:2: rule__PrePrimaryExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_3__0_in_rule__PrePrimaryExpr__Alternatives2828);
                    rule__PrePrimaryExpr__Group_3__0();
                    _fsp--;


                    }

                     after(grammarAccess.getPrePrimaryExprAccess().getGroup_3()); 

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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1328:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1332:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt13=1;
                }
                break;
            case RULE_STRING:
                {
                alt13=2;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1328:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1333:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1333:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1334:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1335:1: ( rule__TerminalExpression__Group_0__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1335:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives2861);
                    rule__TerminalExpression__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1339:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1339:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1340:1: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1341:1: ( rule__TerminalExpression__Group_1__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1341:2: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives2879);
                    rule__TerminalExpression__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1345:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1345:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1346:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1347:1: ( rule__TerminalExpression__Group_2__0 )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1347:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives2897);
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


    // $ANTLR start rule__ANNOTATION_TYPE__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1356:1: rule__ANNOTATION_TYPE__Alternatives : ( ( ( 'generated' ) ) | ( ( 'author' ) ) );
    public final void rule__ANNOTATION_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1360:1: ( ( ( 'generated' ) ) | ( ( 'author' ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            else if ( (LA14_0==14) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1356:1: rule__ANNOTATION_TYPE__Alternatives : ( ( ( 'generated' ) ) | ( ( 'author' ) ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1361:1: ( ( 'generated' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1361:1: ( ( 'generated' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1362:1: ( 'generated' )
                    {
                     before(grammarAccess.getANNOTATION_TYPEAccess().getGEnumLiteralDeclaration_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1363:1: ( 'generated' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1363:3: 'generated'
                    {
                    match(input,13,FOLLOW_13_in_rule__ANNOTATION_TYPE__Alternatives2931); 

                    }

                     after(grammarAccess.getANNOTATION_TYPEAccess().getGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1368:6: ( ( 'author' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1368:6: ( ( 'author' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1369:1: ( 'author' )
                    {
                     before(grammarAccess.getANNOTATION_TYPEAccess().getAEnumLiteralDeclaration_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1370:1: ( 'author' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1370:3: 'author'
                    {
                    match(input,14,FOLLOW_14_in_rule__ANNOTATION_TYPE__Alternatives2952); 

                    }

                     after(grammarAccess.getANNOTATION_TYPEAccess().getAEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__ANNOTATION_TYPE__Alternatives


    // $ANTLR start rule__LabelType__Alternatives
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1380:1: rule__LabelType__Alternatives : ( ( ( 'Theta' ) ) | ( ( 'Delta' ) ) );
    public final void rule__LabelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1384:1: ( ( ( 'Theta' ) ) | ( ( 'Delta' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            else if ( (LA15_0==16) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1380:1: rule__LabelType__Alternatives : ( ( ( 'Theta' ) ) | ( ( 'Delta' ) ) );", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1385:1: ( ( 'Theta' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1385:1: ( ( 'Theta' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1386:1: ( 'Theta' )
                    {
                     before(grammarAccess.getLabelTypeAccess().getTEnumLiteralDeclaration_0()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1387:1: ( 'Theta' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1387:3: 'Theta'
                    {
                    match(input,15,FOLLOW_15_in_rule__LabelType__Alternatives2988); 

                    }

                     after(grammarAccess.getLabelTypeAccess().getTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1392:6: ( ( 'Delta' ) )
                    {
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1392:6: ( ( 'Delta' ) )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1393:1: ( 'Delta' )
                    {
                     before(grammarAccess.getLabelTypeAccess().getDEnumLiteralDeclaration_1()); 
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1394:1: ( 'Delta' )
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1394:3: 'Delta'
                    {
                    match(input,16,FOLLOW_16_in_rule__LabelType__Alternatives3009); 

                    }

                     after(grammarAccess.getLabelTypeAccess().getDEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__LabelType__Alternatives


    // $ANTLR start rule__Model__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1406:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1410:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1411:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03042);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03045);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1418:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1422:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1423:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1423:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1424:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1425:1: ( rule__Model__ImportsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1425:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl3072);
            	    rule__Model__ImportsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1435:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1439:1: ( rule__Model__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1440:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13103);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1446:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1450:1: ( ( ( rule__Model__Alternatives_1 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1451:1: ( ( rule__Model__Alternatives_1 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1451:1: ( ( rule__Model__Alternatives_1 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1452:1: ( rule__Model__Alternatives_1 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1453:1: ( rule__Model__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_BOOLEAN)||LA17_0==12||(LA17_0>=15 && LA17_0<=16)||LA17_0==18||LA17_0==20||(LA17_0>=22 && LA17_0<=25)||(LA17_0>=27 && LA17_0<=28)||LA17_0==30||LA17_0==32||LA17_0==34||LA17_0==48||LA17_0==53) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1453:2: rule__Model__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_1_in_rule__Model__Group__1__Impl3130);
            	    rule__Model__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1467:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1471:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1472:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03165);
            rule__Import__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03168);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1479:1: rule__Import__Group__0__Impl : ( 'load' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1483:1: ( ( 'load' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1484:1: ( 'load' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1484:1: ( 'load' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1485:1: 'load'
            {
             before(grammarAccess.getImportAccess().getLoadKeyword_0()); 
            match(input,17,FOLLOW_17_in_rule__Import__Group__0__Impl3196); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1498:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1502:1: ( rule__Import__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1503:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13227);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1509:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1513:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1514:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1514:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1515:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1516:1: ( rule__Import__ImportURIAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1516:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3254);
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


    // $ANTLR start rule__Annotation__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1530:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1534:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1535:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03288);
            rule__Annotation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03291);
            rule__Annotation__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__0


    // $ANTLR start rule__Annotation__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1542:1: rule__Annotation__Group__0__Impl : ( ';' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1546:1: ( ( ';' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1547:1: ( ';' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1547:1: ( ';' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1548:1: ';'
            {
             before(grammarAccess.getAnnotationAccess().getSemicolonKeyword_0()); 
            match(input,18,FOLLOW_18_in_rule__Annotation__Group__0__Impl3319); 
             after(grammarAccess.getAnnotationAccess().getSemicolonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__0__Impl


    // $ANTLR start rule__Annotation__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1561:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1565:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1566:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13350);
            rule__Annotation__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__13353);
            rule__Annotation__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__1


    // $ANTLR start rule__Annotation__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1573:1: rule__Annotation__Group__1__Impl : ( '#' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1577:1: ( ( '#' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1578:1: ( '#' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1578:1: ( '#' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1579:1: '#'
            {
             before(grammarAccess.getAnnotationAccess().getNumberSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__Annotation__Group__1__Impl3381); 
             after(grammarAccess.getAnnotationAccess().getNumberSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__1__Impl


    // $ANTLR start rule__Annotation__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1592:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1596:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1597:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__23412);
            rule__Annotation__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__23415);
            rule__Annotation__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__2


    // $ANTLR start rule__Annotation__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1604:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__TypeAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1608:1: ( ( ( rule__Annotation__TypeAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1609:1: ( ( rule__Annotation__TypeAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1609:1: ( ( rule__Annotation__TypeAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1610:1: ( rule__Annotation__TypeAssignment_2 )
            {
             before(grammarAccess.getAnnotationAccess().getTypeAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1611:1: ( rule__Annotation__TypeAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1611:2: rule__Annotation__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__Annotation__TypeAssignment_2_in_rule__Annotation__Group__2__Impl3442);
            rule__Annotation__TypeAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAnnotationAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__2__Impl


    // $ANTLR start rule__Annotation__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1621:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1625:1: ( rule__Annotation__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1626:2: rule__Annotation__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__33472);
            rule__Annotation__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__3


    // $ANTLR start rule__Annotation__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1632:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__Alternatives_3 )? ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1636:1: ( ( ( rule__Annotation__Alternatives_3 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1637:1: ( ( rule__Annotation__Alternatives_3 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1637:1: ( ( rule__Annotation__Alternatives_3 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1638:1: ( rule__Annotation__Alternatives_3 )?
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1639:1: ( rule__Annotation__Alternatives_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==48) ) {
                    int LA18_4 = input.LA(3);

                    if ( (LA18_4==RULE_INT) ) {
                        alt18=1;
                    }
                }
                else if ( (LA18_1==EOF||(LA18_1>=RULE_STRING && LA18_1<=RULE_BOOLEAN)||LA18_1==12||(LA18_1>=15 && LA18_1<=16)||LA18_1==18||LA18_1==20||(LA18_1>=22 && LA18_1<=25)||(LA18_1>=27 && LA18_1<=28)||LA18_1==30||LA18_1==32||LA18_1==34||LA18_1==53) ) {
                    alt18=1;
                }
            }
            else if ( (LA18_0==52) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1639:2: rule__Annotation__Alternatives_3
                    {
                    pushFollow(FOLLOW_rule__Annotation__Alternatives_3_in_rule__Annotation__Group__3__Impl3499);
                    rule__Annotation__Alternatives_3();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnnotationAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__Group__3__Impl


    // $ANTLR start rule__DefSort__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1657:1: rule__DefSort__Group__0 : rule__DefSort__Group__0__Impl rule__DefSort__Group__1 ;
    public final void rule__DefSort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1661:1: ( rule__DefSort__Group__0__Impl rule__DefSort__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1662:2: rule__DefSort__Group__0__Impl rule__DefSort__Group__1
            {
            pushFollow(FOLLOW_rule__DefSort__Group__0__Impl_in_rule__DefSort__Group__03538);
            rule__DefSort__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group__1_in_rule__DefSort__Group__03541);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1669:1: rule__DefSort__Group__0__Impl : ( ( rule__DefSort__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefSort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1673:1: ( ( ( rule__DefSort__AnnotationsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1674:1: ( ( rule__DefSort__AnnotationsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1674:1: ( ( rule__DefSort__AnnotationsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1675:1: ( rule__DefSort__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefSortAccess().getAnnotationsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1676:1: ( rule__DefSort__AnnotationsAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1676:2: rule__DefSort__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DefSort__AnnotationsAssignment_0_in_rule__DefSort__Group__0__Impl3568);
            	    rule__DefSort__AnnotationsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDefSortAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1686:1: rule__DefSort__Group__1 : rule__DefSort__Group__1__Impl rule__DefSort__Group__2 ;
    public final void rule__DefSort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1690:1: ( rule__DefSort__Group__1__Impl rule__DefSort__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1691:2: rule__DefSort__Group__1__Impl rule__DefSort__Group__2
            {
            pushFollow(FOLLOW_rule__DefSort__Group__1__Impl_in_rule__DefSort__Group__13599);
            rule__DefSort__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group__2_in_rule__DefSort__Group__13602);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1698:1: rule__DefSort__Group__1__Impl : ( ( rule__DefSort__ReifiedAssignment_1 )? ) ;
    public final void rule__DefSort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1702:1: ( ( ( rule__DefSort__ReifiedAssignment_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1703:1: ( ( rule__DefSort__ReifiedAssignment_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1703:1: ( ( rule__DefSort__ReifiedAssignment_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1704:1: ( rule__DefSort__ReifiedAssignment_1 )?
            {
             before(grammarAccess.getDefSortAccess().getReifiedAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1705:1: ( rule__DefSort__ReifiedAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1705:2: rule__DefSort__ReifiedAssignment_1
                    {
                    pushFollow(FOLLOW_rule__DefSort__ReifiedAssignment_1_in_rule__DefSort__Group__1__Impl3629);
                    rule__DefSort__ReifiedAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefSortAccess().getReifiedAssignment_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1715:1: rule__DefSort__Group__2 : rule__DefSort__Group__2__Impl rule__DefSort__Group__3 ;
    public final void rule__DefSort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1719:1: ( rule__DefSort__Group__2__Impl rule__DefSort__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1720:2: rule__DefSort__Group__2__Impl rule__DefSort__Group__3
            {
            pushFollow(FOLLOW_rule__DefSort__Group__2__Impl_in_rule__DefSort__Group__23660);
            rule__DefSort__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group__3_in_rule__DefSort__Group__23663);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1727:1: rule__DefSort__Group__2__Impl : ( 'sort' ) ;
    public final void rule__DefSort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1731:1: ( ( 'sort' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1732:1: ( 'sort' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1732:1: ( 'sort' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1733:1: 'sort'
            {
             before(grammarAccess.getDefSortAccess().getSortKeyword_2()); 
            match(input,20,FOLLOW_20_in_rule__DefSort__Group__2__Impl3691); 
             after(grammarAccess.getDefSortAccess().getSortKeyword_2()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1746:1: rule__DefSort__Group__3 : rule__DefSort__Group__3__Impl rule__DefSort__Group__4 ;
    public final void rule__DefSort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1750:1: ( rule__DefSort__Group__3__Impl rule__DefSort__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1751:2: rule__DefSort__Group__3__Impl rule__DefSort__Group__4
            {
            pushFollow(FOLLOW_rule__DefSort__Group__3__Impl_in_rule__DefSort__Group__33722);
            rule__DefSort__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group__4_in_rule__DefSort__Group__33725);
            rule__DefSort__Group__4();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1758:1: rule__DefSort__Group__3__Impl : ( ( rule__DefSort__NameAssignment_3 ) ) ;
    public final void rule__DefSort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1762:1: ( ( ( rule__DefSort__NameAssignment_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1763:1: ( ( rule__DefSort__NameAssignment_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1763:1: ( ( rule__DefSort__NameAssignment_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1764:1: ( rule__DefSort__NameAssignment_3 )
            {
             before(grammarAccess.getDefSortAccess().getNameAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1765:1: ( rule__DefSort__NameAssignment_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1765:2: rule__DefSort__NameAssignment_3
            {
            pushFollow(FOLLOW_rule__DefSort__NameAssignment_3_in_rule__DefSort__Group__3__Impl3752);
            rule__DefSort__NameAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDefSortAccess().getNameAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start rule__DefSort__Group__4
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1775:1: rule__DefSort__Group__4 : rule__DefSort__Group__4__Impl ;
    public final void rule__DefSort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1779:1: ( rule__DefSort__Group__4__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1780:2: rule__DefSort__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DefSort__Group__4__Impl_in_rule__DefSort__Group__43782);
            rule__DefSort__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group__4


    // $ANTLR start rule__DefSort__Group__4__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1786:1: rule__DefSort__Group__4__Impl : ( ( rule__DefSort__Group_4__0 )? ) ;
    public final void rule__DefSort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1790:1: ( ( ( rule__DefSort__Group_4__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1791:1: ( ( rule__DefSort__Group_4__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1791:1: ( ( rule__DefSort__Group_4__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1792:1: ( rule__DefSort__Group_4__0 )?
            {
             before(grammarAccess.getDefSortAccess().getGroup_4()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1793:1: ( rule__DefSort__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1793:2: rule__DefSort__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__DefSort__Group_4__0_in_rule__DefSort__Group__4__Impl3809);
                    rule__DefSort__Group_4__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefSortAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group__4__Impl


    // $ANTLR start rule__DefSort__Group_4__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1813:1: rule__DefSort__Group_4__0 : rule__DefSort__Group_4__0__Impl rule__DefSort__Group_4__1 ;
    public final void rule__DefSort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1817:1: ( rule__DefSort__Group_4__0__Impl rule__DefSort__Group_4__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1818:2: rule__DefSort__Group_4__0__Impl rule__DefSort__Group_4__1
            {
            pushFollow(FOLLOW_rule__DefSort__Group_4__0__Impl_in_rule__DefSort__Group_4__03850);
            rule__DefSort__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefSort__Group_4__1_in_rule__DefSort__Group_4__03853);
            rule__DefSort__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group_4__0


    // $ANTLR start rule__DefSort__Group_4__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1825:1: rule__DefSort__Group_4__0__Impl : ( ':' ) ;
    public final void rule__DefSort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1829:1: ( ( ':' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1830:1: ( ':' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1830:1: ( ':' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1831:1: ':'
            {
             before(grammarAccess.getDefSortAccess().getColonKeyword_4_0()); 
            match(input,21,FOLLOW_21_in_rule__DefSort__Group_4__0__Impl3881); 
             after(grammarAccess.getDefSortAccess().getColonKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group_4__0__Impl


    // $ANTLR start rule__DefSort__Group_4__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1844:1: rule__DefSort__Group_4__1 : rule__DefSort__Group_4__1__Impl ;
    public final void rule__DefSort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1848:1: ( rule__DefSort__Group_4__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1849:2: rule__DefSort__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__DefSort__Group_4__1__Impl_in_rule__DefSort__Group_4__13912);
            rule__DefSort__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group_4__1


    // $ANTLR start rule__DefSort__Group_4__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1855:1: rule__DefSort__Group_4__1__Impl : ( ( rule__DefSort__TypeAssignment_4_1 ) ) ;
    public final void rule__DefSort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1859:1: ( ( ( rule__DefSort__TypeAssignment_4_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1860:1: ( ( rule__DefSort__TypeAssignment_4_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1860:1: ( ( rule__DefSort__TypeAssignment_4_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1861:1: ( rule__DefSort__TypeAssignment_4_1 )
            {
             before(grammarAccess.getDefSortAccess().getTypeAssignment_4_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1862:1: ( rule__DefSort__TypeAssignment_4_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1862:2: rule__DefSort__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__DefSort__TypeAssignment_4_1_in_rule__DefSort__Group_4__1__Impl3939);
            rule__DefSort__TypeAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getDefSortAccess().getTypeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__Group_4__1__Impl


    // $ANTLR start rule__DefRange__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1876:1: rule__DefRange__Group__0 : rule__DefRange__Group__0__Impl rule__DefRange__Group__1 ;
    public final void rule__DefRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1880:1: ( rule__DefRange__Group__0__Impl rule__DefRange__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1881:2: rule__DefRange__Group__0__Impl rule__DefRange__Group__1
            {
            pushFollow(FOLLOW_rule__DefRange__Group__0__Impl_in_rule__DefRange__Group__03973);
            rule__DefRange__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefRange__Group__1_in_rule__DefRange__Group__03976);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1888:1: rule__DefRange__Group__0__Impl : ( ( rule__DefRange__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1892:1: ( ( ( rule__DefRange__AnnotationsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1893:1: ( ( rule__DefRange__AnnotationsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1893:1: ( ( rule__DefRange__AnnotationsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1894:1: ( rule__DefRange__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefRangeAccess().getAnnotationsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1895:1: ( rule__DefRange__AnnotationsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1895:2: rule__DefRange__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DefRange__AnnotationsAssignment_0_in_rule__DefRange__Group__0__Impl4003);
            	    rule__DefRange__AnnotationsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getDefRangeAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1905:1: rule__DefRange__Group__1 : rule__DefRange__Group__1__Impl rule__DefRange__Group__2 ;
    public final void rule__DefRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1909:1: ( rule__DefRange__Group__1__Impl rule__DefRange__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1910:2: rule__DefRange__Group__1__Impl rule__DefRange__Group__2
            {
            pushFollow(FOLLOW_rule__DefRange__Group__1__Impl_in_rule__DefRange__Group__14034);
            rule__DefRange__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefRange__Group__2_in_rule__DefRange__Group__14037);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1917:1: rule__DefRange__Group__1__Impl : ( 'range' ) ;
    public final void rule__DefRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1921:1: ( ( 'range' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1922:1: ( 'range' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1922:1: ( 'range' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1923:1: 'range'
            {
             before(grammarAccess.getDefRangeAccess().getRangeKeyword_1()); 
            match(input,22,FOLLOW_22_in_rule__DefRange__Group__1__Impl4065); 
             after(grammarAccess.getDefRangeAccess().getRangeKeyword_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1936:1: rule__DefRange__Group__2 : rule__DefRange__Group__2__Impl rule__DefRange__Group__3 ;
    public final void rule__DefRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1940:1: ( rule__DefRange__Group__2__Impl rule__DefRange__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1941:2: rule__DefRange__Group__2__Impl rule__DefRange__Group__3
            {
            pushFollow(FOLLOW_rule__DefRange__Group__2__Impl_in_rule__DefRange__Group__24096);
            rule__DefRange__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefRange__Group__3_in_rule__DefRange__Group__24099);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1948:1: rule__DefRange__Group__2__Impl : ( ( rule__DefRange__NameAssignment_2 ) ) ;
    public final void rule__DefRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1952:1: ( ( ( rule__DefRange__NameAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1953:1: ( ( rule__DefRange__NameAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1953:1: ( ( rule__DefRange__NameAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1954:1: ( rule__DefRange__NameAssignment_2 )
            {
             before(grammarAccess.getDefRangeAccess().getNameAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1955:1: ( rule__DefRange__NameAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1955:2: rule__DefRange__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__DefRange__NameAssignment_2_in_rule__DefRange__Group__2__Impl4126);
            rule__DefRange__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDefRangeAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1965:1: rule__DefRange__Group__3 : rule__DefRange__Group__3__Impl rule__DefRange__Group__4 ;
    public final void rule__DefRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1969:1: ( rule__DefRange__Group__3__Impl rule__DefRange__Group__4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1970:2: rule__DefRange__Group__3__Impl rule__DefRange__Group__4
            {
            pushFollow(FOLLOW_rule__DefRange__Group__3__Impl_in_rule__DefRange__Group__34156);
            rule__DefRange__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefRange__Group__4_in_rule__DefRange__Group__34159);
            rule__DefRange__Group__4();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1977:1: rule__DefRange__Group__3__Impl : ( ( rule__DefRange__MinAssignment_3 ) ) ;
    public final void rule__DefRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1981:1: ( ( ( rule__DefRange__MinAssignment_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1982:1: ( ( rule__DefRange__MinAssignment_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1982:1: ( ( rule__DefRange__MinAssignment_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1983:1: ( rule__DefRange__MinAssignment_3 )
            {
             before(grammarAccess.getDefRangeAccess().getMinAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1984:1: ( rule__DefRange__MinAssignment_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1984:2: rule__DefRange__MinAssignment_3
            {
            pushFollow(FOLLOW_rule__DefRange__MinAssignment_3_in_rule__DefRange__Group__3__Impl4186);
            rule__DefRange__MinAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDefRangeAccess().getMinAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start rule__DefRange__Group__4
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1994:1: rule__DefRange__Group__4 : rule__DefRange__Group__4__Impl ;
    public final void rule__DefRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1998:1: ( rule__DefRange__Group__4__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:1999:2: rule__DefRange__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__DefRange__Group__4__Impl_in_rule__DefRange__Group__44216);
            rule__DefRange__Group__4__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__Group__4


    // $ANTLR start rule__DefRange__Group__4__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2005:1: rule__DefRange__Group__4__Impl : ( ( rule__DefRange__MaxAssignment_4 ) ) ;
    public final void rule__DefRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2009:1: ( ( ( rule__DefRange__MaxAssignment_4 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2010:1: ( ( rule__DefRange__MaxAssignment_4 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2010:1: ( ( rule__DefRange__MaxAssignment_4 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2011:1: ( rule__DefRange__MaxAssignment_4 )
            {
             before(grammarAccess.getDefRangeAccess().getMaxAssignment_4()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2012:1: ( rule__DefRange__MaxAssignment_4 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2012:2: rule__DefRange__MaxAssignment_4
            {
            pushFollow(FOLLOW_rule__DefRange__MaxAssignment_4_in_rule__DefRange__Group__4__Impl4243);
            rule__DefRange__MaxAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getDefRangeAccess().getMaxAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__Group__4__Impl


    // $ANTLR start rule__DefOption__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2032:1: rule__DefOption__Group__0 : rule__DefOption__Group__0__Impl rule__DefOption__Group__1 ;
    public final void rule__DefOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2036:1: ( rule__DefOption__Group__0__Impl rule__DefOption__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2037:2: rule__DefOption__Group__0__Impl rule__DefOption__Group__1
            {
            pushFollow(FOLLOW_rule__DefOption__Group__0__Impl_in_rule__DefOption__Group__04283);
            rule__DefOption__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group__1_in_rule__DefOption__Group__04286);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2044:1: rule__DefOption__Group__0__Impl : ( ( rule__DefOption__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2048:1: ( ( ( rule__DefOption__AnnotationsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2049:1: ( ( rule__DefOption__AnnotationsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2049:1: ( ( rule__DefOption__AnnotationsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2050:1: ( rule__DefOption__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefOptionAccess().getAnnotationsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2051:1: ( rule__DefOption__AnnotationsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2051:2: rule__DefOption__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DefOption__AnnotationsAssignment_0_in_rule__DefOption__Group__0__Impl4313);
            	    rule__DefOption__AnnotationsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getDefOptionAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2061:1: rule__DefOption__Group__1 : rule__DefOption__Group__1__Impl ;
    public final void rule__DefOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2065:1: ( rule__DefOption__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2066:2: rule__DefOption__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DefOption__Group__1__Impl_in_rule__DefOption__Group__14344);
            rule__DefOption__Group__1__Impl();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2072:1: rule__DefOption__Group__1__Impl : ( ( rule__DefOption__Alternatives_1 ) ) ;
    public final void rule__DefOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2076:1: ( ( ( rule__DefOption__Alternatives_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2077:1: ( ( rule__DefOption__Alternatives_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2077:1: ( ( rule__DefOption__Alternatives_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2078:1: ( rule__DefOption__Alternatives_1 )
            {
             before(grammarAccess.getDefOptionAccess().getAlternatives_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2079:1: ( rule__DefOption__Alternatives_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2079:2: rule__DefOption__Alternatives_1
            {
            pushFollow(FOLLOW_rule__DefOption__Alternatives_1_in_rule__DefOption__Group__1__Impl4371);
            rule__DefOption__Alternatives_1();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getAlternatives_1()); 

            }


            }

        }
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


    // $ANTLR start rule__DefOption__Group_1_0__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2093:1: rule__DefOption__Group_1_0__0 : rule__DefOption__Group_1_0__0__Impl rule__DefOption__Group_1_0__1 ;
    public final void rule__DefOption__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2097:1: ( rule__DefOption__Group_1_0__0__Impl rule__DefOption__Group_1_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2098:2: rule__DefOption__Group_1_0__0__Impl rule__DefOption__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__DefOption__Group_1_0__0__Impl_in_rule__DefOption__Group_1_0__04405);
            rule__DefOption__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group_1_0__1_in_rule__DefOption__Group_1_0__04408);
            rule__DefOption__Group_1_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_0__0


    // $ANTLR start rule__DefOption__Group_1_0__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2105:1: rule__DefOption__Group_1_0__0__Impl : ( 'option' ) ;
    public final void rule__DefOption__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2109:1: ( ( 'option' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2110:1: ( 'option' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2110:1: ( 'option' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2111:1: 'option'
            {
             before(grammarAccess.getDefOptionAccess().getOptionKeyword_1_0_0()); 
            match(input,23,FOLLOW_23_in_rule__DefOption__Group_1_0__0__Impl4436); 
             after(grammarAccess.getDefOptionAccess().getOptionKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_0__0__Impl


    // $ANTLR start rule__DefOption__Group_1_0__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2124:1: rule__DefOption__Group_1_0__1 : rule__DefOption__Group_1_0__1__Impl rule__DefOption__Group_1_0__2 ;
    public final void rule__DefOption__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2128:1: ( rule__DefOption__Group_1_0__1__Impl rule__DefOption__Group_1_0__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2129:2: rule__DefOption__Group_1_0__1__Impl rule__DefOption__Group_1_0__2
            {
            pushFollow(FOLLOW_rule__DefOption__Group_1_0__1__Impl_in_rule__DefOption__Group_1_0__14467);
            rule__DefOption__Group_1_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group_1_0__2_in_rule__DefOption__Group_1_0__14470);
            rule__DefOption__Group_1_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_0__1


    // $ANTLR start rule__DefOption__Group_1_0__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2136:1: rule__DefOption__Group_1_0__1__Impl : ( ( rule__DefOption__NameAssignment_1_0_1 ) ) ;
    public final void rule__DefOption__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2140:1: ( ( ( rule__DefOption__NameAssignment_1_0_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2141:1: ( ( rule__DefOption__NameAssignment_1_0_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2141:1: ( ( rule__DefOption__NameAssignment_1_0_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2142:1: ( rule__DefOption__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getDefOptionAccess().getNameAssignment_1_0_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2143:1: ( rule__DefOption__NameAssignment_1_0_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2143:2: rule__DefOption__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_rule__DefOption__NameAssignment_1_0_1_in_rule__DefOption__Group_1_0__1__Impl4497);
            rule__DefOption__NameAssignment_1_0_1();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getNameAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_0__1__Impl


    // $ANTLR start rule__DefOption__Group_1_0__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2153:1: rule__DefOption__Group_1_0__2 : rule__DefOption__Group_1_0__2__Impl ;
    public final void rule__DefOption__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2157:1: ( rule__DefOption__Group_1_0__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2158:2: rule__DefOption__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_rule__DefOption__Group_1_0__2__Impl_in_rule__DefOption__Group_1_0__24527);
            rule__DefOption__Group_1_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_0__2


    // $ANTLR start rule__DefOption__Group_1_0__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2164:1: rule__DefOption__Group_1_0__2__Impl : ( ( rule__DefOption__ValueAssignment_1_0_2 ) ) ;
    public final void rule__DefOption__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2168:1: ( ( ( rule__DefOption__ValueAssignment_1_0_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2169:1: ( ( rule__DefOption__ValueAssignment_1_0_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2169:1: ( ( rule__DefOption__ValueAssignment_1_0_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2170:1: ( rule__DefOption__ValueAssignment_1_0_2 )
            {
             before(grammarAccess.getDefOptionAccess().getValueAssignment_1_0_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2171:1: ( rule__DefOption__ValueAssignment_1_0_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2171:2: rule__DefOption__ValueAssignment_1_0_2
            {
            pushFollow(FOLLOW_rule__DefOption__ValueAssignment_1_0_2_in_rule__DefOption__Group_1_0__2__Impl4554);
            rule__DefOption__ValueAssignment_1_0_2();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getValueAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_0__2__Impl


    // $ANTLR start rule__DefOption__Group_1_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2187:1: rule__DefOption__Group_1_1__0 : rule__DefOption__Group_1_1__0__Impl rule__DefOption__Group_1_1__1 ;
    public final void rule__DefOption__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2191:1: ( rule__DefOption__Group_1_1__0__Impl rule__DefOption__Group_1_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2192:2: rule__DefOption__Group_1_1__0__Impl rule__DefOption__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__DefOption__Group_1_1__0__Impl_in_rule__DefOption__Group_1_1__04590);
            rule__DefOption__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group_1_1__1_in_rule__DefOption__Group_1_1__04593);
            rule__DefOption__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_1__0


    // $ANTLR start rule__DefOption__Group_1_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2199:1: rule__DefOption__Group_1_1__0__Impl : ( 'option' ) ;
    public final void rule__DefOption__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2203:1: ( ( 'option' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2204:1: ( 'option' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2204:1: ( 'option' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2205:1: 'option'
            {
             before(grammarAccess.getDefOptionAccess().getOptionKeyword_1_1_0()); 
            match(input,23,FOLLOW_23_in_rule__DefOption__Group_1_1__0__Impl4621); 
             after(grammarAccess.getDefOptionAccess().getOptionKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_1__0__Impl


    // $ANTLR start rule__DefOption__Group_1_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2218:1: rule__DefOption__Group_1_1__1 : rule__DefOption__Group_1_1__1__Impl rule__DefOption__Group_1_1__2 ;
    public final void rule__DefOption__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2222:1: ( rule__DefOption__Group_1_1__1__Impl rule__DefOption__Group_1_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2223:2: rule__DefOption__Group_1_1__1__Impl rule__DefOption__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__DefOption__Group_1_1__1__Impl_in_rule__DefOption__Group_1_1__14652);
            rule__DefOption__Group_1_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefOption__Group_1_1__2_in_rule__DefOption__Group_1_1__14655);
            rule__DefOption__Group_1_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_1__1


    // $ANTLR start rule__DefOption__Group_1_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2230:1: rule__DefOption__Group_1_1__1__Impl : ( ( rule__DefOption__NameAssignment_1_1_1 ) ) ;
    public final void rule__DefOption__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2234:1: ( ( ( rule__DefOption__NameAssignment_1_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2235:1: ( ( rule__DefOption__NameAssignment_1_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2235:1: ( ( rule__DefOption__NameAssignment_1_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2236:1: ( rule__DefOption__NameAssignment_1_1_1 )
            {
             before(grammarAccess.getDefOptionAccess().getNameAssignment_1_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2237:1: ( rule__DefOption__NameAssignment_1_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2237:2: rule__DefOption__NameAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__DefOption__NameAssignment_1_1_1_in_rule__DefOption__Group_1_1__1__Impl4682);
            rule__DefOption__NameAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getNameAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_1__1__Impl


    // $ANTLR start rule__DefOption__Group_1_1__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2247:1: rule__DefOption__Group_1_1__2 : rule__DefOption__Group_1_1__2__Impl ;
    public final void rule__DefOption__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2251:1: ( rule__DefOption__Group_1_1__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2252:2: rule__DefOption__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_rule__DefOption__Group_1_1__2__Impl_in_rule__DefOption__Group_1_1__24712);
            rule__DefOption__Group_1_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_1__2


    // $ANTLR start rule__DefOption__Group_1_1__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2258:1: rule__DefOption__Group_1_1__2__Impl : ( ( rule__DefOption__Value2Assignment_1_1_2 ) ) ;
    public final void rule__DefOption__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2262:1: ( ( ( rule__DefOption__Value2Assignment_1_1_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2263:1: ( ( rule__DefOption__Value2Assignment_1_1_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2263:1: ( ( rule__DefOption__Value2Assignment_1_1_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2264:1: ( rule__DefOption__Value2Assignment_1_1_2 )
            {
             before(grammarAccess.getDefOptionAccess().getValue2Assignment_1_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2265:1: ( rule__DefOption__Value2Assignment_1_1_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2265:2: rule__DefOption__Value2Assignment_1_1_2
            {
            pushFollow(FOLLOW_rule__DefOption__Value2Assignment_1_1_2_in_rule__DefOption__Group_1_1__2__Impl4739);
            rule__DefOption__Value2Assignment_1_1_2();
            _fsp--;


            }

             after(grammarAccess.getDefOptionAccess().getValue2Assignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Group_1_1__2__Impl


    // $ANTLR start rule__DefCompletion__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2281:1: rule__DefCompletion__Group__0 : rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1 ;
    public final void rule__DefCompletion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2285:1: ( rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2286:2: rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__0__Impl_in_rule__DefCompletion__Group__04775);
            rule__DefCompletion__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefCompletion__Group__1_in_rule__DefCompletion__Group__04778);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2293:1: rule__DefCompletion__Group__0__Impl : ( ( rule__DefCompletion__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefCompletion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2297:1: ( ( ( rule__DefCompletion__AnnotationsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2298:1: ( ( rule__DefCompletion__AnnotationsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2298:1: ( ( rule__DefCompletion__AnnotationsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2299:1: ( rule__DefCompletion__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefCompletionAccess().getAnnotationsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2300:1: ( rule__DefCompletion__AnnotationsAssignment_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2300:2: rule__DefCompletion__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DefCompletion__AnnotationsAssignment_0_in_rule__DefCompletion__Group__0__Impl4805);
            	    rule__DefCompletion__AnnotationsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getDefCompletionAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2310:1: rule__DefCompletion__Group__1 : rule__DefCompletion__Group__1__Impl rule__DefCompletion__Group__2 ;
    public final void rule__DefCompletion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2314:1: ( rule__DefCompletion__Group__1__Impl rule__DefCompletion__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2315:2: rule__DefCompletion__Group__1__Impl rule__DefCompletion__Group__2
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__1__Impl_in_rule__DefCompletion__Group__14836);
            rule__DefCompletion__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefCompletion__Group__2_in_rule__DefCompletion__Group__14839);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2322:1: rule__DefCompletion__Group__1__Impl : ( 'completion' ) ;
    public final void rule__DefCompletion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2326:1: ( ( 'completion' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2327:1: ( 'completion' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2327:1: ( 'completion' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2328:1: 'completion'
            {
             before(grammarAccess.getDefCompletionAccess().getCompletionKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__DefCompletion__Group__1__Impl4867); 
             after(grammarAccess.getDefCompletionAccess().getCompletionKeyword_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2341:1: rule__DefCompletion__Group__2 : rule__DefCompletion__Group__2__Impl rule__DefCompletion__Group__3 ;
    public final void rule__DefCompletion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2345:1: ( rule__DefCompletion__Group__2__Impl rule__DefCompletion__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2346:2: rule__DefCompletion__Group__2__Impl rule__DefCompletion__Group__3
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__2__Impl_in_rule__DefCompletion__Group__24898);
            rule__DefCompletion__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefCompletion__Group__3_in_rule__DefCompletion__Group__24901);
            rule__DefCompletion__Group__3();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2353:1: rule__DefCompletion__Group__2__Impl : ( ( rule__DefCompletion__TypeAssignment_2 )? ) ;
    public final void rule__DefCompletion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2357:1: ( ( ( rule__DefCompletion__TypeAssignment_2 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2358:1: ( ( rule__DefCompletion__TypeAssignment_2 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2358:1: ( ( rule__DefCompletion__TypeAssignment_2 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2359:1: ( rule__DefCompletion__TypeAssignment_2 )?
            {
             before(grammarAccess.getDefCompletionAccess().getTypeAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2360:1: ( rule__DefCompletion__TypeAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=15 && LA25_0<=16)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2360:2: rule__DefCompletion__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_rule__DefCompletion__TypeAssignment_2_in_rule__DefCompletion__Group__2__Impl4928);
                    rule__DefCompletion__TypeAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefCompletionAccess().getTypeAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__DefCompletion__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2370:1: rule__DefCompletion__Group__3 : rule__DefCompletion__Group__3__Impl ;
    public final void rule__DefCompletion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2374:1: ( rule__DefCompletion__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2375:2: rule__DefCompletion__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DefCompletion__Group__3__Impl_in_rule__DefCompletion__Group__34959);
            rule__DefCompletion__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__Group__3


    // $ANTLR start rule__DefCompletion__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2381:1: rule__DefCompletion__Group__3__Impl : ( ( rule__DefCompletion__LabelAssignment_3 ) ) ;
    public final void rule__DefCompletion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2385:1: ( ( ( rule__DefCompletion__LabelAssignment_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2386:1: ( ( rule__DefCompletion__LabelAssignment_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2386:1: ( ( rule__DefCompletion__LabelAssignment_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2387:1: ( rule__DefCompletion__LabelAssignment_3 )
            {
             before(grammarAccess.getDefCompletionAccess().getLabelAssignment_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2388:1: ( rule__DefCompletion__LabelAssignment_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2388:2: rule__DefCompletion__LabelAssignment_3
            {
            pushFollow(FOLLOW_rule__DefCompletion__LabelAssignment_3_in_rule__DefCompletion__Group__3__Impl4986);
            rule__DefCompletion__LabelAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDefCompletionAccess().getLabelAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__Group__3__Impl


    // $ANTLR start rule__DefNonInertia__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2406:1: rule__DefNonInertia__Group__0 : rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1 ;
    public final void rule__DefNonInertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2410:1: ( rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2411:2: rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__0__Impl_in_rule__DefNonInertia__Group__05024);
            rule__DefNonInertia__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefNonInertia__Group__1_in_rule__DefNonInertia__Group__05027);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2418:1: rule__DefNonInertia__Group__0__Impl : ( ( rule__DefNonInertia__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefNonInertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2422:1: ( ( ( rule__DefNonInertia__AnnotationsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2423:1: ( ( rule__DefNonInertia__AnnotationsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2423:1: ( ( rule__DefNonInertia__AnnotationsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2424:1: ( rule__DefNonInertia__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefNonInertiaAccess().getAnnotationsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2425:1: ( rule__DefNonInertia__AnnotationsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2425:2: rule__DefNonInertia__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DefNonInertia__AnnotationsAssignment_0_in_rule__DefNonInertia__Group__0__Impl5054);
            	    rule__DefNonInertia__AnnotationsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getDefNonInertiaAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2435:1: rule__DefNonInertia__Group__1 : rule__DefNonInertia__Group__1__Impl rule__DefNonInertia__Group__2 ;
    public final void rule__DefNonInertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2439:1: ( rule__DefNonInertia__Group__1__Impl rule__DefNonInertia__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2440:2: rule__DefNonInertia__Group__1__Impl rule__DefNonInertia__Group__2
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__1__Impl_in_rule__DefNonInertia__Group__15085);
            rule__DefNonInertia__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefNonInertia__Group__2_in_rule__DefNonInertia__Group__15088);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2447:1: rule__DefNonInertia__Group__1__Impl : ( 'noninertial' ) ;
    public final void rule__DefNonInertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2451:1: ( ( 'noninertial' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2452:1: ( 'noninertial' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2452:1: ( 'noninertial' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2453:1: 'noninertial'
            {
             before(grammarAccess.getDefNonInertiaAccess().getNoninertialKeyword_1()); 
            match(input,25,FOLLOW_25_in_rule__DefNonInertia__Group__1__Impl5116); 
             after(grammarAccess.getDefNonInertiaAccess().getNoninertialKeyword_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2466:1: rule__DefNonInertia__Group__2 : rule__DefNonInertia__Group__2__Impl rule__DefNonInertia__Group__3 ;
    public final void rule__DefNonInertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2470:1: ( rule__DefNonInertia__Group__2__Impl rule__DefNonInertia__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2471:2: rule__DefNonInertia__Group__2__Impl rule__DefNonInertia__Group__3
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__2__Impl_in_rule__DefNonInertia__Group__25147);
            rule__DefNonInertia__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefNonInertia__Group__3_in_rule__DefNonInertia__Group__25150);
            rule__DefNonInertia__Group__3();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2478:1: rule__DefNonInertia__Group__2__Impl : ( ( rule__DefNonInertia__NamesAssignment_2 ) ) ;
    public final void rule__DefNonInertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2482:1: ( ( ( rule__DefNonInertia__NamesAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2483:1: ( ( rule__DefNonInertia__NamesAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2483:1: ( ( rule__DefNonInertia__NamesAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2484:1: ( rule__DefNonInertia__NamesAssignment_2 )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2485:1: ( rule__DefNonInertia__NamesAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2485:2: rule__DefNonInertia__NamesAssignment_2
            {
            pushFollow(FOLLOW_rule__DefNonInertia__NamesAssignment_2_in_rule__DefNonInertia__Group__2__Impl5177);
            rule__DefNonInertia__NamesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDefNonInertiaAccess().getNamesAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__DefNonInertia__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2495:1: rule__DefNonInertia__Group__3 : rule__DefNonInertia__Group__3__Impl ;
    public final void rule__DefNonInertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2499:1: ( rule__DefNonInertia__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2500:2: rule__DefNonInertia__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group__3__Impl_in_rule__DefNonInertia__Group__35207);
            rule__DefNonInertia__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group__3


    // $ANTLR start rule__DefNonInertia__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2506:1: rule__DefNonInertia__Group__3__Impl : ( ( rule__DefNonInertia__Group_3__0 )* ) ;
    public final void rule__DefNonInertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2510:1: ( ( ( rule__DefNonInertia__Group_3__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2511:1: ( ( rule__DefNonInertia__Group_3__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2511:1: ( ( rule__DefNonInertia__Group_3__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2512:1: ( rule__DefNonInertia__Group_3__0 )*
            {
             before(grammarAccess.getDefNonInertiaAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2513:1: ( rule__DefNonInertia__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2513:2: rule__DefNonInertia__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__DefNonInertia__Group_3__0_in_rule__DefNonInertia__Group__3__Impl5234);
            	    rule__DefNonInertia__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getDefNonInertiaAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group__3__Impl


    // $ANTLR start rule__DefNonInertia__Group_3__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2531:1: rule__DefNonInertia__Group_3__0 : rule__DefNonInertia__Group_3__0__Impl rule__DefNonInertia__Group_3__1 ;
    public final void rule__DefNonInertia__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2535:1: ( rule__DefNonInertia__Group_3__0__Impl rule__DefNonInertia__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2536:2: rule__DefNonInertia__Group_3__0__Impl rule__DefNonInertia__Group_3__1
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group_3__0__Impl_in_rule__DefNonInertia__Group_3__05273);
            rule__DefNonInertia__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefNonInertia__Group_3__1_in_rule__DefNonInertia__Group_3__05276);
            rule__DefNonInertia__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group_3__0


    // $ANTLR start rule__DefNonInertia__Group_3__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2543:1: rule__DefNonInertia__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DefNonInertia__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2547:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2548:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2548:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2549:1: ','
            {
             before(grammarAccess.getDefNonInertiaAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__DefNonInertia__Group_3__0__Impl5304); 
             after(grammarAccess.getDefNonInertiaAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group_3__0__Impl


    // $ANTLR start rule__DefNonInertia__Group_3__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2562:1: rule__DefNonInertia__Group_3__1 : rule__DefNonInertia__Group_3__1__Impl ;
    public final void rule__DefNonInertia__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2566:1: ( rule__DefNonInertia__Group_3__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2567:2: rule__DefNonInertia__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DefNonInertia__Group_3__1__Impl_in_rule__DefNonInertia__Group_3__15335);
            rule__DefNonInertia__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group_3__1


    // $ANTLR start rule__DefNonInertia__Group_3__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2573:1: rule__DefNonInertia__Group_3__1__Impl : ( ( rule__DefNonInertia__NamesAssignment_3_1 ) ) ;
    public final void rule__DefNonInertia__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2577:1: ( ( ( rule__DefNonInertia__NamesAssignment_3_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2578:1: ( ( rule__DefNonInertia__NamesAssignment_3_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2578:1: ( ( rule__DefNonInertia__NamesAssignment_3_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2579:1: ( rule__DefNonInertia__NamesAssignment_3_1 )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2580:1: ( rule__DefNonInertia__NamesAssignment_3_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2580:2: rule__DefNonInertia__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DefNonInertia__NamesAssignment_3_1_in_rule__DefNonInertia__Group_3__1__Impl5362);
            rule__DefNonInertia__NamesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getDefNonInertiaAccess().getNamesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__Group_3__1__Impl


    // $ANTLR start rule__DefXor__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2594:1: rule__DefXor__Group__0 : rule__DefXor__Group__0__Impl rule__DefXor__Group__1 ;
    public final void rule__DefXor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2598:1: ( rule__DefXor__Group__0__Impl rule__DefXor__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2599:2: rule__DefXor__Group__0__Impl rule__DefXor__Group__1
            {
            pushFollow(FOLLOW_rule__DefXor__Group__0__Impl_in_rule__DefXor__Group__05396);
            rule__DefXor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefXor__Group__1_in_rule__DefXor__Group__05399);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2606:1: rule__DefXor__Group__0__Impl : ( ( rule__DefXor__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefXor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2610:1: ( ( ( rule__DefXor__AnnotationsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2611:1: ( ( rule__DefXor__AnnotationsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2611:1: ( ( rule__DefXor__AnnotationsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2612:1: ( rule__DefXor__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefXorAccess().getAnnotationsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2613:1: ( rule__DefXor__AnnotationsAssignment_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2613:2: rule__DefXor__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DefXor__AnnotationsAssignment_0_in_rule__DefXor__Group__0__Impl5426);
            	    rule__DefXor__AnnotationsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getDefXorAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2623:1: rule__DefXor__Group__1 : rule__DefXor__Group__1__Impl rule__DefXor__Group__2 ;
    public final void rule__DefXor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2627:1: ( rule__DefXor__Group__1__Impl rule__DefXor__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2628:2: rule__DefXor__Group__1__Impl rule__DefXor__Group__2
            {
            pushFollow(FOLLOW_rule__DefXor__Group__1__Impl_in_rule__DefXor__Group__15457);
            rule__DefXor__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefXor__Group__2_in_rule__DefXor__Group__15460);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2635:1: rule__DefXor__Group__1__Impl : ( 'xor' ) ;
    public final void rule__DefXor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2639:1: ( ( 'xor' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2640:1: ( 'xor' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2640:1: ( 'xor' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2641:1: 'xor'
            {
             before(grammarAccess.getDefXorAccess().getXorKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__DefXor__Group__1__Impl5488); 
             after(grammarAccess.getDefXorAccess().getXorKeyword_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2654:1: rule__DefXor__Group__2 : rule__DefXor__Group__2__Impl rule__DefXor__Group__3 ;
    public final void rule__DefXor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2658:1: ( rule__DefXor__Group__2__Impl rule__DefXor__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2659:2: rule__DefXor__Group__2__Impl rule__DefXor__Group__3
            {
            pushFollow(FOLLOW_rule__DefXor__Group__2__Impl_in_rule__DefXor__Group__25519);
            rule__DefXor__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefXor__Group__3_in_rule__DefXor__Group__25522);
            rule__DefXor__Group__3();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2666:1: rule__DefXor__Group__2__Impl : ( ( rule__DefXor__NamesAssignment_2 ) ) ;
    public final void rule__DefXor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2670:1: ( ( ( rule__DefXor__NamesAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2671:1: ( ( rule__DefXor__NamesAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2671:1: ( ( rule__DefXor__NamesAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2672:1: ( rule__DefXor__NamesAssignment_2 )
            {
             before(grammarAccess.getDefXorAccess().getNamesAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2673:1: ( rule__DefXor__NamesAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2673:2: rule__DefXor__NamesAssignment_2
            {
            pushFollow(FOLLOW_rule__DefXor__NamesAssignment_2_in_rule__DefXor__Group__2__Impl5549);
            rule__DefXor__NamesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDefXorAccess().getNamesAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__DefXor__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2683:1: rule__DefXor__Group__3 : rule__DefXor__Group__3__Impl ;
    public final void rule__DefXor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2687:1: ( rule__DefXor__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2688:2: rule__DefXor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DefXor__Group__3__Impl_in_rule__DefXor__Group__35579);
            rule__DefXor__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group__3


    // $ANTLR start rule__DefXor__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2694:1: rule__DefXor__Group__3__Impl : ( ( rule__DefXor__Group_3__0 )* ) ;
    public final void rule__DefXor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2698:1: ( ( ( rule__DefXor__Group_3__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2699:1: ( ( rule__DefXor__Group_3__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2699:1: ( ( rule__DefXor__Group_3__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2700:1: ( rule__DefXor__Group_3__0 )*
            {
             before(grammarAccess.getDefXorAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2701:1: ( rule__DefXor__Group_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==26) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2701:2: rule__DefXor__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__DefXor__Group_3__0_in_rule__DefXor__Group__3__Impl5606);
            	    rule__DefXor__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getDefXorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group__3__Impl


    // $ANTLR start rule__DefXor__Group_3__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2719:1: rule__DefXor__Group_3__0 : rule__DefXor__Group_3__0__Impl rule__DefXor__Group_3__1 ;
    public final void rule__DefXor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2723:1: ( rule__DefXor__Group_3__0__Impl rule__DefXor__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2724:2: rule__DefXor__Group_3__0__Impl rule__DefXor__Group_3__1
            {
            pushFollow(FOLLOW_rule__DefXor__Group_3__0__Impl_in_rule__DefXor__Group_3__05645);
            rule__DefXor__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefXor__Group_3__1_in_rule__DefXor__Group_3__05648);
            rule__DefXor__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group_3__0


    // $ANTLR start rule__DefXor__Group_3__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2731:1: rule__DefXor__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DefXor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2735:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2736:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2736:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2737:1: ','
            {
             before(grammarAccess.getDefXorAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__DefXor__Group_3__0__Impl5676); 
             after(grammarAccess.getDefXorAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group_3__0__Impl


    // $ANTLR start rule__DefXor__Group_3__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2750:1: rule__DefXor__Group_3__1 : rule__DefXor__Group_3__1__Impl ;
    public final void rule__DefXor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2754:1: ( rule__DefXor__Group_3__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2755:2: rule__DefXor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DefXor__Group_3__1__Impl_in_rule__DefXor__Group_3__15707);
            rule__DefXor__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group_3__1


    // $ANTLR start rule__DefXor__Group_3__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2761:1: rule__DefXor__Group_3__1__Impl : ( ( rule__DefXor__NamesAssignment_3_1 ) ) ;
    public final void rule__DefXor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2765:1: ( ( ( rule__DefXor__NamesAssignment_3_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2766:1: ( ( rule__DefXor__NamesAssignment_3_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2766:1: ( ( rule__DefXor__NamesAssignment_3_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2767:1: ( rule__DefXor__NamesAssignment_3_1 )
            {
             before(grammarAccess.getDefXorAccess().getNamesAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2768:1: ( rule__DefXor__NamesAssignment_3_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2768:2: rule__DefXor__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DefXor__NamesAssignment_3_1_in_rule__DefXor__Group_3__1__Impl5734);
            rule__DefXor__NamesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getDefXorAccess().getNamesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__Group_3__1__Impl


    // $ANTLR start rule__DefMutex__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2782:1: rule__DefMutex__Group__0 : rule__DefMutex__Group__0__Impl rule__DefMutex__Group__1 ;
    public final void rule__DefMutex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2786:1: ( rule__DefMutex__Group__0__Impl rule__DefMutex__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2787:2: rule__DefMutex__Group__0__Impl rule__DefMutex__Group__1
            {
            pushFollow(FOLLOW_rule__DefMutex__Group__0__Impl_in_rule__DefMutex__Group__05768);
            rule__DefMutex__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefMutex__Group__1_in_rule__DefMutex__Group__05771);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2794:1: rule__DefMutex__Group__0__Impl : ( ( rule__DefMutex__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefMutex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2798:1: ( ( ( rule__DefMutex__AnnotationsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2799:1: ( ( rule__DefMutex__AnnotationsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2799:1: ( ( rule__DefMutex__AnnotationsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2800:1: ( rule__DefMutex__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefMutexAccess().getAnnotationsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2801:1: ( rule__DefMutex__AnnotationsAssignment_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2801:2: rule__DefMutex__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__DefMutex__AnnotationsAssignment_0_in_rule__DefMutex__Group__0__Impl5798);
            	    rule__DefMutex__AnnotationsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getDefMutexAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2811:1: rule__DefMutex__Group__1 : rule__DefMutex__Group__1__Impl rule__DefMutex__Group__2 ;
    public final void rule__DefMutex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2815:1: ( rule__DefMutex__Group__1__Impl rule__DefMutex__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2816:2: rule__DefMutex__Group__1__Impl rule__DefMutex__Group__2
            {
            pushFollow(FOLLOW_rule__DefMutex__Group__1__Impl_in_rule__DefMutex__Group__15829);
            rule__DefMutex__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefMutex__Group__2_in_rule__DefMutex__Group__15832);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2823:1: rule__DefMutex__Group__1__Impl : ( 'mutex' ) ;
    public final void rule__DefMutex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2827:1: ( ( 'mutex' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2828:1: ( 'mutex' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2828:1: ( 'mutex' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2829:1: 'mutex'
            {
             before(grammarAccess.getDefMutexAccess().getMutexKeyword_1()); 
            match(input,28,FOLLOW_28_in_rule__DefMutex__Group__1__Impl5860); 
             after(grammarAccess.getDefMutexAccess().getMutexKeyword_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2842:1: rule__DefMutex__Group__2 : rule__DefMutex__Group__2__Impl rule__DefMutex__Group__3 ;
    public final void rule__DefMutex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2846:1: ( rule__DefMutex__Group__2__Impl rule__DefMutex__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2847:2: rule__DefMutex__Group__2__Impl rule__DefMutex__Group__3
            {
            pushFollow(FOLLOW_rule__DefMutex__Group__2__Impl_in_rule__DefMutex__Group__25891);
            rule__DefMutex__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefMutex__Group__3_in_rule__DefMutex__Group__25894);
            rule__DefMutex__Group__3();
            _fsp--;


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2854:1: rule__DefMutex__Group__2__Impl : ( ( rule__DefMutex__NamesAssignment_2 ) ) ;
    public final void rule__DefMutex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2858:1: ( ( ( rule__DefMutex__NamesAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2859:1: ( ( rule__DefMutex__NamesAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2859:1: ( ( rule__DefMutex__NamesAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2860:1: ( rule__DefMutex__NamesAssignment_2 )
            {
             before(grammarAccess.getDefMutexAccess().getNamesAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2861:1: ( rule__DefMutex__NamesAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2861:2: rule__DefMutex__NamesAssignment_2
            {
            pushFollow(FOLLOW_rule__DefMutex__NamesAssignment_2_in_rule__DefMutex__Group__2__Impl5921);
            rule__DefMutex__NamesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDefMutexAccess().getNamesAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__DefMutex__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2871:1: rule__DefMutex__Group__3 : rule__DefMutex__Group__3__Impl ;
    public final void rule__DefMutex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2875:1: ( rule__DefMutex__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2876:2: rule__DefMutex__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__DefMutex__Group__3__Impl_in_rule__DefMutex__Group__35951);
            rule__DefMutex__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group__3


    // $ANTLR start rule__DefMutex__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2882:1: rule__DefMutex__Group__3__Impl : ( ( rule__DefMutex__Group_3__0 )* ) ;
    public final void rule__DefMutex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2886:1: ( ( ( rule__DefMutex__Group_3__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2887:1: ( ( rule__DefMutex__Group_3__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2887:1: ( ( rule__DefMutex__Group_3__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2888:1: ( rule__DefMutex__Group_3__0 )*
            {
             before(grammarAccess.getDefMutexAccess().getGroup_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2889:1: ( rule__DefMutex__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2889:2: rule__DefMutex__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__DefMutex__Group_3__0_in_rule__DefMutex__Group__3__Impl5978);
            	    rule__DefMutex__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getDefMutexAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group__3__Impl


    // $ANTLR start rule__DefMutex__Group_3__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2907:1: rule__DefMutex__Group_3__0 : rule__DefMutex__Group_3__0__Impl rule__DefMutex__Group_3__1 ;
    public final void rule__DefMutex__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2911:1: ( rule__DefMutex__Group_3__0__Impl rule__DefMutex__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2912:2: rule__DefMutex__Group_3__0__Impl rule__DefMutex__Group_3__1
            {
            pushFollow(FOLLOW_rule__DefMutex__Group_3__0__Impl_in_rule__DefMutex__Group_3__06017);
            rule__DefMutex__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DefMutex__Group_3__1_in_rule__DefMutex__Group_3__06020);
            rule__DefMutex__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group_3__0


    // $ANTLR start rule__DefMutex__Group_3__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2919:1: rule__DefMutex__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DefMutex__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2923:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2924:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2924:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2925:1: ','
            {
             before(grammarAccess.getDefMutexAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_26_in_rule__DefMutex__Group_3__0__Impl6048); 
             after(grammarAccess.getDefMutexAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group_3__0__Impl


    // $ANTLR start rule__DefMutex__Group_3__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2938:1: rule__DefMutex__Group_3__1 : rule__DefMutex__Group_3__1__Impl ;
    public final void rule__DefMutex__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2942:1: ( rule__DefMutex__Group_3__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2943:2: rule__DefMutex__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__DefMutex__Group_3__1__Impl_in_rule__DefMutex__Group_3__16079);
            rule__DefMutex__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group_3__1


    // $ANTLR start rule__DefMutex__Group_3__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2949:1: rule__DefMutex__Group_3__1__Impl : ( ( rule__DefMutex__NamesAssignment_3_1 ) ) ;
    public final void rule__DefMutex__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2953:1: ( ( ( rule__DefMutex__NamesAssignment_3_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2954:1: ( ( rule__DefMutex__NamesAssignment_3_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2954:1: ( ( rule__DefMutex__NamesAssignment_3_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2955:1: ( rule__DefMutex__NamesAssignment_3_1 )
            {
             before(grammarAccess.getDefMutexAccess().getNamesAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2956:1: ( rule__DefMutex__NamesAssignment_3_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2956:2: rule__DefMutex__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__DefMutex__NamesAssignment_3_1_in_rule__DefMutex__Group_3__1__Impl6106);
            rule__DefMutex__NamesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getDefMutexAccess().getNamesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__Group_3__1__Impl


    // $ANTLR start rule__LabeledExpression__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2970:1: rule__LabeledExpression__Group__0 : rule__LabeledExpression__Group__0__Impl rule__LabeledExpression__Group__1 ;
    public final void rule__LabeledExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2974:1: ( rule__LabeledExpression__Group__0__Impl rule__LabeledExpression__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2975:2: rule__LabeledExpression__Group__0__Impl rule__LabeledExpression__Group__1
            {
            pushFollow(FOLLOW_rule__LabeledExpression__Group__0__Impl_in_rule__LabeledExpression__Group__06140);
            rule__LabeledExpression__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LabeledExpression__Group__1_in_rule__LabeledExpression__Group__06143);
            rule__LabeledExpression__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group__0


    // $ANTLR start rule__LabeledExpression__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2982:1: rule__LabeledExpression__Group__0__Impl : ( ( rule__LabeledExpression__AnnotationsAssignment_0 )* ) ;
    public final void rule__LabeledExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2986:1: ( ( ( rule__LabeledExpression__AnnotationsAssignment_0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2987:1: ( ( rule__LabeledExpression__AnnotationsAssignment_0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2987:1: ( ( rule__LabeledExpression__AnnotationsAssignment_0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2988:1: ( rule__LabeledExpression__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getLabeledExpressionAccess().getAnnotationsAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2989:1: ( rule__LabeledExpression__AnnotationsAssignment_0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==18) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2989:2: rule__LabeledExpression__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__LabeledExpression__AnnotationsAssignment_0_in_rule__LabeledExpression__Group__0__Impl6170);
            	    rule__LabeledExpression__AnnotationsAssignment_0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getLabeledExpressionAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group__0__Impl


    // $ANTLR start rule__LabeledExpression__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:2999:1: rule__LabeledExpression__Group__1 : rule__LabeledExpression__Group__1__Impl rule__LabeledExpression__Group__2 ;
    public final void rule__LabeledExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3003:1: ( rule__LabeledExpression__Group__1__Impl rule__LabeledExpression__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3004:2: rule__LabeledExpression__Group__1__Impl rule__LabeledExpression__Group__2
            {
            pushFollow(FOLLOW_rule__LabeledExpression__Group__1__Impl_in_rule__LabeledExpression__Group__16201);
            rule__LabeledExpression__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LabeledExpression__Group__2_in_rule__LabeledExpression__Group__16204);
            rule__LabeledExpression__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group__1


    // $ANTLR start rule__LabeledExpression__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3011:1: rule__LabeledExpression__Group__1__Impl : ( ( rule__LabeledExpression__Group_1__0 )? ) ;
    public final void rule__LabeledExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3015:1: ( ( ( rule__LabeledExpression__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3016:1: ( ( rule__LabeledExpression__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3016:1: ( ( rule__LabeledExpression__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3017:1: ( rule__LabeledExpression__Group_1__0 )?
            {
             before(grammarAccess.getLabeledExpressionAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3018:1: ( rule__LabeledExpression__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=15 && LA33_0<=16)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3018:2: rule__LabeledExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__LabeledExpression__Group_1__0_in_rule__LabeledExpression__Group__1__Impl6231);
                    rule__LabeledExpression__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLabeledExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group__1__Impl


    // $ANTLR start rule__LabeledExpression__Group__2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3028:1: rule__LabeledExpression__Group__2 : rule__LabeledExpression__Group__2__Impl rule__LabeledExpression__Group__3 ;
    public final void rule__LabeledExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3032:1: ( rule__LabeledExpression__Group__2__Impl rule__LabeledExpression__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3033:2: rule__LabeledExpression__Group__2__Impl rule__LabeledExpression__Group__3
            {
            pushFollow(FOLLOW_rule__LabeledExpression__Group__2__Impl_in_rule__LabeledExpression__Group__26262);
            rule__LabeledExpression__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LabeledExpression__Group__3_in_rule__LabeledExpression__Group__26265);
            rule__LabeledExpression__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group__2


    // $ANTLR start rule__LabeledExpression__Group__2__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3040:1: rule__LabeledExpression__Group__2__Impl : ( ( rule__LabeledExpression__ExprAssignment_2 ) ) ;
    public final void rule__LabeledExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3044:1: ( ( ( rule__LabeledExpression__ExprAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3045:1: ( ( rule__LabeledExpression__ExprAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3045:1: ( ( rule__LabeledExpression__ExprAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3046:1: ( rule__LabeledExpression__ExprAssignment_2 )
            {
             before(grammarAccess.getLabeledExpressionAccess().getExprAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3047:1: ( rule__LabeledExpression__ExprAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3047:2: rule__LabeledExpression__ExprAssignment_2
            {
            pushFollow(FOLLOW_rule__LabeledExpression__ExprAssignment_2_in_rule__LabeledExpression__Group__2__Impl6292);
            rule__LabeledExpression__ExprAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getLabeledExpressionAccess().getExprAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group__2__Impl


    // $ANTLR start rule__LabeledExpression__Group__3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3057:1: rule__LabeledExpression__Group__3 : rule__LabeledExpression__Group__3__Impl ;
    public final void rule__LabeledExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3061:1: ( rule__LabeledExpression__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3062:2: rule__LabeledExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__LabeledExpression__Group__3__Impl_in_rule__LabeledExpression__Group__36322);
            rule__LabeledExpression__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group__3


    // $ANTLR start rule__LabeledExpression__Group__3__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3068:1: rule__LabeledExpression__Group__3__Impl : ( '.' ) ;
    public final void rule__LabeledExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3072:1: ( ( '.' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3073:1: ( '.' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3073:1: ( '.' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3074:1: '.'
            {
             before(grammarAccess.getLabeledExpressionAccess().getFullStopKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__LabeledExpression__Group__3__Impl6350); 
             after(grammarAccess.getLabeledExpressionAccess().getFullStopKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group__3__Impl


    // $ANTLR start rule__LabeledExpression__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3095:1: rule__LabeledExpression__Group_1__0 : rule__LabeledExpression__Group_1__0__Impl rule__LabeledExpression__Group_1__1 ;
    public final void rule__LabeledExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3099:1: ( rule__LabeledExpression__Group_1__0__Impl rule__LabeledExpression__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3100:2: rule__LabeledExpression__Group_1__0__Impl rule__LabeledExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__LabeledExpression__Group_1__0__Impl_in_rule__LabeledExpression__Group_1__06389);
            rule__LabeledExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__LabeledExpression__Group_1__1_in_rule__LabeledExpression__Group_1__06392);
            rule__LabeledExpression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group_1__0


    // $ANTLR start rule__LabeledExpression__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3107:1: rule__LabeledExpression__Group_1__0__Impl : ( ( rule__LabeledExpression__NameAssignment_1_0 ) ) ;
    public final void rule__LabeledExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3111:1: ( ( ( rule__LabeledExpression__NameAssignment_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3112:1: ( ( rule__LabeledExpression__NameAssignment_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3112:1: ( ( rule__LabeledExpression__NameAssignment_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3113:1: ( rule__LabeledExpression__NameAssignment_1_0 )
            {
             before(grammarAccess.getLabeledExpressionAccess().getNameAssignment_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3114:1: ( rule__LabeledExpression__NameAssignment_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3114:2: rule__LabeledExpression__NameAssignment_1_0
            {
            pushFollow(FOLLOW_rule__LabeledExpression__NameAssignment_1_0_in_rule__LabeledExpression__Group_1__0__Impl6419);
            rule__LabeledExpression__NameAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getLabeledExpressionAccess().getNameAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group_1__0__Impl


    // $ANTLR start rule__LabeledExpression__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3124:1: rule__LabeledExpression__Group_1__1 : rule__LabeledExpression__Group_1__1__Impl ;
    public final void rule__LabeledExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3128:1: ( rule__LabeledExpression__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3129:2: rule__LabeledExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__LabeledExpression__Group_1__1__Impl_in_rule__LabeledExpression__Group_1__16449);
            rule__LabeledExpression__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group_1__1


    // $ANTLR start rule__LabeledExpression__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3135:1: rule__LabeledExpression__Group_1__1__Impl : ( ':' ) ;
    public final void rule__LabeledExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3139:1: ( ( ':' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3140:1: ( ':' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3140:1: ( ':' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3141:1: ':'
            {
             before(grammarAccess.getLabeledExpressionAccess().getColonKeyword_1_1()); 
            match(input,21,FOLLOW_21_in_rule__LabeledExpression__Group_1__1__Impl6477); 
             after(grammarAccess.getLabeledExpressionAccess().getColonKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__Group_1__1__Impl


    // $ANTLR start rule__SortDefinition__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3158:1: rule__SortDefinition__Group__0 : rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1 ;
    public final void rule__SortDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3162:1: ( rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3163:2: rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__0__Impl_in_rule__SortDefinition__Group__06512);
            rule__SortDefinition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SortDefinition__Group__1_in_rule__SortDefinition__Group__06515);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3170:1: rule__SortDefinition__Group__0__Impl : ( ( rule__SortDefinition__SortAssignment_0 ) ) ;
    public final void rule__SortDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3174:1: ( ( ( rule__SortDefinition__SortAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3175:1: ( ( rule__SortDefinition__SortAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3175:1: ( ( rule__SortDefinition__SortAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3176:1: ( rule__SortDefinition__SortAssignment_0 )
            {
             before(grammarAccess.getSortDefinitionAccess().getSortAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3177:1: ( rule__SortDefinition__SortAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3177:2: rule__SortDefinition__SortAssignment_0
            {
            pushFollow(FOLLOW_rule__SortDefinition__SortAssignment_0_in_rule__SortDefinition__Group__0__Impl6542);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3187:1: rule__SortDefinition__Group__1 : rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2 ;
    public final void rule__SortDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3191:1: ( rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3192:2: rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__1__Impl_in_rule__SortDefinition__Group__16572);
            rule__SortDefinition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SortDefinition__Group__2_in_rule__SortDefinition__Group__16575);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3199:1: rule__SortDefinition__Group__1__Impl : ( ( rule__SortDefinition__DefinitionsAssignment_1 ) ) ;
    public final void rule__SortDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3203:1: ( ( ( rule__SortDefinition__DefinitionsAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3204:1: ( ( rule__SortDefinition__DefinitionsAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3204:1: ( ( rule__SortDefinition__DefinitionsAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3205:1: ( rule__SortDefinition__DefinitionsAssignment_1 )
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3206:1: ( rule__SortDefinition__DefinitionsAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3206:2: rule__SortDefinition__DefinitionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SortDefinition__DefinitionsAssignment_1_in_rule__SortDefinition__Group__1__Impl6602);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3216:1: rule__SortDefinition__Group__2 : rule__SortDefinition__Group__2__Impl ;
    public final void rule__SortDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3220:1: ( rule__SortDefinition__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3221:2: rule__SortDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group__2__Impl_in_rule__SortDefinition__Group__26632);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3227:1: rule__SortDefinition__Group__2__Impl : ( ( rule__SortDefinition__Group_2__0 )* ) ;
    public final void rule__SortDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3231:1: ( ( ( rule__SortDefinition__Group_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3232:1: ( ( rule__SortDefinition__Group_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3232:1: ( ( rule__SortDefinition__Group_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3233:1: ( rule__SortDefinition__Group_2__0 )*
            {
             before(grammarAccess.getSortDefinitionAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3234:1: ( rule__SortDefinition__Group_2__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==26) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3234:2: rule__SortDefinition__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__SortDefinition__Group_2__0_in_rule__SortDefinition__Group__2__Impl6659);
            	    rule__SortDefinition__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3250:1: rule__SortDefinition__Group_2__0 : rule__SortDefinition__Group_2__0__Impl rule__SortDefinition__Group_2__1 ;
    public final void rule__SortDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3254:1: ( rule__SortDefinition__Group_2__0__Impl rule__SortDefinition__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3255:2: rule__SortDefinition__Group_2__0__Impl rule__SortDefinition__Group_2__1
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group_2__0__Impl_in_rule__SortDefinition__Group_2__06696);
            rule__SortDefinition__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SortDefinition__Group_2__1_in_rule__SortDefinition__Group_2__06699);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3262:1: rule__SortDefinition__Group_2__0__Impl : ( ',' ) ;
    public final void rule__SortDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3266:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3267:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3267:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3268:1: ','
            {
             before(grammarAccess.getSortDefinitionAccess().getCommaKeyword_2_0()); 
            match(input,26,FOLLOW_26_in_rule__SortDefinition__Group_2__0__Impl6727); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3281:1: rule__SortDefinition__Group_2__1 : rule__SortDefinition__Group_2__1__Impl ;
    public final void rule__SortDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3285:1: ( rule__SortDefinition__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3286:2: rule__SortDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SortDefinition__Group_2__1__Impl_in_rule__SortDefinition__Group_2__16758);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3292:1: rule__SortDefinition__Group_2__1__Impl : ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) ) ;
    public final void rule__SortDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3296:1: ( ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3297:1: ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3297:1: ( ( rule__SortDefinition__DefinitionsAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3298:1: ( rule__SortDefinition__DefinitionsAssignment_2_1 )
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3299:1: ( rule__SortDefinition__DefinitionsAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3299:2: rule__SortDefinition__DefinitionsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SortDefinition__DefinitionsAssignment_2_1_in_rule__SortDefinition__Group_2__1__Impl6785);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3313:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3317:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3318:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__06819);
            rule__Definition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__06822);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3325:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__NameAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3329:1: ( ( ( rule__Definition__NameAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3330:1: ( ( rule__Definition__NameAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3330:1: ( ( rule__Definition__NameAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3331:1: ( rule__Definition__NameAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3332:1: ( rule__Definition__NameAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3332:2: rule__Definition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Definition__NameAssignment_0_in_rule__Definition__Group__0__Impl6849);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3342:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3346:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3347:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__16879);
            rule__Definition__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__16882);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3354:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__Group_1__0 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3358:1: ( ( ( rule__Definition__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3359:1: ( ( rule__Definition__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3359:1: ( ( rule__Definition__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3360:1: ( rule__Definition__Group_1__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3361:1: ( rule__Definition__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==30) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==RULE_ID) ) {
                    int LA35_3 = input.LA(3);

                    if ( (LA35_3==31) ) {
                        int LA35_5 = input.LA(4);

                        if ( (LA35_5==48) ) {
                            int LA35_6 = input.LA(5);

                            if ( (LA35_6==RULE_INT) ) {
                                alt35=1;
                            }
                        }
                        else if ( (LA35_5==EOF||(LA35_5>=RULE_STRING && LA35_5<=RULE_BOOLEAN)||LA35_5==12||(LA35_5>=15 && LA35_5<=16)||LA35_5==18||(LA35_5>=20 && LA35_5<=28)||LA35_5==30||LA35_5==32||LA35_5==34||LA35_5==53) ) {
                            alt35=1;
                        }
                    }
                    else if ( (LA35_3==26) ) {
                        alt35=1;
                    }
                }
                else if ( (LA35_1==26||LA35_1==31) ) {
                    alt35=1;
                }
            }
            switch (alt35) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3361:2: rule__Definition__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Definition__Group_1__0_in_rule__Definition__Group__1__Impl6909);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3371:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3375:1: ( rule__Definition__Group__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3376:2: rule__Definition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__26940);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3382:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__Group_2__0 )? ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3386:1: ( ( ( rule__Definition__Group_2__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3387:1: ( ( rule__Definition__Group_2__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3387:1: ( ( rule__Definition__Group_2__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3388:1: ( rule__Definition__Group_2__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3389:1: ( rule__Definition__Group_2__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==21) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3389:2: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Definition__Group_2__0_in_rule__Definition__Group__2__Impl6967);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3405:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3409:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3410:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__0__Impl_in_rule__Definition__Group_1__07004);
            rule__Definition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1__1_in_rule__Definition__Group_1__07007);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3417:1: rule__Definition__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3421:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3422:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3422:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3423:1: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Definition__Group_1__0__Impl7035); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3436:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3440:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3441:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__1__Impl_in_rule__Definition__Group_1__17066);
            rule__Definition__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1__2_in_rule__Definition__Group_1__17069);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3448:1: rule__Definition__Group_1__1__Impl : ( ( rule__Definition__ArgsAssignment_1_1 )? ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3452:1: ( ( ( rule__Definition__ArgsAssignment_1_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3453:1: ( ( rule__Definition__ArgsAssignment_1_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3453:1: ( ( rule__Definition__ArgsAssignment_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3454:1: ( rule__Definition__ArgsAssignment_1_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3455:1: ( rule__Definition__ArgsAssignment_1_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3455:2: rule__Definition__ArgsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Definition__ArgsAssignment_1_1_in_rule__Definition__Group_1__1__Impl7096);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3465:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3469:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3470:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__2__Impl_in_rule__Definition__Group_1__27127);
            rule__Definition__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1__3_in_rule__Definition__Group_1__27130);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3477:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__Group_1_2__0 )* ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3481:1: ( ( ( rule__Definition__Group_1_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3482:1: ( ( rule__Definition__Group_1_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3482:1: ( ( rule__Definition__Group_1_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3483:1: ( rule__Definition__Group_1_2__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3484:1: ( rule__Definition__Group_1_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==26) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3484:2: rule__Definition__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Definition__Group_1_2__0_in_rule__Definition__Group_1__2__Impl7157);
            	    rule__Definition__Group_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3494:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3498:1: ( rule__Definition__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3499:2: rule__Definition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_1__3__Impl_in_rule__Definition__Group_1__37188);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3505:1: rule__Definition__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3509:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3510:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3510:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3511:1: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3()); 
            match(input,31,FOLLOW_31_in_rule__Definition__Group_1__3__Impl7216); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3532:1: rule__Definition__Group_1_2__0 : rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 ;
    public final void rule__Definition__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3536:1: ( rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3537:2: rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_1_2__0__Impl_in_rule__Definition__Group_1_2__07255);
            rule__Definition__Group_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_1_2__1_in_rule__Definition__Group_1_2__07258);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3544:1: rule__Definition__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3548:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3549:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3549:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3550:1: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0()); 
            match(input,26,FOLLOW_26_in_rule__Definition__Group_1_2__0__Impl7286); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3563:1: rule__Definition__Group_1_2__1 : rule__Definition__Group_1_2__1__Impl ;
    public final void rule__Definition__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3567:1: ( rule__Definition__Group_1_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3568:2: rule__Definition__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_1_2__1__Impl_in_rule__Definition__Group_1_2__17317);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3574:1: rule__Definition__Group_1_2__1__Impl : ( ( rule__Definition__ArgsAssignment_1_2_1 ) ) ;
    public final void rule__Definition__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3578:1: ( ( ( rule__Definition__ArgsAssignment_1_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3579:1: ( ( rule__Definition__ArgsAssignment_1_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3579:1: ( ( rule__Definition__ArgsAssignment_1_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3580:1: ( rule__Definition__ArgsAssignment_1_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_1_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3581:1: ( rule__Definition__ArgsAssignment_1_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3581:2: rule__Definition__ArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_rule__Definition__ArgsAssignment_1_2_1_in_rule__Definition__Group_1_2__1__Impl7344);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3595:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3599:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3600:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__0__Impl_in_rule__Definition__Group_2__07378);
            rule__Definition__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Definition__Group_2__1_in_rule__Definition__Group_2__07381);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3607:1: rule__Definition__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3611:1: ( ( ':' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3612:1: ( ':' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3612:1: ( ':' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3613:1: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_2_0()); 
            match(input,21,FOLLOW_21_in_rule__Definition__Group_2__0__Impl7409); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3626:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3630:1: ( rule__Definition__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3631:2: rule__Definition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Definition__Group_2__1__Impl_in_rule__Definition__Group_2__17440);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3637:1: rule__Definition__Group_2__1__Impl : ( ( rule__Definition__ReturnAssignment_2_1 ) ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3641:1: ( ( ( rule__Definition__ReturnAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3642:1: ( ( rule__Definition__ReturnAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3642:1: ( ( rule__Definition__ReturnAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3643:1: ( rule__Definition__ReturnAssignment_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getReturnAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3644:1: ( rule__Definition__ReturnAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3644:2: rule__Definition__ReturnAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Definition__ReturnAssignment_2_1_in_rule__Definition__Group_2__1__Impl7467);
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


    // $ANTLR start rule__Expression__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3658:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3662:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3663:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__07501);
            rule__Expression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__07504);
            rule__Expression__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__0


    // $ANTLR start rule__Expression__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3670:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__QualifiersAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3674:1: ( ( ( rule__Expression__QualifiersAssignment_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3675:1: ( ( rule__Expression__QualifiersAssignment_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3675:1: ( ( rule__Expression__QualifiersAssignment_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3676:1: ( rule__Expression__QualifiersAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getQualifiersAssignment_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3677:1: ( rule__Expression__QualifiersAssignment_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3677:2: rule__Expression__QualifiersAssignment_1_0
            {
            pushFollow(FOLLOW_rule__Expression__QualifiersAssignment_1_0_in_rule__Expression__Group_1__0__Impl7531);
            rule__Expression__QualifiersAssignment_1_0();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getQualifiersAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__0__Impl


    // $ANTLR start rule__Expression__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3687:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3691:1: ( rule__Expression__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3692:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__17561);
            rule__Expression__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__1


    // $ANTLR start rule__Expression__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3698:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExprAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3702:1: ( ( ( rule__Expression__ExprAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3703:1: ( ( rule__Expression__ExprAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3703:1: ( ( rule__Expression__ExprAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3704:1: ( rule__Expression__ExprAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExprAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3705:1: ( rule__Expression__ExprAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3705:2: rule__Expression__ExprAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Expression__ExprAssignment_1_1_in_rule__Expression__Group_1__1__Impl7588);
            rule__Expression__ExprAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getExpressionAccess().getExprAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__Group_1__1__Impl


    // $ANTLR start rule__Parameters__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3719:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3723:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3724:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
            {
            pushFollow(FOLLOW_rule__Parameters__Group__0__Impl_in_rule__Parameters__Group__07622);
            rule__Parameters__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameters__Group__1_in_rule__Parameters__Group__07625);
            rule__Parameters__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameters__Group__0


    // $ANTLR start rule__Parameters__Group__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3731:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__NamesAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3735:1: ( ( ( rule__Parameters__NamesAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3736:1: ( ( rule__Parameters__NamesAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3736:1: ( ( rule__Parameters__NamesAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3737:1: ( rule__Parameters__NamesAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getNamesAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3738:1: ( rule__Parameters__NamesAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3738:2: rule__Parameters__NamesAssignment_0
            {
            pushFollow(FOLLOW_rule__Parameters__NamesAssignment_0_in_rule__Parameters__Group__0__Impl7652);
            rule__Parameters__NamesAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getParametersAccess().getNamesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameters__Group__0__Impl


    // $ANTLR start rule__Parameters__Group__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3748:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3752:1: ( rule__Parameters__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3753:2: rule__Parameters__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameters__Group__1__Impl_in_rule__Parameters__Group__17682);
            rule__Parameters__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameters__Group__1


    // $ANTLR start rule__Parameters__Group__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3759:1: rule__Parameters__Group__1__Impl : ( ( rule__Parameters__Group_1__0 )* ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3763:1: ( ( ( rule__Parameters__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3764:1: ( ( rule__Parameters__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3764:1: ( ( rule__Parameters__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3765:1: ( rule__Parameters__Group_1__0 )*
            {
             before(grammarAccess.getParametersAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3766:1: ( rule__Parameters__Group_1__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==26) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3766:2: rule__Parameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Parameters__Group_1__0_in_rule__Parameters__Group__1__Impl7709);
            	    rule__Parameters__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

             after(grammarAccess.getParametersAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameters__Group__1__Impl


    // $ANTLR start rule__Parameters__Group_1__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3780:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3784:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3785:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
            {
            pushFollow(FOLLOW_rule__Parameters__Group_1__0__Impl_in_rule__Parameters__Group_1__07744);
            rule__Parameters__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Parameters__Group_1__1_in_rule__Parameters__Group_1__07747);
            rule__Parameters__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameters__Group_1__0


    // $ANTLR start rule__Parameters__Group_1__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3792:1: rule__Parameters__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3796:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3797:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3797:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3798:1: ','
            {
             before(grammarAccess.getParametersAccess().getCommaKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__Parameters__Group_1__0__Impl7775); 
             after(grammarAccess.getParametersAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameters__Group_1__0__Impl


    // $ANTLR start rule__Parameters__Group_1__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3811:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3815:1: ( rule__Parameters__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3816:2: rule__Parameters__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Parameters__Group_1__1__Impl_in_rule__Parameters__Group_1__17806);
            rule__Parameters__Group_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameters__Group_1__1


    // $ANTLR start rule__Parameters__Group_1__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3822:1: rule__Parameters__Group_1__1__Impl : ( ( rule__Parameters__NamesAssignment_1_1 ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3826:1: ( ( ( rule__Parameters__NamesAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3827:1: ( ( rule__Parameters__NamesAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3827:1: ( ( rule__Parameters__NamesAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3828:1: ( rule__Parameters__NamesAssignment_1_1 )
            {
             before(grammarAccess.getParametersAccess().getNamesAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3829:1: ( rule__Parameters__NamesAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3829:2: rule__Parameters__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Parameters__NamesAssignment_1_1_in_rule__Parameters__Group_1__1__Impl7833);
            rule__Parameters__NamesAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getParametersAccess().getNamesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameters__Group_1__1__Impl


    // $ANTLR start rule__Exists__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3843:1: rule__Exists__Group__0 : rule__Exists__Group__0__Impl rule__Exists__Group__1 ;
    public final void rule__Exists__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3847:1: ( rule__Exists__Group__0__Impl rule__Exists__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3848:2: rule__Exists__Group__0__Impl rule__Exists__Group__1
            {
            pushFollow(FOLLOW_rule__Exists__Group__0__Impl_in_rule__Exists__Group__07867);
            rule__Exists__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group__1_in_rule__Exists__Group__07870);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3855:1: rule__Exists__Group__0__Impl : ( ( rule__Exists__OpAssignment_0 )? ) ;
    public final void rule__Exists__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3859:1: ( ( ( rule__Exists__OpAssignment_0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3860:1: ( ( rule__Exists__OpAssignment_0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3860:1: ( ( rule__Exists__OpAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3861:1: ( rule__Exists__OpAssignment_0 )?
            {
             before(grammarAccess.getExistsAccess().getOpAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3862:1: ( rule__Exists__OpAssignment_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==12) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3862:2: rule__Exists__OpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Exists__OpAssignment_0_in_rule__Exists__Group__0__Impl7897);
                    rule__Exists__OpAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getExistsAccess().getOpAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3872:1: rule__Exists__Group__1 : rule__Exists__Group__1__Impl rule__Exists__Group__2 ;
    public final void rule__Exists__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3876:1: ( rule__Exists__Group__1__Impl rule__Exists__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3877:2: rule__Exists__Group__1__Impl rule__Exists__Group__2
            {
            pushFollow(FOLLOW_rule__Exists__Group__1__Impl_in_rule__Exists__Group__17928);
            rule__Exists__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group__2_in_rule__Exists__Group__17931);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3884:1: rule__Exists__Group__1__Impl : ( '{' ) ;
    public final void rule__Exists__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3888:1: ( ( '{' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3889:1: ( '{' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3889:1: ( '{' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3890:1: '{'
            {
             before(grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__Exists__Group__1__Impl7959); 
             after(grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3903:1: rule__Exists__Group__2 : rule__Exists__Group__2__Impl rule__Exists__Group__3 ;
    public final void rule__Exists__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3907:1: ( rule__Exists__Group__2__Impl rule__Exists__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3908:2: rule__Exists__Group__2__Impl rule__Exists__Group__3
            {
            pushFollow(FOLLOW_rule__Exists__Group__2__Impl_in_rule__Exists__Group__27990);
            rule__Exists__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exists__Group__3_in_rule__Exists__Group__27993);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3915:1: rule__Exists__Group__2__Impl : ( ( rule__Exists__ParametersAssignment_2 ) ) ;
    public final void rule__Exists__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3919:1: ( ( ( rule__Exists__ParametersAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3920:1: ( ( rule__Exists__ParametersAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3920:1: ( ( rule__Exists__ParametersAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3921:1: ( rule__Exists__ParametersAssignment_2 )
            {
             before(grammarAccess.getExistsAccess().getParametersAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3922:1: ( rule__Exists__ParametersAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3922:2: rule__Exists__ParametersAssignment_2
            {
            pushFollow(FOLLOW_rule__Exists__ParametersAssignment_2_in_rule__Exists__Group__2__Impl8020);
            rule__Exists__ParametersAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getExistsAccess().getParametersAssignment_2()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3932:1: rule__Exists__Group__3 : rule__Exists__Group__3__Impl ;
    public final void rule__Exists__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3936:1: ( rule__Exists__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3937:2: rule__Exists__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Exists__Group__3__Impl_in_rule__Exists__Group__38050);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3943:1: rule__Exists__Group__3__Impl : ( '}' ) ;
    public final void rule__Exists__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3947:1: ( ( '}' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3948:1: ( '}' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3948:1: ( '}' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3949:1: '}'
            {
             before(grammarAccess.getExistsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__Exists__Group__3__Impl8078); 
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


    // $ANTLR start rule__Forall__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3970:1: rule__Forall__Group__0 : rule__Forall__Group__0__Impl rule__Forall__Group__1 ;
    public final void rule__Forall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3974:1: ( rule__Forall__Group__0__Impl rule__Forall__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3975:2: rule__Forall__Group__0__Impl rule__Forall__Group__1
            {
            pushFollow(FOLLOW_rule__Forall__Group__0__Impl_in_rule__Forall__Group__08117);
            rule__Forall__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group__1_in_rule__Forall__Group__08120);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3982:1: rule__Forall__Group__0__Impl : ( ( rule__Forall__OpAssignment_0 )? ) ;
    public final void rule__Forall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3986:1: ( ( ( rule__Forall__OpAssignment_0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3987:1: ( ( rule__Forall__OpAssignment_0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3987:1: ( ( rule__Forall__OpAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3988:1: ( rule__Forall__OpAssignment_0 )?
            {
             before(grammarAccess.getForallAccess().getOpAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3989:1: ( rule__Forall__OpAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3989:2: rule__Forall__OpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Forall__OpAssignment_0_in_rule__Forall__Group__0__Impl8147);
                    rule__Forall__OpAssignment_0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForallAccess().getOpAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:3999:1: rule__Forall__Group__1 : rule__Forall__Group__1__Impl rule__Forall__Group__2 ;
    public final void rule__Forall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4003:1: ( rule__Forall__Group__1__Impl rule__Forall__Group__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4004:2: rule__Forall__Group__1__Impl rule__Forall__Group__2
            {
            pushFollow(FOLLOW_rule__Forall__Group__1__Impl_in_rule__Forall__Group__18178);
            rule__Forall__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group__2_in_rule__Forall__Group__18181);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4011:1: rule__Forall__Group__1__Impl : ( '[' ) ;
    public final void rule__Forall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4015:1: ( ( '[' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4016:1: ( '[' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4016:1: ( '[' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4017:1: '['
            {
             before(grammarAccess.getForallAccess().getLeftSquareBracketKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Forall__Group__1__Impl8209); 
             after(grammarAccess.getForallAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4030:1: rule__Forall__Group__2 : rule__Forall__Group__2__Impl rule__Forall__Group__3 ;
    public final void rule__Forall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4034:1: ( rule__Forall__Group__2__Impl rule__Forall__Group__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4035:2: rule__Forall__Group__2__Impl rule__Forall__Group__3
            {
            pushFollow(FOLLOW_rule__Forall__Group__2__Impl_in_rule__Forall__Group__28240);
            rule__Forall__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Forall__Group__3_in_rule__Forall__Group__28243);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4042:1: rule__Forall__Group__2__Impl : ( ( rule__Forall__ParametersAssignment_2 ) ) ;
    public final void rule__Forall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4046:1: ( ( ( rule__Forall__ParametersAssignment_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4047:1: ( ( rule__Forall__ParametersAssignment_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4047:1: ( ( rule__Forall__ParametersAssignment_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4048:1: ( rule__Forall__ParametersAssignment_2 )
            {
             before(grammarAccess.getForallAccess().getParametersAssignment_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4049:1: ( rule__Forall__ParametersAssignment_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4049:2: rule__Forall__ParametersAssignment_2
            {
            pushFollow(FOLLOW_rule__Forall__ParametersAssignment_2_in_rule__Forall__Group__2__Impl8270);
            rule__Forall__ParametersAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getForallAccess().getParametersAssignment_2()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4059:1: rule__Forall__Group__3 : rule__Forall__Group__3__Impl ;
    public final void rule__Forall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4063:1: ( rule__Forall__Group__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4064:2: rule__Forall__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Forall__Group__3__Impl_in_rule__Forall__Group__38300);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4070:1: rule__Forall__Group__3__Impl : ( ']' ) ;
    public final void rule__Forall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4074:1: ( ( ']' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4075:1: ( ']' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4075:1: ( ']' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4076:1: ']'
            {
             before(grammarAccess.getForallAccess().getRightSquareBracketKeyword_3()); 
            match(input,35,FOLLOW_35_in_rule__Forall__Group__3__Impl8328); 
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


    // $ANTLR start rule__AssignmentOp__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4097:1: rule__AssignmentOp__Group__0 : rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 ;
    public final void rule__AssignmentOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4101:1: ( rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4102:2: rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__0__Impl_in_rule__AssignmentOp__Group__08367);
            rule__AssignmentOp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group__1_in_rule__AssignmentOp__Group__08370);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4109:1: rule__AssignmentOp__Group__0__Impl : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4113:1: ( ( ruleOrExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4114:1: ( ruleOrExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4114:1: ( ruleOrExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4115:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleOrExp_in_rule__AssignmentOp__Group__0__Impl8397);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4126:1: rule__AssignmentOp__Group__1 : rule__AssignmentOp__Group__1__Impl ;
    public final void rule__AssignmentOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4130:1: ( rule__AssignmentOp__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4131:2: rule__AssignmentOp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group__1__Impl_in_rule__AssignmentOp__Group__18426);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4137:1: rule__AssignmentOp__Group__1__Impl : ( ( rule__AssignmentOp__Group_1__0 )? ) ;
    public final void rule__AssignmentOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4141:1: ( ( ( rule__AssignmentOp__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4142:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4142:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4143:1: ( rule__AssignmentOp__Group_1__0 )?
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4144:1: ( rule__AssignmentOp__Group_1__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=36 && LA42_0<=37)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4144:2: rule__AssignmentOp__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__Group_1__0_in_rule__AssignmentOp__Group__1__Impl8453);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4158:1: rule__AssignmentOp__Group_1__0 : rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 ;
    public final void rule__AssignmentOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4162:1: ( rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4163:2: rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__0__Impl_in_rule__AssignmentOp__Group_1__08488);
            rule__AssignmentOp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__1_in_rule__AssignmentOp__Group_1__08491);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4170:1: rule__AssignmentOp__Group_1__0__Impl : ( ( rule__AssignmentOp__Alternatives_1_0 ) ) ;
    public final void rule__AssignmentOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4174:1: ( ( ( rule__AssignmentOp__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4175:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4175:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4176:1: ( rule__AssignmentOp__Alternatives_1_0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4177:1: ( rule__AssignmentOp__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4177:2: rule__AssignmentOp__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Alternatives_1_0_in_rule__AssignmentOp__Group_1__0__Impl8518);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4187:1: rule__AssignmentOp__Group_1__1 : rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2 ;
    public final void rule__AssignmentOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4191:1: ( rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4192:2: rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__1__Impl_in_rule__AssignmentOp__Group_1__18548);
            rule__AssignmentOp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__2_in_rule__AssignmentOp__Group_1__18551);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4199:1: rule__AssignmentOp__Group_1__1__Impl : ( ( rule__AssignmentOp__QAssignment_1_1 )? ) ;
    public final void rule__AssignmentOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4203:1: ( ( ( rule__AssignmentOp__QAssignment_1_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4204:1: ( ( rule__AssignmentOp__QAssignment_1_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4204:1: ( ( rule__AssignmentOp__QAssignment_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4205:1: ( rule__AssignmentOp__QAssignment_1_1 )?
            {
             before(grammarAccess.getAssignmentOpAccess().getQAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4206:1: ( rule__AssignmentOp__QAssignment_1_1 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==12) ) {
                int LA43_1 = input.LA(2);

                if ( (LA43_1==32||LA43_1==34) ) {
                    alt43=1;
                }
            }
            else if ( (LA43_0==32||LA43_0==34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4206:2: rule__AssignmentOp__QAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__AssignmentOp__QAssignment_1_1_in_rule__AssignmentOp__Group_1__1__Impl8578);
                    rule__AssignmentOp__QAssignment_1_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssignmentOpAccess().getQAssignment_1_1()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4216:1: rule__AssignmentOp__Group_1__2 : rule__AssignmentOp__Group_1__2__Impl ;
    public final void rule__AssignmentOp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4220:1: ( rule__AssignmentOp__Group_1__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4221:2: rule__AssignmentOp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1__2__Impl_in_rule__AssignmentOp__Group_1__28609);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4227:1: rule__AssignmentOp__Group_1__2__Impl : ( ( rule__AssignmentOp__RightAssignment_1_2 ) ) ;
    public final void rule__AssignmentOp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4231:1: ( ( ( rule__AssignmentOp__RightAssignment_1_2 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4232:1: ( ( rule__AssignmentOp__RightAssignment_1_2 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4232:1: ( ( rule__AssignmentOp__RightAssignment_1_2 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4233:1: ( rule__AssignmentOp__RightAssignment_1_2 )
            {
             before(grammarAccess.getAssignmentOpAccess().getRightAssignment_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4234:1: ( rule__AssignmentOp__RightAssignment_1_2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4234:2: rule__AssignmentOp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__AssignmentOp__RightAssignment_1_2_in_rule__AssignmentOp__Group_1__2__Impl8636);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4250:1: rule__AssignmentOp__Group_1_0_0__0 : rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 ;
    public final void rule__AssignmentOp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4254:1: ( rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4255:2: rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__0__Impl_in_rule__AssignmentOp__Group_1_0_0__08672);
            rule__AssignmentOp__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__1_in_rule__AssignmentOp__Group_1_0_0__08675);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4262:1: rule__AssignmentOp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4266:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4267:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4267:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4268:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4269:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4271:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4281:1: rule__AssignmentOp__Group_1_0_0__1 : rule__AssignmentOp__Group_1_0_0__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4285:1: ( rule__AssignmentOp__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4286:2: rule__AssignmentOp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_0__1__Impl_in_rule__AssignmentOp__Group_1_0_0__18733);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4292:1: rule__AssignmentOp__Group_1_0_0__1__Impl : ( '->' ) ;
    public final void rule__AssignmentOp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4296:1: ( ( '->' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4297:1: ( '->' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4297:1: ( '->' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4298:1: '->'
            {
             before(grammarAccess.getAssignmentOpAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1()); 
            match(input,36,FOLLOW_36_in_rule__AssignmentOp__Group_1_0_0__1__Impl8761); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4315:1: rule__AssignmentOp__Group_1_0_1__0 : rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 ;
    public final void rule__AssignmentOp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4319:1: ( rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4320:2: rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__0__Impl_in_rule__AssignmentOp__Group_1_0_1__08796);
            rule__AssignmentOp__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__1_in_rule__AssignmentOp__Group_1_0_1__08799);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4327:1: rule__AssignmentOp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4331:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4332:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4332:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4333:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4334:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4336:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4346:1: rule__AssignmentOp__Group_1_0_1__1 : rule__AssignmentOp__Group_1_0_1__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4350:1: ( rule__AssignmentOp__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4351:2: rule__AssignmentOp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AssignmentOp__Group_1_0_1__1__Impl_in_rule__AssignmentOp__Group_1_0_1__18857);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4357:1: rule__AssignmentOp__Group_1_0_1__1__Impl : ( '<->' ) ;
    public final void rule__AssignmentOp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4361:1: ( ( '<->' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4362:1: ( '<->' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4362:1: ( '<->' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4363:1: '<->'
            {
             before(grammarAccess.getAssignmentOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1()); 
            match(input,37,FOLLOW_37_in_rule__AssignmentOp__Group_1_0_1__1__Impl8885); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4380:1: rule__OrExp__Group__0 : rule__OrExp__Group__0__Impl rule__OrExp__Group__1 ;
    public final void rule__OrExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4384:1: ( rule__OrExp__Group__0__Impl rule__OrExp__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4385:2: rule__OrExp__Group__0__Impl rule__OrExp__Group__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__08920);
            rule__OrExp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__08923);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4392:1: rule__OrExp__Group__0__Impl : ( ruleAndExp ) ;
    public final void rule__OrExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4396:1: ( ( ruleAndExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4397:1: ( ruleAndExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4397:1: ( ruleAndExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4398:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__Group__0__Impl8950);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4409:1: rule__OrExp__Group__1 : rule__OrExp__Group__1__Impl ;
    public final void rule__OrExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4413:1: ( rule__OrExp__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4414:2: rule__OrExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__18979);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4420:1: rule__OrExp__Group__1__Impl : ( ( rule__OrExp__Group_1__0 )* ) ;
    public final void rule__OrExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4424:1: ( ( ( rule__OrExp__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4425:1: ( ( rule__OrExp__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4425:1: ( ( rule__OrExp__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4426:1: ( rule__OrExp__Group_1__0 )*
            {
             before(grammarAccess.getOrExpAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4427:1: ( rule__OrExp__Group_1__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==38) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4427:2: rule__OrExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl9006);
            	    rule__OrExp__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4441:1: rule__OrExp__Group_1__0 : rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 ;
    public final void rule__OrExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4445:1: ( rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4446:2: rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__09041);
            rule__OrExp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__09044);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4453:1: rule__OrExp__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4457:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4458:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4458:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4459:1: ()
            {
             before(grammarAccess.getOrExpAccess().getOrLeftAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4460:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4462:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4472:1: rule__OrExp__Group_1__1 : rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 ;
    public final void rule__OrExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4476:1: ( rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4477:2: rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__19102);
            rule__OrExp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__2_in_rule__OrExp__Group_1__19105);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4484:1: rule__OrExp__Group_1__1__Impl : ( '|' ) ;
    public final void rule__OrExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4488:1: ( ( '|' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4489:1: ( '|' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4489:1: ( '|' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4490:1: '|'
            {
             before(grammarAccess.getOrExpAccess().getVerticalLineKeyword_1_1()); 
            match(input,38,FOLLOW_38_in_rule__OrExp__Group_1__1__Impl9133); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4503:1: rule__OrExp__Group_1__2 : rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3 ;
    public final void rule__OrExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4507:1: ( rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4508:2: rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__2__Impl_in_rule__OrExp__Group_1__29164);
            rule__OrExp__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__OrExp__Group_1__3_in_rule__OrExp__Group_1__29167);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4515:1: rule__OrExp__Group_1__2__Impl : ( ( rule__OrExp__QAssignment_1_2 )? ) ;
    public final void rule__OrExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4519:1: ( ( ( rule__OrExp__QAssignment_1_2 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4520:1: ( ( rule__OrExp__QAssignment_1_2 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4520:1: ( ( rule__OrExp__QAssignment_1_2 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4521:1: ( rule__OrExp__QAssignment_1_2 )?
            {
             before(grammarAccess.getOrExpAccess().getQAssignment_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4522:1: ( rule__OrExp__QAssignment_1_2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==12) ) {
                int LA45_1 = input.LA(2);

                if ( (LA45_1==32||LA45_1==34) ) {
                    alt45=1;
                }
            }
            else if ( (LA45_0==32||LA45_0==34) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4522:2: rule__OrExp__QAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__OrExp__QAssignment_1_2_in_rule__OrExp__Group_1__2__Impl9194);
                    rule__OrExp__QAssignment_1_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrExpAccess().getQAssignment_1_2()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4532:1: rule__OrExp__Group_1__3 : rule__OrExp__Group_1__3__Impl ;
    public final void rule__OrExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4536:1: ( rule__OrExp__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4537:2: rule__OrExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__OrExp__Group_1__3__Impl_in_rule__OrExp__Group_1__39225);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4543:1: rule__OrExp__Group_1__3__Impl : ( ( rule__OrExp__RightAssignment_1_3 ) ) ;
    public final void rule__OrExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4547:1: ( ( ( rule__OrExp__RightAssignment_1_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4548:1: ( ( rule__OrExp__RightAssignment_1_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4548:1: ( ( rule__OrExp__RightAssignment_1_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4549:1: ( rule__OrExp__RightAssignment_1_3 )
            {
             before(grammarAccess.getOrExpAccess().getRightAssignment_1_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4550:1: ( rule__OrExp__RightAssignment_1_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4550:2: rule__OrExp__RightAssignment_1_3
            {
            pushFollow(FOLLOW_rule__OrExp__RightAssignment_1_3_in_rule__OrExp__Group_1__3__Impl9252);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4568:1: rule__AndExp__Group__0 : rule__AndExp__Group__0__Impl rule__AndExp__Group__1 ;
    public final void rule__AndExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4572:1: ( rule__AndExp__Group__0__Impl rule__AndExp__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4573:2: rule__AndExp__Group__0__Impl rule__AndExp__Group__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__09290);
            rule__AndExp__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__09293);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4580:1: rule__AndExp__Group__0__Impl : ( ruleRelational ) ;
    public final void rule__AndExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4584:1: ( ( ruleRelational ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4585:1: ( ruleRelational )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4585:1: ( ruleRelational )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4586:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleRelational_in_rule__AndExp__Group__0__Impl9320);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4597:1: rule__AndExp__Group__1 : rule__AndExp__Group__1__Impl ;
    public final void rule__AndExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4601:1: ( rule__AndExp__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4602:2: rule__AndExp__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__19349);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4608:1: rule__AndExp__Group__1__Impl : ( ( rule__AndExp__Group_1__0 )* ) ;
    public final void rule__AndExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4612:1: ( ( ( rule__AndExp__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4613:1: ( ( rule__AndExp__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4613:1: ( ( rule__AndExp__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4614:1: ( rule__AndExp__Group_1__0 )*
            {
             before(grammarAccess.getAndExpAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4615:1: ( rule__AndExp__Group_1__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==39) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4615:2: rule__AndExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl9376);
            	    rule__AndExp__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4629:1: rule__AndExp__Group_1__0 : rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 ;
    public final void rule__AndExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4633:1: ( rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4634:2: rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__09411);
            rule__AndExp__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__09414);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4641:1: rule__AndExp__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4645:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4646:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4646:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4647:1: ()
            {
             before(grammarAccess.getAndExpAccess().getAndLeftAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4648:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4650:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4660:1: rule__AndExp__Group_1__1 : rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 ;
    public final void rule__AndExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4664:1: ( rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4665:2: rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__19472);
            rule__AndExp__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__2_in_rule__AndExp__Group_1__19475);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4672:1: rule__AndExp__Group_1__1__Impl : ( '&' ) ;
    public final void rule__AndExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4676:1: ( ( '&' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4677:1: ( '&' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4677:1: ( '&' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4678:1: '&'
            {
             before(grammarAccess.getAndExpAccess().getAmpersandKeyword_1_1()); 
            match(input,39,FOLLOW_39_in_rule__AndExp__Group_1__1__Impl9503); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4691:1: rule__AndExp__Group_1__2 : rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3 ;
    public final void rule__AndExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4695:1: ( rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4696:2: rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__2__Impl_in_rule__AndExp__Group_1__29534);
            rule__AndExp__Group_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AndExp__Group_1__3_in_rule__AndExp__Group_1__29537);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4703:1: rule__AndExp__Group_1__2__Impl : ( ( rule__AndExp__QAssignment_1_2 )? ) ;
    public final void rule__AndExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4707:1: ( ( ( rule__AndExp__QAssignment_1_2 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4708:1: ( ( rule__AndExp__QAssignment_1_2 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4708:1: ( ( rule__AndExp__QAssignment_1_2 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4709:1: ( rule__AndExp__QAssignment_1_2 )?
            {
             before(grammarAccess.getAndExpAccess().getQAssignment_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4710:1: ( rule__AndExp__QAssignment_1_2 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==12) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==32||LA47_1==34) ) {
                    alt47=1;
                }
            }
            else if ( (LA47_0==32||LA47_0==34) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4710:2: rule__AndExp__QAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__AndExp__QAssignment_1_2_in_rule__AndExp__Group_1__2__Impl9564);
                    rule__AndExp__QAssignment_1_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAndExpAccess().getQAssignment_1_2()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4720:1: rule__AndExp__Group_1__3 : rule__AndExp__Group_1__3__Impl ;
    public final void rule__AndExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4724:1: ( rule__AndExp__Group_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4725:2: rule__AndExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_rule__AndExp__Group_1__3__Impl_in_rule__AndExp__Group_1__39595);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4731:1: rule__AndExp__Group_1__3__Impl : ( ( rule__AndExp__RightAssignment_1_3 ) ) ;
    public final void rule__AndExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4735:1: ( ( ( rule__AndExp__RightAssignment_1_3 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4736:1: ( ( rule__AndExp__RightAssignment_1_3 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4736:1: ( ( rule__AndExp__RightAssignment_1_3 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4737:1: ( rule__AndExp__RightAssignment_1_3 )
            {
             before(grammarAccess.getAndExpAccess().getRightAssignment_1_3()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4738:1: ( rule__AndExp__RightAssignment_1_3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4738:2: rule__AndExp__RightAssignment_1_3
            {
            pushFollow(FOLLOW_rule__AndExp__RightAssignment_1_3_in_rule__AndExp__Group_1__3__Impl9622);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4756:1: rule__Relational__Group__0 : rule__Relational__Group__0__Impl rule__Relational__Group__1 ;
    public final void rule__Relational__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4760:1: ( rule__Relational__Group__0__Impl rule__Relational__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4761:2: rule__Relational__Group__0__Impl rule__Relational__Group__1
            {
            pushFollow(FOLLOW_rule__Relational__Group__0__Impl_in_rule__Relational__Group__09660);
            rule__Relational__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group__1_in_rule__Relational__Group__09663);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4768:1: rule__Relational__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relational__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4772:1: ( ( ruleAddition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4773:1: ( ruleAddition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4773:1: ( ruleAddition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4774:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relational__Group__0__Impl9690);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4785:1: rule__Relational__Group__1 : rule__Relational__Group__1__Impl ;
    public final void rule__Relational__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4789:1: ( rule__Relational__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4790:2: rule__Relational__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group__1__Impl_in_rule__Relational__Group__19719);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4796:1: rule__Relational__Group__1__Impl : ( ( rule__Relational__Group_1__0 )? ) ;
    public final void rule__Relational__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4800:1: ( ( ( rule__Relational__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4801:1: ( ( rule__Relational__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4801:1: ( ( rule__Relational__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4802:1: ( rule__Relational__Group_1__0 )?
            {
             before(grammarAccess.getRelationalAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4803:1: ( rule__Relational__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( ((LA48_0>=40 && LA48_0<=46)) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4803:2: rule__Relational__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Relational__Group_1__0_in_rule__Relational__Group__1__Impl9746);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4817:1: rule__Relational__Group_1__0 : rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 ;
    public final void rule__Relational__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4821:1: ( rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4822:2: rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1__0__Impl_in_rule__Relational__Group_1__09781);
            rule__Relational__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1__1_in_rule__Relational__Group_1__09784);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4829:1: rule__Relational__Group_1__0__Impl : ( ( rule__Relational__Alternatives_1_0 ) ) ;
    public final void rule__Relational__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4833:1: ( ( ( rule__Relational__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4834:1: ( ( rule__Relational__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4834:1: ( ( rule__Relational__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4835:1: ( rule__Relational__Alternatives_1_0 )
            {
             before(grammarAccess.getRelationalAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4836:1: ( rule__Relational__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4836:2: rule__Relational__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Relational__Alternatives_1_0_in_rule__Relational__Group_1__0__Impl9811);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4846:1: rule__Relational__Group_1__1 : rule__Relational__Group_1__1__Impl ;
    public final void rule__Relational__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4850:1: ( rule__Relational__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4851:2: rule__Relational__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1__1__Impl_in_rule__Relational__Group_1__19841);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4857:1: rule__Relational__Group_1__1__Impl : ( ( rule__Relational__RightAssignment_1_1 ) ) ;
    public final void rule__Relational__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4861:1: ( ( ( rule__Relational__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4862:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4862:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4863:1: ( rule__Relational__RightAssignment_1_1 )
            {
             before(grammarAccess.getRelationalAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4864:1: ( rule__Relational__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4864:2: rule__Relational__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Relational__RightAssignment_1_1_in_rule__Relational__Group_1__1__Impl9868);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4878:1: rule__Relational__Group_1_0_0__0 : rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 ;
    public final void rule__Relational__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4882:1: ( rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4883:2: rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__0__Impl_in_rule__Relational__Group_1_0_0__09902);
            rule__Relational__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__1_in_rule__Relational__Group_1_0_0__09905);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4890:1: rule__Relational__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4894:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4895:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4895:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4896:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4897:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4899:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4909:1: rule__Relational__Group_1_0_0__1 : rule__Relational__Group_1_0_0__1__Impl ;
    public final void rule__Relational__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4913:1: ( rule__Relational__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4914:2: rule__Relational__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_0__1__Impl_in_rule__Relational__Group_1_0_0__19963);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4920:1: rule__Relational__Group_1_0_0__1__Impl : ( '!=' ) ;
    public final void rule__Relational__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4924:1: ( ( '!=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4925:1: ( '!=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4925:1: ( '!=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4926:1: '!='
            {
             before(grammarAccess.getRelationalAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1()); 
            match(input,40,FOLLOW_40_in_rule__Relational__Group_1_0_0__1__Impl9991); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4943:1: rule__Relational__Group_1_0_1__0 : rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 ;
    public final void rule__Relational__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4947:1: ( rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4948:2: rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__0__Impl_in_rule__Relational__Group_1_0_1__010026);
            rule__Relational__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__1_in_rule__Relational__Group_1_0_1__010029);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4955:1: rule__Relational__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4959:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4960:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4960:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4961:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4962:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4964:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4974:1: rule__Relational__Group_1_0_1__1 : rule__Relational__Group_1_0_1__1__Impl ;
    public final void rule__Relational__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4978:1: ( rule__Relational__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4979:2: rule__Relational__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_1__1__Impl_in_rule__Relational__Group_1_0_1__110087);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4985:1: rule__Relational__Group_1_0_1__1__Impl : ( '==' ) ;
    public final void rule__Relational__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4989:1: ( ( '==' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4990:1: ( '==' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4990:1: ( '==' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:4991:1: '=='
            {
             before(grammarAccess.getRelationalAccess().getEqualsSignEqualsSignKeyword_1_0_1_1()); 
            match(input,41,FOLLOW_41_in_rule__Relational__Group_1_0_1__1__Impl10115); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5008:1: rule__Relational__Group_1_0_2__0 : rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 ;
    public final void rule__Relational__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5012:1: ( rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5013:2: rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__0__Impl_in_rule__Relational__Group_1_0_2__010150);
            rule__Relational__Group_1_0_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__1_in_rule__Relational__Group_1_0_2__010153);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5020:1: rule__Relational__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5024:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5025:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5025:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5026:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5027:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5029:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5039:1: rule__Relational__Group_1_0_2__1 : rule__Relational__Group_1_0_2__1__Impl ;
    public final void rule__Relational__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5043:1: ( rule__Relational__Group_1_0_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5044:2: rule__Relational__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_2__1__Impl_in_rule__Relational__Group_1_0_2__110211);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5050:1: rule__Relational__Group_1_0_2__1__Impl : ( '>=' ) ;
    public final void rule__Relational__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5054:1: ( ( '>=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5055:1: ( '>=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5055:1: ( '>=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5056:1: '>='
            {
             before(grammarAccess.getRelationalAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1()); 
            match(input,42,FOLLOW_42_in_rule__Relational__Group_1_0_2__1__Impl10239); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5073:1: rule__Relational__Group_1_0_3__0 : rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 ;
    public final void rule__Relational__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5077:1: ( rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5078:2: rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__0__Impl_in_rule__Relational__Group_1_0_3__010274);
            rule__Relational__Group_1_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__1_in_rule__Relational__Group_1_0_3__010277);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5085:1: rule__Relational__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5089:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5090:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5090:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5091:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5092:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5094:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5104:1: rule__Relational__Group_1_0_3__1 : rule__Relational__Group_1_0_3__1__Impl ;
    public final void rule__Relational__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5108:1: ( rule__Relational__Group_1_0_3__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5109:2: rule__Relational__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_3__1__Impl_in_rule__Relational__Group_1_0_3__110335);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5115:1: rule__Relational__Group_1_0_3__1__Impl : ( '<=' ) ;
    public final void rule__Relational__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5119:1: ( ( '<=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5120:1: ( '<=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5120:1: ( '<=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5121:1: '<='
            {
             before(grammarAccess.getRelationalAccess().getLessThanSignEqualsSignKeyword_1_0_3_1()); 
            match(input,43,FOLLOW_43_in_rule__Relational__Group_1_0_3__1__Impl10363); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5138:1: rule__Relational__Group_1_0_4__0 : rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 ;
    public final void rule__Relational__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5142:1: ( rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5143:2: rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__0__Impl_in_rule__Relational__Group_1_0_4__010398);
            rule__Relational__Group_1_0_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__1_in_rule__Relational__Group_1_0_4__010401);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5150:1: rule__Relational__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5154:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5155:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5155:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5156:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5157:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5159:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5169:1: rule__Relational__Group_1_0_4__1 : rule__Relational__Group_1_0_4__1__Impl ;
    public final void rule__Relational__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5173:1: ( rule__Relational__Group_1_0_4__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5174:2: rule__Relational__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_4__1__Impl_in_rule__Relational__Group_1_0_4__110459);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5180:1: rule__Relational__Group_1_0_4__1__Impl : ( '=' ) ;
    public final void rule__Relational__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5184:1: ( ( '=' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5185:1: ( '=' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5185:1: ( '=' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5186:1: '='
            {
             before(grammarAccess.getRelationalAccess().getEqualsSignKeyword_1_0_4_1()); 
            match(input,44,FOLLOW_44_in_rule__Relational__Group_1_0_4__1__Impl10487); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5203:1: rule__Relational__Group_1_0_5__0 : rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 ;
    public final void rule__Relational__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5207:1: ( rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5208:2: rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__0__Impl_in_rule__Relational__Group_1_0_5__010522);
            rule__Relational__Group_1_0_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__1_in_rule__Relational__Group_1_0_5__010525);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5215:1: rule__Relational__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5219:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5220:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5220:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5221:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5222:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5224:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5234:1: rule__Relational__Group_1_0_5__1 : rule__Relational__Group_1_0_5__1__Impl ;
    public final void rule__Relational__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5238:1: ( rule__Relational__Group_1_0_5__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5239:2: rule__Relational__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_5__1__Impl_in_rule__Relational__Group_1_0_5__110583);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5245:1: rule__Relational__Group_1_0_5__1__Impl : ( '<' ) ;
    public final void rule__Relational__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5249:1: ( ( '<' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5250:1: ( '<' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5250:1: ( '<' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5251:1: '<'
            {
             before(grammarAccess.getRelationalAccess().getLessThanSignKeyword_1_0_5_1()); 
            match(input,45,FOLLOW_45_in_rule__Relational__Group_1_0_5__1__Impl10611); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5268:1: rule__Relational__Group_1_0_6__0 : rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 ;
    public final void rule__Relational__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5272:1: ( rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5273:2: rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__0__Impl_in_rule__Relational__Group_1_0_6__010646);
            rule__Relational__Group_1_0_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__1_in_rule__Relational__Group_1_0_6__010649);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5280:1: rule__Relational__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5284:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5285:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5285:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5286:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5287:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5289:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5299:1: rule__Relational__Group_1_0_6__1 : rule__Relational__Group_1_0_6__1__Impl ;
    public final void rule__Relational__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5303:1: ( rule__Relational__Group_1_0_6__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5304:2: rule__Relational__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Relational__Group_1_0_6__1__Impl_in_rule__Relational__Group_1_0_6__110707);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5310:1: rule__Relational__Group_1_0_6__1__Impl : ( '>' ) ;
    public final void rule__Relational__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5314:1: ( ( '>' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5315:1: ( '>' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5315:1: ( '>' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5316:1: '>'
            {
             before(grammarAccess.getRelationalAccess().getGreaterThanSignKeyword_1_0_6_1()); 
            match(input,46,FOLLOW_46_in_rule__Relational__Group_1_0_6__1__Impl10735); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5333:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5337:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5338:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__010770);
            rule__Addition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__010773);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5345:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5349:1: ( ( ruleMultiplication ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5350:1: ( ruleMultiplication )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5350:1: ( ruleMultiplication )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5351:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl10800);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5362:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5366:1: ( rule__Addition__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5367:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__110829);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5373:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5377:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5378:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5378:1: ( ( rule__Addition__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5379:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5380:1: ( rule__Addition__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=47 && LA49_0<=48)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5380:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl10856);
            	    rule__Addition__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5394:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5398:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5399:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__010891);
            rule__Addition__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__010894);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5406:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5410:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5411:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5411:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5412:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5413:1: ( rule__Addition__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5413:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl10921);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5423:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5427:1: ( rule__Addition__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5428:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__110951);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5434:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5438:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5439:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5439:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5440:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5441:1: ( rule__Addition__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5441:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl10978);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5455:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5459:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5460:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__011012);
            rule__Addition__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__011015);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5467:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5471:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5472:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5472:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5473:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5474:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5476:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5486:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5490:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5491:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__111073);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5497:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5501:1: ( ( '+' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5502:1: ( '+' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5502:1: ( '+' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5503:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,47,FOLLOW_47_in_rule__Addition__Group_1_0_0__1__Impl11101); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5520:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5524:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5525:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__011136);
            rule__Addition__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__011139);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5532:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5536:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5537:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5537:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5538:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5539:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5541:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5551:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5555:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5556:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__111197);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5562:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5566:1: ( ( '-' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5567:1: ( '-' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5567:1: ( '-' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5568:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,48,FOLLOW_48_in_rule__Addition__Group_1_0_1__1__Impl11225); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5585:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5589:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5590:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__011260);
            rule__Multiplication__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__011263);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5597:1: rule__Multiplication__Group__0__Impl : ( rulePower ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5601:1: ( ( rulePower ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5602:1: ( rulePower )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5602:1: ( rulePower )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5603:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl11290);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5614:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5618:1: ( rule__Multiplication__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5619:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__111319);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5625:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5629:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5630:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5630:1: ( ( rule__Multiplication__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5631:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5632:1: ( rule__Multiplication__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=49 && LA50_0<=50)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5632:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl11346);
            	    rule__Multiplication__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5646:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5650:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5651:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__011381);
            rule__Multiplication__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__011384);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5658:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5662:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5663:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5663:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5664:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5665:1: ( rule__Multiplication__Alternatives_1_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5665:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl11411);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5675:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5679:1: ( rule__Multiplication__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5680:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__111441);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5686:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5690:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5691:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5691:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5692:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5693:1: ( rule__Multiplication__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5693:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl11468);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5707:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5711:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5712:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__011502);
            rule__Multiplication__Group_1_0_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__011505);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5719:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5723:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5724:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5724:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5725:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5726:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5728:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5738:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5742:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5743:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__111563);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5749:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5753:1: ( ( '*' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5754:1: ( '*' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5754:1: ( '*' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5755:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,49,FOLLOW_49_in_rule__Multiplication__Group_1_0_0__1__Impl11591); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5772:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5776:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5777:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__011626);
            rule__Multiplication__Group_1_0_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__011629);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5784:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5788:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5789:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5789:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5790:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5791:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5793:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5803:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5807:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5808:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__111687);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5814:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5818:1: ( ( '/' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5819:1: ( '/' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5819:1: ( '/' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5820:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,50,FOLLOW_50_in_rule__Multiplication__Group_1_0_1__1__Impl11715); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5837:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5841:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5842:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__011750);
            rule__Power__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group__1_in_rule__Power__Group__011753);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5849:1: rule__Power__Group__0__Impl : ( ruleUnaryExpr ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5853:1: ( ( ruleUnaryExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5854:1: ( ruleUnaryExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5854:1: ( ruleUnaryExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5855:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__Power__Group__0__Impl11780);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5866:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5870:1: ( rule__Power__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5871:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__111809);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5877:1: rule__Power__Group__1__Impl : ( ( rule__Power__Group_1__0 )* ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5881:1: ( ( ( rule__Power__Group_1__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5882:1: ( ( rule__Power__Group_1__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5882:1: ( ( rule__Power__Group_1__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5883:1: ( rule__Power__Group_1__0 )*
            {
             before(grammarAccess.getPowerAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5884:1: ( rule__Power__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==51) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5884:2: rule__Power__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl11836);
            	    rule__Power__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5898:1: rule__Power__Group_1__0 : rule__Power__Group_1__0__Impl rule__Power__Group_1__1 ;
    public final void rule__Power__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5902:1: ( rule__Power__Group_1__0__Impl rule__Power__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5903:2: rule__Power__Group_1__0__Impl rule__Power__Group_1__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__011871);
            rule__Power__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__011874);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5910:1: rule__Power__Group_1__0__Impl : ( ( rule__Power__Group_1_0__0 ) ) ;
    public final void rule__Power__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5914:1: ( ( ( rule__Power__Group_1_0__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5915:1: ( ( rule__Power__Group_1_0__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5915:1: ( ( rule__Power__Group_1_0__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5916:1: ( rule__Power__Group_1_0__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5917:1: ( rule__Power__Group_1_0__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5917:2: rule__Power__Group_1_0__0
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl11901);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5927:1: rule__Power__Group_1__1 : rule__Power__Group_1__1__Impl ;
    public final void rule__Power__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5931:1: ( rule__Power__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5932:2: rule__Power__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__111931);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5938:1: rule__Power__Group_1__1__Impl : ( ( rule__Power__RightAssignment_1_1 ) ) ;
    public final void rule__Power__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5942:1: ( ( ( rule__Power__RightAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5943:1: ( ( rule__Power__RightAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5943:1: ( ( rule__Power__RightAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5944:1: ( rule__Power__RightAssignment_1_1 )
            {
             before(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5945:1: ( rule__Power__RightAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5945:2: rule__Power__RightAssignment_1_1
            {
            pushFollow(FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl11958);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5959:1: rule__Power__Group_1_0__0 : rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 ;
    public final void rule__Power__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5963:1: ( rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5964:2: rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__011992);
            rule__Power__Group_1_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__011995);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5971:1: rule__Power__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Power__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5975:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5976:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5976:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5977:1: ()
            {
             before(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5978:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5980:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5990:1: rule__Power__Group_1_0__1 : rule__Power__Group_1_0__1__Impl ;
    public final void rule__Power__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5994:1: ( rule__Power__Group_1_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:5995:2: rule__Power__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__112053);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6001:1: rule__Power__Group_1_0__1__Impl : ( '^' ) ;
    public final void rule__Power__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6005:1: ( ( '^' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6006:1: ( '^' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6006:1: ( '^' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6007:1: '^'
            {
             before(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
            match(input,51,FOLLOW_51_in_rule__Power__Group_1_0__1__Impl12081); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6024:1: rule__UnaryExpr__Group__0 : rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 ;
    public final void rule__UnaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6028:1: ( rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6029:2: rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__0__Impl_in_rule__UnaryExpr__Group__012116);
            rule__UnaryExpr__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__UnaryExpr__Group__1_in_rule__UnaryExpr__Group__012119);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6036:1: rule__UnaryExpr__Group__0__Impl : ( ( rule__UnaryExpr__OpAssignment_0 )? ) ;
    public final void rule__UnaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6040:1: ( ( ( rule__UnaryExpr__OpAssignment_0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6041:1: ( ( rule__UnaryExpr__OpAssignment_0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6041:1: ( ( rule__UnaryExpr__OpAssignment_0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6042:1: ( rule__UnaryExpr__OpAssignment_0 )?
            {
             before(grammarAccess.getUnaryExprAccess().getOpAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6043:1: ( rule__UnaryExpr__OpAssignment_0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==12) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6043:2: rule__UnaryExpr__OpAssignment_0
                    {
                    pushFollow(FOLLOW_rule__UnaryExpr__OpAssignment_0_in_rule__UnaryExpr__Group__0__Impl12146);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6053:1: rule__UnaryExpr__Group__1 : rule__UnaryExpr__Group__1__Impl ;
    public final void rule__UnaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6057:1: ( rule__UnaryExpr__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6058:2: rule__UnaryExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnaryExpr__Group__1__Impl_in_rule__UnaryExpr__Group__112177);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6064:1: rule__UnaryExpr__Group__1__Impl : ( ( rule__UnaryExpr__RightAssignment_1 ) ) ;
    public final void rule__UnaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6068:1: ( ( ( rule__UnaryExpr__RightAssignment_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6069:1: ( ( rule__UnaryExpr__RightAssignment_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6069:1: ( ( rule__UnaryExpr__RightAssignment_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6070:1: ( rule__UnaryExpr__RightAssignment_1 )
            {
             before(grammarAccess.getUnaryExprAccess().getRightAssignment_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6071:1: ( rule__UnaryExpr__RightAssignment_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6071:2: rule__UnaryExpr__RightAssignment_1
            {
            pushFollow(FOLLOW_rule__UnaryExpr__RightAssignment_1_in_rule__UnaryExpr__Group__1__Impl12204);
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


    // $ANTLR start rule__PrePrimaryExpr__Group_2__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6085:1: rule__PrePrimaryExpr__Group_2__0 : rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 ;
    public final void rule__PrePrimaryExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6089:1: ( rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6090:2: rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__0__Impl_in_rule__PrePrimaryExpr__Group_2__012238);
            rule__PrePrimaryExpr__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__1_in_rule__PrePrimaryExpr__Group_2__012241);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6097:1: rule__PrePrimaryExpr__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrePrimaryExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6101:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6102:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6102:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6103:1: '('
            {
             before(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,30,FOLLOW_30_in_rule__PrePrimaryExpr__Group_2__0__Impl12269); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6116:1: rule__PrePrimaryExpr__Group_2__1 : rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2 ;
    public final void rule__PrePrimaryExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6120:1: ( rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6121:2: rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__1__Impl_in_rule__PrePrimaryExpr__Group_2__112300);
            rule__PrePrimaryExpr__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__2_in_rule__PrePrimaryExpr__Group_2__112303);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6128:1: rule__PrePrimaryExpr__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__PrePrimaryExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6132:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6133:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6133:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6134:1: ruleExpression
            {
             before(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__PrePrimaryExpr__Group_2__1__Impl12330);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6145:1: rule__PrePrimaryExpr__Group_2__2 : rule__PrePrimaryExpr__Group_2__2__Impl ;
    public final void rule__PrePrimaryExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6149:1: ( rule__PrePrimaryExpr__Group_2__2__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6150:2: rule__PrePrimaryExpr__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_2__2__Impl_in_rule__PrePrimaryExpr__Group_2__212359);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6156:1: rule__PrePrimaryExpr__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrePrimaryExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6160:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6161:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6161:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6162:1: ')'
            {
             before(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_2_2()); 
            match(input,31,FOLLOW_31_in_rule__PrePrimaryExpr__Group_2__2__Impl12387); 
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


    // $ANTLR start rule__PrePrimaryExpr__Group_3__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6181:1: rule__PrePrimaryExpr__Group_3__0 : rule__PrePrimaryExpr__Group_3__0__Impl rule__PrePrimaryExpr__Group_3__1 ;
    public final void rule__PrePrimaryExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6185:1: ( rule__PrePrimaryExpr__Group_3__0__Impl rule__PrePrimaryExpr__Group_3__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6186:2: rule__PrePrimaryExpr__Group_3__0__Impl rule__PrePrimaryExpr__Group_3__1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_3__0__Impl_in_rule__PrePrimaryExpr__Group_3__012424);
            rule__PrePrimaryExpr__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_3__1_in_rule__PrePrimaryExpr__Group_3__012427);
            rule__PrePrimaryExpr__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_3__0


    // $ANTLR start rule__PrePrimaryExpr__Group_3__0__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6193:1: rule__PrePrimaryExpr__Group_3__0__Impl : ( '-' ) ;
    public final void rule__PrePrimaryExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6197:1: ( ( '-' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6198:1: ( '-' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6198:1: ( '-' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6199:1: '-'
            {
             before(grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_3_0()); 
            match(input,48,FOLLOW_48_in_rule__PrePrimaryExpr__Group_3__0__Impl12455); 
             after(grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_3__0__Impl


    // $ANTLR start rule__PrePrimaryExpr__Group_3__1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6212:1: rule__PrePrimaryExpr__Group_3__1 : rule__PrePrimaryExpr__Group_3__1__Impl ;
    public final void rule__PrePrimaryExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6216:1: ( rule__PrePrimaryExpr__Group_3__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6217:2: rule__PrePrimaryExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__Group_3__1__Impl_in_rule__PrePrimaryExpr__Group_3__112486);
            rule__PrePrimaryExpr__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_3__1


    // $ANTLR start rule__PrePrimaryExpr__Group_3__1__Impl
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6223:1: rule__PrePrimaryExpr__Group_3__1__Impl : ( ( rule__PrePrimaryExpr__NAssignment_3_1 ) ) ;
    public final void rule__PrePrimaryExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6227:1: ( ( ( rule__PrePrimaryExpr__NAssignment_3_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6228:1: ( ( rule__PrePrimaryExpr__NAssignment_3_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6228:1: ( ( rule__PrePrimaryExpr__NAssignment_3_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6229:1: ( rule__PrePrimaryExpr__NAssignment_3_1 )
            {
             before(grammarAccess.getPrePrimaryExprAccess().getNAssignment_3_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6230:1: ( rule__PrePrimaryExpr__NAssignment_3_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6230:2: rule__PrePrimaryExpr__NAssignment_3_1
            {
            pushFollow(FOLLOW_rule__PrePrimaryExpr__NAssignment_3_1_in_rule__PrePrimaryExpr__Group_3__1__Impl12513);
            rule__PrePrimaryExpr__NAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getPrePrimaryExprAccess().getNAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__Group_3__1__Impl


    // $ANTLR start rule__AbstractRef__Group__0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6244:1: rule__AbstractRef__Group__0 : rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1 ;
    public final void rule__AbstractRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6248:1: ( rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6249:2: rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group__0__Impl_in_rule__AbstractRef__Group__012547);
            rule__AbstractRef__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group__1_in_rule__AbstractRef__Group__012550);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6256:1: rule__AbstractRef__Group__0__Impl : ( ( rule__AbstractRef__DefineAssignment_0 ) ) ;
    public final void rule__AbstractRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6260:1: ( ( ( rule__AbstractRef__DefineAssignment_0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6261:1: ( ( rule__AbstractRef__DefineAssignment_0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6261:1: ( ( rule__AbstractRef__DefineAssignment_0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6262:1: ( rule__AbstractRef__DefineAssignment_0 )
            {
             before(grammarAccess.getAbstractRefAccess().getDefineAssignment_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6263:1: ( rule__AbstractRef__DefineAssignment_0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6263:2: rule__AbstractRef__DefineAssignment_0
            {
            pushFollow(FOLLOW_rule__AbstractRef__DefineAssignment_0_in_rule__AbstractRef__Group__0__Impl12577);
            rule__AbstractRef__DefineAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAbstractRefAccess().getDefineAssignment_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6273:1: rule__AbstractRef__Group__1 : rule__AbstractRef__Group__1__Impl ;
    public final void rule__AbstractRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6277:1: ( rule__AbstractRef__Group__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6278:2: rule__AbstractRef__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group__1__Impl_in_rule__AbstractRef__Group__112607);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6284:1: rule__AbstractRef__Group__1__Impl : ( ( rule__AbstractRef__Group_1__0 )? ) ;
    public final void rule__AbstractRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6288:1: ( ( ( rule__AbstractRef__Group_1__0 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6289:1: ( ( rule__AbstractRef__Group_1__0 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6289:1: ( ( rule__AbstractRef__Group_1__0 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6290:1: ( rule__AbstractRef__Group_1__0 )?
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6291:1: ( rule__AbstractRef__Group_1__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==30) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6291:2: rule__AbstractRef__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__AbstractRef__Group_1__0_in_rule__AbstractRef__Group__1__Impl12634);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6305:1: rule__AbstractRef__Group_1__0 : rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1 ;
    public final void rule__AbstractRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6309:1: ( rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6310:2: rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1__0__Impl_in_rule__AbstractRef__Group_1__012669);
            rule__AbstractRef__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1__1_in_rule__AbstractRef__Group_1__012672);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6317:1: rule__AbstractRef__Group_1__0__Impl : ( () ) ;
    public final void rule__AbstractRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6321:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6322:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6322:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6323:1: ()
            {
             before(grammarAccess.getAbstractRefAccess().getFunctionRefFuncAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6324:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6326:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6336:1: rule__AbstractRef__Group_1__1 : rule__AbstractRef__Group_1__1__Impl ;
    public final void rule__AbstractRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6340:1: ( rule__AbstractRef__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6341:2: rule__AbstractRef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1__1__Impl_in_rule__AbstractRef__Group_1__112730);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6347:1: rule__AbstractRef__Group_1__1__Impl : ( ( rule__AbstractRef__Group_1_1__0 ) ) ;
    public final void rule__AbstractRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6351:1: ( ( ( rule__AbstractRef__Group_1_1__0 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6352:1: ( ( rule__AbstractRef__Group_1_1__0 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6352:1: ( ( rule__AbstractRef__Group_1_1__0 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6353:1: ( rule__AbstractRef__Group_1_1__0 )
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6354:1: ( rule__AbstractRef__Group_1_1__0 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6354:2: rule__AbstractRef__Group_1_1__0
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__0_in_rule__AbstractRef__Group_1__1__Impl12757);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6368:1: rule__AbstractRef__Group_1_1__0 : rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1 ;
    public final void rule__AbstractRef__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6372:1: ( rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6373:2: rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__0__Impl_in_rule__AbstractRef__Group_1_1__012791);
            rule__AbstractRef__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__1_in_rule__AbstractRef__Group_1_1__012794);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6380:1: rule__AbstractRef__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__AbstractRef__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6384:1: ( ( '(' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6385:1: ( '(' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6385:1: ( '(' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6386:1: '('
            {
             before(grammarAccess.getAbstractRefAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,30,FOLLOW_30_in_rule__AbstractRef__Group_1_1__0__Impl12822); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6399:1: rule__AbstractRef__Group_1_1__1 : rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2 ;
    public final void rule__AbstractRef__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6403:1: ( rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6404:2: rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__1__Impl_in_rule__AbstractRef__Group_1_1__112853);
            rule__AbstractRef__Group_1_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__2_in_rule__AbstractRef__Group_1_1__112856);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6411:1: rule__AbstractRef__Group_1_1__1__Impl : ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? ) ;
    public final void rule__AbstractRef__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6415:1: ( ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6416:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6416:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6417:1: ( rule__AbstractRef__ArgsAssignment_1_1_1 )?
            {
             before(grammarAccess.getAbstractRefAccess().getArgsAssignment_1_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6418:1: ( rule__AbstractRef__ArgsAssignment_1_1_1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_STRING && LA54_0<=RULE_BOOLEAN)||LA54_0==12||LA54_0==30||LA54_0==32||LA54_0==34||LA54_0==48) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6418:2: rule__AbstractRef__ArgsAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_1_in_rule__AbstractRef__Group_1_1__1__Impl12883);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6428:1: rule__AbstractRef__Group_1_1__2 : rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3 ;
    public final void rule__AbstractRef__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6432:1: ( rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6433:2: rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__2__Impl_in_rule__AbstractRef__Group_1_1__212914);
            rule__AbstractRef__Group_1_1__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__3_in_rule__AbstractRef__Group_1_1__212917);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6440:1: rule__AbstractRef__Group_1_1__2__Impl : ( ( rule__AbstractRef__Group_1_1_2__0 )* ) ;
    public final void rule__AbstractRef__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6444:1: ( ( ( rule__AbstractRef__Group_1_1_2__0 )* ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6445:1: ( ( rule__AbstractRef__Group_1_1_2__0 )* )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6445:1: ( ( rule__AbstractRef__Group_1_1_2__0 )* )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6446:1: ( rule__AbstractRef__Group_1_1_2__0 )*
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1_1_2()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6447:1: ( rule__AbstractRef__Group_1_1_2__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==26) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6447:2: rule__AbstractRef__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__0_in_rule__AbstractRef__Group_1_1__2__Impl12944);
            	    rule__AbstractRef__Group_1_1_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6457:1: rule__AbstractRef__Group_1_1__3 : rule__AbstractRef__Group_1_1__3__Impl ;
    public final void rule__AbstractRef__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6461:1: ( rule__AbstractRef__Group_1_1__3__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6462:2: rule__AbstractRef__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1__3__Impl_in_rule__AbstractRef__Group_1_1__312975);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6468:1: rule__AbstractRef__Group_1_1__3__Impl : ( ')' ) ;
    public final void rule__AbstractRef__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6472:1: ( ( ')' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6473:1: ( ')' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6473:1: ( ')' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6474:1: ')'
            {
             before(grammarAccess.getAbstractRefAccess().getRightParenthesisKeyword_1_1_3()); 
            match(input,31,FOLLOW_31_in_rule__AbstractRef__Group_1_1__3__Impl13003); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6495:1: rule__AbstractRef__Group_1_1_2__0 : rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1 ;
    public final void rule__AbstractRef__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6499:1: ( rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6500:2: rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__0__Impl_in_rule__AbstractRef__Group_1_1_2__013042);
            rule__AbstractRef__Group_1_1_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__1_in_rule__AbstractRef__Group_1_1_2__013045);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6507:1: rule__AbstractRef__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__AbstractRef__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6511:1: ( ( ',' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6512:1: ( ',' )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6512:1: ( ',' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6513:1: ','
            {
             before(grammarAccess.getAbstractRefAccess().getCommaKeyword_1_1_2_0()); 
            match(input,26,FOLLOW_26_in_rule__AbstractRef__Group_1_1_2__0__Impl13073); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6526:1: rule__AbstractRef__Group_1_1_2__1 : rule__AbstractRef__Group_1_1_2__1__Impl ;
    public final void rule__AbstractRef__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6530:1: ( rule__AbstractRef__Group_1_1_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6531:2: rule__AbstractRef__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AbstractRef__Group_1_1_2__1__Impl_in_rule__AbstractRef__Group_1_1_2__113104);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6537:1: rule__AbstractRef__Group_1_1_2__1__Impl : ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) ) ;
    public final void rule__AbstractRef__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6541:1: ( ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6542:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6542:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6543:1: ( rule__AbstractRef__ArgsAssignment_1_1_2_1 )
            {
             before(grammarAccess.getAbstractRefAccess().getArgsAssignment_1_1_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6544:1: ( rule__AbstractRef__ArgsAssignment_1_1_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6544:2: rule__AbstractRef__ArgsAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_2_1_in_rule__AbstractRef__Group_1_1_2__1__Impl13131);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6558:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6562:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6563:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__013165);
            rule__TerminalExpression__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__013168);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6570:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6574:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6575:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6575:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6576:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6577:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6579:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6589:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6593:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6594:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__113226);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6600:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6604:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6605:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6605:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6606:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6607:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6607:2: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_0_1_in_rule__TerminalExpression__Group_0__1__Impl13253);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6621:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6625:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6626:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__013287);
            rule__TerminalExpression__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__013290);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6633:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6637:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6638:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6638:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6639:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6640:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6642:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6652:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6656:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6657:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__113348);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6663:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6667:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6668:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6668:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6669:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6670:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6670:2: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl13375);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6684:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6688:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6689:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__013409);
            rule__TerminalExpression__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__013412);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6696:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6700:1: ( ( () ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6701:1: ( () )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6701:1: ( () )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6702:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6703:1: ()
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6705:1: 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6715:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6719:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6720:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__113470);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6726:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6730:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6731:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6731:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6732:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6733:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6733:2: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl13497);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6750:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6754:1: ( ( ruleImport ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6755:1: ( ruleImport )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6755:1: ( ruleImport )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6756:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_013538);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6765:1: rule__Model__DeclarationsAssignment_1_0 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6769:1: ( ( ruleDeclaration ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6770:1: ( ruleDeclaration )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6770:1: ( ruleDeclaration )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6771:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_1_013569);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6780:1: rule__Model__StatementsAssignment_1_1 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6784:1: ( ( ruleStatement ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6785:1: ( ruleStatement )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6785:1: ( ruleStatement )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6786:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_1_113600);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6795:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6799:1: ( ( RULE_STRING ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6800:1: ( RULE_STRING )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6800:1: ( RULE_STRING )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6801:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_113631); 
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


    // $ANTLR start rule__Annotation__TypeAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6810:1: rule__Annotation__TypeAssignment_2 : ( ruleANNOTATION_TYPE ) ;
    public final void rule__Annotation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6814:1: ( ( ruleANNOTATION_TYPE ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6815:1: ( ruleANNOTATION_TYPE )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6815:1: ( ruleANNOTATION_TYPE )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6816:1: ruleANNOTATION_TYPE
            {
             before(grammarAccess.getAnnotationAccess().getTypeANNOTATION_TYPEEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleANNOTATION_TYPE_in_rule__Annotation__TypeAssignment_213662);
            ruleANNOTATION_TYPE();
            _fsp--;

             after(grammarAccess.getAnnotationAccess().getTypeANNOTATION_TYPEEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__TypeAssignment_2


    // $ANTLR start rule__Annotation__ValueAssignment_3_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6825:1: rule__Annotation__ValueAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6829:1: ( ( RULE_STRING ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6830:1: ( RULE_STRING )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6830:1: ( RULE_STRING )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6831:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_3_013693); 
             after(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__ValueAssignment_3_0


    // $ANTLR start rule__Annotation__ValueAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6840:1: rule__Annotation__ValueAssignment_3_1 : ( ( 'not' ) ) ;
    public final void rule__Annotation__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6844:1: ( ( ( 'not' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6845:1: ( ( 'not' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6845:1: ( ( 'not' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6846:1: ( 'not' )
            {
             before(grammarAccess.getAnnotationAccess().getValueNotKeyword_3_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6847:1: ( 'not' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6848:1: 'not'
            {
             before(grammarAccess.getAnnotationAccess().getValueNotKeyword_3_1_0()); 
            match(input,52,FOLLOW_52_in_rule__Annotation__ValueAssignment_3_113729); 
             after(grammarAccess.getAnnotationAccess().getValueNotKeyword_3_1_0()); 

            }

             after(grammarAccess.getAnnotationAccess().getValueNotKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Annotation__ValueAssignment_3_1


    // $ANTLR start rule__DefSort__AnnotationsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6863:1: rule__DefSort__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefSort__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6867:1: ( ( ruleAnnotation ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6868:1: ( ruleAnnotation )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6868:1: ( ruleAnnotation )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6869:1: ruleAnnotation
            {
             before(grammarAccess.getDefSortAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__DefSort__AnnotationsAssignment_013768);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getDefSortAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__AnnotationsAssignment_0


    // $ANTLR start rule__DefSort__ReifiedAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6878:1: rule__DefSort__ReifiedAssignment_1 : ( ( 'reified' ) ) ;
    public final void rule__DefSort__ReifiedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6882:1: ( ( ( 'reified' ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6883:1: ( ( 'reified' ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6883:1: ( ( 'reified' ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6884:1: ( 'reified' )
            {
             before(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6885:1: ( 'reified' )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6886:1: 'reified'
            {
             before(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_1_0()); 
            match(input,53,FOLLOW_53_in_rule__DefSort__ReifiedAssignment_113804); 
             after(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_1_0()); 

            }

             after(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__ReifiedAssignment_1


    // $ANTLR start rule__DefSort__NameAssignment_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6901:1: rule__DefSort__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__DefSort__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6905:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6906:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6906:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6907:1: RULE_ID
            {
             before(grammarAccess.getDefSortAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefSort__NameAssignment_313843); 
             after(grammarAccess.getDefSortAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__NameAssignment_3


    // $ANTLR start rule__DefSort__TypeAssignment_4_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6916:1: rule__DefSort__TypeAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__DefSort__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6920:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6921:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6921:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6922:1: RULE_ID
            {
             before(grammarAccess.getDefSortAccess().getTypeIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefSort__TypeAssignment_4_113874); 
             after(grammarAccess.getDefSortAccess().getTypeIDTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefSort__TypeAssignment_4_1


    // $ANTLR start rule__DefRange__AnnotationsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6931:1: rule__DefRange__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefRange__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6935:1: ( ( ruleAnnotation ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6936:1: ( ruleAnnotation )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6936:1: ( ruleAnnotation )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6937:1: ruleAnnotation
            {
             before(grammarAccess.getDefRangeAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__DefRange__AnnotationsAssignment_013905);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getDefRangeAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__AnnotationsAssignment_0


    // $ANTLR start rule__DefRange__NameAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6946:1: rule__DefRange__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefRange__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6950:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6951:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6951:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6952:1: ( RULE_ID )
            {
             before(grammarAccess.getDefRangeAccess().getNameDefSortCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6953:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6954:1: RULE_ID
            {
             before(grammarAccess.getDefRangeAccess().getNameDefSortIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefRange__NameAssignment_213940); 
             after(grammarAccess.getDefRangeAccess().getNameDefSortIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDefRangeAccess().getNameDefSortCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__NameAssignment_2


    // $ANTLR start rule__DefRange__MinAssignment_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6965:1: rule__DefRange__MinAssignment_3 : ( RULE_INT ) ;
    public final void rule__DefRange__MinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6969:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6970:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6970:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6971:1: RULE_INT
            {
             before(grammarAccess.getDefRangeAccess().getMinINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DefRange__MinAssignment_313975); 
             after(grammarAccess.getDefRangeAccess().getMinINTTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__MinAssignment_3


    // $ANTLR start rule__DefRange__MaxAssignment_4
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6980:1: rule__DefRange__MaxAssignment_4 : ( RULE_INT ) ;
    public final void rule__DefRange__MaxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6984:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6985:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6985:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6986:1: RULE_INT
            {
             before(grammarAccess.getDefRangeAccess().getMaxINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DefRange__MaxAssignment_414006); 
             after(grammarAccess.getDefRangeAccess().getMaxINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefRange__MaxAssignment_4


    // $ANTLR start rule__DefOption__AnnotationsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6995:1: rule__DefOption__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefOption__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:6999:1: ( ( ruleAnnotation ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7000:1: ( ruleAnnotation )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7000:1: ( ruleAnnotation )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7001:1: ruleAnnotation
            {
             before(grammarAccess.getDefOptionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__DefOption__AnnotationsAssignment_014037);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getDefOptionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__AnnotationsAssignment_0


    // $ANTLR start rule__DefOption__NameAssignment_1_0_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7010:1: rule__DefOption__NameAssignment_1_0_1 : ( RULE_ID ) ;
    public final void rule__DefOption__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7014:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7015:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7015:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7016:1: RULE_ID
            {
             before(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefOption__NameAssignment_1_0_114068); 
             after(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__NameAssignment_1_0_1


    // $ANTLR start rule__DefOption__ValueAssignment_1_0_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7025:1: rule__DefOption__ValueAssignment_1_0_2 : ( RULE_INT ) ;
    public final void rule__DefOption__ValueAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7029:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7030:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7030:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7031:1: RULE_INT
            {
             before(grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__DefOption__ValueAssignment_1_0_214099); 
             after(grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__ValueAssignment_1_0_2


    // $ANTLR start rule__DefOption__NameAssignment_1_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7040:1: rule__DefOption__NameAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__DefOption__NameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7044:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7045:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7045:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7046:1: RULE_ID
            {
             before(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefOption__NameAssignment_1_1_114130); 
             after(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__NameAssignment_1_1_1


    // $ANTLR start rule__DefOption__Value2Assignment_1_1_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7055:1: rule__DefOption__Value2Assignment_1_1_2 : ( RULE_ID ) ;
    public final void rule__DefOption__Value2Assignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7059:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7060:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7060:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7061:1: RULE_ID
            {
             before(grammarAccess.getDefOptionAccess().getValue2IDTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefOption__Value2Assignment_1_1_214161); 
             after(grammarAccess.getDefOptionAccess().getValue2IDTerminalRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefOption__Value2Assignment_1_1_2


    // $ANTLR start rule__DefCompletion__AnnotationsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7070:1: rule__DefCompletion__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefCompletion__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7074:1: ( ( ruleAnnotation ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7075:1: ( ruleAnnotation )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7075:1: ( ruleAnnotation )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7076:1: ruleAnnotation
            {
             before(grammarAccess.getDefCompletionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__DefCompletion__AnnotationsAssignment_014192);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getDefCompletionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__AnnotationsAssignment_0


    // $ANTLR start rule__DefCompletion__TypeAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7085:1: rule__DefCompletion__TypeAssignment_2 : ( ruleLabelType ) ;
    public final void rule__DefCompletion__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7089:1: ( ( ruleLabelType ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7090:1: ( ruleLabelType )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7090:1: ( ruleLabelType )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7091:1: ruleLabelType
            {
             before(grammarAccess.getDefCompletionAccess().getTypeLabelTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLabelType_in_rule__DefCompletion__TypeAssignment_214223);
            ruleLabelType();
            _fsp--;

             after(grammarAccess.getDefCompletionAccess().getTypeLabelTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__TypeAssignment_2


    // $ANTLR start rule__DefCompletion__LabelAssignment_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7100:1: rule__DefCompletion__LabelAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DefCompletion__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7104:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7105:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7105:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7106:1: ( RULE_ID )
            {
             before(grammarAccess.getDefCompletionAccess().getLabelDefinitionCrossReference_3_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7107:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7108:1: RULE_ID
            {
             before(grammarAccess.getDefCompletionAccess().getLabelDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefCompletion__LabelAssignment_314258); 
             after(grammarAccess.getDefCompletionAccess().getLabelDefinitionIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDefCompletionAccess().getLabelDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefCompletion__LabelAssignment_3


    // $ANTLR start rule__DefNonInertia__AnnotationsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7119:1: rule__DefNonInertia__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefNonInertia__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7123:1: ( ( ruleAnnotation ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7124:1: ( ruleAnnotation )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7124:1: ( ruleAnnotation )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7125:1: ruleAnnotation
            {
             before(grammarAccess.getDefNonInertiaAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__DefNonInertia__AnnotationsAssignment_014293);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getDefNonInertiaAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__AnnotationsAssignment_0


    // $ANTLR start rule__DefNonInertia__NamesAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7134:1: rule__DefNonInertia__NamesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefNonInertia__NamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7138:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7139:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7139:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7140:1: ( RULE_ID )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7141:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7142:1: RULE_ID
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefNonInertia__NamesAssignment_214328); 
             after(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__NamesAssignment_2


    // $ANTLR start rule__DefNonInertia__NamesAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7153:1: rule__DefNonInertia__NamesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefNonInertia__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7157:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7158:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7158:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7159:1: ( RULE_ID )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_3_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7160:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7161:1: RULE_ID
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefNonInertia__NamesAssignment_3_114367); 
             after(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefNonInertia__NamesAssignment_3_1


    // $ANTLR start rule__DefXor__AnnotationsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7172:1: rule__DefXor__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefXor__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7176:1: ( ( ruleAnnotation ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7177:1: ( ruleAnnotation )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7177:1: ( ruleAnnotation )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7178:1: ruleAnnotation
            {
             before(grammarAccess.getDefXorAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__DefXor__AnnotationsAssignment_014402);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getDefXorAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__AnnotationsAssignment_0


    // $ANTLR start rule__DefXor__NamesAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7187:1: rule__DefXor__NamesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefXor__NamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7191:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7192:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7192:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7193:1: ( RULE_ID )
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7194:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7195:1: RULE_ID
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefXor__NamesAssignment_214437); 
             after(grammarAccess.getDefXorAccess().getNamesDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__NamesAssignment_2


    // $ANTLR start rule__DefXor__NamesAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7206:1: rule__DefXor__NamesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefXor__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7210:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7211:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7211:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7212:1: ( RULE_ID )
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_3_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7213:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7214:1: RULE_ID
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefXor__NamesAssignment_3_114476); 
             after(grammarAccess.getDefXorAccess().getNamesDefinitionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefXor__NamesAssignment_3_1


    // $ANTLR start rule__DefMutex__AnnotationsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7225:1: rule__DefMutex__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefMutex__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7229:1: ( ( ruleAnnotation ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7230:1: ( ruleAnnotation )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7230:1: ( ruleAnnotation )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7231:1: ruleAnnotation
            {
             before(grammarAccess.getDefMutexAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__DefMutex__AnnotationsAssignment_014511);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getDefMutexAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__AnnotationsAssignment_0


    // $ANTLR start rule__DefMutex__NamesAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7240:1: rule__DefMutex__NamesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefMutex__NamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7244:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7245:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7245:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7246:1: ( RULE_ID )
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_2_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7247:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7248:1: RULE_ID
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefMutex__NamesAssignment_214546); 
             after(grammarAccess.getDefMutexAccess().getNamesDefinitionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__NamesAssignment_2


    // $ANTLR start rule__DefMutex__NamesAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7259:1: rule__DefMutex__NamesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefMutex__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7263:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7264:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7264:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7265:1: ( RULE_ID )
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_3_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7266:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7267:1: RULE_ID
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DefMutex__NamesAssignment_3_114585); 
             after(grammarAccess.getDefMutexAccess().getNamesDefinitionIDTerminalRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DefMutex__NamesAssignment_3_1


    // $ANTLR start rule__LabeledExpression__AnnotationsAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7278:1: rule__LabeledExpression__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__LabeledExpression__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7282:1: ( ( ruleAnnotation ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7283:1: ( ruleAnnotation )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7283:1: ( ruleAnnotation )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7284:1: ruleAnnotation
            {
             before(grammarAccess.getLabeledExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAnnotation_in_rule__LabeledExpression__AnnotationsAssignment_014620);
            ruleAnnotation();
            _fsp--;

             after(grammarAccess.getLabeledExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__AnnotationsAssignment_0


    // $ANTLR start rule__LabeledExpression__NameAssignment_1_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7293:1: rule__LabeledExpression__NameAssignment_1_0 : ( ruleLabelType ) ;
    public final void rule__LabeledExpression__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7297:1: ( ( ruleLabelType ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7298:1: ( ruleLabelType )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7298:1: ( ruleLabelType )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7299:1: ruleLabelType
            {
             before(grammarAccess.getLabeledExpressionAccess().getNameLabelTypeEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleLabelType_in_rule__LabeledExpression__NameAssignment_1_014651);
            ruleLabelType();
            _fsp--;

             after(grammarAccess.getLabeledExpressionAccess().getNameLabelTypeEnumRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__NameAssignment_1_0


    // $ANTLR start rule__LabeledExpression__ExprAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7308:1: rule__LabeledExpression__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__LabeledExpression__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7312:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7313:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7313:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7314:1: ruleExpression
            {
             before(grammarAccess.getLabeledExpressionAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__LabeledExpression__ExprAssignment_214682);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getLabeledExpressionAccess().getExprExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__LabeledExpression__ExprAssignment_2


    // $ANTLR start rule__SortDefinition__SortAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7323:1: rule__SortDefinition__SortAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__SortDefinition__SortAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7327:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7328:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7328:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7329:1: ( RULE_ID )
            {
             before(grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7330:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7331:1: RULE_ID
            {
             before(grammarAccess.getSortDefinitionAccess().getSortDefSortIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SortDefinition__SortAssignment_014717); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7342:1: rule__SortDefinition__DefinitionsAssignment_1 : ( ruleDefinition ) ;
    public final void rule__SortDefinition__DefinitionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7346:1: ( ( ruleDefinition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7347:1: ( ruleDefinition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7347:1: ( ruleDefinition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7348:1: ruleDefinition
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_114752);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7357:1: rule__SortDefinition__DefinitionsAssignment_2_1 : ( ruleDefinition ) ;
    public final void rule__SortDefinition__DefinitionsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7361:1: ( ( ruleDefinition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7362:1: ( ruleDefinition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7362:1: ( ruleDefinition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7363:1: ruleDefinition
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_2_114783);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7372:1: rule__Definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7376:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7377:1: ( RULE_ID )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7377:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7378:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_014814); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7387:1: rule__Definition__ArgsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Definition__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7391:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7392:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7392:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7393:1: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7394:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7395:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getArgsDefinesIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__ArgsAssignment_1_114849); 
             after(grammarAccess.getDefinitionAccess().getArgsDefinesIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_1_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7406:1: rule__Definition__ArgsAssignment_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Definition__ArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7410:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7411:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7411:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7412:1: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7413:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7414:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getArgsDefinesIDTerminalRuleCall_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__ArgsAssignment_1_2_114888); 
             after(grammarAccess.getDefinitionAccess().getArgsDefinesIDTerminalRuleCall_1_2_1_0_1()); 

            }

             after(grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_2_1_0()); 

            }


            }

        }
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7425:1: rule__Definition__ReturnAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Definition__ReturnAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7429:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7430:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7430:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7431:1: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionAccess().getReturnDefinesCrossReference_2_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7432:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7433:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getReturnDefinesIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Definition__ReturnAssignment_2_114927); 
             after(grammarAccess.getDefinitionAccess().getReturnDefinesIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getDefinitionAccess().getReturnDefinesCrossReference_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Expression__ExprAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7444:1: rule__Expression__ExprAssignment_0 : ( ruleAssignmentOp ) ;
    public final void rule__Expression__ExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7448:1: ( ( ruleAssignmentOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7449:1: ( ruleAssignmentOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7449:1: ( ruleAssignmentOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7450:1: ruleAssignmentOp
            {
             before(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAssignmentOp_in_rule__Expression__ExprAssignment_014962);
            ruleAssignmentOp();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__ExprAssignment_0


    // $ANTLR start rule__Expression__QualifiersAssignment_1_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7459:1: rule__Expression__QualifiersAssignment_1_0 : ( ruleQualifier ) ;
    public final void rule__Expression__QualifiersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7463:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7464:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7464:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7465:1: ruleQualifier
            {
             before(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__Expression__QualifiersAssignment_1_014993);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__QualifiersAssignment_1_0


    // $ANTLR start rule__Expression__ExprAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7474:1: rule__Expression__ExprAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Expression__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7478:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7479:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7479:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7480:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__Expression__ExprAssignment_1_115024);
            ruleExpression();
            _fsp--;

             after(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Expression__ExprAssignment_1_1


    // $ANTLR start rule__Parameters__NamesAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7489:1: rule__Parameters__NamesAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameters__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7493:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7494:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7494:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7495:1: ( RULE_ID )
            {
             before(grammarAccess.getParametersAccess().getNamesDefinesCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7496:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7497:1: RULE_ID
            {
             before(grammarAccess.getParametersAccess().getNamesDefinesIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameters__NamesAssignment_015059); 
             after(grammarAccess.getParametersAccess().getNamesDefinesIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getParametersAccess().getNamesDefinesCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameters__NamesAssignment_0


    // $ANTLR start rule__Parameters__NamesAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7508:1: rule__Parameters__NamesAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Parameters__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7512:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7513:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7513:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7514:1: ( RULE_ID )
            {
             before(grammarAccess.getParametersAccess().getNamesDefinesCrossReference_1_1_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7515:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7516:1: RULE_ID
            {
             before(grammarAccess.getParametersAccess().getNamesDefinesIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Parameters__NamesAssignment_1_115098); 
             after(grammarAccess.getParametersAccess().getNamesDefinesIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getParametersAccess().getNamesDefinesCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Parameters__NamesAssignment_1_1


    // $ANTLR start rule__Exists__OpAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7527:1: rule__Exists__OpAssignment_0 : ( ruleUnaryOp ) ;
    public final void rule__Exists__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7531:1: ( ( ruleUnaryOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7532:1: ( ruleUnaryOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7532:1: ( ruleUnaryOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7533:1: ruleUnaryOp
            {
             before(grammarAccess.getExistsAccess().getOpUnaryOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryOp_in_rule__Exists__OpAssignment_015133);
            ruleUnaryOp();
            _fsp--;

             after(grammarAccess.getExistsAccess().getOpUnaryOpEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__OpAssignment_0


    // $ANTLR start rule__Exists__ParametersAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7542:1: rule__Exists__ParametersAssignment_2 : ( ruleParameters ) ;
    public final void rule__Exists__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7546:1: ( ( ruleParameters ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7547:1: ( ruleParameters )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7547:1: ( ruleParameters )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7548:1: ruleParameters
            {
             before(grammarAccess.getExistsAccess().getParametersParametersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParameters_in_rule__Exists__ParametersAssignment_215164);
            ruleParameters();
            _fsp--;

             after(grammarAccess.getExistsAccess().getParametersParametersParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exists__ParametersAssignment_2


    // $ANTLR start rule__Forall__OpAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7557:1: rule__Forall__OpAssignment_0 : ( ruleUnaryOp ) ;
    public final void rule__Forall__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7561:1: ( ( ruleUnaryOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7562:1: ( ruleUnaryOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7562:1: ( ruleUnaryOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7563:1: ruleUnaryOp
            {
             before(grammarAccess.getForallAccess().getOpUnaryOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryOp_in_rule__Forall__OpAssignment_015195);
            ruleUnaryOp();
            _fsp--;

             after(grammarAccess.getForallAccess().getOpUnaryOpEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__OpAssignment_0


    // $ANTLR start rule__Forall__ParametersAssignment_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7572:1: rule__Forall__ParametersAssignment_2 : ( ruleParameters ) ;
    public final void rule__Forall__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7576:1: ( ( ruleParameters ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7577:1: ( ruleParameters )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7577:1: ( ruleParameters )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7578:1: ruleParameters
            {
             before(grammarAccess.getForallAccess().getParametersParametersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleParameters_in_rule__Forall__ParametersAssignment_215226);
            ruleParameters();
            _fsp--;

             after(grammarAccess.getForallAccess().getParametersParametersParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Forall__ParametersAssignment_2


    // $ANTLR start rule__AssignmentOp__QAssignment_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7587:1: rule__AssignmentOp__QAssignment_1_1 : ( ruleQualifier ) ;
    public final void rule__AssignmentOp__QAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7591:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7592:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7592:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7593:1: ruleQualifier
            {
             before(grammarAccess.getAssignmentOpAccess().getQQualifierParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__AssignmentOp__QAssignment_1_115257);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getAssignmentOpAccess().getQQualifierParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AssignmentOp__QAssignment_1_1


    // $ANTLR start rule__AssignmentOp__RightAssignment_1_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7602:1: rule__AssignmentOp__RightAssignment_1_2 : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7606:1: ( ( ruleOrExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7607:1: ( ruleOrExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7607:1: ( ruleOrExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7608:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleOrExp_in_rule__AssignmentOp__RightAssignment_1_215288);
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


    // $ANTLR start rule__OrExp__QAssignment_1_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7617:1: rule__OrExp__QAssignment_1_2 : ( ruleQualifier ) ;
    public final void rule__OrExp__QAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7621:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7622:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7622:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7623:1: ruleQualifier
            {
             before(grammarAccess.getOrExpAccess().getQQualifierParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__OrExp__QAssignment_1_215319);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getOrExpAccess().getQQualifierParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__OrExp__QAssignment_1_2


    // $ANTLR start rule__OrExp__RightAssignment_1_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7632:1: rule__OrExp__RightAssignment_1_3 : ( ruleAndExp ) ;
    public final void rule__OrExp__RightAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7636:1: ( ( ruleAndExp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7637:1: ( ruleAndExp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7637:1: ( ruleAndExp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7638:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleAndExp_in_rule__OrExp__RightAssignment_1_315350);
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


    // $ANTLR start rule__AndExp__QAssignment_1_2
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7647:1: rule__AndExp__QAssignment_1_2 : ( ruleQualifier ) ;
    public final void rule__AndExp__QAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7651:1: ( ( ruleQualifier ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7652:1: ( ruleQualifier )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7652:1: ( ruleQualifier )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7653:1: ruleQualifier
            {
             before(grammarAccess.getAndExpAccess().getQQualifierParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleQualifier_in_rule__AndExp__QAssignment_1_215381);
            ruleQualifier();
            _fsp--;

             after(grammarAccess.getAndExpAccess().getQQualifierParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AndExp__QAssignment_1_2


    // $ANTLR start rule__AndExp__RightAssignment_1_3
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7662:1: rule__AndExp__RightAssignment_1_3 : ( ruleRelational ) ;
    public final void rule__AndExp__RightAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7666:1: ( ( ruleRelational ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7667:1: ( ruleRelational )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7667:1: ( ruleRelational )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7668:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_ruleRelational_in_rule__AndExp__RightAssignment_1_315412);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7677:1: rule__Relational__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__Relational__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7681:1: ( ( ruleAddition ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7682:1: ( ruleAddition )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7682:1: ( ruleAddition )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7683:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAddition_in_rule__Relational__RightAssignment_1_115443);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7692:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7696:1: ( ( ruleMultiplication ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7697:1: ( ruleMultiplication )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7697:1: ( ruleMultiplication )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7698:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_115474);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7707:1: rule__Multiplication__RightAssignment_1_1 : ( rulePower ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7711:1: ( ( rulePower ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7712:1: ( rulePower )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7712:1: ( rulePower )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7713:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_115505);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7722:1: rule__Power__RightAssignment_1_1 : ( ruleUnaryExpr ) ;
    public final void rule__Power__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7726:1: ( ( ruleUnaryExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7727:1: ( ruleUnaryExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7727:1: ( ruleUnaryExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7728:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleUnaryExpr_in_rule__Power__RightAssignment_1_115536);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7737:1: rule__UnaryExpr__OpAssignment_0 : ( ruleUnaryOp ) ;
    public final void rule__UnaryExpr__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7741:1: ( ( ruleUnaryOp ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7742:1: ( ruleUnaryOp )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7742:1: ( ruleUnaryOp )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7743:1: ruleUnaryOp
            {
             before(grammarAccess.getUnaryExprAccess().getOpUnaryOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleUnaryOp_in_rule__UnaryExpr__OpAssignment_015567);
            ruleUnaryOp();
            _fsp--;

             after(grammarAccess.getUnaryExprAccess().getOpUnaryOpEnumRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start rule__UnaryExpr__RightAssignment_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7752:1: rule__UnaryExpr__RightAssignment_1 : ( rulePrePrimaryExpr ) ;
    public final void rule__UnaryExpr__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7756:1: ( ( rulePrePrimaryExpr ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7757:1: ( rulePrePrimaryExpr )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7757:1: ( rulePrePrimaryExpr )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7758:1: rulePrePrimaryExpr
            {
             before(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePrePrimaryExpr_in_rule__UnaryExpr__RightAssignment_115598);
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


    // $ANTLR start rule__PrePrimaryExpr__NAssignment_3_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7767:1: rule__PrePrimaryExpr__NAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__PrePrimaryExpr__NAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7771:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7772:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7772:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7773:1: RULE_INT
            {
             before(grammarAccess.getPrePrimaryExprAccess().getNINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__PrePrimaryExpr__NAssignment_3_115629); 
             after(grammarAccess.getPrePrimaryExprAccess().getNINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PrePrimaryExpr__NAssignment_3_1


    // $ANTLR start rule__AbstractRef__DefineAssignment_0
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7782:1: rule__AbstractRef__DefineAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AbstractRef__DefineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7786:1: ( ( ( RULE_ID ) ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7787:1: ( ( RULE_ID ) )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7787:1: ( ( RULE_ID ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7788:1: ( RULE_ID )
            {
             before(grammarAccess.getAbstractRefAccess().getDefineDefinesCrossReference_0_0()); 
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7789:1: ( RULE_ID )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7790:1: RULE_ID
            {
             before(grammarAccess.getAbstractRefAccess().getDefineDefinesIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AbstractRef__DefineAssignment_015664); 
             after(grammarAccess.getAbstractRefAccess().getDefineDefinesIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAbstractRefAccess().getDefineDefinesCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AbstractRef__DefineAssignment_0


    // $ANTLR start rule__AbstractRef__ArgsAssignment_1_1_1
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7801:1: rule__AbstractRef__ArgsAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__AbstractRef__ArgsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7805:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7806:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7806:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7807:1: ruleExpression
            {
             before(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_115699);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7816:1: rule__AbstractRef__ArgsAssignment_1_1_2_1 : ( ruleExpression ) ;
    public final void rule__AbstractRef__ArgsAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7820:1: ( ( ruleExpression ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7821:1: ( ruleExpression )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7821:1: ( ruleExpression )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7822:1: ruleExpression
            {
             before(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_2_1_0()); 
            pushFollow(FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_2_115730);
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7831:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7835:1: ( ( RULE_INT ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7836:1: ( RULE_INT )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7836:1: ( RULE_INT )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7837:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_0_115761); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7846:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7850:1: ( ( RULE_STRING ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7851:1: ( RULE_STRING )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7851:1: ( RULE_STRING )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7852:1: RULE_STRING
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_1_115792); 
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
    // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7861:1: rule__TerminalExpression__ValueAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7865:1: ( ( RULE_BOOLEAN ) )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7866:1: ( RULE_BOOLEAN )
            {
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7866:1: ( RULE_BOOLEAN )
            // ../event.ui/src-gen/uk/ac/open/event/ui/contentassist/antlr/internal/InternalEventCalculus.g:7867:1: RULE_BOOLEAN
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_rule__TerminalExpression__ValueAssignment_2_115823); 
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    static final String DFA1_eotS =
        "\11\uffff";
    static final String DFA1_eofS =
        "\11\uffff";
    static final String DFA1_minS =
        "\1\4\1\23\2\uffff\1\15\4\4";
    static final String DFA1_maxS =
        "\1\65\1\23\2\uffff\1\16\4\65";
    static final String DFA1_acceptS =
        "\2\uffff\1\1\1\2\5\uffff";
    static final String DFA1_specialS =
        "\11\uffff}>";
    static final String[] DFA1_transitionS = {
            "\4\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\1\uffff\1\2\1\uffff"+
            "\4\2\1\uffff\2\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff"+
            "\1\3\4\uffff\1\2",
            "\1\4",
            "",
            "",
            "\1\5\1\6",
            "\1\7\3\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\1\uffff\1\2\1\uffff"+
            "\4\2\1\uffff\2\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff"+
            "\1\3\3\uffff\1\10\1\2",
            "\1\7\3\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\1\uffff\1\2\1\uffff"+
            "\4\2\1\uffff\2\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff"+
            "\1\3\3\uffff\1\10\1\2",
            "\4\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\1\uffff\1\2\1\uffff"+
            "\4\2\1\uffff\2\2\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\20\3\1"+
            "\uffff\1\2",
            "\4\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\1\uffff\1\2\1\uffff"+
            "\4\2\1\uffff\2\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff"+
            "\1\3\4\uffff\1\2"
    };

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "991:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) );";
        }
    }
    static final String DFA3_eotS =
        "\16\uffff";
    static final String DFA3_eofS =
        "\16\uffff";
    static final String DFA3_minS =
        "\1\22\1\23\7\uffff\1\15\2\4\2\22";
    static final String DFA3_maxS =
        "\1\65\1\23\7\uffff\1\16\4\65";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff";
    static final String DFA3_specialS =
        "\16\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\30"+
            "\uffff\1\2",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "\1\14\15\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff"+
            "\1\7\1\10\27\uffff\1\15\1\2",
            "\1\14\15\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff"+
            "\1\7\1\10\27\uffff\1\15\1\2",
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\30"+
            "\uffff\1\2",
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\30"+
            "\uffff\1\2"
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "1035:1: rule__Declaration__Alternatives : ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) | ( ruleDefXor ) | ( ruleDefMutex ) );";
        }
    }
 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_entryRuleImport121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImport128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__0_in_ruleImport154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_entryRuleAnnotation181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAnnotation188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0_in_ruleAnnotation214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_entryRuleDeclaration241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDeclaration248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Declaration__Alternatives_in_ruleDeclaration274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefSort_in_entryRuleDefSort303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefSort310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__0_in_ruleDefSort336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRange_in_entryRuleDefRange363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefRange370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__0_in_ruleDefRange396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefOption_in_entryRuleDefOption423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefOption430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group__0_in_ruleDefOption456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_entryRuleDefCompletion483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefCompletion490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__0_in_ruleDefCompletion516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_entryRuleDefNonInertia543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefNonInertia550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__0_in_ruleDefNonInertia576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefXor_in_entryRuleDefXor603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefXor610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__0_in_ruleDefXor636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefMutex_in_entryRuleDefMutex663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefMutex670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__0_in_ruleDefMutex696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledExpression_in_entryRuleLabeledExpression783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabeledExpression790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group__0_in_ruleLabeledExpression816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_entryRuleSortDefinition843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSortDefinition850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__0_in_ruleSortDefinition876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDefinition910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0_in_ruleDefinition936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Alternatives_in_ruleExpression996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_entryRuleQualifier1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifier1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Qualifier__Alternatives_in_ruleQualifier1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_entryRuleParameters1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParameters1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__0_in_ruleParameters1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_entryRuleExists1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExists1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__0_in_ruleExists1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_entryRuleForall1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleForall1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__0_in_ruleForall1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_entryRuleAssignmentOp1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignmentOp1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__0_in_ruleAssignmentOp1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_entryRuleOrExp1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExp1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0_in_ruleOrExp1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_entryRuleAndExp1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExp1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0_in_ruleAndExp1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_entryRuleRelational1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelational1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__0_in_ruleRelational1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_entryRuleAddition1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAddition1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0_in_ruleAddition1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_entryRuleMultiplication1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplication1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0_in_ruleMultiplication1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_entryRulePower1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePower1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0_in_rulePower1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_entryRuleUnaryExpr1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnaryExpr1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__0_in_ruleUnaryExpr1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_entryRulePrePrimaryExpr1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrePrimaryExpr1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Alternatives_in_rulePrePrimaryExpr1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_entryRuleAbstractRef1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbstractRef1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__0_in_ruleAbstractRef1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_entryRuleTerminalExpression1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTerminalExpression1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Alternatives_in_ruleTerminalExpression1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ANNOTATION_TYPE__Alternatives_in_ruleANNOTATION_TYPE1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabelType__Alternatives_in_ruleLabelType1971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleUnaryOp2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DeclarationsAssignment_1_0_in_rule__Model__Alternatives_12045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__StatementsAssignment_1_1_in_rule__Model__Alternatives_12063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_3_0_in_rule__Annotation__Alternatives_32096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__ValueAssignment_3_1_in_rule__Annotation__Alternatives_32114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefSort_in_rule__Declaration__Alternatives2147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefRange_in_rule__Declaration__Alternatives2164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefOption_in_rule__Declaration__Alternatives2181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefCompletion_in_rule__Declaration__Alternatives2198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefNonInertia_in_rule__Declaration__Alternatives2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefXor_in_rule__Declaration__Alternatives2232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefMutex_in_rule__Declaration__Alternatives2249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_0__0_in_rule__DefOption__Alternatives_12282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_1__0_in_rule__DefOption__Alternatives_12300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSortDefinition_in_rule__Statement__Alternatives2333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabeledExpression_in_rule__Statement__Alternatives2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ExprAssignment_0_in_rule__Expression__Alternatives2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0_in_rule__Expression__Alternatives2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExists_in_rule__Qualifier__Alternatives2433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleForall_in_rule__Qualifier__Alternatives2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__0_in_rule__AssignmentOp__Alternatives_1_02482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__0_in_rule__AssignmentOp__Alternatives_1_02500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__0_in_rule__Relational__Alternatives_1_02533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__0_in_rule__Relational__Alternatives_1_02551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__0_in_rule__Relational__Alternatives_1_02569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__0_in_rule__Relational__Alternatives_1_02587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__0_in_rule__Relational__Alternatives_1_02605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__0_in_rule__Relational__Alternatives_1_02623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__0_in_rule__Relational__Alternatives_1_02641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0_in_rule__Addition__Alternatives_1_02674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0_in_rule__Addition__Alternatives_1_02692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0_in_rule__Multiplication__Alternatives_1_02725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0_in_rule__Multiplication__Alternatives_1_02743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTerminalExpression_in_rule__PrePrimaryExpr__Alternatives2776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbstractRef_in_rule__PrePrimaryExpr__Alternatives2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__0_in_rule__PrePrimaryExpr__Alternatives2810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_3__0_in_rule__PrePrimaryExpr__Alternatives2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0_in_rule__TerminalExpression__Alternatives2861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0_in_rule__TerminalExpression__Alternatives2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0_in_rule__TerminalExpression__Alternatives2897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ANNOTATION_TYPE__Alternatives2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ANNOTATION_TYPE__Alternatives2952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__LabelType__Alternatives2988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__LabelType__Alternatives3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__03042 = new BitSet(new long[]{0x002100055BD590F2L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__03045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__ImportsAssignment_0_in_rule__Model__Group__0__Impl3072 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__13103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_1_in_rule__Model__Group__1__Impl3130 = new BitSet(new long[]{0x002100055BD590F2L});
    public static final BitSet FOLLOW_rule__Import__Group__0__Impl_in_rule__Import__Group__03165 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Import__Group__1_in_rule__Import__Group__03168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Import__Group__0__Impl3196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__Group__1__Impl_in_rule__Import__Group__13227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Import__ImportURIAssignment_1_in_rule__Import__Group__1__Impl3254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__0__Impl_in_rule__Annotation__Group__03288 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1_in_rule__Annotation__Group__03291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Annotation__Group__0__Impl3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__1__Impl_in_rule__Annotation__Group__13350 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2_in_rule__Annotation__Group__13353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Annotation__Group__1__Impl3381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__2__Impl_in_rule__Annotation__Group__23412 = new BitSet(new long[]{0x0010000000000012L});
    public static final BitSet FOLLOW_rule__Annotation__Group__3_in_rule__Annotation__Group__23415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__TypeAssignment_2_in_rule__Annotation__Group__2__Impl3442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Group__3__Impl_in_rule__Annotation__Group__33472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Annotation__Alternatives_3_in_rule__Annotation__Group__3__Impl3499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__0__Impl_in_rule__DefSort__Group__03538 = new BitSet(new long[]{0x0020000000100000L});
    public static final BitSet FOLLOW_rule__DefSort__Group__1_in_rule__DefSort__Group__03541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__AnnotationsAssignment_0_in_rule__DefSort__Group__0__Impl3568 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__1__Impl_in_rule__DefSort__Group__13599 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__DefSort__Group__2_in_rule__DefSort__Group__13602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__ReifiedAssignment_1_in_rule__DefSort__Group__1__Impl3629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__2__Impl_in_rule__DefSort__Group__23660 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefSort__Group__3_in_rule__DefSort__Group__23663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DefSort__Group__2__Impl3691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__3__Impl_in_rule__DefSort__Group__33722 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__4_in_rule__DefSort__Group__33725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__NameAssignment_3_in_rule__DefSort__Group__3__Impl3752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group__4__Impl_in_rule__DefSort__Group__43782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group_4__0_in_rule__DefSort__Group__4__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group_4__0__Impl_in_rule__DefSort__Group_4__03850 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefSort__Group_4__1_in_rule__DefSort__Group_4__03853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DefSort__Group_4__0__Impl3881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__Group_4__1__Impl_in_rule__DefSort__Group_4__13912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefSort__TypeAssignment_4_1_in_rule__DefSort__Group_4__1__Impl3939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__0__Impl_in_rule__DefRange__Group__03973 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__DefRange__Group__1_in_rule__DefRange__Group__03976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__AnnotationsAssignment_0_in_rule__DefRange__Group__0__Impl4003 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__1__Impl_in_rule__DefRange__Group__14034 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefRange__Group__2_in_rule__DefRange__Group__14037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DefRange__Group__1__Impl4065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__2__Impl_in_rule__DefRange__Group__24096 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefRange__Group__3_in_rule__DefRange__Group__24099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__NameAssignment_2_in_rule__DefRange__Group__2__Impl4126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__3__Impl_in_rule__DefRange__Group__34156 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefRange__Group__4_in_rule__DefRange__Group__34159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__MinAssignment_3_in_rule__DefRange__Group__3__Impl4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__Group__4__Impl_in_rule__DefRange__Group__44216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefRange__MaxAssignment_4_in_rule__DefRange__Group__4__Impl4243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group__0__Impl_in_rule__DefOption__Group__04283 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__DefOption__Group__1_in_rule__DefOption__Group__04286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__AnnotationsAssignment_0_in_rule__DefOption__Group__0__Impl4313 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DefOption__Group__1__Impl_in_rule__DefOption__Group__14344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Alternatives_1_in_rule__DefOption__Group__1__Impl4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_0__0__Impl_in_rule__DefOption__Group_1_0__04405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_0__1_in_rule__DefOption__Group_1_0__04408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DefOption__Group_1_0__0__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_0__1__Impl_in_rule__DefOption__Group_1_0__14467 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_0__2_in_rule__DefOption__Group_1_0__14470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__NameAssignment_1_0_1_in_rule__DefOption__Group_1_0__1__Impl4497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_0__2__Impl_in_rule__DefOption__Group_1_0__24527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__ValueAssignment_1_0_2_in_rule__DefOption__Group_1_0__2__Impl4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_1__0__Impl_in_rule__DefOption__Group_1_1__04590 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_1__1_in_rule__DefOption__Group_1_1__04593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__DefOption__Group_1_1__0__Impl4621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_1__1__Impl_in_rule__DefOption__Group_1_1__14652 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_1__2_in_rule__DefOption__Group_1_1__14655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__NameAssignment_1_1_1_in_rule__DefOption__Group_1_1__1__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Group_1_1__2__Impl_in_rule__DefOption__Group_1_1__24712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefOption__Value2Assignment_1_1_2_in_rule__DefOption__Group_1_1__2__Impl4739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__0__Impl_in_rule__DefCompletion__Group__04775 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__1_in_rule__DefCompletion__Group__04778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__AnnotationsAssignment_0_in_rule__DefCompletion__Group__0__Impl4805 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__1__Impl_in_rule__DefCompletion__Group__14836 = new BitSet(new long[]{0x0000000000018020L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__2_in_rule__DefCompletion__Group__14839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__DefCompletion__Group__1__Impl4867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__2__Impl_in_rule__DefCompletion__Group__24898 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__3_in_rule__DefCompletion__Group__24901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__TypeAssignment_2_in_rule__DefCompletion__Group__2__Impl4928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__Group__3__Impl_in_rule__DefCompletion__Group__34959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefCompletion__LabelAssignment_3_in_rule__DefCompletion__Group__3__Impl4986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__0__Impl_in_rule__DefNonInertia__Group__05024 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__1_in_rule__DefNonInertia__Group__05027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__AnnotationsAssignment_0_in_rule__DefNonInertia__Group__0__Impl5054 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__1__Impl_in_rule__DefNonInertia__Group__15085 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__2_in_rule__DefNonInertia__Group__15088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DefNonInertia__Group__1__Impl5116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__2__Impl_in_rule__DefNonInertia__Group__25147 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__3_in_rule__DefNonInertia__Group__25150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__NamesAssignment_2_in_rule__DefNonInertia__Group__2__Impl5177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group__3__Impl_in_rule__DefNonInertia__Group__35207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group_3__0_in_rule__DefNonInertia__Group__3__Impl5234 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group_3__0__Impl_in_rule__DefNonInertia__Group_3__05273 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group_3__1_in_rule__DefNonInertia__Group_3__05276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DefNonInertia__Group_3__0__Impl5304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__Group_3__1__Impl_in_rule__DefNonInertia__Group_3__15335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefNonInertia__NamesAssignment_3_1_in_rule__DefNonInertia__Group_3__1__Impl5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__0__Impl_in_rule__DefXor__Group__05396 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__DefXor__Group__1_in_rule__DefXor__Group__05399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__AnnotationsAssignment_0_in_rule__DefXor__Group__0__Impl5426 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__1__Impl_in_rule__DefXor__Group__15457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefXor__Group__2_in_rule__DefXor__Group__15460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DefXor__Group__1__Impl5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__2__Impl_in_rule__DefXor__Group__25519 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__3_in_rule__DefXor__Group__25522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__NamesAssignment_2_in_rule__DefXor__Group__2__Impl5549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group__3__Impl_in_rule__DefXor__Group__35579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group_3__0_in_rule__DefXor__Group__3__Impl5606 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group_3__0__Impl_in_rule__DefXor__Group_3__05645 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefXor__Group_3__1_in_rule__DefXor__Group_3__05648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DefXor__Group_3__0__Impl5676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__Group_3__1__Impl_in_rule__DefXor__Group_3__15707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefXor__NamesAssignment_3_1_in_rule__DefXor__Group_3__1__Impl5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__0__Impl_in_rule__DefMutex__Group__05768 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__1_in_rule__DefMutex__Group__05771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__AnnotationsAssignment_0_in_rule__DefMutex__Group__0__Impl5798 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__1__Impl_in_rule__DefMutex__Group__15829 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__2_in_rule__DefMutex__Group__15832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__DefMutex__Group__1__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__2__Impl_in_rule__DefMutex__Group__25891 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__3_in_rule__DefMutex__Group__25894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__NamesAssignment_2_in_rule__DefMutex__Group__2__Impl5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group__3__Impl_in_rule__DefMutex__Group__35951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group_3__0_in_rule__DefMutex__Group__3__Impl5978 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group_3__0__Impl_in_rule__DefMutex__Group_3__06017 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__DefMutex__Group_3__1_in_rule__DefMutex__Group_3__06020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DefMutex__Group_3__0__Impl6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__Group_3__1__Impl_in_rule__DefMutex__Group_3__16079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DefMutex__NamesAssignment_3_1_in_rule__DefMutex__Group_3__1__Impl6106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group__0__Impl_in_rule__LabeledExpression__Group__06140 = new BitSet(new long[]{0x00010005400190F0L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group__1_in_rule__LabeledExpression__Group__06143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__AnnotationsAssignment_0_in_rule__LabeledExpression__Group__0__Impl6170 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group__1__Impl_in_rule__LabeledExpression__Group__16201 = new BitSet(new long[]{0x00010005400010F0L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group__2_in_rule__LabeledExpression__Group__16204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group_1__0_in_rule__LabeledExpression__Group__1__Impl6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group__2__Impl_in_rule__LabeledExpression__Group__26262 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group__3_in_rule__LabeledExpression__Group__26265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__ExprAssignment_2_in_rule__LabeledExpression__Group__2__Impl6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group__3__Impl_in_rule__LabeledExpression__Group__36322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__LabeledExpression__Group__3__Impl6350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group_1__0__Impl_in_rule__LabeledExpression__Group_1__06389 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group_1__1_in_rule__LabeledExpression__Group_1__06392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__NameAssignment_1_0_in_rule__LabeledExpression__Group_1__0__Impl6419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LabeledExpression__Group_1__1__Impl_in_rule__LabeledExpression__Group_1__16449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LabeledExpression__Group_1__1__Impl6477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__0__Impl_in_rule__SortDefinition__Group__06512 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__1_in_rule__SortDefinition__Group__06515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__SortAssignment_0_in_rule__SortDefinition__Group__0__Impl6542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__1__Impl_in_rule__SortDefinition__Group__16572 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__2_in_rule__SortDefinition__Group__16575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__DefinitionsAssignment_1_in_rule__SortDefinition__Group__1__Impl6602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group__2__Impl_in_rule__SortDefinition__Group__26632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__0_in_rule__SortDefinition__Group__2__Impl6659 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__0__Impl_in_rule__SortDefinition__Group_2__06696 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__1_in_rule__SortDefinition__Group_2__06699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SortDefinition__Group_2__0__Impl6727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__Group_2__1__Impl_in_rule__SortDefinition__Group_2__16758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SortDefinition__DefinitionsAssignment_2_1_in_rule__SortDefinition__Group_2__1__Impl6785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__0__Impl_in_rule__Definition__Group__06819 = new BitSet(new long[]{0x0000000040200002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1_in_rule__Definition__Group__06822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__NameAssignment_0_in_rule__Definition__Group__0__Impl6849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__1__Impl_in_rule__Definition__Group__16879 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2_in_rule__Definition__Group__16882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__0_in_rule__Definition__Group__1__Impl6909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group__2__Impl_in_rule__Definition__Group__26940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__0_in_rule__Definition__Group__2__Impl6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__0__Impl_in_rule__Definition__Group_1__07004 = new BitSet(new long[]{0x0000000084000020L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__1_in_rule__Definition__Group_1__07007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Definition__Group_1__0__Impl7035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__1__Impl_in_rule__Definition__Group_1__17066 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__2_in_rule__Definition__Group_1__17069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ArgsAssignment_1_1_in_rule__Definition__Group_1__1__Impl7096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__2__Impl_in_rule__Definition__Group_1__27127 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__3_in_rule__Definition__Group_1__27130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__0_in_rule__Definition__Group_1__2__Impl7157 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1__3__Impl_in_rule__Definition__Group_1__37188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Definition__Group_1__3__Impl7216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__0__Impl_in_rule__Definition__Group_1_2__07255 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__1_in_rule__Definition__Group_1_2__07258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Definition__Group_1_2__0__Impl7286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_1_2__1__Impl_in_rule__Definition__Group_1_2__17317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ArgsAssignment_1_2_1_in_rule__Definition__Group_1_2__1__Impl7344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__0__Impl_in_rule__Definition__Group_2__07378 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__1_in_rule__Definition__Group_2__07381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Definition__Group_2__0__Impl7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__Group_2__1__Impl_in_rule__Definition__Group_2__17440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Definition__ReturnAssignment_2_1_in_rule__Definition__Group_2__1__Impl7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__0__Impl_in_rule__Expression__Group_1__07501 = new BitSet(new long[]{0x00010005400010F0L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1_in_rule__Expression__Group_1__07504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__QualifiersAssignment_1_0_in_rule__Expression__Group_1__0__Impl7531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__Group_1__1__Impl_in_rule__Expression__Group_1__17561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Expression__ExprAssignment_1_1_in_rule__Expression__Group_1__1__Impl7588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__0__Impl_in_rule__Parameters__Group__07622 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__1_in_rule__Parameters__Group__07625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__NamesAssignment_0_in_rule__Parameters__Group__0__Impl7652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group__1__Impl_in_rule__Parameters__Group__17682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group_1__0_in_rule__Parameters__Group__1__Impl7709 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group_1__0__Impl_in_rule__Parameters__Group_1__07744 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Parameters__Group_1__1_in_rule__Parameters__Group_1__07747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Parameters__Group_1__0__Impl7775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__Group_1__1__Impl_in_rule__Parameters__Group_1__17806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Parameters__NamesAssignment_1_1_in_rule__Parameters__Group_1__1__Impl7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__0__Impl_in_rule__Exists__Group__07867 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Exists__Group__1_in_rule__Exists__Group__07870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__OpAssignment_0_in_rule__Exists__Group__0__Impl7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__1__Impl_in_rule__Exists__Group__17928 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Exists__Group__2_in_rule__Exists__Group__17931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Exists__Group__1__Impl7959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__2__Impl_in_rule__Exists__Group__27990 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Exists__Group__3_in_rule__Exists__Group__27993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__ParametersAssignment_2_in_rule__Exists__Group__2__Impl8020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exists__Group__3__Impl_in_rule__Exists__Group__38050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Exists__Group__3__Impl8078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__0__Impl_in_rule__Forall__Group__08117 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Forall__Group__1_in_rule__Forall__Group__08120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__OpAssignment_0_in_rule__Forall__Group__0__Impl8147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__1__Impl_in_rule__Forall__Group__18178 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Forall__Group__2_in_rule__Forall__Group__18181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Forall__Group__1__Impl8209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__2__Impl_in_rule__Forall__Group__28240 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Forall__Group__3_in_rule__Forall__Group__28243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__ParametersAssignment_2_in_rule__Forall__Group__2__Impl8270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Forall__Group__3__Impl_in_rule__Forall__Group__38300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Forall__Group__3__Impl8328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__0__Impl_in_rule__AssignmentOp__Group__08367 = new BitSet(new long[]{0x0000003000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__1_in_rule__AssignmentOp__Group__08370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__AssignmentOp__Group__0__Impl8397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group__1__Impl_in_rule__AssignmentOp__Group__18426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__0_in_rule__AssignmentOp__Group__1__Impl8453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__0__Impl_in_rule__AssignmentOp__Group_1__08488 = new BitSet(new long[]{0x00010005400010F0L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__1_in_rule__AssignmentOp__Group_1__08491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Alternatives_1_0_in_rule__AssignmentOp__Group_1__0__Impl8518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__1__Impl_in_rule__AssignmentOp__Group_1__18548 = new BitSet(new long[]{0x00010000400010F0L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__2_in_rule__AssignmentOp__Group_1__18551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__QAssignment_1_1_in_rule__AssignmentOp__Group_1__1__Impl8578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1__2__Impl_in_rule__AssignmentOp__Group_1__28609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__RightAssignment_1_2_in_rule__AssignmentOp__Group_1__2__Impl8636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__0__Impl_in_rule__AssignmentOp__Group_1_0_0__08672 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__1_in_rule__AssignmentOp__Group_1_0_0__08675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_0__1__Impl_in_rule__AssignmentOp__Group_1_0_0__18733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AssignmentOp__Group_1_0_0__1__Impl8761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__0__Impl_in_rule__AssignmentOp__Group_1_0_1__08796 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__1_in_rule__AssignmentOp__Group_1_0_1__08799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AssignmentOp__Group_1_0_1__1__Impl_in_rule__AssignmentOp__Group_1_0_1__18857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AssignmentOp__Group_1_0_1__1__Impl8885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__0__Impl_in_rule__OrExp__Group__08920 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1_in_rule__OrExp__Group__08923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__Group__0__Impl8950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group__1__Impl_in_rule__OrExp__Group__18979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0_in_rule__OrExp__Group__1__Impl9006 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__0__Impl_in_rule__OrExp__Group_1__09041 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1_in_rule__OrExp__Group_1__09044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__1__Impl_in_rule__OrExp__Group_1__19102 = new BitSet(new long[]{0x00010005400010F0L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__2_in_rule__OrExp__Group_1__19105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__OrExp__Group_1__1__Impl9133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__2__Impl_in_rule__OrExp__Group_1__29164 = new BitSet(new long[]{0x00010000400010F0L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__3_in_rule__OrExp__Group_1__29167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__QAssignment_1_2_in_rule__OrExp__Group_1__2__Impl9194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__Group_1__3__Impl_in_rule__OrExp__Group_1__39225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__OrExp__RightAssignment_1_3_in_rule__OrExp__Group_1__3__Impl9252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__0__Impl_in_rule__AndExp__Group__09290 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1_in_rule__AndExp__Group__09293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_rule__AndExp__Group__0__Impl9320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group__1__Impl_in_rule__AndExp__Group__19349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0_in_rule__AndExp__Group__1__Impl9376 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__0__Impl_in_rule__AndExp__Group_1__09411 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1_in_rule__AndExp__Group_1__09414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__1__Impl_in_rule__AndExp__Group_1__19472 = new BitSet(new long[]{0x00010005400010F0L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__2_in_rule__AndExp__Group_1__19475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__AndExp__Group_1__1__Impl9503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__2__Impl_in_rule__AndExp__Group_1__29534 = new BitSet(new long[]{0x00010000400010F0L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__3_in_rule__AndExp__Group_1__29537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__QAssignment_1_2_in_rule__AndExp__Group_1__2__Impl9564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__Group_1__3__Impl_in_rule__AndExp__Group_1__39595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AndExp__RightAssignment_1_3_in_rule__AndExp__Group_1__3__Impl9622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__0__Impl_in_rule__Relational__Group__09660 = new BitSet(new long[]{0x00007F0000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__1_in_rule__Relational__Group__09663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relational__Group__0__Impl9690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group__1__Impl_in_rule__Relational__Group__19719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__0_in_rule__Relational__Group__1__Impl9746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__0__Impl_in_rule__Relational__Group_1__09781 = new BitSet(new long[]{0x00010000400010F0L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__1_in_rule__Relational__Group_1__09784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Alternatives_1_0_in_rule__Relational__Group_1__0__Impl9811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1__1__Impl_in_rule__Relational__Group_1__19841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__RightAssignment_1_1_in_rule__Relational__Group_1__1__Impl9868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__0__Impl_in_rule__Relational__Group_1_0_0__09902 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__1_in_rule__Relational__Group_1_0_0__09905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_0__1__Impl_in_rule__Relational__Group_1_0_0__19963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Relational__Group_1_0_0__1__Impl9991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__0__Impl_in_rule__Relational__Group_1_0_1__010026 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__1_in_rule__Relational__Group_1_0_1__010029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_1__1__Impl_in_rule__Relational__Group_1_0_1__110087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Relational__Group_1_0_1__1__Impl10115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__0__Impl_in_rule__Relational__Group_1_0_2__010150 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__1_in_rule__Relational__Group_1_0_2__010153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_2__1__Impl_in_rule__Relational__Group_1_0_2__110211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Relational__Group_1_0_2__1__Impl10239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__0__Impl_in_rule__Relational__Group_1_0_3__010274 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__1_in_rule__Relational__Group_1_0_3__010277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_3__1__Impl_in_rule__Relational__Group_1_0_3__110335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Relational__Group_1_0_3__1__Impl10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__0__Impl_in_rule__Relational__Group_1_0_4__010398 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__1_in_rule__Relational__Group_1_0_4__010401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_4__1__Impl_in_rule__Relational__Group_1_0_4__110459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Relational__Group_1_0_4__1__Impl10487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__0__Impl_in_rule__Relational__Group_1_0_5__010522 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__1_in_rule__Relational__Group_1_0_5__010525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_5__1__Impl_in_rule__Relational__Group_1_0_5__110583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Relational__Group_1_0_5__1__Impl10611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__0__Impl_in_rule__Relational__Group_1_0_6__010646 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__1_in_rule__Relational__Group_1_0_6__010649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relational__Group_1_0_6__1__Impl_in_rule__Relational__Group_1_0_6__110707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Relational__Group_1_0_6__1__Impl10735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__0__Impl_in_rule__Addition__Group__010770 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1_in_rule__Addition__Group__010773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__Group__0__Impl10800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group__1__Impl_in_rule__Addition__Group__110829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0_in_rule__Addition__Group__1__Impl10856 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__0__Impl_in_rule__Addition__Group_1__010891 = new BitSet(new long[]{0x00010000400010F0L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1_in_rule__Addition__Group_1__010894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Alternatives_1_0_in_rule__Addition__Group_1__0__Impl10921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1__1__Impl_in_rule__Addition__Group_1__110951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__RightAssignment_1_1_in_rule__Addition__Group_1__1__Impl10978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__0__Impl_in_rule__Addition__Group_1_0_0__011012 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1_in_rule__Addition__Group_1_0_0__011015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_0__1__Impl_in_rule__Addition__Group_1_0_0__111073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Addition__Group_1_0_0__1__Impl11101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__0__Impl_in_rule__Addition__Group_1_0_1__011136 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1_in_rule__Addition__Group_1_0_1__011139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Addition__Group_1_0_1__1__Impl_in_rule__Addition__Group_1_0_1__111197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Addition__Group_1_0_1__1__Impl11225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__0__Impl_in_rule__Multiplication__Group__011260 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1_in_rule__Multiplication__Group__011263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__Group__0__Impl11290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group__1__Impl_in_rule__Multiplication__Group__111319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0_in_rule__Multiplication__Group__1__Impl11346 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__0__Impl_in_rule__Multiplication__Group_1__011381 = new BitSet(new long[]{0x00010000400010F0L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1_in_rule__Multiplication__Group_1__011384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Alternatives_1_0_in_rule__Multiplication__Group_1__0__Impl11411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1__1__Impl_in_rule__Multiplication__Group_1__111441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__RightAssignment_1_1_in_rule__Multiplication__Group_1__1__Impl11468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__0__Impl_in_rule__Multiplication__Group_1_0_0__011502 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1_in_rule__Multiplication__Group_1_0_0__011505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_0__1__Impl_in_rule__Multiplication__Group_1_0_0__111563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Multiplication__Group_1_0_0__1__Impl11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__0__Impl_in_rule__Multiplication__Group_1_0_1__011626 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1_in_rule__Multiplication__Group_1_0_1__011629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Multiplication__Group_1_0_1__1__Impl_in_rule__Multiplication__Group_1_0_1__111687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Multiplication__Group_1_0_1__1__Impl11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__0__Impl_in_rule__Power__Group__011750 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1_in_rule__Power__Group__011753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__Power__Group__0__Impl11780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group__1__Impl_in_rule__Power__Group__111809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0_in_rule__Power__Group__1__Impl11836 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__0__Impl_in_rule__Power__Group_1__011871 = new BitSet(new long[]{0x00010000400010F0L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1_in_rule__Power__Group_1__011874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0_in_rule__Power__Group_1__0__Impl11901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1__1__Impl_in_rule__Power__Group_1__111931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__RightAssignment_1_1_in_rule__Power__Group_1__1__Impl11958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__0__Impl_in_rule__Power__Group_1_0__011992 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1_in_rule__Power__Group_1_0__011995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Power__Group_1_0__1__Impl_in_rule__Power__Group_1_0__112053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Power__Group_1_0__1__Impl12081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__0__Impl_in_rule__UnaryExpr__Group__012116 = new BitSet(new long[]{0x00010000400000F0L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__1_in_rule__UnaryExpr__Group__012119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__OpAssignment_0_in_rule__UnaryExpr__Group__0__Impl12146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__Group__1__Impl_in_rule__UnaryExpr__Group__112177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnaryExpr__RightAssignment_1_in_rule__UnaryExpr__Group__1__Impl12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__0__Impl_in_rule__PrePrimaryExpr__Group_2__012238 = new BitSet(new long[]{0x00010005400010F0L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__1_in_rule__PrePrimaryExpr__Group_2__012241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__PrePrimaryExpr__Group_2__0__Impl12269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__1__Impl_in_rule__PrePrimaryExpr__Group_2__112300 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__2_in_rule__PrePrimaryExpr__Group_2__112303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PrePrimaryExpr__Group_2__1__Impl12330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_2__2__Impl_in_rule__PrePrimaryExpr__Group_2__212359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PrePrimaryExpr__Group_2__2__Impl12387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_3__0__Impl_in_rule__PrePrimaryExpr__Group_3__012424 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_3__1_in_rule__PrePrimaryExpr__Group_3__012427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__PrePrimaryExpr__Group_3__0__Impl12455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__Group_3__1__Impl_in_rule__PrePrimaryExpr__Group_3__112486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PrePrimaryExpr__NAssignment_3_1_in_rule__PrePrimaryExpr__Group_3__1__Impl12513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__0__Impl_in_rule__AbstractRef__Group__012547 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__1_in_rule__AbstractRef__Group__012550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__DefineAssignment_0_in_rule__AbstractRef__Group__0__Impl12577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group__1__Impl_in_rule__AbstractRef__Group__112607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__0_in_rule__AbstractRef__Group__1__Impl12634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__0__Impl_in_rule__AbstractRef__Group_1__012669 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__1_in_rule__AbstractRef__Group_1__012672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1__1__Impl_in_rule__AbstractRef__Group_1__112730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__0_in_rule__AbstractRef__Group_1__1__Impl12757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__0__Impl_in_rule__AbstractRef__Group_1_1__012791 = new BitSet(new long[]{0x00010005C40010F0L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__1_in_rule__AbstractRef__Group_1_1__012794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AbstractRef__Group_1_1__0__Impl12822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__1__Impl_in_rule__AbstractRef__Group_1_1__112853 = new BitSet(new long[]{0x0000000084000000L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__2_in_rule__AbstractRef__Group_1_1__112856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_1_in_rule__AbstractRef__Group_1_1__1__Impl12883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__2__Impl_in_rule__AbstractRef__Group_1_1__212914 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__3_in_rule__AbstractRef__Group_1_1__212917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__0_in_rule__AbstractRef__Group_1_1__2__Impl12944 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1__3__Impl_in_rule__AbstractRef__Group_1_1__312975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AbstractRef__Group_1_1__3__Impl13003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__0__Impl_in_rule__AbstractRef__Group_1_1_2__013042 = new BitSet(new long[]{0x00010005400010F0L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__1_in_rule__AbstractRef__Group_1_1_2__013045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AbstractRef__Group_1_1_2__0__Impl13073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__Group_1_1_2__1__Impl_in_rule__AbstractRef__Group_1_1_2__113104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AbstractRef__ArgsAssignment_1_1_2_1_in_rule__AbstractRef__Group_1_1_2__1__Impl13131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__0__Impl_in_rule__TerminalExpression__Group_0__013165 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1_in_rule__TerminalExpression__Group_0__013168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_0__1__Impl_in_rule__TerminalExpression__Group_0__113226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_0_1_in_rule__TerminalExpression__Group_0__1__Impl13253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__0__Impl_in_rule__TerminalExpression__Group_1__013287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1_in_rule__TerminalExpression__Group_1__013290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_1__1__Impl_in_rule__TerminalExpression__Group_1__113348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_1_1_in_rule__TerminalExpression__Group_1__1__Impl13375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__0__Impl_in_rule__TerminalExpression__Group_2__013409 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1_in_rule__TerminalExpression__Group_2__013412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__Group_2__1__Impl_in_rule__TerminalExpression__Group_2__113470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TerminalExpression__ValueAssignment_2_1_in_rule__TerminalExpression__Group_2__1__Impl13497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImport_in_rule__Model__ImportsAssignment_013538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDeclaration_in_rule__Model__DeclarationsAssignment_1_013569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__Model__StatementsAssignment_1_113600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Import__ImportURIAssignment_113631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleANNOTATION_TYPE_in_rule__Annotation__TypeAssignment_213662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Annotation__ValueAssignment_3_013693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_rule__Annotation__ValueAssignment_3_113729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__DefSort__AnnotationsAssignment_013768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_rule__DefSort__ReifiedAssignment_113804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefSort__NameAssignment_313843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefSort__TypeAssignment_4_113874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__DefRange__AnnotationsAssignment_013905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefRange__NameAssignment_213940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DefRange__MinAssignment_313975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DefRange__MaxAssignment_414006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__DefOption__AnnotationsAssignment_014037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefOption__NameAssignment_1_0_114068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__DefOption__ValueAssignment_1_0_214099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefOption__NameAssignment_1_1_114130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefOption__Value2Assignment_1_1_214161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__DefCompletion__AnnotationsAssignment_014192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelType_in_rule__DefCompletion__TypeAssignment_214223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefCompletion__LabelAssignment_314258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__DefNonInertia__AnnotationsAssignment_014293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefNonInertia__NamesAssignment_214328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefNonInertia__NamesAssignment_3_114367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__DefXor__AnnotationsAssignment_014402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefXor__NamesAssignment_214437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefXor__NamesAssignment_3_114476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__DefMutex__AnnotationsAssignment_014511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefMutex__NamesAssignment_214546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DefMutex__NamesAssignment_3_114585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAnnotation_in_rule__LabeledExpression__AnnotationsAssignment_014620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabelType_in_rule__LabeledExpression__NameAssignment_1_014651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__LabeledExpression__ExprAssignment_214682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SortDefinition__SortAssignment_014717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_114752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDefinition_in_rule__SortDefinition__DefinitionsAssignment_2_114783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__NameAssignment_014814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__ArgsAssignment_1_114849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__ArgsAssignment_1_2_114888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Definition__ReturnAssignment_2_114927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignmentOp_in_rule__Expression__ExprAssignment_014962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__Expression__QualifiersAssignment_1_014993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Expression__ExprAssignment_1_115024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameters__NamesAssignment_015059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Parameters__NamesAssignment_1_115098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_rule__Exists__OpAssignment_015133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_rule__Exists__ParametersAssignment_215164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_rule__Forall__OpAssignment_015195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParameters_in_rule__Forall__ParametersAssignment_215226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__AssignmentOp__QAssignment_1_115257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExp_in_rule__AssignmentOp__RightAssignment_1_215288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__OrExp__QAssignment_1_215319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExp_in_rule__OrExp__RightAssignment_1_315350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifier_in_rule__AndExp__QAssignment_1_215381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelational_in_rule__AndExp__RightAssignment_1_315412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAddition_in_rule__Relational__RightAssignment_1_115443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplication_in_rule__Addition__RightAssignment_1_115474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePower_in_rule__Multiplication__RightAssignment_1_115505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryExpr_in_rule__Power__RightAssignment_1_115536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnaryOp_in_rule__UnaryExpr__OpAssignment_015567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrePrimaryExpr_in_rule__UnaryExpr__RightAssignment_115598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__PrePrimaryExpr__NAssignment_3_115629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AbstractRef__DefineAssignment_015664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_115699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__AbstractRef__ArgsAssignment_1_1_2_115730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__TerminalExpression__ValueAssignment_0_115761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__TerminalExpression__ValueAssignment_1_115792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_rule__TerminalExpression__ValueAssignment_2_115823 = new BitSet(new long[]{0x0000000000000002L});

}