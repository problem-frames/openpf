package uk.ac.open.event.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
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
    public static final int T__50=50;
    public static final int RULE_BOOLEAN=7;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEventCalculusParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEventCalculusParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEventCalculusParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEventCalculus.g"; }


     
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




    // $ANTLR start "entryRuleModel"
    // InternalEventCalculus.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEventCalculus.g:61:1: ( ruleModel EOF )
            // InternalEventCalculus.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEventCalculus.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalEventCalculus.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // InternalEventCalculus.g:74:1: ( ( rule__Model__Group__0 ) )
            // InternalEventCalculus.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalEventCalculus.g:76:1: ( rule__Model__Group__0 )
            // InternalEventCalculus.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleImport"
    // InternalEventCalculus.g:88:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalEventCalculus.g:89:1: ( ruleImport EOF )
            // InternalEventCalculus.g:90:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalEventCalculus.g:97:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:101:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalEventCalculus.g:102:1: ( ( rule__Import__Group__0 ) )
            {
            // InternalEventCalculus.g:102:1: ( ( rule__Import__Group__0 ) )
            // InternalEventCalculus.g:103:1: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalEventCalculus.g:104:1: ( rule__Import__Group__0 )
            // InternalEventCalculus.g:104:2: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAnnotation"
    // InternalEventCalculus.g:116:1: entryRuleAnnotation : ruleAnnotation EOF ;
    public final void entryRuleAnnotation() throws RecognitionException {
        try {
            // InternalEventCalculus.g:117:1: ( ruleAnnotation EOF )
            // InternalEventCalculus.g:118:1: ruleAnnotation EOF
            {
             before(grammarAccess.getAnnotationRule()); 
            pushFollow(FOLLOW_1);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getAnnotationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAnnotation"


    // $ANTLR start "ruleAnnotation"
    // InternalEventCalculus.g:125:1: ruleAnnotation : ( ( rule__Annotation__Group__0 ) ) ;
    public final void ruleAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:129:2: ( ( ( rule__Annotation__Group__0 ) ) )
            // InternalEventCalculus.g:130:1: ( ( rule__Annotation__Group__0 ) )
            {
            // InternalEventCalculus.g:130:1: ( ( rule__Annotation__Group__0 ) )
            // InternalEventCalculus.g:131:1: ( rule__Annotation__Group__0 )
            {
             before(grammarAccess.getAnnotationAccess().getGroup()); 
            // InternalEventCalculus.g:132:1: ( rule__Annotation__Group__0 )
            // InternalEventCalculus.g:132:2: rule__Annotation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleAnnotation"


    // $ANTLR start "entryRuleDeclaration"
    // InternalEventCalculus.g:144:1: entryRuleDeclaration : ruleDeclaration EOF ;
    public final void entryRuleDeclaration() throws RecognitionException {
        try {
            // InternalEventCalculus.g:145:1: ( ruleDeclaration EOF )
            // InternalEventCalculus.g:146:1: ruleDeclaration EOF
            {
             before(grammarAccess.getDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleDeclaration();

            state._fsp--;

             after(grammarAccess.getDeclarationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDeclaration"


    // $ANTLR start "ruleDeclaration"
    // InternalEventCalculus.g:153:1: ruleDeclaration : ( ( rule__Declaration__Alternatives ) ) ;
    public final void ruleDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:157:2: ( ( ( rule__Declaration__Alternatives ) ) )
            // InternalEventCalculus.g:158:1: ( ( rule__Declaration__Alternatives ) )
            {
            // InternalEventCalculus.g:158:1: ( ( rule__Declaration__Alternatives ) )
            // InternalEventCalculus.g:159:1: ( rule__Declaration__Alternatives )
            {
             before(grammarAccess.getDeclarationAccess().getAlternatives()); 
            // InternalEventCalculus.g:160:1: ( rule__Declaration__Alternatives )
            // InternalEventCalculus.g:160:2: rule__Declaration__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Declaration__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleDeclaration"


    // $ANTLR start "entryRuleDefSort"
    // InternalEventCalculus.g:174:1: entryRuleDefSort : ruleDefSort EOF ;
    public final void entryRuleDefSort() throws RecognitionException {
        try {
            // InternalEventCalculus.g:175:1: ( ruleDefSort EOF )
            // InternalEventCalculus.g:176:1: ruleDefSort EOF
            {
             before(grammarAccess.getDefSortRule()); 
            pushFollow(FOLLOW_1);
            ruleDefSort();

            state._fsp--;

             after(grammarAccess.getDefSortRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefSort"


    // $ANTLR start "ruleDefSort"
    // InternalEventCalculus.g:183:1: ruleDefSort : ( ( rule__DefSort__Group__0 ) ) ;
    public final void ruleDefSort() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:187:2: ( ( ( rule__DefSort__Group__0 ) ) )
            // InternalEventCalculus.g:188:1: ( ( rule__DefSort__Group__0 ) )
            {
            // InternalEventCalculus.g:188:1: ( ( rule__DefSort__Group__0 ) )
            // InternalEventCalculus.g:189:1: ( rule__DefSort__Group__0 )
            {
             before(grammarAccess.getDefSortAccess().getGroup()); 
            // InternalEventCalculus.g:190:1: ( rule__DefSort__Group__0 )
            // InternalEventCalculus.g:190:2: rule__DefSort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefSort__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleDefSort"


    // $ANTLR start "entryRuleDefRange"
    // InternalEventCalculus.g:202:1: entryRuleDefRange : ruleDefRange EOF ;
    public final void entryRuleDefRange() throws RecognitionException {
        try {
            // InternalEventCalculus.g:203:1: ( ruleDefRange EOF )
            // InternalEventCalculus.g:204:1: ruleDefRange EOF
            {
             before(grammarAccess.getDefRangeRule()); 
            pushFollow(FOLLOW_1);
            ruleDefRange();

            state._fsp--;

             after(grammarAccess.getDefRangeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefRange"


    // $ANTLR start "ruleDefRange"
    // InternalEventCalculus.g:211:1: ruleDefRange : ( ( rule__DefRange__Group__0 ) ) ;
    public final void ruleDefRange() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:215:2: ( ( ( rule__DefRange__Group__0 ) ) )
            // InternalEventCalculus.g:216:1: ( ( rule__DefRange__Group__0 ) )
            {
            // InternalEventCalculus.g:216:1: ( ( rule__DefRange__Group__0 ) )
            // InternalEventCalculus.g:217:1: ( rule__DefRange__Group__0 )
            {
             before(grammarAccess.getDefRangeAccess().getGroup()); 
            // InternalEventCalculus.g:218:1: ( rule__DefRange__Group__0 )
            // InternalEventCalculus.g:218:2: rule__DefRange__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefRange__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleDefRange"


    // $ANTLR start "entryRuleDefOption"
    // InternalEventCalculus.g:230:1: entryRuleDefOption : ruleDefOption EOF ;
    public final void entryRuleDefOption() throws RecognitionException {
        try {
            // InternalEventCalculus.g:231:1: ( ruleDefOption EOF )
            // InternalEventCalculus.g:232:1: ruleDefOption EOF
            {
             before(grammarAccess.getDefOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefOption();

            state._fsp--;

             after(grammarAccess.getDefOptionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefOption"


    // $ANTLR start "ruleDefOption"
    // InternalEventCalculus.g:239:1: ruleDefOption : ( ( rule__DefOption__Group__0 ) ) ;
    public final void ruleDefOption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:243:2: ( ( ( rule__DefOption__Group__0 ) ) )
            // InternalEventCalculus.g:244:1: ( ( rule__DefOption__Group__0 ) )
            {
            // InternalEventCalculus.g:244:1: ( ( rule__DefOption__Group__0 ) )
            // InternalEventCalculus.g:245:1: ( rule__DefOption__Group__0 )
            {
             before(grammarAccess.getDefOptionAccess().getGroup()); 
            // InternalEventCalculus.g:246:1: ( rule__DefOption__Group__0 )
            // InternalEventCalculus.g:246:2: rule__DefOption__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefOption__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleDefOption"


    // $ANTLR start "entryRuleDefCompletion"
    // InternalEventCalculus.g:258:1: entryRuleDefCompletion : ruleDefCompletion EOF ;
    public final void entryRuleDefCompletion() throws RecognitionException {
        try {
            // InternalEventCalculus.g:259:1: ( ruleDefCompletion EOF )
            // InternalEventCalculus.g:260:1: ruleDefCompletion EOF
            {
             before(grammarAccess.getDefCompletionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefCompletion();

            state._fsp--;

             after(grammarAccess.getDefCompletionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefCompletion"


    // $ANTLR start "ruleDefCompletion"
    // InternalEventCalculus.g:267:1: ruleDefCompletion : ( ( rule__DefCompletion__Group__0 ) ) ;
    public final void ruleDefCompletion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:271:2: ( ( ( rule__DefCompletion__Group__0 ) ) )
            // InternalEventCalculus.g:272:1: ( ( rule__DefCompletion__Group__0 ) )
            {
            // InternalEventCalculus.g:272:1: ( ( rule__DefCompletion__Group__0 ) )
            // InternalEventCalculus.g:273:1: ( rule__DefCompletion__Group__0 )
            {
             before(grammarAccess.getDefCompletionAccess().getGroup()); 
            // InternalEventCalculus.g:274:1: ( rule__DefCompletion__Group__0 )
            // InternalEventCalculus.g:274:2: rule__DefCompletion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefCompletion__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleDefCompletion"


    // $ANTLR start "entryRuleDefNonInertia"
    // InternalEventCalculus.g:286:1: entryRuleDefNonInertia : ruleDefNonInertia EOF ;
    public final void entryRuleDefNonInertia() throws RecognitionException {
        try {
            // InternalEventCalculus.g:287:1: ( ruleDefNonInertia EOF )
            // InternalEventCalculus.g:288:1: ruleDefNonInertia EOF
            {
             before(grammarAccess.getDefNonInertiaRule()); 
            pushFollow(FOLLOW_1);
            ruleDefNonInertia();

            state._fsp--;

             after(grammarAccess.getDefNonInertiaRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefNonInertia"


    // $ANTLR start "ruleDefNonInertia"
    // InternalEventCalculus.g:295:1: ruleDefNonInertia : ( ( rule__DefNonInertia__Group__0 ) ) ;
    public final void ruleDefNonInertia() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:299:2: ( ( ( rule__DefNonInertia__Group__0 ) ) )
            // InternalEventCalculus.g:300:1: ( ( rule__DefNonInertia__Group__0 ) )
            {
            // InternalEventCalculus.g:300:1: ( ( rule__DefNonInertia__Group__0 ) )
            // InternalEventCalculus.g:301:1: ( rule__DefNonInertia__Group__0 )
            {
             before(grammarAccess.getDefNonInertiaAccess().getGroup()); 
            // InternalEventCalculus.g:302:1: ( rule__DefNonInertia__Group__0 )
            // InternalEventCalculus.g:302:2: rule__DefNonInertia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefNonInertia__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleDefNonInertia"


    // $ANTLR start "entryRuleDefXor"
    // InternalEventCalculus.g:314:1: entryRuleDefXor : ruleDefXor EOF ;
    public final void entryRuleDefXor() throws RecognitionException {
        try {
            // InternalEventCalculus.g:315:1: ( ruleDefXor EOF )
            // InternalEventCalculus.g:316:1: ruleDefXor EOF
            {
             before(grammarAccess.getDefXorRule()); 
            pushFollow(FOLLOW_1);
            ruleDefXor();

            state._fsp--;

             after(grammarAccess.getDefXorRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefXor"


    // $ANTLR start "ruleDefXor"
    // InternalEventCalculus.g:323:1: ruleDefXor : ( ( rule__DefXor__Group__0 ) ) ;
    public final void ruleDefXor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:327:2: ( ( ( rule__DefXor__Group__0 ) ) )
            // InternalEventCalculus.g:328:1: ( ( rule__DefXor__Group__0 ) )
            {
            // InternalEventCalculus.g:328:1: ( ( rule__DefXor__Group__0 ) )
            // InternalEventCalculus.g:329:1: ( rule__DefXor__Group__0 )
            {
             before(grammarAccess.getDefXorAccess().getGroup()); 
            // InternalEventCalculus.g:330:1: ( rule__DefXor__Group__0 )
            // InternalEventCalculus.g:330:2: rule__DefXor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefXor__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleDefXor"


    // $ANTLR start "entryRuleDefMutex"
    // InternalEventCalculus.g:342:1: entryRuleDefMutex : ruleDefMutex EOF ;
    public final void entryRuleDefMutex() throws RecognitionException {
        try {
            // InternalEventCalculus.g:343:1: ( ruleDefMutex EOF )
            // InternalEventCalculus.g:344:1: ruleDefMutex EOF
            {
             before(grammarAccess.getDefMutexRule()); 
            pushFollow(FOLLOW_1);
            ruleDefMutex();

            state._fsp--;

             after(grammarAccess.getDefMutexRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefMutex"


    // $ANTLR start "ruleDefMutex"
    // InternalEventCalculus.g:351:1: ruleDefMutex : ( ( rule__DefMutex__Group__0 ) ) ;
    public final void ruleDefMutex() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:355:2: ( ( ( rule__DefMutex__Group__0 ) ) )
            // InternalEventCalculus.g:356:1: ( ( rule__DefMutex__Group__0 ) )
            {
            // InternalEventCalculus.g:356:1: ( ( rule__DefMutex__Group__0 ) )
            // InternalEventCalculus.g:357:1: ( rule__DefMutex__Group__0 )
            {
             before(grammarAccess.getDefMutexAccess().getGroup()); 
            // InternalEventCalculus.g:358:1: ( rule__DefMutex__Group__0 )
            // InternalEventCalculus.g:358:2: rule__DefMutex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefMutex__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleDefMutex"


    // $ANTLR start "entryRuleStatement"
    // InternalEventCalculus.g:370:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalEventCalculus.g:371:1: ( ruleStatement EOF )
            // InternalEventCalculus.g:372:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEventCalculus.g:379:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:383:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalEventCalculus.g:384:1: ( ( rule__Statement__Alternatives ) )
            {
            // InternalEventCalculus.g:384:1: ( ( rule__Statement__Alternatives ) )
            // InternalEventCalculus.g:385:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalEventCalculus.g:386:1: ( rule__Statement__Alternatives )
            // InternalEventCalculus.g:386:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleLabeledExpression"
    // InternalEventCalculus.g:398:1: entryRuleLabeledExpression : ruleLabeledExpression EOF ;
    public final void entryRuleLabeledExpression() throws RecognitionException {
        try {
            // InternalEventCalculus.g:399:1: ( ruleLabeledExpression EOF )
            // InternalEventCalculus.g:400:1: ruleLabeledExpression EOF
            {
             before(grammarAccess.getLabeledExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLabeledExpression();

            state._fsp--;

             after(grammarAccess.getLabeledExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLabeledExpression"


    // $ANTLR start "ruleLabeledExpression"
    // InternalEventCalculus.g:407:1: ruleLabeledExpression : ( ( rule__LabeledExpression__Group__0 ) ) ;
    public final void ruleLabeledExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:411:2: ( ( ( rule__LabeledExpression__Group__0 ) ) )
            // InternalEventCalculus.g:412:1: ( ( rule__LabeledExpression__Group__0 ) )
            {
            // InternalEventCalculus.g:412:1: ( ( rule__LabeledExpression__Group__0 ) )
            // InternalEventCalculus.g:413:1: ( rule__LabeledExpression__Group__0 )
            {
             before(grammarAccess.getLabeledExpressionAccess().getGroup()); 
            // InternalEventCalculus.g:414:1: ( rule__LabeledExpression__Group__0 )
            // InternalEventCalculus.g:414:2: rule__LabeledExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LabeledExpression__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleLabeledExpression"


    // $ANTLR start "entryRuleSortDefinition"
    // InternalEventCalculus.g:426:1: entryRuleSortDefinition : ruleSortDefinition EOF ;
    public final void entryRuleSortDefinition() throws RecognitionException {
        try {
            // InternalEventCalculus.g:427:1: ( ruleSortDefinition EOF )
            // InternalEventCalculus.g:428:1: ruleSortDefinition EOF
            {
             before(grammarAccess.getSortDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleSortDefinition();

            state._fsp--;

             after(grammarAccess.getSortDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSortDefinition"


    // $ANTLR start "ruleSortDefinition"
    // InternalEventCalculus.g:435:1: ruleSortDefinition : ( ( rule__SortDefinition__Group__0 ) ) ;
    public final void ruleSortDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:439:2: ( ( ( rule__SortDefinition__Group__0 ) ) )
            // InternalEventCalculus.g:440:1: ( ( rule__SortDefinition__Group__0 ) )
            {
            // InternalEventCalculus.g:440:1: ( ( rule__SortDefinition__Group__0 ) )
            // InternalEventCalculus.g:441:1: ( rule__SortDefinition__Group__0 )
            {
             before(grammarAccess.getSortDefinitionAccess().getGroup()); 
            // InternalEventCalculus.g:442:1: ( rule__SortDefinition__Group__0 )
            // InternalEventCalculus.g:442:2: rule__SortDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SortDefinition__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleSortDefinition"


    // $ANTLR start "entryRuleDefinition"
    // InternalEventCalculus.g:454:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalEventCalculus.g:455:1: ( ruleDefinition EOF )
            // InternalEventCalculus.g:456:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalEventCalculus.g:463:1: ruleDefinition : ( ( rule__Definition__Group__0 ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:467:2: ( ( ( rule__Definition__Group__0 ) ) )
            // InternalEventCalculus.g:468:1: ( ( rule__Definition__Group__0 ) )
            {
            // InternalEventCalculus.g:468:1: ( ( rule__Definition__Group__0 ) )
            // InternalEventCalculus.g:469:1: ( rule__Definition__Group__0 )
            {
             before(grammarAccess.getDefinitionAccess().getGroup()); 
            // InternalEventCalculus.g:470:1: ( rule__Definition__Group__0 )
            // InternalEventCalculus.g:470:2: rule__Definition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleExpression"
    // InternalEventCalculus.g:482:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalEventCalculus.g:483:1: ( ruleExpression EOF )
            // InternalEventCalculus.g:484:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalEventCalculus.g:491:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:495:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalEventCalculus.g:496:1: ( ( rule__Expression__Alternatives ) )
            {
            // InternalEventCalculus.g:496:1: ( ( rule__Expression__Alternatives ) )
            // InternalEventCalculus.g:497:1: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalEventCalculus.g:498:1: ( rule__Expression__Alternatives )
            // InternalEventCalculus.g:498:2: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleQualifier"
    // InternalEventCalculus.g:510:1: entryRuleQualifier : ruleQualifier EOF ;
    public final void entryRuleQualifier() throws RecognitionException {
        try {
            // InternalEventCalculus.g:511:1: ( ruleQualifier EOF )
            // InternalEventCalculus.g:512:1: ruleQualifier EOF
            {
             before(grammarAccess.getQualifierRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifier();

            state._fsp--;

             after(grammarAccess.getQualifierRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifier"


    // $ANTLR start "ruleQualifier"
    // InternalEventCalculus.g:519:1: ruleQualifier : ( ( rule__Qualifier__Alternatives ) ) ;
    public final void ruleQualifier() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:523:2: ( ( ( rule__Qualifier__Alternatives ) ) )
            // InternalEventCalculus.g:524:1: ( ( rule__Qualifier__Alternatives ) )
            {
            // InternalEventCalculus.g:524:1: ( ( rule__Qualifier__Alternatives ) )
            // InternalEventCalculus.g:525:1: ( rule__Qualifier__Alternatives )
            {
             before(grammarAccess.getQualifierAccess().getAlternatives()); 
            // InternalEventCalculus.g:526:1: ( rule__Qualifier__Alternatives )
            // InternalEventCalculus.g:526:2: rule__Qualifier__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Qualifier__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleQualifier"


    // $ANTLR start "entryRuleParameters"
    // InternalEventCalculus.g:538:1: entryRuleParameters : ruleParameters EOF ;
    public final void entryRuleParameters() throws RecognitionException {
        try {
            // InternalEventCalculus.g:539:1: ( ruleParameters EOF )
            // InternalEventCalculus.g:540:1: ruleParameters EOF
            {
             before(grammarAccess.getParametersRule()); 
            pushFollow(FOLLOW_1);
            ruleParameters();

            state._fsp--;

             after(grammarAccess.getParametersRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameters"


    // $ANTLR start "ruleParameters"
    // InternalEventCalculus.g:547:1: ruleParameters : ( ( rule__Parameters__Group__0 ) ) ;
    public final void ruleParameters() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:551:2: ( ( ( rule__Parameters__Group__0 ) ) )
            // InternalEventCalculus.g:552:1: ( ( rule__Parameters__Group__0 ) )
            {
            // InternalEventCalculus.g:552:1: ( ( rule__Parameters__Group__0 ) )
            // InternalEventCalculus.g:553:1: ( rule__Parameters__Group__0 )
            {
             before(grammarAccess.getParametersAccess().getGroup()); 
            // InternalEventCalculus.g:554:1: ( rule__Parameters__Group__0 )
            // InternalEventCalculus.g:554:2: rule__Parameters__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleParameters"


    // $ANTLR start "entryRuleExists"
    // InternalEventCalculus.g:566:1: entryRuleExists : ruleExists EOF ;
    public final void entryRuleExists() throws RecognitionException {
        try {
            // InternalEventCalculus.g:567:1: ( ruleExists EOF )
            // InternalEventCalculus.g:568:1: ruleExists EOF
            {
             before(grammarAccess.getExistsRule()); 
            pushFollow(FOLLOW_1);
            ruleExists();

            state._fsp--;

             after(grammarAccess.getExistsRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExists"


    // $ANTLR start "ruleExists"
    // InternalEventCalculus.g:575:1: ruleExists : ( ( rule__Exists__Group__0 ) ) ;
    public final void ruleExists() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:579:2: ( ( ( rule__Exists__Group__0 ) ) )
            // InternalEventCalculus.g:580:1: ( ( rule__Exists__Group__0 ) )
            {
            // InternalEventCalculus.g:580:1: ( ( rule__Exists__Group__0 ) )
            // InternalEventCalculus.g:581:1: ( rule__Exists__Group__0 )
            {
             before(grammarAccess.getExistsAccess().getGroup()); 
            // InternalEventCalculus.g:582:1: ( rule__Exists__Group__0 )
            // InternalEventCalculus.g:582:2: rule__Exists__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exists__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleExists"


    // $ANTLR start "entryRuleForall"
    // InternalEventCalculus.g:594:1: entryRuleForall : ruleForall EOF ;
    public final void entryRuleForall() throws RecognitionException {
        try {
            // InternalEventCalculus.g:595:1: ( ruleForall EOF )
            // InternalEventCalculus.g:596:1: ruleForall EOF
            {
             before(grammarAccess.getForallRule()); 
            pushFollow(FOLLOW_1);
            ruleForall();

            state._fsp--;

             after(grammarAccess.getForallRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleForall"


    // $ANTLR start "ruleForall"
    // InternalEventCalculus.g:603:1: ruleForall : ( ( rule__Forall__Group__0 ) ) ;
    public final void ruleForall() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:607:2: ( ( ( rule__Forall__Group__0 ) ) )
            // InternalEventCalculus.g:608:1: ( ( rule__Forall__Group__0 ) )
            {
            // InternalEventCalculus.g:608:1: ( ( rule__Forall__Group__0 ) )
            // InternalEventCalculus.g:609:1: ( rule__Forall__Group__0 )
            {
             before(grammarAccess.getForallAccess().getGroup()); 
            // InternalEventCalculus.g:610:1: ( rule__Forall__Group__0 )
            // InternalEventCalculus.g:610:2: rule__Forall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Forall__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleForall"


    // $ANTLR start "entryRuleAssignmentOp"
    // InternalEventCalculus.g:622:1: entryRuleAssignmentOp : ruleAssignmentOp EOF ;
    public final void entryRuleAssignmentOp() throws RecognitionException {
        try {
            // InternalEventCalculus.g:623:1: ( ruleAssignmentOp EOF )
            // InternalEventCalculus.g:624:1: ruleAssignmentOp EOF
            {
             before(grammarAccess.getAssignmentOpRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignmentOp();

            state._fsp--;

             after(grammarAccess.getAssignmentOpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAssignmentOp"


    // $ANTLR start "ruleAssignmentOp"
    // InternalEventCalculus.g:631:1: ruleAssignmentOp : ( ( rule__AssignmentOp__Group__0 ) ) ;
    public final void ruleAssignmentOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:635:2: ( ( ( rule__AssignmentOp__Group__0 ) ) )
            // InternalEventCalculus.g:636:1: ( ( rule__AssignmentOp__Group__0 ) )
            {
            // InternalEventCalculus.g:636:1: ( ( rule__AssignmentOp__Group__0 ) )
            // InternalEventCalculus.g:637:1: ( rule__AssignmentOp__Group__0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup()); 
            // InternalEventCalculus.g:638:1: ( rule__AssignmentOp__Group__0 )
            // InternalEventCalculus.g:638:2: rule__AssignmentOp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleAssignmentOp"


    // $ANTLR start "entryRuleOrExp"
    // InternalEventCalculus.g:650:1: entryRuleOrExp : ruleOrExp EOF ;
    public final void entryRuleOrExp() throws RecognitionException {
        try {
            // InternalEventCalculus.g:651:1: ( ruleOrExp EOF )
            // InternalEventCalculus.g:652:1: ruleOrExp EOF
            {
             before(grammarAccess.getOrExpRule()); 
            pushFollow(FOLLOW_1);
            ruleOrExp();

            state._fsp--;

             after(grammarAccess.getOrExpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleOrExp"


    // $ANTLR start "ruleOrExp"
    // InternalEventCalculus.g:659:1: ruleOrExp : ( ( rule__OrExp__Group__0 ) ) ;
    public final void ruleOrExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:663:2: ( ( ( rule__OrExp__Group__0 ) ) )
            // InternalEventCalculus.g:664:1: ( ( rule__OrExp__Group__0 ) )
            {
            // InternalEventCalculus.g:664:1: ( ( rule__OrExp__Group__0 ) )
            // InternalEventCalculus.g:665:1: ( rule__OrExp__Group__0 )
            {
             before(grammarAccess.getOrExpAccess().getGroup()); 
            // InternalEventCalculus.g:666:1: ( rule__OrExp__Group__0 )
            // InternalEventCalculus.g:666:2: rule__OrExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrExp__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleOrExp"


    // $ANTLR start "entryRuleAndExp"
    // InternalEventCalculus.g:678:1: entryRuleAndExp : ruleAndExp EOF ;
    public final void entryRuleAndExp() throws RecognitionException {
        try {
            // InternalEventCalculus.g:679:1: ( ruleAndExp EOF )
            // InternalEventCalculus.g:680:1: ruleAndExp EOF
            {
             before(grammarAccess.getAndExpRule()); 
            pushFollow(FOLLOW_1);
            ruleAndExp();

            state._fsp--;

             after(grammarAccess.getAndExpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAndExp"


    // $ANTLR start "ruleAndExp"
    // InternalEventCalculus.g:687:1: ruleAndExp : ( ( rule__AndExp__Group__0 ) ) ;
    public final void ruleAndExp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:691:2: ( ( ( rule__AndExp__Group__0 ) ) )
            // InternalEventCalculus.g:692:1: ( ( rule__AndExp__Group__0 ) )
            {
            // InternalEventCalculus.g:692:1: ( ( rule__AndExp__Group__0 ) )
            // InternalEventCalculus.g:693:1: ( rule__AndExp__Group__0 )
            {
             before(grammarAccess.getAndExpAccess().getGroup()); 
            // InternalEventCalculus.g:694:1: ( rule__AndExp__Group__0 )
            // InternalEventCalculus.g:694:2: rule__AndExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AndExp__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleAndExp"


    // $ANTLR start "entryRuleRelational"
    // InternalEventCalculus.g:706:1: entryRuleRelational : ruleRelational EOF ;
    public final void entryRuleRelational() throws RecognitionException {
        try {
            // InternalEventCalculus.g:707:1: ( ruleRelational EOF )
            // InternalEventCalculus.g:708:1: ruleRelational EOF
            {
             before(grammarAccess.getRelationalRule()); 
            pushFollow(FOLLOW_1);
            ruleRelational();

            state._fsp--;

             after(grammarAccess.getRelationalRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelational"


    // $ANTLR start "ruleRelational"
    // InternalEventCalculus.g:715:1: ruleRelational : ( ( rule__Relational__Group__0 ) ) ;
    public final void ruleRelational() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:719:2: ( ( ( rule__Relational__Group__0 ) ) )
            // InternalEventCalculus.g:720:1: ( ( rule__Relational__Group__0 ) )
            {
            // InternalEventCalculus.g:720:1: ( ( rule__Relational__Group__0 ) )
            // InternalEventCalculus.g:721:1: ( rule__Relational__Group__0 )
            {
             before(grammarAccess.getRelationalAccess().getGroup()); 
            // InternalEventCalculus.g:722:1: ( rule__Relational__Group__0 )
            // InternalEventCalculus.g:722:2: rule__Relational__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleRelational"


    // $ANTLR start "entryRuleAddition"
    // InternalEventCalculus.g:734:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalEventCalculus.g:735:1: ( ruleAddition EOF )
            // InternalEventCalculus.g:736:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalEventCalculus.g:743:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:747:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalEventCalculus.g:748:1: ( ( rule__Addition__Group__0 ) )
            {
            // InternalEventCalculus.g:748:1: ( ( rule__Addition__Group__0 ) )
            // InternalEventCalculus.g:749:1: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalEventCalculus.g:750:1: ( rule__Addition__Group__0 )
            // InternalEventCalculus.g:750:2: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalEventCalculus.g:762:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalEventCalculus.g:763:1: ( ruleMultiplication EOF )
            // InternalEventCalculus.g:764:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalEventCalculus.g:771:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:775:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalEventCalculus.g:776:1: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalEventCalculus.g:776:1: ( ( rule__Multiplication__Group__0 ) )
            // InternalEventCalculus.g:777:1: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalEventCalculus.g:778:1: ( rule__Multiplication__Group__0 )
            // InternalEventCalculus.g:778:2: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePower"
    // InternalEventCalculus.g:790:1: entryRulePower : rulePower EOF ;
    public final void entryRulePower() throws RecognitionException {
        try {
            // InternalEventCalculus.g:791:1: ( rulePower EOF )
            // InternalEventCalculus.g:792:1: rulePower EOF
            {
             before(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_1);
            rulePower();

            state._fsp--;

             after(grammarAccess.getPowerRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalEventCalculus.g:799:1: rulePower : ( ( rule__Power__Group__0 ) ) ;
    public final void rulePower() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:803:2: ( ( ( rule__Power__Group__0 ) ) )
            // InternalEventCalculus.g:804:1: ( ( rule__Power__Group__0 ) )
            {
            // InternalEventCalculus.g:804:1: ( ( rule__Power__Group__0 ) )
            // InternalEventCalculus.g:805:1: ( rule__Power__Group__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup()); 
            // InternalEventCalculus.g:806:1: ( rule__Power__Group__0 )
            // InternalEventCalculus.g:806:2: rule__Power__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group__0();

            state._fsp--;


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
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRuleUnaryExpr"
    // InternalEventCalculus.g:818:1: entryRuleUnaryExpr : ruleUnaryExpr EOF ;
    public final void entryRuleUnaryExpr() throws RecognitionException {
        try {
            // InternalEventCalculus.g:819:1: ( ruleUnaryExpr EOF )
            // InternalEventCalculus.g:820:1: ruleUnaryExpr EOF
            {
             before(grammarAccess.getUnaryExprRule()); 
            pushFollow(FOLLOW_1);
            ruleUnaryExpr();

            state._fsp--;

             after(grammarAccess.getUnaryExprRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUnaryExpr"


    // $ANTLR start "ruleUnaryExpr"
    // InternalEventCalculus.g:827:1: ruleUnaryExpr : ( ( rule__UnaryExpr__Group__0 ) ) ;
    public final void ruleUnaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:831:2: ( ( ( rule__UnaryExpr__Group__0 ) ) )
            // InternalEventCalculus.g:832:1: ( ( rule__UnaryExpr__Group__0 ) )
            {
            // InternalEventCalculus.g:832:1: ( ( rule__UnaryExpr__Group__0 ) )
            // InternalEventCalculus.g:833:1: ( rule__UnaryExpr__Group__0 )
            {
             before(grammarAccess.getUnaryExprAccess().getGroup()); 
            // InternalEventCalculus.g:834:1: ( rule__UnaryExpr__Group__0 )
            // InternalEventCalculus.g:834:2: rule__UnaryExpr__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleUnaryExpr"


    // $ANTLR start "entryRulePrePrimaryExpr"
    // InternalEventCalculus.g:846:1: entryRulePrePrimaryExpr : rulePrePrimaryExpr EOF ;
    public final void entryRulePrePrimaryExpr() throws RecognitionException {
        try {
            // InternalEventCalculus.g:847:1: ( rulePrePrimaryExpr EOF )
            // InternalEventCalculus.g:848:1: rulePrePrimaryExpr EOF
            {
             before(grammarAccess.getPrePrimaryExprRule()); 
            pushFollow(FOLLOW_1);
            rulePrePrimaryExpr();

            state._fsp--;

             after(grammarAccess.getPrePrimaryExprRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrePrimaryExpr"


    // $ANTLR start "rulePrePrimaryExpr"
    // InternalEventCalculus.g:855:1: rulePrePrimaryExpr : ( ( rule__PrePrimaryExpr__Alternatives ) ) ;
    public final void rulePrePrimaryExpr() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:859:2: ( ( ( rule__PrePrimaryExpr__Alternatives ) ) )
            // InternalEventCalculus.g:860:1: ( ( rule__PrePrimaryExpr__Alternatives ) )
            {
            // InternalEventCalculus.g:860:1: ( ( rule__PrePrimaryExpr__Alternatives ) )
            // InternalEventCalculus.g:861:1: ( rule__PrePrimaryExpr__Alternatives )
            {
             before(grammarAccess.getPrePrimaryExprAccess().getAlternatives()); 
            // InternalEventCalculus.g:862:1: ( rule__PrePrimaryExpr__Alternatives )
            // InternalEventCalculus.g:862:2: rule__PrePrimaryExpr__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrePrimaryExpr__Alternatives();

            state._fsp--;


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
    // $ANTLR end "rulePrePrimaryExpr"


    // $ANTLR start "entryRuleAbstractRef"
    // InternalEventCalculus.g:874:1: entryRuleAbstractRef : ruleAbstractRef EOF ;
    public final void entryRuleAbstractRef() throws RecognitionException {
        try {
            // InternalEventCalculus.g:875:1: ( ruleAbstractRef EOF )
            // InternalEventCalculus.g:876:1: ruleAbstractRef EOF
            {
             before(grammarAccess.getAbstractRefRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractRef();

            state._fsp--;

             after(grammarAccess.getAbstractRefRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractRef"


    // $ANTLR start "ruleAbstractRef"
    // InternalEventCalculus.g:883:1: ruleAbstractRef : ( ( rule__AbstractRef__Group__0 ) ) ;
    public final void ruleAbstractRef() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:887:2: ( ( ( rule__AbstractRef__Group__0 ) ) )
            // InternalEventCalculus.g:888:1: ( ( rule__AbstractRef__Group__0 ) )
            {
            // InternalEventCalculus.g:888:1: ( ( rule__AbstractRef__Group__0 ) )
            // InternalEventCalculus.g:889:1: ( rule__AbstractRef__Group__0 )
            {
             before(grammarAccess.getAbstractRefAccess().getGroup()); 
            // InternalEventCalculus.g:890:1: ( rule__AbstractRef__Group__0 )
            // InternalEventCalculus.g:890:2: rule__AbstractRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group__0();

            state._fsp--;


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
    // $ANTLR end "ruleAbstractRef"


    // $ANTLR start "entryRuleTerminalExpression"
    // InternalEventCalculus.g:902:1: entryRuleTerminalExpression : ruleTerminalExpression EOF ;
    public final void entryRuleTerminalExpression() throws RecognitionException {
        try {
            // InternalEventCalculus.g:903:1: ( ruleTerminalExpression EOF )
            // InternalEventCalculus.g:904:1: ruleTerminalExpression EOF
            {
             before(grammarAccess.getTerminalExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleTerminalExpression();

            state._fsp--;

             after(grammarAccess.getTerminalExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTerminalExpression"


    // $ANTLR start "ruleTerminalExpression"
    // InternalEventCalculus.g:911:1: ruleTerminalExpression : ( ( rule__TerminalExpression__Alternatives ) ) ;
    public final void ruleTerminalExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:915:2: ( ( ( rule__TerminalExpression__Alternatives ) ) )
            // InternalEventCalculus.g:916:1: ( ( rule__TerminalExpression__Alternatives ) )
            {
            // InternalEventCalculus.g:916:1: ( ( rule__TerminalExpression__Alternatives ) )
            // InternalEventCalculus.g:917:1: ( rule__TerminalExpression__Alternatives )
            {
             before(grammarAccess.getTerminalExpressionAccess().getAlternatives()); 
            // InternalEventCalculus.g:918:1: ( rule__TerminalExpression__Alternatives )
            // InternalEventCalculus.g:918:2: rule__TerminalExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleTerminalExpression"


    // $ANTLR start "ruleANNOTATION_TYPE"
    // InternalEventCalculus.g:933:1: ruleANNOTATION_TYPE : ( ( rule__ANNOTATION_TYPE__Alternatives ) ) ;
    public final void ruleANNOTATION_TYPE() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:937:1: ( ( ( rule__ANNOTATION_TYPE__Alternatives ) ) )
            // InternalEventCalculus.g:938:1: ( ( rule__ANNOTATION_TYPE__Alternatives ) )
            {
            // InternalEventCalculus.g:938:1: ( ( rule__ANNOTATION_TYPE__Alternatives ) )
            // InternalEventCalculus.g:939:1: ( rule__ANNOTATION_TYPE__Alternatives )
            {
             before(grammarAccess.getANNOTATION_TYPEAccess().getAlternatives()); 
            // InternalEventCalculus.g:940:1: ( rule__ANNOTATION_TYPE__Alternatives )
            // InternalEventCalculus.g:940:2: rule__ANNOTATION_TYPE__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ANNOTATION_TYPE__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleANNOTATION_TYPE"


    // $ANTLR start "ruleLabelType"
    // InternalEventCalculus.g:952:1: ruleLabelType : ( ( rule__LabelType__Alternatives ) ) ;
    public final void ruleLabelType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:956:1: ( ( ( rule__LabelType__Alternatives ) ) )
            // InternalEventCalculus.g:957:1: ( ( rule__LabelType__Alternatives ) )
            {
            // InternalEventCalculus.g:957:1: ( ( rule__LabelType__Alternatives ) )
            // InternalEventCalculus.g:958:1: ( rule__LabelType__Alternatives )
            {
             before(grammarAccess.getLabelTypeAccess().getAlternatives()); 
            // InternalEventCalculus.g:959:1: ( rule__LabelType__Alternatives )
            // InternalEventCalculus.g:959:2: rule__LabelType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LabelType__Alternatives();

            state._fsp--;


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
    // $ANTLR end "ruleLabelType"


    // $ANTLR start "ruleUnaryOp"
    // InternalEventCalculus.g:971:1: ruleUnaryOp : ( ( '!' ) ) ;
    public final void ruleUnaryOp() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:975:1: ( ( ( '!' ) ) )
            // InternalEventCalculus.g:976:1: ( ( '!' ) )
            {
            // InternalEventCalculus.g:976:1: ( ( '!' ) )
            // InternalEventCalculus.g:977:1: ( '!' )
            {
             before(grammarAccess.getUnaryOpAccess().getNOTEnumLiteralDeclaration()); 
            // InternalEventCalculus.g:978:1: ( '!' )
            // InternalEventCalculus.g:978:3: '!'
            {
            match(input,12,FOLLOW_2); 

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
    // $ANTLR end "ruleUnaryOp"


    // $ANTLR start "rule__Model__Alternatives_1"
    // InternalEventCalculus.g:990:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:994:1: ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalEventCalculus.g:995:1: ( ( rule__Model__DeclarationsAssignment_1_0 ) )
                    {
                    // InternalEventCalculus.g:995:1: ( ( rule__Model__DeclarationsAssignment_1_0 ) )
                    // InternalEventCalculus.g:996:1: ( rule__Model__DeclarationsAssignment_1_0 )
                    {
                     before(grammarAccess.getModelAccess().getDeclarationsAssignment_1_0()); 
                    // InternalEventCalculus.g:997:1: ( rule__Model__DeclarationsAssignment_1_0 )
                    // InternalEventCalculus.g:997:2: rule__Model__DeclarationsAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__DeclarationsAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDeclarationsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1001:6: ( ( rule__Model__StatementsAssignment_1_1 ) )
                    {
                    // InternalEventCalculus.g:1001:6: ( ( rule__Model__StatementsAssignment_1_1 ) )
                    // InternalEventCalculus.g:1002:1: ( rule__Model__StatementsAssignment_1_1 )
                    {
                     before(grammarAccess.getModelAccess().getStatementsAssignment_1_1()); 
                    // InternalEventCalculus.g:1003:1: ( rule__Model__StatementsAssignment_1_1 )
                    // InternalEventCalculus.g:1003:2: rule__Model__StatementsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__StatementsAssignment_1_1();

                    state._fsp--;


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
    // $ANTLR end "rule__Model__Alternatives_1"


    // $ANTLR start "rule__Annotation__Alternatives_3"
    // InternalEventCalculus.g:1012:1: rule__Annotation__Alternatives_3 : ( ( ( rule__Annotation__ValueAssignment_3_0 ) ) | ( ( rule__Annotation__ValueAssignment_3_1 ) ) );
    public final void rule__Annotation__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1016:1: ( ( ( rule__Annotation__ValueAssignment_3_0 ) ) | ( ( rule__Annotation__ValueAssignment_3_1 ) ) )
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
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEventCalculus.g:1017:1: ( ( rule__Annotation__ValueAssignment_3_0 ) )
                    {
                    // InternalEventCalculus.g:1017:1: ( ( rule__Annotation__ValueAssignment_3_0 ) )
                    // InternalEventCalculus.g:1018:1: ( rule__Annotation__ValueAssignment_3_0 )
                    {
                     before(grammarAccess.getAnnotationAccess().getValueAssignment_3_0()); 
                    // InternalEventCalculus.g:1019:1: ( rule__Annotation__ValueAssignment_3_0 )
                    // InternalEventCalculus.g:1019:2: rule__Annotation__ValueAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__ValueAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAnnotationAccess().getValueAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1023:6: ( ( rule__Annotation__ValueAssignment_3_1 ) )
                    {
                    // InternalEventCalculus.g:1023:6: ( ( rule__Annotation__ValueAssignment_3_1 ) )
                    // InternalEventCalculus.g:1024:1: ( rule__Annotation__ValueAssignment_3_1 )
                    {
                     before(grammarAccess.getAnnotationAccess().getValueAssignment_3_1()); 
                    // InternalEventCalculus.g:1025:1: ( rule__Annotation__ValueAssignment_3_1 )
                    // InternalEventCalculus.g:1025:2: rule__Annotation__ValueAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__ValueAssignment_3_1();

                    state._fsp--;


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
    // $ANTLR end "rule__Annotation__Alternatives_3"


    // $ANTLR start "rule__Declaration__Alternatives"
    // InternalEventCalculus.g:1034:1: rule__Declaration__Alternatives : ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) | ( ruleDefXor ) | ( ruleDefMutex ) );
    public final void rule__Declaration__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1038:1: ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) | ( ruleDefXor ) | ( ruleDefMutex ) )
            int alt3=7;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalEventCalculus.g:1039:1: ( ruleDefSort )
                    {
                    // InternalEventCalculus.g:1039:1: ( ruleDefSort )
                    // InternalEventCalculus.g:1040:1: ruleDefSort
                    {
                     before(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefSort();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefSortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1045:6: ( ruleDefRange )
                    {
                    // InternalEventCalculus.g:1045:6: ( ruleDefRange )
                    // InternalEventCalculus.g:1046:1: ruleDefRange
                    {
                     before(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefRange();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefRangeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEventCalculus.g:1051:6: ( ruleDefOption )
                    {
                    // InternalEventCalculus.g:1051:6: ( ruleDefOption )
                    // InternalEventCalculus.g:1052:1: ruleDefOption
                    {
                     before(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDefOption();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefOptionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEventCalculus.g:1057:6: ( ruleDefCompletion )
                    {
                    // InternalEventCalculus.g:1057:6: ( ruleDefCompletion )
                    // InternalEventCalculus.g:1058:1: ruleDefCompletion
                    {
                     before(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDefCompletion();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefCompletionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEventCalculus.g:1063:6: ( ruleDefNonInertia )
                    {
                    // InternalEventCalculus.g:1063:6: ( ruleDefNonInertia )
                    // InternalEventCalculus.g:1064:1: ruleDefNonInertia
                    {
                     before(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleDefNonInertia();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefNonInertiaParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEventCalculus.g:1069:6: ( ruleDefXor )
                    {
                    // InternalEventCalculus.g:1069:6: ( ruleDefXor )
                    // InternalEventCalculus.g:1070:1: ruleDefXor
                    {
                     before(grammarAccess.getDeclarationAccess().getDefXorParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleDefXor();

                    state._fsp--;

                     after(grammarAccess.getDeclarationAccess().getDefXorParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEventCalculus.g:1075:6: ( ruleDefMutex )
                    {
                    // InternalEventCalculus.g:1075:6: ( ruleDefMutex )
                    // InternalEventCalculus.g:1076:1: ruleDefMutex
                    {
                     before(grammarAccess.getDeclarationAccess().getDefMutexParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleDefMutex();

                    state._fsp--;

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
    // $ANTLR end "rule__Declaration__Alternatives"


    // $ANTLR start "rule__DefOption__Alternatives_1"
    // InternalEventCalculus.g:1087:1: rule__DefOption__Alternatives_1 : ( ( ( rule__DefOption__Group_1_0__0 ) ) | ( ( rule__DefOption__Group_1_1__0 ) ) );
    public final void rule__DefOption__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1091:1: ( ( ( rule__DefOption__Group_1_0__0 ) ) | ( ( rule__DefOption__Group_1_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==RULE_ID) ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2==RULE_ID) ) {
                        alt4=2;
                    }
                    else if ( (LA4_2==RULE_INT) ) {
                        alt4=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEventCalculus.g:1092:1: ( ( rule__DefOption__Group_1_0__0 ) )
                    {
                    // InternalEventCalculus.g:1092:1: ( ( rule__DefOption__Group_1_0__0 ) )
                    // InternalEventCalculus.g:1093:1: ( rule__DefOption__Group_1_0__0 )
                    {
                     before(grammarAccess.getDefOptionAccess().getGroup_1_0()); 
                    // InternalEventCalculus.g:1094:1: ( rule__DefOption__Group_1_0__0 )
                    // InternalEventCalculus.g:1094:2: rule__DefOption__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefOption__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefOptionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1098:6: ( ( rule__DefOption__Group_1_1__0 ) )
                    {
                    // InternalEventCalculus.g:1098:6: ( ( rule__DefOption__Group_1_1__0 ) )
                    // InternalEventCalculus.g:1099:1: ( rule__DefOption__Group_1_1__0 )
                    {
                     before(grammarAccess.getDefOptionAccess().getGroup_1_1()); 
                    // InternalEventCalculus.g:1100:1: ( rule__DefOption__Group_1_1__0 )
                    // InternalEventCalculus.g:1100:2: rule__DefOption__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefOption__Group_1_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__DefOption__Alternatives_1"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalEventCalculus.g:1109:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ruleLabeledExpression ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1113:1: ( ( ruleSortDefinition ) | ( ruleLabeledExpression ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalEventCalculus.g:1114:1: ( ruleSortDefinition )
                    {
                    // InternalEventCalculus.g:1114:1: ( ruleSortDefinition )
                    // InternalEventCalculus.g:1115:1: ruleSortDefinition
                    {
                     before(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSortDefinition();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSortDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1120:6: ( ruleLabeledExpression )
                    {
                    // InternalEventCalculus.g:1120:6: ( ruleLabeledExpression )
                    // InternalEventCalculus.g:1121:1: ruleLabeledExpression
                    {
                     before(grammarAccess.getStatementAccess().getLabeledExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLabeledExpression();

                    state._fsp--;

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalEventCalculus.g:1131:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ExprAssignment_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1135:1: ( ( ( rule__Expression__ExprAssignment_0 ) ) | ( ( rule__Expression__Group_1__0 ) ) )
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
                        new NoViableAltException("", 6, 1, input);

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
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEventCalculus.g:1136:1: ( ( rule__Expression__ExprAssignment_0 ) )
                    {
                    // InternalEventCalculus.g:1136:1: ( ( rule__Expression__ExprAssignment_0 ) )
                    // InternalEventCalculus.g:1137:1: ( rule__Expression__ExprAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getExprAssignment_0()); 
                    // InternalEventCalculus.g:1138:1: ( rule__Expression__ExprAssignment_0 )
                    // InternalEventCalculus.g:1138:2: rule__Expression__ExprAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ExprAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getExprAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1142:6: ( ( rule__Expression__Group_1__0 ) )
                    {
                    // InternalEventCalculus.g:1142:6: ( ( rule__Expression__Group_1__0 ) )
                    // InternalEventCalculus.g:1143:1: ( rule__Expression__Group_1__0 )
                    {
                     before(grammarAccess.getExpressionAccess().getGroup_1()); 
                    // InternalEventCalculus.g:1144:1: ( rule__Expression__Group_1__0 )
                    // InternalEventCalculus.g:1144:2: rule__Expression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__Group_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Qualifier__Alternatives"
    // InternalEventCalculus.g:1153:1: rule__Qualifier__Alternatives : ( ( ruleExists ) | ( ruleForall ) );
    public final void rule__Qualifier__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1157:1: ( ( ruleExists ) | ( ruleForall ) )
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
                        new NoViableAltException("", 7, 1, input);

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
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEventCalculus.g:1158:1: ( ruleExists )
                    {
                    // InternalEventCalculus.g:1158:1: ( ruleExists )
                    // InternalEventCalculus.g:1159:1: ruleExists
                    {
                     before(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExists();

                    state._fsp--;

                     after(grammarAccess.getQualifierAccess().getExistsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1164:6: ( ruleForall )
                    {
                    // InternalEventCalculus.g:1164:6: ( ruleForall )
                    // InternalEventCalculus.g:1165:1: ruleForall
                    {
                     before(grammarAccess.getQualifierAccess().getForallParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleForall();

                    state._fsp--;

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
    // $ANTLR end "rule__Qualifier__Alternatives"


    // $ANTLR start "rule__AssignmentOp__Alternatives_1_0"
    // InternalEventCalculus.g:1175:1: rule__AssignmentOp__Alternatives_1_0 : ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) );
    public final void rule__AssignmentOp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1179:1: ( ( ( rule__AssignmentOp__Group_1_0_0__0 ) ) | ( ( rule__AssignmentOp__Group_1_0_1__0 ) ) )
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
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEventCalculus.g:1180:1: ( ( rule__AssignmentOp__Group_1_0_0__0 ) )
                    {
                    // InternalEventCalculus.g:1180:1: ( ( rule__AssignmentOp__Group_1_0_0__0 ) )
                    // InternalEventCalculus.g:1181:1: ( rule__AssignmentOp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0()); 
                    // InternalEventCalculus.g:1182:1: ( rule__AssignmentOp__Group_1_0_0__0 )
                    // InternalEventCalculus.g:1182:2: rule__AssignmentOp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssignmentOp__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentOpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1186:6: ( ( rule__AssignmentOp__Group_1_0_1__0 ) )
                    {
                    // InternalEventCalculus.g:1186:6: ( ( rule__AssignmentOp__Group_1_0_1__0 ) )
                    // InternalEventCalculus.g:1187:1: ( rule__AssignmentOp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAssignmentOpAccess().getGroup_1_0_1()); 
                    // InternalEventCalculus.g:1188:1: ( rule__AssignmentOp__Group_1_0_1__0 )
                    // InternalEventCalculus.g:1188:2: rule__AssignmentOp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssignmentOp__Group_1_0_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__AssignmentOp__Alternatives_1_0"


    // $ANTLR start "rule__Relational__Alternatives_1_0"
    // InternalEventCalculus.g:1197:1: rule__Relational__Alternatives_1_0 : ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) );
    public final void rule__Relational__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1201:1: ( ( ( rule__Relational__Group_1_0_0__0 ) ) | ( ( rule__Relational__Group_1_0_1__0 ) ) | ( ( rule__Relational__Group_1_0_2__0 ) ) | ( ( rule__Relational__Group_1_0_3__0 ) ) | ( ( rule__Relational__Group_1_0_4__0 ) ) | ( ( rule__Relational__Group_1_0_5__0 ) ) | ( ( rule__Relational__Group_1_0_6__0 ) ) )
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
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEventCalculus.g:1202:1: ( ( rule__Relational__Group_1_0_0__0 ) )
                    {
                    // InternalEventCalculus.g:1202:1: ( ( rule__Relational__Group_1_0_0__0 ) )
                    // InternalEventCalculus.g:1203:1: ( rule__Relational__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_0()); 
                    // InternalEventCalculus.g:1204:1: ( rule__Relational__Group_1_0_0__0 )
                    // InternalEventCalculus.g:1204:2: rule__Relational__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relational__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1208:6: ( ( rule__Relational__Group_1_0_1__0 ) )
                    {
                    // InternalEventCalculus.g:1208:6: ( ( rule__Relational__Group_1_0_1__0 ) )
                    // InternalEventCalculus.g:1209:1: ( rule__Relational__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_1()); 
                    // InternalEventCalculus.g:1210:1: ( rule__Relational__Group_1_0_1__0 )
                    // InternalEventCalculus.g:1210:2: rule__Relational__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relational__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEventCalculus.g:1214:6: ( ( rule__Relational__Group_1_0_2__0 ) )
                    {
                    // InternalEventCalculus.g:1214:6: ( ( rule__Relational__Group_1_0_2__0 ) )
                    // InternalEventCalculus.g:1215:1: ( rule__Relational__Group_1_0_2__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_2()); 
                    // InternalEventCalculus.g:1216:1: ( rule__Relational__Group_1_0_2__0 )
                    // InternalEventCalculus.g:1216:2: rule__Relational__Group_1_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relational__Group_1_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEventCalculus.g:1220:6: ( ( rule__Relational__Group_1_0_3__0 ) )
                    {
                    // InternalEventCalculus.g:1220:6: ( ( rule__Relational__Group_1_0_3__0 ) )
                    // InternalEventCalculus.g:1221:1: ( rule__Relational__Group_1_0_3__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_3()); 
                    // InternalEventCalculus.g:1222:1: ( rule__Relational__Group_1_0_3__0 )
                    // InternalEventCalculus.g:1222:2: rule__Relational__Group_1_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relational__Group_1_0_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEventCalculus.g:1226:6: ( ( rule__Relational__Group_1_0_4__0 ) )
                    {
                    // InternalEventCalculus.g:1226:6: ( ( rule__Relational__Group_1_0_4__0 ) )
                    // InternalEventCalculus.g:1227:1: ( rule__Relational__Group_1_0_4__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_4()); 
                    // InternalEventCalculus.g:1228:1: ( rule__Relational__Group_1_0_4__0 )
                    // InternalEventCalculus.g:1228:2: rule__Relational__Group_1_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relational__Group_1_0_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEventCalculus.g:1232:6: ( ( rule__Relational__Group_1_0_5__0 ) )
                    {
                    // InternalEventCalculus.g:1232:6: ( ( rule__Relational__Group_1_0_5__0 ) )
                    // InternalEventCalculus.g:1233:1: ( rule__Relational__Group_1_0_5__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_5()); 
                    // InternalEventCalculus.g:1234:1: ( rule__Relational__Group_1_0_5__0 )
                    // InternalEventCalculus.g:1234:2: rule__Relational__Group_1_0_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relational__Group_1_0_5__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRelationalAccess().getGroup_1_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalEventCalculus.g:1238:6: ( ( rule__Relational__Group_1_0_6__0 ) )
                    {
                    // InternalEventCalculus.g:1238:6: ( ( rule__Relational__Group_1_0_6__0 ) )
                    // InternalEventCalculus.g:1239:1: ( rule__Relational__Group_1_0_6__0 )
                    {
                     before(grammarAccess.getRelationalAccess().getGroup_1_0_6()); 
                    // InternalEventCalculus.g:1240:1: ( rule__Relational__Group_1_0_6__0 )
                    // InternalEventCalculus.g:1240:2: rule__Relational__Group_1_0_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relational__Group_1_0_6__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Relational__Alternatives_1_0"


    // $ANTLR start "rule__Addition__Alternatives_1_0"
    // InternalEventCalculus.g:1249:1: rule__Addition__Alternatives_1_0 : ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) );
    public final void rule__Addition__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1253:1: ( ( ( rule__Addition__Group_1_0_0__0 ) ) | ( ( rule__Addition__Group_1_0_1__0 ) ) )
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
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEventCalculus.g:1254:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    {
                    // InternalEventCalculus.g:1254:1: ( ( rule__Addition__Group_1_0_0__0 ) )
                    // InternalEventCalculus.g:1255:1: ( rule__Addition__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 
                    // InternalEventCalculus.g:1256:1: ( rule__Addition__Group_1_0_0__0 )
                    // InternalEventCalculus.g:1256:2: rule__Addition__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1260:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    {
                    // InternalEventCalculus.g:1260:6: ( ( rule__Addition__Group_1_0_1__0 ) )
                    // InternalEventCalculus.g:1261:1: ( rule__Addition__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0_1()); 
                    // InternalEventCalculus.g:1262:1: ( rule__Addition__Group_1_0_1__0 )
                    // InternalEventCalculus.g:1262:2: rule__Addition__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Addition__Alternatives_1_0"


    // $ANTLR start "rule__Multiplication__Alternatives_1_0"
    // InternalEventCalculus.g:1271:1: rule__Multiplication__Alternatives_1_0 : ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1275:1: ( ( ( rule__Multiplication__Group_1_0_0__0 ) ) | ( ( rule__Multiplication__Group_1_0_1__0 ) ) )
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
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalEventCalculus.g:1276:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    {
                    // InternalEventCalculus.g:1276:1: ( ( rule__Multiplication__Group_1_0_0__0 ) )
                    // InternalEventCalculus.g:1277:1: ( rule__Multiplication__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 
                    // InternalEventCalculus.g:1278:1: ( rule__Multiplication__Group_1_0_0__0 )
                    // InternalEventCalculus.g:1278:2: rule__Multiplication__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1282:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    {
                    // InternalEventCalculus.g:1282:6: ( ( rule__Multiplication__Group_1_0_1__0 ) )
                    // InternalEventCalculus.g:1283:1: ( rule__Multiplication__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0_1()); 
                    // InternalEventCalculus.g:1284:1: ( rule__Multiplication__Group_1_0_1__0 )
                    // InternalEventCalculus.g:1284:2: rule__Multiplication__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Multiplication__Alternatives_1_0"


    // $ANTLR start "rule__PrePrimaryExpr__Alternatives"
    // InternalEventCalculus.g:1293:1: rule__PrePrimaryExpr__Alternatives : ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) | ( ( rule__PrePrimaryExpr__Group_3__0 ) ) );
    public final void rule__PrePrimaryExpr__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1297:1: ( ( ruleTerminalExpression ) | ( ruleAbstractRef ) | ( ( rule__PrePrimaryExpr__Group_2__0 ) ) | ( ( rule__PrePrimaryExpr__Group_3__0 ) ) )
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
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalEventCalculus.g:1298:1: ( ruleTerminalExpression )
                    {
                    // InternalEventCalculus.g:1298:1: ( ruleTerminalExpression )
                    // InternalEventCalculus.g:1299:1: ruleTerminalExpression
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTerminalExpression();

                    state._fsp--;

                     after(grammarAccess.getPrePrimaryExprAccess().getTerminalExpressionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1304:6: ( ruleAbstractRef )
                    {
                    // InternalEventCalculus.g:1304:6: ( ruleAbstractRef )
                    // InternalEventCalculus.g:1305:1: ruleAbstractRef
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractRef();

                    state._fsp--;

                     after(grammarAccess.getPrePrimaryExprAccess().getAbstractRefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEventCalculus.g:1310:6: ( ( rule__PrePrimaryExpr__Group_2__0 ) )
                    {
                    // InternalEventCalculus.g:1310:6: ( ( rule__PrePrimaryExpr__Group_2__0 ) )
                    // InternalEventCalculus.g:1311:1: ( rule__PrePrimaryExpr__Group_2__0 )
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getGroup_2()); 
                    // InternalEventCalculus.g:1312:1: ( rule__PrePrimaryExpr__Group_2__0 )
                    // InternalEventCalculus.g:1312:2: rule__PrePrimaryExpr__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrePrimaryExpr__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrePrimaryExprAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEventCalculus.g:1316:6: ( ( rule__PrePrimaryExpr__Group_3__0 ) )
                    {
                    // InternalEventCalculus.g:1316:6: ( ( rule__PrePrimaryExpr__Group_3__0 ) )
                    // InternalEventCalculus.g:1317:1: ( rule__PrePrimaryExpr__Group_3__0 )
                    {
                     before(grammarAccess.getPrePrimaryExprAccess().getGroup_3()); 
                    // InternalEventCalculus.g:1318:1: ( rule__PrePrimaryExpr__Group_3__0 )
                    // InternalEventCalculus.g:1318:2: rule__PrePrimaryExpr__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrePrimaryExpr__Group_3__0();

                    state._fsp--;


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
    // $ANTLR end "rule__PrePrimaryExpr__Alternatives"


    // $ANTLR start "rule__TerminalExpression__Alternatives"
    // InternalEventCalculus.g:1327:1: rule__TerminalExpression__Alternatives : ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) );
    public final void rule__TerminalExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1331:1: ( ( ( rule__TerminalExpression__Group_0__0 ) ) | ( ( rule__TerminalExpression__Group_1__0 ) ) | ( ( rule__TerminalExpression__Group_2__0 ) ) )
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
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalEventCalculus.g:1332:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    {
                    // InternalEventCalculus.g:1332:1: ( ( rule__TerminalExpression__Group_0__0 ) )
                    // InternalEventCalculus.g:1333:1: ( rule__TerminalExpression__Group_0__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 
                    // InternalEventCalculus.g:1334:1: ( rule__TerminalExpression__Group_0__0 )
                    // InternalEventCalculus.g:1334:2: rule__TerminalExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1338:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    {
                    // InternalEventCalculus.g:1338:6: ( ( rule__TerminalExpression__Group_1__0 ) )
                    // InternalEventCalculus.g:1339:1: ( rule__TerminalExpression__Group_1__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 
                    // InternalEventCalculus.g:1340:1: ( rule__TerminalExpression__Group_1__0 )
                    // InternalEventCalculus.g:1340:2: rule__TerminalExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getTerminalExpressionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEventCalculus.g:1344:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    {
                    // InternalEventCalculus.g:1344:6: ( ( rule__TerminalExpression__Group_2__0 ) )
                    // InternalEventCalculus.g:1345:1: ( rule__TerminalExpression__Group_2__0 )
                    {
                     before(grammarAccess.getTerminalExpressionAccess().getGroup_2()); 
                    // InternalEventCalculus.g:1346:1: ( rule__TerminalExpression__Group_2__0 )
                    // InternalEventCalculus.g:1346:2: rule__TerminalExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TerminalExpression__Group_2__0();

                    state._fsp--;


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
    // $ANTLR end "rule__TerminalExpression__Alternatives"


    // $ANTLR start "rule__ANNOTATION_TYPE__Alternatives"
    // InternalEventCalculus.g:1355:1: rule__ANNOTATION_TYPE__Alternatives : ( ( ( 'generated' ) ) | ( ( 'author' ) ) );
    public final void rule__ANNOTATION_TYPE__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1359:1: ( ( ( 'generated' ) ) | ( ( 'author' ) ) )
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
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalEventCalculus.g:1360:1: ( ( 'generated' ) )
                    {
                    // InternalEventCalculus.g:1360:1: ( ( 'generated' ) )
                    // InternalEventCalculus.g:1361:1: ( 'generated' )
                    {
                     before(grammarAccess.getANNOTATION_TYPEAccess().getGEnumLiteralDeclaration_0()); 
                    // InternalEventCalculus.g:1362:1: ( 'generated' )
                    // InternalEventCalculus.g:1362:3: 'generated'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getANNOTATION_TYPEAccess().getGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1367:6: ( ( 'author' ) )
                    {
                    // InternalEventCalculus.g:1367:6: ( ( 'author' ) )
                    // InternalEventCalculus.g:1368:1: ( 'author' )
                    {
                     before(grammarAccess.getANNOTATION_TYPEAccess().getAEnumLiteralDeclaration_1()); 
                    // InternalEventCalculus.g:1369:1: ( 'author' )
                    // InternalEventCalculus.g:1369:3: 'author'
                    {
                    match(input,14,FOLLOW_2); 

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
    // $ANTLR end "rule__ANNOTATION_TYPE__Alternatives"


    // $ANTLR start "rule__LabelType__Alternatives"
    // InternalEventCalculus.g:1379:1: rule__LabelType__Alternatives : ( ( ( 'Theta' ) ) | ( ( 'Delta' ) ) );
    public final void rule__LabelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1383:1: ( ( ( 'Theta' ) ) | ( ( 'Delta' ) ) )
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
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEventCalculus.g:1384:1: ( ( 'Theta' ) )
                    {
                    // InternalEventCalculus.g:1384:1: ( ( 'Theta' ) )
                    // InternalEventCalculus.g:1385:1: ( 'Theta' )
                    {
                     before(grammarAccess.getLabelTypeAccess().getTEnumLiteralDeclaration_0()); 
                    // InternalEventCalculus.g:1386:1: ( 'Theta' )
                    // InternalEventCalculus.g:1386:3: 'Theta'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLabelTypeAccess().getTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEventCalculus.g:1391:6: ( ( 'Delta' ) )
                    {
                    // InternalEventCalculus.g:1391:6: ( ( 'Delta' ) )
                    // InternalEventCalculus.g:1392:1: ( 'Delta' )
                    {
                     before(grammarAccess.getLabelTypeAccess().getDEnumLiteralDeclaration_1()); 
                    // InternalEventCalculus.g:1393:1: ( 'Delta' )
                    // InternalEventCalculus.g:1393:3: 'Delta'
                    {
                    match(input,16,FOLLOW_2); 

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
    // $ANTLR end "rule__LabelType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalEventCalculus.g:1405:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1409:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalEventCalculus.g:1410:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalEventCalculus.g:1417:1: rule__Model__Group__0__Impl : ( ( rule__Model__ImportsAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1421:1: ( ( ( rule__Model__ImportsAssignment_0 )* ) )
            // InternalEventCalculus.g:1422:1: ( ( rule__Model__ImportsAssignment_0 )* )
            {
            // InternalEventCalculus.g:1422:1: ( ( rule__Model__ImportsAssignment_0 )* )
            // InternalEventCalculus.g:1423:1: ( rule__Model__ImportsAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getImportsAssignment_0()); 
            // InternalEventCalculus.g:1424:1: ( rule__Model__ImportsAssignment_0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==17) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEventCalculus.g:1424:2: rule__Model__ImportsAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__ImportsAssignment_0();

            	    state._fsp--;


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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalEventCalculus.g:1434:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1438:1: ( rule__Model__Group__1__Impl )
            // InternalEventCalculus.g:1439:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalEventCalculus.g:1445:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1449:1: ( ( ( rule__Model__Alternatives_1 )* ) )
            // InternalEventCalculus.g:1450:1: ( ( rule__Model__Alternatives_1 )* )
            {
            // InternalEventCalculus.g:1450:1: ( ( rule__Model__Alternatives_1 )* )
            // InternalEventCalculus.g:1451:1: ( rule__Model__Alternatives_1 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // InternalEventCalculus.g:1452:1: ( rule__Model__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_BOOLEAN)||LA17_0==12||(LA17_0>=15 && LA17_0<=16)||LA17_0==18||LA17_0==20||(LA17_0>=22 && LA17_0<=25)||(LA17_0>=27 && LA17_0<=28)||LA17_0==30||LA17_0==32||LA17_0==34||LA17_0==48||LA17_0==53) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEventCalculus.g:1452:2: rule__Model__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__Alternatives_1();

            	    state._fsp--;


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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalEventCalculus.g:1466:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1470:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalEventCalculus.g:1471:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalEventCalculus.g:1478:1: rule__Import__Group__0__Impl : ( 'load' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1482:1: ( ( 'load' ) )
            // InternalEventCalculus.g:1483:1: ( 'load' )
            {
            // InternalEventCalculus.g:1483:1: ( 'load' )
            // InternalEventCalculus.g:1484:1: 'load'
            {
             before(grammarAccess.getImportAccess().getLoadKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalEventCalculus.g:1497:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1501:1: ( rule__Import__Group__1__Impl )
            // InternalEventCalculus.g:1502:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalEventCalculus.g:1508:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1512:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalEventCalculus.g:1513:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalEventCalculus.g:1513:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalEventCalculus.g:1514:1: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalEventCalculus.g:1515:1: ( rule__Import__ImportURIAssignment_1 )
            // InternalEventCalculus.g:1515:2: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__0"
    // InternalEventCalculus.g:1529:1: rule__Annotation__Group__0 : rule__Annotation__Group__0__Impl rule__Annotation__Group__1 ;
    public final void rule__Annotation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1533:1: ( rule__Annotation__Group__0__Impl rule__Annotation__Group__1 )
            // InternalEventCalculus.g:1534:2: rule__Annotation__Group__0__Impl rule__Annotation__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Annotation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__0"


    // $ANTLR start "rule__Annotation__Group__0__Impl"
    // InternalEventCalculus.g:1541:1: rule__Annotation__Group__0__Impl : ( ';' ) ;
    public final void rule__Annotation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1545:1: ( ( ';' ) )
            // InternalEventCalculus.g:1546:1: ( ';' )
            {
            // InternalEventCalculus.g:1546:1: ( ';' )
            // InternalEventCalculus.g:1547:1: ';'
            {
             before(grammarAccess.getAnnotationAccess().getSemicolonKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // $ANTLR end "rule__Annotation__Group__0__Impl"


    // $ANTLR start "rule__Annotation__Group__1"
    // InternalEventCalculus.g:1560:1: rule__Annotation__Group__1 : rule__Annotation__Group__1__Impl rule__Annotation__Group__2 ;
    public final void rule__Annotation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1564:1: ( rule__Annotation__Group__1__Impl rule__Annotation__Group__2 )
            // InternalEventCalculus.g:1565:2: rule__Annotation__Group__1__Impl rule__Annotation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Annotation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__1"


    // $ANTLR start "rule__Annotation__Group__1__Impl"
    // InternalEventCalculus.g:1572:1: rule__Annotation__Group__1__Impl : ( '#' ) ;
    public final void rule__Annotation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1576:1: ( ( '#' ) )
            // InternalEventCalculus.g:1577:1: ( '#' )
            {
            // InternalEventCalculus.g:1577:1: ( '#' )
            // InternalEventCalculus.g:1578:1: '#'
            {
             before(grammarAccess.getAnnotationAccess().getNumberSignKeyword_1()); 
            match(input,19,FOLLOW_2); 
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
    // $ANTLR end "rule__Annotation__Group__1__Impl"


    // $ANTLR start "rule__Annotation__Group__2"
    // InternalEventCalculus.g:1591:1: rule__Annotation__Group__2 : rule__Annotation__Group__2__Impl rule__Annotation__Group__3 ;
    public final void rule__Annotation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1595:1: ( rule__Annotation__Group__2__Impl rule__Annotation__Group__3 )
            // InternalEventCalculus.g:1596:2: rule__Annotation__Group__2__Impl rule__Annotation__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Annotation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Annotation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__2"


    // $ANTLR start "rule__Annotation__Group__2__Impl"
    // InternalEventCalculus.g:1603:1: rule__Annotation__Group__2__Impl : ( ( rule__Annotation__TypeAssignment_2 ) ) ;
    public final void rule__Annotation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1607:1: ( ( ( rule__Annotation__TypeAssignment_2 ) ) )
            // InternalEventCalculus.g:1608:1: ( ( rule__Annotation__TypeAssignment_2 ) )
            {
            // InternalEventCalculus.g:1608:1: ( ( rule__Annotation__TypeAssignment_2 ) )
            // InternalEventCalculus.g:1609:1: ( rule__Annotation__TypeAssignment_2 )
            {
             before(grammarAccess.getAnnotationAccess().getTypeAssignment_2()); 
            // InternalEventCalculus.g:1610:1: ( rule__Annotation__TypeAssignment_2 )
            // InternalEventCalculus.g:1610:2: rule__Annotation__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__TypeAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__Annotation__Group__2__Impl"


    // $ANTLR start "rule__Annotation__Group__3"
    // InternalEventCalculus.g:1620:1: rule__Annotation__Group__3 : rule__Annotation__Group__3__Impl ;
    public final void rule__Annotation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1624:1: ( rule__Annotation__Group__3__Impl )
            // InternalEventCalculus.g:1625:2: rule__Annotation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Annotation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Annotation__Group__3"


    // $ANTLR start "rule__Annotation__Group__3__Impl"
    // InternalEventCalculus.g:1631:1: rule__Annotation__Group__3__Impl : ( ( rule__Annotation__Alternatives_3 )? ) ;
    public final void rule__Annotation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1635:1: ( ( ( rule__Annotation__Alternatives_3 )? ) )
            // InternalEventCalculus.g:1636:1: ( ( rule__Annotation__Alternatives_3 )? )
            {
            // InternalEventCalculus.g:1636:1: ( ( rule__Annotation__Alternatives_3 )? )
            // InternalEventCalculus.g:1637:1: ( rule__Annotation__Alternatives_3 )?
            {
             before(grammarAccess.getAnnotationAccess().getAlternatives_3()); 
            // InternalEventCalculus.g:1638:1: ( rule__Annotation__Alternatives_3 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||(LA18_1>=RULE_STRING && LA18_1<=RULE_BOOLEAN)||LA18_1==12||(LA18_1>=15 && LA18_1<=16)||LA18_1==18||LA18_1==20||(LA18_1>=22 && LA18_1<=25)||(LA18_1>=27 && LA18_1<=28)||LA18_1==30||LA18_1==32||LA18_1==34||LA18_1==53) ) {
                    alt18=1;
                }
                else if ( (LA18_1==48) ) {
                    int LA18_4 = input.LA(3);

                    if ( (LA18_4==RULE_INT) ) {
                        alt18=1;
                    }
                }
            }
            else if ( (LA18_0==52) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEventCalculus.g:1638:2: rule__Annotation__Alternatives_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Annotation__Alternatives_3();

                    state._fsp--;


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
    // $ANTLR end "rule__Annotation__Group__3__Impl"


    // $ANTLR start "rule__DefSort__Group__0"
    // InternalEventCalculus.g:1656:1: rule__DefSort__Group__0 : rule__DefSort__Group__0__Impl rule__DefSort__Group__1 ;
    public final void rule__DefSort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1660:1: ( rule__DefSort__Group__0__Impl rule__DefSort__Group__1 )
            // InternalEventCalculus.g:1661:2: rule__DefSort__Group__0__Impl rule__DefSort__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__DefSort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefSort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSort__Group__0"


    // $ANTLR start "rule__DefSort__Group__0__Impl"
    // InternalEventCalculus.g:1668:1: rule__DefSort__Group__0__Impl : ( ( rule__DefSort__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefSort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1672:1: ( ( ( rule__DefSort__AnnotationsAssignment_0 )* ) )
            // InternalEventCalculus.g:1673:1: ( ( rule__DefSort__AnnotationsAssignment_0 )* )
            {
            // InternalEventCalculus.g:1673:1: ( ( rule__DefSort__AnnotationsAssignment_0 )* )
            // InternalEventCalculus.g:1674:1: ( rule__DefSort__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefSortAccess().getAnnotationsAssignment_0()); 
            // InternalEventCalculus.g:1675:1: ( rule__DefSort__AnnotationsAssignment_0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==18) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEventCalculus.g:1675:2: rule__DefSort__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DefSort__AnnotationsAssignment_0();

            	    state._fsp--;


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
    // $ANTLR end "rule__DefSort__Group__0__Impl"


    // $ANTLR start "rule__DefSort__Group__1"
    // InternalEventCalculus.g:1685:1: rule__DefSort__Group__1 : rule__DefSort__Group__1__Impl rule__DefSort__Group__2 ;
    public final void rule__DefSort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1689:1: ( rule__DefSort__Group__1__Impl rule__DefSort__Group__2 )
            // InternalEventCalculus.g:1690:2: rule__DefSort__Group__1__Impl rule__DefSort__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__DefSort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefSort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSort__Group__1"


    // $ANTLR start "rule__DefSort__Group__1__Impl"
    // InternalEventCalculus.g:1697:1: rule__DefSort__Group__1__Impl : ( ( rule__DefSort__ReifiedAssignment_1 )? ) ;
    public final void rule__DefSort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1701:1: ( ( ( rule__DefSort__ReifiedAssignment_1 )? ) )
            // InternalEventCalculus.g:1702:1: ( ( rule__DefSort__ReifiedAssignment_1 )? )
            {
            // InternalEventCalculus.g:1702:1: ( ( rule__DefSort__ReifiedAssignment_1 )? )
            // InternalEventCalculus.g:1703:1: ( rule__DefSort__ReifiedAssignment_1 )?
            {
             before(grammarAccess.getDefSortAccess().getReifiedAssignment_1()); 
            // InternalEventCalculus.g:1704:1: ( rule__DefSort__ReifiedAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==53) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEventCalculus.g:1704:2: rule__DefSort__ReifiedAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefSort__ReifiedAssignment_1();

                    state._fsp--;


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
    // $ANTLR end "rule__DefSort__Group__1__Impl"


    // $ANTLR start "rule__DefSort__Group__2"
    // InternalEventCalculus.g:1714:1: rule__DefSort__Group__2 : rule__DefSort__Group__2__Impl rule__DefSort__Group__3 ;
    public final void rule__DefSort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1718:1: ( rule__DefSort__Group__2__Impl rule__DefSort__Group__3 )
            // InternalEventCalculus.g:1719:2: rule__DefSort__Group__2__Impl rule__DefSort__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__DefSort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefSort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSort__Group__2"


    // $ANTLR start "rule__DefSort__Group__2__Impl"
    // InternalEventCalculus.g:1726:1: rule__DefSort__Group__2__Impl : ( 'sort' ) ;
    public final void rule__DefSort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1730:1: ( ( 'sort' ) )
            // InternalEventCalculus.g:1731:1: ( 'sort' )
            {
            // InternalEventCalculus.g:1731:1: ( 'sort' )
            // InternalEventCalculus.g:1732:1: 'sort'
            {
             before(grammarAccess.getDefSortAccess().getSortKeyword_2()); 
            match(input,20,FOLLOW_2); 
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
    // $ANTLR end "rule__DefSort__Group__2__Impl"


    // $ANTLR start "rule__DefSort__Group__3"
    // InternalEventCalculus.g:1745:1: rule__DefSort__Group__3 : rule__DefSort__Group__3__Impl rule__DefSort__Group__4 ;
    public final void rule__DefSort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1749:1: ( rule__DefSort__Group__3__Impl rule__DefSort__Group__4 )
            // InternalEventCalculus.g:1750:2: rule__DefSort__Group__3__Impl rule__DefSort__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__DefSort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefSort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSort__Group__3"


    // $ANTLR start "rule__DefSort__Group__3__Impl"
    // InternalEventCalculus.g:1757:1: rule__DefSort__Group__3__Impl : ( ( rule__DefSort__NameAssignment_3 ) ) ;
    public final void rule__DefSort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1761:1: ( ( ( rule__DefSort__NameAssignment_3 ) ) )
            // InternalEventCalculus.g:1762:1: ( ( rule__DefSort__NameAssignment_3 ) )
            {
            // InternalEventCalculus.g:1762:1: ( ( rule__DefSort__NameAssignment_3 ) )
            // InternalEventCalculus.g:1763:1: ( rule__DefSort__NameAssignment_3 )
            {
             before(grammarAccess.getDefSortAccess().getNameAssignment_3()); 
            // InternalEventCalculus.g:1764:1: ( rule__DefSort__NameAssignment_3 )
            // InternalEventCalculus.g:1764:2: rule__DefSort__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DefSort__NameAssignment_3();

            state._fsp--;


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
    // $ANTLR end "rule__DefSort__Group__3__Impl"


    // $ANTLR start "rule__DefSort__Group__4"
    // InternalEventCalculus.g:1774:1: rule__DefSort__Group__4 : rule__DefSort__Group__4__Impl ;
    public final void rule__DefSort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1778:1: ( rule__DefSort__Group__4__Impl )
            // InternalEventCalculus.g:1779:2: rule__DefSort__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefSort__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSort__Group__4"


    // $ANTLR start "rule__DefSort__Group__4__Impl"
    // InternalEventCalculus.g:1785:1: rule__DefSort__Group__4__Impl : ( ( rule__DefSort__Group_4__0 )? ) ;
    public final void rule__DefSort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1789:1: ( ( ( rule__DefSort__Group_4__0 )? ) )
            // InternalEventCalculus.g:1790:1: ( ( rule__DefSort__Group_4__0 )? )
            {
            // InternalEventCalculus.g:1790:1: ( ( rule__DefSort__Group_4__0 )? )
            // InternalEventCalculus.g:1791:1: ( rule__DefSort__Group_4__0 )?
            {
             before(grammarAccess.getDefSortAccess().getGroup_4()); 
            // InternalEventCalculus.g:1792:1: ( rule__DefSort__Group_4__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEventCalculus.g:1792:2: rule__DefSort__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefSort__Group_4__0();

                    state._fsp--;


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
    // $ANTLR end "rule__DefSort__Group__4__Impl"


    // $ANTLR start "rule__DefSort__Group_4__0"
    // InternalEventCalculus.g:1812:1: rule__DefSort__Group_4__0 : rule__DefSort__Group_4__0__Impl rule__DefSort__Group_4__1 ;
    public final void rule__DefSort__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1816:1: ( rule__DefSort__Group_4__0__Impl rule__DefSort__Group_4__1 )
            // InternalEventCalculus.g:1817:2: rule__DefSort__Group_4__0__Impl rule__DefSort__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__DefSort__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefSort__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSort__Group_4__0"


    // $ANTLR start "rule__DefSort__Group_4__0__Impl"
    // InternalEventCalculus.g:1824:1: rule__DefSort__Group_4__0__Impl : ( ':' ) ;
    public final void rule__DefSort__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1828:1: ( ( ':' ) )
            // InternalEventCalculus.g:1829:1: ( ':' )
            {
            // InternalEventCalculus.g:1829:1: ( ':' )
            // InternalEventCalculus.g:1830:1: ':'
            {
             before(grammarAccess.getDefSortAccess().getColonKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
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
    // $ANTLR end "rule__DefSort__Group_4__0__Impl"


    // $ANTLR start "rule__DefSort__Group_4__1"
    // InternalEventCalculus.g:1843:1: rule__DefSort__Group_4__1 : rule__DefSort__Group_4__1__Impl ;
    public final void rule__DefSort__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1847:1: ( rule__DefSort__Group_4__1__Impl )
            // InternalEventCalculus.g:1848:2: rule__DefSort__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefSort__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefSort__Group_4__1"


    // $ANTLR start "rule__DefSort__Group_4__1__Impl"
    // InternalEventCalculus.g:1854:1: rule__DefSort__Group_4__1__Impl : ( ( rule__DefSort__TypeAssignment_4_1 ) ) ;
    public final void rule__DefSort__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1858:1: ( ( ( rule__DefSort__TypeAssignment_4_1 ) ) )
            // InternalEventCalculus.g:1859:1: ( ( rule__DefSort__TypeAssignment_4_1 ) )
            {
            // InternalEventCalculus.g:1859:1: ( ( rule__DefSort__TypeAssignment_4_1 ) )
            // InternalEventCalculus.g:1860:1: ( rule__DefSort__TypeAssignment_4_1 )
            {
             before(grammarAccess.getDefSortAccess().getTypeAssignment_4_1()); 
            // InternalEventCalculus.g:1861:1: ( rule__DefSort__TypeAssignment_4_1 )
            // InternalEventCalculus.g:1861:2: rule__DefSort__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__DefSort__TypeAssignment_4_1();

            state._fsp--;


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
    // $ANTLR end "rule__DefSort__Group_4__1__Impl"


    // $ANTLR start "rule__DefRange__Group__0"
    // InternalEventCalculus.g:1875:1: rule__DefRange__Group__0 : rule__DefRange__Group__0__Impl rule__DefRange__Group__1 ;
    public final void rule__DefRange__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1879:1: ( rule__DefRange__Group__0__Impl rule__DefRange__Group__1 )
            // InternalEventCalculus.g:1880:2: rule__DefRange__Group__0__Impl rule__DefRange__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__DefRange__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefRange__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefRange__Group__0"


    // $ANTLR start "rule__DefRange__Group__0__Impl"
    // InternalEventCalculus.g:1887:1: rule__DefRange__Group__0__Impl : ( ( rule__DefRange__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefRange__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1891:1: ( ( ( rule__DefRange__AnnotationsAssignment_0 )* ) )
            // InternalEventCalculus.g:1892:1: ( ( rule__DefRange__AnnotationsAssignment_0 )* )
            {
            // InternalEventCalculus.g:1892:1: ( ( rule__DefRange__AnnotationsAssignment_0 )* )
            // InternalEventCalculus.g:1893:1: ( rule__DefRange__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefRangeAccess().getAnnotationsAssignment_0()); 
            // InternalEventCalculus.g:1894:1: ( rule__DefRange__AnnotationsAssignment_0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==18) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEventCalculus.g:1894:2: rule__DefRange__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DefRange__AnnotationsAssignment_0();

            	    state._fsp--;


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
    // $ANTLR end "rule__DefRange__Group__0__Impl"


    // $ANTLR start "rule__DefRange__Group__1"
    // InternalEventCalculus.g:1904:1: rule__DefRange__Group__1 : rule__DefRange__Group__1__Impl rule__DefRange__Group__2 ;
    public final void rule__DefRange__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1908:1: ( rule__DefRange__Group__1__Impl rule__DefRange__Group__2 )
            // InternalEventCalculus.g:1909:2: rule__DefRange__Group__1__Impl rule__DefRange__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DefRange__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefRange__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefRange__Group__1"


    // $ANTLR start "rule__DefRange__Group__1__Impl"
    // InternalEventCalculus.g:1916:1: rule__DefRange__Group__1__Impl : ( 'range' ) ;
    public final void rule__DefRange__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1920:1: ( ( 'range' ) )
            // InternalEventCalculus.g:1921:1: ( 'range' )
            {
            // InternalEventCalculus.g:1921:1: ( 'range' )
            // InternalEventCalculus.g:1922:1: 'range'
            {
             before(grammarAccess.getDefRangeAccess().getRangeKeyword_1()); 
            match(input,22,FOLLOW_2); 
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
    // $ANTLR end "rule__DefRange__Group__1__Impl"


    // $ANTLR start "rule__DefRange__Group__2"
    // InternalEventCalculus.g:1935:1: rule__DefRange__Group__2 : rule__DefRange__Group__2__Impl rule__DefRange__Group__3 ;
    public final void rule__DefRange__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1939:1: ( rule__DefRange__Group__2__Impl rule__DefRange__Group__3 )
            // InternalEventCalculus.g:1940:2: rule__DefRange__Group__2__Impl rule__DefRange__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__DefRange__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefRange__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefRange__Group__2"


    // $ANTLR start "rule__DefRange__Group__2__Impl"
    // InternalEventCalculus.g:1947:1: rule__DefRange__Group__2__Impl : ( ( rule__DefRange__NameAssignment_2 ) ) ;
    public final void rule__DefRange__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1951:1: ( ( ( rule__DefRange__NameAssignment_2 ) ) )
            // InternalEventCalculus.g:1952:1: ( ( rule__DefRange__NameAssignment_2 ) )
            {
            // InternalEventCalculus.g:1952:1: ( ( rule__DefRange__NameAssignment_2 ) )
            // InternalEventCalculus.g:1953:1: ( rule__DefRange__NameAssignment_2 )
            {
             before(grammarAccess.getDefRangeAccess().getNameAssignment_2()); 
            // InternalEventCalculus.g:1954:1: ( rule__DefRange__NameAssignment_2 )
            // InternalEventCalculus.g:1954:2: rule__DefRange__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefRange__NameAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__DefRange__Group__2__Impl"


    // $ANTLR start "rule__DefRange__Group__3"
    // InternalEventCalculus.g:1964:1: rule__DefRange__Group__3 : rule__DefRange__Group__3__Impl rule__DefRange__Group__4 ;
    public final void rule__DefRange__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1968:1: ( rule__DefRange__Group__3__Impl rule__DefRange__Group__4 )
            // InternalEventCalculus.g:1969:2: rule__DefRange__Group__3__Impl rule__DefRange__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__DefRange__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefRange__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefRange__Group__3"


    // $ANTLR start "rule__DefRange__Group__3__Impl"
    // InternalEventCalculus.g:1976:1: rule__DefRange__Group__3__Impl : ( ( rule__DefRange__MinAssignment_3 ) ) ;
    public final void rule__DefRange__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1980:1: ( ( ( rule__DefRange__MinAssignment_3 ) ) )
            // InternalEventCalculus.g:1981:1: ( ( rule__DefRange__MinAssignment_3 ) )
            {
            // InternalEventCalculus.g:1981:1: ( ( rule__DefRange__MinAssignment_3 ) )
            // InternalEventCalculus.g:1982:1: ( rule__DefRange__MinAssignment_3 )
            {
             before(grammarAccess.getDefRangeAccess().getMinAssignment_3()); 
            // InternalEventCalculus.g:1983:1: ( rule__DefRange__MinAssignment_3 )
            // InternalEventCalculus.g:1983:2: rule__DefRange__MinAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DefRange__MinAssignment_3();

            state._fsp--;


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
    // $ANTLR end "rule__DefRange__Group__3__Impl"


    // $ANTLR start "rule__DefRange__Group__4"
    // InternalEventCalculus.g:1993:1: rule__DefRange__Group__4 : rule__DefRange__Group__4__Impl ;
    public final void rule__DefRange__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:1997:1: ( rule__DefRange__Group__4__Impl )
            // InternalEventCalculus.g:1998:2: rule__DefRange__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefRange__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefRange__Group__4"


    // $ANTLR start "rule__DefRange__Group__4__Impl"
    // InternalEventCalculus.g:2004:1: rule__DefRange__Group__4__Impl : ( ( rule__DefRange__MaxAssignment_4 ) ) ;
    public final void rule__DefRange__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2008:1: ( ( ( rule__DefRange__MaxAssignment_4 ) ) )
            // InternalEventCalculus.g:2009:1: ( ( rule__DefRange__MaxAssignment_4 ) )
            {
            // InternalEventCalculus.g:2009:1: ( ( rule__DefRange__MaxAssignment_4 ) )
            // InternalEventCalculus.g:2010:1: ( rule__DefRange__MaxAssignment_4 )
            {
             before(grammarAccess.getDefRangeAccess().getMaxAssignment_4()); 
            // InternalEventCalculus.g:2011:1: ( rule__DefRange__MaxAssignment_4 )
            // InternalEventCalculus.g:2011:2: rule__DefRange__MaxAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DefRange__MaxAssignment_4();

            state._fsp--;


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
    // $ANTLR end "rule__DefRange__Group__4__Impl"


    // $ANTLR start "rule__DefOption__Group__0"
    // InternalEventCalculus.g:2031:1: rule__DefOption__Group__0 : rule__DefOption__Group__0__Impl rule__DefOption__Group__1 ;
    public final void rule__DefOption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2035:1: ( rule__DefOption__Group__0__Impl rule__DefOption__Group__1 )
            // InternalEventCalculus.g:2036:2: rule__DefOption__Group__0__Impl rule__DefOption__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__DefOption__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefOption__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefOption__Group__0"


    // $ANTLR start "rule__DefOption__Group__0__Impl"
    // InternalEventCalculus.g:2043:1: rule__DefOption__Group__0__Impl : ( ( rule__DefOption__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefOption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2047:1: ( ( ( rule__DefOption__AnnotationsAssignment_0 )* ) )
            // InternalEventCalculus.g:2048:1: ( ( rule__DefOption__AnnotationsAssignment_0 )* )
            {
            // InternalEventCalculus.g:2048:1: ( ( rule__DefOption__AnnotationsAssignment_0 )* )
            // InternalEventCalculus.g:2049:1: ( rule__DefOption__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefOptionAccess().getAnnotationsAssignment_0()); 
            // InternalEventCalculus.g:2050:1: ( rule__DefOption__AnnotationsAssignment_0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==18) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEventCalculus.g:2050:2: rule__DefOption__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DefOption__AnnotationsAssignment_0();

            	    state._fsp--;


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
    // $ANTLR end "rule__DefOption__Group__0__Impl"


    // $ANTLR start "rule__DefOption__Group__1"
    // InternalEventCalculus.g:2060:1: rule__DefOption__Group__1 : rule__DefOption__Group__1__Impl ;
    public final void rule__DefOption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2064:1: ( rule__DefOption__Group__1__Impl )
            // InternalEventCalculus.g:2065:2: rule__DefOption__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefOption__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefOption__Group__1"


    // $ANTLR start "rule__DefOption__Group__1__Impl"
    // InternalEventCalculus.g:2071:1: rule__DefOption__Group__1__Impl : ( ( rule__DefOption__Alternatives_1 ) ) ;
    public final void rule__DefOption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2075:1: ( ( ( rule__DefOption__Alternatives_1 ) ) )
            // InternalEventCalculus.g:2076:1: ( ( rule__DefOption__Alternatives_1 ) )
            {
            // InternalEventCalculus.g:2076:1: ( ( rule__DefOption__Alternatives_1 ) )
            // InternalEventCalculus.g:2077:1: ( rule__DefOption__Alternatives_1 )
            {
             before(grammarAccess.getDefOptionAccess().getAlternatives_1()); 
            // InternalEventCalculus.g:2078:1: ( rule__DefOption__Alternatives_1 )
            // InternalEventCalculus.g:2078:2: rule__DefOption__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DefOption__Alternatives_1();

            state._fsp--;


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
    // $ANTLR end "rule__DefOption__Group__1__Impl"


    // $ANTLR start "rule__DefOption__Group_1_0__0"
    // InternalEventCalculus.g:2092:1: rule__DefOption__Group_1_0__0 : rule__DefOption__Group_1_0__0__Impl rule__DefOption__Group_1_0__1 ;
    public final void rule__DefOption__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2096:1: ( rule__DefOption__Group_1_0__0__Impl rule__DefOption__Group_1_0__1 )
            // InternalEventCalculus.g:2097:2: rule__DefOption__Group_1_0__0__Impl rule__DefOption__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__DefOption__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefOption__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefOption__Group_1_0__0"


    // $ANTLR start "rule__DefOption__Group_1_0__0__Impl"
    // InternalEventCalculus.g:2104:1: rule__DefOption__Group_1_0__0__Impl : ( 'option' ) ;
    public final void rule__DefOption__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2108:1: ( ( 'option' ) )
            // InternalEventCalculus.g:2109:1: ( 'option' )
            {
            // InternalEventCalculus.g:2109:1: ( 'option' )
            // InternalEventCalculus.g:2110:1: 'option'
            {
             before(grammarAccess.getDefOptionAccess().getOptionKeyword_1_0_0()); 
            match(input,23,FOLLOW_2); 
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
    // $ANTLR end "rule__DefOption__Group_1_0__0__Impl"


    // $ANTLR start "rule__DefOption__Group_1_0__1"
    // InternalEventCalculus.g:2123:1: rule__DefOption__Group_1_0__1 : rule__DefOption__Group_1_0__1__Impl rule__DefOption__Group_1_0__2 ;
    public final void rule__DefOption__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2127:1: ( rule__DefOption__Group_1_0__1__Impl rule__DefOption__Group_1_0__2 )
            // InternalEventCalculus.g:2128:2: rule__DefOption__Group_1_0__1__Impl rule__DefOption__Group_1_0__2
            {
            pushFollow(FOLLOW_15);
            rule__DefOption__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefOption__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefOption__Group_1_0__1"


    // $ANTLR start "rule__DefOption__Group_1_0__1__Impl"
    // InternalEventCalculus.g:2135:1: rule__DefOption__Group_1_0__1__Impl : ( ( rule__DefOption__NameAssignment_1_0_1 ) ) ;
    public final void rule__DefOption__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2139:1: ( ( ( rule__DefOption__NameAssignment_1_0_1 ) ) )
            // InternalEventCalculus.g:2140:1: ( ( rule__DefOption__NameAssignment_1_0_1 ) )
            {
            // InternalEventCalculus.g:2140:1: ( ( rule__DefOption__NameAssignment_1_0_1 ) )
            // InternalEventCalculus.g:2141:1: ( rule__DefOption__NameAssignment_1_0_1 )
            {
             before(grammarAccess.getDefOptionAccess().getNameAssignment_1_0_1()); 
            // InternalEventCalculus.g:2142:1: ( rule__DefOption__NameAssignment_1_0_1 )
            // InternalEventCalculus.g:2142:2: rule__DefOption__NameAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DefOption__NameAssignment_1_0_1();

            state._fsp--;


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
    // $ANTLR end "rule__DefOption__Group_1_0__1__Impl"


    // $ANTLR start "rule__DefOption__Group_1_0__2"
    // InternalEventCalculus.g:2152:1: rule__DefOption__Group_1_0__2 : rule__DefOption__Group_1_0__2__Impl ;
    public final void rule__DefOption__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2156:1: ( rule__DefOption__Group_1_0__2__Impl )
            // InternalEventCalculus.g:2157:2: rule__DefOption__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefOption__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefOption__Group_1_0__2"


    // $ANTLR start "rule__DefOption__Group_1_0__2__Impl"
    // InternalEventCalculus.g:2163:1: rule__DefOption__Group_1_0__2__Impl : ( ( rule__DefOption__ValueAssignment_1_0_2 ) ) ;
    public final void rule__DefOption__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2167:1: ( ( ( rule__DefOption__ValueAssignment_1_0_2 ) ) )
            // InternalEventCalculus.g:2168:1: ( ( rule__DefOption__ValueAssignment_1_0_2 ) )
            {
            // InternalEventCalculus.g:2168:1: ( ( rule__DefOption__ValueAssignment_1_0_2 ) )
            // InternalEventCalculus.g:2169:1: ( rule__DefOption__ValueAssignment_1_0_2 )
            {
             before(grammarAccess.getDefOptionAccess().getValueAssignment_1_0_2()); 
            // InternalEventCalculus.g:2170:1: ( rule__DefOption__ValueAssignment_1_0_2 )
            // InternalEventCalculus.g:2170:2: rule__DefOption__ValueAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__DefOption__ValueAssignment_1_0_2();

            state._fsp--;


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
    // $ANTLR end "rule__DefOption__Group_1_0__2__Impl"


    // $ANTLR start "rule__DefOption__Group_1_1__0"
    // InternalEventCalculus.g:2186:1: rule__DefOption__Group_1_1__0 : rule__DefOption__Group_1_1__0__Impl rule__DefOption__Group_1_1__1 ;
    public final void rule__DefOption__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2190:1: ( rule__DefOption__Group_1_1__0__Impl rule__DefOption__Group_1_1__1 )
            // InternalEventCalculus.g:2191:2: rule__DefOption__Group_1_1__0__Impl rule__DefOption__Group_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__DefOption__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefOption__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefOption__Group_1_1__0"


    // $ANTLR start "rule__DefOption__Group_1_1__0__Impl"
    // InternalEventCalculus.g:2198:1: rule__DefOption__Group_1_1__0__Impl : ( 'option' ) ;
    public final void rule__DefOption__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2202:1: ( ( 'option' ) )
            // InternalEventCalculus.g:2203:1: ( 'option' )
            {
            // InternalEventCalculus.g:2203:1: ( 'option' )
            // InternalEventCalculus.g:2204:1: 'option'
            {
             before(grammarAccess.getDefOptionAccess().getOptionKeyword_1_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // $ANTLR end "rule__DefOption__Group_1_1__0__Impl"


    // $ANTLR start "rule__DefOption__Group_1_1__1"
    // InternalEventCalculus.g:2217:1: rule__DefOption__Group_1_1__1 : rule__DefOption__Group_1_1__1__Impl rule__DefOption__Group_1_1__2 ;
    public final void rule__DefOption__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2221:1: ( rule__DefOption__Group_1_1__1__Impl rule__DefOption__Group_1_1__2 )
            // InternalEventCalculus.g:2222:2: rule__DefOption__Group_1_1__1__Impl rule__DefOption__Group_1_1__2
            {
            pushFollow(FOLLOW_12);
            rule__DefOption__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefOption__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefOption__Group_1_1__1"


    // $ANTLR start "rule__DefOption__Group_1_1__1__Impl"
    // InternalEventCalculus.g:2229:1: rule__DefOption__Group_1_1__1__Impl : ( ( rule__DefOption__NameAssignment_1_1_1 ) ) ;
    public final void rule__DefOption__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2233:1: ( ( ( rule__DefOption__NameAssignment_1_1_1 ) ) )
            // InternalEventCalculus.g:2234:1: ( ( rule__DefOption__NameAssignment_1_1_1 ) )
            {
            // InternalEventCalculus.g:2234:1: ( ( rule__DefOption__NameAssignment_1_1_1 ) )
            // InternalEventCalculus.g:2235:1: ( rule__DefOption__NameAssignment_1_1_1 )
            {
             before(grammarAccess.getDefOptionAccess().getNameAssignment_1_1_1()); 
            // InternalEventCalculus.g:2236:1: ( rule__DefOption__NameAssignment_1_1_1 )
            // InternalEventCalculus.g:2236:2: rule__DefOption__NameAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DefOption__NameAssignment_1_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__DefOption__Group_1_1__1__Impl"


    // $ANTLR start "rule__DefOption__Group_1_1__2"
    // InternalEventCalculus.g:2246:1: rule__DefOption__Group_1_1__2 : rule__DefOption__Group_1_1__2__Impl ;
    public final void rule__DefOption__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2250:1: ( rule__DefOption__Group_1_1__2__Impl )
            // InternalEventCalculus.g:2251:2: rule__DefOption__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefOption__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefOption__Group_1_1__2"


    // $ANTLR start "rule__DefOption__Group_1_1__2__Impl"
    // InternalEventCalculus.g:2257:1: rule__DefOption__Group_1_1__2__Impl : ( ( rule__DefOption__Value2Assignment_1_1_2 ) ) ;
    public final void rule__DefOption__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2261:1: ( ( ( rule__DefOption__Value2Assignment_1_1_2 ) ) )
            // InternalEventCalculus.g:2262:1: ( ( rule__DefOption__Value2Assignment_1_1_2 ) )
            {
            // InternalEventCalculus.g:2262:1: ( ( rule__DefOption__Value2Assignment_1_1_2 ) )
            // InternalEventCalculus.g:2263:1: ( rule__DefOption__Value2Assignment_1_1_2 )
            {
             before(grammarAccess.getDefOptionAccess().getValue2Assignment_1_1_2()); 
            // InternalEventCalculus.g:2264:1: ( rule__DefOption__Value2Assignment_1_1_2 )
            // InternalEventCalculus.g:2264:2: rule__DefOption__Value2Assignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__DefOption__Value2Assignment_1_1_2();

            state._fsp--;


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
    // $ANTLR end "rule__DefOption__Group_1_1__2__Impl"


    // $ANTLR start "rule__DefCompletion__Group__0"
    // InternalEventCalculus.g:2280:1: rule__DefCompletion__Group__0 : rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1 ;
    public final void rule__DefCompletion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2284:1: ( rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1 )
            // InternalEventCalculus.g:2285:2: rule__DefCompletion__Group__0__Impl rule__DefCompletion__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__DefCompletion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefCompletion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCompletion__Group__0"


    // $ANTLR start "rule__DefCompletion__Group__0__Impl"
    // InternalEventCalculus.g:2292:1: rule__DefCompletion__Group__0__Impl : ( ( rule__DefCompletion__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefCompletion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2296:1: ( ( ( rule__DefCompletion__AnnotationsAssignment_0 )* ) )
            // InternalEventCalculus.g:2297:1: ( ( rule__DefCompletion__AnnotationsAssignment_0 )* )
            {
            // InternalEventCalculus.g:2297:1: ( ( rule__DefCompletion__AnnotationsAssignment_0 )* )
            // InternalEventCalculus.g:2298:1: ( rule__DefCompletion__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefCompletionAccess().getAnnotationsAssignment_0()); 
            // InternalEventCalculus.g:2299:1: ( rule__DefCompletion__AnnotationsAssignment_0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==18) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalEventCalculus.g:2299:2: rule__DefCompletion__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DefCompletion__AnnotationsAssignment_0();

            	    state._fsp--;


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
    // $ANTLR end "rule__DefCompletion__Group__0__Impl"


    // $ANTLR start "rule__DefCompletion__Group__1"
    // InternalEventCalculus.g:2309:1: rule__DefCompletion__Group__1 : rule__DefCompletion__Group__1__Impl rule__DefCompletion__Group__2 ;
    public final void rule__DefCompletion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2313:1: ( rule__DefCompletion__Group__1__Impl rule__DefCompletion__Group__2 )
            // InternalEventCalculus.g:2314:2: rule__DefCompletion__Group__1__Impl rule__DefCompletion__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__DefCompletion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefCompletion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCompletion__Group__1"


    // $ANTLR start "rule__DefCompletion__Group__1__Impl"
    // InternalEventCalculus.g:2321:1: rule__DefCompletion__Group__1__Impl : ( 'completion' ) ;
    public final void rule__DefCompletion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2325:1: ( ( 'completion' ) )
            // InternalEventCalculus.g:2326:1: ( 'completion' )
            {
            // InternalEventCalculus.g:2326:1: ( 'completion' )
            // InternalEventCalculus.g:2327:1: 'completion'
            {
             before(grammarAccess.getDefCompletionAccess().getCompletionKeyword_1()); 
            match(input,24,FOLLOW_2); 
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
    // $ANTLR end "rule__DefCompletion__Group__1__Impl"


    // $ANTLR start "rule__DefCompletion__Group__2"
    // InternalEventCalculus.g:2340:1: rule__DefCompletion__Group__2 : rule__DefCompletion__Group__2__Impl rule__DefCompletion__Group__3 ;
    public final void rule__DefCompletion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2344:1: ( rule__DefCompletion__Group__2__Impl rule__DefCompletion__Group__3 )
            // InternalEventCalculus.g:2345:2: rule__DefCompletion__Group__2__Impl rule__DefCompletion__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__DefCompletion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefCompletion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCompletion__Group__2"


    // $ANTLR start "rule__DefCompletion__Group__2__Impl"
    // InternalEventCalculus.g:2352:1: rule__DefCompletion__Group__2__Impl : ( ( rule__DefCompletion__TypeAssignment_2 )? ) ;
    public final void rule__DefCompletion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2356:1: ( ( ( rule__DefCompletion__TypeAssignment_2 )? ) )
            // InternalEventCalculus.g:2357:1: ( ( rule__DefCompletion__TypeAssignment_2 )? )
            {
            // InternalEventCalculus.g:2357:1: ( ( rule__DefCompletion__TypeAssignment_2 )? )
            // InternalEventCalculus.g:2358:1: ( rule__DefCompletion__TypeAssignment_2 )?
            {
             before(grammarAccess.getDefCompletionAccess().getTypeAssignment_2()); 
            // InternalEventCalculus.g:2359:1: ( rule__DefCompletion__TypeAssignment_2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=15 && LA25_0<=16)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEventCalculus.g:2359:2: rule__DefCompletion__TypeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefCompletion__TypeAssignment_2();

                    state._fsp--;


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
    // $ANTLR end "rule__DefCompletion__Group__2__Impl"


    // $ANTLR start "rule__DefCompletion__Group__3"
    // InternalEventCalculus.g:2369:1: rule__DefCompletion__Group__3 : rule__DefCompletion__Group__3__Impl ;
    public final void rule__DefCompletion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2373:1: ( rule__DefCompletion__Group__3__Impl )
            // InternalEventCalculus.g:2374:2: rule__DefCompletion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefCompletion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefCompletion__Group__3"


    // $ANTLR start "rule__DefCompletion__Group__3__Impl"
    // InternalEventCalculus.g:2380:1: rule__DefCompletion__Group__3__Impl : ( ( rule__DefCompletion__LabelAssignment_3 ) ) ;
    public final void rule__DefCompletion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2384:1: ( ( ( rule__DefCompletion__LabelAssignment_3 ) ) )
            // InternalEventCalculus.g:2385:1: ( ( rule__DefCompletion__LabelAssignment_3 ) )
            {
            // InternalEventCalculus.g:2385:1: ( ( rule__DefCompletion__LabelAssignment_3 ) )
            // InternalEventCalculus.g:2386:1: ( rule__DefCompletion__LabelAssignment_3 )
            {
             before(grammarAccess.getDefCompletionAccess().getLabelAssignment_3()); 
            // InternalEventCalculus.g:2387:1: ( rule__DefCompletion__LabelAssignment_3 )
            // InternalEventCalculus.g:2387:2: rule__DefCompletion__LabelAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DefCompletion__LabelAssignment_3();

            state._fsp--;


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
    // $ANTLR end "rule__DefCompletion__Group__3__Impl"


    // $ANTLR start "rule__DefNonInertia__Group__0"
    // InternalEventCalculus.g:2405:1: rule__DefNonInertia__Group__0 : rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1 ;
    public final void rule__DefNonInertia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2409:1: ( rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1 )
            // InternalEventCalculus.g:2410:2: rule__DefNonInertia__Group__0__Impl rule__DefNonInertia__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DefNonInertia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefNonInertia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefNonInertia__Group__0"


    // $ANTLR start "rule__DefNonInertia__Group__0__Impl"
    // InternalEventCalculus.g:2417:1: rule__DefNonInertia__Group__0__Impl : ( ( rule__DefNonInertia__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefNonInertia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2421:1: ( ( ( rule__DefNonInertia__AnnotationsAssignment_0 )* ) )
            // InternalEventCalculus.g:2422:1: ( ( rule__DefNonInertia__AnnotationsAssignment_0 )* )
            {
            // InternalEventCalculus.g:2422:1: ( ( rule__DefNonInertia__AnnotationsAssignment_0 )* )
            // InternalEventCalculus.g:2423:1: ( rule__DefNonInertia__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefNonInertiaAccess().getAnnotationsAssignment_0()); 
            // InternalEventCalculus.g:2424:1: ( rule__DefNonInertia__AnnotationsAssignment_0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEventCalculus.g:2424:2: rule__DefNonInertia__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DefNonInertia__AnnotationsAssignment_0();

            	    state._fsp--;


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
    // $ANTLR end "rule__DefNonInertia__Group__0__Impl"


    // $ANTLR start "rule__DefNonInertia__Group__1"
    // InternalEventCalculus.g:2434:1: rule__DefNonInertia__Group__1 : rule__DefNonInertia__Group__1__Impl rule__DefNonInertia__Group__2 ;
    public final void rule__DefNonInertia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2438:1: ( rule__DefNonInertia__Group__1__Impl rule__DefNonInertia__Group__2 )
            // InternalEventCalculus.g:2439:2: rule__DefNonInertia__Group__1__Impl rule__DefNonInertia__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DefNonInertia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefNonInertia__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefNonInertia__Group__1"


    // $ANTLR start "rule__DefNonInertia__Group__1__Impl"
    // InternalEventCalculus.g:2446:1: rule__DefNonInertia__Group__1__Impl : ( 'noninertial' ) ;
    public final void rule__DefNonInertia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2450:1: ( ( 'noninertial' ) )
            // InternalEventCalculus.g:2451:1: ( 'noninertial' )
            {
            // InternalEventCalculus.g:2451:1: ( 'noninertial' )
            // InternalEventCalculus.g:2452:1: 'noninertial'
            {
             before(grammarAccess.getDefNonInertiaAccess().getNoninertialKeyword_1()); 
            match(input,25,FOLLOW_2); 
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
    // $ANTLR end "rule__DefNonInertia__Group__1__Impl"


    // $ANTLR start "rule__DefNonInertia__Group__2"
    // InternalEventCalculus.g:2465:1: rule__DefNonInertia__Group__2 : rule__DefNonInertia__Group__2__Impl rule__DefNonInertia__Group__3 ;
    public final void rule__DefNonInertia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2469:1: ( rule__DefNonInertia__Group__2__Impl rule__DefNonInertia__Group__3 )
            // InternalEventCalculus.g:2470:2: rule__DefNonInertia__Group__2__Impl rule__DefNonInertia__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__DefNonInertia__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefNonInertia__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefNonInertia__Group__2"


    // $ANTLR start "rule__DefNonInertia__Group__2__Impl"
    // InternalEventCalculus.g:2477:1: rule__DefNonInertia__Group__2__Impl : ( ( rule__DefNonInertia__NamesAssignment_2 ) ) ;
    public final void rule__DefNonInertia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2481:1: ( ( ( rule__DefNonInertia__NamesAssignment_2 ) ) )
            // InternalEventCalculus.g:2482:1: ( ( rule__DefNonInertia__NamesAssignment_2 ) )
            {
            // InternalEventCalculus.g:2482:1: ( ( rule__DefNonInertia__NamesAssignment_2 ) )
            // InternalEventCalculus.g:2483:1: ( rule__DefNonInertia__NamesAssignment_2 )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesAssignment_2()); 
            // InternalEventCalculus.g:2484:1: ( rule__DefNonInertia__NamesAssignment_2 )
            // InternalEventCalculus.g:2484:2: rule__DefNonInertia__NamesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefNonInertia__NamesAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__DefNonInertia__Group__2__Impl"


    // $ANTLR start "rule__DefNonInertia__Group__3"
    // InternalEventCalculus.g:2494:1: rule__DefNonInertia__Group__3 : rule__DefNonInertia__Group__3__Impl ;
    public final void rule__DefNonInertia__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2498:1: ( rule__DefNonInertia__Group__3__Impl )
            // InternalEventCalculus.g:2499:2: rule__DefNonInertia__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefNonInertia__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefNonInertia__Group__3"


    // $ANTLR start "rule__DefNonInertia__Group__3__Impl"
    // InternalEventCalculus.g:2505:1: rule__DefNonInertia__Group__3__Impl : ( ( rule__DefNonInertia__Group_3__0 )* ) ;
    public final void rule__DefNonInertia__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2509:1: ( ( ( rule__DefNonInertia__Group_3__0 )* ) )
            // InternalEventCalculus.g:2510:1: ( ( rule__DefNonInertia__Group_3__0 )* )
            {
            // InternalEventCalculus.g:2510:1: ( ( rule__DefNonInertia__Group_3__0 )* )
            // InternalEventCalculus.g:2511:1: ( rule__DefNonInertia__Group_3__0 )*
            {
             before(grammarAccess.getDefNonInertiaAccess().getGroup_3()); 
            // InternalEventCalculus.g:2512:1: ( rule__DefNonInertia__Group_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==26) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEventCalculus.g:2512:2: rule__DefNonInertia__Group_3__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DefNonInertia__Group_3__0();

            	    state._fsp--;


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
    // $ANTLR end "rule__DefNonInertia__Group__3__Impl"


    // $ANTLR start "rule__DefNonInertia__Group_3__0"
    // InternalEventCalculus.g:2530:1: rule__DefNonInertia__Group_3__0 : rule__DefNonInertia__Group_3__0__Impl rule__DefNonInertia__Group_3__1 ;
    public final void rule__DefNonInertia__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2534:1: ( rule__DefNonInertia__Group_3__0__Impl rule__DefNonInertia__Group_3__1 )
            // InternalEventCalculus.g:2535:2: rule__DefNonInertia__Group_3__0__Impl rule__DefNonInertia__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__DefNonInertia__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefNonInertia__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefNonInertia__Group_3__0"


    // $ANTLR start "rule__DefNonInertia__Group_3__0__Impl"
    // InternalEventCalculus.g:2542:1: rule__DefNonInertia__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DefNonInertia__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2546:1: ( ( ',' ) )
            // InternalEventCalculus.g:2547:1: ( ',' )
            {
            // InternalEventCalculus.g:2547:1: ( ',' )
            // InternalEventCalculus.g:2548:1: ','
            {
             before(grammarAccess.getDefNonInertiaAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // $ANTLR end "rule__DefNonInertia__Group_3__0__Impl"


    // $ANTLR start "rule__DefNonInertia__Group_3__1"
    // InternalEventCalculus.g:2561:1: rule__DefNonInertia__Group_3__1 : rule__DefNonInertia__Group_3__1__Impl ;
    public final void rule__DefNonInertia__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2565:1: ( rule__DefNonInertia__Group_3__1__Impl )
            // InternalEventCalculus.g:2566:2: rule__DefNonInertia__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefNonInertia__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefNonInertia__Group_3__1"


    // $ANTLR start "rule__DefNonInertia__Group_3__1__Impl"
    // InternalEventCalculus.g:2572:1: rule__DefNonInertia__Group_3__1__Impl : ( ( rule__DefNonInertia__NamesAssignment_3_1 ) ) ;
    public final void rule__DefNonInertia__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2576:1: ( ( ( rule__DefNonInertia__NamesAssignment_3_1 ) ) )
            // InternalEventCalculus.g:2577:1: ( ( rule__DefNonInertia__NamesAssignment_3_1 ) )
            {
            // InternalEventCalculus.g:2577:1: ( ( rule__DefNonInertia__NamesAssignment_3_1 ) )
            // InternalEventCalculus.g:2578:1: ( rule__DefNonInertia__NamesAssignment_3_1 )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesAssignment_3_1()); 
            // InternalEventCalculus.g:2579:1: ( rule__DefNonInertia__NamesAssignment_3_1 )
            // InternalEventCalculus.g:2579:2: rule__DefNonInertia__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DefNonInertia__NamesAssignment_3_1();

            state._fsp--;


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
    // $ANTLR end "rule__DefNonInertia__Group_3__1__Impl"


    // $ANTLR start "rule__DefXor__Group__0"
    // InternalEventCalculus.g:2593:1: rule__DefXor__Group__0 : rule__DefXor__Group__0__Impl rule__DefXor__Group__1 ;
    public final void rule__DefXor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2597:1: ( rule__DefXor__Group__0__Impl rule__DefXor__Group__1 )
            // InternalEventCalculus.g:2598:2: rule__DefXor__Group__0__Impl rule__DefXor__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DefXor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefXor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefXor__Group__0"


    // $ANTLR start "rule__DefXor__Group__0__Impl"
    // InternalEventCalculus.g:2605:1: rule__DefXor__Group__0__Impl : ( ( rule__DefXor__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefXor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2609:1: ( ( ( rule__DefXor__AnnotationsAssignment_0 )* ) )
            // InternalEventCalculus.g:2610:1: ( ( rule__DefXor__AnnotationsAssignment_0 )* )
            {
            // InternalEventCalculus.g:2610:1: ( ( rule__DefXor__AnnotationsAssignment_0 )* )
            // InternalEventCalculus.g:2611:1: ( rule__DefXor__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefXorAccess().getAnnotationsAssignment_0()); 
            // InternalEventCalculus.g:2612:1: ( rule__DefXor__AnnotationsAssignment_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==18) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEventCalculus.g:2612:2: rule__DefXor__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DefXor__AnnotationsAssignment_0();

            	    state._fsp--;


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
    // $ANTLR end "rule__DefXor__Group__0__Impl"


    // $ANTLR start "rule__DefXor__Group__1"
    // InternalEventCalculus.g:2622:1: rule__DefXor__Group__1 : rule__DefXor__Group__1__Impl rule__DefXor__Group__2 ;
    public final void rule__DefXor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2626:1: ( rule__DefXor__Group__1__Impl rule__DefXor__Group__2 )
            // InternalEventCalculus.g:2627:2: rule__DefXor__Group__1__Impl rule__DefXor__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DefXor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefXor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefXor__Group__1"


    // $ANTLR start "rule__DefXor__Group__1__Impl"
    // InternalEventCalculus.g:2634:1: rule__DefXor__Group__1__Impl : ( 'xor' ) ;
    public final void rule__DefXor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2638:1: ( ( 'xor' ) )
            // InternalEventCalculus.g:2639:1: ( 'xor' )
            {
            // InternalEventCalculus.g:2639:1: ( 'xor' )
            // InternalEventCalculus.g:2640:1: 'xor'
            {
             before(grammarAccess.getDefXorAccess().getXorKeyword_1()); 
            match(input,27,FOLLOW_2); 
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
    // $ANTLR end "rule__DefXor__Group__1__Impl"


    // $ANTLR start "rule__DefXor__Group__2"
    // InternalEventCalculus.g:2653:1: rule__DefXor__Group__2 : rule__DefXor__Group__2__Impl rule__DefXor__Group__3 ;
    public final void rule__DefXor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2657:1: ( rule__DefXor__Group__2__Impl rule__DefXor__Group__3 )
            // InternalEventCalculus.g:2658:2: rule__DefXor__Group__2__Impl rule__DefXor__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__DefXor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefXor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefXor__Group__2"


    // $ANTLR start "rule__DefXor__Group__2__Impl"
    // InternalEventCalculus.g:2665:1: rule__DefXor__Group__2__Impl : ( ( rule__DefXor__NamesAssignment_2 ) ) ;
    public final void rule__DefXor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2669:1: ( ( ( rule__DefXor__NamesAssignment_2 ) ) )
            // InternalEventCalculus.g:2670:1: ( ( rule__DefXor__NamesAssignment_2 ) )
            {
            // InternalEventCalculus.g:2670:1: ( ( rule__DefXor__NamesAssignment_2 ) )
            // InternalEventCalculus.g:2671:1: ( rule__DefXor__NamesAssignment_2 )
            {
             before(grammarAccess.getDefXorAccess().getNamesAssignment_2()); 
            // InternalEventCalculus.g:2672:1: ( rule__DefXor__NamesAssignment_2 )
            // InternalEventCalculus.g:2672:2: rule__DefXor__NamesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefXor__NamesAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__DefXor__Group__2__Impl"


    // $ANTLR start "rule__DefXor__Group__3"
    // InternalEventCalculus.g:2682:1: rule__DefXor__Group__3 : rule__DefXor__Group__3__Impl ;
    public final void rule__DefXor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2686:1: ( rule__DefXor__Group__3__Impl )
            // InternalEventCalculus.g:2687:2: rule__DefXor__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefXor__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefXor__Group__3"


    // $ANTLR start "rule__DefXor__Group__3__Impl"
    // InternalEventCalculus.g:2693:1: rule__DefXor__Group__3__Impl : ( ( rule__DefXor__Group_3__0 )* ) ;
    public final void rule__DefXor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2697:1: ( ( ( rule__DefXor__Group_3__0 )* ) )
            // InternalEventCalculus.g:2698:1: ( ( rule__DefXor__Group_3__0 )* )
            {
            // InternalEventCalculus.g:2698:1: ( ( rule__DefXor__Group_3__0 )* )
            // InternalEventCalculus.g:2699:1: ( rule__DefXor__Group_3__0 )*
            {
             before(grammarAccess.getDefXorAccess().getGroup_3()); 
            // InternalEventCalculus.g:2700:1: ( rule__DefXor__Group_3__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==26) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEventCalculus.g:2700:2: rule__DefXor__Group_3__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DefXor__Group_3__0();

            	    state._fsp--;


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
    // $ANTLR end "rule__DefXor__Group__3__Impl"


    // $ANTLR start "rule__DefXor__Group_3__0"
    // InternalEventCalculus.g:2718:1: rule__DefXor__Group_3__0 : rule__DefXor__Group_3__0__Impl rule__DefXor__Group_3__1 ;
    public final void rule__DefXor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2722:1: ( rule__DefXor__Group_3__0__Impl rule__DefXor__Group_3__1 )
            // InternalEventCalculus.g:2723:2: rule__DefXor__Group_3__0__Impl rule__DefXor__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__DefXor__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefXor__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefXor__Group_3__0"


    // $ANTLR start "rule__DefXor__Group_3__0__Impl"
    // InternalEventCalculus.g:2730:1: rule__DefXor__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DefXor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2734:1: ( ( ',' ) )
            // InternalEventCalculus.g:2735:1: ( ',' )
            {
            // InternalEventCalculus.g:2735:1: ( ',' )
            // InternalEventCalculus.g:2736:1: ','
            {
             before(grammarAccess.getDefXorAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // $ANTLR end "rule__DefXor__Group_3__0__Impl"


    // $ANTLR start "rule__DefXor__Group_3__1"
    // InternalEventCalculus.g:2749:1: rule__DefXor__Group_3__1 : rule__DefXor__Group_3__1__Impl ;
    public final void rule__DefXor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2753:1: ( rule__DefXor__Group_3__1__Impl )
            // InternalEventCalculus.g:2754:2: rule__DefXor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefXor__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefXor__Group_3__1"


    // $ANTLR start "rule__DefXor__Group_3__1__Impl"
    // InternalEventCalculus.g:2760:1: rule__DefXor__Group_3__1__Impl : ( ( rule__DefXor__NamesAssignment_3_1 ) ) ;
    public final void rule__DefXor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2764:1: ( ( ( rule__DefXor__NamesAssignment_3_1 ) ) )
            // InternalEventCalculus.g:2765:1: ( ( rule__DefXor__NamesAssignment_3_1 ) )
            {
            // InternalEventCalculus.g:2765:1: ( ( rule__DefXor__NamesAssignment_3_1 ) )
            // InternalEventCalculus.g:2766:1: ( rule__DefXor__NamesAssignment_3_1 )
            {
             before(grammarAccess.getDefXorAccess().getNamesAssignment_3_1()); 
            // InternalEventCalculus.g:2767:1: ( rule__DefXor__NamesAssignment_3_1 )
            // InternalEventCalculus.g:2767:2: rule__DefXor__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DefXor__NamesAssignment_3_1();

            state._fsp--;


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
    // $ANTLR end "rule__DefXor__Group_3__1__Impl"


    // $ANTLR start "rule__DefMutex__Group__0"
    // InternalEventCalculus.g:2781:1: rule__DefMutex__Group__0 : rule__DefMutex__Group__0__Impl rule__DefMutex__Group__1 ;
    public final void rule__DefMutex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2785:1: ( rule__DefMutex__Group__0__Impl rule__DefMutex__Group__1 )
            // InternalEventCalculus.g:2786:2: rule__DefMutex__Group__0__Impl rule__DefMutex__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__DefMutex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefMutex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMutex__Group__0"


    // $ANTLR start "rule__DefMutex__Group__0__Impl"
    // InternalEventCalculus.g:2793:1: rule__DefMutex__Group__0__Impl : ( ( rule__DefMutex__AnnotationsAssignment_0 )* ) ;
    public final void rule__DefMutex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2797:1: ( ( ( rule__DefMutex__AnnotationsAssignment_0 )* ) )
            // InternalEventCalculus.g:2798:1: ( ( rule__DefMutex__AnnotationsAssignment_0 )* )
            {
            // InternalEventCalculus.g:2798:1: ( ( rule__DefMutex__AnnotationsAssignment_0 )* )
            // InternalEventCalculus.g:2799:1: ( rule__DefMutex__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getDefMutexAccess().getAnnotationsAssignment_0()); 
            // InternalEventCalculus.g:2800:1: ( rule__DefMutex__AnnotationsAssignment_0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==18) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEventCalculus.g:2800:2: rule__DefMutex__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__DefMutex__AnnotationsAssignment_0();

            	    state._fsp--;


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
    // $ANTLR end "rule__DefMutex__Group__0__Impl"


    // $ANTLR start "rule__DefMutex__Group__1"
    // InternalEventCalculus.g:2810:1: rule__DefMutex__Group__1 : rule__DefMutex__Group__1__Impl rule__DefMutex__Group__2 ;
    public final void rule__DefMutex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2814:1: ( rule__DefMutex__Group__1__Impl rule__DefMutex__Group__2 )
            // InternalEventCalculus.g:2815:2: rule__DefMutex__Group__1__Impl rule__DefMutex__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__DefMutex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefMutex__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMutex__Group__1"


    // $ANTLR start "rule__DefMutex__Group__1__Impl"
    // InternalEventCalculus.g:2822:1: rule__DefMutex__Group__1__Impl : ( 'mutex' ) ;
    public final void rule__DefMutex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2826:1: ( ( 'mutex' ) )
            // InternalEventCalculus.g:2827:1: ( 'mutex' )
            {
            // InternalEventCalculus.g:2827:1: ( 'mutex' )
            // InternalEventCalculus.g:2828:1: 'mutex'
            {
             before(grammarAccess.getDefMutexAccess().getMutexKeyword_1()); 
            match(input,28,FOLLOW_2); 
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
    // $ANTLR end "rule__DefMutex__Group__1__Impl"


    // $ANTLR start "rule__DefMutex__Group__2"
    // InternalEventCalculus.g:2841:1: rule__DefMutex__Group__2 : rule__DefMutex__Group__2__Impl rule__DefMutex__Group__3 ;
    public final void rule__DefMutex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2845:1: ( rule__DefMutex__Group__2__Impl rule__DefMutex__Group__3 )
            // InternalEventCalculus.g:2846:2: rule__DefMutex__Group__2__Impl rule__DefMutex__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__DefMutex__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefMutex__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMutex__Group__2"


    // $ANTLR start "rule__DefMutex__Group__2__Impl"
    // InternalEventCalculus.g:2853:1: rule__DefMutex__Group__2__Impl : ( ( rule__DefMutex__NamesAssignment_2 ) ) ;
    public final void rule__DefMutex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2857:1: ( ( ( rule__DefMutex__NamesAssignment_2 ) ) )
            // InternalEventCalculus.g:2858:1: ( ( rule__DefMutex__NamesAssignment_2 ) )
            {
            // InternalEventCalculus.g:2858:1: ( ( rule__DefMutex__NamesAssignment_2 ) )
            // InternalEventCalculus.g:2859:1: ( rule__DefMutex__NamesAssignment_2 )
            {
             before(grammarAccess.getDefMutexAccess().getNamesAssignment_2()); 
            // InternalEventCalculus.g:2860:1: ( rule__DefMutex__NamesAssignment_2 )
            // InternalEventCalculus.g:2860:2: rule__DefMutex__NamesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DefMutex__NamesAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__DefMutex__Group__2__Impl"


    // $ANTLR start "rule__DefMutex__Group__3"
    // InternalEventCalculus.g:2870:1: rule__DefMutex__Group__3 : rule__DefMutex__Group__3__Impl ;
    public final void rule__DefMutex__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2874:1: ( rule__DefMutex__Group__3__Impl )
            // InternalEventCalculus.g:2875:2: rule__DefMutex__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefMutex__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMutex__Group__3"


    // $ANTLR start "rule__DefMutex__Group__3__Impl"
    // InternalEventCalculus.g:2881:1: rule__DefMutex__Group__3__Impl : ( ( rule__DefMutex__Group_3__0 )* ) ;
    public final void rule__DefMutex__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2885:1: ( ( ( rule__DefMutex__Group_3__0 )* ) )
            // InternalEventCalculus.g:2886:1: ( ( rule__DefMutex__Group_3__0 )* )
            {
            // InternalEventCalculus.g:2886:1: ( ( rule__DefMutex__Group_3__0 )* )
            // InternalEventCalculus.g:2887:1: ( rule__DefMutex__Group_3__0 )*
            {
             before(grammarAccess.getDefMutexAccess().getGroup_3()); 
            // InternalEventCalculus.g:2888:1: ( rule__DefMutex__Group_3__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==26) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEventCalculus.g:2888:2: rule__DefMutex__Group_3__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__DefMutex__Group_3__0();

            	    state._fsp--;


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
    // $ANTLR end "rule__DefMutex__Group__3__Impl"


    // $ANTLR start "rule__DefMutex__Group_3__0"
    // InternalEventCalculus.g:2906:1: rule__DefMutex__Group_3__0 : rule__DefMutex__Group_3__0__Impl rule__DefMutex__Group_3__1 ;
    public final void rule__DefMutex__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2910:1: ( rule__DefMutex__Group_3__0__Impl rule__DefMutex__Group_3__1 )
            // InternalEventCalculus.g:2911:2: rule__DefMutex__Group_3__0__Impl rule__DefMutex__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__DefMutex__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefMutex__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMutex__Group_3__0"


    // $ANTLR start "rule__DefMutex__Group_3__0__Impl"
    // InternalEventCalculus.g:2918:1: rule__DefMutex__Group_3__0__Impl : ( ',' ) ;
    public final void rule__DefMutex__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2922:1: ( ( ',' ) )
            // InternalEventCalculus.g:2923:1: ( ',' )
            {
            // InternalEventCalculus.g:2923:1: ( ',' )
            // InternalEventCalculus.g:2924:1: ','
            {
             before(grammarAccess.getDefMutexAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
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
    // $ANTLR end "rule__DefMutex__Group_3__0__Impl"


    // $ANTLR start "rule__DefMutex__Group_3__1"
    // InternalEventCalculus.g:2937:1: rule__DefMutex__Group_3__1 : rule__DefMutex__Group_3__1__Impl ;
    public final void rule__DefMutex__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2941:1: ( rule__DefMutex__Group_3__1__Impl )
            // InternalEventCalculus.g:2942:2: rule__DefMutex__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefMutex__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefMutex__Group_3__1"


    // $ANTLR start "rule__DefMutex__Group_3__1__Impl"
    // InternalEventCalculus.g:2948:1: rule__DefMutex__Group_3__1__Impl : ( ( rule__DefMutex__NamesAssignment_3_1 ) ) ;
    public final void rule__DefMutex__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2952:1: ( ( ( rule__DefMutex__NamesAssignment_3_1 ) ) )
            // InternalEventCalculus.g:2953:1: ( ( rule__DefMutex__NamesAssignment_3_1 ) )
            {
            // InternalEventCalculus.g:2953:1: ( ( rule__DefMutex__NamesAssignment_3_1 ) )
            // InternalEventCalculus.g:2954:1: ( rule__DefMutex__NamesAssignment_3_1 )
            {
             before(grammarAccess.getDefMutexAccess().getNamesAssignment_3_1()); 
            // InternalEventCalculus.g:2955:1: ( rule__DefMutex__NamesAssignment_3_1 )
            // InternalEventCalculus.g:2955:2: rule__DefMutex__NamesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DefMutex__NamesAssignment_3_1();

            state._fsp--;


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
    // $ANTLR end "rule__DefMutex__Group_3__1__Impl"


    // $ANTLR start "rule__LabeledExpression__Group__0"
    // InternalEventCalculus.g:2969:1: rule__LabeledExpression__Group__0 : rule__LabeledExpression__Group__0__Impl rule__LabeledExpression__Group__1 ;
    public final void rule__LabeledExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2973:1: ( rule__LabeledExpression__Group__0__Impl rule__LabeledExpression__Group__1 )
            // InternalEventCalculus.g:2974:2: rule__LabeledExpression__Group__0__Impl rule__LabeledExpression__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LabeledExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabeledExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledExpression__Group__0"


    // $ANTLR start "rule__LabeledExpression__Group__0__Impl"
    // InternalEventCalculus.g:2981:1: rule__LabeledExpression__Group__0__Impl : ( ( rule__LabeledExpression__AnnotationsAssignment_0 )* ) ;
    public final void rule__LabeledExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:2985:1: ( ( ( rule__LabeledExpression__AnnotationsAssignment_0 )* ) )
            // InternalEventCalculus.g:2986:1: ( ( rule__LabeledExpression__AnnotationsAssignment_0 )* )
            {
            // InternalEventCalculus.g:2986:1: ( ( rule__LabeledExpression__AnnotationsAssignment_0 )* )
            // InternalEventCalculus.g:2987:1: ( rule__LabeledExpression__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getLabeledExpressionAccess().getAnnotationsAssignment_0()); 
            // InternalEventCalculus.g:2988:1: ( rule__LabeledExpression__AnnotationsAssignment_0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==18) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEventCalculus.g:2988:2: rule__LabeledExpression__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__LabeledExpression__AnnotationsAssignment_0();

            	    state._fsp--;


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
    // $ANTLR end "rule__LabeledExpression__Group__0__Impl"


    // $ANTLR start "rule__LabeledExpression__Group__1"
    // InternalEventCalculus.g:2998:1: rule__LabeledExpression__Group__1 : rule__LabeledExpression__Group__1__Impl rule__LabeledExpression__Group__2 ;
    public final void rule__LabeledExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3002:1: ( rule__LabeledExpression__Group__1__Impl rule__LabeledExpression__Group__2 )
            // InternalEventCalculus.g:3003:2: rule__LabeledExpression__Group__1__Impl rule__LabeledExpression__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__LabeledExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabeledExpression__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledExpression__Group__1"


    // $ANTLR start "rule__LabeledExpression__Group__1__Impl"
    // InternalEventCalculus.g:3010:1: rule__LabeledExpression__Group__1__Impl : ( ( rule__LabeledExpression__Group_1__0 )? ) ;
    public final void rule__LabeledExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3014:1: ( ( ( rule__LabeledExpression__Group_1__0 )? ) )
            // InternalEventCalculus.g:3015:1: ( ( rule__LabeledExpression__Group_1__0 )? )
            {
            // InternalEventCalculus.g:3015:1: ( ( rule__LabeledExpression__Group_1__0 )? )
            // InternalEventCalculus.g:3016:1: ( rule__LabeledExpression__Group_1__0 )?
            {
             before(grammarAccess.getLabeledExpressionAccess().getGroup_1()); 
            // InternalEventCalculus.g:3017:1: ( rule__LabeledExpression__Group_1__0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0>=15 && LA33_0<=16)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEventCalculus.g:3017:2: rule__LabeledExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LabeledExpression__Group_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__LabeledExpression__Group__1__Impl"


    // $ANTLR start "rule__LabeledExpression__Group__2"
    // InternalEventCalculus.g:3027:1: rule__LabeledExpression__Group__2 : rule__LabeledExpression__Group__2__Impl rule__LabeledExpression__Group__3 ;
    public final void rule__LabeledExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3031:1: ( rule__LabeledExpression__Group__2__Impl rule__LabeledExpression__Group__3 )
            // InternalEventCalculus.g:3032:2: rule__LabeledExpression__Group__2__Impl rule__LabeledExpression__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__LabeledExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabeledExpression__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledExpression__Group__2"


    // $ANTLR start "rule__LabeledExpression__Group__2__Impl"
    // InternalEventCalculus.g:3039:1: rule__LabeledExpression__Group__2__Impl : ( ( rule__LabeledExpression__ExprAssignment_2 ) ) ;
    public final void rule__LabeledExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3043:1: ( ( ( rule__LabeledExpression__ExprAssignment_2 ) ) )
            // InternalEventCalculus.g:3044:1: ( ( rule__LabeledExpression__ExprAssignment_2 ) )
            {
            // InternalEventCalculus.g:3044:1: ( ( rule__LabeledExpression__ExprAssignment_2 ) )
            // InternalEventCalculus.g:3045:1: ( rule__LabeledExpression__ExprAssignment_2 )
            {
             before(grammarAccess.getLabeledExpressionAccess().getExprAssignment_2()); 
            // InternalEventCalculus.g:3046:1: ( rule__LabeledExpression__ExprAssignment_2 )
            // InternalEventCalculus.g:3046:2: rule__LabeledExpression__ExprAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LabeledExpression__ExprAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__LabeledExpression__Group__2__Impl"


    // $ANTLR start "rule__LabeledExpression__Group__3"
    // InternalEventCalculus.g:3056:1: rule__LabeledExpression__Group__3 : rule__LabeledExpression__Group__3__Impl ;
    public final void rule__LabeledExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3060:1: ( rule__LabeledExpression__Group__3__Impl )
            // InternalEventCalculus.g:3061:2: rule__LabeledExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LabeledExpression__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledExpression__Group__3"


    // $ANTLR start "rule__LabeledExpression__Group__3__Impl"
    // InternalEventCalculus.g:3067:1: rule__LabeledExpression__Group__3__Impl : ( '.' ) ;
    public final void rule__LabeledExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3071:1: ( ( '.' ) )
            // InternalEventCalculus.g:3072:1: ( '.' )
            {
            // InternalEventCalculus.g:3072:1: ( '.' )
            // InternalEventCalculus.g:3073:1: '.'
            {
             before(grammarAccess.getLabeledExpressionAccess().getFullStopKeyword_3()); 
            match(input,29,FOLLOW_2); 
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
    // $ANTLR end "rule__LabeledExpression__Group__3__Impl"


    // $ANTLR start "rule__LabeledExpression__Group_1__0"
    // InternalEventCalculus.g:3094:1: rule__LabeledExpression__Group_1__0 : rule__LabeledExpression__Group_1__0__Impl rule__LabeledExpression__Group_1__1 ;
    public final void rule__LabeledExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3098:1: ( rule__LabeledExpression__Group_1__0__Impl rule__LabeledExpression__Group_1__1 )
            // InternalEventCalculus.g:3099:2: rule__LabeledExpression__Group_1__0__Impl rule__LabeledExpression__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__LabeledExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LabeledExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledExpression__Group_1__0"


    // $ANTLR start "rule__LabeledExpression__Group_1__0__Impl"
    // InternalEventCalculus.g:3106:1: rule__LabeledExpression__Group_1__0__Impl : ( ( rule__LabeledExpression__NameAssignment_1_0 ) ) ;
    public final void rule__LabeledExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3110:1: ( ( ( rule__LabeledExpression__NameAssignment_1_0 ) ) )
            // InternalEventCalculus.g:3111:1: ( ( rule__LabeledExpression__NameAssignment_1_0 ) )
            {
            // InternalEventCalculus.g:3111:1: ( ( rule__LabeledExpression__NameAssignment_1_0 ) )
            // InternalEventCalculus.g:3112:1: ( rule__LabeledExpression__NameAssignment_1_0 )
            {
             before(grammarAccess.getLabeledExpressionAccess().getNameAssignment_1_0()); 
            // InternalEventCalculus.g:3113:1: ( rule__LabeledExpression__NameAssignment_1_0 )
            // InternalEventCalculus.g:3113:2: rule__LabeledExpression__NameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LabeledExpression__NameAssignment_1_0();

            state._fsp--;


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
    // $ANTLR end "rule__LabeledExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LabeledExpression__Group_1__1"
    // InternalEventCalculus.g:3123:1: rule__LabeledExpression__Group_1__1 : rule__LabeledExpression__Group_1__1__Impl ;
    public final void rule__LabeledExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3127:1: ( rule__LabeledExpression__Group_1__1__Impl )
            // InternalEventCalculus.g:3128:2: rule__LabeledExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LabeledExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LabeledExpression__Group_1__1"


    // $ANTLR start "rule__LabeledExpression__Group_1__1__Impl"
    // InternalEventCalculus.g:3134:1: rule__LabeledExpression__Group_1__1__Impl : ( ':' ) ;
    public final void rule__LabeledExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3138:1: ( ( ':' ) )
            // InternalEventCalculus.g:3139:1: ( ':' )
            {
            // InternalEventCalculus.g:3139:1: ( ':' )
            // InternalEventCalculus.g:3140:1: ':'
            {
             before(grammarAccess.getLabeledExpressionAccess().getColonKeyword_1_1()); 
            match(input,21,FOLLOW_2); 
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
    // $ANTLR end "rule__LabeledExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SortDefinition__Group__0"
    // InternalEventCalculus.g:3157:1: rule__SortDefinition__Group__0 : rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1 ;
    public final void rule__SortDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3161:1: ( rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1 )
            // InternalEventCalculus.g:3162:2: rule__SortDefinition__Group__0__Impl rule__SortDefinition__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__SortDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group__0"


    // $ANTLR start "rule__SortDefinition__Group__0__Impl"
    // InternalEventCalculus.g:3169:1: rule__SortDefinition__Group__0__Impl : ( ( rule__SortDefinition__AnnotationsAssignment_0 )* ) ;
    public final void rule__SortDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3173:1: ( ( ( rule__SortDefinition__AnnotationsAssignment_0 )* ) )
            // InternalEventCalculus.g:3174:1: ( ( rule__SortDefinition__AnnotationsAssignment_0 )* )
            {
            // InternalEventCalculus.g:3174:1: ( ( rule__SortDefinition__AnnotationsAssignment_0 )* )
            // InternalEventCalculus.g:3175:1: ( rule__SortDefinition__AnnotationsAssignment_0 )*
            {
             before(grammarAccess.getSortDefinitionAccess().getAnnotationsAssignment_0()); 
            // InternalEventCalculus.g:3176:1: ( rule__SortDefinition__AnnotationsAssignment_0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==18) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEventCalculus.g:3176:2: rule__SortDefinition__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__SortDefinition__AnnotationsAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getSortDefinitionAccess().getAnnotationsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group__0__Impl"


    // $ANTLR start "rule__SortDefinition__Group__1"
    // InternalEventCalculus.g:3186:1: rule__SortDefinition__Group__1 : rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2 ;
    public final void rule__SortDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3190:1: ( rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2 )
            // InternalEventCalculus.g:3191:2: rule__SortDefinition__Group__1__Impl rule__SortDefinition__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__SortDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group__1"


    // $ANTLR start "rule__SortDefinition__Group__1__Impl"
    // InternalEventCalculus.g:3198:1: rule__SortDefinition__Group__1__Impl : ( ( rule__SortDefinition__SortAssignment_1 ) ) ;
    public final void rule__SortDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3202:1: ( ( ( rule__SortDefinition__SortAssignment_1 ) ) )
            // InternalEventCalculus.g:3203:1: ( ( rule__SortDefinition__SortAssignment_1 ) )
            {
            // InternalEventCalculus.g:3203:1: ( ( rule__SortDefinition__SortAssignment_1 ) )
            // InternalEventCalculus.g:3204:1: ( rule__SortDefinition__SortAssignment_1 )
            {
             before(grammarAccess.getSortDefinitionAccess().getSortAssignment_1()); 
            // InternalEventCalculus.g:3205:1: ( rule__SortDefinition__SortAssignment_1 )
            // InternalEventCalculus.g:3205:2: rule__SortDefinition__SortAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SortDefinition__SortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSortDefinitionAccess().getSortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group__1__Impl"


    // $ANTLR start "rule__SortDefinition__Group__2"
    // InternalEventCalculus.g:3215:1: rule__SortDefinition__Group__2 : rule__SortDefinition__Group__2__Impl rule__SortDefinition__Group__3 ;
    public final void rule__SortDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3219:1: ( rule__SortDefinition__Group__2__Impl rule__SortDefinition__Group__3 )
            // InternalEventCalculus.g:3220:2: rule__SortDefinition__Group__2__Impl rule__SortDefinition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SortDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group__2"


    // $ANTLR start "rule__SortDefinition__Group__2__Impl"
    // InternalEventCalculus.g:3227:1: rule__SortDefinition__Group__2__Impl : ( ( rule__SortDefinition__DefinitionsAssignment_2 ) ) ;
    public final void rule__SortDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3231:1: ( ( ( rule__SortDefinition__DefinitionsAssignment_2 ) ) )
            // InternalEventCalculus.g:3232:1: ( ( rule__SortDefinition__DefinitionsAssignment_2 ) )
            {
            // InternalEventCalculus.g:3232:1: ( ( rule__SortDefinition__DefinitionsAssignment_2 ) )
            // InternalEventCalculus.g:3233:1: ( rule__SortDefinition__DefinitionsAssignment_2 )
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_2()); 
            // InternalEventCalculus.g:3234:1: ( rule__SortDefinition__DefinitionsAssignment_2 )
            // InternalEventCalculus.g:3234:2: rule__SortDefinition__DefinitionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SortDefinition__DefinitionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group__2__Impl"


    // $ANTLR start "rule__SortDefinition__Group__3"
    // InternalEventCalculus.g:3244:1: rule__SortDefinition__Group__3 : rule__SortDefinition__Group__3__Impl ;
    public final void rule__SortDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3248:1: ( rule__SortDefinition__Group__3__Impl )
            // InternalEventCalculus.g:3249:2: rule__SortDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SortDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group__3"


    // $ANTLR start "rule__SortDefinition__Group__3__Impl"
    // InternalEventCalculus.g:3255:1: rule__SortDefinition__Group__3__Impl : ( ( rule__SortDefinition__Group_3__0 )* ) ;
    public final void rule__SortDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3259:1: ( ( ( rule__SortDefinition__Group_3__0 )* ) )
            // InternalEventCalculus.g:3260:1: ( ( rule__SortDefinition__Group_3__0 )* )
            {
            // InternalEventCalculus.g:3260:1: ( ( rule__SortDefinition__Group_3__0 )* )
            // InternalEventCalculus.g:3261:1: ( rule__SortDefinition__Group_3__0 )*
            {
             before(grammarAccess.getSortDefinitionAccess().getGroup_3()); 
            // InternalEventCalculus.g:3262:1: ( rule__SortDefinition__Group_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==26) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalEventCalculus.g:3262:2: rule__SortDefinition__Group_3__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__SortDefinition__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

             after(grammarAccess.getSortDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group__3__Impl"


    // $ANTLR start "rule__SortDefinition__Group_3__0"
    // InternalEventCalculus.g:3280:1: rule__SortDefinition__Group_3__0 : rule__SortDefinition__Group_3__0__Impl rule__SortDefinition__Group_3__1 ;
    public final void rule__SortDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3284:1: ( rule__SortDefinition__Group_3__0__Impl rule__SortDefinition__Group_3__1 )
            // InternalEventCalculus.g:3285:2: rule__SortDefinition__Group_3__0__Impl rule__SortDefinition__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__SortDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SortDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group_3__0"


    // $ANTLR start "rule__SortDefinition__Group_3__0__Impl"
    // InternalEventCalculus.g:3292:1: rule__SortDefinition__Group_3__0__Impl : ( ',' ) ;
    public final void rule__SortDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3296:1: ( ( ',' ) )
            // InternalEventCalculus.g:3297:1: ( ',' )
            {
            // InternalEventCalculus.g:3297:1: ( ',' )
            // InternalEventCalculus.g:3298:1: ','
            {
             before(grammarAccess.getSortDefinitionAccess().getCommaKeyword_3_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSortDefinitionAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__SortDefinition__Group_3__1"
    // InternalEventCalculus.g:3311:1: rule__SortDefinition__Group_3__1 : rule__SortDefinition__Group_3__1__Impl ;
    public final void rule__SortDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3315:1: ( rule__SortDefinition__Group_3__1__Impl )
            // InternalEventCalculus.g:3316:2: rule__SortDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SortDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group_3__1"


    // $ANTLR start "rule__SortDefinition__Group_3__1__Impl"
    // InternalEventCalculus.g:3322:1: rule__SortDefinition__Group_3__1__Impl : ( ( rule__SortDefinition__DefinitionsAssignment_3_1 ) ) ;
    public final void rule__SortDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3326:1: ( ( ( rule__SortDefinition__DefinitionsAssignment_3_1 ) ) )
            // InternalEventCalculus.g:3327:1: ( ( rule__SortDefinition__DefinitionsAssignment_3_1 ) )
            {
            // InternalEventCalculus.g:3327:1: ( ( rule__SortDefinition__DefinitionsAssignment_3_1 ) )
            // InternalEventCalculus.g:3328:1: ( rule__SortDefinition__DefinitionsAssignment_3_1 )
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_3_1()); 
            // InternalEventCalculus.g:3329:1: ( rule__SortDefinition__DefinitionsAssignment_3_1 )
            // InternalEventCalculus.g:3329:2: rule__SortDefinition__DefinitionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SortDefinition__DefinitionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSortDefinitionAccess().getDefinitionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__Definition__Group__0"
    // InternalEventCalculus.g:3343:1: rule__Definition__Group__0 : rule__Definition__Group__0__Impl rule__Definition__Group__1 ;
    public final void rule__Definition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3347:1: ( rule__Definition__Group__0__Impl rule__Definition__Group__1 )
            // InternalEventCalculus.g:3348:2: rule__Definition__Group__0__Impl rule__Definition__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__Definition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__0"


    // $ANTLR start "rule__Definition__Group__0__Impl"
    // InternalEventCalculus.g:3355:1: rule__Definition__Group__0__Impl : ( ( rule__Definition__NameAssignment_0 ) ) ;
    public final void rule__Definition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3359:1: ( ( ( rule__Definition__NameAssignment_0 ) ) )
            // InternalEventCalculus.g:3360:1: ( ( rule__Definition__NameAssignment_0 ) )
            {
            // InternalEventCalculus.g:3360:1: ( ( rule__Definition__NameAssignment_0 ) )
            // InternalEventCalculus.g:3361:1: ( rule__Definition__NameAssignment_0 )
            {
             before(grammarAccess.getDefinitionAccess().getNameAssignment_0()); 
            // InternalEventCalculus.g:3362:1: ( rule__Definition__NameAssignment_0 )
            // InternalEventCalculus.g:3362:2: rule__Definition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Definition__NameAssignment_0();

            state._fsp--;


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
    // $ANTLR end "rule__Definition__Group__0__Impl"


    // $ANTLR start "rule__Definition__Group__1"
    // InternalEventCalculus.g:3372:1: rule__Definition__Group__1 : rule__Definition__Group__1__Impl rule__Definition__Group__2 ;
    public final void rule__Definition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3376:1: ( rule__Definition__Group__1__Impl rule__Definition__Group__2 )
            // InternalEventCalculus.g:3377:2: rule__Definition__Group__1__Impl rule__Definition__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__Definition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__1"


    // $ANTLR start "rule__Definition__Group__1__Impl"
    // InternalEventCalculus.g:3384:1: rule__Definition__Group__1__Impl : ( ( rule__Definition__Group_1__0 )? ) ;
    public final void rule__Definition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3388:1: ( ( ( rule__Definition__Group_1__0 )? ) )
            // InternalEventCalculus.g:3389:1: ( ( rule__Definition__Group_1__0 )? )
            {
            // InternalEventCalculus.g:3389:1: ( ( rule__Definition__Group_1__0 )? )
            // InternalEventCalculus.g:3390:1: ( rule__Definition__Group_1__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_1()); 
            // InternalEventCalculus.g:3391:1: ( rule__Definition__Group_1__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==30) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==RULE_ID) ) {
                    int LA36_3 = input.LA(3);

                    if ( (LA36_3==26) ) {
                        alt36=1;
                    }
                    else if ( (LA36_3==31) ) {
                        int LA36_5 = input.LA(4);

                        if ( (LA36_5==EOF||(LA36_5>=RULE_STRING && LA36_5<=RULE_BOOLEAN)||LA36_5==12||(LA36_5>=15 && LA36_5<=16)||LA36_5==18||(LA36_5>=20 && LA36_5<=28)||LA36_5==30||LA36_5==32||LA36_5==34||LA36_5==53) ) {
                            alt36=1;
                        }
                        else if ( (LA36_5==48) ) {
                            int LA36_6 = input.LA(5);

                            if ( (LA36_6==RULE_INT) ) {
                                alt36=1;
                            }
                        }
                    }
                }
                else if ( (LA36_1==26||LA36_1==31) ) {
                    alt36=1;
                }
            }
            switch (alt36) {
                case 1 :
                    // InternalEventCalculus.g:3391:2: rule__Definition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Definition__Group__1__Impl"


    // $ANTLR start "rule__Definition__Group__2"
    // InternalEventCalculus.g:3401:1: rule__Definition__Group__2 : rule__Definition__Group__2__Impl ;
    public final void rule__Definition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3405:1: ( rule__Definition__Group__2__Impl )
            // InternalEventCalculus.g:3406:2: rule__Definition__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group__2"


    // $ANTLR start "rule__Definition__Group__2__Impl"
    // InternalEventCalculus.g:3412:1: rule__Definition__Group__2__Impl : ( ( rule__Definition__Group_2__0 )? ) ;
    public final void rule__Definition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3416:1: ( ( ( rule__Definition__Group_2__0 )? ) )
            // InternalEventCalculus.g:3417:1: ( ( rule__Definition__Group_2__0 )? )
            {
            // InternalEventCalculus.g:3417:1: ( ( rule__Definition__Group_2__0 )? )
            // InternalEventCalculus.g:3418:1: ( rule__Definition__Group_2__0 )?
            {
             before(grammarAccess.getDefinitionAccess().getGroup_2()); 
            // InternalEventCalculus.g:3419:1: ( rule__Definition__Group_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==21) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEventCalculus.g:3419:2: rule__Definition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_2__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Definition__Group__2__Impl"


    // $ANTLR start "rule__Definition__Group_1__0"
    // InternalEventCalculus.g:3435:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3439:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalEventCalculus.g:3440:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Definition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0"


    // $ANTLR start "rule__Definition__Group_1__0__Impl"
    // InternalEventCalculus.g:3447:1: rule__Definition__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3451:1: ( ( '(' ) )
            // InternalEventCalculus.g:3452:1: ( '(' )
            {
            // InternalEventCalculus.g:3452:1: ( '(' )
            // InternalEventCalculus.g:3453:1: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // $ANTLR end "rule__Definition__Group_1__0__Impl"


    // $ANTLR start "rule__Definition__Group_1__1"
    // InternalEventCalculus.g:3466:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3470:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalEventCalculus.g:3471:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Definition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1"


    // $ANTLR start "rule__Definition__Group_1__1__Impl"
    // InternalEventCalculus.g:3478:1: rule__Definition__Group_1__1__Impl : ( ( rule__Definition__ArgsAssignment_1_1 )? ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3482:1: ( ( ( rule__Definition__ArgsAssignment_1_1 )? ) )
            // InternalEventCalculus.g:3483:1: ( ( rule__Definition__ArgsAssignment_1_1 )? )
            {
            // InternalEventCalculus.g:3483:1: ( ( rule__Definition__ArgsAssignment_1_1 )? )
            // InternalEventCalculus.g:3484:1: ( rule__Definition__ArgsAssignment_1_1 )?
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_1_1()); 
            // InternalEventCalculus.g:3485:1: ( rule__Definition__ArgsAssignment_1_1 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalEventCalculus.g:3485:2: rule__Definition__ArgsAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__ArgsAssignment_1_1();

                    state._fsp--;


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
    // $ANTLR end "rule__Definition__Group_1__1__Impl"


    // $ANTLR start "rule__Definition__Group_1__2"
    // InternalEventCalculus.g:3495:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3499:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalEventCalculus.g:3500:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
            {
            pushFollow(FOLLOW_27);
            rule__Definition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2"


    // $ANTLR start "rule__Definition__Group_1__2__Impl"
    // InternalEventCalculus.g:3507:1: rule__Definition__Group_1__2__Impl : ( ( rule__Definition__Group_1_2__0 )* ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3511:1: ( ( ( rule__Definition__Group_1_2__0 )* ) )
            // InternalEventCalculus.g:3512:1: ( ( rule__Definition__Group_1_2__0 )* )
            {
            // InternalEventCalculus.g:3512:1: ( ( rule__Definition__Group_1_2__0 )* )
            // InternalEventCalculus.g:3513:1: ( rule__Definition__Group_1_2__0 )*
            {
             before(grammarAccess.getDefinitionAccess().getGroup_1_2()); 
            // InternalEventCalculus.g:3514:1: ( rule__Definition__Group_1_2__0 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==26) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEventCalculus.g:3514:2: rule__Definition__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Definition__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "rule__Definition__Group_1__2__Impl"


    // $ANTLR start "rule__Definition__Group_1__3"
    // InternalEventCalculus.g:3524:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3528:1: ( rule__Definition__Group_1__3__Impl )
            // InternalEventCalculus.g:3529:2: rule__Definition__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3"


    // $ANTLR start "rule__Definition__Group_1__3__Impl"
    // InternalEventCalculus.g:3535:1: rule__Definition__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3539:1: ( ( ')' ) )
            // InternalEventCalculus.g:3540:1: ( ')' )
            {
            // InternalEventCalculus.g:3540:1: ( ')' )
            // InternalEventCalculus.g:3541:1: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_3()); 
            match(input,31,FOLLOW_2); 
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
    // $ANTLR end "rule__Definition__Group_1__3__Impl"


    // $ANTLR start "rule__Definition__Group_1_2__0"
    // InternalEventCalculus.g:3562:1: rule__Definition__Group_1_2__0 : rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 ;
    public final void rule__Definition__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3566:1: ( rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1 )
            // InternalEventCalculus.g:3567:2: rule__Definition__Group_1_2__0__Impl rule__Definition__Group_1_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Definition__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__0"


    // $ANTLR start "rule__Definition__Group_1_2__0__Impl"
    // InternalEventCalculus.g:3574:1: rule__Definition__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__Definition__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3578:1: ( ( ',' ) )
            // InternalEventCalculus.g:3579:1: ( ',' )
            {
            // InternalEventCalculus.g:3579:1: ( ',' )
            // InternalEventCalculus.g:3580:1: ','
            {
             before(grammarAccess.getDefinitionAccess().getCommaKeyword_1_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // $ANTLR end "rule__Definition__Group_1_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_1_2__1"
    // InternalEventCalculus.g:3593:1: rule__Definition__Group_1_2__1 : rule__Definition__Group_1_2__1__Impl ;
    public final void rule__Definition__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3597:1: ( rule__Definition__Group_1_2__1__Impl )
            // InternalEventCalculus.g:3598:2: rule__Definition__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1_2__1"


    // $ANTLR start "rule__Definition__Group_1_2__1__Impl"
    // InternalEventCalculus.g:3604:1: rule__Definition__Group_1_2__1__Impl : ( ( rule__Definition__ArgsAssignment_1_2_1 ) ) ;
    public final void rule__Definition__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3608:1: ( ( ( rule__Definition__ArgsAssignment_1_2_1 ) ) )
            // InternalEventCalculus.g:3609:1: ( ( rule__Definition__ArgsAssignment_1_2_1 ) )
            {
            // InternalEventCalculus.g:3609:1: ( ( rule__Definition__ArgsAssignment_1_2_1 ) )
            // InternalEventCalculus.g:3610:1: ( rule__Definition__ArgsAssignment_1_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getArgsAssignment_1_2_1()); 
            // InternalEventCalculus.g:3611:1: ( rule__Definition__ArgsAssignment_1_2_1 )
            // InternalEventCalculus.g:3611:2: rule__Definition__ArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ArgsAssignment_1_2_1();

            state._fsp--;


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
    // $ANTLR end "rule__Definition__Group_1_2__1__Impl"


    // $ANTLR start "rule__Definition__Group_2__0"
    // InternalEventCalculus.g:3625:1: rule__Definition__Group_2__0 : rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 ;
    public final void rule__Definition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3629:1: ( rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1 )
            // InternalEventCalculus.g:3630:2: rule__Definition__Group_2__0__Impl rule__Definition__Group_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Definition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__0"


    // $ANTLR start "rule__Definition__Group_2__0__Impl"
    // InternalEventCalculus.g:3637:1: rule__Definition__Group_2__0__Impl : ( ':' ) ;
    public final void rule__Definition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3641:1: ( ( ':' ) )
            // InternalEventCalculus.g:3642:1: ( ':' )
            {
            // InternalEventCalculus.g:3642:1: ( ':' )
            // InternalEventCalculus.g:3643:1: ':'
            {
             before(grammarAccess.getDefinitionAccess().getColonKeyword_2_0()); 
            match(input,21,FOLLOW_2); 
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
    // $ANTLR end "rule__Definition__Group_2__0__Impl"


    // $ANTLR start "rule__Definition__Group_2__1"
    // InternalEventCalculus.g:3656:1: rule__Definition__Group_2__1 : rule__Definition__Group_2__1__Impl ;
    public final void rule__Definition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3660:1: ( rule__Definition__Group_2__1__Impl )
            // InternalEventCalculus.g:3661:2: rule__Definition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_2__1"


    // $ANTLR start "rule__Definition__Group_2__1__Impl"
    // InternalEventCalculus.g:3667:1: rule__Definition__Group_2__1__Impl : ( ( rule__Definition__ReturnAssignment_2_1 ) ) ;
    public final void rule__Definition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3671:1: ( ( ( rule__Definition__ReturnAssignment_2_1 ) ) )
            // InternalEventCalculus.g:3672:1: ( ( rule__Definition__ReturnAssignment_2_1 ) )
            {
            // InternalEventCalculus.g:3672:1: ( ( rule__Definition__ReturnAssignment_2_1 ) )
            // InternalEventCalculus.g:3673:1: ( rule__Definition__ReturnAssignment_2_1 )
            {
             before(grammarAccess.getDefinitionAccess().getReturnAssignment_2_1()); 
            // InternalEventCalculus.g:3674:1: ( rule__Definition__ReturnAssignment_2_1 )
            // InternalEventCalculus.g:3674:2: rule__Definition__ReturnAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ReturnAssignment_2_1();

            state._fsp--;


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
    // $ANTLR end "rule__Definition__Group_2__1__Impl"


    // $ANTLR start "rule__Expression__Group_1__0"
    // InternalEventCalculus.g:3688:1: rule__Expression__Group_1__0 : rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 ;
    public final void rule__Expression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3692:1: ( rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1 )
            // InternalEventCalculus.g:3693:2: rule__Expression__Group_1__0__Impl rule__Expression__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__Expression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__0"


    // $ANTLR start "rule__Expression__Group_1__0__Impl"
    // InternalEventCalculus.g:3700:1: rule__Expression__Group_1__0__Impl : ( ( rule__Expression__QualifiersAssignment_1_0 ) ) ;
    public final void rule__Expression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3704:1: ( ( ( rule__Expression__QualifiersAssignment_1_0 ) ) )
            // InternalEventCalculus.g:3705:1: ( ( rule__Expression__QualifiersAssignment_1_0 ) )
            {
            // InternalEventCalculus.g:3705:1: ( ( rule__Expression__QualifiersAssignment_1_0 ) )
            // InternalEventCalculus.g:3706:1: ( rule__Expression__QualifiersAssignment_1_0 )
            {
             before(grammarAccess.getExpressionAccess().getQualifiersAssignment_1_0()); 
            // InternalEventCalculus.g:3707:1: ( rule__Expression__QualifiersAssignment_1_0 )
            // InternalEventCalculus.g:3707:2: rule__Expression__QualifiersAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Expression__QualifiersAssignment_1_0();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_1__0__Impl"


    // $ANTLR start "rule__Expression__Group_1__1"
    // InternalEventCalculus.g:3717:1: rule__Expression__Group_1__1 : rule__Expression__Group_1__1__Impl ;
    public final void rule__Expression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3721:1: ( rule__Expression__Group_1__1__Impl )
            // InternalEventCalculus.g:3722:2: rule__Expression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Group_1__1"


    // $ANTLR start "rule__Expression__Group_1__1__Impl"
    // InternalEventCalculus.g:3728:1: rule__Expression__Group_1__1__Impl : ( ( rule__Expression__ExprAssignment_1_1 ) ) ;
    public final void rule__Expression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3732:1: ( ( ( rule__Expression__ExprAssignment_1_1 ) ) )
            // InternalEventCalculus.g:3733:1: ( ( rule__Expression__ExprAssignment_1_1 ) )
            {
            // InternalEventCalculus.g:3733:1: ( ( rule__Expression__ExprAssignment_1_1 ) )
            // InternalEventCalculus.g:3734:1: ( rule__Expression__ExprAssignment_1_1 )
            {
             before(grammarAccess.getExpressionAccess().getExprAssignment_1_1()); 
            // InternalEventCalculus.g:3735:1: ( rule__Expression__ExprAssignment_1_1 )
            // InternalEventCalculus.g:3735:2: rule__Expression__ExprAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Expression__ExprAssignment_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__Expression__Group_1__1__Impl"


    // $ANTLR start "rule__Parameters__Group__0"
    // InternalEventCalculus.g:3749:1: rule__Parameters__Group__0 : rule__Parameters__Group__0__Impl rule__Parameters__Group__1 ;
    public final void rule__Parameters__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3753:1: ( rule__Parameters__Group__0__Impl rule__Parameters__Group__1 )
            // InternalEventCalculus.g:3754:2: rule__Parameters__Group__0__Impl rule__Parameters__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Parameters__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__0"


    // $ANTLR start "rule__Parameters__Group__0__Impl"
    // InternalEventCalculus.g:3761:1: rule__Parameters__Group__0__Impl : ( ( rule__Parameters__NamesAssignment_0 ) ) ;
    public final void rule__Parameters__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3765:1: ( ( ( rule__Parameters__NamesAssignment_0 ) ) )
            // InternalEventCalculus.g:3766:1: ( ( rule__Parameters__NamesAssignment_0 ) )
            {
            // InternalEventCalculus.g:3766:1: ( ( rule__Parameters__NamesAssignment_0 ) )
            // InternalEventCalculus.g:3767:1: ( rule__Parameters__NamesAssignment_0 )
            {
             before(grammarAccess.getParametersAccess().getNamesAssignment_0()); 
            // InternalEventCalculus.g:3768:1: ( rule__Parameters__NamesAssignment_0 )
            // InternalEventCalculus.g:3768:2: rule__Parameters__NamesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__NamesAssignment_0();

            state._fsp--;


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
    // $ANTLR end "rule__Parameters__Group__0__Impl"


    // $ANTLR start "rule__Parameters__Group__1"
    // InternalEventCalculus.g:3778:1: rule__Parameters__Group__1 : rule__Parameters__Group__1__Impl ;
    public final void rule__Parameters__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3782:1: ( rule__Parameters__Group__1__Impl )
            // InternalEventCalculus.g:3783:2: rule__Parameters__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group__1"


    // $ANTLR start "rule__Parameters__Group__1__Impl"
    // InternalEventCalculus.g:3789:1: rule__Parameters__Group__1__Impl : ( ( rule__Parameters__Group_1__0 )* ) ;
    public final void rule__Parameters__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3793:1: ( ( ( rule__Parameters__Group_1__0 )* ) )
            // InternalEventCalculus.g:3794:1: ( ( rule__Parameters__Group_1__0 )* )
            {
            // InternalEventCalculus.g:3794:1: ( ( rule__Parameters__Group_1__0 )* )
            // InternalEventCalculus.g:3795:1: ( rule__Parameters__Group_1__0 )*
            {
             before(grammarAccess.getParametersAccess().getGroup_1()); 
            // InternalEventCalculus.g:3796:1: ( rule__Parameters__Group_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==26) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalEventCalculus.g:3796:2: rule__Parameters__Group_1__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__Parameters__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "rule__Parameters__Group__1__Impl"


    // $ANTLR start "rule__Parameters__Group_1__0"
    // InternalEventCalculus.g:3810:1: rule__Parameters__Group_1__0 : rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 ;
    public final void rule__Parameters__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3814:1: ( rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1 )
            // InternalEventCalculus.g:3815:2: rule__Parameters__Group_1__0__Impl rule__Parameters__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Parameters__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parameters__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group_1__0"


    // $ANTLR start "rule__Parameters__Group_1__0__Impl"
    // InternalEventCalculus.g:3822:1: rule__Parameters__Group_1__0__Impl : ( ',' ) ;
    public final void rule__Parameters__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3826:1: ( ( ',' ) )
            // InternalEventCalculus.g:3827:1: ( ',' )
            {
            // InternalEventCalculus.g:3827:1: ( ',' )
            // InternalEventCalculus.g:3828:1: ','
            {
             before(grammarAccess.getParametersAccess().getCommaKeyword_1_0()); 
            match(input,26,FOLLOW_2); 
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
    // $ANTLR end "rule__Parameters__Group_1__0__Impl"


    // $ANTLR start "rule__Parameters__Group_1__1"
    // InternalEventCalculus.g:3841:1: rule__Parameters__Group_1__1 : rule__Parameters__Group_1__1__Impl ;
    public final void rule__Parameters__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3845:1: ( rule__Parameters__Group_1__1__Impl )
            // InternalEventCalculus.g:3846:2: rule__Parameters__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameters__Group_1__1"


    // $ANTLR start "rule__Parameters__Group_1__1__Impl"
    // InternalEventCalculus.g:3852:1: rule__Parameters__Group_1__1__Impl : ( ( rule__Parameters__NamesAssignment_1_1 ) ) ;
    public final void rule__Parameters__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3856:1: ( ( ( rule__Parameters__NamesAssignment_1_1 ) ) )
            // InternalEventCalculus.g:3857:1: ( ( rule__Parameters__NamesAssignment_1_1 ) )
            {
            // InternalEventCalculus.g:3857:1: ( ( rule__Parameters__NamesAssignment_1_1 ) )
            // InternalEventCalculus.g:3858:1: ( rule__Parameters__NamesAssignment_1_1 )
            {
             before(grammarAccess.getParametersAccess().getNamesAssignment_1_1()); 
            // InternalEventCalculus.g:3859:1: ( rule__Parameters__NamesAssignment_1_1 )
            // InternalEventCalculus.g:3859:2: rule__Parameters__NamesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Parameters__NamesAssignment_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__Parameters__Group_1__1__Impl"


    // $ANTLR start "rule__Exists__Group__0"
    // InternalEventCalculus.g:3873:1: rule__Exists__Group__0 : rule__Exists__Group__0__Impl rule__Exists__Group__1 ;
    public final void rule__Exists__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3877:1: ( rule__Exists__Group__0__Impl rule__Exists__Group__1 )
            // InternalEventCalculus.g:3878:2: rule__Exists__Group__0__Impl rule__Exists__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Exists__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exists__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exists__Group__0"


    // $ANTLR start "rule__Exists__Group__0__Impl"
    // InternalEventCalculus.g:3885:1: rule__Exists__Group__0__Impl : ( ( rule__Exists__OpAssignment_0 )? ) ;
    public final void rule__Exists__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3889:1: ( ( ( rule__Exists__OpAssignment_0 )? ) )
            // InternalEventCalculus.g:3890:1: ( ( rule__Exists__OpAssignment_0 )? )
            {
            // InternalEventCalculus.g:3890:1: ( ( rule__Exists__OpAssignment_0 )? )
            // InternalEventCalculus.g:3891:1: ( rule__Exists__OpAssignment_0 )?
            {
             before(grammarAccess.getExistsAccess().getOpAssignment_0()); 
            // InternalEventCalculus.g:3892:1: ( rule__Exists__OpAssignment_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==12) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEventCalculus.g:3892:2: rule__Exists__OpAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exists__OpAssignment_0();

                    state._fsp--;


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
    // $ANTLR end "rule__Exists__Group__0__Impl"


    // $ANTLR start "rule__Exists__Group__1"
    // InternalEventCalculus.g:3902:1: rule__Exists__Group__1 : rule__Exists__Group__1__Impl rule__Exists__Group__2 ;
    public final void rule__Exists__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3906:1: ( rule__Exists__Group__1__Impl rule__Exists__Group__2 )
            // InternalEventCalculus.g:3907:2: rule__Exists__Group__1__Impl rule__Exists__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Exists__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exists__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exists__Group__1"


    // $ANTLR start "rule__Exists__Group__1__Impl"
    // InternalEventCalculus.g:3914:1: rule__Exists__Group__1__Impl : ( '{' ) ;
    public final void rule__Exists__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3918:1: ( ( '{' ) )
            // InternalEventCalculus.g:3919:1: ( '{' )
            {
            // InternalEventCalculus.g:3919:1: ( '{' )
            // InternalEventCalculus.g:3920:1: '{'
            {
             before(grammarAccess.getExistsAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // $ANTLR end "rule__Exists__Group__1__Impl"


    // $ANTLR start "rule__Exists__Group__2"
    // InternalEventCalculus.g:3933:1: rule__Exists__Group__2 : rule__Exists__Group__2__Impl rule__Exists__Group__3 ;
    public final void rule__Exists__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3937:1: ( rule__Exists__Group__2__Impl rule__Exists__Group__3 )
            // InternalEventCalculus.g:3938:2: rule__Exists__Group__2__Impl rule__Exists__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Exists__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exists__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exists__Group__2"


    // $ANTLR start "rule__Exists__Group__2__Impl"
    // InternalEventCalculus.g:3945:1: rule__Exists__Group__2__Impl : ( ( rule__Exists__ParametersAssignment_2 ) ) ;
    public final void rule__Exists__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3949:1: ( ( ( rule__Exists__ParametersAssignment_2 ) ) )
            // InternalEventCalculus.g:3950:1: ( ( rule__Exists__ParametersAssignment_2 ) )
            {
            // InternalEventCalculus.g:3950:1: ( ( rule__Exists__ParametersAssignment_2 ) )
            // InternalEventCalculus.g:3951:1: ( rule__Exists__ParametersAssignment_2 )
            {
             before(grammarAccess.getExistsAccess().getParametersAssignment_2()); 
            // InternalEventCalculus.g:3952:1: ( rule__Exists__ParametersAssignment_2 )
            // InternalEventCalculus.g:3952:2: rule__Exists__ParametersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Exists__ParametersAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__Exists__Group__2__Impl"


    // $ANTLR start "rule__Exists__Group__3"
    // InternalEventCalculus.g:3962:1: rule__Exists__Group__3 : rule__Exists__Group__3__Impl ;
    public final void rule__Exists__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3966:1: ( rule__Exists__Group__3__Impl )
            // InternalEventCalculus.g:3967:2: rule__Exists__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exists__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exists__Group__3"


    // $ANTLR start "rule__Exists__Group__3__Impl"
    // InternalEventCalculus.g:3973:1: rule__Exists__Group__3__Impl : ( '}' ) ;
    public final void rule__Exists__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:3977:1: ( ( '}' ) )
            // InternalEventCalculus.g:3978:1: ( '}' )
            {
            // InternalEventCalculus.g:3978:1: ( '}' )
            // InternalEventCalculus.g:3979:1: '}'
            {
             before(grammarAccess.getExistsAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_2); 
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
    // $ANTLR end "rule__Exists__Group__3__Impl"


    // $ANTLR start "rule__Forall__Group__0"
    // InternalEventCalculus.g:4000:1: rule__Forall__Group__0 : rule__Forall__Group__0__Impl rule__Forall__Group__1 ;
    public final void rule__Forall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4004:1: ( rule__Forall__Group__0__Impl rule__Forall__Group__1 )
            // InternalEventCalculus.g:4005:2: rule__Forall__Group__0__Impl rule__Forall__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Forall__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forall__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forall__Group__0"


    // $ANTLR start "rule__Forall__Group__0__Impl"
    // InternalEventCalculus.g:4012:1: rule__Forall__Group__0__Impl : ( ( rule__Forall__OpAssignment_0 )? ) ;
    public final void rule__Forall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4016:1: ( ( ( rule__Forall__OpAssignment_0 )? ) )
            // InternalEventCalculus.g:4017:1: ( ( rule__Forall__OpAssignment_0 )? )
            {
            // InternalEventCalculus.g:4017:1: ( ( rule__Forall__OpAssignment_0 )? )
            // InternalEventCalculus.g:4018:1: ( rule__Forall__OpAssignment_0 )?
            {
             before(grammarAccess.getForallAccess().getOpAssignment_0()); 
            // InternalEventCalculus.g:4019:1: ( rule__Forall__OpAssignment_0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalEventCalculus.g:4019:2: rule__Forall__OpAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Forall__OpAssignment_0();

                    state._fsp--;


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
    // $ANTLR end "rule__Forall__Group__0__Impl"


    // $ANTLR start "rule__Forall__Group__1"
    // InternalEventCalculus.g:4029:1: rule__Forall__Group__1 : rule__Forall__Group__1__Impl rule__Forall__Group__2 ;
    public final void rule__Forall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4033:1: ( rule__Forall__Group__1__Impl rule__Forall__Group__2 )
            // InternalEventCalculus.g:4034:2: rule__Forall__Group__1__Impl rule__Forall__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Forall__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forall__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forall__Group__1"


    // $ANTLR start "rule__Forall__Group__1__Impl"
    // InternalEventCalculus.g:4041:1: rule__Forall__Group__1__Impl : ( '[' ) ;
    public final void rule__Forall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4045:1: ( ( '[' ) )
            // InternalEventCalculus.g:4046:1: ( '[' )
            {
            // InternalEventCalculus.g:4046:1: ( '[' )
            // InternalEventCalculus.g:4047:1: '['
            {
             before(grammarAccess.getForallAccess().getLeftSquareBracketKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // $ANTLR end "rule__Forall__Group__1__Impl"


    // $ANTLR start "rule__Forall__Group__2"
    // InternalEventCalculus.g:4060:1: rule__Forall__Group__2 : rule__Forall__Group__2__Impl rule__Forall__Group__3 ;
    public final void rule__Forall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4064:1: ( rule__Forall__Group__2__Impl rule__Forall__Group__3 )
            // InternalEventCalculus.g:4065:2: rule__Forall__Group__2__Impl rule__Forall__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Forall__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Forall__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forall__Group__2"


    // $ANTLR start "rule__Forall__Group__2__Impl"
    // InternalEventCalculus.g:4072:1: rule__Forall__Group__2__Impl : ( ( rule__Forall__ParametersAssignment_2 ) ) ;
    public final void rule__Forall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4076:1: ( ( ( rule__Forall__ParametersAssignment_2 ) ) )
            // InternalEventCalculus.g:4077:1: ( ( rule__Forall__ParametersAssignment_2 ) )
            {
            // InternalEventCalculus.g:4077:1: ( ( rule__Forall__ParametersAssignment_2 ) )
            // InternalEventCalculus.g:4078:1: ( rule__Forall__ParametersAssignment_2 )
            {
             before(grammarAccess.getForallAccess().getParametersAssignment_2()); 
            // InternalEventCalculus.g:4079:1: ( rule__Forall__ParametersAssignment_2 )
            // InternalEventCalculus.g:4079:2: rule__Forall__ParametersAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Forall__ParametersAssignment_2();

            state._fsp--;


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
    // $ANTLR end "rule__Forall__Group__2__Impl"


    // $ANTLR start "rule__Forall__Group__3"
    // InternalEventCalculus.g:4089:1: rule__Forall__Group__3 : rule__Forall__Group__3__Impl ;
    public final void rule__Forall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4093:1: ( rule__Forall__Group__3__Impl )
            // InternalEventCalculus.g:4094:2: rule__Forall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Forall__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Forall__Group__3"


    // $ANTLR start "rule__Forall__Group__3__Impl"
    // InternalEventCalculus.g:4100:1: rule__Forall__Group__3__Impl : ( ']' ) ;
    public final void rule__Forall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4104:1: ( ( ']' ) )
            // InternalEventCalculus.g:4105:1: ( ']' )
            {
            // InternalEventCalculus.g:4105:1: ( ']' )
            // InternalEventCalculus.g:4106:1: ']'
            {
             before(grammarAccess.getForallAccess().getRightSquareBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // $ANTLR end "rule__Forall__Group__3__Impl"


    // $ANTLR start "rule__AssignmentOp__Group__0"
    // InternalEventCalculus.g:4127:1: rule__AssignmentOp__Group__0 : rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 ;
    public final void rule__AssignmentOp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4131:1: ( rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1 )
            // InternalEventCalculus.g:4132:2: rule__AssignmentOp__Group__0__Impl rule__AssignmentOp__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__AssignmentOp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOp__Group__0"


    // $ANTLR start "rule__AssignmentOp__Group__0__Impl"
    // InternalEventCalculus.g:4139:1: rule__AssignmentOp__Group__0__Impl : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4143:1: ( ( ruleOrExp ) )
            // InternalEventCalculus.g:4144:1: ( ruleOrExp )
            {
            // InternalEventCalculus.g:4144:1: ( ruleOrExp )
            // InternalEventCalculus.g:4145:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getOrExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExp();

            state._fsp--;

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
    // $ANTLR end "rule__AssignmentOp__Group__0__Impl"


    // $ANTLR start "rule__AssignmentOp__Group__1"
    // InternalEventCalculus.g:4156:1: rule__AssignmentOp__Group__1 : rule__AssignmentOp__Group__1__Impl ;
    public final void rule__AssignmentOp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4160:1: ( rule__AssignmentOp__Group__1__Impl )
            // InternalEventCalculus.g:4161:2: rule__AssignmentOp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOp__Group__1"


    // $ANTLR start "rule__AssignmentOp__Group__1__Impl"
    // InternalEventCalculus.g:4167:1: rule__AssignmentOp__Group__1__Impl : ( ( rule__AssignmentOp__Group_1__0 )? ) ;
    public final void rule__AssignmentOp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4171:1: ( ( ( rule__AssignmentOp__Group_1__0 )? ) )
            // InternalEventCalculus.g:4172:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            {
            // InternalEventCalculus.g:4172:1: ( ( rule__AssignmentOp__Group_1__0 )? )
            // InternalEventCalculus.g:4173:1: ( rule__AssignmentOp__Group_1__0 )?
            {
             before(grammarAccess.getAssignmentOpAccess().getGroup_1()); 
            // InternalEventCalculus.g:4174:1: ( rule__AssignmentOp__Group_1__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=36 && LA43_0<=37)) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalEventCalculus.g:4174:2: rule__AssignmentOp__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssignmentOp__Group_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__AssignmentOp__Group__1__Impl"


    // $ANTLR start "rule__AssignmentOp__Group_1__0"
    // InternalEventCalculus.g:4188:1: rule__AssignmentOp__Group_1__0 : rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 ;
    public final void rule__AssignmentOp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4192:1: ( rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1 )
            // InternalEventCalculus.g:4193:2: rule__AssignmentOp__Group_1__0__Impl rule__AssignmentOp__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__AssignmentOp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOp__Group_1__0"


    // $ANTLR start "rule__AssignmentOp__Group_1__0__Impl"
    // InternalEventCalculus.g:4200:1: rule__AssignmentOp__Group_1__0__Impl : ( ( rule__AssignmentOp__Alternatives_1_0 ) ) ;
    public final void rule__AssignmentOp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4204:1: ( ( ( rule__AssignmentOp__Alternatives_1_0 ) ) )
            // InternalEventCalculus.g:4205:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            {
            // InternalEventCalculus.g:4205:1: ( ( rule__AssignmentOp__Alternatives_1_0 ) )
            // InternalEventCalculus.g:4206:1: ( rule__AssignmentOp__Alternatives_1_0 )
            {
             before(grammarAccess.getAssignmentOpAccess().getAlternatives_1_0()); 
            // InternalEventCalculus.g:4207:1: ( rule__AssignmentOp__Alternatives_1_0 )
            // InternalEventCalculus.g:4207:2: rule__AssignmentOp__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Alternatives_1_0();

            state._fsp--;


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
    // $ANTLR end "rule__AssignmentOp__Group_1__0__Impl"


    // $ANTLR start "rule__AssignmentOp__Group_1__1"
    // InternalEventCalculus.g:4217:1: rule__AssignmentOp__Group_1__1 : rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2 ;
    public final void rule__AssignmentOp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4221:1: ( rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2 )
            // InternalEventCalculus.g:4222:2: rule__AssignmentOp__Group_1__1__Impl rule__AssignmentOp__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__AssignmentOp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOp__Group_1__1"


    // $ANTLR start "rule__AssignmentOp__Group_1__1__Impl"
    // InternalEventCalculus.g:4229:1: rule__AssignmentOp__Group_1__1__Impl : ( ( rule__AssignmentOp__QAssignment_1_1 )? ) ;
    public final void rule__AssignmentOp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4233:1: ( ( ( rule__AssignmentOp__QAssignment_1_1 )? ) )
            // InternalEventCalculus.g:4234:1: ( ( rule__AssignmentOp__QAssignment_1_1 )? )
            {
            // InternalEventCalculus.g:4234:1: ( ( rule__AssignmentOp__QAssignment_1_1 )? )
            // InternalEventCalculus.g:4235:1: ( rule__AssignmentOp__QAssignment_1_1 )?
            {
             before(grammarAccess.getAssignmentOpAccess().getQAssignment_1_1()); 
            // InternalEventCalculus.g:4236:1: ( rule__AssignmentOp__QAssignment_1_1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==12) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==32||LA44_1==34) ) {
                    alt44=1;
                }
            }
            else if ( (LA44_0==32||LA44_0==34) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalEventCalculus.g:4236:2: rule__AssignmentOp__QAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AssignmentOp__QAssignment_1_1();

                    state._fsp--;


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
    // $ANTLR end "rule__AssignmentOp__Group_1__1__Impl"


    // $ANTLR start "rule__AssignmentOp__Group_1__2"
    // InternalEventCalculus.g:4246:1: rule__AssignmentOp__Group_1__2 : rule__AssignmentOp__Group_1__2__Impl ;
    public final void rule__AssignmentOp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4250:1: ( rule__AssignmentOp__Group_1__2__Impl )
            // InternalEventCalculus.g:4251:2: rule__AssignmentOp__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOp__Group_1__2"


    // $ANTLR start "rule__AssignmentOp__Group_1__2__Impl"
    // InternalEventCalculus.g:4257:1: rule__AssignmentOp__Group_1__2__Impl : ( ( rule__AssignmentOp__RightAssignment_1_2 ) ) ;
    public final void rule__AssignmentOp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4261:1: ( ( ( rule__AssignmentOp__RightAssignment_1_2 ) ) )
            // InternalEventCalculus.g:4262:1: ( ( rule__AssignmentOp__RightAssignment_1_2 ) )
            {
            // InternalEventCalculus.g:4262:1: ( ( rule__AssignmentOp__RightAssignment_1_2 ) )
            // InternalEventCalculus.g:4263:1: ( rule__AssignmentOp__RightAssignment_1_2 )
            {
             before(grammarAccess.getAssignmentOpAccess().getRightAssignment_1_2()); 
            // InternalEventCalculus.g:4264:1: ( rule__AssignmentOp__RightAssignment_1_2 )
            // InternalEventCalculus.g:4264:2: rule__AssignmentOp__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentOp__RightAssignment_1_2();

            state._fsp--;


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
    // $ANTLR end "rule__AssignmentOp__Group_1__2__Impl"


    // $ANTLR start "rule__AssignmentOp__Group_1_0_0__0"
    // InternalEventCalculus.g:4280:1: rule__AssignmentOp__Group_1_0_0__0 : rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 ;
    public final void rule__AssignmentOp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4284:1: ( rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1 )
            // InternalEventCalculus.g:4285:2: rule__AssignmentOp__Group_1_0_0__0__Impl rule__AssignmentOp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_32);
            rule__AssignmentOp__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOp__Group_1_0_0__0"


    // $ANTLR start "rule__AssignmentOp__Group_1_0_0__0__Impl"
    // InternalEventCalculus.g:4292:1: rule__AssignmentOp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4296:1: ( ( () ) )
            // InternalEventCalculus.g:4297:1: ( () )
            {
            // InternalEventCalculus.g:4297:1: ( () )
            // InternalEventCalculus.g:4298:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignPlusLeftAction_1_0_0_0()); 
            // InternalEventCalculus.g:4299:1: ()
            // InternalEventCalculus.g:4301:1: 
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
    // $ANTLR end "rule__AssignmentOp__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__AssignmentOp__Group_1_0_0__1"
    // InternalEventCalculus.g:4311:1: rule__AssignmentOp__Group_1_0_0__1 : rule__AssignmentOp__Group_1_0_0__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4315:1: ( rule__AssignmentOp__Group_1_0_0__1__Impl )
            // InternalEventCalculus.g:4316:2: rule__AssignmentOp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOp__Group_1_0_0__1"


    // $ANTLR start "rule__AssignmentOp__Group_1_0_0__1__Impl"
    // InternalEventCalculus.g:4322:1: rule__AssignmentOp__Group_1_0_0__1__Impl : ( '->' ) ;
    public final void rule__AssignmentOp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4326:1: ( ( '->' ) )
            // InternalEventCalculus.g:4327:1: ( '->' )
            {
            // InternalEventCalculus.g:4327:1: ( '->' )
            // InternalEventCalculus.g:4328:1: '->'
            {
             before(grammarAccess.getAssignmentOpAccess().getHyphenMinusGreaterThanSignKeyword_1_0_0_1()); 
            match(input,36,FOLLOW_2); 
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
    // $ANTLR end "rule__AssignmentOp__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__AssignmentOp__Group_1_0_1__0"
    // InternalEventCalculus.g:4345:1: rule__AssignmentOp__Group_1_0_1__0 : rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 ;
    public final void rule__AssignmentOp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4349:1: ( rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1 )
            // InternalEventCalculus.g:4350:2: rule__AssignmentOp__Group_1_0_1__0__Impl rule__AssignmentOp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_31);
            rule__AssignmentOp__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOp__Group_1_0_1__0"


    // $ANTLR start "rule__AssignmentOp__Group_1_0_1__0__Impl"
    // InternalEventCalculus.g:4357:1: rule__AssignmentOp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__AssignmentOp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4361:1: ( ( () ) )
            // InternalEventCalculus.g:4362:1: ( () )
            {
            // InternalEventCalculus.g:4362:1: ( () )
            // InternalEventCalculus.g:4363:1: ()
            {
             before(grammarAccess.getAssignmentOpAccess().getAssignMinLeftAction_1_0_1_0()); 
            // InternalEventCalculus.g:4364:1: ()
            // InternalEventCalculus.g:4366:1: 
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
    // $ANTLR end "rule__AssignmentOp__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__AssignmentOp__Group_1_0_1__1"
    // InternalEventCalculus.g:4376:1: rule__AssignmentOp__Group_1_0_1__1 : rule__AssignmentOp__Group_1_0_1__1__Impl ;
    public final void rule__AssignmentOp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4380:1: ( rule__AssignmentOp__Group_1_0_1__1__Impl )
            // InternalEventCalculus.g:4381:2: rule__AssignmentOp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AssignmentOp__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AssignmentOp__Group_1_0_1__1"


    // $ANTLR start "rule__AssignmentOp__Group_1_0_1__1__Impl"
    // InternalEventCalculus.g:4387:1: rule__AssignmentOp__Group_1_0_1__1__Impl : ( '<->' ) ;
    public final void rule__AssignmentOp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4391:1: ( ( '<->' ) )
            // InternalEventCalculus.g:4392:1: ( '<->' )
            {
            // InternalEventCalculus.g:4392:1: ( '<->' )
            // InternalEventCalculus.g:4393:1: '<->'
            {
             before(grammarAccess.getAssignmentOpAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_1_0_1_1()); 
            match(input,37,FOLLOW_2); 
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
    // $ANTLR end "rule__AssignmentOp__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__OrExp__Group__0"
    // InternalEventCalculus.g:4410:1: rule__OrExp__Group__0 : rule__OrExp__Group__0__Impl rule__OrExp__Group__1 ;
    public final void rule__OrExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4414:1: ( rule__OrExp__Group__0__Impl rule__OrExp__Group__1 )
            // InternalEventCalculus.g:4415:2: rule__OrExp__Group__0__Impl rule__OrExp__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__OrExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group__0"


    // $ANTLR start "rule__OrExp__Group__0__Impl"
    // InternalEventCalculus.g:4422:1: rule__OrExp__Group__0__Impl : ( ruleAndExp ) ;
    public final void rule__OrExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4426:1: ( ( ruleAndExp ) )
            // InternalEventCalculus.g:4427:1: ( ruleAndExp )
            {
            // InternalEventCalculus.g:4427:1: ( ruleAndExp )
            // InternalEventCalculus.g:4428:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getAndExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExp();

            state._fsp--;

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
    // $ANTLR end "rule__OrExp__Group__0__Impl"


    // $ANTLR start "rule__OrExp__Group__1"
    // InternalEventCalculus.g:4439:1: rule__OrExp__Group__1 : rule__OrExp__Group__1__Impl ;
    public final void rule__OrExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4443:1: ( rule__OrExp__Group__1__Impl )
            // InternalEventCalculus.g:4444:2: rule__OrExp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group__1"


    // $ANTLR start "rule__OrExp__Group__1__Impl"
    // InternalEventCalculus.g:4450:1: rule__OrExp__Group__1__Impl : ( ( rule__OrExp__Group_1__0 )* ) ;
    public final void rule__OrExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4454:1: ( ( ( rule__OrExp__Group_1__0 )* ) )
            // InternalEventCalculus.g:4455:1: ( ( rule__OrExp__Group_1__0 )* )
            {
            // InternalEventCalculus.g:4455:1: ( ( rule__OrExp__Group_1__0 )* )
            // InternalEventCalculus.g:4456:1: ( rule__OrExp__Group_1__0 )*
            {
             before(grammarAccess.getOrExpAccess().getGroup_1()); 
            // InternalEventCalculus.g:4457:1: ( rule__OrExp__Group_1__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==38) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalEventCalculus.g:4457:2: rule__OrExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_34);
            	    rule__OrExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop45;
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
    // $ANTLR end "rule__OrExp__Group__1__Impl"


    // $ANTLR start "rule__OrExp__Group_1__0"
    // InternalEventCalculus.g:4471:1: rule__OrExp__Group_1__0 : rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 ;
    public final void rule__OrExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4475:1: ( rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1 )
            // InternalEventCalculus.g:4476:2: rule__OrExp__Group_1__0__Impl rule__OrExp__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__OrExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group_1__0"


    // $ANTLR start "rule__OrExp__Group_1__0__Impl"
    // InternalEventCalculus.g:4483:1: rule__OrExp__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4487:1: ( ( () ) )
            // InternalEventCalculus.g:4488:1: ( () )
            {
            // InternalEventCalculus.g:4488:1: ( () )
            // InternalEventCalculus.g:4489:1: ()
            {
             before(grammarAccess.getOrExpAccess().getOrLeftAction_1_0()); 
            // InternalEventCalculus.g:4490:1: ()
            // InternalEventCalculus.g:4492:1: 
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
    // $ANTLR end "rule__OrExp__Group_1__0__Impl"


    // $ANTLR start "rule__OrExp__Group_1__1"
    // InternalEventCalculus.g:4502:1: rule__OrExp__Group_1__1 : rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 ;
    public final void rule__OrExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4506:1: ( rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2 )
            // InternalEventCalculus.g:4507:2: rule__OrExp__Group_1__1__Impl rule__OrExp__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__OrExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group_1__1"


    // $ANTLR start "rule__OrExp__Group_1__1__Impl"
    // InternalEventCalculus.g:4514:1: rule__OrExp__Group_1__1__Impl : ( '|' ) ;
    public final void rule__OrExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4518:1: ( ( '|' ) )
            // InternalEventCalculus.g:4519:1: ( '|' )
            {
            // InternalEventCalculus.g:4519:1: ( '|' )
            // InternalEventCalculus.g:4520:1: '|'
            {
             before(grammarAccess.getOrExpAccess().getVerticalLineKeyword_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // $ANTLR end "rule__OrExp__Group_1__1__Impl"


    // $ANTLR start "rule__OrExp__Group_1__2"
    // InternalEventCalculus.g:4533:1: rule__OrExp__Group_1__2 : rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3 ;
    public final void rule__OrExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4537:1: ( rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3 )
            // InternalEventCalculus.g:4538:2: rule__OrExp__Group_1__2__Impl rule__OrExp__Group_1__3
            {
            pushFollow(FOLLOW_3);
            rule__OrExp__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrExp__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group_1__2"


    // $ANTLR start "rule__OrExp__Group_1__2__Impl"
    // InternalEventCalculus.g:4545:1: rule__OrExp__Group_1__2__Impl : ( ( rule__OrExp__QAssignment_1_2 )? ) ;
    public final void rule__OrExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4549:1: ( ( ( rule__OrExp__QAssignment_1_2 )? ) )
            // InternalEventCalculus.g:4550:1: ( ( rule__OrExp__QAssignment_1_2 )? )
            {
            // InternalEventCalculus.g:4550:1: ( ( rule__OrExp__QAssignment_1_2 )? )
            // InternalEventCalculus.g:4551:1: ( rule__OrExp__QAssignment_1_2 )?
            {
             before(grammarAccess.getOrExpAccess().getQAssignment_1_2()); 
            // InternalEventCalculus.g:4552:1: ( rule__OrExp__QAssignment_1_2 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==12) ) {
                int LA46_1 = input.LA(2);

                if ( (LA46_1==32||LA46_1==34) ) {
                    alt46=1;
                }
            }
            else if ( (LA46_0==32||LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEventCalculus.g:4552:2: rule__OrExp__QAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrExp__QAssignment_1_2();

                    state._fsp--;


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
    // $ANTLR end "rule__OrExp__Group_1__2__Impl"


    // $ANTLR start "rule__OrExp__Group_1__3"
    // InternalEventCalculus.g:4562:1: rule__OrExp__Group_1__3 : rule__OrExp__Group_1__3__Impl ;
    public final void rule__OrExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4566:1: ( rule__OrExp__Group_1__3__Impl )
            // InternalEventCalculus.g:4567:2: rule__OrExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrExp__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExp__Group_1__3"


    // $ANTLR start "rule__OrExp__Group_1__3__Impl"
    // InternalEventCalculus.g:4573:1: rule__OrExp__Group_1__3__Impl : ( ( rule__OrExp__RightAssignment_1_3 ) ) ;
    public final void rule__OrExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4577:1: ( ( ( rule__OrExp__RightAssignment_1_3 ) ) )
            // InternalEventCalculus.g:4578:1: ( ( rule__OrExp__RightAssignment_1_3 ) )
            {
            // InternalEventCalculus.g:4578:1: ( ( rule__OrExp__RightAssignment_1_3 ) )
            // InternalEventCalculus.g:4579:1: ( rule__OrExp__RightAssignment_1_3 )
            {
             before(grammarAccess.getOrExpAccess().getRightAssignment_1_3()); 
            // InternalEventCalculus.g:4580:1: ( rule__OrExp__RightAssignment_1_3 )
            // InternalEventCalculus.g:4580:2: rule__OrExp__RightAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__OrExp__RightAssignment_1_3();

            state._fsp--;


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
    // $ANTLR end "rule__OrExp__Group_1__3__Impl"


    // $ANTLR start "rule__AndExp__Group__0"
    // InternalEventCalculus.g:4598:1: rule__AndExp__Group__0 : rule__AndExp__Group__0__Impl rule__AndExp__Group__1 ;
    public final void rule__AndExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4602:1: ( rule__AndExp__Group__0__Impl rule__AndExp__Group__1 )
            // InternalEventCalculus.g:4603:2: rule__AndExp__Group__0__Impl rule__AndExp__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__AndExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__0"


    // $ANTLR start "rule__AndExp__Group__0__Impl"
    // InternalEventCalculus.g:4610:1: rule__AndExp__Group__0__Impl : ( ruleRelational ) ;
    public final void rule__AndExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4614:1: ( ( ruleRelational ) )
            // InternalEventCalculus.g:4615:1: ( ruleRelational )
            {
            // InternalEventCalculus.g:4615:1: ( ruleRelational )
            // InternalEventCalculus.g:4616:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRelationalParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleRelational();

            state._fsp--;

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
    // $ANTLR end "rule__AndExp__Group__0__Impl"


    // $ANTLR start "rule__AndExp__Group__1"
    // InternalEventCalculus.g:4627:1: rule__AndExp__Group__1 : rule__AndExp__Group__1__Impl ;
    public final void rule__AndExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4631:1: ( rule__AndExp__Group__1__Impl )
            // InternalEventCalculus.g:4632:2: rule__AndExp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExp__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group__1"


    // $ANTLR start "rule__AndExp__Group__1__Impl"
    // InternalEventCalculus.g:4638:1: rule__AndExp__Group__1__Impl : ( ( rule__AndExp__Group_1__0 )* ) ;
    public final void rule__AndExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4642:1: ( ( ( rule__AndExp__Group_1__0 )* ) )
            // InternalEventCalculus.g:4643:1: ( ( rule__AndExp__Group_1__0 )* )
            {
            // InternalEventCalculus.g:4643:1: ( ( rule__AndExp__Group_1__0 )* )
            // InternalEventCalculus.g:4644:1: ( rule__AndExp__Group_1__0 )*
            {
             before(grammarAccess.getAndExpAccess().getGroup_1()); 
            // InternalEventCalculus.g:4645:1: ( rule__AndExp__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==39) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalEventCalculus.g:4645:2: rule__AndExp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__AndExp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
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
    // $ANTLR end "rule__AndExp__Group__1__Impl"


    // $ANTLR start "rule__AndExp__Group_1__0"
    // InternalEventCalculus.g:4659:1: rule__AndExp__Group_1__0 : rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 ;
    public final void rule__AndExp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4663:1: ( rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1 )
            // InternalEventCalculus.g:4664:2: rule__AndExp__Group_1__0__Impl rule__AndExp__Group_1__1
            {
            pushFollow(FOLLOW_35);
            rule__AndExp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExp__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group_1__0"


    // $ANTLR start "rule__AndExp__Group_1__0__Impl"
    // InternalEventCalculus.g:4671:1: rule__AndExp__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4675:1: ( ( () ) )
            // InternalEventCalculus.g:4676:1: ( () )
            {
            // InternalEventCalculus.g:4676:1: ( () )
            // InternalEventCalculus.g:4677:1: ()
            {
             before(grammarAccess.getAndExpAccess().getAndLeftAction_1_0()); 
            // InternalEventCalculus.g:4678:1: ()
            // InternalEventCalculus.g:4680:1: 
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
    // $ANTLR end "rule__AndExp__Group_1__0__Impl"


    // $ANTLR start "rule__AndExp__Group_1__1"
    // InternalEventCalculus.g:4690:1: rule__AndExp__Group_1__1 : rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 ;
    public final void rule__AndExp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4694:1: ( rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2 )
            // InternalEventCalculus.g:4695:2: rule__AndExp__Group_1__1__Impl rule__AndExp__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__AndExp__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExp__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group_1__1"


    // $ANTLR start "rule__AndExp__Group_1__1__Impl"
    // InternalEventCalculus.g:4702:1: rule__AndExp__Group_1__1__Impl : ( '&' ) ;
    public final void rule__AndExp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4706:1: ( ( '&' ) )
            // InternalEventCalculus.g:4707:1: ( '&' )
            {
            // InternalEventCalculus.g:4707:1: ( '&' )
            // InternalEventCalculus.g:4708:1: '&'
            {
             before(grammarAccess.getAndExpAccess().getAmpersandKeyword_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // $ANTLR end "rule__AndExp__Group_1__1__Impl"


    // $ANTLR start "rule__AndExp__Group_1__2"
    // InternalEventCalculus.g:4721:1: rule__AndExp__Group_1__2 : rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3 ;
    public final void rule__AndExp__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4725:1: ( rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3 )
            // InternalEventCalculus.g:4726:2: rule__AndExp__Group_1__2__Impl rule__AndExp__Group_1__3
            {
            pushFollow(FOLLOW_3);
            rule__AndExp__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AndExp__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group_1__2"


    // $ANTLR start "rule__AndExp__Group_1__2__Impl"
    // InternalEventCalculus.g:4733:1: rule__AndExp__Group_1__2__Impl : ( ( rule__AndExp__QAssignment_1_2 )? ) ;
    public final void rule__AndExp__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4737:1: ( ( ( rule__AndExp__QAssignment_1_2 )? ) )
            // InternalEventCalculus.g:4738:1: ( ( rule__AndExp__QAssignment_1_2 )? )
            {
            // InternalEventCalculus.g:4738:1: ( ( rule__AndExp__QAssignment_1_2 )? )
            // InternalEventCalculus.g:4739:1: ( rule__AndExp__QAssignment_1_2 )?
            {
             before(grammarAccess.getAndExpAccess().getQAssignment_1_2()); 
            // InternalEventCalculus.g:4740:1: ( rule__AndExp__QAssignment_1_2 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==12) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==32||LA48_1==34) ) {
                    alt48=1;
                }
            }
            else if ( (LA48_0==32||LA48_0==34) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalEventCalculus.g:4740:2: rule__AndExp__QAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__AndExp__QAssignment_1_2();

                    state._fsp--;


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
    // $ANTLR end "rule__AndExp__Group_1__2__Impl"


    // $ANTLR start "rule__AndExp__Group_1__3"
    // InternalEventCalculus.g:4750:1: rule__AndExp__Group_1__3 : rule__AndExp__Group_1__3__Impl ;
    public final void rule__AndExp__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4754:1: ( rule__AndExp__Group_1__3__Impl )
            // InternalEventCalculus.g:4755:2: rule__AndExp__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AndExp__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExp__Group_1__3"


    // $ANTLR start "rule__AndExp__Group_1__3__Impl"
    // InternalEventCalculus.g:4761:1: rule__AndExp__Group_1__3__Impl : ( ( rule__AndExp__RightAssignment_1_3 ) ) ;
    public final void rule__AndExp__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4765:1: ( ( ( rule__AndExp__RightAssignment_1_3 ) ) )
            // InternalEventCalculus.g:4766:1: ( ( rule__AndExp__RightAssignment_1_3 ) )
            {
            // InternalEventCalculus.g:4766:1: ( ( rule__AndExp__RightAssignment_1_3 ) )
            // InternalEventCalculus.g:4767:1: ( rule__AndExp__RightAssignment_1_3 )
            {
             before(grammarAccess.getAndExpAccess().getRightAssignment_1_3()); 
            // InternalEventCalculus.g:4768:1: ( rule__AndExp__RightAssignment_1_3 )
            // InternalEventCalculus.g:4768:2: rule__AndExp__RightAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__AndExp__RightAssignment_1_3();

            state._fsp--;


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
    // $ANTLR end "rule__AndExp__Group_1__3__Impl"


    // $ANTLR start "rule__Relational__Group__0"
    // InternalEventCalculus.g:4786:1: rule__Relational__Group__0 : rule__Relational__Group__0__Impl rule__Relational__Group__1 ;
    public final void rule__Relational__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4790:1: ( rule__Relational__Group__0__Impl rule__Relational__Group__1 )
            // InternalEventCalculus.g:4791:2: rule__Relational__Group__0__Impl rule__Relational__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__Relational__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relational__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group__0"


    // $ANTLR start "rule__Relational__Group__0__Impl"
    // InternalEventCalculus.g:4798:1: rule__Relational__Group__0__Impl : ( ruleAddition ) ;
    public final void rule__Relational__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4802:1: ( ( ruleAddition ) )
            // InternalEventCalculus.g:4803:1: ( ruleAddition )
            {
            // InternalEventCalculus.g:4803:1: ( ruleAddition )
            // InternalEventCalculus.g:4804:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getAdditionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

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
    // $ANTLR end "rule__Relational__Group__0__Impl"


    // $ANTLR start "rule__Relational__Group__1"
    // InternalEventCalculus.g:4815:1: rule__Relational__Group__1 : rule__Relational__Group__1__Impl ;
    public final void rule__Relational__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4819:1: ( rule__Relational__Group__1__Impl )
            // InternalEventCalculus.g:4820:2: rule__Relational__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group__1"


    // $ANTLR start "rule__Relational__Group__1__Impl"
    // InternalEventCalculus.g:4826:1: rule__Relational__Group__1__Impl : ( ( rule__Relational__Group_1__0 )? ) ;
    public final void rule__Relational__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4830:1: ( ( ( rule__Relational__Group_1__0 )? ) )
            // InternalEventCalculus.g:4831:1: ( ( rule__Relational__Group_1__0 )? )
            {
            // InternalEventCalculus.g:4831:1: ( ( rule__Relational__Group_1__0 )? )
            // InternalEventCalculus.g:4832:1: ( rule__Relational__Group_1__0 )?
            {
             before(grammarAccess.getRelationalAccess().getGroup_1()); 
            // InternalEventCalculus.g:4833:1: ( rule__Relational__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( ((LA49_0>=40 && LA49_0<=46)) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalEventCalculus.g:4833:2: rule__Relational__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Relational__Group_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__Relational__Group__1__Impl"


    // $ANTLR start "rule__Relational__Group_1__0"
    // InternalEventCalculus.g:4847:1: rule__Relational__Group_1__0 : rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 ;
    public final void rule__Relational__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4851:1: ( rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1 )
            // InternalEventCalculus.g:4852:2: rule__Relational__Group_1__0__Impl rule__Relational__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Relational__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relational__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1__0"


    // $ANTLR start "rule__Relational__Group_1__0__Impl"
    // InternalEventCalculus.g:4859:1: rule__Relational__Group_1__0__Impl : ( ( rule__Relational__Alternatives_1_0 ) ) ;
    public final void rule__Relational__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4863:1: ( ( ( rule__Relational__Alternatives_1_0 ) ) )
            // InternalEventCalculus.g:4864:1: ( ( rule__Relational__Alternatives_1_0 ) )
            {
            // InternalEventCalculus.g:4864:1: ( ( rule__Relational__Alternatives_1_0 ) )
            // InternalEventCalculus.g:4865:1: ( rule__Relational__Alternatives_1_0 )
            {
             before(grammarAccess.getRelationalAccess().getAlternatives_1_0()); 
            // InternalEventCalculus.g:4866:1: ( rule__Relational__Alternatives_1_0 )
            // InternalEventCalculus.g:4866:2: rule__Relational__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Alternatives_1_0();

            state._fsp--;


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
    // $ANTLR end "rule__Relational__Group_1__0__Impl"


    // $ANTLR start "rule__Relational__Group_1__1"
    // InternalEventCalculus.g:4876:1: rule__Relational__Group_1__1 : rule__Relational__Group_1__1__Impl ;
    public final void rule__Relational__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4880:1: ( rule__Relational__Group_1__1__Impl )
            // InternalEventCalculus.g:4881:2: rule__Relational__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1__1"


    // $ANTLR start "rule__Relational__Group_1__1__Impl"
    // InternalEventCalculus.g:4887:1: rule__Relational__Group_1__1__Impl : ( ( rule__Relational__RightAssignment_1_1 ) ) ;
    public final void rule__Relational__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4891:1: ( ( ( rule__Relational__RightAssignment_1_1 ) ) )
            // InternalEventCalculus.g:4892:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            {
            // InternalEventCalculus.g:4892:1: ( ( rule__Relational__RightAssignment_1_1 ) )
            // InternalEventCalculus.g:4893:1: ( rule__Relational__RightAssignment_1_1 )
            {
             before(grammarAccess.getRelationalAccess().getRightAssignment_1_1()); 
            // InternalEventCalculus.g:4894:1: ( rule__Relational__RightAssignment_1_1 )
            // InternalEventCalculus.g:4894:2: rule__Relational__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Relational__RightAssignment_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__Relational__Group_1__1__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_0__0"
    // InternalEventCalculus.g:4908:1: rule__Relational__Group_1_0_0__0 : rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 ;
    public final void rule__Relational__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4912:1: ( rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1 )
            // InternalEventCalculus.g:4913:2: rule__Relational__Group_1_0_0__0__Impl rule__Relational__Group_1_0_0__1
            {
            pushFollow(FOLLOW_39);
            rule__Relational__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_0__0"


    // $ANTLR start "rule__Relational__Group_1_0_0__0__Impl"
    // InternalEventCalculus.g:4920:1: rule__Relational__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4924:1: ( ( () ) )
            // InternalEventCalculus.g:4925:1: ( () )
            {
            // InternalEventCalculus.g:4925:1: ( () )
            // InternalEventCalculus.g:4926:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelNotEqLeftAction_1_0_0_0()); 
            // InternalEventCalculus.g:4927:1: ()
            // InternalEventCalculus.g:4929:1: 
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
    // $ANTLR end "rule__Relational__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_0__1"
    // InternalEventCalculus.g:4939:1: rule__Relational__Group_1_0_0__1 : rule__Relational__Group_1_0_0__1__Impl ;
    public final void rule__Relational__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4943:1: ( rule__Relational__Group_1_0_0__1__Impl )
            // InternalEventCalculus.g:4944:2: rule__Relational__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_0__1"


    // $ANTLR start "rule__Relational__Group_1_0_0__1__Impl"
    // InternalEventCalculus.g:4950:1: rule__Relational__Group_1_0_0__1__Impl : ( '!=' ) ;
    public final void rule__Relational__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4954:1: ( ( '!=' ) )
            // InternalEventCalculus.g:4955:1: ( '!=' )
            {
            // InternalEventCalculus.g:4955:1: ( '!=' )
            // InternalEventCalculus.g:4956:1: '!='
            {
             before(grammarAccess.getRelationalAccess().getExclamationMarkEqualsSignKeyword_1_0_0_1()); 
            match(input,40,FOLLOW_2); 
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
    // $ANTLR end "rule__Relational__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_1__0"
    // InternalEventCalculus.g:4973:1: rule__Relational__Group_1_0_1__0 : rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 ;
    public final void rule__Relational__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4977:1: ( rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1 )
            // InternalEventCalculus.g:4978:2: rule__Relational__Group_1_0_1__0__Impl rule__Relational__Group_1_0_1__1
            {
            pushFollow(FOLLOW_40);
            rule__Relational__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_1__0"


    // $ANTLR start "rule__Relational__Group_1_0_1__0__Impl"
    // InternalEventCalculus.g:4985:1: rule__Relational__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:4989:1: ( ( () ) )
            // InternalEventCalculus.g:4990:1: ( () )
            {
            // InternalEventCalculus.g:4990:1: ( () )
            // InternalEventCalculus.g:4991:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqEqLeftAction_1_0_1_0()); 
            // InternalEventCalculus.g:4992:1: ()
            // InternalEventCalculus.g:4994:1: 
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
    // $ANTLR end "rule__Relational__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_1__1"
    // InternalEventCalculus.g:5004:1: rule__Relational__Group_1_0_1__1 : rule__Relational__Group_1_0_1__1__Impl ;
    public final void rule__Relational__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5008:1: ( rule__Relational__Group_1_0_1__1__Impl )
            // InternalEventCalculus.g:5009:2: rule__Relational__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_1__1"


    // $ANTLR start "rule__Relational__Group_1_0_1__1__Impl"
    // InternalEventCalculus.g:5015:1: rule__Relational__Group_1_0_1__1__Impl : ( '==' ) ;
    public final void rule__Relational__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5019:1: ( ( '==' ) )
            // InternalEventCalculus.g:5020:1: ( '==' )
            {
            // InternalEventCalculus.g:5020:1: ( '==' )
            // InternalEventCalculus.g:5021:1: '=='
            {
             before(grammarAccess.getRelationalAccess().getEqualsSignEqualsSignKeyword_1_0_1_1()); 
            match(input,41,FOLLOW_2); 
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
    // $ANTLR end "rule__Relational__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_2__0"
    // InternalEventCalculus.g:5038:1: rule__Relational__Group_1_0_2__0 : rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 ;
    public final void rule__Relational__Group_1_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5042:1: ( rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1 )
            // InternalEventCalculus.g:5043:2: rule__Relational__Group_1_0_2__0__Impl rule__Relational__Group_1_0_2__1
            {
            pushFollow(FOLLOW_41);
            rule__Relational__Group_1_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_2__0"


    // $ANTLR start "rule__Relational__Group_1_0_2__0__Impl"
    // InternalEventCalculus.g:5050:1: rule__Relational__Group_1_0_2__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5054:1: ( ( () ) )
            // InternalEventCalculus.g:5055:1: ( () )
            {
            // InternalEventCalculus.g:5055:1: ( () )
            // InternalEventCalculus.g:5056:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtEqLeftAction_1_0_2_0()); 
            // InternalEventCalculus.g:5057:1: ()
            // InternalEventCalculus.g:5059:1: 
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
    // $ANTLR end "rule__Relational__Group_1_0_2__0__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_2__1"
    // InternalEventCalculus.g:5069:1: rule__Relational__Group_1_0_2__1 : rule__Relational__Group_1_0_2__1__Impl ;
    public final void rule__Relational__Group_1_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5073:1: ( rule__Relational__Group_1_0_2__1__Impl )
            // InternalEventCalculus.g:5074:2: rule__Relational__Group_1_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_2__1"


    // $ANTLR start "rule__Relational__Group_1_0_2__1__Impl"
    // InternalEventCalculus.g:5080:1: rule__Relational__Group_1_0_2__1__Impl : ( '>=' ) ;
    public final void rule__Relational__Group_1_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5084:1: ( ( '>=' ) )
            // InternalEventCalculus.g:5085:1: ( '>=' )
            {
            // InternalEventCalculus.g:5085:1: ( '>=' )
            // InternalEventCalculus.g:5086:1: '>='
            {
             before(grammarAccess.getRelationalAccess().getGreaterThanSignEqualsSignKeyword_1_0_2_1()); 
            match(input,42,FOLLOW_2); 
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
    // $ANTLR end "rule__Relational__Group_1_0_2__1__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_3__0"
    // InternalEventCalculus.g:5103:1: rule__Relational__Group_1_0_3__0 : rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 ;
    public final void rule__Relational__Group_1_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5107:1: ( rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1 )
            // InternalEventCalculus.g:5108:2: rule__Relational__Group_1_0_3__0__Impl rule__Relational__Group_1_0_3__1
            {
            pushFollow(FOLLOW_42);
            rule__Relational__Group_1_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_3__0"


    // $ANTLR start "rule__Relational__Group_1_0_3__0__Impl"
    // InternalEventCalculus.g:5115:1: rule__Relational__Group_1_0_3__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5119:1: ( ( () ) )
            // InternalEventCalculus.g:5120:1: ( () )
            {
            // InternalEventCalculus.g:5120:1: ( () )
            // InternalEventCalculus.g:5121:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtEqLeftAction_1_0_3_0()); 
            // InternalEventCalculus.g:5122:1: ()
            // InternalEventCalculus.g:5124:1: 
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
    // $ANTLR end "rule__Relational__Group_1_0_3__0__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_3__1"
    // InternalEventCalculus.g:5134:1: rule__Relational__Group_1_0_3__1 : rule__Relational__Group_1_0_3__1__Impl ;
    public final void rule__Relational__Group_1_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5138:1: ( rule__Relational__Group_1_0_3__1__Impl )
            // InternalEventCalculus.g:5139:2: rule__Relational__Group_1_0_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_3__1"


    // $ANTLR start "rule__Relational__Group_1_0_3__1__Impl"
    // InternalEventCalculus.g:5145:1: rule__Relational__Group_1_0_3__1__Impl : ( '<=' ) ;
    public final void rule__Relational__Group_1_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5149:1: ( ( '<=' ) )
            // InternalEventCalculus.g:5150:1: ( '<=' )
            {
            // InternalEventCalculus.g:5150:1: ( '<=' )
            // InternalEventCalculus.g:5151:1: '<='
            {
             before(grammarAccess.getRelationalAccess().getLessThanSignEqualsSignKeyword_1_0_3_1()); 
            match(input,43,FOLLOW_2); 
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
    // $ANTLR end "rule__Relational__Group_1_0_3__1__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_4__0"
    // InternalEventCalculus.g:5168:1: rule__Relational__Group_1_0_4__0 : rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 ;
    public final void rule__Relational__Group_1_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5172:1: ( rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1 )
            // InternalEventCalculus.g:5173:2: rule__Relational__Group_1_0_4__0__Impl rule__Relational__Group_1_0_4__1
            {
            pushFollow(FOLLOW_43);
            rule__Relational__Group_1_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_4__0"


    // $ANTLR start "rule__Relational__Group_1_0_4__0__Impl"
    // InternalEventCalculus.g:5180:1: rule__Relational__Group_1_0_4__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5184:1: ( ( () ) )
            // InternalEventCalculus.g:5185:1: ( () )
            {
            // InternalEventCalculus.g:5185:1: ( () )
            // InternalEventCalculus.g:5186:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelEqLeftAction_1_0_4_0()); 
            // InternalEventCalculus.g:5187:1: ()
            // InternalEventCalculus.g:5189:1: 
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
    // $ANTLR end "rule__Relational__Group_1_0_4__0__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_4__1"
    // InternalEventCalculus.g:5199:1: rule__Relational__Group_1_0_4__1 : rule__Relational__Group_1_0_4__1__Impl ;
    public final void rule__Relational__Group_1_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5203:1: ( rule__Relational__Group_1_0_4__1__Impl )
            // InternalEventCalculus.g:5204:2: rule__Relational__Group_1_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_4__1"


    // $ANTLR start "rule__Relational__Group_1_0_4__1__Impl"
    // InternalEventCalculus.g:5210:1: rule__Relational__Group_1_0_4__1__Impl : ( '=' ) ;
    public final void rule__Relational__Group_1_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5214:1: ( ( '=' ) )
            // InternalEventCalculus.g:5215:1: ( '=' )
            {
            // InternalEventCalculus.g:5215:1: ( '=' )
            // InternalEventCalculus.g:5216:1: '='
            {
             before(grammarAccess.getRelationalAccess().getEqualsSignKeyword_1_0_4_1()); 
            match(input,44,FOLLOW_2); 
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
    // $ANTLR end "rule__Relational__Group_1_0_4__1__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_5__0"
    // InternalEventCalculus.g:5233:1: rule__Relational__Group_1_0_5__0 : rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 ;
    public final void rule__Relational__Group_1_0_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5237:1: ( rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1 )
            // InternalEventCalculus.g:5238:2: rule__Relational__Group_1_0_5__0__Impl rule__Relational__Group_1_0_5__1
            {
            pushFollow(FOLLOW_44);
            rule__Relational__Group_1_0_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_5__0"


    // $ANTLR start "rule__Relational__Group_1_0_5__0__Impl"
    // InternalEventCalculus.g:5245:1: rule__Relational__Group_1_0_5__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5249:1: ( ( () ) )
            // InternalEventCalculus.g:5250:1: ( () )
            {
            // InternalEventCalculus.g:5250:1: ( () )
            // InternalEventCalculus.g:5251:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelLtLeftAction_1_0_5_0()); 
            // InternalEventCalculus.g:5252:1: ()
            // InternalEventCalculus.g:5254:1: 
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
    // $ANTLR end "rule__Relational__Group_1_0_5__0__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_5__1"
    // InternalEventCalculus.g:5264:1: rule__Relational__Group_1_0_5__1 : rule__Relational__Group_1_0_5__1__Impl ;
    public final void rule__Relational__Group_1_0_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5268:1: ( rule__Relational__Group_1_0_5__1__Impl )
            // InternalEventCalculus.g:5269:2: rule__Relational__Group_1_0_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_5__1"


    // $ANTLR start "rule__Relational__Group_1_0_5__1__Impl"
    // InternalEventCalculus.g:5275:1: rule__Relational__Group_1_0_5__1__Impl : ( '<' ) ;
    public final void rule__Relational__Group_1_0_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5279:1: ( ( '<' ) )
            // InternalEventCalculus.g:5280:1: ( '<' )
            {
            // InternalEventCalculus.g:5280:1: ( '<' )
            // InternalEventCalculus.g:5281:1: '<'
            {
             before(grammarAccess.getRelationalAccess().getLessThanSignKeyword_1_0_5_1()); 
            match(input,45,FOLLOW_2); 
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
    // $ANTLR end "rule__Relational__Group_1_0_5__1__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_6__0"
    // InternalEventCalculus.g:5298:1: rule__Relational__Group_1_0_6__0 : rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 ;
    public final void rule__Relational__Group_1_0_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5302:1: ( rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1 )
            // InternalEventCalculus.g:5303:2: rule__Relational__Group_1_0_6__0__Impl rule__Relational__Group_1_0_6__1
            {
            pushFollow(FOLLOW_37);
            rule__Relational__Group_1_0_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_6__0"


    // $ANTLR start "rule__Relational__Group_1_0_6__0__Impl"
    // InternalEventCalculus.g:5310:1: rule__Relational__Group_1_0_6__0__Impl : ( () ) ;
    public final void rule__Relational__Group_1_0_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5314:1: ( ( () ) )
            // InternalEventCalculus.g:5315:1: ( () )
            {
            // InternalEventCalculus.g:5315:1: ( () )
            // InternalEventCalculus.g:5316:1: ()
            {
             before(grammarAccess.getRelationalAccess().getRelGtLeftAction_1_0_6_0()); 
            // InternalEventCalculus.g:5317:1: ()
            // InternalEventCalculus.g:5319:1: 
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
    // $ANTLR end "rule__Relational__Group_1_0_6__0__Impl"


    // $ANTLR start "rule__Relational__Group_1_0_6__1"
    // InternalEventCalculus.g:5329:1: rule__Relational__Group_1_0_6__1 : rule__Relational__Group_1_0_6__1__Impl ;
    public final void rule__Relational__Group_1_0_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5333:1: ( rule__Relational__Group_1_0_6__1__Impl )
            // InternalEventCalculus.g:5334:2: rule__Relational__Group_1_0_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Relational__Group_1_0_6__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Relational__Group_1_0_6__1"


    // $ANTLR start "rule__Relational__Group_1_0_6__1__Impl"
    // InternalEventCalculus.g:5340:1: rule__Relational__Group_1_0_6__1__Impl : ( '>' ) ;
    public final void rule__Relational__Group_1_0_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5344:1: ( ( '>' ) )
            // InternalEventCalculus.g:5345:1: ( '>' )
            {
            // InternalEventCalculus.g:5345:1: ( '>' )
            // InternalEventCalculus.g:5346:1: '>'
            {
             before(grammarAccess.getRelationalAccess().getGreaterThanSignKeyword_1_0_6_1()); 
            match(input,46,FOLLOW_2); 
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
    // $ANTLR end "rule__Relational__Group_1_0_6__1__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalEventCalculus.g:5363:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5367:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalEventCalculus.g:5368:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalEventCalculus.g:5375:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5379:1: ( ( ruleMultiplication ) )
            // InternalEventCalculus.g:5380:1: ( ruleMultiplication )
            {
            // InternalEventCalculus.g:5380:1: ( ruleMultiplication )
            // InternalEventCalculus.g:5381:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

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
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalEventCalculus.g:5392:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5396:1: ( rule__Addition__Group__1__Impl )
            // InternalEventCalculus.g:5397:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalEventCalculus.g:5403:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5407:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalEventCalculus.g:5408:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalEventCalculus.g:5408:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalEventCalculus.g:5409:1: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalEventCalculus.g:5410:1: ( rule__Addition__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( ((LA50_0>=47 && LA50_0<=48)) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalEventCalculus.g:5410:2: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
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
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalEventCalculus.g:5424:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5428:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalEventCalculus.g:5429:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalEventCalculus.g:5436:1: rule__Addition__Group_1__0__Impl : ( ( rule__Addition__Alternatives_1_0 ) ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5440:1: ( ( ( rule__Addition__Alternatives_1_0 ) ) )
            // InternalEventCalculus.g:5441:1: ( ( rule__Addition__Alternatives_1_0 ) )
            {
            // InternalEventCalculus.g:5441:1: ( ( rule__Addition__Alternatives_1_0 ) )
            // InternalEventCalculus.g:5442:1: ( rule__Addition__Alternatives_1_0 )
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1_0()); 
            // InternalEventCalculus.g:5443:1: ( rule__Addition__Alternatives_1_0 )
            // InternalEventCalculus.g:5443:2: rule__Addition__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Alternatives_1_0();

            state._fsp--;


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
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalEventCalculus.g:5453:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5457:1: ( rule__Addition__Group_1__1__Impl )
            // InternalEventCalculus.g:5458:2: rule__Addition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalEventCalculus.g:5464:1: rule__Addition__Group_1__1__Impl : ( ( rule__Addition__RightAssignment_1_1 ) ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5468:1: ( ( ( rule__Addition__RightAssignment_1_1 ) ) )
            // InternalEventCalculus.g:5469:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            {
            // InternalEventCalculus.g:5469:1: ( ( rule__Addition__RightAssignment_1_1 ) )
            // InternalEventCalculus.g:5470:1: ( rule__Addition__RightAssignment_1_1 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1()); 
            // InternalEventCalculus.g:5471:1: ( rule__Addition__RightAssignment_1_1 )
            // InternalEventCalculus.g:5471:2: rule__Addition__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__0"
    // InternalEventCalculus.g:5485:1: rule__Addition__Group_1_0_0__0 : rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 ;
    public final void rule__Addition__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5489:1: ( rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1 )
            // InternalEventCalculus.g:5490:2: rule__Addition__Group_1_0_0__0__Impl rule__Addition__Group_1_0_0__1
            {
            pushFollow(FOLLOW_47);
            rule__Addition__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__0"


    // $ANTLR start "rule__Addition__Group_1_0_0__0__Impl"
    // InternalEventCalculus.g:5497:1: rule__Addition__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5501:1: ( ( () ) )
            // InternalEventCalculus.g:5502:1: ( () )
            {
            // InternalEventCalculus.g:5502:1: ( () )
            // InternalEventCalculus.g:5503:1: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalEventCalculus.g:5504:1: ()
            // InternalEventCalculus.g:5506:1: 
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
    // $ANTLR end "rule__Addition__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_0__1"
    // InternalEventCalculus.g:5516:1: rule__Addition__Group_1_0_0__1 : rule__Addition__Group_1_0_0__1__Impl ;
    public final void rule__Addition__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5520:1: ( rule__Addition__Group_1_0_0__1__Impl )
            // InternalEventCalculus.g:5521:2: rule__Addition__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_0__1"


    // $ANTLR start "rule__Addition__Group_1_0_0__1__Impl"
    // InternalEventCalculus.g:5527:1: rule__Addition__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5531:1: ( ( '+' ) )
            // InternalEventCalculus.g:5532:1: ( '+' )
            {
            // InternalEventCalculus.g:5532:1: ( '+' )
            // InternalEventCalculus.g:5533:1: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,47,FOLLOW_2); 
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
    // $ANTLR end "rule__Addition__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__0"
    // InternalEventCalculus.g:5550:1: rule__Addition__Group_1_0_1__0 : rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 ;
    public final void rule__Addition__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5554:1: ( rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1 )
            // InternalEventCalculus.g:5555:2: rule__Addition__Group_1_0_1__0__Impl rule__Addition__Group_1_0_1__1
            {
            pushFollow(FOLLOW_45);
            rule__Addition__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__0"


    // $ANTLR start "rule__Addition__Group_1_0_1__0__Impl"
    // InternalEventCalculus.g:5562:1: rule__Addition__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5566:1: ( ( () ) )
            // InternalEventCalculus.g:5567:1: ( () )
            {
            // InternalEventCalculus.g:5567:1: ( () )
            // InternalEventCalculus.g:5568:1: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalEventCalculus.g:5569:1: ()
            // InternalEventCalculus.g:5571:1: 
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
    // $ANTLR end "rule__Addition__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0_1__1"
    // InternalEventCalculus.g:5581:1: rule__Addition__Group_1_0_1__1 : rule__Addition__Group_1_0_1__1__Impl ;
    public final void rule__Addition__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5585:1: ( rule__Addition__Group_1_0_1__1__Impl )
            // InternalEventCalculus.g:5586:2: rule__Addition__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0_1__1"


    // $ANTLR start "rule__Addition__Group_1_0_1__1__Impl"
    // InternalEventCalculus.g:5592:1: rule__Addition__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5596:1: ( ( '-' ) )
            // InternalEventCalculus.g:5597:1: ( '-' )
            {
            // InternalEventCalculus.g:5597:1: ( '-' )
            // InternalEventCalculus.g:5598:1: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,48,FOLLOW_2); 
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
    // $ANTLR end "rule__Addition__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalEventCalculus.g:5615:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5619:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalEventCalculus.g:5620:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalEventCalculus.g:5627:1: rule__Multiplication__Group__0__Impl : ( rulePower ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5631:1: ( ( rulePower ) )
            // InternalEventCalculus.g:5632:1: ( rulePower )
            {
            // InternalEventCalculus.g:5632:1: ( rulePower )
            // InternalEventCalculus.g:5633:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getPowerParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePower();

            state._fsp--;

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
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalEventCalculus.g:5644:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5648:1: ( rule__Multiplication__Group__1__Impl )
            // InternalEventCalculus.g:5649:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalEventCalculus.g:5655:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Group_1__0 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5659:1: ( ( ( rule__Multiplication__Group_1__0 )* ) )
            // InternalEventCalculus.g:5660:1: ( ( rule__Multiplication__Group_1__0 )* )
            {
            // InternalEventCalculus.g:5660:1: ( ( rule__Multiplication__Group_1__0 )* )
            // InternalEventCalculus.g:5661:1: ( rule__Multiplication__Group_1__0 )*
            {
             before(grammarAccess.getMultiplicationAccess().getGroup_1()); 
            // InternalEventCalculus.g:5662:1: ( rule__Multiplication__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( ((LA51_0>=49 && LA51_0<=50)) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalEventCalculus.g:5662:2: rule__Multiplication__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__Multiplication__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
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
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__0"
    // InternalEventCalculus.g:5676:1: rule__Multiplication__Group_1__0 : rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 ;
    public final void rule__Multiplication__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5680:1: ( rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1 )
            // InternalEventCalculus.g:5681:2: rule__Multiplication__Group_1__0__Impl rule__Multiplication__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Multiplication__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__0"


    // $ANTLR start "rule__Multiplication__Group_1__0__Impl"
    // InternalEventCalculus.g:5688:1: rule__Multiplication__Group_1__0__Impl : ( ( rule__Multiplication__Alternatives_1_0 ) ) ;
    public final void rule__Multiplication__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5692:1: ( ( ( rule__Multiplication__Alternatives_1_0 ) ) )
            // InternalEventCalculus.g:5693:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            {
            // InternalEventCalculus.g:5693:1: ( ( rule__Multiplication__Alternatives_1_0 ) )
            // InternalEventCalculus.g:5694:1: ( rule__Multiplication__Alternatives_1_0 )
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1_0()); 
            // InternalEventCalculus.g:5695:1: ( rule__Multiplication__Alternatives_1_0 )
            // InternalEventCalculus.g:5695:2: rule__Multiplication__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Alternatives_1_0();

            state._fsp--;


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
    // $ANTLR end "rule__Multiplication__Group_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1__1"
    // InternalEventCalculus.g:5705:1: rule__Multiplication__Group_1__1 : rule__Multiplication__Group_1__1__Impl ;
    public final void rule__Multiplication__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5709:1: ( rule__Multiplication__Group_1__1__Impl )
            // InternalEventCalculus.g:5710:2: rule__Multiplication__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1__1"


    // $ANTLR start "rule__Multiplication__Group_1__1__Impl"
    // InternalEventCalculus.g:5716:1: rule__Multiplication__Group_1__1__Impl : ( ( rule__Multiplication__RightAssignment_1_1 ) ) ;
    public final void rule__Multiplication__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5720:1: ( ( ( rule__Multiplication__RightAssignment_1_1 ) ) )
            // InternalEventCalculus.g:5721:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            {
            // InternalEventCalculus.g:5721:1: ( ( rule__Multiplication__RightAssignment_1_1 ) )
            // InternalEventCalculus.g:5722:1: ( rule__Multiplication__RightAssignment_1_1 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1()); 
            // InternalEventCalculus.g:5723:1: ( rule__Multiplication__RightAssignment_1_1 )
            // InternalEventCalculus.g:5723:2: rule__Multiplication__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__Multiplication__Group_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0"
    // InternalEventCalculus.g:5737:1: rule__Multiplication__Group_1_0_0__0 : rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 ;
    public final void rule__Multiplication__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5741:1: ( rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1 )
            // InternalEventCalculus.g:5742:2: rule__Multiplication__Group_1_0_0__0__Impl rule__Multiplication__Group_1_0_0__1
            {
            pushFollow(FOLLOW_50);
            rule__Multiplication__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__0__Impl"
    // InternalEventCalculus.g:5749:1: rule__Multiplication__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5753:1: ( ( () ) )
            // InternalEventCalculus.g:5754:1: ( () )
            {
            // InternalEventCalculus.g:5754:1: ( () )
            // InternalEventCalculus.g:5755:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultiLeftAction_1_0_0_0()); 
            // InternalEventCalculus.g:5756:1: ()
            // InternalEventCalculus.g:5758:1: 
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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1"
    // InternalEventCalculus.g:5768:1: rule__Multiplication__Group_1_0_0__1 : rule__Multiplication__Group_1_0_0__1__Impl ;
    public final void rule__Multiplication__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5772:1: ( rule__Multiplication__Group_1_0_0__1__Impl )
            // InternalEventCalculus.g:5773:2: rule__Multiplication__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_0__1__Impl"
    // InternalEventCalculus.g:5779:1: rule__Multiplication__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5783:1: ( ( '*' ) )
            // InternalEventCalculus.g:5784:1: ( '*' )
            {
            // InternalEventCalculus.g:5784:1: ( '*' )
            // InternalEventCalculus.g:5785:1: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,49,FOLLOW_2); 
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
    // $ANTLR end "rule__Multiplication__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0"
    // InternalEventCalculus.g:5802:1: rule__Multiplication__Group_1_0_1__0 : rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 ;
    public final void rule__Multiplication__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5806:1: ( rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1 )
            // InternalEventCalculus.g:5807:2: rule__Multiplication__Group_1_0_1__0__Impl rule__Multiplication__Group_1_0_1__1
            {
            pushFollow(FOLLOW_48);
            rule__Multiplication__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__0__Impl"
    // InternalEventCalculus.g:5814:1: rule__Multiplication__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5818:1: ( ( () ) )
            // InternalEventCalculus.g:5819:1: ( () )
            {
            // InternalEventCalculus.g:5819:1: ( () )
            // InternalEventCalculus.g:5820:1: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_0_1_0()); 
            // InternalEventCalculus.g:5821:1: ()
            // InternalEventCalculus.g:5823:1: 
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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1"
    // InternalEventCalculus.g:5833:1: rule__Multiplication__Group_1_0_1__1 : rule__Multiplication__Group_1_0_1__1__Impl ;
    public final void rule__Multiplication__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5837:1: ( rule__Multiplication__Group_1_0_1__1__Impl )
            // InternalEventCalculus.g:5838:2: rule__Multiplication__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_0_1__1__Impl"
    // InternalEventCalculus.g:5844:1: rule__Multiplication__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5848:1: ( ( '/' ) )
            // InternalEventCalculus.g:5849:1: ( '/' )
            {
            // InternalEventCalculus.g:5849:1: ( '/' )
            // InternalEventCalculus.g:5850:1: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,50,FOLLOW_2); 
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
    // $ANTLR end "rule__Multiplication__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Power__Group__0"
    // InternalEventCalculus.g:5867:1: rule__Power__Group__0 : rule__Power__Group__0__Impl rule__Power__Group__1 ;
    public final void rule__Power__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5871:1: ( rule__Power__Group__0__Impl rule__Power__Group__1 )
            // InternalEventCalculus.g:5872:2: rule__Power__Group__0__Impl rule__Power__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__Power__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__0"


    // $ANTLR start "rule__Power__Group__0__Impl"
    // InternalEventCalculus.g:5879:1: rule__Power__Group__0__Impl : ( ruleUnaryExpr ) ;
    public final void rule__Power__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5883:1: ( ( ruleUnaryExpr ) )
            // InternalEventCalculus.g:5884:1: ( ruleUnaryExpr )
            {
            // InternalEventCalculus.g:5884:1: ( ruleUnaryExpr )
            // InternalEventCalculus.g:5885:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getUnaryExprParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpr();

            state._fsp--;

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
    // $ANTLR end "rule__Power__Group__0__Impl"


    // $ANTLR start "rule__Power__Group__1"
    // InternalEventCalculus.g:5896:1: rule__Power__Group__1 : rule__Power__Group__1__Impl ;
    public final void rule__Power__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5900:1: ( rule__Power__Group__1__Impl )
            // InternalEventCalculus.g:5901:2: rule__Power__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group__1"


    // $ANTLR start "rule__Power__Group__1__Impl"
    // InternalEventCalculus.g:5907:1: rule__Power__Group__1__Impl : ( ( rule__Power__Group_1__0 )* ) ;
    public final void rule__Power__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5911:1: ( ( ( rule__Power__Group_1__0 )* ) )
            // InternalEventCalculus.g:5912:1: ( ( rule__Power__Group_1__0 )* )
            {
            // InternalEventCalculus.g:5912:1: ( ( rule__Power__Group_1__0 )* )
            // InternalEventCalculus.g:5913:1: ( rule__Power__Group_1__0 )*
            {
             before(grammarAccess.getPowerAccess().getGroup_1()); 
            // InternalEventCalculus.g:5914:1: ( rule__Power__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==51) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalEventCalculus.g:5914:2: rule__Power__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__Power__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop52;
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
    // $ANTLR end "rule__Power__Group__1__Impl"


    // $ANTLR start "rule__Power__Group_1__0"
    // InternalEventCalculus.g:5928:1: rule__Power__Group_1__0 : rule__Power__Group_1__0__Impl rule__Power__Group_1__1 ;
    public final void rule__Power__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5932:1: ( rule__Power__Group_1__0__Impl rule__Power__Group_1__1 )
            // InternalEventCalculus.g:5933:2: rule__Power__Group_1__0__Impl rule__Power__Group_1__1
            {
            pushFollow(FOLLOW_38);
            rule__Power__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1__0"


    // $ANTLR start "rule__Power__Group_1__0__Impl"
    // InternalEventCalculus.g:5940:1: rule__Power__Group_1__0__Impl : ( ( rule__Power__Group_1_0__0 ) ) ;
    public final void rule__Power__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5944:1: ( ( ( rule__Power__Group_1_0__0 ) ) )
            // InternalEventCalculus.g:5945:1: ( ( rule__Power__Group_1_0__0 ) )
            {
            // InternalEventCalculus.g:5945:1: ( ( rule__Power__Group_1_0__0 ) )
            // InternalEventCalculus.g:5946:1: ( rule__Power__Group_1_0__0 )
            {
             before(grammarAccess.getPowerAccess().getGroup_1_0()); 
            // InternalEventCalculus.g:5947:1: ( rule__Power__Group_1_0__0 )
            // InternalEventCalculus.g:5947:2: rule__Power__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group_1_0__0();

            state._fsp--;


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
    // $ANTLR end "rule__Power__Group_1__0__Impl"


    // $ANTLR start "rule__Power__Group_1__1"
    // InternalEventCalculus.g:5957:1: rule__Power__Group_1__1 : rule__Power__Group_1__1__Impl ;
    public final void rule__Power__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5961:1: ( rule__Power__Group_1__1__Impl )
            // InternalEventCalculus.g:5962:2: rule__Power__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1__1"


    // $ANTLR start "rule__Power__Group_1__1__Impl"
    // InternalEventCalculus.g:5968:1: rule__Power__Group_1__1__Impl : ( ( rule__Power__RightAssignment_1_1 ) ) ;
    public final void rule__Power__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5972:1: ( ( ( rule__Power__RightAssignment_1_1 ) ) )
            // InternalEventCalculus.g:5973:1: ( ( rule__Power__RightAssignment_1_1 ) )
            {
            // InternalEventCalculus.g:5973:1: ( ( rule__Power__RightAssignment_1_1 ) )
            // InternalEventCalculus.g:5974:1: ( rule__Power__RightAssignment_1_1 )
            {
             before(grammarAccess.getPowerAccess().getRightAssignment_1_1()); 
            // InternalEventCalculus.g:5975:1: ( rule__Power__RightAssignment_1_1 )
            // InternalEventCalculus.g:5975:2: rule__Power__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Power__RightAssignment_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__Power__Group_1__1__Impl"


    // $ANTLR start "rule__Power__Group_1_0__0"
    // InternalEventCalculus.g:5989:1: rule__Power__Group_1_0__0 : rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 ;
    public final void rule__Power__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:5993:1: ( rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1 )
            // InternalEventCalculus.g:5994:2: rule__Power__Group_1_0__0__Impl rule__Power__Group_1_0__1
            {
            pushFollow(FOLLOW_51);
            rule__Power__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Power__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1_0__0"


    // $ANTLR start "rule__Power__Group_1_0__0__Impl"
    // InternalEventCalculus.g:6001:1: rule__Power__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Power__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6005:1: ( ( () ) )
            // InternalEventCalculus.g:6006:1: ( () )
            {
            // InternalEventCalculus.g:6006:1: ( () )
            // InternalEventCalculus.g:6007:1: ()
            {
             before(grammarAccess.getPowerAccess().getPowLeftAction_1_0_0()); 
            // InternalEventCalculus.g:6008:1: ()
            // InternalEventCalculus.g:6010:1: 
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
    // $ANTLR end "rule__Power__Group_1_0__0__Impl"


    // $ANTLR start "rule__Power__Group_1_0__1"
    // InternalEventCalculus.g:6020:1: rule__Power__Group_1_0__1 : rule__Power__Group_1_0__1__Impl ;
    public final void rule__Power__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6024:1: ( rule__Power__Group_1_0__1__Impl )
            // InternalEventCalculus.g:6025:2: rule__Power__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Power__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Power__Group_1_0__1"


    // $ANTLR start "rule__Power__Group_1_0__1__Impl"
    // InternalEventCalculus.g:6031:1: rule__Power__Group_1_0__1__Impl : ( '^' ) ;
    public final void rule__Power__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6035:1: ( ( '^' ) )
            // InternalEventCalculus.g:6036:1: ( '^' )
            {
            // InternalEventCalculus.g:6036:1: ( '^' )
            // InternalEventCalculus.g:6037:1: '^'
            {
             before(grammarAccess.getPowerAccess().getCircumflexAccentKeyword_1_0_1()); 
            match(input,51,FOLLOW_2); 
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
    // $ANTLR end "rule__Power__Group_1_0__1__Impl"


    // $ANTLR start "rule__UnaryExpr__Group__0"
    // InternalEventCalculus.g:6054:1: rule__UnaryExpr__Group__0 : rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 ;
    public final void rule__UnaryExpr__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6058:1: ( rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1 )
            // InternalEventCalculus.g:6059:2: rule__UnaryExpr__Group__0__Impl rule__UnaryExpr__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__UnaryExpr__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group__0"


    // $ANTLR start "rule__UnaryExpr__Group__0__Impl"
    // InternalEventCalculus.g:6066:1: rule__UnaryExpr__Group__0__Impl : ( ( rule__UnaryExpr__OpAssignment_0 )? ) ;
    public final void rule__UnaryExpr__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6070:1: ( ( ( rule__UnaryExpr__OpAssignment_0 )? ) )
            // InternalEventCalculus.g:6071:1: ( ( rule__UnaryExpr__OpAssignment_0 )? )
            {
            // InternalEventCalculus.g:6071:1: ( ( rule__UnaryExpr__OpAssignment_0 )? )
            // InternalEventCalculus.g:6072:1: ( rule__UnaryExpr__OpAssignment_0 )?
            {
             before(grammarAccess.getUnaryExprAccess().getOpAssignment_0()); 
            // InternalEventCalculus.g:6073:1: ( rule__UnaryExpr__OpAssignment_0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==12) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalEventCalculus.g:6073:2: rule__UnaryExpr__OpAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UnaryExpr__OpAssignment_0();

                    state._fsp--;


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
    // $ANTLR end "rule__UnaryExpr__Group__0__Impl"


    // $ANTLR start "rule__UnaryExpr__Group__1"
    // InternalEventCalculus.g:6083:1: rule__UnaryExpr__Group__1 : rule__UnaryExpr__Group__1__Impl ;
    public final void rule__UnaryExpr__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6087:1: ( rule__UnaryExpr__Group__1__Impl )
            // InternalEventCalculus.g:6088:2: rule__UnaryExpr__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UnaryExpr__Group__1"


    // $ANTLR start "rule__UnaryExpr__Group__1__Impl"
    // InternalEventCalculus.g:6094:1: rule__UnaryExpr__Group__1__Impl : ( ( rule__UnaryExpr__RightAssignment_1 ) ) ;
    public final void rule__UnaryExpr__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6098:1: ( ( ( rule__UnaryExpr__RightAssignment_1 ) ) )
            // InternalEventCalculus.g:6099:1: ( ( rule__UnaryExpr__RightAssignment_1 ) )
            {
            // InternalEventCalculus.g:6099:1: ( ( rule__UnaryExpr__RightAssignment_1 ) )
            // InternalEventCalculus.g:6100:1: ( rule__UnaryExpr__RightAssignment_1 )
            {
             before(grammarAccess.getUnaryExprAccess().getRightAssignment_1()); 
            // InternalEventCalculus.g:6101:1: ( rule__UnaryExpr__RightAssignment_1 )
            // InternalEventCalculus.g:6101:2: rule__UnaryExpr__RightAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UnaryExpr__RightAssignment_1();

            state._fsp--;


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
    // $ANTLR end "rule__UnaryExpr__Group__1__Impl"


    // $ANTLR start "rule__PrePrimaryExpr__Group_2__0"
    // InternalEventCalculus.g:6115:1: rule__PrePrimaryExpr__Group_2__0 : rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 ;
    public final void rule__PrePrimaryExpr__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6119:1: ( rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1 )
            // InternalEventCalculus.g:6120:2: rule__PrePrimaryExpr__Group_2__0__Impl rule__PrePrimaryExpr__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__PrePrimaryExpr__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrePrimaryExpr__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrePrimaryExpr__Group_2__0"


    // $ANTLR start "rule__PrePrimaryExpr__Group_2__0__Impl"
    // InternalEventCalculus.g:6127:1: rule__PrePrimaryExpr__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrePrimaryExpr__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6131:1: ( ( '(' ) )
            // InternalEventCalculus.g:6132:1: ( '(' )
            {
            // InternalEventCalculus.g:6132:1: ( '(' )
            // InternalEventCalculus.g:6133:1: '('
            {
             before(grammarAccess.getPrePrimaryExprAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // $ANTLR end "rule__PrePrimaryExpr__Group_2__0__Impl"


    // $ANTLR start "rule__PrePrimaryExpr__Group_2__1"
    // InternalEventCalculus.g:6146:1: rule__PrePrimaryExpr__Group_2__1 : rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2 ;
    public final void rule__PrePrimaryExpr__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6150:1: ( rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2 )
            // InternalEventCalculus.g:6151:2: rule__PrePrimaryExpr__Group_2__1__Impl rule__PrePrimaryExpr__Group_2__2
            {
            pushFollow(FOLLOW_53);
            rule__PrePrimaryExpr__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrePrimaryExpr__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrePrimaryExpr__Group_2__1"


    // $ANTLR start "rule__PrePrimaryExpr__Group_2__1__Impl"
    // InternalEventCalculus.g:6158:1: rule__PrePrimaryExpr__Group_2__1__Impl : ( ruleExpression ) ;
    public final void rule__PrePrimaryExpr__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6162:1: ( ( ruleExpression ) )
            // InternalEventCalculus.g:6163:1: ( ruleExpression )
            {
            // InternalEventCalculus.g:6163:1: ( ruleExpression )
            // InternalEventCalculus.g:6164:1: ruleExpression
            {
             before(grammarAccess.getPrePrimaryExprAccess().getExpressionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

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
    // $ANTLR end "rule__PrePrimaryExpr__Group_2__1__Impl"


    // $ANTLR start "rule__PrePrimaryExpr__Group_2__2"
    // InternalEventCalculus.g:6175:1: rule__PrePrimaryExpr__Group_2__2 : rule__PrePrimaryExpr__Group_2__2__Impl ;
    public final void rule__PrePrimaryExpr__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6179:1: ( rule__PrePrimaryExpr__Group_2__2__Impl )
            // InternalEventCalculus.g:6180:2: rule__PrePrimaryExpr__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrePrimaryExpr__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrePrimaryExpr__Group_2__2"


    // $ANTLR start "rule__PrePrimaryExpr__Group_2__2__Impl"
    // InternalEventCalculus.g:6186:1: rule__PrePrimaryExpr__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrePrimaryExpr__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6190:1: ( ( ')' ) )
            // InternalEventCalculus.g:6191:1: ( ')' )
            {
            // InternalEventCalculus.g:6191:1: ( ')' )
            // InternalEventCalculus.g:6192:1: ')'
            {
             before(grammarAccess.getPrePrimaryExprAccess().getRightParenthesisKeyword_2_2()); 
            match(input,31,FOLLOW_2); 
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
    // $ANTLR end "rule__PrePrimaryExpr__Group_2__2__Impl"


    // $ANTLR start "rule__PrePrimaryExpr__Group_3__0"
    // InternalEventCalculus.g:6211:1: rule__PrePrimaryExpr__Group_3__0 : rule__PrePrimaryExpr__Group_3__0__Impl rule__PrePrimaryExpr__Group_3__1 ;
    public final void rule__PrePrimaryExpr__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6215:1: ( rule__PrePrimaryExpr__Group_3__0__Impl rule__PrePrimaryExpr__Group_3__1 )
            // InternalEventCalculus.g:6216:2: rule__PrePrimaryExpr__Group_3__0__Impl rule__PrePrimaryExpr__Group_3__1
            {
            pushFollow(FOLLOW_15);
            rule__PrePrimaryExpr__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrePrimaryExpr__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrePrimaryExpr__Group_3__0"


    // $ANTLR start "rule__PrePrimaryExpr__Group_3__0__Impl"
    // InternalEventCalculus.g:6223:1: rule__PrePrimaryExpr__Group_3__0__Impl : ( '-' ) ;
    public final void rule__PrePrimaryExpr__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6227:1: ( ( '-' ) )
            // InternalEventCalculus.g:6228:1: ( '-' )
            {
            // InternalEventCalculus.g:6228:1: ( '-' )
            // InternalEventCalculus.g:6229:1: '-'
            {
             before(grammarAccess.getPrePrimaryExprAccess().getHyphenMinusKeyword_3_0()); 
            match(input,48,FOLLOW_2); 
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
    // $ANTLR end "rule__PrePrimaryExpr__Group_3__0__Impl"


    // $ANTLR start "rule__PrePrimaryExpr__Group_3__1"
    // InternalEventCalculus.g:6242:1: rule__PrePrimaryExpr__Group_3__1 : rule__PrePrimaryExpr__Group_3__1__Impl ;
    public final void rule__PrePrimaryExpr__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6246:1: ( rule__PrePrimaryExpr__Group_3__1__Impl )
            // InternalEventCalculus.g:6247:2: rule__PrePrimaryExpr__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrePrimaryExpr__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrePrimaryExpr__Group_3__1"


    // $ANTLR start "rule__PrePrimaryExpr__Group_3__1__Impl"
    // InternalEventCalculus.g:6253:1: rule__PrePrimaryExpr__Group_3__1__Impl : ( ( rule__PrePrimaryExpr__NAssignment_3_1 ) ) ;
    public final void rule__PrePrimaryExpr__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6257:1: ( ( ( rule__PrePrimaryExpr__NAssignment_3_1 ) ) )
            // InternalEventCalculus.g:6258:1: ( ( rule__PrePrimaryExpr__NAssignment_3_1 ) )
            {
            // InternalEventCalculus.g:6258:1: ( ( rule__PrePrimaryExpr__NAssignment_3_1 ) )
            // InternalEventCalculus.g:6259:1: ( rule__PrePrimaryExpr__NAssignment_3_1 )
            {
             before(grammarAccess.getPrePrimaryExprAccess().getNAssignment_3_1()); 
            // InternalEventCalculus.g:6260:1: ( rule__PrePrimaryExpr__NAssignment_3_1 )
            // InternalEventCalculus.g:6260:2: rule__PrePrimaryExpr__NAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PrePrimaryExpr__NAssignment_3_1();

            state._fsp--;


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
    // $ANTLR end "rule__PrePrimaryExpr__Group_3__1__Impl"


    // $ANTLR start "rule__AbstractRef__Group__0"
    // InternalEventCalculus.g:6274:1: rule__AbstractRef__Group__0 : rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1 ;
    public final void rule__AbstractRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6278:1: ( rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1 )
            // InternalEventCalculus.g:6279:2: rule__AbstractRef__Group__0__Impl rule__AbstractRef__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__AbstractRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRef__Group__0"


    // $ANTLR start "rule__AbstractRef__Group__0__Impl"
    // InternalEventCalculus.g:6286:1: rule__AbstractRef__Group__0__Impl : ( ( rule__AbstractRef__DefineAssignment_0 ) ) ;
    public final void rule__AbstractRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6290:1: ( ( ( rule__AbstractRef__DefineAssignment_0 ) ) )
            // InternalEventCalculus.g:6291:1: ( ( rule__AbstractRef__DefineAssignment_0 ) )
            {
            // InternalEventCalculus.g:6291:1: ( ( rule__AbstractRef__DefineAssignment_0 ) )
            // InternalEventCalculus.g:6292:1: ( rule__AbstractRef__DefineAssignment_0 )
            {
             before(grammarAccess.getAbstractRefAccess().getDefineAssignment_0()); 
            // InternalEventCalculus.g:6293:1: ( rule__AbstractRef__DefineAssignment_0 )
            // InternalEventCalculus.g:6293:2: rule__AbstractRef__DefineAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRef__DefineAssignment_0();

            state._fsp--;


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
    // $ANTLR end "rule__AbstractRef__Group__0__Impl"


    // $ANTLR start "rule__AbstractRef__Group__1"
    // InternalEventCalculus.g:6303:1: rule__AbstractRef__Group__1 : rule__AbstractRef__Group__1__Impl ;
    public final void rule__AbstractRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6307:1: ( rule__AbstractRef__Group__1__Impl )
            // InternalEventCalculus.g:6308:2: rule__AbstractRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRef__Group__1"


    // $ANTLR start "rule__AbstractRef__Group__1__Impl"
    // InternalEventCalculus.g:6314:1: rule__AbstractRef__Group__1__Impl : ( ( rule__AbstractRef__Group_1__0 )? ) ;
    public final void rule__AbstractRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6318:1: ( ( ( rule__AbstractRef__Group_1__0 )? ) )
            // InternalEventCalculus.g:6319:1: ( ( rule__AbstractRef__Group_1__0 )? )
            {
            // InternalEventCalculus.g:6319:1: ( ( rule__AbstractRef__Group_1__0 )? )
            // InternalEventCalculus.g:6320:1: ( rule__AbstractRef__Group_1__0 )?
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1()); 
            // InternalEventCalculus.g:6321:1: ( rule__AbstractRef__Group_1__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==30) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEventCalculus.g:6321:2: rule__AbstractRef__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractRef__Group_1__0();

                    state._fsp--;


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
    // $ANTLR end "rule__AbstractRef__Group__1__Impl"


    // $ANTLR start "rule__AbstractRef__Group_1__0"
    // InternalEventCalculus.g:6335:1: rule__AbstractRef__Group_1__0 : rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1 ;
    public final void rule__AbstractRef__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6339:1: ( rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1 )
            // InternalEventCalculus.g:6340:2: rule__AbstractRef__Group_1__0__Impl rule__AbstractRef__Group_1__1
            {
            pushFollow(FOLLOW_54);
            rule__AbstractRef__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRef__Group_1__0"


    // $ANTLR start "rule__AbstractRef__Group_1__0__Impl"
    // InternalEventCalculus.g:6347:1: rule__AbstractRef__Group_1__0__Impl : ( () ) ;
    public final void rule__AbstractRef__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6351:1: ( ( () ) )
            // InternalEventCalculus.g:6352:1: ( () )
            {
            // InternalEventCalculus.g:6352:1: ( () )
            // InternalEventCalculus.g:6353:1: ()
            {
             before(grammarAccess.getAbstractRefAccess().getFunctionRefFuncAction_1_0()); 
            // InternalEventCalculus.g:6354:1: ()
            // InternalEventCalculus.g:6356:1: 
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
    // $ANTLR end "rule__AbstractRef__Group_1__0__Impl"


    // $ANTLR start "rule__AbstractRef__Group_1__1"
    // InternalEventCalculus.g:6366:1: rule__AbstractRef__Group_1__1 : rule__AbstractRef__Group_1__1__Impl ;
    public final void rule__AbstractRef__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6370:1: ( rule__AbstractRef__Group_1__1__Impl )
            // InternalEventCalculus.g:6371:2: rule__AbstractRef__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRef__Group_1__1"


    // $ANTLR start "rule__AbstractRef__Group_1__1__Impl"
    // InternalEventCalculus.g:6377:1: rule__AbstractRef__Group_1__1__Impl : ( ( rule__AbstractRef__Group_1_1__0 ) ) ;
    public final void rule__AbstractRef__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6381:1: ( ( ( rule__AbstractRef__Group_1_1__0 ) ) )
            // InternalEventCalculus.g:6382:1: ( ( rule__AbstractRef__Group_1_1__0 ) )
            {
            // InternalEventCalculus.g:6382:1: ( ( rule__AbstractRef__Group_1_1__0 ) )
            // InternalEventCalculus.g:6383:1: ( rule__AbstractRef__Group_1_1__0 )
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1_1()); 
            // InternalEventCalculus.g:6384:1: ( rule__AbstractRef__Group_1_1__0 )
            // InternalEventCalculus.g:6384:2: rule__AbstractRef__Group_1_1__0
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group_1_1__0();

            state._fsp--;


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
    // $ANTLR end "rule__AbstractRef__Group_1__1__Impl"


    // $ANTLR start "rule__AbstractRef__Group_1_1__0"
    // InternalEventCalculus.g:6398:1: rule__AbstractRef__Group_1_1__0 : rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1 ;
    public final void rule__AbstractRef__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6402:1: ( rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1 )
            // InternalEventCalculus.g:6403:2: rule__AbstractRef__Group_1_1__0__Impl rule__AbstractRef__Group_1_1__1
            {
            pushFollow(FOLLOW_55);
            rule__AbstractRef__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRef__Group_1_1__0"


    // $ANTLR start "rule__AbstractRef__Group_1_1__0__Impl"
    // InternalEventCalculus.g:6410:1: rule__AbstractRef__Group_1_1__0__Impl : ( '(' ) ;
    public final void rule__AbstractRef__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6414:1: ( ( '(' ) )
            // InternalEventCalculus.g:6415:1: ( '(' )
            {
            // InternalEventCalculus.g:6415:1: ( '(' )
            // InternalEventCalculus.g:6416:1: '('
            {
             before(grammarAccess.getAbstractRefAccess().getLeftParenthesisKeyword_1_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // $ANTLR end "rule__AbstractRef__Group_1_1__0__Impl"


    // $ANTLR start "rule__AbstractRef__Group_1_1__1"
    // InternalEventCalculus.g:6429:1: rule__AbstractRef__Group_1_1__1 : rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2 ;
    public final void rule__AbstractRef__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6433:1: ( rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2 )
            // InternalEventCalculus.g:6434:2: rule__AbstractRef__Group_1_1__1__Impl rule__AbstractRef__Group_1_1__2
            {
            pushFollow(FOLLOW_55);
            rule__AbstractRef__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRef__Group_1_1__1"


    // $ANTLR start "rule__AbstractRef__Group_1_1__1__Impl"
    // InternalEventCalculus.g:6441:1: rule__AbstractRef__Group_1_1__1__Impl : ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? ) ;
    public final void rule__AbstractRef__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6445:1: ( ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? ) )
            // InternalEventCalculus.g:6446:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? )
            {
            // InternalEventCalculus.g:6446:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_1 )? )
            // InternalEventCalculus.g:6447:1: ( rule__AbstractRef__ArgsAssignment_1_1_1 )?
            {
             before(grammarAccess.getAbstractRefAccess().getArgsAssignment_1_1_1()); 
            // InternalEventCalculus.g:6448:1: ( rule__AbstractRef__ArgsAssignment_1_1_1 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_STRING && LA55_0<=RULE_BOOLEAN)||LA55_0==12||LA55_0==30||LA55_0==32||LA55_0==34||LA55_0==48) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalEventCalculus.g:6448:2: rule__AbstractRef__ArgsAssignment_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AbstractRef__ArgsAssignment_1_1_1();

                    state._fsp--;


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
    // $ANTLR end "rule__AbstractRef__Group_1_1__1__Impl"


    // $ANTLR start "rule__AbstractRef__Group_1_1__2"
    // InternalEventCalculus.g:6458:1: rule__AbstractRef__Group_1_1__2 : rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3 ;
    public final void rule__AbstractRef__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6462:1: ( rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3 )
            // InternalEventCalculus.g:6463:2: rule__AbstractRef__Group_1_1__2__Impl rule__AbstractRef__Group_1_1__3
            {
            pushFollow(FOLLOW_55);
            rule__AbstractRef__Group_1_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group_1_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRef__Group_1_1__2"


    // $ANTLR start "rule__AbstractRef__Group_1_1__2__Impl"
    // InternalEventCalculus.g:6470:1: rule__AbstractRef__Group_1_1__2__Impl : ( ( rule__AbstractRef__Group_1_1_2__0 )* ) ;
    public final void rule__AbstractRef__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6474:1: ( ( ( rule__AbstractRef__Group_1_1_2__0 )* ) )
            // InternalEventCalculus.g:6475:1: ( ( rule__AbstractRef__Group_1_1_2__0 )* )
            {
            // InternalEventCalculus.g:6475:1: ( ( rule__AbstractRef__Group_1_1_2__0 )* )
            // InternalEventCalculus.g:6476:1: ( rule__AbstractRef__Group_1_1_2__0 )*
            {
             before(grammarAccess.getAbstractRefAccess().getGroup_1_1_2()); 
            // InternalEventCalculus.g:6477:1: ( rule__AbstractRef__Group_1_1_2__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==26) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalEventCalculus.g:6477:2: rule__AbstractRef__Group_1_1_2__0
            	    {
            	    pushFollow(FOLLOW_21);
            	    rule__AbstractRef__Group_1_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
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
    // $ANTLR end "rule__AbstractRef__Group_1_1__2__Impl"


    // $ANTLR start "rule__AbstractRef__Group_1_1__3"
    // InternalEventCalculus.g:6487:1: rule__AbstractRef__Group_1_1__3 : rule__AbstractRef__Group_1_1__3__Impl ;
    public final void rule__AbstractRef__Group_1_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6491:1: ( rule__AbstractRef__Group_1_1__3__Impl )
            // InternalEventCalculus.g:6492:2: rule__AbstractRef__Group_1_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group_1_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRef__Group_1_1__3"


    // $ANTLR start "rule__AbstractRef__Group_1_1__3__Impl"
    // InternalEventCalculus.g:6498:1: rule__AbstractRef__Group_1_1__3__Impl : ( ')' ) ;
    public final void rule__AbstractRef__Group_1_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6502:1: ( ( ')' ) )
            // InternalEventCalculus.g:6503:1: ( ')' )
            {
            // InternalEventCalculus.g:6503:1: ( ')' )
            // InternalEventCalculus.g:6504:1: ')'
            {
             before(grammarAccess.getAbstractRefAccess().getRightParenthesisKeyword_1_1_3()); 
            match(input,31,FOLLOW_2); 
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
    // $ANTLR end "rule__AbstractRef__Group_1_1__3__Impl"


    // $ANTLR start "rule__AbstractRef__Group_1_1_2__0"
    // InternalEventCalculus.g:6525:1: rule__AbstractRef__Group_1_1_2__0 : rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1 ;
    public final void rule__AbstractRef__Group_1_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6529:1: ( rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1 )
            // InternalEventCalculus.g:6530:2: rule__AbstractRef__Group_1_1_2__0__Impl rule__AbstractRef__Group_1_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__AbstractRef__Group_1_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group_1_1_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRef__Group_1_1_2__0"


    // $ANTLR start "rule__AbstractRef__Group_1_1_2__0__Impl"
    // InternalEventCalculus.g:6537:1: rule__AbstractRef__Group_1_1_2__0__Impl : ( ',' ) ;
    public final void rule__AbstractRef__Group_1_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6541:1: ( ( ',' ) )
            // InternalEventCalculus.g:6542:1: ( ',' )
            {
            // InternalEventCalculus.g:6542:1: ( ',' )
            // InternalEventCalculus.g:6543:1: ','
            {
             before(grammarAccess.getAbstractRefAccess().getCommaKeyword_1_1_2_0()); 
            match(input,26,FOLLOW_2); 
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
    // $ANTLR end "rule__AbstractRef__Group_1_1_2__0__Impl"


    // $ANTLR start "rule__AbstractRef__Group_1_1_2__1"
    // InternalEventCalculus.g:6556:1: rule__AbstractRef__Group_1_1_2__1 : rule__AbstractRef__Group_1_1_2__1__Impl ;
    public final void rule__AbstractRef__Group_1_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6560:1: ( rule__AbstractRef__Group_1_1_2__1__Impl )
            // InternalEventCalculus.g:6561:2: rule__AbstractRef__Group_1_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRef__Group_1_1_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AbstractRef__Group_1_1_2__1"


    // $ANTLR start "rule__AbstractRef__Group_1_1_2__1__Impl"
    // InternalEventCalculus.g:6567:1: rule__AbstractRef__Group_1_1_2__1__Impl : ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) ) ;
    public final void rule__AbstractRef__Group_1_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6571:1: ( ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) ) )
            // InternalEventCalculus.g:6572:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) )
            {
            // InternalEventCalculus.g:6572:1: ( ( rule__AbstractRef__ArgsAssignment_1_1_2_1 ) )
            // InternalEventCalculus.g:6573:1: ( rule__AbstractRef__ArgsAssignment_1_1_2_1 )
            {
             before(grammarAccess.getAbstractRefAccess().getArgsAssignment_1_1_2_1()); 
            // InternalEventCalculus.g:6574:1: ( rule__AbstractRef__ArgsAssignment_1_1_2_1 )
            // InternalEventCalculus.g:6574:2: rule__AbstractRef__ArgsAssignment_1_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AbstractRef__ArgsAssignment_1_1_2_1();

            state._fsp--;


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
    // $ANTLR end "rule__AbstractRef__Group_1_1_2__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__0"
    // InternalEventCalculus.g:6588:1: rule__TerminalExpression__Group_0__0 : rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 ;
    public final void rule__TerminalExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6592:1: ( rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1 )
            // InternalEventCalculus.g:6593:2: rule__TerminalExpression__Group_0__0__Impl rule__TerminalExpression__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__TerminalExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__0"


    // $ANTLR start "rule__TerminalExpression__Group_0__0__Impl"
    // InternalEventCalculus.g:6600:1: rule__TerminalExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6604:1: ( ( () ) )
            // InternalEventCalculus.g:6605:1: ( () )
            {
            // InternalEventCalculus.g:6605:1: ( () )
            // InternalEventCalculus.g:6606:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getIntLiteralAction_0_0()); 
            // InternalEventCalculus.g:6607:1: ()
            // InternalEventCalculus.g:6609:1: 
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
    // $ANTLR end "rule__TerminalExpression__Group_0__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_0__1"
    // InternalEventCalculus.g:6619:1: rule__TerminalExpression__Group_0__1 : rule__TerminalExpression__Group_0__1__Impl ;
    public final void rule__TerminalExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6623:1: ( rule__TerminalExpression__Group_0__1__Impl )
            // InternalEventCalculus.g:6624:2: rule__TerminalExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_0__1"


    // $ANTLR start "rule__TerminalExpression__Group_0__1__Impl"
    // InternalEventCalculus.g:6630:1: rule__TerminalExpression__Group_0__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__TerminalExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6634:1: ( ( ( rule__TerminalExpression__ValueAssignment_0_1 ) ) )
            // InternalEventCalculus.g:6635:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            {
            // InternalEventCalculus.g:6635:1: ( ( rule__TerminalExpression__ValueAssignment_0_1 ) )
            // InternalEventCalculus.g:6636:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_0_1()); 
            // InternalEventCalculus.g:6637:1: ( rule__TerminalExpression__ValueAssignment_0_1 )
            // InternalEventCalculus.g:6637:2: rule__TerminalExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_0_1();

            state._fsp--;


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
    // $ANTLR end "rule__TerminalExpression__Group_0__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__0"
    // InternalEventCalculus.g:6651:1: rule__TerminalExpression__Group_1__0 : rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 ;
    public final void rule__TerminalExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6655:1: ( rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1 )
            // InternalEventCalculus.g:6656:2: rule__TerminalExpression__Group_1__0__Impl rule__TerminalExpression__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__TerminalExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__0"


    // $ANTLR start "rule__TerminalExpression__Group_1__0__Impl"
    // InternalEventCalculus.g:6663:1: rule__TerminalExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6667:1: ( ( () ) )
            // InternalEventCalculus.g:6668:1: ( () )
            {
            // InternalEventCalculus.g:6668:1: ( () )
            // InternalEventCalculus.g:6669:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getStringLiteralAction_1_0()); 
            // InternalEventCalculus.g:6670:1: ()
            // InternalEventCalculus.g:6672:1: 
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
    // $ANTLR end "rule__TerminalExpression__Group_1__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_1__1"
    // InternalEventCalculus.g:6682:1: rule__TerminalExpression__Group_1__1 : rule__TerminalExpression__Group_1__1__Impl ;
    public final void rule__TerminalExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6686:1: ( rule__TerminalExpression__Group_1__1__Impl )
            // InternalEventCalculus.g:6687:2: rule__TerminalExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_1__1"


    // $ANTLR start "rule__TerminalExpression__Group_1__1__Impl"
    // InternalEventCalculus.g:6693:1: rule__TerminalExpression__Group_1__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__TerminalExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6697:1: ( ( ( rule__TerminalExpression__ValueAssignment_1_1 ) ) )
            // InternalEventCalculus.g:6698:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            {
            // InternalEventCalculus.g:6698:1: ( ( rule__TerminalExpression__ValueAssignment_1_1 ) )
            // InternalEventCalculus.g:6699:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_1_1()); 
            // InternalEventCalculus.g:6700:1: ( rule__TerminalExpression__ValueAssignment_1_1 )
            // InternalEventCalculus.g:6700:2: rule__TerminalExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_1_1();

            state._fsp--;


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
    // $ANTLR end "rule__TerminalExpression__Group_1__1__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__0"
    // InternalEventCalculus.g:6714:1: rule__TerminalExpression__Group_2__0 : rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 ;
    public final void rule__TerminalExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6718:1: ( rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1 )
            // InternalEventCalculus.g:6719:2: rule__TerminalExpression__Group_2__0__Impl rule__TerminalExpression__Group_2__1
            {
            pushFollow(FOLLOW_56);
            rule__TerminalExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__0"


    // $ANTLR start "rule__TerminalExpression__Group_2__0__Impl"
    // InternalEventCalculus.g:6726:1: rule__TerminalExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__TerminalExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6730:1: ( ( () ) )
            // InternalEventCalculus.g:6731:1: ( () )
            {
            // InternalEventCalculus.g:6731:1: ( () )
            // InternalEventCalculus.g:6732:1: ()
            {
             before(grammarAccess.getTerminalExpressionAccess().getBooleanLiteralAction_2_0()); 
            // InternalEventCalculus.g:6733:1: ()
            // InternalEventCalculus.g:6735:1: 
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
    // $ANTLR end "rule__TerminalExpression__Group_2__0__Impl"


    // $ANTLR start "rule__TerminalExpression__Group_2__1"
    // InternalEventCalculus.g:6745:1: rule__TerminalExpression__Group_2__1 : rule__TerminalExpression__Group_2__1__Impl ;
    public final void rule__TerminalExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6749:1: ( rule__TerminalExpression__Group_2__1__Impl )
            // InternalEventCalculus.g:6750:2: rule__TerminalExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TerminalExpression__Group_2__1"


    // $ANTLR start "rule__TerminalExpression__Group_2__1__Impl"
    // InternalEventCalculus.g:6756:1: rule__TerminalExpression__Group_2__1__Impl : ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__TerminalExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6760:1: ( ( ( rule__TerminalExpression__ValueAssignment_2_1 ) ) )
            // InternalEventCalculus.g:6761:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            {
            // InternalEventCalculus.g:6761:1: ( ( rule__TerminalExpression__ValueAssignment_2_1 ) )
            // InternalEventCalculus.g:6762:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueAssignment_2_1()); 
            // InternalEventCalculus.g:6763:1: ( rule__TerminalExpression__ValueAssignment_2_1 )
            // InternalEventCalculus.g:6763:2: rule__TerminalExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__TerminalExpression__ValueAssignment_2_1();

            state._fsp--;


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
    // $ANTLR end "rule__TerminalExpression__Group_2__1__Impl"


    // $ANTLR start "rule__Model__ImportsAssignment_0"
    // InternalEventCalculus.g:6780:1: rule__Model__ImportsAssignment_0 : ( ruleImport ) ;
    public final void rule__Model__ImportsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6784:1: ( ( ruleImport ) )
            // InternalEventCalculus.g:6785:1: ( ruleImport )
            {
            // InternalEventCalculus.g:6785:1: ( ruleImport )
            // InternalEventCalculus.g:6786:1: ruleImport
            {
             before(grammarAccess.getModelAccess().getImportsImportParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

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
    // $ANTLR end "rule__Model__ImportsAssignment_0"


    // $ANTLR start "rule__Model__DeclarationsAssignment_1_0"
    // InternalEventCalculus.g:6795:1: rule__Model__DeclarationsAssignment_1_0 : ( ruleDeclaration ) ;
    public final void rule__Model__DeclarationsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6799:1: ( ( ruleDeclaration ) )
            // InternalEventCalculus.g:6800:1: ( ruleDeclaration )
            {
            // InternalEventCalculus.g:6800:1: ( ruleDeclaration )
            // InternalEventCalculus.g:6801:1: ruleDeclaration
            {
             before(grammarAccess.getModelAccess().getDeclarationsDeclarationParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDeclaration();

            state._fsp--;

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
    // $ANTLR end "rule__Model__DeclarationsAssignment_1_0"


    // $ANTLR start "rule__Model__StatementsAssignment_1_1"
    // InternalEventCalculus.g:6810:1: rule__Model__StatementsAssignment_1_1 : ( ruleStatement ) ;
    public final void rule__Model__StatementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6814:1: ( ( ruleStatement ) )
            // InternalEventCalculus.g:6815:1: ( ruleStatement )
            {
            // InternalEventCalculus.g:6815:1: ( ruleStatement )
            // InternalEventCalculus.g:6816:1: ruleStatement
            {
             before(grammarAccess.getModelAccess().getStatementsStatementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

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
    // $ANTLR end "rule__Model__StatementsAssignment_1_1"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalEventCalculus.g:6825:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6829:1: ( ( RULE_STRING ) )
            // InternalEventCalculus.g:6830:1: ( RULE_STRING )
            {
            // InternalEventCalculus.g:6830:1: ( RULE_STRING )
            // InternalEventCalculus.g:6831:1: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__Annotation__TypeAssignment_2"
    // InternalEventCalculus.g:6840:1: rule__Annotation__TypeAssignment_2 : ( ruleANNOTATION_TYPE ) ;
    public final void rule__Annotation__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6844:1: ( ( ruleANNOTATION_TYPE ) )
            // InternalEventCalculus.g:6845:1: ( ruleANNOTATION_TYPE )
            {
            // InternalEventCalculus.g:6845:1: ( ruleANNOTATION_TYPE )
            // InternalEventCalculus.g:6846:1: ruleANNOTATION_TYPE
            {
             before(grammarAccess.getAnnotationAccess().getTypeANNOTATION_TYPEEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleANNOTATION_TYPE();

            state._fsp--;

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
    // $ANTLR end "rule__Annotation__TypeAssignment_2"


    // $ANTLR start "rule__Annotation__ValueAssignment_3_0"
    // InternalEventCalculus.g:6855:1: rule__Annotation__ValueAssignment_3_0 : ( RULE_STRING ) ;
    public final void rule__Annotation__ValueAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6859:1: ( ( RULE_STRING ) )
            // InternalEventCalculus.g:6860:1: ( RULE_STRING )
            {
            // InternalEventCalculus.g:6860:1: ( RULE_STRING )
            // InternalEventCalculus.g:6861:1: RULE_STRING
            {
             before(grammarAccess.getAnnotationAccess().getValueSTRINGTerminalRuleCall_3_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // $ANTLR end "rule__Annotation__ValueAssignment_3_0"


    // $ANTLR start "rule__Annotation__ValueAssignment_3_1"
    // InternalEventCalculus.g:6870:1: rule__Annotation__ValueAssignment_3_1 : ( ( 'not' ) ) ;
    public final void rule__Annotation__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6874:1: ( ( ( 'not' ) ) )
            // InternalEventCalculus.g:6875:1: ( ( 'not' ) )
            {
            // InternalEventCalculus.g:6875:1: ( ( 'not' ) )
            // InternalEventCalculus.g:6876:1: ( 'not' )
            {
             before(grammarAccess.getAnnotationAccess().getValueNotKeyword_3_1_0()); 
            // InternalEventCalculus.g:6877:1: ( 'not' )
            // InternalEventCalculus.g:6878:1: 'not'
            {
             before(grammarAccess.getAnnotationAccess().getValueNotKeyword_3_1_0()); 
            match(input,52,FOLLOW_2); 
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
    // $ANTLR end "rule__Annotation__ValueAssignment_3_1"


    // $ANTLR start "rule__DefSort__AnnotationsAssignment_0"
    // InternalEventCalculus.g:6893:1: rule__DefSort__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefSort__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6897:1: ( ( ruleAnnotation ) )
            // InternalEventCalculus.g:6898:1: ( ruleAnnotation )
            {
            // InternalEventCalculus.g:6898:1: ( ruleAnnotation )
            // InternalEventCalculus.g:6899:1: ruleAnnotation
            {
             before(grammarAccess.getDefSortAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

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
    // $ANTLR end "rule__DefSort__AnnotationsAssignment_0"


    // $ANTLR start "rule__DefSort__ReifiedAssignment_1"
    // InternalEventCalculus.g:6908:1: rule__DefSort__ReifiedAssignment_1 : ( ( 'reified' ) ) ;
    public final void rule__DefSort__ReifiedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6912:1: ( ( ( 'reified' ) ) )
            // InternalEventCalculus.g:6913:1: ( ( 'reified' ) )
            {
            // InternalEventCalculus.g:6913:1: ( ( 'reified' ) )
            // InternalEventCalculus.g:6914:1: ( 'reified' )
            {
             before(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_1_0()); 
            // InternalEventCalculus.g:6915:1: ( 'reified' )
            // InternalEventCalculus.g:6916:1: 'reified'
            {
             before(grammarAccess.getDefSortAccess().getReifiedReifiedKeyword_1_0()); 
            match(input,53,FOLLOW_2); 
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
    // $ANTLR end "rule__DefSort__ReifiedAssignment_1"


    // $ANTLR start "rule__DefSort__NameAssignment_3"
    // InternalEventCalculus.g:6931:1: rule__DefSort__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__DefSort__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6935:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:6936:1: ( RULE_ID )
            {
            // InternalEventCalculus.g:6936:1: ( RULE_ID )
            // InternalEventCalculus.g:6937:1: RULE_ID
            {
             before(grammarAccess.getDefSortAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefSort__NameAssignment_3"


    // $ANTLR start "rule__DefSort__TypeAssignment_4_1"
    // InternalEventCalculus.g:6946:1: rule__DefSort__TypeAssignment_4_1 : ( RULE_ID ) ;
    public final void rule__DefSort__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6950:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:6951:1: ( RULE_ID )
            {
            // InternalEventCalculus.g:6951:1: ( RULE_ID )
            // InternalEventCalculus.g:6952:1: RULE_ID
            {
             before(grammarAccess.getDefSortAccess().getTypeIDTerminalRuleCall_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefSort__TypeAssignment_4_1"


    // $ANTLR start "rule__DefRange__AnnotationsAssignment_0"
    // InternalEventCalculus.g:6961:1: rule__DefRange__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefRange__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6965:1: ( ( ruleAnnotation ) )
            // InternalEventCalculus.g:6966:1: ( ruleAnnotation )
            {
            // InternalEventCalculus.g:6966:1: ( ruleAnnotation )
            // InternalEventCalculus.g:6967:1: ruleAnnotation
            {
             before(grammarAccess.getDefRangeAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

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
    // $ANTLR end "rule__DefRange__AnnotationsAssignment_0"


    // $ANTLR start "rule__DefRange__NameAssignment_2"
    // InternalEventCalculus.g:6976:1: rule__DefRange__NameAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefRange__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6980:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:6981:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:6981:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:6982:1: ( RULE_ID )
            {
             before(grammarAccess.getDefRangeAccess().getNameDefSortCrossReference_2_0()); 
            // InternalEventCalculus.g:6983:1: ( RULE_ID )
            // InternalEventCalculus.g:6984:1: RULE_ID
            {
             before(grammarAccess.getDefRangeAccess().getNameDefSortIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefRange__NameAssignment_2"


    // $ANTLR start "rule__DefRange__MinAssignment_3"
    // InternalEventCalculus.g:6995:1: rule__DefRange__MinAssignment_3 : ( RULE_INT ) ;
    public final void rule__DefRange__MinAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:6999:1: ( ( RULE_INT ) )
            // InternalEventCalculus.g:7000:1: ( RULE_INT )
            {
            // InternalEventCalculus.g:7000:1: ( RULE_INT )
            // InternalEventCalculus.g:7001:1: RULE_INT
            {
             before(grammarAccess.getDefRangeAccess().getMinINTTerminalRuleCall_3_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // $ANTLR end "rule__DefRange__MinAssignment_3"


    // $ANTLR start "rule__DefRange__MaxAssignment_4"
    // InternalEventCalculus.g:7010:1: rule__DefRange__MaxAssignment_4 : ( RULE_INT ) ;
    public final void rule__DefRange__MaxAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7014:1: ( ( RULE_INT ) )
            // InternalEventCalculus.g:7015:1: ( RULE_INT )
            {
            // InternalEventCalculus.g:7015:1: ( RULE_INT )
            // InternalEventCalculus.g:7016:1: RULE_INT
            {
             before(grammarAccess.getDefRangeAccess().getMaxINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // $ANTLR end "rule__DefRange__MaxAssignment_4"


    // $ANTLR start "rule__DefOption__AnnotationsAssignment_0"
    // InternalEventCalculus.g:7025:1: rule__DefOption__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefOption__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7029:1: ( ( ruleAnnotation ) )
            // InternalEventCalculus.g:7030:1: ( ruleAnnotation )
            {
            // InternalEventCalculus.g:7030:1: ( ruleAnnotation )
            // InternalEventCalculus.g:7031:1: ruleAnnotation
            {
             before(grammarAccess.getDefOptionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

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
    // $ANTLR end "rule__DefOption__AnnotationsAssignment_0"


    // $ANTLR start "rule__DefOption__NameAssignment_1_0_1"
    // InternalEventCalculus.g:7040:1: rule__DefOption__NameAssignment_1_0_1 : ( RULE_ID ) ;
    public final void rule__DefOption__NameAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7044:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7045:1: ( RULE_ID )
            {
            // InternalEventCalculus.g:7045:1: ( RULE_ID )
            // InternalEventCalculus.g:7046:1: RULE_ID
            {
             before(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefOption__NameAssignment_1_0_1"


    // $ANTLR start "rule__DefOption__ValueAssignment_1_0_2"
    // InternalEventCalculus.g:7055:1: rule__DefOption__ValueAssignment_1_0_2 : ( RULE_INT ) ;
    public final void rule__DefOption__ValueAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7059:1: ( ( RULE_INT ) )
            // InternalEventCalculus.g:7060:1: ( RULE_INT )
            {
            // InternalEventCalculus.g:7060:1: ( RULE_INT )
            // InternalEventCalculus.g:7061:1: RULE_INT
            {
             before(grammarAccess.getDefOptionAccess().getValueINTTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // $ANTLR end "rule__DefOption__ValueAssignment_1_0_2"


    // $ANTLR start "rule__DefOption__NameAssignment_1_1_1"
    // InternalEventCalculus.g:7070:1: rule__DefOption__NameAssignment_1_1_1 : ( RULE_ID ) ;
    public final void rule__DefOption__NameAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7074:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7075:1: ( RULE_ID )
            {
            // InternalEventCalculus.g:7075:1: ( RULE_ID )
            // InternalEventCalculus.g:7076:1: RULE_ID
            {
             before(grammarAccess.getDefOptionAccess().getNameIDTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefOption__NameAssignment_1_1_1"


    // $ANTLR start "rule__DefOption__Value2Assignment_1_1_2"
    // InternalEventCalculus.g:7085:1: rule__DefOption__Value2Assignment_1_1_2 : ( RULE_ID ) ;
    public final void rule__DefOption__Value2Assignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7089:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7090:1: ( RULE_ID )
            {
            // InternalEventCalculus.g:7090:1: ( RULE_ID )
            // InternalEventCalculus.g:7091:1: RULE_ID
            {
             before(grammarAccess.getDefOptionAccess().getValue2IDTerminalRuleCall_1_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefOption__Value2Assignment_1_1_2"


    // $ANTLR start "rule__DefCompletion__AnnotationsAssignment_0"
    // InternalEventCalculus.g:7100:1: rule__DefCompletion__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefCompletion__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7104:1: ( ( ruleAnnotation ) )
            // InternalEventCalculus.g:7105:1: ( ruleAnnotation )
            {
            // InternalEventCalculus.g:7105:1: ( ruleAnnotation )
            // InternalEventCalculus.g:7106:1: ruleAnnotation
            {
             before(grammarAccess.getDefCompletionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

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
    // $ANTLR end "rule__DefCompletion__AnnotationsAssignment_0"


    // $ANTLR start "rule__DefCompletion__TypeAssignment_2"
    // InternalEventCalculus.g:7115:1: rule__DefCompletion__TypeAssignment_2 : ( ruleLabelType ) ;
    public final void rule__DefCompletion__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7119:1: ( ( ruleLabelType ) )
            // InternalEventCalculus.g:7120:1: ( ruleLabelType )
            {
            // InternalEventCalculus.g:7120:1: ( ruleLabelType )
            // InternalEventCalculus.g:7121:1: ruleLabelType
            {
             before(grammarAccess.getDefCompletionAccess().getTypeLabelTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLabelType();

            state._fsp--;

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
    // $ANTLR end "rule__DefCompletion__TypeAssignment_2"


    // $ANTLR start "rule__DefCompletion__LabelAssignment_3"
    // InternalEventCalculus.g:7130:1: rule__DefCompletion__LabelAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__DefCompletion__LabelAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7134:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7135:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7135:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7136:1: ( RULE_ID )
            {
             before(grammarAccess.getDefCompletionAccess().getLabelDefinitionCrossReference_3_0()); 
            // InternalEventCalculus.g:7137:1: ( RULE_ID )
            // InternalEventCalculus.g:7138:1: RULE_ID
            {
             before(grammarAccess.getDefCompletionAccess().getLabelDefinitionIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefCompletion__LabelAssignment_3"


    // $ANTLR start "rule__DefNonInertia__AnnotationsAssignment_0"
    // InternalEventCalculus.g:7149:1: rule__DefNonInertia__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefNonInertia__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7153:1: ( ( ruleAnnotation ) )
            // InternalEventCalculus.g:7154:1: ( ruleAnnotation )
            {
            // InternalEventCalculus.g:7154:1: ( ruleAnnotation )
            // InternalEventCalculus.g:7155:1: ruleAnnotation
            {
             before(grammarAccess.getDefNonInertiaAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

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
    // $ANTLR end "rule__DefNonInertia__AnnotationsAssignment_0"


    // $ANTLR start "rule__DefNonInertia__NamesAssignment_2"
    // InternalEventCalculus.g:7164:1: rule__DefNonInertia__NamesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefNonInertia__NamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7168:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7169:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7169:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7170:1: ( RULE_ID )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_2_0()); 
            // InternalEventCalculus.g:7171:1: ( RULE_ID )
            // InternalEventCalculus.g:7172:1: RULE_ID
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefNonInertia__NamesAssignment_2"


    // $ANTLR start "rule__DefNonInertia__NamesAssignment_3_1"
    // InternalEventCalculus.g:7183:1: rule__DefNonInertia__NamesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefNonInertia__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7187:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7188:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7188:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7189:1: ( RULE_ID )
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionCrossReference_3_1_0()); 
            // InternalEventCalculus.g:7190:1: ( RULE_ID )
            // InternalEventCalculus.g:7191:1: RULE_ID
            {
             before(grammarAccess.getDefNonInertiaAccess().getNamesDefinitionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefNonInertia__NamesAssignment_3_1"


    // $ANTLR start "rule__DefXor__AnnotationsAssignment_0"
    // InternalEventCalculus.g:7202:1: rule__DefXor__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefXor__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7206:1: ( ( ruleAnnotation ) )
            // InternalEventCalculus.g:7207:1: ( ruleAnnotation )
            {
            // InternalEventCalculus.g:7207:1: ( ruleAnnotation )
            // InternalEventCalculus.g:7208:1: ruleAnnotation
            {
             before(grammarAccess.getDefXorAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

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
    // $ANTLR end "rule__DefXor__AnnotationsAssignment_0"


    // $ANTLR start "rule__DefXor__NamesAssignment_2"
    // InternalEventCalculus.g:7217:1: rule__DefXor__NamesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefXor__NamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7221:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7222:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7222:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7223:1: ( RULE_ID )
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_2_0()); 
            // InternalEventCalculus.g:7224:1: ( RULE_ID )
            // InternalEventCalculus.g:7225:1: RULE_ID
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefXor__NamesAssignment_2"


    // $ANTLR start "rule__DefXor__NamesAssignment_3_1"
    // InternalEventCalculus.g:7236:1: rule__DefXor__NamesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefXor__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7240:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7241:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7241:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7242:1: ( RULE_ID )
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionCrossReference_3_1_0()); 
            // InternalEventCalculus.g:7243:1: ( RULE_ID )
            // InternalEventCalculus.g:7244:1: RULE_ID
            {
             before(grammarAccess.getDefXorAccess().getNamesDefinitionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefXor__NamesAssignment_3_1"


    // $ANTLR start "rule__DefMutex__AnnotationsAssignment_0"
    // InternalEventCalculus.g:7255:1: rule__DefMutex__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__DefMutex__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7259:1: ( ( ruleAnnotation ) )
            // InternalEventCalculus.g:7260:1: ( ruleAnnotation )
            {
            // InternalEventCalculus.g:7260:1: ( ruleAnnotation )
            // InternalEventCalculus.g:7261:1: ruleAnnotation
            {
             before(grammarAccess.getDefMutexAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

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
    // $ANTLR end "rule__DefMutex__AnnotationsAssignment_0"


    // $ANTLR start "rule__DefMutex__NamesAssignment_2"
    // InternalEventCalculus.g:7270:1: rule__DefMutex__NamesAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__DefMutex__NamesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7274:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7275:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7275:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7276:1: ( RULE_ID )
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_2_0()); 
            // InternalEventCalculus.g:7277:1: ( RULE_ID )
            // InternalEventCalculus.g:7278:1: RULE_ID
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefMutex__NamesAssignment_2"


    // $ANTLR start "rule__DefMutex__NamesAssignment_3_1"
    // InternalEventCalculus.g:7289:1: rule__DefMutex__NamesAssignment_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__DefMutex__NamesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7293:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7294:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7294:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7295:1: ( RULE_ID )
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionCrossReference_3_1_0()); 
            // InternalEventCalculus.g:7296:1: ( RULE_ID )
            // InternalEventCalculus.g:7297:1: RULE_ID
            {
             before(grammarAccess.getDefMutexAccess().getNamesDefinitionIDTerminalRuleCall_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__DefMutex__NamesAssignment_3_1"


    // $ANTLR start "rule__LabeledExpression__AnnotationsAssignment_0"
    // InternalEventCalculus.g:7308:1: rule__LabeledExpression__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__LabeledExpression__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7312:1: ( ( ruleAnnotation ) )
            // InternalEventCalculus.g:7313:1: ( ruleAnnotation )
            {
            // InternalEventCalculus.g:7313:1: ( ruleAnnotation )
            // InternalEventCalculus.g:7314:1: ruleAnnotation
            {
             before(grammarAccess.getLabeledExpressionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

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
    // $ANTLR end "rule__LabeledExpression__AnnotationsAssignment_0"


    // $ANTLR start "rule__LabeledExpression__NameAssignment_1_0"
    // InternalEventCalculus.g:7323:1: rule__LabeledExpression__NameAssignment_1_0 : ( ruleLabelType ) ;
    public final void rule__LabeledExpression__NameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7327:1: ( ( ruleLabelType ) )
            // InternalEventCalculus.g:7328:1: ( ruleLabelType )
            {
            // InternalEventCalculus.g:7328:1: ( ruleLabelType )
            // InternalEventCalculus.g:7329:1: ruleLabelType
            {
             before(grammarAccess.getLabeledExpressionAccess().getNameLabelTypeEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLabelType();

            state._fsp--;

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
    // $ANTLR end "rule__LabeledExpression__NameAssignment_1_0"


    // $ANTLR start "rule__LabeledExpression__ExprAssignment_2"
    // InternalEventCalculus.g:7338:1: rule__LabeledExpression__ExprAssignment_2 : ( ruleExpression ) ;
    public final void rule__LabeledExpression__ExprAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7342:1: ( ( ruleExpression ) )
            // InternalEventCalculus.g:7343:1: ( ruleExpression )
            {
            // InternalEventCalculus.g:7343:1: ( ruleExpression )
            // InternalEventCalculus.g:7344:1: ruleExpression
            {
             before(grammarAccess.getLabeledExpressionAccess().getExprExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

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
    // $ANTLR end "rule__LabeledExpression__ExprAssignment_2"


    // $ANTLR start "rule__SortDefinition__AnnotationsAssignment_0"
    // InternalEventCalculus.g:7353:1: rule__SortDefinition__AnnotationsAssignment_0 : ( ruleAnnotation ) ;
    public final void rule__SortDefinition__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7357:1: ( ( ruleAnnotation ) )
            // InternalEventCalculus.g:7358:1: ( ruleAnnotation )
            {
            // InternalEventCalculus.g:7358:1: ( ruleAnnotation )
            // InternalEventCalculus.g:7359:1: ruleAnnotation
            {
             before(grammarAccess.getSortDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAnnotation();

            state._fsp--;

             after(grammarAccess.getSortDefinitionAccess().getAnnotationsAnnotationParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__AnnotationsAssignment_0"


    // $ANTLR start "rule__SortDefinition__SortAssignment_1"
    // InternalEventCalculus.g:7368:1: rule__SortDefinition__SortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__SortDefinition__SortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7372:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7373:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7373:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7374:1: ( RULE_ID )
            {
             before(grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_1_0()); 
            // InternalEventCalculus.g:7375:1: ( RULE_ID )
            // InternalEventCalculus.g:7376:1: RULE_ID
            {
             before(grammarAccess.getSortDefinitionAccess().getSortDefSortIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSortDefinitionAccess().getSortDefSortIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSortDefinitionAccess().getSortDefSortCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__SortAssignment_1"


    // $ANTLR start "rule__SortDefinition__DefinitionsAssignment_2"
    // InternalEventCalculus.g:7387:1: rule__SortDefinition__DefinitionsAssignment_2 : ( ruleDefinition ) ;
    public final void rule__SortDefinition__DefinitionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7391:1: ( ( ruleDefinition ) )
            // InternalEventCalculus.g:7392:1: ( ruleDefinition )
            {
            // InternalEventCalculus.g:7392:1: ( ruleDefinition )
            // InternalEventCalculus.g:7393:1: ruleDefinition
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__DefinitionsAssignment_2"


    // $ANTLR start "rule__SortDefinition__DefinitionsAssignment_3_1"
    // InternalEventCalculus.g:7402:1: rule__SortDefinition__DefinitionsAssignment_3_1 : ( ruleDefinition ) ;
    public final void rule__SortDefinition__DefinitionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7406:1: ( ( ruleDefinition ) )
            // InternalEventCalculus.g:7407:1: ( ruleDefinition )
            {
            // InternalEventCalculus.g:7407:1: ( ruleDefinition )
            // InternalEventCalculus.g:7408:1: ruleDefinition
            {
             before(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getSortDefinitionAccess().getDefinitionsDefinitionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SortDefinition__DefinitionsAssignment_3_1"


    // $ANTLR start "rule__Definition__NameAssignment_0"
    // InternalEventCalculus.g:7417:1: rule__Definition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Definition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7421:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7422:1: ( RULE_ID )
            {
            // InternalEventCalculus.g:7422:1: ( RULE_ID )
            // InternalEventCalculus.g:7423:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Definition__NameAssignment_0"


    // $ANTLR start "rule__Definition__ArgsAssignment_1_1"
    // InternalEventCalculus.g:7432:1: rule__Definition__ArgsAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Definition__ArgsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7436:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7437:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7437:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7438:1: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_1_0()); 
            // InternalEventCalculus.g:7439:1: ( RULE_ID )
            // InternalEventCalculus.g:7440:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getArgsDefinesIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Definition__ArgsAssignment_1_1"


    // $ANTLR start "rule__Definition__ArgsAssignment_1_2_1"
    // InternalEventCalculus.g:7451:1: rule__Definition__ArgsAssignment_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Definition__ArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7455:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7456:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7456:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7457:1: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionAccess().getArgsDefinesCrossReference_1_2_1_0()); 
            // InternalEventCalculus.g:7458:1: ( RULE_ID )
            // InternalEventCalculus.g:7459:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getArgsDefinesIDTerminalRuleCall_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Definition__ArgsAssignment_1_2_1"


    // $ANTLR start "rule__Definition__ReturnAssignment_2_1"
    // InternalEventCalculus.g:7470:1: rule__Definition__ReturnAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Definition__ReturnAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7474:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7475:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7475:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7476:1: ( RULE_ID )
            {
             before(grammarAccess.getDefinitionAccess().getReturnDefinesCrossReference_2_1_0()); 
            // InternalEventCalculus.g:7477:1: ( RULE_ID )
            // InternalEventCalculus.g:7478:1: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getReturnDefinesIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Definition__ReturnAssignment_2_1"


    // $ANTLR start "rule__Expression__ExprAssignment_0"
    // InternalEventCalculus.g:7489:1: rule__Expression__ExprAssignment_0 : ( ruleAssignmentOp ) ;
    public final void rule__Expression__ExprAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7493:1: ( ( ruleAssignmentOp ) )
            // InternalEventCalculus.g:7494:1: ( ruleAssignmentOp )
            {
            // InternalEventCalculus.g:7494:1: ( ruleAssignmentOp )
            // InternalEventCalculus.g:7495:1: ruleAssignmentOp
            {
             before(grammarAccess.getExpressionAccess().getExprAssignmentOpParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignmentOp();

            state._fsp--;

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
    // $ANTLR end "rule__Expression__ExprAssignment_0"


    // $ANTLR start "rule__Expression__QualifiersAssignment_1_0"
    // InternalEventCalculus.g:7504:1: rule__Expression__QualifiersAssignment_1_0 : ( ruleQualifier ) ;
    public final void rule__Expression__QualifiersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7508:1: ( ( ruleQualifier ) )
            // InternalEventCalculus.g:7509:1: ( ruleQualifier )
            {
            // InternalEventCalculus.g:7509:1: ( ruleQualifier )
            // InternalEventCalculus.g:7510:1: ruleQualifier
            {
             before(grammarAccess.getExpressionAccess().getQualifiersQualifierParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifier();

            state._fsp--;

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
    // $ANTLR end "rule__Expression__QualifiersAssignment_1_0"


    // $ANTLR start "rule__Expression__ExprAssignment_1_1"
    // InternalEventCalculus.g:7519:1: rule__Expression__ExprAssignment_1_1 : ( ruleExpression ) ;
    public final void rule__Expression__ExprAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7523:1: ( ( ruleExpression ) )
            // InternalEventCalculus.g:7524:1: ( ruleExpression )
            {
            // InternalEventCalculus.g:7524:1: ( ruleExpression )
            // InternalEventCalculus.g:7525:1: ruleExpression
            {
             before(grammarAccess.getExpressionAccess().getExprExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

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
    // $ANTLR end "rule__Expression__ExprAssignment_1_1"


    // $ANTLR start "rule__Parameters__NamesAssignment_0"
    // InternalEventCalculus.g:7534:1: rule__Parameters__NamesAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Parameters__NamesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7538:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7539:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7539:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7540:1: ( RULE_ID )
            {
             before(grammarAccess.getParametersAccess().getNamesDefinesCrossReference_0_0()); 
            // InternalEventCalculus.g:7541:1: ( RULE_ID )
            // InternalEventCalculus.g:7542:1: RULE_ID
            {
             before(grammarAccess.getParametersAccess().getNamesDefinesIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Parameters__NamesAssignment_0"


    // $ANTLR start "rule__Parameters__NamesAssignment_1_1"
    // InternalEventCalculus.g:7553:1: rule__Parameters__NamesAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Parameters__NamesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7557:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7558:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7558:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7559:1: ( RULE_ID )
            {
             before(grammarAccess.getParametersAccess().getNamesDefinesCrossReference_1_1_0()); 
            // InternalEventCalculus.g:7560:1: ( RULE_ID )
            // InternalEventCalculus.g:7561:1: RULE_ID
            {
             before(grammarAccess.getParametersAccess().getNamesDefinesIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__Parameters__NamesAssignment_1_1"


    // $ANTLR start "rule__Exists__OpAssignment_0"
    // InternalEventCalculus.g:7572:1: rule__Exists__OpAssignment_0 : ( ruleUnaryOp ) ;
    public final void rule__Exists__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7576:1: ( ( ruleUnaryOp ) )
            // InternalEventCalculus.g:7577:1: ( ruleUnaryOp )
            {
            // InternalEventCalculus.g:7577:1: ( ruleUnaryOp )
            // InternalEventCalculus.g:7578:1: ruleUnaryOp
            {
             before(grammarAccess.getExistsAccess().getOpUnaryOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOp();

            state._fsp--;

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
    // $ANTLR end "rule__Exists__OpAssignment_0"


    // $ANTLR start "rule__Exists__ParametersAssignment_2"
    // InternalEventCalculus.g:7587:1: rule__Exists__ParametersAssignment_2 : ( ruleParameters ) ;
    public final void rule__Exists__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7591:1: ( ( ruleParameters ) )
            // InternalEventCalculus.g:7592:1: ( ruleParameters )
            {
            // InternalEventCalculus.g:7592:1: ( ruleParameters )
            // InternalEventCalculus.g:7593:1: ruleParameters
            {
             before(grammarAccess.getExistsAccess().getParametersParametersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

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
    // $ANTLR end "rule__Exists__ParametersAssignment_2"


    // $ANTLR start "rule__Forall__OpAssignment_0"
    // InternalEventCalculus.g:7602:1: rule__Forall__OpAssignment_0 : ( ruleUnaryOp ) ;
    public final void rule__Forall__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7606:1: ( ( ruleUnaryOp ) )
            // InternalEventCalculus.g:7607:1: ( ruleUnaryOp )
            {
            // InternalEventCalculus.g:7607:1: ( ruleUnaryOp )
            // InternalEventCalculus.g:7608:1: ruleUnaryOp
            {
             before(grammarAccess.getForallAccess().getOpUnaryOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOp();

            state._fsp--;

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
    // $ANTLR end "rule__Forall__OpAssignment_0"


    // $ANTLR start "rule__Forall__ParametersAssignment_2"
    // InternalEventCalculus.g:7617:1: rule__Forall__ParametersAssignment_2 : ( ruleParameters ) ;
    public final void rule__Forall__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7621:1: ( ( ruleParameters ) )
            // InternalEventCalculus.g:7622:1: ( ruleParameters )
            {
            // InternalEventCalculus.g:7622:1: ( ruleParameters )
            // InternalEventCalculus.g:7623:1: ruleParameters
            {
             before(grammarAccess.getForallAccess().getParametersParametersParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameters();

            state._fsp--;

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
    // $ANTLR end "rule__Forall__ParametersAssignment_2"


    // $ANTLR start "rule__AssignmentOp__QAssignment_1_1"
    // InternalEventCalculus.g:7632:1: rule__AssignmentOp__QAssignment_1_1 : ( ruleQualifier ) ;
    public final void rule__AssignmentOp__QAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7636:1: ( ( ruleQualifier ) )
            // InternalEventCalculus.g:7637:1: ( ruleQualifier )
            {
            // InternalEventCalculus.g:7637:1: ( ruleQualifier )
            // InternalEventCalculus.g:7638:1: ruleQualifier
            {
             before(grammarAccess.getAssignmentOpAccess().getQQualifierParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifier();

            state._fsp--;

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
    // $ANTLR end "rule__AssignmentOp__QAssignment_1_1"


    // $ANTLR start "rule__AssignmentOp__RightAssignment_1_2"
    // InternalEventCalculus.g:7647:1: rule__AssignmentOp__RightAssignment_1_2 : ( ruleOrExp ) ;
    public final void rule__AssignmentOp__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7651:1: ( ( ruleOrExp ) )
            // InternalEventCalculus.g:7652:1: ( ruleOrExp )
            {
            // InternalEventCalculus.g:7652:1: ( ruleOrExp )
            // InternalEventCalculus.g:7653:1: ruleOrExp
            {
             before(grammarAccess.getAssignmentOpAccess().getRightOrExpParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOrExp();

            state._fsp--;

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
    // $ANTLR end "rule__AssignmentOp__RightAssignment_1_2"


    // $ANTLR start "rule__OrExp__QAssignment_1_2"
    // InternalEventCalculus.g:7662:1: rule__OrExp__QAssignment_1_2 : ( ruleQualifier ) ;
    public final void rule__OrExp__QAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7666:1: ( ( ruleQualifier ) )
            // InternalEventCalculus.g:7667:1: ( ruleQualifier )
            {
            // InternalEventCalculus.g:7667:1: ( ruleQualifier )
            // InternalEventCalculus.g:7668:1: ruleQualifier
            {
             before(grammarAccess.getOrExpAccess().getQQualifierParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifier();

            state._fsp--;

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
    // $ANTLR end "rule__OrExp__QAssignment_1_2"


    // $ANTLR start "rule__OrExp__RightAssignment_1_3"
    // InternalEventCalculus.g:7677:1: rule__OrExp__RightAssignment_1_3 : ( ruleAndExp ) ;
    public final void rule__OrExp__RightAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7681:1: ( ( ruleAndExp ) )
            // InternalEventCalculus.g:7682:1: ( ruleAndExp )
            {
            // InternalEventCalculus.g:7682:1: ( ruleAndExp )
            // InternalEventCalculus.g:7683:1: ruleAndExp
            {
             before(grammarAccess.getOrExpAccess().getRightAndExpParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAndExp();

            state._fsp--;

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
    // $ANTLR end "rule__OrExp__RightAssignment_1_3"


    // $ANTLR start "rule__AndExp__QAssignment_1_2"
    // InternalEventCalculus.g:7692:1: rule__AndExp__QAssignment_1_2 : ( ruleQualifier ) ;
    public final void rule__AndExp__QAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7696:1: ( ( ruleQualifier ) )
            // InternalEventCalculus.g:7697:1: ( ruleQualifier )
            {
            // InternalEventCalculus.g:7697:1: ( ruleQualifier )
            // InternalEventCalculus.g:7698:1: ruleQualifier
            {
             before(grammarAccess.getAndExpAccess().getQQualifierParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifier();

            state._fsp--;

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
    // $ANTLR end "rule__AndExp__QAssignment_1_2"


    // $ANTLR start "rule__AndExp__RightAssignment_1_3"
    // InternalEventCalculus.g:7707:1: rule__AndExp__RightAssignment_1_3 : ( ruleRelational ) ;
    public final void rule__AndExp__RightAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7711:1: ( ( ruleRelational ) )
            // InternalEventCalculus.g:7712:1: ( ruleRelational )
            {
            // InternalEventCalculus.g:7712:1: ( ruleRelational )
            // InternalEventCalculus.g:7713:1: ruleRelational
            {
             before(grammarAccess.getAndExpAccess().getRightRelationalParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRelational();

            state._fsp--;

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
    // $ANTLR end "rule__AndExp__RightAssignment_1_3"


    // $ANTLR start "rule__Relational__RightAssignment_1_1"
    // InternalEventCalculus.g:7722:1: rule__Relational__RightAssignment_1_1 : ( ruleAddition ) ;
    public final void rule__Relational__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7726:1: ( ( ruleAddition ) )
            // InternalEventCalculus.g:7727:1: ( ruleAddition )
            {
            // InternalEventCalculus.g:7727:1: ( ruleAddition )
            // InternalEventCalculus.g:7728:1: ruleAddition
            {
             before(grammarAccess.getRelationalAccess().getRightAdditionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

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
    // $ANTLR end "rule__Relational__RightAssignment_1_1"


    // $ANTLR start "rule__Addition__RightAssignment_1_1"
    // InternalEventCalculus.g:7737:1: rule__Addition__RightAssignment_1_1 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7741:1: ( ( ruleMultiplication ) )
            // InternalEventCalculus.g:7742:1: ( ruleMultiplication )
            {
            // InternalEventCalculus.g:7742:1: ( ruleMultiplication )
            // InternalEventCalculus.g:7743:1: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

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
    // $ANTLR end "rule__Addition__RightAssignment_1_1"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1"
    // InternalEventCalculus.g:7752:1: rule__Multiplication__RightAssignment_1_1 : ( rulePower ) ;
    public final void rule__Multiplication__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7756:1: ( ( rulePower ) )
            // InternalEventCalculus.g:7757:1: ( rulePower )
            {
            // InternalEventCalculus.g:7757:1: ( rulePower )
            // InternalEventCalculus.g:7758:1: rulePower
            {
             before(grammarAccess.getMultiplicationAccess().getRightPowerParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePower();

            state._fsp--;

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
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1"


    // $ANTLR start "rule__Power__RightAssignment_1_1"
    // InternalEventCalculus.g:7767:1: rule__Power__RightAssignment_1_1 : ( ruleUnaryExpr ) ;
    public final void rule__Power__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7771:1: ( ( ruleUnaryExpr ) )
            // InternalEventCalculus.g:7772:1: ( ruleUnaryExpr )
            {
            // InternalEventCalculus.g:7772:1: ( ruleUnaryExpr )
            // InternalEventCalculus.g:7773:1: ruleUnaryExpr
            {
             before(grammarAccess.getPowerAccess().getRightUnaryExprParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryExpr();

            state._fsp--;

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
    // $ANTLR end "rule__Power__RightAssignment_1_1"


    // $ANTLR start "rule__UnaryExpr__OpAssignment_0"
    // InternalEventCalculus.g:7782:1: rule__UnaryExpr__OpAssignment_0 : ( ruleUnaryOp ) ;
    public final void rule__UnaryExpr__OpAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7786:1: ( ( ruleUnaryOp ) )
            // InternalEventCalculus.g:7787:1: ( ruleUnaryOp )
            {
            // InternalEventCalculus.g:7787:1: ( ruleUnaryOp )
            // InternalEventCalculus.g:7788:1: ruleUnaryOp
            {
             before(grammarAccess.getUnaryExprAccess().getOpUnaryOpEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnaryOp();

            state._fsp--;

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
    // $ANTLR end "rule__UnaryExpr__OpAssignment_0"


    // $ANTLR start "rule__UnaryExpr__RightAssignment_1"
    // InternalEventCalculus.g:7797:1: rule__UnaryExpr__RightAssignment_1 : ( rulePrePrimaryExpr ) ;
    public final void rule__UnaryExpr__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7801:1: ( ( rulePrePrimaryExpr ) )
            // InternalEventCalculus.g:7802:1: ( rulePrePrimaryExpr )
            {
            // InternalEventCalculus.g:7802:1: ( rulePrePrimaryExpr )
            // InternalEventCalculus.g:7803:1: rulePrePrimaryExpr
            {
             before(grammarAccess.getUnaryExprAccess().getRightPrePrimaryExprParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrePrimaryExpr();

            state._fsp--;

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
    // $ANTLR end "rule__UnaryExpr__RightAssignment_1"


    // $ANTLR start "rule__PrePrimaryExpr__NAssignment_3_1"
    // InternalEventCalculus.g:7812:1: rule__PrePrimaryExpr__NAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__PrePrimaryExpr__NAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7816:1: ( ( RULE_INT ) )
            // InternalEventCalculus.g:7817:1: ( RULE_INT )
            {
            // InternalEventCalculus.g:7817:1: ( RULE_INT )
            // InternalEventCalculus.g:7818:1: RULE_INT
            {
             before(grammarAccess.getPrePrimaryExprAccess().getNINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // $ANTLR end "rule__PrePrimaryExpr__NAssignment_3_1"


    // $ANTLR start "rule__AbstractRef__DefineAssignment_0"
    // InternalEventCalculus.g:7827:1: rule__AbstractRef__DefineAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__AbstractRef__DefineAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7831:1: ( ( ( RULE_ID ) ) )
            // InternalEventCalculus.g:7832:1: ( ( RULE_ID ) )
            {
            // InternalEventCalculus.g:7832:1: ( ( RULE_ID ) )
            // InternalEventCalculus.g:7833:1: ( RULE_ID )
            {
             before(grammarAccess.getAbstractRefAccess().getDefineDefinesCrossReference_0_0()); 
            // InternalEventCalculus.g:7834:1: ( RULE_ID )
            // InternalEventCalculus.g:7835:1: RULE_ID
            {
             before(grammarAccess.getAbstractRefAccess().getDefineDefinesIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
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
    // $ANTLR end "rule__AbstractRef__DefineAssignment_0"


    // $ANTLR start "rule__AbstractRef__ArgsAssignment_1_1_1"
    // InternalEventCalculus.g:7846:1: rule__AbstractRef__ArgsAssignment_1_1_1 : ( ruleExpression ) ;
    public final void rule__AbstractRef__ArgsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7850:1: ( ( ruleExpression ) )
            // InternalEventCalculus.g:7851:1: ( ruleExpression )
            {
            // InternalEventCalculus.g:7851:1: ( ruleExpression )
            // InternalEventCalculus.g:7852:1: ruleExpression
            {
             before(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

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
    // $ANTLR end "rule__AbstractRef__ArgsAssignment_1_1_1"


    // $ANTLR start "rule__AbstractRef__ArgsAssignment_1_1_2_1"
    // InternalEventCalculus.g:7861:1: rule__AbstractRef__ArgsAssignment_1_1_2_1 : ( ruleExpression ) ;
    public final void rule__AbstractRef__ArgsAssignment_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7865:1: ( ( ruleExpression ) )
            // InternalEventCalculus.g:7866:1: ( ruleExpression )
            {
            // InternalEventCalculus.g:7866:1: ( ruleExpression )
            // InternalEventCalculus.g:7867:1: ruleExpression
            {
             before(grammarAccess.getAbstractRefAccess().getArgsExpressionParserRuleCall_1_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

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
    // $ANTLR end "rule__AbstractRef__ArgsAssignment_1_1_2_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_0_1"
    // InternalEventCalculus.g:7876:1: rule__TerminalExpression__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__TerminalExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7880:1: ( ( RULE_INT ) )
            // InternalEventCalculus.g:7881:1: ( RULE_INT )
            {
            // InternalEventCalculus.g:7881:1: ( RULE_INT )
            // InternalEventCalculus.g:7882:1: RULE_INT
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_1_1"
    // InternalEventCalculus.g:7891:1: rule__TerminalExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__TerminalExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7895:1: ( ( RULE_STRING ) )
            // InternalEventCalculus.g:7896:1: ( RULE_STRING )
            {
            // InternalEventCalculus.g:7896:1: ( RULE_STRING )
            // InternalEventCalculus.g:7897:1: RULE_STRING
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__TerminalExpression__ValueAssignment_2_1"
    // InternalEventCalculus.g:7906:1: rule__TerminalExpression__ValueAssignment_2_1 : ( RULE_BOOLEAN ) ;
    public final void rule__TerminalExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalEventCalculus.g:7910:1: ( ( RULE_BOOLEAN ) )
            // InternalEventCalculus.g:7911:1: ( RULE_BOOLEAN )
            {
            // InternalEventCalculus.g:7911:1: ( RULE_BOOLEAN )
            // InternalEventCalculus.g:7912:1: RULE_BOOLEAN
            {
             before(grammarAccess.getTerminalExpressionAccess().getValueBOOLEANTerminalRuleCall_2_1_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
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
    // $ANTLR end "rule__TerminalExpression__ValueAssignment_2_1"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\4\1\23\2\uffff\1\15\4\4";
    static final String dfa_3s = "\1\65\1\23\2\uffff\1\16\4\65";
    static final String dfa_4s = "\2\uffff\1\1\1\2\5\uffff";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\4\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3\4\uffff\1\2",
            "\1\4",
            "",
            "",
            "\1\5\1\6",
            "\1\7\3\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3\3\uffff\1\10\1\2",
            "\1\7\3\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3\3\uffff\1\10\1\2",
            "\4\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\20\3\1\uffff\1\2",
            "\4\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3\4\uffff\1\2"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "990:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__DeclarationsAssignment_1_0 ) ) | ( ( rule__Model__StatementsAssignment_1_1 ) ) );";
        }
    }
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\22\1\23\7\uffff\1\15\2\4\2\22";
    static final String dfa_9s = "\1\65\1\23\7\uffff\1\16\4\65";
    static final String dfa_10s = "\2\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\5\uffff";
    static final String dfa_11s = "\16\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\30\uffff\1\2",
            "\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\12\1\13",
            "\1\14\15\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\27\uffff\1\15\1\2",
            "\1\14\15\uffff\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\27\uffff\1\15\1\2",
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\30\uffff\1\2",
            "\1\1\1\uffff\1\2\1\uffff\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\30\uffff\1\2"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1034:1: rule__Declaration__Alternatives : ( ( ruleDefSort ) | ( ruleDefRange ) | ( ruleDefOption ) | ( ruleDefCompletion ) | ( ruleDefNonInertia ) | ( ruleDefXor ) | ( ruleDefMutex ) );";
        }
    }
    static final String dfa_13s = "\12\uffff";
    static final String dfa_14s = "\1\4\1\23\1\5\1\uffff\1\15\1\uffff\4\4";
    static final String dfa_15s = "\1\60\1\23\1\63\1\uffff\1\16\1\uffff\2\64\1\63\1\60";
    static final String dfa_16s = "\3\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String dfa_17s = "\12\uffff}>";
    static final String[] dfa_18s = {
            "\1\3\1\2\2\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\13\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3",
            "\1\4",
            "\1\5\27\uffff\2\3\5\uffff\20\3",
            "",
            "\1\6\1\7",
            "",
            "\1\10\1\2\2\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\13\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3\3\uffff\1\11",
            "\1\10\1\2\2\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\13\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3\3\uffff\1\11",
            "\1\3\1\2\2\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\12\uffff\2\3\1\uffff\1\3\1\uffff\1\3\1\uffff\20\3",
            "\1\3\1\2\2\3\4\uffff\1\3\2\uffff\2\3\1\uffff\1\1\13\uffff\1\3\1\uffff\1\3\1\uffff\1\3\15\uffff\1\3"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_13;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "1109:1: rule__Statement__Alternatives : ( ( ruleSortDefinition ) | ( ruleLabeledExpression ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x002100055BD590F0L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x002100055BD590F2L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0010000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0020000000140000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000018020L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x002000001BD40000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000084000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x00007F0000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00010000400010F0L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0001800000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0001800000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0006000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00210005DFD590F0L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00000000000000D0L});

}