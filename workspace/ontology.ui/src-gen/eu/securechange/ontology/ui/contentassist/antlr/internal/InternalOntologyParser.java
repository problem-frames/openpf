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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'carries out'", "'fulfils'", "'and decomposes'", "'or decomposes'", "'+'", "'-'", "'--'", "'++'", "'wants'", "'depends'", "'delegates'", "'trusts'", "'provides'", "'consumes'", "'interfaces'", "'damages'", "'attacks'", "'protects'", "'argues'", "'model'", "':'", "','", "'$'", "'('", "')'", "'goal'", "'sec'", "'req'", "'dom'", "'actor'", "'action'", "'resource'"
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


    // $ANTLR start entryRuleEntity
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:117:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:118:1: ( ruleEntity EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:119:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_ruleEntity_in_entryRuleEntity181);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getEntityRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleEntity188); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:126:1: ruleEntity : ( ( rule__Entity__Alternatives ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:130:2: ( ( ( rule__Entity__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:131:1: ( ( rule__Entity__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:131:1: ( ( rule__Entity__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:132:1: ( rule__Entity__Alternatives )
            {
             before(grammarAccess.getEntityAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:133:1: ( rule__Entity__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:133:2: rule__Entity__Alternatives
            {
            pushFollow(FOLLOW_rule__Entity__Alternatives_in_ruleEntity214);
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


    // $ANTLR start entryRuleGoal
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:145:1: entryRuleGoal : ruleGoal EOF ;
    public final void entryRuleGoal() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:146:1: ( ruleGoal EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:147:1: ruleGoal EOF
            {
             before(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal241);
            ruleGoal();
            _fsp--;

             after(grammarAccess.getGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal248); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:154:1: ruleGoal : ( ( rule__Goal__Alternatives ) ) ;
    public final void ruleGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:158:2: ( ( ( rule__Goal__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:159:1: ( ( rule__Goal__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:159:1: ( ( rule__Goal__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:160:1: ( rule__Goal__Alternatives )
            {
             before(grammarAccess.getGoalAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:161:1: ( rule__Goal__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:161:2: rule__Goal__Alternatives
            {
            pushFollow(FOLLOW_rule__Goal__Alternatives_in_ruleGoal274);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:173:1: entryRuleSecurityGoal : ruleSecurityGoal EOF ;
    public final void entryRuleSecurityGoal() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:174:1: ( ruleSecurityGoal EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:175:1: ruleSecurityGoal EOF
            {
             before(grammarAccess.getSecurityGoalRule()); 
            pushFollow(FOLLOW_ruleSecurityGoal_in_entryRuleSecurityGoal301);
            ruleSecurityGoal();
            _fsp--;

             after(grammarAccess.getSecurityGoalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSecurityGoal308); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:182:1: ruleSecurityGoal : ( ( rule__SecurityGoal__Group__0 ) ) ;
    public final void ruleSecurityGoal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:186:2: ( ( ( rule__SecurityGoal__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:187:1: ( ( rule__SecurityGoal__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:187:1: ( ( rule__SecurityGoal__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:188:1: ( rule__SecurityGoal__Group__0 )
            {
             before(grammarAccess.getSecurityGoalAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:189:1: ( rule__SecurityGoal__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:189:2: rule__SecurityGoal__Group__0
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__0_in_ruleSecurityGoal334);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:201:1: entryRuleRequirement : ruleRequirement EOF ;
    public final void entryRuleRequirement() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:202:1: ( ruleRequirement EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:203:1: ruleRequirement EOF
            {
             before(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement361);
            ruleRequirement();
            _fsp--;

             after(grammarAccess.getRequirementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement368); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:210:1: ruleRequirement : ( ( rule__Requirement__Group__0 ) ) ;
    public final void ruleRequirement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:214:2: ( ( ( rule__Requirement__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:215:1: ( ( rule__Requirement__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:215:1: ( ( rule__Requirement__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:216:1: ( rule__Requirement__Group__0 )
            {
             before(grammarAccess.getRequirementAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:217:1: ( rule__Requirement__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:217:2: rule__Requirement__Group__0
            {
            pushFollow(FOLLOW_rule__Requirement__Group__0_in_ruleRequirement394);
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


    // $ANTLR start entryRuleAsset
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:257:1: entryRuleAsset : ruleAsset EOF ;
    public final void entryRuleAsset() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:258:1: ( ruleAsset EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:259:1: ruleAsset EOF
            {
             before(grammarAccess.getAssetRule()); 
            pushFollow(FOLLOW_ruleAsset_in_entryRuleAsset481);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getAssetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAsset488); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:266:1: ruleAsset : ( ( rule__Asset__Group__0 ) ) ;
    public final void ruleAsset() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:270:2: ( ( ( rule__Asset__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:271:1: ( ( rule__Asset__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:271:1: ( ( rule__Asset__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:272:1: ( rule__Asset__Group__0 )
            {
             before(grammarAccess.getAssetAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:273:1: ( rule__Asset__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:273:2: rule__Asset__Group__0
            {
            pushFollow(FOLLOW_rule__Asset__Group__0_in_ruleAsset514);
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


    // $ANTLR start entryRuleActor
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:285:1: entryRuleActor : ruleActor EOF ;
    public final void entryRuleActor() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:286:1: ( ruleActor EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:287:1: ruleActor EOF
            {
             before(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_ruleActor_in_entryRuleActor541);
            ruleActor();
            _fsp--;

             after(grammarAccess.getActorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleActor548); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:294:1: ruleActor : ( ( rule__Actor__Group__0 ) ) ;
    public final void ruleActor() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:298:2: ( ( ( rule__Actor__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:299:1: ( ( rule__Actor__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:299:1: ( ( rule__Actor__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:300:1: ( rule__Actor__Group__0 )
            {
             before(grammarAccess.getActorAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:301:1: ( rule__Actor__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:301:2: rule__Actor__Group__0
            {
            pushFollow(FOLLOW_rule__Actor__Group__0_in_ruleActor574);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:313:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:314:1: ( ruleAction EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:315:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_ruleAction_in_entryRuleAction601);
            ruleAction();
            _fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAction608); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:322:1: ruleAction : ( ( rule__Action__Group__0 ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:326:2: ( ( ( rule__Action__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:327:1: ( ( rule__Action__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:327:1: ( ( rule__Action__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:328:1: ( rule__Action__Group__0 )
            {
             before(grammarAccess.getActionAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:329:1: ( rule__Action__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:329:2: rule__Action__Group__0
            {
            pushFollow(FOLLOW_rule__Action__Group__0_in_ruleAction634);
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


    // $ANTLR start entryRuleProposition
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:369:1: entryRuleProposition : ruleProposition EOF ;
    public final void entryRuleProposition() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:370:1: ( ruleProposition EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:371:1: ruleProposition EOF
            {
             before(grammarAccess.getPropositionRule()); 
            pushFollow(FOLLOW_ruleProposition_in_entryRuleProposition721);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getPropositionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProposition728); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:378:1: ruleProposition : ( ( rule__Proposition__NameAssignment ) ) ;
    public final void ruleProposition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:382:2: ( ( ( rule__Proposition__NameAssignment ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:383:1: ( ( rule__Proposition__NameAssignment ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:383:1: ( ( rule__Proposition__NameAssignment ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:384:1: ( rule__Proposition__NameAssignment )
            {
             before(grammarAccess.getPropositionAccess().getNameAssignment()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:385:1: ( rule__Proposition__NameAssignment )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:385:2: rule__Proposition__NameAssignment
            {
            pushFollow(FOLLOW_rule__Proposition__NameAssignment_in_ruleProposition754);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:397:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:398:1: ( ruleRelationship EOF )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:399:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship781);
            ruleRelationship();
            _fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship788); 

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:406:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:410:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:411:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:411:1: ( ( rule__Relationship__Group__0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:412:1: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:413:1: ( rule__Relationship__Group__0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:413:2: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0_in_ruleRelationship814);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:426:1: ruleRelType : ( ( rule__RelType__Alternatives ) ) ;
    public final void ruleRelType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:430:1: ( ( ( rule__RelType__Alternatives ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:431:1: ( ( rule__RelType__Alternatives ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:431:1: ( ( rule__RelType__Alternatives ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:432:1: ( rule__RelType__Alternatives )
            {
             before(grammarAccess.getRelTypeAccess().getAlternatives()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:433:1: ( rule__RelType__Alternatives )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:433:2: rule__RelType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelType__Alternatives_in_ruleRelType851);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:444:1: rule__World__Alternatives_1 : ( ( ( rule__World__EntitiesAssignment_1_0 ) ) | ( ( rule__World__RelationshipsAssignment_1_1 ) ) );
    public final void rule__World__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:448:1: ( ( ( rule__World__EntitiesAssignment_1_0 ) ) | ( ( rule__World__RelationshipsAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=29)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("444:1: rule__World__Alternatives_1 : ( ( ( rule__World__EntitiesAssignment_1_0 ) ) | ( ( rule__World__RelationshipsAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:449:1: ( ( rule__World__EntitiesAssignment_1_0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:449:1: ( ( rule__World__EntitiesAssignment_1_0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:450:1: ( rule__World__EntitiesAssignment_1_0 )
                    {
                     before(grammarAccess.getWorldAccess().getEntitiesAssignment_1_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:451:1: ( rule__World__EntitiesAssignment_1_0 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:451:2: rule__World__EntitiesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__World__EntitiesAssignment_1_0_in_rule__World__Alternatives_1886);
                    rule__World__EntitiesAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getWorldAccess().getEntitiesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:455:6: ( ( rule__World__RelationshipsAssignment_1_1 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:455:6: ( ( rule__World__RelationshipsAssignment_1_1 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:456:1: ( rule__World__RelationshipsAssignment_1_1 )
                    {
                     before(grammarAccess.getWorldAccess().getRelationshipsAssignment_1_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:457:1: ( rule__World__RelationshipsAssignment_1_1 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:457:2: rule__World__RelationshipsAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__World__RelationshipsAssignment_1_1_in_rule__World__Alternatives_1904);
                    rule__World__RelationshipsAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getWorldAccess().getRelationshipsAssignment_1_1()); 

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


    // $ANTLR start rule__Entity__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:466:1: rule__Entity__Alternatives : ( ( ruleGoal ) | ( ruleDomain ) );
    public final void rule__Entity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:470:1: ( ( ruleGoal ) | ( ruleDomain ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=39 && LA2_1<=42)) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=36 && LA2_1<=38)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("466:1: rule__Entity__Alternatives : ( ( ruleGoal ) | ( ruleDomain ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("466:1: rule__Entity__Alternatives : ( ( ruleGoal ) | ( ruleDomain ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:471:1: ( ruleGoal )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:471:1: ( ruleGoal )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:472:1: ruleGoal
                    {
                     before(grammarAccess.getEntityAccess().getGoalParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleGoal_in_rule__Entity__Alternatives937);
                    ruleGoal();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getGoalParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:477:6: ( ruleDomain )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:477:6: ( ruleDomain )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:478:1: ruleDomain
                    {
                     before(grammarAccess.getEntityAccess().getDomainParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleDomain_in_rule__Entity__Alternatives954);
                    ruleDomain();
                    _fsp--;

                     after(grammarAccess.getEntityAccess().getDomainParserRuleCall_1()); 

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


    // $ANTLR start rule__Goal__Alternatives
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:488:1: rule__Goal__Alternatives : ( ( ( rule__Goal__Group_0__0 ) ) | ( ruleSecurityGoal ) | ( ruleRequirement ) );
    public final void rule__Goal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:492:1: ( ( ( rule__Goal__Group_0__0 ) ) | ( ruleSecurityGoal ) | ( ruleRequirement ) )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 37:
                    {
                    alt3=2;
                    }
                    break;
                case 36:
                    {
                    alt3=1;
                    }
                    break;
                case 38:
                    {
                    alt3=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("488:1: rule__Goal__Alternatives : ( ( ( rule__Goal__Group_0__0 ) ) | ( ruleSecurityGoal ) | ( ruleRequirement ) );", 3, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("488:1: rule__Goal__Alternatives : ( ( ( rule__Goal__Group_0__0 ) ) | ( ruleSecurityGoal ) | ( ruleRequirement ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:493:1: ( ( rule__Goal__Group_0__0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:493:1: ( ( rule__Goal__Group_0__0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:494:1: ( rule__Goal__Group_0__0 )
                    {
                     before(grammarAccess.getGoalAccess().getGroup_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:495:1: ( rule__Goal__Group_0__0 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:495:2: rule__Goal__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Goal__Group_0__0_in_rule__Goal__Alternatives986);
                    rule__Goal__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getGoalAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:499:6: ( ruleSecurityGoal )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:499:6: ( ruleSecurityGoal )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:500:1: ruleSecurityGoal
                    {
                     before(grammarAccess.getGoalAccess().getSecurityGoalParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleSecurityGoal_in_rule__Goal__Alternatives1004);
                    ruleSecurityGoal();
                    _fsp--;

                     after(grammarAccess.getGoalAccess().getSecurityGoalParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:505:6: ( ruleRequirement )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:505:6: ( ruleRequirement )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:506:1: ruleRequirement
                    {
                     before(grammarAccess.getGoalAccess().getRequirementParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleRequirement_in_rule__Goal__Alternatives1021);
                    ruleRequirement();
                    _fsp--;

                     after(grammarAccess.getGoalAccess().getRequirementParserRuleCall_2()); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:516:1: rule__Domain__Alternatives : ( ( ( rule__Domain__Group_0__0 ) ) | ( ruleActor ) | ( ruleAction ) | ( ruleResource ) );
    public final void rule__Domain__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:520:1: ( ( ( rule__Domain__Group_0__0 ) ) | ( ruleActor ) | ( ruleAction ) | ( ruleResource ) )
            int alt4=4;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case 41:
                    {
                    alt4=3;
                    }
                    break;
                case 39:
                    {
                    alt4=1;
                    }
                    break;
                case 40:
                    {
                    alt4=2;
                    }
                    break;
                case 42:
                    {
                    alt4=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("516:1: rule__Domain__Alternatives : ( ( ( rule__Domain__Group_0__0 ) ) | ( ruleActor ) | ( ruleAction ) | ( ruleResource ) );", 4, 1, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("516:1: rule__Domain__Alternatives : ( ( ( rule__Domain__Group_0__0 ) ) | ( ruleActor ) | ( ruleAction ) | ( ruleResource ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:521:1: ( ( rule__Domain__Group_0__0 ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:521:1: ( ( rule__Domain__Group_0__0 ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:522:1: ( rule__Domain__Group_0__0 )
                    {
                     before(grammarAccess.getDomainAccess().getGroup_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:523:1: ( rule__Domain__Group_0__0 )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:523:2: rule__Domain__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Domain__Group_0__0_in_rule__Domain__Alternatives1053);
                    rule__Domain__Group_0__0();
                    _fsp--;


                    }

                     after(grammarAccess.getDomainAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:527:6: ( ruleActor )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:527:6: ( ruleActor )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:528:1: ruleActor
                    {
                     before(grammarAccess.getDomainAccess().getActorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleActor_in_rule__Domain__Alternatives1071);
                    ruleActor();
                    _fsp--;

                     after(grammarAccess.getDomainAccess().getActorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:533:6: ( ruleAction )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:533:6: ( ruleAction )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:534:1: ruleAction
                    {
                     before(grammarAccess.getDomainAccess().getActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAction_in_rule__Domain__Alternatives1088);
                    ruleAction();
                    _fsp--;

                     after(grammarAccess.getDomainAccess().getActionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:539:6: ( ruleResource )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:539:6: ( ruleResource )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:540:1: ruleResource
                    {
                     before(grammarAccess.getDomainAccess().getResourceParserRuleCall_3()); 
                    pushFollow(FOLLOW_ruleResource_in_rule__Domain__Alternatives1105);
                    ruleResource();
                    _fsp--;

                     after(grammarAccess.getDomainAccess().getResourceParserRuleCall_3()); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:550:1: rule__RelType__Alternatives : ( ( ( 'carries out' ) ) | ( ( 'fulfils' ) ) | ( ( 'and decomposes' ) ) | ( ( 'or decomposes' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '--' ) ) | ( ( '++' ) ) | ( ( 'wants' ) ) | ( ( 'depends' ) ) | ( ( 'delegates' ) ) | ( ( 'trusts' ) ) | ( ( 'provides' ) ) | ( ( 'consumes' ) ) | ( ( 'interfaces' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'protects' ) ) | ( ( 'argues' ) ) );
    public final void rule__RelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:554:1: ( ( ( 'carries out' ) ) | ( ( 'fulfils' ) ) | ( ( 'and decomposes' ) ) | ( ( 'or decomposes' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '--' ) ) | ( ( '++' ) ) | ( ( 'wants' ) ) | ( ( 'depends' ) ) | ( ( 'delegates' ) ) | ( ( 'trusts' ) ) | ( ( 'provides' ) ) | ( ( 'consumes' ) ) | ( ( 'interfaces' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'protects' ) ) | ( ( 'argues' ) ) )
            int alt5=19;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            case 14:
                {
                alt5=4;
                }
                break;
            case 15:
                {
                alt5=5;
                }
                break;
            case 16:
                {
                alt5=6;
                }
                break;
            case 17:
                {
                alt5=7;
                }
                break;
            case 18:
                {
                alt5=8;
                }
                break;
            case 19:
                {
                alt5=9;
                }
                break;
            case 20:
                {
                alt5=10;
                }
                break;
            case 21:
                {
                alt5=11;
                }
                break;
            case 22:
                {
                alt5=12;
                }
                break;
            case 23:
                {
                alt5=13;
                }
                break;
            case 24:
                {
                alt5=14;
                }
                break;
            case 25:
                {
                alt5=15;
                }
                break;
            case 26:
                {
                alt5=16;
                }
                break;
            case 27:
                {
                alt5=17;
                }
                break;
            case 28:
                {
                alt5=18;
                }
                break;
            case 29:
                {
                alt5=19;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("550:1: rule__RelType__Alternatives : ( ( ( 'carries out' ) ) | ( ( 'fulfils' ) ) | ( ( 'and decomposes' ) ) | ( ( 'or decomposes' ) ) | ( ( '+' ) ) | ( ( '-' ) ) | ( ( '--' ) ) | ( ( '++' ) ) | ( ( 'wants' ) ) | ( ( 'depends' ) ) | ( ( 'delegates' ) ) | ( ( 'trusts' ) ) | ( ( 'provides' ) ) | ( ( 'consumes' ) ) | ( ( 'interfaces' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'protects' ) ) | ( ( 'argues' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:555:1: ( ( 'carries out' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:555:1: ( ( 'carries out' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:556:1: ( 'carries out' )
                    {
                     before(grammarAccess.getRelTypeAccess().getCARRIESOUTEnumLiteralDeclaration_0()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:557:1: ( 'carries out' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:557:3: 'carries out'
                    {
                    match(input,11,FOLLOW_11_in_rule__RelType__Alternatives1138); 

                    }

                     after(grammarAccess.getRelTypeAccess().getCARRIESOUTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:562:6: ( ( 'fulfils' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:562:6: ( ( 'fulfils' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:563:1: ( 'fulfils' )
                    {
                     before(grammarAccess.getRelTypeAccess().getFULFILSEnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:564:1: ( 'fulfils' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:564:3: 'fulfils'
                    {
                    match(input,12,FOLLOW_12_in_rule__RelType__Alternatives1159); 

                    }

                     after(grammarAccess.getRelTypeAccess().getFULFILSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:569:6: ( ( 'and decomposes' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:569:6: ( ( 'and decomposes' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:570:1: ( 'and decomposes' )
                    {
                     before(grammarAccess.getRelTypeAccess().getAND_DECOMPOSESEnumLiteralDeclaration_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:571:1: ( 'and decomposes' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:571:3: 'and decomposes'
                    {
                    match(input,13,FOLLOW_13_in_rule__RelType__Alternatives1180); 

                    }

                     after(grammarAccess.getRelTypeAccess().getAND_DECOMPOSESEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:576:6: ( ( 'or decomposes' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:576:6: ( ( 'or decomposes' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:577:1: ( 'or decomposes' )
                    {
                     before(grammarAccess.getRelTypeAccess().getOR_DECOMPOSESEnumLiteralDeclaration_3()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:578:1: ( 'or decomposes' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:578:3: 'or decomposes'
                    {
                    match(input,14,FOLLOW_14_in_rule__RelType__Alternatives1201); 

                    }

                     after(grammarAccess.getRelTypeAccess().getOR_DECOMPOSESEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:583:6: ( ( '+' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:583:6: ( ( '+' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:584:1: ( '+' )
                    {
                     before(grammarAccess.getRelTypeAccess().getHELPSEnumLiteralDeclaration_4()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:585:1: ( '+' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:585:3: '+'
                    {
                    match(input,15,FOLLOW_15_in_rule__RelType__Alternatives1222); 

                    }

                     after(grammarAccess.getRelTypeAccess().getHELPSEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:590:6: ( ( '-' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:590:6: ( ( '-' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:591:1: ( '-' )
                    {
                     before(grammarAccess.getRelTypeAccess().getHURTSEnumLiteralDeclaration_5()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:592:1: ( '-' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:592:3: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__RelType__Alternatives1243); 

                    }

                     after(grammarAccess.getRelTypeAccess().getHURTSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:597:6: ( ( '--' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:597:6: ( ( '--' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:598:1: ( '--' )
                    {
                     before(grammarAccess.getRelTypeAccess().getBREAKSEnumLiteralDeclaration_6()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:599:1: ( '--' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:599:3: '--'
                    {
                    match(input,17,FOLLOW_17_in_rule__RelType__Alternatives1264); 

                    }

                     after(grammarAccess.getRelTypeAccess().getBREAKSEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:604:6: ( ( '++' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:604:6: ( ( '++' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:605:1: ( '++' )
                    {
                     before(grammarAccess.getRelTypeAccess().getMAKESEnumLiteralDeclaration_7()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:606:1: ( '++' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:606:3: '++'
                    {
                    match(input,18,FOLLOW_18_in_rule__RelType__Alternatives1285); 

                    }

                     after(grammarAccess.getRelTypeAccess().getMAKESEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:611:6: ( ( 'wants' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:611:6: ( ( 'wants' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:612:1: ( 'wants' )
                    {
                     before(grammarAccess.getRelTypeAccess().getWANTSEnumLiteralDeclaration_8()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:613:1: ( 'wants' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:613:3: 'wants'
                    {
                    match(input,19,FOLLOW_19_in_rule__RelType__Alternatives1306); 

                    }

                     after(grammarAccess.getRelTypeAccess().getWANTSEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:618:6: ( ( 'depends' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:618:6: ( ( 'depends' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:619:1: ( 'depends' )
                    {
                     before(grammarAccess.getRelTypeAccess().getDEPENDSEnumLiteralDeclaration_9()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:620:1: ( 'depends' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:620:3: 'depends'
                    {
                    match(input,20,FOLLOW_20_in_rule__RelType__Alternatives1327); 

                    }

                     after(grammarAccess.getRelTypeAccess().getDEPENDSEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:625:6: ( ( 'delegates' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:625:6: ( ( 'delegates' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:626:1: ( 'delegates' )
                    {
                     before(grammarAccess.getRelTypeAccess().getDELEGATESEnumLiteralDeclaration_10()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:627:1: ( 'delegates' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:627:3: 'delegates'
                    {
                    match(input,21,FOLLOW_21_in_rule__RelType__Alternatives1348); 

                    }

                     after(grammarAccess.getRelTypeAccess().getDELEGATESEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:632:6: ( ( 'trusts' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:632:6: ( ( 'trusts' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:633:1: ( 'trusts' )
                    {
                     before(grammarAccess.getRelTypeAccess().getTRUSTSEnumLiteralDeclaration_11()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:634:1: ( 'trusts' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:634:3: 'trusts'
                    {
                    match(input,22,FOLLOW_22_in_rule__RelType__Alternatives1369); 

                    }

                     after(grammarAccess.getRelTypeAccess().getTRUSTSEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:639:6: ( ( 'provides' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:639:6: ( ( 'provides' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:640:1: ( 'provides' )
                    {
                     before(grammarAccess.getRelTypeAccess().getPROVIDESEnumLiteralDeclaration_12()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:641:1: ( 'provides' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:641:3: 'provides'
                    {
                    match(input,23,FOLLOW_23_in_rule__RelType__Alternatives1390); 

                    }

                     after(grammarAccess.getRelTypeAccess().getPROVIDESEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:646:6: ( ( 'consumes' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:646:6: ( ( 'consumes' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:647:1: ( 'consumes' )
                    {
                     before(grammarAccess.getRelTypeAccess().getCONSUMESEnumLiteralDeclaration_13()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:648:1: ( 'consumes' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:648:3: 'consumes'
                    {
                    match(input,24,FOLLOW_24_in_rule__RelType__Alternatives1411); 

                    }

                     after(grammarAccess.getRelTypeAccess().getCONSUMESEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:653:6: ( ( 'interfaces' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:653:6: ( ( 'interfaces' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:654:1: ( 'interfaces' )
                    {
                     before(grammarAccess.getRelTypeAccess().getINTERFACESEnumLiteralDeclaration_14()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:655:1: ( 'interfaces' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:655:3: 'interfaces'
                    {
                    match(input,25,FOLLOW_25_in_rule__RelType__Alternatives1432); 

                    }

                     after(grammarAccess.getRelTypeAccess().getINTERFACESEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:660:6: ( ( 'damages' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:660:6: ( ( 'damages' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:661:1: ( 'damages' )
                    {
                     before(grammarAccess.getRelTypeAccess().getDAMAGESEnumLiteralDeclaration_15()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:662:1: ( 'damages' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:662:3: 'damages'
                    {
                    match(input,26,FOLLOW_26_in_rule__RelType__Alternatives1453); 

                    }

                     after(grammarAccess.getRelTypeAccess().getDAMAGESEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:667:6: ( ( 'attacks' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:667:6: ( ( 'attacks' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:668:1: ( 'attacks' )
                    {
                     before(grammarAccess.getRelTypeAccess().getATTACKSEnumLiteralDeclaration_16()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:669:1: ( 'attacks' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:669:3: 'attacks'
                    {
                    match(input,27,FOLLOW_27_in_rule__RelType__Alternatives1474); 

                    }

                     after(grammarAccess.getRelTypeAccess().getATTACKSEnumLiteralDeclaration_16()); 

                    }


                    }
                    break;
                case 18 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:674:6: ( ( 'protects' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:674:6: ( ( 'protects' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:675:1: ( 'protects' )
                    {
                     before(grammarAccess.getRelTypeAccess().getPROTECTSEnumLiteralDeclaration_17()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:676:1: ( 'protects' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:676:3: 'protects'
                    {
                    match(input,28,FOLLOW_28_in_rule__RelType__Alternatives1495); 

                    }

                     after(grammarAccess.getRelTypeAccess().getPROTECTSEnumLiteralDeclaration_17()); 

                    }


                    }
                    break;
                case 19 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:681:6: ( ( 'argues' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:681:6: ( ( 'argues' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:682:1: ( 'argues' )
                    {
                     before(grammarAccess.getRelTypeAccess().getARGUESEnumLiteralDeclaration_18()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:683:1: ( 'argues' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:683:3: 'argues'
                    {
                    match(input,29,FOLLOW_29_in_rule__RelType__Alternatives1516); 

                    }

                     after(grammarAccess.getRelTypeAccess().getARGUESEnumLiteralDeclaration_18()); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:695:1: rule__Situation__Group__0 : rule__Situation__Group__0__Impl rule__Situation__Group__1 ;
    public final void rule__Situation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:699:1: ( rule__Situation__Group__0__Impl rule__Situation__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:700:2: rule__Situation__Group__0__Impl rule__Situation__Group__1
            {
            pushFollow(FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__01549);
            rule__Situation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__01552);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:707:1: rule__Situation__Group__0__Impl : ( ( rule__Situation__Group_0__0 )? ) ;
    public final void rule__Situation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:711:1: ( ( ( rule__Situation__Group_0__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:712:1: ( ( rule__Situation__Group_0__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:712:1: ( ( rule__Situation__Group_0__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:713:1: ( rule__Situation__Group_0__0 )?
            {
             before(grammarAccess.getSituationAccess().getGroup_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:714:1: ( rule__Situation__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:714:2: rule__Situation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl1579);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:724:1: rule__Situation__Group__1 : rule__Situation__Group__1__Impl ;
    public final void rule__Situation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:728:1: ( rule__Situation__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:729:2: rule__Situation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__11610);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:735:1: rule__Situation__Group__1__Impl : ( ( rule__Situation__WorldAssignment_1 ) ) ;
    public final void rule__Situation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:739:1: ( ( ( rule__Situation__WorldAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:740:1: ( ( rule__Situation__WorldAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:740:1: ( ( rule__Situation__WorldAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:741:1: ( rule__Situation__WorldAssignment_1 )
            {
             before(grammarAccess.getSituationAccess().getWorldAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:742:1: ( rule__Situation__WorldAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:742:2: rule__Situation__WorldAssignment_1
            {
            pushFollow(FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl1637);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:756:1: rule__Situation__Group_0__0 : rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 ;
    public final void rule__Situation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:760:1: ( rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:761:2: rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__01671);
            rule__Situation__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__01674);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:768:1: rule__Situation__Group_0__0__Impl : ( 'model' ) ;
    public final void rule__Situation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:772:1: ( ( 'model' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:773:1: ( 'model' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:773:1: ( 'model' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:774:1: 'model'
            {
             before(grammarAccess.getSituationAccess().getModelKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__Situation__Group_0__0__Impl1702); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:787:1: rule__Situation__Group_0__1 : rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 ;
    public final void rule__Situation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:791:1: ( rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:792:2: rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__11733);
            rule__Situation__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__11736);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:799:1: rule__Situation__Group_0__1__Impl : ( ( rule__Situation__TimeAssignment_0_1 ) ) ;
    public final void rule__Situation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:803:1: ( ( ( rule__Situation__TimeAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:804:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:804:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:805:1: ( rule__Situation__TimeAssignment_0_1 )
            {
             before(grammarAccess.getSituationAccess().getTimeAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:806:1: ( rule__Situation__TimeAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:806:2: rule__Situation__TimeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl1763);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:816:1: rule__Situation__Group_0__2 : rule__Situation__Group_0__2__Impl ;
    public final void rule__Situation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:820:1: ( rule__Situation__Group_0__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:821:2: rule__Situation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__21793);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:827:1: rule__Situation__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Situation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:831:1: ( ( ':' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:832:1: ( ':' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:832:1: ( ':' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:833:1: ':'
            {
             before(grammarAccess.getSituationAccess().getColonKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__Situation__Group_0__2__Impl1821); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:852:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:856:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:857:2: rule__World__Group__0__Impl rule__World__Group__1
            {
            pushFollow(FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__01858);
            rule__World__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__World__Group__1_in_rule__World__Group__01861);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:864:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:868:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:869:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:869:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:870:1: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:871:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:873:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:883:1: rule__World__Group__1 : rule__World__Group__1__Impl ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:887:1: ( rule__World__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:888:2: rule__World__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__11919);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:894:1: rule__World__Group__1__Impl : ( ( rule__World__Alternatives_1 )* ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:898:1: ( ( ( rule__World__Alternatives_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:899:1: ( ( rule__World__Alternatives_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:899:1: ( ( rule__World__Alternatives_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:900:1: ( rule__World__Alternatives_1 )*
            {
             before(grammarAccess.getWorldAccess().getAlternatives_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:901:1: ( rule__World__Alternatives_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=29)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:901:2: rule__World__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__World__Alternatives_1_in_rule__World__Group__1__Impl1946);
            	    rule__World__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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


    // $ANTLR start rule__Goal__Group_0__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:915:1: rule__Goal__Group_0__0 : rule__Goal__Group_0__0__Impl rule__Goal__Group_0__1 ;
    public final void rule__Goal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:919:1: ( rule__Goal__Group_0__0__Impl rule__Goal__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:920:2: rule__Goal__Group_0__0__Impl rule__Goal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Goal__Group_0__0__Impl_in_rule__Goal__Group_0__01981);
            rule__Goal__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goal__Group_0__1_in_rule__Goal__Group_0__01984);
            rule__Goal__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0__0


    // $ANTLR start rule__Goal__Group_0__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:927:1: rule__Goal__Group_0__0__Impl : ( ( rule__Goal__NameAssignment_0_0 ) ) ;
    public final void rule__Goal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:931:1: ( ( ( rule__Goal__NameAssignment_0_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:932:1: ( ( rule__Goal__NameAssignment_0_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:932:1: ( ( rule__Goal__NameAssignment_0_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:933:1: ( rule__Goal__NameAssignment_0_0 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:934:1: ( rule__Goal__NameAssignment_0_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:934:2: rule__Goal__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Goal__NameAssignment_0_0_in_rule__Goal__Group_0__0__Impl2011);
            rule__Goal__NameAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0__0__Impl


    // $ANTLR start rule__Goal__Group_0__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:944:1: rule__Goal__Group_0__1 : rule__Goal__Group_0__1__Impl rule__Goal__Group_0__2 ;
    public final void rule__Goal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:948:1: ( rule__Goal__Group_0__1__Impl rule__Goal__Group_0__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:949:2: rule__Goal__Group_0__1__Impl rule__Goal__Group_0__2
            {
            pushFollow(FOLLOW_rule__Goal__Group_0__1__Impl_in_rule__Goal__Group_0__12041);
            rule__Goal__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goal__Group_0__2_in_rule__Goal__Group_0__12044);
            rule__Goal__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0__1


    // $ANTLR start rule__Goal__Group_0__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:956:1: rule__Goal__Group_0__1__Impl : ( ( rule__Goal__TypeAssignment_0_1 ) ) ;
    public final void rule__Goal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:960:1: ( ( ( rule__Goal__TypeAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:961:1: ( ( rule__Goal__TypeAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:961:1: ( ( rule__Goal__TypeAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:962:1: ( rule__Goal__TypeAssignment_0_1 )
            {
             before(grammarAccess.getGoalAccess().getTypeAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:963:1: ( rule__Goal__TypeAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:963:2: rule__Goal__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Goal__TypeAssignment_0_1_in_rule__Goal__Group_0__1__Impl2071);
            rule__Goal__TypeAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getTypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0__1__Impl


    // $ANTLR start rule__Goal__Group_0__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:973:1: rule__Goal__Group_0__2 : rule__Goal__Group_0__2__Impl rule__Goal__Group_0__3 ;
    public final void rule__Goal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:977:1: ( rule__Goal__Group_0__2__Impl rule__Goal__Group_0__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:978:2: rule__Goal__Group_0__2__Impl rule__Goal__Group_0__3
            {
            pushFollow(FOLLOW_rule__Goal__Group_0__2__Impl_in_rule__Goal__Group_0__22101);
            rule__Goal__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goal__Group_0__3_in_rule__Goal__Group_0__22104);
            rule__Goal__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0__2


    // $ANTLR start rule__Goal__Group_0__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:985:1: rule__Goal__Group_0__2__Impl : ( ( rule__Goal__AssetAssignment_0_2 )? ) ;
    public final void rule__Goal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:989:1: ( ( ( rule__Goal__AssetAssignment_0_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:990:1: ( ( rule__Goal__AssetAssignment_0_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:990:1: ( ( rule__Goal__AssetAssignment_0_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:991:1: ( rule__Goal__AssetAssignment_0_2 )?
            {
             before(grammarAccess.getGoalAccess().getAssetAssignment_0_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:992:1: ( rule__Goal__AssetAssignment_0_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==33) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:992:2: rule__Goal__AssetAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__Goal__AssetAssignment_0_2_in_rule__Goal__Group_0__2__Impl2131);
                    rule__Goal__AssetAssignment_0_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGoalAccess().getAssetAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0__2__Impl


    // $ANTLR start rule__Goal__Group_0__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1002:1: rule__Goal__Group_0__3 : rule__Goal__Group_0__3__Impl ;
    public final void rule__Goal__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1006:1: ( rule__Goal__Group_0__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1007:2: rule__Goal__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Goal__Group_0__3__Impl_in_rule__Goal__Group_0__32162);
            rule__Goal__Group_0__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0__3


    // $ANTLR start rule__Goal__Group_0__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1013:1: rule__Goal__Group_0__3__Impl : ( ( rule__Goal__Group_0_3__0 )* ) ;
    public final void rule__Goal__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1017:1: ( ( ( rule__Goal__Group_0_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1018:1: ( ( rule__Goal__Group_0_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1018:1: ( ( rule__Goal__Group_0_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1019:1: ( rule__Goal__Group_0_3__0 )*
            {
             before(grammarAccess.getGoalAccess().getGroup_0_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1020:1: ( rule__Goal__Group_0_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1020:2: rule__Goal__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Goal__Group_0_3__0_in_rule__Goal__Group_0__3__Impl2189);
            	    rule__Goal__Group_0_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getGoalAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0__3__Impl


    // $ANTLR start rule__Goal__Group_0_3__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1038:1: rule__Goal__Group_0_3__0 : rule__Goal__Group_0_3__0__Impl rule__Goal__Group_0_3__1 ;
    public final void rule__Goal__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1042:1: ( rule__Goal__Group_0_3__0__Impl rule__Goal__Group_0_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1043:2: rule__Goal__Group_0_3__0__Impl rule__Goal__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Goal__Group_0_3__0__Impl_in_rule__Goal__Group_0_3__02228);
            rule__Goal__Group_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goal__Group_0_3__1_in_rule__Goal__Group_0_3__02231);
            rule__Goal__Group_0_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0_3__0


    // $ANTLR start rule__Goal__Group_0_3__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1050:1: rule__Goal__Group_0_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Goal__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1054:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1055:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1055:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1056:1: ( ',' )?
            {
             before(grammarAccess.getGoalAccess().getCommaKeyword_0_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1057:1: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1058:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__Goal__Group_0_3__0__Impl2260); 

                    }
                    break;

            }

             after(grammarAccess.getGoalAccess().getCommaKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0_3__0__Impl


    // $ANTLR start rule__Goal__Group_0_3__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1069:1: rule__Goal__Group_0_3__1 : rule__Goal__Group_0_3__1__Impl ;
    public final void rule__Goal__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1073:1: ( rule__Goal__Group_0_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1074:2: rule__Goal__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Goal__Group_0_3__1__Impl_in_rule__Goal__Group_0_3__12293);
            rule__Goal__Group_0_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0_3__1


    // $ANTLR start rule__Goal__Group_0_3__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1080:1: rule__Goal__Group_0_3__1__Impl : ( ( rule__Goal__PropertiesAssignment_0_3_1 ) ) ;
    public final void rule__Goal__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1084:1: ( ( ( rule__Goal__PropertiesAssignment_0_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1085:1: ( ( rule__Goal__PropertiesAssignment_0_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1085:1: ( ( rule__Goal__PropertiesAssignment_0_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1086:1: ( rule__Goal__PropertiesAssignment_0_3_1 )
            {
             before(grammarAccess.getGoalAccess().getPropertiesAssignment_0_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1087:1: ( rule__Goal__PropertiesAssignment_0_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1087:2: rule__Goal__PropertiesAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Goal__PropertiesAssignment_0_3_1_in_rule__Goal__Group_0_3__1__Impl2320);
            rule__Goal__PropertiesAssignment_0_3_1();
            _fsp--;


            }

             after(grammarAccess.getGoalAccess().getPropertiesAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__Group_0_3__1__Impl


    // $ANTLR start rule__SecurityGoal__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1101:1: rule__SecurityGoal__Group__0 : rule__SecurityGoal__Group__0__Impl rule__SecurityGoal__Group__1 ;
    public final void rule__SecurityGoal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1105:1: ( rule__SecurityGoal__Group__0__Impl rule__SecurityGoal__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1106:2: rule__SecurityGoal__Group__0__Impl rule__SecurityGoal__Group__1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__0__Impl_in_rule__SecurityGoal__Group__02354);
            rule__SecurityGoal__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group__1_in_rule__SecurityGoal__Group__02357);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1113:1: rule__SecurityGoal__Group__0__Impl : ( ( rule__SecurityGoal__NameAssignment_0 ) ) ;
    public final void rule__SecurityGoal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1117:1: ( ( ( rule__SecurityGoal__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1118:1: ( ( rule__SecurityGoal__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1118:1: ( ( rule__SecurityGoal__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1119:1: ( rule__SecurityGoal__NameAssignment_0 )
            {
             before(grammarAccess.getSecurityGoalAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1120:1: ( rule__SecurityGoal__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1120:2: rule__SecurityGoal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SecurityGoal__NameAssignment_0_in_rule__SecurityGoal__Group__0__Impl2384);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1130:1: rule__SecurityGoal__Group__1 : rule__SecurityGoal__Group__1__Impl rule__SecurityGoal__Group__2 ;
    public final void rule__SecurityGoal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1134:1: ( rule__SecurityGoal__Group__1__Impl rule__SecurityGoal__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1135:2: rule__SecurityGoal__Group__1__Impl rule__SecurityGoal__Group__2
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__1__Impl_in_rule__SecurityGoal__Group__12414);
            rule__SecurityGoal__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group__2_in_rule__SecurityGoal__Group__12417);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1142:1: rule__SecurityGoal__Group__1__Impl : ( ( rule__SecurityGoal__TypeAssignment_1 ) ) ;
    public final void rule__SecurityGoal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1146:1: ( ( ( rule__SecurityGoal__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1147:1: ( ( rule__SecurityGoal__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1147:1: ( ( rule__SecurityGoal__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1148:1: ( rule__SecurityGoal__TypeAssignment_1 )
            {
             before(grammarAccess.getSecurityGoalAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1149:1: ( rule__SecurityGoal__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1149:2: rule__SecurityGoal__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__TypeAssignment_1_in_rule__SecurityGoal__Group__1__Impl2444);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1159:1: rule__SecurityGoal__Group__2 : rule__SecurityGoal__Group__2__Impl rule__SecurityGoal__Group__3 ;
    public final void rule__SecurityGoal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1163:1: ( rule__SecurityGoal__Group__2__Impl rule__SecurityGoal__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1164:2: rule__SecurityGoal__Group__2__Impl rule__SecurityGoal__Group__3
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__2__Impl_in_rule__SecurityGoal__Group__22474);
            rule__SecurityGoal__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group__3_in_rule__SecurityGoal__Group__22477);
            rule__SecurityGoal__Group__3();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1171:1: rule__SecurityGoal__Group__2__Impl : ( ( rule__SecurityGoal__AssetAssignment_2 )? ) ;
    public final void rule__SecurityGoal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1175:1: ( ( ( rule__SecurityGoal__AssetAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1176:1: ( ( rule__SecurityGoal__AssetAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1176:1: ( ( rule__SecurityGoal__AssetAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1177:1: ( rule__SecurityGoal__AssetAssignment_2 )?
            {
             before(grammarAccess.getSecurityGoalAccess().getAssetAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1178:1: ( rule__SecurityGoal__AssetAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==33) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1178:2: rule__SecurityGoal__AssetAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SecurityGoal__AssetAssignment_2_in_rule__SecurityGoal__Group__2__Impl2504);
                    rule__SecurityGoal__AssetAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSecurityGoalAccess().getAssetAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__SecurityGoal__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1188:1: rule__SecurityGoal__Group__3 : rule__SecurityGoal__Group__3__Impl ;
    public final void rule__SecurityGoal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1192:1: ( rule__SecurityGoal__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1193:2: rule__SecurityGoal__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__3__Impl_in_rule__SecurityGoal__Group__32535);
            rule__SecurityGoal__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group__3


    // $ANTLR start rule__SecurityGoal__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1199:1: rule__SecurityGoal__Group__3__Impl : ( ( rule__SecurityGoal__Group_3__0 )* ) ;
    public final void rule__SecurityGoal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1203:1: ( ( ( rule__SecurityGoal__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1204:1: ( ( rule__SecurityGoal__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1204:1: ( ( rule__SecurityGoal__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1205:1: ( rule__SecurityGoal__Group_3__0 )*
            {
             before(grammarAccess.getSecurityGoalAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1206:1: ( rule__SecurityGoal__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING||LA12_0==32) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1206:2: rule__SecurityGoal__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SecurityGoal__Group_3__0_in_rule__SecurityGoal__Group__3__Impl2562);
            	    rule__SecurityGoal__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSecurityGoalAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group__3__Impl


    // $ANTLR start rule__SecurityGoal__Group_3__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1224:1: rule__SecurityGoal__Group_3__0 : rule__SecurityGoal__Group_3__0__Impl rule__SecurityGoal__Group_3__1 ;
    public final void rule__SecurityGoal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1228:1: ( rule__SecurityGoal__Group_3__0__Impl rule__SecurityGoal__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1229:2: rule__SecurityGoal__Group_3__0__Impl rule__SecurityGoal__Group_3__1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group_3__0__Impl_in_rule__SecurityGoal__Group_3__02601);
            rule__SecurityGoal__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group_3__1_in_rule__SecurityGoal__Group_3__02604);
            rule__SecurityGoal__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group_3__0


    // $ANTLR start rule__SecurityGoal__Group_3__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1236:1: rule__SecurityGoal__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__SecurityGoal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1240:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1241:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1241:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1242:1: ( ',' )?
            {
             before(grammarAccess.getSecurityGoalAccess().getCommaKeyword_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1243:1: ( ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1244:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__SecurityGoal__Group_3__0__Impl2633); 

                    }
                    break;

            }

             after(grammarAccess.getSecurityGoalAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group_3__0__Impl


    // $ANTLR start rule__SecurityGoal__Group_3__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1255:1: rule__SecurityGoal__Group_3__1 : rule__SecurityGoal__Group_3__1__Impl ;
    public final void rule__SecurityGoal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1259:1: ( rule__SecurityGoal__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1260:2: rule__SecurityGoal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group_3__1__Impl_in_rule__SecurityGoal__Group_3__12666);
            rule__SecurityGoal__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group_3__1


    // $ANTLR start rule__SecurityGoal__Group_3__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1266:1: rule__SecurityGoal__Group_3__1__Impl : ( ( rule__SecurityGoal__PropertiesAssignment_3_1 ) ) ;
    public final void rule__SecurityGoal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1270:1: ( ( ( rule__SecurityGoal__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1271:1: ( ( rule__SecurityGoal__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1271:1: ( ( rule__SecurityGoal__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1272:1: ( rule__SecurityGoal__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getSecurityGoalAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1273:1: ( rule__SecurityGoal__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1273:2: rule__SecurityGoal__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__PropertiesAssignment_3_1_in_rule__SecurityGoal__Group_3__1__Impl2693);
            rule__SecurityGoal__PropertiesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getSecurityGoalAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__Group_3__1__Impl


    // $ANTLR start rule__Requirement__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1287:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1291:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1292:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__02727);
            rule__Requirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__02730);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1299:1: rule__Requirement__Group__0__Impl : ( ( rule__Requirement__NameAssignment_0 ) ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1303:1: ( ( ( rule__Requirement__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1304:1: ( ( rule__Requirement__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1304:1: ( ( rule__Requirement__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1305:1: ( rule__Requirement__NameAssignment_0 )
            {
             before(grammarAccess.getRequirementAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1306:1: ( rule__Requirement__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1306:2: rule__Requirement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Requirement__NameAssignment_0_in_rule__Requirement__Group__0__Impl2757);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1316:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl rule__Requirement__Group__2 ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1320:1: ( rule__Requirement__Group__1__Impl rule__Requirement__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1321:2: rule__Requirement__Group__1__Impl rule__Requirement__Group__2
            {
            pushFollow(FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__12787);
            rule__Requirement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__12790);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1328:1: rule__Requirement__Group__1__Impl : ( ( rule__Requirement__TypeAssignment_1 ) ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1332:1: ( ( ( rule__Requirement__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1333:1: ( ( rule__Requirement__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1333:1: ( ( rule__Requirement__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1334:1: ( rule__Requirement__TypeAssignment_1 )
            {
             before(grammarAccess.getRequirementAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1335:1: ( rule__Requirement__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1335:2: rule__Requirement__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Requirement__TypeAssignment_1_in_rule__Requirement__Group__1__Impl2817);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1345:1: rule__Requirement__Group__2 : rule__Requirement__Group__2__Impl rule__Requirement__Group__3 ;
    public final void rule__Requirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1349:1: ( rule__Requirement__Group__2__Impl rule__Requirement__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1350:2: rule__Requirement__Group__2__Impl rule__Requirement__Group__3
            {
            pushFollow(FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__22847);
            rule__Requirement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__3_in_rule__Requirement__Group__22850);
            rule__Requirement__Group__3();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1357:1: rule__Requirement__Group__2__Impl : ( ( rule__Requirement__AssetAssignment_2 )? ) ;
    public final void rule__Requirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1361:1: ( ( ( rule__Requirement__AssetAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1362:1: ( ( rule__Requirement__AssetAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1362:1: ( ( rule__Requirement__AssetAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1363:1: ( rule__Requirement__AssetAssignment_2 )?
            {
             before(grammarAccess.getRequirementAccess().getAssetAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1364:1: ( rule__Requirement__AssetAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==33) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1364:2: rule__Requirement__AssetAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Requirement__AssetAssignment_2_in_rule__Requirement__Group__2__Impl2877);
                    rule__Requirement__AssetAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequirementAccess().getAssetAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Requirement__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1374:1: rule__Requirement__Group__3 : rule__Requirement__Group__3__Impl ;
    public final void rule__Requirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1378:1: ( rule__Requirement__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1379:2: rule__Requirement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group__3__Impl_in_rule__Requirement__Group__32908);
            rule__Requirement__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group__3


    // $ANTLR start rule__Requirement__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1385:1: rule__Requirement__Group__3__Impl : ( ( rule__Requirement__Group_3__0 )* ) ;
    public final void rule__Requirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1389:1: ( ( ( rule__Requirement__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1390:1: ( ( rule__Requirement__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1390:1: ( ( rule__Requirement__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1391:1: ( rule__Requirement__Group_3__0 )*
            {
             before(grammarAccess.getRequirementAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1392:1: ( rule__Requirement__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING||LA15_0==32) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1392:2: rule__Requirement__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Requirement__Group_3__0_in_rule__Requirement__Group__3__Impl2935);
            	    rule__Requirement__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRequirementAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group__3__Impl


    // $ANTLR start rule__Requirement__Group_3__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1410:1: rule__Requirement__Group_3__0 : rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1 ;
    public final void rule__Requirement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1414:1: ( rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1415:2: rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__0__Impl_in_rule__Requirement__Group_3__02974);
            rule__Requirement__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__1_in_rule__Requirement__Group_3__02977);
            rule__Requirement__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group_3__0


    // $ANTLR start rule__Requirement__Group_3__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1422:1: rule__Requirement__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Requirement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1426:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1427:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1427:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1428:1: ( ',' )?
            {
             before(grammarAccess.getRequirementAccess().getCommaKeyword_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1429:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1430:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__Requirement__Group_3__0__Impl3006); 

                    }
                    break;

            }

             after(grammarAccess.getRequirementAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group_3__0__Impl


    // $ANTLR start rule__Requirement__Group_3__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1441:1: rule__Requirement__Group_3__1 : rule__Requirement__Group_3__1__Impl ;
    public final void rule__Requirement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1445:1: ( rule__Requirement__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1446:2: rule__Requirement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__1__Impl_in_rule__Requirement__Group_3__13039);
            rule__Requirement__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group_3__1


    // $ANTLR start rule__Requirement__Group_3__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1452:1: rule__Requirement__Group_3__1__Impl : ( ( rule__Requirement__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Requirement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1456:1: ( ( ( rule__Requirement__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1457:1: ( ( rule__Requirement__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1457:1: ( ( rule__Requirement__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1458:1: ( rule__Requirement__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getRequirementAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1459:1: ( rule__Requirement__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1459:2: rule__Requirement__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Requirement__PropertiesAssignment_3_1_in_rule__Requirement__Group_3__1__Impl3066);
            rule__Requirement__PropertiesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getRequirementAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__Group_3__1__Impl


    // $ANTLR start rule__Domain__Group_0__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1473:1: rule__Domain__Group_0__0 : rule__Domain__Group_0__0__Impl rule__Domain__Group_0__1 ;
    public final void rule__Domain__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1477:1: ( rule__Domain__Group_0__0__Impl rule__Domain__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1478:2: rule__Domain__Group_0__0__Impl rule__Domain__Group_0__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_0__0__Impl_in_rule__Domain__Group_0__03100);
            rule__Domain__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_0__1_in_rule__Domain__Group_0__03103);
            rule__Domain__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0__0


    // $ANTLR start rule__Domain__Group_0__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1485:1: rule__Domain__Group_0__0__Impl : ( ( rule__Domain__NameAssignment_0_0 ) ) ;
    public final void rule__Domain__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1489:1: ( ( ( rule__Domain__NameAssignment_0_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1490:1: ( ( rule__Domain__NameAssignment_0_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1490:1: ( ( rule__Domain__NameAssignment_0_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1491:1: ( rule__Domain__NameAssignment_0_0 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1492:1: ( rule__Domain__NameAssignment_0_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1492:2: rule__Domain__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_0_0_in_rule__Domain__Group_0__0__Impl3130);
            rule__Domain__NameAssignment_0_0();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getNameAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0__0__Impl


    // $ANTLR start rule__Domain__Group_0__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1502:1: rule__Domain__Group_0__1 : rule__Domain__Group_0__1__Impl rule__Domain__Group_0__2 ;
    public final void rule__Domain__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1506:1: ( rule__Domain__Group_0__1__Impl rule__Domain__Group_0__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1507:2: rule__Domain__Group_0__1__Impl rule__Domain__Group_0__2
            {
            pushFollow(FOLLOW_rule__Domain__Group_0__1__Impl_in_rule__Domain__Group_0__13160);
            rule__Domain__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_0__2_in_rule__Domain__Group_0__13163);
            rule__Domain__Group_0__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0__1


    // $ANTLR start rule__Domain__Group_0__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1514:1: rule__Domain__Group_0__1__Impl : ( ( rule__Domain__TypeAssignment_0_1 ) ) ;
    public final void rule__Domain__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1518:1: ( ( ( rule__Domain__TypeAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1519:1: ( ( rule__Domain__TypeAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1519:1: ( ( rule__Domain__TypeAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1520:1: ( rule__Domain__TypeAssignment_0_1 )
            {
             before(grammarAccess.getDomainAccess().getTypeAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1521:1: ( rule__Domain__TypeAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1521:2: rule__Domain__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Domain__TypeAssignment_0_1_in_rule__Domain__Group_0__1__Impl3190);
            rule__Domain__TypeAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getTypeAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0__1__Impl


    // $ANTLR start rule__Domain__Group_0__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1531:1: rule__Domain__Group_0__2 : rule__Domain__Group_0__2__Impl rule__Domain__Group_0__3 ;
    public final void rule__Domain__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1535:1: ( rule__Domain__Group_0__2__Impl rule__Domain__Group_0__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1536:2: rule__Domain__Group_0__2__Impl rule__Domain__Group_0__3
            {
            pushFollow(FOLLOW_rule__Domain__Group_0__2__Impl_in_rule__Domain__Group_0__23220);
            rule__Domain__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_0__3_in_rule__Domain__Group_0__23223);
            rule__Domain__Group_0__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0__2


    // $ANTLR start rule__Domain__Group_0__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1543:1: rule__Domain__Group_0__2__Impl : ( ( rule__Domain__AssetAssignment_0_2 )? ) ;
    public final void rule__Domain__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1547:1: ( ( ( rule__Domain__AssetAssignment_0_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1548:1: ( ( rule__Domain__AssetAssignment_0_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1548:1: ( ( rule__Domain__AssetAssignment_0_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1549:1: ( rule__Domain__AssetAssignment_0_2 )?
            {
             before(grammarAccess.getDomainAccess().getAssetAssignment_0_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1550:1: ( rule__Domain__AssetAssignment_0_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==33) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1550:2: rule__Domain__AssetAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__Domain__AssetAssignment_0_2_in_rule__Domain__Group_0__2__Impl3250);
                    rule__Domain__AssetAssignment_0_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainAccess().getAssetAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0__2__Impl


    // $ANTLR start rule__Domain__Group_0__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1560:1: rule__Domain__Group_0__3 : rule__Domain__Group_0__3__Impl ;
    public final void rule__Domain__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1564:1: ( rule__Domain__Group_0__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1565:2: rule__Domain__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_0__3__Impl_in_rule__Domain__Group_0__33281);
            rule__Domain__Group_0__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0__3


    // $ANTLR start rule__Domain__Group_0__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1571:1: rule__Domain__Group_0__3__Impl : ( ( rule__Domain__Group_0_3__0 )* ) ;
    public final void rule__Domain__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1575:1: ( ( ( rule__Domain__Group_0_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1576:1: ( ( rule__Domain__Group_0_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1576:1: ( ( rule__Domain__Group_0_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1577:1: ( rule__Domain__Group_0_3__0 )*
            {
             before(grammarAccess.getDomainAccess().getGroup_0_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1578:1: ( rule__Domain__Group_0_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING||LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1578:2: rule__Domain__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__Group_0_3__0_in_rule__Domain__Group_0__3__Impl3308);
            	    rule__Domain__Group_0_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getDomainAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0__3__Impl


    // $ANTLR start rule__Domain__Group_0_3__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1596:1: rule__Domain__Group_0_3__0 : rule__Domain__Group_0_3__0__Impl rule__Domain__Group_0_3__1 ;
    public final void rule__Domain__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1600:1: ( rule__Domain__Group_0_3__0__Impl rule__Domain__Group_0_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1601:2: rule__Domain__Group_0_3__0__Impl rule__Domain__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_0_3__0__Impl_in_rule__Domain__Group_0_3__03347);
            rule__Domain__Group_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_0_3__1_in_rule__Domain__Group_0_3__03350);
            rule__Domain__Group_0_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0_3__0


    // $ANTLR start rule__Domain__Group_0_3__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1608:1: rule__Domain__Group_0_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Domain__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1612:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1613:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1613:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1614:1: ( ',' )?
            {
             before(grammarAccess.getDomainAccess().getCommaKeyword_0_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1615:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==32) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1616:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__Domain__Group_0_3__0__Impl3379); 

                    }
                    break;

            }

             after(grammarAccess.getDomainAccess().getCommaKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0_3__0__Impl


    // $ANTLR start rule__Domain__Group_0_3__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1627:1: rule__Domain__Group_0_3__1 : rule__Domain__Group_0_3__1__Impl ;
    public final void rule__Domain__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1631:1: ( rule__Domain__Group_0_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1632:2: rule__Domain__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_0_3__1__Impl_in_rule__Domain__Group_0_3__13412);
            rule__Domain__Group_0_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0_3__1


    // $ANTLR start rule__Domain__Group_0_3__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1638:1: rule__Domain__Group_0_3__1__Impl : ( ( rule__Domain__PropertiesAssignment_0_3_1 ) ) ;
    public final void rule__Domain__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1642:1: ( ( ( rule__Domain__PropertiesAssignment_0_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1643:1: ( ( rule__Domain__PropertiesAssignment_0_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1643:1: ( ( rule__Domain__PropertiesAssignment_0_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1644:1: ( rule__Domain__PropertiesAssignment_0_3_1 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_0_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1645:1: ( rule__Domain__PropertiesAssignment_0_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1645:2: rule__Domain__PropertiesAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_0_3_1_in_rule__Domain__Group_0_3__1__Impl3439);
            rule__Domain__PropertiesAssignment_0_3_1();
            _fsp--;


            }

             after(grammarAccess.getDomainAccess().getPropertiesAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__Group_0_3__1__Impl


    // $ANTLR start rule__Asset__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1659:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1663:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1664:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__03473);
            rule__Asset__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__03476);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1671:1: rule__Asset__Group__0__Impl : ( ( rule__Asset__NameAssignment_0 ) ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1675:1: ( ( ( rule__Asset__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1676:1: ( ( rule__Asset__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1676:1: ( ( rule__Asset__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1677:1: ( rule__Asset__NameAssignment_0 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1678:1: ( rule__Asset__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1678:2: rule__Asset__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Asset__NameAssignment_0_in_rule__Asset__Group__0__Impl3503);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1688:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl rule__Asset__Group__2 ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1692:1: ( rule__Asset__Group__1__Impl rule__Asset__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1693:2: rule__Asset__Group__1__Impl rule__Asset__Group__2
            {
            pushFollow(FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__13533);
            rule__Asset__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__13536);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1700:1: rule__Asset__Group__1__Impl : ( '$' ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1704:1: ( ( '$' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1705:1: ( '$' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1705:1: ( '$' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1706:1: '$'
            {
             before(grammarAccess.getAssetAccess().getDollarSignKeyword_1()); 
            match(input,33,FOLLOW_33_in_rule__Asset__Group__1__Impl3564); 
             after(grammarAccess.getAssetAccess().getDollarSignKeyword_1()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1719:1: rule__Asset__Group__2 : rule__Asset__Group__2__Impl ;
    public final void rule__Asset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1723:1: ( rule__Asset__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1724:2: rule__Asset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__23595);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1730:1: rule__Asset__Group__2__Impl : ( ( rule__Asset__Group_2__0 )? ) ;
    public final void rule__Asset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1734:1: ( ( ( rule__Asset__Group_2__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1735:1: ( ( rule__Asset__Group_2__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1735:1: ( ( rule__Asset__Group_2__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1736:1: ( rule__Asset__Group_2__0 )?
            {
             before(grammarAccess.getAssetAccess().getGroup_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1737:1: ( rule__Asset__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1737:2: rule__Asset__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Asset__Group_2__0_in_rule__Asset__Group__2__Impl3622);
                    rule__Asset__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1753:1: rule__Asset__Group_2__0 : rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1 ;
    public final void rule__Asset__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1757:1: ( rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1758:2: rule__Asset__Group_2__0__Impl rule__Asset__Group_2__1
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__0__Impl_in_rule__Asset__Group_2__03659);
            rule__Asset__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__1_in_rule__Asset__Group_2__03662);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1765:1: rule__Asset__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Asset__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1769:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1770:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1770:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1771:1: '('
            {
             before(grammarAccess.getAssetAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__Asset__Group_2__0__Impl3690); 
             after(grammarAccess.getAssetAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1784:1: rule__Asset__Group_2__1 : rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2 ;
    public final void rule__Asset__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1788:1: ( rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1789:2: rule__Asset__Group_2__1__Impl rule__Asset__Group_2__2
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__1__Impl_in_rule__Asset__Group_2__13721);
            rule__Asset__Group_2__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group_2__2_in_rule__Asset__Group_2__13724);
            rule__Asset__Group_2__2();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1796:1: rule__Asset__Group_2__1__Impl : ( ( rule__Asset__ValueAssignment_2_1 ) ) ;
    public final void rule__Asset__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1800:1: ( ( ( rule__Asset__ValueAssignment_2_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1801:1: ( ( rule__Asset__ValueAssignment_2_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1801:1: ( ( rule__Asset__ValueAssignment_2_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1802:1: ( rule__Asset__ValueAssignment_2_1 )
            {
             before(grammarAccess.getAssetAccess().getValueAssignment_2_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1803:1: ( rule__Asset__ValueAssignment_2_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1803:2: rule__Asset__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Asset__ValueAssignment_2_1_in_rule__Asset__Group_2__1__Impl3751);
            rule__Asset__ValueAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getAssetAccess().getValueAssignment_2_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Asset__Group_2__2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1813:1: rule__Asset__Group_2__2 : rule__Asset__Group_2__2__Impl ;
    public final void rule__Asset__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1817:1: ( rule__Asset__Group_2__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1818:2: rule__Asset__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group_2__2__Impl_in_rule__Asset__Group_2__23781);
            rule__Asset__Group_2__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group_2__2


    // $ANTLR start rule__Asset__Group_2__2__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1824:1: rule__Asset__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Asset__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1828:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1829:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1829:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1830:1: ')'
            {
             before(grammarAccess.getAssetAccess().getRightParenthesisKeyword_2_2()); 
            match(input,35,FOLLOW_35_in_rule__Asset__Group_2__2__Impl3809); 
             after(grammarAccess.getAssetAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__Group_2__2__Impl


    // $ANTLR start rule__Actor__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1849:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1853:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1854:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03846);
            rule__Actor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03849);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1861:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__NameAssignment_0 ) ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1865:1: ( ( ( rule__Actor__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1866:1: ( ( rule__Actor__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1866:1: ( ( rule__Actor__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1867:1: ( rule__Actor__NameAssignment_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1868:1: ( rule__Actor__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1868:2: rule__Actor__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3876);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1878:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1882:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1883:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13906);
            rule__Actor__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13909);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1890:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__TypeAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1894:1: ( ( ( rule__Actor__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1895:1: ( ( rule__Actor__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1895:1: ( ( rule__Actor__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1896:1: ( rule__Actor__TypeAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1897:1: ( rule__Actor__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1897:2: rule__Actor__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Actor__TypeAssignment_1_in_rule__Actor__Group__1__Impl3936);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1907:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1911:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1912:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23966);
            rule__Actor__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23969);
            rule__Actor__Group__3();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1919:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__AssetAssignment_2 )? ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1923:1: ( ( ( rule__Actor__AssetAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1924:1: ( ( rule__Actor__AssetAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1924:1: ( ( rule__Actor__AssetAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1925:1: ( rule__Actor__AssetAssignment_2 )?
            {
             before(grammarAccess.getActorAccess().getAssetAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1926:1: ( rule__Actor__AssetAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==33) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1926:2: rule__Actor__AssetAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Actor__AssetAssignment_2_in_rule__Actor__Group__2__Impl3996);
                    rule__Actor__AssetAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getAssetAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Actor__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1936:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1940:1: ( rule__Actor__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1941:2: rule__Actor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__34027);
            rule__Actor__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group__3


    // $ANTLR start rule__Actor__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1947:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__Group_3__0 )* ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1951:1: ( ( ( rule__Actor__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1952:1: ( ( rule__Actor__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1952:1: ( ( rule__Actor__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1953:1: ( rule__Actor__Group_3__0 )*
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1954:1: ( rule__Actor__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING||LA22_0==32) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1954:2: rule__Actor__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__3__Impl4054);
            	    rule__Actor__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getActorAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group__3__Impl


    // $ANTLR start rule__Actor__Group_3__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1972:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1976:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1977:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
            {
            pushFollow(FOLLOW_rule__Actor__Group_3__0__Impl_in_rule__Actor__Group_3__04093);
            rule__Actor__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__04096);
            rule__Actor__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_3__0


    // $ANTLR start rule__Actor__Group_3__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1984:1: rule__Actor__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1988:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1989:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1989:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1990:1: ( ',' )?
            {
             before(grammarAccess.getActorAccess().getCommaKeyword_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1991:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1992:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__Actor__Group_3__0__Impl4125); 

                    }
                    break;

            }

             after(grammarAccess.getActorAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_3__0__Impl


    // $ANTLR start rule__Actor__Group_3__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2003:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2007:1: ( rule__Actor__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2008:2: rule__Actor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Actor__Group_3__1__Impl_in_rule__Actor__Group_3__14158);
            rule__Actor__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_3__1


    // $ANTLR start rule__Actor__Group_3__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2014:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2018:1: ( ( ( rule__Actor__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2019:1: ( ( rule__Actor__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2019:1: ( ( rule__Actor__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2020:1: ( rule__Actor__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getActorAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2021:1: ( rule__Actor__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2021:2: rule__Actor__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Actor__PropertiesAssignment_3_1_in_rule__Actor__Group_3__1__Impl4185);
            rule__Actor__PropertiesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getActorAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__Group_3__1__Impl


    // $ANTLR start rule__Action__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2035:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2039:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2040:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04219);
            rule__Action__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04222);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2047:1: rule__Action__Group__0__Impl : ( ( rule__Action__NameAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2051:1: ( ( ( rule__Action__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2052:1: ( ( rule__Action__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2052:1: ( ( rule__Action__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2053:1: ( rule__Action__NameAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2054:1: ( rule__Action__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2054:2: rule__Action__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__0__Impl4249);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2064:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2068:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2069:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14279);
            rule__Action__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14282);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2076:1: rule__Action__Group__1__Impl : ( ( rule__Action__TypeAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2080:1: ( ( ( rule__Action__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2081:1: ( ( rule__Action__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2081:1: ( ( rule__Action__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2082:1: ( rule__Action__TypeAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2083:1: ( rule__Action__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2083:2: rule__Action__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__1__Impl4309);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2093:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2097:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2098:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24339);
            rule__Action__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24342);
            rule__Action__Group__3();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2105:1: rule__Action__Group__2__Impl : ( ( rule__Action__AssetAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2109:1: ( ( ( rule__Action__AssetAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2110:1: ( ( rule__Action__AssetAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2110:1: ( ( rule__Action__AssetAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2111:1: ( rule__Action__AssetAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getAssetAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2112:1: ( rule__Action__AssetAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==33) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2112:2: rule__Action__AssetAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Action__AssetAssignment_2_in_rule__Action__Group__2__Impl4369);
                    rule__Action__AssetAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getAssetAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Action__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2122:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2126:1: ( rule__Action__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2127:2: rule__Action__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34400);
            rule__Action__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__3


    // $ANTLR start rule__Action__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2133:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )* ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2137:1: ( ( ( rule__Action__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2138:1: ( ( rule__Action__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2138:1: ( ( rule__Action__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2139:1: ( rule__Action__Group_3__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2140:1: ( rule__Action__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING||LA25_0==32) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2140:2: rule__Action__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl4427);
            	    rule__Action__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group__3__Impl


    // $ANTLR start rule__Action__Group_3__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2158:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2162:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2163:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__04466);
            rule__Action__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04469);
            rule__Action__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3__0


    // $ANTLR start rule__Action__Group_3__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2170:1: rule__Action__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2174:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2175:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2175:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2176:1: ( ',' )?
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2177:1: ( ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==32) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2178:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__Action__Group_3__0__Impl4498); 

                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3__0__Impl


    // $ANTLR start rule__Action__Group_3__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2189:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2193:1: ( rule__Action__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2194:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__14531);
            rule__Action__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3__1


    // $ANTLR start rule__Action__Group_3__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2200:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2204:1: ( ( ( rule__Action__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2205:1: ( ( rule__Action__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2205:1: ( ( rule__Action__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2206:1: ( rule__Action__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2207:1: ( rule__Action__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2207:2: rule__Action__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Action__PropertiesAssignment_3_1_in_rule__Action__Group_3__1__Impl4558);
            rule__Action__PropertiesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getActionAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__Group_3__1__Impl


    // $ANTLR start rule__Resource__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2221:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2225:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2226:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__04592);
            rule__Resource__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__04595);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2233:1: rule__Resource__Group__0__Impl : ( ( rule__Resource__NameAssignment_0 ) ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2237:1: ( ( ( rule__Resource__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2238:1: ( ( rule__Resource__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2238:1: ( ( rule__Resource__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2239:1: ( rule__Resource__NameAssignment_0 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2240:1: ( rule__Resource__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2240:2: rule__Resource__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_0_in_rule__Resource__Group__0__Impl4622);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2250:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2254:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2255:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__14652);
            rule__Resource__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__14655);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2262:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__TypeAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2266:1: ( ( ( rule__Resource__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2267:1: ( ( rule__Resource__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2267:1: ( ( rule__Resource__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2268:1: ( rule__Resource__TypeAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2269:1: ( rule__Resource__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2269:2: rule__Resource__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__TypeAssignment_1_in_rule__Resource__Group__1__Impl4682);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2279:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2283:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2284:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__24712);
            rule__Resource__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__24715);
            rule__Resource__Group__3();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2291:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__AssetAssignment_2 )? ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2295:1: ( ( ( rule__Resource__AssetAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2296:1: ( ( rule__Resource__AssetAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2296:1: ( ( rule__Resource__AssetAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2297:1: ( rule__Resource__AssetAssignment_2 )?
            {
             before(grammarAccess.getResourceAccess().getAssetAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2298:1: ( rule__Resource__AssetAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==33) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2298:2: rule__Resource__AssetAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Resource__AssetAssignment_2_in_rule__Resource__Group__2__Impl4742);
                    rule__Resource__AssetAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getAssetAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Resource__Group__3
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2308:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2312:1: ( rule__Resource__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2313:2: rule__Resource__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__34773);
            rule__Resource__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group__3


    // $ANTLR start rule__Resource__Group__3__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2319:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__Group_3__0 )* ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2323:1: ( ( ( rule__Resource__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2324:1: ( ( rule__Resource__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2324:1: ( ( rule__Resource__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2325:1: ( rule__Resource__Group_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2326:1: ( rule__Resource__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_STRING||LA28_0==32) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2326:2: rule__Resource__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Resource__Group_3__0_in_rule__Resource__Group__3__Impl4800);
            	    rule__Resource__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group__3__Impl


    // $ANTLR start rule__Resource__Group_3__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2344:1: rule__Resource__Group_3__0 : rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 ;
    public final void rule__Resource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2348:1: ( rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2349:2: rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1
            {
            pushFollow(FOLLOW_rule__Resource__Group_3__0__Impl_in_rule__Resource__Group_3__04839);
            rule__Resource__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group_3__1_in_rule__Resource__Group_3__04842);
            rule__Resource__Group_3__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_3__0


    // $ANTLR start rule__Resource__Group_3__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2356:1: rule__Resource__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Resource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2360:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2361:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2361:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2362:1: ( ',' )?
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2363:1: ( ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==32) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2364:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__Resource__Group_3__0__Impl4871); 

                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getCommaKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_3__0__Impl


    // $ANTLR start rule__Resource__Group_3__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2375:1: rule__Resource__Group_3__1 : rule__Resource__Group_3__1__Impl ;
    public final void rule__Resource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2379:1: ( rule__Resource__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2380:2: rule__Resource__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group_3__1__Impl_in_rule__Resource__Group_3__14904);
            rule__Resource__Group_3__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_3__1


    // $ANTLR start rule__Resource__Group_3__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2386:1: rule__Resource__Group_3__1__Impl : ( ( rule__Resource__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Resource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2390:1: ( ( ( rule__Resource__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2391:1: ( ( rule__Resource__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2391:1: ( ( rule__Resource__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2392:1: ( rule__Resource__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2393:1: ( rule__Resource__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2393:2: rule__Resource__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Resource__PropertiesAssignment_3_1_in_rule__Resource__Group_3__1__Impl4931);
            rule__Resource__PropertiesAssignment_3_1();
            _fsp--;


            }

             after(grammarAccess.getResourceAccess().getPropertiesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__Group_3__1__Impl


    // $ANTLR start rule__Relationship__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2407:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2411:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2412:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04965);
            rule__Relationship__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04968);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2419:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__TypeAssignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2423:1: ( ( ( rule__Relationship__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2424:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2424:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2425:1: ( rule__Relationship__TypeAssignment_0 )
            {
             before(grammarAccess.getRelationshipAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2426:1: ( rule__Relationship__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2426:2: rule__Relationship__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl4995);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2436:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2440:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2441:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__15025);
            rule__Relationship__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__15028);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2448:1: rule__Relationship__Group__1__Impl : ( '(' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2452:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2453:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2453:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2454:1: '('
            {
             before(grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__Relationship__Group__1__Impl5056); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2467:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2471:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2472:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__25087);
            rule__Relationship__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__25090);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2479:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__SourceAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2483:1: ( ( ( rule__Relationship__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2484:1: ( ( rule__Relationship__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2484:1: ( ( rule__Relationship__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2485:1: ( rule__Relationship__SourceAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2486:1: ( rule__Relationship__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2486:2: rule__Relationship__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Relationship__SourceAssignment_2_in_rule__Relationship__Group__2__Impl5117);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2496:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2500:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2501:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__35147);
            rule__Relationship__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__35150);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2508:1: rule__Relationship__Group__3__Impl : ( ',' ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2512:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2513:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2513:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2514:1: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Relationship__Group__3__Impl5178); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2527:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2531:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2532:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__45209);
            rule__Relationship__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__45212);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2539:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__TargetAssignment_4 ) ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2543:1: ( ( ( rule__Relationship__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2544:1: ( ( rule__Relationship__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2544:1: ( ( rule__Relationship__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2545:1: ( rule__Relationship__TargetAssignment_4 )
            {
             before(grammarAccess.getRelationshipAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2546:1: ( rule__Relationship__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2546:2: rule__Relationship__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Relationship__TargetAssignment_4_in_rule__Relationship__Group__4__Impl5239);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2556:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl rule__Relationship__Group__6 ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2560:1: ( rule__Relationship__Group__5__Impl rule__Relationship__Group__6 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2561:2: rule__Relationship__Group__5__Impl rule__Relationship__Group__6
            {
            pushFollow(FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__55269);
            rule__Relationship__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__55272);
            rule__Relationship__Group__6();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2568:1: rule__Relationship__Group__5__Impl : ( ( rule__Relationship__Group_5__0 )? ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2572:1: ( ( ( rule__Relationship__Group_5__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2573:1: ( ( rule__Relationship__Group_5__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2573:1: ( ( rule__Relationship__Group_5__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2574:1: ( rule__Relationship__Group_5__0 )?
            {
             before(grammarAccess.getRelationshipAccess().getGroup_5()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2575:1: ( rule__Relationship__Group_5__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==32) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2575:2: rule__Relationship__Group_5__0
                    {
                    pushFollow(FOLLOW_rule__Relationship__Group_5__0_in_rule__Relationship__Group__5__Impl5299);
                    rule__Relationship__Group_5__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getGroup_5()); 

            }


            }

        }
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


    // $ANTLR start rule__Relationship__Group__6
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2585:1: rule__Relationship__Group__6 : rule__Relationship__Group__6__Impl rule__Relationship__Group__7 ;
    public final void rule__Relationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2589:1: ( rule__Relationship__Group__6__Impl rule__Relationship__Group__7 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2590:2: rule__Relationship__Group__6__Impl rule__Relationship__Group__7
            {
            pushFollow(FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__65330);
            rule__Relationship__Group__6__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__7_in_rule__Relationship__Group__65333);
            rule__Relationship__Group__7();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__6


    // $ANTLR start rule__Relationship__Group__6__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2597:1: rule__Relationship__Group__6__Impl : ( ')' ) ;
    public final void rule__Relationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2601:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2602:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2602:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2603:1: ')'
            {
             before(grammarAccess.getRelationshipAccess().getRightParenthesisKeyword_6()); 
            match(input,35,FOLLOW_35_in_rule__Relationship__Group__6__Impl5361); 
             after(grammarAccess.getRelationshipAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__6__Impl


    // $ANTLR start rule__Relationship__Group__7
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2616:1: rule__Relationship__Group__7 : rule__Relationship__Group__7__Impl ;
    public final void rule__Relationship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2620:1: ( rule__Relationship__Group__7__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2621:2: rule__Relationship__Group__7__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group__7__Impl_in_rule__Relationship__Group__75392);
            rule__Relationship__Group__7__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__7


    // $ANTLR start rule__Relationship__Group__7__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2627:1: rule__Relationship__Group__7__Impl : ( ( rule__Relationship__Group_7__0 )* ) ;
    public final void rule__Relationship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2631:1: ( ( ( rule__Relationship__Group_7__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2632:1: ( ( rule__Relationship__Group_7__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2632:1: ( ( rule__Relationship__Group_7__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2633:1: ( rule__Relationship__Group_7__0 )*
            {
             before(grammarAccess.getRelationshipAccess().getGroup_7()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2634:1: ( rule__Relationship__Group_7__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_STRING||LA31_0==32) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2634:2: rule__Relationship__Group_7__0
            	    {
            	    pushFollow(FOLLOW_rule__Relationship__Group_7__0_in_rule__Relationship__Group__7__Impl5419);
            	    rule__Relationship__Group_7__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group__7__Impl


    // $ANTLR start rule__Relationship__Group_5__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2660:1: rule__Relationship__Group_5__0 : rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1 ;
    public final void rule__Relationship__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2664:1: ( rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2665:2: rule__Relationship__Group_5__0__Impl rule__Relationship__Group_5__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group_5__0__Impl_in_rule__Relationship__Group_5__05466);
            rule__Relationship__Group_5__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group_5__1_in_rule__Relationship__Group_5__05469);
            rule__Relationship__Group_5__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_5__0


    // $ANTLR start rule__Relationship__Group_5__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2672:1: rule__Relationship__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Relationship__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2676:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2677:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2677:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2678:1: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_5_0()); 
            match(input,32,FOLLOW_32_in_rule__Relationship__Group_5__0__Impl5497); 
             after(grammarAccess.getRelationshipAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_5__0__Impl


    // $ANTLR start rule__Relationship__Group_5__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2691:1: rule__Relationship__Group_5__1 : rule__Relationship__Group_5__1__Impl ;
    public final void rule__Relationship__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2695:1: ( rule__Relationship__Group_5__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2696:2: rule__Relationship__Group_5__1__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group_5__1__Impl_in_rule__Relationship__Group_5__15528);
            rule__Relationship__Group_5__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_5__1


    // $ANTLR start rule__Relationship__Group_5__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2702:1: rule__Relationship__Group_5__1__Impl : ( ( rule__Relationship__DependumAssignment_5_1 ) ) ;
    public final void rule__Relationship__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2706:1: ( ( ( rule__Relationship__DependumAssignment_5_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2707:1: ( ( rule__Relationship__DependumAssignment_5_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2707:1: ( ( rule__Relationship__DependumAssignment_5_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2708:1: ( rule__Relationship__DependumAssignment_5_1 )
            {
             before(grammarAccess.getRelationshipAccess().getDependumAssignment_5_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2709:1: ( rule__Relationship__DependumAssignment_5_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2709:2: rule__Relationship__DependumAssignment_5_1
            {
            pushFollow(FOLLOW_rule__Relationship__DependumAssignment_5_1_in_rule__Relationship__Group_5__1__Impl5555);
            rule__Relationship__DependumAssignment_5_1();
            _fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getDependumAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_5__1__Impl


    // $ANTLR start rule__Relationship__Group_7__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2723:1: rule__Relationship__Group_7__0 : rule__Relationship__Group_7__0__Impl rule__Relationship__Group_7__1 ;
    public final void rule__Relationship__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2727:1: ( rule__Relationship__Group_7__0__Impl rule__Relationship__Group_7__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2728:2: rule__Relationship__Group_7__0__Impl rule__Relationship__Group_7__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group_7__0__Impl_in_rule__Relationship__Group_7__05589);
            rule__Relationship__Group_7__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group_7__1_in_rule__Relationship__Group_7__05592);
            rule__Relationship__Group_7__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_7__0


    // $ANTLR start rule__Relationship__Group_7__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2735:1: rule__Relationship__Group_7__0__Impl : ( ( ',' )? ) ;
    public final void rule__Relationship__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2739:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2740:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2740:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2741:1: ( ',' )?
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_7_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2742:1: ( ',' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==32) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2743:2: ','
                    {
                    match(input,32,FOLLOW_32_in_rule__Relationship__Group_7__0__Impl5621); 

                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_7__0__Impl


    // $ANTLR start rule__Relationship__Group_7__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2754:1: rule__Relationship__Group_7__1 : rule__Relationship__Group_7__1__Impl ;
    public final void rule__Relationship__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2758:1: ( rule__Relationship__Group_7__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2759:2: rule__Relationship__Group_7__1__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group_7__1__Impl_in_rule__Relationship__Group_7__15654);
            rule__Relationship__Group_7__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_7__1


    // $ANTLR start rule__Relationship__Group_7__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2765:1: rule__Relationship__Group_7__1__Impl : ( ( rule__Relationship__PropertiesAssignment_7_1 ) ) ;
    public final void rule__Relationship__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2769:1: ( ( ( rule__Relationship__PropertiesAssignment_7_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2770:1: ( ( rule__Relationship__PropertiesAssignment_7_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2770:1: ( ( rule__Relationship__PropertiesAssignment_7_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2771:1: ( rule__Relationship__PropertiesAssignment_7_1 )
            {
             before(grammarAccess.getRelationshipAccess().getPropertiesAssignment_7_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2772:1: ( rule__Relationship__PropertiesAssignment_7_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2772:2: rule__Relationship__PropertiesAssignment_7_1
            {
            pushFollow(FOLLOW_rule__Relationship__PropertiesAssignment_7_1_in_rule__Relationship__Group_7__1__Impl5681);
            rule__Relationship__PropertiesAssignment_7_1();
            _fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getPropertiesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_7__1__Impl


    // $ANTLR start rule__Situation__TimeAssignment_0_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2787:1: rule__Situation__TimeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Situation__TimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2791:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2792:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2792:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2793:1: RULE_ID
            {
             before(grammarAccess.getSituationAccess().getTimeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_15720); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2802:1: rule__Situation__WorldAssignment_1 : ( ruleWorld ) ;
    public final void rule__Situation__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2806:1: ( ( ruleWorld ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2807:1: ( ruleWorld )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2807:1: ( ruleWorld )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2808:1: ruleWorld
            {
             before(grammarAccess.getSituationAccess().getWorldWorldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_15751);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2817:1: rule__World__EntitiesAssignment_1_0 : ( ruleEntity ) ;
    public final void rule__World__EntitiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2821:1: ( ( ruleEntity ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2822:1: ( ruleEntity )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2822:1: ( ruleEntity )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2823:1: ruleEntity
            {
             before(grammarAccess.getWorldAccess().getEntitiesEntityParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__World__EntitiesAssignment_1_05782);
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


    // $ANTLR start rule__World__RelationshipsAssignment_1_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2832:1: rule__World__RelationshipsAssignment_1_1 : ( ruleRelationship ) ;
    public final void rule__World__RelationshipsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2836:1: ( ( ruleRelationship ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2837:1: ( ruleRelationship )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2837:1: ( ruleRelationship )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2838:1: ruleRelationship
            {
             before(grammarAccess.getWorldAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__World__RelationshipsAssignment_1_15813);
            ruleRelationship();
            _fsp--;

             after(grammarAccess.getWorldAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__World__RelationshipsAssignment_1_1


    // $ANTLR start rule__Goal__NameAssignment_0_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2847:1: rule__Goal__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2851:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2852:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2852:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2853:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_0_05844); 
             after(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__NameAssignment_0_0


    // $ANTLR start rule__Goal__TypeAssignment_0_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2862:1: rule__Goal__TypeAssignment_0_1 : ( ( 'goal' ) ) ;
    public final void rule__Goal__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2866:1: ( ( ( 'goal' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2867:1: ( ( 'goal' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2867:1: ( ( 'goal' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2868:1: ( 'goal' )
            {
             before(grammarAccess.getGoalAccess().getTypeGoalKeyword_0_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2869:1: ( 'goal' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2870:1: 'goal'
            {
             before(grammarAccess.getGoalAccess().getTypeGoalKeyword_0_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Goal__TypeAssignment_0_15880); 
             after(grammarAccess.getGoalAccess().getTypeGoalKeyword_0_1_0()); 

            }

             after(grammarAccess.getGoalAccess().getTypeGoalKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__TypeAssignment_0_1


    // $ANTLR start rule__Goal__AssetAssignment_0_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2885:1: rule__Goal__AssetAssignment_0_2 : ( ruleAsset ) ;
    public final void rule__Goal__AssetAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2889:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2890:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2890:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2891:1: ruleAsset
            {
             before(grammarAccess.getGoalAccess().getAssetAssetParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Goal__AssetAssignment_0_25919);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getGoalAccess().getAssetAssetParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__AssetAssignment_0_2


    // $ANTLR start rule__Goal__PropertiesAssignment_0_3_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2900:1: rule__Goal__PropertiesAssignment_0_3_1 : ( ruleProposition ) ;
    public final void rule__Goal__PropertiesAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2904:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2905:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2905:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2906:1: ruleProposition
            {
             before(grammarAccess.getGoalAccess().getPropertiesPropositionParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Goal__PropertiesAssignment_0_3_15950);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getGoalAccess().getPropertiesPropositionParserRuleCall_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Goal__PropertiesAssignment_0_3_1


    // $ANTLR start rule__SecurityGoal__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2915:1: rule__SecurityGoal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SecurityGoal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2919:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2920:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2920:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2921:1: RULE_ID
            {
             before(grammarAccess.getSecurityGoalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SecurityGoal__NameAssignment_05981); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2930:1: rule__SecurityGoal__TypeAssignment_1 : ( ( 'sec' ) ) ;
    public final void rule__SecurityGoal__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2934:1: ( ( ( 'sec' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2935:1: ( ( 'sec' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2935:1: ( ( 'sec' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2936:1: ( 'sec' )
            {
             before(grammarAccess.getSecurityGoalAccess().getTypeSecKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2937:1: ( 'sec' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2938:1: 'sec'
            {
             before(grammarAccess.getSecurityGoalAccess().getTypeSecKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__SecurityGoal__TypeAssignment_16017); 
             after(grammarAccess.getSecurityGoalAccess().getTypeSecKeyword_1_0()); 

            }

             after(grammarAccess.getSecurityGoalAccess().getTypeSecKeyword_1_0()); 

            }


            }

        }
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


    // $ANTLR start rule__SecurityGoal__AssetAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2953:1: rule__SecurityGoal__AssetAssignment_2 : ( ruleAsset ) ;
    public final void rule__SecurityGoal__AssetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2957:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2958:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2958:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2959:1: ruleAsset
            {
             before(grammarAccess.getSecurityGoalAccess().getAssetAssetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__SecurityGoal__AssetAssignment_26056);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getSecurityGoalAccess().getAssetAssetParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__AssetAssignment_2


    // $ANTLR start rule__SecurityGoal__PropertiesAssignment_3_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2968:1: rule__SecurityGoal__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__SecurityGoal__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2972:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2973:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2973:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2974:1: ruleProposition
            {
             before(grammarAccess.getSecurityGoalAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__SecurityGoal__PropertiesAssignment_3_16087);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getSecurityGoalAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SecurityGoal__PropertiesAssignment_3_1


    // $ANTLR start rule__Requirement__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2983:1: rule__Requirement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Requirement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2987:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2988:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2988:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2989:1: RULE_ID
            {
             before(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_06118); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2998:1: rule__Requirement__TypeAssignment_1 : ( ( 'req' ) ) ;
    public final void rule__Requirement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3002:1: ( ( ( 'req' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3003:1: ( ( 'req' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3003:1: ( ( 'req' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3004:1: ( 'req' )
            {
             before(grammarAccess.getRequirementAccess().getTypeReqKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3005:1: ( 'req' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3006:1: 'req'
            {
             before(grammarAccess.getRequirementAccess().getTypeReqKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Requirement__TypeAssignment_16154); 
             after(grammarAccess.getRequirementAccess().getTypeReqKeyword_1_0()); 

            }

             after(grammarAccess.getRequirementAccess().getTypeReqKeyword_1_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Requirement__AssetAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3021:1: rule__Requirement__AssetAssignment_2 : ( ruleAsset ) ;
    public final void rule__Requirement__AssetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3025:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3026:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3026:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3027:1: ruleAsset
            {
             before(grammarAccess.getRequirementAccess().getAssetAssetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Requirement__AssetAssignment_26193);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getRequirementAccess().getAssetAssetParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__AssetAssignment_2


    // $ANTLR start rule__Requirement__PropertiesAssignment_3_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3036:1: rule__Requirement__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__Requirement__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3040:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3041:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3041:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3042:1: ruleProposition
            {
             before(grammarAccess.getRequirementAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Requirement__PropertiesAssignment_3_16224);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getRequirementAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Requirement__PropertiesAssignment_3_1


    // $ANTLR start rule__Domain__NameAssignment_0_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3051:1: rule__Domain__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3055:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3056:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3056:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3057:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_0_06255); 
             after(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__NameAssignment_0_0


    // $ANTLR start rule__Domain__TypeAssignment_0_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3066:1: rule__Domain__TypeAssignment_0_1 : ( ( 'dom' ) ) ;
    public final void rule__Domain__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3070:1: ( ( ( 'dom' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3071:1: ( ( 'dom' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3071:1: ( ( 'dom' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3072:1: ( 'dom' )
            {
             before(grammarAccess.getDomainAccess().getTypeDomKeyword_0_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3073:1: ( 'dom' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3074:1: 'dom'
            {
             before(grammarAccess.getDomainAccess().getTypeDomKeyword_0_1_0()); 
            match(input,39,FOLLOW_39_in_rule__Domain__TypeAssignment_0_16291); 
             after(grammarAccess.getDomainAccess().getTypeDomKeyword_0_1_0()); 

            }

             after(grammarAccess.getDomainAccess().getTypeDomKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__TypeAssignment_0_1


    // $ANTLR start rule__Domain__AssetAssignment_0_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3089:1: rule__Domain__AssetAssignment_0_2 : ( ruleAsset ) ;
    public final void rule__Domain__AssetAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3093:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3094:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3094:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3095:1: ruleAsset
            {
             before(grammarAccess.getDomainAccess().getAssetAssetParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Domain__AssetAssignment_0_26330);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getDomainAccess().getAssetAssetParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__AssetAssignment_0_2


    // $ANTLR start rule__Domain__PropertiesAssignment_0_3_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3104:1: rule__Domain__PropertiesAssignment_0_3_1 : ( ruleProposition ) ;
    public final void rule__Domain__PropertiesAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3108:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3109:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3109:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3110:1: ruleProposition
            {
             before(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_0_3_16361);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Domain__PropertiesAssignment_0_3_1


    // $ANTLR start rule__Asset__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3119:1: rule__Asset__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3123:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3124:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3124:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3125:1: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_06392); 
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


    // $ANTLR start rule__Asset__ValueAssignment_2_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3134:1: rule__Asset__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Asset__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3138:1: ( ( RULE_STRING ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3139:1: ( RULE_STRING )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3139:1: ( RULE_STRING )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3140:1: RULE_STRING
            {
             before(grammarAccess.getAssetAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Asset__ValueAssignment_2_16423); 
             after(grammarAccess.getAssetAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__ValueAssignment_2_1


    // $ANTLR start rule__Actor__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3149:1: rule__Actor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3153:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3154:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3154:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3155:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_06454); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3164:1: rule__Actor__TypeAssignment_1 : ( ( 'actor' ) ) ;
    public final void rule__Actor__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3168:1: ( ( ( 'actor' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3169:1: ( ( 'actor' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3169:1: ( ( 'actor' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3170:1: ( 'actor' )
            {
             before(grammarAccess.getActorAccess().getTypeActorKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3171:1: ( 'actor' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3172:1: 'actor'
            {
             before(grammarAccess.getActorAccess().getTypeActorKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__Actor__TypeAssignment_16490); 
             after(grammarAccess.getActorAccess().getTypeActorKeyword_1_0()); 

            }

             after(grammarAccess.getActorAccess().getTypeActorKeyword_1_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Actor__AssetAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3187:1: rule__Actor__AssetAssignment_2 : ( ruleAsset ) ;
    public final void rule__Actor__AssetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3191:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3192:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3192:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3193:1: ruleAsset
            {
             before(grammarAccess.getActorAccess().getAssetAssetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Actor__AssetAssignment_26529);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getActorAccess().getAssetAssetParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__AssetAssignment_2


    // $ANTLR start rule__Actor__PropertiesAssignment_3_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3202:1: rule__Actor__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__Actor__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3206:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3207:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3207:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3208:1: ruleProposition
            {
             before(grammarAccess.getActorAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Actor__PropertiesAssignment_3_16560);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getActorAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Actor__PropertiesAssignment_3_1


    // $ANTLR start rule__Action__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3217:1: rule__Action__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3221:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3222:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3222:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3223:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_06591); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3232:1: rule__Action__TypeAssignment_1 : ( ( 'action' ) ) ;
    public final void rule__Action__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3236:1: ( ( ( 'action' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3237:1: ( ( 'action' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3237:1: ( ( 'action' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3238:1: ( 'action' )
            {
             before(grammarAccess.getActionAccess().getTypeActionKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3239:1: ( 'action' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3240:1: 'action'
            {
             before(grammarAccess.getActionAccess().getTypeActionKeyword_1_0()); 
            match(input,41,FOLLOW_41_in_rule__Action__TypeAssignment_16627); 
             after(grammarAccess.getActionAccess().getTypeActionKeyword_1_0()); 

            }

             after(grammarAccess.getActionAccess().getTypeActionKeyword_1_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Action__AssetAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3255:1: rule__Action__AssetAssignment_2 : ( ruleAsset ) ;
    public final void rule__Action__AssetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3259:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3260:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3260:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3261:1: ruleAsset
            {
             before(grammarAccess.getActionAccess().getAssetAssetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Action__AssetAssignment_26666);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getActionAccess().getAssetAssetParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__AssetAssignment_2


    // $ANTLR start rule__Action__PropertiesAssignment_3_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3270:1: rule__Action__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__Action__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3274:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3275:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3275:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3276:1: ruleProposition
            {
             before(grammarAccess.getActionAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Action__PropertiesAssignment_3_16697);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getActionAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Action__PropertiesAssignment_3_1


    // $ANTLR start rule__Resource__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3285:1: rule__Resource__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3289:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3290:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3290:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3291:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_06728); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3300:1: rule__Resource__TypeAssignment_1 : ( ( 'resource' ) ) ;
    public final void rule__Resource__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3304:1: ( ( ( 'resource' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3305:1: ( ( 'resource' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3305:1: ( ( 'resource' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3306:1: ( 'resource' )
            {
             before(grammarAccess.getResourceAccess().getTypeResourceKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3307:1: ( 'resource' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3308:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getTypeResourceKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__Resource__TypeAssignment_16764); 
             after(grammarAccess.getResourceAccess().getTypeResourceKeyword_1_0()); 

            }

             after(grammarAccess.getResourceAccess().getTypeResourceKeyword_1_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Resource__AssetAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3323:1: rule__Resource__AssetAssignment_2 : ( ruleAsset ) ;
    public final void rule__Resource__AssetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3327:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3328:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3328:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3329:1: ruleAsset
            {
             before(grammarAccess.getResourceAccess().getAssetAssetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Resource__AssetAssignment_26803);
            ruleAsset();
            _fsp--;

             after(grammarAccess.getResourceAccess().getAssetAssetParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__AssetAssignment_2


    // $ANTLR start rule__Resource__PropertiesAssignment_3_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3338:1: rule__Resource__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__Resource__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3342:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3343:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3343:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3344:1: ruleProposition
            {
             before(grammarAccess.getResourceAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Resource__PropertiesAssignment_3_16834);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getResourceAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Resource__PropertiesAssignment_3_1


    // $ANTLR start rule__Proposition__NameAssignment
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3353:1: rule__Proposition__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Proposition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3357:1: ( ( RULE_STRING ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3358:1: ( RULE_STRING )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3358:1: ( RULE_STRING )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3359:1: RULE_STRING
            {
             before(grammarAccess.getPropositionAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Proposition__NameAssignment6865); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3368:1: rule__Relationship__TypeAssignment_0 : ( ruleRelType ) ;
    public final void rule__Relationship__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3372:1: ( ( ruleRelType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3373:1: ( ruleRelType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3373:1: ( ruleRelType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3374:1: ruleRelType
            {
             before(grammarAccess.getRelationshipAccess().getTypeRelTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelType_in_rule__Relationship__TypeAssignment_06896);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3383:1: rule__Relationship__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3387:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3388:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3388:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3389:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getSourceEntityCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3390:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3391:1: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getSourceEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship__SourceAssignment_26931); 
             after(grammarAccess.getRelationshipAccess().getSourceEntityIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getSourceEntityCrossReference_2_0()); 

            }


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3402:1: rule__Relationship__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3406:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3407:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3407:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3408:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3409:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3410:1: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getTargetEntityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship__TargetAssignment_46970); 
             after(grammarAccess.getRelationshipAccess().getTargetEntityIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_4_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Relationship__DependumAssignment_5_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3421:1: rule__Relationship__DependumAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__DependumAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3425:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3426:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3426:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3427:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getDependumEntityCrossReference_5_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3428:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3429:1: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getDependumEntityIDTerminalRuleCall_5_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship__DependumAssignment_5_17009); 
             after(grammarAccess.getRelationshipAccess().getDependumEntityIDTerminalRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getDependumEntityCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__DependumAssignment_5_1


    // $ANTLR start rule__Relationship__PropertiesAssignment_7_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3440:1: rule__Relationship__PropertiesAssignment_7_1 : ( ruleProposition ) ;
    public final void rule__Relationship__PropertiesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3444:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3445:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3445:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3446:1: ruleProposition
            {
             before(grammarAccess.getRelationshipAccess().getPropertiesPropositionParserRuleCall_7_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Relationship__PropertiesAssignment_7_17044);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getRelationshipAccess().getPropertiesPropositionParserRuleCall_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__PropertiesAssignment_7_1


 

    public static final BitSet FOLLOW_ruleSituation_in_entryRuleSituation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__0_in_ruleSituation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_entryRuleWorld121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorld128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__0_in_ruleWorld154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Alternatives_in_ruleEntity214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Alternatives_in_ruleGoal274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityGoal_in_entryRuleSecurityGoal301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSecurityGoal308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__0_in_ruleSecurityGoal334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__0_in_ruleRequirement394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Alternatives_in_ruleDomain454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_entryRuleAsset481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAsset488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0_in_ruleAsset514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_entryRuleActor541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleActor548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__0_in_ruleActor574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_entryRuleAction601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAction608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0_in_ruleAction634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_entryRuleResource661 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleResource668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0_in_ruleResource694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_entryRuleProposition721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProposition728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Proposition__NameAssignment_in_ruleProposition754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelType__Alternatives_in_ruleRelType851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__EntitiesAssignment_1_0_in_rule__World__Alternatives_1886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__RelationshipsAssignment_1_1_in_rule__World__Alternatives_1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_rule__Entity__Alternatives937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__Entity__Alternatives954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__0_in_rule__Goal__Alternatives986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSecurityGoal_in_rule__Goal__Alternatives1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_rule__Goal__Alternatives1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__0_in_rule__Domain__Alternatives1053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleActor_in_rule__Domain__Alternatives1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAction_in_rule__Domain__Alternatives1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleResource_in_rule__Domain__Alternatives1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__RelType__Alternatives1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__RelType__Alternatives1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__RelType__Alternatives1180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__RelType__Alternatives1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__RelType__Alternatives1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__RelType__Alternatives1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__RelType__Alternatives1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__RelType__Alternatives1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RelType__Alternatives1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RelType__Alternatives1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RelType__Alternatives1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RelType__Alternatives1369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RelType__Alternatives1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__RelType__Alternatives1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__RelType__Alternatives1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__RelType__Alternatives1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RelType__Alternatives1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RelType__Alternatives1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RelType__Alternatives1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__01549 = new BitSet(new long[]{0x000000003FFFF812L});
    public static final BitSet FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__01552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl1579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__11610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__01671 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__01674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Situation__Group_0__0__Impl1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__11733 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__11736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl1763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__21793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Situation__Group_0__2__Impl1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__01858 = new BitSet(new long[]{0x000000003FFFF812L});
    public static final BitSet FOLLOW_rule__World__Group__1_in_rule__World__Group__01861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__11919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Alternatives_1_in_rule__World__Group__1__Impl1946 = new BitSet(new long[]{0x000000003FFFF812L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__0__Impl_in_rule__Goal__Group_0__01981 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__1_in_rule__Goal__Group_0__01984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__NameAssignment_0_0_in_rule__Goal__Group_0__0__Impl2011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__1__Impl_in_rule__Goal__Group_0__12041 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__2_in_rule__Goal__Group_0__12044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__TypeAssignment_0_1_in_rule__Goal__Group_0__1__Impl2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__2__Impl_in_rule__Goal__Group_0__22101 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__3_in_rule__Goal__Group_0__22104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__AssetAssignment_0_2_in_rule__Goal__Group_0__2__Impl2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__3__Impl_in_rule__Goal__Group_0__32162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0_3__0_in_rule__Goal__Group_0__3__Impl2189 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Goal__Group_0_3__0__Impl_in_rule__Goal__Group_0_3__02228 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group_0_3__1_in_rule__Goal__Group_0_3__02231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Goal__Group_0_3__0__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0_3__1__Impl_in_rule__Goal__Group_0_3__12293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__PropertiesAssignment_0_3_1_in_rule__Goal__Group_0_3__1__Impl2320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__0__Impl_in_rule__SecurityGoal__Group__02354 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__1_in_rule__SecurityGoal__Group__02357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__NameAssignment_0_in_rule__SecurityGoal__Group__0__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__1__Impl_in_rule__SecurityGoal__Group__12414 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__2_in_rule__SecurityGoal__Group__12417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__TypeAssignment_1_in_rule__SecurityGoal__Group__1__Impl2444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__2__Impl_in_rule__SecurityGoal__Group__22474 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__3_in_rule__SecurityGoal__Group__22477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__AssetAssignment_2_in_rule__SecurityGoal__Group__2__Impl2504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__3__Impl_in_rule__SecurityGoal__Group__32535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_3__0_in_rule__SecurityGoal__Group__3__Impl2562 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_3__0__Impl_in_rule__SecurityGoal__Group_3__02601 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_3__1_in_rule__SecurityGoal__Group_3__02604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SecurityGoal__Group_3__0__Impl2633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_3__1__Impl_in_rule__SecurityGoal__Group_3__12666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__PropertiesAssignment_3_1_in_rule__SecurityGoal__Group_3__1__Impl2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__02727 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__02730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__NameAssignment_0_in_rule__Requirement__Group__0__Impl2757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__12787 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__12790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__TypeAssignment_1_in_rule__Requirement__Group__1__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__22847 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Requirement__Group__3_in_rule__Requirement__Group__22850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__AssetAssignment_2_in_rule__Requirement__Group__2__Impl2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__3__Impl_in_rule__Requirement__Group__32908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__0_in_rule__Requirement__Group__3__Impl2935 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__0__Impl_in_rule__Requirement__Group_3__02974 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__1_in_rule__Requirement__Group_3__02977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Requirement__Group_3__0__Impl3006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__1__Impl_in_rule__Requirement__Group_3__13039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__PropertiesAssignment_3_1_in_rule__Requirement__Group_3__1__Impl3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__0__Impl_in_rule__Domain__Group_0__03100 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__1_in_rule__Domain__Group_0__03103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_0_0_in_rule__Domain__Group_0__0__Impl3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__1__Impl_in_rule__Domain__Group_0__13160 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__2_in_rule__Domain__Group_0__13163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__TypeAssignment_0_1_in_rule__Domain__Group_0__1__Impl3190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__2__Impl_in_rule__Domain__Group_0__23220 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__3_in_rule__Domain__Group_0__23223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__AssetAssignment_0_2_in_rule__Domain__Group_0__2__Impl3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__3__Impl_in_rule__Domain__Group_0__33281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0_3__0_in_rule__Domain__Group_0__3__Impl3308 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Domain__Group_0_3__0__Impl_in_rule__Domain__Group_0_3__03347 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Domain__Group_0_3__1_in_rule__Domain__Group_0_3__03350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Domain__Group_0_3__0__Impl3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0_3__1__Impl_in_rule__Domain__Group_0_3__13412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_0_3_1_in_rule__Domain__Group_0_3__1__Impl3439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__03473 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__03476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__NameAssignment_0_in_rule__Asset__Group__0__Impl3503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__13533 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__13536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Asset__Group__1__Impl3564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__23595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__0_in_rule__Asset__Group__2__Impl3622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__0__Impl_in_rule__Asset__Group_2__03659 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__1_in_rule__Asset__Group_2__03662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Asset__Group_2__0__Impl3690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__1__Impl_in_rule__Asset__Group_2__13721 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__2_in_rule__Asset__Group_2__13724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__ValueAssignment_2_1_in_rule__Asset__Group_2__1__Impl3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group_2__2__Impl_in_rule__Asset__Group_2__23781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Asset__Group_2__2__Impl3809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03846 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13906 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__TypeAssignment_1_in_rule__Actor__Group__1__Impl3936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23966 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__AssetAssignment_2_in_rule__Actor__Group__2__Impl3996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__34027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__3__Impl4054 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__0__Impl_in_rule__Actor__Group_3__04093 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__04096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Actor__Group_3__0__Impl4125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__1__Impl_in_rule__Actor__Group_3__14158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__PropertiesAssignment_3_1_in_rule__Actor__Group_3__1__Impl4185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__04219 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__04222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__0__Impl4249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14279 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__1__Impl4309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24339 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__AssetAssignment_2_in_rule__Action__Group__2__Impl4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl4427 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__04466 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Action__Group_3__0__Impl4498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__14531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__PropertiesAssignment_3_1_in_rule__Action__Group_3__1__Impl4558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__04592 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__04595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_0_in_rule__Resource__Group__0__Impl4622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__14652 = new BitSet(new long[]{0x0000000100000032L});
    public static final BitSet FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__14655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__TypeAssignment_1_in_rule__Resource__Group__1__Impl4682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__24712 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__24715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__AssetAssignment_2_in_rule__Resource__Group__2__Impl4742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__34773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__0_in_rule__Resource__Group__3__Impl4800 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__0__Impl_in_rule__Resource__Group_3__04839 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__1_in_rule__Resource__Group_3__04842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Resource__Group_3__0__Impl4871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__1__Impl_in_rule__Resource__Group_3__14904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__PropertiesAssignment_3_1_in_rule__Resource__Group_3__1__Impl4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04965 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl4995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__15025 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__15028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Relationship__Group__1__Impl5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__25087 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__25090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__SourceAssignment_2_in_rule__Relationship__Group__2__Impl5117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__35147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__35150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Relationship__Group__3__Impl5178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__45209 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__45212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TargetAssignment_4_in_rule__Relationship__Group__4__Impl5239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__55269 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__55272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group_5__0_in_rule__Relationship__Group__5__Impl5299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__65330 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Relationship__Group__7_in_rule__Relationship__Group__65333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Relationship__Group__6__Impl5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__7__Impl_in_rule__Relationship__Group__75392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group_7__0_in_rule__Relationship__Group__7__Impl5419 = new BitSet(new long[]{0x0000000100000022L});
    public static final BitSet FOLLOW_rule__Relationship__Group_5__0__Impl_in_rule__Relationship__Group_5__05466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group_5__1_in_rule__Relationship__Group_5__05469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Relationship__Group_5__0__Impl5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group_5__1__Impl_in_rule__Relationship__Group_5__15528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__DependumAssignment_5_1_in_rule__Relationship__Group_5__1__Impl5555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group_7__0__Impl_in_rule__Relationship__Group_7__05589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Relationship__Group_7__1_in_rule__Relationship__Group_7__05592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Relationship__Group_7__0__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group_7__1__Impl_in_rule__Relationship__Group_7__15654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__PropertiesAssignment_7_1_in_rule__Relationship__Group_7__1__Impl5681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_15720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_15751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__World__EntitiesAssignment_1_05782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__World__RelationshipsAssignment_1_15813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_0_05844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Goal__TypeAssignment_0_15880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Goal__AssetAssignment_0_25919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Goal__PropertiesAssignment_0_3_15950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SecurityGoal__NameAssignment_05981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__SecurityGoal__TypeAssignment_16017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__SecurityGoal__AssetAssignment_26056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__SecurityGoal__PropertiesAssignment_3_16087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_06118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Requirement__TypeAssignment_16154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Requirement__AssetAssignment_26193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Requirement__PropertiesAssignment_3_16224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_0_06255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Domain__TypeAssignment_0_16291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Domain__AssetAssignment_0_26330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_0_3_16361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_06392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Asset__ValueAssignment_2_16423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_06454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Actor__TypeAssignment_16490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Actor__AssetAssignment_26529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Actor__PropertiesAssignment_3_16560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_06591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Action__TypeAssignment_16627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Action__AssetAssignment_26666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Action__PropertiesAssignment_3_16697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_06728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__Resource__TypeAssignment_16764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Resource__AssetAssignment_26803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Resource__PropertiesAssignment_3_16834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Proposition__NameAssignment6865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelType_in_rule__Relationship__TypeAssignment_06896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__SourceAssignment_26931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__TargetAssignment_46970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__DependumAssignment_5_17009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Relationship__PropertiesAssignment_7_17044 = new BitSet(new long[]{0x0000000000000002L});

}