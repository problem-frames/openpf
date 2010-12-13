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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'carries out'", "'depends'", "'decomposes'", "'contributes'", "'delegates'", "'fulfils'", "'provides'", "'trusts'", "'wants'", "'damages'", "'attacks'", "'argues'", "'interfaces'", "'consumes'", "'protects'", "'model'", "':'", "','", "'$'", "'('", "')'", "'goal'", "'sec'", "'req'", "'dom'", "'actor'", "'action'", "'resource'"
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
            else if ( ((LA1_0>=11 && LA1_0<=25)) ) {
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

                if ( ((LA2_1>=35 && LA2_1<=38)) ) {
                    alt2=2;
                }
                else if ( ((LA2_1>=32 && LA2_1<=34)) ) {
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
                case 32:
                    {
                    alt3=1;
                    }
                    break;
                case 33:
                    {
                    alt3=2;
                    }
                    break;
                case 34:
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
                case 38:
                    {
                    alt4=4;
                    }
                    break;
                case 37:
                    {
                    alt4=3;
                    }
                    break;
                case 36:
                    {
                    alt4=2;
                    }
                    break;
                case 35:
                    {
                    alt4=1;
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:550:1: rule__RelType__Alternatives : ( ( ( 'carries out' ) ) | ( ( 'depends' ) ) | ( ( 'decomposes' ) ) | ( ( 'contributes' ) ) | ( ( 'delegates' ) ) | ( ( 'fulfils' ) ) | ( ( 'provides' ) ) | ( ( 'trusts' ) ) | ( ( 'wants' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'argues' ) ) | ( ( 'interfaces' ) ) | ( ( 'consumes' ) ) | ( ( 'protects' ) ) );
    public final void rule__RelType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:554:1: ( ( ( 'carries out' ) ) | ( ( 'depends' ) ) | ( ( 'decomposes' ) ) | ( ( 'contributes' ) ) | ( ( 'delegates' ) ) | ( ( 'fulfils' ) ) | ( ( 'provides' ) ) | ( ( 'trusts' ) ) | ( ( 'wants' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'argues' ) ) | ( ( 'interfaces' ) ) | ( ( 'consumes' ) ) | ( ( 'protects' ) ) )
            int alt5=15;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("550:1: rule__RelType__Alternatives : ( ( ( 'carries out' ) ) | ( ( 'depends' ) ) | ( ( 'decomposes' ) ) | ( ( 'contributes' ) ) | ( ( 'delegates' ) ) | ( ( 'fulfils' ) ) | ( ( 'provides' ) ) | ( ( 'trusts' ) ) | ( ( 'wants' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'argues' ) ) | ( ( 'interfaces' ) ) | ( ( 'consumes' ) ) | ( ( 'protects' ) ) );", 5, 0, input);

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
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:562:6: ( ( 'depends' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:562:6: ( ( 'depends' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:563:1: ( 'depends' )
                    {
                     before(grammarAccess.getRelTypeAccess().getDEPENDSEnumLiteralDeclaration_1()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:564:1: ( 'depends' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:564:3: 'depends'
                    {
                    match(input,12,FOLLOW_12_in_rule__RelType__Alternatives1159); 

                    }

                     after(grammarAccess.getRelTypeAccess().getDEPENDSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:569:6: ( ( 'decomposes' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:569:6: ( ( 'decomposes' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:570:1: ( 'decomposes' )
                    {
                     before(grammarAccess.getRelTypeAccess().getDECOMPOSESEnumLiteralDeclaration_2()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:571:1: ( 'decomposes' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:571:3: 'decomposes'
                    {
                    match(input,13,FOLLOW_13_in_rule__RelType__Alternatives1180); 

                    }

                     after(grammarAccess.getRelTypeAccess().getDECOMPOSESEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:576:6: ( ( 'contributes' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:576:6: ( ( 'contributes' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:577:1: ( 'contributes' )
                    {
                     before(grammarAccess.getRelTypeAccess().getCONTRIBUTESEnumLiteralDeclaration_3()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:578:1: ( 'contributes' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:578:3: 'contributes'
                    {
                    match(input,14,FOLLOW_14_in_rule__RelType__Alternatives1201); 

                    }

                     after(grammarAccess.getRelTypeAccess().getCONTRIBUTESEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:583:6: ( ( 'delegates' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:583:6: ( ( 'delegates' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:584:1: ( 'delegates' )
                    {
                     before(grammarAccess.getRelTypeAccess().getDELEGATESEnumLiteralDeclaration_4()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:585:1: ( 'delegates' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:585:3: 'delegates'
                    {
                    match(input,15,FOLLOW_15_in_rule__RelType__Alternatives1222); 

                    }

                     after(grammarAccess.getRelTypeAccess().getDELEGATESEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:590:6: ( ( 'fulfils' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:590:6: ( ( 'fulfils' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:591:1: ( 'fulfils' )
                    {
                     before(grammarAccess.getRelTypeAccess().getFULFILSEnumLiteralDeclaration_5()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:592:1: ( 'fulfils' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:592:3: 'fulfils'
                    {
                    match(input,16,FOLLOW_16_in_rule__RelType__Alternatives1243); 

                    }

                     after(grammarAccess.getRelTypeAccess().getFULFILSEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:597:6: ( ( 'provides' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:597:6: ( ( 'provides' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:598:1: ( 'provides' )
                    {
                     before(grammarAccess.getRelTypeAccess().getPROVIDESEnumLiteralDeclaration_6()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:599:1: ( 'provides' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:599:3: 'provides'
                    {
                    match(input,17,FOLLOW_17_in_rule__RelType__Alternatives1264); 

                    }

                     after(grammarAccess.getRelTypeAccess().getPROVIDESEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:604:6: ( ( 'trusts' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:604:6: ( ( 'trusts' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:605:1: ( 'trusts' )
                    {
                     before(grammarAccess.getRelTypeAccess().getTRUSTSEnumLiteralDeclaration_7()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:606:1: ( 'trusts' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:606:3: 'trusts'
                    {
                    match(input,18,FOLLOW_18_in_rule__RelType__Alternatives1285); 

                    }

                     after(grammarAccess.getRelTypeAccess().getTRUSTSEnumLiteralDeclaration_7()); 

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
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:618:6: ( ( 'damages' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:618:6: ( ( 'damages' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:619:1: ( 'damages' )
                    {
                     before(grammarAccess.getRelTypeAccess().getDAMAGESEnumLiteralDeclaration_9()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:620:1: ( 'damages' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:620:3: 'damages'
                    {
                    match(input,20,FOLLOW_20_in_rule__RelType__Alternatives1327); 

                    }

                     after(grammarAccess.getRelTypeAccess().getDAMAGESEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:625:6: ( ( 'attacks' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:625:6: ( ( 'attacks' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:626:1: ( 'attacks' )
                    {
                     before(grammarAccess.getRelTypeAccess().getATTACKSEnumLiteralDeclaration_10()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:627:1: ( 'attacks' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:627:3: 'attacks'
                    {
                    match(input,21,FOLLOW_21_in_rule__RelType__Alternatives1348); 

                    }

                     after(grammarAccess.getRelTypeAccess().getATTACKSEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:632:6: ( ( 'argues' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:632:6: ( ( 'argues' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:633:1: ( 'argues' )
                    {
                     before(grammarAccess.getRelTypeAccess().getARGUESEnumLiteralDeclaration_11()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:634:1: ( 'argues' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:634:3: 'argues'
                    {
                    match(input,22,FOLLOW_22_in_rule__RelType__Alternatives1369); 

                    }

                     after(grammarAccess.getRelTypeAccess().getARGUESEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:639:6: ( ( 'interfaces' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:639:6: ( ( 'interfaces' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:640:1: ( 'interfaces' )
                    {
                     before(grammarAccess.getRelTypeAccess().getINTERFACESEnumLiteralDeclaration_12()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:641:1: ( 'interfaces' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:641:3: 'interfaces'
                    {
                    match(input,23,FOLLOW_23_in_rule__RelType__Alternatives1390); 

                    }

                     after(grammarAccess.getRelTypeAccess().getINTERFACESEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:646:6: ( ( 'consumes' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:646:6: ( ( 'consumes' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:647:1: ( 'consumes' )
                    {
                     before(grammarAccess.getRelTypeAccess().getCONSUMEsEnumLiteralDeclaration_13()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:648:1: ( 'consumes' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:648:3: 'consumes'
                    {
                    match(input,24,FOLLOW_24_in_rule__RelType__Alternatives1411); 

                    }

                     after(grammarAccess.getRelTypeAccess().getCONSUMEsEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:653:6: ( ( 'protects' ) )
                    {
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:653:6: ( ( 'protects' ) )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:654:1: ( 'protects' )
                    {
                     before(grammarAccess.getRelTypeAccess().getPROTECTSEnumLiteralDeclaration_14()); 
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:655:1: ( 'protects' )
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:655:3: 'protects'
                    {
                    match(input,25,FOLLOW_25_in_rule__RelType__Alternatives1432); 

                    }

                     after(grammarAccess.getRelTypeAccess().getPROTECTSEnumLiteralDeclaration_14()); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:667:1: rule__Situation__Group__0 : rule__Situation__Group__0__Impl rule__Situation__Group__1 ;
    public final void rule__Situation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:671:1: ( rule__Situation__Group__0__Impl rule__Situation__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:672:2: rule__Situation__Group__0__Impl rule__Situation__Group__1
            {
            pushFollow(FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__01465);
            rule__Situation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__01468);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:679:1: rule__Situation__Group__0__Impl : ( ( rule__Situation__Group_0__0 )? ) ;
    public final void rule__Situation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:683:1: ( ( ( rule__Situation__Group_0__0 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:684:1: ( ( rule__Situation__Group_0__0 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:684:1: ( ( rule__Situation__Group_0__0 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:685:1: ( rule__Situation__Group_0__0 )?
            {
             before(grammarAccess.getSituationAccess().getGroup_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:686:1: ( rule__Situation__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:686:2: rule__Situation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl1495);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:696:1: rule__Situation__Group__1 : rule__Situation__Group__1__Impl ;
    public final void rule__Situation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:700:1: ( rule__Situation__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:701:2: rule__Situation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__11526);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:707:1: rule__Situation__Group__1__Impl : ( ( rule__Situation__WorldAssignment_1 ) ) ;
    public final void rule__Situation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:711:1: ( ( ( rule__Situation__WorldAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:712:1: ( ( rule__Situation__WorldAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:712:1: ( ( rule__Situation__WorldAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:713:1: ( rule__Situation__WorldAssignment_1 )
            {
             before(grammarAccess.getSituationAccess().getWorldAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:714:1: ( rule__Situation__WorldAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:714:2: rule__Situation__WorldAssignment_1
            {
            pushFollow(FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl1553);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:728:1: rule__Situation__Group_0__0 : rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 ;
    public final void rule__Situation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:732:1: ( rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:733:2: rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__01587);
            rule__Situation__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__01590);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:740:1: rule__Situation__Group_0__0__Impl : ( 'model' ) ;
    public final void rule__Situation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:744:1: ( ( 'model' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:745:1: ( 'model' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:745:1: ( 'model' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:746:1: 'model'
            {
             before(grammarAccess.getSituationAccess().getModelKeyword_0_0()); 
            match(input,26,FOLLOW_26_in_rule__Situation__Group_0__0__Impl1618); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:759:1: rule__Situation__Group_0__1 : rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 ;
    public final void rule__Situation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:763:1: ( rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:764:2: rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__11649);
            rule__Situation__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__11652);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:771:1: rule__Situation__Group_0__1__Impl : ( ( rule__Situation__TimeAssignment_0_1 ) ) ;
    public final void rule__Situation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:775:1: ( ( ( rule__Situation__TimeAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:776:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:776:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:777:1: ( rule__Situation__TimeAssignment_0_1 )
            {
             before(grammarAccess.getSituationAccess().getTimeAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:778:1: ( rule__Situation__TimeAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:778:2: rule__Situation__TimeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl1679);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:788:1: rule__Situation__Group_0__2 : rule__Situation__Group_0__2__Impl ;
    public final void rule__Situation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:792:1: ( rule__Situation__Group_0__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:793:2: rule__Situation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__21709);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:799:1: rule__Situation__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Situation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:803:1: ( ( ':' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:804:1: ( ':' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:804:1: ( ':' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:805:1: ':'
            {
             before(grammarAccess.getSituationAccess().getColonKeyword_0_2()); 
            match(input,27,FOLLOW_27_in_rule__Situation__Group_0__2__Impl1737); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:824:1: rule__World__Group__0 : rule__World__Group__0__Impl rule__World__Group__1 ;
    public final void rule__World__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:828:1: ( rule__World__Group__0__Impl rule__World__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:829:2: rule__World__Group__0__Impl rule__World__Group__1
            {
            pushFollow(FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__01774);
            rule__World__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__World__Group__1_in_rule__World__Group__01777);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:836:1: rule__World__Group__0__Impl : ( () ) ;
    public final void rule__World__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:840:1: ( ( () ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:841:1: ( () )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:841:1: ( () )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:842:1: ()
            {
             before(grammarAccess.getWorldAccess().getWorldAction_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:843:1: ()
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:845:1: 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:855:1: rule__World__Group__1 : rule__World__Group__1__Impl ;
    public final void rule__World__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:859:1: ( rule__World__Group__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:860:2: rule__World__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__11835);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:866:1: rule__World__Group__1__Impl : ( ( rule__World__Alternatives_1 )* ) ;
    public final void rule__World__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:870:1: ( ( ( rule__World__Alternatives_1 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:871:1: ( ( rule__World__Alternatives_1 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:871:1: ( ( rule__World__Alternatives_1 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:872:1: ( rule__World__Alternatives_1 )*
            {
             before(grammarAccess.getWorldAccess().getAlternatives_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:873:1: ( rule__World__Alternatives_1 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=11 && LA7_0<=25)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:873:2: rule__World__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__World__Alternatives_1_in_rule__World__Group__1__Impl1862);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:887:1: rule__Goal__Group_0__0 : rule__Goal__Group_0__0__Impl rule__Goal__Group_0__1 ;
    public final void rule__Goal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:891:1: ( rule__Goal__Group_0__0__Impl rule__Goal__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:892:2: rule__Goal__Group_0__0__Impl rule__Goal__Group_0__1
            {
            pushFollow(FOLLOW_rule__Goal__Group_0__0__Impl_in_rule__Goal__Group_0__01897);
            rule__Goal__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goal__Group_0__1_in_rule__Goal__Group_0__01900);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:899:1: rule__Goal__Group_0__0__Impl : ( ( rule__Goal__NameAssignment_0_0 ) ) ;
    public final void rule__Goal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:903:1: ( ( ( rule__Goal__NameAssignment_0_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:904:1: ( ( rule__Goal__NameAssignment_0_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:904:1: ( ( rule__Goal__NameAssignment_0_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:905:1: ( rule__Goal__NameAssignment_0_0 )
            {
             before(grammarAccess.getGoalAccess().getNameAssignment_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:906:1: ( rule__Goal__NameAssignment_0_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:906:2: rule__Goal__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Goal__NameAssignment_0_0_in_rule__Goal__Group_0__0__Impl1927);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:916:1: rule__Goal__Group_0__1 : rule__Goal__Group_0__1__Impl rule__Goal__Group_0__2 ;
    public final void rule__Goal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:920:1: ( rule__Goal__Group_0__1__Impl rule__Goal__Group_0__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:921:2: rule__Goal__Group_0__1__Impl rule__Goal__Group_0__2
            {
            pushFollow(FOLLOW_rule__Goal__Group_0__1__Impl_in_rule__Goal__Group_0__11957);
            rule__Goal__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goal__Group_0__2_in_rule__Goal__Group_0__11960);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:928:1: rule__Goal__Group_0__1__Impl : ( ( rule__Goal__TypeAssignment_0_1 ) ) ;
    public final void rule__Goal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:932:1: ( ( ( rule__Goal__TypeAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:933:1: ( ( rule__Goal__TypeAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:933:1: ( ( rule__Goal__TypeAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:934:1: ( rule__Goal__TypeAssignment_0_1 )
            {
             before(grammarAccess.getGoalAccess().getTypeAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:935:1: ( rule__Goal__TypeAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:935:2: rule__Goal__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Goal__TypeAssignment_0_1_in_rule__Goal__Group_0__1__Impl1987);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:945:1: rule__Goal__Group_0__2 : rule__Goal__Group_0__2__Impl rule__Goal__Group_0__3 ;
    public final void rule__Goal__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:949:1: ( rule__Goal__Group_0__2__Impl rule__Goal__Group_0__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:950:2: rule__Goal__Group_0__2__Impl rule__Goal__Group_0__3
            {
            pushFollow(FOLLOW_rule__Goal__Group_0__2__Impl_in_rule__Goal__Group_0__22017);
            rule__Goal__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goal__Group_0__3_in_rule__Goal__Group_0__22020);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:957:1: rule__Goal__Group_0__2__Impl : ( ( rule__Goal__AssetAssignment_0_2 )? ) ;
    public final void rule__Goal__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:961:1: ( ( ( rule__Goal__AssetAssignment_0_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:962:1: ( ( rule__Goal__AssetAssignment_0_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:962:1: ( ( rule__Goal__AssetAssignment_0_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:963:1: ( rule__Goal__AssetAssignment_0_2 )?
            {
             before(grammarAccess.getGoalAccess().getAssetAssignment_0_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:964:1: ( rule__Goal__AssetAssignment_0_2 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==29) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:964:2: rule__Goal__AssetAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__Goal__AssetAssignment_0_2_in_rule__Goal__Group_0__2__Impl2047);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:974:1: rule__Goal__Group_0__3 : rule__Goal__Group_0__3__Impl ;
    public final void rule__Goal__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:978:1: ( rule__Goal__Group_0__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:979:2: rule__Goal__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Goal__Group_0__3__Impl_in_rule__Goal__Group_0__32078);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:985:1: rule__Goal__Group_0__3__Impl : ( ( rule__Goal__Group_0_3__0 )* ) ;
    public final void rule__Goal__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:989:1: ( ( ( rule__Goal__Group_0_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:990:1: ( ( rule__Goal__Group_0_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:990:1: ( ( rule__Goal__Group_0_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:991:1: ( rule__Goal__Group_0_3__0 )*
            {
             before(grammarAccess.getGoalAccess().getGroup_0_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:992:1: ( rule__Goal__Group_0_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_STRING||LA9_0==28) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:992:2: rule__Goal__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Goal__Group_0_3__0_in_rule__Goal__Group_0__3__Impl2105);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1010:1: rule__Goal__Group_0_3__0 : rule__Goal__Group_0_3__0__Impl rule__Goal__Group_0_3__1 ;
    public final void rule__Goal__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1014:1: ( rule__Goal__Group_0_3__0__Impl rule__Goal__Group_0_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1015:2: rule__Goal__Group_0_3__0__Impl rule__Goal__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Goal__Group_0_3__0__Impl_in_rule__Goal__Group_0_3__02144);
            rule__Goal__Group_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Goal__Group_0_3__1_in_rule__Goal__Group_0_3__02147);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1022:1: rule__Goal__Group_0_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Goal__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1026:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1027:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1027:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1028:1: ( ',' )?
            {
             before(grammarAccess.getGoalAccess().getCommaKeyword_0_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1029:1: ( ',' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1030:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__Goal__Group_0_3__0__Impl2176); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1041:1: rule__Goal__Group_0_3__1 : rule__Goal__Group_0_3__1__Impl ;
    public final void rule__Goal__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1045:1: ( rule__Goal__Group_0_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1046:2: rule__Goal__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Goal__Group_0_3__1__Impl_in_rule__Goal__Group_0_3__12209);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1052:1: rule__Goal__Group_0_3__1__Impl : ( ( rule__Goal__PropertiesAssignment_0_3_1 ) ) ;
    public final void rule__Goal__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1056:1: ( ( ( rule__Goal__PropertiesAssignment_0_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1057:1: ( ( rule__Goal__PropertiesAssignment_0_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1057:1: ( ( rule__Goal__PropertiesAssignment_0_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1058:1: ( rule__Goal__PropertiesAssignment_0_3_1 )
            {
             before(grammarAccess.getGoalAccess().getPropertiesAssignment_0_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1059:1: ( rule__Goal__PropertiesAssignment_0_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1059:2: rule__Goal__PropertiesAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Goal__PropertiesAssignment_0_3_1_in_rule__Goal__Group_0_3__1__Impl2236);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1073:1: rule__SecurityGoal__Group__0 : rule__SecurityGoal__Group__0__Impl rule__SecurityGoal__Group__1 ;
    public final void rule__SecurityGoal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1077:1: ( rule__SecurityGoal__Group__0__Impl rule__SecurityGoal__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1078:2: rule__SecurityGoal__Group__0__Impl rule__SecurityGoal__Group__1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__0__Impl_in_rule__SecurityGoal__Group__02270);
            rule__SecurityGoal__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group__1_in_rule__SecurityGoal__Group__02273);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1085:1: rule__SecurityGoal__Group__0__Impl : ( ( rule__SecurityGoal__NameAssignment_0 ) ) ;
    public final void rule__SecurityGoal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1089:1: ( ( ( rule__SecurityGoal__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1090:1: ( ( rule__SecurityGoal__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1090:1: ( ( rule__SecurityGoal__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1091:1: ( rule__SecurityGoal__NameAssignment_0 )
            {
             before(grammarAccess.getSecurityGoalAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1092:1: ( rule__SecurityGoal__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1092:2: rule__SecurityGoal__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__SecurityGoal__NameAssignment_0_in_rule__SecurityGoal__Group__0__Impl2300);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1102:1: rule__SecurityGoal__Group__1 : rule__SecurityGoal__Group__1__Impl rule__SecurityGoal__Group__2 ;
    public final void rule__SecurityGoal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1106:1: ( rule__SecurityGoal__Group__1__Impl rule__SecurityGoal__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1107:2: rule__SecurityGoal__Group__1__Impl rule__SecurityGoal__Group__2
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__1__Impl_in_rule__SecurityGoal__Group__12330);
            rule__SecurityGoal__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group__2_in_rule__SecurityGoal__Group__12333);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1114:1: rule__SecurityGoal__Group__1__Impl : ( ( rule__SecurityGoal__TypeAssignment_1 ) ) ;
    public final void rule__SecurityGoal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1118:1: ( ( ( rule__SecurityGoal__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1119:1: ( ( rule__SecurityGoal__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1119:1: ( ( rule__SecurityGoal__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1120:1: ( rule__SecurityGoal__TypeAssignment_1 )
            {
             before(grammarAccess.getSecurityGoalAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1121:1: ( rule__SecurityGoal__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1121:2: rule__SecurityGoal__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__TypeAssignment_1_in_rule__SecurityGoal__Group__1__Impl2360);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1131:1: rule__SecurityGoal__Group__2 : rule__SecurityGoal__Group__2__Impl rule__SecurityGoal__Group__3 ;
    public final void rule__SecurityGoal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1135:1: ( rule__SecurityGoal__Group__2__Impl rule__SecurityGoal__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1136:2: rule__SecurityGoal__Group__2__Impl rule__SecurityGoal__Group__3
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__2__Impl_in_rule__SecurityGoal__Group__22390);
            rule__SecurityGoal__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group__3_in_rule__SecurityGoal__Group__22393);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1143:1: rule__SecurityGoal__Group__2__Impl : ( ( rule__SecurityGoal__AssetAssignment_2 )? ) ;
    public final void rule__SecurityGoal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1147:1: ( ( ( rule__SecurityGoal__AssetAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1148:1: ( ( rule__SecurityGoal__AssetAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1148:1: ( ( rule__SecurityGoal__AssetAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1149:1: ( rule__SecurityGoal__AssetAssignment_2 )?
            {
             before(grammarAccess.getSecurityGoalAccess().getAssetAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1150:1: ( rule__SecurityGoal__AssetAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==29) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1150:2: rule__SecurityGoal__AssetAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SecurityGoal__AssetAssignment_2_in_rule__SecurityGoal__Group__2__Impl2420);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1160:1: rule__SecurityGoal__Group__3 : rule__SecurityGoal__Group__3__Impl ;
    public final void rule__SecurityGoal__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1164:1: ( rule__SecurityGoal__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1165:2: rule__SecurityGoal__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group__3__Impl_in_rule__SecurityGoal__Group__32451);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1171:1: rule__SecurityGoal__Group__3__Impl : ( ( rule__SecurityGoal__Group_3__0 )* ) ;
    public final void rule__SecurityGoal__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1175:1: ( ( ( rule__SecurityGoal__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1176:1: ( ( rule__SecurityGoal__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1176:1: ( ( rule__SecurityGoal__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1177:1: ( rule__SecurityGoal__Group_3__0 )*
            {
             before(grammarAccess.getSecurityGoalAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1178:1: ( rule__SecurityGoal__Group_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_STRING||LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1178:2: rule__SecurityGoal__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__SecurityGoal__Group_3__0_in_rule__SecurityGoal__Group__3__Impl2478);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1196:1: rule__SecurityGoal__Group_3__0 : rule__SecurityGoal__Group_3__0__Impl rule__SecurityGoal__Group_3__1 ;
    public final void rule__SecurityGoal__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1200:1: ( rule__SecurityGoal__Group_3__0__Impl rule__SecurityGoal__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1201:2: rule__SecurityGoal__Group_3__0__Impl rule__SecurityGoal__Group_3__1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group_3__0__Impl_in_rule__SecurityGoal__Group_3__02517);
            rule__SecurityGoal__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SecurityGoal__Group_3__1_in_rule__SecurityGoal__Group_3__02520);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1208:1: rule__SecurityGoal__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__SecurityGoal__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1212:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1213:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1213:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1214:1: ( ',' )?
            {
             before(grammarAccess.getSecurityGoalAccess().getCommaKeyword_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1215:1: ( ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1216:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__SecurityGoal__Group_3__0__Impl2549); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1227:1: rule__SecurityGoal__Group_3__1 : rule__SecurityGoal__Group_3__1__Impl ;
    public final void rule__SecurityGoal__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1231:1: ( rule__SecurityGoal__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1232:2: rule__SecurityGoal__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__SecurityGoal__Group_3__1__Impl_in_rule__SecurityGoal__Group_3__12582);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1238:1: rule__SecurityGoal__Group_3__1__Impl : ( ( rule__SecurityGoal__PropertiesAssignment_3_1 ) ) ;
    public final void rule__SecurityGoal__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1242:1: ( ( ( rule__SecurityGoal__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1243:1: ( ( rule__SecurityGoal__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1243:1: ( ( rule__SecurityGoal__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1244:1: ( rule__SecurityGoal__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getSecurityGoalAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1245:1: ( rule__SecurityGoal__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1245:2: rule__SecurityGoal__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__SecurityGoal__PropertiesAssignment_3_1_in_rule__SecurityGoal__Group_3__1__Impl2609);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1259:1: rule__Requirement__Group__0 : rule__Requirement__Group__0__Impl rule__Requirement__Group__1 ;
    public final void rule__Requirement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1263:1: ( rule__Requirement__Group__0__Impl rule__Requirement__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1264:2: rule__Requirement__Group__0__Impl rule__Requirement__Group__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__02643);
            rule__Requirement__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__02646);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1271:1: rule__Requirement__Group__0__Impl : ( ( rule__Requirement__NameAssignment_0 ) ) ;
    public final void rule__Requirement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1275:1: ( ( ( rule__Requirement__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1276:1: ( ( rule__Requirement__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1276:1: ( ( rule__Requirement__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1277:1: ( rule__Requirement__NameAssignment_0 )
            {
             before(grammarAccess.getRequirementAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1278:1: ( rule__Requirement__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1278:2: rule__Requirement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Requirement__NameAssignment_0_in_rule__Requirement__Group__0__Impl2673);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1288:1: rule__Requirement__Group__1 : rule__Requirement__Group__1__Impl rule__Requirement__Group__2 ;
    public final void rule__Requirement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1292:1: ( rule__Requirement__Group__1__Impl rule__Requirement__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1293:2: rule__Requirement__Group__1__Impl rule__Requirement__Group__2
            {
            pushFollow(FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__12703);
            rule__Requirement__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__12706);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1300:1: rule__Requirement__Group__1__Impl : ( ( rule__Requirement__TypeAssignment_1 ) ) ;
    public final void rule__Requirement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1304:1: ( ( ( rule__Requirement__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1305:1: ( ( rule__Requirement__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1305:1: ( ( rule__Requirement__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1306:1: ( rule__Requirement__TypeAssignment_1 )
            {
             before(grammarAccess.getRequirementAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1307:1: ( rule__Requirement__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1307:2: rule__Requirement__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Requirement__TypeAssignment_1_in_rule__Requirement__Group__1__Impl2733);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1317:1: rule__Requirement__Group__2 : rule__Requirement__Group__2__Impl rule__Requirement__Group__3 ;
    public final void rule__Requirement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1321:1: ( rule__Requirement__Group__2__Impl rule__Requirement__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1322:2: rule__Requirement__Group__2__Impl rule__Requirement__Group__3
            {
            pushFollow(FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__22763);
            rule__Requirement__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group__3_in_rule__Requirement__Group__22766);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1329:1: rule__Requirement__Group__2__Impl : ( ( rule__Requirement__AssetAssignment_2 )? ) ;
    public final void rule__Requirement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1333:1: ( ( ( rule__Requirement__AssetAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1334:1: ( ( rule__Requirement__AssetAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1334:1: ( ( rule__Requirement__AssetAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1335:1: ( rule__Requirement__AssetAssignment_2 )?
            {
             before(grammarAccess.getRequirementAccess().getAssetAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1336:1: ( rule__Requirement__AssetAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==29) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1336:2: rule__Requirement__AssetAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Requirement__AssetAssignment_2_in_rule__Requirement__Group__2__Impl2793);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1346:1: rule__Requirement__Group__3 : rule__Requirement__Group__3__Impl ;
    public final void rule__Requirement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1350:1: ( rule__Requirement__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1351:2: rule__Requirement__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group__3__Impl_in_rule__Requirement__Group__32824);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1357:1: rule__Requirement__Group__3__Impl : ( ( rule__Requirement__Group_3__0 )* ) ;
    public final void rule__Requirement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1361:1: ( ( ( rule__Requirement__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1362:1: ( ( rule__Requirement__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1362:1: ( ( rule__Requirement__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1363:1: ( rule__Requirement__Group_3__0 )*
            {
             before(grammarAccess.getRequirementAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1364:1: ( rule__Requirement__Group_3__0 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_STRING||LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1364:2: rule__Requirement__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Requirement__Group_3__0_in_rule__Requirement__Group__3__Impl2851);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1382:1: rule__Requirement__Group_3__0 : rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1 ;
    public final void rule__Requirement__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1386:1: ( rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1387:2: rule__Requirement__Group_3__0__Impl rule__Requirement__Group_3__1
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__0__Impl_in_rule__Requirement__Group_3__02890);
            rule__Requirement__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Requirement__Group_3__1_in_rule__Requirement__Group_3__02893);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1394:1: rule__Requirement__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Requirement__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1398:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1399:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1399:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1400:1: ( ',' )?
            {
             before(grammarAccess.getRequirementAccess().getCommaKeyword_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1401:1: ( ',' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1402:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__Requirement__Group_3__0__Impl2922); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1413:1: rule__Requirement__Group_3__1 : rule__Requirement__Group_3__1__Impl ;
    public final void rule__Requirement__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1417:1: ( rule__Requirement__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1418:2: rule__Requirement__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Requirement__Group_3__1__Impl_in_rule__Requirement__Group_3__12955);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1424:1: rule__Requirement__Group_3__1__Impl : ( ( rule__Requirement__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Requirement__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1428:1: ( ( ( rule__Requirement__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1429:1: ( ( rule__Requirement__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1429:1: ( ( rule__Requirement__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1430:1: ( rule__Requirement__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getRequirementAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1431:1: ( rule__Requirement__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1431:2: rule__Requirement__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Requirement__PropertiesAssignment_3_1_in_rule__Requirement__Group_3__1__Impl2982);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1445:1: rule__Domain__Group_0__0 : rule__Domain__Group_0__0__Impl rule__Domain__Group_0__1 ;
    public final void rule__Domain__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1449:1: ( rule__Domain__Group_0__0__Impl rule__Domain__Group_0__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1450:2: rule__Domain__Group_0__0__Impl rule__Domain__Group_0__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_0__0__Impl_in_rule__Domain__Group_0__03016);
            rule__Domain__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_0__1_in_rule__Domain__Group_0__03019);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1457:1: rule__Domain__Group_0__0__Impl : ( ( rule__Domain__NameAssignment_0_0 ) ) ;
    public final void rule__Domain__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1461:1: ( ( ( rule__Domain__NameAssignment_0_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1462:1: ( ( rule__Domain__NameAssignment_0_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1462:1: ( ( rule__Domain__NameAssignment_0_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1463:1: ( rule__Domain__NameAssignment_0_0 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_0_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1464:1: ( rule__Domain__NameAssignment_0_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1464:2: rule__Domain__NameAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_0_0_in_rule__Domain__Group_0__0__Impl3046);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1474:1: rule__Domain__Group_0__1 : rule__Domain__Group_0__1__Impl rule__Domain__Group_0__2 ;
    public final void rule__Domain__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1478:1: ( rule__Domain__Group_0__1__Impl rule__Domain__Group_0__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1479:2: rule__Domain__Group_0__1__Impl rule__Domain__Group_0__2
            {
            pushFollow(FOLLOW_rule__Domain__Group_0__1__Impl_in_rule__Domain__Group_0__13076);
            rule__Domain__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_0__2_in_rule__Domain__Group_0__13079);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1486:1: rule__Domain__Group_0__1__Impl : ( ( rule__Domain__TypeAssignment_0_1 ) ) ;
    public final void rule__Domain__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1490:1: ( ( ( rule__Domain__TypeAssignment_0_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1491:1: ( ( rule__Domain__TypeAssignment_0_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1491:1: ( ( rule__Domain__TypeAssignment_0_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1492:1: ( rule__Domain__TypeAssignment_0_1 )
            {
             before(grammarAccess.getDomainAccess().getTypeAssignment_0_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1493:1: ( rule__Domain__TypeAssignment_0_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1493:2: rule__Domain__TypeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Domain__TypeAssignment_0_1_in_rule__Domain__Group_0__1__Impl3106);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1503:1: rule__Domain__Group_0__2 : rule__Domain__Group_0__2__Impl rule__Domain__Group_0__3 ;
    public final void rule__Domain__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1507:1: ( rule__Domain__Group_0__2__Impl rule__Domain__Group_0__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1508:2: rule__Domain__Group_0__2__Impl rule__Domain__Group_0__3
            {
            pushFollow(FOLLOW_rule__Domain__Group_0__2__Impl_in_rule__Domain__Group_0__23136);
            rule__Domain__Group_0__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_0__3_in_rule__Domain__Group_0__23139);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1515:1: rule__Domain__Group_0__2__Impl : ( ( rule__Domain__AssetAssignment_0_2 )? ) ;
    public final void rule__Domain__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1519:1: ( ( ( rule__Domain__AssetAssignment_0_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1520:1: ( ( rule__Domain__AssetAssignment_0_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1520:1: ( ( rule__Domain__AssetAssignment_0_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1521:1: ( rule__Domain__AssetAssignment_0_2 )?
            {
             before(grammarAccess.getDomainAccess().getAssetAssignment_0_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1522:1: ( rule__Domain__AssetAssignment_0_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1==29) ) {
                    alt17=1;
                }
            }
            switch (alt17) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1522:2: rule__Domain__AssetAssignment_0_2
                    {
                    pushFollow(FOLLOW_rule__Domain__AssetAssignment_0_2_in_rule__Domain__Group_0__2__Impl3166);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1532:1: rule__Domain__Group_0__3 : rule__Domain__Group_0__3__Impl ;
    public final void rule__Domain__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1536:1: ( rule__Domain__Group_0__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1537:2: rule__Domain__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_0__3__Impl_in_rule__Domain__Group_0__33197);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1543:1: rule__Domain__Group_0__3__Impl : ( ( rule__Domain__Group_0_3__0 )* ) ;
    public final void rule__Domain__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1547:1: ( ( ( rule__Domain__Group_0_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1548:1: ( ( rule__Domain__Group_0_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1548:1: ( ( rule__Domain__Group_0_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1549:1: ( rule__Domain__Group_0_3__0 )*
            {
             before(grammarAccess.getDomainAccess().getGroup_0_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1550:1: ( rule__Domain__Group_0_3__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_STRING||LA18_0==28) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1550:2: rule__Domain__Group_0_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__Group_0_3__0_in_rule__Domain__Group_0__3__Impl3224);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1568:1: rule__Domain__Group_0_3__0 : rule__Domain__Group_0_3__0__Impl rule__Domain__Group_0_3__1 ;
    public final void rule__Domain__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1572:1: ( rule__Domain__Group_0_3__0__Impl rule__Domain__Group_0_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1573:2: rule__Domain__Group_0_3__0__Impl rule__Domain__Group_0_3__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_0_3__0__Impl_in_rule__Domain__Group_0_3__03263);
            rule__Domain__Group_0_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_0_3__1_in_rule__Domain__Group_0_3__03266);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1580:1: rule__Domain__Group_0_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Domain__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1584:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1585:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1585:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1586:1: ( ',' )?
            {
             before(grammarAccess.getDomainAccess().getCommaKeyword_0_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1587:1: ( ',' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1588:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__Domain__Group_0_3__0__Impl3295); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1599:1: rule__Domain__Group_0_3__1 : rule__Domain__Group_0_3__1__Impl ;
    public final void rule__Domain__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1603:1: ( rule__Domain__Group_0_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1604:2: rule__Domain__Group_0_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_0_3__1__Impl_in_rule__Domain__Group_0_3__13328);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1610:1: rule__Domain__Group_0_3__1__Impl : ( ( rule__Domain__PropertiesAssignment_0_3_1 ) ) ;
    public final void rule__Domain__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1614:1: ( ( ( rule__Domain__PropertiesAssignment_0_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1615:1: ( ( rule__Domain__PropertiesAssignment_0_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1615:1: ( ( rule__Domain__PropertiesAssignment_0_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1616:1: ( rule__Domain__PropertiesAssignment_0_3_1 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_0_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1617:1: ( rule__Domain__PropertiesAssignment_0_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1617:2: rule__Domain__PropertiesAssignment_0_3_1
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_0_3_1_in_rule__Domain__Group_0_3__1__Impl3355);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1631:1: rule__Asset__Group__0 : rule__Asset__Group__0__Impl rule__Asset__Group__1 ;
    public final void rule__Asset__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1635:1: ( rule__Asset__Group__0__Impl rule__Asset__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1636:2: rule__Asset__Group__0__Impl rule__Asset__Group__1
            {
            pushFollow(FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__03389);
            rule__Asset__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__03392);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1643:1: rule__Asset__Group__0__Impl : ( ( rule__Asset__NameAssignment_0 ) ) ;
    public final void rule__Asset__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1647:1: ( ( ( rule__Asset__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1648:1: ( ( rule__Asset__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1648:1: ( ( rule__Asset__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1649:1: ( rule__Asset__NameAssignment_0 )
            {
             before(grammarAccess.getAssetAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1650:1: ( rule__Asset__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1650:2: rule__Asset__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Asset__NameAssignment_0_in_rule__Asset__Group__0__Impl3419);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1660:1: rule__Asset__Group__1 : rule__Asset__Group__1__Impl rule__Asset__Group__2 ;
    public final void rule__Asset__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1664:1: ( rule__Asset__Group__1__Impl rule__Asset__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1665:2: rule__Asset__Group__1__Impl rule__Asset__Group__2
            {
            pushFollow(FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__13449);
            rule__Asset__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__13452);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1672:1: rule__Asset__Group__1__Impl : ( '$' ) ;
    public final void rule__Asset__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1676:1: ( ( '$' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1677:1: ( '$' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1677:1: ( '$' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1678:1: '$'
            {
             before(grammarAccess.getAssetAccess().getDollarSignKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__Asset__Group__1__Impl3480); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1691:1: rule__Asset__Group__2 : rule__Asset__Group__2__Impl ;
    public final void rule__Asset__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1695:1: ( rule__Asset__Group__2__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1696:2: rule__Asset__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__23511);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1702:1: rule__Asset__Group__2__Impl : ( ( rule__Asset__ValueAssignment_2 )? ) ;
    public final void rule__Asset__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1706:1: ( ( ( rule__Asset__ValueAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1707:1: ( ( rule__Asset__ValueAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1707:1: ( ( rule__Asset__ValueAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1708:1: ( rule__Asset__ValueAssignment_2 )?
            {
             before(grammarAccess.getAssetAccess().getValueAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1709:1: ( rule__Asset__ValueAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1709:2: rule__Asset__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Asset__ValueAssignment_2_in_rule__Asset__Group__2__Impl3538);
                    rule__Asset__ValueAssignment_2();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAssetAccess().getValueAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start rule__Actor__Group__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1725:1: rule__Actor__Group__0 : rule__Actor__Group__0__Impl rule__Actor__Group__1 ;
    public final void rule__Actor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1729:1: ( rule__Actor__Group__0__Impl rule__Actor__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1730:2: rule__Actor__Group__0__Impl rule__Actor__Group__1
            {
            pushFollow(FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03575);
            rule__Actor__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03578);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1737:1: rule__Actor__Group__0__Impl : ( ( rule__Actor__NameAssignment_0 ) ) ;
    public final void rule__Actor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1741:1: ( ( ( rule__Actor__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1742:1: ( ( rule__Actor__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1742:1: ( ( rule__Actor__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1743:1: ( rule__Actor__NameAssignment_0 )
            {
             before(grammarAccess.getActorAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1744:1: ( rule__Actor__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1744:2: rule__Actor__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3605);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1754:1: rule__Actor__Group__1 : rule__Actor__Group__1__Impl rule__Actor__Group__2 ;
    public final void rule__Actor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1758:1: ( rule__Actor__Group__1__Impl rule__Actor__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1759:2: rule__Actor__Group__1__Impl rule__Actor__Group__2
            {
            pushFollow(FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13635);
            rule__Actor__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13638);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1766:1: rule__Actor__Group__1__Impl : ( ( rule__Actor__TypeAssignment_1 ) ) ;
    public final void rule__Actor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1770:1: ( ( ( rule__Actor__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1771:1: ( ( rule__Actor__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1771:1: ( ( rule__Actor__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1772:1: ( rule__Actor__TypeAssignment_1 )
            {
             before(grammarAccess.getActorAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1773:1: ( rule__Actor__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1773:2: rule__Actor__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Actor__TypeAssignment_1_in_rule__Actor__Group__1__Impl3665);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1783:1: rule__Actor__Group__2 : rule__Actor__Group__2__Impl rule__Actor__Group__3 ;
    public final void rule__Actor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1787:1: ( rule__Actor__Group__2__Impl rule__Actor__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1788:2: rule__Actor__Group__2__Impl rule__Actor__Group__3
            {
            pushFollow(FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23695);
            rule__Actor__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23698);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1795:1: rule__Actor__Group__2__Impl : ( ( rule__Actor__AssetAssignment_2 )? ) ;
    public final void rule__Actor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1799:1: ( ( ( rule__Actor__AssetAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1800:1: ( ( rule__Actor__AssetAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1800:1: ( ( rule__Actor__AssetAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1801:1: ( rule__Actor__AssetAssignment_2 )?
            {
             before(grammarAccess.getActorAccess().getAssetAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1802:1: ( rule__Actor__AssetAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==29) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1802:2: rule__Actor__AssetAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Actor__AssetAssignment_2_in_rule__Actor__Group__2__Impl3725);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1812:1: rule__Actor__Group__3 : rule__Actor__Group__3__Impl ;
    public final void rule__Actor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1816:1: ( rule__Actor__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1817:2: rule__Actor__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__33756);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1823:1: rule__Actor__Group__3__Impl : ( ( rule__Actor__Group_3__0 )* ) ;
    public final void rule__Actor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1827:1: ( ( ( rule__Actor__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1828:1: ( ( rule__Actor__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1828:1: ( ( rule__Actor__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1829:1: ( rule__Actor__Group_3__0 )*
            {
             before(grammarAccess.getActorAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1830:1: ( rule__Actor__Group_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_STRING||LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1830:2: rule__Actor__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__3__Impl3783);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1848:1: rule__Actor__Group_3__0 : rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 ;
    public final void rule__Actor__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1852:1: ( rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1853:2: rule__Actor__Group_3__0__Impl rule__Actor__Group_3__1
            {
            pushFollow(FOLLOW_rule__Actor__Group_3__0__Impl_in_rule__Actor__Group_3__03822);
            rule__Actor__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__03825);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1860:1: rule__Actor__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Actor__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1864:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1865:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1865:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1866:1: ( ',' )?
            {
             before(grammarAccess.getActorAccess().getCommaKeyword_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1867:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1868:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__Actor__Group_3__0__Impl3854); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1879:1: rule__Actor__Group_3__1 : rule__Actor__Group_3__1__Impl ;
    public final void rule__Actor__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1883:1: ( rule__Actor__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1884:2: rule__Actor__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Actor__Group_3__1__Impl_in_rule__Actor__Group_3__13887);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1890:1: rule__Actor__Group_3__1__Impl : ( ( rule__Actor__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Actor__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1894:1: ( ( ( rule__Actor__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1895:1: ( ( rule__Actor__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1895:1: ( ( rule__Actor__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1896:1: ( rule__Actor__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getActorAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1897:1: ( rule__Actor__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1897:2: rule__Actor__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Actor__PropertiesAssignment_3_1_in_rule__Actor__Group_3__1__Impl3914);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1911:1: rule__Action__Group__0 : rule__Action__Group__0__Impl rule__Action__Group__1 ;
    public final void rule__Action__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1915:1: ( rule__Action__Group__0__Impl rule__Action__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1916:2: rule__Action__Group__0__Impl rule__Action__Group__1
            {
            pushFollow(FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03948);
            rule__Action__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03951);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1923:1: rule__Action__Group__0__Impl : ( ( rule__Action__NameAssignment_0 ) ) ;
    public final void rule__Action__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1927:1: ( ( ( rule__Action__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1928:1: ( ( rule__Action__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1928:1: ( ( rule__Action__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1929:1: ( rule__Action__NameAssignment_0 )
            {
             before(grammarAccess.getActionAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1930:1: ( rule__Action__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1930:2: rule__Action__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__0__Impl3978);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1940:1: rule__Action__Group__1 : rule__Action__Group__1__Impl rule__Action__Group__2 ;
    public final void rule__Action__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1944:1: ( rule__Action__Group__1__Impl rule__Action__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1945:2: rule__Action__Group__1__Impl rule__Action__Group__2
            {
            pushFollow(FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14008);
            rule__Action__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14011);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1952:1: rule__Action__Group__1__Impl : ( ( rule__Action__TypeAssignment_1 ) ) ;
    public final void rule__Action__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1956:1: ( ( ( rule__Action__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1957:1: ( ( rule__Action__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1957:1: ( ( rule__Action__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1958:1: ( rule__Action__TypeAssignment_1 )
            {
             before(grammarAccess.getActionAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1959:1: ( rule__Action__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1959:2: rule__Action__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__1__Impl4038);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1969:1: rule__Action__Group__2 : rule__Action__Group__2__Impl rule__Action__Group__3 ;
    public final void rule__Action__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1973:1: ( rule__Action__Group__2__Impl rule__Action__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1974:2: rule__Action__Group__2__Impl rule__Action__Group__3
            {
            pushFollow(FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24068);
            rule__Action__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24071);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1981:1: rule__Action__Group__2__Impl : ( ( rule__Action__AssetAssignment_2 )? ) ;
    public final void rule__Action__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1985:1: ( ( ( rule__Action__AssetAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1986:1: ( ( rule__Action__AssetAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1986:1: ( ( rule__Action__AssetAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1987:1: ( rule__Action__AssetAssignment_2 )?
            {
             before(grammarAccess.getActionAccess().getAssetAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1988:1: ( rule__Action__AssetAssignment_2 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==29) ) {
                    alt24=1;
                }
            }
            switch (alt24) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1988:2: rule__Action__AssetAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Action__AssetAssignment_2_in_rule__Action__Group__2__Impl4098);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:1998:1: rule__Action__Group__3 : rule__Action__Group__3__Impl ;
    public final void rule__Action__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2002:1: ( rule__Action__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2003:2: rule__Action__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34129);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2009:1: rule__Action__Group__3__Impl : ( ( rule__Action__Group_3__0 )* ) ;
    public final void rule__Action__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2013:1: ( ( ( rule__Action__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2014:1: ( ( rule__Action__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2014:1: ( ( rule__Action__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2015:1: ( rule__Action__Group_3__0 )*
            {
             before(grammarAccess.getActionAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2016:1: ( rule__Action__Group_3__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_STRING||LA25_0==28) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2016:2: rule__Action__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl4156);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2034:1: rule__Action__Group_3__0 : rule__Action__Group_3__0__Impl rule__Action__Group_3__1 ;
    public final void rule__Action__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2038:1: ( rule__Action__Group_3__0__Impl rule__Action__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2039:2: rule__Action__Group_3__0__Impl rule__Action__Group_3__1
            {
            pushFollow(FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__04195);
            rule__Action__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04198);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2046:1: rule__Action__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Action__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2050:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2051:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2051:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2052:1: ( ',' )?
            {
             before(grammarAccess.getActionAccess().getCommaKeyword_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2053:1: ( ',' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==28) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2054:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__Action__Group_3__0__Impl4227); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2065:1: rule__Action__Group_3__1 : rule__Action__Group_3__1__Impl ;
    public final void rule__Action__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2069:1: ( rule__Action__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2070:2: rule__Action__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__14260);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2076:1: rule__Action__Group_3__1__Impl : ( ( rule__Action__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Action__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2080:1: ( ( ( rule__Action__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2081:1: ( ( rule__Action__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2081:1: ( ( rule__Action__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2082:1: ( rule__Action__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getActionAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2083:1: ( rule__Action__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2083:2: rule__Action__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Action__PropertiesAssignment_3_1_in_rule__Action__Group_3__1__Impl4287);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2097:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2101:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2102:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__04321);
            rule__Resource__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__04324);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2109:1: rule__Resource__Group__0__Impl : ( ( rule__Resource__NameAssignment_0 ) ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2113:1: ( ( ( rule__Resource__NameAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2114:1: ( ( rule__Resource__NameAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2114:1: ( ( rule__Resource__NameAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2115:1: ( rule__Resource__NameAssignment_0 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2116:1: ( rule__Resource__NameAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2116:2: rule__Resource__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Resource__NameAssignment_0_in_rule__Resource__Group__0__Impl4351);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2126:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2130:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2131:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__14381);
            rule__Resource__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__14384);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2138:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__TypeAssignment_1 ) ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2142:1: ( ( ( rule__Resource__TypeAssignment_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2143:1: ( ( rule__Resource__TypeAssignment_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2143:1: ( ( rule__Resource__TypeAssignment_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2144:1: ( rule__Resource__TypeAssignment_1 )
            {
             before(grammarAccess.getResourceAccess().getTypeAssignment_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2145:1: ( rule__Resource__TypeAssignment_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2145:2: rule__Resource__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Resource__TypeAssignment_1_in_rule__Resource__Group__1__Impl4411);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2155:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2159:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2160:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__24441);
            rule__Resource__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__24444);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2167:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__AssetAssignment_2 )? ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2171:1: ( ( ( rule__Resource__AssetAssignment_2 )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2172:1: ( ( rule__Resource__AssetAssignment_2 )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2172:1: ( ( rule__Resource__AssetAssignment_2 )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2173:1: ( rule__Resource__AssetAssignment_2 )?
            {
             before(grammarAccess.getResourceAccess().getAssetAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2174:1: ( rule__Resource__AssetAssignment_2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                int LA27_1 = input.LA(2);

                if ( (LA27_1==29) ) {
                    alt27=1;
                }
            }
            switch (alt27) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2174:2: rule__Resource__AssetAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Resource__AssetAssignment_2_in_rule__Resource__Group__2__Impl4471);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2184:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2188:1: ( rule__Resource__Group__3__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2189:2: rule__Resource__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__34502);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2195:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__Group_3__0 )* ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2199:1: ( ( ( rule__Resource__Group_3__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2200:1: ( ( rule__Resource__Group_3__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2200:1: ( ( rule__Resource__Group_3__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2201:1: ( rule__Resource__Group_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_3()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2202:1: ( rule__Resource__Group_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_STRING||LA28_0==28) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2202:2: rule__Resource__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Resource__Group_3__0_in_rule__Resource__Group__3__Impl4529);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2220:1: rule__Resource__Group_3__0 : rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 ;
    public final void rule__Resource__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2224:1: ( rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2225:2: rule__Resource__Group_3__0__Impl rule__Resource__Group_3__1
            {
            pushFollow(FOLLOW_rule__Resource__Group_3__0__Impl_in_rule__Resource__Group_3__04568);
            rule__Resource__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Resource__Group_3__1_in_rule__Resource__Group_3__04571);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2232:1: rule__Resource__Group_3__0__Impl : ( ( ',' )? ) ;
    public final void rule__Resource__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2236:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2237:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2237:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2238:1: ( ',' )?
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_3_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2239:1: ( ',' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==28) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2240:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__Resource__Group_3__0__Impl4600); 

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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2251:1: rule__Resource__Group_3__1 : rule__Resource__Group_3__1__Impl ;
    public final void rule__Resource__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2255:1: ( rule__Resource__Group_3__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2256:2: rule__Resource__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Resource__Group_3__1__Impl_in_rule__Resource__Group_3__14633);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2262:1: rule__Resource__Group_3__1__Impl : ( ( rule__Resource__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Resource__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2266:1: ( ( ( rule__Resource__PropertiesAssignment_3_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2267:1: ( ( rule__Resource__PropertiesAssignment_3_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2267:1: ( ( rule__Resource__PropertiesAssignment_3_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2268:1: ( rule__Resource__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getResourceAccess().getPropertiesAssignment_3_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2269:1: ( rule__Resource__PropertiesAssignment_3_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2269:2: rule__Resource__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Resource__PropertiesAssignment_3_1_in_rule__Resource__Group_3__1__Impl4660);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2283:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2287:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2288:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04694);
            rule__Relationship__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04697);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2295:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__TypeAssignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2299:1: ( ( ( rule__Relationship__TypeAssignment_0 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2300:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2300:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2301:1: ( rule__Relationship__TypeAssignment_0 )
            {
             before(grammarAccess.getRelationshipAccess().getTypeAssignment_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2302:1: ( rule__Relationship__TypeAssignment_0 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2302:2: rule__Relationship__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl4724);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2312:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2316:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2317:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__14754);
            rule__Relationship__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__14757);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2324:1: rule__Relationship__Group__1__Impl : ( '(' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2328:1: ( ( '(' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2329:1: ( '(' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2329:1: ( '(' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2330:1: '('
            {
             before(grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__Relationship__Group__1__Impl4785); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2343:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2347:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2348:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__24816);
            rule__Relationship__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__24819);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2355:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__SourceAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2359:1: ( ( ( rule__Relationship__SourceAssignment_2 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2360:1: ( ( rule__Relationship__SourceAssignment_2 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2360:1: ( ( rule__Relationship__SourceAssignment_2 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2361:1: ( rule__Relationship__SourceAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getSourceAssignment_2()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2362:1: ( rule__Relationship__SourceAssignment_2 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2362:2: rule__Relationship__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Relationship__SourceAssignment_2_in_rule__Relationship__Group__2__Impl4846);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2372:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2376:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2377:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__34876);
            rule__Relationship__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__34879);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2384:1: rule__Relationship__Group__3__Impl : ( ',' ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2388:1: ( ( ',' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2389:1: ( ',' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2389:1: ( ',' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2390:1: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_3()); 
            match(input,28,FOLLOW_28_in_rule__Relationship__Group__3__Impl4907); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2403:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2407:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2408:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__44938);
            rule__Relationship__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__44941);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2415:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__TargetAssignment_4 ) ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2419:1: ( ( ( rule__Relationship__TargetAssignment_4 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2420:1: ( ( rule__Relationship__TargetAssignment_4 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2420:1: ( ( rule__Relationship__TargetAssignment_4 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2421:1: ( rule__Relationship__TargetAssignment_4 )
            {
             before(grammarAccess.getRelationshipAccess().getTargetAssignment_4()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2422:1: ( rule__Relationship__TargetAssignment_4 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2422:2: rule__Relationship__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Relationship__TargetAssignment_4_in_rule__Relationship__Group__4__Impl4968);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2432:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl rule__Relationship__Group__6 ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2436:1: ( rule__Relationship__Group__5__Impl rule__Relationship__Group__6 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2437:2: rule__Relationship__Group__5__Impl rule__Relationship__Group__6
            {
            pushFollow(FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__54998);
            rule__Relationship__Group__5__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__55001);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2444:1: rule__Relationship__Group__5__Impl : ( ')' ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2448:1: ( ( ')' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2449:1: ( ')' )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2449:1: ( ')' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2450:1: ')'
            {
             before(grammarAccess.getRelationshipAccess().getRightParenthesisKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__Relationship__Group__5__Impl5029); 
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


    // $ANTLR start rule__Relationship__Group__6
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2463:1: rule__Relationship__Group__6 : rule__Relationship__Group__6__Impl ;
    public final void rule__Relationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2467:1: ( rule__Relationship__Group__6__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2468:2: rule__Relationship__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__65060);
            rule__Relationship__Group__6__Impl();
            _fsp--;


            }

        }
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2474:1: rule__Relationship__Group__6__Impl : ( ( rule__Relationship__Group_6__0 )* ) ;
    public final void rule__Relationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2478:1: ( ( ( rule__Relationship__Group_6__0 )* ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2479:1: ( ( rule__Relationship__Group_6__0 )* )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2479:1: ( ( rule__Relationship__Group_6__0 )* )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2480:1: ( rule__Relationship__Group_6__0 )*
            {
             before(grammarAccess.getRelationshipAccess().getGroup_6()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2481:1: ( rule__Relationship__Group_6__0 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_STRING||LA30_0==28) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2481:2: rule__Relationship__Group_6__0
            	    {
            	    pushFollow(FOLLOW_rule__Relationship__Group_6__0_in_rule__Relationship__Group__6__Impl5087);
            	    rule__Relationship__Group_6__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getRelationshipAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start rule__Relationship__Group_6__0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2505:1: rule__Relationship__Group_6__0 : rule__Relationship__Group_6__0__Impl rule__Relationship__Group_6__1 ;
    public final void rule__Relationship__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2509:1: ( rule__Relationship__Group_6__0__Impl rule__Relationship__Group_6__1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2510:2: rule__Relationship__Group_6__0__Impl rule__Relationship__Group_6__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group_6__0__Impl_in_rule__Relationship__Group_6__05132);
            rule__Relationship__Group_6__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group_6__1_in_rule__Relationship__Group_6__05135);
            rule__Relationship__Group_6__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_6__0


    // $ANTLR start rule__Relationship__Group_6__0__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2517:1: rule__Relationship__Group_6__0__Impl : ( ( ',' )? ) ;
    public final void rule__Relationship__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2521:1: ( ( ( ',' )? ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2522:1: ( ( ',' )? )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2522:1: ( ( ',' )? )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2523:1: ( ',' )?
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_6_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2524:1: ( ',' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==28) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2525:2: ','
                    {
                    match(input,28,FOLLOW_28_in_rule__Relationship__Group_6__0__Impl5164); 

                    }
                    break;

            }

             after(grammarAccess.getRelationshipAccess().getCommaKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_6__0__Impl


    // $ANTLR start rule__Relationship__Group_6__1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2536:1: rule__Relationship__Group_6__1 : rule__Relationship__Group_6__1__Impl ;
    public final void rule__Relationship__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2540:1: ( rule__Relationship__Group_6__1__Impl )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2541:2: rule__Relationship__Group_6__1__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group_6__1__Impl_in_rule__Relationship__Group_6__15197);
            rule__Relationship__Group_6__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_6__1


    // $ANTLR start rule__Relationship__Group_6__1__Impl
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2547:1: rule__Relationship__Group_6__1__Impl : ( ( rule__Relationship__PropertiesAssignment_6_1 ) ) ;
    public final void rule__Relationship__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2551:1: ( ( ( rule__Relationship__PropertiesAssignment_6_1 ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2552:1: ( ( rule__Relationship__PropertiesAssignment_6_1 ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2552:1: ( ( rule__Relationship__PropertiesAssignment_6_1 ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2553:1: ( rule__Relationship__PropertiesAssignment_6_1 )
            {
             before(grammarAccess.getRelationshipAccess().getPropertiesAssignment_6_1()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2554:1: ( rule__Relationship__PropertiesAssignment_6_1 )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2554:2: rule__Relationship__PropertiesAssignment_6_1
            {
            pushFollow(FOLLOW_rule__Relationship__PropertiesAssignment_6_1_in_rule__Relationship__Group_6__1__Impl5224);
            rule__Relationship__PropertiesAssignment_6_1();
            _fsp--;


            }

             after(grammarAccess.getRelationshipAccess().getPropertiesAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__Group_6__1__Impl


    // $ANTLR start rule__Situation__TimeAssignment_0_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2569:1: rule__Situation__TimeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Situation__TimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2573:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2574:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2574:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2575:1: RULE_ID
            {
             before(grammarAccess.getSituationAccess().getTimeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_15263); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2584:1: rule__Situation__WorldAssignment_1 : ( ruleWorld ) ;
    public final void rule__Situation__WorldAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2588:1: ( ( ruleWorld ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2589:1: ( ruleWorld )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2589:1: ( ruleWorld )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2590:1: ruleWorld
            {
             before(grammarAccess.getSituationAccess().getWorldWorldParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_15294);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2599:1: rule__World__EntitiesAssignment_1_0 : ( ruleEntity ) ;
    public final void rule__World__EntitiesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2603:1: ( ( ruleEntity ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2604:1: ( ruleEntity )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2604:1: ( ruleEntity )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2605:1: ruleEntity
            {
             before(grammarAccess.getWorldAccess().getEntitiesEntityParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__World__EntitiesAssignment_1_05325);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2614:1: rule__World__RelationshipsAssignment_1_1 : ( ruleRelationship ) ;
    public final void rule__World__RelationshipsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2618:1: ( ( ruleRelationship ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2619:1: ( ruleRelationship )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2619:1: ( ruleRelationship )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2620:1: ruleRelationship
            {
             before(grammarAccess.getWorldAccess().getRelationshipsRelationshipParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRelationship_in_rule__World__RelationshipsAssignment_1_15356);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2629:1: rule__Goal__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Goal__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2633:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2634:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2634:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2635:1: RULE_ID
            {
             before(grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_0_05387); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2644:1: rule__Goal__TypeAssignment_0_1 : ( ( 'goal' ) ) ;
    public final void rule__Goal__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2648:1: ( ( ( 'goal' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2649:1: ( ( 'goal' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2649:1: ( ( 'goal' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2650:1: ( 'goal' )
            {
             before(grammarAccess.getGoalAccess().getTypeGoalKeyword_0_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2651:1: ( 'goal' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2652:1: 'goal'
            {
             before(grammarAccess.getGoalAccess().getTypeGoalKeyword_0_1_0()); 
            match(input,32,FOLLOW_32_in_rule__Goal__TypeAssignment_0_15423); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2667:1: rule__Goal__AssetAssignment_0_2 : ( ruleAsset ) ;
    public final void rule__Goal__AssetAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2671:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2672:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2672:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2673:1: ruleAsset
            {
             before(grammarAccess.getGoalAccess().getAssetAssetParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Goal__AssetAssignment_0_25462);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2682:1: rule__Goal__PropertiesAssignment_0_3_1 : ( ruleProposition ) ;
    public final void rule__Goal__PropertiesAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2686:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2687:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2687:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2688:1: ruleProposition
            {
             before(grammarAccess.getGoalAccess().getPropertiesPropositionParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Goal__PropertiesAssignment_0_3_15493);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2697:1: rule__SecurityGoal__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__SecurityGoal__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2701:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2702:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2702:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2703:1: RULE_ID
            {
             before(grammarAccess.getSecurityGoalAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SecurityGoal__NameAssignment_05524); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2712:1: rule__SecurityGoal__TypeAssignment_1 : ( ( 'sec' ) ) ;
    public final void rule__SecurityGoal__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2716:1: ( ( ( 'sec' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2717:1: ( ( 'sec' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2717:1: ( ( 'sec' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2718:1: ( 'sec' )
            {
             before(grammarAccess.getSecurityGoalAccess().getTypeSecKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2719:1: ( 'sec' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2720:1: 'sec'
            {
             before(grammarAccess.getSecurityGoalAccess().getTypeSecKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__SecurityGoal__TypeAssignment_15560); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2735:1: rule__SecurityGoal__AssetAssignment_2 : ( ruleAsset ) ;
    public final void rule__SecurityGoal__AssetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2739:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2740:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2740:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2741:1: ruleAsset
            {
             before(grammarAccess.getSecurityGoalAccess().getAssetAssetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__SecurityGoal__AssetAssignment_25599);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2750:1: rule__SecurityGoal__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__SecurityGoal__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2754:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2755:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2755:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2756:1: ruleProposition
            {
             before(grammarAccess.getSecurityGoalAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__SecurityGoal__PropertiesAssignment_3_15630);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2765:1: rule__Requirement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Requirement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2769:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2770:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2770:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2771:1: RULE_ID
            {
             before(grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_05661); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2780:1: rule__Requirement__TypeAssignment_1 : ( ( 'req' ) ) ;
    public final void rule__Requirement__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2784:1: ( ( ( 'req' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2785:1: ( ( 'req' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2785:1: ( ( 'req' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2786:1: ( 'req' )
            {
             before(grammarAccess.getRequirementAccess().getTypeReqKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2787:1: ( 'req' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2788:1: 'req'
            {
             before(grammarAccess.getRequirementAccess().getTypeReqKeyword_1_0()); 
            match(input,34,FOLLOW_34_in_rule__Requirement__TypeAssignment_15697); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2803:1: rule__Requirement__AssetAssignment_2 : ( ruleAsset ) ;
    public final void rule__Requirement__AssetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2807:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2808:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2808:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2809:1: ruleAsset
            {
             before(grammarAccess.getRequirementAccess().getAssetAssetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Requirement__AssetAssignment_25736);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2818:1: rule__Requirement__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__Requirement__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2822:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2823:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2823:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2824:1: ruleProposition
            {
             before(grammarAccess.getRequirementAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Requirement__PropertiesAssignment_3_15767);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2833:1: rule__Domain__NameAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2837:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2838:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2838:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2839:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_0_05798); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2848:1: rule__Domain__TypeAssignment_0_1 : ( ( 'dom' ) ) ;
    public final void rule__Domain__TypeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2852:1: ( ( ( 'dom' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2853:1: ( ( 'dom' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2853:1: ( ( 'dom' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2854:1: ( 'dom' )
            {
             before(grammarAccess.getDomainAccess().getTypeDomKeyword_0_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2855:1: ( 'dom' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2856:1: 'dom'
            {
             before(grammarAccess.getDomainAccess().getTypeDomKeyword_0_1_0()); 
            match(input,35,FOLLOW_35_in_rule__Domain__TypeAssignment_0_15834); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2871:1: rule__Domain__AssetAssignment_0_2 : ( ruleAsset ) ;
    public final void rule__Domain__AssetAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2875:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2876:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2876:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2877:1: ruleAsset
            {
             before(grammarAccess.getDomainAccess().getAssetAssetParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Domain__AssetAssignment_0_25873);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2886:1: rule__Domain__PropertiesAssignment_0_3_1 : ( ruleProposition ) ;
    public final void rule__Domain__PropertiesAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2890:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2891:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2891:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2892:1: ruleProposition
            {
             before(grammarAccess.getDomainAccess().getPropertiesPropositionParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_0_3_15904);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2901:1: rule__Asset__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Asset__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2905:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2906:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2906:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2907:1: RULE_ID
            {
             before(grammarAccess.getAssetAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_05935); 
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


    // $ANTLR start rule__Asset__ValueAssignment_2
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2916:1: rule__Asset__ValueAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Asset__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2920:1: ( ( RULE_STRING ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2921:1: ( RULE_STRING )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2921:1: ( RULE_STRING )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2922:1: RULE_STRING
            {
             before(grammarAccess.getAssetAccess().getValueSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Asset__ValueAssignment_25966); 
             after(grammarAccess.getAssetAccess().getValueSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Asset__ValueAssignment_2


    // $ANTLR start rule__Actor__NameAssignment_0
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2931:1: rule__Actor__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Actor__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2935:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2936:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2936:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2937:1: RULE_ID
            {
             before(grammarAccess.getActorAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_05997); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2946:1: rule__Actor__TypeAssignment_1 : ( ( 'actor' ) ) ;
    public final void rule__Actor__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2950:1: ( ( ( 'actor' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2951:1: ( ( 'actor' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2951:1: ( ( 'actor' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2952:1: ( 'actor' )
            {
             before(grammarAccess.getActorAccess().getTypeActorKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2953:1: ( 'actor' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2954:1: 'actor'
            {
             before(grammarAccess.getActorAccess().getTypeActorKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__Actor__TypeAssignment_16033); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2969:1: rule__Actor__AssetAssignment_2 : ( ruleAsset ) ;
    public final void rule__Actor__AssetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2973:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2974:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2974:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2975:1: ruleAsset
            {
             before(grammarAccess.getActorAccess().getAssetAssetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Actor__AssetAssignment_26072);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2984:1: rule__Actor__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__Actor__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2988:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2989:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2989:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2990:1: ruleProposition
            {
             before(grammarAccess.getActorAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Actor__PropertiesAssignment_3_16103);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:2999:1: rule__Action__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Action__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3003:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3004:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3004:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3005:1: RULE_ID
            {
             before(grammarAccess.getActionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Action__NameAssignment_06134); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3014:1: rule__Action__TypeAssignment_1 : ( ( 'action' ) ) ;
    public final void rule__Action__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3018:1: ( ( ( 'action' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3019:1: ( ( 'action' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3019:1: ( ( 'action' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3020:1: ( 'action' )
            {
             before(grammarAccess.getActionAccess().getTypeActionKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3021:1: ( 'action' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3022:1: 'action'
            {
             before(grammarAccess.getActionAccess().getTypeActionKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__Action__TypeAssignment_16170); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3037:1: rule__Action__AssetAssignment_2 : ( ruleAsset ) ;
    public final void rule__Action__AssetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3041:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3042:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3042:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3043:1: ruleAsset
            {
             before(grammarAccess.getActionAccess().getAssetAssetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Action__AssetAssignment_26209);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3052:1: rule__Action__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__Action__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3056:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3057:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3057:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3058:1: ruleProposition
            {
             before(grammarAccess.getActionAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Action__PropertiesAssignment_3_16240);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3067:1: rule__Resource__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Resource__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3071:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3072:1: ( RULE_ID )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3072:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3073:1: RULE_ID
            {
             before(grammarAccess.getResourceAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_06271); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3082:1: rule__Resource__TypeAssignment_1 : ( ( 'resource' ) ) ;
    public final void rule__Resource__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3086:1: ( ( ( 'resource' ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3087:1: ( ( 'resource' ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3087:1: ( ( 'resource' ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3088:1: ( 'resource' )
            {
             before(grammarAccess.getResourceAccess().getTypeResourceKeyword_1_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3089:1: ( 'resource' )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3090:1: 'resource'
            {
             before(grammarAccess.getResourceAccess().getTypeResourceKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__Resource__TypeAssignment_16307); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3105:1: rule__Resource__AssetAssignment_2 : ( ruleAsset ) ;
    public final void rule__Resource__AssetAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3109:1: ( ( ruleAsset ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3110:1: ( ruleAsset )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3110:1: ( ruleAsset )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3111:1: ruleAsset
            {
             before(grammarAccess.getResourceAccess().getAssetAssetParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAsset_in_rule__Resource__AssetAssignment_26346);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3120:1: rule__Resource__PropertiesAssignment_3_1 : ( ruleProposition ) ;
    public final void rule__Resource__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3124:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3125:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3125:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3126:1: ruleProposition
            {
             before(grammarAccess.getResourceAccess().getPropertiesPropositionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Resource__PropertiesAssignment_3_16377);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3135:1: rule__Proposition__NameAssignment : ( RULE_STRING ) ;
    public final void rule__Proposition__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3139:1: ( ( RULE_STRING ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3140:1: ( RULE_STRING )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3140:1: ( RULE_STRING )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3141:1: RULE_STRING
            {
             before(grammarAccess.getPropositionAccess().getNameSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Proposition__NameAssignment6408); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3150:1: rule__Relationship__TypeAssignment_0 : ( ruleRelType ) ;
    public final void rule__Relationship__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3154:1: ( ( ruleRelType ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3155:1: ( ruleRelType )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3155:1: ( ruleRelType )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3156:1: ruleRelType
            {
             before(grammarAccess.getRelationshipAccess().getTypeRelTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelType_in_rule__Relationship__TypeAssignment_06439);
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3165:1: rule__Relationship__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3169:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3170:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3170:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3171:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getSourceEntityCrossReference_2_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3172:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3173:1: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getSourceEntityIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship__SourceAssignment_26474); 
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
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3184:1: rule__Relationship__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3188:1: ( ( ( RULE_ID ) ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3189:1: ( ( RULE_ID ) )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3189:1: ( ( RULE_ID ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3190:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_4_0()); 
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3191:1: ( RULE_ID )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3192:1: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getTargetEntityIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship__TargetAssignment_46513); 
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


    // $ANTLR start rule__Relationship__PropertiesAssignment_6_1
    // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3203:1: rule__Relationship__PropertiesAssignment_6_1 : ( ruleProposition ) ;
    public final void rule__Relationship__PropertiesAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3207:1: ( ( ruleProposition ) )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3208:1: ( ruleProposition )
            {
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3208:1: ( ruleProposition )
            // ../ontology.ui/src-gen/eu/securechange/ontology/ui/contentassist/antlr/internal/InternalOntology.g:3209:1: ruleProposition
            {
             before(grammarAccess.getRelationshipAccess().getPropertiesPropositionParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_ruleProposition_in_rule__Relationship__PropertiesAssignment_6_16548);
            ruleProposition();
            _fsp--;

             after(grammarAccess.getRelationshipAccess().getPropertiesPropositionParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Relationship__PropertiesAssignment_6_1


 

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
    public static final BitSet FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__01465 = new BitSet(new long[]{0x0000000003FFF812L});
    public static final BitSet FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__01468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__11526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__WorldAssignment_1_in_rule__Situation__Group__1__Impl1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__01587 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__01590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Situation__Group_0__0__Impl1618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__11649 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__11652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl1679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__21709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Situation__Group_0__2__Impl1737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__0__Impl_in_rule__World__Group__01774 = new BitSet(new long[]{0x0000000003FFF812L});
    public static final BitSet FOLLOW_rule__World__Group__1_in_rule__World__Group__01777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Group__1__Impl_in_rule__World__Group__11835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__World__Alternatives_1_in_rule__World__Group__1__Impl1862 = new BitSet(new long[]{0x0000000003FFF812L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__0__Impl_in_rule__Goal__Group_0__01897 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__1_in_rule__Goal__Group_0__01900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__NameAssignment_0_0_in_rule__Goal__Group_0__0__Impl1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__1__Impl_in_rule__Goal__Group_0__11957 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__2_in_rule__Goal__Group_0__11960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__TypeAssignment_0_1_in_rule__Goal__Group_0__1__Impl1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__2__Impl_in_rule__Goal__Group_0__22017 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__3_in_rule__Goal__Group_0__22020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__AssetAssignment_0_2_in_rule__Goal__Group_0__2__Impl2047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0__3__Impl_in_rule__Goal__Group_0__32078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0_3__0_in_rule__Goal__Group_0__3__Impl2105 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Goal__Group_0_3__0__Impl_in_rule__Goal__Group_0_3__02144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Goal__Group_0_3__1_in_rule__Goal__Group_0_3__02147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Goal__Group_0_3__0__Impl2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__Group_0_3__1__Impl_in_rule__Goal__Group_0_3__12209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Goal__PropertiesAssignment_0_3_1_in_rule__Goal__Group_0_3__1__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__0__Impl_in_rule__SecurityGoal__Group__02270 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__1_in_rule__SecurityGoal__Group__02273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__NameAssignment_0_in_rule__SecurityGoal__Group__0__Impl2300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__1__Impl_in_rule__SecurityGoal__Group__12330 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__2_in_rule__SecurityGoal__Group__12333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__TypeAssignment_1_in_rule__SecurityGoal__Group__1__Impl2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__2__Impl_in_rule__SecurityGoal__Group__22390 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__3_in_rule__SecurityGoal__Group__22393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__AssetAssignment_2_in_rule__SecurityGoal__Group__2__Impl2420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group__3__Impl_in_rule__SecurityGoal__Group__32451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_3__0_in_rule__SecurityGoal__Group__3__Impl2478 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_3__0__Impl_in_rule__SecurityGoal__Group_3__02517 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_3__1_in_rule__SecurityGoal__Group_3__02520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SecurityGoal__Group_3__0__Impl2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__Group_3__1__Impl_in_rule__SecurityGoal__Group_3__12582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SecurityGoal__PropertiesAssignment_3_1_in_rule__SecurityGoal__Group_3__1__Impl2609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__0__Impl_in_rule__Requirement__Group__02643 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1_in_rule__Requirement__Group__02646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__NameAssignment_0_in_rule__Requirement__Group__0__Impl2673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__1__Impl_in_rule__Requirement__Group__12703 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2_in_rule__Requirement__Group__12706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__TypeAssignment_1_in_rule__Requirement__Group__1__Impl2733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__2__Impl_in_rule__Requirement__Group__22763 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Requirement__Group__3_in_rule__Requirement__Group__22766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__AssetAssignment_2_in_rule__Requirement__Group__2__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group__3__Impl_in_rule__Requirement__Group__32824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__0_in_rule__Requirement__Group__3__Impl2851 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__0__Impl_in_rule__Requirement__Group_3__02890 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__1_in_rule__Requirement__Group_3__02893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Requirement__Group_3__0__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__Group_3__1__Impl_in_rule__Requirement__Group_3__12955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Requirement__PropertiesAssignment_3_1_in_rule__Requirement__Group_3__1__Impl2982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__0__Impl_in_rule__Domain__Group_0__03016 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__1_in_rule__Domain__Group_0__03019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_0_0_in_rule__Domain__Group_0__0__Impl3046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__1__Impl_in_rule__Domain__Group_0__13076 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__2_in_rule__Domain__Group_0__13079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__TypeAssignment_0_1_in_rule__Domain__Group_0__1__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__2__Impl_in_rule__Domain__Group_0__23136 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__3_in_rule__Domain__Group_0__23139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__AssetAssignment_0_2_in_rule__Domain__Group_0__2__Impl3166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0__3__Impl_in_rule__Domain__Group_0__33197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0_3__0_in_rule__Domain__Group_0__3__Impl3224 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Domain__Group_0_3__0__Impl_in_rule__Domain__Group_0_3__03263 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Domain__Group_0_3__1_in_rule__Domain__Group_0_3__03266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Domain__Group_0_3__0__Impl3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_0_3__1__Impl_in_rule__Domain__Group_0_3__13328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_0_3_1_in_rule__Domain__Group_0_3__1__Impl3355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__0__Impl_in_rule__Asset__Group__03389 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Asset__Group__1_in_rule__Asset__Group__03392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__NameAssignment_0_in_rule__Asset__Group__0__Impl3419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__1__Impl_in_rule__Asset__Group__13449 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_rule__Asset__Group__2_in_rule__Asset__Group__13452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Asset__Group__1__Impl3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__Group__2__Impl_in_rule__Asset__Group__23511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Asset__ValueAssignment_2_in_rule__Asset__Group__2__Impl3538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__0__Impl_in_rule__Actor__Group__03575 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Actor__Group__1_in_rule__Actor__Group__03578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__NameAssignment_0_in_rule__Actor__Group__0__Impl3605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__1__Impl_in_rule__Actor__Group__13635 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_rule__Actor__Group__2_in_rule__Actor__Group__13638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__TypeAssignment_1_in_rule__Actor__Group__1__Impl3665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__2__Impl_in_rule__Actor__Group__23695 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Actor__Group__3_in_rule__Actor__Group__23698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__AssetAssignment_2_in_rule__Actor__Group__2__Impl3725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group__3__Impl_in_rule__Actor__Group__33756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__0_in_rule__Actor__Group__3__Impl3783 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__0__Impl_in_rule__Actor__Group_3__03822 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__1_in_rule__Actor__Group_3__03825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Actor__Group_3__0__Impl3854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__Group_3__1__Impl_in_rule__Actor__Group_3__13887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Actor__PropertiesAssignment_3_1_in_rule__Actor__Group_3__1__Impl3914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__0__Impl_in_rule__Action__Group__03948 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Action__Group__1_in_rule__Action__Group__03951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__NameAssignment_0_in_rule__Action__Group__0__Impl3978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__1__Impl_in_rule__Action__Group__14008 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_rule__Action__Group__2_in_rule__Action__Group__14011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__TypeAssignment_1_in_rule__Action__Group__1__Impl4038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__2__Impl_in_rule__Action__Group__24068 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Action__Group__3_in_rule__Action__Group__24071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__AssetAssignment_2_in_rule__Action__Group__2__Impl4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group__3__Impl_in_rule__Action__Group__34129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0_in_rule__Action__Group__3__Impl4156 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Action__Group_3__0__Impl_in_rule__Action__Group_3__04195 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1_in_rule__Action__Group_3__04198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Action__Group_3__0__Impl4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__Group_3__1__Impl_in_rule__Action__Group_3__14260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Action__PropertiesAssignment_3_1_in_rule__Action__Group_3__1__Impl4287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__0__Impl_in_rule__Resource__Group__04321 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Resource__Group__1_in_rule__Resource__Group__04324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__NameAssignment_0_in_rule__Resource__Group__0__Impl4351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__1__Impl_in_rule__Resource__Group__14381 = new BitSet(new long[]{0x0000000010000032L});
    public static final BitSet FOLLOW_rule__Resource__Group__2_in_rule__Resource__Group__14384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__TypeAssignment_1_in_rule__Resource__Group__1__Impl4411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__2__Impl_in_rule__Resource__Group__24441 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Resource__Group__3_in_rule__Resource__Group__24444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__AssetAssignment_2_in_rule__Resource__Group__2__Impl4471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group__3__Impl_in_rule__Resource__Group__34502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__0_in_rule__Resource__Group__3__Impl4529 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__0__Impl_in_rule__Resource__Group_3__04568 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__1_in_rule__Resource__Group_3__04571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Resource__Group_3__0__Impl4600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__Group_3__1__Impl_in_rule__Resource__Group_3__14633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Resource__PropertiesAssignment_3_1_in_rule__Resource__Group_3__1__Impl4660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__04694 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__04697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__14754 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__14757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Relationship__Group__1__Impl4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__24816 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__24819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__SourceAssignment_2_in_rule__Relationship__Group__2__Impl4846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__34876 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__34879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Relationship__Group__3__Impl4907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__44938 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__44941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TargetAssignment_4_in_rule__Relationship__Group__4__Impl4968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__54998 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Relationship__Group__6_in_rule__Relationship__Group__55001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Relationship__Group__5__Impl5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__6__Impl_in_rule__Relationship__Group__65060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group_6__0_in_rule__Relationship__Group__6__Impl5087 = new BitSet(new long[]{0x0000000010000022L});
    public static final BitSet FOLLOW_rule__Relationship__Group_6__0__Impl_in_rule__Relationship__Group_6__05132 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Relationship__Group_6__1_in_rule__Relationship__Group_6__05135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Relationship__Group_6__0__Impl5164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group_6__1__Impl_in_rule__Relationship__Group_6__15197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__PropertiesAssignment_6_1_in_rule__Relationship__Group_6__1__Impl5224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_15263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorld_in_rule__Situation__WorldAssignment_15294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__World__EntitiesAssignment_1_05325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__World__RelationshipsAssignment_1_15356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Goal__NameAssignment_0_05387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Goal__TypeAssignment_0_15423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Goal__AssetAssignment_0_25462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Goal__PropertiesAssignment_0_3_15493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SecurityGoal__NameAssignment_05524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SecurityGoal__TypeAssignment_15560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__SecurityGoal__AssetAssignment_25599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__SecurityGoal__PropertiesAssignment_3_15630 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Requirement__NameAssignment_05661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Requirement__TypeAssignment_15697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Requirement__AssetAssignment_25736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Requirement__PropertiesAssignment_3_15767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_0_05798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Domain__TypeAssignment_0_15834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Domain__AssetAssignment_0_25873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Domain__PropertiesAssignment_0_3_15904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Asset__NameAssignment_05935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Asset__ValueAssignment_25966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Actor__NameAssignment_05997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Actor__TypeAssignment_16033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Actor__AssetAssignment_26072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Actor__PropertiesAssignment_3_16103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Action__NameAssignment_06134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Action__TypeAssignment_16170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Action__AssetAssignment_26209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Action__PropertiesAssignment_3_16240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Resource__NameAssignment_06271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Resource__TypeAssignment_16307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAsset_in_rule__Resource__AssetAssignment_26346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Resource__PropertiesAssignment_3_16377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Proposition__NameAssignment6408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelType_in_rule__Relationship__TypeAssignment_06439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__SourceAssignment_26474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__TargetAssignment_46513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProposition_in_rule__Relationship__PropertiesAssignment_6_16548 = new BitSet(new long[]{0x0000000000000002L});

}