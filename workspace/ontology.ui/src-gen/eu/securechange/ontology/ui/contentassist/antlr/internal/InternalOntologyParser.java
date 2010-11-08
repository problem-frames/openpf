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


    // $ANTLR start entryRuleDomain
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:175:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:176:1: ( ruleDomain EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:177:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain303);
            ruleDomain();
            _fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain310); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:184:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:188:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:189:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:189:1: ( ( rule__Domain__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:190:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:191:1: ( rule__Domain__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:191:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain336);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:203:1: entryRuleProposition : ruleProposition EOF ;
    public final void entryRuleProposition() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:204:1: ( ruleProposition EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:205:1: ruleProposition EOF
            {
             before(grammarAccess.getPropositionRule()); 
            pushFollow(FOLLOW_ruleProposition_in_entryRuleProposition363);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getPropositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProposition370); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:212:1: ruleProposition : ( ( rule__Proposition__Alternatives ) ) ;
    public final void ruleProposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:216:2: ( ( ( rule__Proposition__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:217:1: ( ( rule__Proposition__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:217:1: ( ( rule__Proposition__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:218:1: ( rule__Proposition__Alternatives )
            {
             before(grammarAccess.getPropositionAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:219:1: ( rule__Proposition__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:219:2: rule__Proposition__Alternatives
            {
            pushFollow(FOLLOW_rule__Proposition__Alternatives_in_ruleProposition396);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:231:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:232:1: ( ruleRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:233:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement423);
            ruleRequirement();
            _fsp--;

             after(grammarAccess.getRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement430); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:240:1: ruleRequirement : ( ( rule__Requirement__Alternatives ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:244:2: ( ( ( rule__Requirement__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:245:1: ( ( rule__Requirement__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:245:1: ( ( rule__Requirement__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:246:1: ( rule__Requirement__Alternatives )
            {
             before(grammarAccess.getRequirementAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:247:1: ( rule__Requirement__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:247:2: rule__Requirement__Alternatives
            {
            pushFollow(FOLLOW_rule__Requirement__Alternatives_in_ruleRequirement456);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:259:1: entryRuleDomainAssumption : ruleDomainAssumption EOF ;
    public final void entryRuleDomainAssumption() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:260:1: ( ruleDomainAssumption EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:261:1: ruleDomainAssumption EOF
            {
             before(grammarAccess.getDomainAssumptionRule()); 
            pushFollow(FOLLOW_ruleDomainAssumption_in_entryRuleDomainAssumption483);
            ruleDomainAssumption();
            _fsp--;

             after(grammarAccess.getDomainAssumptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomainAssumption490); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:268:1: ruleDomainAssumption : ( ( rule__DomainAssumption__Group__0 ) ) ;
    public final void ruleDomainAssumption() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:272:2: ( ( ( rule__DomainAssumption__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:273:1: ( ( rule__DomainAssumption__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:273:1: ( ( rule__DomainAssumption__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:274:1: ( rule__DomainAssumption__Group__0 )
            {
             before(grammarAccess.getDomainAssumptionAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:275:1: ( rule__DomainAssumption__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:275:2: rule__DomainAssumption__Group__0
            {
            pushFollow(FOLLOW_rule__DomainAssumption__Group__0_in_ruleDomainAssumption516);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:287:1: entryRuleFunctionalRequirement : ruleFunctionalRequirement EOF ;
    public final void entryRuleFunctionalRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:288:1: ( ruleFunctionalRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:289:1: ruleFunctionalRequirement EOF
            {
             before(grammarAccess.getFunctionalRequirementRule()); 
            pushFollow(FOLLOW_ruleFunctionalRequirement_in_entryRuleFunctionalRequirement543);
            ruleFunctionalRequirement();
            _fsp--;

             after(grammarAccess.getFunctionalRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFunctionalRequirement550); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:296:1: ruleFunctionalRequirement : ( ( rule__FunctionalRequirement__Group__0 ) ) ;
    public final void ruleFunctionalRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:300:2: ( ( ( rule__FunctionalRequirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:301:1: ( ( rule__FunctionalRequirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:301:1: ( ( rule__FunctionalRequirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:302:1: ( rule__FunctionalRequirement__Group__0 )
            {
             before(grammarAccess.getFunctionalRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:303:1: ( rule__FunctionalRequirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:303:2: rule__FunctionalRequirement__Group__0
            {
            pushFollow(FOLLOW_rule__FunctionalRequirement__Group__0_in_ruleFunctionalRequirement576);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:315:1: entryRuleSecurityRequirement : ruleSecurityRequirement EOF ;
    public final void entryRuleSecurityRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:316:1: ( ruleSecurityRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:317:1: ruleSecurityRequirement EOF
            {
             before(grammarAccess.getSecurityRequirementRule()); 
            pushFollow(FOLLOW_ruleSecurityRequirement_in_entryRuleSecurityRequirement603);
            ruleSecurityRequirement();
            _fsp--;

             after(grammarAccess.getSecurityRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityRequirement610); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:324:1: ruleSecurityRequirement : ( ( rule__SecurityRequirement__Group__0 ) ) ;
    public final void ruleSecurityRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:328:2: ( ( ( rule__SecurityRequirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:329:1: ( ( rule__SecurityRequirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:329:1: ( ( rule__SecurityRequirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:330:1: ( rule__SecurityRequirement__Group__0 )
            {
             before(grammarAccess.getSecurityRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:331:1: ( rule__SecurityRequirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:331:2: rule__SecurityRequirement__Group__0
            {
            pushFollow(FOLLOW_rule__SecurityRequirement__Group__0_in_ruleSecurityRequirement636);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:343:1: entryRuleAntiRequirement : ruleAntiRequirement EOF ;
    public final void entryRuleAntiRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:344:1: ( ruleAntiRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:345:1: ruleAntiRequirement EOF
            {
             before(grammarAccess.getAntiRequirementRule()); 
            pushFollow(FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement663);
            ruleAntiRequirement();
            _fsp--;

             after(grammarAccess.getAntiRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntiRequirement670); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:352:1: ruleAntiRequirement : ( ( rule__AntiRequirement__Group__0 ) ) ;
    public final void ruleAntiRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:356:2: ( ( ( rule__AntiRequirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:357:1: ( ( rule__AntiRequirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:357:1: ( ( rule__AntiRequirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:358:1: ( rule__AntiRequirement__Group__0 )
            {
             before(grammarAccess.getAntiRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:359:1: ( rule__AntiRequirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:359:2: rule__AntiRequirement__Group__0
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group__0_in_ruleAntiRequirement696);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:371:1: entryRuleQualityRequirement : ruleQualityRequirement EOF ;
    public final void entryRuleQualityRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:372:1: ( ruleQualityRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:373:1: ruleQualityRequirement EOF
            {
             before(grammarAccess.getQualityRequirementRule()); 
            pushFollow(FOLLOW_ruleQualityRequirement_in_entryRuleQualityRequirement723);
            ruleQualityRequirement();
            _fsp--;

             after(grammarAccess.getQualityRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualityRequirement730); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:380:1: ruleQualityRequirement : ( ( rule__QualityRequirement__Group__0 ) ) ;
    public final void ruleQualityRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:384:2: ( ( ( rule__QualityRequirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:385:1: ( ( rule__QualityRequirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:385:1: ( ( rule__QualityRequirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:386:1: ( rule__QualityRequirement__Group__0 )
            {
             before(grammarAccess.getQualityRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:387:1: ( rule__QualityRequirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:387:2: rule__QualityRequirement__Group__0
            {
            pushFollow(FOLLOW_rule__QualityRequirement__Group__0_in_ruleQualityRequirement756);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:399:1: entryRuleArgument : ruleArgument EOF ;
    public final void entryRuleArgument() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:400:1: ( ruleArgument EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:401:1: ruleArgument EOF
            {
             before(grammarAccess.getArgumentRule()); 
            pushFollow(FOLLOW_ruleArgument_in_entryRuleArgument783);
            ruleArgument();
            _fsp--;

             after(grammarAccess.getArgumentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgument790); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:408:1: ruleArgument : ( ( rule__Argument__Group__0 ) ) ;
    public final void ruleArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:412:2: ( ( ( rule__Argument__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:413:1: ( ( rule__Argument__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:413:1: ( ( rule__Argument__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:414:1: ( rule__Argument__Group__0 )
            {
             before(grammarAccess.getArgumentAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:415:1: ( rule__Argument__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:415:2: rule__Argument__Group__0
            {
            pushFollow(FOLLOW_rule__Argument__Group__0_in_ruleArgument816);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:427:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:428:1: ( ruleEntity EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:429:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity843);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity850); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:436:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:440:2: ( ( ( rule__Entity__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:441:1: ( ( rule__Entity__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:441:1: ( ( rule__Entity__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:442:1: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:443:1: ( rule__Entity__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:443:2: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_rule__Entity__Alternatives_in_ruleEntity876);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:455:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:456:1: ( ruleActor EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:457:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor903);
            ruleActor();
            _fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor910); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:464:1: ruleActor : ( ( rule__Actor__Alternatives ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:468:2: ( ( ( rule__Actor__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:469:1: ( ( rule__Actor__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:469:1: ( ( rule__Actor__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:470:1: ( rule__Actor__Alternatives )
            {
             before(grammarAccess.getActorAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:471:1: ( rule__Actor__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:471:2: rule__Actor__Alternatives
            {
            pushFollow(FOLLOW_rule__Actor__Alternatives_in_ruleActor936);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:483:1: entryRuleStakeholder : ruleStakeholder EOF ;
    public final void entryRuleStakeholder() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:484:1: ( ruleStakeholder EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:485:1: ruleStakeholder EOF
            {
             before(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder963);
            ruleStakeholder();
            _fsp--;

             after(grammarAccess.getStakeholderRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder970); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:492:1: ruleStakeholder : ( ( rule__Stakeholder__Group__0 ) ) ;
    public final void ruleStakeholder() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:496:2: ( ( ( rule__Stakeholder__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:497:1: ( ( rule__Stakeholder__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:497:1: ( ( rule__Stakeholder__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:498:1: ( rule__Stakeholder__Group__0 )
            {
             before(grammarAccess.getStakeholderAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:499:1: ( rule__Stakeholder__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:499:2: rule__Stakeholder__Group__0
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__0_in_ruleStakeholder996);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:511:1: entryRuleAttacker : ruleAttacker EOF ;
    public final void entryRuleAttacker() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:512:1: ( ruleAttacker EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:513:1: ruleAttacker EOF
            {
             before(grammarAccess.getAttackerRule()); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker1023);
            ruleAttacker();
            _fsp--;

             after(grammarAccess.getAttackerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker1030); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:520:1: ruleAttacker : ( ( rule__Attacker__Group__0 ) ) ;
    public final void ruleAttacker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:524:2: ( ( ( rule__Attacker__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:525:1: ( ( rule__Attacker__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:525:1: ( ( rule__Attacker__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:526:1: ( rule__Attacker__Group__0 )
            {
             before(grammarAccess.getAttackerAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:527:1: ( rule__Attacker__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:527:2: rule__Attacker__Group__0
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0_in_ruleAttacker1056);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:539:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:540:1: ( ruleProcess EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:541:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FOLLOW_ruleProcess_in_entryRuleProcess1083);
            ruleProcess();
            _fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProcess1090); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:548:1: ruleProcess : ( ( rule__Process__Alternatives ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:552:2: ( ( ( rule__Process__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:553:1: ( ( rule__Process__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:553:1: ( ( rule__Process__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:554:1: ( rule__Process__Alternatives )
            {
             before(grammarAccess.getProcessAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:555:1: ( rule__Process__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:555:2: rule__Process__Alternatives
            {
            pushFollow(FOLLOW_rule__Process__Alternatives_in_ruleProcess1116);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:567:1: entryRuleNaturalProcess : ruleNaturalProcess EOF ;
    public final void entryRuleNaturalProcess() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:568:1: ( ruleNaturalProcess EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:569:1: ruleNaturalProcess EOF
            {
             before(grammarAccess.getNaturalProcessRule()); 
            pushFollow(FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess1143);
            ruleNaturalProcess();
            _fsp--;

             after(grammarAccess.getNaturalProcessRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalProcess1150); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:576:1: ruleNaturalProcess : ( ( rule__NaturalProcess__Group__0 ) ) ;
    public final void ruleNaturalProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:580:2: ( ( ( rule__NaturalProcess__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:581:1: ( ( rule__NaturalProcess__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:581:1: ( ( rule__NaturalProcess__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:582:1: ( rule__NaturalProcess__Group__0 )
            {
             before(grammarAccess.getNaturalProcessAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:583:1: ( rule__NaturalProcess__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:583:2: rule__NaturalProcess__Group__0
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__0_in_ruleNaturalProcess1176);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:595:1: entryRuleHumanActivity : ruleHumanActivity EOF ;
    public final void entryRuleHumanActivity() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:596:1: ( ruleHumanActivity EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:597:1: ruleHumanActivity EOF
            {
             before(grammarAccess.getHumanActivityRule()); 
            pushFollow(FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity1203);
            ruleHumanActivity();
            _fsp--;

             after(grammarAccess.getHumanActivityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleHumanActivity1210); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:604:1: ruleHumanActivity : ( ( rule__HumanActivity__Group__0 ) ) ;
    public final void ruleHumanActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:608:2: ( ( ( rule__HumanActivity__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:609:1: ( ( rule__HumanActivity__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:609:1: ( ( rule__HumanActivity__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:610:1: ( rule__HumanActivity__Group__0 )
            {
             before(grammarAccess.getHumanActivityAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:611:1: ( rule__HumanActivity__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:611:2: rule__HumanActivity__Group__0
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__0_in_ruleHumanActivity1236);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:623:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:624:1: ( ruleAction EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:625:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction1263);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction1270); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:632:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:636:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:637:1: ( ( rule__Action__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:637:1: ( ( rule__Action__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:638:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:639:1: ( rule__Action__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:639:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction1296);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:651:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:652:1: ( ruleResource EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:653:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource1323);
            ruleResource();
            _fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource1330); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:660:1: ruleResource : ( ( rule__Resource__Alternatives ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:664:2: ( ( ( rule__Resource__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:665:1: ( ( rule__Resource__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:665:1: ( ( rule__Resource__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:666:1: ( rule__Resource__Alternatives )
            {
             before(grammarAccess.getResourceAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:667:1: ( rule__Resource__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:667:2: rule__Resource__Alternatives
            {
            pushFollow(FOLLOW_rule__Resource__Alternatives_in_ruleResource1356);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:679:1: entryRuleAsset : ruleAsset EOF ;
    public final void entryRuleAsset() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:680:1: ( ruleAsset EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:681:1: ruleAsset EOF
            {
             before(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset1383);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getAssetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset1390); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:688:1: ruleAsset : ( ( rule__Asset__Group__0 ) ) ;
    public final void ruleAsset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:692:2: ( ( ( rule__Asset__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:693:1: ( ( rule__Asset__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:693:1: ( ( rule__Asset__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:694:1: ( rule__Asset__Group__0 )
            {
             before(grammarAccess.getAssetAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:695:1: ( rule__Asset__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:695:2: rule__Asset__Group__0
            {
            pushFollow(FOLLOW_rule__Asset__Group__0_in_ruleAsset1416);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:707:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:708:1: ( ruleRelationship EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:709:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship1443);
            ruleRelationship();
            _fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship1450); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:716:1: ruleRelationship : ( ( rule__Relationship__Alternatives ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:720:2: ( ( ( rule__Relationship__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:721:1: ( ( rule__Relationship__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:721:1: ( ( rule__Relationship__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:722:1: ( rule__Relationship__Alternatives )
            {
             before(grammarAccess.getRelationshipAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:723:1: ( rule__Relationship__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:723:2: rule__Relationship__Alternatives
            {
            pushFollow(FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship1476);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:735:1: entryRuleWants : ruleWants EOF ;
    public final void entryRuleWants() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:736:1: ( ruleWants EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:737:1: ruleWants EOF
            {
             before(grammarAccess.getWantsRule()); 
            pushFollow(FOLLOW_ruleWants_in_entryRuleWants1503);
            ruleWants();
            _fsp--;

             after(grammarAccess.getWantsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWants1510); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:744:1: ruleWants : ( ( rule__Wants__Group__0 ) ) ;
    public final void ruleWants() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:748:2: ( ( ( rule__Wants__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:749:1: ( ( rule__Wants__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:749:1: ( ( rule__Wants__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:750:1: ( rule__Wants__Group__0 )
            {
             before(grammarAccess.getWantsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:751:1: ( rule__Wants__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:751:2: rule__Wants__Group__0
            {
            pushFollow(FOLLOW_rule__Wants__Group__0_in_ruleWants1536);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:763:1: entryRuleDoes : ruleDoes EOF ;
    public final void entryRuleDoes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:764:1: ( ruleDoes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:765:1: ruleDoes EOF
            {
             before(grammarAccess.getDoesRule()); 
            pushFollow(FOLLOW_ruleDoes_in_entryRuleDoes1563);
            ruleDoes();
            _fsp--;

             after(grammarAccess.getDoesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDoes1570); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:772:1: ruleDoes : ( ( rule__Does__Group__0 ) ) ;
    public final void ruleDoes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:776:2: ( ( ( rule__Does__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:777:1: ( ( rule__Does__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:777:1: ( ( rule__Does__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:778:1: ( rule__Does__Group__0 )
            {
             before(grammarAccess.getDoesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:779:1: ( rule__Does__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:779:2: rule__Does__Group__0
            {
            pushFollow(FOLLOW_rule__Does__Group__0_in_ruleDoes1596);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:791:1: entryRuleDecomposes : ruleDecomposes EOF ;
    public final void entryRuleDecomposes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:792:1: ( ruleDecomposes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:793:1: ruleDecomposes EOF
            {
             before(grammarAccess.getDecomposesRule()); 
            pushFollow(FOLLOW_ruleDecomposes_in_entryRuleDecomposes1623);
            ruleDecomposes();
            _fsp--;

             after(grammarAccess.getDecomposesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDecomposes1630); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:800:1: ruleDecomposes : ( ( rule__Decomposes__Group__0 ) ) ;
    public final void ruleDecomposes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:804:2: ( ( ( rule__Decomposes__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:805:1: ( ( rule__Decomposes__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:805:1: ( ( rule__Decomposes__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:806:1: ( rule__Decomposes__Group__0 )
            {
             before(grammarAccess.getDecomposesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:807:1: ( rule__Decomposes__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:807:2: rule__Decomposes__Group__0
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__0_in_ruleDecomposes1656);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:819:1: entryRuleTrusts : ruleTrusts EOF ;
    public final void entryRuleTrusts() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:820:1: ( ruleTrusts EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:821:1: ruleTrusts EOF
            {
             before(grammarAccess.getTrustsRule()); 
            pushFollow(FOLLOW_ruleTrusts_in_entryRuleTrusts1683);
            ruleTrusts();
            _fsp--;

             after(grammarAccess.getTrustsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTrusts1690); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:828:1: ruleTrusts : ( ( rule__Trusts__Group__0 ) ) ;
    public final void ruleTrusts() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:832:2: ( ( ( rule__Trusts__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:833:1: ( ( rule__Trusts__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:833:1: ( ( rule__Trusts__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:834:1: ( rule__Trusts__Group__0 )
            {
             before(grammarAccess.getTrustsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:835:1: ( rule__Trusts__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:835:2: rule__Trusts__Group__0
            {
            pushFollow(FOLLOW_rule__Trusts__Group__0_in_ruleTrusts1716);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:847:1: entryRuleDelegates : ruleDelegates EOF ;
    public final void entryRuleDelegates() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:848:1: ( ruleDelegates EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:849:1: ruleDelegates EOF
            {
             before(grammarAccess.getDelegatesRule()); 
            pushFollow(FOLLOW_ruleDelegates_in_entryRuleDelegates1743);
            ruleDelegates();
            _fsp--;

             after(grammarAccess.getDelegatesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDelegates1750); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:856:1: ruleDelegates : ( ( rule__Delegates__Group__0 ) ) ;
    public final void ruleDelegates() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:860:2: ( ( ( rule__Delegates__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:861:1: ( ( rule__Delegates__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:861:1: ( ( rule__Delegates__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:862:1: ( rule__Delegates__Group__0 )
            {
             before(grammarAccess.getDelegatesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:863:1: ( rule__Delegates__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:863:2: rule__Delegates__Group__0
            {
            pushFollow(FOLLOW_rule__Delegates__Group__0_in_ruleDelegates1776);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:875:1: entryRuleContributes : ruleContributes EOF ;
    public final void entryRuleContributes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:876:1: ( ruleContributes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:877:1: ruleContributes EOF
            {
             before(grammarAccess.getContributesRule()); 
            pushFollow(FOLLOW_ruleContributes_in_entryRuleContributes1803);
            ruleContributes();
            _fsp--;

             after(grammarAccess.getContributesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContributes1810); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:884:1: ruleContributes : ( ( rule__Contributes__Group__0 ) ) ;
    public final void ruleContributes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:888:2: ( ( ( rule__Contributes__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:889:1: ( ( rule__Contributes__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:889:1: ( ( rule__Contributes__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:890:1: ( rule__Contributes__Group__0 )
            {
             before(grammarAccess.getContributesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:891:1: ( rule__Contributes__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:891:2: rule__Contributes__Group__0
            {
            pushFollow(FOLLOW_rule__Contributes__Group__0_in_ruleContributes1836);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:903:1: entryRuleFulfils : ruleFulfils EOF ;
    public final void entryRuleFulfils() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:904:1: ( ruleFulfils EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:905:1: ruleFulfils EOF
            {
             before(grammarAccess.getFulfilsRule()); 
            pushFollow(FOLLOW_ruleFulfils_in_entryRuleFulfils1863);
            ruleFulfils();
            _fsp--;

             after(grammarAccess.getFulfilsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleFulfils1870); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:912:1: ruleFulfils : ( ( rule__Fulfils__Group__0 ) ) ;
    public final void ruleFulfils() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:916:2: ( ( ( rule__Fulfils__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:917:1: ( ( rule__Fulfils__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:917:1: ( ( rule__Fulfils__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:918:1: ( rule__Fulfils__Group__0 )
            {
             before(grammarAccess.getFulfilsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:919:1: ( rule__Fulfils__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:919:2: rule__Fulfils__Group__0
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__0_in_ruleFulfils1896);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:931:1: entryRuleProvides : ruleProvides EOF ;
    public final void entryRuleProvides() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:932:1: ( ruleProvides EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:933:1: ruleProvides EOF
            {
             before(grammarAccess.getProvidesRule()); 
            pushFollow(FOLLOW_ruleProvides_in_entryRuleProvides1923);
            ruleProvides();
            _fsp--;

             after(grammarAccess.getProvidesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProvides1930); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:940:1: ruleProvides : ( ( rule__Provides__Group__0 ) ) ;
    public final void ruleProvides() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:944:2: ( ( ( rule__Provides__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:945:1: ( ( rule__Provides__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:945:1: ( ( rule__Provides__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:946:1: ( rule__Provides__Group__0 )
            {
             before(grammarAccess.getProvidesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:947:1: ( rule__Provides__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:947:2: rule__Provides__Group__0
            {
            pushFollow(FOLLOW_rule__Provides__Group__0_in_ruleProvides1956);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:959:1: entryRuleConsumes : ruleConsumes EOF ;
    public final void entryRuleConsumes() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:960:1: ( ruleConsumes EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:961:1: ruleConsumes EOF
            {
             before(grammarAccess.getConsumesRule()); 
            pushFollow(FOLLOW_ruleConsumes_in_entryRuleConsumes1983);
            ruleConsumes();
            _fsp--;

             after(grammarAccess.getConsumesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConsumes1990); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:968:1: ruleConsumes : ( ( rule__Consumes__Group__0 ) ) ;
    public final void ruleConsumes() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:972:2: ( ( ( rule__Consumes__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:973:1: ( ( rule__Consumes__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:973:1: ( ( rule__Consumes__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:974:1: ( rule__Consumes__Group__0 )
            {
             before(grammarAccess.getConsumesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:975:1: ( rule__Consumes__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:975:2: rule__Consumes__Group__0
            {
            pushFollow(FOLLOW_rule__Consumes__Group__0_in_ruleConsumes2016);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:987:1: entryRuleExploits : ruleExploits EOF ;
    public final void entryRuleExploits() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:988:1: ( ruleExploits EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:989:1: ruleExploits EOF
            {
             before(grammarAccess.getExploitsRule()); 
            pushFollow(FOLLOW_ruleExploits_in_entryRuleExploits2043);
            ruleExploits();
            _fsp--;

             after(grammarAccess.getExploitsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExploits2050); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:996:1: ruleExploits : ( ( rule__Exploits__Group__0 ) ) ;
    public final void ruleExploits() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1000:2: ( ( ( rule__Exploits__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1001:1: ( ( rule__Exploits__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1001:1: ( ( rule__Exploits__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1002:1: ( rule__Exploits__Group__0 )
            {
             before(grammarAccess.getExploitsAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1003:1: ( rule__Exploits__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1003:2: rule__Exploits__Group__0
            {
            pushFollow(FOLLOW_rule__Exploits__Group__0_in_ruleExploits2076);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1015:1: entryRuleDamages : ruleDamages EOF ;
    public final void entryRuleDamages() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1016:1: ( ruleDamages EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1017:1: ruleDamages EOF
            {
             before(grammarAccess.getDamagesRule()); 
            pushFollow(FOLLOW_ruleDamages_in_entryRuleDamages2103);
            ruleDamages();
            _fsp--;

             after(grammarAccess.getDamagesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDamages2110); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1024:1: ruleDamages : ( ( rule__Damages__Group__0 ) ) ;
    public final void ruleDamages() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1028:2: ( ( ( rule__Damages__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1029:1: ( ( rule__Damages__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1029:1: ( ( rule__Damages__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1030:1: ( rule__Damages__Group__0 )
            {
             before(grammarAccess.getDamagesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1031:1: ( rule__Damages__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1031:2: rule__Damages__Group__0
            {
            pushFollow(FOLLOW_rule__Damages__Group__0_in_ruleDamages2136);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1043:1: entryRuleAttacks : ruleAttacks EOF ;
    public final void entryRuleAttacks() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1044:1: ( ruleAttacks EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1045:1: ruleAttacks EOF
            {
             before(grammarAccess.getAttacksRule()); 
            pushFollow(FOLLOW_ruleAttacks_in_entryRuleAttacks2163);
            ruleAttacks();
            _fsp--;

             after(grammarAccess.getAttacksRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacks2170); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1052:1: ruleAttacks : ( ( rule__Attacks__Group__0 ) ) ;
    public final void ruleAttacks() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1056:2: ( ( ( rule__Attacks__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1057:1: ( ( rule__Attacks__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1057:1: ( ( rule__Attacks__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1058:1: ( rule__Attacks__Group__0 )
            {
             before(grammarAccess.getAttacksAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1059:1: ( rule__Attacks__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1059:2: rule__Attacks__Group__0
            {
            pushFollow(FOLLOW_rule__Attacks__Group__0_in_ruleAttacks2196);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1071:1: entryRuleArgues : ruleArgues EOF ;
    public final void entryRuleArgues() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1072:1: ( ruleArgues EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1073:1: ruleArgues EOF
            {
             before(grammarAccess.getArguesRule()); 
            pushFollow(FOLLOW_ruleArgues_in_entryRuleArgues2223);
            ruleArgues();
            _fsp--;

             after(grammarAccess.getArguesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgues2230); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1080:1: ruleArgues : ( ( rule__Argues__Group__0 ) ) ;
    public final void ruleArgues() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1084:2: ( ( ( rule__Argues__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1085:1: ( ( rule__Argues__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1085:1: ( ( rule__Argues__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1086:1: ( rule__Argues__Group__0 )
            {
             before(grammarAccess.getArguesAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1087:1: ( rule__Argues__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1087:2: rule__Argues__Group__0
            {
            pushFollow(FOLLOW_rule__Argues__Group__0_in_ruleArgues2256);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1100:1: ruleDomainType : ( ( rule__DomainType__Alternatives ) ) ;
    public final void ruleDomainType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1104:1: ( ( ( rule__DomainType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1105:1: ( ( rule__DomainType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1105:1: ( ( rule__DomainType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1106:1: ( rule__DomainType__Alternatives )
            {
             before(grammarAccess.getDomainTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1107:1: ( rule__DomainType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1107:2: rule__DomainType__Alternatives
            {
            pushFollow(FOLLOW_rule__DomainType__Alternatives_in_ruleDomainType2293);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1119:1: ruleDecomposesType : ( ( rule__DecomposesType__Alternatives ) ) ;
    public final void ruleDecomposesType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1123:1: ( ( ( rule__DecomposesType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1124:1: ( ( rule__DecomposesType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1124:1: ( ( rule__DecomposesType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1125:1: ( rule__DecomposesType__Alternatives )
            {
             before(grammarAccess.getDecomposesTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1126:1: ( rule__DecomposesType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1126:2: rule__DecomposesType__Alternatives
            {
            pushFollow(FOLLOW_rule__DecomposesType__Alternatives_in_ruleDecomposesType2329);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1138:1: ruleContributesType : ( ( rule__ContributesType__Alternatives ) ) ;
    public final void ruleContributesType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1142:1: ( ( ( rule__ContributesType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1143:1: ( ( rule__ContributesType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1143:1: ( ( rule__ContributesType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1144:1: ( rule__ContributesType__Alternatives )
            {
             before(grammarAccess.getContributesTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1145:1: ( rule__ContributesType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1145:2: rule__ContributesType__Alternatives
            {
            pushFollow(FOLLOW_rule__ContributesType__Alternatives_in_ruleContributesType2365);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1157:1: ruleFulfilsType : ( ( 'fulfils' ) ) ;
    public final void ruleFulfilsType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1161:1: ( ( ( 'fulfils' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1162:1: ( ( 'fulfils' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1162:1: ( ( 'fulfils' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1163:1: ( 'fulfils' )
            {
             before(grammarAccess.getFulfilsTypeAccess().getFulfilsEnumLiteralDeclaration()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1164:1: ( 'fulfils' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1164:3: 'fulfils'
            {
            match(input,11,FOLLOW_11_in_ruleFulfilsType2402); 

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


    // $ANTLR start rule__World__Alternatives_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1176:1: rule__World__Alternatives_1 : ( ( ( rule__World__EntitiesAssignment_1_0 ) ) | ( ( rule__World__DomainsAssignment_1_1 ) ) | ( ( rule__World__RelationshipsAssignment_1_2 ) ) );
    public final void rule__World__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1180:1: ( ( ( rule__World__EntitiesAssignment_1_0 ) ) | ( ( rule__World__DomainsAssignment_1_1 ) ) | ( ( rule__World__RelationshipsAssignment_1_2 ) ) )
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
            case RULE_ID:
                {
                alt1=2;
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
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1176:1: rule__World__Alternatives_1 : ( ( ( rule__World__EntitiesAssignment_1_0 ) ) | ( ( rule__World__DomainsAssignment_1_1 ) ) | ( ( rule__World__RelationshipsAssignment_1_2 ) ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1181:1: ( ( rule__World__EntitiesAssignment_1_0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1181:1: ( ( rule__World__EntitiesAssignment_1_0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1182:1: ( rule__World__EntitiesAssignment_1_0 )
                    {
                     before(grammarAccess.getWorldAccess().getEntitiesAssignment_1_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1183:1: ( rule__World__EntitiesAssignment_1_0 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1183:2: rule__World__EntitiesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__World__EntitiesAssignment_1_0_in_rule__World__Alternatives_12439);
                    rule__World__EntitiesAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getWorldAccess().getEntitiesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1187:6: ( ( rule__World__DomainsAssignment_1_1 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1187:6: ( ( rule__World__DomainsAssignment_1_1 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1188:1: ( rule__World__DomainsAssignment_1_1 )
                    {
                     before(grammarAccess.getWorldAccess().getDomainsAssignment_1_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1189:1: ( rule__World__DomainsAssignment_1_1 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1189:2: rule__World__DomainsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__World__DomainsAssignment_1_1_in_rule__World__Alternatives_12457);
                    rule__World__DomainsAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getWorldAccess().getDomainsAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1193:6: ( ( rule__World__RelationshipsAssignment_1_2 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1193:6: ( ( rule__World__RelationshipsAssignment_1_2 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1194:1: ( rule__World__RelationshipsAssignment_1_2 )
                    {
                     before(grammarAccess.getWorldAccess().getRelationshipsAssignment_1_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1195:1: ( rule__World__RelationshipsAssignment_1_2 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1195:2: rule__World__RelationshipsAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__World__RelationshipsAssignment_1_2_in_rule__World__Alternatives_12475);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1205:1: rule__Object__Alternatives : ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleProposition ) );
    public final void rule__Object__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1209:1: ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleProposition ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
            case 33:
            case 36:
            case 38:
            case 39:
                {
                alt2=1;
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
                alt2=2;
                }
                break;
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1205:1: rule__Object__Alternatives : ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleProposition ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1210:1: ( ruleEntity )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1210:1: ( ruleEntity )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1211:1: ruleEntity
                    {
                     before(grammarAccess.getObjectAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Object__Alternatives2509);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1216:6: ( ruleRelationship )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1216:6: ( ruleRelationship )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1217:1: ruleRelationship
                    {
                     before(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelationship_in_rule__Object__Alternatives2526);
                    ruleRelationship();
                    _fsp--;

                     after(grammarAccess.getObjectAccess().getRelationshipParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1222:6: ( ruleProposition )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1222:6: ( ruleProposition )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1223:1: ruleProposition
                    {
                     before(grammarAccess.getObjectAccess().getPropositionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleProposition_in_rule__Object__Alternatives2543);
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


    // $ANTLR start rule__Proposition__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1233:1: rule__Proposition__Alternatives : ( ( ruleDomainAssumption ) | ( ruleRequirement ) | ( ruleArgument ) );
    public final void rule__Proposition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1237:1: ( ( ruleDomainAssumption ) | ( ruleRequirement ) | ( ruleArgument ) )
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
                    new NoViableAltException("1233:1: rule__Proposition__Alternatives : ( ( ruleDomainAssumption ) | ( ruleRequirement ) | ( ruleArgument ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1238:1: ( ruleDomainAssumption )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1238:1: ( ruleDomainAssumption )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1239:1: ruleDomainAssumption
                    {
                     before(grammarAccess.getPropositionAccess().getDomainAssumptionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleDomainAssumption_in_rule__Proposition__Alternatives2575);
                    ruleDomainAssumption();
                    _fsp--;

                     after(grammarAccess.getPropositionAccess().getDomainAssumptionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1244:6: ( ruleRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1244:6: ( ruleRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1245:1: ruleRequirement
                    {
                     before(grammarAccess.getPropositionAccess().getRequirementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRequirement_in_rule__Proposition__Alternatives2592);
                    ruleRequirement();
                    _fsp--;

                     after(grammarAccess.getPropositionAccess().getRequirementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1250:6: ( ruleArgument )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1250:6: ( ruleArgument )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1251:1: ruleArgument
                    {
                     before(grammarAccess.getPropositionAccess().getArgumentParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleArgument_in_rule__Proposition__Alternatives2609);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1261:1: rule__Requirement__Alternatives : ( ( ruleFunctionalRequirement ) | ( ruleSecurityRequirement ) | ( ruleAntiRequirement ) | ( ruleQualityRequirement ) );
    public final void rule__Requirement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1265:1: ( ( ruleFunctionalRequirement ) | ( ruleSecurityRequirement ) | ( ruleAntiRequirement ) | ( ruleQualityRequirement ) )
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
                    new NoViableAltException("1261:1: rule__Requirement__Alternatives : ( ( ruleFunctionalRequirement ) | ( ruleSecurityRequirement ) | ( ruleAntiRequirement ) | ( ruleQualityRequirement ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1266:1: ( ruleFunctionalRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1266:1: ( ruleFunctionalRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1267:1: ruleFunctionalRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getFunctionalRequirementParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleFunctionalRequirement_in_rule__Requirement__Alternatives2641);
                    ruleFunctionalRequirement();
                    _fsp--;

                     after(grammarAccess.getRequirementAccess().getFunctionalRequirementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1272:6: ( ruleSecurityRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1272:6: ( ruleSecurityRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1273:1: ruleSecurityRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getSecurityRequirementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSecurityRequirement_in_rule__Requirement__Alternatives2658);
                    ruleSecurityRequirement();
                    _fsp--;

                     after(grammarAccess.getRequirementAccess().getSecurityRequirementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1278:6: ( ruleAntiRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1278:6: ( ruleAntiRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1279:1: ruleAntiRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getAntiRequirementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAntiRequirement_in_rule__Requirement__Alternatives2675);
                    ruleAntiRequirement();
                    _fsp--;

                     after(grammarAccess.getRequirementAccess().getAntiRequirementParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1284:6: ( ruleQualityRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1284:6: ( ruleQualityRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1285:1: ruleQualityRequirement
                    {
                     before(grammarAccess.getRequirementAccess().getQualityRequirementParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleQualityRequirement_in_rule__Requirement__Alternatives2692);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1295:1: rule__Entity__Alternatives : ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1299:1: ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) )
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
                    new NoViableAltException("1295:1: rule__Entity__Alternatives : ( ( ruleActor ) | ( ruleProcess ) | ( ruleResource ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1300:1: ( ruleActor )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1300:1: ( ruleActor )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1301:1: ruleActor
                    {
                     before(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Entity__Alternatives2724);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1306:6: ( ruleProcess )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1306:6: ( ruleProcess )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1307:1: ruleProcess
                    {
                     before(grammarAccess.getEntityAccess().getProcessParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleProcess_in_rule__Entity__Alternatives2741);
                    ruleProcess();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getProcessParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1312:6: ( ruleResource )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1312:6: ( ruleResource )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1313:1: ruleResource
                    {
                     before(grammarAccess.getEntityAccess().getResourceParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Entity__Alternatives2758);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1323:1: rule__Actor__Alternatives : ( ( ruleStakeholder ) | ( ruleAttacker ) );
    public final void rule__Actor__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1327:1: ( ( ruleStakeholder ) | ( ruleAttacker ) )
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
                    new NoViableAltException("1323:1: rule__Actor__Alternatives : ( ( ruleStakeholder ) | ( ruleAttacker ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1328:1: ( ruleStakeholder )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1328:1: ( ruleStakeholder )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1329:1: ruleStakeholder
                    {
                     before(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleStakeholder_in_rule__Actor__Alternatives2790);
                    ruleStakeholder();
                    _fsp--;

                     after(grammarAccess.getActorAccess().getStakeholderParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1334:6: ( ruleAttacker )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1334:6: ( ruleAttacker )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1335:1: ruleAttacker
                    {
                     before(grammarAccess.getActorAccess().getAttackerParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAttacker_in_rule__Actor__Alternatives2807);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1345:1: rule__Process__Alternatives : ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) );
    public final void rule__Process__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1349:1: ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) )
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
                    new NoViableAltException("1345:1: rule__Process__Alternatives : ( ( ruleNaturalProcess ) | ( ruleHumanActivity ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1350:1: ( ruleNaturalProcess )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1350:1: ( ruleNaturalProcess )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1351:1: ruleNaturalProcess
                    {
                     before(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNaturalProcess_in_rule__Process__Alternatives2839);
                    ruleNaturalProcess();
                    _fsp--;

                     after(grammarAccess.getProcessAccess().getNaturalProcessParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1356:6: ( ruleHumanActivity )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1356:6: ( ruleHumanActivity )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1357:1: ruleHumanActivity
                    {
                     before(grammarAccess.getProcessAccess().getHumanActivityParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleHumanActivity_in_rule__Process__Alternatives2856);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1367:1: rule__Resource__Alternatives : ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) );
    public final void rule__Resource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1371:1: ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) )
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
                    new NoViableAltException("1367:1: rule__Resource__Alternatives : ( ( ( rule__Resource__Group_0__0 ) ) | ( ruleAsset ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1372:1: ( ( rule__Resource__Group_0__0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1372:1: ( ( rule__Resource__Group_0__0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1373:1: ( rule__Resource__Group_0__0 )
                    {
                     before(grammarAccess.getResourceAccess().getGroup_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1374:1: ( rule__Resource__Group_0__0 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1374:2: rule__Resource__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Resource__Group_0__0_in_rule__Resource__Alternatives2888);
                    rule__Resource__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getResourceAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1378:6: ( ruleAsset )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1378:6: ( ruleAsset )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1379:1: ruleAsset
                    {
                     before(grammarAccess.getResourceAccess().getAssetParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAsset_in_rule__Resource__Alternatives2906);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1389:1: rule__Relationship__Alternatives : ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleTrusts ) | ( ruleDelegates ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttacks ) | ( ruleArgues ) );
    public final void rule__Relationship__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1393:1: ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleTrusts ) | ( ruleDelegates ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttacks ) | ( ruleArgues ) )
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
                    new NoViableAltException("1389:1: rule__Relationship__Alternatives : ( ( ruleWants ) | ( ruleDoes ) | ( ruleDecomposes ) | ( ruleTrusts ) | ( ruleDelegates ) | ( ruleContributes ) | ( ruleFulfils ) | ( ruleProvides ) | ( ruleConsumes ) | ( ruleExploits ) | ( ruleDamages ) | ( ruleAttacks ) | ( ruleArgues ) );", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1394:1: ( ruleWants )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1394:1: ( ruleWants )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1395:1: ruleWants
                    {
                     before(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWants_in_rule__Relationship__Alternatives2938);
                    ruleWants();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getWantsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1400:6: ( ruleDoes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1400:6: ( ruleDoes )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1401:1: ruleDoes
                    {
                     before(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDoes_in_rule__Relationship__Alternatives2955);
                    ruleDoes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDoesParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1406:6: ( ruleDecomposes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1406:6: ( ruleDecomposes )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1407:1: ruleDecomposes
                    {
                     before(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDecomposes_in_rule__Relationship__Alternatives2972);
                    ruleDecomposes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDecomposesParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1412:6: ( ruleTrusts )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1412:6: ( ruleTrusts )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1413:1: ruleTrusts
                    {
                     before(grammarAccess.getRelationshipAccess().getTrustsParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleTrusts_in_rule__Relationship__Alternatives2989);
                    ruleTrusts();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getTrustsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1418:6: ( ruleDelegates )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1418:6: ( ruleDelegates )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1419:1: ruleDelegates
                    {
                     before(grammarAccess.getRelationshipAccess().getDelegatesParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDelegates_in_rule__Relationship__Alternatives3006);
                    ruleDelegates();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDelegatesParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1424:6: ( ruleContributes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1424:6: ( ruleContributes )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1425:1: ruleContributes
                    {
                     before(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleContributes_in_rule__Relationship__Alternatives3023);
                    ruleContributes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getContributesParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1430:6: ( ruleFulfils )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1430:6: ( ruleFulfils )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1431:1: ruleFulfils
                    {
                     before(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleFulfils_in_rule__Relationship__Alternatives3040);
                    ruleFulfils();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getFulfilsParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1436:6: ( ruleProvides )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1436:6: ( ruleProvides )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1437:1: ruleProvides
                    {
                     before(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleProvides_in_rule__Relationship__Alternatives3057);
                    ruleProvides();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getProvidesParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1442:6: ( ruleConsumes )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1442:6: ( ruleConsumes )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1443:1: ruleConsumes
                    {
                     before(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_8()); 
                    pushFollow(FOLLOW_ruleConsumes_in_rule__Relationship__Alternatives3074);
                    ruleConsumes();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getConsumesParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1448:6: ( ruleExploits )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1448:6: ( ruleExploits )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1449:1: ruleExploits
                    {
                     before(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_9()); 
                    pushFollow(FOLLOW_ruleExploits_in_rule__Relationship__Alternatives3091);
                    ruleExploits();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getExploitsParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1454:6: ( ruleDamages )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1454:6: ( ruleDamages )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1455:1: ruleDamages
                    {
                     before(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_10()); 
                    pushFollow(FOLLOW_ruleDamages_in_rule__Relationship__Alternatives3108);
                    ruleDamages();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getDamagesParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1460:6: ( ruleAttacks )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1460:6: ( ruleAttacks )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1461:1: ruleAttacks
                    {
                     before(grammarAccess.getRelationshipAccess().getAttacksParserRuleCall_11()); 
                    pushFollow(FOLLOW_ruleAttacks_in_rule__Relationship__Alternatives3125);
                    ruleAttacks();
                    _fsp--;

                     after(grammarAccess.getRelationshipAccess().getAttacksParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1466:6: ( ruleArgues )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1466:6: ( ruleArgues )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1467:1: ruleArgues
                    {
                     before(grammarAccess.getRelationshipAccess().getArguesParserRuleCall_12()); 
                    pushFollow(FOLLOW_ruleArgues_in_rule__Relationship__Alternatives3142);
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


    // $ANTLR start rule__Provides__Alternatives_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1477:1: rule__Provides__Alternatives_2 : ( ( ( rule__Provides__SourceAssignment_2_0 ) ) | ( ( rule__Provides__SourceAssignment_2_1 ) ) );
    public final void rule__Provides__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1481:1: ( ( ( rule__Provides__SourceAssignment_2_0 ) ) | ( ( rule__Provides__SourceAssignment_2_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1477:1: rule__Provides__Alternatives_2 : ( ( ( rule__Provides__SourceAssignment_2_0 ) ) | ( ( rule__Provides__SourceAssignment_2_1 ) ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1482:1: ( ( rule__Provides__SourceAssignment_2_0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1482:1: ( ( rule__Provides__SourceAssignment_2_0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1483:1: ( rule__Provides__SourceAssignment_2_0 )
                    {
                     before(grammarAccess.getProvidesAccess().getSourceAssignment_2_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1484:1: ( rule__Provides__SourceAssignment_2_0 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1484:2: rule__Provides__SourceAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Provides__SourceAssignment_2_0_in_rule__Provides__Alternatives_23174);
                    rule__Provides__SourceAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getProvidesAccess().getSourceAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1488:6: ( ( rule__Provides__SourceAssignment_2_1 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1488:6: ( ( rule__Provides__SourceAssignment_2_1 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1489:1: ( rule__Provides__SourceAssignment_2_1 )
                    {
                     before(grammarAccess.getProvidesAccess().getSourceAssignment_2_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1490:1: ( rule__Provides__SourceAssignment_2_1 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1490:2: rule__Provides__SourceAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Provides__SourceAssignment_2_1_in_rule__Provides__Alternatives_23192);
                    rule__Provides__SourceAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getProvidesAccess().getSourceAssignment_2_1()); 

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
    // $ANTLR end rule__Provides__Alternatives_2


    // $ANTLR start rule__Consumes__Alternatives_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1499:1: rule__Consumes__Alternatives_2 : ( ( ( rule__Consumes__SourceAssignment_2_0 ) ) | ( ( rule__Consumes__SourceAssignment_2_1 ) ) );
    public final void rule__Consumes__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1503:1: ( ( ( rule__Consumes__SourceAssignment_2_0 ) ) | ( ( rule__Consumes__SourceAssignment_2_1 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1499:1: rule__Consumes__Alternatives_2 : ( ( ( rule__Consumes__SourceAssignment_2_0 ) ) | ( ( rule__Consumes__SourceAssignment_2_1 ) ) );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1504:1: ( ( rule__Consumes__SourceAssignment_2_0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1504:1: ( ( rule__Consumes__SourceAssignment_2_0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1505:1: ( rule__Consumes__SourceAssignment_2_0 )
                    {
                     before(grammarAccess.getConsumesAccess().getSourceAssignment_2_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1506:1: ( rule__Consumes__SourceAssignment_2_0 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1506:2: rule__Consumes__SourceAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__Consumes__SourceAssignment_2_0_in_rule__Consumes__Alternatives_23225);
                    rule__Consumes__SourceAssignment_2_0();
                    _fsp--;


                    }

                     after(grammarAccess.getConsumesAccess().getSourceAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1510:6: ( ( rule__Consumes__SourceAssignment_2_1 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1510:6: ( ( rule__Consumes__SourceAssignment_2_1 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1511:1: ( rule__Consumes__SourceAssignment_2_1 )
                    {
                     before(grammarAccess.getConsumesAccess().getSourceAssignment_2_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1512:1: ( rule__Consumes__SourceAssignment_2_1 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1512:2: rule__Consumes__SourceAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Consumes__SourceAssignment_2_1_in_rule__Consumes__Alternatives_23243);
                    rule__Consumes__SourceAssignment_2_1();
                    _fsp--;


                    }

                     after(grammarAccess.getConsumesAccess().getSourceAssignment_2_1()); 

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
    // $ANTLR end rule__Consumes__Alternatives_2


    // $ANTLR start rule__DomainType__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1521:1: rule__DomainType__Alternatives : ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) );
    public final void rule__DomainType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1525:1: ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt12=1;
                }
                break;
            case 13:
                {
                alt12=2;
                }
                break;
            case 14:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1521:1: rule__DomainType__Alternatives : ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1526:1: ( ( 'S' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1526:1: ( ( 'S' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1527:1: ( 'S' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1528:1: ( 'S' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1528:3: 'S'
                    {
                    match(input,12,FOLLOW_12_in_rule__DomainType__Alternatives3277); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1533:6: ( ( 'R' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1533:6: ( ( 'R' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1534:1: ( 'R' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1535:1: ( 'R' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1535:3: 'R'
                    {
                    match(input,13,FOLLOW_13_in_rule__DomainType__Alternatives3298); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1540:6: ( ( 'W' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1540:6: ( ( 'W' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1541:1: ( 'W' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getWorldEnumLiteralDeclaration_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1542:1: ( 'W' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1542:3: 'W'
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1552:1: rule__DecomposesType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__DecomposesType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1556:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                alt13=1;
            }
            else if ( (LA13_0==16) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1552:1: rule__DecomposesType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1557:1: ( ( 'and' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1557:1: ( ( 'and' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1558:1: ( 'and' )
                    {
                     before(grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1559:1: ( 'and' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1559:3: 'and'
                    {
                    match(input,15,FOLLOW_15_in_rule__DecomposesType__Alternatives3355); 

                    }

                     after(grammarAccess.getDecomposesTypeAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1564:6: ( ( 'or' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1564:6: ( ( 'or' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1565:1: ( 'or' )
                    {
                     before(grammarAccess.getDecomposesTypeAccess().getOREnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1566:1: ( 'or' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1566:3: 'or'
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1576:1: rule__ContributesType__Alternatives : ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) );
    public final void rule__ContributesType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1580:1: ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt14=1;
                }
                break;
            case 18:
                {
                alt14=2;
                }
                break;
            case 19:
                {
                alt14=3;
                }
                break;
            case 20:
                {
                alt14=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("1576:1: rule__ContributesType__Alternatives : ( ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1581:1: ( ( '-' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1581:1: ( ( '-' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1582:1: ( '-' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1583:1: ( '-' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1583:3: '-'
                    {
                    match(input,17,FOLLOW_17_in_rule__ContributesType__Alternatives3412); 

                    }

                     after(grammarAccess.getContributesTypeAccess().getHURTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1588:6: ( ( '+' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1588:6: ( ( '+' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1589:1: ( '+' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1590:1: ( '+' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1590:3: '+'
                    {
                    match(input,18,FOLLOW_18_in_rule__ContributesType__Alternatives3433); 

                    }

                     after(grammarAccess.getContributesTypeAccess().getHELPEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1595:6: ( ( '--' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1595:6: ( ( '--' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1596:1: ( '--' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1597:1: ( '--' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1597:3: '--'
                    {
                    match(input,19,FOLLOW_19_in_rule__ContributesType__Alternatives3454); 

                    }

                     after(grammarAccess.getContributesTypeAccess().getBREAKEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1602:6: ( ( '++' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1602:6: ( ( '++' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1603:1: ( '++' )
                    {
                     before(grammarAccess.getContributesTypeAccess().getMAKEEnumLiteralDeclaration_3()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1604:1: ( '++' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1604:3: '++'
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1616:1: rule__Situation__Group__0 : rule__Situation__Group__0__Impl rule__Situation__Group__1 ;
    public final void rule__Situation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1620:1: ( rule__Situation__Group__0__Impl rule__Situation__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1621:2: rule__Situation__Group__0__Impl rule__Situation__Group__1
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1628:1: rule__Situation__Group__0__Impl : ( ( rule__Situation__Group_0__0 )? ) ;
    public final void rule__Situation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1632:1: ( ( ( rule__Situation__Group_0__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1633:1: ( ( rule__Situation__Group_0__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1633:1: ( ( rule__Situation__Group_0__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1634:1: ( rule__Situation__Group_0__0 )?
            {
             before(grammarAccess.getSituationAccess().getGroup_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1635:1: ( rule__Situation__Group_0__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1635:2: rule__Situation__Group_0__0
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1645:1: rule__Situation__Group__1 : rule__Situation__Group__1__Impl ;
    public final void rule__Situation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1649:1: ( rule__Situation__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1650:2: rule__Situation__Group__1__Impl
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1656:1: rule__Situation__Group__1__Impl : ( ( rule__Situation__WorldAssignment_1 ) ) ;
    public final void rule__Situation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1660:1: ( ( ( rule__Situation__WorldAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1661:1: ( ( rule__Situation__WorldAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1661:1: ( ( rule__Situation__WorldAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1662:1: ( rule__Situation__WorldAssignment_1 )
            {
             before(grammarAccess.getSituationAccess().getWorldAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1663:1: ( rule__Situation__WorldAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1663:2: rule__Situation__WorldAssignment_1
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1677:1: rule__Situation__Group_0__0 : rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 ;
    public final void rule__Situation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1681:1: ( rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1682:2: rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1689:1: rule__Situation__Group_0__0__Impl : ( 'model' ) ;
    public final void rule__Situation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1693:1: ( ( 'model' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1694:1: ( 'model' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1694:1: ( 'model' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1695:1: 'model'
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1708:1: rule__Situation__Group_0__1 : rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 ;
    public final void rule__Situation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1712:1: ( rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1713:2: rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1720:1: rule__Situation__Group_0__1__Impl : ( ( rule__Situation__TimeAssignment_0_1 ) ) ;
    public final void rule__Situation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1724:1: ( ( ( rule__Situation__TimeAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1725:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1725:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1726:1: ( rule__Situation__TimeAssignment_0_1 )
            {
             before(grammarAccess.getSituationAccess().getTimeAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1727:1: ( rule__Situation__TimeAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1727:2: rule__Situation__TimeAssignment_0_1
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1737:1: rule__Situation__Group_0__2 : rule__Situation__Group_0__2__Impl ;
    public final void rule__Situation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1741:1: ( rule__Situation__Group_0__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1742:2: rule__Situation__Group_0__2__Impl
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1748:1: rule__Situation__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Situation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1752:1: ( ( ':' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1753:1: ( ':' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1753:1: ( ':' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1754:1: ':'
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1773:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1777:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1778:2: rule__World__Group__0__Impl rule__World__Group__1
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1785:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1789:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1790:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1790:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1791:1: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1792:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1794:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1804:1: rule__World__Group__1 : rule__World__Group__1__Impl ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1808:1: ( rule__World__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1809:2: rule__World__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__13878);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1815:1: rule__World__Group__1__Impl : ( ( rule__World__Alternatives_1 )* ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1819:1: ( ( ( rule__World__Alternatives_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1820:1: ( ( rule__World__Alternatives_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1820:1: ( ( rule__World__Alternatives_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1821:1: ( rule__World__Alternatives_1 )*
            {
             before(grammarAccess.getWorldAccess().getAlternatives_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1822:1: ( rule__World__Alternatives_1 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID||LA16_0==11||(LA16_0>=15 && LA16_0<=20)||(LA16_0>=31 && LA16_0<=33)||LA16_0==36||(LA16_0>=38 && LA16_0<=39)||(LA16_0>=42 && LA16_0<=51)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1822:2: rule__World__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__World__Alternatives_1_in_rule__World__Group__1__Impl3905);
            	    rule__World__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1836:1: rule__Event__Group__0 : rule__Event__Group__0__Impl rule__Event__Group__1 ;
    public final void rule__Event__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1840:1: ( rule__Event__Group__0__Impl rule__Event__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1841:2: rule__Event__Group__0__Impl rule__Event__Group__1
            {
            pushFollow(FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03940);
            rule__Event__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03943);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1848:1: rule__Event__Group__0__Impl : ( 'event' ) ;
    public final void rule__Event__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1852:1: ( ( 'event' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1853:1: ( 'event' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1853:1: ( 'event' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1854:1: 'event'
            {
             before(grammarAccess.getEventAccess().getEventKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__Event__Group__0__Impl3971); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1867:1: rule__Event__Group__1 : rule__Event__Group__1__Impl ;
    public final void rule__Event__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1871:1: ( rule__Event__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1872:2: rule__Event__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14002);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1878:1: rule__Event__Group__1__Impl : ( ( rule__Event__NameAssignment_1 ) ) ;
    public final void rule__Event__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1882:1: ( ( ( rule__Event__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1883:1: ( ( rule__Event__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1883:1: ( ( rule__Event__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1884:1: ( rule__Event__NameAssignment_1 )
            {
             before(grammarAccess.getEventAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1885:1: ( rule__Event__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1885:2: rule__Event__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl4029);
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


    // $ANTLR start rule__Domain__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1899:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1903:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1904:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__04063);
            rule__Domain__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__04066);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1911:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__NameAssignment_0 ) ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1915:1: ( ( ( rule__Domain__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1916:1: ( ( rule__Domain__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1916:1: ( ( rule__Domain__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1917:1: ( rule__Domain__NameAssignment_0 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1918:1: ( rule__Domain__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1918:2: rule__Domain__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_0_in_rule__Domain__Group__0__Impl4093);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1928:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1932:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1933:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__14123);
            rule__Domain__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__14126);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1940:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__TypeAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1944:1: ( ( ( rule__Domain__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1945:1: ( ( rule__Domain__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1945:1: ( ( rule__Domain__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1946:1: ( rule__Domain__TypeAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1947:1: ( rule__Domain__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1947:2: rule__Domain__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Domain__TypeAssignment_1_in_rule__Domain__Group__1__Impl4153);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1957:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1961:1: ( rule__Domain__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1962:2: rule__Domain__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__24183);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1968:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__Group_2__0 )* ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1972:1: ( ( ( rule__Domain__Group_2__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1973:1: ( ( rule__Domain__Group_2__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1973:1: ( ( rule__Domain__Group_2__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1974:1: ( rule__Domain__Group_2__0 )*
            {
             before(grammarAccess.getDomainAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1975:1: ( rule__Domain__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=24 && LA17_0<=30)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1975:2: rule__Domain__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__Group_2__0_in_rule__Domain__Group__2__Impl4210);
            	    rule__Domain__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1991:1: rule__Domain__Group_2__0 : rule__Domain__Group_2__0__Impl rule__Domain__Group_2__1 ;
    public final void rule__Domain__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1995:1: ( rule__Domain__Group_2__0__Impl rule__Domain__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1996:2: rule__Domain__Group_2__0__Impl rule__Domain__Group_2__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_2__0__Impl_in_rule__Domain__Group_2__04247);
            rule__Domain__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_2__1_in_rule__Domain__Group_2__04250);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2003:1: rule__Domain__Group_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Domain__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2007:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2008:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2008:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2009:1: ( ',' )?
            {
             before(grammarAccess.getDomainAccess().getCommaKeyword_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2010:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==24) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2011:2: ','
                    {
                    match(input,24,FOLLOW_24_in_rule__Domain__Group_2__0__Impl4279); 

                    }
                    break;

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2022:1: rule__Domain__Group_2__1 : rule__Domain__Group_2__1__Impl ;
    public final void rule__Domain__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2026:1: ( rule__Domain__Group_2__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2027:2: rule__Domain__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_2__1__Impl_in_rule__Domain__Group_2__14312);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2033:1: rule__Domain__Group_2__1__Impl : ( ( rule__Domain__PropertiesAssignment_2_1 ) ) ;
    public final void rule__Domain__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2037:1: ( ( ( rule__Domain__PropertiesAssignment_2_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2038:1: ( ( rule__Domain__PropertiesAssignment_2_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2038:1: ( ( rule__Domain__PropertiesAssignment_2_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2039:1: ( rule__Domain__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2040:1: ( rule__Domain__PropertiesAssignment_2_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2040:2: rule__Domain__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_2_1_in_rule__Domain__Group_2__1__Impl4339);
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


    // $ANTLR start rule__DomainAssumption__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2054:1: rule__DomainAssumption__Group__0 : rule__DomainAssumption__Group__0__Impl rule__DomainAssumption__Group__1 ;
    public final void rule__DomainAssumption__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2058:1: ( rule__DomainAssumption__Group__0__Impl rule__DomainAssumption__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2059:2: rule__DomainAssumption__Group__0__Impl rule__DomainAssumption__Group__1
            {
            pushFollow(FOLLOW_rule__DomainAssumption__Group__0__Impl_in_rule__DomainAssumption__Group__04373);
            rule__DomainAssumption__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__DomainAssumption__Group__1_in_rule__DomainAssumption__Group__04376);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2066:1: rule__DomainAssumption__Group__0__Impl : ( 'DA' ) ;
    public final void rule__DomainAssumption__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2070:1: ( ( 'DA' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2071:1: ( 'DA' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2071:1: ( 'DA' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2072:1: 'DA'
            {
             before(grammarAccess.getDomainAssumptionAccess().getDAKeyword_0()); 
            match(input,25,FOLLOW_25_in_rule__DomainAssumption__Group__0__Impl4404); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2085:1: rule__DomainAssumption__Group__1 : rule__DomainAssumption__Group__1__Impl ;
    public final void rule__DomainAssumption__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2089:1: ( rule__DomainAssumption__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2090:2: rule__DomainAssumption__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DomainAssumption__Group__1__Impl_in_rule__DomainAssumption__Group__14435);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2096:1: rule__DomainAssumption__Group__1__Impl : ( ( rule__DomainAssumption__NameAssignment_1 ) ) ;
    public final void rule__DomainAssumption__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2100:1: ( ( ( rule__DomainAssumption__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2101:1: ( ( rule__DomainAssumption__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2101:1: ( ( rule__DomainAssumption__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2102:1: ( rule__DomainAssumption__NameAssignment_1 )
            {
             before(grammarAccess.getDomainAssumptionAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2103:1: ( rule__DomainAssumption__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2103:2: rule__DomainAssumption__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__DomainAssumption__NameAssignment_1_in_rule__DomainAssumption__Group__1__Impl4462);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2117:1: rule__FunctionalRequirement__Group__0 : rule__FunctionalRequirement__Group__0__Impl rule__FunctionalRequirement__Group__1 ;
    public final void rule__FunctionalRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2121:1: ( rule__FunctionalRequirement__Group__0__Impl rule__FunctionalRequirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2122:2: rule__FunctionalRequirement__Group__0__Impl rule__FunctionalRequirement__Group__1
            {
            pushFollow(FOLLOW_rule__FunctionalRequirement__Group__0__Impl_in_rule__FunctionalRequirement__Group__04496);
            rule__FunctionalRequirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__FunctionalRequirement__Group__1_in_rule__FunctionalRequirement__Group__04499);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2129:1: rule__FunctionalRequirement__Group__0__Impl : ( 'FR' ) ;
    public final void rule__FunctionalRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2133:1: ( ( 'FR' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2134:1: ( 'FR' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2134:1: ( 'FR' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2135:1: 'FR'
            {
             before(grammarAccess.getFunctionalRequirementAccess().getFRKeyword_0()); 
            match(input,26,FOLLOW_26_in_rule__FunctionalRequirement__Group__0__Impl4527); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2148:1: rule__FunctionalRequirement__Group__1 : rule__FunctionalRequirement__Group__1__Impl ;
    public final void rule__FunctionalRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2152:1: ( rule__FunctionalRequirement__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2153:2: rule__FunctionalRequirement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__FunctionalRequirement__Group__1__Impl_in_rule__FunctionalRequirement__Group__14558);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2159:1: rule__FunctionalRequirement__Group__1__Impl : ( ( rule__FunctionalRequirement__NameAssignment_1 ) ) ;
    public final void rule__FunctionalRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2163:1: ( ( ( rule__FunctionalRequirement__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2164:1: ( ( rule__FunctionalRequirement__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2164:1: ( ( rule__FunctionalRequirement__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2165:1: ( rule__FunctionalRequirement__NameAssignment_1 )
            {
             before(grammarAccess.getFunctionalRequirementAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2166:1: ( rule__FunctionalRequirement__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2166:2: rule__FunctionalRequirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__FunctionalRequirement__NameAssignment_1_in_rule__FunctionalRequirement__Group__1__Impl4585);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2180:1: rule__SecurityRequirement__Group__0 : rule__SecurityRequirement__Group__0__Impl rule__SecurityRequirement__Group__1 ;
    public final void rule__SecurityRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2184:1: ( rule__SecurityRequirement__Group__0__Impl rule__SecurityRequirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2185:2: rule__SecurityRequirement__Group__0__Impl rule__SecurityRequirement__Group__1
            {
            pushFollow(FOLLOW_rule__SecurityRequirement__Group__0__Impl_in_rule__SecurityRequirement__Group__04619);
            rule__SecurityRequirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityRequirement__Group__1_in_rule__SecurityRequirement__Group__04622);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2192:1: rule__SecurityRequirement__Group__0__Impl : ( 'SR' ) ;
    public final void rule__SecurityRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2196:1: ( ( 'SR' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2197:1: ( 'SR' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2197:1: ( 'SR' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2198:1: 'SR'
            {
             before(grammarAccess.getSecurityRequirementAccess().getSRKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__SecurityRequirement__Group__0__Impl4650); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2211:1: rule__SecurityRequirement__Group__1 : rule__SecurityRequirement__Group__1__Impl ;
    public final void rule__SecurityRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2215:1: ( rule__SecurityRequirement__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2216:2: rule__SecurityRequirement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SecurityRequirement__Group__1__Impl_in_rule__SecurityRequirement__Group__14681);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2222:1: rule__SecurityRequirement__Group__1__Impl : ( ( rule__SecurityRequirement__NameAssignment_1 ) ) ;
    public final void rule__SecurityRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2226:1: ( ( ( rule__SecurityRequirement__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2227:1: ( ( rule__SecurityRequirement__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2227:1: ( ( rule__SecurityRequirement__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2228:1: ( rule__SecurityRequirement__NameAssignment_1 )
            {
             before(grammarAccess.getSecurityRequirementAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2229:1: ( rule__SecurityRequirement__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2229:2: rule__SecurityRequirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SecurityRequirement__NameAssignment_1_in_rule__SecurityRequirement__Group__1__Impl4708);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2243:1: rule__AntiRequirement__Group__0 : rule__AntiRequirement__Group__0__Impl rule__AntiRequirement__Group__1 ;
    public final void rule__AntiRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2247:1: ( rule__AntiRequirement__Group__0__Impl rule__AntiRequirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2248:2: rule__AntiRequirement__Group__0__Impl rule__AntiRequirement__Group__1
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group__0__Impl_in_rule__AntiRequirement__Group__04742);
            rule__AntiRequirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AntiRequirement__Group__1_in_rule__AntiRequirement__Group__04745);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2255:1: rule__AntiRequirement__Group__0__Impl : ( 'AR' ) ;
    public final void rule__AntiRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2259:1: ( ( 'AR' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2260:1: ( 'AR' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2260:1: ( 'AR' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2261:1: 'AR'
            {
             before(grammarAccess.getAntiRequirementAccess().getARKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__AntiRequirement__Group__0__Impl4773); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2274:1: rule__AntiRequirement__Group__1 : rule__AntiRequirement__Group__1__Impl ;
    public final void rule__AntiRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2278:1: ( rule__AntiRequirement__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2279:2: rule__AntiRequirement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group__1__Impl_in_rule__AntiRequirement__Group__14804);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2285:1: rule__AntiRequirement__Group__1__Impl : ( ( rule__AntiRequirement__NameAssignment_1 ) ) ;
    public final void rule__AntiRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2289:1: ( ( ( rule__AntiRequirement__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2290:1: ( ( rule__AntiRequirement__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2290:1: ( ( rule__AntiRequirement__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2291:1: ( rule__AntiRequirement__NameAssignment_1 )
            {
             before(grammarAccess.getAntiRequirementAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2292:1: ( rule__AntiRequirement__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2292:2: rule__AntiRequirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__AntiRequirement__NameAssignment_1_in_rule__AntiRequirement__Group__1__Impl4831);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2306:1: rule__QualityRequirement__Group__0 : rule__QualityRequirement__Group__0__Impl rule__QualityRequirement__Group__1 ;
    public final void rule__QualityRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2310:1: ( rule__QualityRequirement__Group__0__Impl rule__QualityRequirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2311:2: rule__QualityRequirement__Group__0__Impl rule__QualityRequirement__Group__1
            {
            pushFollow(FOLLOW_rule__QualityRequirement__Group__0__Impl_in_rule__QualityRequirement__Group__04865);
            rule__QualityRequirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__QualityRequirement__Group__1_in_rule__QualityRequirement__Group__04868);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2318:1: rule__QualityRequirement__Group__0__Impl : ( 'Q' ) ;
    public final void rule__QualityRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2322:1: ( ( 'Q' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2323:1: ( 'Q' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2323:1: ( 'Q' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2324:1: 'Q'
            {
             before(grammarAccess.getQualityRequirementAccess().getQKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__QualityRequirement__Group__0__Impl4896); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2337:1: rule__QualityRequirement__Group__1 : rule__QualityRequirement__Group__1__Impl ;
    public final void rule__QualityRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2341:1: ( rule__QualityRequirement__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2342:2: rule__QualityRequirement__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualityRequirement__Group__1__Impl_in_rule__QualityRequirement__Group__14927);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2348:1: rule__QualityRequirement__Group__1__Impl : ( ( rule__QualityRequirement__NameAssignment_1 ) ) ;
    public final void rule__QualityRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2352:1: ( ( ( rule__QualityRequirement__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2353:1: ( ( rule__QualityRequirement__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2353:1: ( ( rule__QualityRequirement__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2354:1: ( rule__QualityRequirement__NameAssignment_1 )
            {
             before(grammarAccess.getQualityRequirementAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2355:1: ( rule__QualityRequirement__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2355:2: rule__QualityRequirement__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__QualityRequirement__NameAssignment_1_in_rule__QualityRequirement__Group__1__Impl4954);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2369:1: rule__Argument__Group__0 : rule__Argument__Group__0__Impl rule__Argument__Group__1 ;
    public final void rule__Argument__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2373:1: ( rule__Argument__Group__0__Impl rule__Argument__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2374:2: rule__Argument__Group__0__Impl rule__Argument__Group__1
            {
            pushFollow(FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04988);
            rule__Argument__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__04991);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2381:1: rule__Argument__Group__0__Impl : ( 'A' ) ;
    public final void rule__Argument__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2385:1: ( ( 'A' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2386:1: ( 'A' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2386:1: ( 'A' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2387:1: 'A'
            {
             before(grammarAccess.getArgumentAccess().getAKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__Argument__Group__0__Impl5019); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2400:1: rule__Argument__Group__1 : rule__Argument__Group__1__Impl ;
    public final void rule__Argument__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2404:1: ( rule__Argument__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2405:2: rule__Argument__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__15050);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2411:1: rule__Argument__Group__1__Impl : ( ( rule__Argument__NameAssignment_1 ) ) ;
    public final void rule__Argument__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2415:1: ( ( ( rule__Argument__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2416:1: ( ( rule__Argument__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2416:1: ( ( rule__Argument__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2417:1: ( rule__Argument__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2418:1: ( rule__Argument__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2418:2: rule__Argument__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl5077);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2432:1: rule__Stakeholder__Group__0 : rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1 ;
    public final void rule__Stakeholder__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2436:1: ( rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2437:2: rule__Stakeholder__Group__0__Impl rule__Stakeholder__Group__1
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__0__Impl_in_rule__Stakeholder__Group__05111);
            rule__Stakeholder__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Stakeholder__Group__1_in_rule__Stakeholder__Group__05114);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2444:1: rule__Stakeholder__Group__0__Impl : ( 'actor' ) ;
    public final void rule__Stakeholder__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2448:1: ( ( 'actor' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2449:1: ( 'actor' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2449:1: ( 'actor' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2450:1: 'actor'
            {
             before(grammarAccess.getStakeholderAccess().getActorKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Stakeholder__Group__0__Impl5142); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2463:1: rule__Stakeholder__Group__1 : rule__Stakeholder__Group__1__Impl ;
    public final void rule__Stakeholder__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2467:1: ( rule__Stakeholder__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2468:2: rule__Stakeholder__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Stakeholder__Group__1__Impl_in_rule__Stakeholder__Group__15173);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2474:1: rule__Stakeholder__Group__1__Impl : ( ( rule__Stakeholder__NameAssignment_1 ) ) ;
    public final void rule__Stakeholder__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2478:1: ( ( ( rule__Stakeholder__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2479:1: ( ( rule__Stakeholder__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2479:1: ( ( rule__Stakeholder__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2480:1: ( rule__Stakeholder__NameAssignment_1 )
            {
             before(grammarAccess.getStakeholderAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2481:1: ( rule__Stakeholder__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2481:2: rule__Stakeholder__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Stakeholder__NameAssignment_1_in_rule__Stakeholder__Group__1__Impl5200);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2495:1: rule__Attacker__Group__0 : rule__Attacker__Group__0__Impl rule__Attacker__Group__1 ;
    public final void rule__Attacker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2499:1: ( rule__Attacker__Group__0__Impl rule__Attacker__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2500:2: rule__Attacker__Group__0__Impl rule__Attacker__Group__1
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__05234);
            rule__Attacker__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__05237);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2507:1: rule__Attacker__Group__0__Impl : ( 'attacker' ) ;
    public final void rule__Attacker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2511:1: ( ( 'attacker' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2512:1: ( 'attacker' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2512:1: ( 'attacker' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2513:1: 'attacker'
            {
             before(grammarAccess.getAttackerAccess().getAttackerKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__Attacker__Group__0__Impl5265); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2526:1: rule__Attacker__Group__1 : rule__Attacker__Group__1__Impl ;
    public final void rule__Attacker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2530:1: ( rule__Attacker__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2531:2: rule__Attacker__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__15296);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2537:1: rule__Attacker__Group__1__Impl : ( ( rule__Attacker__NameAssignment_1 ) ) ;
    public final void rule__Attacker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2541:1: ( ( ( rule__Attacker__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2542:1: ( ( rule__Attacker__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2542:1: ( ( rule__Attacker__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2543:1: ( rule__Attacker__NameAssignment_1 )
            {
             before(grammarAccess.getAttackerAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2544:1: ( rule__Attacker__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2544:2: rule__Attacker__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attacker__NameAssignment_1_in_rule__Attacker__Group__1__Impl5323);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2558:1: rule__NaturalProcess__Group__0 : rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1 ;
    public final void rule__NaturalProcess__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2562:1: ( rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2563:2: rule__NaturalProcess__Group__0__Impl rule__NaturalProcess__Group__1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__0__Impl_in_rule__NaturalProcess__Group__05357);
            rule__NaturalProcess__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group__1_in_rule__NaturalProcess__Group__05360);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2570:1: rule__NaturalProcess__Group__0__Impl : ( 'process' ) ;
    public final void rule__NaturalProcess__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2574:1: ( ( 'process' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2575:1: ( 'process' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2575:1: ( 'process' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2576:1: 'process'
            {
             before(grammarAccess.getNaturalProcessAccess().getProcessKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__NaturalProcess__Group__0__Impl5388); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2589:1: rule__NaturalProcess__Group__1 : rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2 ;
    public final void rule__NaturalProcess__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2593:1: ( rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2594:2: rule__NaturalProcess__Group__1__Impl rule__NaturalProcess__Group__2
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__1__Impl_in_rule__NaturalProcess__Group__15419);
            rule__NaturalProcess__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group__2_in_rule__NaturalProcess__Group__15422);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2601:1: rule__NaturalProcess__Group__1__Impl : ( ( rule__NaturalProcess__NameAssignment_1 ) ) ;
    public final void rule__NaturalProcess__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2605:1: ( ( ( rule__NaturalProcess__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2606:1: ( ( rule__NaturalProcess__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2606:1: ( ( rule__NaturalProcess__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2607:1: ( rule__NaturalProcess__NameAssignment_1 )
            {
             before(grammarAccess.getNaturalProcessAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2608:1: ( rule__NaturalProcess__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2608:2: rule__NaturalProcess__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__NameAssignment_1_in_rule__NaturalProcess__Group__1__Impl5449);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2618:1: rule__NaturalProcess__Group__2 : rule__NaturalProcess__Group__2__Impl ;
    public final void rule__NaturalProcess__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2622:1: ( rule__NaturalProcess__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2623:2: rule__NaturalProcess__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group__2__Impl_in_rule__NaturalProcess__Group__25479);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2629:1: rule__NaturalProcess__Group__2__Impl : ( ( rule__NaturalProcess__Group_2__0 )? ) ;
    public final void rule__NaturalProcess__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2633:1: ( ( ( rule__NaturalProcess__Group_2__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2634:1: ( ( rule__NaturalProcess__Group_2__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2634:1: ( ( rule__NaturalProcess__Group_2__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2635:1: ( rule__NaturalProcess__Group_2__0 )?
            {
             before(grammarAccess.getNaturalProcessAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2636:1: ( rule__NaturalProcess__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2636:2: rule__NaturalProcess__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__NaturalProcess__Group_2__0_in_rule__NaturalProcess__Group__2__Impl5506);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2652:1: rule__NaturalProcess__Group_2__0 : rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1 ;
    public final void rule__NaturalProcess__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2656:1: ( rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2657:2: rule__NaturalProcess__Group_2__0__Impl rule__NaturalProcess__Group_2__1
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__0__Impl_in_rule__NaturalProcess__Group_2__05543);
            rule__NaturalProcess__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__1_in_rule__NaturalProcess__Group_2__05546);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2664:1: rule__NaturalProcess__Group_2__0__Impl : ( '{' ) ;
    public final void rule__NaturalProcess__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2668:1: ( ( '{' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2669:1: ( '{' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2669:1: ( '{' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2670:1: '{'
            {
             before(grammarAccess.getNaturalProcessAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__NaturalProcess__Group_2__0__Impl5574); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2683:1: rule__NaturalProcess__Group_2__1 : rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2 ;
    public final void rule__NaturalProcess__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2687:1: ( rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2688:2: rule__NaturalProcess__Group_2__1__Impl rule__NaturalProcess__Group_2__2
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__1__Impl_in_rule__NaturalProcess__Group_2__15605);
            rule__NaturalProcess__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__2_in_rule__NaturalProcess__Group_2__15608);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2695:1: rule__NaturalProcess__Group_2__1__Impl : ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* ) ;
    public final void rule__NaturalProcess__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2699:1: ( ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2700:1: ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2700:1: ( ( rule__NaturalProcess__ActivitiesAssignment_2_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2701:1: ( rule__NaturalProcess__ActivitiesAssignment_2_1 )*
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2702:1: ( rule__NaturalProcess__ActivitiesAssignment_2_1 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_ID) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2702:2: rule__NaturalProcess__ActivitiesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_rule__NaturalProcess__ActivitiesAssignment_2_1_in_rule__NaturalProcess__Group_2__1__Impl5635);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2712:1: rule__NaturalProcess__Group_2__2 : rule__NaturalProcess__Group_2__2__Impl ;
    public final void rule__NaturalProcess__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2716:1: ( rule__NaturalProcess__Group_2__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2717:2: rule__NaturalProcess__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__NaturalProcess__Group_2__2__Impl_in_rule__NaturalProcess__Group_2__25666);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2723:1: rule__NaturalProcess__Group_2__2__Impl : ( '}' ) ;
    public final void rule__NaturalProcess__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2727:1: ( ( '}' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2728:1: ( '}' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2728:1: ( '}' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2729:1: '}'
            {
             before(grammarAccess.getNaturalProcessAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,35,FOLLOW_35_in_rule__NaturalProcess__Group_2__2__Impl5694); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2748:1: rule__HumanActivity__Group__0 : rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1 ;
    public final void rule__HumanActivity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2752:1: ( rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2753:2: rule__HumanActivity__Group__0__Impl rule__HumanActivity__Group__1
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__0__Impl_in_rule__HumanActivity__Group__05731);
            rule__HumanActivity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__1_in_rule__HumanActivity__Group__05734);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2760:1: rule__HumanActivity__Group__0__Impl : ( () ) ;
    public final void rule__HumanActivity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2764:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2765:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2765:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2766:1: ()
            {
             before(grammarAccess.getHumanActivityAccess().getActivityAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2767:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2769:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2779:1: rule__HumanActivity__Group__1 : rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2 ;
    public final void rule__HumanActivity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2783:1: ( rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2784:2: rule__HumanActivity__Group__1__Impl rule__HumanActivity__Group__2
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__1__Impl_in_rule__HumanActivity__Group__15792);
            rule__HumanActivity__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__2_in_rule__HumanActivity__Group__15795);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2791:1: rule__HumanActivity__Group__1__Impl : ( 'activity' ) ;
    public final void rule__HumanActivity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2795:1: ( ( 'activity' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2796:1: ( 'activity' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2796:1: ( 'activity' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2797:1: 'activity'
            {
             before(grammarAccess.getHumanActivityAccess().getActivityKeyword_1()); 
            match(input,36,FOLLOW_36_in_rule__HumanActivity__Group__1__Impl5823); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2810:1: rule__HumanActivity__Group__2 : rule__HumanActivity__Group__2__Impl rule__HumanActivity__Group__3 ;
    public final void rule__HumanActivity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2814:1: ( rule__HumanActivity__Group__2__Impl rule__HumanActivity__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2815:2: rule__HumanActivity__Group__2__Impl rule__HumanActivity__Group__3
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__2__Impl_in_rule__HumanActivity__Group__25854);
            rule__HumanActivity__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__HumanActivity__Group__3_in_rule__HumanActivity__Group__25857);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2822:1: rule__HumanActivity__Group__2__Impl : ( ( rule__HumanActivity__NameAssignment_2 ) ) ;
    public final void rule__HumanActivity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2826:1: ( ( ( rule__HumanActivity__NameAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2827:1: ( ( rule__HumanActivity__NameAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2827:1: ( ( rule__HumanActivity__NameAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2828:1: ( rule__HumanActivity__NameAssignment_2 )
            {
             before(grammarAccess.getHumanActivityAccess().getNameAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2829:1: ( rule__HumanActivity__NameAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2829:2: rule__HumanActivity__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__HumanActivity__NameAssignment_2_in_rule__HumanActivity__Group__2__Impl5884);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2839:1: rule__HumanActivity__Group__3 : rule__HumanActivity__Group__3__Impl ;
    public final void rule__HumanActivity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2843:1: ( rule__HumanActivity__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2844:2: rule__HumanActivity__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__HumanActivity__Group__3__Impl_in_rule__HumanActivity__Group__35914);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2850:1: rule__HumanActivity__Group__3__Impl : ( ( rule__HumanActivity__ActionsAssignment_3 )* ) ;
    public final void rule__HumanActivity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2854:1: ( ( ( rule__HumanActivity__ActionsAssignment_3 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2855:1: ( ( rule__HumanActivity__ActionsAssignment_3 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2855:1: ( ( rule__HumanActivity__ActionsAssignment_3 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2856:1: ( rule__HumanActivity__ActionsAssignment_3 )*
            {
             before(grammarAccess.getHumanActivityAccess().getActionsAssignment_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2857:1: ( rule__HumanActivity__ActionsAssignment_3 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2857:2: rule__HumanActivity__ActionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__HumanActivity__ActionsAssignment_3_in_rule__HumanActivity__Group__3__Impl5941);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2875:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2879:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2880:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__05980);
            rule__Action__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__05983);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2887:1: rule__Action__Group__0__Impl : ( 'action' ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2891:1: ( ( 'action' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2892:1: ( 'action' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2892:1: ( 'action' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2893:1: 'action'
            {
             before(grammarAccess.getActionAccess().getActionKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Action__Group__0__Impl6011); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2906:1: rule__Action__Group__1 : rule__Action__Group__1__Impl ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2910:1: ( rule__Action__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2911:2: rule__Action__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__16042);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2917:1: rule__Action__Group__1__Impl : ( ( rule__Action__NameAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2921:1: ( ( ( rule__Action__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2922:1: ( ( rule__Action__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2922:1: ( ( rule__Action__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2923:1: ( rule__Action__NameAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2924:1: ( rule__Action__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2924:2: rule__Action__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl6069);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2938:1: rule__Resource__Group_0__0 : rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1 ;
    public final void rule__Resource__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2942:1: ( rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2943:2: rule__Resource__Group_0__0__Impl rule__Resource__Group_0__1
            {
            pushFollow(FOLLOW_rule__Resource__Group_0__0__Impl_in_rule__Resource__Group_0__06103);
            rule__Resource__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group_0__1_in_rule__Resource__Group_0__06106);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2950:1: rule__Resource__Group_0__0__Impl : ( 'resource' ) ;
    public final void rule__Resource__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2954:1: ( ( 'resource' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2955:1: ( 'resource' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2955:1: ( 'resource' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2956:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_0_0()); 
            match(input,38,FOLLOW_38_in_rule__Resource__Group_0__0__Impl6134); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2969:1: rule__Resource__Group_0__1 : rule__Resource__Group_0__1__Impl ;
    public final void rule__Resource__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2973:1: ( rule__Resource__Group_0__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2974:2: rule__Resource__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group_0__1__Impl_in_rule__Resource__Group_0__16165);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2980:1: rule__Resource__Group_0__1__Impl : ( ( rule__Resource__NameAssignment_0_1 ) ) ;
    public final void rule__Resource__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2984:1: ( ( ( rule__Resource__NameAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2985:1: ( ( rule__Resource__NameAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2985:1: ( ( rule__Resource__NameAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2986:1: ( rule__Resource__NameAssignment_0_1 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2987:1: ( rule__Resource__NameAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2987:2: rule__Resource__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_0_1_in_rule__Resource__Group_0__1__Impl6192);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3001:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3005:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3006:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__06226);
            rule__Asset__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__06229);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3013:1: rule__Asset__Group__0__Impl : ( 'asset' ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3017:1: ( ( 'asset' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3018:1: ( 'asset' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3018:1: ( 'asset' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3019:1: 'asset'
            {
             before(grammarAccess.getAssetAccess().getAssetKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Asset__Group__0__Impl6257); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3032:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3036:1: ( rule__Asset__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3037:2: rule__Asset__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__16288);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3043:1: rule__Asset__Group__1__Impl : ( ( rule__Asset__NameAssignment_1 ) ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3047:1: ( ( ( rule__Asset__NameAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3048:1: ( ( rule__Asset__NameAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3048:1: ( ( rule__Asset__NameAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3049:1: ( rule__Asset__NameAssignment_1 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3050:1: ( rule__Asset__NameAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3050:2: rule__Asset__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl6315);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3064:1: rule__Wants__Group__0 : rule__Wants__Group__0__Impl rule__Wants__Group__1 ;
    public final void rule__Wants__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3068:1: ( rule__Wants__Group__0__Impl rule__Wants__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3069:2: rule__Wants__Group__0__Impl rule__Wants__Group__1
            {
            pushFollow(FOLLOW_rule__Wants__Group__0__Impl_in_rule__Wants__Group__06349);
            rule__Wants__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__1_in_rule__Wants__Group__06352);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3076:1: rule__Wants__Group__0__Impl : ( ( rule__Wants__TypeAssignment_0 ) ) ;
    public final void rule__Wants__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3080:1: ( ( ( rule__Wants__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3081:1: ( ( rule__Wants__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3081:1: ( ( rule__Wants__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3082:1: ( rule__Wants__TypeAssignment_0 )
            {
             before(grammarAccess.getWantsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3083:1: ( rule__Wants__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3083:2: rule__Wants__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Wants__TypeAssignment_0_in_rule__Wants__Group__0__Impl6379);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3093:1: rule__Wants__Group__1 : rule__Wants__Group__1__Impl rule__Wants__Group__2 ;
    public final void rule__Wants__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3097:1: ( rule__Wants__Group__1__Impl rule__Wants__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3098:2: rule__Wants__Group__1__Impl rule__Wants__Group__2
            {
            pushFollow(FOLLOW_rule__Wants__Group__1__Impl_in_rule__Wants__Group__16409);
            rule__Wants__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__2_in_rule__Wants__Group__16412);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3105:1: rule__Wants__Group__1__Impl : ( '(' ) ;
    public final void rule__Wants__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3109:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3110:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3110:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3111:1: '('
            {
             before(grammarAccess.getWantsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Wants__Group__1__Impl6440); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3124:1: rule__Wants__Group__2 : rule__Wants__Group__2__Impl rule__Wants__Group__3 ;
    public final void rule__Wants__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3128:1: ( rule__Wants__Group__2__Impl rule__Wants__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3129:2: rule__Wants__Group__2__Impl rule__Wants__Group__3
            {
            pushFollow(FOLLOW_rule__Wants__Group__2__Impl_in_rule__Wants__Group__26471);
            rule__Wants__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__3_in_rule__Wants__Group__26474);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3136:1: rule__Wants__Group__2__Impl : ( ( rule__Wants__SourceAssignment_2 ) ) ;
    public final void rule__Wants__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3140:1: ( ( ( rule__Wants__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3141:1: ( ( rule__Wants__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3141:1: ( ( rule__Wants__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3142:1: ( rule__Wants__SourceAssignment_2 )
            {
             before(grammarAccess.getWantsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3143:1: ( rule__Wants__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3143:2: rule__Wants__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Wants__SourceAssignment_2_in_rule__Wants__Group__2__Impl6501);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3153:1: rule__Wants__Group__3 : rule__Wants__Group__3__Impl rule__Wants__Group__4 ;
    public final void rule__Wants__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3157:1: ( rule__Wants__Group__3__Impl rule__Wants__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3158:2: rule__Wants__Group__3__Impl rule__Wants__Group__4
            {
            pushFollow(FOLLOW_rule__Wants__Group__3__Impl_in_rule__Wants__Group__36531);
            rule__Wants__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__4_in_rule__Wants__Group__36534);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3165:1: rule__Wants__Group__3__Impl : ( ',' ) ;
    public final void rule__Wants__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3169:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3170:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3170:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3171:1: ','
            {
             before(grammarAccess.getWantsAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Wants__Group__3__Impl6562); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3184:1: rule__Wants__Group__4 : rule__Wants__Group__4__Impl rule__Wants__Group__5 ;
    public final void rule__Wants__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3188:1: ( rule__Wants__Group__4__Impl rule__Wants__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3189:2: rule__Wants__Group__4__Impl rule__Wants__Group__5
            {
            pushFollow(FOLLOW_rule__Wants__Group__4__Impl_in_rule__Wants__Group__46593);
            rule__Wants__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Wants__Group__5_in_rule__Wants__Group__46596);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3196:1: rule__Wants__Group__4__Impl : ( ( rule__Wants__TargetAssignment_4 ) ) ;
    public final void rule__Wants__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3200:1: ( ( ( rule__Wants__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3201:1: ( ( rule__Wants__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3201:1: ( ( rule__Wants__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3202:1: ( rule__Wants__TargetAssignment_4 )
            {
             before(grammarAccess.getWantsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3203:1: ( rule__Wants__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3203:2: rule__Wants__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Wants__TargetAssignment_4_in_rule__Wants__Group__4__Impl6623);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3213:1: rule__Wants__Group__5 : rule__Wants__Group__5__Impl ;
    public final void rule__Wants__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3217:1: ( rule__Wants__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3218:2: rule__Wants__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Wants__Group__5__Impl_in_rule__Wants__Group__56653);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3224:1: rule__Wants__Group__5__Impl : ( ')' ) ;
    public final void rule__Wants__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3228:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3229:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3229:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3230:1: ')'
            {
             before(grammarAccess.getWantsAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Wants__Group__5__Impl6681); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3255:1: rule__Does__Group__0 : rule__Does__Group__0__Impl rule__Does__Group__1 ;
    public final void rule__Does__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3259:1: ( rule__Does__Group__0__Impl rule__Does__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3260:2: rule__Does__Group__0__Impl rule__Does__Group__1
            {
            pushFollow(FOLLOW_rule__Does__Group__0__Impl_in_rule__Does__Group__06724);
            rule__Does__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__1_in_rule__Does__Group__06727);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3267:1: rule__Does__Group__0__Impl : ( ( rule__Does__TypeAssignment_0 ) ) ;
    public final void rule__Does__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3271:1: ( ( ( rule__Does__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3272:1: ( ( rule__Does__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3272:1: ( ( rule__Does__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3273:1: ( rule__Does__TypeAssignment_0 )
            {
             before(grammarAccess.getDoesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3274:1: ( rule__Does__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3274:2: rule__Does__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Does__TypeAssignment_0_in_rule__Does__Group__0__Impl6754);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3284:1: rule__Does__Group__1 : rule__Does__Group__1__Impl rule__Does__Group__2 ;
    public final void rule__Does__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3288:1: ( rule__Does__Group__1__Impl rule__Does__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3289:2: rule__Does__Group__1__Impl rule__Does__Group__2
            {
            pushFollow(FOLLOW_rule__Does__Group__1__Impl_in_rule__Does__Group__16784);
            rule__Does__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__2_in_rule__Does__Group__16787);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3296:1: rule__Does__Group__1__Impl : ( '(' ) ;
    public final void rule__Does__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3300:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3301:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3301:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3302:1: '('
            {
             before(grammarAccess.getDoesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Does__Group__1__Impl6815); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3315:1: rule__Does__Group__2 : rule__Does__Group__2__Impl rule__Does__Group__3 ;
    public final void rule__Does__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3319:1: ( rule__Does__Group__2__Impl rule__Does__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3320:2: rule__Does__Group__2__Impl rule__Does__Group__3
            {
            pushFollow(FOLLOW_rule__Does__Group__2__Impl_in_rule__Does__Group__26846);
            rule__Does__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__3_in_rule__Does__Group__26849);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3327:1: rule__Does__Group__2__Impl : ( ( rule__Does__SourceAssignment_2 ) ) ;
    public final void rule__Does__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3331:1: ( ( ( rule__Does__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3332:1: ( ( rule__Does__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3332:1: ( ( rule__Does__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3333:1: ( rule__Does__SourceAssignment_2 )
            {
             before(grammarAccess.getDoesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3334:1: ( rule__Does__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3334:2: rule__Does__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Does__SourceAssignment_2_in_rule__Does__Group__2__Impl6876);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3344:1: rule__Does__Group__3 : rule__Does__Group__3__Impl rule__Does__Group__4 ;
    public final void rule__Does__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3348:1: ( rule__Does__Group__3__Impl rule__Does__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3349:2: rule__Does__Group__3__Impl rule__Does__Group__4
            {
            pushFollow(FOLLOW_rule__Does__Group__3__Impl_in_rule__Does__Group__36906);
            rule__Does__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__4_in_rule__Does__Group__36909);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3356:1: rule__Does__Group__3__Impl : ( ',' ) ;
    public final void rule__Does__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3360:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3361:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3361:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3362:1: ','
            {
             before(grammarAccess.getDoesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Does__Group__3__Impl6937); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3375:1: rule__Does__Group__4 : rule__Does__Group__4__Impl rule__Does__Group__5 ;
    public final void rule__Does__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3379:1: ( rule__Does__Group__4__Impl rule__Does__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3380:2: rule__Does__Group__4__Impl rule__Does__Group__5
            {
            pushFollow(FOLLOW_rule__Does__Group__4__Impl_in_rule__Does__Group__46968);
            rule__Does__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Does__Group__5_in_rule__Does__Group__46971);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3387:1: rule__Does__Group__4__Impl : ( ( rule__Does__TargetAssignment_4 ) ) ;
    public final void rule__Does__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3391:1: ( ( ( rule__Does__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3392:1: ( ( rule__Does__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3392:1: ( ( rule__Does__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3393:1: ( rule__Does__TargetAssignment_4 )
            {
             before(grammarAccess.getDoesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3394:1: ( rule__Does__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3394:2: rule__Does__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Does__TargetAssignment_4_in_rule__Does__Group__4__Impl6998);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3404:1: rule__Does__Group__5 : rule__Does__Group__5__Impl ;
    public final void rule__Does__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3408:1: ( rule__Does__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3409:2: rule__Does__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Does__Group__5__Impl_in_rule__Does__Group__57028);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3415:1: rule__Does__Group__5__Impl : ( ')' ) ;
    public final void rule__Does__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3419:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3420:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3420:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3421:1: ')'
            {
             before(grammarAccess.getDoesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Does__Group__5__Impl7056); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3446:1: rule__Decomposes__Group__0 : rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1 ;
    public final void rule__Decomposes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3450:1: ( rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3451:2: rule__Decomposes__Group__0__Impl rule__Decomposes__Group__1
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__0__Impl_in_rule__Decomposes__Group__07099);
            rule__Decomposes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__1_in_rule__Decomposes__Group__07102);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3458:1: rule__Decomposes__Group__0__Impl : ( ( rule__Decomposes__TypeAssignment_0 ) ) ;
    public final void rule__Decomposes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3462:1: ( ( ( rule__Decomposes__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3463:1: ( ( rule__Decomposes__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3463:1: ( ( rule__Decomposes__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3464:1: ( rule__Decomposes__TypeAssignment_0 )
            {
             before(grammarAccess.getDecomposesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3465:1: ( rule__Decomposes__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3465:2: rule__Decomposes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Decomposes__TypeAssignment_0_in_rule__Decomposes__Group__0__Impl7129);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3475:1: rule__Decomposes__Group__1 : rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2 ;
    public final void rule__Decomposes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3479:1: ( rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3480:2: rule__Decomposes__Group__1__Impl rule__Decomposes__Group__2
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__1__Impl_in_rule__Decomposes__Group__17159);
            rule__Decomposes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__2_in_rule__Decomposes__Group__17162);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3487:1: rule__Decomposes__Group__1__Impl : ( '(' ) ;
    public final void rule__Decomposes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3491:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3492:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3492:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3493:1: '('
            {
             before(grammarAccess.getDecomposesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Decomposes__Group__1__Impl7190); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3506:1: rule__Decomposes__Group__2 : rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3 ;
    public final void rule__Decomposes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3510:1: ( rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3511:2: rule__Decomposes__Group__2__Impl rule__Decomposes__Group__3
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__2__Impl_in_rule__Decomposes__Group__27221);
            rule__Decomposes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__3_in_rule__Decomposes__Group__27224);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3518:1: rule__Decomposes__Group__2__Impl : ( ( rule__Decomposes__SourceAssignment_2 ) ) ;
    public final void rule__Decomposes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3522:1: ( ( ( rule__Decomposes__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3523:1: ( ( rule__Decomposes__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3523:1: ( ( rule__Decomposes__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3524:1: ( rule__Decomposes__SourceAssignment_2 )
            {
             before(grammarAccess.getDecomposesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3525:1: ( rule__Decomposes__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3525:2: rule__Decomposes__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Decomposes__SourceAssignment_2_in_rule__Decomposes__Group__2__Impl7251);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3535:1: rule__Decomposes__Group__3 : rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4 ;
    public final void rule__Decomposes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3539:1: ( rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3540:2: rule__Decomposes__Group__3__Impl rule__Decomposes__Group__4
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__3__Impl_in_rule__Decomposes__Group__37281);
            rule__Decomposes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__4_in_rule__Decomposes__Group__37284);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3547:1: rule__Decomposes__Group__3__Impl : ( ',' ) ;
    public final void rule__Decomposes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3551:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3552:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3552:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3553:1: ','
            {
             before(grammarAccess.getDecomposesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Decomposes__Group__3__Impl7312); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3566:1: rule__Decomposes__Group__4 : rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5 ;
    public final void rule__Decomposes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3570:1: ( rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3571:2: rule__Decomposes__Group__4__Impl rule__Decomposes__Group__5
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__4__Impl_in_rule__Decomposes__Group__47343);
            rule__Decomposes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Decomposes__Group__5_in_rule__Decomposes__Group__47346);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3578:1: rule__Decomposes__Group__4__Impl : ( ( rule__Decomposes__TargetAssignment_4 ) ) ;
    public final void rule__Decomposes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3582:1: ( ( ( rule__Decomposes__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3583:1: ( ( rule__Decomposes__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3583:1: ( ( rule__Decomposes__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3584:1: ( rule__Decomposes__TargetAssignment_4 )
            {
             before(grammarAccess.getDecomposesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3585:1: ( rule__Decomposes__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3585:2: rule__Decomposes__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Decomposes__TargetAssignment_4_in_rule__Decomposes__Group__4__Impl7373);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3595:1: rule__Decomposes__Group__5 : rule__Decomposes__Group__5__Impl ;
    public final void rule__Decomposes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3599:1: ( rule__Decomposes__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3600:2: rule__Decomposes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Decomposes__Group__5__Impl_in_rule__Decomposes__Group__57403);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3606:1: rule__Decomposes__Group__5__Impl : ( ')' ) ;
    public final void rule__Decomposes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3610:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3611:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3611:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3612:1: ')'
            {
             before(grammarAccess.getDecomposesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Decomposes__Group__5__Impl7431); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3637:1: rule__Trusts__Group__0 : rule__Trusts__Group__0__Impl rule__Trusts__Group__1 ;
    public final void rule__Trusts__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3641:1: ( rule__Trusts__Group__0__Impl rule__Trusts__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3642:2: rule__Trusts__Group__0__Impl rule__Trusts__Group__1
            {
            pushFollow(FOLLOW_rule__Trusts__Group__0__Impl_in_rule__Trusts__Group__07474);
            rule__Trusts__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__1_in_rule__Trusts__Group__07477);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3649:1: rule__Trusts__Group__0__Impl : ( ( rule__Trusts__TypeAssignment_0 ) ) ;
    public final void rule__Trusts__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3653:1: ( ( ( rule__Trusts__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3654:1: ( ( rule__Trusts__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3654:1: ( ( rule__Trusts__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3655:1: ( rule__Trusts__TypeAssignment_0 )
            {
             before(grammarAccess.getTrustsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3656:1: ( rule__Trusts__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3656:2: rule__Trusts__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Trusts__TypeAssignment_0_in_rule__Trusts__Group__0__Impl7504);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3666:1: rule__Trusts__Group__1 : rule__Trusts__Group__1__Impl rule__Trusts__Group__2 ;
    public final void rule__Trusts__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3670:1: ( rule__Trusts__Group__1__Impl rule__Trusts__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3671:2: rule__Trusts__Group__1__Impl rule__Trusts__Group__2
            {
            pushFollow(FOLLOW_rule__Trusts__Group__1__Impl_in_rule__Trusts__Group__17534);
            rule__Trusts__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__2_in_rule__Trusts__Group__17537);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3678:1: rule__Trusts__Group__1__Impl : ( '(' ) ;
    public final void rule__Trusts__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3682:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3683:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3683:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3684:1: '('
            {
             before(grammarAccess.getTrustsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Trusts__Group__1__Impl7565); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3697:1: rule__Trusts__Group__2 : rule__Trusts__Group__2__Impl rule__Trusts__Group__3 ;
    public final void rule__Trusts__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3701:1: ( rule__Trusts__Group__2__Impl rule__Trusts__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3702:2: rule__Trusts__Group__2__Impl rule__Trusts__Group__3
            {
            pushFollow(FOLLOW_rule__Trusts__Group__2__Impl_in_rule__Trusts__Group__27596);
            rule__Trusts__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__3_in_rule__Trusts__Group__27599);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3709:1: rule__Trusts__Group__2__Impl : ( ( rule__Trusts__SourceAssignment_2 ) ) ;
    public final void rule__Trusts__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3713:1: ( ( ( rule__Trusts__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3714:1: ( ( rule__Trusts__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3714:1: ( ( rule__Trusts__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3715:1: ( rule__Trusts__SourceAssignment_2 )
            {
             before(grammarAccess.getTrustsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3716:1: ( rule__Trusts__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3716:2: rule__Trusts__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Trusts__SourceAssignment_2_in_rule__Trusts__Group__2__Impl7626);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3726:1: rule__Trusts__Group__3 : rule__Trusts__Group__3__Impl rule__Trusts__Group__4 ;
    public final void rule__Trusts__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3730:1: ( rule__Trusts__Group__3__Impl rule__Trusts__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3731:2: rule__Trusts__Group__3__Impl rule__Trusts__Group__4
            {
            pushFollow(FOLLOW_rule__Trusts__Group__3__Impl_in_rule__Trusts__Group__37656);
            rule__Trusts__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__4_in_rule__Trusts__Group__37659);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3738:1: rule__Trusts__Group__3__Impl : ( ',' ) ;
    public final void rule__Trusts__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3742:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3743:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3743:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3744:1: ','
            {
             before(grammarAccess.getTrustsAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Trusts__Group__3__Impl7687); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3757:1: rule__Trusts__Group__4 : rule__Trusts__Group__4__Impl rule__Trusts__Group__5 ;
    public final void rule__Trusts__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3761:1: ( rule__Trusts__Group__4__Impl rule__Trusts__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3762:2: rule__Trusts__Group__4__Impl rule__Trusts__Group__5
            {
            pushFollow(FOLLOW_rule__Trusts__Group__4__Impl_in_rule__Trusts__Group__47718);
            rule__Trusts__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__5_in_rule__Trusts__Group__47721);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3769:1: rule__Trusts__Group__4__Impl : ( ( rule__Trusts__TargetAssignment_4 ) ) ;
    public final void rule__Trusts__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3773:1: ( ( ( rule__Trusts__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3774:1: ( ( rule__Trusts__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3774:1: ( ( rule__Trusts__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3775:1: ( rule__Trusts__TargetAssignment_4 )
            {
             before(grammarAccess.getTrustsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3776:1: ( rule__Trusts__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3776:2: rule__Trusts__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Trusts__TargetAssignment_4_in_rule__Trusts__Group__4__Impl7748);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3786:1: rule__Trusts__Group__5 : rule__Trusts__Group__5__Impl rule__Trusts__Group__6 ;
    public final void rule__Trusts__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3790:1: ( rule__Trusts__Group__5__Impl rule__Trusts__Group__6 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3791:2: rule__Trusts__Group__5__Impl rule__Trusts__Group__6
            {
            pushFollow(FOLLOW_rule__Trusts__Group__5__Impl_in_rule__Trusts__Group__57778);
            rule__Trusts__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group__6_in_rule__Trusts__Group__57781);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3798:1: rule__Trusts__Group__5__Impl : ( ( rule__Trusts__Group_5__0 )? ) ;
    public final void rule__Trusts__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3802:1: ( ( ( rule__Trusts__Group_5__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3803:1: ( ( rule__Trusts__Group_5__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3803:1: ( ( rule__Trusts__Group_5__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3804:1: ( rule__Trusts__Group_5__0 )?
            {
             before(grammarAccess.getTrustsAccess().getGroup_5()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3805:1: ( rule__Trusts__Group_5__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==24) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3805:2: rule__Trusts__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Trusts__Group_5__0_in_rule__Trusts__Group__5__Impl7808);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3815:1: rule__Trusts__Group__6 : rule__Trusts__Group__6__Impl ;
    public final void rule__Trusts__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3819:1: ( rule__Trusts__Group__6__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3820:2: rule__Trusts__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Trusts__Group__6__Impl_in_rule__Trusts__Group__67839);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3826:1: rule__Trusts__Group__6__Impl : ( ')' ) ;
    public final void rule__Trusts__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3830:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3831:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3831:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3832:1: ')'
            {
             before(grammarAccess.getTrustsAccess().getRightParenthesisKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__Trusts__Group__6__Impl7867); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3859:1: rule__Trusts__Group_5__0 : rule__Trusts__Group_5__0__Impl rule__Trusts__Group_5__1 ;
    public final void rule__Trusts__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3863:1: ( rule__Trusts__Group_5__0__Impl rule__Trusts__Group_5__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3864:2: rule__Trusts__Group_5__0__Impl rule__Trusts__Group_5__1
            {
            pushFollow(FOLLOW_rule__Trusts__Group_5__0__Impl_in_rule__Trusts__Group_5__07912);
            rule__Trusts__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Trusts__Group_5__1_in_rule__Trusts__Group_5__07915);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3871:1: rule__Trusts__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Trusts__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3875:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3876:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3876:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3877:1: ','
            {
             before(grammarAccess.getTrustsAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Trusts__Group_5__0__Impl7943); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3890:1: rule__Trusts__Group_5__1 : rule__Trusts__Group_5__1__Impl ;
    public final void rule__Trusts__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3894:1: ( rule__Trusts__Group_5__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3895:2: rule__Trusts__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Trusts__Group_5__1__Impl_in_rule__Trusts__Group_5__17974);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3901:1: rule__Trusts__Group_5__1__Impl : ( ( rule__Trusts__EntityAssignment_5_1 ) ) ;
    public final void rule__Trusts__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3905:1: ( ( ( rule__Trusts__EntityAssignment_5_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3906:1: ( ( rule__Trusts__EntityAssignment_5_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3906:1: ( ( rule__Trusts__EntityAssignment_5_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3907:1: ( rule__Trusts__EntityAssignment_5_1 )
            {
             before(grammarAccess.getTrustsAccess().getEntityAssignment_5_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3908:1: ( rule__Trusts__EntityAssignment_5_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3908:2: rule__Trusts__EntityAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Trusts__EntityAssignment_5_1_in_rule__Trusts__Group_5__1__Impl8001);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3922:1: rule__Delegates__Group__0 : rule__Delegates__Group__0__Impl rule__Delegates__Group__1 ;
    public final void rule__Delegates__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3926:1: ( rule__Delegates__Group__0__Impl rule__Delegates__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3927:2: rule__Delegates__Group__0__Impl rule__Delegates__Group__1
            {
            pushFollow(FOLLOW_rule__Delegates__Group__0__Impl_in_rule__Delegates__Group__08035);
            rule__Delegates__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__1_in_rule__Delegates__Group__08038);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3934:1: rule__Delegates__Group__0__Impl : ( ( rule__Delegates__TypeAssignment_0 ) ) ;
    public final void rule__Delegates__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3938:1: ( ( ( rule__Delegates__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3939:1: ( ( rule__Delegates__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3939:1: ( ( rule__Delegates__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3940:1: ( rule__Delegates__TypeAssignment_0 )
            {
             before(grammarAccess.getDelegatesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3941:1: ( rule__Delegates__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3941:2: rule__Delegates__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Delegates__TypeAssignment_0_in_rule__Delegates__Group__0__Impl8065);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3951:1: rule__Delegates__Group__1 : rule__Delegates__Group__1__Impl rule__Delegates__Group__2 ;
    public final void rule__Delegates__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3955:1: ( rule__Delegates__Group__1__Impl rule__Delegates__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3956:2: rule__Delegates__Group__1__Impl rule__Delegates__Group__2
            {
            pushFollow(FOLLOW_rule__Delegates__Group__1__Impl_in_rule__Delegates__Group__18095);
            rule__Delegates__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__2_in_rule__Delegates__Group__18098);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3963:1: rule__Delegates__Group__1__Impl : ( '(' ) ;
    public final void rule__Delegates__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3967:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3968:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3968:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3969:1: '('
            {
             before(grammarAccess.getDelegatesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Delegates__Group__1__Impl8126); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3982:1: rule__Delegates__Group__2 : rule__Delegates__Group__2__Impl rule__Delegates__Group__3 ;
    public final void rule__Delegates__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3986:1: ( rule__Delegates__Group__2__Impl rule__Delegates__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3987:2: rule__Delegates__Group__2__Impl rule__Delegates__Group__3
            {
            pushFollow(FOLLOW_rule__Delegates__Group__2__Impl_in_rule__Delegates__Group__28157);
            rule__Delegates__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__3_in_rule__Delegates__Group__28160);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3994:1: rule__Delegates__Group__2__Impl : ( ( rule__Delegates__SourceAssignment_2 ) ) ;
    public final void rule__Delegates__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3998:1: ( ( ( rule__Delegates__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3999:1: ( ( rule__Delegates__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3999:1: ( ( rule__Delegates__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4000:1: ( rule__Delegates__SourceAssignment_2 )
            {
             before(grammarAccess.getDelegatesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4001:1: ( rule__Delegates__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4001:2: rule__Delegates__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Delegates__SourceAssignment_2_in_rule__Delegates__Group__2__Impl8187);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4011:1: rule__Delegates__Group__3 : rule__Delegates__Group__3__Impl rule__Delegates__Group__4 ;
    public final void rule__Delegates__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4015:1: ( rule__Delegates__Group__3__Impl rule__Delegates__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4016:2: rule__Delegates__Group__3__Impl rule__Delegates__Group__4
            {
            pushFollow(FOLLOW_rule__Delegates__Group__3__Impl_in_rule__Delegates__Group__38217);
            rule__Delegates__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__4_in_rule__Delegates__Group__38220);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4023:1: rule__Delegates__Group__3__Impl : ( ',' ) ;
    public final void rule__Delegates__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4027:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4028:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4028:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4029:1: ','
            {
             before(grammarAccess.getDelegatesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Delegates__Group__3__Impl8248); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4042:1: rule__Delegates__Group__4 : rule__Delegates__Group__4__Impl rule__Delegates__Group__5 ;
    public final void rule__Delegates__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4046:1: ( rule__Delegates__Group__4__Impl rule__Delegates__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4047:2: rule__Delegates__Group__4__Impl rule__Delegates__Group__5
            {
            pushFollow(FOLLOW_rule__Delegates__Group__4__Impl_in_rule__Delegates__Group__48279);
            rule__Delegates__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__5_in_rule__Delegates__Group__48282);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4054:1: rule__Delegates__Group__4__Impl : ( ( rule__Delegates__TargetAssignment_4 ) ) ;
    public final void rule__Delegates__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4058:1: ( ( ( rule__Delegates__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4059:1: ( ( rule__Delegates__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4059:1: ( ( rule__Delegates__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4060:1: ( rule__Delegates__TargetAssignment_4 )
            {
             before(grammarAccess.getDelegatesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4061:1: ( rule__Delegates__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4061:2: rule__Delegates__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Delegates__TargetAssignment_4_in_rule__Delegates__Group__4__Impl8309);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4071:1: rule__Delegates__Group__5 : rule__Delegates__Group__5__Impl rule__Delegates__Group__6 ;
    public final void rule__Delegates__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4075:1: ( rule__Delegates__Group__5__Impl rule__Delegates__Group__6 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4076:2: rule__Delegates__Group__5__Impl rule__Delegates__Group__6
            {
            pushFollow(FOLLOW_rule__Delegates__Group__5__Impl_in_rule__Delegates__Group__58339);
            rule__Delegates__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group__6_in_rule__Delegates__Group__58342);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4083:1: rule__Delegates__Group__5__Impl : ( ( rule__Delegates__Group_5__0 )? ) ;
    public final void rule__Delegates__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4087:1: ( ( ( rule__Delegates__Group_5__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4088:1: ( ( rule__Delegates__Group_5__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4088:1: ( ( rule__Delegates__Group_5__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4089:1: ( rule__Delegates__Group_5__0 )?
            {
             before(grammarAccess.getDelegatesAccess().getGroup_5()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4090:1: ( rule__Delegates__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4090:2: rule__Delegates__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Delegates__Group_5__0_in_rule__Delegates__Group__5__Impl8369);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4100:1: rule__Delegates__Group__6 : rule__Delegates__Group__6__Impl ;
    public final void rule__Delegates__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4104:1: ( rule__Delegates__Group__6__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4105:2: rule__Delegates__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Delegates__Group__6__Impl_in_rule__Delegates__Group__68400);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4111:1: rule__Delegates__Group__6__Impl : ( ')' ) ;
    public final void rule__Delegates__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4115:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4116:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4116:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4117:1: ')'
            {
             before(grammarAccess.getDelegatesAccess().getRightParenthesisKeyword_6()); 
            match(input,41,FOLLOW_41_in_rule__Delegates__Group__6__Impl8428); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4144:1: rule__Delegates__Group_5__0 : rule__Delegates__Group_5__0__Impl rule__Delegates__Group_5__1 ;
    public final void rule__Delegates__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4148:1: ( rule__Delegates__Group_5__0__Impl rule__Delegates__Group_5__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4149:2: rule__Delegates__Group_5__0__Impl rule__Delegates__Group_5__1
            {
            pushFollow(FOLLOW_rule__Delegates__Group_5__0__Impl_in_rule__Delegates__Group_5__08473);
            rule__Delegates__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Delegates__Group_5__1_in_rule__Delegates__Group_5__08476);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4156:1: rule__Delegates__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Delegates__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4160:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4161:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4161:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4162:1: ','
            {
             before(grammarAccess.getDelegatesAccess().getCommaKeyword_5_0()); 
            match(input,24,FOLLOW_24_in_rule__Delegates__Group_5__0__Impl8504); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4175:1: rule__Delegates__Group_5__1 : rule__Delegates__Group_5__1__Impl ;
    public final void rule__Delegates__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4179:1: ( rule__Delegates__Group_5__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4180:2: rule__Delegates__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Delegates__Group_5__1__Impl_in_rule__Delegates__Group_5__18535);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4186:1: rule__Delegates__Group_5__1__Impl : ( ( rule__Delegates__EntityAssignment_5_1 ) ) ;
    public final void rule__Delegates__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4190:1: ( ( ( rule__Delegates__EntityAssignment_5_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4191:1: ( ( rule__Delegates__EntityAssignment_5_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4191:1: ( ( rule__Delegates__EntityAssignment_5_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4192:1: ( rule__Delegates__EntityAssignment_5_1 )
            {
             before(grammarAccess.getDelegatesAccess().getEntityAssignment_5_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4193:1: ( rule__Delegates__EntityAssignment_5_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4193:2: rule__Delegates__EntityAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Delegates__EntityAssignment_5_1_in_rule__Delegates__Group_5__1__Impl8562);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4207:1: rule__Contributes__Group__0 : rule__Contributes__Group__0__Impl rule__Contributes__Group__1 ;
    public final void rule__Contributes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4211:1: ( rule__Contributes__Group__0__Impl rule__Contributes__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4212:2: rule__Contributes__Group__0__Impl rule__Contributes__Group__1
            {
            pushFollow(FOLLOW_rule__Contributes__Group__0__Impl_in_rule__Contributes__Group__08596);
            rule__Contributes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__1_in_rule__Contributes__Group__08599);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4219:1: rule__Contributes__Group__0__Impl : ( ( rule__Contributes__TypeAssignment_0 ) ) ;
    public final void rule__Contributes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4223:1: ( ( ( rule__Contributes__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4224:1: ( ( rule__Contributes__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4224:1: ( ( rule__Contributes__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4225:1: ( rule__Contributes__TypeAssignment_0 )
            {
             before(grammarAccess.getContributesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4226:1: ( rule__Contributes__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4226:2: rule__Contributes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Contributes__TypeAssignment_0_in_rule__Contributes__Group__0__Impl8626);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4236:1: rule__Contributes__Group__1 : rule__Contributes__Group__1__Impl rule__Contributes__Group__2 ;
    public final void rule__Contributes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4240:1: ( rule__Contributes__Group__1__Impl rule__Contributes__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4241:2: rule__Contributes__Group__1__Impl rule__Contributes__Group__2
            {
            pushFollow(FOLLOW_rule__Contributes__Group__1__Impl_in_rule__Contributes__Group__18656);
            rule__Contributes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__2_in_rule__Contributes__Group__18659);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4248:1: rule__Contributes__Group__1__Impl : ( '(' ) ;
    public final void rule__Contributes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4252:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4253:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4253:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4254:1: '('
            {
             before(grammarAccess.getContributesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Contributes__Group__1__Impl8687); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4267:1: rule__Contributes__Group__2 : rule__Contributes__Group__2__Impl rule__Contributes__Group__3 ;
    public final void rule__Contributes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4271:1: ( rule__Contributes__Group__2__Impl rule__Contributes__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4272:2: rule__Contributes__Group__2__Impl rule__Contributes__Group__3
            {
            pushFollow(FOLLOW_rule__Contributes__Group__2__Impl_in_rule__Contributes__Group__28718);
            rule__Contributes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__3_in_rule__Contributes__Group__28721);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4279:1: rule__Contributes__Group__2__Impl : ( ( rule__Contributes__SourceAssignment_2 ) ) ;
    public final void rule__Contributes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4283:1: ( ( ( rule__Contributes__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4284:1: ( ( rule__Contributes__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4284:1: ( ( rule__Contributes__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4285:1: ( rule__Contributes__SourceAssignment_2 )
            {
             before(grammarAccess.getContributesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4286:1: ( rule__Contributes__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4286:2: rule__Contributes__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Contributes__SourceAssignment_2_in_rule__Contributes__Group__2__Impl8748);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4296:1: rule__Contributes__Group__3 : rule__Contributes__Group__3__Impl rule__Contributes__Group__4 ;
    public final void rule__Contributes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4300:1: ( rule__Contributes__Group__3__Impl rule__Contributes__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4301:2: rule__Contributes__Group__3__Impl rule__Contributes__Group__4
            {
            pushFollow(FOLLOW_rule__Contributes__Group__3__Impl_in_rule__Contributes__Group__38778);
            rule__Contributes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__4_in_rule__Contributes__Group__38781);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4308:1: rule__Contributes__Group__3__Impl : ( ',' ) ;
    public final void rule__Contributes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4312:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4313:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4313:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4314:1: ','
            {
             before(grammarAccess.getContributesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Contributes__Group__3__Impl8809); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4327:1: rule__Contributes__Group__4 : rule__Contributes__Group__4__Impl rule__Contributes__Group__5 ;
    public final void rule__Contributes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4331:1: ( rule__Contributes__Group__4__Impl rule__Contributes__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4332:2: rule__Contributes__Group__4__Impl rule__Contributes__Group__5
            {
            pushFollow(FOLLOW_rule__Contributes__Group__4__Impl_in_rule__Contributes__Group__48840);
            rule__Contributes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Contributes__Group__5_in_rule__Contributes__Group__48843);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4339:1: rule__Contributes__Group__4__Impl : ( ( rule__Contributes__TargetAssignment_4 ) ) ;
    public final void rule__Contributes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4343:1: ( ( ( rule__Contributes__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4344:1: ( ( rule__Contributes__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4344:1: ( ( rule__Contributes__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4345:1: ( rule__Contributes__TargetAssignment_4 )
            {
             before(grammarAccess.getContributesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4346:1: ( rule__Contributes__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4346:2: rule__Contributes__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Contributes__TargetAssignment_4_in_rule__Contributes__Group__4__Impl8870);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4356:1: rule__Contributes__Group__5 : rule__Contributes__Group__5__Impl ;
    public final void rule__Contributes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4360:1: ( rule__Contributes__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4361:2: rule__Contributes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Contributes__Group__5__Impl_in_rule__Contributes__Group__58900);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4367:1: rule__Contributes__Group__5__Impl : ( ')' ) ;
    public final void rule__Contributes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4371:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4372:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4372:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4373:1: ')'
            {
             before(grammarAccess.getContributesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Contributes__Group__5__Impl8928); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4398:1: rule__Fulfils__Group__0 : rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1 ;
    public final void rule__Fulfils__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4402:1: ( rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4403:2: rule__Fulfils__Group__0__Impl rule__Fulfils__Group__1
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__0__Impl_in_rule__Fulfils__Group__08971);
            rule__Fulfils__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__1_in_rule__Fulfils__Group__08974);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4410:1: rule__Fulfils__Group__0__Impl : ( ( rule__Fulfils__TypeAssignment_0 ) ) ;
    public final void rule__Fulfils__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4414:1: ( ( ( rule__Fulfils__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4415:1: ( ( rule__Fulfils__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4415:1: ( ( rule__Fulfils__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4416:1: ( rule__Fulfils__TypeAssignment_0 )
            {
             before(grammarAccess.getFulfilsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4417:1: ( rule__Fulfils__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4417:2: rule__Fulfils__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Fulfils__TypeAssignment_0_in_rule__Fulfils__Group__0__Impl9001);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4427:1: rule__Fulfils__Group__1 : rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2 ;
    public final void rule__Fulfils__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4431:1: ( rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4432:2: rule__Fulfils__Group__1__Impl rule__Fulfils__Group__2
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__1__Impl_in_rule__Fulfils__Group__19031);
            rule__Fulfils__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__2_in_rule__Fulfils__Group__19034);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4439:1: rule__Fulfils__Group__1__Impl : ( '(' ) ;
    public final void rule__Fulfils__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4443:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4444:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4444:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4445:1: '('
            {
             before(grammarAccess.getFulfilsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Fulfils__Group__1__Impl9062); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4458:1: rule__Fulfils__Group__2 : rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3 ;
    public final void rule__Fulfils__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4462:1: ( rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4463:2: rule__Fulfils__Group__2__Impl rule__Fulfils__Group__3
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__2__Impl_in_rule__Fulfils__Group__29093);
            rule__Fulfils__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__3_in_rule__Fulfils__Group__29096);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4470:1: rule__Fulfils__Group__2__Impl : ( ( rule__Fulfils__SourceAssignment_2 ) ) ;
    public final void rule__Fulfils__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4474:1: ( ( ( rule__Fulfils__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4475:1: ( ( rule__Fulfils__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4475:1: ( ( rule__Fulfils__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4476:1: ( rule__Fulfils__SourceAssignment_2 )
            {
             before(grammarAccess.getFulfilsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4477:1: ( rule__Fulfils__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4477:2: rule__Fulfils__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Fulfils__SourceAssignment_2_in_rule__Fulfils__Group__2__Impl9123);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4487:1: rule__Fulfils__Group__3 : rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4 ;
    public final void rule__Fulfils__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4491:1: ( rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4492:2: rule__Fulfils__Group__3__Impl rule__Fulfils__Group__4
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__3__Impl_in_rule__Fulfils__Group__39153);
            rule__Fulfils__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__4_in_rule__Fulfils__Group__39156);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4499:1: rule__Fulfils__Group__3__Impl : ( ',' ) ;
    public final void rule__Fulfils__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4503:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4504:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4504:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4505:1: ','
            {
             before(grammarAccess.getFulfilsAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Fulfils__Group__3__Impl9184); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4518:1: rule__Fulfils__Group__4 : rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5 ;
    public final void rule__Fulfils__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4522:1: ( rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4523:2: rule__Fulfils__Group__4__Impl rule__Fulfils__Group__5
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__4__Impl_in_rule__Fulfils__Group__49215);
            rule__Fulfils__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Fulfils__Group__5_in_rule__Fulfils__Group__49218);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4530:1: rule__Fulfils__Group__4__Impl : ( ( rule__Fulfils__TargetAssignment_4 ) ) ;
    public final void rule__Fulfils__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4534:1: ( ( ( rule__Fulfils__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4535:1: ( ( rule__Fulfils__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4535:1: ( ( rule__Fulfils__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4536:1: ( rule__Fulfils__TargetAssignment_4 )
            {
             before(grammarAccess.getFulfilsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4537:1: ( rule__Fulfils__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4537:2: rule__Fulfils__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Fulfils__TargetAssignment_4_in_rule__Fulfils__Group__4__Impl9245);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4547:1: rule__Fulfils__Group__5 : rule__Fulfils__Group__5__Impl ;
    public final void rule__Fulfils__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4551:1: ( rule__Fulfils__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4552:2: rule__Fulfils__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Fulfils__Group__5__Impl_in_rule__Fulfils__Group__59275);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4558:1: rule__Fulfils__Group__5__Impl : ( ')' ) ;
    public final void rule__Fulfils__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4562:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4563:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4563:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4564:1: ')'
            {
             before(grammarAccess.getFulfilsAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Fulfils__Group__5__Impl9303); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4589:1: rule__Provides__Group__0 : rule__Provides__Group__0__Impl rule__Provides__Group__1 ;
    public final void rule__Provides__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4593:1: ( rule__Provides__Group__0__Impl rule__Provides__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4594:2: rule__Provides__Group__0__Impl rule__Provides__Group__1
            {
            pushFollow(FOLLOW_rule__Provides__Group__0__Impl_in_rule__Provides__Group__09346);
            rule__Provides__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__1_in_rule__Provides__Group__09349);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4601:1: rule__Provides__Group__0__Impl : ( ( rule__Provides__TypeAssignment_0 ) ) ;
    public final void rule__Provides__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4605:1: ( ( ( rule__Provides__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4606:1: ( ( rule__Provides__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4606:1: ( ( rule__Provides__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4607:1: ( rule__Provides__TypeAssignment_0 )
            {
             before(grammarAccess.getProvidesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4608:1: ( rule__Provides__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4608:2: rule__Provides__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Provides__TypeAssignment_0_in_rule__Provides__Group__0__Impl9376);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4618:1: rule__Provides__Group__1 : rule__Provides__Group__1__Impl rule__Provides__Group__2 ;
    public final void rule__Provides__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4622:1: ( rule__Provides__Group__1__Impl rule__Provides__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4623:2: rule__Provides__Group__1__Impl rule__Provides__Group__2
            {
            pushFollow(FOLLOW_rule__Provides__Group__1__Impl_in_rule__Provides__Group__19406);
            rule__Provides__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__2_in_rule__Provides__Group__19409);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4630:1: rule__Provides__Group__1__Impl : ( '(' ) ;
    public final void rule__Provides__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4634:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4635:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4635:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4636:1: '('
            {
             before(grammarAccess.getProvidesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Provides__Group__1__Impl9437); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4649:1: rule__Provides__Group__2 : rule__Provides__Group__2__Impl rule__Provides__Group__3 ;
    public final void rule__Provides__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4653:1: ( rule__Provides__Group__2__Impl rule__Provides__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4654:2: rule__Provides__Group__2__Impl rule__Provides__Group__3
            {
            pushFollow(FOLLOW_rule__Provides__Group__2__Impl_in_rule__Provides__Group__29468);
            rule__Provides__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__3_in_rule__Provides__Group__29471);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4661:1: rule__Provides__Group__2__Impl : ( ( rule__Provides__Alternatives_2 ) ) ;
    public final void rule__Provides__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4665:1: ( ( ( rule__Provides__Alternatives_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4666:1: ( ( rule__Provides__Alternatives_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4666:1: ( ( rule__Provides__Alternatives_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4667:1: ( rule__Provides__Alternatives_2 )
            {
             before(grammarAccess.getProvidesAccess().getAlternatives_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4668:1: ( rule__Provides__Alternatives_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4668:2: rule__Provides__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Provides__Alternatives_2_in_rule__Provides__Group__2__Impl9498);
            rule__Provides__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getProvidesAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4678:1: rule__Provides__Group__3 : rule__Provides__Group__3__Impl rule__Provides__Group__4 ;
    public final void rule__Provides__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4682:1: ( rule__Provides__Group__3__Impl rule__Provides__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4683:2: rule__Provides__Group__3__Impl rule__Provides__Group__4
            {
            pushFollow(FOLLOW_rule__Provides__Group__3__Impl_in_rule__Provides__Group__39528);
            rule__Provides__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__4_in_rule__Provides__Group__39531);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4690:1: rule__Provides__Group__3__Impl : ( ',' ) ;
    public final void rule__Provides__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4694:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4695:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4695:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4696:1: ','
            {
             before(grammarAccess.getProvidesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Provides__Group__3__Impl9559); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4709:1: rule__Provides__Group__4 : rule__Provides__Group__4__Impl rule__Provides__Group__5 ;
    public final void rule__Provides__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4713:1: ( rule__Provides__Group__4__Impl rule__Provides__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4714:2: rule__Provides__Group__4__Impl rule__Provides__Group__5
            {
            pushFollow(FOLLOW_rule__Provides__Group__4__Impl_in_rule__Provides__Group__49590);
            rule__Provides__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Provides__Group__5_in_rule__Provides__Group__49593);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4721:1: rule__Provides__Group__4__Impl : ( ( rule__Provides__TargetAssignment_4 ) ) ;
    public final void rule__Provides__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4725:1: ( ( ( rule__Provides__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4726:1: ( ( rule__Provides__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4726:1: ( ( rule__Provides__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4727:1: ( rule__Provides__TargetAssignment_4 )
            {
             before(grammarAccess.getProvidesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4728:1: ( rule__Provides__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4728:2: rule__Provides__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Provides__TargetAssignment_4_in_rule__Provides__Group__4__Impl9620);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4738:1: rule__Provides__Group__5 : rule__Provides__Group__5__Impl ;
    public final void rule__Provides__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4742:1: ( rule__Provides__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4743:2: rule__Provides__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Provides__Group__5__Impl_in_rule__Provides__Group__59650);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4749:1: rule__Provides__Group__5__Impl : ( ')' ) ;
    public final void rule__Provides__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4753:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4754:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4754:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4755:1: ')'
            {
             before(grammarAccess.getProvidesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Provides__Group__5__Impl9678); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4780:1: rule__Consumes__Group__0 : rule__Consumes__Group__0__Impl rule__Consumes__Group__1 ;
    public final void rule__Consumes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4784:1: ( rule__Consumes__Group__0__Impl rule__Consumes__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4785:2: rule__Consumes__Group__0__Impl rule__Consumes__Group__1
            {
            pushFollow(FOLLOW_rule__Consumes__Group__0__Impl_in_rule__Consumes__Group__09721);
            rule__Consumes__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__1_in_rule__Consumes__Group__09724);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4792:1: rule__Consumes__Group__0__Impl : ( ( rule__Consumes__TypeAssignment_0 ) ) ;
    public final void rule__Consumes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4796:1: ( ( ( rule__Consumes__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4797:1: ( ( rule__Consumes__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4797:1: ( ( rule__Consumes__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4798:1: ( rule__Consumes__TypeAssignment_0 )
            {
             before(grammarAccess.getConsumesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4799:1: ( rule__Consumes__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4799:2: rule__Consumes__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Consumes__TypeAssignment_0_in_rule__Consumes__Group__0__Impl9751);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4809:1: rule__Consumes__Group__1 : rule__Consumes__Group__1__Impl rule__Consumes__Group__2 ;
    public final void rule__Consumes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4813:1: ( rule__Consumes__Group__1__Impl rule__Consumes__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4814:2: rule__Consumes__Group__1__Impl rule__Consumes__Group__2
            {
            pushFollow(FOLLOW_rule__Consumes__Group__1__Impl_in_rule__Consumes__Group__19781);
            rule__Consumes__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__2_in_rule__Consumes__Group__19784);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4821:1: rule__Consumes__Group__1__Impl : ( '(' ) ;
    public final void rule__Consumes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4825:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4826:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4826:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4827:1: '('
            {
             before(grammarAccess.getConsumesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Consumes__Group__1__Impl9812); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4840:1: rule__Consumes__Group__2 : rule__Consumes__Group__2__Impl rule__Consumes__Group__3 ;
    public final void rule__Consumes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4844:1: ( rule__Consumes__Group__2__Impl rule__Consumes__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4845:2: rule__Consumes__Group__2__Impl rule__Consumes__Group__3
            {
            pushFollow(FOLLOW_rule__Consumes__Group__2__Impl_in_rule__Consumes__Group__29843);
            rule__Consumes__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__3_in_rule__Consumes__Group__29846);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4852:1: rule__Consumes__Group__2__Impl : ( ( rule__Consumes__Alternatives_2 ) ) ;
    public final void rule__Consumes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4856:1: ( ( ( rule__Consumes__Alternatives_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4857:1: ( ( rule__Consumes__Alternatives_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4857:1: ( ( rule__Consumes__Alternatives_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4858:1: ( rule__Consumes__Alternatives_2 )
            {
             before(grammarAccess.getConsumesAccess().getAlternatives_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4859:1: ( rule__Consumes__Alternatives_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4859:2: rule__Consumes__Alternatives_2
            {
            pushFollow(FOLLOW_rule__Consumes__Alternatives_2_in_rule__Consumes__Group__2__Impl9873);
            rule__Consumes__Alternatives_2();
            _fsp--;


            }

             after(grammarAccess.getConsumesAccess().getAlternatives_2()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4869:1: rule__Consumes__Group__3 : rule__Consumes__Group__3__Impl rule__Consumes__Group__4 ;
    public final void rule__Consumes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4873:1: ( rule__Consumes__Group__3__Impl rule__Consumes__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4874:2: rule__Consumes__Group__3__Impl rule__Consumes__Group__4
            {
            pushFollow(FOLLOW_rule__Consumes__Group__3__Impl_in_rule__Consumes__Group__39903);
            rule__Consumes__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__4_in_rule__Consumes__Group__39906);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4881:1: rule__Consumes__Group__3__Impl : ( ',' ) ;
    public final void rule__Consumes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4885:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4886:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4886:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4887:1: ','
            {
             before(grammarAccess.getConsumesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Consumes__Group__3__Impl9934); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4900:1: rule__Consumes__Group__4 : rule__Consumes__Group__4__Impl rule__Consumes__Group__5 ;
    public final void rule__Consumes__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4904:1: ( rule__Consumes__Group__4__Impl rule__Consumes__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4905:2: rule__Consumes__Group__4__Impl rule__Consumes__Group__5
            {
            pushFollow(FOLLOW_rule__Consumes__Group__4__Impl_in_rule__Consumes__Group__49965);
            rule__Consumes__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Consumes__Group__5_in_rule__Consumes__Group__49968);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4912:1: rule__Consumes__Group__4__Impl : ( ( rule__Consumes__TargetAssignment_4 ) ) ;
    public final void rule__Consumes__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4916:1: ( ( ( rule__Consumes__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4917:1: ( ( rule__Consumes__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4917:1: ( ( rule__Consumes__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4918:1: ( rule__Consumes__TargetAssignment_4 )
            {
             before(grammarAccess.getConsumesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4919:1: ( rule__Consumes__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4919:2: rule__Consumes__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Consumes__TargetAssignment_4_in_rule__Consumes__Group__4__Impl9995);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4929:1: rule__Consumes__Group__5 : rule__Consumes__Group__5__Impl ;
    public final void rule__Consumes__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4933:1: ( rule__Consumes__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4934:2: rule__Consumes__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Consumes__Group__5__Impl_in_rule__Consumes__Group__510025);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4940:1: rule__Consumes__Group__5__Impl : ( ')' ) ;
    public final void rule__Consumes__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4944:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4945:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4945:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4946:1: ')'
            {
             before(grammarAccess.getConsumesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Consumes__Group__5__Impl10053); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4971:1: rule__Exploits__Group__0 : rule__Exploits__Group__0__Impl rule__Exploits__Group__1 ;
    public final void rule__Exploits__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4975:1: ( rule__Exploits__Group__0__Impl rule__Exploits__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4976:2: rule__Exploits__Group__0__Impl rule__Exploits__Group__1
            {
            pushFollow(FOLLOW_rule__Exploits__Group__0__Impl_in_rule__Exploits__Group__010096);
            rule__Exploits__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__1_in_rule__Exploits__Group__010099);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4983:1: rule__Exploits__Group__0__Impl : ( ( rule__Exploits__TypeAssignment_0 ) ) ;
    public final void rule__Exploits__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4987:1: ( ( ( rule__Exploits__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4988:1: ( ( rule__Exploits__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4988:1: ( ( rule__Exploits__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4989:1: ( rule__Exploits__TypeAssignment_0 )
            {
             before(grammarAccess.getExploitsAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4990:1: ( rule__Exploits__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:4990:2: rule__Exploits__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Exploits__TypeAssignment_0_in_rule__Exploits__Group__0__Impl10126);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5000:1: rule__Exploits__Group__1 : rule__Exploits__Group__1__Impl rule__Exploits__Group__2 ;
    public final void rule__Exploits__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5004:1: ( rule__Exploits__Group__1__Impl rule__Exploits__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5005:2: rule__Exploits__Group__1__Impl rule__Exploits__Group__2
            {
            pushFollow(FOLLOW_rule__Exploits__Group__1__Impl_in_rule__Exploits__Group__110156);
            rule__Exploits__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__2_in_rule__Exploits__Group__110159);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5012:1: rule__Exploits__Group__1__Impl : ( '(' ) ;
    public final void rule__Exploits__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5016:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5017:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5017:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5018:1: '('
            {
             before(grammarAccess.getExploitsAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Exploits__Group__1__Impl10187); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5031:1: rule__Exploits__Group__2 : rule__Exploits__Group__2__Impl rule__Exploits__Group__3 ;
    public final void rule__Exploits__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5035:1: ( rule__Exploits__Group__2__Impl rule__Exploits__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5036:2: rule__Exploits__Group__2__Impl rule__Exploits__Group__3
            {
            pushFollow(FOLLOW_rule__Exploits__Group__2__Impl_in_rule__Exploits__Group__210218);
            rule__Exploits__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__3_in_rule__Exploits__Group__210221);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5043:1: rule__Exploits__Group__2__Impl : ( ( rule__Exploits__SourceAssignment_2 ) ) ;
    public final void rule__Exploits__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5047:1: ( ( ( rule__Exploits__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5048:1: ( ( rule__Exploits__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5048:1: ( ( rule__Exploits__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5049:1: ( rule__Exploits__SourceAssignment_2 )
            {
             before(grammarAccess.getExploitsAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5050:1: ( rule__Exploits__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5050:2: rule__Exploits__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Exploits__SourceAssignment_2_in_rule__Exploits__Group__2__Impl10248);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5060:1: rule__Exploits__Group__3 : rule__Exploits__Group__3__Impl rule__Exploits__Group__4 ;
    public final void rule__Exploits__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5064:1: ( rule__Exploits__Group__3__Impl rule__Exploits__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5065:2: rule__Exploits__Group__3__Impl rule__Exploits__Group__4
            {
            pushFollow(FOLLOW_rule__Exploits__Group__3__Impl_in_rule__Exploits__Group__310278);
            rule__Exploits__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__4_in_rule__Exploits__Group__310281);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5072:1: rule__Exploits__Group__3__Impl : ( ',' ) ;
    public final void rule__Exploits__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5076:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5077:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5077:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5078:1: ','
            {
             before(grammarAccess.getExploitsAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Exploits__Group__3__Impl10309); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5091:1: rule__Exploits__Group__4 : rule__Exploits__Group__4__Impl rule__Exploits__Group__5 ;
    public final void rule__Exploits__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5095:1: ( rule__Exploits__Group__4__Impl rule__Exploits__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5096:2: rule__Exploits__Group__4__Impl rule__Exploits__Group__5
            {
            pushFollow(FOLLOW_rule__Exploits__Group__4__Impl_in_rule__Exploits__Group__410340);
            rule__Exploits__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Exploits__Group__5_in_rule__Exploits__Group__410343);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5103:1: rule__Exploits__Group__4__Impl : ( ( rule__Exploits__TargetAssignment_4 ) ) ;
    public final void rule__Exploits__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5107:1: ( ( ( rule__Exploits__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5108:1: ( ( rule__Exploits__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5108:1: ( ( rule__Exploits__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5109:1: ( rule__Exploits__TargetAssignment_4 )
            {
             before(grammarAccess.getExploitsAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5110:1: ( rule__Exploits__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5110:2: rule__Exploits__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Exploits__TargetAssignment_4_in_rule__Exploits__Group__4__Impl10370);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5120:1: rule__Exploits__Group__5 : rule__Exploits__Group__5__Impl ;
    public final void rule__Exploits__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5124:1: ( rule__Exploits__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5125:2: rule__Exploits__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Exploits__Group__5__Impl_in_rule__Exploits__Group__510400);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5131:1: rule__Exploits__Group__5__Impl : ( ')' ) ;
    public final void rule__Exploits__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5135:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5136:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5136:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5137:1: ')'
            {
             before(grammarAccess.getExploitsAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Exploits__Group__5__Impl10428); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5162:1: rule__Damages__Group__0 : rule__Damages__Group__0__Impl rule__Damages__Group__1 ;
    public final void rule__Damages__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5166:1: ( rule__Damages__Group__0__Impl rule__Damages__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5167:2: rule__Damages__Group__0__Impl rule__Damages__Group__1
            {
            pushFollow(FOLLOW_rule__Damages__Group__0__Impl_in_rule__Damages__Group__010471);
            rule__Damages__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__1_in_rule__Damages__Group__010474);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5174:1: rule__Damages__Group__0__Impl : ( ( rule__Damages__TypeAssignment_0 ) ) ;
    public final void rule__Damages__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5178:1: ( ( ( rule__Damages__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5179:1: ( ( rule__Damages__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5179:1: ( ( rule__Damages__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5180:1: ( rule__Damages__TypeAssignment_0 )
            {
             before(grammarAccess.getDamagesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5181:1: ( rule__Damages__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5181:2: rule__Damages__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Damages__TypeAssignment_0_in_rule__Damages__Group__0__Impl10501);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5191:1: rule__Damages__Group__1 : rule__Damages__Group__1__Impl rule__Damages__Group__2 ;
    public final void rule__Damages__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5195:1: ( rule__Damages__Group__1__Impl rule__Damages__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5196:2: rule__Damages__Group__1__Impl rule__Damages__Group__2
            {
            pushFollow(FOLLOW_rule__Damages__Group__1__Impl_in_rule__Damages__Group__110531);
            rule__Damages__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__2_in_rule__Damages__Group__110534);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5203:1: rule__Damages__Group__1__Impl : ( '(' ) ;
    public final void rule__Damages__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5207:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5208:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5208:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5209:1: '('
            {
             before(grammarAccess.getDamagesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Damages__Group__1__Impl10562); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5222:1: rule__Damages__Group__2 : rule__Damages__Group__2__Impl rule__Damages__Group__3 ;
    public final void rule__Damages__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5226:1: ( rule__Damages__Group__2__Impl rule__Damages__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5227:2: rule__Damages__Group__2__Impl rule__Damages__Group__3
            {
            pushFollow(FOLLOW_rule__Damages__Group__2__Impl_in_rule__Damages__Group__210593);
            rule__Damages__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__3_in_rule__Damages__Group__210596);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5234:1: rule__Damages__Group__2__Impl : ( ( rule__Damages__SourceAssignment_2 ) ) ;
    public final void rule__Damages__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5238:1: ( ( ( rule__Damages__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5239:1: ( ( rule__Damages__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5239:1: ( ( rule__Damages__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5240:1: ( rule__Damages__SourceAssignment_2 )
            {
             before(grammarAccess.getDamagesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5241:1: ( rule__Damages__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5241:2: rule__Damages__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Damages__SourceAssignment_2_in_rule__Damages__Group__2__Impl10623);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5251:1: rule__Damages__Group__3 : rule__Damages__Group__3__Impl rule__Damages__Group__4 ;
    public final void rule__Damages__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5255:1: ( rule__Damages__Group__3__Impl rule__Damages__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5256:2: rule__Damages__Group__3__Impl rule__Damages__Group__4
            {
            pushFollow(FOLLOW_rule__Damages__Group__3__Impl_in_rule__Damages__Group__310653);
            rule__Damages__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__4_in_rule__Damages__Group__310656);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5263:1: rule__Damages__Group__3__Impl : ( ',' ) ;
    public final void rule__Damages__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5267:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5268:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5268:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5269:1: ','
            {
             before(grammarAccess.getDamagesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Damages__Group__3__Impl10684); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5282:1: rule__Damages__Group__4 : rule__Damages__Group__4__Impl rule__Damages__Group__5 ;
    public final void rule__Damages__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5286:1: ( rule__Damages__Group__4__Impl rule__Damages__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5287:2: rule__Damages__Group__4__Impl rule__Damages__Group__5
            {
            pushFollow(FOLLOW_rule__Damages__Group__4__Impl_in_rule__Damages__Group__410715);
            rule__Damages__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Damages__Group__5_in_rule__Damages__Group__410718);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5294:1: rule__Damages__Group__4__Impl : ( ( rule__Damages__TargetAssignment_4 ) ) ;
    public final void rule__Damages__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5298:1: ( ( ( rule__Damages__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5299:1: ( ( rule__Damages__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5299:1: ( ( rule__Damages__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5300:1: ( rule__Damages__TargetAssignment_4 )
            {
             before(grammarAccess.getDamagesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5301:1: ( rule__Damages__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5301:2: rule__Damages__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Damages__TargetAssignment_4_in_rule__Damages__Group__4__Impl10745);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5311:1: rule__Damages__Group__5 : rule__Damages__Group__5__Impl ;
    public final void rule__Damages__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5315:1: ( rule__Damages__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5316:2: rule__Damages__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Damages__Group__5__Impl_in_rule__Damages__Group__510775);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5322:1: rule__Damages__Group__5__Impl : ( ')' ) ;
    public final void rule__Damages__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5326:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5327:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5327:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5328:1: ')'
            {
             before(grammarAccess.getDamagesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Damages__Group__5__Impl10803); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5353:1: rule__Attacks__Group__0 : rule__Attacks__Group__0__Impl rule__Attacks__Group__1 ;
    public final void rule__Attacks__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5357:1: ( rule__Attacks__Group__0__Impl rule__Attacks__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5358:2: rule__Attacks__Group__0__Impl rule__Attacks__Group__1
            {
            pushFollow(FOLLOW_rule__Attacks__Group__0__Impl_in_rule__Attacks__Group__010846);
            rule__Attacks__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__1_in_rule__Attacks__Group__010849);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5365:1: rule__Attacks__Group__0__Impl : ( ( rule__Attacks__TypeAssignment_0 ) ) ;
    public final void rule__Attacks__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5369:1: ( ( ( rule__Attacks__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5370:1: ( ( rule__Attacks__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5370:1: ( ( rule__Attacks__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5371:1: ( rule__Attacks__TypeAssignment_0 )
            {
             before(grammarAccess.getAttacksAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5372:1: ( rule__Attacks__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5372:2: rule__Attacks__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Attacks__TypeAssignment_0_in_rule__Attacks__Group__0__Impl10876);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5382:1: rule__Attacks__Group__1 : rule__Attacks__Group__1__Impl rule__Attacks__Group__2 ;
    public final void rule__Attacks__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5386:1: ( rule__Attacks__Group__1__Impl rule__Attacks__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5387:2: rule__Attacks__Group__1__Impl rule__Attacks__Group__2
            {
            pushFollow(FOLLOW_rule__Attacks__Group__1__Impl_in_rule__Attacks__Group__110906);
            rule__Attacks__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__2_in_rule__Attacks__Group__110909);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5394:1: rule__Attacks__Group__1__Impl : ( '(' ) ;
    public final void rule__Attacks__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5398:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5399:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5399:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5400:1: '('
            {
             before(grammarAccess.getAttacksAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Attacks__Group__1__Impl10937); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5413:1: rule__Attacks__Group__2 : rule__Attacks__Group__2__Impl rule__Attacks__Group__3 ;
    public final void rule__Attacks__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5417:1: ( rule__Attacks__Group__2__Impl rule__Attacks__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5418:2: rule__Attacks__Group__2__Impl rule__Attacks__Group__3
            {
            pushFollow(FOLLOW_rule__Attacks__Group__2__Impl_in_rule__Attacks__Group__210968);
            rule__Attacks__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__3_in_rule__Attacks__Group__210971);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5425:1: rule__Attacks__Group__2__Impl : ( ( rule__Attacks__SourceAssignment_2 ) ) ;
    public final void rule__Attacks__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5429:1: ( ( ( rule__Attacks__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5430:1: ( ( rule__Attacks__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5430:1: ( ( rule__Attacks__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5431:1: ( rule__Attacks__SourceAssignment_2 )
            {
             before(grammarAccess.getAttacksAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5432:1: ( rule__Attacks__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5432:2: rule__Attacks__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Attacks__SourceAssignment_2_in_rule__Attacks__Group__2__Impl10998);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5442:1: rule__Attacks__Group__3 : rule__Attacks__Group__3__Impl rule__Attacks__Group__4 ;
    public final void rule__Attacks__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5446:1: ( rule__Attacks__Group__3__Impl rule__Attacks__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5447:2: rule__Attacks__Group__3__Impl rule__Attacks__Group__4
            {
            pushFollow(FOLLOW_rule__Attacks__Group__3__Impl_in_rule__Attacks__Group__311028);
            rule__Attacks__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__4_in_rule__Attacks__Group__311031);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5454:1: rule__Attacks__Group__3__Impl : ( ',' ) ;
    public final void rule__Attacks__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5458:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5459:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5459:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5460:1: ','
            {
             before(grammarAccess.getAttacksAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Attacks__Group__3__Impl11059); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5473:1: rule__Attacks__Group__4 : rule__Attacks__Group__4__Impl rule__Attacks__Group__5 ;
    public final void rule__Attacks__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5477:1: ( rule__Attacks__Group__4__Impl rule__Attacks__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5478:2: rule__Attacks__Group__4__Impl rule__Attacks__Group__5
            {
            pushFollow(FOLLOW_rule__Attacks__Group__4__Impl_in_rule__Attacks__Group__411090);
            rule__Attacks__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacks__Group__5_in_rule__Attacks__Group__411093);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5485:1: rule__Attacks__Group__4__Impl : ( ( rule__Attacks__TargetAssignment_4 ) ) ;
    public final void rule__Attacks__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5489:1: ( ( ( rule__Attacks__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5490:1: ( ( rule__Attacks__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5490:1: ( ( rule__Attacks__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5491:1: ( rule__Attacks__TargetAssignment_4 )
            {
             before(grammarAccess.getAttacksAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5492:1: ( rule__Attacks__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5492:2: rule__Attacks__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Attacks__TargetAssignment_4_in_rule__Attacks__Group__4__Impl11120);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5502:1: rule__Attacks__Group__5 : rule__Attacks__Group__5__Impl ;
    public final void rule__Attacks__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5506:1: ( rule__Attacks__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5507:2: rule__Attacks__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Attacks__Group__5__Impl_in_rule__Attacks__Group__511150);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5513:1: rule__Attacks__Group__5__Impl : ( ')' ) ;
    public final void rule__Attacks__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5517:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5518:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5518:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5519:1: ')'
            {
             before(grammarAccess.getAttacksAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Attacks__Group__5__Impl11178); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5544:1: rule__Argues__Group__0 : rule__Argues__Group__0__Impl rule__Argues__Group__1 ;
    public final void rule__Argues__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5548:1: ( rule__Argues__Group__0__Impl rule__Argues__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5549:2: rule__Argues__Group__0__Impl rule__Argues__Group__1
            {
            pushFollow(FOLLOW_rule__Argues__Group__0__Impl_in_rule__Argues__Group__011221);
            rule__Argues__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__1_in_rule__Argues__Group__011224);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5556:1: rule__Argues__Group__0__Impl : ( ( rule__Argues__TypeAssignment_0 ) ) ;
    public final void rule__Argues__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5560:1: ( ( ( rule__Argues__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5561:1: ( ( rule__Argues__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5561:1: ( ( rule__Argues__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5562:1: ( rule__Argues__TypeAssignment_0 )
            {
             before(grammarAccess.getArguesAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5563:1: ( rule__Argues__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5563:2: rule__Argues__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Argues__TypeAssignment_0_in_rule__Argues__Group__0__Impl11251);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5573:1: rule__Argues__Group__1 : rule__Argues__Group__1__Impl rule__Argues__Group__2 ;
    public final void rule__Argues__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5577:1: ( rule__Argues__Group__1__Impl rule__Argues__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5578:2: rule__Argues__Group__1__Impl rule__Argues__Group__2
            {
            pushFollow(FOLLOW_rule__Argues__Group__1__Impl_in_rule__Argues__Group__111281);
            rule__Argues__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__2_in_rule__Argues__Group__111284);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5585:1: rule__Argues__Group__1__Impl : ( '(' ) ;
    public final void rule__Argues__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5589:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5590:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5590:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5591:1: '('
            {
             before(grammarAccess.getArguesAccess().getLeftParenthesisKeyword_1()); 
            match(input,40,FOLLOW_40_in_rule__Argues__Group__1__Impl11312); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5604:1: rule__Argues__Group__2 : rule__Argues__Group__2__Impl rule__Argues__Group__3 ;
    public final void rule__Argues__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5608:1: ( rule__Argues__Group__2__Impl rule__Argues__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5609:2: rule__Argues__Group__2__Impl rule__Argues__Group__3
            {
            pushFollow(FOLLOW_rule__Argues__Group__2__Impl_in_rule__Argues__Group__211343);
            rule__Argues__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__3_in_rule__Argues__Group__211346);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5616:1: rule__Argues__Group__2__Impl : ( ( rule__Argues__SourceAssignment_2 ) ) ;
    public final void rule__Argues__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5620:1: ( ( ( rule__Argues__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5621:1: ( ( rule__Argues__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5621:1: ( ( rule__Argues__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5622:1: ( rule__Argues__SourceAssignment_2 )
            {
             before(grammarAccess.getArguesAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5623:1: ( rule__Argues__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5623:2: rule__Argues__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Argues__SourceAssignment_2_in_rule__Argues__Group__2__Impl11373);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5633:1: rule__Argues__Group__3 : rule__Argues__Group__3__Impl rule__Argues__Group__4 ;
    public final void rule__Argues__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5637:1: ( rule__Argues__Group__3__Impl rule__Argues__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5638:2: rule__Argues__Group__3__Impl rule__Argues__Group__4
            {
            pushFollow(FOLLOW_rule__Argues__Group__3__Impl_in_rule__Argues__Group__311403);
            rule__Argues__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__4_in_rule__Argues__Group__311406);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5645:1: rule__Argues__Group__3__Impl : ( ',' ) ;
    public final void rule__Argues__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5649:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5650:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5650:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5651:1: ','
            {
             before(grammarAccess.getArguesAccess().getCommaKeyword_3()); 
            match(input,24,FOLLOW_24_in_rule__Argues__Group__3__Impl11434); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5664:1: rule__Argues__Group__4 : rule__Argues__Group__4__Impl rule__Argues__Group__5 ;
    public final void rule__Argues__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5668:1: ( rule__Argues__Group__4__Impl rule__Argues__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5669:2: rule__Argues__Group__4__Impl rule__Argues__Group__5
            {
            pushFollow(FOLLOW_rule__Argues__Group__4__Impl_in_rule__Argues__Group__411465);
            rule__Argues__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Argues__Group__5_in_rule__Argues__Group__411468);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5676:1: rule__Argues__Group__4__Impl : ( ( rule__Argues__TargetAssignment_4 ) ) ;
    public final void rule__Argues__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5680:1: ( ( ( rule__Argues__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5681:1: ( ( rule__Argues__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5681:1: ( ( rule__Argues__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5682:1: ( rule__Argues__TargetAssignment_4 )
            {
             before(grammarAccess.getArguesAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5683:1: ( rule__Argues__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5683:2: rule__Argues__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Argues__TargetAssignment_4_in_rule__Argues__Group__4__Impl11495);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5693:1: rule__Argues__Group__5 : rule__Argues__Group__5__Impl ;
    public final void rule__Argues__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5697:1: ( rule__Argues__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5698:2: rule__Argues__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Argues__Group__5__Impl_in_rule__Argues__Group__511525);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5704:1: rule__Argues__Group__5__Impl : ( ')' ) ;
    public final void rule__Argues__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5708:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5709:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5709:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5710:1: ')'
            {
             before(grammarAccess.getArguesAccess().getRightParenthesisKeyword_5()); 
            match(input,41,FOLLOW_41_in_rule__Argues__Group__5__Impl11553); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5736:1: rule__Situation__TimeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Situation__TimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5740:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5741:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5741:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5742:1: RULE_ID
            {
             before(grammarAccess.getSituationAccess().getTimeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_111601); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5751:1: rule__Situation__WorldAssignment_1 : ( ruleWorld ) ;
    public final void rule__Situation__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5755:1: ( ( ruleWorld ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5756:1: ( ruleWorld )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5756:1: ( ruleWorld )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5757:1: ruleWorld
            {
             before(grammarAccess.getSituationAccess().getWorldWorldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_111632);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5766:1: rule__World__EntitiesAssignment_1_0 : ( ruleEntity ) ;
    public final void rule__World__EntitiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5770:1: ( ( ruleEntity ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5771:1: ( ruleEntity )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5771:1: ( ruleEntity )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5772:1: ruleEntity
            {
             before(grammarAccess.getWorldAccess().getEntitiesEntityParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__World__EntitiesAssignment_1_011663);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5781:1: rule__World__DomainsAssignment_1_1 : ( ruleDomain ) ;
    public final void rule__World__DomainsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5785:1: ( ( ruleDomain ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5786:1: ( ruleDomain )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5786:1: ( ruleDomain )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5787:1: ruleDomain
            {
             before(grammarAccess.getWorldAccess().getDomainsDomainParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDomain_in_rule__World__DomainsAssignment_1_111694);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5796:1: rule__World__RelationshipsAssignment_1_2 : ( ruleRelationship ) ;
    public final void rule__World__RelationshipsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5800:1: ( ( ruleRelationship ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5801:1: ( ruleRelationship )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5801:1: ( ruleRelationship )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5802:1: ruleRelationship
            {
             before(grammarAccess.getWorldAccess().getRelationshipsRelationshipParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__World__RelationshipsAssignment_1_211725);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5811:1: rule__Event__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5815:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5816:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5816:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5817:1: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Event__NameAssignment_111756); 
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


    // $ANTLR start rule__Domain__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5826:1: rule__Domain__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5830:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5831:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5831:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5832:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_011787); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5841:1: rule__Domain__TypeAssignment_1 : ( ruleDomainType ) ;
    public final void rule__Domain__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5845:1: ( ( ruleDomainType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5846:1: ( ruleDomainType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5846:1: ( ruleDomainType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5847:1: ruleDomainType
            {
             before(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDomainType_in_rule__Domain__TypeAssignment_111818);
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


    // $ANTLR start rule__Domain__PropertiesAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5856:1: rule__Domain__PropertiesAssignment_2_1 : ( ruleProposition ) ;
    public final void rule__Domain__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5860:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5861:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5861:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5862:1: ruleProposition
            {
             before(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_2_111849);
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


    // $ANTLR start rule__DomainAssumption__NameAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5871:1: rule__DomainAssumption__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__DomainAssumption__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5875:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5876:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5876:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5877:1: RULE_ID
            {
             before(grammarAccess.getDomainAssumptionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__DomainAssumption__NameAssignment_111880); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5886:1: rule__FunctionalRequirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__FunctionalRequirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5890:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5891:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5891:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5892:1: RULE_ID
            {
             before(grammarAccess.getFunctionalRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__FunctionalRequirement__NameAssignment_111911); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5901:1: rule__SecurityRequirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SecurityRequirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5905:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5906:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5906:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5907:1: RULE_ID
            {
             before(grammarAccess.getSecurityRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SecurityRequirement__NameAssignment_111942); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5916:1: rule__AntiRequirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AntiRequirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5920:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5921:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5921:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5922:1: RULE_ID
            {
             before(grammarAccess.getAntiRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AntiRequirement__NameAssignment_111973); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5931:1: rule__QualityRequirement__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__QualityRequirement__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5935:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5936:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5936:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5937:1: RULE_ID
            {
             before(grammarAccess.getQualityRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__QualityRequirement__NameAssignment_112004); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5946:1: rule__Argument__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Argument__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5950:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5951:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5951:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5952:1: RULE_ID
            {
             before(grammarAccess.getArgumentAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_112035); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5961:1: rule__Stakeholder__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Stakeholder__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5965:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5966:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5966:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5967:1: RULE_ID
            {
             before(grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Stakeholder__NameAssignment_112066); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5976:1: rule__Attacker__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Attacker__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5980:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5981:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5981:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5982:1: RULE_ID
            {
             before(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_112097); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5991:1: rule__NaturalProcess__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NaturalProcess__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5995:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5996:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5996:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:5997:1: RULE_ID
            {
             before(grammarAccess.getNaturalProcessAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NaturalProcess__NameAssignment_112128); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6006:1: rule__NaturalProcess__ActivitiesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__NaturalProcess__ActivitiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6010:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6011:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6011:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6012:1: ( RULE_ID )
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesProcessCrossReference_2_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6013:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6014:1: RULE_ID
            {
             before(grammarAccess.getNaturalProcessAccess().getActivitiesProcessIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NaturalProcess__ActivitiesAssignment_2_112163); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6025:1: rule__HumanActivity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__HumanActivity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6029:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6030:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6030:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6031:1: RULE_ID
            {
             before(grammarAccess.getHumanActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__HumanActivity__NameAssignment_212198); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6040:1: rule__HumanActivity__ActionsAssignment_3 : ( ruleAction ) ;
    public final void rule__HumanActivity__ActionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6044:1: ( ( ruleAction ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6045:1: ( ruleAction )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6045:1: ( ruleAction )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6046:1: ruleAction
            {
             before(grammarAccess.getHumanActivityAccess().getActionsActionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleAction_in_rule__HumanActivity__ActionsAssignment_312229);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6055:1: rule__Action__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6059:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6060:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6060:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6061:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_112260); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6070:1: rule__Resource__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6074:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6075:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6075:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6076:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_0_112291); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6085:1: rule__Asset__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6089:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6090:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6090:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6091:1: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_112322); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6100:1: rule__Wants__TypeAssignment_0 : ( ( 'wants' ) ) ;
    public final void rule__Wants__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6104:1: ( ( ( 'wants' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6105:1: ( ( 'wants' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6105:1: ( ( 'wants' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6106:1: ( 'wants' )
            {
             before(grammarAccess.getWantsAccess().getTypeWantsKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6107:1: ( 'wants' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6108:1: 'wants'
            {
             before(grammarAccess.getWantsAccess().getTypeWantsKeyword_0_0()); 
            match(input,42,FOLLOW_42_in_rule__Wants__TypeAssignment_012358); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6123:1: rule__Wants__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Wants__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6127:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6128:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6128:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6129:1: ( RULE_ID )
            {
             before(grammarAccess.getWantsAccess().getSourceActorCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6130:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6131:1: RULE_ID
            {
             before(grammarAccess.getWantsAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Wants__SourceAssignment_212401); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6142:1: rule__Wants__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Wants__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6146:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6147:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6147:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6148:1: ( RULE_ID )
            {
             before(grammarAccess.getWantsAccess().getTargetRequirementCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6149:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6150:1: RULE_ID
            {
             before(grammarAccess.getWantsAccess().getTargetRequirementIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Wants__TargetAssignment_412440); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6161:1: rule__Does__TypeAssignment_0 : ( ( 'does' ) ) ;
    public final void rule__Does__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6165:1: ( ( ( 'does' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6166:1: ( ( 'does' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6166:1: ( ( 'does' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6167:1: ( 'does' )
            {
             before(grammarAccess.getDoesAccess().getTypeDoesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6168:1: ( 'does' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6169:1: 'does'
            {
             before(grammarAccess.getDoesAccess().getTypeDoesKeyword_0_0()); 
            match(input,43,FOLLOW_43_in_rule__Does__TypeAssignment_012480); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6184:1: rule__Does__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Does__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6188:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6189:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6189:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6190:1: ( RULE_ID )
            {
             before(grammarAccess.getDoesAccess().getSourceActorCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6191:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6192:1: RULE_ID
            {
             before(grammarAccess.getDoesAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Does__SourceAssignment_212523); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6203:1: rule__Does__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Does__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6207:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6208:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6208:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6209:1: ( RULE_ID )
            {
             before(grammarAccess.getDoesAccess().getTargetActivityCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6210:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6211:1: RULE_ID
            {
             before(grammarAccess.getDoesAccess().getTargetActivityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Does__TargetAssignment_412562); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6222:1: rule__Decomposes__TypeAssignment_0 : ( ruleDecomposesType ) ;
    public final void rule__Decomposes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6226:1: ( ( ruleDecomposesType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6227:1: ( ruleDecomposesType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6227:1: ( ruleDecomposesType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6228:1: ruleDecomposesType
            {
             before(grammarAccess.getDecomposesAccess().getTypeDecomposesTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDecomposesType_in_rule__Decomposes__TypeAssignment_012597);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6237:1: rule__Decomposes__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Decomposes__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6241:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6242:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6242:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6243:1: ( RULE_ID )
            {
             before(grammarAccess.getDecomposesAccess().getSourceRequirementCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6244:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6245:1: RULE_ID
            {
             before(grammarAccess.getDecomposesAccess().getSourceRequirementIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decomposes__SourceAssignment_212632); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6256:1: rule__Decomposes__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Decomposes__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6260:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6261:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6261:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6262:1: ( RULE_ID )
            {
             before(grammarAccess.getDecomposesAccess().getTargetRequirementCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6263:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6264:1: RULE_ID
            {
             before(grammarAccess.getDecomposesAccess().getTargetRequirementIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Decomposes__TargetAssignment_412671); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6275:1: rule__Trusts__TypeAssignment_0 : ( ( 'trusts' ) ) ;
    public final void rule__Trusts__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6279:1: ( ( ( 'trusts' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6280:1: ( ( 'trusts' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6280:1: ( ( 'trusts' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6281:1: ( 'trusts' )
            {
             before(grammarAccess.getTrustsAccess().getTypeTrustsKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6282:1: ( 'trusts' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6283:1: 'trusts'
            {
             before(grammarAccess.getTrustsAccess().getTypeTrustsKeyword_0_0()); 
            match(input,44,FOLLOW_44_in_rule__Trusts__TypeAssignment_012711); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6298:1: rule__Trusts__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Trusts__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6302:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6303:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6303:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6304:1: ( RULE_ID )
            {
             before(grammarAccess.getTrustsAccess().getSourceActorCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6305:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6306:1: RULE_ID
            {
             before(grammarAccess.getTrustsAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Trusts__SourceAssignment_212754); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6317:1: rule__Trusts__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Trusts__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6321:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6322:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6322:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6323:1: ( RULE_ID )
            {
             before(grammarAccess.getTrustsAccess().getTargetActorCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6324:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6325:1: RULE_ID
            {
             before(grammarAccess.getTrustsAccess().getTargetActorIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Trusts__TargetAssignment_412793); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6336:1: rule__Trusts__EntityAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Trusts__EntityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6340:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6341:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6341:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6342:1: ( RULE_ID )
            {
             before(grammarAccess.getTrustsAccess().getEntityThingCrossReference_5_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6343:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6344:1: RULE_ID
            {
             before(grammarAccess.getTrustsAccess().getEntityThingIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Trusts__EntityAssignment_5_112832); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6355:1: rule__Delegates__TypeAssignment_0 : ( ( 'delegates' ) ) ;
    public final void rule__Delegates__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6359:1: ( ( ( 'delegates' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6360:1: ( ( 'delegates' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6360:1: ( ( 'delegates' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6361:1: ( 'delegates' )
            {
             before(grammarAccess.getDelegatesAccess().getTypeDelegatesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6362:1: ( 'delegates' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6363:1: 'delegates'
            {
             before(grammarAccess.getDelegatesAccess().getTypeDelegatesKeyword_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Delegates__TypeAssignment_012872); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6378:1: rule__Delegates__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Delegates__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6382:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6383:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6383:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6384:1: ( RULE_ID )
            {
             before(grammarAccess.getDelegatesAccess().getSourceActorCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6385:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6386:1: RULE_ID
            {
             before(grammarAccess.getDelegatesAccess().getSourceActorIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delegates__SourceAssignment_212915); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6397:1: rule__Delegates__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Delegates__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6401:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6402:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6402:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6403:1: ( RULE_ID )
            {
             before(grammarAccess.getDelegatesAccess().getTargetActorCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6404:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6405:1: RULE_ID
            {
             before(grammarAccess.getDelegatesAccess().getTargetActorIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delegates__TargetAssignment_412954); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6416:1: rule__Delegates__EntityAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Delegates__EntityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6420:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6421:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6421:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6422:1: ( RULE_ID )
            {
             before(grammarAccess.getDelegatesAccess().getEntityThingCrossReference_5_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6423:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6424:1: RULE_ID
            {
             before(grammarAccess.getDelegatesAccess().getEntityThingIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Delegates__EntityAssignment_5_112993); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6435:1: rule__Contributes__TypeAssignment_0 : ( ruleContributesType ) ;
    public final void rule__Contributes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6439:1: ( ( ruleContributesType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6440:1: ( ruleContributesType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6440:1: ( ruleContributesType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6441:1: ruleContributesType
            {
             before(grammarAccess.getContributesAccess().getTypeContributesTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleContributesType_in_rule__Contributes__TypeAssignment_013028);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6450:1: rule__Contributes__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Contributes__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6454:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6455:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6455:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6456:1: ( RULE_ID )
            {
             before(grammarAccess.getContributesAccess().getSourceRequirementCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6457:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6458:1: RULE_ID
            {
             before(grammarAccess.getContributesAccess().getSourceRequirementIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Contributes__SourceAssignment_213063); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6469:1: rule__Contributes__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Contributes__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6473:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6474:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6474:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6475:1: ( RULE_ID )
            {
             before(grammarAccess.getContributesAccess().getTargetRequirementCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6476:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6477:1: RULE_ID
            {
             before(grammarAccess.getContributesAccess().getTargetRequirementIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Contributes__TargetAssignment_413102); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6488:1: rule__Fulfils__TypeAssignment_0 : ( ruleFulfilsType ) ;
    public final void rule__Fulfils__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6492:1: ( ( ruleFulfilsType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6493:1: ( ruleFulfilsType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6493:1: ( ruleFulfilsType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6494:1: ruleFulfilsType
            {
             before(grammarAccess.getFulfilsAccess().getTypeFulfilsTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleFulfilsType_in_rule__Fulfils__TypeAssignment_013137);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6503:1: rule__Fulfils__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Fulfils__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6507:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6508:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6508:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6509:1: ( RULE_ID )
            {
             before(grammarAccess.getFulfilsAccess().getSourceProcessCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6510:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6511:1: RULE_ID
            {
             before(grammarAccess.getFulfilsAccess().getSourceProcessIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fulfils__SourceAssignment_213172); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6522:1: rule__Fulfils__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Fulfils__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6526:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6527:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6527:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6528:1: ( RULE_ID )
            {
             before(grammarAccess.getFulfilsAccess().getTargetPropositionCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6529:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6530:1: RULE_ID
            {
             before(grammarAccess.getFulfilsAccess().getTargetPropositionIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Fulfils__TargetAssignment_413211); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6541:1: rule__Provides__TypeAssignment_0 : ( ( 'provides' ) ) ;
    public final void rule__Provides__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6545:1: ( ( ( 'provides' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6546:1: ( ( 'provides' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6546:1: ( ( 'provides' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6547:1: ( 'provides' )
            {
             before(grammarAccess.getProvidesAccess().getTypeProvidesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6548:1: ( 'provides' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6549:1: 'provides'
            {
             before(grammarAccess.getProvidesAccess().getTypeProvidesKeyword_0_0()); 
            match(input,46,FOLLOW_46_in_rule__Provides__TypeAssignment_013251); 
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


    // $ANTLR start rule__Provides__SourceAssignment_2_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6564:1: rule__Provides__SourceAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Provides__SourceAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6568:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6569:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6569:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6570:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidesAccess().getSourceProcessCrossReference_2_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6571:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6572:1: RULE_ID
            {
             before(grammarAccess.getProvidesAccess().getSourceProcessIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provides__SourceAssignment_2_013294); 
             after(grammarAccess.getProvidesAccess().getSourceProcessIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getProvidesAccess().getSourceProcessCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__SourceAssignment_2_0


    // $ANTLR start rule__Provides__SourceAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6583:1: rule__Provides__SourceAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Provides__SourceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6587:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6588:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6588:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6589:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidesAccess().getSourceActorCrossReference_2_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6590:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6591:1: RULE_ID
            {
             before(grammarAccess.getProvidesAccess().getSourceActorIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provides__SourceAssignment_2_113333); 
             after(grammarAccess.getProvidesAccess().getSourceActorIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getProvidesAccess().getSourceActorCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Provides__SourceAssignment_2_1


    // $ANTLR start rule__Provides__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6602:1: rule__Provides__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Provides__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6606:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6607:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6607:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6608:1: ( RULE_ID )
            {
             before(grammarAccess.getProvidesAccess().getTargetResourceCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6609:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6610:1: RULE_ID
            {
             before(grammarAccess.getProvidesAccess().getTargetResourceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Provides__TargetAssignment_413372); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6621:1: rule__Consumes__TypeAssignment_0 : ( ( 'consumes' ) ) ;
    public final void rule__Consumes__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6625:1: ( ( ( 'consumes' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6626:1: ( ( 'consumes' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6626:1: ( ( 'consumes' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6627:1: ( 'consumes' )
            {
             before(grammarAccess.getConsumesAccess().getTypeConsumesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6628:1: ( 'consumes' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6629:1: 'consumes'
            {
             before(grammarAccess.getConsumesAccess().getTypeConsumesKeyword_0_0()); 
            match(input,47,FOLLOW_47_in_rule__Consumes__TypeAssignment_013412); 
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


    // $ANTLR start rule__Consumes__SourceAssignment_2_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6644:1: rule__Consumes__SourceAssignment_2_0 : ( ( RULE_ID ) ) ;
    public final void rule__Consumes__SourceAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6648:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6649:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6649:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6650:1: ( RULE_ID )
            {
             before(grammarAccess.getConsumesAccess().getSourceProcessCrossReference_2_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6651:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6652:1: RULE_ID
            {
             before(grammarAccess.getConsumesAccess().getSourceProcessIDTerminalRuleCall_2_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consumes__SourceAssignment_2_013455); 
             after(grammarAccess.getConsumesAccess().getSourceProcessIDTerminalRuleCall_2_0_0_1()); 

            }

             after(grammarAccess.getConsumesAccess().getSourceProcessCrossReference_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__SourceAssignment_2_0


    // $ANTLR start rule__Consumes__SourceAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6663:1: rule__Consumes__SourceAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__Consumes__SourceAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6667:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6668:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6668:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6669:1: ( RULE_ID )
            {
             before(grammarAccess.getConsumesAccess().getSourceActorCrossReference_2_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6670:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6671:1: RULE_ID
            {
             before(grammarAccess.getConsumesAccess().getSourceActorIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consumes__SourceAssignment_2_113494); 
             after(grammarAccess.getConsumesAccess().getSourceActorIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getConsumesAccess().getSourceActorCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Consumes__SourceAssignment_2_1


    // $ANTLR start rule__Consumes__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6682:1: rule__Consumes__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Consumes__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6686:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6687:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6687:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6688:1: ( RULE_ID )
            {
             before(grammarAccess.getConsumesAccess().getTargetResourceCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6689:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6690:1: RULE_ID
            {
             before(grammarAccess.getConsumesAccess().getTargetResourceIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Consumes__TargetAssignment_413533); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6701:1: rule__Exploits__TypeAssignment_0 : ( ( 'exploits' ) ) ;
    public final void rule__Exploits__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6705:1: ( ( ( 'exploits' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6706:1: ( ( 'exploits' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6706:1: ( ( 'exploits' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6707:1: ( 'exploits' )
            {
             before(grammarAccess.getExploitsAccess().getTypeExploitsKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6708:1: ( 'exploits' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6709:1: 'exploits'
            {
             before(grammarAccess.getExploitsAccess().getTypeExploitsKeyword_0_0()); 
            match(input,48,FOLLOW_48_in_rule__Exploits__TypeAssignment_013573); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6724:1: rule__Exploits__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Exploits__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6728:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6729:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6729:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6730:1: ( RULE_ID )
            {
             before(grammarAccess.getExploitsAccess().getSourceAttackerCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6731:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6732:1: RULE_ID
            {
             before(grammarAccess.getExploitsAccess().getSourceAttackerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exploits__SourceAssignment_213616); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6743:1: rule__Exploits__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Exploits__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6747:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6748:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6748:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6749:1: ( RULE_ID )
            {
             before(grammarAccess.getExploitsAccess().getTargetProcessCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6750:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6751:1: RULE_ID
            {
             before(grammarAccess.getExploitsAccess().getTargetProcessIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Exploits__TargetAssignment_413655); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6762:1: rule__Damages__TypeAssignment_0 : ( ( 'damages' ) ) ;
    public final void rule__Damages__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6766:1: ( ( ( 'damages' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6767:1: ( ( 'damages' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6767:1: ( ( 'damages' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6768:1: ( 'damages' )
            {
             before(grammarAccess.getDamagesAccess().getTypeDamagesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6769:1: ( 'damages' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6770:1: 'damages'
            {
             before(grammarAccess.getDamagesAccess().getTypeDamagesKeyword_0_0()); 
            match(input,49,FOLLOW_49_in_rule__Damages__TypeAssignment_013695); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6785:1: rule__Damages__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Damages__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6789:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6790:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6790:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6791:1: ( RULE_ID )
            {
             before(grammarAccess.getDamagesAccess().getSourceAttackerCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6792:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6793:1: RULE_ID
            {
             before(grammarAccess.getDamagesAccess().getSourceAttackerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Damages__SourceAssignment_213738); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6804:1: rule__Damages__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Damages__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6808:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6809:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6809:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6810:1: ( RULE_ID )
            {
             before(grammarAccess.getDamagesAccess().getTargetAssetCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6811:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6812:1: RULE_ID
            {
             before(grammarAccess.getDamagesAccess().getTargetAssetIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Damages__TargetAssignment_413777); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6823:1: rule__Attacks__TypeAssignment_0 : ( ( 'attacks' ) ) ;
    public final void rule__Attacks__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6827:1: ( ( ( 'attacks' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6828:1: ( ( 'attacks' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6828:1: ( ( 'attacks' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6829:1: ( 'attacks' )
            {
             before(grammarAccess.getAttacksAccess().getTypeAttacksKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6830:1: ( 'attacks' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6831:1: 'attacks'
            {
             before(grammarAccess.getAttacksAccess().getTypeAttacksKeyword_0_0()); 
            match(input,50,FOLLOW_50_in_rule__Attacks__TypeAssignment_013817); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6846:1: rule__Attacks__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Attacks__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6850:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6851:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6851:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6852:1: ( RULE_ID )
            {
             before(grammarAccess.getAttacksAccess().getSourceAttackerCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6853:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6854:1: RULE_ID
            {
             before(grammarAccess.getAttacksAccess().getSourceAttackerIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacks__SourceAssignment_213860); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6865:1: rule__Attacks__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Attacks__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6869:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6870:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6870:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6871:1: ( RULE_ID )
            {
             before(grammarAccess.getAttacksAccess().getTargetProcessCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6872:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6873:1: RULE_ID
            {
             before(grammarAccess.getAttacksAccess().getTargetProcessIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacks__TargetAssignment_413899); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6884:1: rule__Argues__TypeAssignment_0 : ( ( 'argues' ) ) ;
    public final void rule__Argues__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6888:1: ( ( ( 'argues' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6889:1: ( ( 'argues' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6889:1: ( ( 'argues' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6890:1: ( 'argues' )
            {
             before(grammarAccess.getArguesAccess().getTypeArguesKeyword_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6891:1: ( 'argues' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6892:1: 'argues'
            {
             before(grammarAccess.getArguesAccess().getTypeArguesKeyword_0_0()); 
            match(input,51,FOLLOW_51_in_rule__Argues__TypeAssignment_013939); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6907:1: rule__Argues__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Argues__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6911:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6912:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6912:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6913:1: ( RULE_ID )
            {
             before(grammarAccess.getArguesAccess().getSourcePropositionCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6914:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6915:1: RULE_ID
            {
             before(grammarAccess.getArguesAccess().getSourcePropositionIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argues__SourceAssignment_213982); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6926:1: rule__Argues__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Argues__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6930:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6931:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6931:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6932:1: ( RULE_ID )
            {
             before(grammarAccess.getArguesAccess().getTargetPropositionCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6933:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:6934:1: RULE_ID
            {
             before(grammarAccess.getArguesAccess().getTargetPropositionIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Argues__TargetAssignment_414021); 
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
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain303 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__Alternatives_in_ruleProposition396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Alternatives_in_ruleRequirement456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainAssumption_in_entryRuleDomainAssumption483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomainAssumption490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainAssumption__Group__0_in_ruleDomainAssumption516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalRequirement_in_entryRuleFunctionalRequirement543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFunctionalRequirement550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalRequirement__Group__0_in_ruleFunctionalRequirement576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRequirement_in_entryRuleSecurityRequirement603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityRequirement610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRequirement__Group__0_in_ruleSecurityRequirement636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntiRequirement670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__0_in_ruleAntiRequirement696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityRequirement_in_entryRuleQualityRequirement723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualityRequirement730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityRequirement__Group__0_in_ruleQualityRequirement756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_entryRuleArgument783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgument790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0_in_ruleArgument816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_in_ruleEntity876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Alternatives_in_ruleActor936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__0_in_ruleStakeholder996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0_in_ruleAttacker1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProcess1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Process__Alternatives_in_ruleProcess1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_entryRuleNaturalProcess1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalProcess1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__0_in_ruleNaturalProcess1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_entryRuleHumanActivity1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHumanActivity1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__0_in_ruleHumanActivity1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction1263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource1323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Alternatives_in_ruleResource1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset1383 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0_in_ruleAsset1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship1443 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship1450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Alternatives_in_ruleRelationship1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_entryRuleWants1503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWants1510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__0_in_ruleWants1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_entryRuleDoes1563 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDoes1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__0_in_ruleDoes1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_entryRuleDecomposes1623 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDecomposes1630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__0_in_ruleDecomposes1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_entryRuleTrusts1683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTrusts1690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__0_in_ruleTrusts1716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_entryRuleDelegates1743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDelegates1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__0_in_ruleDelegates1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_entryRuleContributes1803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContributes1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__0_in_ruleContributes1836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_entryRuleFulfils1863 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFulfils1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__0_in_ruleFulfils1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_entryRuleProvides1923 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProvides1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__0_in_ruleProvides1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_entryRuleConsumes1983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConsumes1990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__0_in_ruleConsumes2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_entryRuleExploits2043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExploits2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__0_in_ruleExploits2076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_entryRuleDamages2103 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDamages2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__0_in_ruleDamages2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_entryRuleAttacks2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacks2170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__0_in_ruleAttacks2196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_entryRuleArgues2223 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgues2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__0_in_ruleArgues2256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainType__Alternatives_in_ruleDomainType2293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DecomposesType__Alternatives_in_ruleDecomposesType2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ContributesType__Alternatives_in_ruleContributesType2365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleFulfilsType2402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__EntitiesAssignment_1_0_in_rule__World__Alternatives_12439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__DomainsAssignment_1_1_in_rule__World__Alternatives_12457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__RelationshipsAssignment_1_2_in_rule__World__Alternatives_12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Object__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Object__Alternatives2526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Object__Alternatives2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainAssumption_in_rule__Proposition__Alternatives2575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_rule__Proposition__Alternatives2592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgument_in_rule__Proposition__Alternatives2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFunctionalRequirement_in_rule__Requirement__Alternatives2641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityRequirement_in_rule__Requirement__Alternatives2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_rule__Requirement__Alternatives2675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualityRequirement_in_rule__Requirement__Alternatives2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__Entity__Alternatives2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProcess_in_rule__Entity__Alternatives2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Entity__Alternatives2758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_rule__Actor__Alternatives2790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_rule__Actor__Alternatives2807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalProcess_in_rule__Process__Alternatives2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHumanActivity_in_rule__Process__Alternatives2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__0_in_rule__Resource__Alternatives2888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Resource__Alternatives2906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWants_in_rule__Relationship__Alternatives2938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDoes_in_rule__Relationship__Alternatives2955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposes_in_rule__Relationship__Alternatives2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTrusts_in_rule__Relationship__Alternatives2989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDelegates_in_rule__Relationship__Alternatives3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributes_in_rule__Relationship__Alternatives3023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfils_in_rule__Relationship__Alternatives3040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProvides_in_rule__Relationship__Alternatives3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConsumes_in_rule__Relationship__Alternatives3074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExploits_in_rule__Relationship__Alternatives3091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDamages_in_rule__Relationship__Alternatives3108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacks_in_rule__Relationship__Alternatives3125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgues_in_rule__Relationship__Alternatives3142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__SourceAssignment_2_0_in_rule__Provides__Alternatives_23174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__SourceAssignment_2_1_in_rule__Provides__Alternatives_23192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__SourceAssignment_2_0_in_rule__Consumes__Alternatives_23225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__SourceAssignment_2_1_in_rule__Consumes__Alternatives_23243 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__13878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Alternatives_1_in_rule__World__Group__1__Impl3905 = new BitSet(new long[]{0x000FFCD3801F8812L});
    public static final BitSet FOLLOW_rule__Event__Group__0__Impl_in_rule__Event__Group__03940 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Event__Group__1_in_rule__Event__Group__03943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Event__Group__0__Impl3971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__Group__1__Impl_in_rule__Event__Group__14002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Event__NameAssignment_1_in_rule__Event__Group__1__Impl4029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__04063 = new BitSet(new long[]{0x0000000000007000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__04066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_0_in_rule__Domain__Group__0__Impl4093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__14123 = new BitSet(new long[]{0x000000007F000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__14126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__TypeAssignment_1_in_rule__Domain__Group__1__Impl4153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__24183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_2__0_in_rule__Domain__Group__2__Impl4210 = new BitSet(new long[]{0x000000007F000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_2__0__Impl_in_rule__Domain__Group_2__04247 = new BitSet(new long[]{0x000000007E000000L});
    public static final BitSet FOLLOW_rule__Domain__Group_2__1_in_rule__Domain__Group_2__04250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Domain__Group_2__0__Impl4279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_2__1__Impl_in_rule__Domain__Group_2__14312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_2_1_in_rule__Domain__Group_2__1__Impl4339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainAssumption__Group__0__Impl_in_rule__DomainAssumption__Group__04373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__DomainAssumption__Group__1_in_rule__DomainAssumption__Group__04376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DomainAssumption__Group__0__Impl4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainAssumption__Group__1__Impl_in_rule__DomainAssumption__Group__14435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainAssumption__NameAssignment_1_in_rule__DomainAssumption__Group__1__Impl4462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalRequirement__Group__0__Impl_in_rule__FunctionalRequirement__Group__04496 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__FunctionalRequirement__Group__1_in_rule__FunctionalRequirement__Group__04499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__FunctionalRequirement__Group__0__Impl4527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalRequirement__Group__1__Impl_in_rule__FunctionalRequirement__Group__14558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__FunctionalRequirement__NameAssignment_1_in_rule__FunctionalRequirement__Group__1__Impl4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRequirement__Group__0__Impl_in_rule__SecurityRequirement__Group__04619 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SecurityRequirement__Group__1_in_rule__SecurityRequirement__Group__04622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SecurityRequirement__Group__0__Impl4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRequirement__Group__1__Impl_in_rule__SecurityRequirement__Group__14681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityRequirement__NameAssignment_1_in_rule__SecurityRequirement__Group__1__Impl4708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__0__Impl_in_rule__AntiRequirement__Group__04742 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__1_in_rule__AntiRequirement__Group__04745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AntiRequirement__Group__0__Impl4773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__1__Impl_in_rule__AntiRequirement__Group__14804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__NameAssignment_1_in_rule__AntiRequirement__Group__1__Impl4831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityRequirement__Group__0__Impl_in_rule__QualityRequirement__Group__04865 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__QualityRequirement__Group__1_in_rule__QualityRequirement__Group__04868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__QualityRequirement__Group__0__Impl4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityRequirement__Group__1__Impl_in_rule__QualityRequirement__Group__14927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualityRequirement__NameAssignment_1_in_rule__QualityRequirement__Group__1__Impl4954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__0__Impl_in_rule__Argument__Group__04988 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argument__Group__1_in_rule__Argument__Group__04991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Argument__Group__0__Impl5019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__Group__1__Impl_in_rule__Argument__Group__15050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argument__NameAssignment_1_in_rule__Argument__Group__1__Impl5077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__0__Impl_in_rule__Stakeholder__Group__05111 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__1_in_rule__Stakeholder__Group__05114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Stakeholder__Group__0__Impl5142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__Group__1__Impl_in_rule__Stakeholder__Group__15173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Stakeholder__NameAssignment_1_in_rule__Stakeholder__Group__1__Impl5200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__05234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__05237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Attacker__Group__0__Impl5265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__15296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__NameAssignment_1_in_rule__Attacker__Group__1__Impl5323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__0__Impl_in_rule__NaturalProcess__Group__05357 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__1_in_rule__NaturalProcess__Group__05360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__NaturalProcess__Group__0__Impl5388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__1__Impl_in_rule__NaturalProcess__Group__15419 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__2_in_rule__NaturalProcess__Group__15422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__NameAssignment_1_in_rule__NaturalProcess__Group__1__Impl5449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group__2__Impl_in_rule__NaturalProcess__Group__25479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__0_in_rule__NaturalProcess__Group__2__Impl5506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__0__Impl_in_rule__NaturalProcess__Group_2__05543 = new BitSet(new long[]{0x0000000800000010L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__1_in_rule__NaturalProcess__Group_2__05546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__NaturalProcess__Group_2__0__Impl5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__1__Impl_in_rule__NaturalProcess__Group_2__15605 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__2_in_rule__NaturalProcess__Group_2__15608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NaturalProcess__ActivitiesAssignment_2_1_in_rule__NaturalProcess__Group_2__1__Impl5635 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__NaturalProcess__Group_2__2__Impl_in_rule__NaturalProcess__Group_2__25666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__NaturalProcess__Group_2__2__Impl5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__0__Impl_in_rule__HumanActivity__Group__05731 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__1_in_rule__HumanActivity__Group__05734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__1__Impl_in_rule__HumanActivity__Group__15792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__2_in_rule__HumanActivity__Group__15795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__HumanActivity__Group__1__Impl5823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__2__Impl_in_rule__HumanActivity__Group__25854 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__3_in_rule__HumanActivity__Group__25857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__NameAssignment_2_in_rule__HumanActivity__Group__2__Impl5884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__Group__3__Impl_in_rule__HumanActivity__Group__35914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__HumanActivity__ActionsAssignment_3_in_rule__HumanActivity__Group__3__Impl5941 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__05980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__05983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Action__Group__0__Impl6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__16042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_1_in_rule__Action__Group__1__Impl6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__0__Impl_in_rule__Resource__Group_0__06103 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__1_in_rule__Resource__Group_0__06106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Resource__Group_0__0__Impl6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_0__1__Impl_in_rule__Resource__Group_0__16165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_0_1_in_rule__Resource__Group_0__1__Impl6192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__06226 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__06229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Asset__Group__0__Impl6257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__16288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__NameAssignment_1_in_rule__Asset__Group__1__Impl6315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__0__Impl_in_rule__Wants__Group__06349 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__1_in_rule__Wants__Group__06352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__TypeAssignment_0_in_rule__Wants__Group__0__Impl6379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__1__Impl_in_rule__Wants__Group__16409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wants__Group__2_in_rule__Wants__Group__16412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Wants__Group__1__Impl6440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__2__Impl_in_rule__Wants__Group__26471 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__3_in_rule__Wants__Group__26474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__SourceAssignment_2_in_rule__Wants__Group__2__Impl6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__3__Impl_in_rule__Wants__Group__36531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Wants__Group__4_in_rule__Wants__Group__36534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Wants__Group__3__Impl6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__4__Impl_in_rule__Wants__Group__46593 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Wants__Group__5_in_rule__Wants__Group__46596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__TargetAssignment_4_in_rule__Wants__Group__4__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Wants__Group__5__Impl_in_rule__Wants__Group__56653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Wants__Group__5__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__0__Impl_in_rule__Does__Group__06724 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Does__Group__1_in_rule__Does__Group__06727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__TypeAssignment_0_in_rule__Does__Group__0__Impl6754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__1__Impl_in_rule__Does__Group__16784 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Does__Group__2_in_rule__Does__Group__16787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Does__Group__1__Impl6815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__2__Impl_in_rule__Does__Group__26846 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Does__Group__3_in_rule__Does__Group__26849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__SourceAssignment_2_in_rule__Does__Group__2__Impl6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__3__Impl_in_rule__Does__Group__36906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Does__Group__4_in_rule__Does__Group__36909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Does__Group__3__Impl6937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__4__Impl_in_rule__Does__Group__46968 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Does__Group__5_in_rule__Does__Group__46971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__TargetAssignment_4_in_rule__Does__Group__4__Impl6998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Does__Group__5__Impl_in_rule__Does__Group__57028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Does__Group__5__Impl7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__0__Impl_in_rule__Decomposes__Group__07099 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__1_in_rule__Decomposes__Group__07102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__TypeAssignment_0_in_rule__Decomposes__Group__0__Impl7129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__1__Impl_in_rule__Decomposes__Group__17159 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__2_in_rule__Decomposes__Group__17162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Decomposes__Group__1__Impl7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__2__Impl_in_rule__Decomposes__Group__27221 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__3_in_rule__Decomposes__Group__27224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__SourceAssignment_2_in_rule__Decomposes__Group__2__Impl7251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__3__Impl_in_rule__Decomposes__Group__37281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__4_in_rule__Decomposes__Group__37284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Decomposes__Group__3__Impl7312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__4__Impl_in_rule__Decomposes__Group__47343 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__5_in_rule__Decomposes__Group__47346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__TargetAssignment_4_in_rule__Decomposes__Group__4__Impl7373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Decomposes__Group__5__Impl_in_rule__Decomposes__Group__57403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Decomposes__Group__5__Impl7431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__0__Impl_in_rule__Trusts__Group__07474 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__1_in_rule__Trusts__Group__07477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__TypeAssignment_0_in_rule__Trusts__Group__0__Impl7504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__1__Impl_in_rule__Trusts__Group__17534 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trusts__Group__2_in_rule__Trusts__Group__17537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Trusts__Group__1__Impl7565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__2__Impl_in_rule__Trusts__Group__27596 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__3_in_rule__Trusts__Group__27599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__SourceAssignment_2_in_rule__Trusts__Group__2__Impl7626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__3__Impl_in_rule__Trusts__Group__37656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trusts__Group__4_in_rule__Trusts__Group__37659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Trusts__Group__3__Impl7687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__4__Impl_in_rule__Trusts__Group__47718 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__5_in_rule__Trusts__Group__47721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__TargetAssignment_4_in_rule__Trusts__Group__4__Impl7748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__5__Impl_in_rule__Trusts__Group__57778 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Trusts__Group__6_in_rule__Trusts__Group__57781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group_5__0_in_rule__Trusts__Group__5__Impl7808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group__6__Impl_in_rule__Trusts__Group__67839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Trusts__Group__6__Impl7867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group_5__0__Impl_in_rule__Trusts__Group_5__07912 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Trusts__Group_5__1_in_rule__Trusts__Group_5__07915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Trusts__Group_5__0__Impl7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__Group_5__1__Impl_in_rule__Trusts__Group_5__17974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Trusts__EntityAssignment_5_1_in_rule__Trusts__Group_5__1__Impl8001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__0__Impl_in_rule__Delegates__Group__08035 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__1_in_rule__Delegates__Group__08038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__TypeAssignment_0_in_rule__Delegates__Group__0__Impl8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__1__Impl_in_rule__Delegates__Group__18095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Delegates__Group__2_in_rule__Delegates__Group__18098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Delegates__Group__1__Impl8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__2__Impl_in_rule__Delegates__Group__28157 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__3_in_rule__Delegates__Group__28160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__SourceAssignment_2_in_rule__Delegates__Group__2__Impl8187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__3__Impl_in_rule__Delegates__Group__38217 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Delegates__Group__4_in_rule__Delegates__Group__38220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Delegates__Group__3__Impl8248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__4__Impl_in_rule__Delegates__Group__48279 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__5_in_rule__Delegates__Group__48282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__TargetAssignment_4_in_rule__Delegates__Group__4__Impl8309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__5__Impl_in_rule__Delegates__Group__58339 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Delegates__Group__6_in_rule__Delegates__Group__58342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group_5__0_in_rule__Delegates__Group__5__Impl8369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group__6__Impl_in_rule__Delegates__Group__68400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Delegates__Group__6__Impl8428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group_5__0__Impl_in_rule__Delegates__Group_5__08473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Delegates__Group_5__1_in_rule__Delegates__Group_5__08476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Delegates__Group_5__0__Impl8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__Group_5__1__Impl_in_rule__Delegates__Group_5__18535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Delegates__EntityAssignment_5_1_in_rule__Delegates__Group_5__1__Impl8562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__0__Impl_in_rule__Contributes__Group__08596 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__1_in_rule__Contributes__Group__08599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__TypeAssignment_0_in_rule__Contributes__Group__0__Impl8626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__1__Impl_in_rule__Contributes__Group__18656 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Contributes__Group__2_in_rule__Contributes__Group__18659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Contributes__Group__1__Impl8687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__2__Impl_in_rule__Contributes__Group__28718 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__3_in_rule__Contributes__Group__28721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__SourceAssignment_2_in_rule__Contributes__Group__2__Impl8748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__3__Impl_in_rule__Contributes__Group__38778 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Contributes__Group__4_in_rule__Contributes__Group__38781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Contributes__Group__3__Impl8809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__4__Impl_in_rule__Contributes__Group__48840 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Contributes__Group__5_in_rule__Contributes__Group__48843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__TargetAssignment_4_in_rule__Contributes__Group__4__Impl8870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Contributes__Group__5__Impl_in_rule__Contributes__Group__58900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Contributes__Group__5__Impl8928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__0__Impl_in_rule__Fulfils__Group__08971 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__1_in_rule__Fulfils__Group__08974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__TypeAssignment_0_in_rule__Fulfils__Group__0__Impl9001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__1__Impl_in_rule__Fulfils__Group__19031 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__2_in_rule__Fulfils__Group__19034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Fulfils__Group__1__Impl9062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__2__Impl_in_rule__Fulfils__Group__29093 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__3_in_rule__Fulfils__Group__29096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__SourceAssignment_2_in_rule__Fulfils__Group__2__Impl9123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__3__Impl_in_rule__Fulfils__Group__39153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__4_in_rule__Fulfils__Group__39156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Fulfils__Group__3__Impl9184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__4__Impl_in_rule__Fulfils__Group__49215 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__5_in_rule__Fulfils__Group__49218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__TargetAssignment_4_in_rule__Fulfils__Group__4__Impl9245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Fulfils__Group__5__Impl_in_rule__Fulfils__Group__59275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Fulfils__Group__5__Impl9303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__0__Impl_in_rule__Provides__Group__09346 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__1_in_rule__Provides__Group__09349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__TypeAssignment_0_in_rule__Provides__Group__0__Impl9376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__1__Impl_in_rule__Provides__Group__19406 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Provides__Group__2_in_rule__Provides__Group__19409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Provides__Group__1__Impl9437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__2__Impl_in_rule__Provides__Group__29468 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__3_in_rule__Provides__Group__29471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Alternatives_2_in_rule__Provides__Group__2__Impl9498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__3__Impl_in_rule__Provides__Group__39528 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Provides__Group__4_in_rule__Provides__Group__39531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Provides__Group__3__Impl9559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__4__Impl_in_rule__Provides__Group__49590 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Provides__Group__5_in_rule__Provides__Group__49593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__TargetAssignment_4_in_rule__Provides__Group__4__Impl9620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Provides__Group__5__Impl_in_rule__Provides__Group__59650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Provides__Group__5__Impl9678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__0__Impl_in_rule__Consumes__Group__09721 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__1_in_rule__Consumes__Group__09724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__TypeAssignment_0_in_rule__Consumes__Group__0__Impl9751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__1__Impl_in_rule__Consumes__Group__19781 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Consumes__Group__2_in_rule__Consumes__Group__19784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Consumes__Group__1__Impl9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__2__Impl_in_rule__Consumes__Group__29843 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__3_in_rule__Consumes__Group__29846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Alternatives_2_in_rule__Consumes__Group__2__Impl9873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__3__Impl_in_rule__Consumes__Group__39903 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Consumes__Group__4_in_rule__Consumes__Group__39906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Consumes__Group__3__Impl9934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__4__Impl_in_rule__Consumes__Group__49965 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Consumes__Group__5_in_rule__Consumes__Group__49968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__TargetAssignment_4_in_rule__Consumes__Group__4__Impl9995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Consumes__Group__5__Impl_in_rule__Consumes__Group__510025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Consumes__Group__5__Impl10053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__0__Impl_in_rule__Exploits__Group__010096 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__1_in_rule__Exploits__Group__010099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__TypeAssignment_0_in_rule__Exploits__Group__0__Impl10126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__1__Impl_in_rule__Exploits__Group__110156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exploits__Group__2_in_rule__Exploits__Group__110159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Exploits__Group__1__Impl10187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__2__Impl_in_rule__Exploits__Group__210218 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__3_in_rule__Exploits__Group__210221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__SourceAssignment_2_in_rule__Exploits__Group__2__Impl10248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__3__Impl_in_rule__Exploits__Group__310278 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Exploits__Group__4_in_rule__Exploits__Group__310281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Exploits__Group__3__Impl10309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__4__Impl_in_rule__Exploits__Group__410340 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Exploits__Group__5_in_rule__Exploits__Group__410343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__TargetAssignment_4_in_rule__Exploits__Group__4__Impl10370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Exploits__Group__5__Impl_in_rule__Exploits__Group__510400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Exploits__Group__5__Impl10428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__0__Impl_in_rule__Damages__Group__010471 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__1_in_rule__Damages__Group__010474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__TypeAssignment_0_in_rule__Damages__Group__0__Impl10501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__1__Impl_in_rule__Damages__Group__110531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Damages__Group__2_in_rule__Damages__Group__110534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Damages__Group__1__Impl10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__2__Impl_in_rule__Damages__Group__210593 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__3_in_rule__Damages__Group__210596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__SourceAssignment_2_in_rule__Damages__Group__2__Impl10623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__3__Impl_in_rule__Damages__Group__310653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Damages__Group__4_in_rule__Damages__Group__310656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Damages__Group__3__Impl10684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__4__Impl_in_rule__Damages__Group__410715 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Damages__Group__5_in_rule__Damages__Group__410718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__TargetAssignment_4_in_rule__Damages__Group__4__Impl10745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Damages__Group__5__Impl_in_rule__Damages__Group__510775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Damages__Group__5__Impl10803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__0__Impl_in_rule__Attacks__Group__010846 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Attacks__Group__1_in_rule__Attacks__Group__010849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__TypeAssignment_0_in_rule__Attacks__Group__0__Impl10876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__1__Impl_in_rule__Attacks__Group__110906 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacks__Group__2_in_rule__Attacks__Group__110909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Attacks__Group__1__Impl10937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__2__Impl_in_rule__Attacks__Group__210968 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Attacks__Group__3_in_rule__Attacks__Group__210971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__SourceAssignment_2_in_rule__Attacks__Group__2__Impl10998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__3__Impl_in_rule__Attacks__Group__311028 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Attacks__Group__4_in_rule__Attacks__Group__311031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Attacks__Group__3__Impl11059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__4__Impl_in_rule__Attacks__Group__411090 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Attacks__Group__5_in_rule__Attacks__Group__411093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__TargetAssignment_4_in_rule__Attacks__Group__4__Impl11120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacks__Group__5__Impl_in_rule__Attacks__Group__511150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Attacks__Group__5__Impl11178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__0__Impl_in_rule__Argues__Group__011221 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__1_in_rule__Argues__Group__011224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__TypeAssignment_0_in_rule__Argues__Group__0__Impl11251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__1__Impl_in_rule__Argues__Group__111281 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argues__Group__2_in_rule__Argues__Group__111284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Argues__Group__1__Impl11312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__2__Impl_in_rule__Argues__Group__211343 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__3_in_rule__Argues__Group__211346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__SourceAssignment_2_in_rule__Argues__Group__2__Impl11373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__3__Impl_in_rule__Argues__Group__311403 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Argues__Group__4_in_rule__Argues__Group__311406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Argues__Group__3__Impl11434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__4__Impl_in_rule__Argues__Group__411465 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Argues__Group__5_in_rule__Argues__Group__411468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__TargetAssignment_4_in_rule__Argues__Group__4__Impl11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Argues__Group__5__Impl_in_rule__Argues__Group__511525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Argues__Group__5__Impl11553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_111601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_111632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__World__EntitiesAssignment_1_011663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__World__DomainsAssignment_1_111694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__World__RelationshipsAssignment_1_211725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Event__NameAssignment_111756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_011787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainType_in_rule__Domain__TypeAssignment_111818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_2_111849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__DomainAssumption__NameAssignment_111880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__FunctionalRequirement__NameAssignment_111911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SecurityRequirement__NameAssignment_111942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AntiRequirement__NameAssignment_111973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__QualityRequirement__NameAssignment_112004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argument__NameAssignment_112035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Stakeholder__NameAssignment_112066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_112097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NaturalProcess__NameAssignment_112128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NaturalProcess__ActivitiesAssignment_2_112163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__HumanActivity__NameAssignment_212198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__HumanActivity__ActionsAssignment_312229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_112260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_0_112291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_112322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Wants__TypeAssignment_012358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Wants__SourceAssignment_212401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Wants__TargetAssignment_412440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__Does__TypeAssignment_012480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Does__SourceAssignment_212523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Does__TargetAssignment_412562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDecomposesType_in_rule__Decomposes__TypeAssignment_012597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decomposes__SourceAssignment_212632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Decomposes__TargetAssignment_412671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Trusts__TypeAssignment_012711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Trusts__SourceAssignment_212754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Trusts__TargetAssignment_412793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Trusts__EntityAssignment_5_112832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Delegates__TypeAssignment_012872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delegates__SourceAssignment_212915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delegates__TargetAssignment_412954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Delegates__EntityAssignment_5_112993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContributesType_in_rule__Contributes__TypeAssignment_013028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Contributes__SourceAssignment_213063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Contributes__TargetAssignment_413102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFulfilsType_in_rule__Fulfils__TypeAssignment_013137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fulfils__SourceAssignment_213172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Fulfils__TargetAssignment_413211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Provides__TypeAssignment_013251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provides__SourceAssignment_2_013294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provides__SourceAssignment_2_113333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Provides__TargetAssignment_413372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Consumes__TypeAssignment_013412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Consumes__SourceAssignment_2_013455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Consumes__SourceAssignment_2_113494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Consumes__TargetAssignment_413533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Exploits__TypeAssignment_013573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exploits__SourceAssignment_213616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Exploits__TargetAssignment_413655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Damages__TypeAssignment_013695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Damages__SourceAssignment_213738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Damages__TargetAssignment_413777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_rule__Attacks__TypeAssignment_013817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacks__SourceAssignment_213860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacks__TargetAssignment_413899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_rule__Argues__TypeAssignment_013939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argues__SourceAssignment_213982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Argues__TargetAssignment_414021 = new BitSet(new long[]{0x0000000000000002L});

}