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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'graph'", "'{'", "'}'", "'see'", "'--'", "'->'"
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:70:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:74:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:75:1: ( ( rule__Model__Group__0 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:75:1: ( ( rule__Model__Group__0 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:76:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:77:1: ( rule__Model__Group__0 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:77:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();
            _fsp--;


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
    // $ANTLR end ruleModel


    // $ANTLR start entryRuleNode
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:89:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:90:1: ( ruleNode EOF )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:91:1: ruleNode EOF
            {
             before(grammarAccess.getNodeRule()); 
            pushFollow(FOLLOW_ruleNode_in_entryRuleNode121);
            ruleNode();
            _fsp--;

             after(grammarAccess.getNodeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNode128); 

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
            pushFollow(FOLLOW_rule__Node__Group__0_in_ruleNode154);
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
            pushFollow(FOLLOW_ruleDependency_in_entryRuleDependency181);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getDependencyRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDependency188); 

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
            pushFollow(FOLLOW_rule__Dependency__Alternatives_in_ruleDependency214);
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
            pushFollow(FOLLOW_ruleCoupling_in_entryRuleCoupling241);
            ruleCoupling();
            _fsp--;

             after(grammarAccess.getCouplingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCoupling248); 

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
            pushFollow(FOLLOW_rule__Coupling__Group__0_in_ruleCoupling274);
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
            pushFollow(FOLLOW_rulePrecedence_in_entryRulePrecedence301);
            rulePrecedence();
            _fsp--;

             after(grammarAccess.getPrecedenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePrecedence308); 

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
            pushFollow(FOLLOW_rule__Precedence__Group__0_in_rulePrecedence334);
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


    // $ANTLR start rule__Model__Alternatives_1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:201:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__NodesAssignment_1_0 ) ) | ( ( rule__Model__DependenciesAssignment_1_1 ) ) );
    public final void rule__Model__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:205:1: ( ( ( rule__Model__NodesAssignment_1_0 ) ) | ( ( rule__Model__DependenciesAssignment_1_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=15 && LA1_1<=16)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||LA1_1==RULE_ID||LA1_1==12) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("201:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__NodesAssignment_1_0 ) ) | ( ( rule__Model__DependenciesAssignment_1_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("201:1: rule__Model__Alternatives_1 : ( ( ( rule__Model__NodesAssignment_1_0 ) ) | ( ( rule__Model__DependenciesAssignment_1_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:206:1: ( ( rule__Model__NodesAssignment_1_0 ) )
                    {
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:206:1: ( ( rule__Model__NodesAssignment_1_0 ) )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:207:1: ( rule__Model__NodesAssignment_1_0 )
                    {
                     before(grammarAccess.getModelAccess().getNodesAssignment_1_0()); 
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:208:1: ( rule__Model__NodesAssignment_1_0 )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:208:2: rule__Model__NodesAssignment_1_0
                    {
                    pushFollow(FOLLOW_rule__Model__NodesAssignment_1_0_in_rule__Model__Alternatives_1370);
                    rule__Model__NodesAssignment_1_0();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getNodesAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:212:6: ( ( rule__Model__DependenciesAssignment_1_1 ) )
                    {
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:212:6: ( ( rule__Model__DependenciesAssignment_1_1 ) )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:213:1: ( rule__Model__DependenciesAssignment_1_1 )
                    {
                     before(grammarAccess.getModelAccess().getDependenciesAssignment_1_1()); 
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:214:1: ( rule__Model__DependenciesAssignment_1_1 )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:214:2: rule__Model__DependenciesAssignment_1_1
                    {
                    pushFollow(FOLLOW_rule__Model__DependenciesAssignment_1_1_in_rule__Model__Alternatives_1388);
                    rule__Model__DependenciesAssignment_1_1();
                    _fsp--;


                    }

                     after(grammarAccess.getModelAccess().getDependenciesAssignment_1_1()); 

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
    // $ANTLR end rule__Model__Alternatives_1


    // $ANTLR start rule__Dependency__Alternatives
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:223:1: rule__Dependency__Alternatives : ( ( ruleCoupling ) | ( rulePrecedence ) );
    public final void rule__Dependency__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:227:1: ( ( ruleCoupling ) | ( rulePrecedence ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==16) ) {
                    alt2=2;
                }
                else if ( (LA2_1==15) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("223:1: rule__Dependency__Alternatives : ( ( ruleCoupling ) | ( rulePrecedence ) );", 2, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("223:1: rule__Dependency__Alternatives : ( ( ruleCoupling ) | ( rulePrecedence ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:228:1: ( ruleCoupling )
                    {
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:228:1: ( ruleCoupling )
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:229:1: ruleCoupling
                    {
                     before(grammarAccess.getDependencyAccess().getCouplingParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleCoupling_in_rule__Dependency__Alternatives421);
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
                    pushFollow(FOLLOW_rulePrecedence_in_rule__Dependency__Alternatives438);
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


    // $ANTLR start rule__Model__Group__0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:247:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:251:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:252:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0468);
            rule__Model__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0471);
            rule__Model__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0


    // $ANTLR start rule__Model__Group__0__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:259:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:263:1: ( ( ( rule__Model__Group_0__0 )? ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:264:1: ( ( rule__Model__Group_0__0 )? )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:264:1: ( ( rule__Model__Group_0__0 )? )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:265:1: ( rule__Model__Group_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:266:1: ( rule__Model__Group_0__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:266:2: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl498);
                    rule__Model__Group_0__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__0__Impl


    // $ANTLR start rule__Model__Group__1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:276:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:280:1: ( rule__Model__Group__1__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:281:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1529);
            rule__Model__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group__1


    // $ANTLR start rule__Model__Group__1__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:287:1: rule__Model__Group__1__Impl : ( ( rule__Model__Alternatives_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:291:1: ( ( ( rule__Model__Alternatives_1 )* ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:292:1: ( ( rule__Model__Alternatives_1 )* )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:292:1: ( ( rule__Model__Alternatives_1 )* )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:293:1: ( rule__Model__Alternatives_1 )*
            {
             before(grammarAccess.getModelAccess().getAlternatives_1()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:294:1: ( rule__Model__Alternatives_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:294:2: rule__Model__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__Alternatives_1_in_rule__Model__Group__1__Impl556);
            	    rule__Model__Alternatives_1();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end rule__Model__Group__1__Impl


    // $ANTLR start rule__Model__Group_0__0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:308:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:312:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:313:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__0591);
            rule__Model__Group_0__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__0594);
            rule__Model__Group_0__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_0__0


    // $ANTLR start rule__Model__Group_0__0__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:320:1: rule__Model__Group_0__0__Impl : ( 'graph' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:324:1: ( ( 'graph' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:325:1: ( 'graph' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:325:1: ( 'graph' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:326:1: 'graph'
            {
             before(grammarAccess.getModelAccess().getGraphKeyword_0_0()); 
            match(input,11,FOLLOW_11_in_rule__Model__Group_0__0__Impl622); 
             after(grammarAccess.getModelAccess().getGraphKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_0__0__Impl


    // $ANTLR start rule__Model__Group_0__1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:339:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:343:1: ( rule__Model__Group_0__1__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:344:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__1653);
            rule__Model__Group_0__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_0__1


    // $ANTLR start rule__Model__Group_0__1__Impl
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:350:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__NameAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:354:1: ( ( ( rule__Model__NameAssignment_0_1 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:355:1: ( ( rule__Model__NameAssignment_0_1 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:355:1: ( ( rule__Model__NameAssignment_0_1 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:356:1: ( rule__Model__NameAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_0_1()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:357:1: ( rule__Model__NameAssignment_0_1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:357:2: rule__Model__NameAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl680);
            rule__Model__NameAssignment_0_1();
            _fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__Group_0__1__Impl


    // $ANTLR start rule__Node__Group__0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:371:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:375:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:376:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__0714);
            rule__Node__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__0717);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:383:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:387:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:388:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:388:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:389:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:390:1: ( rule__Node__NameAssignment_0 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:390:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl744);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:400:1: rule__Node__Group__1 : rule__Node__Group__1__Impl ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:404:1: ( rule__Node__Group__1__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:405:2: rule__Node__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__1774);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:411:1: rule__Node__Group__1__Impl : ( ( rule__Node__Group_1__0 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:415:1: ( ( ( rule__Node__Group_1__0 )? ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:416:1: ( ( rule__Node__Group_1__0 )? )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:416:1: ( ( rule__Node__Group_1__0 )? )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:417:1: ( rule__Node__Group_1__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_1()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:418:1: ( rule__Node__Group_1__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==12) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:418:2: rule__Node__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_1__0_in_rule__Node__Group__1__Impl801);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:432:1: rule__Node__Group_1__0 : rule__Node__Group_1__0__Impl rule__Node__Group_1__1 ;
    public final void rule__Node__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:436:1: ( rule__Node__Group_1__0__Impl rule__Node__Group_1__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:437:2: rule__Node__Group_1__0__Impl rule__Node__Group_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_1__0__Impl_in_rule__Node__Group_1__0836);
            rule__Node__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_1__1_in_rule__Node__Group_1__0839);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:444:1: rule__Node__Group_1__0__Impl : ( '{' ) ;
    public final void rule__Node__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:448:1: ( ( '{' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:449:1: ( '{' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:449:1: ( '{' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:450:1: '{'
            {
             before(grammarAccess.getNodeAccess().getLeftCurlyBracketKeyword_1_0()); 
            match(input,12,FOLLOW_12_in_rule__Node__Group_1__0__Impl867); 
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:463:1: rule__Node__Group_1__1 : rule__Node__Group_1__1__Impl rule__Node__Group_1__2 ;
    public final void rule__Node__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:467:1: ( rule__Node__Group_1__1__Impl rule__Node__Group_1__2 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:468:2: rule__Node__Group_1__1__Impl rule__Node__Group_1__2
            {
            pushFollow(FOLLOW_rule__Node__Group_1__1__Impl_in_rule__Node__Group_1__1898);
            rule__Node__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_1__2_in_rule__Node__Group_1__1901);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:475:1: rule__Node__Group_1__1__Impl : ( ( rule__Node__Group_1_1__0 )* ) ;
    public final void rule__Node__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:479:1: ( ( ( rule__Node__Group_1_1__0 )* ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:480:1: ( ( rule__Node__Group_1_1__0 )* )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:480:1: ( ( rule__Node__Group_1_1__0 )* )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:481:1: ( rule__Node__Group_1_1__0 )*
            {
             before(grammarAccess.getNodeAccess().getGroup_1_1()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:482:1: ( rule__Node__Group_1_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:482:2: rule__Node__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_rule__Node__Group_1_1__0_in_rule__Node__Group_1__1__Impl928);
            	    rule__Node__Group_1_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:492:1: rule__Node__Group_1__2 : rule__Node__Group_1__2__Impl ;
    public final void rule__Node__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:496:1: ( rule__Node__Group_1__2__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:497:2: rule__Node__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_1__2__Impl_in_rule__Node__Group_1__2959);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:503:1: rule__Node__Group_1__2__Impl : ( '}' ) ;
    public final void rule__Node__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:507:1: ( ( '}' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:508:1: ( '}' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:508:1: ( '}' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:509:1: '}'
            {
             before(grammarAccess.getNodeAccess().getRightCurlyBracketKeyword_1_2()); 
            match(input,13,FOLLOW_13_in_rule__Node__Group_1__2__Impl987); 
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:528:1: rule__Node__Group_1_1__0 : rule__Node__Group_1_1__0__Impl rule__Node__Group_1_1__1 ;
    public final void rule__Node__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:532:1: ( rule__Node__Group_1_1__0__Impl rule__Node__Group_1_1__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:533:2: rule__Node__Group_1_1__0__Impl rule__Node__Group_1_1__1
            {
            pushFollow(FOLLOW_rule__Node__Group_1_1__0__Impl_in_rule__Node__Group_1_1__01024);
            rule__Node__Group_1_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_1_1__1_in_rule__Node__Group_1_1__01027);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:540:1: rule__Node__Group_1_1__0__Impl : ( 'see' ) ;
    public final void rule__Node__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:544:1: ( ( 'see' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:545:1: ( 'see' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:545:1: ( 'see' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:546:1: 'see'
            {
             before(grammarAccess.getNodeAccess().getSeeKeyword_1_1_0()); 
            match(input,14,FOLLOW_14_in_rule__Node__Group_1_1__0__Impl1055); 
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:559:1: rule__Node__Group_1_1__1 : rule__Node__Group_1_1__1__Impl ;
    public final void rule__Node__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:563:1: ( rule__Node__Group_1_1__1__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:564:2: rule__Node__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_1_1__1__Impl_in_rule__Node__Group_1_1__11086);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:570:1: rule__Node__Group_1_1__1__Impl : ( ( rule__Node__ReferrenceAssignment_1_1_1 ) ) ;
    public final void rule__Node__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:574:1: ( ( ( rule__Node__ReferrenceAssignment_1_1_1 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:575:1: ( ( rule__Node__ReferrenceAssignment_1_1_1 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:575:1: ( ( rule__Node__ReferrenceAssignment_1_1_1 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:576:1: ( rule__Node__ReferrenceAssignment_1_1_1 )
            {
             before(grammarAccess.getNodeAccess().getReferrenceAssignment_1_1_1()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:577:1: ( rule__Node__ReferrenceAssignment_1_1_1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:577:2: rule__Node__ReferrenceAssignment_1_1_1
            {
            pushFollow(FOLLOW_rule__Node__ReferrenceAssignment_1_1_1_in_rule__Node__Group_1_1__1__Impl1113);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:591:1: rule__Coupling__Group__0 : rule__Coupling__Group__0__Impl rule__Coupling__Group__1 ;
    public final void rule__Coupling__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:595:1: ( rule__Coupling__Group__0__Impl rule__Coupling__Group__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:596:2: rule__Coupling__Group__0__Impl rule__Coupling__Group__1
            {
            pushFollow(FOLLOW_rule__Coupling__Group__0__Impl_in_rule__Coupling__Group__01147);
            rule__Coupling__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Coupling__Group__1_in_rule__Coupling__Group__01150);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:603:1: rule__Coupling__Group__0__Impl : ( ( rule__Coupling__FromAssignment_0 ) ) ;
    public final void rule__Coupling__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:607:1: ( ( ( rule__Coupling__FromAssignment_0 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:608:1: ( ( rule__Coupling__FromAssignment_0 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:608:1: ( ( rule__Coupling__FromAssignment_0 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:609:1: ( rule__Coupling__FromAssignment_0 )
            {
             before(grammarAccess.getCouplingAccess().getFromAssignment_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:610:1: ( rule__Coupling__FromAssignment_0 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:610:2: rule__Coupling__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Coupling__FromAssignment_0_in_rule__Coupling__Group__0__Impl1177);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:620:1: rule__Coupling__Group__1 : rule__Coupling__Group__1__Impl rule__Coupling__Group__2 ;
    public final void rule__Coupling__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:624:1: ( rule__Coupling__Group__1__Impl rule__Coupling__Group__2 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:625:2: rule__Coupling__Group__1__Impl rule__Coupling__Group__2
            {
            pushFollow(FOLLOW_rule__Coupling__Group__1__Impl_in_rule__Coupling__Group__11207);
            rule__Coupling__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Coupling__Group__2_in_rule__Coupling__Group__11210);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:632:1: rule__Coupling__Group__1__Impl : ( '--' ) ;
    public final void rule__Coupling__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:636:1: ( ( '--' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:637:1: ( '--' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:637:1: ( '--' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:638:1: '--'
            {
             before(grammarAccess.getCouplingAccess().getHyphenMinusHyphenMinusKeyword_1()); 
            match(input,15,FOLLOW_15_in_rule__Coupling__Group__1__Impl1238); 
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:651:1: rule__Coupling__Group__2 : rule__Coupling__Group__2__Impl ;
    public final void rule__Coupling__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:655:1: ( rule__Coupling__Group__2__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:656:2: rule__Coupling__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Coupling__Group__2__Impl_in_rule__Coupling__Group__21269);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:662:1: rule__Coupling__Group__2__Impl : ( ( rule__Coupling__ToAssignment_2 ) ) ;
    public final void rule__Coupling__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:666:1: ( ( ( rule__Coupling__ToAssignment_2 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:667:1: ( ( rule__Coupling__ToAssignment_2 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:667:1: ( ( rule__Coupling__ToAssignment_2 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:668:1: ( rule__Coupling__ToAssignment_2 )
            {
             before(grammarAccess.getCouplingAccess().getToAssignment_2()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:669:1: ( rule__Coupling__ToAssignment_2 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:669:2: rule__Coupling__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Coupling__ToAssignment_2_in_rule__Coupling__Group__2__Impl1296);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:685:1: rule__Precedence__Group__0 : rule__Precedence__Group__0__Impl rule__Precedence__Group__1 ;
    public final void rule__Precedence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:689:1: ( rule__Precedence__Group__0__Impl rule__Precedence__Group__1 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:690:2: rule__Precedence__Group__0__Impl rule__Precedence__Group__1
            {
            pushFollow(FOLLOW_rule__Precedence__Group__0__Impl_in_rule__Precedence__Group__01332);
            rule__Precedence__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group__1_in_rule__Precedence__Group__01335);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:697:1: rule__Precedence__Group__0__Impl : ( ( rule__Precedence__FromAssignment_0 ) ) ;
    public final void rule__Precedence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:701:1: ( ( ( rule__Precedence__FromAssignment_0 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:702:1: ( ( rule__Precedence__FromAssignment_0 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:702:1: ( ( rule__Precedence__FromAssignment_0 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:703:1: ( rule__Precedence__FromAssignment_0 )
            {
             before(grammarAccess.getPrecedenceAccess().getFromAssignment_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:704:1: ( rule__Precedence__FromAssignment_0 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:704:2: rule__Precedence__FromAssignment_0
            {
            pushFollow(FOLLOW_rule__Precedence__FromAssignment_0_in_rule__Precedence__Group__0__Impl1362);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:714:1: rule__Precedence__Group__1 : rule__Precedence__Group__1__Impl rule__Precedence__Group__2 ;
    public final void rule__Precedence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:718:1: ( rule__Precedence__Group__1__Impl rule__Precedence__Group__2 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:719:2: rule__Precedence__Group__1__Impl rule__Precedence__Group__2
            {
            pushFollow(FOLLOW_rule__Precedence__Group__1__Impl_in_rule__Precedence__Group__11392);
            rule__Precedence__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Precedence__Group__2_in_rule__Precedence__Group__11395);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:726:1: rule__Precedence__Group__1__Impl : ( '->' ) ;
    public final void rule__Precedence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:730:1: ( ( '->' ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:731:1: ( '->' )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:731:1: ( '->' )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:732:1: '->'
            {
             before(grammarAccess.getPrecedenceAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,16,FOLLOW_16_in_rule__Precedence__Group__1__Impl1423); 
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:745:1: rule__Precedence__Group__2 : rule__Precedence__Group__2__Impl ;
    public final void rule__Precedence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:749:1: ( rule__Precedence__Group__2__Impl )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:750:2: rule__Precedence__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Precedence__Group__2__Impl_in_rule__Precedence__Group__21454);
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:756:1: rule__Precedence__Group__2__Impl : ( ( rule__Precedence__ToAssignment_2 ) ) ;
    public final void rule__Precedence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:760:1: ( ( ( rule__Precedence__ToAssignment_2 ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:761:1: ( ( rule__Precedence__ToAssignment_2 ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:761:1: ( ( rule__Precedence__ToAssignment_2 ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:762:1: ( rule__Precedence__ToAssignment_2 )
            {
             before(grammarAccess.getPrecedenceAccess().getToAssignment_2()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:763:1: ( rule__Precedence__ToAssignment_2 )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:763:2: rule__Precedence__ToAssignment_2
            {
            pushFollow(FOLLOW_rule__Precedence__ToAssignment_2_in_rule__Precedence__Group__2__Impl1481);
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


    // $ANTLR start rule__Model__NameAssignment_0_1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:780:1: rule__Model__NameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:784:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:785:1: ( RULE_ID )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:785:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:786:1: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_11522); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__NameAssignment_0_1


    // $ANTLR start rule__Model__NodesAssignment_1_0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:795:1: rule__Model__NodesAssignment_1_0 : ( ruleNode ) ;
    public final void rule__Model__NodesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:799:1: ( ( ruleNode ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:800:1: ( ruleNode )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:800:1: ( ruleNode )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:801:1: ruleNode
            {
             before(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__Model__NodesAssignment_1_01553);
            ruleNode();
            _fsp--;

             after(grammarAccess.getModelAccess().getNodesNodeParserRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__NodesAssignment_1_0


    // $ANTLR start rule__Model__DependenciesAssignment_1_1
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:810:1: rule__Model__DependenciesAssignment_1_1 : ( ruleDependency ) ;
    public final void rule__Model__DependenciesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:814:1: ( ( ruleDependency ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:815:1: ( ruleDependency )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:815:1: ( ruleDependency )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:816:1: ruleDependency
            {
             before(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_1_11584);
            ruleDependency();
            _fsp--;

             after(grammarAccess.getModelAccess().getDependenciesDependencyParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Model__DependenciesAssignment_1_1


    // $ANTLR start rule__Node__NameAssignment_0
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:825:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:829:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:830:1: ( RULE_ID )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:830:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:831:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_01615); 
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:840:1: rule__Node__ReferrenceAssignment_1_1_1 : ( RULE_STRING ) ;
    public final void rule__Node__ReferrenceAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:844:1: ( ( RULE_STRING ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:845:1: ( RULE_STRING )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:845:1: ( RULE_STRING )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:846:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getReferrenceSTRINGTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__ReferrenceAssignment_1_1_11646); 
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:855:1: rule__Coupling__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Coupling__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:859:1: ( ( ( RULE_ID ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:860:1: ( ( RULE_ID ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:860:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:861:1: ( RULE_ID )
            {
             before(grammarAccess.getCouplingAccess().getFromNodeCrossReference_0_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:862:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:863:1: RULE_ID
            {
             before(grammarAccess.getCouplingAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Coupling__FromAssignment_01681); 
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:874:1: rule__Coupling__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Coupling__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:878:1: ( ( ( RULE_ID ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:879:1: ( ( RULE_ID ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:879:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:880:1: ( RULE_ID )
            {
             before(grammarAccess.getCouplingAccess().getToNodeCrossReference_2_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:881:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:882:1: RULE_ID
            {
             before(grammarAccess.getCouplingAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Coupling__ToAssignment_21720); 
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:893:1: rule__Precedence__FromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Precedence__FromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:897:1: ( ( ( RULE_ID ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:898:1: ( ( RULE_ID ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:898:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:899:1: ( RULE_ID )
            {
             before(grammarAccess.getPrecedenceAccess().getFromNodeCrossReference_0_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:900:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:901:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getFromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__FromAssignment_01759); 
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
    // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:912:1: rule__Precedence__ToAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__Precedence__ToAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:916:1: ( ( ( RULE_ID ) ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:917:1: ( ( RULE_ID ) )
            {
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:917:1: ( ( RULE_ID ) )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:918:1: ( RULE_ID )
            {
             before(grammarAccess.getPrecedenceAccess().getToNodeCrossReference_2_0()); 
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:919:1: ( RULE_ID )
            // ../dependency.ui/src-gen/uk/ac/open/dependency/ui/contentassist/antlr/internal/InternalDependency.g:920:1: RULE_ID
            {
             before(grammarAccess.getPrecedenceAccess().getToNodeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Precedence__ToAssignment_21798); 
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
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_entryRuleDependency181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDependency188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Dependency__Alternatives_in_ruleDependency214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoupling_in_entryRuleCoupling241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCoupling248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__Group__0_in_ruleCoupling274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecedence_in_entryRulePrecedence301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrecedence308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group__0_in_rulePrecedence334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NodesAssignment_1_0_in_rule__Model__Alternatives_1370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DependenciesAssignment_1_1_in_rule__Model__Alternatives_1388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCoupling_in_rule__Dependency__Alternatives421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrecedence_in_rule__Dependency__Alternatives438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__0468 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__0471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0_in_rule__Model__Group__0__Impl498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Alternatives_1_in_rule__Model__Group__1__Impl556 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__Model__Group_0__0__Impl_in_rule__Model__Group_0__0591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1_in_rule__Model__Group_0__0594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Model__Group_0__0__Impl622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group_0__1__Impl_in_rule__Model__Group_0__1653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__NameAssignment_0_1_in_rule__Model__Group_0__1__Impl680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__0714 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__0717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__1774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1__0_in_rule__Node__Group__1__Impl801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1__0__Impl_in_rule__Node__Group_1__0836 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__Node__Group_1__1_in_rule__Node__Group_1__0839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Node__Group_1__0__Impl867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1__1__Impl_in_rule__Node__Group_1__1898 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Node__Group_1__2_in_rule__Node__Group_1__1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1_1__0_in_rule__Node__Group_1__1__Impl928 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_rule__Node__Group_1__2__Impl_in_rule__Node__Group_1__2959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Node__Group_1__2__Impl987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1_1__0__Impl_in_rule__Node__Group_1_1__01024 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_1_1__1_in_rule__Node__Group_1_1__01027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Node__Group_1_1__0__Impl1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_1_1__1__Impl_in_rule__Node__Group_1_1__11086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__ReferrenceAssignment_1_1_1_in_rule__Node__Group_1_1__1__Impl1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__Group__0__Impl_in_rule__Coupling__Group__01147 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Coupling__Group__1_in_rule__Coupling__Group__01150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__FromAssignment_0_in_rule__Coupling__Group__0__Impl1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__Group__1__Impl_in_rule__Coupling__Group__11207 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Coupling__Group__2_in_rule__Coupling__Group__11210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Coupling__Group__1__Impl1238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__Group__2__Impl_in_rule__Coupling__Group__21269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Coupling__ToAssignment_2_in_rule__Coupling__Group__2__Impl1296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group__0__Impl_in_rule__Precedence__Group__01332 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_rule__Precedence__Group__1_in_rule__Precedence__Group__01335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__FromAssignment_0_in_rule__Precedence__Group__0__Impl1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group__1__Impl_in_rule__Precedence__Group__11392 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Precedence__Group__2_in_rule__Precedence__Group__11395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Precedence__Group__1__Impl1423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__Group__2__Impl_in_rule__Precedence__Group__21454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Precedence__ToAssignment_2_in_rule__Precedence__Group__2__Impl1481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Model__NameAssignment_0_11522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__Model__NodesAssignment_1_01553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDependency_in_rule__Model__DependenciesAssignment_1_11584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_01615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__ReferrenceAssignment_1_1_11646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Coupling__FromAssignment_01681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Coupling__ToAssignment_21720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__FromAssignment_01759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Precedence__ToAssignment_21798 = new BitSet(new long[]{0x0000000000000002L});

}