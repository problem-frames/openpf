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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DA'", "'FR'", "'SR'", "'AR'", "'Q'", "'A'", "'actor'", "'action'", "'attacker'", "'process'", "'activity'", "'resource'", "'asset'", "'event'", "'S'", "'R'", "'W'", "'wants'", "'does'", "'and'", "'or'", "'trusts'", "'delegates'", "'-'", "'+'", "'--'", "'++'", "'fulfils'", "'provides'", "'consumes'", "'exploits'", "'damages'", "'attacks'", "'argues'", "'model'", "':'", "'('", "','", "')'"
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


    // $ANTLR start entryRuleThing
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:89:1: entryRuleThing : ruleThing EOF ;
    public final void entryRuleThing() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:90:1: ( ruleThing EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:91:1: ruleThing EOF
            {
             before(grammarAccess.getThingRule()); 
            pushFollow(FOLLOW_ruleThing_in_entryRuleThing121);
            ruleThing();
            _fsp--;

             after(grammarAccess.getThingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleThing128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end entryRuleThing


    // $ANTLR start ruleThing
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:98:1: ruleThing : ( ( rule__Thing__Alternatives ) ) ;
    public final void ruleThing() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:102:2: ( ( ( rule__Thing__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:103:1: ( ( rule__Thing__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:103:1: ( ( rule__Thing__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:104:1: ( rule__Thing__Alternatives )
            {
             before(grammarAccess.getThingAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:105:1: ( rule__Thing__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:105:2: rule__Thing__Alternatives
            {
            pushFollow(FOLLOW_rule__Thing__Alternatives_in_ruleThing154);
            rule__Thing__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getThingAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleThing


    // $ANTLR start entryRuleEntity
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:117:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:118:1: ( ruleEntity EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:119:1: ruleEntity EOF
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:126:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:130:2: ( ( ( rule__Entity__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:131:1: ( ( rule__Entity__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:131:1: ( ( rule__Entity__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:132:1: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:133:1: ( rule__Entity__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:133:2: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_rule__Entity__Group__0_in_ruleEntity214);
            rule__Entity__Group__0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start entryRuleRelationship
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:145:1: entryRuleRelationship : ruleRelationship EOF ;
    public final void entryRuleRelationship() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:146:1: ( ruleRelationship EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:147:1: ruleRelationship EOF
            {
             before(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_ruleRelationship_in_entryRuleRelationship241);
            ruleRelationship();
            _fsp--;

             after(grammarAccess.getRelationshipRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationship248); 

            }

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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:154:1: ruleRelationship : ( ( rule__Relationship__Group__0 ) ) ;
    public final void ruleRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:158:2: ( ( ( rule__Relationship__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:159:1: ( ( rule__Relationship__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:159:1: ( ( rule__Relationship__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:160:1: ( rule__Relationship__Group__0 )
            {
             before(grammarAccess.getRelationshipAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:161:1: ( rule__Relationship__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:161:2: rule__Relationship__Group__0
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0_in_ruleRelationship274);
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


    // $ANTLR start entryRuleDomain
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:173:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:174:1: ( ruleDomain EOF )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:175:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain301);
            ruleDomain();
            _fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain308); 

            }

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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:182:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:186:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:187:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:187:1: ( ( rule__Domain__Group__0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:188:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:189:1: ( rule__Domain__Group__0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:189:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain334);
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


    // $ANTLR start ruleEntityType
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:202:1: ruleEntityType : ( ( rule__EntityType__Alternatives ) ) ;
    public final void ruleEntityType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:206:1: ( ( ( rule__EntityType__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:207:1: ( ( rule__EntityType__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:207:1: ( ( rule__EntityType__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:208:1: ( rule__EntityType__Alternatives )
            {
             before(grammarAccess.getEntityTypeAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:209:1: ( rule__EntityType__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:209:2: rule__EntityType__Alternatives
            {
            pushFollow(FOLLOW_rule__EntityType__Alternatives_in_ruleEntityType371);
            rule__EntityType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getEntityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleEntityType


    // $ANTLR start ruleDomainType
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:221:1: ruleDomainType : ( ( rule__DomainType__Alternatives ) ) ;
    public final void ruleDomainType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:225:1: ( ( ( rule__DomainType__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:226:1: ( ( rule__DomainType__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:226:1: ( ( rule__DomainType__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:227:1: ( rule__DomainType__Alternatives )
            {
             before(grammarAccess.getDomainTypeAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:228:1: ( rule__DomainType__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:228:2: rule__DomainType__Alternatives
            {
            pushFollow(FOLLOW_rule__DomainType__Alternatives_in_ruleDomainType407);
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


    // $ANTLR start ruleRelationshipType
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:240:1: ruleRelationshipType : ( ( rule__RelationshipType__Alternatives ) ) ;
    public final void ruleRelationshipType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:244:1: ( ( ( rule__RelationshipType__Alternatives ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:245:1: ( ( rule__RelationshipType__Alternatives ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:245:1: ( ( rule__RelationshipType__Alternatives ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:246:1: ( rule__RelationshipType__Alternatives )
            {
             before(grammarAccess.getRelationshipTypeAccess().getAlternatives()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:247:1: ( rule__RelationshipType__Alternatives )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:247:2: rule__RelationshipType__Alternatives
            {
            pushFollow(FOLLOW_rule__RelationshipType__Alternatives_in_ruleRelationshipType443);
            rule__RelationshipType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getRelationshipTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleRelationshipType


    // $ANTLR start rule__Thing__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:258:1: rule__Thing__Alternatives : ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleDomain ) );
    public final void rule__Thing__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:262:1: ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleDomain ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
                {
                alt1=1;
                }
                break;
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
                {
                alt1=2;
                }
                break;
            case RULE_ID:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("258:1: rule__Thing__Alternatives : ( ( ruleEntity ) | ( ruleRelationship ) | ( ruleDomain ) );", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:263:1: ( ruleEntity )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:263:1: ( ruleEntity )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:264:1: ruleEntity
                    {
                     before(grammarAccess.getThingAccess().getEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleEntity_in_rule__Thing__Alternatives478);
                    ruleEntity();
                    _fsp--;

                     after(grammarAccess.getThingAccess().getEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:269:6: ( ruleRelationship )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:269:6: ( ruleRelationship )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:270:1: ruleRelationship
                    {
                     before(grammarAccess.getThingAccess().getRelationshipParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleRelationship_in_rule__Thing__Alternatives495);
                    ruleRelationship();
                    _fsp--;

                     after(grammarAccess.getThingAccess().getRelationshipParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:275:6: ( ruleDomain )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:275:6: ( ruleDomain )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:276:1: ruleDomain
                    {
                     before(grammarAccess.getThingAccess().getDomainParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleDomain_in_rule__Thing__Alternatives512);
                    ruleDomain();
                    _fsp--;

                     after(grammarAccess.getThingAccess().getDomainParserRuleCall_2()); 

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
    // $ANTLR end rule__Thing__Alternatives


    // $ANTLR start rule__EntityType__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:286:1: rule__EntityType__Alternatives : ( ( ( 'DA' ) ) | ( ( 'FR' ) ) | ( ( 'SR' ) ) | ( ( 'AR' ) ) | ( ( 'Q' ) ) | ( ( 'A' ) ) | ( ( 'actor' ) ) | ( ( 'action' ) ) | ( ( 'attacker' ) ) | ( ( 'process' ) ) | ( ( 'activity' ) ) | ( ( 'resource' ) ) | ( ( 'asset' ) ) | ( ( 'event' ) ) );
    public final void rule__EntityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:290:1: ( ( ( 'DA' ) ) | ( ( 'FR' ) ) | ( ( 'SR' ) ) | ( ( 'AR' ) ) | ( ( 'Q' ) ) | ( ( 'A' ) ) | ( ( 'actor' ) ) | ( ( 'action' ) ) | ( ( 'attacker' ) ) | ( ( 'process' ) ) | ( ( 'activity' ) ) | ( ( 'resource' ) ) | ( ( 'asset' ) ) | ( ( 'event' ) ) )
            int alt2=14;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            case 14:
                {
                alt2=4;
                }
                break;
            case 15:
                {
                alt2=5;
                }
                break;
            case 16:
                {
                alt2=6;
                }
                break;
            case 17:
                {
                alt2=7;
                }
                break;
            case 18:
                {
                alt2=8;
                }
                break;
            case 19:
                {
                alt2=9;
                }
                break;
            case 20:
                {
                alt2=10;
                }
                break;
            case 21:
                {
                alt2=11;
                }
                break;
            case 22:
                {
                alt2=12;
                }
                break;
            case 23:
                {
                alt2=13;
                }
                break;
            case 24:
                {
                alt2=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("286:1: rule__EntityType__Alternatives : ( ( ( 'DA' ) ) | ( ( 'FR' ) ) | ( ( 'SR' ) ) | ( ( 'AR' ) ) | ( ( 'Q' ) ) | ( ( 'A' ) ) | ( ( 'actor' ) ) | ( ( 'action' ) ) | ( ( 'attacker' ) ) | ( ( 'process' ) ) | ( ( 'activity' ) ) | ( ( 'resource' ) ) | ( ( 'asset' ) ) | ( ( 'event' ) ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:291:1: ( ( 'DA' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:291:1: ( ( 'DA' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:292:1: ( 'DA' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:293:1: ( 'DA' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:293:3: 'DA'
                    {
                    match(input,11,FOLLOW_11_in_rule__EntityType__Alternatives545); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getDomainAssumptionEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:298:6: ( ( 'FR' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:298:6: ( ( 'FR' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:299:1: ( 'FR' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getFunctionEnumLiteralDeclaration_1()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:300:1: ( 'FR' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:300:3: 'FR'
                    {
                    match(input,12,FOLLOW_12_in_rule__EntityType__Alternatives566); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getFunctionEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:305:6: ( ( 'SR' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:305:6: ( ( 'SR' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:306:1: ( 'SR' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getSecurityEnumLiteralDeclaration_2()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:307:1: ( 'SR' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:307:3: 'SR'
                    {
                    match(input,13,FOLLOW_13_in_rule__EntityType__Alternatives587); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getSecurityEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:312:6: ( ( 'AR' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:312:6: ( ( 'AR' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:313:1: ( 'AR' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getAntiEnumLiteralDeclaration_3()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:314:1: ( 'AR' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:314:3: 'AR'
                    {
                    match(input,14,FOLLOW_14_in_rule__EntityType__Alternatives608); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getAntiEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:319:6: ( ( 'Q' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:319:6: ( ( 'Q' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:320:1: ( 'Q' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getQualityPropositionEnumLiteralDeclaration_4()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:321:1: ( 'Q' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:321:3: 'Q'
                    {
                    match(input,15,FOLLOW_15_in_rule__EntityType__Alternatives629); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getQualityPropositionEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:326:6: ( ( 'A' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:326:6: ( ( 'A' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:327:1: ( 'A' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getArgumentEnumLiteralDeclaration_5()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:328:1: ( 'A' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:328:3: 'A'
                    {
                    match(input,16,FOLLOW_16_in_rule__EntityType__Alternatives650); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getArgumentEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:333:6: ( ( 'actor' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:333:6: ( ( 'actor' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:334:1: ( 'actor' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getActorEnumLiteralDeclaration_6()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:335:1: ( 'actor' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:335:3: 'actor'
                    {
                    match(input,17,FOLLOW_17_in_rule__EntityType__Alternatives671); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getActorEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:340:6: ( ( 'action' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:340:6: ( ( 'action' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:341:1: ( 'action' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getActionEnumLiteralDeclaration_7()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:342:1: ( 'action' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:342:3: 'action'
                    {
                    match(input,18,FOLLOW_18_in_rule__EntityType__Alternatives692); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getActionEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:347:6: ( ( 'attacker' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:347:6: ( ( 'attacker' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:348:1: ( 'attacker' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getAttackerEnumLiteralDeclaration_8()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:349:1: ( 'attacker' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:349:3: 'attacker'
                    {
                    match(input,19,FOLLOW_19_in_rule__EntityType__Alternatives713); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getAttackerEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:354:6: ( ( 'process' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:354:6: ( ( 'process' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:355:1: ( 'process' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getProcessEnumLiteralDeclaration_9()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:356:1: ( 'process' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:356:3: 'process'
                    {
                    match(input,20,FOLLOW_20_in_rule__EntityType__Alternatives734); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getProcessEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:361:6: ( ( 'activity' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:361:6: ( ( 'activity' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:362:1: ( 'activity' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getActivityEnumLiteralDeclaration_10()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:363:1: ( 'activity' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:363:3: 'activity'
                    {
                    match(input,21,FOLLOW_21_in_rule__EntityType__Alternatives755); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getActivityEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:368:6: ( ( 'resource' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:368:6: ( ( 'resource' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:369:1: ( 'resource' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getResourceEnumLiteralDeclaration_11()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:370:1: ( 'resource' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:370:3: 'resource'
                    {
                    match(input,22,FOLLOW_22_in_rule__EntityType__Alternatives776); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getResourceEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:375:6: ( ( 'asset' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:375:6: ( ( 'asset' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:376:1: ( 'asset' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getAssetEnumLiteralDeclaration_12()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:377:1: ( 'asset' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:377:3: 'asset'
                    {
                    match(input,23,FOLLOW_23_in_rule__EntityType__Alternatives797); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getAssetEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:382:6: ( ( 'event' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:382:6: ( ( 'event' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:383:1: ( 'event' )
                    {
                     before(grammarAccess.getEntityTypeAccess().getEventEnumLiteralDeclaration_13()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:384:1: ( 'event' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:384:3: 'event'
                    {
                    match(input,24,FOLLOW_24_in_rule__EntityType__Alternatives818); 

                    }

                     after(grammarAccess.getEntityTypeAccess().getEventEnumLiteralDeclaration_13()); 

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
    // $ANTLR end rule__EntityType__Alternatives


    // $ANTLR start rule__DomainType__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:394:1: rule__DomainType__Alternatives : ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) );
    public final void rule__DomainType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:398:1: ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 27:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("394:1: rule__DomainType__Alternatives : ( ( ( 'S' ) ) | ( ( 'R' ) ) | ( ( 'W' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:399:1: ( ( 'S' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:399:1: ( ( 'S' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:400:1: ( 'S' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:401:1: ( 'S' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:401:3: 'S'
                    {
                    match(input,25,FOLLOW_25_in_rule__DomainType__Alternatives854); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getSpecificationEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:406:6: ( ( 'R' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:406:6: ( ( 'R' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:407:1: ( 'R' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:408:1: ( 'R' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:408:3: 'R'
                    {
                    match(input,26,FOLLOW_26_in_rule__DomainType__Alternatives875); 

                    }

                     after(grammarAccess.getDomainTypeAccess().getRequirementEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:413:6: ( ( 'W' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:413:6: ( ( 'W' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:414:1: ( 'W' )
                    {
                     before(grammarAccess.getDomainTypeAccess().getWorldEnumLiteralDeclaration_2()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:415:1: ( 'W' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:415:3: 'W'
                    {
                    match(input,27,FOLLOW_27_in_rule__DomainType__Alternatives896); 

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


    // $ANTLR start rule__RelationshipType__Alternatives
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:425:1: rule__RelationshipType__Alternatives : ( ( ( 'wants' ) ) | ( ( 'does' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'trusts' ) ) | ( ( 'delegates' ) ) | ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) | ( ( 'fulfils' ) ) | ( ( 'provides' ) ) | ( ( 'consumes' ) ) | ( ( 'exploits' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'argues' ) ) );
    public final void rule__RelationshipType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:429:1: ( ( ( 'wants' ) ) | ( ( 'does' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'trusts' ) ) | ( ( 'delegates' ) ) | ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) | ( ( 'fulfils' ) ) | ( ( 'provides' ) ) | ( ( 'consumes' ) ) | ( ( 'exploits' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'argues' ) ) )
            int alt4=17;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 30:
                {
                alt4=3;
                }
                break;
            case 31:
                {
                alt4=4;
                }
                break;
            case 32:
                {
                alt4=5;
                }
                break;
            case 33:
                {
                alt4=6;
                }
                break;
            case 34:
                {
                alt4=7;
                }
                break;
            case 35:
                {
                alt4=8;
                }
                break;
            case 36:
                {
                alt4=9;
                }
                break;
            case 37:
                {
                alt4=10;
                }
                break;
            case 38:
                {
                alt4=11;
                }
                break;
            case 39:
                {
                alt4=12;
                }
                break;
            case 40:
                {
                alt4=13;
                }
                break;
            case 41:
                {
                alt4=14;
                }
                break;
            case 42:
                {
                alt4=15;
                }
                break;
            case 43:
                {
                alt4=16;
                }
                break;
            case 44:
                {
                alt4=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("425:1: rule__RelationshipType__Alternatives : ( ( ( 'wants' ) ) | ( ( 'does' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'trusts' ) ) | ( ( 'delegates' ) ) | ( ( '-' ) ) | ( ( '+' ) ) | ( ( '--' ) ) | ( ( '++' ) ) | ( ( 'fulfils' ) ) | ( ( 'provides' ) ) | ( ( 'consumes' ) ) | ( ( 'exploits' ) ) | ( ( 'damages' ) ) | ( ( 'attacks' ) ) | ( ( 'argues' ) ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:430:1: ( ( 'wants' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:430:1: ( ( 'wants' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:431:1: ( 'wants' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getWantsEnumLiteralDeclaration_0()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:432:1: ( 'wants' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:432:3: 'wants'
                    {
                    match(input,28,FOLLOW_28_in_rule__RelationshipType__Alternatives932); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getWantsEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:437:6: ( ( 'does' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:437:6: ( ( 'does' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:438:1: ( 'does' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getDoesEnumLiteralDeclaration_1()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:439:1: ( 'does' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:439:3: 'does'
                    {
                    match(input,29,FOLLOW_29_in_rule__RelationshipType__Alternatives953); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getDoesEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:444:6: ( ( 'and' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:444:6: ( ( 'and' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:445:1: ( 'and' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getANDEnumLiteralDeclaration_2()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:446:1: ( 'and' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:446:3: 'and'
                    {
                    match(input,30,FOLLOW_30_in_rule__RelationshipType__Alternatives974); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getANDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:451:6: ( ( 'or' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:451:6: ( ( 'or' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:452:1: ( 'or' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getOREnumLiteralDeclaration_3()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:453:1: ( 'or' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:453:3: 'or'
                    {
                    match(input,31,FOLLOW_31_in_rule__RelationshipType__Alternatives995); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getOREnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:458:6: ( ( 'trusts' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:458:6: ( ( 'trusts' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:459:1: ( 'trusts' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getTRUSTEnumLiteralDeclaration_4()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:460:1: ( 'trusts' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:460:3: 'trusts'
                    {
                    match(input,32,FOLLOW_32_in_rule__RelationshipType__Alternatives1016); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getTRUSTEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:465:6: ( ( 'delegates' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:465:6: ( ( 'delegates' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:466:1: ( 'delegates' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getDELEGATEEnumLiteralDeclaration_5()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:467:1: ( 'delegates' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:467:3: 'delegates'
                    {
                    match(input,33,FOLLOW_33_in_rule__RelationshipType__Alternatives1037); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getDELEGATEEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:472:6: ( ( '-' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:472:6: ( ( '-' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:473:1: ( '-' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getHURTEnumLiteralDeclaration_6()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:474:1: ( '-' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:474:3: '-'
                    {
                    match(input,34,FOLLOW_34_in_rule__RelationshipType__Alternatives1058); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getHURTEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:479:6: ( ( '+' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:479:6: ( ( '+' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:480:1: ( '+' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getHELPEnumLiteralDeclaration_7()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:481:1: ( '+' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:481:3: '+'
                    {
                    match(input,35,FOLLOW_35_in_rule__RelationshipType__Alternatives1079); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getHELPEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:486:6: ( ( '--' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:486:6: ( ( '--' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:487:1: ( '--' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getBREAKEnumLiteralDeclaration_8()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:488:1: ( '--' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:488:3: '--'
                    {
                    match(input,36,FOLLOW_36_in_rule__RelationshipType__Alternatives1100); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getBREAKEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:493:6: ( ( '++' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:493:6: ( ( '++' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:494:1: ( '++' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getMAKEEnumLiteralDeclaration_9()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:495:1: ( '++' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:495:3: '++'
                    {
                    match(input,37,FOLLOW_37_in_rule__RelationshipType__Alternatives1121); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getMAKEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:500:6: ( ( 'fulfils' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:500:6: ( ( 'fulfils' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:501:1: ( 'fulfils' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getFulfilsEnumLiteralDeclaration_10()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:502:1: ( 'fulfils' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:502:3: 'fulfils'
                    {
                    match(input,38,FOLLOW_38_in_rule__RelationshipType__Alternatives1142); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getFulfilsEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:507:6: ( ( 'provides' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:507:6: ( ( 'provides' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:508:1: ( 'provides' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getProvidesEnumLiteralDeclaration_11()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:509:1: ( 'provides' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:509:3: 'provides'
                    {
                    match(input,39,FOLLOW_39_in_rule__RelationshipType__Alternatives1163); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getProvidesEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:514:6: ( ( 'consumes' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:514:6: ( ( 'consumes' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:515:1: ( 'consumes' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getConsumesEnumLiteralDeclaration_12()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:516:1: ( 'consumes' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:516:3: 'consumes'
                    {
                    match(input,40,FOLLOW_40_in_rule__RelationshipType__Alternatives1184); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getConsumesEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:521:6: ( ( 'exploits' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:521:6: ( ( 'exploits' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:522:1: ( 'exploits' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getExploitsEnumLiteralDeclaration_13()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:523:1: ( 'exploits' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:523:3: 'exploits'
                    {
                    match(input,41,FOLLOW_41_in_rule__RelationshipType__Alternatives1205); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getExploitsEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;
                case 15 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:528:6: ( ( 'damages' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:528:6: ( ( 'damages' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:529:1: ( 'damages' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getDamagesEnumLiteralDeclaration_14()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:530:1: ( 'damages' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:530:3: 'damages'
                    {
                    match(input,42,FOLLOW_42_in_rule__RelationshipType__Alternatives1226); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getDamagesEnumLiteralDeclaration_14()); 

                    }


                    }
                    break;
                case 16 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:535:6: ( ( 'attacks' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:535:6: ( ( 'attacks' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:536:1: ( 'attacks' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getAttacksEnumLiteralDeclaration_15()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:537:1: ( 'attacks' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:537:3: 'attacks'
                    {
                    match(input,43,FOLLOW_43_in_rule__RelationshipType__Alternatives1247); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getAttacksEnumLiteralDeclaration_15()); 

                    }


                    }
                    break;
                case 17 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:542:6: ( ( 'argues' ) )
                    {
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:542:6: ( ( 'argues' ) )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:543:1: ( 'argues' )
                    {
                     before(grammarAccess.getRelationshipTypeAccess().getArguesEnumLiteralDeclaration_16()); 
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:544:1: ( 'argues' )
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:544:3: 'argues'
                    {
                    match(input,44,FOLLOW_44_in_rule__RelationshipType__Alternatives1268); 

                    }

                     after(grammarAccess.getRelationshipTypeAccess().getArguesEnumLiteralDeclaration_16()); 

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
    // $ANTLR end rule__RelationshipType__Alternatives


    // $ANTLR start rule__Situation__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:556:1: rule__Situation__Group__0 : rule__Situation__Group__0__Impl rule__Situation__Group__1 ;
    public final void rule__Situation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:560:1: ( rule__Situation__Group__0__Impl rule__Situation__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:561:2: rule__Situation__Group__0__Impl rule__Situation__Group__1
            {
            pushFollow(FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__01301);
            rule__Situation__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__01304);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:568:1: rule__Situation__Group__0__Impl : ( ( rule__Situation__Group_0__0 )? ) ;
    public final void rule__Situation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:572:1: ( ( ( rule__Situation__Group_0__0 )? ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:573:1: ( ( rule__Situation__Group_0__0 )? )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:573:1: ( ( rule__Situation__Group_0__0 )? )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:574:1: ( rule__Situation__Group_0__0 )?
            {
             before(grammarAccess.getSituationAccess().getGroup_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:575:1: ( rule__Situation__Group_0__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==45) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:575:2: rule__Situation__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl1331);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:585:1: rule__Situation__Group__1 : rule__Situation__Group__1__Impl ;
    public final void rule__Situation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:589:1: ( rule__Situation__Group__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:590:2: rule__Situation__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__11362);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:596:1: rule__Situation__Group__1__Impl : ( ( rule__Situation__ThingsAssignment_1 )* ) ;
    public final void rule__Situation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:600:1: ( ( ( rule__Situation__ThingsAssignment_1 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:601:1: ( ( rule__Situation__ThingsAssignment_1 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:601:1: ( ( rule__Situation__ThingsAssignment_1 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:602:1: ( rule__Situation__ThingsAssignment_1 )*
            {
             before(grammarAccess.getSituationAccess().getThingsAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:603:1: ( rule__Situation__ThingsAssignment_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_ID||(LA6_0>=11 && LA6_0<=24)||(LA6_0>=28 && LA6_0<=44)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:603:2: rule__Situation__ThingsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Situation__ThingsAssignment_1_in_rule__Situation__Group__1__Impl1389);
            	    rule__Situation__ThingsAssignment_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSituationAccess().getThingsAssignment_1()); 

            }


            }

        }
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:617:1: rule__Situation__Group_0__0 : rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 ;
    public final void rule__Situation__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:621:1: ( rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:622:2: rule__Situation__Group_0__0__Impl rule__Situation__Group_0__1
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__01424);
            rule__Situation__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__01427);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:629:1: rule__Situation__Group_0__0__Impl : ( 'model' ) ;
    public final void rule__Situation__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:633:1: ( ( 'model' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:634:1: ( 'model' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:634:1: ( 'model' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:635:1: 'model'
            {
             before(grammarAccess.getSituationAccess().getModelKeyword_0_0()); 
            match(input,45,FOLLOW_45_in_rule__Situation__Group_0__0__Impl1455); 
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:648:1: rule__Situation__Group_0__1 : rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 ;
    public final void rule__Situation__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:652:1: ( rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:653:2: rule__Situation__Group_0__1__Impl rule__Situation__Group_0__2
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__11486);
            rule__Situation__Group_0__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__11489);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:660:1: rule__Situation__Group_0__1__Impl : ( ( rule__Situation__TimeAssignment_0_1 ) ) ;
    public final void rule__Situation__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:664:1: ( ( ( rule__Situation__TimeAssignment_0_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:665:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:665:1: ( ( rule__Situation__TimeAssignment_0_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:666:1: ( rule__Situation__TimeAssignment_0_1 )
            {
             before(grammarAccess.getSituationAccess().getTimeAssignment_0_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:667:1: ( rule__Situation__TimeAssignment_0_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:667:2: rule__Situation__TimeAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl1516);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:677:1: rule__Situation__Group_0__2 : rule__Situation__Group_0__2__Impl ;
    public final void rule__Situation__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:681:1: ( rule__Situation__Group_0__2__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:682:2: rule__Situation__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__21546);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:688:1: rule__Situation__Group_0__2__Impl : ( ':' ) ;
    public final void rule__Situation__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:692:1: ( ( ':' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:693:1: ( ':' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:693:1: ( ':' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:694:1: ':'
            {
             before(grammarAccess.getSituationAccess().getColonKeyword_0_2()); 
            match(input,46,FOLLOW_46_in_rule__Situation__Group_0__2__Impl1574); 
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


    // $ANTLR start rule__Entity__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:713:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:717:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:718:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01611);
            rule__Entity__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01614);
            rule__Entity__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0


    // $ANTLR start rule__Entity__Group__0__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:725:1: rule__Entity__Group__0__Impl : ( ( rule__Entity__TypeAssignment_0 ) ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:729:1: ( ( ( rule__Entity__TypeAssignment_0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:730:1: ( ( rule__Entity__TypeAssignment_0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:730:1: ( ( rule__Entity__TypeAssignment_0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:731:1: ( rule__Entity__TypeAssignment_0 )
            {
             before(grammarAccess.getEntityAccess().getTypeAssignment_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:732:1: ( rule__Entity__TypeAssignment_0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:732:2: rule__Entity__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Entity__TypeAssignment_0_in_rule__Entity__Group__0__Impl1641);
            rule__Entity__TypeAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__0__Impl


    // $ANTLR start rule__Entity__Group__1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:742:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:746:1: ( rule__Entity__Group__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:747:2: rule__Entity__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11671);
            rule__Entity__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1


    // $ANTLR start rule__Entity__Group__1__Impl
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:753:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:757:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:758:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:758:1: ( ( rule__Entity__NameAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:759:1: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:760:1: ( rule__Entity__NameAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:760:2: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1698);
            rule__Entity__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__Group__1__Impl


    // $ANTLR start rule__Relationship__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:774:1: rule__Relationship__Group__0 : rule__Relationship__Group__0__Impl rule__Relationship__Group__1 ;
    public final void rule__Relationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:778:1: ( rule__Relationship__Group__0__Impl rule__Relationship__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:779:2: rule__Relationship__Group__0__Impl rule__Relationship__Group__1
            {
            pushFollow(FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__01732);
            rule__Relationship__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__01735);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:786:1: rule__Relationship__Group__0__Impl : ( ( rule__Relationship__TypeAssignment_0 ) ) ;
    public final void rule__Relationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:790:1: ( ( ( rule__Relationship__TypeAssignment_0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:791:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:791:1: ( ( rule__Relationship__TypeAssignment_0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:792:1: ( rule__Relationship__TypeAssignment_0 )
            {
             before(grammarAccess.getRelationshipAccess().getTypeAssignment_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:793:1: ( rule__Relationship__TypeAssignment_0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:793:2: rule__Relationship__TypeAssignment_0
            {
            pushFollow(FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl1762);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:803:1: rule__Relationship__Group__1 : rule__Relationship__Group__1__Impl rule__Relationship__Group__2 ;
    public final void rule__Relationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:807:1: ( rule__Relationship__Group__1__Impl rule__Relationship__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:808:2: rule__Relationship__Group__1__Impl rule__Relationship__Group__2
            {
            pushFollow(FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__11792);
            rule__Relationship__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__11795);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:815:1: rule__Relationship__Group__1__Impl : ( '(' ) ;
    public final void rule__Relationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:819:1: ( ( '(' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:820:1: ( '(' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:820:1: ( '(' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:821:1: '('
            {
             before(grammarAccess.getRelationshipAccess().getLeftParenthesisKeyword_1()); 
            match(input,47,FOLLOW_47_in_rule__Relationship__Group__1__Impl1823); 
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:834:1: rule__Relationship__Group__2 : rule__Relationship__Group__2__Impl rule__Relationship__Group__3 ;
    public final void rule__Relationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:838:1: ( rule__Relationship__Group__2__Impl rule__Relationship__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:839:2: rule__Relationship__Group__2__Impl rule__Relationship__Group__3
            {
            pushFollow(FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__21854);
            rule__Relationship__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__21857);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:846:1: rule__Relationship__Group__2__Impl : ( ( rule__Relationship__SourceAssignment_2 ) ) ;
    public final void rule__Relationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:850:1: ( ( ( rule__Relationship__SourceAssignment_2 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:851:1: ( ( rule__Relationship__SourceAssignment_2 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:851:1: ( ( rule__Relationship__SourceAssignment_2 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:852:1: ( rule__Relationship__SourceAssignment_2 )
            {
             before(grammarAccess.getRelationshipAccess().getSourceAssignment_2()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:853:1: ( rule__Relationship__SourceAssignment_2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:853:2: rule__Relationship__SourceAssignment_2
            {
            pushFollow(FOLLOW_rule__Relationship__SourceAssignment_2_in_rule__Relationship__Group__2__Impl1884);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:863:1: rule__Relationship__Group__3 : rule__Relationship__Group__3__Impl rule__Relationship__Group__4 ;
    public final void rule__Relationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:867:1: ( rule__Relationship__Group__3__Impl rule__Relationship__Group__4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:868:2: rule__Relationship__Group__3__Impl rule__Relationship__Group__4
            {
            pushFollow(FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__31914);
            rule__Relationship__Group__3__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__31917);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:875:1: rule__Relationship__Group__3__Impl : ( ',' ) ;
    public final void rule__Relationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:879:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:880:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:880:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:881:1: ','
            {
             before(grammarAccess.getRelationshipAccess().getCommaKeyword_3()); 
            match(input,48,FOLLOW_48_in_rule__Relationship__Group__3__Impl1945); 
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:894:1: rule__Relationship__Group__4 : rule__Relationship__Group__4__Impl rule__Relationship__Group__5 ;
    public final void rule__Relationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:898:1: ( rule__Relationship__Group__4__Impl rule__Relationship__Group__5 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:899:2: rule__Relationship__Group__4__Impl rule__Relationship__Group__5
            {
            pushFollow(FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__41976);
            rule__Relationship__Group__4__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__41979);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:906:1: rule__Relationship__Group__4__Impl : ( ( rule__Relationship__TargetAssignment_4 ) ) ;
    public final void rule__Relationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:910:1: ( ( ( rule__Relationship__TargetAssignment_4 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:911:1: ( ( rule__Relationship__TargetAssignment_4 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:911:1: ( ( rule__Relationship__TargetAssignment_4 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:912:1: ( rule__Relationship__TargetAssignment_4 )
            {
             before(grammarAccess.getRelationshipAccess().getTargetAssignment_4()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:913:1: ( rule__Relationship__TargetAssignment_4 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:913:2: rule__Relationship__TargetAssignment_4
            {
            pushFollow(FOLLOW_rule__Relationship__TargetAssignment_4_in_rule__Relationship__Group__4__Impl2006);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:923:1: rule__Relationship__Group__5 : rule__Relationship__Group__5__Impl ;
    public final void rule__Relationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:927:1: ( rule__Relationship__Group__5__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:928:2: rule__Relationship__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__52036);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:934:1: rule__Relationship__Group__5__Impl : ( ')' ) ;
    public final void rule__Relationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:938:1: ( ( ')' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:939:1: ( ')' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:939:1: ( ')' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:940:1: ')'
            {
             before(grammarAccess.getRelationshipAccess().getRightParenthesisKeyword_5()); 
            match(input,49,FOLLOW_49_in_rule__Relationship__Group__5__Impl2064); 
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


    // $ANTLR start rule__Domain__Group__0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:965:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:969:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:970:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__02107);
            rule__Domain__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__02110);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:977:1: rule__Domain__Group__0__Impl : ( ( rule__Domain__NameAssignment_0 ) ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:981:1: ( ( ( rule__Domain__NameAssignment_0 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:982:1: ( ( rule__Domain__NameAssignment_0 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:982:1: ( ( rule__Domain__NameAssignment_0 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:983:1: ( rule__Domain__NameAssignment_0 )
            {
             before(grammarAccess.getDomainAccess().getNameAssignment_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:984:1: ( rule__Domain__NameAssignment_0 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:984:2: rule__Domain__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Domain__NameAssignment_0_in_rule__Domain__Group__0__Impl2137);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:994:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:998:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:999:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__12167);
            rule__Domain__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__12170);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1006:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__TypeAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1010:1: ( ( ( rule__Domain__TypeAssignment_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1011:1: ( ( rule__Domain__TypeAssignment_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1011:1: ( ( rule__Domain__TypeAssignment_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1012:1: ( rule__Domain__TypeAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getTypeAssignment_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1013:1: ( rule__Domain__TypeAssignment_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1013:2: rule__Domain__TypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Domain__TypeAssignment_1_in_rule__Domain__Group__1__Impl2197);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1023:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1027:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1028:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__22227);
            rule__Domain__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__22230);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1035:1: rule__Domain__Group__2__Impl : ( ( rule__Domain__PropertiesAssignment_2 ) ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1039:1: ( ( ( rule__Domain__PropertiesAssignment_2 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1040:1: ( ( rule__Domain__PropertiesAssignment_2 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1040:1: ( ( rule__Domain__PropertiesAssignment_2 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1041:1: ( rule__Domain__PropertiesAssignment_2 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_2()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1042:1: ( rule__Domain__PropertiesAssignment_2 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1042:2: rule__Domain__PropertiesAssignment_2
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_2_in_rule__Domain__Group__2__Impl2257);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1052:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1056:1: ( rule__Domain__Group__3__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1057:2: rule__Domain__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__32287);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1063:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__Group_3__0 )* ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1067:1: ( ( ( rule__Domain__Group_3__0 )* ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1068:1: ( ( rule__Domain__Group_3__0 )* )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1068:1: ( ( rule__Domain__Group_3__0 )* )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1069:1: ( rule__Domain__Group_3__0 )*
            {
             before(grammarAccess.getDomainAccess().getGroup_3()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1070:1: ( rule__Domain__Group_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==48) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1070:2: rule__Domain__Group_3__0
            	    {
            	    pushFollow(FOLLOW_rule__Domain__Group_3__0_in_rule__Domain__Group__3__Impl2314);
            	    rule__Domain__Group_3__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1088:1: rule__Domain__Group_3__0 : rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1 ;
    public final void rule__Domain__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1092:1: ( rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1093:2: rule__Domain__Group_3__0__Impl rule__Domain__Group_3__1
            {
            pushFollow(FOLLOW_rule__Domain__Group_3__0__Impl_in_rule__Domain__Group_3__02353);
            rule__Domain__Group_3__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Domain__Group_3__1_in_rule__Domain__Group_3__02356);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1100:1: rule__Domain__Group_3__0__Impl : ( ',' ) ;
    public final void rule__Domain__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1104:1: ( ( ',' ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1105:1: ( ',' )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1105:1: ( ',' )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1106:1: ','
            {
             before(grammarAccess.getDomainAccess().getCommaKeyword_3_0()); 
            match(input,48,FOLLOW_48_in_rule__Domain__Group_3__0__Impl2384); 
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1119:1: rule__Domain__Group_3__1 : rule__Domain__Group_3__1__Impl ;
    public final void rule__Domain__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1123:1: ( rule__Domain__Group_3__1__Impl )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1124:2: rule__Domain__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group_3__1__Impl_in_rule__Domain__Group_3__12415);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1130:1: rule__Domain__Group_3__1__Impl : ( ( rule__Domain__PropertiesAssignment_3_1 ) ) ;
    public final void rule__Domain__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1134:1: ( ( ( rule__Domain__PropertiesAssignment_3_1 ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1135:1: ( ( rule__Domain__PropertiesAssignment_3_1 ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1135:1: ( ( rule__Domain__PropertiesAssignment_3_1 ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1136:1: ( rule__Domain__PropertiesAssignment_3_1 )
            {
             before(grammarAccess.getDomainAccess().getPropertiesAssignment_3_1()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1137:1: ( rule__Domain__PropertiesAssignment_3_1 )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1137:2: rule__Domain__PropertiesAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Domain__PropertiesAssignment_3_1_in_rule__Domain__Group_3__1__Impl2442);
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


    // $ANTLR start rule__Situation__TimeAssignment_0_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1152:1: rule__Situation__TimeAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Situation__TimeAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1156:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1157:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1157:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1158:1: RULE_ID
            {
             before(grammarAccess.getSituationAccess().getTimeIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_12481); 
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


    // $ANTLR start rule__Situation__ThingsAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1167:1: rule__Situation__ThingsAssignment_1 : ( ruleThing ) ;
    public final void rule__Situation__ThingsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1171:1: ( ( ruleThing ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1172:1: ( ruleThing )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1172:1: ( ruleThing )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1173:1: ruleThing
            {
             before(grammarAccess.getSituationAccess().getThingsThingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleThing_in_rule__Situation__ThingsAssignment_12512);
            ruleThing();
            _fsp--;

             after(grammarAccess.getSituationAccess().getThingsThingParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Situation__ThingsAssignment_1


    // $ANTLR start rule__Entity__TypeAssignment_0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1182:1: rule__Entity__TypeAssignment_0 : ( ruleEntityType ) ;
    public final void rule__Entity__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1186:1: ( ( ruleEntityType ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1187:1: ( ruleEntityType )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1187:1: ( ruleEntityType )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1188:1: ruleEntityType
            {
             before(grammarAccess.getEntityAccess().getTypeEntityTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleEntityType_in_rule__Entity__TypeAssignment_02543);
            ruleEntityType();
            _fsp--;

             after(grammarAccess.getEntityAccess().getTypeEntityTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__TypeAssignment_0


    // $ANTLR start rule__Entity__NameAssignment_1
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1197:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1201:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1202:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1202:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1203:1: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12574); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Entity__NameAssignment_1


    // $ANTLR start rule__Relationship__TypeAssignment_0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1212:1: rule__Relationship__TypeAssignment_0 : ( ruleRelationshipType ) ;
    public final void rule__Relationship__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1216:1: ( ( ruleRelationshipType ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1217:1: ( ruleRelationshipType )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1217:1: ( ruleRelationshipType )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1218:1: ruleRelationshipType
            {
             before(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRelationshipType_in_rule__Relationship__TypeAssignment_02605);
            ruleRelationshipType();
            _fsp--;

             after(grammarAccess.getRelationshipAccess().getTypeRelationshipTypeEnumRuleCall_0_0()); 

            }


            }

        }
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1227:1: rule__Relationship__SourceAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__SourceAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1231:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1232:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1232:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1233:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getSourceThingCrossReference_2_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1234:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1235:1: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship__SourceAssignment_22640); 
             after(grammarAccess.getRelationshipAccess().getSourceThingIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getSourceThingCrossReference_2_0()); 

            }


            }

        }
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1246:1: rule__Relationship__TargetAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Relationship__TargetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1250:1: ( ( ( RULE_ID ) ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1251:1: ( ( RULE_ID ) )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1251:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1252:1: ( RULE_ID )
            {
             before(grammarAccess.getRelationshipAccess().getTargetThingCrossReference_4_0()); 
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1253:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1254:1: RULE_ID
            {
             before(grammarAccess.getRelationshipAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Relationship__TargetAssignment_42679); 
             after(grammarAccess.getRelationshipAccess().getTargetThingIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRelationshipAccess().getTargetThingCrossReference_4_0()); 

            }


            }

        }
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


    // $ANTLR start rule__Domain__NameAssignment_0
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1265:1: rule__Domain__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Domain__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1269:1: ( ( RULE_ID ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1270:1: ( RULE_ID )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1270:1: ( RULE_ID )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1271:1: RULE_ID
            {
             before(grammarAccess.getDomainAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_02714); 
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1280:1: rule__Domain__TypeAssignment_1 : ( ruleDomainType ) ;
    public final void rule__Domain__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1284:1: ( ( ruleDomainType ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1285:1: ( ruleDomainType )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1285:1: ( ruleDomainType )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1286:1: ruleDomainType
            {
             before(grammarAccess.getDomainAccess().getTypeDomainTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDomainType_in_rule__Domain__TypeAssignment_12745);
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1295:1: rule__Domain__PropertiesAssignment_2 : ( ruleEntity ) ;
    public final void rule__Domain__PropertiesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1299:1: ( ( ruleEntity ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1300:1: ( ruleEntity )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1300:1: ( ruleEntity )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1301:1: ruleEntity
            {
             before(grammarAccess.getDomainAccess().getPropertiesEntityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Domain__PropertiesAssignment_22776);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getDomainAccess().getPropertiesEntityParserRuleCall_2_0()); 

            }


            }

        }
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
    // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1310:1: rule__Domain__PropertiesAssignment_3_1 : ( ruleEntity ) ;
    public final void rule__Domain__PropertiesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1314:1: ( ( ruleEntity ) )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1315:1: ( ruleEntity )
            {
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1315:1: ( ruleEntity )
            // ../situation.ui/src-gen/eu/securechange/ui/contentassist/antlr/internal/InternalSituation.g:1316:1: ruleEntity
            {
             before(grammarAccess.getDomainAccess().getPropertiesEntityParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleEntity_in_rule__Domain__PropertiesAssignment_3_12807);
            ruleEntity();
            _fsp--;

             after(grammarAccess.getDomainAccess().getPropertiesEntityParserRuleCall_3_1_0()); 

            }


            }

        }
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


 

    public static final BitSet FOLLOW_ruleSituation_in_entryRuleSituation61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSituation68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__0_in_ruleSituation94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThing_in_entryRuleThing121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleThing128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Thing__Alternatives_in_ruleThing154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_entryRuleEntity181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEntity188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0_in_ruleEntity214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_entryRuleRelationship241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationship248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0_in_ruleRelationship274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__EntityType__Alternatives_in_ruleEntityType371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DomainType__Alternatives_in_ruleDomainType407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RelationshipType__Alternatives_in_ruleRelationshipType443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Thing__Alternatives478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationship_in_rule__Thing__Alternatives495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__Thing__Alternatives512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__EntityType__Alternatives545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__EntityType__Alternatives566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__EntityType__Alternatives587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__EntityType__Alternatives608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__EntityType__Alternatives629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__EntityType__Alternatives650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__EntityType__Alternatives671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__EntityType__Alternatives692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__EntityType__Alternatives713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__EntityType__Alternatives734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__EntityType__Alternatives755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__EntityType__Alternatives776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__EntityType__Alternatives797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__EntityType__Alternatives818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__DomainType__Alternatives854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__DomainType__Alternatives875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__DomainType__Alternatives896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RelationshipType__Alternatives932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RelationshipType__Alternatives953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RelationshipType__Alternatives974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RelationshipType__Alternatives995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RelationshipType__Alternatives1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RelationshipType__Alternatives1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RelationshipType__Alternatives1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RelationshipType__Alternatives1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__RelationshipType__Alternatives1100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__RelationshipType__Alternatives1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__RelationshipType__Alternatives1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__RelationshipType__Alternatives1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__RelationshipType__Alternatives1184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__RelationshipType__Alternatives1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__RelationshipType__Alternatives1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__RelationshipType__Alternatives1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__RelationshipType__Alternatives1268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__0__Impl_in_rule__Situation__Group__01301 = new BitSet(new long[]{0x00001FFFF1FFF812L});
    public static final BitSet FOLLOW_rule__Situation__Group__1_in_rule__Situation__Group__01304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0_in_rule__Situation__Group__0__Impl1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group__1__Impl_in_rule__Situation__Group__11362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__ThingsAssignment_1_in_rule__Situation__Group__1__Impl1389 = new BitSet(new long[]{0x00001FFFF1FFF812L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__0__Impl_in_rule__Situation__Group_0__01424 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1_in_rule__Situation__Group_0__01427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__Situation__Group_0__0__Impl1455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__1__Impl_in_rule__Situation__Group_0__11486 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2_in_rule__Situation__Group_0__11489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__TimeAssignment_0_1_in_rule__Situation__Group_0__1__Impl1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Situation__Group_0__2__Impl_in_rule__Situation__Group_0__21546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__Situation__Group_0__2__Impl1574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__0__Impl_in_rule__Entity__Group__01611 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Entity__Group__1_in_rule__Entity__Group__01614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__TypeAssignment_0_in_rule__Entity__Group__0__Impl1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__Group__1__Impl_in_rule__Entity__Group__11671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Entity__NameAssignment_1_in_rule__Entity__Group__1__Impl1698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__0__Impl_in_rule__Relationship__Group__01732 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1_in_rule__Relationship__Group__01735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TypeAssignment_0_in_rule__Relationship__Group__0__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__1__Impl_in_rule__Relationship__Group__11792 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2_in_rule__Relationship__Group__11795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__Relationship__Group__1__Impl1823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__2__Impl_in_rule__Relationship__Group__21854 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3_in_rule__Relationship__Group__21857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__SourceAssignment_2_in_rule__Relationship__Group__2__Impl1884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__3__Impl_in_rule__Relationship__Group__31914 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4_in_rule__Relationship__Group__31917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Relationship__Group__3__Impl1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__4__Impl_in_rule__Relationship__Group__41976 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5_in_rule__Relationship__Group__41979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__TargetAssignment_4_in_rule__Relationship__Group__4__Impl2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Relationship__Group__5__Impl_in_rule__Relationship__Group__52036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_rule__Relationship__Group__5__Impl2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__02107 = new BitSet(new long[]{0x000000000E000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__02110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__NameAssignment_0_in_rule__Domain__Group__0__Impl2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__12167 = new BitSet(new long[]{0x0000000001FFF800L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__12170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__TypeAssignment_1_in_rule__Domain__Group__1__Impl2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__22227 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__22230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_2_in_rule__Domain__Group__2__Impl2257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__32287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__0_in_rule__Domain__Group__3__Impl2314 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__0__Impl_in_rule__Domain__Group_3__02353 = new BitSet(new long[]{0x0000000001FFF800L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__1_in_rule__Domain__Group_3__02356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__Domain__Group_3__0__Impl2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group_3__1__Impl_in_rule__Domain__Group_3__12415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__PropertiesAssignment_3_1_in_rule__Domain__Group_3__1__Impl2442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Situation__TimeAssignment_0_12481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThing_in_rule__Situation__ThingsAssignment_12512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntityType_in_rule__Entity__TypeAssignment_02543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Entity__NameAssignment_12574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationshipType_in_rule__Relationship__TypeAssignment_02605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__SourceAssignment_22640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Relationship__TargetAssignment_42679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Domain__NameAssignment_02714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomainType_in_rule__Domain__TypeAssignment_12745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Domain__PropertiesAssignment_22776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEntity_in_rule__Domain__PropertiesAssignment_3_12807 = new BitSet(new long[]{0x0000000000000002L});

}