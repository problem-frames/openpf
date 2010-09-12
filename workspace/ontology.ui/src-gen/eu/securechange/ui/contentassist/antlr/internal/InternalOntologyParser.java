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
import eu.securechange.services.OntologyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalOntologyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'fulfils'", "'S'", "'R'", "'W'", "'DA'", "'FR'", "'SR'", "'AR'", "'Q'", "'A'", "'and'", "'or'", "'-'", "'+'", "'--'", "'++'", "'model'", "':'", "'event'", "','", "'actor'", "'attacker'", "'process'", "'{'", "'}'", "'activity'", "'action'", "'resource'", "'asset'", "'('", "')'", "'wants'", "'does'", "'trusts'", "'delegates'", "'provides'", "'consumes'", "'exploits'", "'damages'", "'attacks'", "'argues'"
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
    public String getGrammarFileName() { return "../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g"; }


     
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:61:1: entryRuleSituation : ruleSituation EOF ;
    public final void entryRuleSituation() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:62:1: ( ruleSituation EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:63:1: ruleSituation EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:70:1: ruleSituation : ( ( rule__Situation__Group__0 ) ) ;
    public final void ruleSituation() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:74:2: ( ( ( rule__Situation__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:75:1: ( ( rule__Situation__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:75:1: ( ( rule__Situation__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:76:1: ( rule__Situation__Group__0 )
            {
             before(grammarAccess.getSituationAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:77:1: ( rule__Situation__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:77:2: rule__Situation__Group__0
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:89:1: entryRuleWorld : ruleWorld EOF ;
    public final void entryRuleWorld() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:90:1: ( ruleWorld EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:91:1: ruleWorld EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:98:1: ruleWorld : ( ( rule__World__Group__0 ) ) ;
    public final void ruleWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:102:2: ( ( ( rule__World__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:103:1: ( ( rule__World__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:103:1: ( ( rule__World__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:104:1: ( rule__World__Group__0 )
            {
             before(grammarAccess.getWorldAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:105:1: ( rule__World__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:105:2: rule__World__Group__0
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:119:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:120:1: ( ruleEvent EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:121:1: ruleEvent EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:128:1: ruleEvent : ( ( rule__Event__Group__0 ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:132:2: ( ( ( rule__Event__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:133:1: ( ( rule__Event__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:133:1: ( ( rule__Event__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:134:1: ( rule__Event__Group__0 )
            {
             before(grammarAccess.getEventAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:135:1: ( rule__Event__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:135:2: rule__Event__Group__0
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:147:1: entryRuleObject : ruleObject EOF ;
    public final void entryRuleObject() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:148:1: ( ruleObject EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:149:1: ruleObject EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:156:1: ruleObject : ( ( rule__Object__Alternatives ) ) ;
    public final void ruleObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:160:2: ( ( ( rule__Object__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:161:1: ( ( rule__Object__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:161:1: ( ( rule__Object__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:162:1: ( rule__Object__Alternatives )
            {
             before(grammarAccess.getObjectAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:163:1: ( rule__Object__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:163:2: rule__Object__Alternatives
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:175:1: entryRulePhysicalWorld : rulePhysicalWorld EOF ;
    public final void entryRulePhysicalWorld() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:176:1: ( rulePhysicalWorld EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:177:1: rulePhysicalWorld EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:184:1: rulePhysicalWorld : ( ( rule__PhysicalWorld__Group__0 ) ) ;
    public final void rulePhysicalWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:188:2: ( ( ( rule__PhysicalWorld__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:189:1: ( ( rule__PhysicalWorld__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:189:1: ( ( rule__PhysicalWorld__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:190:1: ( rule__PhysicalWorld__Group__0 )
            {
             before(grammarAccess.getPhysicalWorldAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:191:1: ( rule__PhysicalWorld__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:191:2: rule__PhysicalWorld__Group__0
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:203:1: entryRuleBeliefWorld : ruleBeliefWorld EOF ;
    public final void entryRuleBeliefWorld() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:204:1: ( ruleBeliefWorld EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:205:1: ruleBeliefWorld EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:212:1: ruleBeliefWorld : ( ( rule__BeliefWorld__Group__0 ) ) ;
    public final void ruleBeliefWorld() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:216:2: ( ( ( rule__BeliefWorld__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:217:1: ( ( rule__BeliefWorld__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:217:1: ( ( rule__BeliefWorld__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:218:1: ( rule__BeliefWorld__Group__0 )
            {
             before(grammarAccess.getBeliefWorldAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:219:1: ( rule__BeliefWorld__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:219:2: rule__BeliefWorld__Group__0
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:231:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:232:1: ( ruleDomain EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:233:1: ruleDomain EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:240:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:244:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:245:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:245:1: ( ( rule__Domain__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:246:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:247:1: ( rule__Domain__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:247:2: rule__Domain__Group__0
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:259:1: entryRuleProposition : ruleProposition EOF ;
    public final void entryRuleProposition() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:260:1: ( ruleProposition EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:261:1: ruleProposition EOF
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:268:1: ruleProposition : ( ( rule__Proposition__Group__0 ) ) ;
    public final void ruleProposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:272:2: ( ( ( rule__Proposition__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:273:1: ( ( rule__Proposition__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:273:1: ( ( rule__Proposition__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:274:1: ( rule__Proposition__Group__0 )
            {
             before(grammarAccess.getPropositionAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:275:1: ( rule__Proposition__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:275:2: rule__Proposition__Group__0
            {
            pushFollow(FOLLOW_rule__Proposition__Group__0_in_ruleProposition516);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:287:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:288:1: ( ruleEntity EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:289:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity543);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity550); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:296:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:300:2: ( ( ( rule__Entity__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:301:1: ( ( rule__Entity__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:301:1: ( ( rule__Entity__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:302:1: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:303:1: ( rule__Entity__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:303:2: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_rule__Entity__Alternatives_in_ruleEntity576);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:315:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:316:1: ( ruleActor EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:317:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor603);
            ruleActor();
            _fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor610); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:324:1: ruleActor : ( ( rule__Actor__Alternatives ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:328:2: ( ( ( rule__Actor__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:329:1: ( ( rule__Actor__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:329:1: ( ( rule__Actor__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:330:1: ( rule__Actor__Alternatives )
            {
             before(grammarAccess.getActorAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:331:1: ( rule__Actor__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:331:2: rule__Actor__Alternatives
            {
            pushFollow(FOLLOW_rule__Actor__Alternatives_in_ruleActor636);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:343:1: entryRuleStakeholder : ruleStakeholder EOF ;
    public final void entryRuleStakeholder() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:344:1: ( ruleStakeholder EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:345:1: ruleStakeholder EOF
            {
             before(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder663);
            ruleStakeholder();
            _fsp--;

             after(grammarAccess.getStakeholderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder670); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:352:1: ruleStakeholder : ( ( rule__Stakeholder__Group__0 ) ) ;
    public final void ruleStakeholder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:356:2: ( ( ( rule__Stakeholder__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:357:1: ( ( rule__Stakeholder__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:357:1: ( ( rule__Stakeholder__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:358:1: ( rule__Stakeholder__Group__0 )
            {
             before(grammarAccess.getStakeholderAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:359:1: ( rule__Stakeholder__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:359:2: rule__Stakeholder__Group__0
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__0_in_ruleStakeholder696);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:371:1: entryRuleAttacker : ruleAttacker EOF ;
    public final void entryRuleAttacker() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:372:1: ( ruleAttacker EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:373:1: ruleAttacker EOF
            {
             before(grammarAccess.getAttackerRule()); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker723);
            ruleAttacker();
            _fsp--;

             after(grammarAccess.getAttackerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker730); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:380:1: ruleAttacker : ( ( rule__Attacker__Group__0 ) ) ;
    public final void ruleAttacker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:384:2: ( ( ( rule__Attacker__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:385:1: ( ( rule__Attacker__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:385:1: ( ( rule__Attacker__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:386:1: ( rule__Attacker__Group__0 )
            {
             before(grammarAccess.getAttackerAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:387:1: ( rule__Attacker__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:387:2: rule__Attacker__Group__0
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0_in_ruleAttacker756);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:399:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:400:1: ( ruleProcess EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:401:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess783);
            ruleProcess();
            _fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess790); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:408:1: ruleProcess : ( ( rule__Process__Alternatives ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:412:2: ( ( ( rule__Process__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:413:1: ( ( rule__Process__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:413:1: ( ( rule__Process__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:414:1: ( rule__Process__Alternatives )
            {
             before(grammarAccess.getProcessAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:415:1: ( rule__Process__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:415:2: rule__Process__Alternatives
            {
            pushFollow(FOLLOW_rule__Process__Alternatives_in_ruleProcess816);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:427:1: entryRuleNaturalProcess : ruleNaturalProcess EOF ;
    public final void entryRuleNaturalProcess() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:428:1: ( ruleNaturalProcess EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:429:1: ruleNaturalProcess EOF
            {
             before(grammarAccess.getNaturalProcessRule()); 
            pushFollow(FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess843);
            ruleNaturalProcess();
            _fsp--;

             after(grammarAccess.getNaturalProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalProcess850); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:436:1: ruleNaturalProcess : ( ( rule__NaturalProcess__Group__0 ) ) ;
    public final void ruleNaturalProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:440:2: ( ( ( rule__NaturalProcess__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:441:1: ( ( rule__NaturalProcess__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:441:1: ( ( rule__NaturalProcess__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:442:1: ( rule__NaturalProcess__Group__0 )
            {
             before(grammarAccess.getNaturalProcessAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:443:1: ( rule__NaturalProcess__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:443:2: rule__NaturalProcess__Group__0
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__0_in_ruleNaturalProcess876);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:455:1: entryRuleHumanActivity : ruleHumanActivity EOF ;
    public final void entryRuleHumanActivity() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:456:1: ( ruleHumanActivity EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:457:1: ruleHumanActivity EOF
            {
             before(grammarAccess.getHumanActivityRule()); 
            pushFollow(FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity903);
            ruleHumanActivity();
            _fsp--;

             after(grammarAccess.getHumanActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHumanActivity910); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:464:1: ruleHumanActivity : ( ( rule__HumanActivity__Group__0 ) ) ;
    public final void ruleHumanActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:468:2: ( ( ( rule__HumanActivity__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:469:1: ( ( rule__HumanActivity__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:469:1: ( ( rule__HumanActivity__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:470:1: ( rule__HumanActivity__Group__0 )
            {
             before(grammarAccess.getHumanActivityAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:471:1: ( rule__HumanActivity__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:471:2: rule__HumanActivity__Group__0
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__0_in_ruleHumanActivity936);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:483:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:484:1: ( ruleAction EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:485:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction963);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction970); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:492:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:496:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:497:1: ( ( rule__Action__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:497:1: ( ( rule__Action__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:498:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:499:1: ( rule__Action__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:499:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction996);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:511:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:512:1: ( ruleResource EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:513:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1023);
            ruleResource();
            _fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1030); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:520:1: ruleResource : ( ( rule__Resource__Alternatives ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:524:2: ( ( ( rule__Resource__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:525:1: ( ( rule__Resource__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:525:1: ( ( rule__Resource__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:526:1: ( rule__Resource__Alternatives )
            {
             before(grammarAccess.getResourceAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:527:1: ( rule__Resource__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:527:2: rule__Resource__Alternatives
            {
            pushFollow(FOLLOW_rule__Resource__Alternatives_in_ruleResource1056);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:539:1: entryRuleAsset : ruleAsset EOF ;
    public final void entryRuleAsset() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:540:1: ( ruleAsset EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:541:1: ruleAsset EOF
            {
             before(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset1083);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getAssetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset1090); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:548:1: ruleAsset : ( ( rule__Asset__Group__0 ) ) ;
    public final void ruleAsset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:552:2: ( ( ( rule__Asset__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:553:1: ( ( rule__Asset__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:553:1: ( ( rule__Asset__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:554:1: ( rule__Asset__Group__0 )
            {
             before(grammarAccess.getAssetAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:555:1: ( rule__Asset__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:555:2: rule__Asset__Group__0
            {
            pushFollow(FOLLOW_rule__Asset__Group__0_in_ruleAsset1116);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:567:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:568:1: ( ruleRelationship EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:569:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship1143);
            ruleRelationship();
            _fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship1150); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:576:1: ruleRelationship : ( ( rule__Relationship__Alternatives ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:580:2: ( ( ( rule__Relationship__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:581:1: ( ( rule__Relationship__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:581:1: ( ( rule__Relationship__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:582:1: ( rule__Relationship__Alternatives )
            {
             before(grammarAccess.getRelationshipAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:583:1: ( rule__Relationship__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:583:2: rule__Relationship__Alternatives
            {
            pushFollow(FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship1176);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:595:1: entryRuleWants : ruleWants EOF ;
    public final void entryRuleWants() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:596:1: ( ruleWants EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:597:1: ruleWants EOF
            {
             before(grammarAccess.getWantsRule()); 
            pushFollow(FOLLOW_ruleWants_in_entryRuleWants1203);
            ruleWants();
            _fsp--;

             after(grammarAccess.getWantsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWants1210); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:604:1: ruleWants : ( ( rule__Wants__Group__0 ) ) ;
    public final void ruleWants() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:608:2: ( ( ( rule__Wants__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:609:1: ( ( rule__Wants__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:609:1: ( ( rule__Wants__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:610:1: ( rule__Wants__Group__0 )
            {
             before(grammarAccess.getWantsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:611:1: ( rule__Wants__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:611:2: rule__Wants__Group__0
            {
            pushFollow(FOLLOW_rule__Wants__Group__0_in_ruleWants1236);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:623:1: entryRuleDoes : ruleDoes EOF ;
    public final void entryRuleDoes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:624:1: ( ruleDoes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:625:1: ruleDoes EOF
            {
             before(grammarAccess.getDoesRule()); 
            pushFollow(FOLLOW_ruleDoes_in_entryRuleDoes1263);
            ruleDoes();
            _fsp--;

             after(grammarAccess.getDoesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoes1270); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:632:1: ruleDoes : ( ( rule__Does__Group__0 ) ) ;
    public final void ruleDoes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:636:2: ( ( ( rule__Does__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:637:1: ( ( rule__Does__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:637:1: ( ( rule__Does__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:638:1: ( rule__Does__Group__0 )
            {
             before(grammarAccess.getDoesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:639:1: ( rule__Does__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:639:2: rule__Does__Group__0
            {
            pushFollow(FOLLOW_rule__Does__Group__0_in_ruleDoes1296);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:651:1: entryRuleDecomposes : ruleDecomposes EOF ;
    public final void entryRuleDecomposes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:652:1: ( ruleDecomposes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:653:1: ruleDecomposes EOF
            {
             before(grammarAccess.getDecomposesRule()); 
            pushFollow(FOLLOW_ruleDecomposes_in_entryRuleDecomposes1323);
            ruleDecomposes();
            _fsp--;

             after(grammarAccess.getDecomposesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposes1330); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:660:1: ruleDecomposes : ( ( rule__Decomposes__Group__0 ) ) ;
    public final void ruleDecomposes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:664:2: ( ( ( rule__Decomposes__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:665:1: ( ( rule__Decomposes__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:665:1: ( ( rule__Decomposes__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:666:1: ( rule__Decomposes__Group__0 )
            {
             before(grammarAccess.getDecomposesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:667:1: ( rule__Decomposes__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:667:2: rule__Decomposes__Group__0
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__0_in_ruleDecomposes1356);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:679:1: entryRuleTrusts : ruleTrusts EOF ;
    public final void entryRuleTrusts() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:680:1: ( ruleTrusts EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:681:1: ruleTrusts EOF
            {
             before(grammarAccess.getTrustsRule()); 
            pushFollow(FOLLOW_ruleTrusts_in_entryRuleTrusts1383);
            ruleTrusts();
            _fsp--;

             after(grammarAccess.getTrustsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrusts1390); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:688:1: ruleTrusts : ( ( rule__Trusts__Group__0 ) ) ;
    public final void ruleTrusts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:692:2: ( ( ( rule__Trusts__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:693:1: ( ( rule__Trusts__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:693:1: ( ( rule__Trusts__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:694:1: ( rule__Trusts__Group__0 )
            {
             before(grammarAccess.getTrustsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:695:1: ( rule__Trusts__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:695:2: rule__Trusts__Group__0
            {
            pushFollow(FOLLOW_rule__Trusts__Group__0_in_ruleTrusts1416);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:707:1: entryRuleDelegates : ruleDelegates EOF ;
    public final void entryRuleDelegates() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:708:1: ( ruleDelegates EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:709:1: ruleDelegates EOF
            {
             before(grammarAccess.getDelegatesRule()); 
            pushFollow(FOLLOW_ruleDelegates_in_entryRuleDelegates1443);
            ruleDelegates();
            _fsp--;

             after(grammarAccess.getDelegatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelegates1450); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:716:1: ruleDelegates : ( ( rule__Delegates__Group__0 ) ) ;
    public final void ruleDelegates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:720:2: ( ( ( rule__Delegates__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:721:1: ( ( rule__Delegates__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:721:1: ( ( rule__Delegates__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:722:1: ( rule__Delegates__Group__0 )
            {
             before(grammarAccess.getDelegatesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:723:1: ( rule__Delegates__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:723:2: rule__Delegates__Group__0
            {
            pushFollow(FOLLOW_rule__Delegates__Group__0_in_ruleDelegates1476);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:735:1: entryRuleContributes : ruleContributes EOF ;
    public final void entryRuleContributes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:736:1: ( ruleContributes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:737:1: ruleContributes EOF
            {
             before(grammarAccess.getContributesRule()); 
            pushFollow(FOLLOW_ruleContributes_in_entryRuleContributes1503);
            ruleContributes();
            _fsp--;

             after(grammarAccess.getContributesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributes1510); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:744:1: ruleContributes : ( ( rule__Contributes__Group__0 ) ) ;
    public final void ruleContributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:748:2: ( ( ( rule__Contributes__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:749:1: ( ( rule__Contributes__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:749:1: ( ( rule__Contributes__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:750:1: ( rule__Contributes__Group__0 )
            {
             before(grammarAccess.getContributesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:751:1: ( rule__Contributes__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:751:2: rule__Contributes__Group__0
            {
            pushFollow(FOLLOW_rule__Contributes__Group__0_in_ruleContributes1536);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:763:1: entryRuleFulfils : ruleFulfils EOF ;
    public final void entryRuleFulfils() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:764:1: ( ruleFulfils EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:765:1: ruleFulfils EOF
            {
             before(grammarAccess.getFulfilsRule()); 
            pushFollow(FOLLOW_ruleFulfils_in_entryRuleFulfils1563);
            ruleFulfils();
            _fsp--;

             after(grammarAccess.getFulfilsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFulfils1570); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:772:1: ruleFulfils : ( ( rule__Fulfils__Group__0 ) ) ;
    public final void ruleFulfils() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:776:2: ( ( ( rule__Fulfils__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:777:1: ( ( rule__Fulfils__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:777:1: ( ( rule__Fulfils__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:778:1: ( rule__Fulfils__Group__0 )
            {
             before(grammarAccess.getFulfilsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:779:1: ( rule__Fulfils__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:779:2: rule__Fulfils__Group__0
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__0_in_ruleFulfils1596);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:791:1: entryRuleProvides : ruleProvides EOF ;
    public final void entryRuleProvides() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:792:1: ( ruleProvides EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:793:1: ruleProvides EOF
            {
             before(grammarAccess.getProvidesRule()); 
            pushFollow(FOLLOW_ruleProvides_in_entryRuleProvides1623);
            ruleProvides();
            _fsp--;

             after(grammarAccess.getProvidesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvides1630); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:800:1: ruleProvides : ( ( rule__Provides__Group__0 ) ) ;
    public final void ruleProvides() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:804:2: ( ( ( rule__Provides__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:805:1: ( ( rule__Provides__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:805:1: ( ( rule__Provides__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:806:1: ( rule__Provides__Group__0 )
            {
             before(grammarAccess.getProvidesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:807:1: ( rule__Provides__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:807:2: rule__Provides__Group__0
            {
            pushFollow(FOLLOW_rule__Provides__Group__0_in_ruleProvides1656);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:819:1: entryRuleConsumes : ruleConsumes EOF ;
    public final void entryRuleConsumes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:820:1: ( ruleConsumes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:821:1: ruleConsumes EOF
            {
             before(grammarAccess.getConsumesRule()); 
            pushFollow(FOLLOW_ruleConsumes_in_entryRuleConsumes1683);
            ruleConsumes();
            _fsp--;

             after(grammarAccess.getConsumesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsumes1690); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:828:1: ruleConsumes : ( ( rule__Consumes__Group__0 ) ) ;
    public final void ruleConsumes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:832:2: ( ( ( rule__Consumes__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:833:1: ( ( rule__Consumes__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:833:1: ( ( rule__Consumes__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:834:1: ( rule__Consumes__Group__0 )
            {
             before(grammarAccess.getConsumesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:835:1: ( rule__Consumes__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:835:2: rule__Consumes__Group__0
            {
            pushFollow(FOLLOW_rule__Consumes__Group__0_in_ruleConsumes1716);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:847:1: entryRuleExploits : ruleExploits EOF ;
    public final void entryRuleExploits() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:848:1: ( ruleExploits EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:849:1: ruleExploits EOF
            {
             before(grammarAccess.getExploitsRule()); 
            pushFollow(FOLLOW_ruleExploits_in_entryRuleExploits1743);
            ruleExploits();
            _fsp--;

             after(grammarAccess.getExploitsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploits1750); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:856:1: ruleExploits : ( ( rule__Exploits__Group__0 ) ) ;
    public final void ruleExploits() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:860:2: ( ( ( rule__Exploits__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:861:1: ( ( rule__Exploits__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:861:1: ( ( rule__Exploits__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:862:1: ( rule__Exploits__Group__0 )
            {
             before(grammarAccess.getExploitsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:863:1: ( rule__Exploits__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:863:2: rule__Exploits__Group__0
            {
            pushFollow(FOLLOW_rule__Exploits__Group__0_in_ruleExploits1776);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:875:1: entryRuleDamages : ruleDamages EOF ;
    public final void entryRuleDamages() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:876:1: ( ruleDamages EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:877:1: ruleDamages EOF
            {
             before(grammarAccess.getDamagesRule()); 
            pushFollow(FOLLOW_ruleDamages_in_entryRuleDamages1803);
            ruleDamages();
            _fsp--;

             after(grammarAccess.getDamagesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDamages1810); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:884:1: ruleDamages : ( ( rule__Damages__Group__0 ) ) ;
    public final void ruleDamages() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:888:2: ( ( ( rule__Damages__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:889:1: ( ( rule__Damages__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:889:1: ( ( rule__Damages__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:890:1: ( rule__Damages__Group__0 )
            {
             before(grammarAccess.getDamagesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:891:1: ( rule__Damages__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:891:2: rule__Damages__Group__0
            {
            pushFollow(FOLLOW_rule__Damages__Group__0_in_ruleDamages1836);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:903:1: entryRuleAttacks : ruleAttacks EOF ;
    public final void entryRuleAttacks() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:904:1: ( ruleAttacks EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:905:1: ruleAttacks EOF
            {
             before(grammarAccess.getAttacksRule()); 
            pushFollow(FOLLOW_ruleAttacks_in_entryRuleAttacks1863);
            ruleAttacks();
            _fsp--;

             after(grammarAccess.getAttacksRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacks1870); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:912:1: ruleAttacks : ( ( rule__Attacks__Group__0 ) ) ;
    public final void ruleAttacks() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:916:2: ( ( ( rule__Attacks__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:917:1: ( ( rule__Attacks__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:917:1: ( ( rule__Attacks__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:918:1: ( rule__Attacks__Group__0 )
            {
             before(grammarAccess.getAttacksAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:919:1: ( rule__Attacks__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:919:2: rule__Attacks__Group__0
            {
            pushFollow(FOLLOW_rule__Attacks__Group__0_in_ruleAttacks1896);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:931:1: entryRuleArgues : ruleArgues EOF ;
    public final void entryRuleArgues() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:932:1: ( ruleArgues EOF )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:933:1: ruleArgues EOF
            {
             before(grammarAccess.getArguesRule()); 
            pushFollow(FOLLOW_ruleArgues_in_entryRuleArgues1923);
            ruleArgues();
            _fsp--;

             after(grammarAccess.getArguesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgues1930); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:940:1: ruleArgues : ( ( rule__Argues__Group__0 ) ) ;
    public final void ruleArgues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:944:2: ( ( ( rule__Argues__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:945:1: ( ( rule__Argues__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:945:1: ( ( rule__Argues__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:946:1: ( rule__Argues__Group__0 )
            {
             before(grammarAccess.getArguesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:947:1: ( rule__Argues__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:947:2: rule__Argues__Group__0
            {
            pushFollow(FOLLOW_rule__Argues__Group__0_in_ruleArgues1956);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:960:1: ruleDomainType : ( ( rule__DomainType__Alternatives ) ) ;
    public final void ruleDomainType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:964:1: ( ( ( rule__DomainType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:965:1: ( ( rule__DomainType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:965:1: ( ( rule__DomainType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:966:1: ( rule__DomainType__Alternatives )
            {
             before(grammarAccess.getDomainTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:967:1: ( rule__DomainType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:967:2: rule__DomainType__Alternatives
            {
            pushFollow(FOLLOW_rule__DomainType__Alternatives_in_ruleDomainType1993);
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


    // $ANTLR start rulePropositionType
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:979:1: rulePropositionType : ( ( rule__PropositionType__Alternatives ) ) ;
    public final void rulePropositionType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:983:1: ( ( ( rule__PropositionType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:984:1: ( ( rule__PropositionType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:984:1: ( ( rule__PropositionType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:985:1: ( rule__PropositionType__Alternatives )
            {
             before(grammarAccess.getPropositionTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:986:1: ( rule__PropositionType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:986:2: rule__PropositionType__Alternatives
            {
            pushFollow(FOLLOW_rule__PropositionType__Alternatives_in_rulePropositionType2029);
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


    // $ANTLR start ruleDecomposesType
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:998:1: ruleDecomposesType : ( ( rule__DecomposesType__Alternatives ) ) ;
    public final void ruleDecomposesType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1002:1: ( ( ( rule__DecomposesType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1003:1: ( ( rule__DecomposesType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1003:1: ( ( rule__DecomposesType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1004:1: ( rule__DecomposesType__Alternatives )
            {
             before(grammarAccess.getDecomposesTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1005:1: ( rule__DecomposesType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1005:2: rule__DecomposesType__Alternatives
            {
            pushFollow(FOLLOW_rule__DecomposesType__Alternatives_in_ruleDecomposesType2065);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1017:1: ruleContributesType : ( ( rule__ContributesType__Alternatives ) ) ;
    public final void ruleContributesType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1021:1: ( ( ( rule__ContributesType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1022:1: ( ( rule__ContributesType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1022:1: ( ( rule__ContributesType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1023:1: ( rule__ContributesType__Alternatives )
            {
             before(grammarAccess.getContributesTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1024:1: ( rule__ContributesType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1024:2: rule__ContributesType__Alternatives
            {
            pushFollow(FOLLOW_rule__ContributesType__Alternatives_in_ruleContributesType2101);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1036:1: ruleFulfilsType : ( ( 'fulfils' ) ) ;
    public final void ruleFulfilsType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1040:1: ( ( ( 'fulfils' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1041:1: ( ( 'fulfils' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1041:1: ( ( 'fulfils' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1042:1: ( 'fulfils' )
            {
             before(grammarAccess.getFulfilsTypeAccess().getFulfilsEnumLiteralDeclaration()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1043:1: ( 'fulfils' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1043:3: 'fulfils'
            {
            match(input,11,FOLLOW_11_in_ruleFulfilsType2138); 

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1056:1: rule__Object__Alternatives : ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleProposition ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1060:1: ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleProposition ) )
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
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
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
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1056:1: rule__Object__Alternatives : ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleProposition ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1061:1: ( ruleEntity )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1061:1: ( ruleEntity )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1062:1: ruleEntity
                    {
                     before(grammarAccess.getObjectAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Object__Alternatives2176);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1067:6: ( ruleRelationship )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1067:6: ( ruleRelationship )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1068:1: ruleRelationship
                    {
                     before(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelationship_in_rule__Object__Alternatives2193);
                    ruleRelationship();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1073:6: ( ruleProposition )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1073:6: ( ruleProposition )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1074:1: ruleProposition
                    {
                     before(grammarAccess.getObjectAccess().getPropositionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleProposition_in_rule__Object__Alternatives2210);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1084:1: rule__BeliefWorld__Alternatives_1 : ( ( ( rule__BeliefWorld__DomainsAssignment_1_0 ) ) | ( ( rule__BeliefWorld__RelationshipsAssignment_1_1 ) ) );
    public final void rule__BeliefWorld__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1088:1: ( ( ( rule__BeliefWorld__DomainsAssignment_1_0 ) ) | ( ( rule__BeliefWorld__RelationshipsAssignment_1_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==11||(LA2_0>=21 && LA2_0<=26)||(LA2_0>=42 && LA2_0<=51)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1084:1: rule__BeliefWorld__Alternatives_1 : ( ( ( rule__BeliefWorld__DomainsAssignment_1_0 ) ) | ( ( rule__BeliefWorld__RelationshipsAssignment_1_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1089:1: ( ( rule__BeliefWorld__DomainsAssignment_1_0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1089:1: ( ( rule__BeliefWorld__DomainsAssignment_1_0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1090:1: ( rule__BeliefWorld__DomainsAssignment_1_0 )
                    {
                     before(grammarAccess.getBeliefWorldAccess().getDomainsAssignment_1_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1091:1: ( rule__BeliefWorld__DomainsAssignment_1_0 )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1091:2: rule__BeliefWorld__DomainsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__BeliefWorld__DomainsAssignment_1_0_in_rule__BeliefWorld__Alternatives_12242);
                    rule__BeliefWorld__DomainsAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getBeliefWorldAccess().getDomainsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1095:6: ( ( rule__BeliefWorld__RelationshipsAssignment_1_1 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1095:6: ( ( rule__BeliefWorld__RelationshipsAssignment_1_1 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1096:1: ( rule__BeliefWorld__RelationshipsAssignment_1_1 )
                    {
                     before(grammarAccess.getBeliefWorldAccess().getRelationshipsAssignment_1_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1097:1: ( rule__BeliefWorld__RelationshipsAssignment_1_1 )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1097:2: rule__BeliefWorld__RelationshipsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__BeliefWorld__RelationshipsAssignment_1_1_in_rule__BeliefWorld__Alternatives_12260);
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


    // $ANTLR start rule__Entity__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1106:1: rule__Entity__Alternatives : ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1110:1: ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
                {
                alt3=1;
                }
                break;
            case 33:
            case 36:
                {
                alt3=2;
                }
                break;
            case 38:
            case 39:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1106:1: rule__Entity__Alternatives : ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1111:1: ( ruleActor )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1111:1: ( ruleActor )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1112:1: ruleActor
                    {
                     before(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Entity__Alternatives2293);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1117:6: ( ruleProcess )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1117:6: ( ruleProcess )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1118:1: ruleProcess
                    {
                     before(grammarAccess.getEntityAccess().getProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcess_in_rule__Entity__Alternatives2310);
                    ruleProcess();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getProcessParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1123:6: ( ruleResource )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1123:6: ( ruleResource )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1124:1: ruleResource
                    {
                     before(grammarAccess.getEntityAccess().getResourceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Entity__Alternatives2327);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1134:1: rule__Actor__Alternatives : ( ( ruleStakeholder ) | ( ruleAttacker ) );
    public final void rule__Actor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1138:1: ( ( ruleStakeholder ) | ( ruleAttacker ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==31) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1134:1: rule__Actor__Alternatives : ( ( ruleStakeholder ) | ( ruleAttacker ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1139:1: ( ruleStakeholder )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1139:1: ( ruleStakeholder )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1140:1: ruleStakeholder
                    {
                     before(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStakeholder_in_rule__Actor__Alternatives2359);
                    ruleStakeholder();
                    _fsp--;

                     after(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1145:6: ( ruleAttacker )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1145:6: ( ruleAttacker )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1146:1: ruleAttacker
                    {
                     before(grammarAccess.getActorAccess().getAttackerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttacker_in_rule__Actor__Alternatives2376);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1156:1: rule__Process__Alternatives : ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) );
    public final void rule__Process__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1160:1: ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==33) ) {
                alt5=1;
            }
            else if ( (LA5_0==36) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1156:1: rule__Process__Alternatives : ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1161:1: ( ruleNaturalProcess )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1161:1: ( ruleNaturalProcess )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1162:1: ruleNaturalProcess
                    {
                     before(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNaturalProcess_in_rule__Process__Alternatives2408);
                    ruleNaturalProcess();
                    _fsp--;

                     after(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1167:6: ( ruleHumanActivity )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1167:6: ( ruleHumanActivity )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1168:1: ruleHumanActivity
                    {
                     before(grammarAccess.getProcessAccess().getHumanActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHumanActivity_in_rule__Process__Alternatives2425);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1178:1: rule__Resource__Alternatives : ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) );
    public final void rule__Resource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1182:1: ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==38) ) {
                alt6=1;
            }
            else if ( (LA6_0==39) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1178:1: rule__Resource__Alternatives : ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1183:1: ( ( rule__Resource__Group_0__0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1183:1: ( ( rule__Resource__Group_0__0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1184:1: ( rule__Resource__Group_0__0 )
                    {
                     before(grammarAccess.getResourceAccess().getGroup_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1185:1: ( rule__Resource__Group_0__0 )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1185:2: rule__Resource__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Resource__Group_0__0_in_rule__Resource__Alternatives2457);
                    rule__Resource__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getResourceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1189:6: ( ruleAsset )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1189:6: ( ruleAsset )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1190:1: ruleAsset
                    {
                     before(grammarAccess.getResourceAccess().getAssetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAsset_in_rule__Resource__Alternatives2475);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1200:1: rule__Relationship__Alternatives : ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleTrusts ) | ( ruleDelegates ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttacks ) | ( ruleArgues ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1204:1: ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleTrusts ) | ( ruleDelegates ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttacks ) | ( ruleArgues ) )
            int alt7=13;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt7=1;
                }
                break;
            case 43:
                {
                alt7=2;
                }
                break;
            case 21:
            case 22:
                {
                alt7=3;
                }
                break;
            case 44:
                {
                alt7=4;
                }
                break;
            case 45:
                {
                alt7=5;
                }
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                {
                alt7=6;
                }
                break;
            case 11:
                {
                alt7=7;
                }
                break;
            case 46:
                {
                alt7=8;
                }
                break;
            case 47:
                {
                alt7=9;
                }
                break;
            case 48:
                {
                alt7=10;
                }
                break;
            case 49:
                {
                alt7=11;
                }
                break;
            case 50:
                {
                alt7=12;
                }
                break;
            case 51:
                {
                alt7=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1200:1: rule__Relationship__Alternatives : ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleTrusts ) | ( ruleDelegates ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttacks ) | ( ruleArgues ) );", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1205:1: ( ruleWants )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1205:1: ( ruleWants )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1206:1: ruleWants
                    {
                     before(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWants_in_rule__Relationship__Alternatives2507);
                    ruleWants();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1211:6: ( ruleDoes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1211:6: ( ruleDoes )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1212:1: ruleDoes
                    {
                     before(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDoes_in_rule__Relationship__Alternatives2524);
                    ruleDoes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1217:6: ( ruleDecomposes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1217:6: ( ruleDecomposes )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1218:1: ruleDecomposes
                    {
                     before(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDecomposes_in_rule__Relationship__Alternatives2541);
                    ruleDecomposes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1223:6: ( ruleTrusts )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1223:6: ( ruleTrusts )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1224:1: ruleTrusts
                    {
                     before(grammarAccess.getRelationshipAccess().getTrustsParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTrusts_in_rule__Relationship__Alternatives2558);
                    ruleTrusts();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getTrustsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1229:6: ( ruleDelegates )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1229:6: ( ruleDelegates )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1230:1: ruleDelegates
                    {
                     before(grammarAccess.getRelationshipAccess().getDelegatesParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDelegates_in_rule__Relationship__Alternatives2575);
                    ruleDelegates();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDelegatesParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1235:6: ( ruleContributes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1235:6: ( ruleContributes )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1236:1: ruleContributes
                    {
                     before(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleContributes_in_rule__Relationship__Alternatives2592);
                    ruleContributes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1241:6: ( ruleFulfils )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1241:6: ( ruleFulfils )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1242:1: ruleFulfils
                    {
                     before(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFulfils_in_rule__Relationship__Alternatives2609);
                    ruleFulfils();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1247:6: ( ruleProvides )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1247:6: ( ruleProvides )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1248:1: ruleProvides
                    {
                     before(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleProvides_in_rule__Relationship__Alternatives2626);
                    ruleProvides();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1253:6: ( ruleConsumes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1253:6: ( ruleConsumes )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1254:1: ruleConsumes
                    {
                     before(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleConsumes_in_rule__Relationship__Alternatives2643);
                    ruleConsumes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1259:6: ( ruleExploits )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1259:6: ( ruleExploits )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1260:1: ruleExploits
                    {
                     before(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleExploits_in_rule__Relationship__Alternatives2660);
                    ruleExploits();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1265:6: ( ruleDamages )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1265:6: ( ruleDamages )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1266:1: ruleDamages
                    {
                     before(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleDamages_in_rule__Relationship__Alternatives2677);
                    ruleDamages();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1271:6: ( ruleAttacks )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1271:6: ( ruleAttacks )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1272:1: ruleAttacks
                    {
                     before(grammarAccess.getRelationshipAccess().getAttacksParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleAttacks_in_rule__Relationship__Alternatives2694);
                    ruleAttacks();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getAttacksParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1277:6: ( ruleArgues )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1277:6: ( ruleArgues )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1278:1: ruleArgues
                    {
                     before(grammarAccess.getRelationshipAccess().getArguesParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleArgues_in_rule__Relationship__Alternatives2711);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1288:1: rule__DomainType__Alternatives : ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) );
    public final void rule__DomainType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1292:1: ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt8=1;
                }
                break;
            case 13:
                {
                alt8=2;
                }
                break;
            case 14:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1288:1: rule__DomainType__Alternatives : ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) );", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1293:1: ( ( 'S' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1293:1: ( ( 'S' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1294:1: ( 'S' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1295:1: ( 'S' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1295:3: 'S'
                    {
                    match(input,12,FOLLOW_12_in_rule__DomainType__Alternatives2744); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1300:6: ( ( 'R' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1300:6: ( ( 'R' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1301:1: ( 'R' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1302:1: ( 'R' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1302:3: 'R'
                    {
                    match(input,13,FOLLOW_13_in_rule__DomainType__Alternatives2765); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1307:6: ( ( 'W' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1307:6: ( ( 'W' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1308:1: ( 'W' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getWorldEnumLiteralDeclaration_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1309:1: ( 'W' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1309:3: 'W'
                    {
                    match(input,14,FOLLOW_14_in_rule__DomainType__Alternatives2786); 

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


    // $ANTLR start rule__PropositionType__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1319:1: rule__PropositionType__Alternatives : ( ( ( 'DA' ) ) | ( ( 'FR' ) ) | ( ( 'SR' ) ) | ( ( 'AR' ) ) | ( ( 'Q' ) ) | ( ( 'A' ) ) );
    public final void rule__PropositionType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1323:1: ( ( ( 'DA' ) ) | ( ( 'FR' ) ) | ( ( 'SR' ) ) | ( ( 'AR' ) ) | ( ( 'Q' ) ) | ( ( 'A' ) ) )
            int alt9=6;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
                {
                alt9=4;
                }
                break;
            case 19:
                {
                alt9=5;
                }
                break;
            case 20:
                {
                alt9=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1319:1: rule__PropositionType__Alternatives : ( ( ( 'DA' ) ) | ( ( 'FR' ) ) | ( ( 'SR' ) ) | ( ( 'AR' ) ) | ( ( 'Q' ) ) | ( ( 'A' ) ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1324:1: ( ( 'DA' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1324:1: ( ( 'DA' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1325:1: ( 'DA' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1326:1: ( 'DA' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1326:3: 'DA'
                    {
                    match(input,15,FOLLOW_15_in_rule__PropositionType__Alternatives2822); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1331:6: ( ( 'FR' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1331:6: ( ( 'FR' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1332:1: ( 'FR' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getFunctionEnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1333:1: ( 'FR' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1333:3: 'FR'
                    {
                    match(input,16,FOLLOW_16_in_rule__PropositionType__Alternatives2843); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getFunctionEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1338:6: ( ( 'SR' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1338:6: ( ( 'SR' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1339:1: ( 'SR' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getSecurityEnumLiteralDeclaration_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1340:1: ( 'SR' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1340:3: 'SR'
                    {
                    match(input,17,FOLLOW_17_in_rule__PropositionType__Alternatives2864); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getSecurityEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1345:6: ( ( 'AR' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1345:6: ( ( 'AR' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1346:1: ( 'AR' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getAntiEnumLiteralDeclaration_3()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1347:1: ( 'AR' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1347:3: 'AR'
                    {
                    match(input,18,FOLLOW_18_in_rule__PropositionType__Alternatives2885); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getAntiEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1352:6: ( ( 'Q' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1352:6: ( ( 'Q' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1353:1: ( 'Q' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getQualityPropositionEnumLiteralDeclaration_4()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1354:1: ( 'Q' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1354:3: 'Q'
                    {
                    match(input,19,FOLLOW_19_in_rule__PropositionType__Alternatives2906); 

                    }

                     after(grammarAccess.getPropositionTypeAccess().getQualityPropositionEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1359:6: ( ( 'A' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1359:6: ( ( 'A' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1360:1: ( 'A' )
                    {
                     before(grammarAccess.getPropositionTypeAccess().getArgumentEnumLiteralDeclaration_5()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1361:1: ( 'A' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1361:3: 'A'
                    {
                    match(input,20,FOLLOW_20_in_rule__PropositionType__Alternatives2927); 

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


    // $ANTLR start rule__DecomposesType__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1371:1: rule__DecomposesType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__DecomposesType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1375:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            else if ( (LA10_0==22) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1371:1: rule__DecomposesType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1376:1: ( ( 'and' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1376:1: ( ( 'and' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1377:1: ( 'and' )
                    {
                     before(grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1378:1: ( 'and' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1378:3: 'and'
                    {
                    match(input,21,FOLLOW_21_in_rule__DecomposesType__Alternatives2963); 

                    }

                     after(grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1383:6: ( ( 'or' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1383:6: ( ( 'or' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1384:1: ( 'or' )
                    {
                     before(grammarAccess.getDecomposesTypeAccess().getOREnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1385:1: ( 'or' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1385:3: 'or'
                    {
                    match(input,22,FOLLOW_22_in_rule__DecomposesType__Alternatives2984); 

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1395:1: rule__ContributesType__Alternatives : ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) );
    public final void rule__ContributesType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1399:1: ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            case 26:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1395:1: rule__ContributesType__Alternatives : ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1400:1: ( ( '-' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1400:1: ( ( '-' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1401:1: ( '-' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1402:1: ( '-' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1402:3: '-'
                    {
                    match(input,23,FOLLOW_23_in_rule__ContributesType__Alternatives3020); 

                    }

                     after(grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1407:6: ( ( '+' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1407:6: ( ( '+' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1408:1: ( '+' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1409:1: ( '+' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1409:3: '+'
                    {
                    match(input,24,FOLLOW_24_in_rule__ContributesType__Alternatives3041); 

                    }

                     after(grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1414:6: ( ( '--' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1414:6: ( ( '--' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1415:1: ( '--' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1416:1: ( '--' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1416:3: '--'
                    {
                    match(input,25,FOLLOW_25_in_rule__ContributesType__Alternatives3062); 

                    }

                     after(grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1421:6: ( ( '++' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1421:6: ( ( '++' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1422:1: ( '++' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getMAKEEnumLiteralDeclaration_3()); 
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1423:1: ( '++' )
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1423:3: '++'
                    {
                    match(input,26,FOLLOW_26_in_rule__ContributesType__Alternatives3083); 

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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1435:1: rule__Situation__Group__0 : rule__Situation__Group__0__Impl rule__Situation__Group__1 ;
    public final void rule__Situation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1439:1: ( rule__Situation__Group__0__Impl rule__Situation__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1440:2: rule__Situation__Group__0__Impl rule__Situation__Group__1
            {
            pushFollow(FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__03116);
            rule__Situation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__03119);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1447:1: rule__Situation__Group__0__Impl : ( ( rule__Situation__Group_0__0 )? ) ;
    public final void rule__Situation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1451:1: ( ( ( rule__Situation__Group_0__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1452:1: ( ( rule__Situation__Group_0__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1452:1: ( ( rule__Situation__Group_0__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1453:1: ( rule__Situation__Group_0__0 )?
            {
             before(grammarAccess.getSituationAccess().getGroup_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1454:1: ( rule__Situation__Group_0__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==27) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1454:2: rule__Situation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl3146);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1464:1: rule__Situation__Group__1 : rule__Situation__Group__1__Impl ;
    public final void rule__Situation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1468:1: ( rule__Situation__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1469:2: rule__Situation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__13177);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1475:1: rule__Situation__Group__1__Impl : ( ( rule__Situation__WorldAssignment_1 ) ) ;
    public final void rule__Situation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1479:1: ( ( ( rule__Situation__WorldAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1480:1: ( ( rule__Situation__WorldAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1480:1: ( ( rule__Situation__WorldAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1481:1: ( rule__Situation__WorldAssignment_1 )
            {
             before(grammarAccess.getSituationAccess().getWorldAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1482:1: ( rule__Situation__WorldAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1482:2: rule__Situation__WorldAssignment_1
            {
            pushFollow(FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl3204);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1496:1: rule__Situation__Group_0__0 : rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 ;
    public final void rule__Situation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1500:1: ( rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1501:2: rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__03238);
            rule__Situation__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__03241);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1508:1: rule__Situation__Group_0__0__Impl : ( 'model' ) ;
    public final void rule__Situation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1512:1: ( ( 'model' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1513:1: ( 'model' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1513:1: ( 'model' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1514:1: 'model'
            {
             before(grammarAccess.getSituationAccess().getModelKeyword_0_0()); 
            match(input,27,FOLLOW_27_in_rule__Situation__Group_0__0__Impl3269); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1527:1: rule__Situation__Group_0__1 : rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 ;
    public final void rule__Situation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1531:1: ( rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1532:2: rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__13300);
            rule__Situation__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__13303);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1539:1: rule__Situation__Group_0__1__Impl : ( ( rule__Situation__TimeAssignment_0_1 ) ) ;
    public final void rule__Situation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1543:1: ( ( ( rule__Situation__TimeAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1544:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1544:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1545:1: ( rule__Situation__TimeAssignment_0_1 )
            {
             before(grammarAccess.getSituationAccess().getTimeAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1546:1: ( rule__Situation__TimeAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1546:2: rule__Situation__TimeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl3330);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1556:1: rule__Situation__Group_0__2 : rule__Situation__Group_0__2__Impl ;
    public final void rule__Situation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1560:1: ( rule__Situation__Group_0__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1561:2: rule__Situation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__23360);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1567:1: rule__Situation__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Situation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1571:1: ( ( ':' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1572:1: ( ':' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1572:1: ( ':' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1573:1: ':'
            {
             before(grammarAccess.getSituationAccess().getColonKeyword_0_2()); 
            match(input,28,FOLLOW_28_in_rule__Situation__Group_0__2__Impl3388); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1592:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1596:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1597:2: rule__World__Group__0__Impl rule__World__Group__1
            {
            pushFollow(FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__03425);
            rule__World__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__World__Group__1_in_rule__World__Group__03428);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1604:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1608:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1609:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1609:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1610:1: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1611:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1613:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1623:1: rule__World__Group__1 : rule__World__Group__1__Impl rule__World__Group__2 ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1627:1: ( rule__World__Group__1__Impl rule__World__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1628:2: rule__World__Group__1__Impl rule__World__Group__2
            {
            pushFollow(FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__13486);
            rule__World__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__World__Group__2_in_rule__World__Group__13489);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1635:1: rule__World__Group__1__Impl : ( ( rule__World__PhysicalAssignment_1 )? ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1639:1: ( ( ( rule__World__PhysicalAssignment_1 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1640:1: ( ( rule__World__PhysicalAssignment_1 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1640:1: ( ( rule__World__PhysicalAssignment_1 )? )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1641:1: ( rule__World__PhysicalAssignment_1 )?
            {
             before(grammarAccess.getWorldAccess().getPhysicalAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1642:1: ( rule__World__PhysicalAssignment_1 )?
            int alt13=2;
            switch ( input.LA(1) ) {
                case 31:
                case 32:
                case 33:
                case 36:
                case 38:
                case 39:
                    {
                    alt13=1;
                    }
                    break;
                case RULE_ID:
                    {
                    alt13=1;
                    }
                    break;
                case 42:
                    {
                    alt13=1;
                    }
                    break;
                case 43:
                    {
                    alt13=1;
                    }
                    break;
                case 21:
                    {
                    alt13=1;
                    }
                    break;
                case 22:
                    {
                    alt13=1;
                    }
                    break;
                case 44:
                    {
                    alt13=1;
                    }
                    break;
                case 45:
                    {
                    alt13=1;
                    }
                    break;
                case 23:
                    {
                    alt13=1;
                    }
                    break;
                case 24:
                    {
                    alt13=1;
                    }
                    break;
                case 25:
                    {
                    alt13=1;
                    }
                    break;
                case 26:
                    {
                    alt13=1;
                    }
                    break;
                case 11:
                    {
                    alt13=1;
                    }
                    break;
                case 46:
                    {
                    alt13=1;
                    }
                    break;
                case 47:
                    {
                    alt13=1;
                    }
                    break;
                case 48:
                    {
                    alt13=1;
                    }
                    break;
                case 49:
                    {
                    alt13=1;
                    }
                    break;
                case 50:
                    {
                    alt13=1;
                    }
                    break;
                case 51:
                    {
                    alt13=1;
                    }
                    break;
                case EOF:
                    {
                    alt13=1;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1642:2: rule__World__PhysicalAssignment_1
                    {
                    pushFollow(FOLLOW_rule__World__PhysicalAssignment_1_in_rule__World__Group__1__Impl3516);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1652:1: rule__World__Group__2 : rule__World__Group__2__Impl ;
    public final void rule__World__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1656:1: ( rule__World__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1657:2: rule__World__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__World__Group__2__Impl_in_rule__World__Group__23547);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1663:1: rule__World__Group__2__Impl : ( ( rule__World__BeliefAssignment_2 )? ) ;
    public final void rule__World__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1667:1: ( ( ( rule__World__BeliefAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1668:1: ( ( rule__World__BeliefAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1668:1: ( ( rule__World__BeliefAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1669:1: ( rule__World__BeliefAssignment_2 )?
            {
             before(grammarAccess.getWorldAccess().getBeliefAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1670:1: ( rule__World__BeliefAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID||LA14_0==11||(LA14_0>=21 && LA14_0<=26)||(LA14_0>=42 && LA14_0<=51)) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1670:2: rule__World__BeliefAssignment_2
                    {
                    pushFollow(FOLLOW_rule__World__BeliefAssignment_2_in_rule__World__Group__2__Impl3574);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1686:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1690:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1691:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03611);
            rule__Event__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03614);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1698:1: rule__Event__Group__0__Impl : ( 'event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1702:1: ( ( 'event' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1703:1: ( 'event' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1703:1: ( 'event' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1704:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__Event__Group__0__Impl3642); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1717:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1721:1: ( rule__Event__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1722:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13673);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1728:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1732:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1733:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1733:1: ( ( rule__Event__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1734:1: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1735:1: ( rule__Event__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1735:2: rule__Event__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl3700);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1749:1: rule__PhysicalWorld__Group__0 : rule__PhysicalWorld__Group__0__Impl rule__PhysicalWorld__Group__1 ;
    public final void rule__PhysicalWorld__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1753:1: ( rule__PhysicalWorld__Group__0__Impl rule__PhysicalWorld__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1754:2: rule__PhysicalWorld__Group__0__Impl rule__PhysicalWorld__Group__1
            {
            pushFollow(FOLLOW_rule__PhysicalWorld__Group__0__Impl_in_rule__PhysicalWorld__Group__03734);
            rule__PhysicalWorld__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__PhysicalWorld__Group__1_in_rule__PhysicalWorld__Group__03737);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1761:1: rule__PhysicalWorld__Group__0__Impl : ( () ) ;
    public final void rule__PhysicalWorld__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1765:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1766:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1766:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1767:1: ()
            {
             before(grammarAccess.getPhysicalWorldAccess().getPhysicalWorldAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1768:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1770:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1780:1: rule__PhysicalWorld__Group__1 : rule__PhysicalWorld__Group__1__Impl ;
    public final void rule__PhysicalWorld__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1784:1: ( rule__PhysicalWorld__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1785:2: rule__PhysicalWorld__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__PhysicalWorld__Group__1__Impl_in_rule__PhysicalWorld__Group__13795);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1791:1: rule__PhysicalWorld__Group__1__Impl : ( ( rule__PhysicalWorld__EntitiesAssignment_1 )* ) ;
    public final void rule__PhysicalWorld__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1795:1: ( ( ( rule__PhysicalWorld__EntitiesAssignment_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1796:1: ( ( rule__PhysicalWorld__EntitiesAssignment_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1796:1: ( ( rule__PhysicalWorld__EntitiesAssignment_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1797:1: ( rule__PhysicalWorld__EntitiesAssignment_1 )*
            {
             before(grammarAccess.getPhysicalWorldAccess().getEntitiesAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1798:1: ( rule__PhysicalWorld__EntitiesAssignment_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=31 && LA15_0<=33)||LA15_0==36||(LA15_0>=38 && LA15_0<=39)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1798:2: rule__PhysicalWorld__EntitiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__PhysicalWorld__EntitiesAssignment_1_in_rule__PhysicalWorld__Group__1__Impl3822);
            	    rule__PhysicalWorld__EntitiesAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1812:1: rule__BeliefWorld__Group__0 : rule__BeliefWorld__Group__0__Impl rule__BeliefWorld__Group__1 ;
    public final void rule__BeliefWorld__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1816:1: ( rule__BeliefWorld__Group__0__Impl rule__BeliefWorld__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1817:2: rule__BeliefWorld__Group__0__Impl rule__BeliefWorld__Group__1
            {
            pushFollow(FOLLOW_rule__BeliefWorld__Group__0__Impl_in_rule__BeliefWorld__Group__03857);
            rule__BeliefWorld__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__BeliefWorld__Group__1_in_rule__BeliefWorld__Group__03860);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1824:1: rule__BeliefWorld__Group__0__Impl : ( () ) ;
    public final void rule__BeliefWorld__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1828:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1829:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1829:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1830:1: ()
            {
             before(grammarAccess.getBeliefWorldAccess().getBeliefWorldAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1831:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1833:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1843:1: rule__BeliefWorld__Group__1 : rule__BeliefWorld__Group__1__Impl ;
    public final void rule__BeliefWorld__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1847:1: ( rule__BeliefWorld__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1848:2: rule__BeliefWorld__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BeliefWorld__Group__1__Impl_in_rule__BeliefWorld__Group__13918);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1854:1: rule__BeliefWorld__Group__1__Impl : ( ( rule__BeliefWorld__Alternatives_1 )* ) ;
    public final void rule__BeliefWorld__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1858:1: ( ( ( rule__BeliefWorld__Alternatives_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1859:1: ( ( rule__BeliefWorld__Alternatives_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1859:1: ( ( rule__BeliefWorld__Alternatives_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1860:1: ( rule__BeliefWorld__Alternatives_1 )*
            {
             before(grammarAccess.getBeliefWorldAccess().getAlternatives_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1861:1: ( rule__BeliefWorld__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==11||(LA16_0>=21 && LA16_0<=26)||(LA16_0>=42 && LA16_0<=51)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1861:2: rule__BeliefWorld__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__BeliefWorld__Alternatives_1_in_rule__BeliefWorld__Group__1__Impl3945);
            	    rule__BeliefWorld__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1875:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1879:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1880:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03980);
            rule__Domain__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03983);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1887:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__NameAssignment_0 ) ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1891:1: ( ( ( rule__Domain__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1892:1: ( ( rule__Domain__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1892:1: ( ( rule__Domain__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1893:1: ( rule__Domain__NameAssignment_0 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1894:1: ( rule__Domain__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1894:2: rule__Domain__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_0_in_rule__Domain__Group__0__Impl4010);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1904:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1908:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1909:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__14040);
            rule__Domain__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__14043);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1916:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__TypeAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1920:1: ( ( ( rule__Domain__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1921:1: ( ( rule__Domain__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1921:1: ( ( rule__Domain__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1922:1: ( rule__Domain__TypeAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1923:1: ( rule__Domain__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1923:2: rule__Domain__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Domain__TypeAssignment_1_in_rule__Domain__Group__1__Impl4070);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1933:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1937:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1938:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__24100);
            rule__Domain__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__24103);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1945:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__PropertiesAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1949:1: ( ( ( rule__Domain__PropertiesAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1950:1: ( ( rule__Domain__PropertiesAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1950:1: ( ( rule__Domain__PropertiesAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1951:1: ( rule__Domain__PropertiesAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1952:1: ( rule__Domain__PropertiesAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1952:2: rule__Domain__PropertiesAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_2_in_rule__Domain__Group__2__Impl4130);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1962:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1966:1: ( rule__Domain__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1967:2: rule__Domain__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__34160);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1973:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__Group_3__0 )* ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1977:1: ( ( ( rule__Domain__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1978:1: ( ( rule__Domain__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1978:1: ( ( rule__Domain__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1979:1: ( rule__Domain__Group_3__0 )*
            {
             before(grammarAccess.getDomainAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1980:1: ( rule__Domain__Group_3__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==30) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1980:2: rule__Domain__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__Group_3__0_in_rule__Domain__Group__3__Impl4187);
            	    rule__Domain__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:1998:1: rule__Domain__Group_3__0 : rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1 ;
    public final void rule__Domain__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2002:1: ( rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2003:2: rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_3__0__Impl_in_rule__Domain__Group_3__04226);
            rule__Domain__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_3__1_in_rule__Domain__Group_3__04229);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2010:1: rule__Domain__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Domain__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2014:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2015:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2015:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2016:1: ','
            {
             before(grammarAccess.getDomainAccess().getCommaKeyword_3_0()); 
            match(input,30,FOLLOW_30_in_rule__Domain__Group_3__0__Impl4257); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2029:1: rule__Domain__Group_3__1 : rule__Domain__Group_3__1__Impl ;
    public final void rule__Domain__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2033:1: ( rule__Domain__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2034:2: rule__Domain__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_3__1__Impl_in_rule__Domain__Group_3__14288);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2040:1: rule__Domain__Group_3__1__Impl : ( ( rule__Domain__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Domain__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2044:1: ( ( ( rule__Domain__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2045:1: ( ( rule__Domain__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2045:1: ( ( rule__Domain__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2046:1: ( rule__Domain__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2047:1: ( rule__Domain__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2047:2: rule__Domain__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_3_1_in_rule__Domain__Group_3__1__Impl4315);
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


    // $ANTLR start rule__Proposition__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2061:1: rule__Proposition__Group__0 : rule__Proposition__Group__0__Impl rule__Proposition__Group__1 ;
    public final void rule__Proposition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2065:1: ( rule__Proposition__Group__0__Impl rule__Proposition__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2066:2: rule__Proposition__Group__0__Impl rule__Proposition__Group__1
            {
            pushFollow(FOLLOW_rule__Proposition__Group__0__Impl_in_rule__Proposition__Group__04349);
            rule__Proposition__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Proposition__Group__1_in_rule__Proposition__Group__04352);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2073:1: rule__Proposition__Group__0__Impl : ( ( rule__Proposition__TypeAssignment_0 ) ) ;
    public final void rule__Proposition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2077:1: ( ( ( rule__Proposition__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2078:1: ( ( rule__Proposition__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2078:1: ( ( rule__Proposition__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2079:1: ( rule__Proposition__TypeAssignment_0 )
            {
             before(grammarAccess.getPropositionAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2080:1: ( rule__Proposition__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2080:2: rule__Proposition__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Proposition__TypeAssignment_0_in_rule__Proposition__Group__0__Impl4379);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2090:1: rule__Proposition__Group__1 : rule__Proposition__Group__1__Impl ;
    public final void rule__Proposition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2094:1: ( rule__Proposition__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2095:2: rule__Proposition__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Proposition__Group__1__Impl_in_rule__Proposition__Group__14409);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2101:1: rule__Proposition__Group__1__Impl : ( ( rule__Proposition__NameAssignment_1 ) ) ;
    public final void rule__Proposition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2105:1: ( ( ( rule__Proposition__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2106:1: ( ( rule__Proposition__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2106:1: ( ( rule__Proposition__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2107:1: ( rule__Proposition__NameAssignment_1 )
            {
             before(grammarAccess.getPropositionAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2108:1: ( rule__Proposition__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2108:2: rule__Proposition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Proposition__NameAssignment_1_in_rule__Proposition__Group__1__Impl4436);
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


    // $ANTLR start rule__Stakeholder__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2122:1: rule__Stakeholder__Group__0 : rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1 ;
    public final void rule__Stakeholder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2126:1: ( rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2127:2: rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__0__Impl_in_rule__Stakeholder__Group__04470);
            rule__Stakeholder__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__1_in_rule__Stakeholder__Group__04473);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2134:1: rule__Stakeholder__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Stakeholder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2138:1: ( ( 'actor' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2139:1: ( 'actor' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2139:1: ( 'actor' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2140:1: 'actor'
            {
             before(grammarAccess.getStakeholderAccess().getActorKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Stakeholder__Group__0__Impl4501); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2153:1: rule__Stakeholder__Group__1 : rule__Stakeholder__Group__1__Impl ;
    public final void rule__Stakeholder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2157:1: ( rule__Stakeholder__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2158:2: rule__Stakeholder__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__1__Impl_in_rule__Stakeholder__Group__14532);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2164:1: rule__Stakeholder__Group__1__Impl : ( ( rule__Stakeholder__NameAssignment_1 ) ) ;
    public final void rule__Stakeholder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2168:1: ( ( ( rule__Stakeholder__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2169:1: ( ( rule__Stakeholder__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2169:1: ( ( rule__Stakeholder__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2170:1: ( rule__Stakeholder__NameAssignment_1 )
            {
             before(grammarAccess.getStakeholderAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2171:1: ( rule__Stakeholder__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2171:2: rule__Stakeholder__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Stakeholder__NameAssignment_1_in_rule__Stakeholder__Group__1__Impl4559);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2185:1: rule__Attacker__Group__0 : rule__Attacker__Group__0__Impl rule__Attacker__Group__1 ;
    public final void rule__Attacker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2189:1: ( rule__Attacker__Group__0__Impl rule__Attacker__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2190:2: rule__Attacker__Group__0__Impl rule__Attacker__Group__1
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__04593);
            rule__Attacker__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__04596);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2197:1: rule__Attacker__Group__0__Impl : ( 'attacker' ) ;
    public final void rule__Attacker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2201:1: ( ( 'attacker' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2202:1: ( 'attacker' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2202:1: ( 'attacker' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2203:1: 'attacker'
            {
             before(grammarAccess.getAttackerAccess().getAttackerKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Attacker__Group__0__Impl4624); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2216:1: rule__Attacker__Group__1 : rule__Attacker__Group__1__Impl ;
    public final void rule__Attacker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2220:1: ( rule__Attacker__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2221:2: rule__Attacker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__14655);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2227:1: rule__Attacker__Group__1__Impl : ( ( rule__Attacker__NameAssignment_1 ) ) ;
    public final void rule__Attacker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2231:1: ( ( ( rule__Attacker__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2232:1: ( ( rule__Attacker__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2232:1: ( ( rule__Attacker__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2233:1: ( rule__Attacker__NameAssignment_1 )
            {
             before(grammarAccess.getAttackerAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2234:1: ( rule__Attacker__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2234:2: rule__Attacker__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attacker__NameAssignment_1_in_rule__Attacker__Group__1__Impl4682);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2248:1: rule__NaturalProcess__Group__0 : rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1 ;
    public final void rule__NaturalProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2252:1: ( rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2253:2: rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__0__Impl_in_rule__NaturalProcess__Group__04716);
            rule__NaturalProcess__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group__1_in_rule__NaturalProcess__Group__04719);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2260:1: rule__NaturalProcess__Group__0__Impl : ( 'process' ) ;
    public final void rule__NaturalProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2264:1: ( ( 'process' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2265:1: ( 'process' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2265:1: ( 'process' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2266:1: 'process'
            {
             before(grammarAccess.getNaturalProcessAccess().getProcessKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__NaturalProcess__Group__0__Impl4747); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2279:1: rule__NaturalProcess__Group__1 : rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2 ;
    public final void rule__NaturalProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2283:1: ( rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2284:2: rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__1__Impl_in_rule__NaturalProcess__Group__14778);
            rule__NaturalProcess__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group__2_in_rule__NaturalProcess__Group__14781);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2291:1: rule__NaturalProcess__Group__1__Impl : ( ( rule__NaturalProcess__NameAssignment_1 ) ) ;
    public final void rule__NaturalProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2295:1: ( ( ( rule__NaturalProcess__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2296:1: ( ( rule__NaturalProcess__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2296:1: ( ( rule__NaturalProcess__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2297:1: ( rule__NaturalProcess__NameAssignment_1 )
            {
             before(grammarAccess.getNaturalProcessAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2298:1: ( rule__NaturalProcess__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2298:2: rule__NaturalProcess__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__NameAssignment_1_in_rule__NaturalProcess__Group__1__Impl4808);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2308:1: rule__NaturalProcess__Group__2 : rule__NaturalProcess__Group__2__Impl ;
    public final void rule__NaturalProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2312:1: ( rule__NaturalProcess__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2313:2: rule__NaturalProcess__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__2__Impl_in_rule__NaturalProcess__Group__24838);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2319:1: rule__NaturalProcess__Group__2__Impl : ( ( rule__NaturalProcess__Group_2__0 )? ) ;
    public final void rule__NaturalProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2323:1: ( ( ( rule__NaturalProcess__Group_2__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2324:1: ( ( rule__NaturalProcess__Group_2__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2324:1: ( ( rule__NaturalProcess__Group_2__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2325:1: ( rule__NaturalProcess__Group_2__0 )?
            {
             before(grammarAccess.getNaturalProcessAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2326:1: ( rule__NaturalProcess__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2326:2: rule__NaturalProcess__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NaturalProcess__Group_2__0_in_rule__NaturalProcess__Group__2__Impl4865);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2342:1: rule__NaturalProcess__Group_2__0 : rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1 ;
    public final void rule__NaturalProcess__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2346:1: ( rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2347:2: rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__0__Impl_in_rule__NaturalProcess__Group_2__04902);
            rule__NaturalProcess__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__1_in_rule__NaturalProcess__Group_2__04905);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2354:1: rule__NaturalProcess__Group_2__0__Impl : ( '{' ) ;
    public final void rule__NaturalProcess__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2358:1: ( ( '{' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2359:1: ( '{' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2359:1: ( '{' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2360:1: '{'
            {
             before(grammarAccess.getNaturalProcessAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__NaturalProcess__Group_2__0__Impl4933); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2373:1: rule__NaturalProcess__Group_2__1 : rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2 ;
    public final void rule__NaturalProcess__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2377:1: ( rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2378:2: rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__1__Impl_in_rule__NaturalProcess__Group_2__14964);
            rule__NaturalProcess__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__2_in_rule__NaturalProcess__Group_2__14967);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2385:1: rule__NaturalProcess__Group_2__1__Impl : ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* ) ;
    public final void rule__NaturalProcess__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2389:1: ( ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2390:1: ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2390:1: ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2391:1: ( rule__NaturalProcess__ActivitiesAssignment_2_1 )*
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2392:1: ( rule__NaturalProcess__ActivitiesAssignment_2_1 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_ID) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2392:2: rule__NaturalProcess__ActivitiesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__NaturalProcess__ActivitiesAssignment_2_1_in_rule__NaturalProcess__Group_2__1__Impl4994);
            	    rule__NaturalProcess__ActivitiesAssignment_2_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2402:1: rule__NaturalProcess__Group_2__2 : rule__NaturalProcess__Group_2__2__Impl ;
    public final void rule__NaturalProcess__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2406:1: ( rule__NaturalProcess__Group_2__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2407:2: rule__NaturalProcess__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__2__Impl_in_rule__NaturalProcess__Group_2__25025);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2413:1: rule__NaturalProcess__Group_2__2__Impl : ( '}' ) ;
    public final void rule__NaturalProcess__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2417:1: ( ( '}' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2418:1: ( '}' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2418:1: ( '}' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2419:1: '}'
            {
             before(grammarAccess.getNaturalProcessAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,35,FOLLOW_35_in_rule__NaturalProcess__Group_2__2__Impl5053); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2438:1: rule__HumanActivity__Group__0 : rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1 ;
    public final void rule__HumanActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2442:1: ( rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2443:2: rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__0__Impl_in_rule__HumanActivity__Group__05090);
            rule__HumanActivity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__1_in_rule__HumanActivity__Group__05093);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2450:1: rule__HumanActivity__Group__0__Impl : ( () ) ;
    public final void rule__HumanActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2454:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2455:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2455:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2456:1: ()
            {
             before(grammarAccess.getHumanActivityAccess().getActivityAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2457:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2459:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2469:1: rule__HumanActivity__Group__1 : rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2 ;
    public final void rule__HumanActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2473:1: ( rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2474:2: rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__1__Impl_in_rule__HumanActivity__Group__15151);
            rule__HumanActivity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__2_in_rule__HumanActivity__Group__15154);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2481:1: rule__HumanActivity__Group__1__Impl : ( 'activity' ) ;
    public final void rule__HumanActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2485:1: ( ( 'activity' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2486:1: ( 'activity' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2486:1: ( 'activity' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2487:1: 'activity'
            {
             before(grammarAccess.getHumanActivityAccess().getActivityKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__HumanActivity__Group__1__Impl5182); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2500:1: rule__HumanActivity__Group__2 : rule__HumanActivity__Group__2__Impl rule__HumanActivity__Group__3 ;
    public final void rule__HumanActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2504:1: ( rule__HumanActivity__Group__2__Impl rule__HumanActivity__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2505:2: rule__HumanActivity__Group__2__Impl rule__HumanActivity__Group__3
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__2__Impl_in_rule__HumanActivity__Group__25213);
            rule__HumanActivity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__3_in_rule__HumanActivity__Group__25216);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2512:1: rule__HumanActivity__Group__2__Impl : ( ( rule__HumanActivity__NameAssignment_2 ) ) ;
    public final void rule__HumanActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2516:1: ( ( ( rule__HumanActivity__NameAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2517:1: ( ( rule__HumanActivity__NameAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2517:1: ( ( rule__HumanActivity__NameAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2518:1: ( rule__HumanActivity__NameAssignment_2 )
            {
             before(grammarAccess.getHumanActivityAccess().getNameAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2519:1: ( rule__HumanActivity__NameAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2519:2: rule__HumanActivity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__HumanActivity__NameAssignment_2_in_rule__HumanActivity__Group__2__Impl5243);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2529:1: rule__HumanActivity__Group__3 : rule__HumanActivity__Group__3__Impl ;
    public final void rule__HumanActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2533:1: ( rule__HumanActivity__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2534:2: rule__HumanActivity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__3__Impl_in_rule__HumanActivity__Group__35273);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2540:1: rule__HumanActivity__Group__3__Impl : ( ( rule__HumanActivity__ActionsAssignment_3 )* ) ;
    public final void rule__HumanActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2544:1: ( ( ( rule__HumanActivity__ActionsAssignment_3 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2545:1: ( ( rule__HumanActivity__ActionsAssignment_3 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2545:1: ( ( rule__HumanActivity__ActionsAssignment_3 )* )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2546:1: ( rule__HumanActivity__ActionsAssignment_3 )*
            {
             before(grammarAccess.getHumanActivityAccess().getActionsAssignment_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2547:1: ( rule__HumanActivity__ActionsAssignment_3 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==37) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2547:2: rule__HumanActivity__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__HumanActivity__ActionsAssignment_3_in_rule__HumanActivity__Group__3__Impl5300);
            	    rule__HumanActivity__ActionsAssignment_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2565:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2569:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2570:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__05339);
            rule__Action__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__05342);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2577:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2581:1: ( ( 'action' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2582:1: ( 'action' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2582:1: ( 'action' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2583:1: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Action__Group__0__Impl5370); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2596:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2600:1: ( rule__Action__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2601:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__15401);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2607:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2611:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2612:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2612:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2613:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2614:1: ( rule__Action__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2614:2: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl5428);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2628:1: rule__Resource__Group_0__0 : rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1 ;
    public final void rule__Resource__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2632:1: ( rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2633:2: rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1
            {
            pushFollow(FOLLOW_rule__Resource__Group_0__0__Impl_in_rule__Resource__Group_0__05462);
            rule__Resource__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group_0__1_in_rule__Resource__Group_0__05465);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2640:1: rule__Resource__Group_0__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2644:1: ( ( 'resource' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2645:1: ( 'resource' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2645:1: ( 'resource' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2646:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Resource__Group_0__0__Impl5493); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2659:1: rule__Resource__Group_0__1 : rule__Resource__Group_0__1__Impl ;
    public final void rule__Resource__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2663:1: ( rule__Resource__Group_0__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2664:2: rule__Resource__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group_0__1__Impl_in_rule__Resource__Group_0__15524);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2670:1: rule__Resource__Group_0__1__Impl : ( ( rule__Resource__NameAssignment_0_1 ) ) ;
    public final void rule__Resource__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2674:1: ( ( ( rule__Resource__NameAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2675:1: ( ( rule__Resource__NameAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2675:1: ( ( rule__Resource__NameAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2676:1: ( rule__Resource__NameAssignment_0_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2677:1: ( rule__Resource__NameAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2677:2: rule__Resource__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_0_1_in_rule__Resource__Group_0__1__Impl5551);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2691:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2695:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2696:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__05585);
            rule__Asset__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__05588);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2703:1: rule__Asset__Group__0__Impl : ( 'asset' ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2707:1: ( ( 'asset' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2708:1: ( 'asset' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2708:1: ( 'asset' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2709:1: 'asset'
            {
             before(grammarAccess.getAssetAccess().getAssetKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Asset__Group__0__Impl5616); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2722:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2726:1: ( rule__Asset__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2727:2: rule__Asset__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__15647);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2733:1: rule__Asset__Group__1__Impl : ( ( rule__Asset__NameAssignment_1 ) ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2737:1: ( ( ( rule__Asset__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2738:1: ( ( rule__Asset__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2738:1: ( ( rule__Asset__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2739:1: ( rule__Asset__NameAssignment_1 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2740:1: ( rule__Asset__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2740:2: rule__Asset__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl5674);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2754:1: rule__Wants__Group__0 : rule__Wants__Group__0__Impl rule__Wants__Group__1 ;
    public final void rule__Wants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2758:1: ( rule__Wants__Group__0__Impl rule__Wants__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2759:2: rule__Wants__Group__0__Impl rule__Wants__Group__1
            {
            pushFollow(FOLLOW_rule__Wants__Group__0__Impl_in_rule__Wants__Group__05708);
            rule__Wants__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__1_in_rule__Wants__Group__05711);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2766:1: rule__Wants__Group__0__Impl : ( ( rule__Wants__TypeAssignment_0 ) ) ;
    public final void rule__Wants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2770:1: ( ( ( rule__Wants__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2771:1: ( ( rule__Wants__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2771:1: ( ( rule__Wants__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2772:1: ( rule__Wants__TypeAssignment_0 )
            {
             before(grammarAccess.getWantsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2773:1: ( rule__Wants__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2773:2: rule__Wants__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Wants__TypeAssignment_0_in_rule__Wants__Group__0__Impl5738);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2783:1: rule__Wants__Group__1 : rule__Wants__Group__1__Impl rule__Wants__Group__2 ;
    public final void rule__Wants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2787:1: ( rule__Wants__Group__1__Impl rule__Wants__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2788:2: rule__Wants__Group__1__Impl rule__Wants__Group__2
            {
            pushFollow(FOLLOW_rule__Wants__Group__1__Impl_in_rule__Wants__Group__15768);
            rule__Wants__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__2_in_rule__Wants__Group__15771);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2795:1: rule__Wants__Group__1__Impl : ( '(' ) ;
    public final void rule__Wants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2799:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2800:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2800:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2801:1: '('
            {
             before(grammarAccess.getWantsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Wants__Group__1__Impl5799); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2814:1: rule__Wants__Group__2 : rule__Wants__Group__2__Impl rule__Wants__Group__3 ;
    public final void rule__Wants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2818:1: ( rule__Wants__Group__2__Impl rule__Wants__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2819:2: rule__Wants__Group__2__Impl rule__Wants__Group__3
            {
            pushFollow(FOLLOW_rule__Wants__Group__2__Impl_in_rule__Wants__Group__25830);
            rule__Wants__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__3_in_rule__Wants__Group__25833);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2826:1: rule__Wants__Group__2__Impl : ( ( rule__Wants__SourceAssignment_2 ) ) ;
    public final void rule__Wants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2830:1: ( ( ( rule__Wants__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2831:1: ( ( rule__Wants__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2831:1: ( ( rule__Wants__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2832:1: ( rule__Wants__SourceAssignment_2 )
            {
             before(grammarAccess.getWantsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2833:1: ( rule__Wants__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2833:2: rule__Wants__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Wants__SourceAssignment_2_in_rule__Wants__Group__2__Impl5860);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2843:1: rule__Wants__Group__3 : rule__Wants__Group__3__Impl rule__Wants__Group__4 ;
    public final void rule__Wants__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2847:1: ( rule__Wants__Group__3__Impl rule__Wants__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2848:2: rule__Wants__Group__3__Impl rule__Wants__Group__4
            {
            pushFollow(FOLLOW_rule__Wants__Group__3__Impl_in_rule__Wants__Group__35890);
            rule__Wants__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__4_in_rule__Wants__Group__35893);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2855:1: rule__Wants__Group__3__Impl : ( ',' ) ;
    public final void rule__Wants__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2859:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2860:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2860:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2861:1: ','
            {
             before(grammarAccess.getWantsAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Wants__Group__3__Impl5921); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2874:1: rule__Wants__Group__4 : rule__Wants__Group__4__Impl rule__Wants__Group__5 ;
    public final void rule__Wants__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2878:1: ( rule__Wants__Group__4__Impl rule__Wants__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2879:2: rule__Wants__Group__4__Impl rule__Wants__Group__5
            {
            pushFollow(FOLLOW_rule__Wants__Group__4__Impl_in_rule__Wants__Group__45952);
            rule__Wants__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__5_in_rule__Wants__Group__45955);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2886:1: rule__Wants__Group__4__Impl : ( ( rule__Wants__TargetAssignment_4 ) ) ;
    public final void rule__Wants__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2890:1: ( ( ( rule__Wants__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2891:1: ( ( rule__Wants__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2891:1: ( ( rule__Wants__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2892:1: ( rule__Wants__TargetAssignment_4 )
            {
             before(grammarAccess.getWantsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2893:1: ( rule__Wants__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2893:2: rule__Wants__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Wants__TargetAssignment_4_in_rule__Wants__Group__4__Impl5982);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2903:1: rule__Wants__Group__5 : rule__Wants__Group__5__Impl ;
    public final void rule__Wants__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2907:1: ( rule__Wants__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2908:2: rule__Wants__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Wants__Group__5__Impl_in_rule__Wants__Group__56012);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2914:1: rule__Wants__Group__5__Impl : ( ')' ) ;
    public final void rule__Wants__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2918:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2919:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2919:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2920:1: ')'
            {
             before(grammarAccess.getWantsAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Wants__Group__5__Impl6040); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2945:1: rule__Does__Group__0 : rule__Does__Group__0__Impl rule__Does__Group__1 ;
    public final void rule__Does__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2949:1: ( rule__Does__Group__0__Impl rule__Does__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2950:2: rule__Does__Group__0__Impl rule__Does__Group__1
            {
            pushFollow(FOLLOW_rule__Does__Group__0__Impl_in_rule__Does__Group__06083);
            rule__Does__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__1_in_rule__Does__Group__06086);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2957:1: rule__Does__Group__0__Impl : ( ( rule__Does__TypeAssignment_0 ) ) ;
    public final void rule__Does__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2961:1: ( ( ( rule__Does__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2962:1: ( ( rule__Does__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2962:1: ( ( rule__Does__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2963:1: ( rule__Does__TypeAssignment_0 )
            {
             before(grammarAccess.getDoesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2964:1: ( rule__Does__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2964:2: rule__Does__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Does__TypeAssignment_0_in_rule__Does__Group__0__Impl6113);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2974:1: rule__Does__Group__1 : rule__Does__Group__1__Impl rule__Does__Group__2 ;
    public final void rule__Does__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2978:1: ( rule__Does__Group__1__Impl rule__Does__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2979:2: rule__Does__Group__1__Impl rule__Does__Group__2
            {
            pushFollow(FOLLOW_rule__Does__Group__1__Impl_in_rule__Does__Group__16143);
            rule__Does__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__2_in_rule__Does__Group__16146);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2986:1: rule__Does__Group__1__Impl : ( '(' ) ;
    public final void rule__Does__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2990:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2991:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2991:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:2992:1: '('
            {
             before(grammarAccess.getDoesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Does__Group__1__Impl6174); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3005:1: rule__Does__Group__2 : rule__Does__Group__2__Impl rule__Does__Group__3 ;
    public final void rule__Does__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3009:1: ( rule__Does__Group__2__Impl rule__Does__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3010:2: rule__Does__Group__2__Impl rule__Does__Group__3
            {
            pushFollow(FOLLOW_rule__Does__Group__2__Impl_in_rule__Does__Group__26205);
            rule__Does__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__3_in_rule__Does__Group__26208);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3017:1: rule__Does__Group__2__Impl : ( ( rule__Does__SourceAssignment_2 ) ) ;
    public final void rule__Does__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3021:1: ( ( ( rule__Does__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3022:1: ( ( rule__Does__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3022:1: ( ( rule__Does__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3023:1: ( rule__Does__SourceAssignment_2 )
            {
             before(grammarAccess.getDoesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3024:1: ( rule__Does__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3024:2: rule__Does__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Does__SourceAssignment_2_in_rule__Does__Group__2__Impl6235);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3034:1: rule__Does__Group__3 : rule__Does__Group__3__Impl rule__Does__Group__4 ;
    public final void rule__Does__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3038:1: ( rule__Does__Group__3__Impl rule__Does__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3039:2: rule__Does__Group__3__Impl rule__Does__Group__4
            {
            pushFollow(FOLLOW_rule__Does__Group__3__Impl_in_rule__Does__Group__36265);
            rule__Does__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__4_in_rule__Does__Group__36268);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3046:1: rule__Does__Group__3__Impl : ( ',' ) ;
    public final void rule__Does__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3050:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3051:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3051:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3052:1: ','
            {
             before(grammarAccess.getDoesAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Does__Group__3__Impl6296); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3065:1: rule__Does__Group__4 : rule__Does__Group__4__Impl rule__Does__Group__5 ;
    public final void rule__Does__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3069:1: ( rule__Does__Group__4__Impl rule__Does__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3070:2: rule__Does__Group__4__Impl rule__Does__Group__5
            {
            pushFollow(FOLLOW_rule__Does__Group__4__Impl_in_rule__Does__Group__46327);
            rule__Does__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__5_in_rule__Does__Group__46330);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3077:1: rule__Does__Group__4__Impl : ( ( rule__Does__TargetAssignment_4 ) ) ;
    public final void rule__Does__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3081:1: ( ( ( rule__Does__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3082:1: ( ( rule__Does__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3082:1: ( ( rule__Does__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3083:1: ( rule__Does__TargetAssignment_4 )
            {
             before(grammarAccess.getDoesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3084:1: ( rule__Does__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3084:2: rule__Does__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Does__TargetAssignment_4_in_rule__Does__Group__4__Impl6357);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3094:1: rule__Does__Group__5 : rule__Does__Group__5__Impl ;
    public final void rule__Does__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3098:1: ( rule__Does__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3099:2: rule__Does__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Does__Group__5__Impl_in_rule__Does__Group__56387);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3105:1: rule__Does__Group__5__Impl : ( ')' ) ;
    public final void rule__Does__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3109:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3110:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3110:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3111:1: ')'
            {
             before(grammarAccess.getDoesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Does__Group__5__Impl6415); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3136:1: rule__Decomposes__Group__0 : rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1 ;
    public final void rule__Decomposes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3140:1: ( rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3141:2: rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__0__Impl_in_rule__Decomposes__Group__06458);
            rule__Decomposes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__1_in_rule__Decomposes__Group__06461);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3148:1: rule__Decomposes__Group__0__Impl : ( ( rule__Decomposes__TypeAssignment_0 ) ) ;
    public final void rule__Decomposes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3152:1: ( ( ( rule__Decomposes__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3153:1: ( ( rule__Decomposes__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3153:1: ( ( rule__Decomposes__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3154:1: ( rule__Decomposes__TypeAssignment_0 )
            {
             before(grammarAccess.getDecomposesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3155:1: ( rule__Decomposes__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3155:2: rule__Decomposes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Decomposes__TypeAssignment_0_in_rule__Decomposes__Group__0__Impl6488);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3165:1: rule__Decomposes__Group__1 : rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2 ;
    public final void rule__Decomposes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3169:1: ( rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3170:2: rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__1__Impl_in_rule__Decomposes__Group__16518);
            rule__Decomposes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__2_in_rule__Decomposes__Group__16521);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3177:1: rule__Decomposes__Group__1__Impl : ( '(' ) ;
    public final void rule__Decomposes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3181:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3182:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3182:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3183:1: '('
            {
             before(grammarAccess.getDecomposesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Decomposes__Group__1__Impl6549); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3196:1: rule__Decomposes__Group__2 : rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3 ;
    public final void rule__Decomposes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3200:1: ( rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3201:2: rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__2__Impl_in_rule__Decomposes__Group__26580);
            rule__Decomposes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__3_in_rule__Decomposes__Group__26583);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3208:1: rule__Decomposes__Group__2__Impl : ( ( rule__Decomposes__SourceAssignment_2 ) ) ;
    public final void rule__Decomposes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3212:1: ( ( ( rule__Decomposes__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3213:1: ( ( rule__Decomposes__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3213:1: ( ( rule__Decomposes__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3214:1: ( rule__Decomposes__SourceAssignment_2 )
            {
             before(grammarAccess.getDecomposesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3215:1: ( rule__Decomposes__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3215:2: rule__Decomposes__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Decomposes__SourceAssignment_2_in_rule__Decomposes__Group__2__Impl6610);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3225:1: rule__Decomposes__Group__3 : rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4 ;
    public final void rule__Decomposes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3229:1: ( rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3230:2: rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__3__Impl_in_rule__Decomposes__Group__36640);
            rule__Decomposes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__4_in_rule__Decomposes__Group__36643);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3237:1: rule__Decomposes__Group__3__Impl : ( ',' ) ;
    public final void rule__Decomposes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3241:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3242:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3242:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3243:1: ','
            {
             before(grammarAccess.getDecomposesAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Decomposes__Group__3__Impl6671); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3256:1: rule__Decomposes__Group__4 : rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5 ;
    public final void rule__Decomposes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3260:1: ( rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3261:2: rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__4__Impl_in_rule__Decomposes__Group__46702);
            rule__Decomposes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__5_in_rule__Decomposes__Group__46705);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3268:1: rule__Decomposes__Group__4__Impl : ( ( rule__Decomposes__TargetAssignment_4 ) ) ;
    public final void rule__Decomposes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3272:1: ( ( ( rule__Decomposes__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3273:1: ( ( rule__Decomposes__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3273:1: ( ( rule__Decomposes__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3274:1: ( rule__Decomposes__TargetAssignment_4 )
            {
             before(grammarAccess.getDecomposesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3275:1: ( rule__Decomposes__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3275:2: rule__Decomposes__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Decomposes__TargetAssignment_4_in_rule__Decomposes__Group__4__Impl6732);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3285:1: rule__Decomposes__Group__5 : rule__Decomposes__Group__5__Impl ;
    public final void rule__Decomposes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3289:1: ( rule__Decomposes__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3290:2: rule__Decomposes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__5__Impl_in_rule__Decomposes__Group__56762);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3296:1: rule__Decomposes__Group__5__Impl : ( ')' ) ;
    public final void rule__Decomposes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3300:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3301:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3301:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3302:1: ')'
            {
             before(grammarAccess.getDecomposesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Decomposes__Group__5__Impl6790); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3327:1: rule__Trusts__Group__0 : rule__Trusts__Group__0__Impl rule__Trusts__Group__1 ;
    public final void rule__Trusts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3331:1: ( rule__Trusts__Group__0__Impl rule__Trusts__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3332:2: rule__Trusts__Group__0__Impl rule__Trusts__Group__1
            {
            pushFollow(FOLLOW_rule__Trusts__Group__0__Impl_in_rule__Trusts__Group__06833);
            rule__Trusts__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__1_in_rule__Trusts__Group__06836);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3339:1: rule__Trusts__Group__0__Impl : ( ( rule__Trusts__TypeAssignment_0 ) ) ;
    public final void rule__Trusts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3343:1: ( ( ( rule__Trusts__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3344:1: ( ( rule__Trusts__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3344:1: ( ( rule__Trusts__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3345:1: ( rule__Trusts__TypeAssignment_0 )
            {
             before(grammarAccess.getTrustsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3346:1: ( rule__Trusts__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3346:2: rule__Trusts__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Trusts__TypeAssignment_0_in_rule__Trusts__Group__0__Impl6863);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3356:1: rule__Trusts__Group__1 : rule__Trusts__Group__1__Impl rule__Trusts__Group__2 ;
    public final void rule__Trusts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3360:1: ( rule__Trusts__Group__1__Impl rule__Trusts__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3361:2: rule__Trusts__Group__1__Impl rule__Trusts__Group__2
            {
            pushFollow(FOLLOW_rule__Trusts__Group__1__Impl_in_rule__Trusts__Group__16893);
            rule__Trusts__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__2_in_rule__Trusts__Group__16896);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3368:1: rule__Trusts__Group__1__Impl : ( '(' ) ;
    public final void rule__Trusts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3372:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3373:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3373:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3374:1: '('
            {
             before(grammarAccess.getTrustsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Trusts__Group__1__Impl6924); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3387:1: rule__Trusts__Group__2 : rule__Trusts__Group__2__Impl rule__Trusts__Group__3 ;
    public final void rule__Trusts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3391:1: ( rule__Trusts__Group__2__Impl rule__Trusts__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3392:2: rule__Trusts__Group__2__Impl rule__Trusts__Group__3
            {
            pushFollow(FOLLOW_rule__Trusts__Group__2__Impl_in_rule__Trusts__Group__26955);
            rule__Trusts__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__3_in_rule__Trusts__Group__26958);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3399:1: rule__Trusts__Group__2__Impl : ( ( rule__Trusts__SourceAssignment_2 ) ) ;
    public final void rule__Trusts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3403:1: ( ( ( rule__Trusts__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3404:1: ( ( rule__Trusts__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3404:1: ( ( rule__Trusts__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3405:1: ( rule__Trusts__SourceAssignment_2 )
            {
             before(grammarAccess.getTrustsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3406:1: ( rule__Trusts__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3406:2: rule__Trusts__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Trusts__SourceAssignment_2_in_rule__Trusts__Group__2__Impl6985);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3416:1: rule__Trusts__Group__3 : rule__Trusts__Group__3__Impl rule__Trusts__Group__4 ;
    public final void rule__Trusts__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3420:1: ( rule__Trusts__Group__3__Impl rule__Trusts__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3421:2: rule__Trusts__Group__3__Impl rule__Trusts__Group__4
            {
            pushFollow(FOLLOW_rule__Trusts__Group__3__Impl_in_rule__Trusts__Group__37015);
            rule__Trusts__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__4_in_rule__Trusts__Group__37018);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3428:1: rule__Trusts__Group__3__Impl : ( ',' ) ;
    public final void rule__Trusts__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3432:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3433:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3433:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3434:1: ','
            {
             before(grammarAccess.getTrustsAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Trusts__Group__3__Impl7046); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3447:1: rule__Trusts__Group__4 : rule__Trusts__Group__4__Impl rule__Trusts__Group__5 ;
    public final void rule__Trusts__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3451:1: ( rule__Trusts__Group__4__Impl rule__Trusts__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3452:2: rule__Trusts__Group__4__Impl rule__Trusts__Group__5
            {
            pushFollow(FOLLOW_rule__Trusts__Group__4__Impl_in_rule__Trusts__Group__47077);
            rule__Trusts__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__5_in_rule__Trusts__Group__47080);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3459:1: rule__Trusts__Group__4__Impl : ( ( rule__Trusts__TargetAssignment_4 ) ) ;
    public final void rule__Trusts__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3463:1: ( ( ( rule__Trusts__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3464:1: ( ( rule__Trusts__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3464:1: ( ( rule__Trusts__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3465:1: ( rule__Trusts__TargetAssignment_4 )
            {
             before(grammarAccess.getTrustsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3466:1: ( rule__Trusts__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3466:2: rule__Trusts__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Trusts__TargetAssignment_4_in_rule__Trusts__Group__4__Impl7107);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3476:1: rule__Trusts__Group__5 : rule__Trusts__Group__5__Impl ;
    public final void rule__Trusts__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3480:1: ( rule__Trusts__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3481:2: rule__Trusts__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Trusts__Group__5__Impl_in_rule__Trusts__Group__57137);
            rule__Trusts__Group__5__Impl();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3487:1: rule__Trusts__Group__5__Impl : ( ')' ) ;
    public final void rule__Trusts__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3491:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3492:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3492:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3493:1: ')'
            {
             before(grammarAccess.getTrustsAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Trusts__Group__5__Impl7165); 
             after(grammarAccess.getTrustsAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Delegates__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3518:1: rule__Delegates__Group__0 : rule__Delegates__Group__0__Impl rule__Delegates__Group__1 ;
    public final void rule__Delegates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3522:1: ( rule__Delegates__Group__0__Impl rule__Delegates__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3523:2: rule__Delegates__Group__0__Impl rule__Delegates__Group__1
            {
            pushFollow(FOLLOW_rule__Delegates__Group__0__Impl_in_rule__Delegates__Group__07208);
            rule__Delegates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__1_in_rule__Delegates__Group__07211);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3530:1: rule__Delegates__Group__0__Impl : ( ( rule__Delegates__TypeAssignment_0 ) ) ;
    public final void rule__Delegates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3534:1: ( ( ( rule__Delegates__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3535:1: ( ( rule__Delegates__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3535:1: ( ( rule__Delegates__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3536:1: ( rule__Delegates__TypeAssignment_0 )
            {
             before(grammarAccess.getDelegatesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3537:1: ( rule__Delegates__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3537:2: rule__Delegates__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Delegates__TypeAssignment_0_in_rule__Delegates__Group__0__Impl7238);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3547:1: rule__Delegates__Group__1 : rule__Delegates__Group__1__Impl rule__Delegates__Group__2 ;
    public final void rule__Delegates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3551:1: ( rule__Delegates__Group__1__Impl rule__Delegates__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3552:2: rule__Delegates__Group__1__Impl rule__Delegates__Group__2
            {
            pushFollow(FOLLOW_rule__Delegates__Group__1__Impl_in_rule__Delegates__Group__17268);
            rule__Delegates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__2_in_rule__Delegates__Group__17271);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3559:1: rule__Delegates__Group__1__Impl : ( '(' ) ;
    public final void rule__Delegates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3563:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3564:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3564:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3565:1: '('
            {
             before(grammarAccess.getDelegatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Delegates__Group__1__Impl7299); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3578:1: rule__Delegates__Group__2 : rule__Delegates__Group__2__Impl rule__Delegates__Group__3 ;
    public final void rule__Delegates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3582:1: ( rule__Delegates__Group__2__Impl rule__Delegates__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3583:2: rule__Delegates__Group__2__Impl rule__Delegates__Group__3
            {
            pushFollow(FOLLOW_rule__Delegates__Group__2__Impl_in_rule__Delegates__Group__27330);
            rule__Delegates__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__3_in_rule__Delegates__Group__27333);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3590:1: rule__Delegates__Group__2__Impl : ( ( rule__Delegates__SourceAssignment_2 ) ) ;
    public final void rule__Delegates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3594:1: ( ( ( rule__Delegates__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3595:1: ( ( rule__Delegates__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3595:1: ( ( rule__Delegates__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3596:1: ( rule__Delegates__SourceAssignment_2 )
            {
             before(grammarAccess.getDelegatesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3597:1: ( rule__Delegates__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3597:2: rule__Delegates__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Delegates__SourceAssignment_2_in_rule__Delegates__Group__2__Impl7360);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3607:1: rule__Delegates__Group__3 : rule__Delegates__Group__3__Impl rule__Delegates__Group__4 ;
    public final void rule__Delegates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3611:1: ( rule__Delegates__Group__3__Impl rule__Delegates__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3612:2: rule__Delegates__Group__3__Impl rule__Delegates__Group__4
            {
            pushFollow(FOLLOW_rule__Delegates__Group__3__Impl_in_rule__Delegates__Group__37390);
            rule__Delegates__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__4_in_rule__Delegates__Group__37393);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3619:1: rule__Delegates__Group__3__Impl : ( ',' ) ;
    public final void rule__Delegates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3623:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3624:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3624:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3625:1: ','
            {
             before(grammarAccess.getDelegatesAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Delegates__Group__3__Impl7421); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3638:1: rule__Delegates__Group__4 : rule__Delegates__Group__4__Impl rule__Delegates__Group__5 ;
    public final void rule__Delegates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3642:1: ( rule__Delegates__Group__4__Impl rule__Delegates__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3643:2: rule__Delegates__Group__4__Impl rule__Delegates__Group__5
            {
            pushFollow(FOLLOW_rule__Delegates__Group__4__Impl_in_rule__Delegates__Group__47452);
            rule__Delegates__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__5_in_rule__Delegates__Group__47455);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3650:1: rule__Delegates__Group__4__Impl : ( ( rule__Delegates__TargetAssignment_4 ) ) ;
    public final void rule__Delegates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3654:1: ( ( ( rule__Delegates__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3655:1: ( ( rule__Delegates__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3655:1: ( ( rule__Delegates__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3656:1: ( rule__Delegates__TargetAssignment_4 )
            {
             before(grammarAccess.getDelegatesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3657:1: ( rule__Delegates__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3657:2: rule__Delegates__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Delegates__TargetAssignment_4_in_rule__Delegates__Group__4__Impl7482);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3667:1: rule__Delegates__Group__5 : rule__Delegates__Group__5__Impl ;
    public final void rule__Delegates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3671:1: ( rule__Delegates__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3672:2: rule__Delegates__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Delegates__Group__5__Impl_in_rule__Delegates__Group__57512);
            rule__Delegates__Group__5__Impl();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3678:1: rule__Delegates__Group__5__Impl : ( ')' ) ;
    public final void rule__Delegates__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3682:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3683:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3683:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3684:1: ')'
            {
             before(grammarAccess.getDelegatesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Delegates__Group__5__Impl7540); 
             after(grammarAccess.getDelegatesAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Contributes__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3709:1: rule__Contributes__Group__0 : rule__Contributes__Group__0__Impl rule__Contributes__Group__1 ;
    public final void rule__Contributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3713:1: ( rule__Contributes__Group__0__Impl rule__Contributes__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3714:2: rule__Contributes__Group__0__Impl rule__Contributes__Group__1
            {
            pushFollow(FOLLOW_rule__Contributes__Group__0__Impl_in_rule__Contributes__Group__07583);
            rule__Contributes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__1_in_rule__Contributes__Group__07586);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3721:1: rule__Contributes__Group__0__Impl : ( ( rule__Contributes__TypeAssignment_0 ) ) ;
    public final void rule__Contributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3725:1: ( ( ( rule__Contributes__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3726:1: ( ( rule__Contributes__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3726:1: ( ( rule__Contributes__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3727:1: ( rule__Contributes__TypeAssignment_0 )
            {
             before(grammarAccess.getContributesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3728:1: ( rule__Contributes__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3728:2: rule__Contributes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Contributes__TypeAssignment_0_in_rule__Contributes__Group__0__Impl7613);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3738:1: rule__Contributes__Group__1 : rule__Contributes__Group__1__Impl rule__Contributes__Group__2 ;
    public final void rule__Contributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3742:1: ( rule__Contributes__Group__1__Impl rule__Contributes__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3743:2: rule__Contributes__Group__1__Impl rule__Contributes__Group__2
            {
            pushFollow(FOLLOW_rule__Contributes__Group__1__Impl_in_rule__Contributes__Group__17643);
            rule__Contributes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__2_in_rule__Contributes__Group__17646);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3750:1: rule__Contributes__Group__1__Impl : ( '(' ) ;
    public final void rule__Contributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3754:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3755:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3755:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3756:1: '('
            {
             before(grammarAccess.getContributesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Contributes__Group__1__Impl7674); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3769:1: rule__Contributes__Group__2 : rule__Contributes__Group__2__Impl rule__Contributes__Group__3 ;
    public final void rule__Contributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3773:1: ( rule__Contributes__Group__2__Impl rule__Contributes__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3774:2: rule__Contributes__Group__2__Impl rule__Contributes__Group__3
            {
            pushFollow(FOLLOW_rule__Contributes__Group__2__Impl_in_rule__Contributes__Group__27705);
            rule__Contributes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__3_in_rule__Contributes__Group__27708);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3781:1: rule__Contributes__Group__2__Impl : ( ( rule__Contributes__SourceAssignment_2 ) ) ;
    public final void rule__Contributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3785:1: ( ( ( rule__Contributes__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3786:1: ( ( rule__Contributes__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3786:1: ( ( rule__Contributes__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3787:1: ( rule__Contributes__SourceAssignment_2 )
            {
             before(grammarAccess.getContributesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3788:1: ( rule__Contributes__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3788:2: rule__Contributes__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Contributes__SourceAssignment_2_in_rule__Contributes__Group__2__Impl7735);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3798:1: rule__Contributes__Group__3 : rule__Contributes__Group__3__Impl rule__Contributes__Group__4 ;
    public final void rule__Contributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3802:1: ( rule__Contributes__Group__3__Impl rule__Contributes__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3803:2: rule__Contributes__Group__3__Impl rule__Contributes__Group__4
            {
            pushFollow(FOLLOW_rule__Contributes__Group__3__Impl_in_rule__Contributes__Group__37765);
            rule__Contributes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__4_in_rule__Contributes__Group__37768);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3810:1: rule__Contributes__Group__3__Impl : ( ',' ) ;
    public final void rule__Contributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3814:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3815:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3815:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3816:1: ','
            {
             before(grammarAccess.getContributesAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Contributes__Group__3__Impl7796); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3829:1: rule__Contributes__Group__4 : rule__Contributes__Group__4__Impl rule__Contributes__Group__5 ;
    public final void rule__Contributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3833:1: ( rule__Contributes__Group__4__Impl rule__Contributes__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3834:2: rule__Contributes__Group__4__Impl rule__Contributes__Group__5
            {
            pushFollow(FOLLOW_rule__Contributes__Group__4__Impl_in_rule__Contributes__Group__47827);
            rule__Contributes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__5_in_rule__Contributes__Group__47830);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3841:1: rule__Contributes__Group__4__Impl : ( ( rule__Contributes__TargetAssignment_4 ) ) ;
    public final void rule__Contributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3845:1: ( ( ( rule__Contributes__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3846:1: ( ( rule__Contributes__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3846:1: ( ( rule__Contributes__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3847:1: ( rule__Contributes__TargetAssignment_4 )
            {
             before(grammarAccess.getContributesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3848:1: ( rule__Contributes__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3848:2: rule__Contributes__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Contributes__TargetAssignment_4_in_rule__Contributes__Group__4__Impl7857);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3858:1: rule__Contributes__Group__5 : rule__Contributes__Group__5__Impl ;
    public final void rule__Contributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3862:1: ( rule__Contributes__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3863:2: rule__Contributes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Contributes__Group__5__Impl_in_rule__Contributes__Group__57887);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3869:1: rule__Contributes__Group__5__Impl : ( ')' ) ;
    public final void rule__Contributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3873:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3874:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3874:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3875:1: ')'
            {
             before(grammarAccess.getContributesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Contributes__Group__5__Impl7915); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3900:1: rule__Fulfils__Group__0 : rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1 ;
    public final void rule__Fulfils__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3904:1: ( rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3905:2: rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__0__Impl_in_rule__Fulfils__Group__07958);
            rule__Fulfils__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__1_in_rule__Fulfils__Group__07961);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3912:1: rule__Fulfils__Group__0__Impl : ( ( rule__Fulfils__TypeAssignment_0 ) ) ;
    public final void rule__Fulfils__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3916:1: ( ( ( rule__Fulfils__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3917:1: ( ( rule__Fulfils__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3917:1: ( ( rule__Fulfils__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3918:1: ( rule__Fulfils__TypeAssignment_0 )
            {
             before(grammarAccess.getFulfilsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3919:1: ( rule__Fulfils__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3919:2: rule__Fulfils__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Fulfils__TypeAssignment_0_in_rule__Fulfils__Group__0__Impl7988);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3929:1: rule__Fulfils__Group__1 : rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2 ;
    public final void rule__Fulfils__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3933:1: ( rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3934:2: rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__1__Impl_in_rule__Fulfils__Group__18018);
            rule__Fulfils__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__2_in_rule__Fulfils__Group__18021);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3941:1: rule__Fulfils__Group__1__Impl : ( '(' ) ;
    public final void rule__Fulfils__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3945:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3946:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3946:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3947:1: '('
            {
             before(grammarAccess.getFulfilsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Fulfils__Group__1__Impl8049); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3960:1: rule__Fulfils__Group__2 : rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3 ;
    public final void rule__Fulfils__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3964:1: ( rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3965:2: rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__2__Impl_in_rule__Fulfils__Group__28080);
            rule__Fulfils__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__3_in_rule__Fulfils__Group__28083);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3972:1: rule__Fulfils__Group__2__Impl : ( ( rule__Fulfils__SourceAssignment_2 ) ) ;
    public final void rule__Fulfils__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3976:1: ( ( ( rule__Fulfils__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3977:1: ( ( rule__Fulfils__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3977:1: ( ( rule__Fulfils__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3978:1: ( rule__Fulfils__SourceAssignment_2 )
            {
             before(grammarAccess.getFulfilsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3979:1: ( rule__Fulfils__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3979:2: rule__Fulfils__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Fulfils__SourceAssignment_2_in_rule__Fulfils__Group__2__Impl8110);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3989:1: rule__Fulfils__Group__3 : rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4 ;
    public final void rule__Fulfils__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3993:1: ( rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:3994:2: rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__3__Impl_in_rule__Fulfils__Group__38140);
            rule__Fulfils__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__4_in_rule__Fulfils__Group__38143);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4001:1: rule__Fulfils__Group__3__Impl : ( ',' ) ;
    public final void rule__Fulfils__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4005:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4006:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4006:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4007:1: ','
            {
             before(grammarAccess.getFulfilsAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Fulfils__Group__3__Impl8171); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4020:1: rule__Fulfils__Group__4 : rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5 ;
    public final void rule__Fulfils__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4024:1: ( rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4025:2: rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__4__Impl_in_rule__Fulfils__Group__48202);
            rule__Fulfils__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__5_in_rule__Fulfils__Group__48205);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4032:1: rule__Fulfils__Group__4__Impl : ( ( rule__Fulfils__TargetAssignment_4 ) ) ;
    public final void rule__Fulfils__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4036:1: ( ( ( rule__Fulfils__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4037:1: ( ( rule__Fulfils__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4037:1: ( ( rule__Fulfils__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4038:1: ( rule__Fulfils__TargetAssignment_4 )
            {
             before(grammarAccess.getFulfilsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4039:1: ( rule__Fulfils__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4039:2: rule__Fulfils__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Fulfils__TargetAssignment_4_in_rule__Fulfils__Group__4__Impl8232);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4049:1: rule__Fulfils__Group__5 : rule__Fulfils__Group__5__Impl ;
    public final void rule__Fulfils__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4053:1: ( rule__Fulfils__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4054:2: rule__Fulfils__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__5__Impl_in_rule__Fulfils__Group__58262);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4060:1: rule__Fulfils__Group__5__Impl : ( ')' ) ;
    public final void rule__Fulfils__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4064:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4065:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4065:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4066:1: ')'
            {
             before(grammarAccess.getFulfilsAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Fulfils__Group__5__Impl8290); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4091:1: rule__Provides__Group__0 : rule__Provides__Group__0__Impl rule__Provides__Group__1 ;
    public final void rule__Provides__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4095:1: ( rule__Provides__Group__0__Impl rule__Provides__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4096:2: rule__Provides__Group__0__Impl rule__Provides__Group__1
            {
            pushFollow(FOLLOW_rule__Provides__Group__0__Impl_in_rule__Provides__Group__08333);
            rule__Provides__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__1_in_rule__Provides__Group__08336);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4103:1: rule__Provides__Group__0__Impl : ( ( rule__Provides__TypeAssignment_0 ) ) ;
    public final void rule__Provides__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4107:1: ( ( ( rule__Provides__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4108:1: ( ( rule__Provides__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4108:1: ( ( rule__Provides__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4109:1: ( rule__Provides__TypeAssignment_0 )
            {
             before(grammarAccess.getProvidesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4110:1: ( rule__Provides__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4110:2: rule__Provides__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Provides__TypeAssignment_0_in_rule__Provides__Group__0__Impl8363);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4120:1: rule__Provides__Group__1 : rule__Provides__Group__1__Impl rule__Provides__Group__2 ;
    public final void rule__Provides__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4124:1: ( rule__Provides__Group__1__Impl rule__Provides__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4125:2: rule__Provides__Group__1__Impl rule__Provides__Group__2
            {
            pushFollow(FOLLOW_rule__Provides__Group__1__Impl_in_rule__Provides__Group__18393);
            rule__Provides__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__2_in_rule__Provides__Group__18396);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4132:1: rule__Provides__Group__1__Impl : ( '(' ) ;
    public final void rule__Provides__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4136:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4137:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4137:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4138:1: '('
            {
             before(grammarAccess.getProvidesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Provides__Group__1__Impl8424); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4151:1: rule__Provides__Group__2 : rule__Provides__Group__2__Impl rule__Provides__Group__3 ;
    public final void rule__Provides__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4155:1: ( rule__Provides__Group__2__Impl rule__Provides__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4156:2: rule__Provides__Group__2__Impl rule__Provides__Group__3
            {
            pushFollow(FOLLOW_rule__Provides__Group__2__Impl_in_rule__Provides__Group__28455);
            rule__Provides__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__3_in_rule__Provides__Group__28458);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4163:1: rule__Provides__Group__2__Impl : ( ( rule__Provides__SourceAssignment_2 ) ) ;
    public final void rule__Provides__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4167:1: ( ( ( rule__Provides__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4168:1: ( ( rule__Provides__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4168:1: ( ( rule__Provides__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4169:1: ( rule__Provides__SourceAssignment_2 )
            {
             before(grammarAccess.getProvidesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4170:1: ( rule__Provides__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4170:2: rule__Provides__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Provides__SourceAssignment_2_in_rule__Provides__Group__2__Impl8485);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4180:1: rule__Provides__Group__3 : rule__Provides__Group__3__Impl rule__Provides__Group__4 ;
    public final void rule__Provides__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4184:1: ( rule__Provides__Group__3__Impl rule__Provides__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4185:2: rule__Provides__Group__3__Impl rule__Provides__Group__4
            {
            pushFollow(FOLLOW_rule__Provides__Group__3__Impl_in_rule__Provides__Group__38515);
            rule__Provides__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__4_in_rule__Provides__Group__38518);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4192:1: rule__Provides__Group__3__Impl : ( ',' ) ;
    public final void rule__Provides__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4196:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4197:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4197:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4198:1: ','
            {
             before(grammarAccess.getProvidesAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Provides__Group__3__Impl8546); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4211:1: rule__Provides__Group__4 : rule__Provides__Group__4__Impl rule__Provides__Group__5 ;
    public final void rule__Provides__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4215:1: ( rule__Provides__Group__4__Impl rule__Provides__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4216:2: rule__Provides__Group__4__Impl rule__Provides__Group__5
            {
            pushFollow(FOLLOW_rule__Provides__Group__4__Impl_in_rule__Provides__Group__48577);
            rule__Provides__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__5_in_rule__Provides__Group__48580);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4223:1: rule__Provides__Group__4__Impl : ( ( rule__Provides__TargetAssignment_4 ) ) ;
    public final void rule__Provides__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4227:1: ( ( ( rule__Provides__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4228:1: ( ( rule__Provides__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4228:1: ( ( rule__Provides__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4229:1: ( rule__Provides__TargetAssignment_4 )
            {
             before(grammarAccess.getProvidesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4230:1: ( rule__Provides__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4230:2: rule__Provides__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Provides__TargetAssignment_4_in_rule__Provides__Group__4__Impl8607);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4240:1: rule__Provides__Group__5 : rule__Provides__Group__5__Impl ;
    public final void rule__Provides__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4244:1: ( rule__Provides__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4245:2: rule__Provides__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Provides__Group__5__Impl_in_rule__Provides__Group__58637);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4251:1: rule__Provides__Group__5__Impl : ( ')' ) ;
    public final void rule__Provides__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4255:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4256:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4256:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4257:1: ')'
            {
             before(grammarAccess.getProvidesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Provides__Group__5__Impl8665); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4282:1: rule__Consumes__Group__0 : rule__Consumes__Group__0__Impl rule__Consumes__Group__1 ;
    public final void rule__Consumes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4286:1: ( rule__Consumes__Group__0__Impl rule__Consumes__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4287:2: rule__Consumes__Group__0__Impl rule__Consumes__Group__1
            {
            pushFollow(FOLLOW_rule__Consumes__Group__0__Impl_in_rule__Consumes__Group__08708);
            rule__Consumes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__1_in_rule__Consumes__Group__08711);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4294:1: rule__Consumes__Group__0__Impl : ( ( rule__Consumes__TypeAssignment_0 ) ) ;
    public final void rule__Consumes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4298:1: ( ( ( rule__Consumes__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4299:1: ( ( rule__Consumes__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4299:1: ( ( rule__Consumes__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4300:1: ( rule__Consumes__TypeAssignment_0 )
            {
             before(grammarAccess.getConsumesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4301:1: ( rule__Consumes__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4301:2: rule__Consumes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Consumes__TypeAssignment_0_in_rule__Consumes__Group__0__Impl8738);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4311:1: rule__Consumes__Group__1 : rule__Consumes__Group__1__Impl rule__Consumes__Group__2 ;
    public final void rule__Consumes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4315:1: ( rule__Consumes__Group__1__Impl rule__Consumes__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4316:2: rule__Consumes__Group__1__Impl rule__Consumes__Group__2
            {
            pushFollow(FOLLOW_rule__Consumes__Group__1__Impl_in_rule__Consumes__Group__18768);
            rule__Consumes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__2_in_rule__Consumes__Group__18771);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4323:1: rule__Consumes__Group__1__Impl : ( '(' ) ;
    public final void rule__Consumes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4327:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4328:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4328:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4329:1: '('
            {
             before(grammarAccess.getConsumesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Consumes__Group__1__Impl8799); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4342:1: rule__Consumes__Group__2 : rule__Consumes__Group__2__Impl rule__Consumes__Group__3 ;
    public final void rule__Consumes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4346:1: ( rule__Consumes__Group__2__Impl rule__Consumes__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4347:2: rule__Consumes__Group__2__Impl rule__Consumes__Group__3
            {
            pushFollow(FOLLOW_rule__Consumes__Group__2__Impl_in_rule__Consumes__Group__28830);
            rule__Consumes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__3_in_rule__Consumes__Group__28833);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4354:1: rule__Consumes__Group__2__Impl : ( ( rule__Consumes__SourceAssignment_2 ) ) ;
    public final void rule__Consumes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4358:1: ( ( ( rule__Consumes__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4359:1: ( ( rule__Consumes__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4359:1: ( ( rule__Consumes__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4360:1: ( rule__Consumes__SourceAssignment_2 )
            {
             before(grammarAccess.getConsumesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4361:1: ( rule__Consumes__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4361:2: rule__Consumes__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Consumes__SourceAssignment_2_in_rule__Consumes__Group__2__Impl8860);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4371:1: rule__Consumes__Group__3 : rule__Consumes__Group__3__Impl rule__Consumes__Group__4 ;
    public final void rule__Consumes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4375:1: ( rule__Consumes__Group__3__Impl rule__Consumes__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4376:2: rule__Consumes__Group__3__Impl rule__Consumes__Group__4
            {
            pushFollow(FOLLOW_rule__Consumes__Group__3__Impl_in_rule__Consumes__Group__38890);
            rule__Consumes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__4_in_rule__Consumes__Group__38893);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4383:1: rule__Consumes__Group__3__Impl : ( ',' ) ;
    public final void rule__Consumes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4387:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4388:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4388:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4389:1: ','
            {
             before(grammarAccess.getConsumesAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Consumes__Group__3__Impl8921); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4402:1: rule__Consumes__Group__4 : rule__Consumes__Group__4__Impl rule__Consumes__Group__5 ;
    public final void rule__Consumes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4406:1: ( rule__Consumes__Group__4__Impl rule__Consumes__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4407:2: rule__Consumes__Group__4__Impl rule__Consumes__Group__5
            {
            pushFollow(FOLLOW_rule__Consumes__Group__4__Impl_in_rule__Consumes__Group__48952);
            rule__Consumes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__5_in_rule__Consumes__Group__48955);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4414:1: rule__Consumes__Group__4__Impl : ( ( rule__Consumes__TargetAssignment_4 ) ) ;
    public final void rule__Consumes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4418:1: ( ( ( rule__Consumes__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4419:1: ( ( rule__Consumes__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4419:1: ( ( rule__Consumes__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4420:1: ( rule__Consumes__TargetAssignment_4 )
            {
             before(grammarAccess.getConsumesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4421:1: ( rule__Consumes__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4421:2: rule__Consumes__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Consumes__TargetAssignment_4_in_rule__Consumes__Group__4__Impl8982);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4431:1: rule__Consumes__Group__5 : rule__Consumes__Group__5__Impl ;
    public final void rule__Consumes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4435:1: ( rule__Consumes__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4436:2: rule__Consumes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Consumes__Group__5__Impl_in_rule__Consumes__Group__59012);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4442:1: rule__Consumes__Group__5__Impl : ( ')' ) ;
    public final void rule__Consumes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4446:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4447:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4447:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4448:1: ')'
            {
             before(grammarAccess.getConsumesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Consumes__Group__5__Impl9040); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4473:1: rule__Exploits__Group__0 : rule__Exploits__Group__0__Impl rule__Exploits__Group__1 ;
    public final void rule__Exploits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4477:1: ( rule__Exploits__Group__0__Impl rule__Exploits__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4478:2: rule__Exploits__Group__0__Impl rule__Exploits__Group__1
            {
            pushFollow(FOLLOW_rule__Exploits__Group__0__Impl_in_rule__Exploits__Group__09083);
            rule__Exploits__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__1_in_rule__Exploits__Group__09086);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4485:1: rule__Exploits__Group__0__Impl : ( ( rule__Exploits__TypeAssignment_0 ) ) ;
    public final void rule__Exploits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4489:1: ( ( ( rule__Exploits__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4490:1: ( ( rule__Exploits__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4490:1: ( ( rule__Exploits__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4491:1: ( rule__Exploits__TypeAssignment_0 )
            {
             before(grammarAccess.getExploitsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4492:1: ( rule__Exploits__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4492:2: rule__Exploits__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Exploits__TypeAssignment_0_in_rule__Exploits__Group__0__Impl9113);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4502:1: rule__Exploits__Group__1 : rule__Exploits__Group__1__Impl rule__Exploits__Group__2 ;
    public final void rule__Exploits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4506:1: ( rule__Exploits__Group__1__Impl rule__Exploits__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4507:2: rule__Exploits__Group__1__Impl rule__Exploits__Group__2
            {
            pushFollow(FOLLOW_rule__Exploits__Group__1__Impl_in_rule__Exploits__Group__19143);
            rule__Exploits__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__2_in_rule__Exploits__Group__19146);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4514:1: rule__Exploits__Group__1__Impl : ( '(' ) ;
    public final void rule__Exploits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4518:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4519:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4519:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4520:1: '('
            {
             before(grammarAccess.getExploitsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Exploits__Group__1__Impl9174); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4533:1: rule__Exploits__Group__2 : rule__Exploits__Group__2__Impl rule__Exploits__Group__3 ;
    public final void rule__Exploits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4537:1: ( rule__Exploits__Group__2__Impl rule__Exploits__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4538:2: rule__Exploits__Group__2__Impl rule__Exploits__Group__3
            {
            pushFollow(FOLLOW_rule__Exploits__Group__2__Impl_in_rule__Exploits__Group__29205);
            rule__Exploits__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__3_in_rule__Exploits__Group__29208);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4545:1: rule__Exploits__Group__2__Impl : ( ( rule__Exploits__SourceAssignment_2 ) ) ;
    public final void rule__Exploits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4549:1: ( ( ( rule__Exploits__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4550:1: ( ( rule__Exploits__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4550:1: ( ( rule__Exploits__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4551:1: ( rule__Exploits__SourceAssignment_2 )
            {
             before(grammarAccess.getExploitsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4552:1: ( rule__Exploits__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4552:2: rule__Exploits__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Exploits__SourceAssignment_2_in_rule__Exploits__Group__2__Impl9235);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4562:1: rule__Exploits__Group__3 : rule__Exploits__Group__3__Impl rule__Exploits__Group__4 ;
    public final void rule__Exploits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4566:1: ( rule__Exploits__Group__3__Impl rule__Exploits__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4567:2: rule__Exploits__Group__3__Impl rule__Exploits__Group__4
            {
            pushFollow(FOLLOW_rule__Exploits__Group__3__Impl_in_rule__Exploits__Group__39265);
            rule__Exploits__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__4_in_rule__Exploits__Group__39268);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4574:1: rule__Exploits__Group__3__Impl : ( ',' ) ;
    public final void rule__Exploits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4578:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4579:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4579:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4580:1: ','
            {
             before(grammarAccess.getExploitsAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Exploits__Group__3__Impl9296); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4593:1: rule__Exploits__Group__4 : rule__Exploits__Group__4__Impl rule__Exploits__Group__5 ;
    public final void rule__Exploits__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4597:1: ( rule__Exploits__Group__4__Impl rule__Exploits__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4598:2: rule__Exploits__Group__4__Impl rule__Exploits__Group__5
            {
            pushFollow(FOLLOW_rule__Exploits__Group__4__Impl_in_rule__Exploits__Group__49327);
            rule__Exploits__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__5_in_rule__Exploits__Group__49330);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4605:1: rule__Exploits__Group__4__Impl : ( ( rule__Exploits__TargetAssignment_4 ) ) ;
    public final void rule__Exploits__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4609:1: ( ( ( rule__Exploits__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4610:1: ( ( rule__Exploits__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4610:1: ( ( rule__Exploits__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4611:1: ( rule__Exploits__TargetAssignment_4 )
            {
             before(grammarAccess.getExploitsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4612:1: ( rule__Exploits__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4612:2: rule__Exploits__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Exploits__TargetAssignment_4_in_rule__Exploits__Group__4__Impl9357);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4622:1: rule__Exploits__Group__5 : rule__Exploits__Group__5__Impl ;
    public final void rule__Exploits__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4626:1: ( rule__Exploits__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4627:2: rule__Exploits__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Exploits__Group__5__Impl_in_rule__Exploits__Group__59387);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4633:1: rule__Exploits__Group__5__Impl : ( ')' ) ;
    public final void rule__Exploits__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4637:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4638:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4638:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4639:1: ')'
            {
             before(grammarAccess.getExploitsAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Exploits__Group__5__Impl9415); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4664:1: rule__Damages__Group__0 : rule__Damages__Group__0__Impl rule__Damages__Group__1 ;
    public final void rule__Damages__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4668:1: ( rule__Damages__Group__0__Impl rule__Damages__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4669:2: rule__Damages__Group__0__Impl rule__Damages__Group__1
            {
            pushFollow(FOLLOW_rule__Damages__Group__0__Impl_in_rule__Damages__Group__09458);
            rule__Damages__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__1_in_rule__Damages__Group__09461);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4676:1: rule__Damages__Group__0__Impl : ( ( rule__Damages__TypeAssignment_0 ) ) ;
    public final void rule__Damages__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4680:1: ( ( ( rule__Damages__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4681:1: ( ( rule__Damages__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4681:1: ( ( rule__Damages__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4682:1: ( rule__Damages__TypeAssignment_0 )
            {
             before(grammarAccess.getDamagesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4683:1: ( rule__Damages__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4683:2: rule__Damages__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Damages__TypeAssignment_0_in_rule__Damages__Group__0__Impl9488);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4693:1: rule__Damages__Group__1 : rule__Damages__Group__1__Impl rule__Damages__Group__2 ;
    public final void rule__Damages__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4697:1: ( rule__Damages__Group__1__Impl rule__Damages__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4698:2: rule__Damages__Group__1__Impl rule__Damages__Group__2
            {
            pushFollow(FOLLOW_rule__Damages__Group__1__Impl_in_rule__Damages__Group__19518);
            rule__Damages__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__2_in_rule__Damages__Group__19521);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4705:1: rule__Damages__Group__1__Impl : ( '(' ) ;
    public final void rule__Damages__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4709:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4710:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4710:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4711:1: '('
            {
             before(grammarAccess.getDamagesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Damages__Group__1__Impl9549); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4724:1: rule__Damages__Group__2 : rule__Damages__Group__2__Impl rule__Damages__Group__3 ;
    public final void rule__Damages__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4728:1: ( rule__Damages__Group__2__Impl rule__Damages__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4729:2: rule__Damages__Group__2__Impl rule__Damages__Group__3
            {
            pushFollow(FOLLOW_rule__Damages__Group__2__Impl_in_rule__Damages__Group__29580);
            rule__Damages__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__3_in_rule__Damages__Group__29583);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4736:1: rule__Damages__Group__2__Impl : ( ( rule__Damages__SourceAssignment_2 ) ) ;
    public final void rule__Damages__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4740:1: ( ( ( rule__Damages__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4741:1: ( ( rule__Damages__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4741:1: ( ( rule__Damages__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4742:1: ( rule__Damages__SourceAssignment_2 )
            {
             before(grammarAccess.getDamagesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4743:1: ( rule__Damages__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4743:2: rule__Damages__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Damages__SourceAssignment_2_in_rule__Damages__Group__2__Impl9610);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4753:1: rule__Damages__Group__3 : rule__Damages__Group__3__Impl rule__Damages__Group__4 ;
    public final void rule__Damages__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4757:1: ( rule__Damages__Group__3__Impl rule__Damages__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4758:2: rule__Damages__Group__3__Impl rule__Damages__Group__4
            {
            pushFollow(FOLLOW_rule__Damages__Group__3__Impl_in_rule__Damages__Group__39640);
            rule__Damages__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__4_in_rule__Damages__Group__39643);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4765:1: rule__Damages__Group__3__Impl : ( ',' ) ;
    public final void rule__Damages__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4769:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4770:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4770:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4771:1: ','
            {
             before(grammarAccess.getDamagesAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Damages__Group__3__Impl9671); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4784:1: rule__Damages__Group__4 : rule__Damages__Group__4__Impl rule__Damages__Group__5 ;
    public final void rule__Damages__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4788:1: ( rule__Damages__Group__4__Impl rule__Damages__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4789:2: rule__Damages__Group__4__Impl rule__Damages__Group__5
            {
            pushFollow(FOLLOW_rule__Damages__Group__4__Impl_in_rule__Damages__Group__49702);
            rule__Damages__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__5_in_rule__Damages__Group__49705);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4796:1: rule__Damages__Group__4__Impl : ( ( rule__Damages__TargetAssignment_4 ) ) ;
    public final void rule__Damages__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4800:1: ( ( ( rule__Damages__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4801:1: ( ( rule__Damages__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4801:1: ( ( rule__Damages__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4802:1: ( rule__Damages__TargetAssignment_4 )
            {
             before(grammarAccess.getDamagesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4803:1: ( rule__Damages__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4803:2: rule__Damages__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Damages__TargetAssignment_4_in_rule__Damages__Group__4__Impl9732);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4813:1: rule__Damages__Group__5 : rule__Damages__Group__5__Impl ;
    public final void rule__Damages__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4817:1: ( rule__Damages__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4818:2: rule__Damages__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Damages__Group__5__Impl_in_rule__Damages__Group__59762);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4824:1: rule__Damages__Group__5__Impl : ( ')' ) ;
    public final void rule__Damages__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4828:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4829:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4829:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4830:1: ')'
            {
             before(grammarAccess.getDamagesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Damages__Group__5__Impl9790); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4855:1: rule__Attacks__Group__0 : rule__Attacks__Group__0__Impl rule__Attacks__Group__1 ;
    public final void rule__Attacks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4859:1: ( rule__Attacks__Group__0__Impl rule__Attacks__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4860:2: rule__Attacks__Group__0__Impl rule__Attacks__Group__1
            {
            pushFollow(FOLLOW_rule__Attacks__Group__0__Impl_in_rule__Attacks__Group__09833);
            rule__Attacks__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__1_in_rule__Attacks__Group__09836);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4867:1: rule__Attacks__Group__0__Impl : ( ( rule__Attacks__TypeAssignment_0 ) ) ;
    public final void rule__Attacks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4871:1: ( ( ( rule__Attacks__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4872:1: ( ( rule__Attacks__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4872:1: ( ( rule__Attacks__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4873:1: ( rule__Attacks__TypeAssignment_0 )
            {
             before(grammarAccess.getAttacksAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4874:1: ( rule__Attacks__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4874:2: rule__Attacks__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attacks__TypeAssignment_0_in_rule__Attacks__Group__0__Impl9863);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4884:1: rule__Attacks__Group__1 : rule__Attacks__Group__1__Impl rule__Attacks__Group__2 ;
    public final void rule__Attacks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4888:1: ( rule__Attacks__Group__1__Impl rule__Attacks__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4889:2: rule__Attacks__Group__1__Impl rule__Attacks__Group__2
            {
            pushFollow(FOLLOW_rule__Attacks__Group__1__Impl_in_rule__Attacks__Group__19893);
            rule__Attacks__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__2_in_rule__Attacks__Group__19896);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4896:1: rule__Attacks__Group__1__Impl : ( '(' ) ;
    public final void rule__Attacks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4900:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4901:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4901:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4902:1: '('
            {
             before(grammarAccess.getAttacksAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Attacks__Group__1__Impl9924); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4915:1: rule__Attacks__Group__2 : rule__Attacks__Group__2__Impl rule__Attacks__Group__3 ;
    public final void rule__Attacks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4919:1: ( rule__Attacks__Group__2__Impl rule__Attacks__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4920:2: rule__Attacks__Group__2__Impl rule__Attacks__Group__3
            {
            pushFollow(FOLLOW_rule__Attacks__Group__2__Impl_in_rule__Attacks__Group__29955);
            rule__Attacks__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__3_in_rule__Attacks__Group__29958);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4927:1: rule__Attacks__Group__2__Impl : ( ( rule__Attacks__SourceAssignment_2 ) ) ;
    public final void rule__Attacks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4931:1: ( ( ( rule__Attacks__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4932:1: ( ( rule__Attacks__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4932:1: ( ( rule__Attacks__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4933:1: ( rule__Attacks__SourceAssignment_2 )
            {
             before(grammarAccess.getAttacksAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4934:1: ( rule__Attacks__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4934:2: rule__Attacks__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Attacks__SourceAssignment_2_in_rule__Attacks__Group__2__Impl9985);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4944:1: rule__Attacks__Group__3 : rule__Attacks__Group__3__Impl rule__Attacks__Group__4 ;
    public final void rule__Attacks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4948:1: ( rule__Attacks__Group__3__Impl rule__Attacks__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4949:2: rule__Attacks__Group__3__Impl rule__Attacks__Group__4
            {
            pushFollow(FOLLOW_rule__Attacks__Group__3__Impl_in_rule__Attacks__Group__310015);
            rule__Attacks__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__4_in_rule__Attacks__Group__310018);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4956:1: rule__Attacks__Group__3__Impl : ( ',' ) ;
    public final void rule__Attacks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4960:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4961:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4961:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4962:1: ','
            {
             before(grammarAccess.getAttacksAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Attacks__Group__3__Impl10046); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4975:1: rule__Attacks__Group__4 : rule__Attacks__Group__4__Impl rule__Attacks__Group__5 ;
    public final void rule__Attacks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4979:1: ( rule__Attacks__Group__4__Impl rule__Attacks__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4980:2: rule__Attacks__Group__4__Impl rule__Attacks__Group__5
            {
            pushFollow(FOLLOW_rule__Attacks__Group__4__Impl_in_rule__Attacks__Group__410077);
            rule__Attacks__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__5_in_rule__Attacks__Group__410080);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4987:1: rule__Attacks__Group__4__Impl : ( ( rule__Attacks__TargetAssignment_4 ) ) ;
    public final void rule__Attacks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4991:1: ( ( ( rule__Attacks__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4992:1: ( ( rule__Attacks__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4992:1: ( ( rule__Attacks__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4993:1: ( rule__Attacks__TargetAssignment_4 )
            {
             before(grammarAccess.getAttacksAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4994:1: ( rule__Attacks__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:4994:2: rule__Attacks__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Attacks__TargetAssignment_4_in_rule__Attacks__Group__4__Impl10107);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5004:1: rule__Attacks__Group__5 : rule__Attacks__Group__5__Impl ;
    public final void rule__Attacks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5008:1: ( rule__Attacks__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5009:2: rule__Attacks__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attacks__Group__5__Impl_in_rule__Attacks__Group__510137);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5015:1: rule__Attacks__Group__5__Impl : ( ')' ) ;
    public final void rule__Attacks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5019:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5020:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5020:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5021:1: ')'
            {
             before(grammarAccess.getAttacksAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Attacks__Group__5__Impl10165); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5046:1: rule__Argues__Group__0 : rule__Argues__Group__0__Impl rule__Argues__Group__1 ;
    public final void rule__Argues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5050:1: ( rule__Argues__Group__0__Impl rule__Argues__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5051:2: rule__Argues__Group__0__Impl rule__Argues__Group__1
            {
            pushFollow(FOLLOW_rule__Argues__Group__0__Impl_in_rule__Argues__Group__010208);
            rule__Argues__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__1_in_rule__Argues__Group__010211);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5058:1: rule__Argues__Group__0__Impl : ( ( rule__Argues__TypeAssignment_0 ) ) ;
    public final void rule__Argues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5062:1: ( ( ( rule__Argues__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5063:1: ( ( rule__Argues__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5063:1: ( ( rule__Argues__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5064:1: ( rule__Argues__TypeAssignment_0 )
            {
             before(grammarAccess.getArguesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5065:1: ( rule__Argues__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5065:2: rule__Argues__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argues__TypeAssignment_0_in_rule__Argues__Group__0__Impl10238);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5075:1: rule__Argues__Group__1 : rule__Argues__Group__1__Impl rule__Argues__Group__2 ;
    public final void rule__Argues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5079:1: ( rule__Argues__Group__1__Impl rule__Argues__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5080:2: rule__Argues__Group__1__Impl rule__Argues__Group__2
            {
            pushFollow(FOLLOW_rule__Argues__Group__1__Impl_in_rule__Argues__Group__110268);
            rule__Argues__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__2_in_rule__Argues__Group__110271);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5087:1: rule__Argues__Group__1__Impl : ( '(' ) ;
    public final void rule__Argues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5091:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5092:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5092:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5093:1: '('
            {
             before(grammarAccess.getArguesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Argues__Group__1__Impl10299); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5106:1: rule__Argues__Group__2 : rule__Argues__Group__2__Impl rule__Argues__Group__3 ;
    public final void rule__Argues__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5110:1: ( rule__Argues__Group__2__Impl rule__Argues__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5111:2: rule__Argues__Group__2__Impl rule__Argues__Group__3
            {
            pushFollow(FOLLOW_rule__Argues__Group__2__Impl_in_rule__Argues__Group__210330);
            rule__Argues__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__3_in_rule__Argues__Group__210333);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5118:1: rule__Argues__Group__2__Impl : ( ( rule__Argues__SourceAssignment_2 ) ) ;
    public final void rule__Argues__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5122:1: ( ( ( rule__Argues__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5123:1: ( ( rule__Argues__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5123:1: ( ( rule__Argues__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5124:1: ( rule__Argues__SourceAssignment_2 )
            {
             before(grammarAccess.getArguesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5125:1: ( rule__Argues__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5125:2: rule__Argues__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Argues__SourceAssignment_2_in_rule__Argues__Group__2__Impl10360);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5135:1: rule__Argues__Group__3 : rule__Argues__Group__3__Impl rule__Argues__Group__4 ;
    public final void rule__Argues__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5139:1: ( rule__Argues__Group__3__Impl rule__Argues__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5140:2: rule__Argues__Group__3__Impl rule__Argues__Group__4
            {
            pushFollow(FOLLOW_rule__Argues__Group__3__Impl_in_rule__Argues__Group__310390);
            rule__Argues__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__4_in_rule__Argues__Group__310393);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5147:1: rule__Argues__Group__3__Impl : ( ',' ) ;
    public final void rule__Argues__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5151:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5152:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5152:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5153:1: ','
            {
             before(grammarAccess.getArguesAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__Argues__Group__3__Impl10421); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5166:1: rule__Argues__Group__4 : rule__Argues__Group__4__Impl rule__Argues__Group__5 ;
    public final void rule__Argues__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5170:1: ( rule__Argues__Group__4__Impl rule__Argues__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5171:2: rule__Argues__Group__4__Impl rule__Argues__Group__5
            {
            pushFollow(FOLLOW_rule__Argues__Group__4__Impl_in_rule__Argues__Group__410452);
            rule__Argues__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__5_in_rule__Argues__Group__410455);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5178:1: rule__Argues__Group__4__Impl : ( ( rule__Argues__TargetAssignment_4 ) ) ;
    public final void rule__Argues__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5182:1: ( ( ( rule__Argues__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5183:1: ( ( rule__Argues__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5183:1: ( ( rule__Argues__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5184:1: ( rule__Argues__TargetAssignment_4 )
            {
             before(grammarAccess.getArguesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5185:1: ( rule__Argues__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5185:2: rule__Argues__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Argues__TargetAssignment_4_in_rule__Argues__Group__4__Impl10482);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5195:1: rule__Argues__Group__5 : rule__Argues__Group__5__Impl ;
    public final void rule__Argues__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5199:1: ( rule__Argues__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5200:2: rule__Argues__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Argues__Group__5__Impl_in_rule__Argues__Group__510512);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5206:1: rule__Argues__Group__5__Impl : ( ')' ) ;
    public final void rule__Argues__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5210:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5211:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5211:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5212:1: ')'
            {
             before(grammarAccess.getArguesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Argues__Group__5__Impl10540); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5238:1: rule__Situation__TimeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Situation__TimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5242:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5243:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5243:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5244:1: RULE_ID
            {
             before(grammarAccess.getSituationAccess().getTimeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_110588); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5253:1: rule__Situation__WorldAssignment_1 : ( ruleWorld ) ;
    public final void rule__Situation__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5257:1: ( ( ruleWorld ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5258:1: ( ruleWorld )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5258:1: ( ruleWorld )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5259:1: ruleWorld
            {
             before(grammarAccess.getSituationAccess().getWorldWorldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_110619);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5268:1: rule__World__PhysicalAssignment_1 : ( rulePhysicalWorld ) ;
    public final void rule__World__PhysicalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5272:1: ( ( rulePhysicalWorld ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5273:1: ( rulePhysicalWorld )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5273:1: ( rulePhysicalWorld )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5274:1: rulePhysicalWorld
            {
             before(grammarAccess.getWorldAccess().getPhysicalPhysicalWorldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePhysicalWorld_in_rule__World__PhysicalAssignment_110650);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5283:1: rule__World__BeliefAssignment_2 : ( ruleBeliefWorld ) ;
    public final void rule__World__BeliefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5287:1: ( ( ruleBeliefWorld ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5288:1: ( ruleBeliefWorld )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5288:1: ( ruleBeliefWorld )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5289:1: ruleBeliefWorld
            {
             before(grammarAccess.getWorldAccess().getBeliefBeliefWorldParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleBeliefWorld_in_rule__World__BeliefAssignment_210681);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5298:1: rule__Event__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5302:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5303:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5303:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5304:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_110712); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5313:1: rule__PhysicalWorld__EntitiesAssignment_1 : ( ruleEntity ) ;
    public final void rule__PhysicalWorld__EntitiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5317:1: ( ( ruleEntity ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5318:1: ( ruleEntity )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5318:1: ( ruleEntity )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5319:1: ruleEntity
            {
             before(grammarAccess.getPhysicalWorldAccess().getEntitiesEntityParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__PhysicalWorld__EntitiesAssignment_110743);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5328:1: rule__BeliefWorld__DomainsAssignment_1_0 : ( ruleDomain ) ;
    public final void rule__BeliefWorld__DomainsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5332:1: ( ( ruleDomain ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5333:1: ( ruleDomain )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5333:1: ( ruleDomain )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5334:1: ruleDomain
            {
             before(grammarAccess.getBeliefWorldAccess().getDomainsDomainParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleDomain_in_rule__BeliefWorld__DomainsAssignment_1_010774);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5343:1: rule__BeliefWorld__RelationshipsAssignment_1_1 : ( ruleRelationship ) ;
    public final void rule__BeliefWorld__RelationshipsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5347:1: ( ( ruleRelationship ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5348:1: ( ruleRelationship )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5348:1: ( ruleRelationship )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5349:1: ruleRelationship
            {
             before(grammarAccess.getBeliefWorldAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__BeliefWorld__RelationshipsAssignment_1_110805);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5358:1: rule__Domain__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5362:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5363:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5363:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5364:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_010836); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5373:1: rule__Domain__TypeAssignment_1 : ( ruleDomainType ) ;
    public final void rule__Domain__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5377:1: ( ( ruleDomainType ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5378:1: ( ruleDomainType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5378:1: ( ruleDomainType )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5379:1: ruleDomainType
            {
             before(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDomainType_in_rule__Domain__TypeAssignment_110867);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5388:1: rule__Domain__PropertiesAssignment_2 : ( ruleProposition ) ;
    public final void rule__Domain__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5392:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5393:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5393:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5394:1: ruleProposition
            {
             before(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_210898);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5403:1: rule__Domain__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__Domain__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5407:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5408:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5408:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5409:1: ruleProposition
            {
             before(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_3_110929);
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


    // $ANTLR start rule__Proposition__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5418:1: rule__Proposition__TypeAssignment_0 : ( rulePropositionType ) ;
    public final void rule__Proposition__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5422:1: ( ( rulePropositionType ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5423:1: ( rulePropositionType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5423:1: ( rulePropositionType )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5424:1: rulePropositionType
            {
             before(grammarAccess.getPropositionAccess().getTypePropositionTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_rulePropositionType_in_rule__Proposition__TypeAssignment_010960);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5433:1: rule__Proposition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Proposition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5437:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5438:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5438:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5439:1: RULE_ID
            {
             before(grammarAccess.getPropositionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Proposition__NameAssignment_110991); 
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


    // $ANTLR start rule__Stakeholder__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5448:1: rule__Stakeholder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Stakeholder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5452:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5453:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5453:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5454:1: RULE_ID
            {
             before(grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Stakeholder__NameAssignment_111022); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5463:1: rule__Attacker__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attacker__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5467:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5468:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5468:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5469:1: RULE_ID
            {
             before(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_111053); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5478:1: rule__NaturalProcess__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NaturalProcess__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5482:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5483:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5483:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5484:1: RULE_ID
            {
             before(grammarAccess.getNaturalProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NaturalProcess__NameAssignment_111084); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5493:1: rule__NaturalProcess__ActivitiesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__NaturalProcess__ActivitiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5497:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5498:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5498:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5499:1: ( RULE_ID )
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesProcessCrossReference_2_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5500:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5501:1: RULE_ID
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesProcessIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NaturalProcess__ActivitiesAssignment_2_111119); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5512:1: rule__HumanActivity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__HumanActivity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5516:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5517:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5517:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5518:1: RULE_ID
            {
             before(grammarAccess.getHumanActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HumanActivity__NameAssignment_211154); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5527:1: rule__HumanActivity__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__HumanActivity__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5531:1: ( ( ruleAction ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5532:1: ( ruleAction )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5532:1: ( ruleAction )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5533:1: ruleAction
            {
             before(grammarAccess.getHumanActivityAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__HumanActivity__ActionsAssignment_311185);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5542:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5546:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5547:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5547:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5548:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_111216); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5557:1: rule__Resource__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5561:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5562:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5562:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5563:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_0_111247); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5572:1: rule__Asset__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5576:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5577:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5577:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5578:1: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_111278); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5587:1: rule__Wants__TypeAssignment_0 : ( ( 'wants' ) ) ;
    public final void rule__Wants__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5591:1: ( ( ( 'wants' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5592:1: ( ( 'wants' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5592:1: ( ( 'wants' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5593:1: ( 'wants' )
            {
             before(grammarAccess.getWantsAccess().getTypeWantsKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5594:1: ( 'wants' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5595:1: 'wants'
            {
             before(grammarAccess.getWantsAccess().getTypeWantsKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Wants__TypeAssignment_011314); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5610:1: rule__Wants__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Wants__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5614:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5615:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5615:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5616:1: ( RULE_ID )
            {
             before(grammarAccess.getWantsAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5617:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5618:1: RULE_ID
            {
             before(grammarAccess.getWantsAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Wants__SourceAssignment_211357); 
             after(grammarAccess.getWantsAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getWantsAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5629:1: rule__Wants__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Wants__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5633:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5634:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5634:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5635:1: ( RULE_ID )
            {
             before(grammarAccess.getWantsAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5636:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5637:1: RULE_ID
            {
             before(grammarAccess.getWantsAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Wants__TargetAssignment_411396); 
             after(grammarAccess.getWantsAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getWantsAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5648:1: rule__Does__TypeAssignment_0 : ( ( 'does' ) ) ;
    public final void rule__Does__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5652:1: ( ( ( 'does' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5653:1: ( ( 'does' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5653:1: ( ( 'does' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5654:1: ( 'does' )
            {
             before(grammarAccess.getDoesAccess().getTypeDoesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5655:1: ( 'does' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5656:1: 'does'
            {
             before(grammarAccess.getDoesAccess().getTypeDoesKeyword_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Does__TypeAssignment_011436); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5671:1: rule__Does__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Does__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5675:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5676:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5676:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5677:1: ( RULE_ID )
            {
             before(grammarAccess.getDoesAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5678:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5679:1: RULE_ID
            {
             before(grammarAccess.getDoesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Does__SourceAssignment_211479); 
             after(grammarAccess.getDoesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDoesAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5690:1: rule__Does__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Does__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5694:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5695:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5695:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5696:1: ( RULE_ID )
            {
             before(grammarAccess.getDoesAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5697:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5698:1: RULE_ID
            {
             before(grammarAccess.getDoesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Does__TargetAssignment_411518); 
             after(grammarAccess.getDoesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDoesAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5709:1: rule__Decomposes__TypeAssignment_0 : ( ruleDecomposesType ) ;
    public final void rule__Decomposes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5713:1: ( ( ruleDecomposesType ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5714:1: ( ruleDecomposesType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5714:1: ( ruleDecomposesType )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5715:1: ruleDecomposesType
            {
             before(grammarAccess.getDecomposesAccess().getTypeDecomposesTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDecomposesType_in_rule__Decomposes__TypeAssignment_011553);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5724:1: rule__Decomposes__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Decomposes__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5728:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5729:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5729:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5730:1: ( RULE_ID )
            {
             before(grammarAccess.getDecomposesAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5731:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5732:1: RULE_ID
            {
             before(grammarAccess.getDecomposesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decomposes__SourceAssignment_211588); 
             after(grammarAccess.getDecomposesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDecomposesAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5743:1: rule__Decomposes__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Decomposes__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5747:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5748:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5748:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5749:1: ( RULE_ID )
            {
             before(grammarAccess.getDecomposesAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5750:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5751:1: RULE_ID
            {
             before(grammarAccess.getDecomposesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decomposes__TargetAssignment_411627); 
             after(grammarAccess.getDecomposesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDecomposesAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5762:1: rule__Trusts__TypeAssignment_0 : ( ( 'trusts' ) ) ;
    public final void rule__Trusts__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5766:1: ( ( ( 'trusts' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5767:1: ( ( 'trusts' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5767:1: ( ( 'trusts' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5768:1: ( 'trusts' )
            {
             before(grammarAccess.getTrustsAccess().getTypeTrustsKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5769:1: ( 'trusts' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5770:1: 'trusts'
            {
             before(grammarAccess.getTrustsAccess().getTypeTrustsKeyword_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Trusts__TypeAssignment_011667); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5785:1: rule__Trusts__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Trusts__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5789:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5790:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5790:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5791:1: ( RULE_ID )
            {
             before(grammarAccess.getTrustsAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5792:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5793:1: RULE_ID
            {
             before(grammarAccess.getTrustsAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Trusts__SourceAssignment_211710); 
             after(grammarAccess.getTrustsAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getTrustsAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5804:1: rule__Trusts__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Trusts__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5808:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5809:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5809:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5810:1: ( RULE_ID )
            {
             before(grammarAccess.getTrustsAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5811:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5812:1: RULE_ID
            {
             before(grammarAccess.getTrustsAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Trusts__TargetAssignment_411749); 
             after(grammarAccess.getTrustsAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getTrustsAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Delegates__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5823:1: rule__Delegates__TypeAssignment_0 : ( ( 'delegates' ) ) ;
    public final void rule__Delegates__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5827:1: ( ( ( 'delegates' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5828:1: ( ( 'delegates' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5828:1: ( ( 'delegates' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5829:1: ( 'delegates' )
            {
             before(grammarAccess.getDelegatesAccess().getTypeDelegatesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5830:1: ( 'delegates' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5831:1: 'delegates'
            {
             before(grammarAccess.getDelegatesAccess().getTypeDelegatesKeyword_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Delegates__TypeAssignment_011789); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5846:1: rule__Delegates__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Delegates__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5850:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5851:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5851:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5852:1: ( RULE_ID )
            {
             before(grammarAccess.getDelegatesAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5853:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5854:1: RULE_ID
            {
             before(grammarAccess.getDelegatesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delegates__SourceAssignment_211832); 
             after(grammarAccess.getDelegatesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDelegatesAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5865:1: rule__Delegates__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Delegates__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5869:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5870:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5870:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5871:1: ( RULE_ID )
            {
             before(grammarAccess.getDelegatesAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5872:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5873:1: RULE_ID
            {
             before(grammarAccess.getDelegatesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delegates__TargetAssignment_411871); 
             after(grammarAccess.getDelegatesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDelegatesAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Contributes__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5884:1: rule__Contributes__TypeAssignment_0 : ( ruleContributesType ) ;
    public final void rule__Contributes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5888:1: ( ( ruleContributesType ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5889:1: ( ruleContributesType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5889:1: ( ruleContributesType )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5890:1: ruleContributesType
            {
             before(grammarAccess.getContributesAccess().getTypeContributesTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleContributesType_in_rule__Contributes__TypeAssignment_011906);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5899:1: rule__Contributes__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Contributes__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5903:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5904:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5904:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5905:1: ( RULE_ID )
            {
             before(grammarAccess.getContributesAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5906:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5907:1: RULE_ID
            {
             before(grammarAccess.getContributesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Contributes__SourceAssignment_211941); 
             after(grammarAccess.getContributesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getContributesAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5918:1: rule__Contributes__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Contributes__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5922:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5923:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5923:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5924:1: ( RULE_ID )
            {
             before(grammarAccess.getContributesAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5925:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5926:1: RULE_ID
            {
             before(grammarAccess.getContributesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Contributes__TargetAssignment_411980); 
             after(grammarAccess.getContributesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getContributesAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5937:1: rule__Fulfils__TypeAssignment_0 : ( ruleFulfilsType ) ;
    public final void rule__Fulfils__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5941:1: ( ( ruleFulfilsType ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5942:1: ( ruleFulfilsType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5942:1: ( ruleFulfilsType )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5943:1: ruleFulfilsType
            {
             before(grammarAccess.getFulfilsAccess().getTypeFulfilsTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFulfilsType_in_rule__Fulfils__TypeAssignment_012015);
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5952:1: rule__Fulfils__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Fulfils__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5956:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5957:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5957:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5958:1: ( RULE_ID )
            {
             before(grammarAccess.getFulfilsAccess().getSourceProcessCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5959:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5960:1: RULE_ID
            {
             before(grammarAccess.getFulfilsAccess().getSourceProcessIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fulfils__SourceAssignment_212050); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5971:1: rule__Fulfils__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Fulfils__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5975:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5976:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5976:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5977:1: ( RULE_ID )
            {
             before(grammarAccess.getFulfilsAccess().getTargetPropositionCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5978:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5979:1: RULE_ID
            {
             before(grammarAccess.getFulfilsAccess().getTargetPropositionIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fulfils__TargetAssignment_412089); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5990:1: rule__Provides__TypeAssignment_0 : ( ( 'provides' ) ) ;
    public final void rule__Provides__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5994:1: ( ( ( 'provides' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5995:1: ( ( 'provides' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5995:1: ( ( 'provides' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5996:1: ( 'provides' )
            {
             before(grammarAccess.getProvidesAccess().getTypeProvidesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5997:1: ( 'provides' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:5998:1: 'provides'
            {
             before(grammarAccess.getProvidesAccess().getTypeProvidesKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Provides__TypeAssignment_012129); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6013:1: rule__Provides__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Provides__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6017:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6018:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6018:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6019:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidesAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6020:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6021:1: RULE_ID
            {
             before(grammarAccess.getProvidesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provides__SourceAssignment_212172); 
             after(grammarAccess.getProvidesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getProvidesAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6032:1: rule__Provides__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Provides__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6036:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6037:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6037:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6038:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidesAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6039:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6040:1: RULE_ID
            {
             before(grammarAccess.getProvidesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provides__TargetAssignment_412211); 
             after(grammarAccess.getProvidesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getProvidesAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6051:1: rule__Consumes__TypeAssignment_0 : ( ( 'consumes' ) ) ;
    public final void rule__Consumes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6055:1: ( ( ( 'consumes' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6056:1: ( ( 'consumes' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6056:1: ( ( 'consumes' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6057:1: ( 'consumes' )
            {
             before(grammarAccess.getConsumesAccess().getTypeConsumesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6058:1: ( 'consumes' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6059:1: 'consumes'
            {
             before(grammarAccess.getConsumesAccess().getTypeConsumesKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Consumes__TypeAssignment_012251); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6074:1: rule__Consumes__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Consumes__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6078:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6079:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6079:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6080:1: ( RULE_ID )
            {
             before(grammarAccess.getConsumesAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6081:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6082:1: RULE_ID
            {
             before(grammarAccess.getConsumesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consumes__SourceAssignment_212294); 
             after(grammarAccess.getConsumesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getConsumesAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6093:1: rule__Consumes__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Consumes__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6097:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6098:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6098:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6099:1: ( RULE_ID )
            {
             before(grammarAccess.getConsumesAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6100:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6101:1: RULE_ID
            {
             before(grammarAccess.getConsumesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consumes__TargetAssignment_412333); 
             after(grammarAccess.getConsumesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getConsumesAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6112:1: rule__Exploits__TypeAssignment_0 : ( ( 'exploits' ) ) ;
    public final void rule__Exploits__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6116:1: ( ( ( 'exploits' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6117:1: ( ( 'exploits' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6117:1: ( ( 'exploits' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6118:1: ( 'exploits' )
            {
             before(grammarAccess.getExploitsAccess().getTypeExploitsKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6119:1: ( 'exploits' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6120:1: 'exploits'
            {
             before(grammarAccess.getExploitsAccess().getTypeExploitsKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Exploits__TypeAssignment_012373); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6135:1: rule__Exploits__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Exploits__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6139:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6140:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6140:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6141:1: ( RULE_ID )
            {
             before(grammarAccess.getExploitsAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6142:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6143:1: RULE_ID
            {
             before(grammarAccess.getExploitsAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exploits__SourceAssignment_212416); 
             after(grammarAccess.getExploitsAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getExploitsAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6154:1: rule__Exploits__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Exploits__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6158:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6159:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6159:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6160:1: ( RULE_ID )
            {
             before(grammarAccess.getExploitsAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6161:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6162:1: RULE_ID
            {
             before(grammarAccess.getExploitsAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exploits__TargetAssignment_412455); 
             after(grammarAccess.getExploitsAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getExploitsAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6173:1: rule__Damages__TypeAssignment_0 : ( ( 'damages' ) ) ;
    public final void rule__Damages__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6177:1: ( ( ( 'damages' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6178:1: ( ( 'damages' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6178:1: ( ( 'damages' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6179:1: ( 'damages' )
            {
             before(grammarAccess.getDamagesAccess().getTypeDamagesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6180:1: ( 'damages' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6181:1: 'damages'
            {
             before(grammarAccess.getDamagesAccess().getTypeDamagesKeyword_0_0()); 
            match(input,49,FOLLOW_49_in_rule__Damages__TypeAssignment_012495); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6196:1: rule__Damages__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Damages__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6200:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6201:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6201:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6202:1: ( RULE_ID )
            {
             before(grammarAccess.getDamagesAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6203:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6204:1: RULE_ID
            {
             before(grammarAccess.getDamagesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Damages__SourceAssignment_212538); 
             after(grammarAccess.getDamagesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getDamagesAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6215:1: rule__Damages__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Damages__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6219:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6220:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6220:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6221:1: ( RULE_ID )
            {
             before(grammarAccess.getDamagesAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6222:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6223:1: RULE_ID
            {
             before(grammarAccess.getDamagesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Damages__TargetAssignment_412577); 
             after(grammarAccess.getDamagesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getDamagesAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6234:1: rule__Attacks__TypeAssignment_0 : ( ( 'attacks' ) ) ;
    public final void rule__Attacks__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6238:1: ( ( ( 'attacks' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6239:1: ( ( 'attacks' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6239:1: ( ( 'attacks' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6240:1: ( 'attacks' )
            {
             before(grammarAccess.getAttacksAccess().getTypeAttacksKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6241:1: ( 'attacks' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6242:1: 'attacks'
            {
             before(grammarAccess.getAttacksAccess().getTypeAttacksKeyword_0_0()); 
            match(input,50,FOLLOW_50_in_rule__Attacks__TypeAssignment_012617); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6257:1: rule__Attacks__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attacks__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6261:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6262:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6262:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6263:1: ( RULE_ID )
            {
             before(grammarAccess.getAttacksAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6264:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6265:1: RULE_ID
            {
             before(grammarAccess.getAttacksAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacks__SourceAssignment_212660); 
             after(grammarAccess.getAttacksAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getAttacksAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6276:1: rule__Attacks__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Attacks__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6280:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6281:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6281:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6282:1: ( RULE_ID )
            {
             before(grammarAccess.getAttacksAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6283:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6284:1: RULE_ID
            {
             before(grammarAccess.getAttacksAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacks__TargetAssignment_412699); 
             after(grammarAccess.getAttacksAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAttacksAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6295:1: rule__Argues__TypeAssignment_0 : ( ( 'argues' ) ) ;
    public final void rule__Argues__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6299:1: ( ( ( 'argues' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6300:1: ( ( 'argues' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6300:1: ( ( 'argues' ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6301:1: ( 'argues' )
            {
             before(grammarAccess.getArguesAccess().getTypeArguesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6302:1: ( 'argues' )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6303:1: 'argues'
            {
             before(grammarAccess.getArguesAccess().getTypeArguesKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__Argues__TypeAssignment_012739); 
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6318:1: rule__Argues__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Argues__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6322:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6323:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6323:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6324:1: ( RULE_ID )
            {
             before(grammarAccess.getArguesAccess().getSourceThingCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6325:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6326:1: RULE_ID
            {
             before(grammarAccess.getArguesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argues__SourceAssignment_212782); 
             after(grammarAccess.getArguesAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getArguesAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6337:1: rule__Argues__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Argues__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6341:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6342:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6342:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6343:1: ( RULE_ID )
            {
             before(grammarAccess.getArguesAccess().getTargetThingCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6344:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalOntology.g:6345:1: RULE_ID
            {
             before(grammarAccess.getArguesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argues__TargetAssignment_412821); 
             after(grammarAccess.getArguesAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getArguesAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_rule__Proposition__Group__0_in_ruleProposition516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_in_ruleEntity576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Alternatives_in_ruleActor636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__0_in_ruleStakeholder696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0_in_ruleAttacker756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_in_ruleProcess816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalProcess850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__0_in_ruleNaturalProcess876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHumanActivity910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__0_in_ruleHumanActivity936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Alternatives_in_ruleResource1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0_in_ruleAsset1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_entryRuleWants1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWants1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__0_in_ruleWants1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_entryRuleDoes1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoes1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__0_in_ruleDoes1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_entryRuleDecomposes1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposes1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__0_in_ruleDecomposes1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_entryRuleTrusts1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrusts1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__0_in_ruleTrusts1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_entryRuleDelegates1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelegates1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__0_in_ruleDelegates1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_entryRuleContributes1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributes1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__0_in_ruleContributes1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_entryRuleFulfils1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFulfils1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__0_in_ruleFulfils1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_entryRuleProvides1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvides1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__0_in_ruleProvides1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_entryRuleConsumes1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsumes1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__0_in_ruleConsumes1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_entryRuleExploits1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploits1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__0_in_ruleExploits1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_entryRuleDamages1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDamages1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__0_in_ruleDamages1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_entryRuleAttacks1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacks1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__0_in_ruleAttacks1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_entryRuleArgues1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgues1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__0_in_ruleArgues1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainType__Alternatives_in_ruleDomainType1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropositionType__Alternatives_in_rulePropositionType2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecomposesType__Alternatives_in_ruleDecomposesType2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContributesType__Alternatives_in_ruleContributesType2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFulfilsType2138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Object__Alternatives2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Object__Alternatives2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Object__Alternatives2210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__DomainsAssignment_1_0_in_rule__BeliefWorld__Alternatives_12242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__RelationshipsAssignment_1_1_in_rule__BeliefWorld__Alternatives_12260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__Entity__Alternatives2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__Entity__Alternatives2310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Entity__Alternatives2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_rule__Actor__Alternatives2359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_rule__Actor__Alternatives2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_rule__Process__Alternatives2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_rule__Process__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__0_in_rule__Resource__Alternatives2457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Resource__Alternatives2475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_rule__Relationship__Alternatives2507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_rule__Relationship__Alternatives2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_rule__Relationship__Alternatives2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_rule__Relationship__Alternatives2558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_rule__Relationship__Alternatives2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_rule__Relationship__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_rule__Relationship__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_rule__Relationship__Alternatives2626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_rule__Relationship__Alternatives2643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_rule__Relationship__Alternatives2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_rule__Relationship__Alternatives2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_rule__Relationship__Alternatives2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_rule__Relationship__Alternatives2711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__DomainType__Alternatives2744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__DomainType__Alternatives2765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__DomainType__Alternatives2786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PropositionType__Alternatives2822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__PropositionType__Alternatives2843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__PropositionType__Alternatives2864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__PropositionType__Alternatives2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__PropositionType__Alternatives2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PropositionType__Alternatives2927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__DecomposesType__Alternatives2963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__DecomposesType__Alternatives2984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ContributesType__Alternatives3020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ContributesType__Alternatives3041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__ContributesType__Alternatives3062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ContributesType__Alternatives3083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__03116 = new BitSet(new long[]{0x000FFCD387E00812L});
    public static final BitSet FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__03119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl3146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__13177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__03238 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__03241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Situation__Group_0__0__Impl3269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__13300 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__13303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl3330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__23360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Situation__Group_0__2__Impl3388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__03425 = new BitSet(new long[]{0x000FFCD387E00812L});
    public static final BitSet FOLLOW_rule__World__Group__1_in_rule__World__Group__03428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__13486 = new BitSet(new long[]{0x000FFC0007E00812L});
    public static final BitSet FOLLOW_rule__World__Group__2_in_rule__World__Group__13489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__PhysicalAssignment_1_in_rule__World__Group__1__Impl3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__2__Impl_in_rule__World__Group__23547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__BeliefAssignment_2_in_rule__World__Group__2__Impl3574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Event__Group__0__Impl3642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__13673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhysicalWorld__Group__0__Impl_in_rule__PhysicalWorld__Group__03734 = new BitSet(new long[]{0x000000D380000002L});
    public static final BitSet FOLLOW_rule__PhysicalWorld__Group__1_in_rule__PhysicalWorld__Group__03737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhysicalWorld__Group__1__Impl_in_rule__PhysicalWorld__Group__13795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PhysicalWorld__EntitiesAssignment_1_in_rule__PhysicalWorld__Group__1__Impl3822 = new BitSet(new long[]{0x000000D380000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__Group__0__Impl_in_rule__BeliefWorld__Group__03857 = new BitSet(new long[]{0x000FFC0007E00812L});
    public static final BitSet FOLLOW_rule__BeliefWorld__Group__1_in_rule__BeliefWorld__Group__03860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__Group__1__Impl_in_rule__BeliefWorld__Group__13918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BeliefWorld__Alternatives_1_in_rule__BeliefWorld__Group__1__Impl3945 = new BitSet(new long[]{0x000FFC0007E00812L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03980 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_0_in_rule__Domain__Group__0__Impl4010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__14040 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__14043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__TypeAssignment_1_in_rule__Domain__Group__1__Impl4070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__24100 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__24103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_2_in_rule__Domain__Group__2__Impl4130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__34160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__0_in_rule__Domain__Group__3__Impl4187 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__0__Impl_in_rule__Domain__Group_3__04226 = new BitSet(new long[]{0x00000000001F8000L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__1_in_rule__Domain__Group_3__04229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Domain__Group_3__0__Impl4257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__1__Impl_in_rule__Domain__Group_3__14288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_3_1_in_rule__Domain__Group_3__1__Impl4315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__Group__0__Impl_in_rule__Proposition__Group__04349 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Proposition__Group__1_in_rule__Proposition__Group__04352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__TypeAssignment_0_in_rule__Proposition__Group__0__Impl4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__Group__1__Impl_in_rule__Proposition__Group__14409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__NameAssignment_1_in_rule__Proposition__Group__1__Impl4436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__0__Impl_in_rule__Stakeholder__Group__04470 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__1_in_rule__Stakeholder__Group__04473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Stakeholder__Group__0__Impl4501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__1__Impl_in_rule__Stakeholder__Group__14532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__NameAssignment_1_in_rule__Stakeholder__Group__1__Impl4559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__04593 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__04596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Attacker__Group__0__Impl4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__14655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__NameAssignment_1_in_rule__Attacker__Group__1__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__0__Impl_in_rule__NaturalProcess__Group__04716 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__1_in_rule__NaturalProcess__Group__04719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NaturalProcess__Group__0__Impl4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__1__Impl_in_rule__NaturalProcess__Group__14778 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__2_in_rule__NaturalProcess__Group__14781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__NameAssignment_1_in_rule__NaturalProcess__Group__1__Impl4808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__2__Impl_in_rule__NaturalProcess__Group__24838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__0_in_rule__NaturalProcess__Group__2__Impl4865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__0__Impl_in_rule__NaturalProcess__Group_2__04902 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__1_in_rule__NaturalProcess__Group_2__04905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NaturalProcess__Group_2__0__Impl4933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__1__Impl_in_rule__NaturalProcess__Group_2__14964 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__2_in_rule__NaturalProcess__Group_2__14967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__ActivitiesAssignment_2_1_in_rule__NaturalProcess__Group_2__1__Impl4994 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__2__Impl_in_rule__NaturalProcess__Group_2__25025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NaturalProcess__Group_2__2__Impl5053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__0__Impl_in_rule__HumanActivity__Group__05090 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__1_in_rule__HumanActivity__Group__05093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__1__Impl_in_rule__HumanActivity__Group__15151 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__2_in_rule__HumanActivity__Group__15154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__HumanActivity__Group__1__Impl5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__2__Impl_in_rule__HumanActivity__Group__25213 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__3_in_rule__HumanActivity__Group__25216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__NameAssignment_2_in_rule__HumanActivity__Group__2__Impl5243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__3__Impl_in_rule__HumanActivity__Group__35273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__ActionsAssignment_3_in_rule__HumanActivity__Group__3__Impl5300 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__05339 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__05342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Action__Group__0__Impl5370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__15401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl5428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__0__Impl_in_rule__Resource__Group_0__05462 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__1_in_rule__Resource__Group_0__05465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Resource__Group_0__0__Impl5493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__1__Impl_in_rule__Resource__Group_0__15524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_0_1_in_rule__Resource__Group_0__1__Impl5551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__05585 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__05588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Asset__Group__0__Impl5616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__15647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl5674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__0__Impl_in_rule__Wants__Group__05708 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__1_in_rule__Wants__Group__05711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__TypeAssignment_0_in_rule__Wants__Group__0__Impl5738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__1__Impl_in_rule__Wants__Group__15768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wants__Group__2_in_rule__Wants__Group__15771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Wants__Group__1__Impl5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__2__Impl_in_rule__Wants__Group__25830 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__3_in_rule__Wants__Group__25833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__SourceAssignment_2_in_rule__Wants__Group__2__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__3__Impl_in_rule__Wants__Group__35890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wants__Group__4_in_rule__Wants__Group__35893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Wants__Group__3__Impl5921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__4__Impl_in_rule__Wants__Group__45952 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__5_in_rule__Wants__Group__45955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__TargetAssignment_4_in_rule__Wants__Group__4__Impl5982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__5__Impl_in_rule__Wants__Group__56012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Wants__Group__5__Impl6040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__0__Impl_in_rule__Does__Group__06083 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Does__Group__1_in_rule__Does__Group__06086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__TypeAssignment_0_in_rule__Does__Group__0__Impl6113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__1__Impl_in_rule__Does__Group__16143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Does__Group__2_in_rule__Does__Group__16146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Does__Group__1__Impl6174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__2__Impl_in_rule__Does__Group__26205 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Does__Group__3_in_rule__Does__Group__26208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__SourceAssignment_2_in_rule__Does__Group__2__Impl6235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__3__Impl_in_rule__Does__Group__36265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Does__Group__4_in_rule__Does__Group__36268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Does__Group__3__Impl6296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__4__Impl_in_rule__Does__Group__46327 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Does__Group__5_in_rule__Does__Group__46330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__TargetAssignment_4_in_rule__Does__Group__4__Impl6357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__5__Impl_in_rule__Does__Group__56387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Does__Group__5__Impl6415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__0__Impl_in_rule__Decomposes__Group__06458 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__1_in_rule__Decomposes__Group__06461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__TypeAssignment_0_in_rule__Decomposes__Group__0__Impl6488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__1__Impl_in_rule__Decomposes__Group__16518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__2_in_rule__Decomposes__Group__16521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Decomposes__Group__1__Impl6549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__2__Impl_in_rule__Decomposes__Group__26580 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__3_in_rule__Decomposes__Group__26583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__SourceAssignment_2_in_rule__Decomposes__Group__2__Impl6610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__3__Impl_in_rule__Decomposes__Group__36640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__4_in_rule__Decomposes__Group__36643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Decomposes__Group__3__Impl6671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__4__Impl_in_rule__Decomposes__Group__46702 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__5_in_rule__Decomposes__Group__46705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__TargetAssignment_4_in_rule__Decomposes__Group__4__Impl6732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__5__Impl_in_rule__Decomposes__Group__56762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Decomposes__Group__5__Impl6790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__0__Impl_in_rule__Trusts__Group__06833 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__1_in_rule__Trusts__Group__06836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__TypeAssignment_0_in_rule__Trusts__Group__0__Impl6863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__1__Impl_in_rule__Trusts__Group__16893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trusts__Group__2_in_rule__Trusts__Group__16896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Trusts__Group__1__Impl6924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__2__Impl_in_rule__Trusts__Group__26955 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__3_in_rule__Trusts__Group__26958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__SourceAssignment_2_in_rule__Trusts__Group__2__Impl6985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__3__Impl_in_rule__Trusts__Group__37015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trusts__Group__4_in_rule__Trusts__Group__37018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Trusts__Group__3__Impl7046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__4__Impl_in_rule__Trusts__Group__47077 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__5_in_rule__Trusts__Group__47080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__TargetAssignment_4_in_rule__Trusts__Group__4__Impl7107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__5__Impl_in_rule__Trusts__Group__57137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Trusts__Group__5__Impl7165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__0__Impl_in_rule__Delegates__Group__07208 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__1_in_rule__Delegates__Group__07211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__TypeAssignment_0_in_rule__Delegates__Group__0__Impl7238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__1__Impl_in_rule__Delegates__Group__17268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Delegates__Group__2_in_rule__Delegates__Group__17271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Delegates__Group__1__Impl7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__2__Impl_in_rule__Delegates__Group__27330 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__3_in_rule__Delegates__Group__27333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__SourceAssignment_2_in_rule__Delegates__Group__2__Impl7360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__3__Impl_in_rule__Delegates__Group__37390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Delegates__Group__4_in_rule__Delegates__Group__37393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Delegates__Group__3__Impl7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__4__Impl_in_rule__Delegates__Group__47452 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__5_in_rule__Delegates__Group__47455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__TargetAssignment_4_in_rule__Delegates__Group__4__Impl7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__5__Impl_in_rule__Delegates__Group__57512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Delegates__Group__5__Impl7540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__0__Impl_in_rule__Contributes__Group__07583 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__1_in_rule__Contributes__Group__07586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__TypeAssignment_0_in_rule__Contributes__Group__0__Impl7613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__1__Impl_in_rule__Contributes__Group__17643 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Contributes__Group__2_in_rule__Contributes__Group__17646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Contributes__Group__1__Impl7674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__2__Impl_in_rule__Contributes__Group__27705 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__3_in_rule__Contributes__Group__27708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__SourceAssignment_2_in_rule__Contributes__Group__2__Impl7735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__3__Impl_in_rule__Contributes__Group__37765 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Contributes__Group__4_in_rule__Contributes__Group__37768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Contributes__Group__3__Impl7796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__4__Impl_in_rule__Contributes__Group__47827 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__5_in_rule__Contributes__Group__47830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__TargetAssignment_4_in_rule__Contributes__Group__4__Impl7857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__5__Impl_in_rule__Contributes__Group__57887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Contributes__Group__5__Impl7915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__0__Impl_in_rule__Fulfils__Group__07958 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__1_in_rule__Fulfils__Group__07961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__TypeAssignment_0_in_rule__Fulfils__Group__0__Impl7988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__1__Impl_in_rule__Fulfils__Group__18018 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__2_in_rule__Fulfils__Group__18021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Fulfils__Group__1__Impl8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__2__Impl_in_rule__Fulfils__Group__28080 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__3_in_rule__Fulfils__Group__28083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__SourceAssignment_2_in_rule__Fulfils__Group__2__Impl8110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__3__Impl_in_rule__Fulfils__Group__38140 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__4_in_rule__Fulfils__Group__38143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Fulfils__Group__3__Impl8171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__4__Impl_in_rule__Fulfils__Group__48202 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__5_in_rule__Fulfils__Group__48205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__TargetAssignment_4_in_rule__Fulfils__Group__4__Impl8232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__5__Impl_in_rule__Fulfils__Group__58262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Fulfils__Group__5__Impl8290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__0__Impl_in_rule__Provides__Group__08333 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__1_in_rule__Provides__Group__08336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__TypeAssignment_0_in_rule__Provides__Group__0__Impl8363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__1__Impl_in_rule__Provides__Group__18393 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Provides__Group__2_in_rule__Provides__Group__18396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Provides__Group__1__Impl8424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__2__Impl_in_rule__Provides__Group__28455 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__3_in_rule__Provides__Group__28458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__SourceAssignment_2_in_rule__Provides__Group__2__Impl8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__3__Impl_in_rule__Provides__Group__38515 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Provides__Group__4_in_rule__Provides__Group__38518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Provides__Group__3__Impl8546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__4__Impl_in_rule__Provides__Group__48577 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__5_in_rule__Provides__Group__48580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__TargetAssignment_4_in_rule__Provides__Group__4__Impl8607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__5__Impl_in_rule__Provides__Group__58637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Provides__Group__5__Impl8665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__0__Impl_in_rule__Consumes__Group__08708 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__1_in_rule__Consumes__Group__08711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__TypeAssignment_0_in_rule__Consumes__Group__0__Impl8738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__1__Impl_in_rule__Consumes__Group__18768 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Consumes__Group__2_in_rule__Consumes__Group__18771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Consumes__Group__1__Impl8799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__2__Impl_in_rule__Consumes__Group__28830 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__3_in_rule__Consumes__Group__28833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__SourceAssignment_2_in_rule__Consumes__Group__2__Impl8860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__3__Impl_in_rule__Consumes__Group__38890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Consumes__Group__4_in_rule__Consumes__Group__38893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Consumes__Group__3__Impl8921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__4__Impl_in_rule__Consumes__Group__48952 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__5_in_rule__Consumes__Group__48955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__TargetAssignment_4_in_rule__Consumes__Group__4__Impl8982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__5__Impl_in_rule__Consumes__Group__59012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Consumes__Group__5__Impl9040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__0__Impl_in_rule__Exploits__Group__09083 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__1_in_rule__Exploits__Group__09086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__TypeAssignment_0_in_rule__Exploits__Group__0__Impl9113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__1__Impl_in_rule__Exploits__Group__19143 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exploits__Group__2_in_rule__Exploits__Group__19146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Exploits__Group__1__Impl9174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__2__Impl_in_rule__Exploits__Group__29205 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__3_in_rule__Exploits__Group__29208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__SourceAssignment_2_in_rule__Exploits__Group__2__Impl9235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__3__Impl_in_rule__Exploits__Group__39265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exploits__Group__4_in_rule__Exploits__Group__39268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Exploits__Group__3__Impl9296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__4__Impl_in_rule__Exploits__Group__49327 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__5_in_rule__Exploits__Group__49330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__TargetAssignment_4_in_rule__Exploits__Group__4__Impl9357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__5__Impl_in_rule__Exploits__Group__59387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Exploits__Group__5__Impl9415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__0__Impl_in_rule__Damages__Group__09458 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__1_in_rule__Damages__Group__09461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__TypeAssignment_0_in_rule__Damages__Group__0__Impl9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__1__Impl_in_rule__Damages__Group__19518 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Damages__Group__2_in_rule__Damages__Group__19521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Damages__Group__1__Impl9549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__2__Impl_in_rule__Damages__Group__29580 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__3_in_rule__Damages__Group__29583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__SourceAssignment_2_in_rule__Damages__Group__2__Impl9610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__3__Impl_in_rule__Damages__Group__39640 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Damages__Group__4_in_rule__Damages__Group__39643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Damages__Group__3__Impl9671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__4__Impl_in_rule__Damages__Group__49702 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__5_in_rule__Damages__Group__49705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__TargetAssignment_4_in_rule__Damages__Group__4__Impl9732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__5__Impl_in_rule__Damages__Group__59762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Damages__Group__5__Impl9790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__0__Impl_in_rule__Attacks__Group__09833 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Attacks__Group__1_in_rule__Attacks__Group__09836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__TypeAssignment_0_in_rule__Attacks__Group__0__Impl9863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__1__Impl_in_rule__Attacks__Group__19893 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacks__Group__2_in_rule__Attacks__Group__19896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Attacks__Group__1__Impl9924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__2__Impl_in_rule__Attacks__Group__29955 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Attacks__Group__3_in_rule__Attacks__Group__29958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__SourceAssignment_2_in_rule__Attacks__Group__2__Impl9985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__3__Impl_in_rule__Attacks__Group__310015 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacks__Group__4_in_rule__Attacks__Group__310018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Attacks__Group__3__Impl10046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__4__Impl_in_rule__Attacks__Group__410077 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Attacks__Group__5_in_rule__Attacks__Group__410080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__TargetAssignment_4_in_rule__Attacks__Group__4__Impl10107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__5__Impl_in_rule__Attacks__Group__510137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Attacks__Group__5__Impl10165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__0__Impl_in_rule__Argues__Group__010208 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__1_in_rule__Argues__Group__010211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__TypeAssignment_0_in_rule__Argues__Group__0__Impl10238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__1__Impl_in_rule__Argues__Group__110268 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argues__Group__2_in_rule__Argues__Group__110271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Argues__Group__1__Impl10299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__2__Impl_in_rule__Argues__Group__210330 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__3_in_rule__Argues__Group__210333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__SourceAssignment_2_in_rule__Argues__Group__2__Impl10360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__3__Impl_in_rule__Argues__Group__310390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argues__Group__4_in_rule__Argues__Group__310393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Argues__Group__3__Impl10421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__4__Impl_in_rule__Argues__Group__410452 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__5_in_rule__Argues__Group__410455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__TargetAssignment_4_in_rule__Argues__Group__4__Impl10482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__5__Impl_in_rule__Argues__Group__510512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Argues__Group__5__Impl10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_110588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_110619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePhysicalWorld_in_rule__World__PhysicalAssignment_110650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBeliefWorld_in_rule__World__BeliefAssignment_210681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_110712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__PhysicalWorld__EntitiesAssignment_110743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__BeliefWorld__DomainsAssignment_1_010774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__BeliefWorld__RelationshipsAssignment_1_110805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_010836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainType_in_rule__Domain__TypeAssignment_110867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_210898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_3_110929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropositionType_in_rule__Proposition__TypeAssignment_010960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Proposition__NameAssignment_110991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Stakeholder__NameAssignment_111022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_111053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NaturalProcess__NameAssignment_111084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NaturalProcess__ActivitiesAssignment_2_111119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HumanActivity__NameAssignment_211154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__HumanActivity__ActionsAssignment_311185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_111216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_0_111247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_111278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Wants__TypeAssignment_011314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Wants__SourceAssignment_211357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Wants__TargetAssignment_411396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Does__TypeAssignment_011436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Does__SourceAssignment_211479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Does__TargetAssignment_411518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposesType_in_rule__Decomposes__TypeAssignment_011553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decomposes__SourceAssignment_211588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decomposes__TargetAssignment_411627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Trusts__TypeAssignment_011667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Trusts__SourceAssignment_211710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Trusts__TargetAssignment_411749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Delegates__TypeAssignment_011789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delegates__SourceAssignment_211832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delegates__TargetAssignment_411871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributesType_in_rule__Contributes__TypeAssignment_011906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Contributes__SourceAssignment_211941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Contributes__TargetAssignment_411980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfilsType_in_rule__Fulfils__TypeAssignment_012015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fulfils__SourceAssignment_212050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fulfils__TargetAssignment_412089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Provides__TypeAssignment_012129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provides__SourceAssignment_212172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provides__TargetAssignment_412211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Consumes__TypeAssignment_012251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Consumes__SourceAssignment_212294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Consumes__TargetAssignment_412333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Exploits__TypeAssignment_012373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exploits__SourceAssignment_212416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exploits__TargetAssignment_412455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Damages__TypeAssignment_012495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Damages__SourceAssignment_212538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Damages__TargetAssignment_412577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Attacks__TypeAssignment_012617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacks__SourceAssignment_212660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacks__TargetAssignment_412699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Argues__TypeAssignment_012739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argues__SourceAssignment_212782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argues__TargetAssignment_412821 = new BitSet(new long[]{0x0000000000000002L});

}