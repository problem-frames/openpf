package eu.securechange.ui.contentassist.antlr.internal; 

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
import eu.securechange.services.SituationGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSituationParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DA'", "'FR'", "'SR'", "'AR'", "'Q'", "'A'", "'M'", "'R'", "'S'", "'and'", "'or'", "'-'", "'+'", "'--'", "'++'", "'trusts'", "'delegates'", "'model'", "':'", "'event'", "','", "'actor'", "'attacker'", "'process'", "'{'", "'}'", "'activity'", "'action'", "'resource'", "'asset'", "'wants'", "'('", "')'", "'does'", "'fulfils'", "'provides'", "'consumes'", "'exploits'", "'damages'", "'attack'", "'argues'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalSituationParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g"; }


     
     	private SituationGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SituationGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleSituation
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:61:1: entryRuleSituation : ruleSituation EOF ;
    public final void entryRuleSituation() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:62:1: ( ruleSituation EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:63:1: ruleSituation EOF
            {
             before(grammarAccess.getSituationRule()); 
            pushFollow(FOLLOW_ruleSituation_in_entryRuleSituation61);
            ruleSituation();
            _fsp--;

             after(grammarAccess.getSituationRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSituation68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSituation


    // $ANTLR start ruleSituation
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:70:1: ruleSituation : ( ( rule__Situation__Group__0 ) ) ;
    public final void ruleSituation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:74:2: ( ( ( rule__Situation__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:75:1: ( ( rule__Situation__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:75:1: ( ( rule__Situation__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:76:1: ( rule__Situation__Group__0 )
            {
             before(grammarAccess.getSituationAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:77:1: ( rule__Situation__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:77:2: rule__Situation__Group__0
            {
            pushFollow(FOLLOW_rule__Situation__Group__0_in_ruleSituation94);
            rule__Situation__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSituationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSituation


    // $ANTLR start entryRuleWorld
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:89:1: entryRuleWorld : ruleWorld EOF ;
    public final void entryRuleWorld() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:90:1: ( ruleWorld EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:91:1: ruleWorld EOF
            {
             before(grammarAccess.getWorldRule()); 
            pushFollow(FOLLOW_ruleWorld_in_entryRuleWorld121);
            ruleWorld();
            _fsp--;

             after(grammarAccess.getWorldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorld128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleWorld


    // $ANTLR start ruleWorld
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:98:1: ruleWorld : ( ( rule__World__Group__0 ) ) ;
    public final void ruleWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:102:2: ( ( ( rule__World__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:103:1: ( ( rule__World__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:103:1: ( ( rule__World__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:104:1: ( rule__World__Group__0 )
            {
             before(grammarAccess.getWorldAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:105:1: ( rule__World__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:105:2: rule__World__Group__0
            {
            pushFollow(FOLLOW_rule__World__Group__0_in_ruleWorld154);
            rule__World__Group__0();
            _fsp--;


            }

             after(grammarAccess.getWorldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleWorld


    // $ANTLR start entryRuleEvent
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:119:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:120:1: ( ruleEvent EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:121:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_ruleEvent_in_entryRuleEvent183);
            ruleEvent();
            _fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvent190); 

            }

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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:128:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:132:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:133:1: ( ( rule__Event__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:133:1: ( ( rule__Event__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:134:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:135:1: ( rule__Event__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:135:2: rule__Event__Group__0
            {
            pushFollow(FOLLOW_rule__Event__Group__0_in_ruleEvent216);
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


    // $ANTLR start entryRuleObject
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:147:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:148:1: ( ruleObject EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:149:1: ruleObject EOF
            {
             before(grammarAccess.getObjectRule()); 
            pushFollow(FOLLOW_ruleObject_in_entryRuleObject243);
            ruleObject();
            _fsp--;

             after(grammarAccess.getObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleObject250); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleObject


    // $ANTLR start ruleObject
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:156:1: ruleObject : ( ( rule__Object__Alternatives ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:160:2: ( ( ( rule__Object__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:161:1: ( ( rule__Object__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:161:1: ( ( rule__Object__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:162:1: ( rule__Object__Alternatives )
            {
             before(grammarAccess.getObjectAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:163:1: ( rule__Object__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:163:2: rule__Object__Alternatives
            {
            pushFollow(FOLLOW_rule__Object__Alternatives_in_ruleObject276);
            rule__Object__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getObjectAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleObject


    // $ANTLR start entryRuleProposition
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:179:1: entryRuleProposition : ruleProposition EOF ;
    public final void entryRuleProposition() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:180:1: ( ruleProposition EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:181:1: ruleProposition EOF
            {
             before(grammarAccess.getPropositionRule()); 
            pushFollow(FOLLOW_ruleProposition_in_entryRuleProposition307);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getPropositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProposition314); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProposition


    // $ANTLR start ruleProposition
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:188:1: ruleProposition : ( ( rule__Proposition__Group__0 ) ) ;
    public final void ruleProposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:192:2: ( ( ( rule__Proposition__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:193:1: ( ( rule__Proposition__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:193:1: ( ( rule__Proposition__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:194:1: ( rule__Proposition__Group__0 )
            {
             before(grammarAccess.getPropositionAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:195:1: ( rule__Proposition__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:195:2: rule__Proposition__Group__0
            {
            pushFollow(FOLLOW_rule__Proposition__Group__0_in_ruleProposition340);
            rule__Proposition__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPropositionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProposition


    // $ANTLR start entryRuleEntity
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:207:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:208:1: ( ruleEntity EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:209:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity367);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity374); 

            }

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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:216:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:220:2: ( ( ( rule__Entity__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:221:1: ( ( rule__Entity__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:221:1: ( ( rule__Entity__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:222:1: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:223:1: ( rule__Entity__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:223:2: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_rule__Entity__Alternatives_in_ruleEntity400);
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


    // $ANTLR start entryRuleDomain
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:235:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:236:1: ( ruleDomain EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:237:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain427);
            ruleDomain();
            _fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain434); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDomain


    // $ANTLR start ruleDomain
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:244:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:248:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:249:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:249:1: ( ( rule__Domain__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:250:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:251:1: ( rule__Domain__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:251:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain460);
            rule__Domain__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDomain


    // $ANTLR start entryRuleActor
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:263:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:264:1: ( ruleActor EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:265:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor487);
            ruleActor();
            _fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor494); 

            }

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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:272:1: ruleActor : ( ( rule__Actor__Alternatives ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:276:2: ( ( ( rule__Actor__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:277:1: ( ( rule__Actor__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:277:1: ( ( rule__Actor__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:278:1: ( rule__Actor__Alternatives )
            {
             before(grammarAccess.getActorAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:279:1: ( rule__Actor__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:279:2: rule__Actor__Alternatives
            {
            pushFollow(FOLLOW_rule__Actor__Alternatives_in_ruleActor520);
            rule__Actor__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleStakeholder
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:291:1: entryRuleStakeholder : ruleStakeholder EOF ;
    public final void entryRuleStakeholder() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:292:1: ( ruleStakeholder EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:293:1: ruleStakeholder EOF
            {
             before(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder547);
            ruleStakeholder();
            _fsp--;

             after(grammarAccess.getStakeholderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder554); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleStakeholder


    // $ANTLR start ruleStakeholder
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:300:1: ruleStakeholder : ( ( rule__Stakeholder__Group__0 ) ) ;
    public final void ruleStakeholder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:304:2: ( ( ( rule__Stakeholder__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:305:1: ( ( rule__Stakeholder__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:305:1: ( ( rule__Stakeholder__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:306:1: ( rule__Stakeholder__Group__0 )
            {
             before(grammarAccess.getStakeholderAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:307:1: ( rule__Stakeholder__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:307:2: rule__Stakeholder__Group__0
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__0_in_ruleStakeholder580);
            rule__Stakeholder__Group__0();
            _fsp--;


            }

             after(grammarAccess.getStakeholderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleStakeholder


    // $ANTLR start entryRuleAttacker
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:319:1: entryRuleAttacker : ruleAttacker EOF ;
    public final void entryRuleAttacker() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:320:1: ( ruleAttacker EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:321:1: ruleAttacker EOF
            {
             before(grammarAccess.getAttackerRule()); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker607);
            ruleAttacker();
            _fsp--;

             after(grammarAccess.getAttackerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker614); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAttacker


    // $ANTLR start ruleAttacker
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:328:1: ruleAttacker : ( ( rule__Attacker__Group__0 ) ) ;
    public final void ruleAttacker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:332:2: ( ( ( rule__Attacker__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:333:1: ( ( rule__Attacker__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:333:1: ( ( rule__Attacker__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:334:1: ( rule__Attacker__Group__0 )
            {
             before(grammarAccess.getAttackerAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:335:1: ( rule__Attacker__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:335:2: rule__Attacker__Group__0
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0_in_ruleAttacker640);
            rule__Attacker__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAttackerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttacker


    // $ANTLR start entryRuleProcess
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:347:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:348:1: ( ruleProcess EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:349:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess667);
            ruleProcess();
            _fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess674); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProcess


    // $ANTLR start ruleProcess
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:356:1: ruleProcess : ( ( rule__Process__Alternatives ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:360:2: ( ( ( rule__Process__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:361:1: ( ( rule__Process__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:361:1: ( ( rule__Process__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:362:1: ( rule__Process__Alternatives )
            {
             before(grammarAccess.getProcessAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:363:1: ( rule__Process__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:363:2: rule__Process__Alternatives
            {
            pushFollow(FOLLOW_rule__Process__Alternatives_in_ruleProcess700);
            rule__Process__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getProcessAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProcess


    // $ANTLR start entryRuleNaturalProcess
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:375:1: entryRuleNaturalProcess : ruleNaturalProcess EOF ;
    public final void entryRuleNaturalProcess() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:376:1: ( ruleNaturalProcess EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:377:1: ruleNaturalProcess EOF
            {
             before(grammarAccess.getNaturalProcessRule()); 
            pushFollow(FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess727);
            ruleNaturalProcess();
            _fsp--;

             after(grammarAccess.getNaturalProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalProcess734); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleNaturalProcess


    // $ANTLR start ruleNaturalProcess
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:384:1: ruleNaturalProcess : ( ( rule__NaturalProcess__Group__0 ) ) ;
    public final void ruleNaturalProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:388:2: ( ( ( rule__NaturalProcess__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:389:1: ( ( rule__NaturalProcess__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:389:1: ( ( rule__NaturalProcess__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:390:1: ( rule__NaturalProcess__Group__0 )
            {
             before(grammarAccess.getNaturalProcessAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:391:1: ( rule__NaturalProcess__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:391:2: rule__NaturalProcess__Group__0
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__0_in_ruleNaturalProcess760);
            rule__NaturalProcess__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNaturalProcessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNaturalProcess


    // $ANTLR start entryRuleHumanActivity
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:403:1: entryRuleHumanActivity : ruleHumanActivity EOF ;
    public final void entryRuleHumanActivity() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:404:1: ( ruleHumanActivity EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:405:1: ruleHumanActivity EOF
            {
             before(grammarAccess.getHumanActivityRule()); 
            pushFollow(FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity787);
            ruleHumanActivity();
            _fsp--;

             after(grammarAccess.getHumanActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHumanActivity794); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleHumanActivity


    // $ANTLR start ruleHumanActivity
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:412:1: ruleHumanActivity : ( ( rule__HumanActivity__Group__0 ) ) ;
    public final void ruleHumanActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:416:2: ( ( ( rule__HumanActivity__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:417:1: ( ( rule__HumanActivity__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:417:1: ( ( rule__HumanActivity__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:418:1: ( rule__HumanActivity__Group__0 )
            {
             before(grammarAccess.getHumanActivityAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:419:1: ( rule__HumanActivity__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:419:2: rule__HumanActivity__Group__0
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__0_in_ruleHumanActivity820);
            rule__HumanActivity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getHumanActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleHumanActivity


    // $ANTLR start entryRuleAction
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:431:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:432:1: ( ruleAction EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:433:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction847);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction854); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAction


    // $ANTLR start ruleAction
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:440:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:444:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:445:1: ( ( rule__Action__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:445:1: ( ( rule__Action__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:446:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:447:1: ( rule__Action__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:447:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction880);
            rule__Action__Group__0();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAction


    // $ANTLR start entryRuleResource
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:459:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:460:1: ( ruleResource EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:461:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource907);
            ruleResource();
            _fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource914); 

            }

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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:468:1: ruleResource : ( ( rule__Resource__Alternatives ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:472:2: ( ( ( rule__Resource__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:473:1: ( ( rule__Resource__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:473:1: ( ( rule__Resource__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:474:1: ( rule__Resource__Alternatives )
            {
             before(grammarAccess.getResourceAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:475:1: ( rule__Resource__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:475:2: rule__Resource__Alternatives
            {
            pushFollow(FOLLOW_rule__Resource__Alternatives_in_ruleResource940);
            rule__Resource__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleAsset
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:487:1: entryRuleAsset : ruleAsset EOF ;
    public final void entryRuleAsset() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:488:1: ( ruleAsset EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:489:1: ruleAsset EOF
            {
             before(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset967);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getAssetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset974); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAsset


    // $ANTLR start ruleAsset
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:496:1: ruleAsset : ( ( rule__Asset__Group__0 ) ) ;
    public final void ruleAsset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:500:2: ( ( ( rule__Asset__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:501:1: ( ( rule__Asset__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:501:1: ( ( rule__Asset__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:502:1: ( rule__Asset__Group__0 )
            {
             before(grammarAccess.getAssetAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:503:1: ( rule__Asset__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:503:2: rule__Asset__Group__0
            {
            pushFollow(FOLLOW_rule__Asset__Group__0_in_ruleAsset1000);
            rule__Asset__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAssetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAsset


    // $ANTLR start entryRuleRelationship
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:515:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:516:1: ( ruleRelationship EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:517:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship1027);
            ruleRelationship();
            _fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship1034); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRelationship


    // $ANTLR start ruleRelationship
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:524:1: ruleRelationship : ( ( rule__Relationship__Alternatives ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:528:2: ( ( ( rule__Relationship__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:529:1: ( ( rule__Relationship__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:529:1: ( ( rule__Relationship__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:530:1: ( rule__Relationship__Alternatives )
            {
             before(grammarAccess.getRelationshipAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:531:1: ( rule__Relationship__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:531:2: rule__Relationship__Alternatives
            {
            pushFollow(FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship1060);
            rule__Relationship__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRelationship


    // $ANTLR start entryRuleWants
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:543:1: entryRuleWants : ruleWants EOF ;
    public final void entryRuleWants() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:544:1: ( ruleWants EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:545:1: ruleWants EOF
            {
             before(grammarAccess.getWantsRule()); 
            pushFollow(FOLLOW_ruleWants_in_entryRuleWants1087);
            ruleWants();
            _fsp--;

             after(grammarAccess.getWantsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWants1094); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleWants


    // $ANTLR start ruleWants
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:552:1: ruleWants : ( ( rule__Wants__Group__0 ) ) ;
    public final void ruleWants() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:556:2: ( ( ( rule__Wants__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:557:1: ( ( rule__Wants__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:557:1: ( ( rule__Wants__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:558:1: ( rule__Wants__Group__0 )
            {
             before(grammarAccess.getWantsAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:559:1: ( rule__Wants__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:559:2: rule__Wants__Group__0
            {
            pushFollow(FOLLOW_rule__Wants__Group__0_in_ruleWants1120);
            rule__Wants__Group__0();
            _fsp--;


            }

             after(grammarAccess.getWantsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleWants


    // $ANTLR start entryRuleDoes
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:571:1: entryRuleDoes : ruleDoes EOF ;
    public final void entryRuleDoes() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:572:1: ( ruleDoes EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:573:1: ruleDoes EOF
            {
             before(grammarAccess.getDoesRule()); 
            pushFollow(FOLLOW_ruleDoes_in_entryRuleDoes1147);
            ruleDoes();
            _fsp--;

             after(grammarAccess.getDoesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoes1154); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDoes


    // $ANTLR start ruleDoes
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:580:1: ruleDoes : ( ( rule__Does__Group__0 ) ) ;
    public final void ruleDoes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:584:2: ( ( ( rule__Does__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:585:1: ( ( rule__Does__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:585:1: ( ( rule__Does__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:586:1: ( rule__Does__Group__0 )
            {
             before(grammarAccess.getDoesAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:587:1: ( rule__Does__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:587:2: rule__Does__Group__0
            {
            pushFollow(FOLLOW_rule__Does__Group__0_in_ruleDoes1180);
            rule__Does__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDoesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDoes


    // $ANTLR start entryRuleDecomposes
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:599:1: entryRuleDecomposes : ruleDecomposes EOF ;
    public final void entryRuleDecomposes() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:600:1: ( ruleDecomposes EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:601:1: ruleDecomposes EOF
            {
             before(grammarAccess.getDecomposesRule()); 
            pushFollow(FOLLOW_ruleDecomposes_in_entryRuleDecomposes1207);
            ruleDecomposes();
            _fsp--;

             after(grammarAccess.getDecomposesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposes1214); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDecomposes


    // $ANTLR start ruleDecomposes
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:608:1: ruleDecomposes : ( ( rule__Decomposes__Group__0 ) ) ;
    public final void ruleDecomposes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:612:2: ( ( ( rule__Decomposes__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:613:1: ( ( rule__Decomposes__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:613:1: ( ( rule__Decomposes__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:614:1: ( rule__Decomposes__Group__0 )
            {
             before(grammarAccess.getDecomposesAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:615:1: ( rule__Decomposes__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:615:2: rule__Decomposes__Group__0
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__0_in_ruleDecomposes1240);
            rule__Decomposes__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDecomposesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDecomposes


    // $ANTLR start entryRuleContributes
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:627:1: entryRuleContributes : ruleContributes EOF ;
    public final void entryRuleContributes() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:628:1: ( ruleContributes EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:629:1: ruleContributes EOF
            {
             before(grammarAccess.getContributesRule()); 
            pushFollow(FOLLOW_ruleContributes_in_entryRuleContributes1267);
            ruleContributes();
            _fsp--;

             after(grammarAccess.getContributesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributes1274); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleContributes


    // $ANTLR start ruleContributes
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:636:1: ruleContributes : ( ( rule__Contributes__Group__0 ) ) ;
    public final void ruleContributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:640:2: ( ( ( rule__Contributes__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:641:1: ( ( rule__Contributes__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:641:1: ( ( rule__Contributes__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:642:1: ( rule__Contributes__Group__0 )
            {
             before(grammarAccess.getContributesAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:643:1: ( rule__Contributes__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:643:2: rule__Contributes__Group__0
            {
            pushFollow(FOLLOW_rule__Contributes__Group__0_in_ruleContributes1300);
            rule__Contributes__Group__0();
            _fsp--;


            }

             after(grammarAccess.getContributesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleContributes


    // $ANTLR start entryRuleFulfils
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:655:1: entryRuleFulfils : ruleFulfils EOF ;
    public final void entryRuleFulfils() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:656:1: ( ruleFulfils EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:657:1: ruleFulfils EOF
            {
             before(grammarAccess.getFulfilsRule()); 
            pushFollow(FOLLOW_ruleFulfils_in_entryRuleFulfils1327);
            ruleFulfils();
            _fsp--;

             after(grammarAccess.getFulfilsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFulfils1334); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFulfils


    // $ANTLR start ruleFulfils
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:664:1: ruleFulfils : ( ( rule__Fulfils__Group__0 ) ) ;
    public final void ruleFulfils() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:668:2: ( ( ( rule__Fulfils__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:669:1: ( ( rule__Fulfils__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:669:1: ( ( rule__Fulfils__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:670:1: ( rule__Fulfils__Group__0 )
            {
             before(grammarAccess.getFulfilsAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:671:1: ( rule__Fulfils__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:671:2: rule__Fulfils__Group__0
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__0_in_ruleFulfils1360);
            rule__Fulfils__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFulfilsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFulfils


    // $ANTLR start entryRuleDepends
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:683:1: entryRuleDepends : ruleDepends EOF ;
    public final void entryRuleDepends() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:684:1: ( ruleDepends EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:685:1: ruleDepends EOF
            {
             before(grammarAccess.getDependsRule()); 
            pushFollow(FOLLOW_ruleDepends_in_entryRuleDepends1387);
            ruleDepends();
            _fsp--;

             after(grammarAccess.getDependsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDepends1394); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDepends


    // $ANTLR start ruleDepends
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:692:1: ruleDepends : ( ( rule__Depends__Group__0 ) ) ;
    public final void ruleDepends() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:696:2: ( ( ( rule__Depends__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:697:1: ( ( rule__Depends__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:697:1: ( ( rule__Depends__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:698:1: ( rule__Depends__Group__0 )
            {
             before(grammarAccess.getDependsAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:699:1: ( rule__Depends__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:699:2: rule__Depends__Group__0
            {
            pushFollow(FOLLOW_rule__Depends__Group__0_in_ruleDepends1420);
            rule__Depends__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDependsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDepends


    // $ANTLR start entryRuleProvides
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:711:1: entryRuleProvides : ruleProvides EOF ;
    public final void entryRuleProvides() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:712:1: ( ruleProvides EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:713:1: ruleProvides EOF
            {
             before(grammarAccess.getProvidesRule()); 
            pushFollow(FOLLOW_ruleProvides_in_entryRuleProvides1447);
            ruleProvides();
            _fsp--;

             after(grammarAccess.getProvidesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvides1454); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleProvides


    // $ANTLR start ruleProvides
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:720:1: ruleProvides : ( ( rule__Provides__Group__0 ) ) ;
    public final void ruleProvides() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:724:2: ( ( ( rule__Provides__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:725:1: ( ( rule__Provides__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:725:1: ( ( rule__Provides__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:726:1: ( rule__Provides__Group__0 )
            {
             before(grammarAccess.getProvidesAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:727:1: ( rule__Provides__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:727:2: rule__Provides__Group__0
            {
            pushFollow(FOLLOW_rule__Provides__Group__0_in_ruleProvides1480);
            rule__Provides__Group__0();
            _fsp--;


            }

             after(grammarAccess.getProvidesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleProvides


    // $ANTLR start entryRuleConsumes
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:739:1: entryRuleConsumes : ruleConsumes EOF ;
    public final void entryRuleConsumes() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:740:1: ( ruleConsumes EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:741:1: ruleConsumes EOF
            {
             before(grammarAccess.getConsumesRule()); 
            pushFollow(FOLLOW_ruleConsumes_in_entryRuleConsumes1507);
            ruleConsumes();
            _fsp--;

             after(grammarAccess.getConsumesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsumes1514); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleConsumes


    // $ANTLR start ruleConsumes
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:748:1: ruleConsumes : ( ( rule__Consumes__Group__0 ) ) ;
    public final void ruleConsumes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:752:2: ( ( ( rule__Consumes__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:753:1: ( ( rule__Consumes__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:753:1: ( ( rule__Consumes__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:754:1: ( rule__Consumes__Group__0 )
            {
             before(grammarAccess.getConsumesAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:755:1: ( rule__Consumes__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:755:2: rule__Consumes__Group__0
            {
            pushFollow(FOLLOW_rule__Consumes__Group__0_in_ruleConsumes1540);
            rule__Consumes__Group__0();
            _fsp--;


            }

             after(grammarAccess.getConsumesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConsumes


    // $ANTLR start entryRuleExploits
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:767:1: entryRuleExploits : ruleExploits EOF ;
    public final void entryRuleExploits() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:768:1: ( ruleExploits EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:769:1: ruleExploits EOF
            {
             before(grammarAccess.getExploitsRule()); 
            pushFollow(FOLLOW_ruleExploits_in_entryRuleExploits1567);
            ruleExploits();
            _fsp--;

             after(grammarAccess.getExploitsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploits1574); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleExploits


    // $ANTLR start ruleExploits
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:776:1: ruleExploits : ( ( rule__Exploits__Group__0 ) ) ;
    public final void ruleExploits() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:780:2: ( ( ( rule__Exploits__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:781:1: ( ( rule__Exploits__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:781:1: ( ( rule__Exploits__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:782:1: ( rule__Exploits__Group__0 )
            {
             before(grammarAccess.getExploitsAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:783:1: ( rule__Exploits__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:783:2: rule__Exploits__Group__0
            {
            pushFollow(FOLLOW_rule__Exploits__Group__0_in_ruleExploits1600);
            rule__Exploits__Group__0();
            _fsp--;


            }

             after(grammarAccess.getExploitsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleExploits


    // $ANTLR start entryRuleDamages
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:795:1: entryRuleDamages : ruleDamages EOF ;
    public final void entryRuleDamages() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:796:1: ( ruleDamages EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:797:1: ruleDamages EOF
            {
             before(grammarAccess.getDamagesRule()); 
            pushFollow(FOLLOW_ruleDamages_in_entryRuleDamages1627);
            ruleDamages();
            _fsp--;

             after(grammarAccess.getDamagesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDamages1634); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDamages


    // $ANTLR start ruleDamages
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:804:1: ruleDamages : ( ( rule__Damages__Group__0 ) ) ;
    public final void ruleDamages() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:808:2: ( ( ( rule__Damages__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:809:1: ( ( rule__Damages__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:809:1: ( ( rule__Damages__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:810:1: ( rule__Damages__Group__0 )
            {
             before(grammarAccess.getDamagesAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:811:1: ( rule__Damages__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:811:2: rule__Damages__Group__0
            {
            pushFollow(FOLLOW_rule__Damages__Group__0_in_ruleDamages1660);
            rule__Damages__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDamagesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDamages


    // $ANTLR start entryRuleAttack
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:823:1: entryRuleAttack : ruleAttack EOF ;
    public final void entryRuleAttack() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:824:1: ( ruleAttack EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:825:1: ruleAttack EOF
            {
             before(grammarAccess.getAttackRule()); 
            pushFollow(FOLLOW_ruleAttack_in_entryRuleAttack1687);
            ruleAttack();
            _fsp--;

             after(grammarAccess.getAttackRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttack1694); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAttack


    // $ANTLR start ruleAttack
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:832:1: ruleAttack : ( ( rule__Attack__Group__0 ) ) ;
    public final void ruleAttack() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:836:2: ( ( ( rule__Attack__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:837:1: ( ( rule__Attack__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:837:1: ( ( rule__Attack__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:838:1: ( rule__Attack__Group__0 )
            {
             before(grammarAccess.getAttackAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:839:1: ( rule__Attack__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:839:2: rule__Attack__Group__0
            {
            pushFollow(FOLLOW_rule__Attack__Group__0_in_ruleAttack1720);
            rule__Attack__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAttackAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttack


    // $ANTLR start entryRuleArgues
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:851:1: entryRuleArgues : ruleArgues EOF ;
    public final void entryRuleArgues() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:852:1: ( ruleArgues EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:853:1: ruleArgues EOF
            {
             before(grammarAccess.getArguesRule()); 
            pushFollow(FOLLOW_ruleArgues_in_entryRuleArgues1747);
            ruleArgues();
            _fsp--;

             after(grammarAccess.getArguesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgues1754); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleArgues


    // $ANTLR start ruleArgues
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:860:1: ruleArgues : ( ( rule__Argues__Group__0 ) ) ;
    public final void ruleArgues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:864:2: ( ( ( rule__Argues__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:865:1: ( ( rule__Argues__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:865:1: ( ( rule__Argues__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:866:1: ( rule__Argues__Group__0 )
            {
             before(grammarAccess.getArguesAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:867:1: ( rule__Argues__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:867:2: rule__Argues__Group__0
            {
            pushFollow(FOLLOW_rule__Argues__Group__0_in_ruleArgues1780);
            rule__Argues__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArguesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArgues


    // $ANTLR start rulePropositionType
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:880:1: rulePropositionType : ( ( rule__PropositionType__Alternatives ) ) ;
    public final void rulePropositionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:884:1: ( ( ( rule__PropositionType__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:885:1: ( ( rule__PropositionType__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:885:1: ( ( rule__PropositionType__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:886:1: ( rule__PropositionType__Alternatives )
            {
             before(grammarAccess.getPropositionTypeAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:887:1: ( rule__PropositionType__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:887:2: rule__PropositionType__Alternatives
            {
            pushFollow(FOLLOW_rule__PropositionType__Alternatives_in_rulePropositionType1817);
            rule__PropositionType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPropositionTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePropositionType


    // $ANTLR start ruleDomainType
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:899:1: ruleDomainType : ( ( rule__DomainType__Alternatives ) ) ;
    public final void ruleDomainType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:903:1: ( ( ( rule__DomainType__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:904:1: ( ( rule__DomainType__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:904:1: ( ( rule__DomainType__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:905:1: ( rule__DomainType__Alternatives )
            {
             before(grammarAccess.getDomainTypeAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:906:1: ( rule__DomainType__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:906:2: rule__DomainType__Alternatives
            {
            pushFollow(FOLLOW_rule__DomainType__Alternatives_in_ruleDomainType1853);
            rule__DomainType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDomainTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDomainType


    // $ANTLR start ruleDecompositionLabel
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:918:1: ruleDecompositionLabel : ( ( rule__DecompositionLabel__Alternatives ) ) ;
    public final void ruleDecompositionLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:922:1: ( ( ( rule__DecompositionLabel__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:923:1: ( ( rule__DecompositionLabel__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:923:1: ( ( rule__DecompositionLabel__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:924:1: ( rule__DecompositionLabel__Alternatives )
            {
             before(grammarAccess.getDecompositionLabelAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:925:1: ( rule__DecompositionLabel__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:925:2: rule__DecompositionLabel__Alternatives
            {
            pushFollow(FOLLOW_rule__DecompositionLabel__Alternatives_in_ruleDecompositionLabel1889);
            rule__DecompositionLabel__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDecompositionLabelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDecompositionLabel


    // $ANTLR start ruleContributionLabel
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:937:1: ruleContributionLabel : ( ( rule__ContributionLabel__Alternatives ) ) ;
    public final void ruleContributionLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:941:1: ( ( ( rule__ContributionLabel__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:942:1: ( ( rule__ContributionLabel__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:942:1: ( ( rule__ContributionLabel__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:943:1: ( rule__ContributionLabel__Alternatives )
            {
             before(grammarAccess.getContributionLabelAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:944:1: ( rule__ContributionLabel__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:944:2: rule__ContributionLabel__Alternatives
            {
            pushFollow(FOLLOW_rule__ContributionLabel__Alternatives_in_ruleContributionLabel1925);
            rule__ContributionLabel__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getContributionLabelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleContributionLabel


    // $ANTLR start ruleDependencyType
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:956:1: ruleDependencyType : ( ( rule__DependencyType__Alternatives ) ) ;
    public final void ruleDependencyType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:960:1: ( ( ( rule__DependencyType__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:961:1: ( ( rule__DependencyType__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:961:1: ( ( rule__DependencyType__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:962:1: ( rule__DependencyType__Alternatives )
            {
             before(grammarAccess.getDependencyTypeAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:963:1: ( rule__DependencyType__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:963:2: rule__DependencyType__Alternatives
            {
            pushFollow(FOLLOW_rule__DependencyType__Alternatives_in_ruleDependencyType1961);
            rule__DependencyType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDependencyTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDependencyType


    // $ANTLR start rule__World__Alternatives_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:974:1: rule__World__Alternatives_1 : ( ( ( rule__World__EntitiesAssignment_1_0 ) ) | ( ( rule__World__DomainsAssignment_1_1 ) ) | ( ( rule__World__RelationshipsAssignment_1_2 ) ) );
    public final void rule__World__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:978:1: ( ( ( rule__World__EntitiesAssignment_1_0 ) ) | ( ( rule__World__DomainsAssignment_1_1 ) ) | ( ( rule__World__RelationshipsAssignment_1_2 ) ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
            case 34:
            case 37:
            case 39:
            case 40:
                {
                alt1=1;
                }
                break;
            case 17:
            case 18:
            case 19:
                {
                alt1=2;
                }
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 41:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("974:1: rule__World__Alternatives_1 : ( ( ( rule__World__EntitiesAssignment_1_0 ) ) | ( ( rule__World__DomainsAssignment_1_1 ) ) | ( ( rule__World__RelationshipsAssignment_1_2 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:979:1: ( ( rule__World__EntitiesAssignment_1_0 ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:979:1: ( ( rule__World__EntitiesAssignment_1_0 ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:980:1: ( rule__World__EntitiesAssignment_1_0 )
                    {
                     before(grammarAccess.getWorldAccess().getEntitiesAssignment_1_0()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:981:1: ( rule__World__EntitiesAssignment_1_0 )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:981:2: rule__World__EntitiesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__World__EntitiesAssignment_1_0_in_rule__World__Alternatives_11996);
                    rule__World__EntitiesAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getWorldAccess().getEntitiesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:985:6: ( ( rule__World__DomainsAssignment_1_1 ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:985:6: ( ( rule__World__DomainsAssignment_1_1 ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:986:1: ( rule__World__DomainsAssignment_1_1 )
                    {
                     before(grammarAccess.getWorldAccess().getDomainsAssignment_1_1()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:987:1: ( rule__World__DomainsAssignment_1_1 )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:987:2: rule__World__DomainsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__World__DomainsAssignment_1_1_in_rule__World__Alternatives_12014);
                    rule__World__DomainsAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getWorldAccess().getDomainsAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:991:6: ( ( rule__World__RelationshipsAssignment_1_2 ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:991:6: ( ( rule__World__RelationshipsAssignment_1_2 ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:992:1: ( rule__World__RelationshipsAssignment_1_2 )
                    {
                     before(grammarAccess.getWorldAccess().getRelationshipsAssignment_1_2()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:993:1: ( rule__World__RelationshipsAssignment_1_2 )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:993:2: rule__World__RelationshipsAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__World__RelationshipsAssignment_1_2_in_rule__World__Alternatives_12032);
                    rule__World__RelationshipsAssignment_1_2();
                    _fsp--;


                    }

                     after(grammarAccess.getWorldAccess().getRelationshipsAssignment_1_2()); 

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
    // $ANTLR end rule__World__Alternatives_1


    // $ANTLR start rule__Object__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1003:1: rule__Object__Alternatives : ( ( ruleProposition ) | ( ruleEntity ) | ( ruleRelationship ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1007:1: ( ( ruleProposition ) | ( ruleEntity ) | ( ruleRelationship ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                {
                alt2=1;
                }
                break;
            case 32:
            case 33:
            case 34:
            case 37:
            case 39:
            case 40:
                {
                alt2=2;
                }
                break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 41:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1003:1: rule__Object__Alternatives : ( ( ruleProposition ) | ( ruleEntity ) | ( ruleRelationship ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1008:1: ( ruleProposition )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1008:1: ( ruleProposition )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1009:1: ruleProposition
                    {
                     before(grammarAccess.getObjectAccess().getPropositionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleProposition_in_rule__Object__Alternatives2066);
                    ruleProposition();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getPropositionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1014:6: ( ruleEntity )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1014:6: ( ruleEntity )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1015:1: ruleEntity
                    {
                     before(grammarAccess.getObjectAccess().getEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Object__Alternatives2083);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getEntityParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1020:6: ( ruleRelationship )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1020:6: ( ruleRelationship )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1021:1: ruleRelationship
                    {
                     before(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRelationship_in_rule__Object__Alternatives2100);
                    ruleRelationship();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_2()); 

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
    // $ANTLR end rule__Object__Alternatives


    // $ANTLR start rule__Entity__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1032:1: rule__Entity__Alternatives : ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1036:1: ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 32:
            case 33:
                {
                alt3=1;
                }
                break;
            case 34:
            case 37:
                {
                alt3=2;
                }
                break;
            case 39:
            case 40:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1032:1: rule__Entity__Alternatives : ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1037:1: ( ruleActor )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1037:1: ( ruleActor )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1038:1: ruleActor
                    {
                     before(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Entity__Alternatives2133);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1043:6: ( ruleProcess )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1043:6: ( ruleProcess )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1044:1: ruleProcess
                    {
                     before(grammarAccess.getEntityAccess().getProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcess_in_rule__Entity__Alternatives2150);
                    ruleProcess();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getProcessParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1049:6: ( ruleResource )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1049:6: ( ruleResource )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1050:1: ruleResource
                    {
                     before(grammarAccess.getEntityAccess().getResourceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Entity__Alternatives2167);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getResourceParserRuleCall_2()); 

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


    // $ANTLR start rule__Actor__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1060:1: rule__Actor__Alternatives : ( ( ruleStakeholder ) | ( ruleAttacker ) );
    public final void rule__Actor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1064:1: ( ( ruleStakeholder ) | ( ruleAttacker ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==33) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1060:1: rule__Actor__Alternatives : ( ( ruleStakeholder ) | ( ruleAttacker ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1065:1: ( ruleStakeholder )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1065:1: ( ruleStakeholder )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1066:1: ruleStakeholder
                    {
                     before(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStakeholder_in_rule__Actor__Alternatives2199);
                    ruleStakeholder();
                    _fsp--;

                     after(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1071:6: ( ruleAttacker )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1071:6: ( ruleAttacker )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1072:1: ruleAttacker
                    {
                     before(grammarAccess.getActorAccess().getAttackerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttacker_in_rule__Actor__Alternatives2216);
                    ruleAttacker();
                    _fsp--;

                     after(grammarAccess.getActorAccess().getAttackerParserRuleCall_1()); 

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
    // $ANTLR end rule__Actor__Alternatives


    // $ANTLR start rule__Process__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1082:1: rule__Process__Alternatives : ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) );
    public final void rule__Process__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1086:1: ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==34) ) {
                alt5=1;
            }
            else if ( (LA5_0==37) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1082:1: rule__Process__Alternatives : ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1087:1: ( ruleNaturalProcess )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1087:1: ( ruleNaturalProcess )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1088:1: ruleNaturalProcess
                    {
                     before(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNaturalProcess_in_rule__Process__Alternatives2248);
                    ruleNaturalProcess();
                    _fsp--;

                     after(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1093:6: ( ruleHumanActivity )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1093:6: ( ruleHumanActivity )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1094:1: ruleHumanActivity
                    {
                     before(grammarAccess.getProcessAccess().getHumanActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHumanActivity_in_rule__Process__Alternatives2265);
                    ruleHumanActivity();
                    _fsp--;

                     after(grammarAccess.getProcessAccess().getHumanActivityParserRuleCall_1()); 

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
    // $ANTLR end rule__Process__Alternatives


    // $ANTLR start rule__Resource__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1104:1: rule__Resource__Alternatives : ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) );
    public final void rule__Resource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1108:1: ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==39) ) {
                alt6=1;
            }
            else if ( (LA6_0==40) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1104:1: rule__Resource__Alternatives : ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1109:1: ( ( rule__Resource__Group_0__0 ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1109:1: ( ( rule__Resource__Group_0__0 ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1110:1: ( rule__Resource__Group_0__0 )
                    {
                     before(grammarAccess.getResourceAccess().getGroup_0()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1111:1: ( rule__Resource__Group_0__0 )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1111:2: rule__Resource__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Resource__Group_0__0_in_rule__Resource__Alternatives2297);
                    rule__Resource__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getResourceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1115:6: ( ruleAsset )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1115:6: ( ruleAsset )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1116:1: ruleAsset
                    {
                     before(grammarAccess.getResourceAccess().getAssetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAsset_in_rule__Resource__Alternatives2315);
                    ruleAsset();
                    _fsp--;

                     after(grammarAccess.getResourceAccess().getAssetParserRuleCall_1()); 

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
    // $ANTLR end rule__Resource__Alternatives


    // $ANTLR start rule__Relationship__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1126:1: rule__Relationship__Alternatives : ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleDepends ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttack ) | ( ruleArgues ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1130:1: ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleDepends ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttack ) | ( ruleArgues ) )
            int alt7=12;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt7=1;
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            case 20:
            case 21:
                {
                alt7=3;
                }
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                {
                alt7=4;
                }
                break;
            case 45:
                {
                alt7=5;
                }
                break;
            case 46:
                {
                alt7=6;
                }
                break;
            case 47:
                {
                alt7=7;
                }
                break;
            case 26:
            case 27:
                {
                alt7=8;
                }
                break;
            case 48:
                {
                alt7=9;
                }
                break;
            case 49:
                {
                alt7=10;
                }
                break;
            case 50:
                {
                alt7=11;
                }
                break;
            case 51:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1126:1: rule__Relationship__Alternatives : ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleDepends ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttack ) | ( ruleArgues ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1131:1: ( ruleWants )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1131:1: ( ruleWants )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1132:1: ruleWants
                    {
                     before(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWants_in_rule__Relationship__Alternatives2347);
                    ruleWants();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1137:6: ( ruleDoes )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1137:6: ( ruleDoes )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1138:1: ruleDoes
                    {
                     before(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDoes_in_rule__Relationship__Alternatives2364);
                    ruleDoes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1143:6: ( ruleDecomposes )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1143:6: ( ruleDecomposes )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1144:1: ruleDecomposes
                    {
                     before(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDecomposes_in_rule__Relationship__Alternatives2381);
                    ruleDecomposes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1149:6: ( ruleContributes )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1149:6: ( ruleContributes )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1150:1: ruleContributes
                    {
                     before(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleContributes_in_rule__Relationship__Alternatives2398);
                    ruleContributes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1155:6: ( ruleFulfils )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1155:6: ( ruleFulfils )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1156:1: ruleFulfils
                    {
                     before(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleFulfils_in_rule__Relationship__Alternatives2415);
                    ruleFulfils();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1161:6: ( ruleProvides )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1161:6: ( ruleProvides )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1162:1: ruleProvides
                    {
                     before(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleProvides_in_rule__Relationship__Alternatives2432);
                    ruleProvides();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1167:6: ( ruleConsumes )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1167:6: ( ruleConsumes )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1168:1: ruleConsumes
                    {
                     before(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleConsumes_in_rule__Relationship__Alternatives2449);
                    ruleConsumes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1173:6: ( ruleDepends )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1173:6: ( ruleDepends )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1174:1: ruleDepends
                    {
                     before(grammarAccess.getRelationshipAccess().getDependsParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleDepends_in_rule__Relationship__Alternatives2466);
                    ruleDepends();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDependsParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1179:6: ( ruleExploits )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1179:6: ( ruleExploits )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1180:1: ruleExploits
                    {
                     before(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleExploits_in_rule__Relationship__Alternatives2483);
                    ruleExploits();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1185:6: ( ruleDamages )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1185:6: ( ruleDamages )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1186:1: ruleDamages
                    {
                     before(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleDamages_in_rule__Relationship__Alternatives2500);
                    ruleDamages();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1191:6: ( ruleAttack )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1191:6: ( ruleAttack )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1192:1: ruleAttack
                    {
                     before(grammarAccess.getRelationshipAccess().getAttackParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleAttack_in_rule__Relationship__Alternatives2517);
                    ruleAttack();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getAttackParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1197:6: ( ruleArgues )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1197:6: ( ruleArgues )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1198:1: ruleArgues
                    {
                     before(grammarAccess.getRelationshipAccess().getArguesParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleArgues_in_rule__Relationship__Alternatives2534);
                    ruleArgues();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getArguesParserRuleCall_11()); 

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
    // $ANTLR end rule__Relationship__Alternatives


    // $ANTLR start rule__PropositionType__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1208:1: rule__PropositionType__Alternatives : ( ( ( 'DA' ) ) | ( ( 'FR' ) ) | ( ( 'SR' ) ) | ( ( 'AR' ) ) | ( ( 'Q' ) ) | ( ( 'A' ) ) );
    public final void rule__PropositionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1212:1: ( ( ( 'DA' ) ) | ( ( 'FR' ) ) | ( ( 'SR' ) ) | ( ( 'AR' ) ) | ( ( 'Q' ) ) | ( ( 'A' ) ) )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt8=1;
                }
                break;
            case 12:
                {
                alt8=2;
                }
                break;
            case 13:
                {
                alt8=3;
                }
                break;
            case 14:
                {
                alt8=4;
                }
                break;
            case 15:
                {
                alt8=5;
                }
                break;
            case 16:
                {
                alt8=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1208:1: rule__PropositionType__Alternatives : ( ( ( 'DA' ) ) | ( ( 'FR' ) ) | ( ( 'SR' ) ) | ( ( 'AR' ) ) | ( ( 'Q' ) ) | ( ( 'A' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1213:1: ( ( 'DA' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1213:1: ( ( 'DA' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1214:1: ( 'DA' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1215:1: ( 'DA' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1215:3: 'DA'
                    {
                    match(input,11,FOLLOW_11_in_rule__PropositionType__Alternatives2567); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1220:6: ( ( 'FR' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1220:6: ( ( 'FR' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1221:1: ( 'FR' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getFunctionEnumLiteralDeclaration_1()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1222:1: ( 'FR' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1222:3: 'FR'
                    {
                    match(input,12,FOLLOW_12_in_rule__PropositionType__Alternatives2588); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getFunctionEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1227:6: ( ( 'SR' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1227:6: ( ( 'SR' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1228:1: ( 'SR' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getSecurityEnumLiteralDeclaration_2()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1229:1: ( 'SR' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1229:3: 'SR'
                    {
                    match(input,13,FOLLOW_13_in_rule__PropositionType__Alternatives2609); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getSecurityEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1234:6: ( ( 'AR' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1234:6: ( ( 'AR' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1235:1: ( 'AR' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getAntiEnumLiteralDeclaration_3()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1236:1: ( 'AR' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1236:3: 'AR'
                    {
                    match(input,14,FOLLOW_14_in_rule__PropositionType__Alternatives2630); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getAntiEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1241:6: ( ( 'Q' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1241:6: ( ( 'Q' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1242:1: ( 'Q' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getQualityPropositionEnumLiteralDeclaration_4()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1243:1: ( 'Q' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1243:3: 'Q'
                    {
                    match(input,15,FOLLOW_15_in_rule__PropositionType__Alternatives2651); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getQualityPropositionEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1248:6: ( ( 'A' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1248:6: ( ( 'A' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1249:1: ( 'A' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getArgumentEnumLiteralDeclaration_5()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1250:1: ( 'A' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1250:3: 'A'
                    {
                    match(input,16,FOLLOW_16_in_rule__PropositionType__Alternatives2672); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getArgumentEnumLiteralDeclaration_5()); 

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
    // $ANTLR end rule__PropositionType__Alternatives


    // $ANTLR start rule__DomainType__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1260:1: rule__DomainType__Alternatives : ( ( ( 'M' ) ) | ( ( 'R' ) ) | ( ( 'S' ) ) );
    public final void rule__DomainType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1264:1: ( ( ( 'M' ) ) | ( ( 'R' ) ) | ( ( 'S' ) ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 19:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1260:1: rule__DomainType__Alternatives : ( ( ( 'M' ) ) | ( ( 'R' ) ) | ( ( 'S' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1265:1: ( ( 'M' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1265:1: ( ( 'M' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1266:1: ( 'M' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getMachineEnumLiteralDeclaration_0()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1267:1: ( 'M' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1267:3: 'M'
                    {
                    match(input,17,FOLLOW_17_in_rule__DomainType__Alternatives2708); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getMachineEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1272:6: ( ( 'R' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1272:6: ( ( 'R' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1273:1: ( 'R' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1274:1: ( 'R' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1274:3: 'R'
                    {
                    match(input,18,FOLLOW_18_in_rule__DomainType__Alternatives2729); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1279:6: ( ( 'S' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1279:6: ( ( 'S' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1280:1: ( 'S' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_2()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1281:1: ( 'S' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1281:3: 'S'
                    {
                    match(input,19,FOLLOW_19_in_rule__DomainType__Alternatives2750); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_2()); 

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
    // $ANTLR end rule__DomainType__Alternatives


    // $ANTLR start rule__DecompositionLabel__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1291:1: rule__DecompositionLabel__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__DecompositionLabel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1295:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            else if ( (LA10_0==21) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1291:1: rule__DecompositionLabel__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1296:1: ( ( 'and' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1296:1: ( ( 'and' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1297:1: ( 'and' )
                    {
                     before(grammarAccess.getDecompositionLabelAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1298:1: ( 'and' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1298:3: 'and'
                    {
                    match(input,20,FOLLOW_20_in_rule__DecompositionLabel__Alternatives2786); 

                    }

                     after(grammarAccess.getDecompositionLabelAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1303:6: ( ( 'or' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1303:6: ( ( 'or' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1304:1: ( 'or' )
                    {
                     before(grammarAccess.getDecompositionLabelAccess().getOREnumLiteralDeclaration_1()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1305:1: ( 'or' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1305:3: 'or'
                    {
                    match(input,21,FOLLOW_21_in_rule__DecompositionLabel__Alternatives2807); 

                    }

                     after(grammarAccess.getDecompositionLabelAccess().getOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__DecompositionLabel__Alternatives


    // $ANTLR start rule__ContributionLabel__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1315:1: rule__ContributionLabel__Alternatives : ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) );
    public final void rule__ContributionLabel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1319:1: ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            case 25:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1315:1: rule__ContributionLabel__Alternatives : ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1320:1: ( ( '-' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1320:1: ( ( '-' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1321:1: ( '-' )
                    {
                     before(grammarAccess.getContributionLabelAccess().getHURTEnumLiteralDeclaration_0()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1322:1: ( '-' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1322:3: '-'
                    {
                    match(input,22,FOLLOW_22_in_rule__ContributionLabel__Alternatives2843); 

                    }

                     after(grammarAccess.getContributionLabelAccess().getHURTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1327:6: ( ( '+' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1327:6: ( ( '+' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1328:1: ( '+' )
                    {
                     before(grammarAccess.getContributionLabelAccess().getHELPEnumLiteralDeclaration_1()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1329:1: ( '+' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1329:3: '+'
                    {
                    match(input,23,FOLLOW_23_in_rule__ContributionLabel__Alternatives2864); 

                    }

                     after(grammarAccess.getContributionLabelAccess().getHELPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1334:6: ( ( '--' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1334:6: ( ( '--' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1335:1: ( '--' )
                    {
                     before(grammarAccess.getContributionLabelAccess().getBREAKEnumLiteralDeclaration_2()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1336:1: ( '--' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1336:3: '--'
                    {
                    match(input,24,FOLLOW_24_in_rule__ContributionLabel__Alternatives2885); 

                    }

                     after(grammarAccess.getContributionLabelAccess().getBREAKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1341:6: ( ( '++' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1341:6: ( ( '++' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1342:1: ( '++' )
                    {
                     before(grammarAccess.getContributionLabelAccess().getMAKEEnumLiteralDeclaration_3()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1343:1: ( '++' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1343:3: '++'
                    {
                    match(input,25,FOLLOW_25_in_rule__ContributionLabel__Alternatives2906); 

                    }

                     after(grammarAccess.getContributionLabelAccess().getMAKEEnumLiteralDeclaration_3()); 

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
    // $ANTLR end rule__ContributionLabel__Alternatives


    // $ANTLR start rule__DependencyType__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1353:1: rule__DependencyType__Alternatives : ( ( ( 'trusts' ) ) | ( ( 'delegates' ) ) );
    public final void rule__DependencyType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1357:1: ( ( ( 'trusts' ) ) | ( ( 'delegates' ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            else if ( (LA12_0==27) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1353:1: rule__DependencyType__Alternatives : ( ( ( 'trusts' ) ) | ( ( 'delegates' ) ) );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1358:1: ( ( 'trusts' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1358:1: ( ( 'trusts' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1359:1: ( 'trusts' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getTRUSTEnumLiteralDeclaration_0()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1360:1: ( 'trusts' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1360:3: 'trusts'
                    {
                    match(input,26,FOLLOW_26_in_rule__DependencyType__Alternatives2942); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getTRUSTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1365:6: ( ( 'delegates' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1365:6: ( ( 'delegates' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1366:1: ( 'delegates' )
                    {
                     before(grammarAccess.getDependencyTypeAccess().getDELEGATEEnumLiteralDeclaration_1()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1367:1: ( 'delegates' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1367:3: 'delegates'
                    {
                    match(input,27,FOLLOW_27_in_rule__DependencyType__Alternatives2963); 

                    }

                     after(grammarAccess.getDependencyTypeAccess().getDELEGATEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__DependencyType__Alternatives


    // $ANTLR start rule__Situation__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1379:1: rule__Situation__Group__0 : rule__Situation__Group__0__Impl rule__Situation__Group__1 ;
    public final void rule__Situation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1383:1: ( rule__Situation__Group__0__Impl rule__Situation__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1384:2: rule__Situation__Group__0__Impl rule__Situation__Group__1
            {
            pushFollow(FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__02996);
            rule__Situation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__02999);
            rule__Situation__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__Group__0


    // $ANTLR start rule__Situation__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1391:1: rule__Situation__Group__0__Impl : ( ( rule__Situation__Group_0__0 )? ) ;
    public final void rule__Situation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1395:1: ( ( ( rule__Situation__Group_0__0 )? ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1396:1: ( ( rule__Situation__Group_0__0 )? )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1396:1: ( ( rule__Situation__Group_0__0 )? )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1397:1: ( rule__Situation__Group_0__0 )?
            {
             before(grammarAccess.getSituationAccess().getGroup_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1398:1: ( rule__Situation__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1398:2: rule__Situation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl3026);
                    rule__Situation__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSituationAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__Group__0__Impl


    // $ANTLR start rule__Situation__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1408:1: rule__Situation__Group__1 : rule__Situation__Group__1__Impl ;
    public final void rule__Situation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1412:1: ( rule__Situation__Group__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1413:2: rule__Situation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__13057);
            rule__Situation__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__Group__1


    // $ANTLR start rule__Situation__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1419:1: rule__Situation__Group__1__Impl : ( ( rule__Situation__WorldAssignment_1 ) ) ;
    public final void rule__Situation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1423:1: ( ( ( rule__Situation__WorldAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1424:1: ( ( rule__Situation__WorldAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1424:1: ( ( rule__Situation__WorldAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1425:1: ( rule__Situation__WorldAssignment_1 )
            {
             before(grammarAccess.getSituationAccess().getWorldAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1426:1: ( rule__Situation__WorldAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1426:2: rule__Situation__WorldAssignment_1
            {
            pushFollow(FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl3084);
            rule__Situation__WorldAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSituationAccess().getWorldAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__Group__1__Impl


    // $ANTLR start rule__Situation__Group_0__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1440:1: rule__Situation__Group_0__0 : rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 ;
    public final void rule__Situation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1444:1: ( rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1445:2: rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__03118);
            rule__Situation__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__03121);
            rule__Situation__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__Group_0__0


    // $ANTLR start rule__Situation__Group_0__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1452:1: rule__Situation__Group_0__0__Impl : ( 'model' ) ;
    public final void rule__Situation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1456:1: ( ( 'model' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1457:1: ( 'model' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1457:1: ( 'model' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1458:1: 'model'
            {
             before(grammarAccess.getSituationAccess().getModelKeyword_0_0()); 
            match(input,28,FOLLOW_28_in_rule__Situation__Group_0__0__Impl3149); 
             after(grammarAccess.getSituationAccess().getModelKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__Group_0__0__Impl


    // $ANTLR start rule__Situation__Group_0__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1471:1: rule__Situation__Group_0__1 : rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 ;
    public final void rule__Situation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1475:1: ( rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1476:2: rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__13180);
            rule__Situation__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__13183);
            rule__Situation__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__Group_0__1


    // $ANTLR start rule__Situation__Group_0__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1483:1: rule__Situation__Group_0__1__Impl : ( ( rule__Situation__TimeAssignment_0_1 ) ) ;
    public final void rule__Situation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1487:1: ( ( ( rule__Situation__TimeAssignment_0_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1488:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1488:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1489:1: ( rule__Situation__TimeAssignment_0_1 )
            {
             before(grammarAccess.getSituationAccess().getTimeAssignment_0_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1490:1: ( rule__Situation__TimeAssignment_0_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1490:2: rule__Situation__TimeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl3210);
            rule__Situation__TimeAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getSituationAccess().getTimeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__Group_0__1__Impl


    // $ANTLR start rule__Situation__Group_0__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1500:1: rule__Situation__Group_0__2 : rule__Situation__Group_0__2__Impl ;
    public final void rule__Situation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1504:1: ( rule__Situation__Group_0__2__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1505:2: rule__Situation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__23240);
            rule__Situation__Group_0__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__Group_0__2


    // $ANTLR start rule__Situation__Group_0__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1511:1: rule__Situation__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Situation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1515:1: ( ( ':' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1516:1: ( ':' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1516:1: ( ':' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1517:1: ':'
            {
             before(grammarAccess.getSituationAccess().getColonKeyword_0_2()); 
            match(input,29,FOLLOW_29_in_rule__Situation__Group_0__2__Impl3268); 
             after(grammarAccess.getSituationAccess().getColonKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__Group_0__2__Impl


    // $ANTLR start rule__World__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1536:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1540:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1541:2: rule__World__Group__0__Impl rule__World__Group__1
            {
            pushFollow(FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__03305);
            rule__World__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__World__Group__1_in_rule__World__Group__03308);
            rule__World__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__Group__0


    // $ANTLR start rule__World__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1548:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1552:1: ( ( () ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1553:1: ( () )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1553:1: ( () )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1554:1: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1555:1: ()
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1557:1: 
            {
            }

             after(grammarAccess.getWorldAccess().getWorldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__Group__0__Impl


    // $ANTLR start rule__World__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1567:1: rule__World__Group__1 : rule__World__Group__1__Impl ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1571:1: ( rule__World__Group__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1572:2: rule__World__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__13366);
            rule__World__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__Group__1


    // $ANTLR start rule__World__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1578:1: rule__World__Group__1__Impl : ( ( rule__World__Alternatives_1 )* ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1582:1: ( ( ( rule__World__Alternatives_1 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1583:1: ( ( rule__World__Alternatives_1 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1583:1: ( ( rule__World__Alternatives_1 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1584:1: ( rule__World__Alternatives_1 )*
            {
             before(grammarAccess.getWorldAccess().getAlternatives_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1585:1: ( rule__World__Alternatives_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=17 && LA14_0<=27)||(LA14_0>=32 && LA14_0<=34)||LA14_0==37||(LA14_0>=39 && LA14_0<=41)||(LA14_0>=44 && LA14_0<=51)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1585:2: rule__World__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__World__Alternatives_1_in_rule__World__Group__1__Impl3393);
            	    rule__World__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getWorldAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__Group__1__Impl


    // $ANTLR start rule__Event__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1599:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1603:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1604:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03428);
            rule__Event__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03431);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1611:1: rule__Event__Group__0__Impl : ( 'event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1615:1: ( ( 'event' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1616:1: ( 'event' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1616:1: ( 'event' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1617:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Event__Group__0__Impl3459); 
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1630:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1634:1: ( rule__Event__Group__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1635:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13490);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1641:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1645:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1646:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1646:1: ( ( rule__Event__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1647:1: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1648:1: ( rule__Event__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1648:2: rule__Event__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl3517);
            rule__Event__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Proposition__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1664:1: rule__Proposition__Group__0 : rule__Proposition__Group__0__Impl rule__Proposition__Group__1 ;
    public final void rule__Proposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1668:1: ( rule__Proposition__Group__0__Impl rule__Proposition__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1669:2: rule__Proposition__Group__0__Impl rule__Proposition__Group__1
            {
            pushFollow(FOLLOW_rule__Proposition__Group__0__Impl_in_rule__Proposition__Group__03553);
            rule__Proposition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Proposition__Group__1_in_rule__Proposition__Group__03556);
            rule__Proposition__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proposition__Group__0


    // $ANTLR start rule__Proposition__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1676:1: rule__Proposition__Group__0__Impl : ( ( rule__Proposition__TypeAssignment_0 ) ) ;
    public final void rule__Proposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1680:1: ( ( ( rule__Proposition__TypeAssignment_0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1681:1: ( ( rule__Proposition__TypeAssignment_0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1681:1: ( ( rule__Proposition__TypeAssignment_0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1682:1: ( rule__Proposition__TypeAssignment_0 )
            {
             before(grammarAccess.getPropositionAccess().getTypeAssignment_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1683:1: ( rule__Proposition__TypeAssignment_0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1683:2: rule__Proposition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Proposition__TypeAssignment_0_in_rule__Proposition__Group__0__Impl3583);
            rule__Proposition__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPropositionAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proposition__Group__0__Impl


    // $ANTLR start rule__Proposition__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1693:1: rule__Proposition__Group__1 : rule__Proposition__Group__1__Impl ;
    public final void rule__Proposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1697:1: ( rule__Proposition__Group__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1698:2: rule__Proposition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Proposition__Group__1__Impl_in_rule__Proposition__Group__13613);
            rule__Proposition__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proposition__Group__1


    // $ANTLR start rule__Proposition__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1704:1: rule__Proposition__Group__1__Impl : ( ( rule__Proposition__NameAssignment_1 ) ) ;
    public final void rule__Proposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1708:1: ( ( ( rule__Proposition__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1709:1: ( ( rule__Proposition__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1709:1: ( ( rule__Proposition__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1710:1: ( rule__Proposition__NameAssignment_1 )
            {
             before(grammarAccess.getPropositionAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1711:1: ( rule__Proposition__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1711:2: rule__Proposition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Proposition__NameAssignment_1_in_rule__Proposition__Group__1__Impl3640);
            rule__Proposition__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getPropositionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proposition__Group__1__Impl


    // $ANTLR start rule__Domain__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1725:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1729:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1730:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03674);
            rule__Domain__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03677);
            rule__Domain__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group__0


    // $ANTLR start rule__Domain__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1737:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__TypeAssignment_0 ) ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1741:1: ( ( ( rule__Domain__TypeAssignment_0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1742:1: ( ( rule__Domain__TypeAssignment_0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1742:1: ( ( rule__Domain__TypeAssignment_0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1743:1: ( rule__Domain__TypeAssignment_0 )
            {
             before(grammarAccess.getDomainAccess().getTypeAssignment_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1744:1: ( rule__Domain__TypeAssignment_0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1744:2: rule__Domain__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Domain__TypeAssignment_0_in_rule__Domain__Group__0__Impl3704);
            rule__Domain__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group__0__Impl


    // $ANTLR start rule__Domain__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1754:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1758:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1759:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13734);
            rule__Domain__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13737);
            rule__Domain__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group__1


    // $ANTLR start rule__Domain__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1766:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__PropertiesAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1770:1: ( ( ( rule__Domain__PropertiesAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1771:1: ( ( rule__Domain__PropertiesAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1771:1: ( ( rule__Domain__PropertiesAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1772:1: ( rule__Domain__PropertiesAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1773:1: ( rule__Domain__PropertiesAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1773:2: rule__Domain__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_1_in_rule__Domain__Group__1__Impl3764);
            rule__Domain__PropertiesAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getPropertiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group__1__Impl


    // $ANTLR start rule__Domain__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1783:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1787:1: ( rule__Domain__Group__2__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1788:2: rule__Domain__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23794);
            rule__Domain__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group__2


    // $ANTLR start rule__Domain__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1794:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__Group_2__0 )* ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1798:1: ( ( ( rule__Domain__Group_2__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1799:1: ( ( rule__Domain__Group_2__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1799:1: ( ( rule__Domain__Group_2__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1800:1: ( rule__Domain__Group_2__0 )*
            {
             before(grammarAccess.getDomainAccess().getGroup_2()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1801:1: ( rule__Domain__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==31) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1801:2: rule__Domain__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__Group_2__0_in_rule__Domain__Group__2__Impl3821);
            	    rule__Domain__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group__2__Impl


    // $ANTLR start rule__Domain__Group_2__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1817:1: rule__Domain__Group_2__0 : rule__Domain__Group_2__0__Impl rule__Domain__Group_2__1 ;
    public final void rule__Domain__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1821:1: ( rule__Domain__Group_2__0__Impl rule__Domain__Group_2__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1822:2: rule__Domain__Group_2__0__Impl rule__Domain__Group_2__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_2__0__Impl_in_rule__Domain__Group_2__03858);
            rule__Domain__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_2__1_in_rule__Domain__Group_2__03861);
            rule__Domain__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_2__0


    // $ANTLR start rule__Domain__Group_2__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1829:1: rule__Domain__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Domain__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1833:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1834:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1834:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1835:1: ','
            {
             before(grammarAccess.getDomainAccess().getCommaKeyword_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Domain__Group_2__0__Impl3889); 
             after(grammarAccess.getDomainAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_2__0__Impl


    // $ANTLR start rule__Domain__Group_2__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1848:1: rule__Domain__Group_2__1 : rule__Domain__Group_2__1__Impl ;
    public final void rule__Domain__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1852:1: ( rule__Domain__Group_2__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1853:2: rule__Domain__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_2__1__Impl_in_rule__Domain__Group_2__13920);
            rule__Domain__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_2__1


    // $ANTLR start rule__Domain__Group_2__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1859:1: rule__Domain__Group_2__1__Impl : ( ( rule__Domain__PropertiesAssignment_2_1 ) ) ;
    public final void rule__Domain__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1863:1: ( ( ( rule__Domain__PropertiesAssignment_2_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1864:1: ( ( rule__Domain__PropertiesAssignment_2_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1864:1: ( ( rule__Domain__PropertiesAssignment_2_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1865:1: ( rule__Domain__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_2_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1866:1: ( rule__Domain__PropertiesAssignment_2_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1866:2: rule__Domain__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_2_1_in_rule__Domain__Group_2__1__Impl3947);
            rule__Domain__PropertiesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getPropertiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_2__1__Impl


    // $ANTLR start rule__Stakeholder__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1880:1: rule__Stakeholder__Group__0 : rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1 ;
    public final void rule__Stakeholder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1884:1: ( rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1885:2: rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__0__Impl_in_rule__Stakeholder__Group__03981);
            rule__Stakeholder__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__1_in_rule__Stakeholder__Group__03984);
            rule__Stakeholder__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Stakeholder__Group__0


    // $ANTLR start rule__Stakeholder__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1892:1: rule__Stakeholder__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Stakeholder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1896:1: ( ( 'actor' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1897:1: ( 'actor' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1897:1: ( 'actor' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1898:1: 'actor'
            {
             before(grammarAccess.getStakeholderAccess().getActorKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Stakeholder__Group__0__Impl4012); 
             after(grammarAccess.getStakeholderAccess().getActorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Stakeholder__Group__0__Impl


    // $ANTLR start rule__Stakeholder__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1911:1: rule__Stakeholder__Group__1 : rule__Stakeholder__Group__1__Impl ;
    public final void rule__Stakeholder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1915:1: ( rule__Stakeholder__Group__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1916:2: rule__Stakeholder__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__1__Impl_in_rule__Stakeholder__Group__14043);
            rule__Stakeholder__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Stakeholder__Group__1


    // $ANTLR start rule__Stakeholder__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1922:1: rule__Stakeholder__Group__1__Impl : ( ( rule__Stakeholder__NameAssignment_1 ) ) ;
    public final void rule__Stakeholder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1926:1: ( ( ( rule__Stakeholder__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1927:1: ( ( rule__Stakeholder__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1927:1: ( ( rule__Stakeholder__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1928:1: ( rule__Stakeholder__NameAssignment_1 )
            {
             before(grammarAccess.getStakeholderAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1929:1: ( rule__Stakeholder__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1929:2: rule__Stakeholder__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Stakeholder__NameAssignment_1_in_rule__Stakeholder__Group__1__Impl4070);
            rule__Stakeholder__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getStakeholderAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Stakeholder__Group__1__Impl


    // $ANTLR start rule__Attacker__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1943:1: rule__Attacker__Group__0 : rule__Attacker__Group__0__Impl rule__Attacker__Group__1 ;
    public final void rule__Attacker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1947:1: ( rule__Attacker__Group__0__Impl rule__Attacker__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1948:2: rule__Attacker__Group__0__Impl rule__Attacker__Group__1
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__04104);
            rule__Attacker__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__04107);
            rule__Attacker__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__Group__0


    // $ANTLR start rule__Attacker__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1955:1: rule__Attacker__Group__0__Impl : ( 'attacker' ) ;
    public final void rule__Attacker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1959:1: ( ( 'attacker' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1960:1: ( 'attacker' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1960:1: ( 'attacker' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1961:1: 'attacker'
            {
             before(grammarAccess.getAttackerAccess().getAttackerKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Attacker__Group__0__Impl4135); 
             after(grammarAccess.getAttackerAccess().getAttackerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__Group__0__Impl


    // $ANTLR start rule__Attacker__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1974:1: rule__Attacker__Group__1 : rule__Attacker__Group__1__Impl ;
    public final void rule__Attacker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1978:1: ( rule__Attacker__Group__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1979:2: rule__Attacker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__14166);
            rule__Attacker__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__Group__1


    // $ANTLR start rule__Attacker__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1985:1: rule__Attacker__Group__1__Impl : ( ( rule__Attacker__NameAssignment_1 ) ) ;
    public final void rule__Attacker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1989:1: ( ( ( rule__Attacker__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1990:1: ( ( rule__Attacker__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1990:1: ( ( rule__Attacker__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1991:1: ( rule__Attacker__NameAssignment_1 )
            {
             before(grammarAccess.getAttackerAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1992:1: ( rule__Attacker__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1992:2: rule__Attacker__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attacker__NameAssignment_1_in_rule__Attacker__Group__1__Impl4193);
            rule__Attacker__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttackerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__Group__1__Impl


    // $ANTLR start rule__NaturalProcess__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2006:1: rule__NaturalProcess__Group__0 : rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1 ;
    public final void rule__NaturalProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2010:1: ( rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2011:2: rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__0__Impl_in_rule__NaturalProcess__Group__04227);
            rule__NaturalProcess__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group__1_in_rule__NaturalProcess__Group__04230);
            rule__NaturalProcess__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group__0


    // $ANTLR start rule__NaturalProcess__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2018:1: rule__NaturalProcess__Group__0__Impl : ( 'process' ) ;
    public final void rule__NaturalProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2022:1: ( ( 'process' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2023:1: ( 'process' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2023:1: ( 'process' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2024:1: 'process'
            {
             before(grammarAccess.getNaturalProcessAccess().getProcessKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__NaturalProcess__Group__0__Impl4258); 
             after(grammarAccess.getNaturalProcessAccess().getProcessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group__0__Impl


    // $ANTLR start rule__NaturalProcess__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2037:1: rule__NaturalProcess__Group__1 : rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2 ;
    public final void rule__NaturalProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2041:1: ( rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2042:2: rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__1__Impl_in_rule__NaturalProcess__Group__14289);
            rule__NaturalProcess__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group__2_in_rule__NaturalProcess__Group__14292);
            rule__NaturalProcess__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group__1


    // $ANTLR start rule__NaturalProcess__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2049:1: rule__NaturalProcess__Group__1__Impl : ( ( rule__NaturalProcess__NameAssignment_1 ) ) ;
    public final void rule__NaturalProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2053:1: ( ( ( rule__NaturalProcess__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2054:1: ( ( rule__NaturalProcess__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2054:1: ( ( rule__NaturalProcess__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2055:1: ( rule__NaturalProcess__NameAssignment_1 )
            {
             before(grammarAccess.getNaturalProcessAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2056:1: ( rule__NaturalProcess__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2056:2: rule__NaturalProcess__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__NameAssignment_1_in_rule__NaturalProcess__Group__1__Impl4319);
            rule__NaturalProcess__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getNaturalProcessAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group__1__Impl


    // $ANTLR start rule__NaturalProcess__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2066:1: rule__NaturalProcess__Group__2 : rule__NaturalProcess__Group__2__Impl ;
    public final void rule__NaturalProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2070:1: ( rule__NaturalProcess__Group__2__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2071:2: rule__NaturalProcess__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__2__Impl_in_rule__NaturalProcess__Group__24349);
            rule__NaturalProcess__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group__2


    // $ANTLR start rule__NaturalProcess__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2077:1: rule__NaturalProcess__Group__2__Impl : ( ( rule__NaturalProcess__Group_2__0 )? ) ;
    public final void rule__NaturalProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2081:1: ( ( ( rule__NaturalProcess__Group_2__0 )? ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2082:1: ( ( rule__NaturalProcess__Group_2__0 )? )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2082:1: ( ( rule__NaturalProcess__Group_2__0 )? )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2083:1: ( rule__NaturalProcess__Group_2__0 )?
            {
             before(grammarAccess.getNaturalProcessAccess().getGroup_2()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2084:1: ( rule__NaturalProcess__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2084:2: rule__NaturalProcess__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NaturalProcess__Group_2__0_in_rule__NaturalProcess__Group__2__Impl4376);
                    rule__NaturalProcess__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNaturalProcessAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group__2__Impl


    // $ANTLR start rule__NaturalProcess__Group_2__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2100:1: rule__NaturalProcess__Group_2__0 : rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1 ;
    public final void rule__NaturalProcess__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2104:1: ( rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2105:2: rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__0__Impl_in_rule__NaturalProcess__Group_2__04413);
            rule__NaturalProcess__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__1_in_rule__NaturalProcess__Group_2__04416);
            rule__NaturalProcess__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group_2__0


    // $ANTLR start rule__NaturalProcess__Group_2__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2112:1: rule__NaturalProcess__Group_2__0__Impl : ( '{' ) ;
    public final void rule__NaturalProcess__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2116:1: ( ( '{' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2117:1: ( '{' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2117:1: ( '{' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2118:1: '{'
            {
             before(grammarAccess.getNaturalProcessAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__NaturalProcess__Group_2__0__Impl4444); 
             after(grammarAccess.getNaturalProcessAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group_2__0__Impl


    // $ANTLR start rule__NaturalProcess__Group_2__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2131:1: rule__NaturalProcess__Group_2__1 : rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2 ;
    public final void rule__NaturalProcess__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2135:1: ( rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2136:2: rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__1__Impl_in_rule__NaturalProcess__Group_2__14475);
            rule__NaturalProcess__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__2_in_rule__NaturalProcess__Group_2__14478);
            rule__NaturalProcess__Group_2__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group_2__1


    // $ANTLR start rule__NaturalProcess__Group_2__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2143:1: rule__NaturalProcess__Group_2__1__Impl : ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* ) ;
    public final void rule__NaturalProcess__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2147:1: ( ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2148:1: ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2148:1: ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2149:1: ( rule__NaturalProcess__ActivitiesAssignment_2_1 )*
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesAssignment_2_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2150:1: ( rule__NaturalProcess__ActivitiesAssignment_2_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2150:2: rule__NaturalProcess__ActivitiesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__NaturalProcess__ActivitiesAssignment_2_1_in_rule__NaturalProcess__Group_2__1__Impl4505);
            	    rule__NaturalProcess__ActivitiesAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getNaturalProcessAccess().getActivitiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group_2__1__Impl


    // $ANTLR start rule__NaturalProcess__Group_2__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2160:1: rule__NaturalProcess__Group_2__2 : rule__NaturalProcess__Group_2__2__Impl ;
    public final void rule__NaturalProcess__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2164:1: ( rule__NaturalProcess__Group_2__2__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2165:2: rule__NaturalProcess__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__2__Impl_in_rule__NaturalProcess__Group_2__24536);
            rule__NaturalProcess__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group_2__2


    // $ANTLR start rule__NaturalProcess__Group_2__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2171:1: rule__NaturalProcess__Group_2__2__Impl : ( '}' ) ;
    public final void rule__NaturalProcess__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2175:1: ( ( '}' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2176:1: ( '}' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2176:1: ( '}' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2177:1: '}'
            {
             before(grammarAccess.getNaturalProcessAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,36,FOLLOW_36_in_rule__NaturalProcess__Group_2__2__Impl4564); 
             after(grammarAccess.getNaturalProcessAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__Group_2__2__Impl


    // $ANTLR start rule__HumanActivity__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2196:1: rule__HumanActivity__Group__0 : rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1 ;
    public final void rule__HumanActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2200:1: ( rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2201:2: rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__0__Impl_in_rule__HumanActivity__Group__04601);
            rule__HumanActivity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__1_in_rule__HumanActivity__Group__04604);
            rule__HumanActivity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__Group__0


    // $ANTLR start rule__HumanActivity__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2208:1: rule__HumanActivity__Group__0__Impl : ( () ) ;
    public final void rule__HumanActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2212:1: ( ( () ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2213:1: ( () )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2213:1: ( () )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2214:1: ()
            {
             before(grammarAccess.getHumanActivityAccess().getActivityAction_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2215:1: ()
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2217:1: 
            {
            }

             after(grammarAccess.getHumanActivityAccess().getActivityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__Group__0__Impl


    // $ANTLR start rule__HumanActivity__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2227:1: rule__HumanActivity__Group__1 : rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2 ;
    public final void rule__HumanActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2231:1: ( rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2232:2: rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__1__Impl_in_rule__HumanActivity__Group__14662);
            rule__HumanActivity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__2_in_rule__HumanActivity__Group__14665);
            rule__HumanActivity__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__Group__1


    // $ANTLR start rule__HumanActivity__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2239:1: rule__HumanActivity__Group__1__Impl : ( 'activity' ) ;
    public final void rule__HumanActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2243:1: ( ( 'activity' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2244:1: ( 'activity' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2244:1: ( 'activity' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2245:1: 'activity'
            {
             before(grammarAccess.getHumanActivityAccess().getActivityKeyword_1()); 
            match(input,37,FOLLOW_37_in_rule__HumanActivity__Group__1__Impl4693); 
             after(grammarAccess.getHumanActivityAccess().getActivityKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__Group__1__Impl


    // $ANTLR start rule__HumanActivity__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2258:1: rule__HumanActivity__Group__2 : rule__HumanActivity__Group__2__Impl ;
    public final void rule__HumanActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2262:1: ( rule__HumanActivity__Group__2__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2263:2: rule__HumanActivity__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__2__Impl_in_rule__HumanActivity__Group__24724);
            rule__HumanActivity__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__Group__2


    // $ANTLR start rule__HumanActivity__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2269:1: rule__HumanActivity__Group__2__Impl : ( ( rule__HumanActivity__ActionsAssignment_2 )* ) ;
    public final void rule__HumanActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2273:1: ( ( ( rule__HumanActivity__ActionsAssignment_2 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2274:1: ( ( rule__HumanActivity__ActionsAssignment_2 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2274:1: ( ( rule__HumanActivity__ActionsAssignment_2 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2275:1: ( rule__HumanActivity__ActionsAssignment_2 )*
            {
             before(grammarAccess.getHumanActivityAccess().getActionsAssignment_2()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2276:1: ( rule__HumanActivity__ActionsAssignment_2 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==38) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2276:2: rule__HumanActivity__ActionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__HumanActivity__ActionsAssignment_2_in_rule__HumanActivity__Group__2__Impl4751);
            	    rule__HumanActivity__ActionsAssignment_2();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getHumanActivityAccess().getActionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__Group__2__Impl


    // $ANTLR start rule__Action__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2292:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2296:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2297:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04788);
            rule__Action__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04791);
            rule__Action__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__0


    // $ANTLR start rule__Action__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2304:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2308:1: ( ( 'action' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2309:1: ( 'action' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2309:1: ( 'action' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2310:1: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Action__Group__0__Impl4819); 
             after(grammarAccess.getActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__0__Impl


    // $ANTLR start rule__Action__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2323:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2327:1: ( rule__Action__Group__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2328:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14850);
            rule__Action__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__1


    // $ANTLR start rule__Action__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2334:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2338:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2339:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2339:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2340:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2341:1: ( rule__Action__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2341:2: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl4877);
            rule__Action__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__1__Impl


    // $ANTLR start rule__Resource__Group_0__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2355:1: rule__Resource__Group_0__0 : rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1 ;
    public final void rule__Resource__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2359:1: ( rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2360:2: rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1
            {
            pushFollow(FOLLOW_rule__Resource__Group_0__0__Impl_in_rule__Resource__Group_0__04911);
            rule__Resource__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group_0__1_in_rule__Resource__Group_0__04914);
            rule__Resource__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_0__0


    // $ANTLR start rule__Resource__Group_0__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2367:1: rule__Resource__Group_0__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2371:1: ( ( 'resource' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2372:1: ( 'resource' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2372:1: ( 'resource' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2373:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0_0()); 
            match(input,39,FOLLOW_39_in_rule__Resource__Group_0__0__Impl4942); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_0__0__Impl


    // $ANTLR start rule__Resource__Group_0__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2386:1: rule__Resource__Group_0__1 : rule__Resource__Group_0__1__Impl ;
    public final void rule__Resource__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2390:1: ( rule__Resource__Group_0__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2391:2: rule__Resource__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group_0__1__Impl_in_rule__Resource__Group_0__14973);
            rule__Resource__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_0__1


    // $ANTLR start rule__Resource__Group_0__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2397:1: rule__Resource__Group_0__1__Impl : ( ( rule__Resource__NameAssignment_0_1 ) ) ;
    public final void rule__Resource__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2401:1: ( ( ( rule__Resource__NameAssignment_0_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2402:1: ( ( rule__Resource__NameAssignment_0_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2402:1: ( ( rule__Resource__NameAssignment_0_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2403:1: ( rule__Resource__NameAssignment_0_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_0_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2404:1: ( rule__Resource__NameAssignment_0_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2404:2: rule__Resource__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_0_1_in_rule__Resource__Group_0__1__Impl5000);
            rule__Resource__NameAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_0__1__Impl


    // $ANTLR start rule__Asset__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2418:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2422:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2423:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__05034);
            rule__Asset__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__05037);
            rule__Asset__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group__0


    // $ANTLR start rule__Asset__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2430:1: rule__Asset__Group__0__Impl : ( 'asset' ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2434:1: ( ( 'asset' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2435:1: ( 'asset' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2435:1: ( 'asset' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2436:1: 'asset'
            {
             before(grammarAccess.getAssetAccess().getAssetKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Asset__Group__0__Impl5065); 
             after(grammarAccess.getAssetAccess().getAssetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group__0__Impl


    // $ANTLR start rule__Asset__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2449:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2453:1: ( rule__Asset__Group__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2454:2: rule__Asset__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__15096);
            rule__Asset__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group__1


    // $ANTLR start rule__Asset__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2460:1: rule__Asset__Group__1__Impl : ( ( rule__Asset__NameAssignment_1 ) ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2464:1: ( ( ( rule__Asset__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2465:1: ( ( rule__Asset__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2465:1: ( ( rule__Asset__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2466:1: ( rule__Asset__NameAssignment_1 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2467:1: ( rule__Asset__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2467:2: rule__Asset__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl5123);
            rule__Asset__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAssetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group__1__Impl


    // $ANTLR start rule__Wants__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2481:1: rule__Wants__Group__0 : rule__Wants__Group__0__Impl rule__Wants__Group__1 ;
    public final void rule__Wants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2485:1: ( rule__Wants__Group__0__Impl rule__Wants__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2486:2: rule__Wants__Group__0__Impl rule__Wants__Group__1
            {
            pushFollow(FOLLOW_rule__Wants__Group__0__Impl_in_rule__Wants__Group__05157);
            rule__Wants__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__1_in_rule__Wants__Group__05160);
            rule__Wants__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__0


    // $ANTLR start rule__Wants__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2493:1: rule__Wants__Group__0__Impl : ( 'wants' ) ;
    public final void rule__Wants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2497:1: ( ( 'wants' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2498:1: ( 'wants' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2498:1: ( 'wants' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2499:1: 'wants'
            {
             before(grammarAccess.getWantsAccess().getWantsKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Wants__Group__0__Impl5188); 
             after(grammarAccess.getWantsAccess().getWantsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__0__Impl


    // $ANTLR start rule__Wants__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2512:1: rule__Wants__Group__1 : rule__Wants__Group__1__Impl rule__Wants__Group__2 ;
    public final void rule__Wants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2516:1: ( rule__Wants__Group__1__Impl rule__Wants__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2517:2: rule__Wants__Group__1__Impl rule__Wants__Group__2
            {
            pushFollow(FOLLOW_rule__Wants__Group__1__Impl_in_rule__Wants__Group__15219);
            rule__Wants__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__2_in_rule__Wants__Group__15222);
            rule__Wants__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__1


    // $ANTLR start rule__Wants__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2524:1: rule__Wants__Group__1__Impl : ( ( rule__Wants__NameAssignment_1 ) ) ;
    public final void rule__Wants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2528:1: ( ( ( rule__Wants__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2529:1: ( ( rule__Wants__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2529:1: ( ( rule__Wants__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2530:1: ( rule__Wants__NameAssignment_1 )
            {
             before(grammarAccess.getWantsAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2531:1: ( rule__Wants__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2531:2: rule__Wants__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Wants__NameAssignment_1_in_rule__Wants__Group__1__Impl5249);
            rule__Wants__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getWantsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__1__Impl


    // $ANTLR start rule__Wants__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2541:1: rule__Wants__Group__2 : rule__Wants__Group__2__Impl rule__Wants__Group__3 ;
    public final void rule__Wants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2545:1: ( rule__Wants__Group__2__Impl rule__Wants__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2546:2: rule__Wants__Group__2__Impl rule__Wants__Group__3
            {
            pushFollow(FOLLOW_rule__Wants__Group__2__Impl_in_rule__Wants__Group__25279);
            rule__Wants__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__3_in_rule__Wants__Group__25282);
            rule__Wants__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__2


    // $ANTLR start rule__Wants__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2553:1: rule__Wants__Group__2__Impl : ( '(' ) ;
    public final void rule__Wants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2557:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2558:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2558:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2559:1: '('
            {
             before(grammarAccess.getWantsAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Wants__Group__2__Impl5310); 
             after(grammarAccess.getWantsAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__2__Impl


    // $ANTLR start rule__Wants__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2572:1: rule__Wants__Group__3 : rule__Wants__Group__3__Impl rule__Wants__Group__4 ;
    public final void rule__Wants__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2576:1: ( rule__Wants__Group__3__Impl rule__Wants__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2577:2: rule__Wants__Group__3__Impl rule__Wants__Group__4
            {
            pushFollow(FOLLOW_rule__Wants__Group__3__Impl_in_rule__Wants__Group__35341);
            rule__Wants__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__4_in_rule__Wants__Group__35344);
            rule__Wants__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__3


    // $ANTLR start rule__Wants__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2584:1: rule__Wants__Group__3__Impl : ( ( rule__Wants__ThingsAssignment_3 ) ) ;
    public final void rule__Wants__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2588:1: ( ( ( rule__Wants__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2589:1: ( ( rule__Wants__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2589:1: ( ( rule__Wants__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2590:1: ( rule__Wants__ThingsAssignment_3 )
            {
             before(grammarAccess.getWantsAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2591:1: ( rule__Wants__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2591:2: rule__Wants__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Wants__ThingsAssignment_3_in_rule__Wants__Group__3__Impl5371);
            rule__Wants__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getWantsAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__3__Impl


    // $ANTLR start rule__Wants__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2601:1: rule__Wants__Group__4 : rule__Wants__Group__4__Impl rule__Wants__Group__5 ;
    public final void rule__Wants__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2605:1: ( rule__Wants__Group__4__Impl rule__Wants__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2606:2: rule__Wants__Group__4__Impl rule__Wants__Group__5
            {
            pushFollow(FOLLOW_rule__Wants__Group__4__Impl_in_rule__Wants__Group__45401);
            rule__Wants__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__5_in_rule__Wants__Group__45404);
            rule__Wants__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__4


    // $ANTLR start rule__Wants__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2613:1: rule__Wants__Group__4__Impl : ( ',' ) ;
    public final void rule__Wants__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2617:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2618:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2618:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2619:1: ','
            {
             before(grammarAccess.getWantsAccess().getCommaKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__Wants__Group__4__Impl5432); 
             after(grammarAccess.getWantsAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__4__Impl


    // $ANTLR start rule__Wants__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2632:1: rule__Wants__Group__5 : rule__Wants__Group__5__Impl rule__Wants__Group__6 ;
    public final void rule__Wants__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2636:1: ( rule__Wants__Group__5__Impl rule__Wants__Group__6 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2637:2: rule__Wants__Group__5__Impl rule__Wants__Group__6
            {
            pushFollow(FOLLOW_rule__Wants__Group__5__Impl_in_rule__Wants__Group__55463);
            rule__Wants__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__6_in_rule__Wants__Group__55466);
            rule__Wants__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__5


    // $ANTLR start rule__Wants__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2644:1: rule__Wants__Group__5__Impl : ( ( rule__Wants__ThingsAssignment_5 ) ) ;
    public final void rule__Wants__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2648:1: ( ( ( rule__Wants__ThingsAssignment_5 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2649:1: ( ( rule__Wants__ThingsAssignment_5 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2649:1: ( ( rule__Wants__ThingsAssignment_5 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2650:1: ( rule__Wants__ThingsAssignment_5 )
            {
             before(grammarAccess.getWantsAccess().getThingsAssignment_5()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2651:1: ( rule__Wants__ThingsAssignment_5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2651:2: rule__Wants__ThingsAssignment_5
            {
            pushFollow(FOLLOW_rule__Wants__ThingsAssignment_5_in_rule__Wants__Group__5__Impl5493);
            rule__Wants__ThingsAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getWantsAccess().getThingsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__5__Impl


    // $ANTLR start rule__Wants__Group__6
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2661:1: rule__Wants__Group__6 : rule__Wants__Group__6__Impl ;
    public final void rule__Wants__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2665:1: ( rule__Wants__Group__6__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2666:2: rule__Wants__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Wants__Group__6__Impl_in_rule__Wants__Group__65523);
            rule__Wants__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__6


    // $ANTLR start rule__Wants__Group__6__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2672:1: rule__Wants__Group__6__Impl : ( ')' ) ;
    public final void rule__Wants__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2676:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2677:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2677:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2678:1: ')'
            {
             before(grammarAccess.getWantsAccess().getRightParenthesisKeyword_6()); 
            match(input,43,FOLLOW_43_in_rule__Wants__Group__6__Impl5551); 
             after(grammarAccess.getWantsAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__Group__6__Impl


    // $ANTLR start rule__Does__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2705:1: rule__Does__Group__0 : rule__Does__Group__0__Impl rule__Does__Group__1 ;
    public final void rule__Does__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2709:1: ( rule__Does__Group__0__Impl rule__Does__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2710:2: rule__Does__Group__0__Impl rule__Does__Group__1
            {
            pushFollow(FOLLOW_rule__Does__Group__0__Impl_in_rule__Does__Group__05596);
            rule__Does__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__1_in_rule__Does__Group__05599);
            rule__Does__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__0


    // $ANTLR start rule__Does__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2717:1: rule__Does__Group__0__Impl : ( 'does' ) ;
    public final void rule__Does__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2721:1: ( ( 'does' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2722:1: ( 'does' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2722:1: ( 'does' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2723:1: 'does'
            {
             before(grammarAccess.getDoesAccess().getDoesKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Does__Group__0__Impl5627); 
             after(grammarAccess.getDoesAccess().getDoesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__0__Impl


    // $ANTLR start rule__Does__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2736:1: rule__Does__Group__1 : rule__Does__Group__1__Impl rule__Does__Group__2 ;
    public final void rule__Does__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2740:1: ( rule__Does__Group__1__Impl rule__Does__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2741:2: rule__Does__Group__1__Impl rule__Does__Group__2
            {
            pushFollow(FOLLOW_rule__Does__Group__1__Impl_in_rule__Does__Group__15658);
            rule__Does__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__2_in_rule__Does__Group__15661);
            rule__Does__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__1


    // $ANTLR start rule__Does__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2748:1: rule__Does__Group__1__Impl : ( ( rule__Does__NameAssignment_1 ) ) ;
    public final void rule__Does__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2752:1: ( ( ( rule__Does__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2753:1: ( ( rule__Does__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2753:1: ( ( rule__Does__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2754:1: ( rule__Does__NameAssignment_1 )
            {
             before(grammarAccess.getDoesAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2755:1: ( rule__Does__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2755:2: rule__Does__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Does__NameAssignment_1_in_rule__Does__Group__1__Impl5688);
            rule__Does__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDoesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__1__Impl


    // $ANTLR start rule__Does__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2765:1: rule__Does__Group__2 : rule__Does__Group__2__Impl rule__Does__Group__3 ;
    public final void rule__Does__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2769:1: ( rule__Does__Group__2__Impl rule__Does__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2770:2: rule__Does__Group__2__Impl rule__Does__Group__3
            {
            pushFollow(FOLLOW_rule__Does__Group__2__Impl_in_rule__Does__Group__25718);
            rule__Does__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__3_in_rule__Does__Group__25721);
            rule__Does__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__2


    // $ANTLR start rule__Does__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2777:1: rule__Does__Group__2__Impl : ( '(' ) ;
    public final void rule__Does__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2781:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2782:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2782:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2783:1: '('
            {
             before(grammarAccess.getDoesAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Does__Group__2__Impl5749); 
             after(grammarAccess.getDoesAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__2__Impl


    // $ANTLR start rule__Does__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2796:1: rule__Does__Group__3 : rule__Does__Group__3__Impl rule__Does__Group__4 ;
    public final void rule__Does__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2800:1: ( rule__Does__Group__3__Impl rule__Does__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2801:2: rule__Does__Group__3__Impl rule__Does__Group__4
            {
            pushFollow(FOLLOW_rule__Does__Group__3__Impl_in_rule__Does__Group__35780);
            rule__Does__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__4_in_rule__Does__Group__35783);
            rule__Does__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__3


    // $ANTLR start rule__Does__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2808:1: rule__Does__Group__3__Impl : ( ( rule__Does__ThingsAssignment_3 ) ) ;
    public final void rule__Does__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2812:1: ( ( ( rule__Does__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2813:1: ( ( rule__Does__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2813:1: ( ( rule__Does__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2814:1: ( rule__Does__ThingsAssignment_3 )
            {
             before(grammarAccess.getDoesAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2815:1: ( rule__Does__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2815:2: rule__Does__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Does__ThingsAssignment_3_in_rule__Does__Group__3__Impl5810);
            rule__Does__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDoesAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__3__Impl


    // $ANTLR start rule__Does__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2825:1: rule__Does__Group__4 : rule__Does__Group__4__Impl rule__Does__Group__5 ;
    public final void rule__Does__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2829:1: ( rule__Does__Group__4__Impl rule__Does__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2830:2: rule__Does__Group__4__Impl rule__Does__Group__5
            {
            pushFollow(FOLLOW_rule__Does__Group__4__Impl_in_rule__Does__Group__45840);
            rule__Does__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__5_in_rule__Does__Group__45843);
            rule__Does__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__4


    // $ANTLR start rule__Does__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2837:1: rule__Does__Group__4__Impl : ( ',' ) ;
    public final void rule__Does__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2841:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2842:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2842:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2843:1: ','
            {
             before(grammarAccess.getDoesAccess().getCommaKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__Does__Group__4__Impl5871); 
             after(grammarAccess.getDoesAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__4__Impl


    // $ANTLR start rule__Does__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2856:1: rule__Does__Group__5 : rule__Does__Group__5__Impl rule__Does__Group__6 ;
    public final void rule__Does__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2860:1: ( rule__Does__Group__5__Impl rule__Does__Group__6 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2861:2: rule__Does__Group__5__Impl rule__Does__Group__6
            {
            pushFollow(FOLLOW_rule__Does__Group__5__Impl_in_rule__Does__Group__55902);
            rule__Does__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__6_in_rule__Does__Group__55905);
            rule__Does__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__5


    // $ANTLR start rule__Does__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2868:1: rule__Does__Group__5__Impl : ( ( rule__Does__ThingsAssignment_5 ) ) ;
    public final void rule__Does__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2872:1: ( ( ( rule__Does__ThingsAssignment_5 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2873:1: ( ( rule__Does__ThingsAssignment_5 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2873:1: ( ( rule__Does__ThingsAssignment_5 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2874:1: ( rule__Does__ThingsAssignment_5 )
            {
             before(grammarAccess.getDoesAccess().getThingsAssignment_5()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2875:1: ( rule__Does__ThingsAssignment_5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2875:2: rule__Does__ThingsAssignment_5
            {
            pushFollow(FOLLOW_rule__Does__ThingsAssignment_5_in_rule__Does__Group__5__Impl5932);
            rule__Does__ThingsAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getDoesAccess().getThingsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__5__Impl


    // $ANTLR start rule__Does__Group__6
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2885:1: rule__Does__Group__6 : rule__Does__Group__6__Impl ;
    public final void rule__Does__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2889:1: ( rule__Does__Group__6__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2890:2: rule__Does__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Does__Group__6__Impl_in_rule__Does__Group__65962);
            rule__Does__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__6


    // $ANTLR start rule__Does__Group__6__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2896:1: rule__Does__Group__6__Impl : ( ')' ) ;
    public final void rule__Does__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2900:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2901:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2901:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2902:1: ')'
            {
             before(grammarAccess.getDoesAccess().getRightParenthesisKeyword_6()); 
            match(input,43,FOLLOW_43_in_rule__Does__Group__6__Impl5990); 
             after(grammarAccess.getDoesAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__Group__6__Impl


    // $ANTLR start rule__Decomposes__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2929:1: rule__Decomposes__Group__0 : rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1 ;
    public final void rule__Decomposes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2933:1: ( rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2934:2: rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__0__Impl_in_rule__Decomposes__Group__06035);
            rule__Decomposes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__1_in_rule__Decomposes__Group__06038);
            rule__Decomposes__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__0


    // $ANTLR start rule__Decomposes__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2941:1: rule__Decomposes__Group__0__Impl : ( ( rule__Decomposes__TypeAssignment_0 ) ) ;
    public final void rule__Decomposes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2945:1: ( ( ( rule__Decomposes__TypeAssignment_0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2946:1: ( ( rule__Decomposes__TypeAssignment_0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2946:1: ( ( rule__Decomposes__TypeAssignment_0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2947:1: ( rule__Decomposes__TypeAssignment_0 )
            {
             before(grammarAccess.getDecomposesAccess().getTypeAssignment_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2948:1: ( rule__Decomposes__TypeAssignment_0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2948:2: rule__Decomposes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Decomposes__TypeAssignment_0_in_rule__Decomposes__Group__0__Impl6065);
            rule__Decomposes__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDecomposesAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__0__Impl


    // $ANTLR start rule__Decomposes__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2958:1: rule__Decomposes__Group__1 : rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2 ;
    public final void rule__Decomposes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2962:1: ( rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2963:2: rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__1__Impl_in_rule__Decomposes__Group__16095);
            rule__Decomposes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__2_in_rule__Decomposes__Group__16098);
            rule__Decomposes__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__1


    // $ANTLR start rule__Decomposes__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2970:1: rule__Decomposes__Group__1__Impl : ( ( rule__Decomposes__NameAssignment_1 ) ) ;
    public final void rule__Decomposes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2974:1: ( ( ( rule__Decomposes__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2975:1: ( ( rule__Decomposes__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2975:1: ( ( rule__Decomposes__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2976:1: ( rule__Decomposes__NameAssignment_1 )
            {
             before(grammarAccess.getDecomposesAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2977:1: ( rule__Decomposes__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2977:2: rule__Decomposes__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Decomposes__NameAssignment_1_in_rule__Decomposes__Group__1__Impl6125);
            rule__Decomposes__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDecomposesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__1__Impl


    // $ANTLR start rule__Decomposes__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2987:1: rule__Decomposes__Group__2 : rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3 ;
    public final void rule__Decomposes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2991:1: ( rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2992:2: rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__2__Impl_in_rule__Decomposes__Group__26155);
            rule__Decomposes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__3_in_rule__Decomposes__Group__26158);
            rule__Decomposes__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__2


    // $ANTLR start rule__Decomposes__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:2999:1: rule__Decomposes__Group__2__Impl : ( '(' ) ;
    public final void rule__Decomposes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3003:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3004:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3004:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3005:1: '('
            {
             before(grammarAccess.getDecomposesAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Decomposes__Group__2__Impl6186); 
             after(grammarAccess.getDecomposesAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__2__Impl


    // $ANTLR start rule__Decomposes__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3018:1: rule__Decomposes__Group__3 : rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4 ;
    public final void rule__Decomposes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3022:1: ( rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3023:2: rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__3__Impl_in_rule__Decomposes__Group__36217);
            rule__Decomposes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__4_in_rule__Decomposes__Group__36220);
            rule__Decomposes__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__3


    // $ANTLR start rule__Decomposes__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3030:1: rule__Decomposes__Group__3__Impl : ( ( rule__Decomposes__ThingsAssignment_3 ) ) ;
    public final void rule__Decomposes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3034:1: ( ( ( rule__Decomposes__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3035:1: ( ( rule__Decomposes__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3035:1: ( ( rule__Decomposes__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3036:1: ( rule__Decomposes__ThingsAssignment_3 )
            {
             before(grammarAccess.getDecomposesAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3037:1: ( rule__Decomposes__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3037:2: rule__Decomposes__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Decomposes__ThingsAssignment_3_in_rule__Decomposes__Group__3__Impl6247);
            rule__Decomposes__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDecomposesAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__3__Impl


    // $ANTLR start rule__Decomposes__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3047:1: rule__Decomposes__Group__4 : rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5 ;
    public final void rule__Decomposes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3051:1: ( rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3052:2: rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__4__Impl_in_rule__Decomposes__Group__46277);
            rule__Decomposes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__5_in_rule__Decomposes__Group__46280);
            rule__Decomposes__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__4


    // $ANTLR start rule__Decomposes__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3059:1: rule__Decomposes__Group__4__Impl : ( ( ( rule__Decomposes__Group_4__0 ) ) ( ( rule__Decomposes__Group_4__0 )* ) ) ;
    public final void rule__Decomposes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3063:1: ( ( ( ( rule__Decomposes__Group_4__0 ) ) ( ( rule__Decomposes__Group_4__0 )* ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3064:1: ( ( ( rule__Decomposes__Group_4__0 ) ) ( ( rule__Decomposes__Group_4__0 )* ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3064:1: ( ( ( rule__Decomposes__Group_4__0 ) ) ( ( rule__Decomposes__Group_4__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3065:1: ( ( rule__Decomposes__Group_4__0 ) ) ( ( rule__Decomposes__Group_4__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3065:1: ( ( rule__Decomposes__Group_4__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3066:1: ( rule__Decomposes__Group_4__0 )
            {
             before(grammarAccess.getDecomposesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3067:1: ( rule__Decomposes__Group_4__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3067:2: rule__Decomposes__Group_4__0
            {
            pushFollow(FOLLOW_rule__Decomposes__Group_4__0_in_rule__Decomposes__Group__4__Impl6309);
            rule__Decomposes__Group_4__0();
            _fsp--;


            }

             after(grammarAccess.getDecomposesAccess().getGroup_4()); 

            }

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3070:1: ( ( rule__Decomposes__Group_4__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3071:1: ( rule__Decomposes__Group_4__0 )*
            {
             before(grammarAccess.getDecomposesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3072:1: ( rule__Decomposes__Group_4__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3072:2: rule__Decomposes__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Decomposes__Group_4__0_in_rule__Decomposes__Group__4__Impl6321);
            	    rule__Decomposes__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getDecomposesAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__4__Impl


    // $ANTLR start rule__Decomposes__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3083:1: rule__Decomposes__Group__5 : rule__Decomposes__Group__5__Impl ;
    public final void rule__Decomposes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3087:1: ( rule__Decomposes__Group__5__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3088:2: rule__Decomposes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__5__Impl_in_rule__Decomposes__Group__56354);
            rule__Decomposes__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__5


    // $ANTLR start rule__Decomposes__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3094:1: rule__Decomposes__Group__5__Impl : ( ')' ) ;
    public final void rule__Decomposes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3098:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3099:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3099:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3100:1: ')'
            {
             before(grammarAccess.getDecomposesAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Decomposes__Group__5__Impl6382); 
             after(grammarAccess.getDecomposesAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group__5__Impl


    // $ANTLR start rule__Decomposes__Group_4__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3125:1: rule__Decomposes__Group_4__0 : rule__Decomposes__Group_4__0__Impl rule__Decomposes__Group_4__1 ;
    public final void rule__Decomposes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3129:1: ( rule__Decomposes__Group_4__0__Impl rule__Decomposes__Group_4__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3130:2: rule__Decomposes__Group_4__0__Impl rule__Decomposes__Group_4__1
            {
            pushFollow(FOLLOW_rule__Decomposes__Group_4__0__Impl_in_rule__Decomposes__Group_4__06425);
            rule__Decomposes__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group_4__1_in_rule__Decomposes__Group_4__06428);
            rule__Decomposes__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group_4__0


    // $ANTLR start rule__Decomposes__Group_4__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3137:1: rule__Decomposes__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Decomposes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3141:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3142:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3142:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3143:1: ','
            {
             before(grammarAccess.getDecomposesAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Decomposes__Group_4__0__Impl6456); 
             after(grammarAccess.getDecomposesAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group_4__0__Impl


    // $ANTLR start rule__Decomposes__Group_4__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3156:1: rule__Decomposes__Group_4__1 : rule__Decomposes__Group_4__1__Impl ;
    public final void rule__Decomposes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3160:1: ( rule__Decomposes__Group_4__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3161:2: rule__Decomposes__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Decomposes__Group_4__1__Impl_in_rule__Decomposes__Group_4__16487);
            rule__Decomposes__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group_4__1


    // $ANTLR start rule__Decomposes__Group_4__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3167:1: rule__Decomposes__Group_4__1__Impl : ( ( rule__Decomposes__ThingsAssignment_4_1 ) ) ;
    public final void rule__Decomposes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3171:1: ( ( ( rule__Decomposes__ThingsAssignment_4_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3172:1: ( ( rule__Decomposes__ThingsAssignment_4_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3172:1: ( ( rule__Decomposes__ThingsAssignment_4_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3173:1: ( rule__Decomposes__ThingsAssignment_4_1 )
            {
             before(grammarAccess.getDecomposesAccess().getThingsAssignment_4_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3174:1: ( rule__Decomposes__ThingsAssignment_4_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3174:2: rule__Decomposes__ThingsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Decomposes__ThingsAssignment_4_1_in_rule__Decomposes__Group_4__1__Impl6514);
            rule__Decomposes__ThingsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getDecomposesAccess().getThingsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__Group_4__1__Impl


    // $ANTLR start rule__Contributes__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3188:1: rule__Contributes__Group__0 : rule__Contributes__Group__0__Impl rule__Contributes__Group__1 ;
    public final void rule__Contributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3192:1: ( rule__Contributes__Group__0__Impl rule__Contributes__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3193:2: rule__Contributes__Group__0__Impl rule__Contributes__Group__1
            {
            pushFollow(FOLLOW_rule__Contributes__Group__0__Impl_in_rule__Contributes__Group__06548);
            rule__Contributes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__1_in_rule__Contributes__Group__06551);
            rule__Contributes__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__0


    // $ANTLR start rule__Contributes__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3200:1: rule__Contributes__Group__0__Impl : ( ( rule__Contributes__TypeAssignment_0 ) ) ;
    public final void rule__Contributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3204:1: ( ( ( rule__Contributes__TypeAssignment_0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3205:1: ( ( rule__Contributes__TypeAssignment_0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3205:1: ( ( rule__Contributes__TypeAssignment_0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3206:1: ( rule__Contributes__TypeAssignment_0 )
            {
             before(grammarAccess.getContributesAccess().getTypeAssignment_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3207:1: ( rule__Contributes__TypeAssignment_0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3207:2: rule__Contributes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Contributes__TypeAssignment_0_in_rule__Contributes__Group__0__Impl6578);
            rule__Contributes__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getContributesAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__0__Impl


    // $ANTLR start rule__Contributes__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3217:1: rule__Contributes__Group__1 : rule__Contributes__Group__1__Impl rule__Contributes__Group__2 ;
    public final void rule__Contributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3221:1: ( rule__Contributes__Group__1__Impl rule__Contributes__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3222:2: rule__Contributes__Group__1__Impl rule__Contributes__Group__2
            {
            pushFollow(FOLLOW_rule__Contributes__Group__1__Impl_in_rule__Contributes__Group__16608);
            rule__Contributes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__2_in_rule__Contributes__Group__16611);
            rule__Contributes__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__1


    // $ANTLR start rule__Contributes__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3229:1: rule__Contributes__Group__1__Impl : ( ( rule__Contributes__NameAssignment_1 ) ) ;
    public final void rule__Contributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3233:1: ( ( ( rule__Contributes__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3234:1: ( ( rule__Contributes__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3234:1: ( ( rule__Contributes__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3235:1: ( rule__Contributes__NameAssignment_1 )
            {
             before(grammarAccess.getContributesAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3236:1: ( rule__Contributes__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3236:2: rule__Contributes__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Contributes__NameAssignment_1_in_rule__Contributes__Group__1__Impl6638);
            rule__Contributes__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getContributesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__1__Impl


    // $ANTLR start rule__Contributes__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3246:1: rule__Contributes__Group__2 : rule__Contributes__Group__2__Impl rule__Contributes__Group__3 ;
    public final void rule__Contributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3250:1: ( rule__Contributes__Group__2__Impl rule__Contributes__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3251:2: rule__Contributes__Group__2__Impl rule__Contributes__Group__3
            {
            pushFollow(FOLLOW_rule__Contributes__Group__2__Impl_in_rule__Contributes__Group__26668);
            rule__Contributes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__3_in_rule__Contributes__Group__26671);
            rule__Contributes__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__2


    // $ANTLR start rule__Contributes__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3258:1: rule__Contributes__Group__2__Impl : ( '(' ) ;
    public final void rule__Contributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3262:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3263:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3263:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3264:1: '('
            {
             before(grammarAccess.getContributesAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Contributes__Group__2__Impl6699); 
             after(grammarAccess.getContributesAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__2__Impl


    // $ANTLR start rule__Contributes__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3277:1: rule__Contributes__Group__3 : rule__Contributes__Group__3__Impl rule__Contributes__Group__4 ;
    public final void rule__Contributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3281:1: ( rule__Contributes__Group__3__Impl rule__Contributes__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3282:2: rule__Contributes__Group__3__Impl rule__Contributes__Group__4
            {
            pushFollow(FOLLOW_rule__Contributes__Group__3__Impl_in_rule__Contributes__Group__36730);
            rule__Contributes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__4_in_rule__Contributes__Group__36733);
            rule__Contributes__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__3


    // $ANTLR start rule__Contributes__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3289:1: rule__Contributes__Group__3__Impl : ( ( rule__Contributes__ThingsAssignment_3 ) ) ;
    public final void rule__Contributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3293:1: ( ( ( rule__Contributes__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3294:1: ( ( rule__Contributes__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3294:1: ( ( rule__Contributes__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3295:1: ( rule__Contributes__ThingsAssignment_3 )
            {
             before(grammarAccess.getContributesAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3296:1: ( rule__Contributes__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3296:2: rule__Contributes__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Contributes__ThingsAssignment_3_in_rule__Contributes__Group__3__Impl6760);
            rule__Contributes__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getContributesAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__3__Impl


    // $ANTLR start rule__Contributes__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3306:1: rule__Contributes__Group__4 : rule__Contributes__Group__4__Impl rule__Contributes__Group__5 ;
    public final void rule__Contributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3310:1: ( rule__Contributes__Group__4__Impl rule__Contributes__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3311:2: rule__Contributes__Group__4__Impl rule__Contributes__Group__5
            {
            pushFollow(FOLLOW_rule__Contributes__Group__4__Impl_in_rule__Contributes__Group__46790);
            rule__Contributes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__5_in_rule__Contributes__Group__46793);
            rule__Contributes__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__4


    // $ANTLR start rule__Contributes__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3318:1: rule__Contributes__Group__4__Impl : ( ( ( rule__Contributes__Group_4__0 ) ) ( ( rule__Contributes__Group_4__0 )* ) ) ;
    public final void rule__Contributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3322:1: ( ( ( ( rule__Contributes__Group_4__0 ) ) ( ( rule__Contributes__Group_4__0 )* ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3323:1: ( ( ( rule__Contributes__Group_4__0 ) ) ( ( rule__Contributes__Group_4__0 )* ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3323:1: ( ( ( rule__Contributes__Group_4__0 ) ) ( ( rule__Contributes__Group_4__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3324:1: ( ( rule__Contributes__Group_4__0 ) ) ( ( rule__Contributes__Group_4__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3324:1: ( ( rule__Contributes__Group_4__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3325:1: ( rule__Contributes__Group_4__0 )
            {
             before(grammarAccess.getContributesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3326:1: ( rule__Contributes__Group_4__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3326:2: rule__Contributes__Group_4__0
            {
            pushFollow(FOLLOW_rule__Contributes__Group_4__0_in_rule__Contributes__Group__4__Impl6822);
            rule__Contributes__Group_4__0();
            _fsp--;


            }

             after(grammarAccess.getContributesAccess().getGroup_4()); 

            }

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3329:1: ( ( rule__Contributes__Group_4__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3330:1: ( rule__Contributes__Group_4__0 )*
            {
             before(grammarAccess.getContributesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3331:1: ( rule__Contributes__Group_4__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3331:2: rule__Contributes__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Contributes__Group_4__0_in_rule__Contributes__Group__4__Impl6834);
            	    rule__Contributes__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getContributesAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__4__Impl


    // $ANTLR start rule__Contributes__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3342:1: rule__Contributes__Group__5 : rule__Contributes__Group__5__Impl ;
    public final void rule__Contributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3346:1: ( rule__Contributes__Group__5__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3347:2: rule__Contributes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Contributes__Group__5__Impl_in_rule__Contributes__Group__56867);
            rule__Contributes__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__5


    // $ANTLR start rule__Contributes__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3353:1: rule__Contributes__Group__5__Impl : ( ')' ) ;
    public final void rule__Contributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3357:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3358:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3358:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3359:1: ')'
            {
             before(grammarAccess.getContributesAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Contributes__Group__5__Impl6895); 
             after(grammarAccess.getContributesAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group__5__Impl


    // $ANTLR start rule__Contributes__Group_4__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3384:1: rule__Contributes__Group_4__0 : rule__Contributes__Group_4__0__Impl rule__Contributes__Group_4__1 ;
    public final void rule__Contributes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3388:1: ( rule__Contributes__Group_4__0__Impl rule__Contributes__Group_4__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3389:2: rule__Contributes__Group_4__0__Impl rule__Contributes__Group_4__1
            {
            pushFollow(FOLLOW_rule__Contributes__Group_4__0__Impl_in_rule__Contributes__Group_4__06938);
            rule__Contributes__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group_4__1_in_rule__Contributes__Group_4__06941);
            rule__Contributes__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group_4__0


    // $ANTLR start rule__Contributes__Group_4__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3396:1: rule__Contributes__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Contributes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3400:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3401:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3401:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3402:1: ','
            {
             before(grammarAccess.getContributesAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Contributes__Group_4__0__Impl6969); 
             after(grammarAccess.getContributesAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group_4__0__Impl


    // $ANTLR start rule__Contributes__Group_4__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3415:1: rule__Contributes__Group_4__1 : rule__Contributes__Group_4__1__Impl ;
    public final void rule__Contributes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3419:1: ( rule__Contributes__Group_4__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3420:2: rule__Contributes__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Contributes__Group_4__1__Impl_in_rule__Contributes__Group_4__17000);
            rule__Contributes__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group_4__1


    // $ANTLR start rule__Contributes__Group_4__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3426:1: rule__Contributes__Group_4__1__Impl : ( ( rule__Contributes__ThingsAssignment_4_1 ) ) ;
    public final void rule__Contributes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3430:1: ( ( ( rule__Contributes__ThingsAssignment_4_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3431:1: ( ( rule__Contributes__ThingsAssignment_4_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3431:1: ( ( rule__Contributes__ThingsAssignment_4_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3432:1: ( rule__Contributes__ThingsAssignment_4_1 )
            {
             before(grammarAccess.getContributesAccess().getThingsAssignment_4_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3433:1: ( rule__Contributes__ThingsAssignment_4_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3433:2: rule__Contributes__ThingsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Contributes__ThingsAssignment_4_1_in_rule__Contributes__Group_4__1__Impl7027);
            rule__Contributes__ThingsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getContributesAccess().getThingsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__Group_4__1__Impl


    // $ANTLR start rule__Fulfils__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3447:1: rule__Fulfils__Group__0 : rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1 ;
    public final void rule__Fulfils__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3451:1: ( rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3452:2: rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__0__Impl_in_rule__Fulfils__Group__07061);
            rule__Fulfils__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__1_in_rule__Fulfils__Group__07064);
            rule__Fulfils__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__0


    // $ANTLR start rule__Fulfils__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3459:1: rule__Fulfils__Group__0__Impl : ( 'fulfils' ) ;
    public final void rule__Fulfils__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3463:1: ( ( 'fulfils' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3464:1: ( 'fulfils' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3464:1: ( 'fulfils' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3465:1: 'fulfils'
            {
             before(grammarAccess.getFulfilsAccess().getFulfilsKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__Fulfils__Group__0__Impl7092); 
             after(grammarAccess.getFulfilsAccess().getFulfilsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__0__Impl


    // $ANTLR start rule__Fulfils__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3478:1: rule__Fulfils__Group__1 : rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2 ;
    public final void rule__Fulfils__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3482:1: ( rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3483:2: rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__1__Impl_in_rule__Fulfils__Group__17123);
            rule__Fulfils__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__2_in_rule__Fulfils__Group__17126);
            rule__Fulfils__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__1


    // $ANTLR start rule__Fulfils__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3490:1: rule__Fulfils__Group__1__Impl : ( ( rule__Fulfils__NameAssignment_1 ) ) ;
    public final void rule__Fulfils__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3494:1: ( ( ( rule__Fulfils__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3495:1: ( ( rule__Fulfils__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3495:1: ( ( rule__Fulfils__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3496:1: ( rule__Fulfils__NameAssignment_1 )
            {
             before(grammarAccess.getFulfilsAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3497:1: ( rule__Fulfils__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3497:2: rule__Fulfils__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Fulfils__NameAssignment_1_in_rule__Fulfils__Group__1__Impl7153);
            rule__Fulfils__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFulfilsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__1__Impl


    // $ANTLR start rule__Fulfils__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3507:1: rule__Fulfils__Group__2 : rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3 ;
    public final void rule__Fulfils__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3511:1: ( rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3512:2: rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__2__Impl_in_rule__Fulfils__Group__27183);
            rule__Fulfils__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__3_in_rule__Fulfils__Group__27186);
            rule__Fulfils__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__2


    // $ANTLR start rule__Fulfils__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3519:1: rule__Fulfils__Group__2__Impl : ( '(' ) ;
    public final void rule__Fulfils__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3523:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3524:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3524:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3525:1: '('
            {
             before(grammarAccess.getFulfilsAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Fulfils__Group__2__Impl7214); 
             after(grammarAccess.getFulfilsAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__2__Impl


    // $ANTLR start rule__Fulfils__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3538:1: rule__Fulfils__Group__3 : rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4 ;
    public final void rule__Fulfils__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3542:1: ( rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3543:2: rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__3__Impl_in_rule__Fulfils__Group__37245);
            rule__Fulfils__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__4_in_rule__Fulfils__Group__37248);
            rule__Fulfils__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__3


    // $ANTLR start rule__Fulfils__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3550:1: rule__Fulfils__Group__3__Impl : ( ( rule__Fulfils__ThingsAssignment_3 ) ) ;
    public final void rule__Fulfils__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3554:1: ( ( ( rule__Fulfils__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3555:1: ( ( rule__Fulfils__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3555:1: ( ( rule__Fulfils__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3556:1: ( rule__Fulfils__ThingsAssignment_3 )
            {
             before(grammarAccess.getFulfilsAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3557:1: ( rule__Fulfils__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3557:2: rule__Fulfils__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Fulfils__ThingsAssignment_3_in_rule__Fulfils__Group__3__Impl7275);
            rule__Fulfils__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getFulfilsAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__3__Impl


    // $ANTLR start rule__Fulfils__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3567:1: rule__Fulfils__Group__4 : rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5 ;
    public final void rule__Fulfils__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3571:1: ( rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3572:2: rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__4__Impl_in_rule__Fulfils__Group__47305);
            rule__Fulfils__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__5_in_rule__Fulfils__Group__47308);
            rule__Fulfils__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__4


    // $ANTLR start rule__Fulfils__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3579:1: rule__Fulfils__Group__4__Impl : ( ( ( rule__Fulfils__Group_4__0 ) ) ( ( rule__Fulfils__Group_4__0 )* ) ) ;
    public final void rule__Fulfils__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3583:1: ( ( ( ( rule__Fulfils__Group_4__0 ) ) ( ( rule__Fulfils__Group_4__0 )* ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3584:1: ( ( ( rule__Fulfils__Group_4__0 ) ) ( ( rule__Fulfils__Group_4__0 )* ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3584:1: ( ( ( rule__Fulfils__Group_4__0 ) ) ( ( rule__Fulfils__Group_4__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3585:1: ( ( rule__Fulfils__Group_4__0 ) ) ( ( rule__Fulfils__Group_4__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3585:1: ( ( rule__Fulfils__Group_4__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3586:1: ( rule__Fulfils__Group_4__0 )
            {
             before(grammarAccess.getFulfilsAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3587:1: ( rule__Fulfils__Group_4__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3587:2: rule__Fulfils__Group_4__0
            {
            pushFollow(FOLLOW_rule__Fulfils__Group_4__0_in_rule__Fulfils__Group__4__Impl7337);
            rule__Fulfils__Group_4__0();
            _fsp--;


            }

             after(grammarAccess.getFulfilsAccess().getGroup_4()); 

            }

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3590:1: ( ( rule__Fulfils__Group_4__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3591:1: ( rule__Fulfils__Group_4__0 )*
            {
             before(grammarAccess.getFulfilsAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3592:1: ( rule__Fulfils__Group_4__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==31) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3592:2: rule__Fulfils__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Fulfils__Group_4__0_in_rule__Fulfils__Group__4__Impl7349);
            	    rule__Fulfils__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getFulfilsAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__4__Impl


    // $ANTLR start rule__Fulfils__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3603:1: rule__Fulfils__Group__5 : rule__Fulfils__Group__5__Impl ;
    public final void rule__Fulfils__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3607:1: ( rule__Fulfils__Group__5__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3608:2: rule__Fulfils__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__5__Impl_in_rule__Fulfils__Group__57382);
            rule__Fulfils__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__5


    // $ANTLR start rule__Fulfils__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3614:1: rule__Fulfils__Group__5__Impl : ( ')' ) ;
    public final void rule__Fulfils__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3618:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3619:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3619:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3620:1: ')'
            {
             before(grammarAccess.getFulfilsAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Fulfils__Group__5__Impl7410); 
             after(grammarAccess.getFulfilsAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group__5__Impl


    // $ANTLR start rule__Fulfils__Group_4__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3645:1: rule__Fulfils__Group_4__0 : rule__Fulfils__Group_4__0__Impl rule__Fulfils__Group_4__1 ;
    public final void rule__Fulfils__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3649:1: ( rule__Fulfils__Group_4__0__Impl rule__Fulfils__Group_4__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3650:2: rule__Fulfils__Group_4__0__Impl rule__Fulfils__Group_4__1
            {
            pushFollow(FOLLOW_rule__Fulfils__Group_4__0__Impl_in_rule__Fulfils__Group_4__07453);
            rule__Fulfils__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group_4__1_in_rule__Fulfils__Group_4__07456);
            rule__Fulfils__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group_4__0


    // $ANTLR start rule__Fulfils__Group_4__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3657:1: rule__Fulfils__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Fulfils__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3661:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3662:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3662:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3663:1: ','
            {
             before(grammarAccess.getFulfilsAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Fulfils__Group_4__0__Impl7484); 
             after(grammarAccess.getFulfilsAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group_4__0__Impl


    // $ANTLR start rule__Fulfils__Group_4__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3676:1: rule__Fulfils__Group_4__1 : rule__Fulfils__Group_4__1__Impl ;
    public final void rule__Fulfils__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3680:1: ( rule__Fulfils__Group_4__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3681:2: rule__Fulfils__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Fulfils__Group_4__1__Impl_in_rule__Fulfils__Group_4__17515);
            rule__Fulfils__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group_4__1


    // $ANTLR start rule__Fulfils__Group_4__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3687:1: rule__Fulfils__Group_4__1__Impl : ( ( rule__Fulfils__ThingsAssignment_4_1 ) ) ;
    public final void rule__Fulfils__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3691:1: ( ( ( rule__Fulfils__ThingsAssignment_4_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3692:1: ( ( rule__Fulfils__ThingsAssignment_4_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3692:1: ( ( rule__Fulfils__ThingsAssignment_4_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3693:1: ( rule__Fulfils__ThingsAssignment_4_1 )
            {
             before(grammarAccess.getFulfilsAccess().getThingsAssignment_4_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3694:1: ( rule__Fulfils__ThingsAssignment_4_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3694:2: rule__Fulfils__ThingsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Fulfils__ThingsAssignment_4_1_in_rule__Fulfils__Group_4__1__Impl7542);
            rule__Fulfils__ThingsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getFulfilsAccess().getThingsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__Group_4__1__Impl


    // $ANTLR start rule__Depends__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3708:1: rule__Depends__Group__0 : rule__Depends__Group__0__Impl rule__Depends__Group__1 ;
    public final void rule__Depends__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3712:1: ( rule__Depends__Group__0__Impl rule__Depends__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3713:2: rule__Depends__Group__0__Impl rule__Depends__Group__1
            {
            pushFollow(FOLLOW_rule__Depends__Group__0__Impl_in_rule__Depends__Group__07576);
            rule__Depends__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Depends__Group__1_in_rule__Depends__Group__07579);
            rule__Depends__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__0


    // $ANTLR start rule__Depends__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3720:1: rule__Depends__Group__0__Impl : ( ( rule__Depends__KindAssignment_0 ) ) ;
    public final void rule__Depends__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3724:1: ( ( ( rule__Depends__KindAssignment_0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3725:1: ( ( rule__Depends__KindAssignment_0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3725:1: ( ( rule__Depends__KindAssignment_0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3726:1: ( rule__Depends__KindAssignment_0 )
            {
             before(grammarAccess.getDependsAccess().getKindAssignment_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3727:1: ( rule__Depends__KindAssignment_0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3727:2: rule__Depends__KindAssignment_0
            {
            pushFollow(FOLLOW_rule__Depends__KindAssignment_0_in_rule__Depends__Group__0__Impl7606);
            rule__Depends__KindAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDependsAccess().getKindAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__0__Impl


    // $ANTLR start rule__Depends__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3737:1: rule__Depends__Group__1 : rule__Depends__Group__1__Impl rule__Depends__Group__2 ;
    public final void rule__Depends__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3741:1: ( rule__Depends__Group__1__Impl rule__Depends__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3742:2: rule__Depends__Group__1__Impl rule__Depends__Group__2
            {
            pushFollow(FOLLOW_rule__Depends__Group__1__Impl_in_rule__Depends__Group__17636);
            rule__Depends__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Depends__Group__2_in_rule__Depends__Group__17639);
            rule__Depends__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__1


    // $ANTLR start rule__Depends__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3749:1: rule__Depends__Group__1__Impl : ( ( rule__Depends__NameAssignment_1 ) ) ;
    public final void rule__Depends__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3753:1: ( ( ( rule__Depends__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3754:1: ( ( rule__Depends__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3754:1: ( ( rule__Depends__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3755:1: ( rule__Depends__NameAssignment_1 )
            {
             before(grammarAccess.getDependsAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3756:1: ( rule__Depends__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3756:2: rule__Depends__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Depends__NameAssignment_1_in_rule__Depends__Group__1__Impl7666);
            rule__Depends__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDependsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__1__Impl


    // $ANTLR start rule__Depends__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3766:1: rule__Depends__Group__2 : rule__Depends__Group__2__Impl rule__Depends__Group__3 ;
    public final void rule__Depends__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3770:1: ( rule__Depends__Group__2__Impl rule__Depends__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3771:2: rule__Depends__Group__2__Impl rule__Depends__Group__3
            {
            pushFollow(FOLLOW_rule__Depends__Group__2__Impl_in_rule__Depends__Group__27696);
            rule__Depends__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Depends__Group__3_in_rule__Depends__Group__27699);
            rule__Depends__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__2


    // $ANTLR start rule__Depends__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3778:1: rule__Depends__Group__2__Impl : ( '(' ) ;
    public final void rule__Depends__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3782:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3783:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3783:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3784:1: '('
            {
             before(grammarAccess.getDependsAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Depends__Group__2__Impl7727); 
             after(grammarAccess.getDependsAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__2__Impl


    // $ANTLR start rule__Depends__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3797:1: rule__Depends__Group__3 : rule__Depends__Group__3__Impl rule__Depends__Group__4 ;
    public final void rule__Depends__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3801:1: ( rule__Depends__Group__3__Impl rule__Depends__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3802:2: rule__Depends__Group__3__Impl rule__Depends__Group__4
            {
            pushFollow(FOLLOW_rule__Depends__Group__3__Impl_in_rule__Depends__Group__37758);
            rule__Depends__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Depends__Group__4_in_rule__Depends__Group__37761);
            rule__Depends__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__3


    // $ANTLR start rule__Depends__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3809:1: rule__Depends__Group__3__Impl : ( ( rule__Depends__ThingsAssignment_3 ) ) ;
    public final void rule__Depends__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3813:1: ( ( ( rule__Depends__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3814:1: ( ( rule__Depends__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3814:1: ( ( rule__Depends__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3815:1: ( rule__Depends__ThingsAssignment_3 )
            {
             before(grammarAccess.getDependsAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3816:1: ( rule__Depends__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3816:2: rule__Depends__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Depends__ThingsAssignment_3_in_rule__Depends__Group__3__Impl7788);
            rule__Depends__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDependsAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__3__Impl


    // $ANTLR start rule__Depends__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3826:1: rule__Depends__Group__4 : rule__Depends__Group__4__Impl rule__Depends__Group__5 ;
    public final void rule__Depends__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3830:1: ( rule__Depends__Group__4__Impl rule__Depends__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3831:2: rule__Depends__Group__4__Impl rule__Depends__Group__5
            {
            pushFollow(FOLLOW_rule__Depends__Group__4__Impl_in_rule__Depends__Group__47818);
            rule__Depends__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Depends__Group__5_in_rule__Depends__Group__47821);
            rule__Depends__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__4


    // $ANTLR start rule__Depends__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3838:1: rule__Depends__Group__4__Impl : ( ',' ) ;
    public final void rule__Depends__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3842:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3843:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3843:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3844:1: ','
            {
             before(grammarAccess.getDependsAccess().getCommaKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__Depends__Group__4__Impl7849); 
             after(grammarAccess.getDependsAccess().getCommaKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__4__Impl


    // $ANTLR start rule__Depends__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3857:1: rule__Depends__Group__5 : rule__Depends__Group__5__Impl rule__Depends__Group__6 ;
    public final void rule__Depends__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3861:1: ( rule__Depends__Group__5__Impl rule__Depends__Group__6 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3862:2: rule__Depends__Group__5__Impl rule__Depends__Group__6
            {
            pushFollow(FOLLOW_rule__Depends__Group__5__Impl_in_rule__Depends__Group__57880);
            rule__Depends__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Depends__Group__6_in_rule__Depends__Group__57883);
            rule__Depends__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__5


    // $ANTLR start rule__Depends__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3869:1: rule__Depends__Group__5__Impl : ( ( rule__Depends__ThingsAssignment_5 ) ) ;
    public final void rule__Depends__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3873:1: ( ( ( rule__Depends__ThingsAssignment_5 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3874:1: ( ( rule__Depends__ThingsAssignment_5 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3874:1: ( ( rule__Depends__ThingsAssignment_5 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3875:1: ( rule__Depends__ThingsAssignment_5 )
            {
             before(grammarAccess.getDependsAccess().getThingsAssignment_5()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3876:1: ( rule__Depends__ThingsAssignment_5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3876:2: rule__Depends__ThingsAssignment_5
            {
            pushFollow(FOLLOW_rule__Depends__ThingsAssignment_5_in_rule__Depends__Group__5__Impl7910);
            rule__Depends__ThingsAssignment_5();
            _fsp--;


            }

             after(grammarAccess.getDependsAccess().getThingsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__5__Impl


    // $ANTLR start rule__Depends__Group__6
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3886:1: rule__Depends__Group__6 : rule__Depends__Group__6__Impl rule__Depends__Group__7 ;
    public final void rule__Depends__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3890:1: ( rule__Depends__Group__6__Impl rule__Depends__Group__7 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3891:2: rule__Depends__Group__6__Impl rule__Depends__Group__7
            {
            pushFollow(FOLLOW_rule__Depends__Group__6__Impl_in_rule__Depends__Group__67940);
            rule__Depends__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Depends__Group__7_in_rule__Depends__Group__67943);
            rule__Depends__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__6


    // $ANTLR start rule__Depends__Group__6__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3898:1: rule__Depends__Group__6__Impl : ( ',' ) ;
    public final void rule__Depends__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3902:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3903:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3903:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3904:1: ','
            {
             before(grammarAccess.getDependsAccess().getCommaKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__Depends__Group__6__Impl7971); 
             after(grammarAccess.getDependsAccess().getCommaKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__6__Impl


    // $ANTLR start rule__Depends__Group__7
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3917:1: rule__Depends__Group__7 : rule__Depends__Group__7__Impl rule__Depends__Group__8 ;
    public final void rule__Depends__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3921:1: ( rule__Depends__Group__7__Impl rule__Depends__Group__8 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3922:2: rule__Depends__Group__7__Impl rule__Depends__Group__8
            {
            pushFollow(FOLLOW_rule__Depends__Group__7__Impl_in_rule__Depends__Group__78002);
            rule__Depends__Group__7__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Depends__Group__8_in_rule__Depends__Group__78005);
            rule__Depends__Group__8();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__7


    // $ANTLR start rule__Depends__Group__7__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3929:1: rule__Depends__Group__7__Impl : ( ( rule__Depends__ThingsAssignment_7 ) ) ;
    public final void rule__Depends__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3933:1: ( ( ( rule__Depends__ThingsAssignment_7 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3934:1: ( ( rule__Depends__ThingsAssignment_7 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3934:1: ( ( rule__Depends__ThingsAssignment_7 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3935:1: ( rule__Depends__ThingsAssignment_7 )
            {
             before(grammarAccess.getDependsAccess().getThingsAssignment_7()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3936:1: ( rule__Depends__ThingsAssignment_7 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3936:2: rule__Depends__ThingsAssignment_7
            {
            pushFollow(FOLLOW_rule__Depends__ThingsAssignment_7_in_rule__Depends__Group__7__Impl8032);
            rule__Depends__ThingsAssignment_7();
            _fsp--;


            }

             after(grammarAccess.getDependsAccess().getThingsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__7__Impl


    // $ANTLR start rule__Depends__Group__8
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3946:1: rule__Depends__Group__8 : rule__Depends__Group__8__Impl ;
    public final void rule__Depends__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3950:1: ( rule__Depends__Group__8__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3951:2: rule__Depends__Group__8__Impl
            {
            pushFollow(FOLLOW_rule__Depends__Group__8__Impl_in_rule__Depends__Group__88062);
            rule__Depends__Group__8__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__8


    // $ANTLR start rule__Depends__Group__8__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3957:1: rule__Depends__Group__8__Impl : ( ')' ) ;
    public final void rule__Depends__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3961:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3962:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3962:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3963:1: ')'
            {
             before(grammarAccess.getDependsAccess().getRightParenthesisKeyword_8()); 
            match(input,43,FOLLOW_43_in_rule__Depends__Group__8__Impl8090); 
             after(grammarAccess.getDependsAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__Group__8__Impl


    // $ANTLR start rule__Provides__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3994:1: rule__Provides__Group__0 : rule__Provides__Group__0__Impl rule__Provides__Group__1 ;
    public final void rule__Provides__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3998:1: ( rule__Provides__Group__0__Impl rule__Provides__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:3999:2: rule__Provides__Group__0__Impl rule__Provides__Group__1
            {
            pushFollow(FOLLOW_rule__Provides__Group__0__Impl_in_rule__Provides__Group__08139);
            rule__Provides__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__1_in_rule__Provides__Group__08142);
            rule__Provides__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__0


    // $ANTLR start rule__Provides__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4006:1: rule__Provides__Group__0__Impl : ( 'provides' ) ;
    public final void rule__Provides__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4010:1: ( ( 'provides' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4011:1: ( 'provides' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4011:1: ( 'provides' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4012:1: 'provides'
            {
             before(grammarAccess.getProvidesAccess().getProvidesKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__Provides__Group__0__Impl8170); 
             after(grammarAccess.getProvidesAccess().getProvidesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__0__Impl


    // $ANTLR start rule__Provides__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4025:1: rule__Provides__Group__1 : rule__Provides__Group__1__Impl rule__Provides__Group__2 ;
    public final void rule__Provides__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4029:1: ( rule__Provides__Group__1__Impl rule__Provides__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4030:2: rule__Provides__Group__1__Impl rule__Provides__Group__2
            {
            pushFollow(FOLLOW_rule__Provides__Group__1__Impl_in_rule__Provides__Group__18201);
            rule__Provides__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__2_in_rule__Provides__Group__18204);
            rule__Provides__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__1


    // $ANTLR start rule__Provides__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4037:1: rule__Provides__Group__1__Impl : ( ( rule__Provides__NameAssignment_1 ) ) ;
    public final void rule__Provides__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4041:1: ( ( ( rule__Provides__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4042:1: ( ( rule__Provides__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4042:1: ( ( rule__Provides__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4043:1: ( rule__Provides__NameAssignment_1 )
            {
             before(grammarAccess.getProvidesAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4044:1: ( rule__Provides__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4044:2: rule__Provides__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Provides__NameAssignment_1_in_rule__Provides__Group__1__Impl8231);
            rule__Provides__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getProvidesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__1__Impl


    // $ANTLR start rule__Provides__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4054:1: rule__Provides__Group__2 : rule__Provides__Group__2__Impl rule__Provides__Group__3 ;
    public final void rule__Provides__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4058:1: ( rule__Provides__Group__2__Impl rule__Provides__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4059:2: rule__Provides__Group__2__Impl rule__Provides__Group__3
            {
            pushFollow(FOLLOW_rule__Provides__Group__2__Impl_in_rule__Provides__Group__28261);
            rule__Provides__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__3_in_rule__Provides__Group__28264);
            rule__Provides__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__2


    // $ANTLR start rule__Provides__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4066:1: rule__Provides__Group__2__Impl : ( '(' ) ;
    public final void rule__Provides__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4070:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4071:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4071:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4072:1: '('
            {
             before(grammarAccess.getProvidesAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Provides__Group__2__Impl8292); 
             after(grammarAccess.getProvidesAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__2__Impl


    // $ANTLR start rule__Provides__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4085:1: rule__Provides__Group__3 : rule__Provides__Group__3__Impl rule__Provides__Group__4 ;
    public final void rule__Provides__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4089:1: ( rule__Provides__Group__3__Impl rule__Provides__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4090:2: rule__Provides__Group__3__Impl rule__Provides__Group__4
            {
            pushFollow(FOLLOW_rule__Provides__Group__3__Impl_in_rule__Provides__Group__38323);
            rule__Provides__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__4_in_rule__Provides__Group__38326);
            rule__Provides__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__3


    // $ANTLR start rule__Provides__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4097:1: rule__Provides__Group__3__Impl : ( ( rule__Provides__ThingsAssignment_3 ) ) ;
    public final void rule__Provides__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4101:1: ( ( ( rule__Provides__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4102:1: ( ( rule__Provides__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4102:1: ( ( rule__Provides__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4103:1: ( rule__Provides__ThingsAssignment_3 )
            {
             before(grammarAccess.getProvidesAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4104:1: ( rule__Provides__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4104:2: rule__Provides__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Provides__ThingsAssignment_3_in_rule__Provides__Group__3__Impl8353);
            rule__Provides__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getProvidesAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__3__Impl


    // $ANTLR start rule__Provides__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4114:1: rule__Provides__Group__4 : rule__Provides__Group__4__Impl rule__Provides__Group__5 ;
    public final void rule__Provides__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4118:1: ( rule__Provides__Group__4__Impl rule__Provides__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4119:2: rule__Provides__Group__4__Impl rule__Provides__Group__5
            {
            pushFollow(FOLLOW_rule__Provides__Group__4__Impl_in_rule__Provides__Group__48383);
            rule__Provides__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__5_in_rule__Provides__Group__48386);
            rule__Provides__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__4


    // $ANTLR start rule__Provides__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4126:1: rule__Provides__Group__4__Impl : ( ( ( rule__Provides__Group_4__0 ) ) ( ( rule__Provides__Group_4__0 )* ) ) ;
    public final void rule__Provides__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4130:1: ( ( ( ( rule__Provides__Group_4__0 ) ) ( ( rule__Provides__Group_4__0 )* ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4131:1: ( ( ( rule__Provides__Group_4__0 ) ) ( ( rule__Provides__Group_4__0 )* ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4131:1: ( ( ( rule__Provides__Group_4__0 ) ) ( ( rule__Provides__Group_4__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4132:1: ( ( rule__Provides__Group_4__0 ) ) ( ( rule__Provides__Group_4__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4132:1: ( ( rule__Provides__Group_4__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4133:1: ( rule__Provides__Group_4__0 )
            {
             before(grammarAccess.getProvidesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4134:1: ( rule__Provides__Group_4__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4134:2: rule__Provides__Group_4__0
            {
            pushFollow(FOLLOW_rule__Provides__Group_4__0_in_rule__Provides__Group__4__Impl8415);
            rule__Provides__Group_4__0();
            _fsp--;


            }

             after(grammarAccess.getProvidesAccess().getGroup_4()); 

            }

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4137:1: ( ( rule__Provides__Group_4__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4138:1: ( rule__Provides__Group_4__0 )*
            {
             before(grammarAccess.getProvidesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4139:1: ( rule__Provides__Group_4__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==31) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4139:2: rule__Provides__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Provides__Group_4__0_in_rule__Provides__Group__4__Impl8427);
            	    rule__Provides__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getProvidesAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__4__Impl


    // $ANTLR start rule__Provides__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4150:1: rule__Provides__Group__5 : rule__Provides__Group__5__Impl ;
    public final void rule__Provides__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4154:1: ( rule__Provides__Group__5__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4155:2: rule__Provides__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Provides__Group__5__Impl_in_rule__Provides__Group__58460);
            rule__Provides__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__5


    // $ANTLR start rule__Provides__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4161:1: rule__Provides__Group__5__Impl : ( ')' ) ;
    public final void rule__Provides__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4165:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4166:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4166:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4167:1: ')'
            {
             before(grammarAccess.getProvidesAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Provides__Group__5__Impl8488); 
             after(grammarAccess.getProvidesAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group__5__Impl


    // $ANTLR start rule__Provides__Group_4__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4192:1: rule__Provides__Group_4__0 : rule__Provides__Group_4__0__Impl rule__Provides__Group_4__1 ;
    public final void rule__Provides__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4196:1: ( rule__Provides__Group_4__0__Impl rule__Provides__Group_4__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4197:2: rule__Provides__Group_4__0__Impl rule__Provides__Group_4__1
            {
            pushFollow(FOLLOW_rule__Provides__Group_4__0__Impl_in_rule__Provides__Group_4__08531);
            rule__Provides__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group_4__1_in_rule__Provides__Group_4__08534);
            rule__Provides__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group_4__0


    // $ANTLR start rule__Provides__Group_4__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4204:1: rule__Provides__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Provides__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4208:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4209:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4209:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4210:1: ','
            {
             before(grammarAccess.getProvidesAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Provides__Group_4__0__Impl8562); 
             after(grammarAccess.getProvidesAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group_4__0__Impl


    // $ANTLR start rule__Provides__Group_4__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4223:1: rule__Provides__Group_4__1 : rule__Provides__Group_4__1__Impl ;
    public final void rule__Provides__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4227:1: ( rule__Provides__Group_4__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4228:2: rule__Provides__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Provides__Group_4__1__Impl_in_rule__Provides__Group_4__18593);
            rule__Provides__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group_4__1


    // $ANTLR start rule__Provides__Group_4__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4234:1: rule__Provides__Group_4__1__Impl : ( ( rule__Provides__ThingsAssignment_4_1 ) ) ;
    public final void rule__Provides__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4238:1: ( ( ( rule__Provides__ThingsAssignment_4_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4239:1: ( ( rule__Provides__ThingsAssignment_4_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4239:1: ( ( rule__Provides__ThingsAssignment_4_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4240:1: ( rule__Provides__ThingsAssignment_4_1 )
            {
             before(grammarAccess.getProvidesAccess().getThingsAssignment_4_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4241:1: ( rule__Provides__ThingsAssignment_4_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4241:2: rule__Provides__ThingsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Provides__ThingsAssignment_4_1_in_rule__Provides__Group_4__1__Impl8620);
            rule__Provides__ThingsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getProvidesAccess().getThingsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__Group_4__1__Impl


    // $ANTLR start rule__Consumes__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4255:1: rule__Consumes__Group__0 : rule__Consumes__Group__0__Impl rule__Consumes__Group__1 ;
    public final void rule__Consumes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4259:1: ( rule__Consumes__Group__0__Impl rule__Consumes__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4260:2: rule__Consumes__Group__0__Impl rule__Consumes__Group__1
            {
            pushFollow(FOLLOW_rule__Consumes__Group__0__Impl_in_rule__Consumes__Group__08654);
            rule__Consumes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__1_in_rule__Consumes__Group__08657);
            rule__Consumes__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__0


    // $ANTLR start rule__Consumes__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4267:1: rule__Consumes__Group__0__Impl : ( 'consumes' ) ;
    public final void rule__Consumes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4271:1: ( ( 'consumes' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4272:1: ( 'consumes' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4272:1: ( 'consumes' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4273:1: 'consumes'
            {
             before(grammarAccess.getConsumesAccess().getConsumesKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__Consumes__Group__0__Impl8685); 
             after(grammarAccess.getConsumesAccess().getConsumesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__0__Impl


    // $ANTLR start rule__Consumes__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4286:1: rule__Consumes__Group__1 : rule__Consumes__Group__1__Impl rule__Consumes__Group__2 ;
    public final void rule__Consumes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4290:1: ( rule__Consumes__Group__1__Impl rule__Consumes__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4291:2: rule__Consumes__Group__1__Impl rule__Consumes__Group__2
            {
            pushFollow(FOLLOW_rule__Consumes__Group__1__Impl_in_rule__Consumes__Group__18716);
            rule__Consumes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__2_in_rule__Consumes__Group__18719);
            rule__Consumes__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__1


    // $ANTLR start rule__Consumes__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4298:1: rule__Consumes__Group__1__Impl : ( ( rule__Consumes__NameAssignment_1 ) ) ;
    public final void rule__Consumes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4302:1: ( ( ( rule__Consumes__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4303:1: ( ( rule__Consumes__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4303:1: ( ( rule__Consumes__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4304:1: ( rule__Consumes__NameAssignment_1 )
            {
             before(grammarAccess.getConsumesAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4305:1: ( rule__Consumes__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4305:2: rule__Consumes__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Consumes__NameAssignment_1_in_rule__Consumes__Group__1__Impl8746);
            rule__Consumes__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getConsumesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__1__Impl


    // $ANTLR start rule__Consumes__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4315:1: rule__Consumes__Group__2 : rule__Consumes__Group__2__Impl rule__Consumes__Group__3 ;
    public final void rule__Consumes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4319:1: ( rule__Consumes__Group__2__Impl rule__Consumes__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4320:2: rule__Consumes__Group__2__Impl rule__Consumes__Group__3
            {
            pushFollow(FOLLOW_rule__Consumes__Group__2__Impl_in_rule__Consumes__Group__28776);
            rule__Consumes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__3_in_rule__Consumes__Group__28779);
            rule__Consumes__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__2


    // $ANTLR start rule__Consumes__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4327:1: rule__Consumes__Group__2__Impl : ( '(' ) ;
    public final void rule__Consumes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4331:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4332:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4332:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4333:1: '('
            {
             before(grammarAccess.getConsumesAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Consumes__Group__2__Impl8807); 
             after(grammarAccess.getConsumesAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__2__Impl


    // $ANTLR start rule__Consumes__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4346:1: rule__Consumes__Group__3 : rule__Consumes__Group__3__Impl rule__Consumes__Group__4 ;
    public final void rule__Consumes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4350:1: ( rule__Consumes__Group__3__Impl rule__Consumes__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4351:2: rule__Consumes__Group__3__Impl rule__Consumes__Group__4
            {
            pushFollow(FOLLOW_rule__Consumes__Group__3__Impl_in_rule__Consumes__Group__38838);
            rule__Consumes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__4_in_rule__Consumes__Group__38841);
            rule__Consumes__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__3


    // $ANTLR start rule__Consumes__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4358:1: rule__Consumes__Group__3__Impl : ( ( rule__Consumes__ThingsAssignment_3 ) ) ;
    public final void rule__Consumes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4362:1: ( ( ( rule__Consumes__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4363:1: ( ( rule__Consumes__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4363:1: ( ( rule__Consumes__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4364:1: ( rule__Consumes__ThingsAssignment_3 )
            {
             before(grammarAccess.getConsumesAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4365:1: ( rule__Consumes__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4365:2: rule__Consumes__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Consumes__ThingsAssignment_3_in_rule__Consumes__Group__3__Impl8868);
            rule__Consumes__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getConsumesAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__3__Impl


    // $ANTLR start rule__Consumes__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4375:1: rule__Consumes__Group__4 : rule__Consumes__Group__4__Impl rule__Consumes__Group__5 ;
    public final void rule__Consumes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4379:1: ( rule__Consumes__Group__4__Impl rule__Consumes__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4380:2: rule__Consumes__Group__4__Impl rule__Consumes__Group__5
            {
            pushFollow(FOLLOW_rule__Consumes__Group__4__Impl_in_rule__Consumes__Group__48898);
            rule__Consumes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__5_in_rule__Consumes__Group__48901);
            rule__Consumes__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__4


    // $ANTLR start rule__Consumes__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4387:1: rule__Consumes__Group__4__Impl : ( ( ( rule__Consumes__Group_4__0 ) ) ( ( rule__Consumes__Group_4__0 )* ) ) ;
    public final void rule__Consumes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4391:1: ( ( ( ( rule__Consumes__Group_4__0 ) ) ( ( rule__Consumes__Group_4__0 )* ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4392:1: ( ( ( rule__Consumes__Group_4__0 ) ) ( ( rule__Consumes__Group_4__0 )* ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4392:1: ( ( ( rule__Consumes__Group_4__0 ) ) ( ( rule__Consumes__Group_4__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4393:1: ( ( rule__Consumes__Group_4__0 ) ) ( ( rule__Consumes__Group_4__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4393:1: ( ( rule__Consumes__Group_4__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4394:1: ( rule__Consumes__Group_4__0 )
            {
             before(grammarAccess.getConsumesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4395:1: ( rule__Consumes__Group_4__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4395:2: rule__Consumes__Group_4__0
            {
            pushFollow(FOLLOW_rule__Consumes__Group_4__0_in_rule__Consumes__Group__4__Impl8930);
            rule__Consumes__Group_4__0();
            _fsp--;


            }

             after(grammarAccess.getConsumesAccess().getGroup_4()); 

            }

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4398:1: ( ( rule__Consumes__Group_4__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4399:1: ( rule__Consumes__Group_4__0 )*
            {
             before(grammarAccess.getConsumesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4400:1: ( rule__Consumes__Group_4__0 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==31) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4400:2: rule__Consumes__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Consumes__Group_4__0_in_rule__Consumes__Group__4__Impl8942);
            	    rule__Consumes__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getConsumesAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__4__Impl


    // $ANTLR start rule__Consumes__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4411:1: rule__Consumes__Group__5 : rule__Consumes__Group__5__Impl ;
    public final void rule__Consumes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4415:1: ( rule__Consumes__Group__5__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4416:2: rule__Consumes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Consumes__Group__5__Impl_in_rule__Consumes__Group__58975);
            rule__Consumes__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__5


    // $ANTLR start rule__Consumes__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4422:1: rule__Consumes__Group__5__Impl : ( ')' ) ;
    public final void rule__Consumes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4426:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4427:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4427:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4428:1: ')'
            {
             before(grammarAccess.getConsumesAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Consumes__Group__5__Impl9003); 
             after(grammarAccess.getConsumesAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group__5__Impl


    // $ANTLR start rule__Consumes__Group_4__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4453:1: rule__Consumes__Group_4__0 : rule__Consumes__Group_4__0__Impl rule__Consumes__Group_4__1 ;
    public final void rule__Consumes__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4457:1: ( rule__Consumes__Group_4__0__Impl rule__Consumes__Group_4__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4458:2: rule__Consumes__Group_4__0__Impl rule__Consumes__Group_4__1
            {
            pushFollow(FOLLOW_rule__Consumes__Group_4__0__Impl_in_rule__Consumes__Group_4__09046);
            rule__Consumes__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group_4__1_in_rule__Consumes__Group_4__09049);
            rule__Consumes__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group_4__0


    // $ANTLR start rule__Consumes__Group_4__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4465:1: rule__Consumes__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Consumes__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4469:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4470:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4470:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4471:1: ','
            {
             before(grammarAccess.getConsumesAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Consumes__Group_4__0__Impl9077); 
             after(grammarAccess.getConsumesAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group_4__0__Impl


    // $ANTLR start rule__Consumes__Group_4__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4484:1: rule__Consumes__Group_4__1 : rule__Consumes__Group_4__1__Impl ;
    public final void rule__Consumes__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4488:1: ( rule__Consumes__Group_4__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4489:2: rule__Consumes__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Consumes__Group_4__1__Impl_in_rule__Consumes__Group_4__19108);
            rule__Consumes__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group_4__1


    // $ANTLR start rule__Consumes__Group_4__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4495:1: rule__Consumes__Group_4__1__Impl : ( ( rule__Consumes__ThingsAssignment_4_1 ) ) ;
    public final void rule__Consumes__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4499:1: ( ( ( rule__Consumes__ThingsAssignment_4_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4500:1: ( ( rule__Consumes__ThingsAssignment_4_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4500:1: ( ( rule__Consumes__ThingsAssignment_4_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4501:1: ( rule__Consumes__ThingsAssignment_4_1 )
            {
             before(grammarAccess.getConsumesAccess().getThingsAssignment_4_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4502:1: ( rule__Consumes__ThingsAssignment_4_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4502:2: rule__Consumes__ThingsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Consumes__ThingsAssignment_4_1_in_rule__Consumes__Group_4__1__Impl9135);
            rule__Consumes__ThingsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getConsumesAccess().getThingsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__Group_4__1__Impl


    // $ANTLR start rule__Exploits__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4516:1: rule__Exploits__Group__0 : rule__Exploits__Group__0__Impl rule__Exploits__Group__1 ;
    public final void rule__Exploits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4520:1: ( rule__Exploits__Group__0__Impl rule__Exploits__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4521:2: rule__Exploits__Group__0__Impl rule__Exploits__Group__1
            {
            pushFollow(FOLLOW_rule__Exploits__Group__0__Impl_in_rule__Exploits__Group__09169);
            rule__Exploits__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__1_in_rule__Exploits__Group__09172);
            rule__Exploits__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__0


    // $ANTLR start rule__Exploits__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4528:1: rule__Exploits__Group__0__Impl : ( 'exploits' ) ;
    public final void rule__Exploits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4532:1: ( ( 'exploits' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4533:1: ( 'exploits' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4533:1: ( 'exploits' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4534:1: 'exploits'
            {
             before(grammarAccess.getExploitsAccess().getExploitsKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__Exploits__Group__0__Impl9200); 
             after(grammarAccess.getExploitsAccess().getExploitsKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__0__Impl


    // $ANTLR start rule__Exploits__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4547:1: rule__Exploits__Group__1 : rule__Exploits__Group__1__Impl rule__Exploits__Group__2 ;
    public final void rule__Exploits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4551:1: ( rule__Exploits__Group__1__Impl rule__Exploits__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4552:2: rule__Exploits__Group__1__Impl rule__Exploits__Group__2
            {
            pushFollow(FOLLOW_rule__Exploits__Group__1__Impl_in_rule__Exploits__Group__19231);
            rule__Exploits__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__2_in_rule__Exploits__Group__19234);
            rule__Exploits__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__1


    // $ANTLR start rule__Exploits__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4559:1: rule__Exploits__Group__1__Impl : ( ( rule__Exploits__NameAssignment_1 ) ) ;
    public final void rule__Exploits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4563:1: ( ( ( rule__Exploits__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4564:1: ( ( rule__Exploits__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4564:1: ( ( rule__Exploits__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4565:1: ( rule__Exploits__NameAssignment_1 )
            {
             before(grammarAccess.getExploitsAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4566:1: ( rule__Exploits__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4566:2: rule__Exploits__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Exploits__NameAssignment_1_in_rule__Exploits__Group__1__Impl9261);
            rule__Exploits__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getExploitsAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__1__Impl


    // $ANTLR start rule__Exploits__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4576:1: rule__Exploits__Group__2 : rule__Exploits__Group__2__Impl rule__Exploits__Group__3 ;
    public final void rule__Exploits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4580:1: ( rule__Exploits__Group__2__Impl rule__Exploits__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4581:2: rule__Exploits__Group__2__Impl rule__Exploits__Group__3
            {
            pushFollow(FOLLOW_rule__Exploits__Group__2__Impl_in_rule__Exploits__Group__29291);
            rule__Exploits__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__3_in_rule__Exploits__Group__29294);
            rule__Exploits__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__2


    // $ANTLR start rule__Exploits__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4588:1: rule__Exploits__Group__2__Impl : ( '(' ) ;
    public final void rule__Exploits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4592:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4593:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4593:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4594:1: '('
            {
             before(grammarAccess.getExploitsAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Exploits__Group__2__Impl9322); 
             after(grammarAccess.getExploitsAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__2__Impl


    // $ANTLR start rule__Exploits__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4607:1: rule__Exploits__Group__3 : rule__Exploits__Group__3__Impl rule__Exploits__Group__4 ;
    public final void rule__Exploits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4611:1: ( rule__Exploits__Group__3__Impl rule__Exploits__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4612:2: rule__Exploits__Group__3__Impl rule__Exploits__Group__4
            {
            pushFollow(FOLLOW_rule__Exploits__Group__3__Impl_in_rule__Exploits__Group__39353);
            rule__Exploits__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__4_in_rule__Exploits__Group__39356);
            rule__Exploits__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__3


    // $ANTLR start rule__Exploits__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4619:1: rule__Exploits__Group__3__Impl : ( ( rule__Exploits__ThingsAssignment_3 ) ) ;
    public final void rule__Exploits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4623:1: ( ( ( rule__Exploits__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4624:1: ( ( rule__Exploits__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4624:1: ( ( rule__Exploits__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4625:1: ( rule__Exploits__ThingsAssignment_3 )
            {
             before(grammarAccess.getExploitsAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4626:1: ( rule__Exploits__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4626:2: rule__Exploits__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Exploits__ThingsAssignment_3_in_rule__Exploits__Group__3__Impl9383);
            rule__Exploits__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getExploitsAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__3__Impl


    // $ANTLR start rule__Exploits__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4636:1: rule__Exploits__Group__4 : rule__Exploits__Group__4__Impl rule__Exploits__Group__5 ;
    public final void rule__Exploits__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4640:1: ( rule__Exploits__Group__4__Impl rule__Exploits__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4641:2: rule__Exploits__Group__4__Impl rule__Exploits__Group__5
            {
            pushFollow(FOLLOW_rule__Exploits__Group__4__Impl_in_rule__Exploits__Group__49413);
            rule__Exploits__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__5_in_rule__Exploits__Group__49416);
            rule__Exploits__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__4


    // $ANTLR start rule__Exploits__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4648:1: rule__Exploits__Group__4__Impl : ( ( ( rule__Exploits__Group_4__0 ) ) ( ( rule__Exploits__Group_4__0 )* ) ) ;
    public final void rule__Exploits__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4652:1: ( ( ( ( rule__Exploits__Group_4__0 ) ) ( ( rule__Exploits__Group_4__0 )* ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4653:1: ( ( ( rule__Exploits__Group_4__0 ) ) ( ( rule__Exploits__Group_4__0 )* ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4653:1: ( ( ( rule__Exploits__Group_4__0 ) ) ( ( rule__Exploits__Group_4__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4654:1: ( ( rule__Exploits__Group_4__0 ) ) ( ( rule__Exploits__Group_4__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4654:1: ( ( rule__Exploits__Group_4__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4655:1: ( rule__Exploits__Group_4__0 )
            {
             before(grammarAccess.getExploitsAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4656:1: ( rule__Exploits__Group_4__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4656:2: rule__Exploits__Group_4__0
            {
            pushFollow(FOLLOW_rule__Exploits__Group_4__0_in_rule__Exploits__Group__4__Impl9445);
            rule__Exploits__Group_4__0();
            _fsp--;


            }

             after(grammarAccess.getExploitsAccess().getGroup_4()); 

            }

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4659:1: ( ( rule__Exploits__Group_4__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4660:1: ( rule__Exploits__Group_4__0 )*
            {
             before(grammarAccess.getExploitsAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4661:1: ( rule__Exploits__Group_4__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==31) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4661:2: rule__Exploits__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Exploits__Group_4__0_in_rule__Exploits__Group__4__Impl9457);
            	    rule__Exploits__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getExploitsAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__4__Impl


    // $ANTLR start rule__Exploits__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4672:1: rule__Exploits__Group__5 : rule__Exploits__Group__5__Impl ;
    public final void rule__Exploits__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4676:1: ( rule__Exploits__Group__5__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4677:2: rule__Exploits__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Exploits__Group__5__Impl_in_rule__Exploits__Group__59490);
            rule__Exploits__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__5


    // $ANTLR start rule__Exploits__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4683:1: rule__Exploits__Group__5__Impl : ( ')' ) ;
    public final void rule__Exploits__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4687:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4688:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4688:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4689:1: ')'
            {
             before(grammarAccess.getExploitsAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Exploits__Group__5__Impl9518); 
             after(grammarAccess.getExploitsAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group__5__Impl


    // $ANTLR start rule__Exploits__Group_4__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4714:1: rule__Exploits__Group_4__0 : rule__Exploits__Group_4__0__Impl rule__Exploits__Group_4__1 ;
    public final void rule__Exploits__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4718:1: ( rule__Exploits__Group_4__0__Impl rule__Exploits__Group_4__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4719:2: rule__Exploits__Group_4__0__Impl rule__Exploits__Group_4__1
            {
            pushFollow(FOLLOW_rule__Exploits__Group_4__0__Impl_in_rule__Exploits__Group_4__09561);
            rule__Exploits__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group_4__1_in_rule__Exploits__Group_4__09564);
            rule__Exploits__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group_4__0


    // $ANTLR start rule__Exploits__Group_4__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4726:1: rule__Exploits__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Exploits__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4730:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4731:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4731:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4732:1: ','
            {
             before(grammarAccess.getExploitsAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Exploits__Group_4__0__Impl9592); 
             after(grammarAccess.getExploitsAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group_4__0__Impl


    // $ANTLR start rule__Exploits__Group_4__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4745:1: rule__Exploits__Group_4__1 : rule__Exploits__Group_4__1__Impl ;
    public final void rule__Exploits__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4749:1: ( rule__Exploits__Group_4__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4750:2: rule__Exploits__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Exploits__Group_4__1__Impl_in_rule__Exploits__Group_4__19623);
            rule__Exploits__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group_4__1


    // $ANTLR start rule__Exploits__Group_4__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4756:1: rule__Exploits__Group_4__1__Impl : ( ( rule__Exploits__ThingsAssignment_4_1 ) ) ;
    public final void rule__Exploits__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4760:1: ( ( ( rule__Exploits__ThingsAssignment_4_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4761:1: ( ( rule__Exploits__ThingsAssignment_4_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4761:1: ( ( rule__Exploits__ThingsAssignment_4_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4762:1: ( rule__Exploits__ThingsAssignment_4_1 )
            {
             before(grammarAccess.getExploitsAccess().getThingsAssignment_4_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4763:1: ( rule__Exploits__ThingsAssignment_4_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4763:2: rule__Exploits__ThingsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Exploits__ThingsAssignment_4_1_in_rule__Exploits__Group_4__1__Impl9650);
            rule__Exploits__ThingsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getExploitsAccess().getThingsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__Group_4__1__Impl


    // $ANTLR start rule__Damages__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4777:1: rule__Damages__Group__0 : rule__Damages__Group__0__Impl rule__Damages__Group__1 ;
    public final void rule__Damages__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4781:1: ( rule__Damages__Group__0__Impl rule__Damages__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4782:2: rule__Damages__Group__0__Impl rule__Damages__Group__1
            {
            pushFollow(FOLLOW_rule__Damages__Group__0__Impl_in_rule__Damages__Group__09684);
            rule__Damages__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__1_in_rule__Damages__Group__09687);
            rule__Damages__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__0


    // $ANTLR start rule__Damages__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4789:1: rule__Damages__Group__0__Impl : ( 'damages' ) ;
    public final void rule__Damages__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4793:1: ( ( 'damages' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4794:1: ( 'damages' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4794:1: ( 'damages' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4795:1: 'damages'
            {
             before(grammarAccess.getDamagesAccess().getDamagesKeyword_0()); 
            match(input,49,FOLLOW_49_in_rule__Damages__Group__0__Impl9715); 
             after(grammarAccess.getDamagesAccess().getDamagesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__0__Impl


    // $ANTLR start rule__Damages__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4808:1: rule__Damages__Group__1 : rule__Damages__Group__1__Impl rule__Damages__Group__2 ;
    public final void rule__Damages__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4812:1: ( rule__Damages__Group__1__Impl rule__Damages__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4813:2: rule__Damages__Group__1__Impl rule__Damages__Group__2
            {
            pushFollow(FOLLOW_rule__Damages__Group__1__Impl_in_rule__Damages__Group__19746);
            rule__Damages__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__2_in_rule__Damages__Group__19749);
            rule__Damages__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__1


    // $ANTLR start rule__Damages__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4820:1: rule__Damages__Group__1__Impl : ( ( rule__Damages__NameAssignment_1 ) ) ;
    public final void rule__Damages__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4824:1: ( ( ( rule__Damages__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4825:1: ( ( rule__Damages__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4825:1: ( ( rule__Damages__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4826:1: ( rule__Damages__NameAssignment_1 )
            {
             before(grammarAccess.getDamagesAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4827:1: ( rule__Damages__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4827:2: rule__Damages__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Damages__NameAssignment_1_in_rule__Damages__Group__1__Impl9776);
            rule__Damages__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDamagesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__1__Impl


    // $ANTLR start rule__Damages__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4837:1: rule__Damages__Group__2 : rule__Damages__Group__2__Impl rule__Damages__Group__3 ;
    public final void rule__Damages__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4841:1: ( rule__Damages__Group__2__Impl rule__Damages__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4842:2: rule__Damages__Group__2__Impl rule__Damages__Group__3
            {
            pushFollow(FOLLOW_rule__Damages__Group__2__Impl_in_rule__Damages__Group__29806);
            rule__Damages__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__3_in_rule__Damages__Group__29809);
            rule__Damages__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__2


    // $ANTLR start rule__Damages__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4849:1: rule__Damages__Group__2__Impl : ( '(' ) ;
    public final void rule__Damages__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4853:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4854:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4854:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4855:1: '('
            {
             before(grammarAccess.getDamagesAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Damages__Group__2__Impl9837); 
             after(grammarAccess.getDamagesAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__2__Impl


    // $ANTLR start rule__Damages__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4868:1: rule__Damages__Group__3 : rule__Damages__Group__3__Impl rule__Damages__Group__4 ;
    public final void rule__Damages__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4872:1: ( rule__Damages__Group__3__Impl rule__Damages__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4873:2: rule__Damages__Group__3__Impl rule__Damages__Group__4
            {
            pushFollow(FOLLOW_rule__Damages__Group__3__Impl_in_rule__Damages__Group__39868);
            rule__Damages__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__4_in_rule__Damages__Group__39871);
            rule__Damages__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__3


    // $ANTLR start rule__Damages__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4880:1: rule__Damages__Group__3__Impl : ( ( rule__Damages__ThingsAssignment_3 ) ) ;
    public final void rule__Damages__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4884:1: ( ( ( rule__Damages__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4885:1: ( ( rule__Damages__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4885:1: ( ( rule__Damages__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4886:1: ( rule__Damages__ThingsAssignment_3 )
            {
             before(grammarAccess.getDamagesAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4887:1: ( rule__Damages__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4887:2: rule__Damages__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Damages__ThingsAssignment_3_in_rule__Damages__Group__3__Impl9898);
            rule__Damages__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getDamagesAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__3__Impl


    // $ANTLR start rule__Damages__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4897:1: rule__Damages__Group__4 : rule__Damages__Group__4__Impl rule__Damages__Group__5 ;
    public final void rule__Damages__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4901:1: ( rule__Damages__Group__4__Impl rule__Damages__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4902:2: rule__Damages__Group__4__Impl rule__Damages__Group__5
            {
            pushFollow(FOLLOW_rule__Damages__Group__4__Impl_in_rule__Damages__Group__49928);
            rule__Damages__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__5_in_rule__Damages__Group__49931);
            rule__Damages__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__4


    // $ANTLR start rule__Damages__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4909:1: rule__Damages__Group__4__Impl : ( ( ( rule__Damages__Group_4__0 ) ) ( ( rule__Damages__Group_4__0 )* ) ) ;
    public final void rule__Damages__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4913:1: ( ( ( ( rule__Damages__Group_4__0 ) ) ( ( rule__Damages__Group_4__0 )* ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4914:1: ( ( ( rule__Damages__Group_4__0 ) ) ( ( rule__Damages__Group_4__0 )* ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4914:1: ( ( ( rule__Damages__Group_4__0 ) ) ( ( rule__Damages__Group_4__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4915:1: ( ( rule__Damages__Group_4__0 ) ) ( ( rule__Damages__Group_4__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4915:1: ( ( rule__Damages__Group_4__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4916:1: ( rule__Damages__Group_4__0 )
            {
             before(grammarAccess.getDamagesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4917:1: ( rule__Damages__Group_4__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4917:2: rule__Damages__Group_4__0
            {
            pushFollow(FOLLOW_rule__Damages__Group_4__0_in_rule__Damages__Group__4__Impl9960);
            rule__Damages__Group_4__0();
            _fsp--;


            }

             after(grammarAccess.getDamagesAccess().getGroup_4()); 

            }

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4920:1: ( ( rule__Damages__Group_4__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4921:1: ( rule__Damages__Group_4__0 )*
            {
             before(grammarAccess.getDamagesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4922:1: ( rule__Damages__Group_4__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4922:2: rule__Damages__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Damages__Group_4__0_in_rule__Damages__Group__4__Impl9972);
            	    rule__Damages__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getDamagesAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__4__Impl


    // $ANTLR start rule__Damages__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4933:1: rule__Damages__Group__5 : rule__Damages__Group__5__Impl ;
    public final void rule__Damages__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4937:1: ( rule__Damages__Group__5__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4938:2: rule__Damages__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Damages__Group__5__Impl_in_rule__Damages__Group__510005);
            rule__Damages__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__5


    // $ANTLR start rule__Damages__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4944:1: rule__Damages__Group__5__Impl : ( ')' ) ;
    public final void rule__Damages__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4948:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4949:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4949:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4950:1: ')'
            {
             before(grammarAccess.getDamagesAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Damages__Group__5__Impl10033); 
             after(grammarAccess.getDamagesAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group__5__Impl


    // $ANTLR start rule__Damages__Group_4__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4975:1: rule__Damages__Group_4__0 : rule__Damages__Group_4__0__Impl rule__Damages__Group_4__1 ;
    public final void rule__Damages__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4979:1: ( rule__Damages__Group_4__0__Impl rule__Damages__Group_4__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4980:2: rule__Damages__Group_4__0__Impl rule__Damages__Group_4__1
            {
            pushFollow(FOLLOW_rule__Damages__Group_4__0__Impl_in_rule__Damages__Group_4__010076);
            rule__Damages__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group_4__1_in_rule__Damages__Group_4__010079);
            rule__Damages__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group_4__0


    // $ANTLR start rule__Damages__Group_4__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4987:1: rule__Damages__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Damages__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4991:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4992:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4992:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:4993:1: ','
            {
             before(grammarAccess.getDamagesAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Damages__Group_4__0__Impl10107); 
             after(grammarAccess.getDamagesAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group_4__0__Impl


    // $ANTLR start rule__Damages__Group_4__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5006:1: rule__Damages__Group_4__1 : rule__Damages__Group_4__1__Impl ;
    public final void rule__Damages__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5010:1: ( rule__Damages__Group_4__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5011:2: rule__Damages__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Damages__Group_4__1__Impl_in_rule__Damages__Group_4__110138);
            rule__Damages__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group_4__1


    // $ANTLR start rule__Damages__Group_4__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5017:1: rule__Damages__Group_4__1__Impl : ( ( rule__Damages__ThingsAssignment_4_1 ) ) ;
    public final void rule__Damages__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5021:1: ( ( ( rule__Damages__ThingsAssignment_4_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5022:1: ( ( rule__Damages__ThingsAssignment_4_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5022:1: ( ( rule__Damages__ThingsAssignment_4_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5023:1: ( rule__Damages__ThingsAssignment_4_1 )
            {
             before(grammarAccess.getDamagesAccess().getThingsAssignment_4_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5024:1: ( rule__Damages__ThingsAssignment_4_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5024:2: rule__Damages__ThingsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Damages__ThingsAssignment_4_1_in_rule__Damages__Group_4__1__Impl10165);
            rule__Damages__ThingsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getDamagesAccess().getThingsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__Group_4__1__Impl


    // $ANTLR start rule__Attack__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5038:1: rule__Attack__Group__0 : rule__Attack__Group__0__Impl rule__Attack__Group__1 ;
    public final void rule__Attack__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5042:1: ( rule__Attack__Group__0__Impl rule__Attack__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5043:2: rule__Attack__Group__0__Impl rule__Attack__Group__1
            {
            pushFollow(FOLLOW_rule__Attack__Group__0__Impl_in_rule__Attack__Group__010199);
            rule__Attack__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attack__Group__1_in_rule__Attack__Group__010202);
            rule__Attack__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__0


    // $ANTLR start rule__Attack__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5050:1: rule__Attack__Group__0__Impl : ( 'attack' ) ;
    public final void rule__Attack__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5054:1: ( ( 'attack' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5055:1: ( 'attack' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5055:1: ( 'attack' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5056:1: 'attack'
            {
             before(grammarAccess.getAttackAccess().getAttackKeyword_0()); 
            match(input,50,FOLLOW_50_in_rule__Attack__Group__0__Impl10230); 
             after(grammarAccess.getAttackAccess().getAttackKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__0__Impl


    // $ANTLR start rule__Attack__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5069:1: rule__Attack__Group__1 : rule__Attack__Group__1__Impl rule__Attack__Group__2 ;
    public final void rule__Attack__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5073:1: ( rule__Attack__Group__1__Impl rule__Attack__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5074:2: rule__Attack__Group__1__Impl rule__Attack__Group__2
            {
            pushFollow(FOLLOW_rule__Attack__Group__1__Impl_in_rule__Attack__Group__110261);
            rule__Attack__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attack__Group__2_in_rule__Attack__Group__110264);
            rule__Attack__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__1


    // $ANTLR start rule__Attack__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5081:1: rule__Attack__Group__1__Impl : ( ( rule__Attack__NameAssignment_1 ) ) ;
    public final void rule__Attack__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5085:1: ( ( ( rule__Attack__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5086:1: ( ( rule__Attack__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5086:1: ( ( rule__Attack__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5087:1: ( rule__Attack__NameAssignment_1 )
            {
             before(grammarAccess.getAttackAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5088:1: ( rule__Attack__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5088:2: rule__Attack__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attack__NameAssignment_1_in_rule__Attack__Group__1__Impl10291);
            rule__Attack__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttackAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__1__Impl


    // $ANTLR start rule__Attack__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5098:1: rule__Attack__Group__2 : rule__Attack__Group__2__Impl rule__Attack__Group__3 ;
    public final void rule__Attack__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5102:1: ( rule__Attack__Group__2__Impl rule__Attack__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5103:2: rule__Attack__Group__2__Impl rule__Attack__Group__3
            {
            pushFollow(FOLLOW_rule__Attack__Group__2__Impl_in_rule__Attack__Group__210321);
            rule__Attack__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attack__Group__3_in_rule__Attack__Group__210324);
            rule__Attack__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__2


    // $ANTLR start rule__Attack__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5110:1: rule__Attack__Group__2__Impl : ( '(' ) ;
    public final void rule__Attack__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5114:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5115:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5115:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5116:1: '('
            {
             before(grammarAccess.getAttackAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Attack__Group__2__Impl10352); 
             after(grammarAccess.getAttackAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__2__Impl


    // $ANTLR start rule__Attack__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5129:1: rule__Attack__Group__3 : rule__Attack__Group__3__Impl rule__Attack__Group__4 ;
    public final void rule__Attack__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5133:1: ( rule__Attack__Group__3__Impl rule__Attack__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5134:2: rule__Attack__Group__3__Impl rule__Attack__Group__4
            {
            pushFollow(FOLLOW_rule__Attack__Group__3__Impl_in_rule__Attack__Group__310383);
            rule__Attack__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attack__Group__4_in_rule__Attack__Group__310386);
            rule__Attack__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__3


    // $ANTLR start rule__Attack__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5141:1: rule__Attack__Group__3__Impl : ( ( rule__Attack__ThingsAssignment_3 ) ) ;
    public final void rule__Attack__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5145:1: ( ( ( rule__Attack__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5146:1: ( ( rule__Attack__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5146:1: ( ( rule__Attack__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5147:1: ( rule__Attack__ThingsAssignment_3 )
            {
             before(grammarAccess.getAttackAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5148:1: ( rule__Attack__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5148:2: rule__Attack__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Attack__ThingsAssignment_3_in_rule__Attack__Group__3__Impl10413);
            rule__Attack__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getAttackAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__3__Impl


    // $ANTLR start rule__Attack__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5158:1: rule__Attack__Group__4 : rule__Attack__Group__4__Impl rule__Attack__Group__5 ;
    public final void rule__Attack__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5162:1: ( rule__Attack__Group__4__Impl rule__Attack__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5163:2: rule__Attack__Group__4__Impl rule__Attack__Group__5
            {
            pushFollow(FOLLOW_rule__Attack__Group__4__Impl_in_rule__Attack__Group__410443);
            rule__Attack__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attack__Group__5_in_rule__Attack__Group__410446);
            rule__Attack__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__4


    // $ANTLR start rule__Attack__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5170:1: rule__Attack__Group__4__Impl : ( ( ( rule__Attack__Group_4__0 ) ) ( ( rule__Attack__Group_4__0 )* ) ) ;
    public final void rule__Attack__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5174:1: ( ( ( ( rule__Attack__Group_4__0 ) ) ( ( rule__Attack__Group_4__0 )* ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5175:1: ( ( ( rule__Attack__Group_4__0 ) ) ( ( rule__Attack__Group_4__0 )* ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5175:1: ( ( ( rule__Attack__Group_4__0 ) ) ( ( rule__Attack__Group_4__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5176:1: ( ( rule__Attack__Group_4__0 ) ) ( ( rule__Attack__Group_4__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5176:1: ( ( rule__Attack__Group_4__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5177:1: ( rule__Attack__Group_4__0 )
            {
             before(grammarAccess.getAttackAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5178:1: ( rule__Attack__Group_4__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5178:2: rule__Attack__Group_4__0
            {
            pushFollow(FOLLOW_rule__Attack__Group_4__0_in_rule__Attack__Group__4__Impl10475);
            rule__Attack__Group_4__0();
            _fsp--;


            }

             after(grammarAccess.getAttackAccess().getGroup_4()); 

            }

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5181:1: ( ( rule__Attack__Group_4__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5182:1: ( rule__Attack__Group_4__0 )*
            {
             before(grammarAccess.getAttackAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5183:1: ( rule__Attack__Group_4__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5183:2: rule__Attack__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Attack__Group_4__0_in_rule__Attack__Group__4__Impl10487);
            	    rule__Attack__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getAttackAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__4__Impl


    // $ANTLR start rule__Attack__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5194:1: rule__Attack__Group__5 : rule__Attack__Group__5__Impl ;
    public final void rule__Attack__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5198:1: ( rule__Attack__Group__5__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5199:2: rule__Attack__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attack__Group__5__Impl_in_rule__Attack__Group__510520);
            rule__Attack__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__5


    // $ANTLR start rule__Attack__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5205:1: rule__Attack__Group__5__Impl : ( ')' ) ;
    public final void rule__Attack__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5209:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5210:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5210:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5211:1: ')'
            {
             before(grammarAccess.getAttackAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Attack__Group__5__Impl10548); 
             after(grammarAccess.getAttackAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group__5__Impl


    // $ANTLR start rule__Attack__Group_4__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5236:1: rule__Attack__Group_4__0 : rule__Attack__Group_4__0__Impl rule__Attack__Group_4__1 ;
    public final void rule__Attack__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5240:1: ( rule__Attack__Group_4__0__Impl rule__Attack__Group_4__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5241:2: rule__Attack__Group_4__0__Impl rule__Attack__Group_4__1
            {
            pushFollow(FOLLOW_rule__Attack__Group_4__0__Impl_in_rule__Attack__Group_4__010591);
            rule__Attack__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attack__Group_4__1_in_rule__Attack__Group_4__010594);
            rule__Attack__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group_4__0


    // $ANTLR start rule__Attack__Group_4__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5248:1: rule__Attack__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Attack__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5252:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5253:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5253:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5254:1: ','
            {
             before(grammarAccess.getAttackAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Attack__Group_4__0__Impl10622); 
             after(grammarAccess.getAttackAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group_4__0__Impl


    // $ANTLR start rule__Attack__Group_4__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5267:1: rule__Attack__Group_4__1 : rule__Attack__Group_4__1__Impl ;
    public final void rule__Attack__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5271:1: ( rule__Attack__Group_4__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5272:2: rule__Attack__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Attack__Group_4__1__Impl_in_rule__Attack__Group_4__110653);
            rule__Attack__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group_4__1


    // $ANTLR start rule__Attack__Group_4__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5278:1: rule__Attack__Group_4__1__Impl : ( ( rule__Attack__ThingsAssignment_4_1 ) ) ;
    public final void rule__Attack__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5282:1: ( ( ( rule__Attack__ThingsAssignment_4_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5283:1: ( ( rule__Attack__ThingsAssignment_4_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5283:1: ( ( rule__Attack__ThingsAssignment_4_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5284:1: ( rule__Attack__ThingsAssignment_4_1 )
            {
             before(grammarAccess.getAttackAccess().getThingsAssignment_4_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5285:1: ( rule__Attack__ThingsAssignment_4_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5285:2: rule__Attack__ThingsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Attack__ThingsAssignment_4_1_in_rule__Attack__Group_4__1__Impl10680);
            rule__Attack__ThingsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getAttackAccess().getThingsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__Group_4__1__Impl


    // $ANTLR start rule__Argues__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5299:1: rule__Argues__Group__0 : rule__Argues__Group__0__Impl rule__Argues__Group__1 ;
    public final void rule__Argues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5303:1: ( rule__Argues__Group__0__Impl rule__Argues__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5304:2: rule__Argues__Group__0__Impl rule__Argues__Group__1
            {
            pushFollow(FOLLOW_rule__Argues__Group__0__Impl_in_rule__Argues__Group__010714);
            rule__Argues__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__1_in_rule__Argues__Group__010717);
            rule__Argues__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__0


    // $ANTLR start rule__Argues__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5311:1: rule__Argues__Group__0__Impl : ( 'argues' ) ;
    public final void rule__Argues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5315:1: ( ( 'argues' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5316:1: ( 'argues' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5316:1: ( 'argues' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5317:1: 'argues'
            {
             before(grammarAccess.getArguesAccess().getArguesKeyword_0()); 
            match(input,51,FOLLOW_51_in_rule__Argues__Group__0__Impl10745); 
             after(grammarAccess.getArguesAccess().getArguesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__0__Impl


    // $ANTLR start rule__Argues__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5330:1: rule__Argues__Group__1 : rule__Argues__Group__1__Impl rule__Argues__Group__2 ;
    public final void rule__Argues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5334:1: ( rule__Argues__Group__1__Impl rule__Argues__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5335:2: rule__Argues__Group__1__Impl rule__Argues__Group__2
            {
            pushFollow(FOLLOW_rule__Argues__Group__1__Impl_in_rule__Argues__Group__110776);
            rule__Argues__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__2_in_rule__Argues__Group__110779);
            rule__Argues__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__1


    // $ANTLR start rule__Argues__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5342:1: rule__Argues__Group__1__Impl : ( ( rule__Argues__NameAssignment_1 ) ) ;
    public final void rule__Argues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5346:1: ( ( ( rule__Argues__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5347:1: ( ( rule__Argues__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5347:1: ( ( rule__Argues__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5348:1: ( rule__Argues__NameAssignment_1 )
            {
             before(grammarAccess.getArguesAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5349:1: ( rule__Argues__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5349:2: rule__Argues__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argues__NameAssignment_1_in_rule__Argues__Group__1__Impl10806);
            rule__Argues__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getArguesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__1__Impl


    // $ANTLR start rule__Argues__Group__2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5359:1: rule__Argues__Group__2 : rule__Argues__Group__2__Impl rule__Argues__Group__3 ;
    public final void rule__Argues__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5363:1: ( rule__Argues__Group__2__Impl rule__Argues__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5364:2: rule__Argues__Group__2__Impl rule__Argues__Group__3
            {
            pushFollow(FOLLOW_rule__Argues__Group__2__Impl_in_rule__Argues__Group__210836);
            rule__Argues__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__3_in_rule__Argues__Group__210839);
            rule__Argues__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__2


    // $ANTLR start rule__Argues__Group__2__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5371:1: rule__Argues__Group__2__Impl : ( '(' ) ;
    public final void rule__Argues__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5375:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5376:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5376:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5377:1: '('
            {
             before(grammarAccess.getArguesAccess().getLeftParenthesisKeyword_2()); 
            match(input,42,FOLLOW_42_in_rule__Argues__Group__2__Impl10867); 
             after(grammarAccess.getArguesAccess().getLeftParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__2__Impl


    // $ANTLR start rule__Argues__Group__3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5390:1: rule__Argues__Group__3 : rule__Argues__Group__3__Impl rule__Argues__Group__4 ;
    public final void rule__Argues__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5394:1: ( rule__Argues__Group__3__Impl rule__Argues__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5395:2: rule__Argues__Group__3__Impl rule__Argues__Group__4
            {
            pushFollow(FOLLOW_rule__Argues__Group__3__Impl_in_rule__Argues__Group__310898);
            rule__Argues__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__4_in_rule__Argues__Group__310901);
            rule__Argues__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__3


    // $ANTLR start rule__Argues__Group__3__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5402:1: rule__Argues__Group__3__Impl : ( ( rule__Argues__ThingsAssignment_3 ) ) ;
    public final void rule__Argues__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5406:1: ( ( ( rule__Argues__ThingsAssignment_3 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5407:1: ( ( rule__Argues__ThingsAssignment_3 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5407:1: ( ( rule__Argues__ThingsAssignment_3 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5408:1: ( rule__Argues__ThingsAssignment_3 )
            {
             before(grammarAccess.getArguesAccess().getThingsAssignment_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5409:1: ( rule__Argues__ThingsAssignment_3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5409:2: rule__Argues__ThingsAssignment_3
            {
            pushFollow(FOLLOW_rule__Argues__ThingsAssignment_3_in_rule__Argues__Group__3__Impl10928);
            rule__Argues__ThingsAssignment_3();
            _fsp--;


            }

             after(grammarAccess.getArguesAccess().getThingsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__3__Impl


    // $ANTLR start rule__Argues__Group__4
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5419:1: rule__Argues__Group__4 : rule__Argues__Group__4__Impl rule__Argues__Group__5 ;
    public final void rule__Argues__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5423:1: ( rule__Argues__Group__4__Impl rule__Argues__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5424:2: rule__Argues__Group__4__Impl rule__Argues__Group__5
            {
            pushFollow(FOLLOW_rule__Argues__Group__4__Impl_in_rule__Argues__Group__410958);
            rule__Argues__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__5_in_rule__Argues__Group__410961);
            rule__Argues__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__4


    // $ANTLR start rule__Argues__Group__4__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5431:1: rule__Argues__Group__4__Impl : ( ( ( rule__Argues__Group_4__0 ) ) ( ( rule__Argues__Group_4__0 )* ) ) ;
    public final void rule__Argues__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5435:1: ( ( ( ( rule__Argues__Group_4__0 ) ) ( ( rule__Argues__Group_4__0 )* ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5436:1: ( ( ( rule__Argues__Group_4__0 ) ) ( ( rule__Argues__Group_4__0 )* ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5436:1: ( ( ( rule__Argues__Group_4__0 ) ) ( ( rule__Argues__Group_4__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5437:1: ( ( rule__Argues__Group_4__0 ) ) ( ( rule__Argues__Group_4__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5437:1: ( ( rule__Argues__Group_4__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5438:1: ( rule__Argues__Group_4__0 )
            {
             before(grammarAccess.getArguesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5439:1: ( rule__Argues__Group_4__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5439:2: rule__Argues__Group_4__0
            {
            pushFollow(FOLLOW_rule__Argues__Group_4__0_in_rule__Argues__Group__4__Impl10990);
            rule__Argues__Group_4__0();
            _fsp--;


            }

             after(grammarAccess.getArguesAccess().getGroup_4()); 

            }

            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5442:1: ( ( rule__Argues__Group_4__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5443:1: ( rule__Argues__Group_4__0 )*
            {
             before(grammarAccess.getArguesAccess().getGroup_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5444:1: ( rule__Argues__Group_4__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==31) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5444:2: rule__Argues__Group_4__0
            	    {
            	    pushFollow(FOLLOW_rule__Argues__Group_4__0_in_rule__Argues__Group__4__Impl11002);
            	    rule__Argues__Group_4__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getArguesAccess().getGroup_4()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__4__Impl


    // $ANTLR start rule__Argues__Group__5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5455:1: rule__Argues__Group__5 : rule__Argues__Group__5__Impl ;
    public final void rule__Argues__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5459:1: ( rule__Argues__Group__5__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5460:2: rule__Argues__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Argues__Group__5__Impl_in_rule__Argues__Group__511035);
            rule__Argues__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__5


    // $ANTLR start rule__Argues__Group__5__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5466:1: rule__Argues__Group__5__Impl : ( ')' ) ;
    public final void rule__Argues__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5470:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5471:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5471:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5472:1: ')'
            {
             before(grammarAccess.getArguesAccess().getRightParenthesisKeyword_5()); 
            match(input,43,FOLLOW_43_in_rule__Argues__Group__5__Impl11063); 
             after(grammarAccess.getArguesAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group__5__Impl


    // $ANTLR start rule__Argues__Group_4__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5497:1: rule__Argues__Group_4__0 : rule__Argues__Group_4__0__Impl rule__Argues__Group_4__1 ;
    public final void rule__Argues__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5501:1: ( rule__Argues__Group_4__0__Impl rule__Argues__Group_4__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5502:2: rule__Argues__Group_4__0__Impl rule__Argues__Group_4__1
            {
            pushFollow(FOLLOW_rule__Argues__Group_4__0__Impl_in_rule__Argues__Group_4__011106);
            rule__Argues__Group_4__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group_4__1_in_rule__Argues__Group_4__011109);
            rule__Argues__Group_4__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group_4__0


    // $ANTLR start rule__Argues__Group_4__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5509:1: rule__Argues__Group_4__0__Impl : ( ',' ) ;
    public final void rule__Argues__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5513:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5514:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5514:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5515:1: ','
            {
             before(grammarAccess.getArguesAccess().getCommaKeyword_4_0()); 
            match(input,31,FOLLOW_31_in_rule__Argues__Group_4__0__Impl11137); 
             after(grammarAccess.getArguesAccess().getCommaKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group_4__0__Impl


    // $ANTLR start rule__Argues__Group_4__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5528:1: rule__Argues__Group_4__1 : rule__Argues__Group_4__1__Impl ;
    public final void rule__Argues__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5532:1: ( rule__Argues__Group_4__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5533:2: rule__Argues__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Argues__Group_4__1__Impl_in_rule__Argues__Group_4__111168);
            rule__Argues__Group_4__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group_4__1


    // $ANTLR start rule__Argues__Group_4__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5539:1: rule__Argues__Group_4__1__Impl : ( ( rule__Argues__ThingsAssignment_4_1 ) ) ;
    public final void rule__Argues__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5543:1: ( ( ( rule__Argues__ThingsAssignment_4_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5544:1: ( ( rule__Argues__ThingsAssignment_4_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5544:1: ( ( rule__Argues__ThingsAssignment_4_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5545:1: ( rule__Argues__ThingsAssignment_4_1 )
            {
             before(grammarAccess.getArguesAccess().getThingsAssignment_4_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5546:1: ( rule__Argues__ThingsAssignment_4_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5546:2: rule__Argues__ThingsAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Argues__ThingsAssignment_4_1_in_rule__Argues__Group_4__1__Impl11195);
            rule__Argues__ThingsAssignment_4_1();
            _fsp--;


            }

             after(grammarAccess.getArguesAccess().getThingsAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__Group_4__1__Impl


    // $ANTLR start rule__Situation__TimeAssignment_0_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5561:1: rule__Situation__TimeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Situation__TimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5565:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5566:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5566:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5567:1: RULE_ID
            {
             before(grammarAccess.getSituationAccess().getTimeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_111234); 
             after(grammarAccess.getSituationAccess().getTimeIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__TimeAssignment_0_1


    // $ANTLR start rule__Situation__WorldAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5576:1: rule__Situation__WorldAssignment_1 : ( ruleWorld ) ;
    public final void rule__Situation__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5580:1: ( ( ruleWorld ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5581:1: ( ruleWorld )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5581:1: ( ruleWorld )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5582:1: ruleWorld
            {
             before(grammarAccess.getSituationAccess().getWorldWorldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_111265);
            ruleWorld();
            _fsp--;

             after(grammarAccess.getSituationAccess().getWorldWorldParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__WorldAssignment_1


    // $ANTLR start rule__World__EntitiesAssignment_1_0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5591:1: rule__World__EntitiesAssignment_1_0 : ( ruleEntity ) ;
    public final void rule__World__EntitiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5595:1: ( ( ruleEntity ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5596:1: ( ruleEntity )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5596:1: ( ruleEntity )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5597:1: ruleEntity
            {
             before(grammarAccess.getWorldAccess().getEntitiesEntityParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__World__EntitiesAssignment_1_011296);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getWorldAccess().getEntitiesEntityParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__EntitiesAssignment_1_0


    // $ANTLR start rule__World__DomainsAssignment_1_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5606:1: rule__World__DomainsAssignment_1_1 : ( ruleDomain ) ;
    public final void rule__World__DomainsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5610:1: ( ( ruleDomain ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5611:1: ( ruleDomain )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5611:1: ( ruleDomain )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5612:1: ruleDomain
            {
             before(grammarAccess.getWorldAccess().getDomainsDomainParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDomain_in_rule__World__DomainsAssignment_1_111327);
            ruleDomain();
            _fsp--;

             after(grammarAccess.getWorldAccess().getDomainsDomainParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__DomainsAssignment_1_1


    // $ANTLR start rule__World__RelationshipsAssignment_1_2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5621:1: rule__World__RelationshipsAssignment_1_2 : ( ruleRelationship ) ;
    public final void rule__World__RelationshipsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5625:1: ( ( ruleRelationship ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5626:1: ( ruleRelationship )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5626:1: ( ruleRelationship )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5627:1: ruleRelationship
            {
             before(grammarAccess.getWorldAccess().getRelationshipsRelationshipParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__World__RelationshipsAssignment_1_211358);
            ruleRelationship();
            _fsp--;

             after(grammarAccess.getWorldAccess().getRelationshipsRelationshipParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__RelationshipsAssignment_1_2


    // $ANTLR start rule__Event__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5636:1: rule__Event__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5640:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5641:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5641:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5642:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_111389); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Event__NameAssignment_1


    // $ANTLR start rule__Proposition__TypeAssignment_0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5654:1: rule__Proposition__TypeAssignment_0 : ( rulePropositionType ) ;
    public final void rule__Proposition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5658:1: ( ( rulePropositionType ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5659:1: ( rulePropositionType )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5659:1: ( rulePropositionType )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5660:1: rulePropositionType
            {
             before(grammarAccess.getPropositionAccess().getTypePropositionTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePropositionType_in_rule__Proposition__TypeAssignment_011423);
            rulePropositionType();
            _fsp--;

             after(grammarAccess.getPropositionAccess().getTypePropositionTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proposition__TypeAssignment_0


    // $ANTLR start rule__Proposition__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5669:1: rule__Proposition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Proposition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5673:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5674:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5674:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5675:1: RULE_ID
            {
             before(grammarAccess.getPropositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Proposition__NameAssignment_111454); 
             after(grammarAccess.getPropositionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proposition__NameAssignment_1


    // $ANTLR start rule__Domain__TypeAssignment_0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5684:1: rule__Domain__TypeAssignment_0 : ( ruleDomainType ) ;
    public final void rule__Domain__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5688:1: ( ( ruleDomainType ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5689:1: ( ruleDomainType )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5689:1: ( ruleDomainType )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5690:1: ruleDomainType
            {
             before(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDomainType_in_rule__Domain__TypeAssignment_011485);
            ruleDomainType();
            _fsp--;

             after(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__TypeAssignment_0


    // $ANTLR start rule__Domain__PropertiesAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5699:1: rule__Domain__PropertiesAssignment_1 : ( ruleProposition ) ;
    public final void rule__Domain__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5703:1: ( ( ruleProposition ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5704:1: ( ruleProposition )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5704:1: ( ruleProposition )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5705:1: ruleProposition
            {
             before(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_111516);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__PropertiesAssignment_1


    // $ANTLR start rule__Domain__PropertiesAssignment_2_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5714:1: rule__Domain__PropertiesAssignment_2_1 : ( ruleProposition ) ;
    public final void rule__Domain__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5718:1: ( ( ruleProposition ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5719:1: ( ruleProposition )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5719:1: ( ruleProposition )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5720:1: ruleProposition
            {
             before(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_2_111547);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__PropertiesAssignment_2_1


    // $ANTLR start rule__Stakeholder__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5729:1: rule__Stakeholder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Stakeholder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5733:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5734:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5734:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5735:1: RULE_ID
            {
             before(grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Stakeholder__NameAssignment_111578); 
             after(grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Stakeholder__NameAssignment_1


    // $ANTLR start rule__Attacker__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5744:1: rule__Attacker__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attacker__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5748:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5749:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5749:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5750:1: RULE_ID
            {
             before(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_111609); 
             after(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__NameAssignment_1


    // $ANTLR start rule__NaturalProcess__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5759:1: rule__NaturalProcess__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NaturalProcess__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5763:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5764:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5764:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5765:1: RULE_ID
            {
             before(grammarAccess.getNaturalProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NaturalProcess__NameAssignment_111640); 
             after(grammarAccess.getNaturalProcessAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__NameAssignment_1


    // $ANTLR start rule__NaturalProcess__ActivitiesAssignment_2_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5774:1: rule__NaturalProcess__ActivitiesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__NaturalProcess__ActivitiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5778:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5779:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5779:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5780:1: ( RULE_ID )
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesProcessCrossReference_2_1_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5781:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5782:1: RULE_ID
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesProcessIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NaturalProcess__ActivitiesAssignment_2_111675); 
             after(grammarAccess.getNaturalProcessAccess().getActivitiesProcessIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getNaturalProcessAccess().getActivitiesProcessCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NaturalProcess__ActivitiesAssignment_2_1


    // $ANTLR start rule__HumanActivity__ActionsAssignment_2
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5793:1: rule__HumanActivity__ActionsAssignment_2 : ( ruleAction ) ;
    public final void rule__HumanActivity__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5797:1: ( ( ruleAction ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5798:1: ( ruleAction )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5798:1: ( ruleAction )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5799:1: ruleAction
            {
             before(grammarAccess.getHumanActivityAccess().getActionsActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__HumanActivity__ActionsAssignment_211710);
            ruleAction();
            _fsp--;

             after(grammarAccess.getHumanActivityAccess().getActionsActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__ActionsAssignment_2


    // $ANTLR start rule__Action__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5808:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5812:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5813:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5813:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5814:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_111741); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__NameAssignment_1


    // $ANTLR start rule__Resource__NameAssignment_0_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5823:1: rule__Resource__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5827:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5828:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5828:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5829:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_0_111772); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__NameAssignment_0_1


    // $ANTLR start rule__Asset__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5838:1: rule__Asset__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5842:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5843:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5843:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5844:1: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_111803); 
             after(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__NameAssignment_1


    // $ANTLR start rule__Wants__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5853:1: rule__Wants__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Wants__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5857:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5858:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5858:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5859:1: RULE_ID
            {
             before(grammarAccess.getWantsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Wants__NameAssignment_111834); 
             after(grammarAccess.getWantsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__NameAssignment_1


    // $ANTLR start rule__Wants__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5868:1: rule__Wants__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Wants__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5872:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5873:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5873:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5874:1: ( RULE_ID )
            {
             before(grammarAccess.getWantsAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5875:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5876:1: RULE_ID
            {
             before(grammarAccess.getWantsAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Wants__ThingsAssignment_311869); 
             after(grammarAccess.getWantsAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWantsAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__ThingsAssignment_3


    // $ANTLR start rule__Wants__ThingsAssignment_5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5887:1: rule__Wants__ThingsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Wants__ThingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5891:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5892:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5892:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5893:1: ( RULE_ID )
            {
             before(grammarAccess.getWantsAccess().getThingsThingCrossReference_5_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5894:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5895:1: RULE_ID
            {
             before(grammarAccess.getWantsAccess().getThingsThingIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Wants__ThingsAssignment_511908); 
             after(grammarAccess.getWantsAccess().getThingsThingIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWantsAccess().getThingsThingCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__ThingsAssignment_5


    // $ANTLR start rule__Does__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5906:1: rule__Does__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Does__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5910:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5911:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5911:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5912:1: RULE_ID
            {
             before(grammarAccess.getDoesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Does__NameAssignment_111943); 
             after(grammarAccess.getDoesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__NameAssignment_1


    // $ANTLR start rule__Does__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5921:1: rule__Does__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Does__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5925:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5926:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5926:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5927:1: ( RULE_ID )
            {
             before(grammarAccess.getDoesAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5928:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5929:1: RULE_ID
            {
             before(grammarAccess.getDoesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Does__ThingsAssignment_311978); 
             after(grammarAccess.getDoesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDoesAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__ThingsAssignment_3


    // $ANTLR start rule__Does__ThingsAssignment_5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5940:1: rule__Does__ThingsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Does__ThingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5944:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5945:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5945:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5946:1: ( RULE_ID )
            {
             before(grammarAccess.getDoesAccess().getThingsThingCrossReference_5_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5947:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5948:1: RULE_ID
            {
             before(grammarAccess.getDoesAccess().getThingsThingIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Does__ThingsAssignment_512017); 
             after(grammarAccess.getDoesAccess().getThingsThingIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDoesAccess().getThingsThingCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__ThingsAssignment_5


    // $ANTLR start rule__Decomposes__TypeAssignment_0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5959:1: rule__Decomposes__TypeAssignment_0 : ( ruleDecompositionLabel ) ;
    public final void rule__Decomposes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5963:1: ( ( ruleDecompositionLabel ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5964:1: ( ruleDecompositionLabel )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5964:1: ( ruleDecompositionLabel )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5965:1: ruleDecompositionLabel
            {
             before(grammarAccess.getDecomposesAccess().getTypeDecompositionLabelEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDecompositionLabel_in_rule__Decomposes__TypeAssignment_012052);
            ruleDecompositionLabel();
            _fsp--;

             after(grammarAccess.getDecomposesAccess().getTypeDecompositionLabelEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__TypeAssignment_0


    // $ANTLR start rule__Decomposes__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5974:1: rule__Decomposes__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Decomposes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5978:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5979:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5979:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5980:1: RULE_ID
            {
             before(grammarAccess.getDecomposesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decomposes__NameAssignment_112083); 
             after(grammarAccess.getDecomposesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__NameAssignment_1


    // $ANTLR start rule__Decomposes__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5989:1: rule__Decomposes__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Decomposes__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5993:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5994:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5994:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5995:1: ( RULE_ID )
            {
             before(grammarAccess.getDecomposesAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5996:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:5997:1: RULE_ID
            {
             before(grammarAccess.getDecomposesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decomposes__ThingsAssignment_312118); 
             after(grammarAccess.getDecomposesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDecomposesAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__ThingsAssignment_3


    // $ANTLR start rule__Decomposes__ThingsAssignment_4_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6008:1: rule__Decomposes__ThingsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Decomposes__ThingsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6012:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6013:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6013:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6014:1: ( RULE_ID )
            {
             before(grammarAccess.getDecomposesAccess().getThingsThingCrossReference_4_1_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6015:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6016:1: RULE_ID
            {
             before(grammarAccess.getDecomposesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decomposes__ThingsAssignment_4_112157); 
             after(grammarAccess.getDecomposesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getDecomposesAccess().getThingsThingCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__ThingsAssignment_4_1


    // $ANTLR start rule__Contributes__TypeAssignment_0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6027:1: rule__Contributes__TypeAssignment_0 : ( ruleContributionLabel ) ;
    public final void rule__Contributes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6031:1: ( ( ruleContributionLabel ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6032:1: ( ruleContributionLabel )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6032:1: ( ruleContributionLabel )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6033:1: ruleContributionLabel
            {
             before(grammarAccess.getContributesAccess().getTypeContributionLabelEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleContributionLabel_in_rule__Contributes__TypeAssignment_012192);
            ruleContributionLabel();
            _fsp--;

             after(grammarAccess.getContributesAccess().getTypeContributionLabelEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__TypeAssignment_0


    // $ANTLR start rule__Contributes__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6042:1: rule__Contributes__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Contributes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6046:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6047:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6047:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6048:1: RULE_ID
            {
             before(grammarAccess.getContributesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Contributes__NameAssignment_112223); 
             after(grammarAccess.getContributesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__NameAssignment_1


    // $ANTLR start rule__Contributes__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6057:1: rule__Contributes__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Contributes__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6061:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6062:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6062:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6063:1: ( RULE_ID )
            {
             before(grammarAccess.getContributesAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6064:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6065:1: RULE_ID
            {
             before(grammarAccess.getContributesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Contributes__ThingsAssignment_312258); 
             after(grammarAccess.getContributesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getContributesAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__ThingsAssignment_3


    // $ANTLR start rule__Contributes__ThingsAssignment_4_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6076:1: rule__Contributes__ThingsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Contributes__ThingsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6080:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6081:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6081:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6082:1: ( RULE_ID )
            {
             before(grammarAccess.getContributesAccess().getThingsThingCrossReference_4_1_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6083:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6084:1: RULE_ID
            {
             before(grammarAccess.getContributesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Contributes__ThingsAssignment_4_112297); 
             after(grammarAccess.getContributesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getContributesAccess().getThingsThingCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__ThingsAssignment_4_1


    // $ANTLR start rule__Fulfils__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6095:1: rule__Fulfils__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Fulfils__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6099:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6100:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6100:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6101:1: RULE_ID
            {
             before(grammarAccess.getFulfilsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fulfils__NameAssignment_112332); 
             after(grammarAccess.getFulfilsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__NameAssignment_1


    // $ANTLR start rule__Fulfils__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6110:1: rule__Fulfils__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Fulfils__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6114:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6115:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6115:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6116:1: ( RULE_ID )
            {
             before(grammarAccess.getFulfilsAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6117:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6118:1: RULE_ID
            {
             before(grammarAccess.getFulfilsAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fulfils__ThingsAssignment_312367); 
             after(grammarAccess.getFulfilsAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getFulfilsAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__ThingsAssignment_3


    // $ANTLR start rule__Fulfils__ThingsAssignment_4_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6129:1: rule__Fulfils__ThingsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Fulfils__ThingsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6133:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6134:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6134:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6135:1: ( RULE_ID )
            {
             before(grammarAccess.getFulfilsAccess().getThingsThingCrossReference_4_1_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6136:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6137:1: RULE_ID
            {
             before(grammarAccess.getFulfilsAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fulfils__ThingsAssignment_4_112406); 
             after(grammarAccess.getFulfilsAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getFulfilsAccess().getThingsThingCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__ThingsAssignment_4_1


    // $ANTLR start rule__Depends__KindAssignment_0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6148:1: rule__Depends__KindAssignment_0 : ( ruleDependencyType ) ;
    public final void rule__Depends__KindAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6152:1: ( ( ruleDependencyType ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6153:1: ( ruleDependencyType )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6153:1: ( ruleDependencyType )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6154:1: ruleDependencyType
            {
             before(grammarAccess.getDependsAccess().getKindDependencyTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDependencyType_in_rule__Depends__KindAssignment_012441);
            ruleDependencyType();
            _fsp--;

             after(grammarAccess.getDependsAccess().getKindDependencyTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__KindAssignment_0


    // $ANTLR start rule__Depends__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6163:1: rule__Depends__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Depends__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6167:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6168:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6168:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6169:1: RULE_ID
            {
             before(grammarAccess.getDependsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Depends__NameAssignment_112472); 
             after(grammarAccess.getDependsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__NameAssignment_1


    // $ANTLR start rule__Depends__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6178:1: rule__Depends__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Depends__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6182:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6183:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6183:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6184:1: ( RULE_ID )
            {
             before(grammarAccess.getDependsAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6185:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6186:1: RULE_ID
            {
             before(grammarAccess.getDependsAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Depends__ThingsAssignment_312507); 
             after(grammarAccess.getDependsAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDependsAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__ThingsAssignment_3


    // $ANTLR start rule__Depends__ThingsAssignment_5
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6197:1: rule__Depends__ThingsAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__Depends__ThingsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6201:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6202:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6202:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6203:1: ( RULE_ID )
            {
             before(grammarAccess.getDependsAccess().getThingsThingCrossReference_5_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6204:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6205:1: RULE_ID
            {
             before(grammarAccess.getDependsAccess().getThingsThingIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Depends__ThingsAssignment_512546); 
             after(grammarAccess.getDependsAccess().getThingsThingIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDependsAccess().getThingsThingCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__ThingsAssignment_5


    // $ANTLR start rule__Depends__ThingsAssignment_7
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6216:1: rule__Depends__ThingsAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__Depends__ThingsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6220:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6221:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6221:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6222:1: ( RULE_ID )
            {
             before(grammarAccess.getDependsAccess().getThingsThingCrossReference_7_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6223:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6224:1: RULE_ID
            {
             before(grammarAccess.getDependsAccess().getThingsThingIDTerminalRuleCall_7_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Depends__ThingsAssignment_712585); 
             after(grammarAccess.getDependsAccess().getThingsThingIDTerminalRuleCall_7_0_1()); 

            }

             after(grammarAccess.getDependsAccess().getThingsThingCrossReference_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Depends__ThingsAssignment_7


    // $ANTLR start rule__Provides__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6235:1: rule__Provides__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Provides__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6239:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6240:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6240:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6241:1: RULE_ID
            {
             before(grammarAccess.getProvidesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provides__NameAssignment_112620); 
             after(grammarAccess.getProvidesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__NameAssignment_1


    // $ANTLR start rule__Provides__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6250:1: rule__Provides__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Provides__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6254:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6255:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6255:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6256:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidesAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6257:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6258:1: RULE_ID
            {
             before(grammarAccess.getProvidesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provides__ThingsAssignment_312655); 
             after(grammarAccess.getProvidesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getProvidesAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__ThingsAssignment_3


    // $ANTLR start rule__Provides__ThingsAssignment_4_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6269:1: rule__Provides__ThingsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Provides__ThingsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6273:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6274:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6274:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6275:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidesAccess().getThingsThingCrossReference_4_1_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6276:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6277:1: RULE_ID
            {
             before(grammarAccess.getProvidesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provides__ThingsAssignment_4_112694); 
             after(grammarAccess.getProvidesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getProvidesAccess().getThingsThingCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__ThingsAssignment_4_1


    // $ANTLR start rule__Consumes__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6288:1: rule__Consumes__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Consumes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6292:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6293:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6293:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6294:1: RULE_ID
            {
             before(grammarAccess.getConsumesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consumes__NameAssignment_112729); 
             after(grammarAccess.getConsumesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__NameAssignment_1


    // $ANTLR start rule__Consumes__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6303:1: rule__Consumes__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Consumes__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6307:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6308:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6308:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6309:1: ( RULE_ID )
            {
             before(grammarAccess.getConsumesAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6310:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6311:1: RULE_ID
            {
             before(grammarAccess.getConsumesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consumes__ThingsAssignment_312764); 
             after(grammarAccess.getConsumesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConsumesAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__ThingsAssignment_3


    // $ANTLR start rule__Consumes__ThingsAssignment_4_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6322:1: rule__Consumes__ThingsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Consumes__ThingsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6326:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6327:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6327:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6328:1: ( RULE_ID )
            {
             before(grammarAccess.getConsumesAccess().getThingsThingCrossReference_4_1_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6329:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6330:1: RULE_ID
            {
             before(grammarAccess.getConsumesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consumes__ThingsAssignment_4_112803); 
             after(grammarAccess.getConsumesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getConsumesAccess().getThingsThingCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__ThingsAssignment_4_1


    // $ANTLR start rule__Exploits__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6341:1: rule__Exploits__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Exploits__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6345:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6346:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6346:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6347:1: RULE_ID
            {
             before(grammarAccess.getExploitsAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exploits__NameAssignment_112838); 
             after(grammarAccess.getExploitsAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__NameAssignment_1


    // $ANTLR start rule__Exploits__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6356:1: rule__Exploits__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Exploits__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6360:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6361:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6361:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6362:1: ( RULE_ID )
            {
             before(grammarAccess.getExploitsAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6363:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6364:1: RULE_ID
            {
             before(grammarAccess.getExploitsAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exploits__ThingsAssignment_312873); 
             after(grammarAccess.getExploitsAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getExploitsAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__ThingsAssignment_3


    // $ANTLR start rule__Exploits__ThingsAssignment_4_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6375:1: rule__Exploits__ThingsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Exploits__ThingsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6379:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6380:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6380:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6381:1: ( RULE_ID )
            {
             before(grammarAccess.getExploitsAccess().getThingsThingCrossReference_4_1_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6382:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6383:1: RULE_ID
            {
             before(grammarAccess.getExploitsAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exploits__ThingsAssignment_4_112912); 
             after(grammarAccess.getExploitsAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getExploitsAccess().getThingsThingCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__ThingsAssignment_4_1


    // $ANTLR start rule__Damages__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6394:1: rule__Damages__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Damages__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6398:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6399:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6399:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6400:1: RULE_ID
            {
             before(grammarAccess.getDamagesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Damages__NameAssignment_112947); 
             after(grammarAccess.getDamagesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__NameAssignment_1


    // $ANTLR start rule__Damages__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6409:1: rule__Damages__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Damages__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6413:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6414:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6414:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6415:1: ( RULE_ID )
            {
             before(grammarAccess.getDamagesAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6416:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6417:1: RULE_ID
            {
             before(grammarAccess.getDamagesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Damages__ThingsAssignment_312982); 
             after(grammarAccess.getDamagesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDamagesAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__ThingsAssignment_3


    // $ANTLR start rule__Damages__ThingsAssignment_4_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6428:1: rule__Damages__ThingsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Damages__ThingsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6432:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6433:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6433:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6434:1: ( RULE_ID )
            {
             before(grammarAccess.getDamagesAccess().getThingsThingCrossReference_4_1_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6435:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6436:1: RULE_ID
            {
             before(grammarAccess.getDamagesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Damages__ThingsAssignment_4_113021); 
             after(grammarAccess.getDamagesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getDamagesAccess().getThingsThingCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__ThingsAssignment_4_1


    // $ANTLR start rule__Attack__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6447:1: rule__Attack__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attack__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6451:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6452:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6452:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6453:1: RULE_ID
            {
             before(grammarAccess.getAttackAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attack__NameAssignment_113056); 
             after(grammarAccess.getAttackAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__NameAssignment_1


    // $ANTLR start rule__Attack__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6462:1: rule__Attack__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Attack__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6466:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6467:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6467:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6468:1: ( RULE_ID )
            {
             before(grammarAccess.getAttackAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6469:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6470:1: RULE_ID
            {
             before(grammarAccess.getAttackAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attack__ThingsAssignment_313091); 
             after(grammarAccess.getAttackAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAttackAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__ThingsAssignment_3


    // $ANTLR start rule__Attack__ThingsAssignment_4_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6481:1: rule__Attack__ThingsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Attack__ThingsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6485:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6486:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6486:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6487:1: ( RULE_ID )
            {
             before(grammarAccess.getAttackAccess().getThingsThingCrossReference_4_1_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6488:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6489:1: RULE_ID
            {
             before(grammarAccess.getAttackAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attack__ThingsAssignment_4_113130); 
             after(grammarAccess.getAttackAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getAttackAccess().getThingsThingCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attack__ThingsAssignment_4_1


    // $ANTLR start rule__Argues__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6500:1: rule__Argues__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argues__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6504:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6505:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6505:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6506:1: RULE_ID
            {
             before(grammarAccess.getArguesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argues__NameAssignment_113165); 
             after(grammarAccess.getArguesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__NameAssignment_1


    // $ANTLR start rule__Argues__ThingsAssignment_3
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6515:1: rule__Argues__ThingsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Argues__ThingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6519:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6520:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6520:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6521:1: ( RULE_ID )
            {
             before(grammarAccess.getArguesAccess().getThingsThingCrossReference_3_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6522:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6523:1: RULE_ID
            {
             before(grammarAccess.getArguesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argues__ThingsAssignment_313200); 
             after(grammarAccess.getArguesAccess().getThingsThingIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getArguesAccess().getThingsThingCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__ThingsAssignment_3


    // $ANTLR start rule__Argues__ThingsAssignment_4_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6534:1: rule__Argues__ThingsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__Argues__ThingsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6538:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6539:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6539:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6540:1: ( RULE_ID )
            {
             before(grammarAccess.getArguesAccess().getThingsThingCrossReference_4_1_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6541:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:6542:1: RULE_ID
            {
             before(grammarAccess.getArguesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argues__ThingsAssignment_4_113239); 
             after(grammarAccess.getArguesAccess().getThingsThingIDTerminalRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getArguesAccess().getThingsThingCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__ThingsAssignment_4_1


 

    public static final BitSet FOLLOW_ruleSituation_in_entryRuleSituation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__0_in_ruleSituation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_entryRuleWorld121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorld128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__0_in_ruleWorld154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvent_in_entryRuleEvent183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvent190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0_in_ruleEvent216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObject_in_entryRuleObject243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObject250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Object__Alternatives_in_ruleObject276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__Group__0_in_ruleProposition340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_in_ruleEntity400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Alternatives_in_ruleActor520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder547 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__0_in_ruleStakeholder580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker607 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0_in_ruleAttacker640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess667 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_in_ruleProcess700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalProcess734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__0_in_ruleNaturalProcess760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHumanActivity794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__0_in_ruleHumanActivity820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction847 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Alternatives_in_ruleResource940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0_in_ruleAsset1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship1027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship1034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship1060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_entryRuleWants1087 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWants1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__0_in_ruleWants1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_entryRuleDoes1147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoes1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__0_in_ruleDoes1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_entryRuleDecomposes1207 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposes1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__0_in_ruleDecomposes1240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_entryRuleContributes1267 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributes1274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__0_in_ruleContributes1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_entryRuleFulfils1327 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFulfils1334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__0_in_ruleFulfils1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDepends_in_entryRuleDepends1387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDepends1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__Group__0_in_ruleDepends1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_entryRuleProvides1447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvides1454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__0_in_ruleProvides1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_entryRuleConsumes1507 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsumes1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__0_in_ruleConsumes1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_entryRuleExploits1567 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploits1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__0_in_ruleExploits1600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_entryRuleDamages1627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDamages1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__0_in_ruleDamages1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttack_in_entryRuleAttack1687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttack1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__Group__0_in_ruleAttack1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_entryRuleArgues1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgues1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__0_in_ruleArgues1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionType__Alternatives_in_rulePropositionType1817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainType__Alternatives_in_ruleDomainType1853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecompositionLabel__Alternatives_in_ruleDecompositionLabel1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContributionLabel__Alternatives_in_ruleContributionLabel1925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DependencyType__Alternatives_in_ruleDependencyType1961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__EntitiesAssignment_1_0_in_rule__World__Alternatives_11996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__DomainsAssignment_1_1_in_rule__World__Alternatives_12014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__RelationshipsAssignment_1_2_in_rule__World__Alternatives_12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Object__Alternatives2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Object__Alternatives2083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Object__Alternatives2100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__Entity__Alternatives2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__Entity__Alternatives2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Entity__Alternatives2167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_rule__Actor__Alternatives2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_rule__Actor__Alternatives2216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_rule__Process__Alternatives2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_rule__Process__Alternatives2265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__0_in_rule__Resource__Alternatives2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Resource__Alternatives2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_rule__Relationship__Alternatives2347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_rule__Relationship__Alternatives2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_rule__Relationship__Alternatives2381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_rule__Relationship__Alternatives2398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_rule__Relationship__Alternatives2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_rule__Relationship__Alternatives2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_rule__Relationship__Alternatives2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDepends_in_rule__Relationship__Alternatives2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_rule__Relationship__Alternatives2483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_rule__Relationship__Alternatives2500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttack_in_rule__Relationship__Alternatives2517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_rule__Relationship__Alternatives2534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PropositionType__Alternatives2567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PropositionType__Alternatives2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PropositionType__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PropositionType__Alternatives2630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PropositionType__Alternatives2651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PropositionType__Alternatives2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__DomainType__Alternatives2708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__DomainType__Alternatives2729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__DomainType__Alternatives2750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__DecompositionLabel__Alternatives2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DecompositionLabel__Alternatives2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__ContributionLabel__Alternatives2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ContributionLabel__Alternatives2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ContributionLabel__Alternatives2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContributionLabel__Alternatives2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DependencyType__Alternatives2942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DependencyType__Alternatives2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__02996 = new BitSet(new long[]{0x000FF3A70FFE0002L});
    public static final BitSet FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__02999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__13057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl3084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__03118 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__03121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Situation__Group_0__0__Impl3149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__13180 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__13183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__23240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Situation__Group_0__2__Impl3268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__03305 = new BitSet(new long[]{0x000FF3A70FFE0002L});
    public static final BitSet FOLLOW_rule__World__Group__1_in_rule__World__Group__03308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__13366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Alternatives_1_in_rule__World__Group__1__Impl3393 = new BitSet(new long[]{0x000FF3A70FFE0002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03428 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Event__Group__0__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl3517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__Group__0__Impl_in_rule__Proposition__Group__03553 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Proposition__Group__1_in_rule__Proposition__Group__03556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__TypeAssignment_0_in_rule__Proposition__Group__0__Impl3583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__Group__1__Impl_in_rule__Proposition__Group__13613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__NameAssignment_1_in_rule__Proposition__Group__1__Impl3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03674 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__TypeAssignment_0_in_rule__Domain__Group__0__Impl3704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13734 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_1_in_rule__Domain__Group__1__Impl3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_2__0_in_rule__Domain__Group__2__Impl3821 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_2__0__Impl_in_rule__Domain__Group_2__03858 = new BitSet(new long[]{0x000000000001F800L});
    public static final BitSet FOLLOW_rule__Domain__Group_2__1_in_rule__Domain__Group_2__03861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Domain__Group_2__0__Impl3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_2__1__Impl_in_rule__Domain__Group_2__13920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_2_1_in_rule__Domain__Group_2__1__Impl3947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__0__Impl_in_rule__Stakeholder__Group__03981 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__1_in_rule__Stakeholder__Group__03984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Stakeholder__Group__0__Impl4012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__1__Impl_in_rule__Stakeholder__Group__14043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__NameAssignment_1_in_rule__Stakeholder__Group__1__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__04104 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__04107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Attacker__Group__0__Impl4135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__14166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__NameAssignment_1_in_rule__Attacker__Group__1__Impl4193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__0__Impl_in_rule__NaturalProcess__Group__04227 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__1_in_rule__NaturalProcess__Group__04230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NaturalProcess__Group__0__Impl4258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__1__Impl_in_rule__NaturalProcess__Group__14289 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__2_in_rule__NaturalProcess__Group__14292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__NameAssignment_1_in_rule__NaturalProcess__Group__1__Impl4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__2__Impl_in_rule__NaturalProcess__Group__24349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__0_in_rule__NaturalProcess__Group__2__Impl4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__0__Impl_in_rule__NaturalProcess__Group_2__04413 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__1_in_rule__NaturalProcess__Group_2__04416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NaturalProcess__Group_2__0__Impl4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__1__Impl_in_rule__NaturalProcess__Group_2__14475 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__2_in_rule__NaturalProcess__Group_2__14478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__ActivitiesAssignment_2_1_in_rule__NaturalProcess__Group_2__1__Impl4505 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__2__Impl_in_rule__NaturalProcess__Group_2__24536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__NaturalProcess__Group_2__2__Impl4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__0__Impl_in_rule__HumanActivity__Group__04601 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__1_in_rule__HumanActivity__Group__04604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__1__Impl_in_rule__HumanActivity__Group__14662 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__2_in_rule__HumanActivity__Group__14665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__HumanActivity__Group__1__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__2__Impl_in_rule__HumanActivity__Group__24724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__ActionsAssignment_2_in_rule__HumanActivity__Group__2__Impl4751 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04788 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Action__Group__0__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__0__Impl_in_rule__Resource__Group_0__04911 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__1_in_rule__Resource__Group_0__04914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Resource__Group_0__0__Impl4942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__1__Impl_in_rule__Resource__Group_0__14973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_0_1_in_rule__Resource__Group_0__1__Impl5000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__05034 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__05037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Asset__Group__0__Impl5065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__15096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl5123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__0__Impl_in_rule__Wants__Group__05157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wants__Group__1_in_rule__Wants__Group__05160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Wants__Group__0__Impl5188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__1__Impl_in_rule__Wants__Group__15219 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__2_in_rule__Wants__Group__15222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__NameAssignment_1_in_rule__Wants__Group__1__Impl5249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__2__Impl_in_rule__Wants__Group__25279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wants__Group__3_in_rule__Wants__Group__25282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Wants__Group__2__Impl5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__3__Impl_in_rule__Wants__Group__35341 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__4_in_rule__Wants__Group__35344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__ThingsAssignment_3_in_rule__Wants__Group__3__Impl5371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__4__Impl_in_rule__Wants__Group__45401 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wants__Group__5_in_rule__Wants__Group__45404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Wants__Group__4__Impl5432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__5__Impl_in_rule__Wants__Group__55463 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__6_in_rule__Wants__Group__55466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__ThingsAssignment_5_in_rule__Wants__Group__5__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__6__Impl_in_rule__Wants__Group__65523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Wants__Group__6__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__0__Impl_in_rule__Does__Group__05596 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Does__Group__1_in_rule__Does__Group__05599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Does__Group__0__Impl5627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__1__Impl_in_rule__Does__Group__15658 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Does__Group__2_in_rule__Does__Group__15661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__NameAssignment_1_in_rule__Does__Group__1__Impl5688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__2__Impl_in_rule__Does__Group__25718 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Does__Group__3_in_rule__Does__Group__25721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Does__Group__2__Impl5749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__3__Impl_in_rule__Does__Group__35780 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Does__Group__4_in_rule__Does__Group__35783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__ThingsAssignment_3_in_rule__Does__Group__3__Impl5810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__4__Impl_in_rule__Does__Group__45840 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Does__Group__5_in_rule__Does__Group__45843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Does__Group__4__Impl5871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__5__Impl_in_rule__Does__Group__55902 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Does__Group__6_in_rule__Does__Group__55905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__ThingsAssignment_5_in_rule__Does__Group__5__Impl5932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__6__Impl_in_rule__Does__Group__65962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Does__Group__6__Impl5990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__0__Impl_in_rule__Decomposes__Group__06035 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__1_in_rule__Decomposes__Group__06038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__TypeAssignment_0_in_rule__Decomposes__Group__0__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__1__Impl_in_rule__Decomposes__Group__16095 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__2_in_rule__Decomposes__Group__16098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__NameAssignment_1_in_rule__Decomposes__Group__1__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__2__Impl_in_rule__Decomposes__Group__26155 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__3_in_rule__Decomposes__Group__26158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Decomposes__Group__2__Impl6186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__3__Impl_in_rule__Decomposes__Group__36217 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__4_in_rule__Decomposes__Group__36220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__ThingsAssignment_3_in_rule__Decomposes__Group__3__Impl6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__4__Impl_in_rule__Decomposes__Group__46277 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__5_in_rule__Decomposes__Group__46280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group_4__0_in_rule__Decomposes__Group__4__Impl6309 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group_4__0_in_rule__Decomposes__Group__4__Impl6321 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__5__Impl_in_rule__Decomposes__Group__56354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Decomposes__Group__5__Impl6382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group_4__0__Impl_in_rule__Decomposes__Group_4__06425 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decomposes__Group_4__1_in_rule__Decomposes__Group_4__06428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Decomposes__Group_4__0__Impl6456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group_4__1__Impl_in_rule__Decomposes__Group_4__16487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__ThingsAssignment_4_1_in_rule__Decomposes__Group_4__1__Impl6514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__0__Impl_in_rule__Contributes__Group__06548 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Contributes__Group__1_in_rule__Contributes__Group__06551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__TypeAssignment_0_in_rule__Contributes__Group__0__Impl6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__1__Impl_in_rule__Contributes__Group__16608 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__2_in_rule__Contributes__Group__16611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__NameAssignment_1_in_rule__Contributes__Group__1__Impl6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__2__Impl_in_rule__Contributes__Group__26668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Contributes__Group__3_in_rule__Contributes__Group__26671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Contributes__Group__2__Impl6699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__3__Impl_in_rule__Contributes__Group__36730 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__4_in_rule__Contributes__Group__36733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__ThingsAssignment_3_in_rule__Contributes__Group__3__Impl6760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__4__Impl_in_rule__Contributes__Group__46790 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__5_in_rule__Contributes__Group__46793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group_4__0_in_rule__Contributes__Group__4__Impl6822 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group_4__0_in_rule__Contributes__Group__4__Impl6834 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__5__Impl_in_rule__Contributes__Group__56867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Contributes__Group__5__Impl6895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group_4__0__Impl_in_rule__Contributes__Group_4__06938 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Contributes__Group_4__1_in_rule__Contributes__Group_4__06941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Contributes__Group_4__0__Impl6969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group_4__1__Impl_in_rule__Contributes__Group_4__17000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__ThingsAssignment_4_1_in_rule__Contributes__Group_4__1__Impl7027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__0__Impl_in_rule__Fulfils__Group__07061 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__1_in_rule__Fulfils__Group__07064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Fulfils__Group__0__Impl7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__1__Impl_in_rule__Fulfils__Group__17123 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__2_in_rule__Fulfils__Group__17126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__NameAssignment_1_in_rule__Fulfils__Group__1__Impl7153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__2__Impl_in_rule__Fulfils__Group__27183 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__3_in_rule__Fulfils__Group__27186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Fulfils__Group__2__Impl7214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__3__Impl_in_rule__Fulfils__Group__37245 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__4_in_rule__Fulfils__Group__37248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__ThingsAssignment_3_in_rule__Fulfils__Group__3__Impl7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__4__Impl_in_rule__Fulfils__Group__47305 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__5_in_rule__Fulfils__Group__47308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group_4__0_in_rule__Fulfils__Group__4__Impl7337 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group_4__0_in_rule__Fulfils__Group__4__Impl7349 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__5__Impl_in_rule__Fulfils__Group__57382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Fulfils__Group__5__Impl7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group_4__0__Impl_in_rule__Fulfils__Group_4__07453 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fulfils__Group_4__1_in_rule__Fulfils__Group_4__07456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Fulfils__Group_4__0__Impl7484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group_4__1__Impl_in_rule__Fulfils__Group_4__17515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__ThingsAssignment_4_1_in_rule__Fulfils__Group_4__1__Impl7542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__Group__0__Impl_in_rule__Depends__Group__07576 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Depends__Group__1_in_rule__Depends__Group__07579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__KindAssignment_0_in_rule__Depends__Group__0__Impl7606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__Group__1__Impl_in_rule__Depends__Group__17636 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Depends__Group__2_in_rule__Depends__Group__17639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__NameAssignment_1_in_rule__Depends__Group__1__Impl7666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__Group__2__Impl_in_rule__Depends__Group__27696 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Depends__Group__3_in_rule__Depends__Group__27699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Depends__Group__2__Impl7727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__Group__3__Impl_in_rule__Depends__Group__37758 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Depends__Group__4_in_rule__Depends__Group__37761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__ThingsAssignment_3_in_rule__Depends__Group__3__Impl7788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__Group__4__Impl_in_rule__Depends__Group__47818 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Depends__Group__5_in_rule__Depends__Group__47821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Depends__Group__4__Impl7849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__Group__5__Impl_in_rule__Depends__Group__57880 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Depends__Group__6_in_rule__Depends__Group__57883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__ThingsAssignment_5_in_rule__Depends__Group__5__Impl7910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__Group__6__Impl_in_rule__Depends__Group__67940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Depends__Group__7_in_rule__Depends__Group__67943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Depends__Group__6__Impl7971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__Group__7__Impl_in_rule__Depends__Group__78002 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Depends__Group__8_in_rule__Depends__Group__78005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__ThingsAssignment_7_in_rule__Depends__Group__7__Impl8032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Depends__Group__8__Impl_in_rule__Depends__Group__88062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Depends__Group__8__Impl8090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__0__Impl_in_rule__Provides__Group__08139 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Provides__Group__1_in_rule__Provides__Group__08142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Provides__Group__0__Impl8170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__1__Impl_in_rule__Provides__Group__18201 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__2_in_rule__Provides__Group__18204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__NameAssignment_1_in_rule__Provides__Group__1__Impl8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__2__Impl_in_rule__Provides__Group__28261 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Provides__Group__3_in_rule__Provides__Group__28264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Provides__Group__2__Impl8292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__3__Impl_in_rule__Provides__Group__38323 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__4_in_rule__Provides__Group__38326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__ThingsAssignment_3_in_rule__Provides__Group__3__Impl8353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__4__Impl_in_rule__Provides__Group__48383 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__5_in_rule__Provides__Group__48386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group_4__0_in_rule__Provides__Group__4__Impl8415 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Provides__Group_4__0_in_rule__Provides__Group__4__Impl8427 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__5__Impl_in_rule__Provides__Group__58460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Provides__Group__5__Impl8488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group_4__0__Impl_in_rule__Provides__Group_4__08531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Provides__Group_4__1_in_rule__Provides__Group_4__08534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Provides__Group_4__0__Impl8562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group_4__1__Impl_in_rule__Provides__Group_4__18593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__ThingsAssignment_4_1_in_rule__Provides__Group_4__1__Impl8620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__0__Impl_in_rule__Consumes__Group__08654 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Consumes__Group__1_in_rule__Consumes__Group__08657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Consumes__Group__0__Impl8685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__1__Impl_in_rule__Consumes__Group__18716 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__2_in_rule__Consumes__Group__18719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__NameAssignment_1_in_rule__Consumes__Group__1__Impl8746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__2__Impl_in_rule__Consumes__Group__28776 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Consumes__Group__3_in_rule__Consumes__Group__28779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Consumes__Group__2__Impl8807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__3__Impl_in_rule__Consumes__Group__38838 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__4_in_rule__Consumes__Group__38841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__ThingsAssignment_3_in_rule__Consumes__Group__3__Impl8868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__4__Impl_in_rule__Consumes__Group__48898 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__5_in_rule__Consumes__Group__48901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group_4__0_in_rule__Consumes__Group__4__Impl8930 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group_4__0_in_rule__Consumes__Group__4__Impl8942 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__5__Impl_in_rule__Consumes__Group__58975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Consumes__Group__5__Impl9003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group_4__0__Impl_in_rule__Consumes__Group_4__09046 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Consumes__Group_4__1_in_rule__Consumes__Group_4__09049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Consumes__Group_4__0__Impl9077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group_4__1__Impl_in_rule__Consumes__Group_4__19108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__ThingsAssignment_4_1_in_rule__Consumes__Group_4__1__Impl9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__0__Impl_in_rule__Exploits__Group__09169 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exploits__Group__1_in_rule__Exploits__Group__09172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Exploits__Group__0__Impl9200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__1__Impl_in_rule__Exploits__Group__19231 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__2_in_rule__Exploits__Group__19234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__NameAssignment_1_in_rule__Exploits__Group__1__Impl9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__2__Impl_in_rule__Exploits__Group__29291 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exploits__Group__3_in_rule__Exploits__Group__29294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Exploits__Group__2__Impl9322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__3__Impl_in_rule__Exploits__Group__39353 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__4_in_rule__Exploits__Group__39356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__ThingsAssignment_3_in_rule__Exploits__Group__3__Impl9383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__4__Impl_in_rule__Exploits__Group__49413 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__5_in_rule__Exploits__Group__49416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group_4__0_in_rule__Exploits__Group__4__Impl9445 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group_4__0_in_rule__Exploits__Group__4__Impl9457 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__5__Impl_in_rule__Exploits__Group__59490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Exploits__Group__5__Impl9518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group_4__0__Impl_in_rule__Exploits__Group_4__09561 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exploits__Group_4__1_in_rule__Exploits__Group_4__09564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Exploits__Group_4__0__Impl9592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group_4__1__Impl_in_rule__Exploits__Group_4__19623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__ThingsAssignment_4_1_in_rule__Exploits__Group_4__1__Impl9650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__0__Impl_in_rule__Damages__Group__09684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Damages__Group__1_in_rule__Damages__Group__09687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Damages__Group__0__Impl9715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__1__Impl_in_rule__Damages__Group__19746 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__2_in_rule__Damages__Group__19749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__NameAssignment_1_in_rule__Damages__Group__1__Impl9776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__2__Impl_in_rule__Damages__Group__29806 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Damages__Group__3_in_rule__Damages__Group__29809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Damages__Group__2__Impl9837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__3__Impl_in_rule__Damages__Group__39868 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__4_in_rule__Damages__Group__39871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__ThingsAssignment_3_in_rule__Damages__Group__3__Impl9898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__4__Impl_in_rule__Damages__Group__49928 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__5_in_rule__Damages__Group__49931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group_4__0_in_rule__Damages__Group__4__Impl9960 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Damages__Group_4__0_in_rule__Damages__Group__4__Impl9972 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__5__Impl_in_rule__Damages__Group__510005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Damages__Group__5__Impl10033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group_4__0__Impl_in_rule__Damages__Group_4__010076 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Damages__Group_4__1_in_rule__Damages__Group_4__010079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Damages__Group_4__0__Impl10107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group_4__1__Impl_in_rule__Damages__Group_4__110138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__ThingsAssignment_4_1_in_rule__Damages__Group_4__1__Impl10165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__Group__0__Impl_in_rule__Attack__Group__010199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attack__Group__1_in_rule__Attack__Group__010202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Attack__Group__0__Impl10230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__Group__1__Impl_in_rule__Attack__Group__110261 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Attack__Group__2_in_rule__Attack__Group__110264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__NameAssignment_1_in_rule__Attack__Group__1__Impl10291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__Group__2__Impl_in_rule__Attack__Group__210321 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attack__Group__3_in_rule__Attack__Group__210324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Attack__Group__2__Impl10352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__Group__3__Impl_in_rule__Attack__Group__310383 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Attack__Group__4_in_rule__Attack__Group__310386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__ThingsAssignment_3_in_rule__Attack__Group__3__Impl10413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__Group__4__Impl_in_rule__Attack__Group__410443 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Attack__Group__5_in_rule__Attack__Group__410446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__Group_4__0_in_rule__Attack__Group__4__Impl10475 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Attack__Group_4__0_in_rule__Attack__Group__4__Impl10487 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Attack__Group__5__Impl_in_rule__Attack__Group__510520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Attack__Group__5__Impl10548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__Group_4__0__Impl_in_rule__Attack__Group_4__010591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attack__Group_4__1_in_rule__Attack__Group_4__010594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Attack__Group_4__0__Impl10622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__Group_4__1__Impl_in_rule__Attack__Group_4__110653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attack__ThingsAssignment_4_1_in_rule__Attack__Group_4__1__Impl10680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__0__Impl_in_rule__Argues__Group__010714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argues__Group__1_in_rule__Argues__Group__010717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Argues__Group__0__Impl10745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__1__Impl_in_rule__Argues__Group__110776 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__2_in_rule__Argues__Group__110779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__NameAssignment_1_in_rule__Argues__Group__1__Impl10806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__2__Impl_in_rule__Argues__Group__210836 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argues__Group__3_in_rule__Argues__Group__210839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Argues__Group__2__Impl10867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__3__Impl_in_rule__Argues__Group__310898 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__4_in_rule__Argues__Group__310901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__ThingsAssignment_3_in_rule__Argues__Group__3__Impl10928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__4__Impl_in_rule__Argues__Group__410958 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__5_in_rule__Argues__Group__410961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group_4__0_in_rule__Argues__Group__4__Impl10990 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Argues__Group_4__0_in_rule__Argues__Group__4__Impl11002 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__5__Impl_in_rule__Argues__Group__511035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Argues__Group__5__Impl11063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group_4__0__Impl_in_rule__Argues__Group_4__011106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argues__Group_4__1_in_rule__Argues__Group_4__011109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Argues__Group_4__0__Impl11137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group_4__1__Impl_in_rule__Argues__Group_4__111168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__ThingsAssignment_4_1_in_rule__Argues__Group_4__1__Impl11195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_111234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_111265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__World__EntitiesAssignment_1_011296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__World__DomainsAssignment_1_111327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__World__RelationshipsAssignment_1_211358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_111389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionType_in_rule__Proposition__TypeAssignment_011423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Proposition__NameAssignment_111454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainType_in_rule__Domain__TypeAssignment_011485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_111516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_2_111547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Stakeholder__NameAssignment_111578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_111609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NaturalProcess__NameAssignment_111640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NaturalProcess__ActivitiesAssignment_2_111675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__HumanActivity__ActionsAssignment_211710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_111741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_0_111772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_111803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Wants__NameAssignment_111834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Wants__ThingsAssignment_311869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Wants__ThingsAssignment_511908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Does__NameAssignment_111943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Does__ThingsAssignment_311978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Does__ThingsAssignment_512017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecompositionLabel_in_rule__Decomposes__TypeAssignment_012052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decomposes__NameAssignment_112083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decomposes__ThingsAssignment_312118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decomposes__ThingsAssignment_4_112157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributionLabel_in_rule__Contributes__TypeAssignment_012192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Contributes__NameAssignment_112223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Contributes__ThingsAssignment_312258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Contributes__ThingsAssignment_4_112297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fulfils__NameAssignment_112332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fulfils__ThingsAssignment_312367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fulfils__ThingsAssignment_4_112406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependencyType_in_rule__Depends__KindAssignment_012441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Depends__NameAssignment_112472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Depends__ThingsAssignment_312507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Depends__ThingsAssignment_512546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Depends__ThingsAssignment_712585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provides__NameAssignment_112620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provides__ThingsAssignment_312655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provides__ThingsAssignment_4_112694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Consumes__NameAssignment_112729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Consumes__ThingsAssignment_312764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Consumes__ThingsAssignment_4_112803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exploits__NameAssignment_112838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exploits__ThingsAssignment_312873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exploits__ThingsAssignment_4_112912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Damages__NameAssignment_112947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Damages__ThingsAssignment_312982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Damages__ThingsAssignment_4_113021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attack__NameAssignment_113056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attack__ThingsAssignment_313091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attack__ThingsAssignment_4_113130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argues__NameAssignment_113165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argues__ThingsAssignment_313200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argues__ThingsAssignment_4_113239 = new BitSet(new long[]{0x0000000000000002L});

}