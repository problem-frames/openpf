package eu.securechange.ontology.ui.contentassist.antlr.internal; 

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
import eu.securechange.ontology.services.OntologyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fulfils'", "'S'", "'R'", "'W'", "'and'", "'or'", "'-'", "'+'", "'--'", "'++'", "'model'", "':'", "'event'", "','", "'DA'", "'FR'", "'SR'", "'AR'", "'Q'", "'A'", "'actor'", "'attacker'", "'process'", "'{'", "'}'", "'activity'", "'action'", "'resource'", "'asset'", "'('", "')'", "'wants'", "'does'", "'trusts'", "'delegates'", "'provides'", "'consumes'", "'exploits'", "'damages'", "'attacks'", "'argues'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalOntologyParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g"; }


     
     	private OntologyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(OntologyGrammarAccess grammarAccess) {
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:61:1: entryRuleSituation : ruleSituation EOF ;
    public final void entryRuleSituation() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:62:1: ( ruleSituation EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:63:1: ruleSituation EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:70:1: ruleSituation : ( ( rule__Situation__Group__0 ) ) ;
    public final void ruleSituation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:74:2: ( ( ( rule__Situation__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:75:1: ( ( rule__Situation__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:75:1: ( ( rule__Situation__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:76:1: ( rule__Situation__Group__0 )
            {
             before(grammarAccess.getSituationAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:77:1: ( rule__Situation__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:77:2: rule__Situation__Group__0
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:89:1: entryRuleWorld : ruleWorld EOF ;
    public final void entryRuleWorld() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:90:1: ( ruleWorld EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:91:1: ruleWorld EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:98:1: ruleWorld : ( ( rule__World__Group__0 ) ) ;
    public final void ruleWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:102:2: ( ( ( rule__World__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:103:1: ( ( rule__World__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:103:1: ( ( rule__World__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:104:1: ( rule__World__Group__0 )
            {
             before(grammarAccess.getWorldAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:105:1: ( rule__World__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:105:2: rule__World__Group__0
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:119:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:120:1: ( ruleEvent EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:121:1: ruleEvent EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:128:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:132:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:133:1: ( ( rule__Event__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:133:1: ( ( rule__Event__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:134:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:135:1: ( rule__Event__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:135:2: rule__Event__Group__0
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:147:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:148:1: ( ruleObject EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:149:1: ruleObject EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:156:1: ruleObject : ( ( rule__Object__Alternatives ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:160:2: ( ( ( rule__Object__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:161:1: ( ( rule__Object__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:161:1: ( ( rule__Object__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:162:1: ( rule__Object__Alternatives )
            {
             before(grammarAccess.getObjectAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:163:1: ( rule__Object__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:163:2: rule__Object__Alternatives
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


    // $ANTLR start entryRulePhysicalWorld
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:175:1: entryRulePhysicalWorld : rulePhysicalWorld EOF ;
    public final void entryRulePhysicalWorld() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:176:1: ( rulePhysicalWorld EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:177:1: rulePhysicalWorld EOF
            {
             before(grammarAccess.getPhysicalWorldRule()); 
            pushFollow(FOLLOW_rulePhysicalWorld_in_entryRulePhysicalWorld303);
            rulePhysicalWorld();
            _fsp--;

             after(grammarAccess.getPhysicalWorldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePhysicalWorld310); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRulePhysicalWorld


    // $ANTLR start rulePhysicalWorld
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:184:1: rulePhysicalWorld : ( ( rule__PhysicalWorld__Group__0 ) ) ;
    public final void rulePhysicalWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:188:2: ( ( ( rule__PhysicalWorld__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:189:1: ( ( rule__PhysicalWorld__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:189:1: ( ( rule__PhysicalWorld__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:190:1: ( rule__PhysicalWorld__Group__0 )
            {
             before(grammarAccess.getPhysicalWorldAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:191:1: ( rule__PhysicalWorld__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:191:2: rule__PhysicalWorld__Group__0
            {
            pushFollow(FOLLOW_rule__PhysicalWorld__Group__0_in_rulePhysicalWorld336);
            rule__PhysicalWorld__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPhysicalWorldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePhysicalWorld


    // $ANTLR start entryRuleBeliefWorld
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:203:1: entryRuleBeliefWorld : ruleBeliefWorld EOF ;
    public final void entryRuleBeliefWorld() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:204:1: ( ruleBeliefWorld EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:205:1: ruleBeliefWorld EOF
            {
             before(grammarAccess.getBeliefWorldRule()); 
            pushFollow(FOLLOW_ruleBeliefWorld_in_entryRuleBeliefWorld363);
            ruleBeliefWorld();
            _fsp--;

             after(grammarAccess.getBeliefWorldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleBeliefWorld370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleBeliefWorld


    // $ANTLR start ruleBeliefWorld
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:212:1: ruleBeliefWorld : ( ( rule__BeliefWorld__Group__0 ) ) ;
    public final void ruleBeliefWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:216:2: ( ( ( rule__BeliefWorld__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:217:1: ( ( rule__BeliefWorld__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:217:1: ( ( rule__BeliefWorld__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:218:1: ( rule__BeliefWorld__Group__0 )
            {
             before(grammarAccess.getBeliefWorldAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:219:1: ( rule__BeliefWorld__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:219:2: rule__BeliefWorld__Group__0
            {
            pushFollow(FOLLOW_rule__BeliefWorld__Group__0_in_ruleBeliefWorld396);
            rule__BeliefWorld__Group__0();
            _fsp--;


            }

             after(grammarAccess.getBeliefWorldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleBeliefWorld


    // $ANTLR start entryRuleDomain
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:231:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:232:1: ( ruleDomain EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:233:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain423);
            ruleDomain();
            _fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain430); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:240:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:244:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:245:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:245:1: ( ( rule__Domain__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:246:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:247:1: ( rule__Domain__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:247:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain456);
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


    // $ANTLR start entryRuleProposition
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:259:1: entryRuleProposition : ruleProposition EOF ;
    public final void entryRuleProposition() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:260:1: ( ruleProposition EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:261:1: ruleProposition EOF
            {
             before(grammarAccess.getPropositionRule()); 
            pushFollow(FOLLOW_ruleProposition_in_entryRuleProposition483);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getPropositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProposition490); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:268:1: ruleProposition : ( ( rule__Proposition__Alternatives ) ) ;
    public final void ruleProposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:272:2: ( ( ( rule__Proposition__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:273:1: ( ( rule__Proposition__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:273:1: ( ( rule__Proposition__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:274:1: ( rule__Proposition__Alternatives )
            {
             before(grammarAccess.getPropositionAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:275:1: ( rule__Proposition__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:275:2: rule__Proposition__Alternatives
            {
            pushFollow(FOLLOW_rule__Proposition__Alternatives_in_ruleProposition516);
            rule__Proposition__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getPropositionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:287:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:288:1: ( ruleRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:289:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement543);
            ruleRequirement();
            _fsp--;

             after(grammarAccess.getRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleRequirement


    // $ANTLR start ruleRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:296:1: ruleRequirement : ( ( rule__Requirement__Alternatives ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:300:2: ( ( ( rule__Requirement__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:301:1: ( ( rule__Requirement__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:301:1: ( ( rule__Requirement__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:302:1: ( rule__Requirement__Alternatives )
            {
             before(grammarAccess.getRequirementAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:303:1: ( rule__Requirement__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:303:2: rule__Requirement__Alternatives
            {
            pushFollow(FOLLOW_rule__Requirement__Alternatives_in_ruleRequirement576);
            rule__Requirement__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getRequirementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRequirement


    // $ANTLR start entryRuleDomainAssumption
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:315:1: entryRuleDomainAssumption : ruleDomainAssumption EOF ;
    public final void entryRuleDomainAssumption() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:316:1: ( ruleDomainAssumption EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:317:1: ruleDomainAssumption EOF
            {
             before(grammarAccess.getDomainAssumptionRule()); 
            pushFollow(FOLLOW_ruleDomainAssumption_in_entryRuleDomainAssumption603);
            ruleDomainAssumption();
            _fsp--;

             after(grammarAccess.getDomainAssumptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainAssumption610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDomainAssumption


    // $ANTLR start ruleDomainAssumption
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:324:1: ruleDomainAssumption : ( ( rule__DomainAssumption__Group__0 ) ) ;
    public final void ruleDomainAssumption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:328:2: ( ( ( rule__DomainAssumption__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:329:1: ( ( rule__DomainAssumption__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:329:1: ( ( rule__DomainAssumption__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:330:1: ( rule__DomainAssumption__Group__0 )
            {
             before(grammarAccess.getDomainAssumptionAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:331:1: ( rule__DomainAssumption__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:331:2: rule__DomainAssumption__Group__0
            {
            pushFollow(FOLLOW_rule__DomainAssumption__Group__0_in_ruleDomainAssumption636);
            rule__DomainAssumption__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDomainAssumptionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDomainAssumption


    // $ANTLR start entryRuleFunctionalRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:343:1: entryRuleFunctionalRequirement : ruleFunctionalRequirement EOF ;
    public final void entryRuleFunctionalRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:344:1: ( ruleFunctionalRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:345:1: ruleFunctionalRequirement EOF
            {
             before(grammarAccess.getFunctionalRequirementRule()); 
            pushFollow(FOLLOW_ruleFunctionalRequirement_in_entryRuleFunctionalRequirement663);
            ruleFunctionalRequirement();
            _fsp--;

             after(grammarAccess.getFunctionalRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionalRequirement670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleFunctionalRequirement


    // $ANTLR start ruleFunctionalRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:352:1: ruleFunctionalRequirement : ( ( rule__FunctionalRequirement__Group__0 ) ) ;
    public final void ruleFunctionalRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:356:2: ( ( ( rule__FunctionalRequirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:357:1: ( ( rule__FunctionalRequirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:357:1: ( ( rule__FunctionalRequirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:358:1: ( rule__FunctionalRequirement__Group__0 )
            {
             before(grammarAccess.getFunctionalRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:359:1: ( rule__FunctionalRequirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:359:2: rule__FunctionalRequirement__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionalRequirement__Group__0_in_ruleFunctionalRequirement696);
            rule__FunctionalRequirement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getFunctionalRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFunctionalRequirement


    // $ANTLR start entryRuleSecurityRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:371:1: entryRuleSecurityRequirement : ruleSecurityRequirement EOF ;
    public final void entryRuleSecurityRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:372:1: ( ruleSecurityRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:373:1: ruleSecurityRequirement EOF
            {
             before(grammarAccess.getSecurityRequirementRule()); 
            pushFollow(FOLLOW_ruleSecurityRequirement_in_entryRuleSecurityRequirement723);
            ruleSecurityRequirement();
            _fsp--;

             after(grammarAccess.getSecurityRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityRequirement730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSecurityRequirement


    // $ANTLR start ruleSecurityRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:380:1: ruleSecurityRequirement : ( ( rule__SecurityRequirement__Group__0 ) ) ;
    public final void ruleSecurityRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:384:2: ( ( ( rule__SecurityRequirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:385:1: ( ( rule__SecurityRequirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:385:1: ( ( rule__SecurityRequirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:386:1: ( rule__SecurityRequirement__Group__0 )
            {
             before(grammarAccess.getSecurityRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:387:1: ( rule__SecurityRequirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:387:2: rule__SecurityRequirement__Group__0
            {
            pushFollow(FOLLOW_rule__SecurityRequirement__Group__0_in_ruleSecurityRequirement756);
            rule__SecurityRequirement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSecurityRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSecurityRequirement


    // $ANTLR start entryRuleAntiRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:399:1: entryRuleAntiRequirement : ruleAntiRequirement EOF ;
    public final void entryRuleAntiRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:400:1: ( ruleAntiRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:401:1: ruleAntiRequirement EOF
            {
             before(grammarAccess.getAntiRequirementRule()); 
            pushFollow(FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement783);
            ruleAntiRequirement();
            _fsp--;

             after(grammarAccess.getAntiRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntiRequirement790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAntiRequirement


    // $ANTLR start ruleAntiRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:408:1: ruleAntiRequirement : ( ( rule__AntiRequirement__Group__0 ) ) ;
    public final void ruleAntiRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:412:2: ( ( ( rule__AntiRequirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:413:1: ( ( rule__AntiRequirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:413:1: ( ( rule__AntiRequirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:414:1: ( rule__AntiRequirement__Group__0 )
            {
             before(grammarAccess.getAntiRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:415:1: ( rule__AntiRequirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:415:2: rule__AntiRequirement__Group__0
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group__0_in_ruleAntiRequirement816);
            rule__AntiRequirement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAntiRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAntiRequirement


    // $ANTLR start entryRuleQualityRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:427:1: entryRuleQualityRequirement : ruleQualityRequirement EOF ;
    public final void entryRuleQualityRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:428:1: ( ruleQualityRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:429:1: ruleQualityRequirement EOF
            {
             before(grammarAccess.getQualityRequirementRule()); 
            pushFollow(FOLLOW_ruleQualityRequirement_in_entryRuleQualityRequirement843);
            ruleQualityRequirement();
            _fsp--;

             after(grammarAccess.getQualityRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualityRequirement850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleQualityRequirement


    // $ANTLR start ruleQualityRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:436:1: ruleQualityRequirement : ( ( rule__QualityRequirement__Group__0 ) ) ;
    public final void ruleQualityRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:440:2: ( ( ( rule__QualityRequirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:441:1: ( ( rule__QualityRequirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:441:1: ( ( rule__QualityRequirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:442:1: ( rule__QualityRequirement__Group__0 )
            {
             before(grammarAccess.getQualityRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:443:1: ( rule__QualityRequirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:443:2: rule__QualityRequirement__Group__0
            {
            pushFollow(FOLLOW_rule__QualityRequirement__Group__0_in_ruleQualityRequirement876);
            rule__QualityRequirement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getQualityRequirementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleQualityRequirement


    // $ANTLR start entryRuleArgument
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:455:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:456:1: ( ruleArgument EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:457:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument903);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument910); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:464:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:468:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:469:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:469:1: ( ( rule__Argument__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:470:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:471:1: ( rule__Argument__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:471:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument936);
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


    // $ANTLR start entryRuleEntity
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:483:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:484:1: ( ruleEntity EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:485:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity963);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity970); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:492:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:496:2: ( ( ( rule__Entity__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:497:1: ( ( rule__Entity__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:497:1: ( ( rule__Entity__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:498:1: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:499:1: ( rule__Entity__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:499:2: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_rule__Entity__Alternatives_in_ruleEntity996);
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


    // $ANTLR start entryRuleActor
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:511:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:512:1: ( ruleActor EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:513:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor1023);
            ruleActor();
            _fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor1030); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:520:1: ruleActor : ( ( rule__Actor__Alternatives ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:524:2: ( ( ( rule__Actor__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:525:1: ( ( rule__Actor__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:525:1: ( ( rule__Actor__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:526:1: ( rule__Actor__Alternatives )
            {
             before(grammarAccess.getActorAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:527:1: ( rule__Actor__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:527:2: rule__Actor__Alternatives
            {
            pushFollow(FOLLOW_rule__Actor__Alternatives_in_ruleActor1056);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:539:1: entryRuleStakeholder : ruleStakeholder EOF ;
    public final void entryRuleStakeholder() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:540:1: ( ruleStakeholder EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:541:1: ruleStakeholder EOF
            {
             before(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder1083);
            ruleStakeholder();
            _fsp--;

             after(grammarAccess.getStakeholderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder1090); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:548:1: ruleStakeholder : ( ( rule__Stakeholder__Group__0 ) ) ;
    public final void ruleStakeholder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:552:2: ( ( ( rule__Stakeholder__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:553:1: ( ( rule__Stakeholder__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:553:1: ( ( rule__Stakeholder__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:554:1: ( rule__Stakeholder__Group__0 )
            {
             before(grammarAccess.getStakeholderAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:555:1: ( rule__Stakeholder__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:555:2: rule__Stakeholder__Group__0
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__0_in_ruleStakeholder1116);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:567:1: entryRuleAttacker : ruleAttacker EOF ;
    public final void entryRuleAttacker() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:568:1: ( ruleAttacker EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:569:1: ruleAttacker EOF
            {
             before(grammarAccess.getAttackerRule()); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker1143);
            ruleAttacker();
            _fsp--;

             after(grammarAccess.getAttackerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker1150); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:576:1: ruleAttacker : ( ( rule__Attacker__Group__0 ) ) ;
    public final void ruleAttacker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:580:2: ( ( ( rule__Attacker__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:581:1: ( ( rule__Attacker__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:581:1: ( ( rule__Attacker__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:582:1: ( rule__Attacker__Group__0 )
            {
             before(grammarAccess.getAttackerAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:583:1: ( rule__Attacker__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:583:2: rule__Attacker__Group__0
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0_in_ruleAttacker1176);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:595:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:596:1: ( ruleProcess EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:597:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess1203);
            ruleProcess();
            _fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess1210); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:604:1: ruleProcess : ( ( rule__Process__Alternatives ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:608:2: ( ( ( rule__Process__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:609:1: ( ( rule__Process__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:609:1: ( ( rule__Process__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:610:1: ( rule__Process__Alternatives )
            {
             before(grammarAccess.getProcessAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:611:1: ( rule__Process__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:611:2: rule__Process__Alternatives
            {
            pushFollow(FOLLOW_rule__Process__Alternatives_in_ruleProcess1236);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:623:1: entryRuleNaturalProcess : ruleNaturalProcess EOF ;
    public final void entryRuleNaturalProcess() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:624:1: ( ruleNaturalProcess EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:625:1: ruleNaturalProcess EOF
            {
             before(grammarAccess.getNaturalProcessRule()); 
            pushFollow(FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess1263);
            ruleNaturalProcess();
            _fsp--;

             after(grammarAccess.getNaturalProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalProcess1270); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:632:1: ruleNaturalProcess : ( ( rule__NaturalProcess__Group__0 ) ) ;
    public final void ruleNaturalProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:636:2: ( ( ( rule__NaturalProcess__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:637:1: ( ( rule__NaturalProcess__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:637:1: ( ( rule__NaturalProcess__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:638:1: ( rule__NaturalProcess__Group__0 )
            {
             before(grammarAccess.getNaturalProcessAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:639:1: ( rule__NaturalProcess__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:639:2: rule__NaturalProcess__Group__0
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__0_in_ruleNaturalProcess1296);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:651:1: entryRuleHumanActivity : ruleHumanActivity EOF ;
    public final void entryRuleHumanActivity() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:652:1: ( ruleHumanActivity EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:653:1: ruleHumanActivity EOF
            {
             before(grammarAccess.getHumanActivityRule()); 
            pushFollow(FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity1323);
            ruleHumanActivity();
            _fsp--;

             after(grammarAccess.getHumanActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHumanActivity1330); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:660:1: ruleHumanActivity : ( ( rule__HumanActivity__Group__0 ) ) ;
    public final void ruleHumanActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:664:2: ( ( ( rule__HumanActivity__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:665:1: ( ( rule__HumanActivity__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:665:1: ( ( rule__HumanActivity__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:666:1: ( rule__HumanActivity__Group__0 )
            {
             before(grammarAccess.getHumanActivityAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:667:1: ( rule__HumanActivity__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:667:2: rule__HumanActivity__Group__0
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__0_in_ruleHumanActivity1356);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:679:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:680:1: ( ruleAction EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:681:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1383);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1390); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:688:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:692:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:693:1: ( ( rule__Action__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:693:1: ( ( rule__Action__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:694:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:695:1: ( rule__Action__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:695:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction1416);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:707:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:708:1: ( ruleResource EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:709:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1443);
            ruleResource();
            _fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1450); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:716:1: ruleResource : ( ( rule__Resource__Alternatives ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:720:2: ( ( ( rule__Resource__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:721:1: ( ( rule__Resource__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:721:1: ( ( rule__Resource__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:722:1: ( rule__Resource__Alternatives )
            {
             before(grammarAccess.getResourceAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:723:1: ( rule__Resource__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:723:2: rule__Resource__Alternatives
            {
            pushFollow(FOLLOW_rule__Resource__Alternatives_in_ruleResource1476);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:735:1: entryRuleAsset : ruleAsset EOF ;
    public final void entryRuleAsset() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:736:1: ( ruleAsset EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:737:1: ruleAsset EOF
            {
             before(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset1503);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getAssetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset1510); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:744:1: ruleAsset : ( ( rule__Asset__Group__0 ) ) ;
    public final void ruleAsset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:748:2: ( ( ( rule__Asset__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:749:1: ( ( rule__Asset__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:749:1: ( ( rule__Asset__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:750:1: ( rule__Asset__Group__0 )
            {
             before(grammarAccess.getAssetAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:751:1: ( rule__Asset__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:751:2: rule__Asset__Group__0
            {
            pushFollow(FOLLOW_rule__Asset__Group__0_in_ruleAsset1536);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:763:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:764:1: ( ruleRelationship EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:765:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship1563);
            ruleRelationship();
            _fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship1570); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:772:1: ruleRelationship : ( ( rule__Relationship__Alternatives ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:776:2: ( ( ( rule__Relationship__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:777:1: ( ( rule__Relationship__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:777:1: ( ( rule__Relationship__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:778:1: ( rule__Relationship__Alternatives )
            {
             before(grammarAccess.getRelationshipAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:779:1: ( rule__Relationship__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:779:2: rule__Relationship__Alternatives
            {
            pushFollow(FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship1596);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:791:1: entryRuleWants : ruleWants EOF ;
    public final void entryRuleWants() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:792:1: ( ruleWants EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:793:1: ruleWants EOF
            {
             before(grammarAccess.getWantsRule()); 
            pushFollow(FOLLOW_ruleWants_in_entryRuleWants1623);
            ruleWants();
            _fsp--;

             after(grammarAccess.getWantsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWants1630); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:800:1: ruleWants : ( ( rule__Wants__Group__0 ) ) ;
    public final void ruleWants() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:804:2: ( ( ( rule__Wants__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:805:1: ( ( rule__Wants__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:805:1: ( ( rule__Wants__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:806:1: ( rule__Wants__Group__0 )
            {
             before(grammarAccess.getWantsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:807:1: ( rule__Wants__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:807:2: rule__Wants__Group__0
            {
            pushFollow(FOLLOW_rule__Wants__Group__0_in_ruleWants1656);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:819:1: entryRuleDoes : ruleDoes EOF ;
    public final void entryRuleDoes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:820:1: ( ruleDoes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:821:1: ruleDoes EOF
            {
             before(grammarAccess.getDoesRule()); 
            pushFollow(FOLLOW_ruleDoes_in_entryRuleDoes1683);
            ruleDoes();
            _fsp--;

             after(grammarAccess.getDoesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoes1690); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:828:1: ruleDoes : ( ( rule__Does__Group__0 ) ) ;
    public final void ruleDoes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:832:2: ( ( ( rule__Does__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:833:1: ( ( rule__Does__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:833:1: ( ( rule__Does__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:834:1: ( rule__Does__Group__0 )
            {
             before(grammarAccess.getDoesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:835:1: ( rule__Does__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:835:2: rule__Does__Group__0
            {
            pushFollow(FOLLOW_rule__Does__Group__0_in_ruleDoes1716);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:847:1: entryRuleDecomposes : ruleDecomposes EOF ;
    public final void entryRuleDecomposes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:848:1: ( ruleDecomposes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:849:1: ruleDecomposes EOF
            {
             before(grammarAccess.getDecomposesRule()); 
            pushFollow(FOLLOW_ruleDecomposes_in_entryRuleDecomposes1743);
            ruleDecomposes();
            _fsp--;

             after(grammarAccess.getDecomposesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposes1750); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:856:1: ruleDecomposes : ( ( rule__Decomposes__Group__0 ) ) ;
    public final void ruleDecomposes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:860:2: ( ( ( rule__Decomposes__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:861:1: ( ( rule__Decomposes__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:861:1: ( ( rule__Decomposes__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:862:1: ( rule__Decomposes__Group__0 )
            {
             before(grammarAccess.getDecomposesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:863:1: ( rule__Decomposes__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:863:2: rule__Decomposes__Group__0
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__0_in_ruleDecomposes1776);
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


    // $ANTLR start entryRuleTrusts
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:875:1: entryRuleTrusts : ruleTrusts EOF ;
    public final void entryRuleTrusts() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:876:1: ( ruleTrusts EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:877:1: ruleTrusts EOF
            {
             before(grammarAccess.getTrustsRule()); 
            pushFollow(FOLLOW_ruleTrusts_in_entryRuleTrusts1803);
            ruleTrusts();
            _fsp--;

             after(grammarAccess.getTrustsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrusts1810); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleTrusts


    // $ANTLR start ruleTrusts
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:884:1: ruleTrusts : ( ( rule__Trusts__Group__0 ) ) ;
    public final void ruleTrusts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:888:2: ( ( ( rule__Trusts__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:889:1: ( ( rule__Trusts__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:889:1: ( ( rule__Trusts__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:890:1: ( rule__Trusts__Group__0 )
            {
             before(grammarAccess.getTrustsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:891:1: ( rule__Trusts__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:891:2: rule__Trusts__Group__0
            {
            pushFollow(FOLLOW_rule__Trusts__Group__0_in_ruleTrusts1836);
            rule__Trusts__Group__0();
            _fsp--;


            }

             after(grammarAccess.getTrustsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleTrusts


    // $ANTLR start entryRuleDelegates
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:903:1: entryRuleDelegates : ruleDelegates EOF ;
    public final void entryRuleDelegates() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:904:1: ( ruleDelegates EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:905:1: ruleDelegates EOF
            {
             before(grammarAccess.getDelegatesRule()); 
            pushFollow(FOLLOW_ruleDelegates_in_entryRuleDelegates1863);
            ruleDelegates();
            _fsp--;

             after(grammarAccess.getDelegatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelegates1870); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleDelegates


    // $ANTLR start ruleDelegates
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:912:1: ruleDelegates : ( ( rule__Delegates__Group__0 ) ) ;
    public final void ruleDelegates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:916:2: ( ( ( rule__Delegates__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:917:1: ( ( rule__Delegates__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:917:1: ( ( rule__Delegates__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:918:1: ( rule__Delegates__Group__0 )
            {
             before(grammarAccess.getDelegatesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:919:1: ( rule__Delegates__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:919:2: rule__Delegates__Group__0
            {
            pushFollow(FOLLOW_rule__Delegates__Group__0_in_ruleDelegates1896);
            rule__Delegates__Group__0();
            _fsp--;


            }

             after(grammarAccess.getDelegatesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDelegates


    // $ANTLR start entryRuleContributes
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:931:1: entryRuleContributes : ruleContributes EOF ;
    public final void entryRuleContributes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:932:1: ( ruleContributes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:933:1: ruleContributes EOF
            {
             before(grammarAccess.getContributesRule()); 
            pushFollow(FOLLOW_ruleContributes_in_entryRuleContributes1923);
            ruleContributes();
            _fsp--;

             after(grammarAccess.getContributesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributes1930); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:940:1: ruleContributes : ( ( rule__Contributes__Group__0 ) ) ;
    public final void ruleContributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:944:2: ( ( ( rule__Contributes__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:945:1: ( ( rule__Contributes__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:945:1: ( ( rule__Contributes__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:946:1: ( rule__Contributes__Group__0 )
            {
             before(grammarAccess.getContributesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:947:1: ( rule__Contributes__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:947:2: rule__Contributes__Group__0
            {
            pushFollow(FOLLOW_rule__Contributes__Group__0_in_ruleContributes1956);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:959:1: entryRuleFulfils : ruleFulfils EOF ;
    public final void entryRuleFulfils() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:960:1: ( ruleFulfils EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:961:1: ruleFulfils EOF
            {
             before(grammarAccess.getFulfilsRule()); 
            pushFollow(FOLLOW_ruleFulfils_in_entryRuleFulfils1983);
            ruleFulfils();
            _fsp--;

             after(grammarAccess.getFulfilsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFulfils1990); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:968:1: ruleFulfils : ( ( rule__Fulfils__Group__0 ) ) ;
    public final void ruleFulfils() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:972:2: ( ( ( rule__Fulfils__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:973:1: ( ( rule__Fulfils__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:973:1: ( ( rule__Fulfils__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:974:1: ( rule__Fulfils__Group__0 )
            {
             before(grammarAccess.getFulfilsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:975:1: ( rule__Fulfils__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:975:2: rule__Fulfils__Group__0
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__0_in_ruleFulfils2016);
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


    // $ANTLR start entryRuleProvides
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:987:1: entryRuleProvides : ruleProvides EOF ;
    public final void entryRuleProvides() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:988:1: ( ruleProvides EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:989:1: ruleProvides EOF
            {
             before(grammarAccess.getProvidesRule()); 
            pushFollow(FOLLOW_ruleProvides_in_entryRuleProvides2043);
            ruleProvides();
            _fsp--;

             after(grammarAccess.getProvidesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvides2050); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:996:1: ruleProvides : ( ( rule__Provides__Group__0 ) ) ;
    public final void ruleProvides() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1000:2: ( ( ( rule__Provides__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1001:1: ( ( rule__Provides__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1001:1: ( ( rule__Provides__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1002:1: ( rule__Provides__Group__0 )
            {
             before(grammarAccess.getProvidesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1003:1: ( rule__Provides__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1003:2: rule__Provides__Group__0
            {
            pushFollow(FOLLOW_rule__Provides__Group__0_in_ruleProvides2076);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1015:1: entryRuleConsumes : ruleConsumes EOF ;
    public final void entryRuleConsumes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1016:1: ( ruleConsumes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1017:1: ruleConsumes EOF
            {
             before(grammarAccess.getConsumesRule()); 
            pushFollow(FOLLOW_ruleConsumes_in_entryRuleConsumes2103);
            ruleConsumes();
            _fsp--;

             after(grammarAccess.getConsumesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsumes2110); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1024:1: ruleConsumes : ( ( rule__Consumes__Group__0 ) ) ;
    public final void ruleConsumes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1028:2: ( ( ( rule__Consumes__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1029:1: ( ( rule__Consumes__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1029:1: ( ( rule__Consumes__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1030:1: ( rule__Consumes__Group__0 )
            {
             before(grammarAccess.getConsumesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1031:1: ( rule__Consumes__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1031:2: rule__Consumes__Group__0
            {
            pushFollow(FOLLOW_rule__Consumes__Group__0_in_ruleConsumes2136);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1043:1: entryRuleExploits : ruleExploits EOF ;
    public final void entryRuleExploits() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1044:1: ( ruleExploits EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1045:1: ruleExploits EOF
            {
             before(grammarAccess.getExploitsRule()); 
            pushFollow(FOLLOW_ruleExploits_in_entryRuleExploits2163);
            ruleExploits();
            _fsp--;

             after(grammarAccess.getExploitsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploits2170); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1052:1: ruleExploits : ( ( rule__Exploits__Group__0 ) ) ;
    public final void ruleExploits() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1056:2: ( ( ( rule__Exploits__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1057:1: ( ( rule__Exploits__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1057:1: ( ( rule__Exploits__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1058:1: ( rule__Exploits__Group__0 )
            {
             before(grammarAccess.getExploitsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1059:1: ( rule__Exploits__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1059:2: rule__Exploits__Group__0
            {
            pushFollow(FOLLOW_rule__Exploits__Group__0_in_ruleExploits2196);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1071:1: entryRuleDamages : ruleDamages EOF ;
    public final void entryRuleDamages() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1072:1: ( ruleDamages EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1073:1: ruleDamages EOF
            {
             before(grammarAccess.getDamagesRule()); 
            pushFollow(FOLLOW_ruleDamages_in_entryRuleDamages2223);
            ruleDamages();
            _fsp--;

             after(grammarAccess.getDamagesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDamages2230); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1080:1: ruleDamages : ( ( rule__Damages__Group__0 ) ) ;
    public final void ruleDamages() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1084:2: ( ( ( rule__Damages__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1085:1: ( ( rule__Damages__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1085:1: ( ( rule__Damages__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1086:1: ( rule__Damages__Group__0 )
            {
             before(grammarAccess.getDamagesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1087:1: ( rule__Damages__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1087:2: rule__Damages__Group__0
            {
            pushFollow(FOLLOW_rule__Damages__Group__0_in_ruleDamages2256);
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


    // $ANTLR start entryRuleAttacks
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1099:1: entryRuleAttacks : ruleAttacks EOF ;
    public final void entryRuleAttacks() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1100:1: ( ruleAttacks EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1101:1: ruleAttacks EOF
            {
             before(grammarAccess.getAttacksRule()); 
            pushFollow(FOLLOW_ruleAttacks_in_entryRuleAttacks2283);
            ruleAttacks();
            _fsp--;

             after(grammarAccess.getAttacksRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacks2290); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleAttacks


    // $ANTLR start ruleAttacks
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1108:1: ruleAttacks : ( ( rule__Attacks__Group__0 ) ) ;
    public final void ruleAttacks() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1112:2: ( ( ( rule__Attacks__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1113:1: ( ( rule__Attacks__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1113:1: ( ( rule__Attacks__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1114:1: ( rule__Attacks__Group__0 )
            {
             before(grammarAccess.getAttacksAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1115:1: ( rule__Attacks__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1115:2: rule__Attacks__Group__0
            {
            pushFollow(FOLLOW_rule__Attacks__Group__0_in_ruleAttacks2316);
            rule__Attacks__Group__0();
            _fsp--;


            }

             after(grammarAccess.getAttacksAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleAttacks


    // $ANTLR start entryRuleArgues
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1127:1: entryRuleArgues : ruleArgues EOF ;
    public final void entryRuleArgues() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1128:1: ( ruleArgues EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1129:1: ruleArgues EOF
            {
             before(grammarAccess.getArguesRule()); 
            pushFollow(FOLLOW_ruleArgues_in_entryRuleArgues2343);
            ruleArgues();
            _fsp--;

             after(grammarAccess.getArguesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgues2350); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1136:1: ruleArgues : ( ( rule__Argues__Group__0 ) ) ;
    public final void ruleArgues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1140:2: ( ( ( rule__Argues__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1141:1: ( ( rule__Argues__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1141:1: ( ( rule__Argues__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1142:1: ( rule__Argues__Group__0 )
            {
             before(grammarAccess.getArguesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1143:1: ( rule__Argues__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1143:2: rule__Argues__Group__0
            {
            pushFollow(FOLLOW_rule__Argues__Group__0_in_ruleArgues2376);
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


    // $ANTLR start ruleDomainType
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1156:1: ruleDomainType : ( ( rule__DomainType__Alternatives ) ) ;
    public final void ruleDomainType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1160:1: ( ( ( rule__DomainType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1161:1: ( ( rule__DomainType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1161:1: ( ( rule__DomainType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1162:1: ( rule__DomainType__Alternatives )
            {
             before(grammarAccess.getDomainTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1163:1: ( rule__DomainType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1163:2: rule__DomainType__Alternatives
            {
            pushFollow(FOLLOW_rule__DomainType__Alternatives_in_ruleDomainType2413);
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


    // $ANTLR start ruleDecomposesType
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1175:1: ruleDecomposesType : ( ( rule__DecomposesType__Alternatives ) ) ;
    public final void ruleDecomposesType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1179:1: ( ( ( rule__DecomposesType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1180:1: ( ( rule__DecomposesType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1180:1: ( ( rule__DecomposesType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1181:1: ( rule__DecomposesType__Alternatives )
            {
             before(grammarAccess.getDecomposesTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1182:1: ( rule__DecomposesType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1182:2: rule__DecomposesType__Alternatives
            {
            pushFollow(FOLLOW_rule__DecomposesType__Alternatives_in_ruleDecomposesType2449);
            rule__DecomposesType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDecomposesTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDecomposesType


    // $ANTLR start ruleContributesType
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1194:1: ruleContributesType : ( ( rule__ContributesType__Alternatives ) ) ;
    public final void ruleContributesType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1198:1: ( ( ( rule__ContributesType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1199:1: ( ( rule__ContributesType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1199:1: ( ( rule__ContributesType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1200:1: ( rule__ContributesType__Alternatives )
            {
             before(grammarAccess.getContributesTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1201:1: ( rule__ContributesType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1201:2: rule__ContributesType__Alternatives
            {
            pushFollow(FOLLOW_rule__ContributesType__Alternatives_in_ruleContributesType2485);
            rule__ContributesType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getContributesTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleContributesType


    // $ANTLR start ruleFulfilsType
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1213:1: ruleFulfilsType : ( ( 'fulfils' ) ) ;
    public final void ruleFulfilsType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1217:1: ( ( ( 'fulfils' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1218:1: ( ( 'fulfils' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1218:1: ( ( 'fulfils' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1219:1: ( 'fulfils' )
            {
             before(grammarAccess.getFulfilsTypeAccess().getFulfilsEnumLiteralDeclaration()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1220:1: ( 'fulfils' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1220:3: 'fulfils'
            {
            match(input,11,FOLLOW_11_in_ruleFulfilsType2522); 

            }

             after(grammarAccess.getFulfilsTypeAccess().getFulfilsEnumLiteralDeclaration()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleFulfilsType


    // $ANTLR start rule__Object__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1233:1: rule__Object__Alternatives : ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleProposition ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1237:1: ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleProposition ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
            case 33:
            case 36:
            case 38:
            case 39:
                {
                alt1=1;
                }
                break;
            case 11:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt1=2;
                }
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1233:1: rule__Object__Alternatives : ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleProposition ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1238:1: ( ruleEntity )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1238:1: ( ruleEntity )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1239:1: ruleEntity
                    {
                     before(grammarAccess.getObjectAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Object__Alternatives2560);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1244:6: ( ruleRelationship )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1244:6: ( ruleRelationship )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1245:1: ruleRelationship
                    {
                     before(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelationship_in_rule__Object__Alternatives2577);
                    ruleRelationship();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1250:6: ( ruleProposition )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1250:6: ( ruleProposition )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1251:1: ruleProposition
                    {
                     before(grammarAccess.getObjectAccess().getPropositionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleProposition_in_rule__Object__Alternatives2594);
                    ruleProposition();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getPropositionParserRuleCall_2()); 

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


    // $ANTLR start rule__BeliefWorld__Alternatives_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1261:1: rule__BeliefWorld__Alternatives_1 : ( ( ( rule__BeliefWorld__DomainsAssignment_1_0 ) ) | ( ( rule__BeliefWorld__RelationshipsAssignment_1_1 ) ) );
    public final void rule__BeliefWorld__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1265:1: ( ( ( rule__BeliefWorld__DomainsAssignment_1_0 ) ) | ( ( rule__BeliefWorld__RelationshipsAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==11||(LA2_0>=15 && LA2_0<=20)||(LA2_0>=42 && LA2_0<=51)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1261:1: rule__BeliefWorld__Alternatives_1 : ( ( ( rule__BeliefWorld__DomainsAssignment_1_0 ) ) | ( ( rule__BeliefWorld__RelationshipsAssignment_1_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1266:1: ( ( rule__BeliefWorld__DomainsAssignment_1_0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1266:1: ( ( rule__BeliefWorld__DomainsAssignment_1_0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1267:1: ( rule__BeliefWorld__DomainsAssignment_1_0 )
                    {
                     before(grammarAccess.getBeliefWorldAccess().getDomainsAssignment_1_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1268:1: ( rule__BeliefWorld__DomainsAssignment_1_0 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1268:2: rule__BeliefWorld__DomainsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__BeliefWorld__DomainsAssignment_1_0_in_rule__BeliefWorld__Alternatives_12626);
                    rule__BeliefWorld__DomainsAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBeliefWorldAccess().getDomainsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1272:6: ( ( rule__BeliefWorld__RelationshipsAssignment_1_1 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1272:6: ( ( rule__BeliefWorld__RelationshipsAssignment_1_1 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1273:1: ( rule__BeliefWorld__RelationshipsAssignment_1_1 )
                    {
                     before(grammarAccess.getBeliefWorldAccess().getRelationshipsAssignment_1_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1274:1: ( rule__BeliefWorld__RelationshipsAssignment_1_1 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1274:2: rule__BeliefWorld__RelationshipsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__BeliefWorld__RelationshipsAssignment_1_1_in_rule__BeliefWorld__Alternatives_12644);
                    rule__BeliefWorld__RelationshipsAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getBeliefWorldAccess().getRelationshipsAssignment_1_1()); 

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
    // $ANTLR end rule__BeliefWorld__Alternatives_1


    // $ANTLR start rule__Proposition__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1283:1: rule__Proposition__Alternatives : ( ( ruleDomainAssumption ) | ( ruleRequirement ) | ( ruleArgument ) );
    public final void rule__Proposition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1287:1: ( ( ruleDomainAssumption ) | ( ruleRequirement ) | ( ruleArgument ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 26:
            case 27:
            case 28:
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1283:1: rule__Proposition__Alternatives : ( ( ruleDomainAssumption ) | ( ruleRequirement ) | ( ruleArgument ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1288:1: ( ruleDomainAssumption )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1288:1: ( ruleDomainAssumption )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1289:1: ruleDomainAssumption
                    {
                     before(grammarAccess.getPropositionAccess().getDomainAssumptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDomainAssumption_in_rule__Proposition__Alternatives2677);
                    ruleDomainAssumption();
                    _fsp--;

                     after(grammarAccess.getPropositionAccess().getDomainAssumptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1294:6: ( ruleRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1294:6: ( ruleRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1295:1: ruleRequirement
                    {
                     before(grammarAccess.getPropositionAccess().getRequirementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRequirement_in_rule__Proposition__Alternatives2694);
                    ruleRequirement();
                    _fsp--;

                     after(grammarAccess.getPropositionAccess().getRequirementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1300:6: ( ruleArgument )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1300:6: ( ruleArgument )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1301:1: ruleArgument
                    {
                     before(grammarAccess.getPropositionAccess().getArgumentParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleArgument_in_rule__Proposition__Alternatives2711);
                    ruleArgument();
                    _fsp--;

                     after(grammarAccess.getPropositionAccess().getArgumentParserRuleCall_2()); 

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
    // $ANTLR end rule__Proposition__Alternatives


    // $ANTLR start rule__Requirement__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1311:1: rule__Requirement__Alternatives : ( ( ruleFunctionalRequirement ) | ( ruleSecurityRequirement ) | ( ruleAntiRequirement ) | ( ruleQualityRequirement ) );
    public final void rule__Requirement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1315:1: ( ( ruleFunctionalRequirement ) | ( ruleSecurityRequirement ) | ( ruleAntiRequirement ) | ( ruleQualityRequirement ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 27:
                {
                alt4=2;
                }
                break;
            case 28:
                {
                alt4=3;
                }
                break;
            case 29:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1311:1: rule__Requirement__Alternatives : ( ( ruleFunctionalRequirement ) | ( ruleSecurityRequirement ) | ( ruleAntiRequirement ) | ( ruleQualityRequirement ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1316:1: ( ruleFunctionalRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1316:1: ( ruleFunctionalRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1317:1: ruleFunctionalRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getFunctionalRequirementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFunctionalRequirement_in_rule__Requirement__Alternatives2743);
                    ruleFunctionalRequirement();
                    _fsp--;

                     after(grammarAccess.getRequirementAccess().getFunctionalRequirementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1322:6: ( ruleSecurityRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1322:6: ( ruleSecurityRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1323:1: ruleSecurityRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getSecurityRequirementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSecurityRequirement_in_rule__Requirement__Alternatives2760);
                    ruleSecurityRequirement();
                    _fsp--;

                     after(grammarAccess.getRequirementAccess().getSecurityRequirementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1328:6: ( ruleAntiRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1328:6: ( ruleAntiRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1329:1: ruleAntiRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getAntiRequirementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAntiRequirement_in_rule__Requirement__Alternatives2777);
                    ruleAntiRequirement();
                    _fsp--;

                     after(grammarAccess.getRequirementAccess().getAntiRequirementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1334:6: ( ruleQualityRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1334:6: ( ruleQualityRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1335:1: ruleQualityRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getQualityRequirementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleQualityRequirement_in_rule__Requirement__Alternatives2794);
                    ruleQualityRequirement();
                    _fsp--;

                     after(grammarAccess.getRequirementAccess().getQualityRequirementParserRuleCall_3()); 

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
    // $ANTLR end rule__Requirement__Alternatives


    // $ANTLR start rule__Entity__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1345:1: rule__Entity__Alternatives : ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1349:1: ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
                {
                alt5=1;
                }
                break;
            case 33:
            case 36:
                {
                alt5=2;
                }
                break;
            case 38:
            case 39:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1345:1: rule__Entity__Alternatives : ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1350:1: ( ruleActor )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1350:1: ( ruleActor )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1351:1: ruleActor
                    {
                     before(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Entity__Alternatives2826);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1356:6: ( ruleProcess )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1356:6: ( ruleProcess )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1357:1: ruleProcess
                    {
                     before(grammarAccess.getEntityAccess().getProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcess_in_rule__Entity__Alternatives2843);
                    ruleProcess();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getProcessParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1362:6: ( ruleResource )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1362:6: ( ruleResource )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1363:1: ruleResource
                    {
                     before(grammarAccess.getEntityAccess().getResourceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Entity__Alternatives2860);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1373:1: rule__Actor__Alternatives : ( ( ruleStakeholder ) | ( ruleAttacker ) );
    public final void rule__Actor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1377:1: ( ( ruleStakeholder ) | ( ruleAttacker ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1373:1: rule__Actor__Alternatives : ( ( ruleStakeholder ) | ( ruleAttacker ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1378:1: ( ruleStakeholder )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1378:1: ( ruleStakeholder )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1379:1: ruleStakeholder
                    {
                     before(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStakeholder_in_rule__Actor__Alternatives2892);
                    ruleStakeholder();
                    _fsp--;

                     after(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1384:6: ( ruleAttacker )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1384:6: ( ruleAttacker )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1385:1: ruleAttacker
                    {
                     before(grammarAccess.getActorAccess().getAttackerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttacker_in_rule__Actor__Alternatives2909);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1395:1: rule__Process__Alternatives : ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) );
    public final void rule__Process__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1399:1: ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==36) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1395:1: rule__Process__Alternatives : ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1400:1: ( ruleNaturalProcess )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1400:1: ( ruleNaturalProcess )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1401:1: ruleNaturalProcess
                    {
                     before(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNaturalProcess_in_rule__Process__Alternatives2941);
                    ruleNaturalProcess();
                    _fsp--;

                     after(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1406:6: ( ruleHumanActivity )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1406:6: ( ruleHumanActivity )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1407:1: ruleHumanActivity
                    {
                     before(grammarAccess.getProcessAccess().getHumanActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHumanActivity_in_rule__Process__Alternatives2958);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1417:1: rule__Resource__Alternatives : ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) );
    public final void rule__Resource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1421:1: ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==38) ) {
                alt8=1;
            }
            else if ( (LA8_0==39) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1417:1: rule__Resource__Alternatives : ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1422:1: ( ( rule__Resource__Group_0__0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1422:1: ( ( rule__Resource__Group_0__0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1423:1: ( rule__Resource__Group_0__0 )
                    {
                     before(grammarAccess.getResourceAccess().getGroup_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1424:1: ( rule__Resource__Group_0__0 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1424:2: rule__Resource__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Resource__Group_0__0_in_rule__Resource__Alternatives2990);
                    rule__Resource__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getResourceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1428:6: ( ruleAsset )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1428:6: ( ruleAsset )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1429:1: ruleAsset
                    {
                     before(grammarAccess.getResourceAccess().getAssetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAsset_in_rule__Resource__Alternatives3008);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1439:1: rule__Relationship__Alternatives : ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleTrusts ) | ( ruleDelegates ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttacks ) | ( ruleArgues ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1443:1: ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleTrusts ) | ( ruleDelegates ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttacks ) | ( ruleArgues ) )
            int alt9=13;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt9=1;
                }
                break;
            case 43:
                {
                alt9=2;
                }
                break;
            case 15:
            case 16:
                {
                alt9=3;
                }
                break;
            case 44:
                {
                alt9=4;
                }
                break;
            case 45:
                {
                alt9=5;
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt9=6;
                }
                break;
            case 11:
                {
                alt9=7;
                }
                break;
            case 46:
                {
                alt9=8;
                }
                break;
            case 47:
                {
                alt9=9;
                }
                break;
            case 48:
                {
                alt9=10;
                }
                break;
            case 49:
                {
                alt9=11;
                }
                break;
            case 50:
                {
                alt9=12;
                }
                break;
            case 51:
                {
                alt9=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1439:1: rule__Relationship__Alternatives : ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleTrusts ) | ( ruleDelegates ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttacks ) | ( ruleArgues ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1444:1: ( ruleWants )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1444:1: ( ruleWants )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1445:1: ruleWants
                    {
                     before(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWants_in_rule__Relationship__Alternatives3040);
                    ruleWants();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1450:6: ( ruleDoes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1450:6: ( ruleDoes )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1451:1: ruleDoes
                    {
                     before(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDoes_in_rule__Relationship__Alternatives3057);
                    ruleDoes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1456:6: ( ruleDecomposes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1456:6: ( ruleDecomposes )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1457:1: ruleDecomposes
                    {
                     before(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDecomposes_in_rule__Relationship__Alternatives3074);
                    ruleDecomposes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1462:6: ( ruleTrusts )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1462:6: ( ruleTrusts )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1463:1: ruleTrusts
                    {
                     before(grammarAccess.getRelationshipAccess().getTrustsParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTrusts_in_rule__Relationship__Alternatives3091);
                    ruleTrusts();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getTrustsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1468:6: ( ruleDelegates )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1468:6: ( ruleDelegates )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1469:1: ruleDelegates
                    {
                     before(grammarAccess.getRelationshipAccess().getDelegatesParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDelegates_in_rule__Relationship__Alternatives3108);
                    ruleDelegates();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDelegatesParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1474:6: ( ruleContributes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1474:6: ( ruleContributes )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1475:1: ruleContributes
                    {
                     before(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleContributes_in_rule__Relationship__Alternatives3125);
                    ruleContributes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1480:6: ( ruleFulfils )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1480:6: ( ruleFulfils )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1481:1: ruleFulfils
                    {
                     before(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFulfils_in_rule__Relationship__Alternatives3142);
                    ruleFulfils();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1486:6: ( ruleProvides )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1486:6: ( ruleProvides )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1487:1: ruleProvides
                    {
                     before(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleProvides_in_rule__Relationship__Alternatives3159);
                    ruleProvides();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1492:6: ( ruleConsumes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1492:6: ( ruleConsumes )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1493:1: ruleConsumes
                    {
                     before(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleConsumes_in_rule__Relationship__Alternatives3176);
                    ruleConsumes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1498:6: ( ruleExploits )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1498:6: ( ruleExploits )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1499:1: ruleExploits
                    {
                     before(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleExploits_in_rule__Relationship__Alternatives3193);
                    ruleExploits();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1504:6: ( ruleDamages )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1504:6: ( ruleDamages )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1505:1: ruleDamages
                    {
                     before(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleDamages_in_rule__Relationship__Alternatives3210);
                    ruleDamages();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1510:6: ( ruleAttacks )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1510:6: ( ruleAttacks )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1511:1: ruleAttacks
                    {
                     before(grammarAccess.getRelationshipAccess().getAttacksParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleAttacks_in_rule__Relationship__Alternatives3227);
                    ruleAttacks();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getAttacksParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1516:6: ( ruleArgues )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1516:6: ( ruleArgues )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1517:1: ruleArgues
                    {
                     before(grammarAccess.getRelationshipAccess().getArguesParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleArgues_in_rule__Relationship__Alternatives3244);
                    ruleArgues();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getArguesParserRuleCall_12()); 

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


    // $ANTLR start rule__DomainType__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1527:1: rule__DomainType__Alternatives : ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) );
    public final void rule__DomainType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1531:1: ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt10=1;
                }
                break;
            case 13:
                {
                alt10=2;
                }
                break;
            case 14:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1527:1: rule__DomainType__Alternatives : ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) );", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1532:1: ( ( 'S' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1532:1: ( ( 'S' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1533:1: ( 'S' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1534:1: ( 'S' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1534:3: 'S'
                    {
                    match(input,12,FOLLOW_12_in_rule__DomainType__Alternatives3277); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1539:6: ( ( 'R' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1539:6: ( ( 'R' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1540:1: ( 'R' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1541:1: ( 'R' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1541:3: 'R'
                    {
                    match(input,13,FOLLOW_13_in_rule__DomainType__Alternatives3298); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1546:6: ( ( 'W' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1546:6: ( ( 'W' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1547:1: ( 'W' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getWorldEnumLiteralDeclaration_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1548:1: ( 'W' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1548:3: 'W'
                    {
                    match(input,14,FOLLOW_14_in_rule__DomainType__Alternatives3319); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getWorldEnumLiteralDeclaration_2()); 

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


    // $ANTLR start rule__DecomposesType__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1558:1: rule__DecomposesType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__DecomposesType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1562:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            else if ( (LA11_0==16) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1558:1: rule__DecomposesType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1563:1: ( ( 'and' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1563:1: ( ( 'and' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1564:1: ( 'and' )
                    {
                     before(grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1565:1: ( 'and' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1565:3: 'and'
                    {
                    match(input,15,FOLLOW_15_in_rule__DecomposesType__Alternatives3355); 

                    }

                     after(grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1570:6: ( ( 'or' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1570:6: ( ( 'or' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1571:1: ( 'or' )
                    {
                     before(grammarAccess.getDecomposesTypeAccess().getOREnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1572:1: ( 'or' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1572:3: 'or'
                    {
                    match(input,16,FOLLOW_16_in_rule__DecomposesType__Alternatives3376); 

                    }

                     after(grammarAccess.getDecomposesTypeAccess().getOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__DecomposesType__Alternatives


    // $ANTLR start rule__ContributesType__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1582:1: rule__ContributesType__Alternatives : ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) );
    public final void rule__ContributesType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1586:1: ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) )
            int alt12=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt12=1;
                }
                break;
            case 18:
                {
                alt12=2;
                }
                break;
            case 19:
                {
                alt12=3;
                }
                break;
            case 20:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1582:1: rule__ContributesType__Alternatives : ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1587:1: ( ( '-' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1587:1: ( ( '-' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1588:1: ( '-' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1589:1: ( '-' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1589:3: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__ContributesType__Alternatives3412); 

                    }

                     after(grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1594:6: ( ( '+' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1594:6: ( ( '+' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1595:1: ( '+' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1596:1: ( '+' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1596:3: '+'
                    {
                    match(input,18,FOLLOW_18_in_rule__ContributesType__Alternatives3433); 

                    }

                     after(grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1601:6: ( ( '--' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1601:6: ( ( '--' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1602:1: ( '--' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1603:1: ( '--' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1603:3: '--'
                    {
                    match(input,19,FOLLOW_19_in_rule__ContributesType__Alternatives3454); 

                    }

                     after(grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1608:6: ( ( '++' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1608:6: ( ( '++' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1609:1: ( '++' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getMAKEEnumLiteralDeclaration_3()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1610:1: ( '++' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1610:3: '++'
                    {
                    match(input,20,FOLLOW_20_in_rule__ContributesType__Alternatives3475); 

                    }

                     after(grammarAccess.getContributesTypeAccess().getMAKEEnumLiteralDeclaration_3()); 

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
    // $ANTLR end rule__ContributesType__Alternatives


    // $ANTLR start rule__Situation__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1622:1: rule__Situation__Group__0 : rule__Situation__Group__0__Impl rule__Situation__Group__1 ;
    public final void rule__Situation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1626:1: ( rule__Situation__Group__0__Impl rule__Situation__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1627:2: rule__Situation__Group__0__Impl rule__Situation__Group__1
            {
            pushFollow(FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__03508);
            rule__Situation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__03511);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1634:1: rule__Situation__Group__0__Impl : ( ( rule__Situation__Group_0__0 )? ) ;
    public final void rule__Situation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1638:1: ( ( ( rule__Situation__Group_0__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1639:1: ( ( rule__Situation__Group_0__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1639:1: ( ( rule__Situation__Group_0__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1640:1: ( rule__Situation__Group_0__0 )?
            {
             before(grammarAccess.getSituationAccess().getGroup_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1641:1: ( rule__Situation__Group_0__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1641:2: rule__Situation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl3538);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1651:1: rule__Situation__Group__1 : rule__Situation__Group__1__Impl ;
    public final void rule__Situation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1655:1: ( rule__Situation__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1656:2: rule__Situation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__13569);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1662:1: rule__Situation__Group__1__Impl : ( ( rule__Situation__WorldAssignment_1 ) ) ;
    public final void rule__Situation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1666:1: ( ( ( rule__Situation__WorldAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1667:1: ( ( rule__Situation__WorldAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1667:1: ( ( rule__Situation__WorldAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1668:1: ( rule__Situation__WorldAssignment_1 )
            {
             before(grammarAccess.getSituationAccess().getWorldAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1669:1: ( rule__Situation__WorldAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1669:2: rule__Situation__WorldAssignment_1
            {
            pushFollow(FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl3596);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1683:1: rule__Situation__Group_0__0 : rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 ;
    public final void rule__Situation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1687:1: ( rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1688:2: rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__03630);
            rule__Situation__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__03633);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1695:1: rule__Situation__Group_0__0__Impl : ( 'model' ) ;
    public final void rule__Situation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1699:1: ( ( 'model' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1700:1: ( 'model' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1700:1: ( 'model' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1701:1: 'model'
            {
             before(grammarAccess.getSituationAccess().getModelKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Situation__Group_0__0__Impl3661); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1714:1: rule__Situation__Group_0__1 : rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 ;
    public final void rule__Situation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1718:1: ( rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1719:2: rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__13692);
            rule__Situation__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__13695);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1726:1: rule__Situation__Group_0__1__Impl : ( ( rule__Situation__TimeAssignment_0_1 ) ) ;
    public final void rule__Situation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1730:1: ( ( ( rule__Situation__TimeAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1731:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1731:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1732:1: ( rule__Situation__TimeAssignment_0_1 )
            {
             before(grammarAccess.getSituationAccess().getTimeAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1733:1: ( rule__Situation__TimeAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1733:2: rule__Situation__TimeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl3722);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1743:1: rule__Situation__Group_0__2 : rule__Situation__Group_0__2__Impl ;
    public final void rule__Situation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1747:1: ( rule__Situation__Group_0__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1748:2: rule__Situation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__23752);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1754:1: rule__Situation__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Situation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1758:1: ( ( ':' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1759:1: ( ':' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1759:1: ( ':' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1760:1: ':'
            {
             before(grammarAccess.getSituationAccess().getColonKeyword_0_2()); 
            match(input,22,FOLLOW_22_in_rule__Situation__Group_0__2__Impl3780); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1779:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1783:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1784:2: rule__World__Group__0__Impl rule__World__Group__1
            {
            pushFollow(FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__03817);
            rule__World__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__World__Group__1_in_rule__World__Group__03820);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1791:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1795:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1796:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1796:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1797:1: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1798:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1800:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1810:1: rule__World__Group__1 : rule__World__Group__1__Impl rule__World__Group__2 ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1814:1: ( rule__World__Group__1__Impl rule__World__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1815:2: rule__World__Group__1__Impl rule__World__Group__2
            {
            pushFollow(FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__13878);
            rule__World__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__World__Group__2_in_rule__World__Group__13881);
            rule__World__Group__2();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1822:1: rule__World__Group__1__Impl : ( ( rule__World__PhysicalAssignment_1 )? ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1826:1: ( ( ( rule__World__PhysicalAssignment_1 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1827:1: ( ( rule__World__PhysicalAssignment_1 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1827:1: ( ( rule__World__PhysicalAssignment_1 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1828:1: ( rule__World__PhysicalAssignment_1 )?
            {
             before(grammarAccess.getWorldAccess().getPhysicalAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1829:1: ( rule__World__PhysicalAssignment_1 )?
            int alt14=2;
            switch ( input.LA(1) ) {
                case 31:
                case 32:
                case 33:
                case 36:
                case 38:
                case 39:
                    {
                    alt14=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt14=1;
                    }
                    break;
                case 42:
                    {
                    alt14=1;
                    }
                    break;
                case 43:
                    {
                    alt14=1;
                    }
                    break;
                case 15:
                    {
                    alt14=1;
                    }
                    break;
                case 16:
                    {
                    alt14=1;
                    }
                    break;
                case 44:
                    {
                    alt14=1;
                    }
                    break;
                case 45:
                    {
                    alt14=1;
                    }
                    break;
                case 17:
                    {
                    alt14=1;
                    }
                    break;
                case 18:
                    {
                    alt14=1;
                    }
                    break;
                case 19:
                    {
                    alt14=1;
                    }
                    break;
                case 20:
                    {
                    alt14=1;
                    }
                    break;
                case 11:
                    {
                    alt14=1;
                    }
                    break;
                case 46:
                    {
                    alt14=1;
                    }
                    break;
                case 47:
                    {
                    alt14=1;
                    }
                    break;
                case 48:
                    {
                    alt14=1;
                    }
                    break;
                case 49:
                    {
                    alt14=1;
                    }
                    break;
                case 50:
                    {
                    alt14=1;
                    }
                    break;
                case 51:
                    {
                    alt14=1;
                    }
                    break;
                case EOF:
                    {
                    alt14=1;
                    }
                    break;
            }

            switch (alt14) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1829:2: rule__World__PhysicalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__World__PhysicalAssignment_1_in_rule__World__Group__1__Impl3908);
                    rule__World__PhysicalAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorldAccess().getPhysicalAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__World__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1839:1: rule__World__Group__2 : rule__World__Group__2__Impl ;
    public final void rule__World__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1843:1: ( rule__World__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1844:2: rule__World__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__World__Group__2__Impl_in_rule__World__Group__23939);
            rule__World__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__Group__2


    // $ANTLR start rule__World__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1850:1: rule__World__Group__2__Impl : ( ( rule__World__BeliefAssignment_2 )? ) ;
    public final void rule__World__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1854:1: ( ( ( rule__World__BeliefAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1855:1: ( ( rule__World__BeliefAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1855:1: ( ( rule__World__BeliefAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1856:1: ( rule__World__BeliefAssignment_2 )?
            {
             before(grammarAccess.getWorldAccess().getBeliefAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1857:1: ( rule__World__BeliefAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_ID||LA15_0==11||(LA15_0>=15 && LA15_0<=20)||(LA15_0>=42 && LA15_0<=51)) ) {
                alt15=1;
            }
            else if ( (LA15_0==EOF) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1857:2: rule__World__BeliefAssignment_2
                    {
                    pushFollow(FOLLOW_rule__World__BeliefAssignment_2_in_rule__World__Group__2__Impl3966);
                    rule__World__BeliefAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWorldAccess().getBeliefAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__Group__2__Impl


    // $ANTLR start rule__Event__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1873:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1877:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1878:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04003);
            rule__Event__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04006);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1885:1: rule__Event__Group__0__Impl : ( 'event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1889:1: ( ( 'event' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1890:1: ( 'event' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1890:1: ( 'event' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1891:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Event__Group__0__Impl4034); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1904:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1908:1: ( rule__Event__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1909:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14065);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1915:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1919:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1920:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1920:1: ( ( rule__Event__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1921:1: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1922:1: ( rule__Event__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1922:2: rule__Event__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl4092);
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


    // $ANTLR start rule__PhysicalWorld__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1936:1: rule__PhysicalWorld__Group__0 : rule__PhysicalWorld__Group__0__Impl rule__PhysicalWorld__Group__1 ;
    public final void rule__PhysicalWorld__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1940:1: ( rule__PhysicalWorld__Group__0__Impl rule__PhysicalWorld__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1941:2: rule__PhysicalWorld__Group__0__Impl rule__PhysicalWorld__Group__1
            {
            pushFollow(FOLLOW_rule__PhysicalWorld__Group__0__Impl_in_rule__PhysicalWorld__Group__04126);
            rule__PhysicalWorld__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PhysicalWorld__Group__1_in_rule__PhysicalWorld__Group__04129);
            rule__PhysicalWorld__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PhysicalWorld__Group__0


    // $ANTLR start rule__PhysicalWorld__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1948:1: rule__PhysicalWorld__Group__0__Impl : ( () ) ;
    public final void rule__PhysicalWorld__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1952:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1953:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1953:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1954:1: ()
            {
             before(grammarAccess.getPhysicalWorldAccess().getPhysicalWorldAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1955:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1957:1: 
            {
            }

             after(grammarAccess.getPhysicalWorldAccess().getPhysicalWorldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PhysicalWorld__Group__0__Impl


    // $ANTLR start rule__PhysicalWorld__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1967:1: rule__PhysicalWorld__Group__1 : rule__PhysicalWorld__Group__1__Impl ;
    public final void rule__PhysicalWorld__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1971:1: ( rule__PhysicalWorld__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1972:2: rule__PhysicalWorld__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PhysicalWorld__Group__1__Impl_in_rule__PhysicalWorld__Group__14187);
            rule__PhysicalWorld__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PhysicalWorld__Group__1


    // $ANTLR start rule__PhysicalWorld__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1978:1: rule__PhysicalWorld__Group__1__Impl : ( ( rule__PhysicalWorld__EntitiesAssignment_1 )* ) ;
    public final void rule__PhysicalWorld__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1982:1: ( ( ( rule__PhysicalWorld__EntitiesAssignment_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1983:1: ( ( rule__PhysicalWorld__EntitiesAssignment_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1983:1: ( ( rule__PhysicalWorld__EntitiesAssignment_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1984:1: ( rule__PhysicalWorld__EntitiesAssignment_1 )*
            {
             before(grammarAccess.getPhysicalWorldAccess().getEntitiesAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1985:1: ( rule__PhysicalWorld__EntitiesAssignment_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=31 && LA16_0<=33)||LA16_0==36||(LA16_0>=38 && LA16_0<=39)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1985:2: rule__PhysicalWorld__EntitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__PhysicalWorld__EntitiesAssignment_1_in_rule__PhysicalWorld__Group__1__Impl4214);
            	    rule__PhysicalWorld__EntitiesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPhysicalWorldAccess().getEntitiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PhysicalWorld__Group__1__Impl


    // $ANTLR start rule__BeliefWorld__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1999:1: rule__BeliefWorld__Group__0 : rule__BeliefWorld__Group__0__Impl rule__BeliefWorld__Group__1 ;
    public final void rule__BeliefWorld__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2003:1: ( rule__BeliefWorld__Group__0__Impl rule__BeliefWorld__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2004:2: rule__BeliefWorld__Group__0__Impl rule__BeliefWorld__Group__1
            {
            pushFollow(FOLLOW_rule__BeliefWorld__Group__0__Impl_in_rule__BeliefWorld__Group__04249);
            rule__BeliefWorld__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BeliefWorld__Group__1_in_rule__BeliefWorld__Group__04252);
            rule__BeliefWorld__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeliefWorld__Group__0


    // $ANTLR start rule__BeliefWorld__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2011:1: rule__BeliefWorld__Group__0__Impl : ( () ) ;
    public final void rule__BeliefWorld__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2015:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2016:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2016:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2017:1: ()
            {
             before(grammarAccess.getBeliefWorldAccess().getBeliefWorldAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2018:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2020:1: 
            {
            }

             after(grammarAccess.getBeliefWorldAccess().getBeliefWorldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeliefWorld__Group__0__Impl


    // $ANTLR start rule__BeliefWorld__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2030:1: rule__BeliefWorld__Group__1 : rule__BeliefWorld__Group__1__Impl ;
    public final void rule__BeliefWorld__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2034:1: ( rule__BeliefWorld__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2035:2: rule__BeliefWorld__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BeliefWorld__Group__1__Impl_in_rule__BeliefWorld__Group__14310);
            rule__BeliefWorld__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeliefWorld__Group__1


    // $ANTLR start rule__BeliefWorld__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2041:1: rule__BeliefWorld__Group__1__Impl : ( ( rule__BeliefWorld__Alternatives_1 )* ) ;
    public final void rule__BeliefWorld__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2045:1: ( ( ( rule__BeliefWorld__Alternatives_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2046:1: ( ( rule__BeliefWorld__Alternatives_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2046:1: ( ( rule__BeliefWorld__Alternatives_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2047:1: ( rule__BeliefWorld__Alternatives_1 )*
            {
             before(grammarAccess.getBeliefWorldAccess().getAlternatives_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2048:1: ( rule__BeliefWorld__Alternatives_1 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID||LA17_0==11||(LA17_0>=15 && LA17_0<=20)||(LA17_0>=42 && LA17_0<=51)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2048:2: rule__BeliefWorld__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__BeliefWorld__Alternatives_1_in_rule__BeliefWorld__Group__1__Impl4337);
            	    rule__BeliefWorld__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getBeliefWorldAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeliefWorld__Group__1__Impl


    // $ANTLR start rule__Domain__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2062:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2066:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2067:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__04372);
            rule__Domain__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__04375);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2074:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__NameAssignment_0 ) ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2078:1: ( ( ( rule__Domain__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2079:1: ( ( rule__Domain__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2079:1: ( ( rule__Domain__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2080:1: ( rule__Domain__NameAssignment_0 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2081:1: ( rule__Domain__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2081:2: rule__Domain__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_0_in_rule__Domain__Group__0__Impl4402);
            rule__Domain__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2091:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2095:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2096:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__14432);
            rule__Domain__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__14435);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2103:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__TypeAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2107:1: ( ( ( rule__Domain__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2108:1: ( ( rule__Domain__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2108:1: ( ( rule__Domain__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2109:1: ( rule__Domain__TypeAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2110:1: ( rule__Domain__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2110:2: rule__Domain__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Domain__TypeAssignment_1_in_rule__Domain__Group__1__Impl4462);
            rule__Domain__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getTypeAssignment_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2120:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2124:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2125:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__24492);
            rule__Domain__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__24495);
            rule__Domain__Group__3();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2132:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__PropertiesAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2136:1: ( ( ( rule__Domain__PropertiesAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2137:1: ( ( rule__Domain__PropertiesAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2137:1: ( ( rule__Domain__PropertiesAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2138:1: ( rule__Domain__PropertiesAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2139:1: ( rule__Domain__PropertiesAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2139:2: rule__Domain__PropertiesAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_2_in_rule__Domain__Group__2__Impl4522);
            rule__Domain__PropertiesAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getPropertiesAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Domain__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2149:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2153:1: ( rule__Domain__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2154:2: rule__Domain__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__34552);
            rule__Domain__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group__3


    // $ANTLR start rule__Domain__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2160:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__Group_3__0 )* ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2164:1: ( ( ( rule__Domain__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2165:1: ( ( rule__Domain__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2165:1: ( ( rule__Domain__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2166:1: ( rule__Domain__Group_3__0 )*
            {
             before(grammarAccess.getDomainAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2167:1: ( rule__Domain__Group_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==24) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2167:2: rule__Domain__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__Group_3__0_in_rule__Domain__Group__3__Impl4579);
            	    rule__Domain__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group__3__Impl


    // $ANTLR start rule__Domain__Group_3__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2185:1: rule__Domain__Group_3__0 : rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1 ;
    public final void rule__Domain__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2189:1: ( rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2190:2: rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_3__0__Impl_in_rule__Domain__Group_3__04618);
            rule__Domain__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_3__1_in_rule__Domain__Group_3__04621);
            rule__Domain__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_3__0


    // $ANTLR start rule__Domain__Group_3__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2197:1: rule__Domain__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Domain__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2201:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2202:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2202:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2203:1: ','
            {
             before(grammarAccess.getDomainAccess().getCommaKeyword_3_0()); 
            match(input,24,FOLLOW_24_in_rule__Domain__Group_3__0__Impl4649); 
             after(grammarAccess.getDomainAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_3__0__Impl


    // $ANTLR start rule__Domain__Group_3__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2216:1: rule__Domain__Group_3__1 : rule__Domain__Group_3__1__Impl ;
    public final void rule__Domain__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2220:1: ( rule__Domain__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2221:2: rule__Domain__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_3__1__Impl_in_rule__Domain__Group_3__14680);
            rule__Domain__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_3__1


    // $ANTLR start rule__Domain__Group_3__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2227:1: rule__Domain__Group_3__1__Impl : ( ( rule__Domain__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Domain__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2231:1: ( ( ( rule__Domain__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2232:1: ( ( rule__Domain__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2232:1: ( ( rule__Domain__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2233:1: ( rule__Domain__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2234:1: ( rule__Domain__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2234:2: rule__Domain__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_3_1_in_rule__Domain__Group_3__1__Impl4707);
            rule__Domain__PropertiesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_3__1__Impl


    // $ANTLR start rule__DomainAssumption__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2248:1: rule__DomainAssumption__Group__0 : rule__DomainAssumption__Group__0__Impl rule__DomainAssumption__Group__1 ;
    public final void rule__DomainAssumption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2252:1: ( rule__DomainAssumption__Group__0__Impl rule__DomainAssumption__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2253:2: rule__DomainAssumption__Group__0__Impl rule__DomainAssumption__Group__1
            {
            pushFollow(FOLLOW_rule__DomainAssumption__Group__0__Impl_in_rule__DomainAssumption__Group__04741);
            rule__DomainAssumption__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainAssumption__Group__1_in_rule__DomainAssumption__Group__04744);
            rule__DomainAssumption__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainAssumption__Group__0


    // $ANTLR start rule__DomainAssumption__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2260:1: rule__DomainAssumption__Group__0__Impl : ( 'DA' ) ;
    public final void rule__DomainAssumption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2264:1: ( ( 'DA' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2265:1: ( 'DA' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2265:1: ( 'DA' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2266:1: 'DA'
            {
             before(grammarAccess.getDomainAssumptionAccess().getDAKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__DomainAssumption__Group__0__Impl4772); 
             after(grammarAccess.getDomainAssumptionAccess().getDAKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainAssumption__Group__0__Impl


    // $ANTLR start rule__DomainAssumption__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2279:1: rule__DomainAssumption__Group__1 : rule__DomainAssumption__Group__1__Impl ;
    public final void rule__DomainAssumption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2283:1: ( rule__DomainAssumption__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2284:2: rule__DomainAssumption__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainAssumption__Group__1__Impl_in_rule__DomainAssumption__Group__14803);
            rule__DomainAssumption__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainAssumption__Group__1


    // $ANTLR start rule__DomainAssumption__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2290:1: rule__DomainAssumption__Group__1__Impl : ( ( rule__DomainAssumption__NameAssignment_1 ) ) ;
    public final void rule__DomainAssumption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2294:1: ( ( ( rule__DomainAssumption__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2295:1: ( ( rule__DomainAssumption__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2295:1: ( ( rule__DomainAssumption__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2296:1: ( rule__DomainAssumption__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAssumptionAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2297:1: ( rule__DomainAssumption__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2297:2: rule__DomainAssumption__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DomainAssumption__NameAssignment_1_in_rule__DomainAssumption__Group__1__Impl4830);
            rule__DomainAssumption__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getDomainAssumptionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainAssumption__Group__1__Impl


    // $ANTLR start rule__FunctionalRequirement__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2311:1: rule__FunctionalRequirement__Group__0 : rule__FunctionalRequirement__Group__0__Impl rule__FunctionalRequirement__Group__1 ;
    public final void rule__FunctionalRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2315:1: ( rule__FunctionalRequirement__Group__0__Impl rule__FunctionalRequirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2316:2: rule__FunctionalRequirement__Group__0__Impl rule__FunctionalRequirement__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionalRequirement__Group__0__Impl_in_rule__FunctionalRequirement__Group__04864);
            rule__FunctionalRequirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionalRequirement__Group__1_in_rule__FunctionalRequirement__Group__04867);
            rule__FunctionalRequirement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionalRequirement__Group__0


    // $ANTLR start rule__FunctionalRequirement__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2323:1: rule__FunctionalRequirement__Group__0__Impl : ( 'FR' ) ;
    public final void rule__FunctionalRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2327:1: ( ( 'FR' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2328:1: ( 'FR' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2328:1: ( 'FR' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2329:1: 'FR'
            {
             before(grammarAccess.getFunctionalRequirementAccess().getFRKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__FunctionalRequirement__Group__0__Impl4895); 
             after(grammarAccess.getFunctionalRequirementAccess().getFRKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionalRequirement__Group__0__Impl


    // $ANTLR start rule__FunctionalRequirement__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2342:1: rule__FunctionalRequirement__Group__1 : rule__FunctionalRequirement__Group__1__Impl ;
    public final void rule__FunctionalRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2346:1: ( rule__FunctionalRequirement__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2347:2: rule__FunctionalRequirement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionalRequirement__Group__1__Impl_in_rule__FunctionalRequirement__Group__14926);
            rule__FunctionalRequirement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionalRequirement__Group__1


    // $ANTLR start rule__FunctionalRequirement__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2353:1: rule__FunctionalRequirement__Group__1__Impl : ( ( rule__FunctionalRequirement__NameAssignment_1 ) ) ;
    public final void rule__FunctionalRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2357:1: ( ( ( rule__FunctionalRequirement__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2358:1: ( ( rule__FunctionalRequirement__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2358:1: ( ( rule__FunctionalRequirement__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2359:1: ( rule__FunctionalRequirement__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionalRequirementAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2360:1: ( rule__FunctionalRequirement__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2360:2: rule__FunctionalRequirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionalRequirement__NameAssignment_1_in_rule__FunctionalRequirement__Group__1__Impl4953);
            rule__FunctionalRequirement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getFunctionalRequirementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionalRequirement__Group__1__Impl


    // $ANTLR start rule__SecurityRequirement__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2374:1: rule__SecurityRequirement__Group__0 : rule__SecurityRequirement__Group__0__Impl rule__SecurityRequirement__Group__1 ;
    public final void rule__SecurityRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2378:1: ( rule__SecurityRequirement__Group__0__Impl rule__SecurityRequirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2379:2: rule__SecurityRequirement__Group__0__Impl rule__SecurityRequirement__Group__1
            {
            pushFollow(FOLLOW_rule__SecurityRequirement__Group__0__Impl_in_rule__SecurityRequirement__Group__04987);
            rule__SecurityRequirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityRequirement__Group__1_in_rule__SecurityRequirement__Group__04990);
            rule__SecurityRequirement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityRequirement__Group__0


    // $ANTLR start rule__SecurityRequirement__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2386:1: rule__SecurityRequirement__Group__0__Impl : ( 'SR' ) ;
    public final void rule__SecurityRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2390:1: ( ( 'SR' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2391:1: ( 'SR' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2391:1: ( 'SR' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2392:1: 'SR'
            {
             before(grammarAccess.getSecurityRequirementAccess().getSRKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__SecurityRequirement__Group__0__Impl5018); 
             after(grammarAccess.getSecurityRequirementAccess().getSRKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityRequirement__Group__0__Impl


    // $ANTLR start rule__SecurityRequirement__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2405:1: rule__SecurityRequirement__Group__1 : rule__SecurityRequirement__Group__1__Impl ;
    public final void rule__SecurityRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2409:1: ( rule__SecurityRequirement__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2410:2: rule__SecurityRequirement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SecurityRequirement__Group__1__Impl_in_rule__SecurityRequirement__Group__15049);
            rule__SecurityRequirement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityRequirement__Group__1


    // $ANTLR start rule__SecurityRequirement__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2416:1: rule__SecurityRequirement__Group__1__Impl : ( ( rule__SecurityRequirement__NameAssignment_1 ) ) ;
    public final void rule__SecurityRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2420:1: ( ( ( rule__SecurityRequirement__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2421:1: ( ( rule__SecurityRequirement__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2421:1: ( ( rule__SecurityRequirement__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2422:1: ( rule__SecurityRequirement__NameAssignment_1 )
            {
             before(grammarAccess.getSecurityRequirementAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2423:1: ( rule__SecurityRequirement__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2423:2: rule__SecurityRequirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SecurityRequirement__NameAssignment_1_in_rule__SecurityRequirement__Group__1__Impl5076);
            rule__SecurityRequirement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSecurityRequirementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityRequirement__Group__1__Impl


    // $ANTLR start rule__AntiRequirement__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2437:1: rule__AntiRequirement__Group__0 : rule__AntiRequirement__Group__0__Impl rule__AntiRequirement__Group__1 ;
    public final void rule__AntiRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2441:1: ( rule__AntiRequirement__Group__0__Impl rule__AntiRequirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2442:2: rule__AntiRequirement__Group__0__Impl rule__AntiRequirement__Group__1
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group__0__Impl_in_rule__AntiRequirement__Group__05110);
            rule__AntiRequirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AntiRequirement__Group__1_in_rule__AntiRequirement__Group__05113);
            rule__AntiRequirement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__Group__0


    // $ANTLR start rule__AntiRequirement__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2449:1: rule__AntiRequirement__Group__0__Impl : ( 'AR' ) ;
    public final void rule__AntiRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2453:1: ( ( 'AR' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2454:1: ( 'AR' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2454:1: ( 'AR' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2455:1: 'AR'
            {
             before(grammarAccess.getAntiRequirementAccess().getARKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__AntiRequirement__Group__0__Impl5141); 
             after(grammarAccess.getAntiRequirementAccess().getARKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__Group__0__Impl


    // $ANTLR start rule__AntiRequirement__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2468:1: rule__AntiRequirement__Group__1 : rule__AntiRequirement__Group__1__Impl ;
    public final void rule__AntiRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2472:1: ( rule__AntiRequirement__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2473:2: rule__AntiRequirement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group__1__Impl_in_rule__AntiRequirement__Group__15172);
            rule__AntiRequirement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__Group__1


    // $ANTLR start rule__AntiRequirement__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2479:1: rule__AntiRequirement__Group__1__Impl : ( ( rule__AntiRequirement__NameAssignment_1 ) ) ;
    public final void rule__AntiRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2483:1: ( ( ( rule__AntiRequirement__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2484:1: ( ( rule__AntiRequirement__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2484:1: ( ( rule__AntiRequirement__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2485:1: ( rule__AntiRequirement__NameAssignment_1 )
            {
             before(grammarAccess.getAntiRequirementAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2486:1: ( rule__AntiRequirement__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2486:2: rule__AntiRequirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AntiRequirement__NameAssignment_1_in_rule__AntiRequirement__Group__1__Impl5199);
            rule__AntiRequirement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAntiRequirementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__Group__1__Impl


    // $ANTLR start rule__QualityRequirement__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2500:1: rule__QualityRequirement__Group__0 : rule__QualityRequirement__Group__0__Impl rule__QualityRequirement__Group__1 ;
    public final void rule__QualityRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2504:1: ( rule__QualityRequirement__Group__0__Impl rule__QualityRequirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2505:2: rule__QualityRequirement__Group__0__Impl rule__QualityRequirement__Group__1
            {
            pushFollow(FOLLOW_rule__QualityRequirement__Group__0__Impl_in_rule__QualityRequirement__Group__05233);
            rule__QualityRequirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualityRequirement__Group__1_in_rule__QualityRequirement__Group__05236);
            rule__QualityRequirement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualityRequirement__Group__0


    // $ANTLR start rule__QualityRequirement__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2512:1: rule__QualityRequirement__Group__0__Impl : ( 'Q' ) ;
    public final void rule__QualityRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2516:1: ( ( 'Q' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2517:1: ( 'Q' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2517:1: ( 'Q' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2518:1: 'Q'
            {
             before(grammarAccess.getQualityRequirementAccess().getQKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__QualityRequirement__Group__0__Impl5264); 
             after(grammarAccess.getQualityRequirementAccess().getQKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualityRequirement__Group__0__Impl


    // $ANTLR start rule__QualityRequirement__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2531:1: rule__QualityRequirement__Group__1 : rule__QualityRequirement__Group__1__Impl ;
    public final void rule__QualityRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2535:1: ( rule__QualityRequirement__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2536:2: rule__QualityRequirement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualityRequirement__Group__1__Impl_in_rule__QualityRequirement__Group__15295);
            rule__QualityRequirement__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualityRequirement__Group__1


    // $ANTLR start rule__QualityRequirement__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2542:1: rule__QualityRequirement__Group__1__Impl : ( ( rule__QualityRequirement__NameAssignment_1 ) ) ;
    public final void rule__QualityRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2546:1: ( ( ( rule__QualityRequirement__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2547:1: ( ( rule__QualityRequirement__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2547:1: ( ( rule__QualityRequirement__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2548:1: ( rule__QualityRequirement__NameAssignment_1 )
            {
             before(grammarAccess.getQualityRequirementAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2549:1: ( rule__QualityRequirement__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2549:2: rule__QualityRequirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__QualityRequirement__NameAssignment_1_in_rule__QualityRequirement__Group__1__Impl5322);
            rule__QualityRequirement__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getQualityRequirementAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualityRequirement__Group__1__Impl


    // $ANTLR start rule__Argument__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2563:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2567:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2568:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__05356);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__05359);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2575:1: rule__Argument__Group__0__Impl : ( 'A' ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2579:1: ( ( 'A' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2580:1: ( 'A' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2580:1: ( 'A' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2581:1: 'A'
            {
             before(grammarAccess.getArgumentAccess().getAKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Argument__Group__0__Impl5387); 
             after(grammarAccess.getArgumentAccess().getAKeyword_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2594:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2598:1: ( rule__Argument__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2599:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__15418);
            rule__Argument__Group__1__Impl();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2605:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2609:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2610:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2610:1: ( ( rule__Argument__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2611:1: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2612:1: ( rule__Argument__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2612:2: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl5445);
            rule__Argument__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentAccess().getNameAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Stakeholder__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2626:1: rule__Stakeholder__Group__0 : rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1 ;
    public final void rule__Stakeholder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2630:1: ( rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2631:2: rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__0__Impl_in_rule__Stakeholder__Group__05479);
            rule__Stakeholder__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__1_in_rule__Stakeholder__Group__05482);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2638:1: rule__Stakeholder__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Stakeholder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2642:1: ( ( 'actor' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2643:1: ( 'actor' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2643:1: ( 'actor' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2644:1: 'actor'
            {
             before(grammarAccess.getStakeholderAccess().getActorKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Stakeholder__Group__0__Impl5510); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2657:1: rule__Stakeholder__Group__1 : rule__Stakeholder__Group__1__Impl ;
    public final void rule__Stakeholder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2661:1: ( rule__Stakeholder__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2662:2: rule__Stakeholder__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__1__Impl_in_rule__Stakeholder__Group__15541);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2668:1: rule__Stakeholder__Group__1__Impl : ( ( rule__Stakeholder__NameAssignment_1 ) ) ;
    public final void rule__Stakeholder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2672:1: ( ( ( rule__Stakeholder__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2673:1: ( ( rule__Stakeholder__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2673:1: ( ( rule__Stakeholder__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2674:1: ( rule__Stakeholder__NameAssignment_1 )
            {
             before(grammarAccess.getStakeholderAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2675:1: ( rule__Stakeholder__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2675:2: rule__Stakeholder__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Stakeholder__NameAssignment_1_in_rule__Stakeholder__Group__1__Impl5568);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2689:1: rule__Attacker__Group__0 : rule__Attacker__Group__0__Impl rule__Attacker__Group__1 ;
    public final void rule__Attacker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2693:1: ( rule__Attacker__Group__0__Impl rule__Attacker__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2694:2: rule__Attacker__Group__0__Impl rule__Attacker__Group__1
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__05602);
            rule__Attacker__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__05605);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2701:1: rule__Attacker__Group__0__Impl : ( 'attacker' ) ;
    public final void rule__Attacker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2705:1: ( ( 'attacker' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2706:1: ( 'attacker' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2706:1: ( 'attacker' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2707:1: 'attacker'
            {
             before(grammarAccess.getAttackerAccess().getAttackerKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Attacker__Group__0__Impl5633); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2720:1: rule__Attacker__Group__1 : rule__Attacker__Group__1__Impl ;
    public final void rule__Attacker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2724:1: ( rule__Attacker__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2725:2: rule__Attacker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__15664);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2731:1: rule__Attacker__Group__1__Impl : ( ( rule__Attacker__NameAssignment_1 ) ) ;
    public final void rule__Attacker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2735:1: ( ( ( rule__Attacker__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2736:1: ( ( rule__Attacker__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2736:1: ( ( rule__Attacker__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2737:1: ( rule__Attacker__NameAssignment_1 )
            {
             before(grammarAccess.getAttackerAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2738:1: ( rule__Attacker__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2738:2: rule__Attacker__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attacker__NameAssignment_1_in_rule__Attacker__Group__1__Impl5691);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2752:1: rule__NaturalProcess__Group__0 : rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1 ;
    public final void rule__NaturalProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2756:1: ( rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2757:2: rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__0__Impl_in_rule__NaturalProcess__Group__05725);
            rule__NaturalProcess__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group__1_in_rule__NaturalProcess__Group__05728);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2764:1: rule__NaturalProcess__Group__0__Impl : ( 'process' ) ;
    public final void rule__NaturalProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2768:1: ( ( 'process' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2769:1: ( 'process' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2769:1: ( 'process' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2770:1: 'process'
            {
             before(grammarAccess.getNaturalProcessAccess().getProcessKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__NaturalProcess__Group__0__Impl5756); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2783:1: rule__NaturalProcess__Group__1 : rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2 ;
    public final void rule__NaturalProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2787:1: ( rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2788:2: rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__1__Impl_in_rule__NaturalProcess__Group__15787);
            rule__NaturalProcess__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group__2_in_rule__NaturalProcess__Group__15790);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2795:1: rule__NaturalProcess__Group__1__Impl : ( ( rule__NaturalProcess__NameAssignment_1 ) ) ;
    public final void rule__NaturalProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2799:1: ( ( ( rule__NaturalProcess__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2800:1: ( ( rule__NaturalProcess__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2800:1: ( ( rule__NaturalProcess__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2801:1: ( rule__NaturalProcess__NameAssignment_1 )
            {
             before(grammarAccess.getNaturalProcessAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2802:1: ( rule__NaturalProcess__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2802:2: rule__NaturalProcess__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__NameAssignment_1_in_rule__NaturalProcess__Group__1__Impl5817);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2812:1: rule__NaturalProcess__Group__2 : rule__NaturalProcess__Group__2__Impl ;
    public final void rule__NaturalProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2816:1: ( rule__NaturalProcess__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2817:2: rule__NaturalProcess__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__2__Impl_in_rule__NaturalProcess__Group__25847);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2823:1: rule__NaturalProcess__Group__2__Impl : ( ( rule__NaturalProcess__Group_2__0 )? ) ;
    public final void rule__NaturalProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2827:1: ( ( ( rule__NaturalProcess__Group_2__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2828:1: ( ( rule__NaturalProcess__Group_2__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2828:1: ( ( rule__NaturalProcess__Group_2__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2829:1: ( rule__NaturalProcess__Group_2__0 )?
            {
             before(grammarAccess.getNaturalProcessAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2830:1: ( rule__NaturalProcess__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2830:2: rule__NaturalProcess__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NaturalProcess__Group_2__0_in_rule__NaturalProcess__Group__2__Impl5874);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2846:1: rule__NaturalProcess__Group_2__0 : rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1 ;
    public final void rule__NaturalProcess__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2850:1: ( rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2851:2: rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__0__Impl_in_rule__NaturalProcess__Group_2__05911);
            rule__NaturalProcess__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__1_in_rule__NaturalProcess__Group_2__05914);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2858:1: rule__NaturalProcess__Group_2__0__Impl : ( '{' ) ;
    public final void rule__NaturalProcess__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2862:1: ( ( '{' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2863:1: ( '{' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2863:1: ( '{' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2864:1: '{'
            {
             before(grammarAccess.getNaturalProcessAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__NaturalProcess__Group_2__0__Impl5942); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2877:1: rule__NaturalProcess__Group_2__1 : rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2 ;
    public final void rule__NaturalProcess__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2881:1: ( rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2882:2: rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__1__Impl_in_rule__NaturalProcess__Group_2__15973);
            rule__NaturalProcess__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__2_in_rule__NaturalProcess__Group_2__15976);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2889:1: rule__NaturalProcess__Group_2__1__Impl : ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* ) ;
    public final void rule__NaturalProcess__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2893:1: ( ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2894:1: ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2894:1: ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2895:1: ( rule__NaturalProcess__ActivitiesAssignment_2_1 )*
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2896:1: ( rule__NaturalProcess__ActivitiesAssignment_2_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2896:2: rule__NaturalProcess__ActivitiesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__NaturalProcess__ActivitiesAssignment_2_1_in_rule__NaturalProcess__Group_2__1__Impl6003);
            	    rule__NaturalProcess__ActivitiesAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2906:1: rule__NaturalProcess__Group_2__2 : rule__NaturalProcess__Group_2__2__Impl ;
    public final void rule__NaturalProcess__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2910:1: ( rule__NaturalProcess__Group_2__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2911:2: rule__NaturalProcess__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__2__Impl_in_rule__NaturalProcess__Group_2__26034);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2917:1: rule__NaturalProcess__Group_2__2__Impl : ( '}' ) ;
    public final void rule__NaturalProcess__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2921:1: ( ( '}' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2922:1: ( '}' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2922:1: ( '}' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2923:1: '}'
            {
             before(grammarAccess.getNaturalProcessAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,35,FOLLOW_35_in_rule__NaturalProcess__Group_2__2__Impl6062); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2942:1: rule__HumanActivity__Group__0 : rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1 ;
    public final void rule__HumanActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2946:1: ( rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2947:2: rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__0__Impl_in_rule__HumanActivity__Group__06099);
            rule__HumanActivity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__1_in_rule__HumanActivity__Group__06102);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2954:1: rule__HumanActivity__Group__0__Impl : ( () ) ;
    public final void rule__HumanActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2958:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2959:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2959:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2960:1: ()
            {
             before(grammarAccess.getHumanActivityAccess().getActivityAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2961:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2963:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2973:1: rule__HumanActivity__Group__1 : rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2 ;
    public final void rule__HumanActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2977:1: ( rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2978:2: rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__1__Impl_in_rule__HumanActivity__Group__16160);
            rule__HumanActivity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__2_in_rule__HumanActivity__Group__16163);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2985:1: rule__HumanActivity__Group__1__Impl : ( 'activity' ) ;
    public final void rule__HumanActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2989:1: ( ( 'activity' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2990:1: ( 'activity' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2990:1: ( 'activity' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2991:1: 'activity'
            {
             before(grammarAccess.getHumanActivityAccess().getActivityKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__HumanActivity__Group__1__Impl6191); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3004:1: rule__HumanActivity__Group__2 : rule__HumanActivity__Group__2__Impl rule__HumanActivity__Group__3 ;
    public final void rule__HumanActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3008:1: ( rule__HumanActivity__Group__2__Impl rule__HumanActivity__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3009:2: rule__HumanActivity__Group__2__Impl rule__HumanActivity__Group__3
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__2__Impl_in_rule__HumanActivity__Group__26222);
            rule__HumanActivity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__3_in_rule__HumanActivity__Group__26225);
            rule__HumanActivity__Group__3();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3016:1: rule__HumanActivity__Group__2__Impl : ( ( rule__HumanActivity__NameAssignment_2 ) ) ;
    public final void rule__HumanActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3020:1: ( ( ( rule__HumanActivity__NameAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3021:1: ( ( rule__HumanActivity__NameAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3021:1: ( ( rule__HumanActivity__NameAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3022:1: ( rule__HumanActivity__NameAssignment_2 )
            {
             before(grammarAccess.getHumanActivityAccess().getNameAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3023:1: ( rule__HumanActivity__NameAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3023:2: rule__HumanActivity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__HumanActivity__NameAssignment_2_in_rule__HumanActivity__Group__2__Impl6252);
            rule__HumanActivity__NameAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getHumanActivityAccess().getNameAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__HumanActivity__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3033:1: rule__HumanActivity__Group__3 : rule__HumanActivity__Group__3__Impl ;
    public final void rule__HumanActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3037:1: ( rule__HumanActivity__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3038:2: rule__HumanActivity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__3__Impl_in_rule__HumanActivity__Group__36282);
            rule__HumanActivity__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__Group__3


    // $ANTLR start rule__HumanActivity__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3044:1: rule__HumanActivity__Group__3__Impl : ( ( rule__HumanActivity__ActionsAssignment_3 )* ) ;
    public final void rule__HumanActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3048:1: ( ( ( rule__HumanActivity__ActionsAssignment_3 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3049:1: ( ( rule__HumanActivity__ActionsAssignment_3 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3049:1: ( ( rule__HumanActivity__ActionsAssignment_3 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3050:1: ( rule__HumanActivity__ActionsAssignment_3 )*
            {
             before(grammarAccess.getHumanActivityAccess().getActionsAssignment_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3051:1: ( rule__HumanActivity__ActionsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3051:2: rule__HumanActivity__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__HumanActivity__ActionsAssignment_3_in_rule__HumanActivity__Group__3__Impl6309);
            	    rule__HumanActivity__ActionsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getHumanActivityAccess().getActionsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__Group__3__Impl


    // $ANTLR start rule__Action__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3069:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3073:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3074:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__06348);
            rule__Action__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__06351);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3081:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3085:1: ( ( 'action' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3086:1: ( 'action' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3086:1: ( 'action' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3087:1: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Action__Group__0__Impl6379); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3100:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3104:1: ( rule__Action__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3105:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__16410);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3111:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3115:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3116:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3116:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3117:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3118:1: ( rule__Action__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3118:2: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl6437);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3132:1: rule__Resource__Group_0__0 : rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1 ;
    public final void rule__Resource__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3136:1: ( rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3137:2: rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1
            {
            pushFollow(FOLLOW_rule__Resource__Group_0__0__Impl_in_rule__Resource__Group_0__06471);
            rule__Resource__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group_0__1_in_rule__Resource__Group_0__06474);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3144:1: rule__Resource__Group_0__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3148:1: ( ( 'resource' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3149:1: ( 'resource' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3149:1: ( 'resource' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3150:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Resource__Group_0__0__Impl6502); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3163:1: rule__Resource__Group_0__1 : rule__Resource__Group_0__1__Impl ;
    public final void rule__Resource__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3167:1: ( rule__Resource__Group_0__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3168:2: rule__Resource__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group_0__1__Impl_in_rule__Resource__Group_0__16533);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3174:1: rule__Resource__Group_0__1__Impl : ( ( rule__Resource__NameAssignment_0_1 ) ) ;
    public final void rule__Resource__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3178:1: ( ( ( rule__Resource__NameAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3179:1: ( ( rule__Resource__NameAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3179:1: ( ( rule__Resource__NameAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3180:1: ( rule__Resource__NameAssignment_0_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3181:1: ( rule__Resource__NameAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3181:2: rule__Resource__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_0_1_in_rule__Resource__Group_0__1__Impl6560);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3195:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3199:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3200:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__06594);
            rule__Asset__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__06597);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3207:1: rule__Asset__Group__0__Impl : ( 'asset' ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3211:1: ( ( 'asset' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3212:1: ( 'asset' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3212:1: ( 'asset' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3213:1: 'asset'
            {
             before(grammarAccess.getAssetAccess().getAssetKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Asset__Group__0__Impl6625); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3226:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3230:1: ( rule__Asset__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3231:2: rule__Asset__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__16656);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3237:1: rule__Asset__Group__1__Impl : ( ( rule__Asset__NameAssignment_1 ) ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3241:1: ( ( ( rule__Asset__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3242:1: ( ( rule__Asset__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3242:1: ( ( rule__Asset__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3243:1: ( rule__Asset__NameAssignment_1 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3244:1: ( rule__Asset__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3244:2: rule__Asset__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl6683);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3258:1: rule__Wants__Group__0 : rule__Wants__Group__0__Impl rule__Wants__Group__1 ;
    public final void rule__Wants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3262:1: ( rule__Wants__Group__0__Impl rule__Wants__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3263:2: rule__Wants__Group__0__Impl rule__Wants__Group__1
            {
            pushFollow(FOLLOW_rule__Wants__Group__0__Impl_in_rule__Wants__Group__06717);
            rule__Wants__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__1_in_rule__Wants__Group__06720);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3270:1: rule__Wants__Group__0__Impl : ( ( rule__Wants__TypeAssignment_0 ) ) ;
    public final void rule__Wants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3274:1: ( ( ( rule__Wants__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3275:1: ( ( rule__Wants__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3275:1: ( ( rule__Wants__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3276:1: ( rule__Wants__TypeAssignment_0 )
            {
             before(grammarAccess.getWantsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3277:1: ( rule__Wants__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3277:2: rule__Wants__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Wants__TypeAssignment_0_in_rule__Wants__Group__0__Impl6747);
            rule__Wants__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getWantsAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3287:1: rule__Wants__Group__1 : rule__Wants__Group__1__Impl rule__Wants__Group__2 ;
    public final void rule__Wants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3291:1: ( rule__Wants__Group__1__Impl rule__Wants__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3292:2: rule__Wants__Group__1__Impl rule__Wants__Group__2
            {
            pushFollow(FOLLOW_rule__Wants__Group__1__Impl_in_rule__Wants__Group__16777);
            rule__Wants__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__2_in_rule__Wants__Group__16780);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3299:1: rule__Wants__Group__1__Impl : ( '(' ) ;
    public final void rule__Wants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3303:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3304:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3304:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3305:1: '('
            {
             before(grammarAccess.getWantsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Wants__Group__1__Impl6808); 
             after(grammarAccess.getWantsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3318:1: rule__Wants__Group__2 : rule__Wants__Group__2__Impl rule__Wants__Group__3 ;
    public final void rule__Wants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3322:1: ( rule__Wants__Group__2__Impl rule__Wants__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3323:2: rule__Wants__Group__2__Impl rule__Wants__Group__3
            {
            pushFollow(FOLLOW_rule__Wants__Group__2__Impl_in_rule__Wants__Group__26839);
            rule__Wants__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__3_in_rule__Wants__Group__26842);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3330:1: rule__Wants__Group__2__Impl : ( ( rule__Wants__SourceAssignment_2 ) ) ;
    public final void rule__Wants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3334:1: ( ( ( rule__Wants__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3335:1: ( ( rule__Wants__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3335:1: ( ( rule__Wants__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3336:1: ( rule__Wants__SourceAssignment_2 )
            {
             before(grammarAccess.getWantsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3337:1: ( rule__Wants__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3337:2: rule__Wants__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Wants__SourceAssignment_2_in_rule__Wants__Group__2__Impl6869);
            rule__Wants__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getWantsAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3347:1: rule__Wants__Group__3 : rule__Wants__Group__3__Impl rule__Wants__Group__4 ;
    public final void rule__Wants__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3351:1: ( rule__Wants__Group__3__Impl rule__Wants__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3352:2: rule__Wants__Group__3__Impl rule__Wants__Group__4
            {
            pushFollow(FOLLOW_rule__Wants__Group__3__Impl_in_rule__Wants__Group__36899);
            rule__Wants__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__4_in_rule__Wants__Group__36902);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3359:1: rule__Wants__Group__3__Impl : ( ',' ) ;
    public final void rule__Wants__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3363:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3364:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3364:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3365:1: ','
            {
             before(grammarAccess.getWantsAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Wants__Group__3__Impl6930); 
             after(grammarAccess.getWantsAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3378:1: rule__Wants__Group__4 : rule__Wants__Group__4__Impl rule__Wants__Group__5 ;
    public final void rule__Wants__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3382:1: ( rule__Wants__Group__4__Impl rule__Wants__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3383:2: rule__Wants__Group__4__Impl rule__Wants__Group__5
            {
            pushFollow(FOLLOW_rule__Wants__Group__4__Impl_in_rule__Wants__Group__46961);
            rule__Wants__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__5_in_rule__Wants__Group__46964);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3390:1: rule__Wants__Group__4__Impl : ( ( rule__Wants__TargetAssignment_4 ) ) ;
    public final void rule__Wants__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3394:1: ( ( ( rule__Wants__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3395:1: ( ( rule__Wants__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3395:1: ( ( rule__Wants__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3396:1: ( rule__Wants__TargetAssignment_4 )
            {
             before(grammarAccess.getWantsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3397:1: ( rule__Wants__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3397:2: rule__Wants__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Wants__TargetAssignment_4_in_rule__Wants__Group__4__Impl6991);
            rule__Wants__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getWantsAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3407:1: rule__Wants__Group__5 : rule__Wants__Group__5__Impl ;
    public final void rule__Wants__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3411:1: ( rule__Wants__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3412:2: rule__Wants__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Wants__Group__5__Impl_in_rule__Wants__Group__57021);
            rule__Wants__Group__5__Impl();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3418:1: rule__Wants__Group__5__Impl : ( ')' ) ;
    public final void rule__Wants__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3422:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3423:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3423:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3424:1: ')'
            {
             before(grammarAccess.getWantsAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Wants__Group__5__Impl7049); 
             after(grammarAccess.getWantsAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Does__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3449:1: rule__Does__Group__0 : rule__Does__Group__0__Impl rule__Does__Group__1 ;
    public final void rule__Does__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3453:1: ( rule__Does__Group__0__Impl rule__Does__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3454:2: rule__Does__Group__0__Impl rule__Does__Group__1
            {
            pushFollow(FOLLOW_rule__Does__Group__0__Impl_in_rule__Does__Group__07092);
            rule__Does__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__1_in_rule__Does__Group__07095);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3461:1: rule__Does__Group__0__Impl : ( ( rule__Does__TypeAssignment_0 ) ) ;
    public final void rule__Does__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3465:1: ( ( ( rule__Does__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3466:1: ( ( rule__Does__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3466:1: ( ( rule__Does__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3467:1: ( rule__Does__TypeAssignment_0 )
            {
             before(grammarAccess.getDoesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3468:1: ( rule__Does__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3468:2: rule__Does__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Does__TypeAssignment_0_in_rule__Does__Group__0__Impl7122);
            rule__Does__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDoesAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3478:1: rule__Does__Group__1 : rule__Does__Group__1__Impl rule__Does__Group__2 ;
    public final void rule__Does__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3482:1: ( rule__Does__Group__1__Impl rule__Does__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3483:2: rule__Does__Group__1__Impl rule__Does__Group__2
            {
            pushFollow(FOLLOW_rule__Does__Group__1__Impl_in_rule__Does__Group__17152);
            rule__Does__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__2_in_rule__Does__Group__17155);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3490:1: rule__Does__Group__1__Impl : ( '(' ) ;
    public final void rule__Does__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3494:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3495:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3495:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3496:1: '('
            {
             before(grammarAccess.getDoesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Does__Group__1__Impl7183); 
             after(grammarAccess.getDoesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3509:1: rule__Does__Group__2 : rule__Does__Group__2__Impl rule__Does__Group__3 ;
    public final void rule__Does__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3513:1: ( rule__Does__Group__2__Impl rule__Does__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3514:2: rule__Does__Group__2__Impl rule__Does__Group__3
            {
            pushFollow(FOLLOW_rule__Does__Group__2__Impl_in_rule__Does__Group__27214);
            rule__Does__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__3_in_rule__Does__Group__27217);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3521:1: rule__Does__Group__2__Impl : ( ( rule__Does__SourceAssignment_2 ) ) ;
    public final void rule__Does__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3525:1: ( ( ( rule__Does__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3526:1: ( ( rule__Does__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3526:1: ( ( rule__Does__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3527:1: ( rule__Does__SourceAssignment_2 )
            {
             before(grammarAccess.getDoesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3528:1: ( rule__Does__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3528:2: rule__Does__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Does__SourceAssignment_2_in_rule__Does__Group__2__Impl7244);
            rule__Does__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDoesAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3538:1: rule__Does__Group__3 : rule__Does__Group__3__Impl rule__Does__Group__4 ;
    public final void rule__Does__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3542:1: ( rule__Does__Group__3__Impl rule__Does__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3543:2: rule__Does__Group__3__Impl rule__Does__Group__4
            {
            pushFollow(FOLLOW_rule__Does__Group__3__Impl_in_rule__Does__Group__37274);
            rule__Does__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__4_in_rule__Does__Group__37277);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3550:1: rule__Does__Group__3__Impl : ( ',' ) ;
    public final void rule__Does__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3554:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3555:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3555:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3556:1: ','
            {
             before(grammarAccess.getDoesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Does__Group__3__Impl7305); 
             after(grammarAccess.getDoesAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3569:1: rule__Does__Group__4 : rule__Does__Group__4__Impl rule__Does__Group__5 ;
    public final void rule__Does__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3573:1: ( rule__Does__Group__4__Impl rule__Does__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3574:2: rule__Does__Group__4__Impl rule__Does__Group__5
            {
            pushFollow(FOLLOW_rule__Does__Group__4__Impl_in_rule__Does__Group__47336);
            rule__Does__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__5_in_rule__Does__Group__47339);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3581:1: rule__Does__Group__4__Impl : ( ( rule__Does__TargetAssignment_4 ) ) ;
    public final void rule__Does__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3585:1: ( ( ( rule__Does__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3586:1: ( ( rule__Does__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3586:1: ( ( rule__Does__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3587:1: ( rule__Does__TargetAssignment_4 )
            {
             before(grammarAccess.getDoesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3588:1: ( rule__Does__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3588:2: rule__Does__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Does__TargetAssignment_4_in_rule__Does__Group__4__Impl7366);
            rule__Does__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getDoesAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3598:1: rule__Does__Group__5 : rule__Does__Group__5__Impl ;
    public final void rule__Does__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3602:1: ( rule__Does__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3603:2: rule__Does__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Does__Group__5__Impl_in_rule__Does__Group__57396);
            rule__Does__Group__5__Impl();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3609:1: rule__Does__Group__5__Impl : ( ')' ) ;
    public final void rule__Does__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3613:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3614:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3614:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3615:1: ')'
            {
             before(grammarAccess.getDoesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Does__Group__5__Impl7424); 
             after(grammarAccess.getDoesAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Decomposes__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3640:1: rule__Decomposes__Group__0 : rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1 ;
    public final void rule__Decomposes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3644:1: ( rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3645:2: rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__0__Impl_in_rule__Decomposes__Group__07467);
            rule__Decomposes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__1_in_rule__Decomposes__Group__07470);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3652:1: rule__Decomposes__Group__0__Impl : ( ( rule__Decomposes__TypeAssignment_0 ) ) ;
    public final void rule__Decomposes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3656:1: ( ( ( rule__Decomposes__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3657:1: ( ( rule__Decomposes__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3657:1: ( ( rule__Decomposes__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3658:1: ( rule__Decomposes__TypeAssignment_0 )
            {
             before(grammarAccess.getDecomposesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3659:1: ( rule__Decomposes__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3659:2: rule__Decomposes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Decomposes__TypeAssignment_0_in_rule__Decomposes__Group__0__Impl7497);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3669:1: rule__Decomposes__Group__1 : rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2 ;
    public final void rule__Decomposes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3673:1: ( rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3674:2: rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__1__Impl_in_rule__Decomposes__Group__17527);
            rule__Decomposes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__2_in_rule__Decomposes__Group__17530);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3681:1: rule__Decomposes__Group__1__Impl : ( '(' ) ;
    public final void rule__Decomposes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3685:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3686:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3686:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3687:1: '('
            {
             before(grammarAccess.getDecomposesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Decomposes__Group__1__Impl7558); 
             after(grammarAccess.getDecomposesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3700:1: rule__Decomposes__Group__2 : rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3 ;
    public final void rule__Decomposes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3704:1: ( rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3705:2: rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__2__Impl_in_rule__Decomposes__Group__27589);
            rule__Decomposes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__3_in_rule__Decomposes__Group__27592);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3712:1: rule__Decomposes__Group__2__Impl : ( ( rule__Decomposes__SourceAssignment_2 ) ) ;
    public final void rule__Decomposes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3716:1: ( ( ( rule__Decomposes__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3717:1: ( ( rule__Decomposes__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3717:1: ( ( rule__Decomposes__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3718:1: ( rule__Decomposes__SourceAssignment_2 )
            {
             before(grammarAccess.getDecomposesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3719:1: ( rule__Decomposes__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3719:2: rule__Decomposes__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Decomposes__SourceAssignment_2_in_rule__Decomposes__Group__2__Impl7619);
            rule__Decomposes__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDecomposesAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3729:1: rule__Decomposes__Group__3 : rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4 ;
    public final void rule__Decomposes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3733:1: ( rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3734:2: rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__3__Impl_in_rule__Decomposes__Group__37649);
            rule__Decomposes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__4_in_rule__Decomposes__Group__37652);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3741:1: rule__Decomposes__Group__3__Impl : ( ',' ) ;
    public final void rule__Decomposes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3745:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3746:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3746:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3747:1: ','
            {
             before(grammarAccess.getDecomposesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Decomposes__Group__3__Impl7680); 
             after(grammarAccess.getDecomposesAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3760:1: rule__Decomposes__Group__4 : rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5 ;
    public final void rule__Decomposes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3764:1: ( rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3765:2: rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__4__Impl_in_rule__Decomposes__Group__47711);
            rule__Decomposes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__5_in_rule__Decomposes__Group__47714);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3772:1: rule__Decomposes__Group__4__Impl : ( ( rule__Decomposes__TargetAssignment_4 ) ) ;
    public final void rule__Decomposes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3776:1: ( ( ( rule__Decomposes__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3777:1: ( ( rule__Decomposes__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3777:1: ( ( rule__Decomposes__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3778:1: ( rule__Decomposes__TargetAssignment_4 )
            {
             before(grammarAccess.getDecomposesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3779:1: ( rule__Decomposes__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3779:2: rule__Decomposes__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Decomposes__TargetAssignment_4_in_rule__Decomposes__Group__4__Impl7741);
            rule__Decomposes__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getDecomposesAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3789:1: rule__Decomposes__Group__5 : rule__Decomposes__Group__5__Impl ;
    public final void rule__Decomposes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3793:1: ( rule__Decomposes__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3794:2: rule__Decomposes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__5__Impl_in_rule__Decomposes__Group__57771);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3800:1: rule__Decomposes__Group__5__Impl : ( ')' ) ;
    public final void rule__Decomposes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3804:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3805:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3805:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3806:1: ')'
            {
             before(grammarAccess.getDecomposesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Decomposes__Group__5__Impl7799); 
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


    // $ANTLR start rule__Trusts__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3831:1: rule__Trusts__Group__0 : rule__Trusts__Group__0__Impl rule__Trusts__Group__1 ;
    public final void rule__Trusts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3835:1: ( rule__Trusts__Group__0__Impl rule__Trusts__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3836:2: rule__Trusts__Group__0__Impl rule__Trusts__Group__1
            {
            pushFollow(FOLLOW_rule__Trusts__Group__0__Impl_in_rule__Trusts__Group__07842);
            rule__Trusts__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__1_in_rule__Trusts__Group__07845);
            rule__Trusts__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__0


    // $ANTLR start rule__Trusts__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3843:1: rule__Trusts__Group__0__Impl : ( ( rule__Trusts__TypeAssignment_0 ) ) ;
    public final void rule__Trusts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3847:1: ( ( ( rule__Trusts__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3848:1: ( ( rule__Trusts__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3848:1: ( ( rule__Trusts__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3849:1: ( rule__Trusts__TypeAssignment_0 )
            {
             before(grammarAccess.getTrustsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3850:1: ( rule__Trusts__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3850:2: rule__Trusts__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Trusts__TypeAssignment_0_in_rule__Trusts__Group__0__Impl7872);
            rule__Trusts__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getTrustsAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__0__Impl


    // $ANTLR start rule__Trusts__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3860:1: rule__Trusts__Group__1 : rule__Trusts__Group__1__Impl rule__Trusts__Group__2 ;
    public final void rule__Trusts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3864:1: ( rule__Trusts__Group__1__Impl rule__Trusts__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3865:2: rule__Trusts__Group__1__Impl rule__Trusts__Group__2
            {
            pushFollow(FOLLOW_rule__Trusts__Group__1__Impl_in_rule__Trusts__Group__17902);
            rule__Trusts__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__2_in_rule__Trusts__Group__17905);
            rule__Trusts__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__1


    // $ANTLR start rule__Trusts__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3872:1: rule__Trusts__Group__1__Impl : ( '(' ) ;
    public final void rule__Trusts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3876:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3877:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3877:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3878:1: '('
            {
             before(grammarAccess.getTrustsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Trusts__Group__1__Impl7933); 
             after(grammarAccess.getTrustsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__1__Impl


    // $ANTLR start rule__Trusts__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3891:1: rule__Trusts__Group__2 : rule__Trusts__Group__2__Impl rule__Trusts__Group__3 ;
    public final void rule__Trusts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3895:1: ( rule__Trusts__Group__2__Impl rule__Trusts__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3896:2: rule__Trusts__Group__2__Impl rule__Trusts__Group__3
            {
            pushFollow(FOLLOW_rule__Trusts__Group__2__Impl_in_rule__Trusts__Group__27964);
            rule__Trusts__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__3_in_rule__Trusts__Group__27967);
            rule__Trusts__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__2


    // $ANTLR start rule__Trusts__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3903:1: rule__Trusts__Group__2__Impl : ( ( rule__Trusts__SourceAssignment_2 ) ) ;
    public final void rule__Trusts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3907:1: ( ( ( rule__Trusts__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3908:1: ( ( rule__Trusts__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3908:1: ( ( rule__Trusts__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3909:1: ( rule__Trusts__SourceAssignment_2 )
            {
             before(grammarAccess.getTrustsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3910:1: ( rule__Trusts__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3910:2: rule__Trusts__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Trusts__SourceAssignment_2_in_rule__Trusts__Group__2__Impl7994);
            rule__Trusts__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getTrustsAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__2__Impl


    // $ANTLR start rule__Trusts__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3920:1: rule__Trusts__Group__3 : rule__Trusts__Group__3__Impl rule__Trusts__Group__4 ;
    public final void rule__Trusts__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3924:1: ( rule__Trusts__Group__3__Impl rule__Trusts__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3925:2: rule__Trusts__Group__3__Impl rule__Trusts__Group__4
            {
            pushFollow(FOLLOW_rule__Trusts__Group__3__Impl_in_rule__Trusts__Group__38024);
            rule__Trusts__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__4_in_rule__Trusts__Group__38027);
            rule__Trusts__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__3


    // $ANTLR start rule__Trusts__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3932:1: rule__Trusts__Group__3__Impl : ( ',' ) ;
    public final void rule__Trusts__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3936:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3937:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3937:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3938:1: ','
            {
             before(grammarAccess.getTrustsAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Trusts__Group__3__Impl8055); 
             after(grammarAccess.getTrustsAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__3__Impl


    // $ANTLR start rule__Trusts__Group__4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3951:1: rule__Trusts__Group__4 : rule__Trusts__Group__4__Impl rule__Trusts__Group__5 ;
    public final void rule__Trusts__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3955:1: ( rule__Trusts__Group__4__Impl rule__Trusts__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3956:2: rule__Trusts__Group__4__Impl rule__Trusts__Group__5
            {
            pushFollow(FOLLOW_rule__Trusts__Group__4__Impl_in_rule__Trusts__Group__48086);
            rule__Trusts__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__5_in_rule__Trusts__Group__48089);
            rule__Trusts__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__4


    // $ANTLR start rule__Trusts__Group__4__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3963:1: rule__Trusts__Group__4__Impl : ( ( rule__Trusts__TargetAssignment_4 ) ) ;
    public final void rule__Trusts__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3967:1: ( ( ( rule__Trusts__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3968:1: ( ( rule__Trusts__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3968:1: ( ( rule__Trusts__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3969:1: ( rule__Trusts__TargetAssignment_4 )
            {
             before(grammarAccess.getTrustsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3970:1: ( rule__Trusts__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3970:2: rule__Trusts__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Trusts__TargetAssignment_4_in_rule__Trusts__Group__4__Impl8116);
            rule__Trusts__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getTrustsAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__4__Impl


    // $ANTLR start rule__Trusts__Group__5
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3980:1: rule__Trusts__Group__5 : rule__Trusts__Group__5__Impl rule__Trusts__Group__6 ;
    public final void rule__Trusts__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3984:1: ( rule__Trusts__Group__5__Impl rule__Trusts__Group__6 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3985:2: rule__Trusts__Group__5__Impl rule__Trusts__Group__6
            {
            pushFollow(FOLLOW_rule__Trusts__Group__5__Impl_in_rule__Trusts__Group__58146);
            rule__Trusts__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__6_in_rule__Trusts__Group__58149);
            rule__Trusts__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__5


    // $ANTLR start rule__Trusts__Group__5__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3992:1: rule__Trusts__Group__5__Impl : ( ( rule__Trusts__Group_5__0 )? ) ;
    public final void rule__Trusts__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3996:1: ( ( ( rule__Trusts__Group_5__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3997:1: ( ( rule__Trusts__Group_5__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3997:1: ( ( rule__Trusts__Group_5__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3998:1: ( rule__Trusts__Group_5__0 )?
            {
             before(grammarAccess.getTrustsAccess().getGroup_5()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3999:1: ( rule__Trusts__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3999:2: rule__Trusts__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Trusts__Group_5__0_in_rule__Trusts__Group__5__Impl8176);
                    rule__Trusts__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTrustsAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__5__Impl


    // $ANTLR start rule__Trusts__Group__6
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4009:1: rule__Trusts__Group__6 : rule__Trusts__Group__6__Impl ;
    public final void rule__Trusts__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4013:1: ( rule__Trusts__Group__6__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4014:2: rule__Trusts__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Trusts__Group__6__Impl_in_rule__Trusts__Group__68207);
            rule__Trusts__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__6


    // $ANTLR start rule__Trusts__Group__6__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4020:1: rule__Trusts__Group__6__Impl : ( ')' ) ;
    public final void rule__Trusts__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4024:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4025:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4025:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4026:1: ')'
            {
             before(grammarAccess.getTrustsAccess().getRightParenthesisKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__Trusts__Group__6__Impl8235); 
             after(grammarAccess.getTrustsAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group__6__Impl


    // $ANTLR start rule__Trusts__Group_5__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4053:1: rule__Trusts__Group_5__0 : rule__Trusts__Group_5__0__Impl rule__Trusts__Group_5__1 ;
    public final void rule__Trusts__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4057:1: ( rule__Trusts__Group_5__0__Impl rule__Trusts__Group_5__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4058:2: rule__Trusts__Group_5__0__Impl rule__Trusts__Group_5__1
            {
            pushFollow(FOLLOW_rule__Trusts__Group_5__0__Impl_in_rule__Trusts__Group_5__08280);
            rule__Trusts__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group_5__1_in_rule__Trusts__Group_5__08283);
            rule__Trusts__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group_5__0


    // $ANTLR start rule__Trusts__Group_5__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4065:1: rule__Trusts__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Trusts__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4069:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4070:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4070:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4071:1: ','
            {
             before(grammarAccess.getTrustsAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Trusts__Group_5__0__Impl8311); 
             after(grammarAccess.getTrustsAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group_5__0__Impl


    // $ANTLR start rule__Trusts__Group_5__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4084:1: rule__Trusts__Group_5__1 : rule__Trusts__Group_5__1__Impl ;
    public final void rule__Trusts__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4088:1: ( rule__Trusts__Group_5__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4089:2: rule__Trusts__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Trusts__Group_5__1__Impl_in_rule__Trusts__Group_5__18342);
            rule__Trusts__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group_5__1


    // $ANTLR start rule__Trusts__Group_5__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4095:1: rule__Trusts__Group_5__1__Impl : ( ( rule__Trusts__EntityAssignment_5_1 ) ) ;
    public final void rule__Trusts__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4099:1: ( ( ( rule__Trusts__EntityAssignment_5_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4100:1: ( ( rule__Trusts__EntityAssignment_5_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4100:1: ( ( rule__Trusts__EntityAssignment_5_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4101:1: ( rule__Trusts__EntityAssignment_5_1 )
            {
             before(grammarAccess.getTrustsAccess().getEntityAssignment_5_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4102:1: ( rule__Trusts__EntityAssignment_5_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4102:2: rule__Trusts__EntityAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Trusts__EntityAssignment_5_1_in_rule__Trusts__Group_5__1__Impl8369);
            rule__Trusts__EntityAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getTrustsAccess().getEntityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__Group_5__1__Impl


    // $ANTLR start rule__Delegates__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4116:1: rule__Delegates__Group__0 : rule__Delegates__Group__0__Impl rule__Delegates__Group__1 ;
    public final void rule__Delegates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4120:1: ( rule__Delegates__Group__0__Impl rule__Delegates__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4121:2: rule__Delegates__Group__0__Impl rule__Delegates__Group__1
            {
            pushFollow(FOLLOW_rule__Delegates__Group__0__Impl_in_rule__Delegates__Group__08403);
            rule__Delegates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__1_in_rule__Delegates__Group__08406);
            rule__Delegates__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__0


    // $ANTLR start rule__Delegates__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4128:1: rule__Delegates__Group__0__Impl : ( ( rule__Delegates__TypeAssignment_0 ) ) ;
    public final void rule__Delegates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4132:1: ( ( ( rule__Delegates__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4133:1: ( ( rule__Delegates__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4133:1: ( ( rule__Delegates__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4134:1: ( rule__Delegates__TypeAssignment_0 )
            {
             before(grammarAccess.getDelegatesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4135:1: ( rule__Delegates__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4135:2: rule__Delegates__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Delegates__TypeAssignment_0_in_rule__Delegates__Group__0__Impl8433);
            rule__Delegates__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDelegatesAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__0__Impl


    // $ANTLR start rule__Delegates__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4145:1: rule__Delegates__Group__1 : rule__Delegates__Group__1__Impl rule__Delegates__Group__2 ;
    public final void rule__Delegates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4149:1: ( rule__Delegates__Group__1__Impl rule__Delegates__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4150:2: rule__Delegates__Group__1__Impl rule__Delegates__Group__2
            {
            pushFollow(FOLLOW_rule__Delegates__Group__1__Impl_in_rule__Delegates__Group__18463);
            rule__Delegates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__2_in_rule__Delegates__Group__18466);
            rule__Delegates__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__1


    // $ANTLR start rule__Delegates__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4157:1: rule__Delegates__Group__1__Impl : ( '(' ) ;
    public final void rule__Delegates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4161:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4162:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4162:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4163:1: '('
            {
             before(grammarAccess.getDelegatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Delegates__Group__1__Impl8494); 
             after(grammarAccess.getDelegatesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__1__Impl


    // $ANTLR start rule__Delegates__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4176:1: rule__Delegates__Group__2 : rule__Delegates__Group__2__Impl rule__Delegates__Group__3 ;
    public final void rule__Delegates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4180:1: ( rule__Delegates__Group__2__Impl rule__Delegates__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4181:2: rule__Delegates__Group__2__Impl rule__Delegates__Group__3
            {
            pushFollow(FOLLOW_rule__Delegates__Group__2__Impl_in_rule__Delegates__Group__28525);
            rule__Delegates__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__3_in_rule__Delegates__Group__28528);
            rule__Delegates__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__2


    // $ANTLR start rule__Delegates__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4188:1: rule__Delegates__Group__2__Impl : ( ( rule__Delegates__SourceAssignment_2 ) ) ;
    public final void rule__Delegates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4192:1: ( ( ( rule__Delegates__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4193:1: ( ( rule__Delegates__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4193:1: ( ( rule__Delegates__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4194:1: ( rule__Delegates__SourceAssignment_2 )
            {
             before(grammarAccess.getDelegatesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4195:1: ( rule__Delegates__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4195:2: rule__Delegates__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Delegates__SourceAssignment_2_in_rule__Delegates__Group__2__Impl8555);
            rule__Delegates__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDelegatesAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__2__Impl


    // $ANTLR start rule__Delegates__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4205:1: rule__Delegates__Group__3 : rule__Delegates__Group__3__Impl rule__Delegates__Group__4 ;
    public final void rule__Delegates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4209:1: ( rule__Delegates__Group__3__Impl rule__Delegates__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4210:2: rule__Delegates__Group__3__Impl rule__Delegates__Group__4
            {
            pushFollow(FOLLOW_rule__Delegates__Group__3__Impl_in_rule__Delegates__Group__38585);
            rule__Delegates__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__4_in_rule__Delegates__Group__38588);
            rule__Delegates__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__3


    // $ANTLR start rule__Delegates__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4217:1: rule__Delegates__Group__3__Impl : ( ',' ) ;
    public final void rule__Delegates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4221:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4222:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4222:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4223:1: ','
            {
             before(grammarAccess.getDelegatesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Delegates__Group__3__Impl8616); 
             after(grammarAccess.getDelegatesAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__3__Impl


    // $ANTLR start rule__Delegates__Group__4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4236:1: rule__Delegates__Group__4 : rule__Delegates__Group__4__Impl rule__Delegates__Group__5 ;
    public final void rule__Delegates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4240:1: ( rule__Delegates__Group__4__Impl rule__Delegates__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4241:2: rule__Delegates__Group__4__Impl rule__Delegates__Group__5
            {
            pushFollow(FOLLOW_rule__Delegates__Group__4__Impl_in_rule__Delegates__Group__48647);
            rule__Delegates__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__5_in_rule__Delegates__Group__48650);
            rule__Delegates__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__4


    // $ANTLR start rule__Delegates__Group__4__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4248:1: rule__Delegates__Group__4__Impl : ( ( rule__Delegates__TargetAssignment_4 ) ) ;
    public final void rule__Delegates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4252:1: ( ( ( rule__Delegates__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4253:1: ( ( rule__Delegates__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4253:1: ( ( rule__Delegates__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4254:1: ( rule__Delegates__TargetAssignment_4 )
            {
             before(grammarAccess.getDelegatesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4255:1: ( rule__Delegates__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4255:2: rule__Delegates__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Delegates__TargetAssignment_4_in_rule__Delegates__Group__4__Impl8677);
            rule__Delegates__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getDelegatesAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__4__Impl


    // $ANTLR start rule__Delegates__Group__5
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4265:1: rule__Delegates__Group__5 : rule__Delegates__Group__5__Impl rule__Delegates__Group__6 ;
    public final void rule__Delegates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4269:1: ( rule__Delegates__Group__5__Impl rule__Delegates__Group__6 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4270:2: rule__Delegates__Group__5__Impl rule__Delegates__Group__6
            {
            pushFollow(FOLLOW_rule__Delegates__Group__5__Impl_in_rule__Delegates__Group__58707);
            rule__Delegates__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__6_in_rule__Delegates__Group__58710);
            rule__Delegates__Group__6();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__5


    // $ANTLR start rule__Delegates__Group__5__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4277:1: rule__Delegates__Group__5__Impl : ( ( rule__Delegates__Group_5__0 )? ) ;
    public final void rule__Delegates__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4281:1: ( ( ( rule__Delegates__Group_5__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4282:1: ( ( rule__Delegates__Group_5__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4282:1: ( ( rule__Delegates__Group_5__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4283:1: ( rule__Delegates__Group_5__0 )?
            {
             before(grammarAccess.getDelegatesAccess().getGroup_5()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4284:1: ( rule__Delegates__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4284:2: rule__Delegates__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Delegates__Group_5__0_in_rule__Delegates__Group__5__Impl8737);
                    rule__Delegates__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDelegatesAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__5__Impl


    // $ANTLR start rule__Delegates__Group__6
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4294:1: rule__Delegates__Group__6 : rule__Delegates__Group__6__Impl ;
    public final void rule__Delegates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4298:1: ( rule__Delegates__Group__6__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4299:2: rule__Delegates__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Delegates__Group__6__Impl_in_rule__Delegates__Group__68768);
            rule__Delegates__Group__6__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__6


    // $ANTLR start rule__Delegates__Group__6__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4305:1: rule__Delegates__Group__6__Impl : ( ')' ) ;
    public final void rule__Delegates__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4309:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4310:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4310:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4311:1: ')'
            {
             before(grammarAccess.getDelegatesAccess().getRightParenthesisKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__Delegates__Group__6__Impl8796); 
             after(grammarAccess.getDelegatesAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group__6__Impl


    // $ANTLR start rule__Delegates__Group_5__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4338:1: rule__Delegates__Group_5__0 : rule__Delegates__Group_5__0__Impl rule__Delegates__Group_5__1 ;
    public final void rule__Delegates__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4342:1: ( rule__Delegates__Group_5__0__Impl rule__Delegates__Group_5__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4343:2: rule__Delegates__Group_5__0__Impl rule__Delegates__Group_5__1
            {
            pushFollow(FOLLOW_rule__Delegates__Group_5__0__Impl_in_rule__Delegates__Group_5__08841);
            rule__Delegates__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group_5__1_in_rule__Delegates__Group_5__08844);
            rule__Delegates__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group_5__0


    // $ANTLR start rule__Delegates__Group_5__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4350:1: rule__Delegates__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Delegates__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4354:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4355:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4355:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4356:1: ','
            {
             before(grammarAccess.getDelegatesAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Delegates__Group_5__0__Impl8872); 
             after(grammarAccess.getDelegatesAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group_5__0__Impl


    // $ANTLR start rule__Delegates__Group_5__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4369:1: rule__Delegates__Group_5__1 : rule__Delegates__Group_5__1__Impl ;
    public final void rule__Delegates__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4373:1: ( rule__Delegates__Group_5__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4374:2: rule__Delegates__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Delegates__Group_5__1__Impl_in_rule__Delegates__Group_5__18903);
            rule__Delegates__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group_5__1


    // $ANTLR start rule__Delegates__Group_5__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4380:1: rule__Delegates__Group_5__1__Impl : ( ( rule__Delegates__EntityAssignment_5_1 ) ) ;
    public final void rule__Delegates__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4384:1: ( ( ( rule__Delegates__EntityAssignment_5_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4385:1: ( ( rule__Delegates__EntityAssignment_5_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4385:1: ( ( rule__Delegates__EntityAssignment_5_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4386:1: ( rule__Delegates__EntityAssignment_5_1 )
            {
             before(grammarAccess.getDelegatesAccess().getEntityAssignment_5_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4387:1: ( rule__Delegates__EntityAssignment_5_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4387:2: rule__Delegates__EntityAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Delegates__EntityAssignment_5_1_in_rule__Delegates__Group_5__1__Impl8930);
            rule__Delegates__EntityAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getDelegatesAccess().getEntityAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__Group_5__1__Impl


    // $ANTLR start rule__Contributes__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4401:1: rule__Contributes__Group__0 : rule__Contributes__Group__0__Impl rule__Contributes__Group__1 ;
    public final void rule__Contributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4405:1: ( rule__Contributes__Group__0__Impl rule__Contributes__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4406:2: rule__Contributes__Group__0__Impl rule__Contributes__Group__1
            {
            pushFollow(FOLLOW_rule__Contributes__Group__0__Impl_in_rule__Contributes__Group__08964);
            rule__Contributes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__1_in_rule__Contributes__Group__08967);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4413:1: rule__Contributes__Group__0__Impl : ( ( rule__Contributes__TypeAssignment_0 ) ) ;
    public final void rule__Contributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4417:1: ( ( ( rule__Contributes__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4418:1: ( ( rule__Contributes__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4418:1: ( ( rule__Contributes__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4419:1: ( rule__Contributes__TypeAssignment_0 )
            {
             before(grammarAccess.getContributesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4420:1: ( rule__Contributes__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4420:2: rule__Contributes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Contributes__TypeAssignment_0_in_rule__Contributes__Group__0__Impl8994);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4430:1: rule__Contributes__Group__1 : rule__Contributes__Group__1__Impl rule__Contributes__Group__2 ;
    public final void rule__Contributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4434:1: ( rule__Contributes__Group__1__Impl rule__Contributes__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4435:2: rule__Contributes__Group__1__Impl rule__Contributes__Group__2
            {
            pushFollow(FOLLOW_rule__Contributes__Group__1__Impl_in_rule__Contributes__Group__19024);
            rule__Contributes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__2_in_rule__Contributes__Group__19027);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4442:1: rule__Contributes__Group__1__Impl : ( '(' ) ;
    public final void rule__Contributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4446:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4447:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4447:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4448:1: '('
            {
             before(grammarAccess.getContributesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Contributes__Group__1__Impl9055); 
             after(grammarAccess.getContributesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4461:1: rule__Contributes__Group__2 : rule__Contributes__Group__2__Impl rule__Contributes__Group__3 ;
    public final void rule__Contributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4465:1: ( rule__Contributes__Group__2__Impl rule__Contributes__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4466:2: rule__Contributes__Group__2__Impl rule__Contributes__Group__3
            {
            pushFollow(FOLLOW_rule__Contributes__Group__2__Impl_in_rule__Contributes__Group__29086);
            rule__Contributes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__3_in_rule__Contributes__Group__29089);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4473:1: rule__Contributes__Group__2__Impl : ( ( rule__Contributes__SourceAssignment_2 ) ) ;
    public final void rule__Contributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4477:1: ( ( ( rule__Contributes__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4478:1: ( ( rule__Contributes__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4478:1: ( ( rule__Contributes__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4479:1: ( rule__Contributes__SourceAssignment_2 )
            {
             before(grammarAccess.getContributesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4480:1: ( rule__Contributes__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4480:2: rule__Contributes__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Contributes__SourceAssignment_2_in_rule__Contributes__Group__2__Impl9116);
            rule__Contributes__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getContributesAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4490:1: rule__Contributes__Group__3 : rule__Contributes__Group__3__Impl rule__Contributes__Group__4 ;
    public final void rule__Contributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4494:1: ( rule__Contributes__Group__3__Impl rule__Contributes__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4495:2: rule__Contributes__Group__3__Impl rule__Contributes__Group__4
            {
            pushFollow(FOLLOW_rule__Contributes__Group__3__Impl_in_rule__Contributes__Group__39146);
            rule__Contributes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__4_in_rule__Contributes__Group__39149);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4502:1: rule__Contributes__Group__3__Impl : ( ',' ) ;
    public final void rule__Contributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4506:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4507:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4507:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4508:1: ','
            {
             before(grammarAccess.getContributesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Contributes__Group__3__Impl9177); 
             after(grammarAccess.getContributesAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4521:1: rule__Contributes__Group__4 : rule__Contributes__Group__4__Impl rule__Contributes__Group__5 ;
    public final void rule__Contributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4525:1: ( rule__Contributes__Group__4__Impl rule__Contributes__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4526:2: rule__Contributes__Group__4__Impl rule__Contributes__Group__5
            {
            pushFollow(FOLLOW_rule__Contributes__Group__4__Impl_in_rule__Contributes__Group__49208);
            rule__Contributes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__5_in_rule__Contributes__Group__49211);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4533:1: rule__Contributes__Group__4__Impl : ( ( rule__Contributes__TargetAssignment_4 ) ) ;
    public final void rule__Contributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4537:1: ( ( ( rule__Contributes__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4538:1: ( ( rule__Contributes__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4538:1: ( ( rule__Contributes__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4539:1: ( rule__Contributes__TargetAssignment_4 )
            {
             before(grammarAccess.getContributesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4540:1: ( rule__Contributes__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4540:2: rule__Contributes__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Contributes__TargetAssignment_4_in_rule__Contributes__Group__4__Impl9238);
            rule__Contributes__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getContributesAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4550:1: rule__Contributes__Group__5 : rule__Contributes__Group__5__Impl ;
    public final void rule__Contributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4554:1: ( rule__Contributes__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4555:2: rule__Contributes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Contributes__Group__5__Impl_in_rule__Contributes__Group__59268);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4561:1: rule__Contributes__Group__5__Impl : ( ')' ) ;
    public final void rule__Contributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4565:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4566:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4566:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4567:1: ')'
            {
             before(grammarAccess.getContributesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Contributes__Group__5__Impl9296); 
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


    // $ANTLR start rule__Fulfils__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4592:1: rule__Fulfils__Group__0 : rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1 ;
    public final void rule__Fulfils__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4596:1: ( rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4597:2: rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__0__Impl_in_rule__Fulfils__Group__09339);
            rule__Fulfils__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__1_in_rule__Fulfils__Group__09342);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4604:1: rule__Fulfils__Group__0__Impl : ( ( rule__Fulfils__TypeAssignment_0 ) ) ;
    public final void rule__Fulfils__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4608:1: ( ( ( rule__Fulfils__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4609:1: ( ( rule__Fulfils__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4609:1: ( ( rule__Fulfils__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4610:1: ( rule__Fulfils__TypeAssignment_0 )
            {
             before(grammarAccess.getFulfilsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4611:1: ( rule__Fulfils__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4611:2: rule__Fulfils__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Fulfils__TypeAssignment_0_in_rule__Fulfils__Group__0__Impl9369);
            rule__Fulfils__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getFulfilsAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4621:1: rule__Fulfils__Group__1 : rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2 ;
    public final void rule__Fulfils__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4625:1: ( rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4626:2: rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__1__Impl_in_rule__Fulfils__Group__19399);
            rule__Fulfils__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__2_in_rule__Fulfils__Group__19402);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4633:1: rule__Fulfils__Group__1__Impl : ( '(' ) ;
    public final void rule__Fulfils__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4637:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4638:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4638:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4639:1: '('
            {
             before(grammarAccess.getFulfilsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Fulfils__Group__1__Impl9430); 
             after(grammarAccess.getFulfilsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4652:1: rule__Fulfils__Group__2 : rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3 ;
    public final void rule__Fulfils__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4656:1: ( rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4657:2: rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__2__Impl_in_rule__Fulfils__Group__29461);
            rule__Fulfils__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__3_in_rule__Fulfils__Group__29464);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4664:1: rule__Fulfils__Group__2__Impl : ( ( rule__Fulfils__SourceAssignment_2 ) ) ;
    public final void rule__Fulfils__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4668:1: ( ( ( rule__Fulfils__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4669:1: ( ( rule__Fulfils__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4669:1: ( ( rule__Fulfils__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4670:1: ( rule__Fulfils__SourceAssignment_2 )
            {
             before(grammarAccess.getFulfilsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4671:1: ( rule__Fulfils__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4671:2: rule__Fulfils__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Fulfils__SourceAssignment_2_in_rule__Fulfils__Group__2__Impl9491);
            rule__Fulfils__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getFulfilsAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4681:1: rule__Fulfils__Group__3 : rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4 ;
    public final void rule__Fulfils__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4685:1: ( rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4686:2: rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__3__Impl_in_rule__Fulfils__Group__39521);
            rule__Fulfils__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__4_in_rule__Fulfils__Group__39524);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4693:1: rule__Fulfils__Group__3__Impl : ( ',' ) ;
    public final void rule__Fulfils__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4697:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4698:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4698:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4699:1: ','
            {
             before(grammarAccess.getFulfilsAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Fulfils__Group__3__Impl9552); 
             after(grammarAccess.getFulfilsAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4712:1: rule__Fulfils__Group__4 : rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5 ;
    public final void rule__Fulfils__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4716:1: ( rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4717:2: rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__4__Impl_in_rule__Fulfils__Group__49583);
            rule__Fulfils__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__5_in_rule__Fulfils__Group__49586);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4724:1: rule__Fulfils__Group__4__Impl : ( ( rule__Fulfils__TargetAssignment_4 ) ) ;
    public final void rule__Fulfils__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4728:1: ( ( ( rule__Fulfils__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4729:1: ( ( rule__Fulfils__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4729:1: ( ( rule__Fulfils__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4730:1: ( rule__Fulfils__TargetAssignment_4 )
            {
             before(grammarAccess.getFulfilsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4731:1: ( rule__Fulfils__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4731:2: rule__Fulfils__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Fulfils__TargetAssignment_4_in_rule__Fulfils__Group__4__Impl9613);
            rule__Fulfils__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getFulfilsAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4741:1: rule__Fulfils__Group__5 : rule__Fulfils__Group__5__Impl ;
    public final void rule__Fulfils__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4745:1: ( rule__Fulfils__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4746:2: rule__Fulfils__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__5__Impl_in_rule__Fulfils__Group__59643);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4752:1: rule__Fulfils__Group__5__Impl : ( ')' ) ;
    public final void rule__Fulfils__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4756:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4757:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4757:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4758:1: ')'
            {
             before(grammarAccess.getFulfilsAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Fulfils__Group__5__Impl9671); 
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


    // $ANTLR start rule__Provides__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4783:1: rule__Provides__Group__0 : rule__Provides__Group__0__Impl rule__Provides__Group__1 ;
    public final void rule__Provides__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4787:1: ( rule__Provides__Group__0__Impl rule__Provides__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4788:2: rule__Provides__Group__0__Impl rule__Provides__Group__1
            {
            pushFollow(FOLLOW_rule__Provides__Group__0__Impl_in_rule__Provides__Group__09714);
            rule__Provides__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__1_in_rule__Provides__Group__09717);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4795:1: rule__Provides__Group__0__Impl : ( ( rule__Provides__TypeAssignment_0 ) ) ;
    public final void rule__Provides__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4799:1: ( ( ( rule__Provides__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4800:1: ( ( rule__Provides__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4800:1: ( ( rule__Provides__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4801:1: ( rule__Provides__TypeAssignment_0 )
            {
             before(grammarAccess.getProvidesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4802:1: ( rule__Provides__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4802:2: rule__Provides__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Provides__TypeAssignment_0_in_rule__Provides__Group__0__Impl9744);
            rule__Provides__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getProvidesAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4812:1: rule__Provides__Group__1 : rule__Provides__Group__1__Impl rule__Provides__Group__2 ;
    public final void rule__Provides__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4816:1: ( rule__Provides__Group__1__Impl rule__Provides__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4817:2: rule__Provides__Group__1__Impl rule__Provides__Group__2
            {
            pushFollow(FOLLOW_rule__Provides__Group__1__Impl_in_rule__Provides__Group__19774);
            rule__Provides__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__2_in_rule__Provides__Group__19777);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4824:1: rule__Provides__Group__1__Impl : ( '(' ) ;
    public final void rule__Provides__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4828:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4829:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4829:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4830:1: '('
            {
             before(grammarAccess.getProvidesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Provides__Group__1__Impl9805); 
             after(grammarAccess.getProvidesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4843:1: rule__Provides__Group__2 : rule__Provides__Group__2__Impl rule__Provides__Group__3 ;
    public final void rule__Provides__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4847:1: ( rule__Provides__Group__2__Impl rule__Provides__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4848:2: rule__Provides__Group__2__Impl rule__Provides__Group__3
            {
            pushFollow(FOLLOW_rule__Provides__Group__2__Impl_in_rule__Provides__Group__29836);
            rule__Provides__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__3_in_rule__Provides__Group__29839);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4855:1: rule__Provides__Group__2__Impl : ( ( rule__Provides__SourceAssignment_2 ) ) ;
    public final void rule__Provides__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4859:1: ( ( ( rule__Provides__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4860:1: ( ( rule__Provides__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4860:1: ( ( rule__Provides__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4861:1: ( rule__Provides__SourceAssignment_2 )
            {
             before(grammarAccess.getProvidesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4862:1: ( rule__Provides__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4862:2: rule__Provides__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Provides__SourceAssignment_2_in_rule__Provides__Group__2__Impl9866);
            rule__Provides__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getProvidesAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4872:1: rule__Provides__Group__3 : rule__Provides__Group__3__Impl rule__Provides__Group__4 ;
    public final void rule__Provides__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4876:1: ( rule__Provides__Group__3__Impl rule__Provides__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4877:2: rule__Provides__Group__3__Impl rule__Provides__Group__4
            {
            pushFollow(FOLLOW_rule__Provides__Group__3__Impl_in_rule__Provides__Group__39896);
            rule__Provides__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__4_in_rule__Provides__Group__39899);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4884:1: rule__Provides__Group__3__Impl : ( ',' ) ;
    public final void rule__Provides__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4888:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4889:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4889:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4890:1: ','
            {
             before(grammarAccess.getProvidesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Provides__Group__3__Impl9927); 
             after(grammarAccess.getProvidesAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4903:1: rule__Provides__Group__4 : rule__Provides__Group__4__Impl rule__Provides__Group__5 ;
    public final void rule__Provides__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4907:1: ( rule__Provides__Group__4__Impl rule__Provides__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4908:2: rule__Provides__Group__4__Impl rule__Provides__Group__5
            {
            pushFollow(FOLLOW_rule__Provides__Group__4__Impl_in_rule__Provides__Group__49958);
            rule__Provides__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__5_in_rule__Provides__Group__49961);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4915:1: rule__Provides__Group__4__Impl : ( ( rule__Provides__TargetAssignment_4 ) ) ;
    public final void rule__Provides__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4919:1: ( ( ( rule__Provides__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4920:1: ( ( rule__Provides__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4920:1: ( ( rule__Provides__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4921:1: ( rule__Provides__TargetAssignment_4 )
            {
             before(grammarAccess.getProvidesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4922:1: ( rule__Provides__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4922:2: rule__Provides__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Provides__TargetAssignment_4_in_rule__Provides__Group__4__Impl9988);
            rule__Provides__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getProvidesAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4932:1: rule__Provides__Group__5 : rule__Provides__Group__5__Impl ;
    public final void rule__Provides__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4936:1: ( rule__Provides__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4937:2: rule__Provides__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Provides__Group__5__Impl_in_rule__Provides__Group__510018);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4943:1: rule__Provides__Group__5__Impl : ( ')' ) ;
    public final void rule__Provides__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4947:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4948:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4948:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4949:1: ')'
            {
             before(grammarAccess.getProvidesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Provides__Group__5__Impl10046); 
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


    // $ANTLR start rule__Consumes__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4974:1: rule__Consumes__Group__0 : rule__Consumes__Group__0__Impl rule__Consumes__Group__1 ;
    public final void rule__Consumes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4978:1: ( rule__Consumes__Group__0__Impl rule__Consumes__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4979:2: rule__Consumes__Group__0__Impl rule__Consumes__Group__1
            {
            pushFollow(FOLLOW_rule__Consumes__Group__0__Impl_in_rule__Consumes__Group__010089);
            rule__Consumes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__1_in_rule__Consumes__Group__010092);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4986:1: rule__Consumes__Group__0__Impl : ( ( rule__Consumes__TypeAssignment_0 ) ) ;
    public final void rule__Consumes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4990:1: ( ( ( rule__Consumes__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4991:1: ( ( rule__Consumes__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4991:1: ( ( rule__Consumes__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4992:1: ( rule__Consumes__TypeAssignment_0 )
            {
             before(grammarAccess.getConsumesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4993:1: ( rule__Consumes__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4993:2: rule__Consumes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Consumes__TypeAssignment_0_in_rule__Consumes__Group__0__Impl10119);
            rule__Consumes__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getConsumesAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5003:1: rule__Consumes__Group__1 : rule__Consumes__Group__1__Impl rule__Consumes__Group__2 ;
    public final void rule__Consumes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5007:1: ( rule__Consumes__Group__1__Impl rule__Consumes__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5008:2: rule__Consumes__Group__1__Impl rule__Consumes__Group__2
            {
            pushFollow(FOLLOW_rule__Consumes__Group__1__Impl_in_rule__Consumes__Group__110149);
            rule__Consumes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__2_in_rule__Consumes__Group__110152);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5015:1: rule__Consumes__Group__1__Impl : ( '(' ) ;
    public final void rule__Consumes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5019:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5020:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5020:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5021:1: '('
            {
             before(grammarAccess.getConsumesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Consumes__Group__1__Impl10180); 
             after(grammarAccess.getConsumesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5034:1: rule__Consumes__Group__2 : rule__Consumes__Group__2__Impl rule__Consumes__Group__3 ;
    public final void rule__Consumes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5038:1: ( rule__Consumes__Group__2__Impl rule__Consumes__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5039:2: rule__Consumes__Group__2__Impl rule__Consumes__Group__3
            {
            pushFollow(FOLLOW_rule__Consumes__Group__2__Impl_in_rule__Consumes__Group__210211);
            rule__Consumes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__3_in_rule__Consumes__Group__210214);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5046:1: rule__Consumes__Group__2__Impl : ( ( rule__Consumes__SourceAssignment_2 ) ) ;
    public final void rule__Consumes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5050:1: ( ( ( rule__Consumes__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5051:1: ( ( rule__Consumes__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5051:1: ( ( rule__Consumes__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5052:1: ( rule__Consumes__SourceAssignment_2 )
            {
             before(grammarAccess.getConsumesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5053:1: ( rule__Consumes__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5053:2: rule__Consumes__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Consumes__SourceAssignment_2_in_rule__Consumes__Group__2__Impl10241);
            rule__Consumes__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getConsumesAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5063:1: rule__Consumes__Group__3 : rule__Consumes__Group__3__Impl rule__Consumes__Group__4 ;
    public final void rule__Consumes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5067:1: ( rule__Consumes__Group__3__Impl rule__Consumes__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5068:2: rule__Consumes__Group__3__Impl rule__Consumes__Group__4
            {
            pushFollow(FOLLOW_rule__Consumes__Group__3__Impl_in_rule__Consumes__Group__310271);
            rule__Consumes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__4_in_rule__Consumes__Group__310274);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5075:1: rule__Consumes__Group__3__Impl : ( ',' ) ;
    public final void rule__Consumes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5079:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5080:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5080:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5081:1: ','
            {
             before(grammarAccess.getConsumesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Consumes__Group__3__Impl10302); 
             after(grammarAccess.getConsumesAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5094:1: rule__Consumes__Group__4 : rule__Consumes__Group__4__Impl rule__Consumes__Group__5 ;
    public final void rule__Consumes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5098:1: ( rule__Consumes__Group__4__Impl rule__Consumes__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5099:2: rule__Consumes__Group__4__Impl rule__Consumes__Group__5
            {
            pushFollow(FOLLOW_rule__Consumes__Group__4__Impl_in_rule__Consumes__Group__410333);
            rule__Consumes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__5_in_rule__Consumes__Group__410336);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5106:1: rule__Consumes__Group__4__Impl : ( ( rule__Consumes__TargetAssignment_4 ) ) ;
    public final void rule__Consumes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5110:1: ( ( ( rule__Consumes__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5111:1: ( ( rule__Consumes__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5111:1: ( ( rule__Consumes__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5112:1: ( rule__Consumes__TargetAssignment_4 )
            {
             before(grammarAccess.getConsumesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5113:1: ( rule__Consumes__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5113:2: rule__Consumes__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Consumes__TargetAssignment_4_in_rule__Consumes__Group__4__Impl10363);
            rule__Consumes__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getConsumesAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5123:1: rule__Consumes__Group__5 : rule__Consumes__Group__5__Impl ;
    public final void rule__Consumes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5127:1: ( rule__Consumes__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5128:2: rule__Consumes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Consumes__Group__5__Impl_in_rule__Consumes__Group__510393);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5134:1: rule__Consumes__Group__5__Impl : ( ')' ) ;
    public final void rule__Consumes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5138:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5139:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5139:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5140:1: ')'
            {
             before(grammarAccess.getConsumesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Consumes__Group__5__Impl10421); 
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


    // $ANTLR start rule__Exploits__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5165:1: rule__Exploits__Group__0 : rule__Exploits__Group__0__Impl rule__Exploits__Group__1 ;
    public final void rule__Exploits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5169:1: ( rule__Exploits__Group__0__Impl rule__Exploits__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5170:2: rule__Exploits__Group__0__Impl rule__Exploits__Group__1
            {
            pushFollow(FOLLOW_rule__Exploits__Group__0__Impl_in_rule__Exploits__Group__010464);
            rule__Exploits__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__1_in_rule__Exploits__Group__010467);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5177:1: rule__Exploits__Group__0__Impl : ( ( rule__Exploits__TypeAssignment_0 ) ) ;
    public final void rule__Exploits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5181:1: ( ( ( rule__Exploits__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5182:1: ( ( rule__Exploits__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5182:1: ( ( rule__Exploits__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5183:1: ( rule__Exploits__TypeAssignment_0 )
            {
             before(grammarAccess.getExploitsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5184:1: ( rule__Exploits__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5184:2: rule__Exploits__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Exploits__TypeAssignment_0_in_rule__Exploits__Group__0__Impl10494);
            rule__Exploits__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getExploitsAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5194:1: rule__Exploits__Group__1 : rule__Exploits__Group__1__Impl rule__Exploits__Group__2 ;
    public final void rule__Exploits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5198:1: ( rule__Exploits__Group__1__Impl rule__Exploits__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5199:2: rule__Exploits__Group__1__Impl rule__Exploits__Group__2
            {
            pushFollow(FOLLOW_rule__Exploits__Group__1__Impl_in_rule__Exploits__Group__110524);
            rule__Exploits__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__2_in_rule__Exploits__Group__110527);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5206:1: rule__Exploits__Group__1__Impl : ( '(' ) ;
    public final void rule__Exploits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5210:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5211:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5211:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5212:1: '('
            {
             before(grammarAccess.getExploitsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Exploits__Group__1__Impl10555); 
             after(grammarAccess.getExploitsAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5225:1: rule__Exploits__Group__2 : rule__Exploits__Group__2__Impl rule__Exploits__Group__3 ;
    public final void rule__Exploits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5229:1: ( rule__Exploits__Group__2__Impl rule__Exploits__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5230:2: rule__Exploits__Group__2__Impl rule__Exploits__Group__3
            {
            pushFollow(FOLLOW_rule__Exploits__Group__2__Impl_in_rule__Exploits__Group__210586);
            rule__Exploits__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__3_in_rule__Exploits__Group__210589);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5237:1: rule__Exploits__Group__2__Impl : ( ( rule__Exploits__SourceAssignment_2 ) ) ;
    public final void rule__Exploits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5241:1: ( ( ( rule__Exploits__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5242:1: ( ( rule__Exploits__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5242:1: ( ( rule__Exploits__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5243:1: ( rule__Exploits__SourceAssignment_2 )
            {
             before(grammarAccess.getExploitsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5244:1: ( rule__Exploits__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5244:2: rule__Exploits__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Exploits__SourceAssignment_2_in_rule__Exploits__Group__2__Impl10616);
            rule__Exploits__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getExploitsAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5254:1: rule__Exploits__Group__3 : rule__Exploits__Group__3__Impl rule__Exploits__Group__4 ;
    public final void rule__Exploits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5258:1: ( rule__Exploits__Group__3__Impl rule__Exploits__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5259:2: rule__Exploits__Group__3__Impl rule__Exploits__Group__4
            {
            pushFollow(FOLLOW_rule__Exploits__Group__3__Impl_in_rule__Exploits__Group__310646);
            rule__Exploits__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__4_in_rule__Exploits__Group__310649);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5266:1: rule__Exploits__Group__3__Impl : ( ',' ) ;
    public final void rule__Exploits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5270:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5271:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5271:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5272:1: ','
            {
             before(grammarAccess.getExploitsAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Exploits__Group__3__Impl10677); 
             after(grammarAccess.getExploitsAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5285:1: rule__Exploits__Group__4 : rule__Exploits__Group__4__Impl rule__Exploits__Group__5 ;
    public final void rule__Exploits__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5289:1: ( rule__Exploits__Group__4__Impl rule__Exploits__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5290:2: rule__Exploits__Group__4__Impl rule__Exploits__Group__5
            {
            pushFollow(FOLLOW_rule__Exploits__Group__4__Impl_in_rule__Exploits__Group__410708);
            rule__Exploits__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__5_in_rule__Exploits__Group__410711);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5297:1: rule__Exploits__Group__4__Impl : ( ( rule__Exploits__TargetAssignment_4 ) ) ;
    public final void rule__Exploits__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5301:1: ( ( ( rule__Exploits__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5302:1: ( ( rule__Exploits__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5302:1: ( ( rule__Exploits__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5303:1: ( rule__Exploits__TargetAssignment_4 )
            {
             before(grammarAccess.getExploitsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5304:1: ( rule__Exploits__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5304:2: rule__Exploits__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Exploits__TargetAssignment_4_in_rule__Exploits__Group__4__Impl10738);
            rule__Exploits__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getExploitsAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5314:1: rule__Exploits__Group__5 : rule__Exploits__Group__5__Impl ;
    public final void rule__Exploits__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5318:1: ( rule__Exploits__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5319:2: rule__Exploits__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Exploits__Group__5__Impl_in_rule__Exploits__Group__510768);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5325:1: rule__Exploits__Group__5__Impl : ( ')' ) ;
    public final void rule__Exploits__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5329:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5330:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5330:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5331:1: ')'
            {
             before(grammarAccess.getExploitsAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Exploits__Group__5__Impl10796); 
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


    // $ANTLR start rule__Damages__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5356:1: rule__Damages__Group__0 : rule__Damages__Group__0__Impl rule__Damages__Group__1 ;
    public final void rule__Damages__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5360:1: ( rule__Damages__Group__0__Impl rule__Damages__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5361:2: rule__Damages__Group__0__Impl rule__Damages__Group__1
            {
            pushFollow(FOLLOW_rule__Damages__Group__0__Impl_in_rule__Damages__Group__010839);
            rule__Damages__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__1_in_rule__Damages__Group__010842);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5368:1: rule__Damages__Group__0__Impl : ( ( rule__Damages__TypeAssignment_0 ) ) ;
    public final void rule__Damages__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5372:1: ( ( ( rule__Damages__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5373:1: ( ( rule__Damages__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5373:1: ( ( rule__Damages__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5374:1: ( rule__Damages__TypeAssignment_0 )
            {
             before(grammarAccess.getDamagesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5375:1: ( rule__Damages__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5375:2: rule__Damages__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Damages__TypeAssignment_0_in_rule__Damages__Group__0__Impl10869);
            rule__Damages__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getDamagesAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5385:1: rule__Damages__Group__1 : rule__Damages__Group__1__Impl rule__Damages__Group__2 ;
    public final void rule__Damages__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5389:1: ( rule__Damages__Group__1__Impl rule__Damages__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5390:2: rule__Damages__Group__1__Impl rule__Damages__Group__2
            {
            pushFollow(FOLLOW_rule__Damages__Group__1__Impl_in_rule__Damages__Group__110899);
            rule__Damages__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__2_in_rule__Damages__Group__110902);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5397:1: rule__Damages__Group__1__Impl : ( '(' ) ;
    public final void rule__Damages__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5401:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5402:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5402:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5403:1: '('
            {
             before(grammarAccess.getDamagesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Damages__Group__1__Impl10930); 
             after(grammarAccess.getDamagesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5416:1: rule__Damages__Group__2 : rule__Damages__Group__2__Impl rule__Damages__Group__3 ;
    public final void rule__Damages__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5420:1: ( rule__Damages__Group__2__Impl rule__Damages__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5421:2: rule__Damages__Group__2__Impl rule__Damages__Group__3
            {
            pushFollow(FOLLOW_rule__Damages__Group__2__Impl_in_rule__Damages__Group__210961);
            rule__Damages__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__3_in_rule__Damages__Group__210964);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5428:1: rule__Damages__Group__2__Impl : ( ( rule__Damages__SourceAssignment_2 ) ) ;
    public final void rule__Damages__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5432:1: ( ( ( rule__Damages__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5433:1: ( ( rule__Damages__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5433:1: ( ( rule__Damages__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5434:1: ( rule__Damages__SourceAssignment_2 )
            {
             before(grammarAccess.getDamagesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5435:1: ( rule__Damages__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5435:2: rule__Damages__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Damages__SourceAssignment_2_in_rule__Damages__Group__2__Impl10991);
            rule__Damages__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getDamagesAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5445:1: rule__Damages__Group__3 : rule__Damages__Group__3__Impl rule__Damages__Group__4 ;
    public final void rule__Damages__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5449:1: ( rule__Damages__Group__3__Impl rule__Damages__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5450:2: rule__Damages__Group__3__Impl rule__Damages__Group__4
            {
            pushFollow(FOLLOW_rule__Damages__Group__3__Impl_in_rule__Damages__Group__311021);
            rule__Damages__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__4_in_rule__Damages__Group__311024);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5457:1: rule__Damages__Group__3__Impl : ( ',' ) ;
    public final void rule__Damages__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5461:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5462:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5462:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5463:1: ','
            {
             before(grammarAccess.getDamagesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Damages__Group__3__Impl11052); 
             after(grammarAccess.getDamagesAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5476:1: rule__Damages__Group__4 : rule__Damages__Group__4__Impl rule__Damages__Group__5 ;
    public final void rule__Damages__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5480:1: ( rule__Damages__Group__4__Impl rule__Damages__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5481:2: rule__Damages__Group__4__Impl rule__Damages__Group__5
            {
            pushFollow(FOLLOW_rule__Damages__Group__4__Impl_in_rule__Damages__Group__411083);
            rule__Damages__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__5_in_rule__Damages__Group__411086);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5488:1: rule__Damages__Group__4__Impl : ( ( rule__Damages__TargetAssignment_4 ) ) ;
    public final void rule__Damages__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5492:1: ( ( ( rule__Damages__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5493:1: ( ( rule__Damages__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5493:1: ( ( rule__Damages__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5494:1: ( rule__Damages__TargetAssignment_4 )
            {
             before(grammarAccess.getDamagesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5495:1: ( rule__Damages__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5495:2: rule__Damages__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Damages__TargetAssignment_4_in_rule__Damages__Group__4__Impl11113);
            rule__Damages__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getDamagesAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5505:1: rule__Damages__Group__5 : rule__Damages__Group__5__Impl ;
    public final void rule__Damages__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5509:1: ( rule__Damages__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5510:2: rule__Damages__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Damages__Group__5__Impl_in_rule__Damages__Group__511143);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5516:1: rule__Damages__Group__5__Impl : ( ')' ) ;
    public final void rule__Damages__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5520:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5521:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5521:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5522:1: ')'
            {
             before(grammarAccess.getDamagesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Damages__Group__5__Impl11171); 
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


    // $ANTLR start rule__Attacks__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5547:1: rule__Attacks__Group__0 : rule__Attacks__Group__0__Impl rule__Attacks__Group__1 ;
    public final void rule__Attacks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5551:1: ( rule__Attacks__Group__0__Impl rule__Attacks__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5552:2: rule__Attacks__Group__0__Impl rule__Attacks__Group__1
            {
            pushFollow(FOLLOW_rule__Attacks__Group__0__Impl_in_rule__Attacks__Group__011214);
            rule__Attacks__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__1_in_rule__Attacks__Group__011217);
            rule__Attacks__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__0


    // $ANTLR start rule__Attacks__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5559:1: rule__Attacks__Group__0__Impl : ( ( rule__Attacks__TypeAssignment_0 ) ) ;
    public final void rule__Attacks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5563:1: ( ( ( rule__Attacks__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5564:1: ( ( rule__Attacks__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5564:1: ( ( rule__Attacks__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5565:1: ( rule__Attacks__TypeAssignment_0 )
            {
             before(grammarAccess.getAttacksAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5566:1: ( rule__Attacks__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5566:2: rule__Attacks__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attacks__TypeAssignment_0_in_rule__Attacks__Group__0__Impl11244);
            rule__Attacks__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttacksAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__0__Impl


    // $ANTLR start rule__Attacks__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5576:1: rule__Attacks__Group__1 : rule__Attacks__Group__1__Impl rule__Attacks__Group__2 ;
    public final void rule__Attacks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5580:1: ( rule__Attacks__Group__1__Impl rule__Attacks__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5581:2: rule__Attacks__Group__1__Impl rule__Attacks__Group__2
            {
            pushFollow(FOLLOW_rule__Attacks__Group__1__Impl_in_rule__Attacks__Group__111274);
            rule__Attacks__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__2_in_rule__Attacks__Group__111277);
            rule__Attacks__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__1


    // $ANTLR start rule__Attacks__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5588:1: rule__Attacks__Group__1__Impl : ( '(' ) ;
    public final void rule__Attacks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5592:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5593:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5593:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5594:1: '('
            {
             before(grammarAccess.getAttacksAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Attacks__Group__1__Impl11305); 
             after(grammarAccess.getAttacksAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__1__Impl


    // $ANTLR start rule__Attacks__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5607:1: rule__Attacks__Group__2 : rule__Attacks__Group__2__Impl rule__Attacks__Group__3 ;
    public final void rule__Attacks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5611:1: ( rule__Attacks__Group__2__Impl rule__Attacks__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5612:2: rule__Attacks__Group__2__Impl rule__Attacks__Group__3
            {
            pushFollow(FOLLOW_rule__Attacks__Group__2__Impl_in_rule__Attacks__Group__211336);
            rule__Attacks__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__3_in_rule__Attacks__Group__211339);
            rule__Attacks__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__2


    // $ANTLR start rule__Attacks__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5619:1: rule__Attacks__Group__2__Impl : ( ( rule__Attacks__SourceAssignment_2 ) ) ;
    public final void rule__Attacks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5623:1: ( ( ( rule__Attacks__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5624:1: ( ( rule__Attacks__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5624:1: ( ( rule__Attacks__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5625:1: ( rule__Attacks__SourceAssignment_2 )
            {
             before(grammarAccess.getAttacksAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5626:1: ( rule__Attacks__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5626:2: rule__Attacks__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Attacks__SourceAssignment_2_in_rule__Attacks__Group__2__Impl11366);
            rule__Attacks__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getAttacksAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__2__Impl


    // $ANTLR start rule__Attacks__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5636:1: rule__Attacks__Group__3 : rule__Attacks__Group__3__Impl rule__Attacks__Group__4 ;
    public final void rule__Attacks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5640:1: ( rule__Attacks__Group__3__Impl rule__Attacks__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5641:2: rule__Attacks__Group__3__Impl rule__Attacks__Group__4
            {
            pushFollow(FOLLOW_rule__Attacks__Group__3__Impl_in_rule__Attacks__Group__311396);
            rule__Attacks__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__4_in_rule__Attacks__Group__311399);
            rule__Attacks__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__3


    // $ANTLR start rule__Attacks__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5648:1: rule__Attacks__Group__3__Impl : ( ',' ) ;
    public final void rule__Attacks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5652:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5653:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5653:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5654:1: ','
            {
             before(grammarAccess.getAttacksAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Attacks__Group__3__Impl11427); 
             after(grammarAccess.getAttacksAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__3__Impl


    // $ANTLR start rule__Attacks__Group__4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5667:1: rule__Attacks__Group__4 : rule__Attacks__Group__4__Impl rule__Attacks__Group__5 ;
    public final void rule__Attacks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5671:1: ( rule__Attacks__Group__4__Impl rule__Attacks__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5672:2: rule__Attacks__Group__4__Impl rule__Attacks__Group__5
            {
            pushFollow(FOLLOW_rule__Attacks__Group__4__Impl_in_rule__Attacks__Group__411458);
            rule__Attacks__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__5_in_rule__Attacks__Group__411461);
            rule__Attacks__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__4


    // $ANTLR start rule__Attacks__Group__4__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5679:1: rule__Attacks__Group__4__Impl : ( ( rule__Attacks__TargetAssignment_4 ) ) ;
    public final void rule__Attacks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5683:1: ( ( ( rule__Attacks__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5684:1: ( ( rule__Attacks__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5684:1: ( ( rule__Attacks__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5685:1: ( rule__Attacks__TargetAssignment_4 )
            {
             before(grammarAccess.getAttacksAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5686:1: ( rule__Attacks__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5686:2: rule__Attacks__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Attacks__TargetAssignment_4_in_rule__Attacks__Group__4__Impl11488);
            rule__Attacks__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getAttacksAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__4__Impl


    // $ANTLR start rule__Attacks__Group__5
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5696:1: rule__Attacks__Group__5 : rule__Attacks__Group__5__Impl ;
    public final void rule__Attacks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5700:1: ( rule__Attacks__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5701:2: rule__Attacks__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attacks__Group__5__Impl_in_rule__Attacks__Group__511518);
            rule__Attacks__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__5


    // $ANTLR start rule__Attacks__Group__5__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5707:1: rule__Attacks__Group__5__Impl : ( ')' ) ;
    public final void rule__Attacks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5711:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5712:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5712:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5713:1: ')'
            {
             before(grammarAccess.getAttacksAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Attacks__Group__5__Impl11546); 
             after(grammarAccess.getAttacksAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__Group__5__Impl


    // $ANTLR start rule__Argues__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5738:1: rule__Argues__Group__0 : rule__Argues__Group__0__Impl rule__Argues__Group__1 ;
    public final void rule__Argues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5742:1: ( rule__Argues__Group__0__Impl rule__Argues__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5743:2: rule__Argues__Group__0__Impl rule__Argues__Group__1
            {
            pushFollow(FOLLOW_rule__Argues__Group__0__Impl_in_rule__Argues__Group__011589);
            rule__Argues__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__1_in_rule__Argues__Group__011592);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5750:1: rule__Argues__Group__0__Impl : ( ( rule__Argues__TypeAssignment_0 ) ) ;
    public final void rule__Argues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5754:1: ( ( ( rule__Argues__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5755:1: ( ( rule__Argues__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5755:1: ( ( rule__Argues__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5756:1: ( rule__Argues__TypeAssignment_0 )
            {
             before(grammarAccess.getArguesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5757:1: ( rule__Argues__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5757:2: rule__Argues__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argues__TypeAssignment_0_in_rule__Argues__Group__0__Impl11619);
            rule__Argues__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getArguesAccess().getTypeAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5767:1: rule__Argues__Group__1 : rule__Argues__Group__1__Impl rule__Argues__Group__2 ;
    public final void rule__Argues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5771:1: ( rule__Argues__Group__1__Impl rule__Argues__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5772:2: rule__Argues__Group__1__Impl rule__Argues__Group__2
            {
            pushFollow(FOLLOW_rule__Argues__Group__1__Impl_in_rule__Argues__Group__111649);
            rule__Argues__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__2_in_rule__Argues__Group__111652);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5779:1: rule__Argues__Group__1__Impl : ( '(' ) ;
    public final void rule__Argues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5783:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5784:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5784:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5785:1: '('
            {
             before(grammarAccess.getArguesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Argues__Group__1__Impl11680); 
             after(grammarAccess.getArguesAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5798:1: rule__Argues__Group__2 : rule__Argues__Group__2__Impl rule__Argues__Group__3 ;
    public final void rule__Argues__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5802:1: ( rule__Argues__Group__2__Impl rule__Argues__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5803:2: rule__Argues__Group__2__Impl rule__Argues__Group__3
            {
            pushFollow(FOLLOW_rule__Argues__Group__2__Impl_in_rule__Argues__Group__211711);
            rule__Argues__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__3_in_rule__Argues__Group__211714);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5810:1: rule__Argues__Group__2__Impl : ( ( rule__Argues__SourceAssignment_2 ) ) ;
    public final void rule__Argues__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5814:1: ( ( ( rule__Argues__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5815:1: ( ( rule__Argues__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5815:1: ( ( rule__Argues__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5816:1: ( rule__Argues__SourceAssignment_2 )
            {
             before(grammarAccess.getArguesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5817:1: ( rule__Argues__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5817:2: rule__Argues__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Argues__SourceAssignment_2_in_rule__Argues__Group__2__Impl11741);
            rule__Argues__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getArguesAccess().getSourceAssignment_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5827:1: rule__Argues__Group__3 : rule__Argues__Group__3__Impl rule__Argues__Group__4 ;
    public final void rule__Argues__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5831:1: ( rule__Argues__Group__3__Impl rule__Argues__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5832:2: rule__Argues__Group__3__Impl rule__Argues__Group__4
            {
            pushFollow(FOLLOW_rule__Argues__Group__3__Impl_in_rule__Argues__Group__311771);
            rule__Argues__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__4_in_rule__Argues__Group__311774);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5839:1: rule__Argues__Group__3__Impl : ( ',' ) ;
    public final void rule__Argues__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5843:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5844:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5844:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5845:1: ','
            {
             before(grammarAccess.getArguesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Argues__Group__3__Impl11802); 
             after(grammarAccess.getArguesAccess().getCommaKeyword_3()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5858:1: rule__Argues__Group__4 : rule__Argues__Group__4__Impl rule__Argues__Group__5 ;
    public final void rule__Argues__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5862:1: ( rule__Argues__Group__4__Impl rule__Argues__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5863:2: rule__Argues__Group__4__Impl rule__Argues__Group__5
            {
            pushFollow(FOLLOW_rule__Argues__Group__4__Impl_in_rule__Argues__Group__411833);
            rule__Argues__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__5_in_rule__Argues__Group__411836);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5870:1: rule__Argues__Group__4__Impl : ( ( rule__Argues__TargetAssignment_4 ) ) ;
    public final void rule__Argues__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5874:1: ( ( ( rule__Argues__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5875:1: ( ( rule__Argues__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5875:1: ( ( rule__Argues__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5876:1: ( rule__Argues__TargetAssignment_4 )
            {
             before(grammarAccess.getArguesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5877:1: ( rule__Argues__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5877:2: rule__Argues__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Argues__TargetAssignment_4_in_rule__Argues__Group__4__Impl11863);
            rule__Argues__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getArguesAccess().getTargetAssignment_4()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5887:1: rule__Argues__Group__5 : rule__Argues__Group__5__Impl ;
    public final void rule__Argues__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5891:1: ( rule__Argues__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5892:2: rule__Argues__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Argues__Group__5__Impl_in_rule__Argues__Group__511893);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5898:1: rule__Argues__Group__5__Impl : ( ')' ) ;
    public final void rule__Argues__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5902:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5903:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5903:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5904:1: ')'
            {
             before(grammarAccess.getArguesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Argues__Group__5__Impl11921); 
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


    // $ANTLR start rule__Situation__TimeAssignment_0_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5930:1: rule__Situation__TimeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Situation__TimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5934:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5935:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5935:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5936:1: RULE_ID
            {
             before(grammarAccess.getSituationAccess().getTimeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_111969); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5945:1: rule__Situation__WorldAssignment_1 : ( ruleWorld ) ;
    public final void rule__Situation__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5949:1: ( ( ruleWorld ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5950:1: ( ruleWorld )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5950:1: ( ruleWorld )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5951:1: ruleWorld
            {
             before(grammarAccess.getSituationAccess().getWorldWorldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_112000);
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


    // $ANTLR start rule__World__PhysicalAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5960:1: rule__World__PhysicalAssignment_1 : ( rulePhysicalWorld ) ;
    public final void rule__World__PhysicalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5964:1: ( ( rulePhysicalWorld ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5965:1: ( rulePhysicalWorld )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5965:1: ( rulePhysicalWorld )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5966:1: rulePhysicalWorld
            {
             before(grammarAccess.getWorldAccess().getPhysicalPhysicalWorldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePhysicalWorld_in_rule__World__PhysicalAssignment_112031);
            rulePhysicalWorld();
            _fsp--;

             after(grammarAccess.getWorldAccess().getPhysicalPhysicalWorldParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__PhysicalAssignment_1


    // $ANTLR start rule__World__BeliefAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5975:1: rule__World__BeliefAssignment_2 : ( ruleBeliefWorld ) ;
    public final void rule__World__BeliefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5979:1: ( ( ruleBeliefWorld ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5980:1: ( ruleBeliefWorld )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5980:1: ( ruleBeliefWorld )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5981:1: ruleBeliefWorld
            {
             before(grammarAccess.getWorldAccess().getBeliefBeliefWorldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBeliefWorld_in_rule__World__BeliefAssignment_212062);
            ruleBeliefWorld();
            _fsp--;

             after(grammarAccess.getWorldAccess().getBeliefBeliefWorldParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__BeliefAssignment_2


    // $ANTLR start rule__Event__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5990:1: rule__Event__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5994:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5995:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5995:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5996:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_112093); 
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


    // $ANTLR start rule__PhysicalWorld__EntitiesAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6005:1: rule__PhysicalWorld__EntitiesAssignment_1 : ( ruleEntity ) ;
    public final void rule__PhysicalWorld__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6009:1: ( ( ruleEntity ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6010:1: ( ruleEntity )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6010:1: ( ruleEntity )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6011:1: ruleEntity
            {
             before(grammarAccess.getPhysicalWorldAccess().getEntitiesEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__PhysicalWorld__EntitiesAssignment_112124);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getPhysicalWorldAccess().getEntitiesEntityParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__PhysicalWorld__EntitiesAssignment_1


    // $ANTLR start rule__BeliefWorld__DomainsAssignment_1_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6020:1: rule__BeliefWorld__DomainsAssignment_1_0 : ( ruleDomain ) ;
    public final void rule__BeliefWorld__DomainsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6024:1: ( ( ruleDomain ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6025:1: ( ruleDomain )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6025:1: ( ruleDomain )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6026:1: ruleDomain
            {
             before(grammarAccess.getBeliefWorldAccess().getDomainsDomainParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleDomain_in_rule__BeliefWorld__DomainsAssignment_1_012155);
            ruleDomain();
            _fsp--;

             after(grammarAccess.getBeliefWorldAccess().getDomainsDomainParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeliefWorld__DomainsAssignment_1_0


    // $ANTLR start rule__BeliefWorld__RelationshipsAssignment_1_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6035:1: rule__BeliefWorld__RelationshipsAssignment_1_1 : ( ruleRelationship ) ;
    public final void rule__BeliefWorld__RelationshipsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6039:1: ( ( ruleRelationship ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6040:1: ( ruleRelationship )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6040:1: ( ruleRelationship )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6041:1: ruleRelationship
            {
             before(grammarAccess.getBeliefWorldAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__BeliefWorld__RelationshipsAssignment_1_112186);
            ruleRelationship();
            _fsp--;

             after(grammarAccess.getBeliefWorldAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__BeliefWorld__RelationshipsAssignment_1_1


    // $ANTLR start rule__Domain__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6050:1: rule__Domain__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6054:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6055:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6055:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6056:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_012217); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__NameAssignment_0


    // $ANTLR start rule__Domain__TypeAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6065:1: rule__Domain__TypeAssignment_1 : ( ruleDomainType ) ;
    public final void rule__Domain__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6069:1: ( ( ruleDomainType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6070:1: ( ruleDomainType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6070:1: ( ruleDomainType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6071:1: ruleDomainType
            {
             before(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDomainType_in_rule__Domain__TypeAssignment_112248);
            ruleDomainType();
            _fsp--;

             after(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__TypeAssignment_1


    // $ANTLR start rule__Domain__PropertiesAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6080:1: rule__Domain__PropertiesAssignment_2 : ( ruleProposition ) ;
    public final void rule__Domain__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6084:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6085:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6085:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6086:1: ruleProposition
            {
             before(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_212279);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__PropertiesAssignment_2


    // $ANTLR start rule__Domain__PropertiesAssignment_3_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6095:1: rule__Domain__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__Domain__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6099:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6100:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6100:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6101:1: ruleProposition
            {
             before(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_3_112310);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__PropertiesAssignment_3_1


    // $ANTLR start rule__DomainAssumption__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6110:1: rule__DomainAssumption__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainAssumption__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6114:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6115:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6115:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6116:1: RULE_ID
            {
             before(grammarAccess.getDomainAssumptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DomainAssumption__NameAssignment_112341); 
             after(grammarAccess.getDomainAssumptionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__DomainAssumption__NameAssignment_1


    // $ANTLR start rule__FunctionalRequirement__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6125:1: rule__FunctionalRequirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionalRequirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6129:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6130:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6130:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6131:1: RULE_ID
            {
             before(grammarAccess.getFunctionalRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionalRequirement__NameAssignment_112372); 
             after(grammarAccess.getFunctionalRequirementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__FunctionalRequirement__NameAssignment_1


    // $ANTLR start rule__SecurityRequirement__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6140:1: rule__SecurityRequirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SecurityRequirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6144:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6145:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6145:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6146:1: RULE_ID
            {
             before(grammarAccess.getSecurityRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SecurityRequirement__NameAssignment_112403); 
             after(grammarAccess.getSecurityRequirementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityRequirement__NameAssignment_1


    // $ANTLR start rule__AntiRequirement__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6155:1: rule__AntiRequirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AntiRequirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6159:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6160:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6160:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6161:1: RULE_ID
            {
             before(grammarAccess.getAntiRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AntiRequirement__NameAssignment_112434); 
             after(grammarAccess.getAntiRequirementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__NameAssignment_1


    // $ANTLR start rule__QualityRequirement__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6170:1: rule__QualityRequirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QualityRequirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6174:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6175:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6175:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6176:1: RULE_ID
            {
             before(grammarAccess.getQualityRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualityRequirement__NameAssignment_112465); 
             after(grammarAccess.getQualityRequirementAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__QualityRequirement__NameAssignment_1


    // $ANTLR start rule__Argument__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6185:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6189:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6190:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6190:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6191:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_112496); 
             after(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argument__NameAssignment_1


    // $ANTLR start rule__Stakeholder__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6200:1: rule__Stakeholder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Stakeholder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6204:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6205:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6205:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6206:1: RULE_ID
            {
             before(grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Stakeholder__NameAssignment_112527); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6215:1: rule__Attacker__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attacker__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6219:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6220:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6220:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6221:1: RULE_ID
            {
             before(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_112558); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6230:1: rule__NaturalProcess__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NaturalProcess__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6234:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6235:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6235:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6236:1: RULE_ID
            {
             before(grammarAccess.getNaturalProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NaturalProcess__NameAssignment_112589); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6245:1: rule__NaturalProcess__ActivitiesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__NaturalProcess__ActivitiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6249:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6250:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6250:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6251:1: ( RULE_ID )
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesProcessCrossReference_2_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6252:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6253:1: RULE_ID
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesProcessIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NaturalProcess__ActivitiesAssignment_2_112624); 
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


    // $ANTLR start rule__HumanActivity__NameAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6264:1: rule__HumanActivity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__HumanActivity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6268:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6269:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6269:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6270:1: RULE_ID
            {
             before(grammarAccess.getHumanActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HumanActivity__NameAssignment_212659); 
             after(grammarAccess.getHumanActivityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__NameAssignment_2


    // $ANTLR start rule__HumanActivity__ActionsAssignment_3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6279:1: rule__HumanActivity__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__HumanActivity__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6283:1: ( ( ruleAction ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6284:1: ( ruleAction )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6284:1: ( ruleAction )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6285:1: ruleAction
            {
             before(grammarAccess.getHumanActivityAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__HumanActivity__ActionsAssignment_312690);
            ruleAction();
            _fsp--;

             after(grammarAccess.getHumanActivityAccess().getActionsActionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__HumanActivity__ActionsAssignment_3


    // $ANTLR start rule__Action__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6294:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6298:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6299:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6299:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6300:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_112721); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6309:1: rule__Resource__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6313:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6314:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6314:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6315:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_0_112752); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6324:1: rule__Asset__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6328:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6329:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6329:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6330:1: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_112783); 
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


    // $ANTLR start rule__Wants__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6339:1: rule__Wants__TypeAssignment_0 : ( ( 'wants' ) ) ;
    public final void rule__Wants__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6343:1: ( ( ( 'wants' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6344:1: ( ( 'wants' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6344:1: ( ( 'wants' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6345:1: ( 'wants' )
            {
             before(grammarAccess.getWantsAccess().getTypeWantsKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6346:1: ( 'wants' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6347:1: 'wants'
            {
             before(grammarAccess.getWantsAccess().getTypeWantsKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Wants__TypeAssignment_012819); 
             after(grammarAccess.getWantsAccess().getTypeWantsKeyword_0_0()); 

            }

             after(grammarAccess.getWantsAccess().getTypeWantsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__TypeAssignment_0


    // $ANTLR start rule__Wants__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6362:1: rule__Wants__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Wants__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6366:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6367:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6367:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6368:1: ( RULE_ID )
            {
             before(grammarAccess.getWantsAccess().getSourceActorCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6369:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6370:1: RULE_ID
            {
             before(grammarAccess.getWantsAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Wants__SourceAssignment_212862); 
             after(grammarAccess.getWantsAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getWantsAccess().getSourceActorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__SourceAssignment_2


    // $ANTLR start rule__Wants__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6381:1: rule__Wants__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Wants__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6385:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6386:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6386:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6387:1: ( RULE_ID )
            {
             before(grammarAccess.getWantsAccess().getTargetRequirementCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6388:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6389:1: RULE_ID
            {
             before(grammarAccess.getWantsAccess().getTargetRequirementIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Wants__TargetAssignment_412901); 
             after(grammarAccess.getWantsAccess().getTargetRequirementIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getWantsAccess().getTargetRequirementCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Wants__TargetAssignment_4


    // $ANTLR start rule__Does__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6400:1: rule__Does__TypeAssignment_0 : ( ( 'does' ) ) ;
    public final void rule__Does__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6404:1: ( ( ( 'does' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6405:1: ( ( 'does' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6405:1: ( ( 'does' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6406:1: ( 'does' )
            {
             before(grammarAccess.getDoesAccess().getTypeDoesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6407:1: ( 'does' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6408:1: 'does'
            {
             before(grammarAccess.getDoesAccess().getTypeDoesKeyword_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Does__TypeAssignment_012941); 
             after(grammarAccess.getDoesAccess().getTypeDoesKeyword_0_0()); 

            }

             after(grammarAccess.getDoesAccess().getTypeDoesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__TypeAssignment_0


    // $ANTLR start rule__Does__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6423:1: rule__Does__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Does__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6427:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6428:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6428:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6429:1: ( RULE_ID )
            {
             before(grammarAccess.getDoesAccess().getSourceActorCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6430:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6431:1: RULE_ID
            {
             before(grammarAccess.getDoesAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Does__SourceAssignment_212984); 
             after(grammarAccess.getDoesAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDoesAccess().getSourceActorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__SourceAssignment_2


    // $ANTLR start rule__Does__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6442:1: rule__Does__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Does__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6446:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6447:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6447:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6448:1: ( RULE_ID )
            {
             before(grammarAccess.getDoesAccess().getTargetActivityCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6449:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6450:1: RULE_ID
            {
             before(grammarAccess.getDoesAccess().getTargetActivityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Does__TargetAssignment_413023); 
             after(grammarAccess.getDoesAccess().getTargetActivityIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDoesAccess().getTargetActivityCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Does__TargetAssignment_4


    // $ANTLR start rule__Decomposes__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6461:1: rule__Decomposes__TypeAssignment_0 : ( ruleDecomposesType ) ;
    public final void rule__Decomposes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6465:1: ( ( ruleDecomposesType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6466:1: ( ruleDecomposesType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6466:1: ( ruleDecomposesType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6467:1: ruleDecomposesType
            {
             before(grammarAccess.getDecomposesAccess().getTypeDecomposesTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDecomposesType_in_rule__Decomposes__TypeAssignment_013058);
            ruleDecomposesType();
            _fsp--;

             after(grammarAccess.getDecomposesAccess().getTypeDecomposesTypeEnumRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Decomposes__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6476:1: rule__Decomposes__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Decomposes__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6480:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6481:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6481:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6482:1: ( RULE_ID )
            {
             before(grammarAccess.getDecomposesAccess().getSourceRequirementCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6483:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6484:1: RULE_ID
            {
             before(grammarAccess.getDecomposesAccess().getSourceRequirementIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decomposes__SourceAssignment_213093); 
             after(grammarAccess.getDecomposesAccess().getSourceRequirementIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDecomposesAccess().getSourceRequirementCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__SourceAssignment_2


    // $ANTLR start rule__Decomposes__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6495:1: rule__Decomposes__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Decomposes__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6499:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6500:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6500:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6501:1: ( RULE_ID )
            {
             before(grammarAccess.getDecomposesAccess().getTargetRequirementCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6502:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6503:1: RULE_ID
            {
             before(grammarAccess.getDecomposesAccess().getTargetRequirementIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decomposes__TargetAssignment_413132); 
             after(grammarAccess.getDecomposesAccess().getTargetRequirementIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDecomposesAccess().getTargetRequirementCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Decomposes__TargetAssignment_4


    // $ANTLR start rule__Trusts__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6514:1: rule__Trusts__TypeAssignment_0 : ( ( 'trusts' ) ) ;
    public final void rule__Trusts__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6518:1: ( ( ( 'trusts' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6519:1: ( ( 'trusts' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6519:1: ( ( 'trusts' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6520:1: ( 'trusts' )
            {
             before(grammarAccess.getTrustsAccess().getTypeTrustsKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6521:1: ( 'trusts' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6522:1: 'trusts'
            {
             before(grammarAccess.getTrustsAccess().getTypeTrustsKeyword_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Trusts__TypeAssignment_013172); 
             after(grammarAccess.getTrustsAccess().getTypeTrustsKeyword_0_0()); 

            }

             after(grammarAccess.getTrustsAccess().getTypeTrustsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__TypeAssignment_0


    // $ANTLR start rule__Trusts__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6537:1: rule__Trusts__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Trusts__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6541:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6542:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6542:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6543:1: ( RULE_ID )
            {
             before(grammarAccess.getTrustsAccess().getSourceActorCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6544:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6545:1: RULE_ID
            {
             before(grammarAccess.getTrustsAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Trusts__SourceAssignment_213215); 
             after(grammarAccess.getTrustsAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTrustsAccess().getSourceActorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__SourceAssignment_2


    // $ANTLR start rule__Trusts__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6556:1: rule__Trusts__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Trusts__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6560:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6561:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6561:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6562:1: ( RULE_ID )
            {
             before(grammarAccess.getTrustsAccess().getTargetActorCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6563:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6564:1: RULE_ID
            {
             before(grammarAccess.getTrustsAccess().getTargetActorIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Trusts__TargetAssignment_413254); 
             after(grammarAccess.getTrustsAccess().getTargetActorIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTrustsAccess().getTargetActorCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__TargetAssignment_4


    // $ANTLR start rule__Trusts__EntityAssignment_5_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6575:1: rule__Trusts__EntityAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Trusts__EntityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6579:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6580:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6580:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6581:1: ( RULE_ID )
            {
             before(grammarAccess.getTrustsAccess().getEntityThingCrossReference_5_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6582:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6583:1: RULE_ID
            {
             before(grammarAccess.getTrustsAccess().getEntityThingIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Trusts__EntityAssignment_5_113293); 
             after(grammarAccess.getTrustsAccess().getEntityThingIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getTrustsAccess().getEntityThingCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Trusts__EntityAssignment_5_1


    // $ANTLR start rule__Delegates__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6594:1: rule__Delegates__TypeAssignment_0 : ( ( 'delegates' ) ) ;
    public final void rule__Delegates__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6598:1: ( ( ( 'delegates' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6599:1: ( ( 'delegates' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6599:1: ( ( 'delegates' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6600:1: ( 'delegates' )
            {
             before(grammarAccess.getDelegatesAccess().getTypeDelegatesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6601:1: ( 'delegates' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6602:1: 'delegates'
            {
             before(grammarAccess.getDelegatesAccess().getTypeDelegatesKeyword_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Delegates__TypeAssignment_013333); 
             after(grammarAccess.getDelegatesAccess().getTypeDelegatesKeyword_0_0()); 

            }

             after(grammarAccess.getDelegatesAccess().getTypeDelegatesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__TypeAssignment_0


    // $ANTLR start rule__Delegates__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6617:1: rule__Delegates__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Delegates__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6621:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6622:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6622:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6623:1: ( RULE_ID )
            {
             before(grammarAccess.getDelegatesAccess().getSourceActorCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6624:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6625:1: RULE_ID
            {
             before(grammarAccess.getDelegatesAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delegates__SourceAssignment_213376); 
             after(grammarAccess.getDelegatesAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDelegatesAccess().getSourceActorCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__SourceAssignment_2


    // $ANTLR start rule__Delegates__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6636:1: rule__Delegates__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Delegates__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6640:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6641:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6641:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6642:1: ( RULE_ID )
            {
             before(grammarAccess.getDelegatesAccess().getTargetActorCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6643:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6644:1: RULE_ID
            {
             before(grammarAccess.getDelegatesAccess().getTargetActorIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delegates__TargetAssignment_413415); 
             after(grammarAccess.getDelegatesAccess().getTargetActorIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDelegatesAccess().getTargetActorCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__TargetAssignment_4


    // $ANTLR start rule__Delegates__EntityAssignment_5_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6655:1: rule__Delegates__EntityAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Delegates__EntityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6659:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6660:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6660:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6661:1: ( RULE_ID )
            {
             before(grammarAccess.getDelegatesAccess().getEntityThingCrossReference_5_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6662:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6663:1: RULE_ID
            {
             before(grammarAccess.getDelegatesAccess().getEntityThingIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delegates__EntityAssignment_5_113454); 
             after(grammarAccess.getDelegatesAccess().getEntityThingIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getDelegatesAccess().getEntityThingCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Delegates__EntityAssignment_5_1


    // $ANTLR start rule__Contributes__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6674:1: rule__Contributes__TypeAssignment_0 : ( ruleContributesType ) ;
    public final void rule__Contributes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6678:1: ( ( ruleContributesType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6679:1: ( ruleContributesType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6679:1: ( ruleContributesType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6680:1: ruleContributesType
            {
             before(grammarAccess.getContributesAccess().getTypeContributesTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleContributesType_in_rule__Contributes__TypeAssignment_013489);
            ruleContributesType();
            _fsp--;

             after(grammarAccess.getContributesAccess().getTypeContributesTypeEnumRuleCall_0_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Contributes__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6689:1: rule__Contributes__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Contributes__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6693:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6694:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6694:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6695:1: ( RULE_ID )
            {
             before(grammarAccess.getContributesAccess().getSourceRequirementCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6696:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6697:1: RULE_ID
            {
             before(grammarAccess.getContributesAccess().getSourceRequirementIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Contributes__SourceAssignment_213524); 
             after(grammarAccess.getContributesAccess().getSourceRequirementIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getContributesAccess().getSourceRequirementCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__SourceAssignment_2


    // $ANTLR start rule__Contributes__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6708:1: rule__Contributes__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Contributes__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6712:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6713:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6713:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6714:1: ( RULE_ID )
            {
             before(grammarAccess.getContributesAccess().getTargetRequirementCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6715:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6716:1: RULE_ID
            {
             before(grammarAccess.getContributesAccess().getTargetRequirementIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Contributes__TargetAssignment_413563); 
             after(grammarAccess.getContributesAccess().getTargetRequirementIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getContributesAccess().getTargetRequirementCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Contributes__TargetAssignment_4


    // $ANTLR start rule__Fulfils__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6727:1: rule__Fulfils__TypeAssignment_0 : ( ruleFulfilsType ) ;
    public final void rule__Fulfils__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6731:1: ( ( ruleFulfilsType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6732:1: ( ruleFulfilsType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6732:1: ( ruleFulfilsType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6733:1: ruleFulfilsType
            {
             before(grammarAccess.getFulfilsAccess().getTypeFulfilsTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFulfilsType_in_rule__Fulfils__TypeAssignment_013598);
            ruleFulfilsType();
            _fsp--;

             after(grammarAccess.getFulfilsAccess().getTypeFulfilsTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__TypeAssignment_0


    // $ANTLR start rule__Fulfils__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6742:1: rule__Fulfils__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Fulfils__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6746:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6747:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6747:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6748:1: ( RULE_ID )
            {
             before(grammarAccess.getFulfilsAccess().getSourceProcessCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6749:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6750:1: RULE_ID
            {
             before(grammarAccess.getFulfilsAccess().getSourceProcessIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fulfils__SourceAssignment_213633); 
             after(grammarAccess.getFulfilsAccess().getSourceProcessIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getFulfilsAccess().getSourceProcessCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__SourceAssignment_2


    // $ANTLR start rule__Fulfils__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6761:1: rule__Fulfils__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Fulfils__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6765:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6766:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6766:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6767:1: ( RULE_ID )
            {
             before(grammarAccess.getFulfilsAccess().getTargetPropositionCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6768:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6769:1: RULE_ID
            {
             before(grammarAccess.getFulfilsAccess().getTargetPropositionIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fulfils__TargetAssignment_413672); 
             after(grammarAccess.getFulfilsAccess().getTargetPropositionIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getFulfilsAccess().getTargetPropositionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Fulfils__TargetAssignment_4


    // $ANTLR start rule__Provides__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6780:1: rule__Provides__TypeAssignment_0 : ( ( 'provides' ) ) ;
    public final void rule__Provides__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6784:1: ( ( ( 'provides' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6785:1: ( ( 'provides' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6785:1: ( ( 'provides' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6786:1: ( 'provides' )
            {
             before(grammarAccess.getProvidesAccess().getTypeProvidesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6787:1: ( 'provides' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6788:1: 'provides'
            {
             before(grammarAccess.getProvidesAccess().getTypeProvidesKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Provides__TypeAssignment_013712); 
             after(grammarAccess.getProvidesAccess().getTypeProvidesKeyword_0_0()); 

            }

             after(grammarAccess.getProvidesAccess().getTypeProvidesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__TypeAssignment_0


    // $ANTLR start rule__Provides__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6803:1: rule__Provides__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Provides__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6807:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6808:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6808:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6809:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidesAccess().getSourceProcessCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6810:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6811:1: RULE_ID
            {
             before(grammarAccess.getProvidesAccess().getSourceProcessIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provides__SourceAssignment_213755); 
             after(grammarAccess.getProvidesAccess().getSourceProcessIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getProvidesAccess().getSourceProcessCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__SourceAssignment_2


    // $ANTLR start rule__Provides__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6822:1: rule__Provides__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Provides__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6826:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6827:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6827:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6828:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidesAccess().getTargetResourceCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6829:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6830:1: RULE_ID
            {
             before(grammarAccess.getProvidesAccess().getTargetResourceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provides__TargetAssignment_413794); 
             after(grammarAccess.getProvidesAccess().getTargetResourceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getProvidesAccess().getTargetResourceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__TargetAssignment_4


    // $ANTLR start rule__Consumes__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6841:1: rule__Consumes__TypeAssignment_0 : ( ( 'consumes' ) ) ;
    public final void rule__Consumes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6845:1: ( ( ( 'consumes' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6846:1: ( ( 'consumes' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6846:1: ( ( 'consumes' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6847:1: ( 'consumes' )
            {
             before(grammarAccess.getConsumesAccess().getTypeConsumesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6848:1: ( 'consumes' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6849:1: 'consumes'
            {
             before(grammarAccess.getConsumesAccess().getTypeConsumesKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Consumes__TypeAssignment_013834); 
             after(grammarAccess.getConsumesAccess().getTypeConsumesKeyword_0_0()); 

            }

             after(grammarAccess.getConsumesAccess().getTypeConsumesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__TypeAssignment_0


    // $ANTLR start rule__Consumes__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6864:1: rule__Consumes__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Consumes__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6868:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6869:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6869:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6870:1: ( RULE_ID )
            {
             before(grammarAccess.getConsumesAccess().getSourceProcessCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6871:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6872:1: RULE_ID
            {
             before(grammarAccess.getConsumesAccess().getSourceProcessIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consumes__SourceAssignment_213877); 
             after(grammarAccess.getConsumesAccess().getSourceProcessIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConsumesAccess().getSourceProcessCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__SourceAssignment_2


    // $ANTLR start rule__Consumes__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6883:1: rule__Consumes__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Consumes__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6887:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6888:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6888:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6889:1: ( RULE_ID )
            {
             before(grammarAccess.getConsumesAccess().getTargetResourceCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6890:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6891:1: RULE_ID
            {
             before(grammarAccess.getConsumesAccess().getTargetResourceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consumes__TargetAssignment_413916); 
             after(grammarAccess.getConsumesAccess().getTargetResourceIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConsumesAccess().getTargetResourceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__TargetAssignment_4


    // $ANTLR start rule__Exploits__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6902:1: rule__Exploits__TypeAssignment_0 : ( ( 'exploits' ) ) ;
    public final void rule__Exploits__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6906:1: ( ( ( 'exploits' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6907:1: ( ( 'exploits' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6907:1: ( ( 'exploits' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6908:1: ( 'exploits' )
            {
             before(grammarAccess.getExploitsAccess().getTypeExploitsKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6909:1: ( 'exploits' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6910:1: 'exploits'
            {
             before(grammarAccess.getExploitsAccess().getTypeExploitsKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Exploits__TypeAssignment_013956); 
             after(grammarAccess.getExploitsAccess().getTypeExploitsKeyword_0_0()); 

            }

             after(grammarAccess.getExploitsAccess().getTypeExploitsKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__TypeAssignment_0


    // $ANTLR start rule__Exploits__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6925:1: rule__Exploits__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Exploits__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6929:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6930:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6930:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6931:1: ( RULE_ID )
            {
             before(grammarAccess.getExploitsAccess().getSourceAttackerCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6932:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6933:1: RULE_ID
            {
             before(grammarAccess.getExploitsAccess().getSourceAttackerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exploits__SourceAssignment_213999); 
             after(grammarAccess.getExploitsAccess().getSourceAttackerIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExploitsAccess().getSourceAttackerCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__SourceAssignment_2


    // $ANTLR start rule__Exploits__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6944:1: rule__Exploits__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Exploits__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6948:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6949:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6949:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6950:1: ( RULE_ID )
            {
             before(grammarAccess.getExploitsAccess().getTargetProcessCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6951:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6952:1: RULE_ID
            {
             before(grammarAccess.getExploitsAccess().getTargetProcessIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exploits__TargetAssignment_414038); 
             after(grammarAccess.getExploitsAccess().getTargetProcessIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getExploitsAccess().getTargetProcessCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Exploits__TargetAssignment_4


    // $ANTLR start rule__Damages__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6963:1: rule__Damages__TypeAssignment_0 : ( ( 'damages' ) ) ;
    public final void rule__Damages__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6967:1: ( ( ( 'damages' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6968:1: ( ( 'damages' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6968:1: ( ( 'damages' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6969:1: ( 'damages' )
            {
             before(grammarAccess.getDamagesAccess().getTypeDamagesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6970:1: ( 'damages' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6971:1: 'damages'
            {
             before(grammarAccess.getDamagesAccess().getTypeDamagesKeyword_0_0()); 
            match(input,49,FOLLOW_49_in_rule__Damages__TypeAssignment_014078); 
             after(grammarAccess.getDamagesAccess().getTypeDamagesKeyword_0_0()); 

            }

             after(grammarAccess.getDamagesAccess().getTypeDamagesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__TypeAssignment_0


    // $ANTLR start rule__Damages__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6986:1: rule__Damages__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Damages__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6990:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6991:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6991:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6992:1: ( RULE_ID )
            {
             before(grammarAccess.getDamagesAccess().getSourceAttackerCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6993:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6994:1: RULE_ID
            {
             before(grammarAccess.getDamagesAccess().getSourceAttackerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Damages__SourceAssignment_214121); 
             after(grammarAccess.getDamagesAccess().getSourceAttackerIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDamagesAccess().getSourceAttackerCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__SourceAssignment_2


    // $ANTLR start rule__Damages__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7005:1: rule__Damages__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Damages__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7009:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7010:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7010:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7011:1: ( RULE_ID )
            {
             before(grammarAccess.getDamagesAccess().getTargetAssetCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7012:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7013:1: RULE_ID
            {
             before(grammarAccess.getDamagesAccess().getTargetAssetIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Damages__TargetAssignment_414160); 
             after(grammarAccess.getDamagesAccess().getTargetAssetIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDamagesAccess().getTargetAssetCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Damages__TargetAssignment_4


    // $ANTLR start rule__Attacks__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7024:1: rule__Attacks__TypeAssignment_0 : ( ( 'attacks' ) ) ;
    public final void rule__Attacks__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7028:1: ( ( ( 'attacks' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7029:1: ( ( 'attacks' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7029:1: ( ( 'attacks' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7030:1: ( 'attacks' )
            {
             before(grammarAccess.getAttacksAccess().getTypeAttacksKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7031:1: ( 'attacks' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7032:1: 'attacks'
            {
             before(grammarAccess.getAttacksAccess().getTypeAttacksKeyword_0_0()); 
            match(input,50,FOLLOW_50_in_rule__Attacks__TypeAssignment_014200); 
             after(grammarAccess.getAttacksAccess().getTypeAttacksKeyword_0_0()); 

            }

             after(grammarAccess.getAttacksAccess().getTypeAttacksKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__TypeAssignment_0


    // $ANTLR start rule__Attacks__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7047:1: rule__Attacks__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attacks__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7051:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7052:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7052:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7053:1: ( RULE_ID )
            {
             before(grammarAccess.getAttacksAccess().getSourceAttackerCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7054:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7055:1: RULE_ID
            {
             before(grammarAccess.getAttacksAccess().getSourceAttackerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacks__SourceAssignment_214243); 
             after(grammarAccess.getAttacksAccess().getSourceAttackerIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttacksAccess().getSourceAttackerCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__SourceAssignment_2


    // $ANTLR start rule__Attacks__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7066:1: rule__Attacks__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Attacks__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7070:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7071:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7071:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7072:1: ( RULE_ID )
            {
             before(grammarAccess.getAttacksAccess().getTargetProcessCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7073:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7074:1: RULE_ID
            {
             before(grammarAccess.getAttacksAccess().getTargetProcessIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacks__TargetAssignment_414282); 
             after(grammarAccess.getAttacksAccess().getTargetProcessIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttacksAccess().getTargetProcessCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacks__TargetAssignment_4


    // $ANTLR start rule__Argues__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7085:1: rule__Argues__TypeAssignment_0 : ( ( 'argues' ) ) ;
    public final void rule__Argues__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7089:1: ( ( ( 'argues' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7090:1: ( ( 'argues' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7090:1: ( ( 'argues' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7091:1: ( 'argues' )
            {
             before(grammarAccess.getArguesAccess().getTypeArguesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7092:1: ( 'argues' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7093:1: 'argues'
            {
             before(grammarAccess.getArguesAccess().getTypeArguesKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__Argues__TypeAssignment_014322); 
             after(grammarAccess.getArguesAccess().getTypeArguesKeyword_0_0()); 

            }

             after(grammarAccess.getArguesAccess().getTypeArguesKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__TypeAssignment_0


    // $ANTLR start rule__Argues__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7108:1: rule__Argues__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Argues__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7112:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7113:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7113:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7114:1: ( RULE_ID )
            {
             before(grammarAccess.getArguesAccess().getSourcePropositionCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7115:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7116:1: RULE_ID
            {
             before(grammarAccess.getArguesAccess().getSourcePropositionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argues__SourceAssignment_214365); 
             after(grammarAccess.getArguesAccess().getSourcePropositionIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getArguesAccess().getSourcePropositionCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__SourceAssignment_2


    // $ANTLR start rule__Argues__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7127:1: rule__Argues__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Argues__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7131:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7132:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7132:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7133:1: ( RULE_ID )
            {
             before(grammarAccess.getArguesAccess().getTargetPropositionCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7134:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:7135:1: RULE_ID
            {
             before(grammarAccess.getArguesAccess().getTargetPropositionIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argues__TargetAssignment_414404); 
             after(grammarAccess.getArguesAccess().getTargetPropositionIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getArguesAccess().getTargetPropositionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Argues__TargetAssignment_4


 

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
    public static final BitSet FOLLOW_rulePhysicalWorld_in_entryRulePhysicalWorld303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePhysicalWorld310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhysicalWorld__Group__0_in_rulePhysicalWorld336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeliefWorld_in_entryRuleBeliefWorld363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBeliefWorld370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__Group__0_in_ruleBeliefWorld396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__Alternatives_in_ruleProposition516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Alternatives_in_ruleRequirement576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainAssumption_in_entryRuleDomainAssumption603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainAssumption610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainAssumption__Group__0_in_ruleDomainAssumption636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalRequirement_in_entryRuleFunctionalRequirement663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionalRequirement670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalRequirement__Group__0_in_ruleFunctionalRequirement696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRequirement_in_entryRuleSecurityRequirement723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityRequirement730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRequirement__Group__0_in_ruleSecurityRequirement756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntiRequirement790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__0_in_ruleAntiRequirement816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityRequirement_in_entryRuleQualityRequirement843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualityRequirement850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityRequirement__Group__0_in_ruleQualityRequirement876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_in_ruleEntity996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Alternatives_in_ruleActor1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__0_in_ruleStakeholder1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0_in_ruleAttacker1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_in_ruleProcess1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalProcess1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__0_in_ruleNaturalProcess1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHumanActivity1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__0_in_ruleHumanActivity1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Alternatives_in_ruleResource1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0_in_ruleAsset1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_entryRuleWants1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWants1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__0_in_ruleWants1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_entryRuleDoes1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoes1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__0_in_ruleDoes1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_entryRuleDecomposes1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposes1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__0_in_ruleDecomposes1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_entryRuleTrusts1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrusts1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__0_in_ruleTrusts1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_entryRuleDelegates1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelegates1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__0_in_ruleDelegates1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_entryRuleContributes1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributes1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__0_in_ruleContributes1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_entryRuleFulfils1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFulfils1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__0_in_ruleFulfils2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_entryRuleProvides2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvides2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__0_in_ruleProvides2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_entryRuleConsumes2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsumes2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__0_in_ruleConsumes2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_entryRuleExploits2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploits2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__0_in_ruleExploits2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_entryRuleDamages2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDamages2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__0_in_ruleDamages2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_entryRuleAttacks2283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacks2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__0_in_ruleAttacks2316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_entryRuleArgues2343 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgues2350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__0_in_ruleArgues2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainType__Alternatives_in_ruleDomainType2413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecomposesType__Alternatives_in_ruleDecomposesType2449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContributesType__Alternatives_in_ruleContributesType2485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFulfilsType2522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Object__Alternatives2560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Object__Alternatives2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Object__Alternatives2594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__DomainsAssignment_1_0_in_rule__BeliefWorld__Alternatives_12626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__RelationshipsAssignment_1_1_in_rule__BeliefWorld__Alternatives_12644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainAssumption_in_rule__Proposition__Alternatives2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_rule__Proposition__Alternatives2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Proposition__Alternatives2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalRequirement_in_rule__Requirement__Alternatives2743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRequirement_in_rule__Requirement__Alternatives2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_rule__Requirement__Alternatives2777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityRequirement_in_rule__Requirement__Alternatives2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__Entity__Alternatives2826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__Entity__Alternatives2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Entity__Alternatives2860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_rule__Actor__Alternatives2892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_rule__Actor__Alternatives2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_rule__Process__Alternatives2941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_rule__Process__Alternatives2958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__0_in_rule__Resource__Alternatives2990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Resource__Alternatives3008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_rule__Relationship__Alternatives3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_rule__Relationship__Alternatives3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_rule__Relationship__Alternatives3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_rule__Relationship__Alternatives3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_rule__Relationship__Alternatives3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_rule__Relationship__Alternatives3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_rule__Relationship__Alternatives3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_rule__Relationship__Alternatives3159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_rule__Relationship__Alternatives3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_rule__Relationship__Alternatives3193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_rule__Relationship__Alternatives3210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_rule__Relationship__Alternatives3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_rule__Relationship__Alternatives3244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DomainType__Alternatives3277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DomainType__Alternatives3298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DomainType__Alternatives3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__DecomposesType__Alternatives3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__DecomposesType__Alternatives3376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ContributesType__Alternatives3412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ContributesType__Alternatives3433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ContributesType__Alternatives3454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__ContributesType__Alternatives3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__03508 = new BitSet(new long[]{0x000FFCD3801F8812L});
    public static final BitSet FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__03511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__13569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__03630 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__03633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Situation__Group_0__0__Impl3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__13692 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__13695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl3722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__23752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Situation__Group_0__2__Impl3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__03817 = new BitSet(new long[]{0x000FFCD3801F8812L});
    public static final BitSet FOLLOW_rule__World__Group__1_in_rule__World__Group__03820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__13878 = new BitSet(new long[]{0x000FFC00001F8812L});
    public static final BitSet FOLLOW_rule__World__Group__2_in_rule__World__Group__13881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__PhysicalAssignment_1_in_rule__World__Group__1__Impl3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__2__Impl_in_rule__World__Group__23939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__BeliefAssignment_2_in_rule__World__Group__2__Impl3966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__04003 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__04006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Event__Group__0__Impl4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl4092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhysicalWorld__Group__0__Impl_in_rule__PhysicalWorld__Group__04126 = new BitSet(new long[]{0x000000D380000002L});
    public static final BitSet FOLLOW_rule__PhysicalWorld__Group__1_in_rule__PhysicalWorld__Group__04129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhysicalWorld__Group__1__Impl_in_rule__PhysicalWorld__Group__14187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhysicalWorld__EntitiesAssignment_1_in_rule__PhysicalWorld__Group__1__Impl4214 = new BitSet(new long[]{0x000000D380000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__Group__0__Impl_in_rule__BeliefWorld__Group__04249 = new BitSet(new long[]{0x000FFC00001F8812L});
    public static final BitSet FOLLOW_rule__BeliefWorld__Group__1_in_rule__BeliefWorld__Group__04252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__Group__1__Impl_in_rule__BeliefWorld__Group__14310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__Alternatives_1_in_rule__BeliefWorld__Group__1__Impl4337 = new BitSet(new long[]{0x000FFC00001F8812L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__04372 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__04375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_0_in_rule__Domain__Group__0__Impl4402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__14432 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__14435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__TypeAssignment_1_in_rule__Domain__Group__1__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__24492 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__24495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_2_in_rule__Domain__Group__2__Impl4522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__34552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__0_in_rule__Domain__Group__3__Impl4579 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__0__Impl_in_rule__Domain__Group_3__04618 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__1_in_rule__Domain__Group_3__04621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Domain__Group_3__0__Impl4649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__1__Impl_in_rule__Domain__Group_3__14680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_3_1_in_rule__Domain__Group_3__1__Impl4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainAssumption__Group__0__Impl_in_rule__DomainAssumption__Group__04741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainAssumption__Group__1_in_rule__DomainAssumption__Group__04744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DomainAssumption__Group__0__Impl4772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainAssumption__Group__1__Impl_in_rule__DomainAssumption__Group__14803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainAssumption__NameAssignment_1_in_rule__DomainAssumption__Group__1__Impl4830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalRequirement__Group__0__Impl_in_rule__FunctionalRequirement__Group__04864 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionalRequirement__Group__1_in_rule__FunctionalRequirement__Group__04867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FunctionalRequirement__Group__0__Impl4895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalRequirement__Group__1__Impl_in_rule__FunctionalRequirement__Group__14926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalRequirement__NameAssignment_1_in_rule__FunctionalRequirement__Group__1__Impl4953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRequirement__Group__0__Impl_in_rule__SecurityRequirement__Group__04987 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SecurityRequirement__Group__1_in_rule__SecurityRequirement__Group__04990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SecurityRequirement__Group__0__Impl5018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRequirement__Group__1__Impl_in_rule__SecurityRequirement__Group__15049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRequirement__NameAssignment_1_in_rule__SecurityRequirement__Group__1__Impl5076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__0__Impl_in_rule__AntiRequirement__Group__05110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__1_in_rule__AntiRequirement__Group__05113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AntiRequirement__Group__0__Impl5141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__1__Impl_in_rule__AntiRequirement__Group__15172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__NameAssignment_1_in_rule__AntiRequirement__Group__1__Impl5199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityRequirement__Group__0__Impl_in_rule__QualityRequirement__Group__05233 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualityRequirement__Group__1_in_rule__QualityRequirement__Group__05236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualityRequirement__Group__0__Impl5264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityRequirement__Group__1__Impl_in_rule__QualityRequirement__Group__15295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityRequirement__NameAssignment_1_in_rule__QualityRequirement__Group__1__Impl5322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__05356 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__05359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Argument__Group__0__Impl5387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__15418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl5445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__0__Impl_in_rule__Stakeholder__Group__05479 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__1_in_rule__Stakeholder__Group__05482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Stakeholder__Group__0__Impl5510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__1__Impl_in_rule__Stakeholder__Group__15541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__NameAssignment_1_in_rule__Stakeholder__Group__1__Impl5568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__05602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__05605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Attacker__Group__0__Impl5633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__15664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__NameAssignment_1_in_rule__Attacker__Group__1__Impl5691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__0__Impl_in_rule__NaturalProcess__Group__05725 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__1_in_rule__NaturalProcess__Group__05728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NaturalProcess__Group__0__Impl5756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__1__Impl_in_rule__NaturalProcess__Group__15787 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__2_in_rule__NaturalProcess__Group__15790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__NameAssignment_1_in_rule__NaturalProcess__Group__1__Impl5817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__2__Impl_in_rule__NaturalProcess__Group__25847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__0_in_rule__NaturalProcess__Group__2__Impl5874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__0__Impl_in_rule__NaturalProcess__Group_2__05911 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__1_in_rule__NaturalProcess__Group_2__05914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NaturalProcess__Group_2__0__Impl5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__1__Impl_in_rule__NaturalProcess__Group_2__15973 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__2_in_rule__NaturalProcess__Group_2__15976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__ActivitiesAssignment_2_1_in_rule__NaturalProcess__Group_2__1__Impl6003 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__2__Impl_in_rule__NaturalProcess__Group_2__26034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NaturalProcess__Group_2__2__Impl6062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__0__Impl_in_rule__HumanActivity__Group__06099 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__1_in_rule__HumanActivity__Group__06102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__1__Impl_in_rule__HumanActivity__Group__16160 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__2_in_rule__HumanActivity__Group__16163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__HumanActivity__Group__1__Impl6191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__2__Impl_in_rule__HumanActivity__Group__26222 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__3_in_rule__HumanActivity__Group__26225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__NameAssignment_2_in_rule__HumanActivity__Group__2__Impl6252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__3__Impl_in_rule__HumanActivity__Group__36282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__ActionsAssignment_3_in_rule__HumanActivity__Group__3__Impl6309 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__06348 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__06351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Action__Group__0__Impl6379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__16410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl6437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__0__Impl_in_rule__Resource__Group_0__06471 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__1_in_rule__Resource__Group_0__06474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Resource__Group_0__0__Impl6502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__1__Impl_in_rule__Resource__Group_0__16533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_0_1_in_rule__Resource__Group_0__1__Impl6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__06594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__06597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Asset__Group__0__Impl6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__16656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl6683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__0__Impl_in_rule__Wants__Group__06717 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__1_in_rule__Wants__Group__06720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__TypeAssignment_0_in_rule__Wants__Group__0__Impl6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__1__Impl_in_rule__Wants__Group__16777 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wants__Group__2_in_rule__Wants__Group__16780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Wants__Group__1__Impl6808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__2__Impl_in_rule__Wants__Group__26839 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__3_in_rule__Wants__Group__26842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__SourceAssignment_2_in_rule__Wants__Group__2__Impl6869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__3__Impl_in_rule__Wants__Group__36899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wants__Group__4_in_rule__Wants__Group__36902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Wants__Group__3__Impl6930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__4__Impl_in_rule__Wants__Group__46961 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__5_in_rule__Wants__Group__46964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__TargetAssignment_4_in_rule__Wants__Group__4__Impl6991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__5__Impl_in_rule__Wants__Group__57021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Wants__Group__5__Impl7049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__0__Impl_in_rule__Does__Group__07092 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Does__Group__1_in_rule__Does__Group__07095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__TypeAssignment_0_in_rule__Does__Group__0__Impl7122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__1__Impl_in_rule__Does__Group__17152 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Does__Group__2_in_rule__Does__Group__17155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Does__Group__1__Impl7183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__2__Impl_in_rule__Does__Group__27214 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Does__Group__3_in_rule__Does__Group__27217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__SourceAssignment_2_in_rule__Does__Group__2__Impl7244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__3__Impl_in_rule__Does__Group__37274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Does__Group__4_in_rule__Does__Group__37277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Does__Group__3__Impl7305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__4__Impl_in_rule__Does__Group__47336 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Does__Group__5_in_rule__Does__Group__47339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__TargetAssignment_4_in_rule__Does__Group__4__Impl7366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__5__Impl_in_rule__Does__Group__57396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Does__Group__5__Impl7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__0__Impl_in_rule__Decomposes__Group__07467 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__1_in_rule__Decomposes__Group__07470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__TypeAssignment_0_in_rule__Decomposes__Group__0__Impl7497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__1__Impl_in_rule__Decomposes__Group__17527 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__2_in_rule__Decomposes__Group__17530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Decomposes__Group__1__Impl7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__2__Impl_in_rule__Decomposes__Group__27589 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__3_in_rule__Decomposes__Group__27592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__SourceAssignment_2_in_rule__Decomposes__Group__2__Impl7619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__3__Impl_in_rule__Decomposes__Group__37649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__4_in_rule__Decomposes__Group__37652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Decomposes__Group__3__Impl7680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__4__Impl_in_rule__Decomposes__Group__47711 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__5_in_rule__Decomposes__Group__47714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__TargetAssignment_4_in_rule__Decomposes__Group__4__Impl7741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__5__Impl_in_rule__Decomposes__Group__57771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Decomposes__Group__5__Impl7799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__0__Impl_in_rule__Trusts__Group__07842 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__1_in_rule__Trusts__Group__07845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__TypeAssignment_0_in_rule__Trusts__Group__0__Impl7872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__1__Impl_in_rule__Trusts__Group__17902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trusts__Group__2_in_rule__Trusts__Group__17905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Trusts__Group__1__Impl7933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__2__Impl_in_rule__Trusts__Group__27964 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__3_in_rule__Trusts__Group__27967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__SourceAssignment_2_in_rule__Trusts__Group__2__Impl7994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__3__Impl_in_rule__Trusts__Group__38024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trusts__Group__4_in_rule__Trusts__Group__38027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Trusts__Group__3__Impl8055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__4__Impl_in_rule__Trusts__Group__48086 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__5_in_rule__Trusts__Group__48089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__TargetAssignment_4_in_rule__Trusts__Group__4__Impl8116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__5__Impl_in_rule__Trusts__Group__58146 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__6_in_rule__Trusts__Group__58149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group_5__0_in_rule__Trusts__Group__5__Impl8176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__6__Impl_in_rule__Trusts__Group__68207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Trusts__Group__6__Impl8235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group_5__0__Impl_in_rule__Trusts__Group_5__08280 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trusts__Group_5__1_in_rule__Trusts__Group_5__08283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Trusts__Group_5__0__Impl8311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group_5__1__Impl_in_rule__Trusts__Group_5__18342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__EntityAssignment_5_1_in_rule__Trusts__Group_5__1__Impl8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__0__Impl_in_rule__Delegates__Group__08403 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__1_in_rule__Delegates__Group__08406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__TypeAssignment_0_in_rule__Delegates__Group__0__Impl8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__1__Impl_in_rule__Delegates__Group__18463 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Delegates__Group__2_in_rule__Delegates__Group__18466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Delegates__Group__1__Impl8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__2__Impl_in_rule__Delegates__Group__28525 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__3_in_rule__Delegates__Group__28528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__SourceAssignment_2_in_rule__Delegates__Group__2__Impl8555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__3__Impl_in_rule__Delegates__Group__38585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Delegates__Group__4_in_rule__Delegates__Group__38588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Delegates__Group__3__Impl8616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__4__Impl_in_rule__Delegates__Group__48647 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__5_in_rule__Delegates__Group__48650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__TargetAssignment_4_in_rule__Delegates__Group__4__Impl8677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__5__Impl_in_rule__Delegates__Group__58707 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__6_in_rule__Delegates__Group__58710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group_5__0_in_rule__Delegates__Group__5__Impl8737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__6__Impl_in_rule__Delegates__Group__68768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Delegates__Group__6__Impl8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group_5__0__Impl_in_rule__Delegates__Group_5__08841 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Delegates__Group_5__1_in_rule__Delegates__Group_5__08844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Delegates__Group_5__0__Impl8872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group_5__1__Impl_in_rule__Delegates__Group_5__18903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__EntityAssignment_5_1_in_rule__Delegates__Group_5__1__Impl8930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__0__Impl_in_rule__Contributes__Group__08964 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__1_in_rule__Contributes__Group__08967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__TypeAssignment_0_in_rule__Contributes__Group__0__Impl8994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__1__Impl_in_rule__Contributes__Group__19024 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Contributes__Group__2_in_rule__Contributes__Group__19027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Contributes__Group__1__Impl9055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__2__Impl_in_rule__Contributes__Group__29086 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__3_in_rule__Contributes__Group__29089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__SourceAssignment_2_in_rule__Contributes__Group__2__Impl9116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__3__Impl_in_rule__Contributes__Group__39146 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Contributes__Group__4_in_rule__Contributes__Group__39149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Contributes__Group__3__Impl9177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__4__Impl_in_rule__Contributes__Group__49208 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__5_in_rule__Contributes__Group__49211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__TargetAssignment_4_in_rule__Contributes__Group__4__Impl9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__5__Impl_in_rule__Contributes__Group__59268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Contributes__Group__5__Impl9296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__0__Impl_in_rule__Fulfils__Group__09339 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__1_in_rule__Fulfils__Group__09342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__TypeAssignment_0_in_rule__Fulfils__Group__0__Impl9369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__1__Impl_in_rule__Fulfils__Group__19399 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__2_in_rule__Fulfils__Group__19402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Fulfils__Group__1__Impl9430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__2__Impl_in_rule__Fulfils__Group__29461 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__3_in_rule__Fulfils__Group__29464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__SourceAssignment_2_in_rule__Fulfils__Group__2__Impl9491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__3__Impl_in_rule__Fulfils__Group__39521 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__4_in_rule__Fulfils__Group__39524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Fulfils__Group__3__Impl9552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__4__Impl_in_rule__Fulfils__Group__49583 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__5_in_rule__Fulfils__Group__49586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__TargetAssignment_4_in_rule__Fulfils__Group__4__Impl9613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__5__Impl_in_rule__Fulfils__Group__59643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Fulfils__Group__5__Impl9671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__0__Impl_in_rule__Provides__Group__09714 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__1_in_rule__Provides__Group__09717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__TypeAssignment_0_in_rule__Provides__Group__0__Impl9744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__1__Impl_in_rule__Provides__Group__19774 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Provides__Group__2_in_rule__Provides__Group__19777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Provides__Group__1__Impl9805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__2__Impl_in_rule__Provides__Group__29836 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__3_in_rule__Provides__Group__29839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__SourceAssignment_2_in_rule__Provides__Group__2__Impl9866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__3__Impl_in_rule__Provides__Group__39896 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Provides__Group__4_in_rule__Provides__Group__39899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Provides__Group__3__Impl9927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__4__Impl_in_rule__Provides__Group__49958 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__5_in_rule__Provides__Group__49961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__TargetAssignment_4_in_rule__Provides__Group__4__Impl9988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__5__Impl_in_rule__Provides__Group__510018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Provides__Group__5__Impl10046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__0__Impl_in_rule__Consumes__Group__010089 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__1_in_rule__Consumes__Group__010092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__TypeAssignment_0_in_rule__Consumes__Group__0__Impl10119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__1__Impl_in_rule__Consumes__Group__110149 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Consumes__Group__2_in_rule__Consumes__Group__110152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Consumes__Group__1__Impl10180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__2__Impl_in_rule__Consumes__Group__210211 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__3_in_rule__Consumes__Group__210214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__SourceAssignment_2_in_rule__Consumes__Group__2__Impl10241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__3__Impl_in_rule__Consumes__Group__310271 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Consumes__Group__4_in_rule__Consumes__Group__310274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Consumes__Group__3__Impl10302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__4__Impl_in_rule__Consumes__Group__410333 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__5_in_rule__Consumes__Group__410336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__TargetAssignment_4_in_rule__Consumes__Group__4__Impl10363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__5__Impl_in_rule__Consumes__Group__510393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Consumes__Group__5__Impl10421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__0__Impl_in_rule__Exploits__Group__010464 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__1_in_rule__Exploits__Group__010467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__TypeAssignment_0_in_rule__Exploits__Group__0__Impl10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__1__Impl_in_rule__Exploits__Group__110524 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exploits__Group__2_in_rule__Exploits__Group__110527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Exploits__Group__1__Impl10555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__2__Impl_in_rule__Exploits__Group__210586 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__3_in_rule__Exploits__Group__210589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__SourceAssignment_2_in_rule__Exploits__Group__2__Impl10616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__3__Impl_in_rule__Exploits__Group__310646 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exploits__Group__4_in_rule__Exploits__Group__310649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Exploits__Group__3__Impl10677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__4__Impl_in_rule__Exploits__Group__410708 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__5_in_rule__Exploits__Group__410711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__TargetAssignment_4_in_rule__Exploits__Group__4__Impl10738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__5__Impl_in_rule__Exploits__Group__510768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Exploits__Group__5__Impl10796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__0__Impl_in_rule__Damages__Group__010839 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__1_in_rule__Damages__Group__010842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__TypeAssignment_0_in_rule__Damages__Group__0__Impl10869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__1__Impl_in_rule__Damages__Group__110899 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Damages__Group__2_in_rule__Damages__Group__110902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Damages__Group__1__Impl10930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__2__Impl_in_rule__Damages__Group__210961 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__3_in_rule__Damages__Group__210964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__SourceAssignment_2_in_rule__Damages__Group__2__Impl10991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__3__Impl_in_rule__Damages__Group__311021 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Damages__Group__4_in_rule__Damages__Group__311024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Damages__Group__3__Impl11052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__4__Impl_in_rule__Damages__Group__411083 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__5_in_rule__Damages__Group__411086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__TargetAssignment_4_in_rule__Damages__Group__4__Impl11113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__5__Impl_in_rule__Damages__Group__511143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Damages__Group__5__Impl11171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__0__Impl_in_rule__Attacks__Group__011214 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Attacks__Group__1_in_rule__Attacks__Group__011217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__TypeAssignment_0_in_rule__Attacks__Group__0__Impl11244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__1__Impl_in_rule__Attacks__Group__111274 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacks__Group__2_in_rule__Attacks__Group__111277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Attacks__Group__1__Impl11305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__2__Impl_in_rule__Attacks__Group__211336 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Attacks__Group__3_in_rule__Attacks__Group__211339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__SourceAssignment_2_in_rule__Attacks__Group__2__Impl11366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__3__Impl_in_rule__Attacks__Group__311396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacks__Group__4_in_rule__Attacks__Group__311399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Attacks__Group__3__Impl11427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__4__Impl_in_rule__Attacks__Group__411458 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Attacks__Group__5_in_rule__Attacks__Group__411461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__TargetAssignment_4_in_rule__Attacks__Group__4__Impl11488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__5__Impl_in_rule__Attacks__Group__511518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Attacks__Group__5__Impl11546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__0__Impl_in_rule__Argues__Group__011589 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__1_in_rule__Argues__Group__011592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__TypeAssignment_0_in_rule__Argues__Group__0__Impl11619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__1__Impl_in_rule__Argues__Group__111649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argues__Group__2_in_rule__Argues__Group__111652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Argues__Group__1__Impl11680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__2__Impl_in_rule__Argues__Group__211711 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__3_in_rule__Argues__Group__211714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__SourceAssignment_2_in_rule__Argues__Group__2__Impl11741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__3__Impl_in_rule__Argues__Group__311771 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argues__Group__4_in_rule__Argues__Group__311774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Argues__Group__3__Impl11802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__4__Impl_in_rule__Argues__Group__411833 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__5_in_rule__Argues__Group__411836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__TargetAssignment_4_in_rule__Argues__Group__4__Impl11863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__5__Impl_in_rule__Argues__Group__511893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Argues__Group__5__Impl11921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_111969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_112000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhysicalWorld_in_rule__World__PhysicalAssignment_112031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeliefWorld_in_rule__World__BeliefAssignment_212062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_112093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__PhysicalWorld__EntitiesAssignment_112124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__BeliefWorld__DomainsAssignment_1_012155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__BeliefWorld__RelationshipsAssignment_1_112186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_012217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainType_in_rule__Domain__TypeAssignment_112248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_212279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_3_112310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DomainAssumption__NameAssignment_112341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionalRequirement__NameAssignment_112372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SecurityRequirement__NameAssignment_112403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AntiRequirement__NameAssignment_112434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualityRequirement__NameAssignment_112465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_112496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Stakeholder__NameAssignment_112527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_112558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NaturalProcess__NameAssignment_112589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NaturalProcess__ActivitiesAssignment_2_112624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HumanActivity__NameAssignment_212659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__HumanActivity__ActionsAssignment_312690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_112721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_0_112752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_112783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Wants__TypeAssignment_012819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Wants__SourceAssignment_212862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Wants__TargetAssignment_412901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Does__TypeAssignment_012941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Does__SourceAssignment_212984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Does__TargetAssignment_413023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposesType_in_rule__Decomposes__TypeAssignment_013058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decomposes__SourceAssignment_213093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decomposes__TargetAssignment_413132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Trusts__TypeAssignment_013172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Trusts__SourceAssignment_213215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Trusts__TargetAssignment_413254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Trusts__EntityAssignment_5_113293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Delegates__TypeAssignment_013333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delegates__SourceAssignment_213376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delegates__TargetAssignment_413415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delegates__EntityAssignment_5_113454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributesType_in_rule__Contributes__TypeAssignment_013489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Contributes__SourceAssignment_213524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Contributes__TargetAssignment_413563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfilsType_in_rule__Fulfils__TypeAssignment_013598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fulfils__SourceAssignment_213633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fulfils__TargetAssignment_413672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Provides__TypeAssignment_013712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provides__SourceAssignment_213755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provides__TargetAssignment_413794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Consumes__TypeAssignment_013834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Consumes__SourceAssignment_213877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Consumes__TargetAssignment_413916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Exploits__TypeAssignment_013956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exploits__SourceAssignment_213999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exploits__TargetAssignment_414038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Damages__TypeAssignment_014078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Damages__SourceAssignment_214121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Damages__TargetAssignment_414160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Attacks__TypeAssignment_014200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacks__SourceAssignment_214243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacks__TargetAssignment_414282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Argues__TypeAssignment_014322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argues__SourceAssignment_214365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argues__TargetAssignment_414404 = new BitSet(new long[]{0x0000000000000002L});

}