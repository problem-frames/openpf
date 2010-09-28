package uk.ac.open.dependency.ui.contentassist.antlr.internal; 

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
import uk.ac.open.dependency.services.DependencyGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDependencyParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "'see'", "'--'", "'->'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;

        public InternalDependencyParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g"; }


     
     	private DependencyGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DependencyGrammarAccess grammarAccess) {
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:61:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:62:1: ( ruleModel EOF )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:63:1: ruleModel EOF
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:70:1: ruleModel : ( ( rule__Model__Alternatives )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:74:2: ( ( ( rule__Model__Alternatives )* ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:75:1: ( ( rule__Model__Alternatives )* )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:75:1: ( ( rule__Model__Alternatives )* )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:76:1: ( rule__Model__Alternatives )*
            {
             before(grammarAccess.getModelAccess().getAlternatives()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:77:1: ( rule__Model__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:77:2: rule__Model__Alternatives
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_in_ruleModel94);
            	    rule__Model__Alternatives();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start entryRuleNode
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:89:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:90:1: ( ruleNode EOF )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:91:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode122);
            ruleNode();
            _fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode129); 

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
    // $ANTLR end entryRuleNode


    // $ANTLR start ruleNode
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:98:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:102:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:103:1: ( ( rule__Node__Group__0 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:103:1: ( ( rule__Node__Group__0 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:104:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:105:1: ( rule__Node__Group__0 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:105:2: rule__Node__Group__0
            {
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode155);
            rule__Node__Group__0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNode


    // $ANTLR start entryRuleDependency
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:117:1: entryRuleDependency : ruleDependency EOF ;
    public final void entryRuleDependency() throws RecognitionException {
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:118:1: ( ruleDependency EOF )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:119:1: ruleDependency EOF
            {
             before(grammarAccess.getDependencyRule()); 
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency182);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency189); 

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
    // $ANTLR end entryRuleDependency


    // $ANTLR start ruleDependency
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:126:1: ruleDependency : ( ( rule__Dependency__Alternatives ) ) ;
    public final void ruleDependency() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:130:2: ( ( ( rule__Dependency__Alternatives ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:131:1: ( ( rule__Dependency__Alternatives ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:131:1: ( ( rule__Dependency__Alternatives ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:132:1: ( rule__Dependency__Alternatives )
            {
             before(grammarAccess.getDependencyAccess().getAlternatives()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:133:1: ( rule__Dependency__Alternatives )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:133:2: rule__Dependency__Alternatives
            {
            pushFollow(FOLLOW_rule__Dependency__Alternatives_in_ruleDependency215);
            rule__Dependency__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getDependencyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleDependency


    // $ANTLR start entryRuleCoupling
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:145:1: entryRuleCoupling : ruleCoupling EOF ;
    public final void entryRuleCoupling() throws RecognitionException {
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:146:1: ( ruleCoupling EOF )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:147:1: ruleCoupling EOF
            {
             before(grammarAccess.getCouplingRule()); 
            pushFollow(FOLLOW_ruleCoupling_in_entryRuleCoupling242);
            ruleCoupling();
            _fsp--;

             after(grammarAccess.getCouplingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoupling249); 

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
    // $ANTLR end entryRuleCoupling


    // $ANTLR start ruleCoupling
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:154:1: ruleCoupling : ( ( rule__Coupling__Group__0 ) ) ;
    public final void ruleCoupling() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:158:2: ( ( ( rule__Coupling__Group__0 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:159:1: ( ( rule__Coupling__Group__0 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:159:1: ( ( rule__Coupling__Group__0 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:160:1: ( rule__Coupling__Group__0 )
            {
             before(grammarAccess.getCouplingAccess().getGroup()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:161:1: ( rule__Coupling__Group__0 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:161:2: rule__Coupling__Group__0
            {
            pushFollow(FOLLOW_rule__Coupling__Group__0_in_ruleCoupling275);
            rule__Coupling__Group__0();
            _fsp--;


            }

             after(grammarAccess.getCouplingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleCoupling


    // $ANTLR start entryRulePrecedence
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:173:1: entryRulePrecedence : rulePrecedence EOF ;
    public final void entryRulePrecedence() throws RecognitionException {
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:174:1: ( rulePrecedence EOF )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:175:1: rulePrecedence EOF
            {
             before(grammarAccess.getPrecedenceRule()); 
            pushFollow(FOLLOW_rulePrecedence_in_entryRulePrecedence302);
            rulePrecedence();
            _fsp--;

             after(grammarAccess.getPrecedenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecedence309); 

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
    // $ANTLR end entryRulePrecedence


    // $ANTLR start rulePrecedence
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:182:1: rulePrecedence : ( ( rule__Precedence__Group__0 ) ) ;
    public final void rulePrecedence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:186:2: ( ( ( rule__Precedence__Group__0 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:187:1: ( ( rule__Precedence__Group__0 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:187:1: ( ( rule__Precedence__Group__0 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:188:1: ( rule__Precedence__Group__0 )
            {
             before(grammarAccess.getPrecedenceAccess().getGroup()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:189:1: ( rule__Precedence__Group__0 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:189:2: rule__Precedence__Group__0
            {
            pushFollow(FOLLOW_rule__Precedence__Group__0_in_rulePrecedence335);
            rule__Precedence__Group__0();
            _fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rulePrecedence


    // $ANTLR start rule__Model__Alternatives
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:201:1: rule__Model__Alternatives : ( ( ( rule__Model__NodesAssignment_0 ) ) | ( ( rule__Model__DependenciesAssignment_1 ) ) );
    public final void rule__Model__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:205:1: ( ( ( rule__Model__NodesAssignment_0 ) ) | ( ( rule__Model__DependenciesAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=14 && LA2_1<=15)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==EOF||LA2_1==RULE_ID||LA2_1==11) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("201:1: rule__Model__Alternatives : ( ( ( rule__Model__NodesAssignment_0 ) ) | ( ( rule__Model__DependenciesAssignment_1 ) ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("201:1: rule__Model__Alternatives : ( ( ( rule__Model__NodesAssignment_0 ) ) | ( ( rule__Model__DependenciesAssignment_1 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:206:1: ( ( rule__Model__NodesAssignment_0 ) )
                    {
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:206:1: ( ( rule__Model__NodesAssignment_0 ) )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:207:1: ( rule__Model__NodesAssignment_0 )
                    {
                     before(grammarAccess.getModelAccess().getNodesAssignment_0()); 
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:208:1: ( rule__Model__NodesAssignment_0 )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:208:2: rule__Model__NodesAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Model__NodesAssignment_0_in_rule__Model__Alternatives371);
                    rule__Model__NodesAssignment_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNodesAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:212:6: ( ( rule__Model__DependenciesAssignment_1 ) )
                    {
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:212:6: ( ( rule__Model__DependenciesAssignment_1 ) )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:213:1: ( rule__Model__DependenciesAssignment_1 )
                    {
                     before(grammarAccess.getModelAccess().getDependenciesAssignment_1()); 
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:214:1: ( rule__Model__DependenciesAssignment_1 )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:214:2: rule__Model__DependenciesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Model__DependenciesAssignment_1_in_rule__Model__Alternatives389);
                    rule__Model__DependenciesAssignment_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDependenciesAssignment_1()); 

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
    // $ANTLR end rule__Model__Alternatives


    // $ANTLR start rule__Dependency__Alternatives
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:223:1: rule__Dependency__Alternatives : ( ( ruleCoupling ) | ( rulePrecedence ) );
    public final void rule__Dependency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:227:1: ( ( ruleCoupling ) | ( rulePrecedence ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==15) ) {
                    alt3=2;
                }
                else if ( (LA3_1==14) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("223:1: rule__Dependency__Alternatives : ( ( ruleCoupling ) | ( rulePrecedence ) );", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("223:1: rule__Dependency__Alternatives : ( ( ruleCoupling ) | ( rulePrecedence ) );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:228:1: ( ruleCoupling )
                    {
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:228:1: ( ruleCoupling )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:229:1: ruleCoupling
                    {
                     before(grammarAccess.getDependencyAccess().getCouplingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCoupling_in_rule__Dependency__Alternatives422);
                    ruleCoupling();
                    _fsp--;

                     after(grammarAccess.getDependencyAccess().getCouplingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:234:6: ( rulePrecedence )
                    {
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:234:6: ( rulePrecedence )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:235:1: rulePrecedence
                    {
                     before(grammarAccess.getDependencyAccess().getPrecedenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePrecedence_in_rule__Dependency__Alternatives439);
                    rulePrecedence();
                    _fsp--;

                     after(grammarAccess.getDependencyAccess().getPrecedenceParserRuleCall_1()); 

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
    // $ANTLR end rule__Dependency__Alternatives


    // $ANTLR start rule__Node__Group__0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:247:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:251:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:252:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__0469);
            rule__Node__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__0472);
            rule__Node__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group__0


    // $ANTLR start rule__Node__Group__0__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:259:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:263:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:264:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:264:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:265:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:266:1: ( rule__Node__NameAssignment_0 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:266:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl499);
            rule__Node__NameAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group__0__Impl


    // $ANTLR start rule__Node__Group__1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:276:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:280:1: ( rule__Node__Group__1__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:281:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__1529);
            rule__Node__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group__1


    // $ANTLR start rule__Node__Group__1__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:287:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:291:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:292:1: ( ( rule__Node__Group_1__0 )? )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:292:1: ( ( rule__Node__Group_1__0 )? )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:293:1: ( rule__Node__Group_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_1()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:294:1: ( rule__Node__Group_1__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:294:2: rule__Node__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_1__0_in_rule__Node__Group__1__Impl556);
                    rule__Node__Group_1__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group__1__Impl


    // $ANTLR start rule__Node__Group_1__0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:308:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:312:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:313:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_1__0__Impl_in_rule__Node__Group_1__0591);
            rule__Node__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_1__1_in_rule__Node__Group_1__0594);
            rule__Node__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_1__0


    // $ANTLR start rule__Node__Group_1__0__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:320:1: rule__Node__Group_1__0__Impl : ( '{' ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:324:1: ( ( '{' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:325:1: ( '{' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:325:1: ( '{' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:326:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,11,FOLLOW_11_in_rule__Node__Group_1__0__Impl622); 
             after(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_1__0__Impl


    // $ANTLR start rule__Node__Group_1__1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:339:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl rule__Node__Group_1__2 ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:343:1: ( rule__Node__Group_1__1__Impl rule__Node__Group_1__2 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:344:2: rule__Node__Group_1__1__Impl rule__Node__Group_1__2
            {
            pushFollow(FOLLOW_rule__Node__Group_1__1__Impl_in_rule__Node__Group_1__1653);
            rule__Node__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_1__2_in_rule__Node__Group_1__1656);
            rule__Node__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_1__1


    // $ANTLR start rule__Node__Group_1__1__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:351:1: rule__Node__Group_1__1__Impl : ( ( rule__Node__Group_1_1__0 )* ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:355:1: ( ( ( rule__Node__Group_1_1__0 )* ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:356:1: ( ( rule__Node__Group_1_1__0 )* )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:356:1: ( ( rule__Node__Group_1_1__0 )* )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:357:1: ( rule__Node__Group_1_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_1_1()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:358:1: ( rule__Node__Group_1_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==13) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:358:2: rule__Node__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_1_1__0_in_rule__Node__Group_1__1__Impl683);
            	    rule__Node__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getNodeAccess().getGroup_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_1__1__Impl


    // $ANTLR start rule__Node__Group_1__2
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:368:1: rule__Node__Group_1__2 : rule__Node__Group_1__2__Impl ;
    public final void rule__Node__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:372:1: ( rule__Node__Group_1__2__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:373:2: rule__Node__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_1__2__Impl_in_rule__Node__Group_1__2714);
            rule__Node__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_1__2


    // $ANTLR start rule__Node__Group_1__2__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:379:1: rule__Node__Group_1__2__Impl : ( '}' ) ;
    public final void rule__Node__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:383:1: ( ( '}' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:384:1: ( '}' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:384:1: ( '}' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:385:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,12,FOLLOW_12_in_rule__Node__Group_1__2__Impl742); 
             after(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_1__2__Impl


    // $ANTLR start rule__Node__Group_1_1__0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:404:1: rule__Node__Group_1_1__0 : rule__Node__Group_1_1__0__Impl rule__Node__Group_1_1__1 ;
    public final void rule__Node__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:408:1: ( rule__Node__Group_1_1__0__Impl rule__Node__Group_1_1__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:409:2: rule__Node__Group_1_1__0__Impl rule__Node__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_1_1__0__Impl_in_rule__Node__Group_1_1__0779);
            rule__Node__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_1_1__1_in_rule__Node__Group_1_1__0782);
            rule__Node__Group_1_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_1_1__0


    // $ANTLR start rule__Node__Group_1_1__0__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:416:1: rule__Node__Group_1_1__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:420:1: ( ( 'see' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:421:1: ( 'see' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:421:1: ( 'see' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:422:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_1_1_0()); 
            match(input,13,FOLLOW_13_in_rule__Node__Group_1_1__0__Impl810); 
             after(grammarAccess.getNodeAccess().getSeeKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_1_1__0__Impl


    // $ANTLR start rule__Node__Group_1_1__1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:435:1: rule__Node__Group_1_1__1 : rule__Node__Group_1_1__1__Impl ;
    public final void rule__Node__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:439:1: ( rule__Node__Group_1_1__1__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:440:2: rule__Node__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_1_1__1__Impl_in_rule__Node__Group_1_1__1841);
            rule__Node__Group_1_1__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_1_1__1


    // $ANTLR start rule__Node__Group_1_1__1__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:446:1: rule__Node__Group_1_1__1__Impl : ( ( rule__Node__ReferrenceAssignment_1_1_1 ) ) ;
    public final void rule__Node__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:450:1: ( ( ( rule__Node__ReferrenceAssignment_1_1_1 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:451:1: ( ( rule__Node__ReferrenceAssignment_1_1_1 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:451:1: ( ( rule__Node__ReferrenceAssignment_1_1_1 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:452:1: ( rule__Node__ReferrenceAssignment_1_1_1 )
            {
             before(grammarAccess.getNodeAccess().getReferrenceAssignment_1_1_1()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:453:1: ( rule__Node__ReferrenceAssignment_1_1_1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:453:2: rule__Node__ReferrenceAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Node__ReferrenceAssignment_1_1_1_in_rule__Node__Group_1_1__1__Impl868);
            rule__Node__ReferrenceAssignment_1_1_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getReferrenceAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_1_1__1__Impl


    // $ANTLR start rule__Coupling__Group__0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:467:1: rule__Coupling__Group__0 : rule__Coupling__Group__0__Impl rule__Coupling__Group__1 ;
    public final void rule__Coupling__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:471:1: ( rule__Coupling__Group__0__Impl rule__Coupling__Group__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:472:2: rule__Coupling__Group__0__Impl rule__Coupling__Group__1
            {
            pushFollow(FOLLOW_rule__Coupling__Group__0__Impl_in_rule__Coupling__Group__0902);
            rule__Coupling__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Coupling__Group__1_in_rule__Coupling__Group__0905);
            rule__Coupling__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Coupling__Group__0


    // $ANTLR start rule__Coupling__Group__0__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:479:1: rule__Coupling__Group__0__Impl : ( ( rule__Coupling__FromAssignment_0 ) ) ;
    public final void rule__Coupling__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:483:1: ( ( ( rule__Coupling__FromAssignment_0 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:484:1: ( ( rule__Coupling__FromAssignment_0 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:484:1: ( ( rule__Coupling__FromAssignment_0 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:485:1: ( rule__Coupling__FromAssignment_0 )
            {
             before(grammarAccess.getCouplingAccess().getFromAssignment_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:486:1: ( rule__Coupling__FromAssignment_0 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:486:2: rule__Coupling__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Coupling__FromAssignment_0_in_rule__Coupling__Group__0__Impl932);
            rule__Coupling__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getCouplingAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Coupling__Group__0__Impl


    // $ANTLR start rule__Coupling__Group__1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:496:1: rule__Coupling__Group__1 : rule__Coupling__Group__1__Impl rule__Coupling__Group__2 ;
    public final void rule__Coupling__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:500:1: ( rule__Coupling__Group__1__Impl rule__Coupling__Group__2 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:501:2: rule__Coupling__Group__1__Impl rule__Coupling__Group__2
            {
            pushFollow(FOLLOW_rule__Coupling__Group__1__Impl_in_rule__Coupling__Group__1962);
            rule__Coupling__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Coupling__Group__2_in_rule__Coupling__Group__1965);
            rule__Coupling__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Coupling__Group__1


    // $ANTLR start rule__Coupling__Group__1__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:508:1: rule__Coupling__Group__1__Impl : ( '--' ) ;
    public final void rule__Coupling__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:512:1: ( ( '--' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:513:1: ( '--' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:513:1: ( '--' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:514:1: '--'
            {
             before(grammarAccess.getCouplingAccess().getHyphenMinusHyphenMinusKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Coupling__Group__1__Impl993); 
             after(grammarAccess.getCouplingAccess().getHyphenMinusHyphenMinusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Coupling__Group__1__Impl


    // $ANTLR start rule__Coupling__Group__2
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:527:1: rule__Coupling__Group__2 : rule__Coupling__Group__2__Impl ;
    public final void rule__Coupling__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:531:1: ( rule__Coupling__Group__2__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:532:2: rule__Coupling__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Coupling__Group__2__Impl_in_rule__Coupling__Group__21024);
            rule__Coupling__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Coupling__Group__2


    // $ANTLR start rule__Coupling__Group__2__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:538:1: rule__Coupling__Group__2__Impl : ( ( rule__Coupling__ToAssignment_2 ) ) ;
    public final void rule__Coupling__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:542:1: ( ( ( rule__Coupling__ToAssignment_2 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:543:1: ( ( rule__Coupling__ToAssignment_2 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:543:1: ( ( rule__Coupling__ToAssignment_2 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:544:1: ( rule__Coupling__ToAssignment_2 )
            {
             before(grammarAccess.getCouplingAccess().getToAssignment_2()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:545:1: ( rule__Coupling__ToAssignment_2 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:545:2: rule__Coupling__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Coupling__ToAssignment_2_in_rule__Coupling__Group__2__Impl1051);
            rule__Coupling__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getCouplingAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Coupling__Group__2__Impl


    // $ANTLR start rule__Precedence__Group__0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:561:1: rule__Precedence__Group__0 : rule__Precedence__Group__0__Impl rule__Precedence__Group__1 ;
    public final void rule__Precedence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:565:1: ( rule__Precedence__Group__0__Impl rule__Precedence__Group__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:566:2: rule__Precedence__Group__0__Impl rule__Precedence__Group__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group__0__Impl_in_rule__Precedence__Group__01087);
            rule__Precedence__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group__1_in_rule__Precedence__Group__01090);
            rule__Precedence__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Precedence__Group__0


    // $ANTLR start rule__Precedence__Group__0__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:573:1: rule__Precedence__Group__0__Impl : ( ( rule__Precedence__FromAssignment_0 ) ) ;
    public final void rule__Precedence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:577:1: ( ( ( rule__Precedence__FromAssignment_0 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:578:1: ( ( rule__Precedence__FromAssignment_0 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:578:1: ( ( rule__Precedence__FromAssignment_0 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:579:1: ( rule__Precedence__FromAssignment_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFromAssignment_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:580:1: ( rule__Precedence__FromAssignment_0 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:580:2: rule__Precedence__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Precedence__FromAssignment_0_in_rule__Precedence__Group__0__Impl1117);
            rule__Precedence__FromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getFromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Precedence__Group__0__Impl


    // $ANTLR start rule__Precedence__Group__1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:590:1: rule__Precedence__Group__1 : rule__Precedence__Group__1__Impl rule__Precedence__Group__2 ;
    public final void rule__Precedence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:594:1: ( rule__Precedence__Group__1__Impl rule__Precedence__Group__2 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:595:2: rule__Precedence__Group__1__Impl rule__Precedence__Group__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group__1__Impl_in_rule__Precedence__Group__11147);
            rule__Precedence__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group__2_in_rule__Precedence__Group__11150);
            rule__Precedence__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Precedence__Group__1


    // $ANTLR start rule__Precedence__Group__1__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:602:1: rule__Precedence__Group__1__Impl : ( '->' ) ;
    public final void rule__Precedence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:606:1: ( ( '->' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:607:1: ( '->' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:607:1: ( '->' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:608:1: '->'
            {
             before(grammarAccess.getPrecedenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Precedence__Group__1__Impl1178); 
             after(grammarAccess.getPrecedenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Precedence__Group__1__Impl


    // $ANTLR start rule__Precedence__Group__2
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:621:1: rule__Precedence__Group__2 : rule__Precedence__Group__2__Impl ;
    public final void rule__Precedence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:625:1: ( rule__Precedence__Group__2__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:626:2: rule__Precedence__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group__2__Impl_in_rule__Precedence__Group__21209);
            rule__Precedence__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Precedence__Group__2


    // $ANTLR start rule__Precedence__Group__2__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:632:1: rule__Precedence__Group__2__Impl : ( ( rule__Precedence__ToAssignment_2 ) ) ;
    public final void rule__Precedence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:636:1: ( ( ( rule__Precedence__ToAssignment_2 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:637:1: ( ( rule__Precedence__ToAssignment_2 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:637:1: ( ( rule__Precedence__ToAssignment_2 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:638:1: ( rule__Precedence__ToAssignment_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getToAssignment_2()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:639:1: ( rule__Precedence__ToAssignment_2 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:639:2: rule__Precedence__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Precedence__ToAssignment_2_in_rule__Precedence__Group__2__Impl1236);
            rule__Precedence__ToAssignment_2();
            _fsp--;


            }

             after(grammarAccess.getPrecedenceAccess().getToAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Precedence__Group__2__Impl


    // $ANTLR start rule__Model__NodesAssignment_0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:656:1: rule__Model__NodesAssignment_0 : ( ruleNode ) ;
    public final void rule__Model__NodesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:660:1: ( ( ruleNode ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:661:1: ( ruleNode )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:661:1: ( ruleNode )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:662:1: ruleNode
            {
             before(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__Model__NodesAssignment_01277);
            ruleNode();
            _fsp--;

             after(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__NodesAssignment_0


    // $ANTLR start rule__Model__DependenciesAssignment_1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:671:1: rule__Model__DependenciesAssignment_1 : ( ruleDependency ) ;
    public final void rule__Model__DependenciesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:675:1: ( ( ruleDependency ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:676:1: ( ruleDependency )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:676:1: ( ruleDependency )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:677:1: ruleDependency
            {
             before(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_11308);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__DependenciesAssignment_1


    // $ANTLR start rule__Node__NameAssignment_0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:686:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:690:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:691:1: ( RULE_ID )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:691:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:692:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_01339); 
             after(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__NameAssignment_0


    // $ANTLR start rule__Node__ReferrenceAssignment_1_1_1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:701:1: rule__Node__ReferrenceAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Node__ReferrenceAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:705:1: ( ( RULE_STRING ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:706:1: ( RULE_STRING )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:706:1: ( RULE_STRING )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:707:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getReferrenceSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__ReferrenceAssignment_1_1_11370); 
             after(grammarAccess.getNodeAccess().getReferrenceSTRINGTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__ReferrenceAssignment_1_1_1


    // $ANTLR start rule__Coupling__FromAssignment_0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:716:1: rule__Coupling__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Coupling__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:720:1: ( ( ( RULE_ID ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:721:1: ( ( RULE_ID ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:721:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:722:1: ( RULE_ID )
            {
             before(grammarAccess.getCouplingAccess().getFromNodeCrossReference_0_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:723:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:724:1: RULE_ID
            {
             before(grammarAccess.getCouplingAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Coupling__FromAssignment_01405); 
             after(grammarAccess.getCouplingAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getCouplingAccess().getFromNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Coupling__FromAssignment_0


    // $ANTLR start rule__Coupling__ToAssignment_2
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:735:1: rule__Coupling__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Coupling__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:739:1: ( ( ( RULE_ID ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:740:1: ( ( RULE_ID ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:740:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:741:1: ( RULE_ID )
            {
             before(grammarAccess.getCouplingAccess().getToNodeCrossReference_2_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:742:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:743:1: RULE_ID
            {
             before(grammarAccess.getCouplingAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Coupling__ToAssignment_21444); 
             after(grammarAccess.getCouplingAccess().getToNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getCouplingAccess().getToNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Coupling__ToAssignment_2


    // $ANTLR start rule__Precedence__FromAssignment_0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:754:1: rule__Precedence__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Precedence__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:758:1: ( ( ( RULE_ID ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:759:1: ( ( RULE_ID ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:759:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:760:1: ( RULE_ID )
            {
             before(grammarAccess.getPrecedenceAccess().getFromNodeCrossReference_0_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:761:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:762:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__FromAssignment_01483); 
             after(grammarAccess.getPrecedenceAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPrecedenceAccess().getFromNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Precedence__FromAssignment_0


    // $ANTLR start rule__Precedence__ToAssignment_2
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:773:1: rule__Precedence__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Precedence__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:777:1: ( ( ( RULE_ID ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:778:1: ( ( RULE_ID ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:778:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:779:1: ( RULE_ID )
            {
             before(grammarAccess.getPrecedenceAccess().getToNodeCrossReference_2_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:780:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:781:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__ToAssignment_21522); 
             after(grammarAccess.getPrecedenceAccess().getToNodeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPrecedenceAccess().getToNodeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Precedence__ToAssignment_2


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_in_ruleModel94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Alternatives_in_ruleDependency215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoupling_in_entryRuleCoupling242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoupling249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__Group__0_in_ruleCoupling275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecedence_in_entryRulePrecedence302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecedence309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group__0_in_rulePrecedence335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NodesAssignment_0_in_rule__Model__Alternatives371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DependenciesAssignment_1_in_rule__Model__Alternatives389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoupling_in_rule__Dependency__Alternatives422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecedence_in_rule__Dependency__Alternatives439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__0469 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__0472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1__0_in_rule__Node__Group__1__Impl556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1__0__Impl_in_rule__Node__Group_1__0591 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_rule__Node__Group_1__1_in_rule__Node__Group_1__0594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Node__Group_1__0__Impl622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1__1__Impl_in_rule__Node__Group_1__1653 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__Node__Group_1__2_in_rule__Node__Group_1__1656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1_1__0_in_rule__Node__Group_1__1__Impl683 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_rule__Node__Group_1__2__Impl_in_rule__Node__Group_1__2714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Node__Group_1__2__Impl742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1_1__0__Impl_in_rule__Node__Group_1_1__0779 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_1_1__1_in_rule__Node__Group_1_1__0782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Node__Group_1_1__0__Impl810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1_1__1__Impl_in_rule__Node__Group_1_1__1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ReferrenceAssignment_1_1_1_in_rule__Node__Group_1_1__1__Impl868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__Group__0__Impl_in_rule__Coupling__Group__0902 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Coupling__Group__1_in_rule__Coupling__Group__0905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__FromAssignment_0_in_rule__Coupling__Group__0__Impl932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__Group__1__Impl_in_rule__Coupling__Group__1962 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Coupling__Group__2_in_rule__Coupling__Group__1965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Coupling__Group__1__Impl993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__Group__2__Impl_in_rule__Coupling__Group__21024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__ToAssignment_2_in_rule__Coupling__Group__2__Impl1051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group__0__Impl_in_rule__Precedence__Group__01087 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Precedence__Group__1_in_rule__Precedence__Group__01090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__FromAssignment_0_in_rule__Precedence__Group__0__Impl1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group__1__Impl_in_rule__Precedence__Group__11147 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group__2_in_rule__Precedence__Group__11150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Precedence__Group__1__Impl1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group__2__Impl_in_rule__Precedence__Group__21209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__ToAssignment_2_in_rule__Precedence__Group__2__Impl1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__Model__NodesAssignment_01277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_11308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_01339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__ReferrenceAssignment_1_1_11370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Coupling__FromAssignment_01405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Coupling__ToAssignment_21444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__FromAssignment_01483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__ToAssignment_21522 = new BitSet(new long[]{0x0000000000000002L});

}