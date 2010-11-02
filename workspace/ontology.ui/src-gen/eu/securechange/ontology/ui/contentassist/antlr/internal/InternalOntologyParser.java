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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'carries out'", "'delegates'", "'fulfils'", "'provides'", "'trusts'", "'wants'", "'damages'", "'attacks'", "'argues'", "'interfaces'", "'model'", "':'", "','", "'('", "')'", "'SG'", "'R'", "'AR'", "'Ar'", "'An'", "'As'", "'Re'", "'Ak'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
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


    // $ANTLR start entryRuleGoal
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:117:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:118:1: ( ruleGoal EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:119:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal181);
            ruleGoal();
            _fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal188); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:126:1: ruleGoal : ( ( rule__Goal__Alternatives ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:130:2: ( ( ( rule__Goal__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:131:1: ( ( rule__Goal__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:131:1: ( ( rule__Goal__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:132:1: ( rule__Goal__Alternatives )
            {
             before(grammarAccess.getGoalAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:133:1: ( rule__Goal__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:133:2: rule__Goal__Alternatives
            {
            pushFollow(FOLLOW_rule__Goal__Alternatives_in_ruleGoal214);
            rule__Goal__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleSecurityGoal
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:145:1: entryRuleSecurityGoal : ruleSecurityGoal EOF ;
    public final void entryRuleSecurityGoal() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:146:1: ( ruleSecurityGoal EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:147:1: ruleSecurityGoal EOF
            {
             before(grammarAccess.getSecurityGoalRule()); 
            pushFollow(FOLLOW_ruleSecurityGoal_in_entryRuleSecurityGoal241);
            ruleSecurityGoal();
            _fsp--;

             after(grammarAccess.getSecurityGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityGoal248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleSecurityGoal


    // $ANTLR start ruleSecurityGoal
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:154:1: ruleSecurityGoal : ( ( rule__SecurityGoal__Group__0 ) ) ;
    public final void ruleSecurityGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:158:2: ( ( ( rule__SecurityGoal__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:159:1: ( ( rule__SecurityGoal__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:159:1: ( ( rule__SecurityGoal__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:160:1: ( rule__SecurityGoal__Group__0 )
            {
             before(grammarAccess.getSecurityGoalAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:161:1: ( rule__SecurityGoal__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:161:2: rule__SecurityGoal__Group__0
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__0_in_ruleSecurityGoal274);
            rule__SecurityGoal__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSecurityGoalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSecurityGoal


    // $ANTLR start entryRuleRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:173:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:174:1: ( ruleRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:175:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement301);
            ruleRequirement();
            _fsp--;

             after(grammarAccess.getRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement308); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:182:1: ruleRequirement : ( ( rule__Requirement__Group__0 ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:186:2: ( ( ( rule__Requirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:187:1: ( ( rule__Requirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:187:1: ( ( rule__Requirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:188:1: ( rule__Requirement__Group__0 )
            {
             before(grammarAccess.getRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:189:1: ( rule__Requirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:189:2: rule__Requirement__Group__0
            {
            pushFollow(FOLLOW_rule__Requirement__Group__0_in_ruleRequirement334);
            rule__Requirement__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRequirementAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start entryRuleAntiRequirement
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:201:1: entryRuleAntiRequirement : ruleAntiRequirement EOF ;
    public final void entryRuleAntiRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:202:1: ( ruleAntiRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:203:1: ruleAntiRequirement EOF
            {
             before(grammarAccess.getAntiRequirementRule()); 
            pushFollow(FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement361);
            ruleAntiRequirement();
            _fsp--;

             after(grammarAccess.getAntiRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAntiRequirement368); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:210:1: ruleAntiRequirement : ( ( rule__AntiRequirement__Group__0 ) ) ;
    public final void ruleAntiRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:214:2: ( ( ( rule__AntiRequirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:215:1: ( ( rule__AntiRequirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:215:1: ( ( rule__AntiRequirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:216:1: ( rule__AntiRequirement__Group__0 )
            {
             before(grammarAccess.getAntiRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:217:1: ( rule__AntiRequirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:217:2: rule__AntiRequirement__Group__0
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group__0_in_ruleAntiRequirement394);
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


    // $ANTLR start entryRuleDomain
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:229:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:230:1: ( ruleDomain EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:231:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain421);
            ruleDomain();
            _fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain428); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:238:1: ruleDomain : ( ( rule__Domain__Alternatives ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:242:2: ( ( ( rule__Domain__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:243:1: ( ( rule__Domain__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:243:1: ( ( rule__Domain__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:244:1: ( rule__Domain__Alternatives )
            {
             before(grammarAccess.getDomainAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:245:1: ( rule__Domain__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:245:2: rule__Domain__Alternatives
            {
            pushFollow(FOLLOW_rule__Domain__Alternatives_in_ruleDomain454);
            rule__Domain__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getAlternatives()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:257:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:258:1: ( ruleActor EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:259:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor481);
            ruleActor();
            _fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor488); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:266:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:270:2: ( ( ( rule__Actor__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:271:1: ( ( rule__Actor__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:271:1: ( ( rule__Actor__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:272:1: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:273:1: ( rule__Actor__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:273:2: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_rule__Actor__Group__0_in_ruleActor514);
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


    // $ANTLR start entryRuleAction
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:285:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:286:1: ( ruleAction EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:287:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction541);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction548); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:294:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:298:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:299:1: ( ( rule__Action__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:299:1: ( ( rule__Action__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:300:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:301:1: ( rule__Action__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:301:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction574);
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


    // $ANTLR start entryRuleAsset
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:313:1: entryRuleAsset : ruleAsset EOF ;
    public final void entryRuleAsset() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:314:1: ( ruleAsset EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:315:1: ruleAsset EOF
            {
             before(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset601);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getAssetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset608); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:322:1: ruleAsset : ( ( rule__Asset__Group__0 ) ) ;
    public final void ruleAsset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:326:2: ( ( ( rule__Asset__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:327:1: ( ( rule__Asset__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:327:1: ( ( rule__Asset__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:328:1: ( rule__Asset__Group__0 )
            {
             before(grammarAccess.getAssetAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:329:1: ( rule__Asset__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:329:2: rule__Asset__Group__0
            {
            pushFollow(FOLLOW_rule__Asset__Group__0_in_ruleAsset634);
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


    // $ANTLR start entryRuleResource
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:341:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:342:1: ( ruleResource EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:343:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_ruleResource_in_entryRuleResource661);
            ruleResource();
            _fsp--;

             after(grammarAccess.getResourceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleResource668); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:350:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:354:2: ( ( ( rule__Resource__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:355:1: ( ( rule__Resource__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:355:1: ( ( rule__Resource__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:356:1: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:357:1: ( rule__Resource__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:357:2: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_rule__Resource__Group__0_in_ruleResource694);
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


    // $ANTLR start entryRuleAttacker
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:369:1: entryRuleAttacker : ruleAttacker EOF ;
    public final void entryRuleAttacker() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:370:1: ( ruleAttacker EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:371:1: ruleAttacker EOF
            {
             before(grammarAccess.getAttackerRule()); 
            pushFollow(FOLLOW_ruleAttacker_in_entryRuleAttacker721);
            ruleAttacker();
            _fsp--;

             after(grammarAccess.getAttackerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttacker728); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:378:1: ruleAttacker : ( ( rule__Attacker__Group__0 ) ) ;
    public final void ruleAttacker() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:382:2: ( ( ( rule__Attacker__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:383:1: ( ( rule__Attacker__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:383:1: ( ( rule__Attacker__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:384:1: ( rule__Attacker__Group__0 )
            {
             before(grammarAccess.getAttackerAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:385:1: ( rule__Attacker__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:385:2: rule__Attacker__Group__0
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0_in_ruleAttacker754);
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


    // $ANTLR start entryRuleProposition
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:397:1: entryRuleProposition : ruleProposition EOF ;
    public final void entryRuleProposition() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:398:1: ( ruleProposition EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:399:1: ruleProposition EOF
            {
             before(grammarAccess.getPropositionRule()); 
            pushFollow(FOLLOW_ruleProposition_in_entryRuleProposition781);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getPropositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProposition788); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:406:1: ruleProposition : ( ( rule__Proposition__NameAssignment ) ) ;
    public final void ruleProposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:410:2: ( ( ( rule__Proposition__NameAssignment ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:411:1: ( ( rule__Proposition__NameAssignment ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:411:1: ( ( rule__Proposition__NameAssignment ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:412:1: ( rule__Proposition__NameAssignment )
            {
             before(grammarAccess.getPropositionAccess().getNameAssignment()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:413:1: ( rule__Proposition__NameAssignment )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:413:2: rule__Proposition__NameAssignment
            {
            pushFollow(FOLLOW_rule__Proposition__NameAssignment_in_ruleProposition814);
            rule__Proposition__NameAssignment();
            _fsp--;


            }

             after(grammarAccess.getPropositionAccess().getNameAssignment()); 

            }


            }

        }
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


    // $ANTLR start entryRuleRelationship
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:425:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:426:1: ( ruleRelationship EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:427:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship841);
            ruleRelationship();
            _fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship848); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:434:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:438:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:439:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:439:1: ( ( rule__Relationship__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:440:1: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:441:1: ( rule__Relationship__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:441:2: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0_in_ruleRelationship874);
            rule__Relationship__Group__0();
            _fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start ruleRelType
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:454:1: ruleRelType : ( ( rule__RelType__Alternatives ) ) ;
    public final void ruleRelType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:458:1: ( ( ( rule__RelType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:459:1: ( ( rule__RelType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:459:1: ( ( rule__RelType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:460:1: ( rule__RelType__Alternatives )
            {
             before(grammarAccess.getRelTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:461:1: ( rule__RelType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:461:2: rule__RelType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelType__Alternatives_in_ruleRelType911);
            rule__RelType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getRelTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRelType


    // $ANTLR start rule__World__Alternatives_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:472:1: rule__World__Alternatives_1 : ( ( ( rule__World__GoalsAssignment_1_0 ) ) | ( ( rule__World__DomainsAssignment_1_1 ) ) | ( ( rule__World__RelationshipsAssignment_1_2 ) ) );
    public final void rule__World__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:476:1: ( ( ( rule__World__GoalsAssignment_1_0 ) ) | ( ( rule__World__DomainsAssignment_1_1 ) ) | ( ( rule__World__RelationshipsAssignment_1_2 ) ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=26 && LA1_1<=28)) ) {
                    alt1=1;
                }
                else if ( ((LA1_1>=29 && LA1_1<=33)) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("472:1: rule__World__Alternatives_1 : ( ( ( rule__World__GoalsAssignment_1_0 ) ) | ( ( rule__World__DomainsAssignment_1_1 ) ) | ( ( rule__World__RelationshipsAssignment_1_2 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA1_0>=11 && LA1_0<=20)) ) {
                alt1=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("472:1: rule__World__Alternatives_1 : ( ( ( rule__World__GoalsAssignment_1_0 ) ) | ( ( rule__World__DomainsAssignment_1_1 ) ) | ( ( rule__World__RelationshipsAssignment_1_2 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:477:1: ( ( rule__World__GoalsAssignment_1_0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:477:1: ( ( rule__World__GoalsAssignment_1_0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:478:1: ( rule__World__GoalsAssignment_1_0 )
                    {
                     before(grammarAccess.getWorldAccess().getGoalsAssignment_1_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:479:1: ( rule__World__GoalsAssignment_1_0 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:479:2: rule__World__GoalsAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__World__GoalsAssignment_1_0_in_rule__World__Alternatives_1946);
                    rule__World__GoalsAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getWorldAccess().getGoalsAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:483:6: ( ( rule__World__DomainsAssignment_1_1 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:483:6: ( ( rule__World__DomainsAssignment_1_1 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:484:1: ( rule__World__DomainsAssignment_1_1 )
                    {
                     before(grammarAccess.getWorldAccess().getDomainsAssignment_1_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:485:1: ( rule__World__DomainsAssignment_1_1 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:485:2: rule__World__DomainsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__World__DomainsAssignment_1_1_in_rule__World__Alternatives_1964);
                    rule__World__DomainsAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getWorldAccess().getDomainsAssignment_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:489:6: ( ( rule__World__RelationshipsAssignment_1_2 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:489:6: ( ( rule__World__RelationshipsAssignment_1_2 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:490:1: ( rule__World__RelationshipsAssignment_1_2 )
                    {
                     before(grammarAccess.getWorldAccess().getRelationshipsAssignment_1_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:491:1: ( rule__World__RelationshipsAssignment_1_2 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:491:2: rule__World__RelationshipsAssignment_1_2
                    {
                    pushFollow(FOLLOW_rule__World__RelationshipsAssignment_1_2_in_rule__World__Alternatives_1982);
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


    // $ANTLR start rule__Goal__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:500:1: rule__Goal__Alternatives : ( ( ruleSecurityGoal ) | ( ruleRequirement ) | ( ruleAntiRequirement ) );
    public final void rule__Goal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:504:1: ( ( ruleSecurityGoal ) | ( ruleRequirement ) | ( ruleAntiRequirement ) )
            int alt2=3;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt2=3;
                    }
                    break;
                case 27:
                    {
                    alt2=2;
                    }
                    break;
                case 26:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("500:1: rule__Goal__Alternatives : ( ( ruleSecurityGoal ) | ( ruleRequirement ) | ( ruleAntiRequirement ) );", 2, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("500:1: rule__Goal__Alternatives : ( ( ruleSecurityGoal ) | ( ruleRequirement ) | ( ruleAntiRequirement ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:505:1: ( ruleSecurityGoal )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:505:1: ( ruleSecurityGoal )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:506:1: ruleSecurityGoal
                    {
                     before(grammarAccess.getGoalAccess().getSecurityGoalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleSecurityGoal_in_rule__Goal__Alternatives1015);
                    ruleSecurityGoal();
                    _fsp--;

                     after(grammarAccess.getGoalAccess().getSecurityGoalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:511:6: ( ruleRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:511:6: ( ruleRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:512:1: ruleRequirement
                    {
                     before(grammarAccess.getGoalAccess().getRequirementParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRequirement_in_rule__Goal__Alternatives1032);
                    ruleRequirement();
                    _fsp--;

                     after(grammarAccess.getGoalAccess().getRequirementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:517:6: ( ruleAntiRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:517:6: ( ruleAntiRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:518:1: ruleAntiRequirement
                    {
                     before(grammarAccess.getGoalAccess().getAntiRequirementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAntiRequirement_in_rule__Goal__Alternatives1049);
                    ruleAntiRequirement();
                    _fsp--;

                     after(grammarAccess.getGoalAccess().getAntiRequirementParserRuleCall_2()); 

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
    // $ANTLR end rule__Goal__Alternatives


    // $ANTLR start rule__Domain__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:528:1: rule__Domain__Alternatives : ( ( ruleActor ) | ( ruleAction ) | ( ruleAsset ) | ( ruleResource ) | ( ruleAttacker ) );
    public final void rule__Domain__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:532:1: ( ( ruleActor ) | ( ruleAction ) | ( ruleAsset ) | ( ruleResource ) | ( ruleAttacker ) )
            int alt3=5;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 31:
                    {
                    alt3=3;
                    }
                    break;
                case 30:
                    {
                    alt3=2;
                    }
                    break;
                case 32:
                    {
                    alt3=4;
                    }
                    break;
                case 29:
                    {
                    alt3=1;
                    }
                    break;
                case 33:
                    {
                    alt3=5;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("528:1: rule__Domain__Alternatives : ( ( ruleActor ) | ( ruleAction ) | ( ruleAsset ) | ( ruleResource ) | ( ruleAttacker ) );", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("528:1: rule__Domain__Alternatives : ( ( ruleActor ) | ( ruleAction ) | ( ruleAsset ) | ( ruleResource ) | ( ruleAttacker ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:533:1: ( ruleActor )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:533:1: ( ruleActor )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:534:1: ruleActor
                    {
                     before(grammarAccess.getDomainAccess().getActorParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Domain__Alternatives1081);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getDomainAccess().getActorParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:539:6: ( ruleAction )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:539:6: ( ruleAction )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:540:1: ruleAction
                    {
                     before(grammarAccess.getDomainAccess().getActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleAction_in_rule__Domain__Alternatives1098);
                    ruleAction();
                    _fsp--;

                     after(grammarAccess.getDomainAccess().getActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:545:6: ( ruleAsset )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:545:6: ( ruleAsset )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:546:1: ruleAsset
                    {
                     before(grammarAccess.getDomainAccess().getAssetParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAsset_in_rule__Domain__Alternatives1115);
                    ruleAsset();
                    _fsp--;

                     after(grammarAccess.getDomainAccess().getAssetParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:551:6: ( ruleResource )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:551:6: ( ruleResource )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:552:1: ruleResource
                    {
                     before(grammarAccess.getDomainAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Domain__Alternatives1132);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getDomainAccess().getResourceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:557:6: ( ruleAttacker )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:557:6: ( ruleAttacker )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:558:1: ruleAttacker
                    {
                     before(grammarAccess.getDomainAccess().getAttackerParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleAttacker_in_rule__Domain__Alternatives1149);
                    ruleAttacker();
                    _fsp--;

                     after(grammarAccess.getDomainAccess().getAttackerParserRuleCall_4()); 

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
    // $ANTLR end rule__Domain__Alternatives


    // $ANTLR start rule__RelType__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:568:1: rule__RelType__Alternatives : ( ( ( 'carries out' ) ) | ( ( 'delegates' ) ) | ( ( 'fulfils' ) ) | ( ( 'provides' ) ) | ( ( 'trusts' ) ) | ( ( 'wants' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'argues' ) ) | ( ( 'interfaces' ) ) );
    public final void rule__RelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:572:1: ( ( ( 'carries out' ) ) | ( ( 'delegates' ) ) | ( ( 'fulfils' ) ) | ( ( 'provides' ) ) | ( ( 'trusts' ) ) | ( ( 'wants' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'argues' ) ) | ( ( 'interfaces' ) ) )
            int alt4=10;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt4=1;
                }
                break;
            case 12:
                {
                alt4=2;
                }
                break;
            case 13:
                {
                alt4=3;
                }
                break;
            case 14:
                {
                alt4=4;
                }
                break;
            case 15:
                {
                alt4=5;
                }
                break;
            case 16:
                {
                alt4=6;
                }
                break;
            case 17:
                {
                alt4=7;
                }
                break;
            case 18:
                {
                alt4=8;
                }
                break;
            case 19:
                {
                alt4=9;
                }
                break;
            case 20:
                {
                alt4=10;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("568:1: rule__RelType__Alternatives : ( ( ( 'carries out' ) ) | ( ( 'delegates' ) ) | ( ( 'fulfils' ) ) | ( ( 'provides' ) ) | ( ( 'trusts' ) ) | ( ( 'wants' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'argues' ) ) | ( ( 'interfaces' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:573:1: ( ( 'carries out' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:573:1: ( ( 'carries out' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:574:1: ( 'carries out' )
                    {
                     before(grammarAccess.getRelTypeAccess().getCARRIESOUTEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:575:1: ( 'carries out' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:575:3: 'carries out'
                    {
                    match(input,11,FOLLOW_11_in_rule__RelType__Alternatives1182); 

                    }

                     after(grammarAccess.getRelTypeAccess().getCARRIESOUTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:580:6: ( ( 'delegates' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:580:6: ( ( 'delegates' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:581:1: ( 'delegates' )
                    {
                     before(grammarAccess.getRelTypeAccess().getDELEGATESEnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:582:1: ( 'delegates' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:582:3: 'delegates'
                    {
                    match(input,12,FOLLOW_12_in_rule__RelType__Alternatives1203); 

                    }

                     after(grammarAccess.getRelTypeAccess().getDELEGATESEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:587:6: ( ( 'fulfils' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:587:6: ( ( 'fulfils' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:588:1: ( 'fulfils' )
                    {
                     before(grammarAccess.getRelTypeAccess().getFULFILSEnumLiteralDeclaration_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:589:1: ( 'fulfils' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:589:3: 'fulfils'
                    {
                    match(input,13,FOLLOW_13_in_rule__RelType__Alternatives1224); 

                    }

                     after(grammarAccess.getRelTypeAccess().getFULFILSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:594:6: ( ( 'provides' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:594:6: ( ( 'provides' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:595:1: ( 'provides' )
                    {
                     before(grammarAccess.getRelTypeAccess().getPROVIDESEnumLiteralDeclaration_3()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:596:1: ( 'provides' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:596:3: 'provides'
                    {
                    match(input,14,FOLLOW_14_in_rule__RelType__Alternatives1245); 

                    }

                     after(grammarAccess.getRelTypeAccess().getPROVIDESEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:601:6: ( ( 'trusts' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:601:6: ( ( 'trusts' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:602:1: ( 'trusts' )
                    {
                     before(grammarAccess.getRelTypeAccess().getTRUSTSEnumLiteralDeclaration_4()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:603:1: ( 'trusts' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:603:3: 'trusts'
                    {
                    match(input,15,FOLLOW_15_in_rule__RelType__Alternatives1266); 

                    }

                     after(grammarAccess.getRelTypeAccess().getTRUSTSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:608:6: ( ( 'wants' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:608:6: ( ( 'wants' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:609:1: ( 'wants' )
                    {
                     before(grammarAccess.getRelTypeAccess().getWANTSEnumLiteralDeclaration_5()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:610:1: ( 'wants' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:610:3: 'wants'
                    {
                    match(input,16,FOLLOW_16_in_rule__RelType__Alternatives1287); 

                    }

                     after(grammarAccess.getRelTypeAccess().getWANTSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:615:6: ( ( 'damages' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:615:6: ( ( 'damages' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:616:1: ( 'damages' )
                    {
                     before(grammarAccess.getRelTypeAccess().getDAMAGESEnumLiteralDeclaration_6()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:617:1: ( 'damages' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:617:3: 'damages'
                    {
                    match(input,17,FOLLOW_17_in_rule__RelType__Alternatives1308); 

                    }

                     after(grammarAccess.getRelTypeAccess().getDAMAGESEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:622:6: ( ( 'attacks' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:622:6: ( ( 'attacks' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:623:1: ( 'attacks' )
                    {
                     before(grammarAccess.getRelTypeAccess().getATTACKSEnumLiteralDeclaration_7()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:624:1: ( 'attacks' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:624:3: 'attacks'
                    {
                    match(input,18,FOLLOW_18_in_rule__RelType__Alternatives1329); 

                    }

                     after(grammarAccess.getRelTypeAccess().getATTACKSEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:629:6: ( ( 'argues' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:629:6: ( ( 'argues' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:630:1: ( 'argues' )
                    {
                     before(grammarAccess.getRelTypeAccess().getARGUESEnumLiteralDeclaration_8()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:631:1: ( 'argues' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:631:3: 'argues'
                    {
                    match(input,19,FOLLOW_19_in_rule__RelType__Alternatives1350); 

                    }

                     after(grammarAccess.getRelTypeAccess().getARGUESEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:636:6: ( ( 'interfaces' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:636:6: ( ( 'interfaces' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:637:1: ( 'interfaces' )
                    {
                     before(grammarAccess.getRelTypeAccess().getINTERFACESEnumLiteralDeclaration_9()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:638:1: ( 'interfaces' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:638:3: 'interfaces'
                    {
                    match(input,20,FOLLOW_20_in_rule__RelType__Alternatives1371); 

                    }

                     after(grammarAccess.getRelTypeAccess().getINTERFACESEnumLiteralDeclaration_9()); 

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
    // $ANTLR end rule__RelType__Alternatives


    // $ANTLR start rule__Situation__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:650:1: rule__Situation__Group__0 : rule__Situation__Group__0__Impl rule__Situation__Group__1 ;
    public final void rule__Situation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:654:1: ( rule__Situation__Group__0__Impl rule__Situation__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:655:2: rule__Situation__Group__0__Impl rule__Situation__Group__1
            {
            pushFollow(FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__01404);
            rule__Situation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__01407);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:662:1: rule__Situation__Group__0__Impl : ( ( rule__Situation__Group_0__0 )? ) ;
    public final void rule__Situation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:666:1: ( ( ( rule__Situation__Group_0__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:667:1: ( ( rule__Situation__Group_0__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:667:1: ( ( rule__Situation__Group_0__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:668:1: ( rule__Situation__Group_0__0 )?
            {
             before(grammarAccess.getSituationAccess().getGroup_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:669:1: ( rule__Situation__Group_0__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:669:2: rule__Situation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl1434);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:679:1: rule__Situation__Group__1 : rule__Situation__Group__1__Impl ;
    public final void rule__Situation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:683:1: ( rule__Situation__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:684:2: rule__Situation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__11465);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:690:1: rule__Situation__Group__1__Impl : ( ( rule__Situation__WorldAssignment_1 ) ) ;
    public final void rule__Situation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:694:1: ( ( ( rule__Situation__WorldAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:695:1: ( ( rule__Situation__WorldAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:695:1: ( ( rule__Situation__WorldAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:696:1: ( rule__Situation__WorldAssignment_1 )
            {
             before(grammarAccess.getSituationAccess().getWorldAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:697:1: ( rule__Situation__WorldAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:697:2: rule__Situation__WorldAssignment_1
            {
            pushFollow(FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl1492);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:711:1: rule__Situation__Group_0__0 : rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 ;
    public final void rule__Situation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:715:1: ( rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:716:2: rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__01526);
            rule__Situation__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__01529);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:723:1: rule__Situation__Group_0__0__Impl : ( 'model' ) ;
    public final void rule__Situation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:727:1: ( ( 'model' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:728:1: ( 'model' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:728:1: ( 'model' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:729:1: 'model'
            {
             before(grammarAccess.getSituationAccess().getModelKeyword_0_0()); 
            match(input,21,FOLLOW_21_in_rule__Situation__Group_0__0__Impl1557); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:742:1: rule__Situation__Group_0__1 : rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 ;
    public final void rule__Situation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:746:1: ( rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:747:2: rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__11588);
            rule__Situation__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__11591);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:754:1: rule__Situation__Group_0__1__Impl : ( ( rule__Situation__TimeAssignment_0_1 ) ) ;
    public final void rule__Situation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:758:1: ( ( ( rule__Situation__TimeAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:759:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:759:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:760:1: ( rule__Situation__TimeAssignment_0_1 )
            {
             before(grammarAccess.getSituationAccess().getTimeAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:761:1: ( rule__Situation__TimeAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:761:2: rule__Situation__TimeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl1618);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:771:1: rule__Situation__Group_0__2 : rule__Situation__Group_0__2__Impl ;
    public final void rule__Situation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:775:1: ( rule__Situation__Group_0__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:776:2: rule__Situation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__21648);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:782:1: rule__Situation__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Situation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:786:1: ( ( ':' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:787:1: ( ':' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:787:1: ( ':' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:788:1: ':'
            {
             before(grammarAccess.getSituationAccess().getColonKeyword_0_2()); 
            match(input,22,FOLLOW_22_in_rule__Situation__Group_0__2__Impl1676); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:807:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:811:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:812:2: rule__World__Group__0__Impl rule__World__Group__1
            {
            pushFollow(FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__01713);
            rule__World__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__World__Group__1_in_rule__World__Group__01716);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:819:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:823:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:824:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:824:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:825:1: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:826:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:828:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:838:1: rule__World__Group__1 : rule__World__Group__1__Impl ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:842:1: ( rule__World__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:843:2: rule__World__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__11774);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:849:1: rule__World__Group__1__Impl : ( ( rule__World__Alternatives_1 )* ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:853:1: ( ( ( rule__World__Alternatives_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:854:1: ( ( rule__World__Alternatives_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:854:1: ( ( rule__World__Alternatives_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:855:1: ( rule__World__Alternatives_1 )*
            {
             before(grammarAccess.getWorldAccess().getAlternatives_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:856:1: ( rule__World__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=11 && LA6_0<=20)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:856:2: rule__World__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__World__Alternatives_1_in_rule__World__Group__1__Impl1801);
            	    rule__World__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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


    // $ANTLR start rule__SecurityGoal__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:870:1: rule__SecurityGoal__Group__0 : rule__SecurityGoal__Group__0__Impl rule__SecurityGoal__Group__1 ;
    public final void rule__SecurityGoal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:874:1: ( rule__SecurityGoal__Group__0__Impl rule__SecurityGoal__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:875:2: rule__SecurityGoal__Group__0__Impl rule__SecurityGoal__Group__1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__0__Impl_in_rule__SecurityGoal__Group__01836);
            rule__SecurityGoal__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group__1_in_rule__SecurityGoal__Group__01839);
            rule__SecurityGoal__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group__0


    // $ANTLR start rule__SecurityGoal__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:882:1: rule__SecurityGoal__Group__0__Impl : ( ( rule__SecurityGoal__NameAssignment_0 ) ) ;
    public final void rule__SecurityGoal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:886:1: ( ( ( rule__SecurityGoal__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:887:1: ( ( rule__SecurityGoal__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:887:1: ( ( rule__SecurityGoal__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:888:1: ( rule__SecurityGoal__NameAssignment_0 )
            {
             before(grammarAccess.getSecurityGoalAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:889:1: ( rule__SecurityGoal__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:889:2: rule__SecurityGoal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SecurityGoal__NameAssignment_0_in_rule__SecurityGoal__Group__0__Impl1866);
            rule__SecurityGoal__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getSecurityGoalAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group__0__Impl


    // $ANTLR start rule__SecurityGoal__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:899:1: rule__SecurityGoal__Group__1 : rule__SecurityGoal__Group__1__Impl rule__SecurityGoal__Group__2 ;
    public final void rule__SecurityGoal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:903:1: ( rule__SecurityGoal__Group__1__Impl rule__SecurityGoal__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:904:2: rule__SecurityGoal__Group__1__Impl rule__SecurityGoal__Group__2
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__1__Impl_in_rule__SecurityGoal__Group__11896);
            rule__SecurityGoal__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group__2_in_rule__SecurityGoal__Group__11899);
            rule__SecurityGoal__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group__1


    // $ANTLR start rule__SecurityGoal__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:911:1: rule__SecurityGoal__Group__1__Impl : ( ( rule__SecurityGoal__TypeAssignment_1 ) ) ;
    public final void rule__SecurityGoal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:915:1: ( ( ( rule__SecurityGoal__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:916:1: ( ( rule__SecurityGoal__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:916:1: ( ( rule__SecurityGoal__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:917:1: ( rule__SecurityGoal__TypeAssignment_1 )
            {
             before(grammarAccess.getSecurityGoalAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:918:1: ( rule__SecurityGoal__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:918:2: rule__SecurityGoal__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__TypeAssignment_1_in_rule__SecurityGoal__Group__1__Impl1926);
            rule__SecurityGoal__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getSecurityGoalAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group__1__Impl


    // $ANTLR start rule__SecurityGoal__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:928:1: rule__SecurityGoal__Group__2 : rule__SecurityGoal__Group__2__Impl ;
    public final void rule__SecurityGoal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:932:1: ( rule__SecurityGoal__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:933:2: rule__SecurityGoal__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__2__Impl_in_rule__SecurityGoal__Group__21956);
            rule__SecurityGoal__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group__2


    // $ANTLR start rule__SecurityGoal__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:939:1: rule__SecurityGoal__Group__2__Impl : ( ( rule__SecurityGoal__Group_2__0 )* ) ;
    public final void rule__SecurityGoal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:943:1: ( ( ( rule__SecurityGoal__Group_2__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:944:1: ( ( rule__SecurityGoal__Group_2__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:944:1: ( ( rule__SecurityGoal__Group_2__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:945:1: ( rule__SecurityGoal__Group_2__0 )*
            {
             before(grammarAccess.getSecurityGoalAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:946:1: ( rule__SecurityGoal__Group_2__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_STRING||LA7_0==23) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:946:2: rule__SecurityGoal__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__SecurityGoal__Group_2__0_in_rule__SecurityGoal__Group__2__Impl1983);
            	    rule__SecurityGoal__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getSecurityGoalAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group__2__Impl


    // $ANTLR start rule__SecurityGoal__Group_2__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:962:1: rule__SecurityGoal__Group_2__0 : rule__SecurityGoal__Group_2__0__Impl rule__SecurityGoal__Group_2__1 ;
    public final void rule__SecurityGoal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:966:1: ( rule__SecurityGoal__Group_2__0__Impl rule__SecurityGoal__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:967:2: rule__SecurityGoal__Group_2__0__Impl rule__SecurityGoal__Group_2__1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group_2__0__Impl_in_rule__SecurityGoal__Group_2__02020);
            rule__SecurityGoal__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group_2__1_in_rule__SecurityGoal__Group_2__02023);
            rule__SecurityGoal__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group_2__0


    // $ANTLR start rule__SecurityGoal__Group_2__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:974:1: rule__SecurityGoal__Group_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__SecurityGoal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:978:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:979:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:979:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:980:1: ( ',' )?
            {
             before(grammarAccess.getSecurityGoalAccess().getCommaKeyword_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:981:1: ( ',' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:982:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__SecurityGoal__Group_2__0__Impl2052); 

                    }
                    break;

            }

             after(grammarAccess.getSecurityGoalAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group_2__0__Impl


    // $ANTLR start rule__SecurityGoal__Group_2__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:993:1: rule__SecurityGoal__Group_2__1 : rule__SecurityGoal__Group_2__1__Impl ;
    public final void rule__SecurityGoal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:997:1: ( rule__SecurityGoal__Group_2__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:998:2: rule__SecurityGoal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group_2__1__Impl_in_rule__SecurityGoal__Group_2__12085);
            rule__SecurityGoal__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group_2__1


    // $ANTLR start rule__SecurityGoal__Group_2__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1004:1: rule__SecurityGoal__Group_2__1__Impl : ( ( rule__SecurityGoal__PropertiesAssignment_2_1 ) ) ;
    public final void rule__SecurityGoal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1008:1: ( ( ( rule__SecurityGoal__PropertiesAssignment_2_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1009:1: ( ( rule__SecurityGoal__PropertiesAssignment_2_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1009:1: ( ( rule__SecurityGoal__PropertiesAssignment_2_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1010:1: ( rule__SecurityGoal__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getSecurityGoalAccess().getPropertiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1011:1: ( rule__SecurityGoal__PropertiesAssignment_2_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1011:2: rule__SecurityGoal__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__PropertiesAssignment_2_1_in_rule__SecurityGoal__Group_2__1__Impl2112);
            rule__SecurityGoal__PropertiesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getSecurityGoalAccess().getPropertiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group_2__1__Impl


    // $ANTLR start rule__Requirement__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1025:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1029:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1030:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__02146);
            rule__Requirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__02149);
            rule__Requirement__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group__0


    // $ANTLR start rule__Requirement__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1037:1: rule__Requirement__Group__0__Impl : ( ( rule__Requirement__NameAssignment_0 ) ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1041:1: ( ( ( rule__Requirement__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1042:1: ( ( rule__Requirement__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1042:1: ( ( rule__Requirement__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1043:1: ( rule__Requirement__NameAssignment_0 )
            {
             before(grammarAccess.getRequirementAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1044:1: ( rule__Requirement__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1044:2: rule__Requirement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Requirement__NameAssignment_0_in_rule__Requirement__Group__0__Impl2176);
            rule__Requirement__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRequirementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group__0__Impl


    // $ANTLR start rule__Requirement__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1054:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl rule__Requirement__Group__2 ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1058:1: ( rule__Requirement__Group__1__Impl rule__Requirement__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1059:2: rule__Requirement__Group__1__Impl rule__Requirement__Group__2
            {
            pushFollow(FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__12206);
            rule__Requirement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__12209);
            rule__Requirement__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group__1


    // $ANTLR start rule__Requirement__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1066:1: rule__Requirement__Group__1__Impl : ( ( rule__Requirement__TypeAssignment_1 ) ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1070:1: ( ( ( rule__Requirement__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1071:1: ( ( rule__Requirement__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1071:1: ( ( rule__Requirement__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1072:1: ( rule__Requirement__TypeAssignment_1 )
            {
             before(grammarAccess.getRequirementAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1073:1: ( rule__Requirement__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1073:2: rule__Requirement__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Requirement__TypeAssignment_1_in_rule__Requirement__Group__1__Impl2236);
            rule__Requirement__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getRequirementAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group__1__Impl


    // $ANTLR start rule__Requirement__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1083:1: rule__Requirement__Group__2 : rule__Requirement__Group__2__Impl ;
    public final void rule__Requirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1087:1: ( rule__Requirement__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1088:2: rule__Requirement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__22266);
            rule__Requirement__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group__2


    // $ANTLR start rule__Requirement__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1094:1: rule__Requirement__Group__2__Impl : ( ( rule__Requirement__Group_2__0 )* ) ;
    public final void rule__Requirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1098:1: ( ( ( rule__Requirement__Group_2__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1099:1: ( ( rule__Requirement__Group_2__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1099:1: ( ( rule__Requirement__Group_2__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1100:1: ( rule__Requirement__Group_2__0 )*
            {
             before(grammarAccess.getRequirementAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1101:1: ( rule__Requirement__Group_2__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||LA9_0==23) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1101:2: rule__Requirement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Requirement__Group_2__0_in_rule__Requirement__Group__2__Impl2293);
            	    rule__Requirement__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getRequirementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group__2__Impl


    // $ANTLR start rule__Requirement__Group_2__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1117:1: rule__Requirement__Group_2__0 : rule__Requirement__Group_2__0__Impl rule__Requirement__Group_2__1 ;
    public final void rule__Requirement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1121:1: ( rule__Requirement__Group_2__0__Impl rule__Requirement__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1122:2: rule__Requirement__Group_2__0__Impl rule__Requirement__Group_2__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group_2__0__Impl_in_rule__Requirement__Group_2__02330);
            rule__Requirement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_2__1_in_rule__Requirement__Group_2__02333);
            rule__Requirement__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group_2__0


    // $ANTLR start rule__Requirement__Group_2__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1129:1: rule__Requirement__Group_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Requirement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1133:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1134:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1134:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1135:1: ( ',' )?
            {
             before(grammarAccess.getRequirementAccess().getCommaKeyword_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1136:1: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1137:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__Requirement__Group_2__0__Impl2362); 

                    }
                    break;

            }

             after(grammarAccess.getRequirementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group_2__0__Impl


    // $ANTLR start rule__Requirement__Group_2__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1148:1: rule__Requirement__Group_2__1 : rule__Requirement__Group_2__1__Impl ;
    public final void rule__Requirement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1152:1: ( rule__Requirement__Group_2__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1153:2: rule__Requirement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group_2__1__Impl_in_rule__Requirement__Group_2__12395);
            rule__Requirement__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group_2__1


    // $ANTLR start rule__Requirement__Group_2__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1159:1: rule__Requirement__Group_2__1__Impl : ( ( rule__Requirement__PropertiesAssignment_2_1 ) ) ;
    public final void rule__Requirement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1163:1: ( ( ( rule__Requirement__PropertiesAssignment_2_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1164:1: ( ( rule__Requirement__PropertiesAssignment_2_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1164:1: ( ( rule__Requirement__PropertiesAssignment_2_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1165:1: ( rule__Requirement__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getRequirementAccess().getPropertiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1166:1: ( rule__Requirement__PropertiesAssignment_2_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1166:2: rule__Requirement__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Requirement__PropertiesAssignment_2_1_in_rule__Requirement__Group_2__1__Impl2422);
            rule__Requirement__PropertiesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getRequirementAccess().getPropertiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group_2__1__Impl


    // $ANTLR start rule__AntiRequirement__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1180:1: rule__AntiRequirement__Group__0 : rule__AntiRequirement__Group__0__Impl rule__AntiRequirement__Group__1 ;
    public final void rule__AntiRequirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1184:1: ( rule__AntiRequirement__Group__0__Impl rule__AntiRequirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1185:2: rule__AntiRequirement__Group__0__Impl rule__AntiRequirement__Group__1
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group__0__Impl_in_rule__AntiRequirement__Group__02456);
            rule__AntiRequirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AntiRequirement__Group__1_in_rule__AntiRequirement__Group__02459);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1192:1: rule__AntiRequirement__Group__0__Impl : ( ( rule__AntiRequirement__NameAssignment_0 ) ) ;
    public final void rule__AntiRequirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1196:1: ( ( ( rule__AntiRequirement__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1197:1: ( ( rule__AntiRequirement__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1197:1: ( ( rule__AntiRequirement__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1198:1: ( rule__AntiRequirement__NameAssignment_0 )
            {
             before(grammarAccess.getAntiRequirementAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1199:1: ( rule__AntiRequirement__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1199:2: rule__AntiRequirement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AntiRequirement__NameAssignment_0_in_rule__AntiRequirement__Group__0__Impl2486);
            rule__AntiRequirement__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAntiRequirementAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1209:1: rule__AntiRequirement__Group__1 : rule__AntiRequirement__Group__1__Impl rule__AntiRequirement__Group__2 ;
    public final void rule__AntiRequirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1213:1: ( rule__AntiRequirement__Group__1__Impl rule__AntiRequirement__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1214:2: rule__AntiRequirement__Group__1__Impl rule__AntiRequirement__Group__2
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group__1__Impl_in_rule__AntiRequirement__Group__12516);
            rule__AntiRequirement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AntiRequirement__Group__2_in_rule__AntiRequirement__Group__12519);
            rule__AntiRequirement__Group__2();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1221:1: rule__AntiRequirement__Group__1__Impl : ( ( rule__AntiRequirement__TypeAssignment_1 ) ) ;
    public final void rule__AntiRequirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1225:1: ( ( ( rule__AntiRequirement__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1226:1: ( ( rule__AntiRequirement__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1226:1: ( ( rule__AntiRequirement__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1227:1: ( rule__AntiRequirement__TypeAssignment_1 )
            {
             before(grammarAccess.getAntiRequirementAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1228:1: ( rule__AntiRequirement__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1228:2: rule__AntiRequirement__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__AntiRequirement__TypeAssignment_1_in_rule__AntiRequirement__Group__1__Impl2546);
            rule__AntiRequirement__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAntiRequirementAccess().getTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__AntiRequirement__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1238:1: rule__AntiRequirement__Group__2 : rule__AntiRequirement__Group__2__Impl ;
    public final void rule__AntiRequirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1242:1: ( rule__AntiRequirement__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1243:2: rule__AntiRequirement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group__2__Impl_in_rule__AntiRequirement__Group__22576);
            rule__AntiRequirement__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__Group__2


    // $ANTLR start rule__AntiRequirement__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1249:1: rule__AntiRequirement__Group__2__Impl : ( ( rule__AntiRequirement__Group_2__0 )* ) ;
    public final void rule__AntiRequirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1253:1: ( ( ( rule__AntiRequirement__Group_2__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1254:1: ( ( rule__AntiRequirement__Group_2__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1254:1: ( ( rule__AntiRequirement__Group_2__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1255:1: ( rule__AntiRequirement__Group_2__0 )*
            {
             before(grammarAccess.getAntiRequirementAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1256:1: ( rule__AntiRequirement__Group_2__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_STRING||LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1256:2: rule__AntiRequirement__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AntiRequirement__Group_2__0_in_rule__AntiRequirement__Group__2__Impl2603);
            	    rule__AntiRequirement__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getAntiRequirementAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__Group__2__Impl


    // $ANTLR start rule__AntiRequirement__Group_2__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1272:1: rule__AntiRequirement__Group_2__0 : rule__AntiRequirement__Group_2__0__Impl rule__AntiRequirement__Group_2__1 ;
    public final void rule__AntiRequirement__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1276:1: ( rule__AntiRequirement__Group_2__0__Impl rule__AntiRequirement__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1277:2: rule__AntiRequirement__Group_2__0__Impl rule__AntiRequirement__Group_2__1
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group_2__0__Impl_in_rule__AntiRequirement__Group_2__02640);
            rule__AntiRequirement__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__AntiRequirement__Group_2__1_in_rule__AntiRequirement__Group_2__02643);
            rule__AntiRequirement__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__Group_2__0


    // $ANTLR start rule__AntiRequirement__Group_2__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1284:1: rule__AntiRequirement__Group_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__AntiRequirement__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1288:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1289:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1289:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1290:1: ( ',' )?
            {
             before(grammarAccess.getAntiRequirementAccess().getCommaKeyword_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1291:1: ( ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1292:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__AntiRequirement__Group_2__0__Impl2672); 

                    }
                    break;

            }

             after(grammarAccess.getAntiRequirementAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__Group_2__0__Impl


    // $ANTLR start rule__AntiRequirement__Group_2__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1303:1: rule__AntiRequirement__Group_2__1 : rule__AntiRequirement__Group_2__1__Impl ;
    public final void rule__AntiRequirement__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1307:1: ( rule__AntiRequirement__Group_2__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1308:2: rule__AntiRequirement__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AntiRequirement__Group_2__1__Impl_in_rule__AntiRequirement__Group_2__12705);
            rule__AntiRequirement__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__Group_2__1


    // $ANTLR start rule__AntiRequirement__Group_2__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1314:1: rule__AntiRequirement__Group_2__1__Impl : ( ( rule__AntiRequirement__PropertiesAssignment_2_1 ) ) ;
    public final void rule__AntiRequirement__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1318:1: ( ( ( rule__AntiRequirement__PropertiesAssignment_2_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1319:1: ( ( rule__AntiRequirement__PropertiesAssignment_2_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1319:1: ( ( rule__AntiRequirement__PropertiesAssignment_2_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1320:1: ( rule__AntiRequirement__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getAntiRequirementAccess().getPropertiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1321:1: ( rule__AntiRequirement__PropertiesAssignment_2_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1321:2: rule__AntiRequirement__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AntiRequirement__PropertiesAssignment_2_1_in_rule__AntiRequirement__Group_2__1__Impl2732);
            rule__AntiRequirement__PropertiesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getAntiRequirementAccess().getPropertiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__Group_2__1__Impl


    // $ANTLR start rule__Actor__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1335:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1339:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1340:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__02766);
            rule__Actor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__02769);
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


    // $ANTLR start rule__Actor__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1347:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__NameAssignment_0 ) ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1351:1: ( ( ( rule__Actor__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1352:1: ( ( rule__Actor__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1352:1: ( ( rule__Actor__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1353:1: ( rule__Actor__NameAssignment_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1354:1: ( rule__Actor__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1354:2: rule__Actor__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl2796);
            rule__Actor__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group__0__Impl


    // $ANTLR start rule__Actor__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1364:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1368:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1369:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__12826);
            rule__Actor__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__12829);
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


    // $ANTLR start rule__Actor__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1376:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__TypeAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1380:1: ( ( ( rule__Actor__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1381:1: ( ( rule__Actor__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1381:1: ( ( rule__Actor__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1382:1: ( rule__Actor__TypeAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1383:1: ( rule__Actor__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1383:2: rule__Actor__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Actor__TypeAssignment_1_in_rule__Actor__Group__1__Impl2856);
            rule__Actor__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group__1__Impl


    // $ANTLR start rule__Actor__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1393:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1397:1: ( rule__Actor__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1398:2: rule__Actor__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__22886);
            rule__Actor__Group__2__Impl();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Actor__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1404:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__Group_2__0 )* ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1408:1: ( ( ( rule__Actor__Group_2__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1409:1: ( ( rule__Actor__Group_2__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1409:1: ( ( rule__Actor__Group_2__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1410:1: ( rule__Actor__Group_2__0 )*
            {
             before(grammarAccess.getActorAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1411:1: ( rule__Actor__Group_2__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_STRING||LA13_0==23) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1411:2: rule__Actor__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Actor__Group_2__0_in_rule__Actor__Group__2__Impl2913);
            	    rule__Actor__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group__2__Impl


    // $ANTLR start rule__Actor__Group_2__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1427:1: rule__Actor__Group_2__0 : rule__Actor__Group_2__0__Impl rule__Actor__Group_2__1 ;
    public final void rule__Actor__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1431:1: ( rule__Actor__Group_2__0__Impl rule__Actor__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1432:2: rule__Actor__Group_2__0__Impl rule__Actor__Group_2__1
            {
            pushFollow(FOLLOW_rule__Actor__Group_2__0__Impl_in_rule__Actor__Group_2__02950);
            rule__Actor__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group_2__1_in_rule__Actor__Group_2__02953);
            rule__Actor__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_2__0


    // $ANTLR start rule__Actor__Group_2__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1439:1: rule__Actor__Group_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Actor__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1443:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1444:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1444:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1445:1: ( ',' )?
            {
             before(grammarAccess.getActorAccess().getCommaKeyword_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1446:1: ( ',' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==23) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1447:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__Actor__Group_2__0__Impl2982); 

                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_2__0__Impl


    // $ANTLR start rule__Actor__Group_2__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1458:1: rule__Actor__Group_2__1 : rule__Actor__Group_2__1__Impl ;
    public final void rule__Actor__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1462:1: ( rule__Actor__Group_2__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1463:2: rule__Actor__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Actor__Group_2__1__Impl_in_rule__Actor__Group_2__13015);
            rule__Actor__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_2__1


    // $ANTLR start rule__Actor__Group_2__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1469:1: rule__Actor__Group_2__1__Impl : ( ( rule__Actor__PropertiesAssignment_2_1 ) ) ;
    public final void rule__Actor__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1473:1: ( ( ( rule__Actor__PropertiesAssignment_2_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1474:1: ( ( rule__Actor__PropertiesAssignment_2_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1474:1: ( ( rule__Actor__PropertiesAssignment_2_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1475:1: ( rule__Actor__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getActorAccess().getPropertiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1476:1: ( rule__Actor__PropertiesAssignment_2_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1476:2: rule__Actor__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Actor__PropertiesAssignment_2_1_in_rule__Actor__Group_2__1__Impl3042);
            rule__Actor__PropertiesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getPropertiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_2__1__Impl


    // $ANTLR start rule__Action__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1490:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1494:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1495:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03076);
            rule__Action__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03079);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1502:1: rule__Action__Group__0__Impl : ( ( rule__Action__NameAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1506:1: ( ( ( rule__Action__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1507:1: ( ( rule__Action__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1507:1: ( ( rule__Action__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1508:1: ( rule__Action__NameAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1509:1: ( rule__Action__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1509:2: rule__Action__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__0__Impl3106);
            rule__Action__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1519:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1523:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1524:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13136);
            rule__Action__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13139);
            rule__Action__Group__2();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1531:1: rule__Action__Group__1__Impl : ( ( rule__Action__TypeAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1535:1: ( ( ( rule__Action__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1536:1: ( ( rule__Action__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1536:1: ( ( rule__Action__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1537:1: ( rule__Action__TypeAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1538:1: ( rule__Action__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1538:2: rule__Action__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__1__Impl3166);
            rule__Action__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Action__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1548:1: rule__Action__Group__2 : rule__Action__Group__2__Impl ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1552:1: ( rule__Action__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1553:2: rule__Action__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23196);
            rule__Action__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__2


    // $ANTLR start rule__Action__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1559:1: rule__Action__Group__2__Impl : ( ( rule__Action__Group_2__0 )* ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1563:1: ( ( ( rule__Action__Group_2__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1564:1: ( ( rule__Action__Group_2__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1564:1: ( ( rule__Action__Group_2__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1565:1: ( rule__Action__Group_2__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1566:1: ( rule__Action__Group_2__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING||LA15_0==23) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1566:2: rule__Action__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Action__Group_2__0_in_rule__Action__Group__2__Impl3223);
            	    rule__Action__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__2__Impl


    // $ANTLR start rule__Action__Group_2__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1582:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1586:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1587:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_rule__Action__Group_2__0__Impl_in_rule__Action__Group_2__03260);
            rule__Action__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group_2__1_in_rule__Action__Group_2__03263);
            rule__Action__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_2__0


    // $ANTLR start rule__Action__Group_2__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1594:1: rule__Action__Group_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1598:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1599:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1599:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1600:1: ( ',' )?
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1601:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==23) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1602:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__Action__Group_2__0__Impl3292); 

                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_2__0__Impl


    // $ANTLR start rule__Action__Group_2__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1613:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1617:1: ( rule__Action__Group_2__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1618:2: rule__Action__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_2__1__Impl_in_rule__Action__Group_2__13325);
            rule__Action__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_2__1


    // $ANTLR start rule__Action__Group_2__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1624:1: rule__Action__Group_2__1__Impl : ( ( rule__Action__PropertiesAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1628:1: ( ( ( rule__Action__PropertiesAssignment_2_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1629:1: ( ( rule__Action__PropertiesAssignment_2_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1629:1: ( ( rule__Action__PropertiesAssignment_2_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1630:1: ( rule__Action__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getPropertiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1631:1: ( rule__Action__PropertiesAssignment_2_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1631:2: rule__Action__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Action__PropertiesAssignment_2_1_in_rule__Action__Group_2__1__Impl3352);
            rule__Action__PropertiesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getPropertiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_2__1__Impl


    // $ANTLR start rule__Asset__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1645:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1649:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1650:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__03386);
            rule__Asset__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__03389);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1657:1: rule__Asset__Group__0__Impl : ( ( rule__Asset__NameAssignment_0 ) ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1661:1: ( ( ( rule__Asset__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1662:1: ( ( rule__Asset__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1662:1: ( ( rule__Asset__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1663:1: ( rule__Asset__NameAssignment_0 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1664:1: ( rule__Asset__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1664:2: rule__Asset__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Asset__NameAssignment_0_in_rule__Asset__Group__0__Impl3416);
            rule__Asset__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAssetAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1674:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl rule__Asset__Group__2 ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1678:1: ( rule__Asset__Group__1__Impl rule__Asset__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1679:2: rule__Asset__Group__1__Impl rule__Asset__Group__2
            {
            pushFollow(FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__13446);
            rule__Asset__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__13449);
            rule__Asset__Group__2();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1686:1: rule__Asset__Group__1__Impl : ( ( rule__Asset__TypeAssignment_1 ) ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1690:1: ( ( ( rule__Asset__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1691:1: ( ( rule__Asset__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1691:1: ( ( rule__Asset__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1692:1: ( rule__Asset__TypeAssignment_1 )
            {
             before(grammarAccess.getAssetAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1693:1: ( rule__Asset__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1693:2: rule__Asset__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Asset__TypeAssignment_1_in_rule__Asset__Group__1__Impl3476);
            rule__Asset__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAssetAccess().getTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Asset__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1703:1: rule__Asset__Group__2 : rule__Asset__Group__2__Impl ;
    public final void rule__Asset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1707:1: ( rule__Asset__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1708:2: rule__Asset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__23506);
            rule__Asset__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group__2


    // $ANTLR start rule__Asset__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1714:1: rule__Asset__Group__2__Impl : ( ( rule__Asset__Group_2__0 )* ) ;
    public final void rule__Asset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1718:1: ( ( ( rule__Asset__Group_2__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1719:1: ( ( rule__Asset__Group_2__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1719:1: ( ( rule__Asset__Group_2__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1720:1: ( rule__Asset__Group_2__0 )*
            {
             before(grammarAccess.getAssetAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1721:1: ( rule__Asset__Group_2__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_STRING||LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1721:2: rule__Asset__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Asset__Group_2__0_in_rule__Asset__Group__2__Impl3533);
            	    rule__Asset__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getAssetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group__2__Impl


    // $ANTLR start rule__Asset__Group_2__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1737:1: rule__Asset__Group_2__0 : rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1 ;
    public final void rule__Asset__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1741:1: ( rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1742:2: rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__0__Impl_in_rule__Asset__Group_2__03570);
            rule__Asset__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__1_in_rule__Asset__Group_2__03573);
            rule__Asset__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group_2__0


    // $ANTLR start rule__Asset__Group_2__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1749:1: rule__Asset__Group_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Asset__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1753:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1754:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1754:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1755:1: ( ',' )?
            {
             before(grammarAccess.getAssetAccess().getCommaKeyword_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1756:1: ( ',' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1757:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__Asset__Group_2__0__Impl3602); 

                    }
                    break;

            }

             after(grammarAccess.getAssetAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group_2__0__Impl


    // $ANTLR start rule__Asset__Group_2__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1768:1: rule__Asset__Group_2__1 : rule__Asset__Group_2__1__Impl ;
    public final void rule__Asset__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1772:1: ( rule__Asset__Group_2__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1773:2: rule__Asset__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__1__Impl_in_rule__Asset__Group_2__13635);
            rule__Asset__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group_2__1


    // $ANTLR start rule__Asset__Group_2__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1779:1: rule__Asset__Group_2__1__Impl : ( ( rule__Asset__PropertiesAssignment_2_1 ) ) ;
    public final void rule__Asset__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1783:1: ( ( ( rule__Asset__PropertiesAssignment_2_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1784:1: ( ( rule__Asset__PropertiesAssignment_2_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1784:1: ( ( rule__Asset__PropertiesAssignment_2_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1785:1: ( rule__Asset__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getAssetAccess().getPropertiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1786:1: ( rule__Asset__PropertiesAssignment_2_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1786:2: rule__Asset__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Asset__PropertiesAssignment_2_1_in_rule__Asset__Group_2__1__Impl3662);
            rule__Asset__PropertiesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getAssetAccess().getPropertiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group_2__1__Impl


    // $ANTLR start rule__Resource__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1800:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1804:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1805:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__03696);
            rule__Resource__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__03699);
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


    // $ANTLR start rule__Resource__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1812:1: rule__Resource__Group__0__Impl : ( ( rule__Resource__NameAssignment_0 ) ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1816:1: ( ( ( rule__Resource__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1817:1: ( ( rule__Resource__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1817:1: ( ( rule__Resource__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1818:1: ( rule__Resource__NameAssignment_0 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1819:1: ( rule__Resource__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1819:2: rule__Resource__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_0_in_rule__Resource__Group__0__Impl3726);
            rule__Resource__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group__0__Impl


    // $ANTLR start rule__Resource__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1829:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1833:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1834:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__13756);
            rule__Resource__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__13759);
            rule__Resource__Group__2();
            _fsp--;


            }

        }
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


    // $ANTLR start rule__Resource__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1841:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__TypeAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1845:1: ( ( ( rule__Resource__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1846:1: ( ( rule__Resource__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1846:1: ( ( rule__Resource__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1847:1: ( rule__Resource__TypeAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1848:1: ( rule__Resource__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1848:2: rule__Resource__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__TypeAssignment_1_in_rule__Resource__Group__1__Impl3786);
            rule__Resource__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group__1__Impl


    // $ANTLR start rule__Resource__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1858:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1862:1: ( rule__Resource__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1863:2: rule__Resource__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__23816);
            rule__Resource__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group__2


    // $ANTLR start rule__Resource__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1869:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__Group_2__0 )* ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1873:1: ( ( ( rule__Resource__Group_2__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1874:1: ( ( rule__Resource__Group_2__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1874:1: ( ( rule__Resource__Group_2__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1875:1: ( rule__Resource__Group_2__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1876:1: ( rule__Resource__Group_2__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING||LA19_0==23) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1876:2: rule__Resource__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Resource__Group_2__0_in_rule__Resource__Group__2__Impl3843);
            	    rule__Resource__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group__2__Impl


    // $ANTLR start rule__Resource__Group_2__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1892:1: rule__Resource__Group_2__0 : rule__Resource__Group_2__0__Impl rule__Resource__Group_2__1 ;
    public final void rule__Resource__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1896:1: ( rule__Resource__Group_2__0__Impl rule__Resource__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1897:2: rule__Resource__Group_2__0__Impl rule__Resource__Group_2__1
            {
            pushFollow(FOLLOW_rule__Resource__Group_2__0__Impl_in_rule__Resource__Group_2__03880);
            rule__Resource__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group_2__1_in_rule__Resource__Group_2__03883);
            rule__Resource__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_2__0


    // $ANTLR start rule__Resource__Group_2__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1904:1: rule__Resource__Group_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Resource__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1908:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1909:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1909:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1910:1: ( ',' )?
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1911:1: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==23) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1912:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__Resource__Group_2__0__Impl3912); 

                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_2__0__Impl


    // $ANTLR start rule__Resource__Group_2__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1923:1: rule__Resource__Group_2__1 : rule__Resource__Group_2__1__Impl ;
    public final void rule__Resource__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1927:1: ( rule__Resource__Group_2__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1928:2: rule__Resource__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group_2__1__Impl_in_rule__Resource__Group_2__13945);
            rule__Resource__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_2__1


    // $ANTLR start rule__Resource__Group_2__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1934:1: rule__Resource__Group_2__1__Impl : ( ( rule__Resource__PropertiesAssignment_2_1 ) ) ;
    public final void rule__Resource__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1938:1: ( ( ( rule__Resource__PropertiesAssignment_2_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1939:1: ( ( rule__Resource__PropertiesAssignment_2_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1939:1: ( ( rule__Resource__PropertiesAssignment_2_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1940:1: ( rule__Resource__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1941:1: ( rule__Resource__PropertiesAssignment_2_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1941:2: rule__Resource__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Resource__PropertiesAssignment_2_1_in_rule__Resource__Group_2__1__Impl3972);
            rule__Resource__PropertiesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getPropertiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_2__1__Impl


    // $ANTLR start rule__Attacker__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1955:1: rule__Attacker__Group__0 : rule__Attacker__Group__0__Impl rule__Attacker__Group__1 ;
    public final void rule__Attacker__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1959:1: ( rule__Attacker__Group__0__Impl rule__Attacker__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1960:2: rule__Attacker__Group__0__Impl rule__Attacker__Group__1
            {
            pushFollow(FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__04006);
            rule__Attacker__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__04009);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1967:1: rule__Attacker__Group__0__Impl : ( ( rule__Attacker__NameAssignment_0 ) ) ;
    public final void rule__Attacker__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1971:1: ( ( ( rule__Attacker__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1972:1: ( ( rule__Attacker__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1972:1: ( ( rule__Attacker__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1973:1: ( rule__Attacker__NameAssignment_0 )
            {
             before(grammarAccess.getAttackerAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1974:1: ( rule__Attacker__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1974:2: rule__Attacker__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Attacker__NameAssignment_0_in_rule__Attacker__Group__0__Impl4036);
            rule__Attacker__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getAttackerAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1984:1: rule__Attacker__Group__1 : rule__Attacker__Group__1__Impl rule__Attacker__Group__2 ;
    public final void rule__Attacker__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1988:1: ( rule__Attacker__Group__1__Impl rule__Attacker__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1989:2: rule__Attacker__Group__1__Impl rule__Attacker__Group__2
            {
            pushFollow(FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__14066);
            rule__Attacker__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group__2_in_rule__Attacker__Group__14069);
            rule__Attacker__Group__2();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1996:1: rule__Attacker__Group__1__Impl : ( ( rule__Attacker__TypeAssignment_1 ) ) ;
    public final void rule__Attacker__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2000:1: ( ( ( rule__Attacker__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2001:1: ( ( rule__Attacker__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2001:1: ( ( rule__Attacker__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2002:1: ( rule__Attacker__TypeAssignment_1 )
            {
             before(grammarAccess.getAttackerAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2003:1: ( rule__Attacker__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2003:2: rule__Attacker__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Attacker__TypeAssignment_1_in_rule__Attacker__Group__1__Impl4096);
            rule__Attacker__TypeAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getAttackerAccess().getTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Attacker__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2013:1: rule__Attacker__Group__2 : rule__Attacker__Group__2__Impl ;
    public final void rule__Attacker__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2017:1: ( rule__Attacker__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2018:2: rule__Attacker__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attacker__Group__2__Impl_in_rule__Attacker__Group__24126);
            rule__Attacker__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__Group__2


    // $ANTLR start rule__Attacker__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2024:1: rule__Attacker__Group__2__Impl : ( ( rule__Attacker__Group_2__0 )* ) ;
    public final void rule__Attacker__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2028:1: ( ( ( rule__Attacker__Group_2__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2029:1: ( ( rule__Attacker__Group_2__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2029:1: ( ( rule__Attacker__Group_2__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2030:1: ( rule__Attacker__Group_2__0 )*
            {
             before(grammarAccess.getAttackerAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2031:1: ( rule__Attacker__Group_2__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_STRING||LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2031:2: rule__Attacker__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Attacker__Group_2__0_in_rule__Attacker__Group__2__Impl4153);
            	    rule__Attacker__Group_2__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAttackerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__Group__2__Impl


    // $ANTLR start rule__Attacker__Group_2__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2047:1: rule__Attacker__Group_2__0 : rule__Attacker__Group_2__0__Impl rule__Attacker__Group_2__1 ;
    public final void rule__Attacker__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2051:1: ( rule__Attacker__Group_2__0__Impl rule__Attacker__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2052:2: rule__Attacker__Group_2__0__Impl rule__Attacker__Group_2__1
            {
            pushFollow(FOLLOW_rule__Attacker__Group_2__0__Impl_in_rule__Attacker__Group_2__04190);
            rule__Attacker__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Attacker__Group_2__1_in_rule__Attacker__Group_2__04193);
            rule__Attacker__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__Group_2__0


    // $ANTLR start rule__Attacker__Group_2__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2059:1: rule__Attacker__Group_2__0__Impl : ( ( ',' )? ) ;
    public final void rule__Attacker__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2063:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2064:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2064:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2065:1: ( ',' )?
            {
             before(grammarAccess.getAttackerAccess().getCommaKeyword_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2066:1: ( ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2067:2: ','
                    {
                    match(input,23,FOLLOW_23_in_rule__Attacker__Group_2__0__Impl4222); 

                    }
                    break;

            }

             after(grammarAccess.getAttackerAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__Group_2__0__Impl


    // $ANTLR start rule__Attacker__Group_2__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2078:1: rule__Attacker__Group_2__1 : rule__Attacker__Group_2__1__Impl ;
    public final void rule__Attacker__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2082:1: ( rule__Attacker__Group_2__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2083:2: rule__Attacker__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Attacker__Group_2__1__Impl_in_rule__Attacker__Group_2__14255);
            rule__Attacker__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__Group_2__1


    // $ANTLR start rule__Attacker__Group_2__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2089:1: rule__Attacker__Group_2__1__Impl : ( ( rule__Attacker__PropertiesAssignment_2_1 ) ) ;
    public final void rule__Attacker__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2093:1: ( ( ( rule__Attacker__PropertiesAssignment_2_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2094:1: ( ( rule__Attacker__PropertiesAssignment_2_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2094:1: ( ( rule__Attacker__PropertiesAssignment_2_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2095:1: ( rule__Attacker__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getAttackerAccess().getPropertiesAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2096:1: ( rule__Attacker__PropertiesAssignment_2_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2096:2: rule__Attacker__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Attacker__PropertiesAssignment_2_1_in_rule__Attacker__Group_2__1__Impl4282);
            rule__Attacker__PropertiesAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getAttackerAccess().getPropertiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__Group_2__1__Impl


    // $ANTLR start rule__Relationship__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2110:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2114:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2115:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04316);
            rule__Relationship__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04319);
            rule__Relationship__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__0


    // $ANTLR start rule__Relationship__Group__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2122:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__TypeAssignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2126:1: ( ( ( rule__Relationship__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2127:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2127:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2128:1: ( rule__Relationship__TypeAssignment_0 )
            {
             before(grammarAccess.getRelationshipAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2129:1: ( rule__Relationship__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2129:2: rule__Relationship__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl4346);
            rule__Relationship__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__0__Impl


    // $ANTLR start rule__Relationship__Group__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2139:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2143:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2144:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__14376);
            rule__Relationship__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__14379);
            rule__Relationship__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__1


    // $ANTLR start rule__Relationship__Group__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2151:1: rule__Relationship__Group__1__Impl : ( '(' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2155:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2156:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2156:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2157:1: '('
            {
             before(grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__Relationship__Group__1__Impl4407); 
             after(grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__1__Impl


    // $ANTLR start rule__Relationship__Group__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2170:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2174:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2175:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__24438);
            rule__Relationship__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__24441);
            rule__Relationship__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__2


    // $ANTLR start rule__Relationship__Group__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2182:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__SourceAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2186:1: ( ( ( rule__Relationship__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2187:1: ( ( rule__Relationship__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2187:1: ( ( rule__Relationship__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2188:1: ( rule__Relationship__SourceAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2189:1: ( rule__Relationship__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2189:2: rule__Relationship__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Relationship__SourceAssignment_2_in_rule__Relationship__Group__2__Impl4468);
            rule__Relationship__SourceAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getSourceAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__2__Impl


    // $ANTLR start rule__Relationship__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2199:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2203:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2204:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__34498);
            rule__Relationship__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__34501);
            rule__Relationship__Group__4();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__3


    // $ANTLR start rule__Relationship__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2211:1: rule__Relationship__Group__3__Impl : ( ',' ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2215:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2216:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2216:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2217:1: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_3()); 
            match(input,23,FOLLOW_23_in_rule__Relationship__Group__3__Impl4529); 
             after(grammarAccess.getRelationshipAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__3__Impl


    // $ANTLR start rule__Relationship__Group__4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2230:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2234:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2235:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__44560);
            rule__Relationship__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__44563);
            rule__Relationship__Group__5();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__4


    // $ANTLR start rule__Relationship__Group__4__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2242:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__TargetAssignment_4 ) ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2246:1: ( ( ( rule__Relationship__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2247:1: ( ( rule__Relationship__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2247:1: ( ( rule__Relationship__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2248:1: ( rule__Relationship__TargetAssignment_4 )
            {
             before(grammarAccess.getRelationshipAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2249:1: ( rule__Relationship__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2249:2: rule__Relationship__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Relationship__TargetAssignment_4_in_rule__Relationship__Group__4__Impl4590);
            rule__Relationship__TargetAssignment_4();
            _fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getTargetAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__4__Impl


    // $ANTLR start rule__Relationship__Group__5
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2259:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2263:1: ( rule__Relationship__Group__5__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2264:2: rule__Relationship__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__54620);
            rule__Relationship__Group__5__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__5


    // $ANTLR start rule__Relationship__Group__5__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2270:1: rule__Relationship__Group__5__Impl : ( ')' ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2274:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2275:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2275:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2276:1: ')'
            {
             before(grammarAccess.getRelationshipAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_25_in_rule__Relationship__Group__5__Impl4648); 
             after(grammarAccess.getRelationshipAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__5__Impl


    // $ANTLR start rule__Situation__TimeAssignment_0_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2302:1: rule__Situation__TimeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Situation__TimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2306:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2307:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2307:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2308:1: RULE_ID
            {
             before(grammarAccess.getSituationAccess().getTimeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_14696); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2317:1: rule__Situation__WorldAssignment_1 : ( ruleWorld ) ;
    public final void rule__Situation__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2321:1: ( ( ruleWorld ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2322:1: ( ruleWorld )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2322:1: ( ruleWorld )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2323:1: ruleWorld
            {
             before(grammarAccess.getSituationAccess().getWorldWorldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_14727);
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


    // $ANTLR start rule__World__GoalsAssignment_1_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2332:1: rule__World__GoalsAssignment_1_0 : ( ruleGoal ) ;
    public final void rule__World__GoalsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2336:1: ( ( ruleGoal ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2337:1: ( ruleGoal )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2337:1: ( ruleGoal )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2338:1: ruleGoal
            {
             before(grammarAccess.getWorldAccess().getGoalsGoalParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleGoal_in_rule__World__GoalsAssignment_1_04758);
            ruleGoal();
            _fsp--;

             after(grammarAccess.getWorldAccess().getGoalsGoalParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__GoalsAssignment_1_0


    // $ANTLR start rule__World__DomainsAssignment_1_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2347:1: rule__World__DomainsAssignment_1_1 : ( ruleDomain ) ;
    public final void rule__World__DomainsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2351:1: ( ( ruleDomain ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2352:1: ( ruleDomain )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2352:1: ( ruleDomain )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2353:1: ruleDomain
            {
             before(grammarAccess.getWorldAccess().getDomainsDomainParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDomain_in_rule__World__DomainsAssignment_1_14789);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2362:1: rule__World__RelationshipsAssignment_1_2 : ( ruleRelationship ) ;
    public final void rule__World__RelationshipsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2366:1: ( ( ruleRelationship ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2367:1: ( ruleRelationship )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2367:1: ( ruleRelationship )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2368:1: ruleRelationship
            {
             before(grammarAccess.getWorldAccess().getRelationshipsRelationshipParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__World__RelationshipsAssignment_1_24820);
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


    // $ANTLR start rule__SecurityGoal__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2377:1: rule__SecurityGoal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SecurityGoal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2381:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2382:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2382:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2383:1: RULE_ID
            {
             before(grammarAccess.getSecurityGoalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SecurityGoal__NameAssignment_04851); 
             after(grammarAccess.getSecurityGoalAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__NameAssignment_0


    // $ANTLR start rule__SecurityGoal__TypeAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2392:1: rule__SecurityGoal__TypeAssignment_1 : ( ( 'SG' ) ) ;
    public final void rule__SecurityGoal__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2396:1: ( ( ( 'SG' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2397:1: ( ( 'SG' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2397:1: ( ( 'SG' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2398:1: ( 'SG' )
            {
             before(grammarAccess.getSecurityGoalAccess().getTypeSGKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2399:1: ( 'SG' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2400:1: 'SG'
            {
             before(grammarAccess.getSecurityGoalAccess().getTypeSGKeyword_1_0()); 
            match(input,26,FOLLOW_26_in_rule__SecurityGoal__TypeAssignment_14887); 
             after(grammarAccess.getSecurityGoalAccess().getTypeSGKeyword_1_0()); 

            }

             after(grammarAccess.getSecurityGoalAccess().getTypeSGKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__TypeAssignment_1


    // $ANTLR start rule__SecurityGoal__PropertiesAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2415:1: rule__SecurityGoal__PropertiesAssignment_2_1 : ( ruleProposition ) ;
    public final void rule__SecurityGoal__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2419:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2420:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2420:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2421:1: ruleProposition
            {
             before(grammarAccess.getSecurityGoalAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__SecurityGoal__PropertiesAssignment_2_14926);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getSecurityGoalAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__PropertiesAssignment_2_1


    // $ANTLR start rule__Requirement__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2430:1: rule__Requirement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Requirement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2434:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2435:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2435:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2436:1: RULE_ID
            {
             before(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_04957); 
             after(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__NameAssignment_0


    // $ANTLR start rule__Requirement__TypeAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2445:1: rule__Requirement__TypeAssignment_1 : ( ( 'R' ) ) ;
    public final void rule__Requirement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2449:1: ( ( ( 'R' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2450:1: ( ( 'R' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2450:1: ( ( 'R' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2451:1: ( 'R' )
            {
             before(grammarAccess.getRequirementAccess().getTypeRKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2452:1: ( 'R' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2453:1: 'R'
            {
             before(grammarAccess.getRequirementAccess().getTypeRKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__Requirement__TypeAssignment_14993); 
             after(grammarAccess.getRequirementAccess().getTypeRKeyword_1_0()); 

            }

             after(grammarAccess.getRequirementAccess().getTypeRKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__TypeAssignment_1


    // $ANTLR start rule__Requirement__PropertiesAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2468:1: rule__Requirement__PropertiesAssignment_2_1 : ( ruleProposition ) ;
    public final void rule__Requirement__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2472:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2473:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2473:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2474:1: ruleProposition
            {
             before(grammarAccess.getRequirementAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Requirement__PropertiesAssignment_2_15032);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getRequirementAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__PropertiesAssignment_2_1


    // $ANTLR start rule__AntiRequirement__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2483:1: rule__AntiRequirement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AntiRequirement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2487:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2488:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2488:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2489:1: RULE_ID
            {
             before(grammarAccess.getAntiRequirementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__AntiRequirement__NameAssignment_05063); 
             after(grammarAccess.getAntiRequirementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__NameAssignment_0


    // $ANTLR start rule__AntiRequirement__TypeAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2498:1: rule__AntiRequirement__TypeAssignment_1 : ( ( 'AR' ) ) ;
    public final void rule__AntiRequirement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2502:1: ( ( ( 'AR' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2503:1: ( ( 'AR' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2503:1: ( ( 'AR' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2504:1: ( 'AR' )
            {
             before(grammarAccess.getAntiRequirementAccess().getTypeARKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2505:1: ( 'AR' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2506:1: 'AR'
            {
             before(grammarAccess.getAntiRequirementAccess().getTypeARKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__AntiRequirement__TypeAssignment_15099); 
             after(grammarAccess.getAntiRequirementAccess().getTypeARKeyword_1_0()); 

            }

             after(grammarAccess.getAntiRequirementAccess().getTypeARKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__TypeAssignment_1


    // $ANTLR start rule__AntiRequirement__PropertiesAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2521:1: rule__AntiRequirement__PropertiesAssignment_2_1 : ( ruleProposition ) ;
    public final void rule__AntiRequirement__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2525:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2526:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2526:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2527:1: ruleProposition
            {
             before(grammarAccess.getAntiRequirementAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__AntiRequirement__PropertiesAssignment_2_15138);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getAntiRequirementAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__AntiRequirement__PropertiesAssignment_2_1


    // $ANTLR start rule__Actor__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2536:1: rule__Actor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2540:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2541:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2541:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2542:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_05169); 
             after(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__NameAssignment_0


    // $ANTLR start rule__Actor__TypeAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2551:1: rule__Actor__TypeAssignment_1 : ( ( 'Ar' ) ) ;
    public final void rule__Actor__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2555:1: ( ( ( 'Ar' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2556:1: ( ( 'Ar' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2556:1: ( ( 'Ar' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2557:1: ( 'Ar' )
            {
             before(grammarAccess.getActorAccess().getTypeArKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2558:1: ( 'Ar' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2559:1: 'Ar'
            {
             before(grammarAccess.getActorAccess().getTypeArKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Actor__TypeAssignment_15205); 
             after(grammarAccess.getActorAccess().getTypeArKeyword_1_0()); 

            }

             after(grammarAccess.getActorAccess().getTypeArKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__TypeAssignment_1


    // $ANTLR start rule__Actor__PropertiesAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2574:1: rule__Actor__PropertiesAssignment_2_1 : ( ruleProposition ) ;
    public final void rule__Actor__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2578:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2579:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2579:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2580:1: ruleProposition
            {
             before(grammarAccess.getActorAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Actor__PropertiesAssignment_2_15244);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getActorAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__PropertiesAssignment_2_1


    // $ANTLR start rule__Action__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2589:1: rule__Action__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2593:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2594:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2594:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2595:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_05275); 
             after(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__NameAssignment_0


    // $ANTLR start rule__Action__TypeAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2604:1: rule__Action__TypeAssignment_1 : ( ( 'An' ) ) ;
    public final void rule__Action__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2608:1: ( ( ( 'An' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2609:1: ( ( 'An' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2609:1: ( ( 'An' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2610:1: ( 'An' )
            {
             before(grammarAccess.getActionAccess().getTypeAnKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2611:1: ( 'An' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2612:1: 'An'
            {
             before(grammarAccess.getActionAccess().getTypeAnKeyword_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Action__TypeAssignment_15311); 
             after(grammarAccess.getActionAccess().getTypeAnKeyword_1_0()); 

            }

             after(grammarAccess.getActionAccess().getTypeAnKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__TypeAssignment_1


    // $ANTLR start rule__Action__PropertiesAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2627:1: rule__Action__PropertiesAssignment_2_1 : ( ruleProposition ) ;
    public final void rule__Action__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2631:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2632:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2632:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2633:1: ruleProposition
            {
             before(grammarAccess.getActionAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Action__PropertiesAssignment_2_15350);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getActionAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__PropertiesAssignment_2_1


    // $ANTLR start rule__Asset__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2642:1: rule__Asset__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2646:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2647:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2647:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2648:1: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_05381); 
             after(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__NameAssignment_0


    // $ANTLR start rule__Asset__TypeAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2657:1: rule__Asset__TypeAssignment_1 : ( ( 'As' ) ) ;
    public final void rule__Asset__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2661:1: ( ( ( 'As' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2662:1: ( ( 'As' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2662:1: ( ( 'As' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2663:1: ( 'As' )
            {
             before(grammarAccess.getAssetAccess().getTypeAsKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2664:1: ( 'As' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2665:1: 'As'
            {
             before(grammarAccess.getAssetAccess().getTypeAsKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__Asset__TypeAssignment_15417); 
             after(grammarAccess.getAssetAccess().getTypeAsKeyword_1_0()); 

            }

             after(grammarAccess.getAssetAccess().getTypeAsKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__TypeAssignment_1


    // $ANTLR start rule__Asset__PropertiesAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2680:1: rule__Asset__PropertiesAssignment_2_1 : ( ruleProposition ) ;
    public final void rule__Asset__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2684:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2685:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2685:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2686:1: ruleProposition
            {
             before(grammarAccess.getAssetAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Asset__PropertiesAssignment_2_15456);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getAssetAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__PropertiesAssignment_2_1


    // $ANTLR start rule__Resource__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2695:1: rule__Resource__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2699:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2700:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2700:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2701:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_05487); 
             after(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__NameAssignment_0


    // $ANTLR start rule__Resource__TypeAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2710:1: rule__Resource__TypeAssignment_1 : ( ( 'Re' ) ) ;
    public final void rule__Resource__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2714:1: ( ( ( 'Re' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2715:1: ( ( 'Re' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2715:1: ( ( 'Re' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2716:1: ( 'Re' )
            {
             before(grammarAccess.getResourceAccess().getTypeReKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2717:1: ( 'Re' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2718:1: 'Re'
            {
             before(grammarAccess.getResourceAccess().getTypeReKeyword_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Resource__TypeAssignment_15523); 
             after(grammarAccess.getResourceAccess().getTypeReKeyword_1_0()); 

            }

             after(grammarAccess.getResourceAccess().getTypeReKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__TypeAssignment_1


    // $ANTLR start rule__Resource__PropertiesAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2733:1: rule__Resource__PropertiesAssignment_2_1 : ( ruleProposition ) ;
    public final void rule__Resource__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2737:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2738:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2738:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2739:1: ruleProposition
            {
             before(grammarAccess.getResourceAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Resource__PropertiesAssignment_2_15562);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getResourceAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__PropertiesAssignment_2_1


    // $ANTLR start rule__Attacker__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2748:1: rule__Attacker__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Attacker__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2752:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2753:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2753:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2754:1: RULE_ID
            {
             before(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_05593); 
             after(grammarAccess.getAttackerAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__NameAssignment_0


    // $ANTLR start rule__Attacker__TypeAssignment_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2763:1: rule__Attacker__TypeAssignment_1 : ( ( 'Ak' ) ) ;
    public final void rule__Attacker__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2767:1: ( ( ( 'Ak' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2768:1: ( ( 'Ak' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2768:1: ( ( 'Ak' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2769:1: ( 'Ak' )
            {
             before(grammarAccess.getAttackerAccess().getTypeAkKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2770:1: ( 'Ak' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2771:1: 'Ak'
            {
             before(grammarAccess.getAttackerAccess().getTypeAkKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__Attacker__TypeAssignment_15629); 
             after(grammarAccess.getAttackerAccess().getTypeAkKeyword_1_0()); 

            }

             after(grammarAccess.getAttackerAccess().getTypeAkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__TypeAssignment_1


    // $ANTLR start rule__Attacker__PropertiesAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2786:1: rule__Attacker__PropertiesAssignment_2_1 : ( ruleProposition ) ;
    public final void rule__Attacker__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2790:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2791:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2791:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2792:1: ruleProposition
            {
             before(grammarAccess.getAttackerAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Attacker__PropertiesAssignment_2_15668);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getAttackerAccess().getPropertiesPropositionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Attacker__PropertiesAssignment_2_1


    // $ANTLR start rule__Proposition__NameAssignment
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2801:1: rule__Proposition__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Proposition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2805:1: ( ( RULE_STRING ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2806:1: ( RULE_STRING )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2806:1: ( RULE_STRING )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2807:1: RULE_STRING
            {
             before(grammarAccess.getPropositionAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Proposition__NameAssignment5699); 
             after(grammarAccess.getPropositionAccess().getNameSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Proposition__NameAssignment


    // $ANTLR start rule__Relationship__TypeAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2816:1: rule__Relationship__TypeAssignment_0 : ( ruleRelType ) ;
    public final void rule__Relationship__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2820:1: ( ( ruleRelType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2821:1: ( ruleRelType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2821:1: ( ruleRelType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2822:1: ruleRelType
            {
             before(grammarAccess.getRelationshipAccess().getTypeRelTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelType_in_rule__Relationship__TypeAssignment_05730);
            ruleRelType();
            _fsp--;

             after(grammarAccess.getRelationshipAccess().getTypeRelTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__TypeAssignment_0


    // $ANTLR start rule__Relationship__SourceAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2831:1: rule__Relationship__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2835:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2836:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2836:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2837:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getSourceWorldCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2838:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2839:1: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getSourceWorldIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship__SourceAssignment_25765); 
             after(grammarAccess.getRelationshipAccess().getSourceWorldIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getSourceWorldCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__SourceAssignment_2


    // $ANTLR start rule__Relationship__TargetAssignment_4
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2850:1: rule__Relationship__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2854:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2855:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2855:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2856:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getTargetWorldCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2857:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2858:1: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getTargetWorldIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship__TargetAssignment_45804); 
             after(grammarAccess.getRelationshipAccess().getTargetWorldIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getTargetWorldCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__TargetAssignment_4


 

    public static final BitSet FOLLOW_ruleSituation_in_entryRuleSituation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__0_in_ruleSituation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_entryRuleWorld121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorld128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__0_in_ruleWorld154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Alternatives_in_ruleGoal214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityGoal_in_entryRuleSecurityGoal241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityGoal248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__0_in_ruleSecurityGoal274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__0_in_ruleRequirement334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_entryRuleAntiRequirement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAntiRequirement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__0_in_ruleAntiRequirement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Alternatives_in_ruleDomain454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__0_in_ruleActor514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0_in_ruleAsset634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_entryRuleAttacker721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttacker728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0_in_ruleAttacker754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__NameAssignment_in_ruleProposition814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelType__Alternatives_in_ruleRelType911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__GoalsAssignment_1_0_in_rule__World__Alternatives_1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__DomainsAssignment_1_1_in_rule__World__Alternatives_1964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__RelationshipsAssignment_1_2_in_rule__World__Alternatives_1982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityGoal_in_rule__Goal__Alternatives1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_rule__Goal__Alternatives1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAntiRequirement_in_rule__Goal__Alternatives1049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__Domain__Alternatives1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Domain__Alternatives1098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Domain__Alternatives1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Domain__Alternatives1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttacker_in_rule__Domain__Alternatives1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RelType__Alternatives1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelType__Alternatives1203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelType__Alternatives1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelType__Alternatives1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RelType__Alternatives1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RelType__Alternatives1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelType__Alternatives1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RelType__Alternatives1329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RelType__Alternatives1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RelType__Alternatives1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__01404 = new BitSet(new long[]{0x00000000001FF812L});
    public static final BitSet FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__01407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl1434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__11465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl1492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__01526 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__01529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Situation__Group_0__0__Impl1557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__11588 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__11591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__21648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Situation__Group_0__2__Impl1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__01713 = new BitSet(new long[]{0x00000000001FF812L});
    public static final BitSet FOLLOW_rule__World__Group__1_in_rule__World__Group__01716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__11774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Alternatives_1_in_rule__World__Group__1__Impl1801 = new BitSet(new long[]{0x00000000001FF812L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__0__Impl_in_rule__SecurityGoal__Group__01836 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__1_in_rule__SecurityGoal__Group__01839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__NameAssignment_0_in_rule__SecurityGoal__Group__0__Impl1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__1__Impl_in_rule__SecurityGoal__Group__11896 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__2_in_rule__SecurityGoal__Group__11899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__TypeAssignment_1_in_rule__SecurityGoal__Group__1__Impl1926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__2__Impl_in_rule__SecurityGoal__Group__21956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_2__0_in_rule__SecurityGoal__Group__2__Impl1983 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_2__0__Impl_in_rule__SecurityGoal__Group_2__02020 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_2__1_in_rule__SecurityGoal__Group_2__02023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__SecurityGoal__Group_2__0__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_2__1__Impl_in_rule__SecurityGoal__Group_2__12085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__PropertiesAssignment_2_1_in_rule__SecurityGoal__Group_2__1__Impl2112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__02146 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__02149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__NameAssignment_0_in_rule__Requirement__Group__0__Impl2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__12206 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__TypeAssignment_1_in_rule__Requirement__Group__1__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__22266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_2__0_in_rule__Requirement__Group__2__Impl2293 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Requirement__Group_2__0__Impl_in_rule__Requirement__Group_2__02330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Requirement__Group_2__1_in_rule__Requirement__Group_2__02333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Requirement__Group_2__0__Impl2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_2__1__Impl_in_rule__Requirement__Group_2__12395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__PropertiesAssignment_2_1_in_rule__Requirement__Group_2__1__Impl2422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__0__Impl_in_rule__AntiRequirement__Group__02456 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__1_in_rule__AntiRequirement__Group__02459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__NameAssignment_0_in_rule__AntiRequirement__Group__0__Impl2486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__1__Impl_in_rule__AntiRequirement__Group__12516 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__2_in_rule__AntiRequirement__Group__12519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__TypeAssignment_1_in_rule__AntiRequirement__Group__1__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group__2__Impl_in_rule__AntiRequirement__Group__22576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group_2__0_in_rule__AntiRequirement__Group__2__Impl2603 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group_2__0__Impl_in_rule__AntiRequirement__Group_2__02640 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group_2__1_in_rule__AntiRequirement__Group_2__02643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AntiRequirement__Group_2__0__Impl2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__Group_2__1__Impl_in_rule__AntiRequirement__Group_2__12705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AntiRequirement__PropertiesAssignment_2_1_in_rule__AntiRequirement__Group_2__1__Impl2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__02766 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__02769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__12826 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__12829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__TypeAssignment_1_in_rule__Actor__Group__1__Impl2856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__22886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_2__0_in_rule__Actor__Group__2__Impl2913 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Actor__Group_2__0__Impl_in_rule__Actor__Group_2__02950 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Actor__Group_2__1_in_rule__Actor__Group_2__02953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Actor__Group_2__0__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_2__1__Impl_in_rule__Actor__Group_2__13015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__PropertiesAssignment_2_1_in_rule__Actor__Group_2__1__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03076 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__0__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__13136 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__13139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__1__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__23196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__0_in_rule__Action__Group__2__Impl3223 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Action__Group_2__0__Impl_in_rule__Action__Group_2__03260 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group_2__1_in_rule__Action__Group_2__03263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Action__Group_2__0__Impl3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_2__1__Impl_in_rule__Action__Group_2__13325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__PropertiesAssignment_2_1_in_rule__Action__Group_2__1__Impl3352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__03386 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__03389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__NameAssignment_0_in_rule__Asset__Group__0__Impl3416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__13446 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__13449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__TypeAssignment_1_in_rule__Asset__Group__1__Impl3476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__23506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__0_in_rule__Asset__Group__2__Impl3533 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__0__Impl_in_rule__Asset__Group_2__03570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__1_in_rule__Asset__Group_2__03573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Asset__Group_2__0__Impl3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__1__Impl_in_rule__Asset__Group_2__13635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__PropertiesAssignment_2_1_in_rule__Asset__Group_2__1__Impl3662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__03696 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__03699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_0_in_rule__Resource__Group__0__Impl3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__13756 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__13759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__TypeAssignment_1_in_rule__Resource__Group__1__Impl3786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__23816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_2__0_in_rule__Resource__Group__2__Impl3843 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Resource__Group_2__0__Impl_in_rule__Resource__Group_2__03880 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Resource__Group_2__1_in_rule__Resource__Group_2__03883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Resource__Group_2__0__Impl3912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_2__1__Impl_in_rule__Resource__Group_2__13945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__PropertiesAssignment_2_1_in_rule__Resource__Group_2__1__Impl3972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__0__Impl_in_rule__Attacker__Group__04006 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1_in_rule__Attacker__Group__04009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__NameAssignment_0_in_rule__Attacker__Group__0__Impl4036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__1__Impl_in_rule__Attacker__Group__14066 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Attacker__Group__2_in_rule__Attacker__Group__14069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__TypeAssignment_1_in_rule__Attacker__Group__1__Impl4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group__2__Impl_in_rule__Attacker__Group__24126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group_2__0_in_rule__Attacker__Group__2__Impl4153 = new BitSet(new long[]{0x0000000000800022L});
    public static final BitSet FOLLOW_rule__Attacker__Group_2__0__Impl_in_rule__Attacker__Group_2__04190 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attacker__Group_2__1_in_rule__Attacker__Group_2__04193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Attacker__Group_2__0__Impl4222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__Group_2__1__Impl_in_rule__Attacker__Group_2__14255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attacker__PropertiesAssignment_2_1_in_rule__Attacker__Group_2__1__Impl4282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04316 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl4346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__14376 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__14379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Relationship__Group__1__Impl4407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__24438 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__24441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__SourceAssignment_2_in_rule__Relationship__Group__2__Impl4468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__34498 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__34501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Relationship__Group__3__Impl4529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__44560 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__44563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TargetAssignment_4_in_rule__Relationship__Group__4__Impl4590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__54620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Relationship__Group__5__Impl4648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_14696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_14727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_rule__World__GoalsAssignment_1_04758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__World__DomainsAssignment_1_14789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__World__RelationshipsAssignment_1_24820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SecurityGoal__NameAssignment_04851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SecurityGoal__TypeAssignment_14887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__SecurityGoal__PropertiesAssignment_2_14926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_04957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Requirement__TypeAssignment_14993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Requirement__PropertiesAssignment_2_15032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__AntiRequirement__NameAssignment_05063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__AntiRequirement__TypeAssignment_15099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__AntiRequirement__PropertiesAssignment_2_15138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_05169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Actor__TypeAssignment_15205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Actor__PropertiesAssignment_2_15244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_05275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Action__TypeAssignment_15311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Action__PropertiesAssignment_2_15350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_05381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Asset__TypeAssignment_15417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Asset__PropertiesAssignment_2_15456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_05487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Resource__TypeAssignment_15523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Resource__PropertiesAssignment_2_15562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Attacker__NameAssignment_05593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Attacker__TypeAssignment_15629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Attacker__PropertiesAssignment_2_15668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Proposition__NameAssignment5699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelType_in_rule__Relationship__TypeAssignment_05730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__SourceAssignment_25765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__TargetAssignment_45804 = new BitSet(new long[]{0x0000000000000002L});

}