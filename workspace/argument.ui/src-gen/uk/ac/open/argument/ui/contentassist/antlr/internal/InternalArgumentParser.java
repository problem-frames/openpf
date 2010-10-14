package uk.ac.open.argument.ui.contentassist.antlr.internal; 

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
import uk.ac.open.argument.services.ArgumentGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalArgumentParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_QUALIFIED_NAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'C'", "'W'", "'G'", "'R'", "'M'", "'A'", "'and'", "'or'", "'argues'", "'rebutted by'", "'mitigated by'", "'argument:'", "'for'", "':'", "','", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_INT=7;
    public static final int RULE_QUALIFIED_NAME=6;
    public static final int RULE_WS=10;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;

        public InternalArgumentParser(TokenStream input) {
            super(input);
        }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g"; }


     
     	private ArgumentGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(ArgumentGrammarAccess grammarAccess) {
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




    // $ANTLR start entryRuleArgumentDiagram
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:61:1: entryRuleArgumentDiagram : ruleArgumentDiagram EOF ;
    public final void entryRuleArgumentDiagram() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:62:1: ( ruleArgumentDiagram EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:63:1: ruleArgumentDiagram EOF
            {
             before(grammarAccess.getArgumentDiagramRule()); 
            pushFollow(FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram61);
            ruleArgumentDiagram();
            _fsp--;

             after(grammarAccess.getArgumentDiagramRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentDiagram68); 

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
    // $ANTLR end entryRuleArgumentDiagram


    // $ANTLR start ruleArgumentDiagram
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:70:1: ruleArgumentDiagram : ( ( rule__ArgumentDiagram__Group__0 ) ) ;
    public final void ruleArgumentDiagram() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:74:2: ( ( ( rule__ArgumentDiagram__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:75:1: ( ( rule__ArgumentDiagram__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:75:1: ( ( rule__ArgumentDiagram__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:76:1: ( rule__ArgumentDiagram__Group__0 )
            {
             before(grammarAccess.getArgumentDiagramAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:77:1: ( rule__ArgumentDiagram__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:77:2: rule__ArgumentDiagram__Group__0
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__0_in_ruleArgumentDiagram94);
            rule__ArgumentDiagram__Group__0();
            _fsp--;


            }

             after(grammarAccess.getArgumentDiagramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleArgumentDiagram


    // $ANTLR start entryRuleNode
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:89:1: entryRuleNode : ruleNode EOF ;
    public final void entryRuleNode() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:90:1: ( ruleNode EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:91:1: ruleNode EOF
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:98:1: ruleNode : ( ( rule__Node__Group__0 ) ) ;
    public final void ruleNode() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:102:2: ( ( ( rule__Node__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:103:1: ( ( rule__Node__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:103:1: ( ( rule__Node__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:104:1: ( rule__Node__Group__0 )
            {
             before(grammarAccess.getNodeAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:105:1: ( rule__Node__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:105:2: rule__Node__Group__0
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


    // $ANTLR start entryRuleLink
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:117:1: entryRuleLink : ruleLink EOF ;
    public final void entryRuleLink() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:118:1: ( ruleLink EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:119:1: ruleLink EOF
            {
             before(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_ruleLink_in_entryRuleLink181);
            ruleLink();
            _fsp--;

             after(grammarAccess.getLinkRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLink188); 

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
    // $ANTLR end entryRuleLink


    // $ANTLR start ruleLink
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:126:1: ruleLink : ( ( rule__Link__Group__0 ) ) ;
    public final void ruleLink() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:130:2: ( ( ( rule__Link__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:131:1: ( ( rule__Link__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:131:1: ( ( rule__Link__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:132:1: ( rule__Link__Group__0 )
            {
             before(grammarAccess.getLinkAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:133:1: ( rule__Link__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:133:2: rule__Link__Group__0
            {
            pushFollow(FOLLOW_rule__Link__Group__0_in_ruleLink214);
            rule__Link__Group__0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLink


    // $ANTLR start entryRuleSplitCommas
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:145:1: entryRuleSplitCommas : ruleSplitCommas EOF ;
    public final void entryRuleSplitCommas() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:146:1: ( ruleSplitCommas EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:147:1: ruleSplitCommas EOF
            {
             before(grammarAccess.getSplitCommasRule()); 
            pushFollow(FOLLOW_ruleSplitCommas_in_entryRuleSplitCommas241);
            ruleSplitCommas();
            _fsp--;

             after(grammarAccess.getSplitCommasRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitCommas248); 

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
    // $ANTLR end entryRuleSplitCommas


    // $ANTLR start ruleSplitCommas
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:154:1: ruleSplitCommas : ( ( rule__SplitCommas__Group__0 ) ) ;
    public final void ruleSplitCommas() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:158:2: ( ( ( rule__SplitCommas__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:159:1: ( ( rule__SplitCommas__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:159:1: ( ( rule__SplitCommas__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:160:1: ( rule__SplitCommas__Group__0 )
            {
             before(grammarAccess.getSplitCommasAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:161:1: ( rule__SplitCommas__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:161:2: rule__SplitCommas__Group__0
            {
            pushFollow(FOLLOW_rule__SplitCommas__Group__0_in_ruleSplitCommas274);
            rule__SplitCommas__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSplitCommasAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSplitCommas


    // $ANTLR start entryRuleSplitConnective
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:173:1: entryRuleSplitConnective : ruleSplitConnective EOF ;
    public final void entryRuleSplitConnective() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:174:1: ( ruleSplitConnective EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:175:1: ruleSplitConnective EOF
            {
             before(grammarAccess.getSplitConnectiveRule()); 
            pushFollow(FOLLOW_ruleSplitConnective_in_entryRuleSplitConnective301);
            ruleSplitConnective();
            _fsp--;

             after(grammarAccess.getSplitConnectiveRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitConnective308); 

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
    // $ANTLR end entryRuleSplitConnective


    // $ANTLR start ruleSplitConnective
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:182:1: ruleSplitConnective : ( ( rule__SplitConnective__Group__0 ) ) ;
    public final void ruleSplitConnective() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:186:2: ( ( ( rule__SplitConnective__Group__0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:187:1: ( ( rule__SplitConnective__Group__0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:187:1: ( ( rule__SplitConnective__Group__0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:188:1: ( rule__SplitConnective__Group__0 )
            {
             before(grammarAccess.getSplitConnectiveAccess().getGroup()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:189:1: ( rule__SplitConnective__Group__0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:189:2: rule__SplitConnective__Group__0
            {
            pushFollow(FOLLOW_rule__SplitConnective__Group__0_in_ruleSplitConnective334);
            rule__SplitConnective__Group__0();
            _fsp--;


            }

             after(grammarAccess.getSplitConnectiveAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSplitConnective


    // $ANTLR start entryRuleSplitParentheses
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:201:1: entryRuleSplitParentheses : ruleSplitParentheses EOF ;
    public final void entryRuleSplitParentheses() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:202:1: ( ruleSplitParentheses EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:203:1: ruleSplitParentheses EOF
            {
             before(grammarAccess.getSplitParenthesesRule()); 
            pushFollow(FOLLOW_ruleSplitParentheses_in_entryRuleSplitParentheses361);
            ruleSplitParentheses();
            _fsp--;

             after(grammarAccess.getSplitParenthesesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSplitParentheses368); 

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
    // $ANTLR end entryRuleSplitParentheses


    // $ANTLR start ruleSplitParentheses
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:210:1: ruleSplitParentheses : ( ( rule__SplitParentheses__Alternatives ) ) ;
    public final void ruleSplitParentheses() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:214:2: ( ( ( rule__SplitParentheses__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:215:1: ( ( rule__SplitParentheses__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:215:1: ( ( rule__SplitParentheses__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:216:1: ( rule__SplitParentheses__Alternatives )
            {
             before(grammarAccess.getSplitParenthesesAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:217:1: ( rule__SplitParentheses__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:217:2: rule__SplitParentheses__Alternatives
            {
            pushFollow(FOLLOW_rule__SplitParentheses__Alternatives_in_ruleSplitParentheses394);
            rule__SplitParentheses__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getSplitParenthesesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleSplitParentheses


    // $ANTLR start entryRuleNodeLiteral
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:229:1: entryRuleNodeLiteral : ruleNodeLiteral EOF ;
    public final void entryRuleNodeLiteral() throws RecognitionException {
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:230:1: ( ruleNodeLiteral EOF )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:231:1: ruleNodeLiteral EOF
            {
             before(grammarAccess.getNodeLiteralRule()); 
            pushFollow(FOLLOW_ruleNodeLiteral_in_entryRuleNodeLiteral421);
            ruleNodeLiteral();
            _fsp--;

             after(grammarAccess.getNodeLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNodeLiteral428); 

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
    // $ANTLR end entryRuleNodeLiteral


    // $ANTLR start ruleNodeLiteral
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:238:1: ruleNodeLiteral : ( ( rule__NodeLiteral__ValueAssignment ) ) ;
    public final void ruleNodeLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:242:2: ( ( ( rule__NodeLiteral__ValueAssignment ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:243:1: ( ( rule__NodeLiteral__ValueAssignment ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:243:1: ( ( rule__NodeLiteral__ValueAssignment ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:244:1: ( rule__NodeLiteral__ValueAssignment )
            {
             before(grammarAccess.getNodeLiteralAccess().getValueAssignment()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:245:1: ( rule__NodeLiteral__ValueAssignment )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:245:2: rule__NodeLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_rule__NodeLiteral__ValueAssignment_in_ruleNodeLiteral454);
            rule__NodeLiteral__ValueAssignment();
            _fsp--;


            }

             after(grammarAccess.getNodeLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNodeLiteral


    // $ANTLR start ruleNodeType
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:258:1: ruleNodeType : ( ( rule__NodeType__Alternatives ) ) ;
    public final void ruleNodeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:262:1: ( ( ( rule__NodeType__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:263:1: ( ( rule__NodeType__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:263:1: ( ( rule__NodeType__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:264:1: ( rule__NodeType__Alternatives )
            {
             before(grammarAccess.getNodeTypeAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:265:1: ( rule__NodeType__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:265:2: rule__NodeType__Alternatives
            {
            pushFollow(FOLLOW_rule__NodeType__Alternatives_in_ruleNodeType491);
            rule__NodeType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getNodeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleNodeType


    // $ANTLR start ruleConnectiveType
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:277:1: ruleConnectiveType : ( ( rule__ConnectiveType__Alternatives ) ) ;
    public final void ruleConnectiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:281:1: ( ( ( rule__ConnectiveType__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:282:1: ( ( rule__ConnectiveType__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:282:1: ( ( rule__ConnectiveType__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:283:1: ( rule__ConnectiveType__Alternatives )
            {
             before(grammarAccess.getConnectiveTypeAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:284:1: ( rule__ConnectiveType__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:284:2: rule__ConnectiveType__Alternatives
            {
            pushFollow(FOLLOW_rule__ConnectiveType__Alternatives_in_ruleConnectiveType527);
            rule__ConnectiveType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getConnectiveTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleConnectiveType


    // $ANTLR start ruleLinkType
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:296:1: ruleLinkType : ( ( rule__LinkType__Alternatives ) ) ;
    public final void ruleLinkType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:300:1: ( ( ( rule__LinkType__Alternatives ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:301:1: ( ( rule__LinkType__Alternatives ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:301:1: ( ( rule__LinkType__Alternatives ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:302:1: ( rule__LinkType__Alternatives )
            {
             before(grammarAccess.getLinkTypeAccess().getAlternatives()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:303:1: ( rule__LinkType__Alternatives )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:303:2: rule__LinkType__Alternatives
            {
            pushFollow(FOLLOW_rule__LinkType__Alternatives_in_ruleLinkType563);
            rule__LinkType__Alternatives();
            _fsp--;


            }

             after(grammarAccess.getLinkTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end ruleLinkType


    // $ANTLR start rule__ArgumentDiagram__Alternatives_3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:314:1: rule__ArgumentDiagram__Alternatives_3 : ( ( ( rule__ArgumentDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_3_1 ) ) );
    public final void rule__ArgumentDiagram__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:318:1: ( ( ( rule__ArgumentDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=20 && LA1_1<=22)) ) {
                    alt1=2;
                }
                else if ( (LA1_1==EOF||(LA1_1>=RULE_ID && LA1_1<=RULE_STRING)||(LA1_1>=12 && LA1_1<=17)||LA1_1==25) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("314:1: rule__ArgumentDiagram__Alternatives_3 : ( ( ( rule__ArgumentDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_3_1 ) ) );", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("314:1: rule__ArgumentDiagram__Alternatives_3 : ( ( ( rule__ArgumentDiagram__NodesAssignment_3_0 ) ) | ( ( rule__ArgumentDiagram__LinksAssignment_3_1 ) ) );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:319:1: ( ( rule__ArgumentDiagram__NodesAssignment_3_0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:319:1: ( ( rule__ArgumentDiagram__NodesAssignment_3_0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:320:1: ( rule__ArgumentDiagram__NodesAssignment_3_0 )
                    {
                     before(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_3_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:321:1: ( rule__ArgumentDiagram__NodesAssignment_3_0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:321:2: rule__ArgumentDiagram__NodesAssignment_3_0
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__NodesAssignment_3_0_in_rule__ArgumentDiagram__Alternatives_3598);
                    rule__ArgumentDiagram__NodesAssignment_3_0();
                    _fsp--;


                    }

                     after(grammarAccess.getArgumentDiagramAccess().getNodesAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:325:6: ( ( rule__ArgumentDiagram__LinksAssignment_3_1 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:325:6: ( ( rule__ArgumentDiagram__LinksAssignment_3_1 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:326:1: ( rule__ArgumentDiagram__LinksAssignment_3_1 )
                    {
                     before(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_3_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:327:1: ( rule__ArgumentDiagram__LinksAssignment_3_1 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:327:2: rule__ArgumentDiagram__LinksAssignment_3_1
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__LinksAssignment_3_1_in_rule__ArgumentDiagram__Alternatives_3616);
                    rule__ArgumentDiagram__LinksAssignment_3_1();
                    _fsp--;


                    }

                     after(grammarAccess.getArgumentDiagramAccess().getLinksAssignment_3_1()); 

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
    // $ANTLR end rule__ArgumentDiagram__Alternatives_3


    // $ANTLR start rule__SplitParentheses__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:336:1: rule__SplitParentheses__Alternatives : ( ( ruleNodeLiteral ) | ( ( rule__SplitParentheses__Group_1__0 ) ) );
    public final void rule__SplitParentheses__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:340:1: ( ( ruleNodeLiteral ) | ( ( rule__SplitParentheses__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ID) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("336:1: rule__SplitParentheses__Alternatives : ( ( ruleNodeLiteral ) | ( ( rule__SplitParentheses__Group_1__0 ) ) );", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:341:1: ( ruleNodeLiteral )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:341:1: ( ruleNodeLiteral )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:342:1: ruleNodeLiteral
                    {
                     before(grammarAccess.getSplitParenthesesAccess().getNodeLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleNodeLiteral_in_rule__SplitParentheses__Alternatives649);
                    ruleNodeLiteral();
                    _fsp--;

                     after(grammarAccess.getSplitParenthesesAccess().getNodeLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:347:6: ( ( rule__SplitParentheses__Group_1__0 ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:347:6: ( ( rule__SplitParentheses__Group_1__0 ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:348:1: ( rule__SplitParentheses__Group_1__0 )
                    {
                     before(grammarAccess.getSplitParenthesesAccess().getGroup_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:349:1: ( rule__SplitParentheses__Group_1__0 )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:349:2: rule__SplitParentheses__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SplitParentheses__Group_1__0_in_rule__SplitParentheses__Alternatives666);
                    rule__SplitParentheses__Group_1__0();
                    _fsp--;


                    }

                     after(grammarAccess.getSplitParenthesesAccess().getGroup_1()); 

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
    // $ANTLR end rule__SplitParentheses__Alternatives


    // $ANTLR start rule__NodeType__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:358:1: rule__NodeType__Alternatives : ( ( ( 'C' ) ) | ( ( 'W' ) ) | ( ( 'G' ) ) | ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'A' ) ) );
    public final void rule__NodeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:362:1: ( ( ( 'C' ) ) | ( ( 'W' ) ) | ( ( 'G' ) ) | ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'A' ) ) )
            int alt3=6;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                alt3=2;
                }
                break;
            case 14:
                {
                alt3=3;
                }
                break;
            case 15:
                {
                alt3=4;
                }
                break;
            case 16:
                {
                alt3=5;
                }
                break;
            case 17:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("358:1: rule__NodeType__Alternatives : ( ( ( 'C' ) ) | ( ( 'W' ) ) | ( ( 'G' ) ) | ( ( 'R' ) ) | ( ( 'M' ) ) | ( ( 'A' ) ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:363:1: ( ( 'C' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:363:1: ( ( 'C' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:364:1: ( 'C' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getCLAIMEnumLiteralDeclaration_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:365:1: ( 'C' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:365:3: 'C'
                    {
                    match(input,12,FOLLOW_12_in_rule__NodeType__Alternatives700); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getCLAIMEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:370:6: ( ( 'W' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:370:6: ( ( 'W' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:371:1: ( 'W' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getWARRANTEnumLiteralDeclaration_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:372:1: ( 'W' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:372:3: 'W'
                    {
                    match(input,13,FOLLOW_13_in_rule__NodeType__Alternatives721); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getWARRANTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:377:6: ( ( 'G' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:377:6: ( ( 'G' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:378:1: ( 'G' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getGROUNDEnumLiteralDeclaration_2()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:379:1: ( 'G' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:379:3: 'G'
                    {
                    match(input,14,FOLLOW_14_in_rule__NodeType__Alternatives742); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getGROUNDEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:384:6: ( ( 'R' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:384:6: ( ( 'R' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:385:1: ( 'R' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getREBUTTALEnumLiteralDeclaration_3()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:386:1: ( 'R' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:386:3: 'R'
                    {
                    match(input,15,FOLLOW_15_in_rule__NodeType__Alternatives763); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getREBUTTALEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:391:6: ( ( 'M' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:391:6: ( ( 'M' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:392:1: ( 'M' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getMITIGATIONEnumLiteralDeclaration_4()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:393:1: ( 'M' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:393:3: 'M'
                    {
                    match(input,16,FOLLOW_16_in_rule__NodeType__Alternatives784); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getMITIGATIONEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:398:6: ( ( 'A' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:398:6: ( ( 'A' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:399:1: ( 'A' )
                    {
                     before(grammarAccess.getNodeTypeAccess().getARGUMENTEnumLiteralDeclaration_5()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:400:1: ( 'A' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:400:3: 'A'
                    {
                    match(input,17,FOLLOW_17_in_rule__NodeType__Alternatives805); 

                    }

                     after(grammarAccess.getNodeTypeAccess().getARGUMENTEnumLiteralDeclaration_5()); 

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
    // $ANTLR end rule__NodeType__Alternatives


    // $ANTLR start rule__ConnectiveType__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:410:1: rule__ConnectiveType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );
    public final void rule__ConnectiveType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:414:1: ( ( ( 'and' ) ) | ( ( 'or' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            else if ( (LA4_0==19) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("410:1: rule__ConnectiveType__Alternatives : ( ( ( 'and' ) ) | ( ( 'or' ) ) );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:415:1: ( ( 'and' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:415:1: ( ( 'and' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:416:1: ( 'and' )
                    {
                     before(grammarAccess.getConnectiveTypeAccess().getANDEnumLiteralDeclaration_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:417:1: ( 'and' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:417:3: 'and'
                    {
                    match(input,18,FOLLOW_18_in_rule__ConnectiveType__Alternatives841); 

                    }

                     after(grammarAccess.getConnectiveTypeAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:422:6: ( ( 'or' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:422:6: ( ( 'or' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:423:1: ( 'or' )
                    {
                     before(grammarAccess.getConnectiveTypeAccess().getOREnumLiteralDeclaration_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:424:1: ( 'or' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:424:3: 'or'
                    {
                    match(input,19,FOLLOW_19_in_rule__ConnectiveType__Alternatives862); 

                    }

                     after(grammarAccess.getConnectiveTypeAccess().getOREnumLiteralDeclaration_1()); 

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
    // $ANTLR end rule__ConnectiveType__Alternatives


    // $ANTLR start rule__LinkType__Alternatives
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:434:1: rule__LinkType__Alternatives : ( ( ( 'argues' ) ) | ( ( 'rebutted by' ) ) | ( ( 'mitigated by' ) ) );
    public final void rule__LinkType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:438:1: ( ( ( 'argues' ) ) | ( ( 'rebutted by' ) ) | ( ( 'mitigated by' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt5=1;
                }
                break;
            case 21:
                {
                alt5=2;
                }
                break;
            case 22:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("434:1: rule__LinkType__Alternatives : ( ( ( 'argues' ) ) | ( ( 'rebutted by' ) ) | ( ( 'mitigated by' ) ) );", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:439:1: ( ( 'argues' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:439:1: ( ( 'argues' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:440:1: ( 'argues' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getARGUESEnumLiteralDeclaration_0()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:441:1: ( 'argues' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:441:3: 'argues'
                    {
                    match(input,20,FOLLOW_20_in_rule__LinkType__Alternatives898); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getARGUESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:446:6: ( ( 'rebutted by' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:446:6: ( ( 'rebutted by' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:447:1: ( 'rebutted by' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getREBUTSEnumLiteralDeclaration_1()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:448:1: ( 'rebutted by' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:448:3: 'rebutted by'
                    {
                    match(input,21,FOLLOW_21_in_rule__LinkType__Alternatives919); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getREBUTSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:453:6: ( ( 'mitigated by' ) )
                    {
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:453:6: ( ( 'mitigated by' ) )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:454:1: ( 'mitigated by' )
                    {
                     before(grammarAccess.getLinkTypeAccess().getMITIGATESEnumLiteralDeclaration_2()); 
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:455:1: ( 'mitigated by' )
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:455:3: 'mitigated by'
                    {
                    match(input,22,FOLLOW_22_in_rule__LinkType__Alternatives940); 

                    }

                     after(grammarAccess.getLinkTypeAccess().getMITIGATESEnumLiteralDeclaration_2()); 

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
    // $ANTLR end rule__LinkType__Alternatives


    // $ANTLR start rule__ArgumentDiagram__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:467:1: rule__ArgumentDiagram__Group__0 : rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1 ;
    public final void rule__ArgumentDiagram__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:471:1: ( rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:472:2: rule__ArgumentDiagram__Group__0__Impl rule__ArgumentDiagram__Group__1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__0__Impl_in_rule__ArgumentDiagram__Group__0973);
            rule__ArgumentDiagram__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__1_in_rule__ArgumentDiagram__Group__0976);
            rule__ArgumentDiagram__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__0


    // $ANTLR start rule__ArgumentDiagram__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:479:1: rule__ArgumentDiagram__Group__0__Impl : ( 'argument:' ) ;
    public final void rule__ArgumentDiagram__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:483:1: ( ( 'argument:' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:484:1: ( 'argument:' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:484:1: ( 'argument:' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:485:1: 'argument:'
            {
             before(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0()); 
            match(input,23,FOLLOW_23_in_rule__ArgumentDiagram__Group__0__Impl1004); 
             after(grammarAccess.getArgumentDiagramAccess().getArgumentKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__0__Impl


    // $ANTLR start rule__ArgumentDiagram__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:498:1: rule__ArgumentDiagram__Group__1 : rule__ArgumentDiagram__Group__1__Impl rule__ArgumentDiagram__Group__2 ;
    public final void rule__ArgumentDiagram__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:502:1: ( rule__ArgumentDiagram__Group__1__Impl rule__ArgumentDiagram__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:503:2: rule__ArgumentDiagram__Group__1__Impl rule__ArgumentDiagram__Group__2
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__1__Impl_in_rule__ArgumentDiagram__Group__11035);
            rule__ArgumentDiagram__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__2_in_rule__ArgumentDiagram__Group__11038);
            rule__ArgumentDiagram__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__1


    // $ANTLR start rule__ArgumentDiagram__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:510:1: rule__ArgumentDiagram__Group__1__Impl : ( ( rule__ArgumentDiagram__NameAssignment_1 ) ) ;
    public final void rule__ArgumentDiagram__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:514:1: ( ( ( rule__ArgumentDiagram__NameAssignment_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:515:1: ( ( rule__ArgumentDiagram__NameAssignment_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:515:1: ( ( rule__ArgumentDiagram__NameAssignment_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:516:1: ( rule__ArgumentDiagram__NameAssignment_1 )
            {
             before(grammarAccess.getArgumentDiagramAccess().getNameAssignment_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:517:1: ( rule__ArgumentDiagram__NameAssignment_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:517:2: rule__ArgumentDiagram__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__NameAssignment_1_in_rule__ArgumentDiagram__Group__1__Impl1065);
            rule__ArgumentDiagram__NameAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentDiagramAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__1__Impl


    // $ANTLR start rule__ArgumentDiagram__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:527:1: rule__ArgumentDiagram__Group__2 : rule__ArgumentDiagram__Group__2__Impl rule__ArgumentDiagram__Group__3 ;
    public final void rule__ArgumentDiagram__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:531:1: ( rule__ArgumentDiagram__Group__2__Impl rule__ArgumentDiagram__Group__3 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:532:2: rule__ArgumentDiagram__Group__2__Impl rule__ArgumentDiagram__Group__3
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__2__Impl_in_rule__ArgumentDiagram__Group__21095);
            rule__ArgumentDiagram__Group__2__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__3_in_rule__ArgumentDiagram__Group__21098);
            rule__ArgumentDiagram__Group__3();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__2


    // $ANTLR start rule__ArgumentDiagram__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:539:1: rule__ArgumentDiagram__Group__2__Impl : ( ( rule__ArgumentDiagram__Group_2__0 )? ) ;
    public final void rule__ArgumentDiagram__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:543:1: ( ( ( rule__ArgumentDiagram__Group_2__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:544:1: ( ( rule__ArgumentDiagram__Group_2__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:544:1: ( ( rule__ArgumentDiagram__Group_2__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:545:1: ( rule__ArgumentDiagram__Group_2__0 )?
            {
             before(grammarAccess.getArgumentDiagramAccess().getGroup_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:546:1: ( rule__ArgumentDiagram__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:546:2: rule__ArgumentDiagram__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ArgumentDiagram__Group_2__0_in_rule__ArgumentDiagram__Group__2__Impl1125);
                    rule__ArgumentDiagram__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArgumentDiagramAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__2__Impl


    // $ANTLR start rule__ArgumentDiagram__Group__3
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:556:1: rule__ArgumentDiagram__Group__3 : rule__ArgumentDiagram__Group__3__Impl ;
    public final void rule__ArgumentDiagram__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:560:1: ( rule__ArgumentDiagram__Group__3__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:561:2: rule__ArgumentDiagram__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group__3__Impl_in_rule__ArgumentDiagram__Group__31156);
            rule__ArgumentDiagram__Group__3__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__3


    // $ANTLR start rule__ArgumentDiagram__Group__3__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:567:1: rule__ArgumentDiagram__Group__3__Impl : ( ( rule__ArgumentDiagram__Alternatives_3 )* ) ;
    public final void rule__ArgumentDiagram__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:571:1: ( ( ( rule__ArgumentDiagram__Alternatives_3 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:572:1: ( ( rule__ArgumentDiagram__Alternatives_3 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:572:1: ( ( rule__ArgumentDiagram__Alternatives_3 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:573:1: ( rule__ArgumentDiagram__Alternatives_3 )*
            {
             before(grammarAccess.getArgumentDiagramAccess().getAlternatives_3()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:574:1: ( rule__ArgumentDiagram__Alternatives_3 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:574:2: rule__ArgumentDiagram__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_rule__ArgumentDiagram__Alternatives_3_in_rule__ArgumentDiagram__Group__3__Impl1183);
            	    rule__ArgumentDiagram__Alternatives_3();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getArgumentDiagramAccess().getAlternatives_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group__3__Impl


    // $ANTLR start rule__ArgumentDiagram__Group_2__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:592:1: rule__ArgumentDiagram__Group_2__0 : rule__ArgumentDiagram__Group_2__0__Impl rule__ArgumentDiagram__Group_2__1 ;
    public final void rule__ArgumentDiagram__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:596:1: ( rule__ArgumentDiagram__Group_2__0__Impl rule__ArgumentDiagram__Group_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:597:2: rule__ArgumentDiagram__Group_2__0__Impl rule__ArgumentDiagram__Group_2__1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_2__0__Impl_in_rule__ArgumentDiagram__Group_2__01222);
            rule__ArgumentDiagram__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_2__1_in_rule__ArgumentDiagram__Group_2__01225);
            rule__ArgumentDiagram__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_2__0


    // $ANTLR start rule__ArgumentDiagram__Group_2__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:604:1: rule__ArgumentDiagram__Group_2__0__Impl : ( 'for' ) ;
    public final void rule__ArgumentDiagram__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:608:1: ( ( 'for' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:609:1: ( 'for' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:609:1: ( 'for' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:610:1: 'for'
            {
             before(grammarAccess.getArgumentDiagramAccess().getForKeyword_2_0()); 
            match(input,24,FOLLOW_24_in_rule__ArgumentDiagram__Group_2__0__Impl1253); 
             after(grammarAccess.getArgumentDiagramAccess().getForKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_2__0__Impl


    // $ANTLR start rule__ArgumentDiagram__Group_2__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:623:1: rule__ArgumentDiagram__Group_2__1 : rule__ArgumentDiagram__Group_2__1__Impl ;
    public final void rule__ArgumentDiagram__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:627:1: ( rule__ArgumentDiagram__Group_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:628:2: rule__ArgumentDiagram__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__Group_2__1__Impl_in_rule__ArgumentDiagram__Group_2__11284);
            rule__ArgumentDiagram__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_2__1


    // $ANTLR start rule__ArgumentDiagram__Group_2__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:634:1: rule__ArgumentDiagram__Group_2__1__Impl : ( ( rule__ArgumentDiagram__HighlightAssignment_2_1 ) ) ;
    public final void rule__ArgumentDiagram__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:638:1: ( ( ( rule__ArgumentDiagram__HighlightAssignment_2_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:639:1: ( ( rule__ArgumentDiagram__HighlightAssignment_2_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:639:1: ( ( rule__ArgumentDiagram__HighlightAssignment_2_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:640:1: ( rule__ArgumentDiagram__HighlightAssignment_2_1 )
            {
             before(grammarAccess.getArgumentDiagramAccess().getHighlightAssignment_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:641:1: ( rule__ArgumentDiagram__HighlightAssignment_2_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:641:2: rule__ArgumentDiagram__HighlightAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ArgumentDiagram__HighlightAssignment_2_1_in_rule__ArgumentDiagram__Group_2__1__Impl1311);
            rule__ArgumentDiagram__HighlightAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getArgumentDiagramAccess().getHighlightAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__Group_2__1__Impl


    // $ANTLR start rule__Node__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:655:1: rule__Node__Group__0 : rule__Node__Group__0__Impl rule__Node__Group__1 ;
    public final void rule__Node__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:659:1: ( rule__Node__Group__0__Impl rule__Node__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:660:2: rule__Node__Group__0__Impl rule__Node__Group__1
            {
            pushFollow(FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__01345);
            rule__Node__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01348);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:667:1: rule__Node__Group__0__Impl : ( ( rule__Node__NameAssignment_0 ) ) ;
    public final void rule__Node__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:671:1: ( ( ( rule__Node__NameAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:672:1: ( ( rule__Node__NameAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:672:1: ( ( rule__Node__NameAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:673:1: ( rule__Node__NameAssignment_0 )
            {
             before(grammarAccess.getNodeAccess().getNameAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:674:1: ( rule__Node__NameAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:674:2: rule__Node__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl1375);
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:684:1: rule__Node__Group__1 : rule__Node__Group__1__Impl rule__Node__Group__2 ;
    public final void rule__Node__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:688:1: ( rule__Node__Group__1__Impl rule__Node__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:689:2: rule__Node__Group__1__Impl rule__Node__Group__2
            {
            pushFollow(FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11405);
            rule__Node__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11408);
            rule__Node__Group__2();
            _fsp--;


            }

        }
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
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:696:1: rule__Node__Group__1__Impl : ( ( rule__Node__TypeAssignment_1 )? ) ;
    public final void rule__Node__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:700:1: ( ( ( rule__Node__TypeAssignment_1 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:701:1: ( ( rule__Node__TypeAssignment_1 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:701:1: ( ( rule__Node__TypeAssignment_1 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:702:1: ( rule__Node__TypeAssignment_1 )?
            {
             before(grammarAccess.getNodeAccess().getTypeAssignment_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:703:1: ( rule__Node__TypeAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( ((LA8_0>=12 && LA8_0<=17)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:703:2: rule__Node__TypeAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__1__Impl1435);
                    rule__Node__TypeAssignment_1();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getTypeAssignment_1()); 

            }


            }

        }
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


    // $ANTLR start rule__Node__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:713:1: rule__Node__Group__2 : rule__Node__Group__2__Impl ;
    public final void rule__Node__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:717:1: ( rule__Node__Group__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:718:2: rule__Node__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21466);
            rule__Node__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group__2


    // $ANTLR start rule__Node__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:724:1: rule__Node__Group__2__Impl : ( ( rule__Node__Group_2__0 )? ) ;
    public final void rule__Node__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:728:1: ( ( ( rule__Node__Group_2__0 )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:729:1: ( ( rule__Node__Group_2__0 )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:729:1: ( ( rule__Node__Group_2__0 )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:730:1: ( rule__Node__Group_2__0 )?
            {
             before(grammarAccess.getNodeAccess().getGroup_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:731:1: ( rule__Node__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==25) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:731:2: rule__Node__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__2__Impl1493);
                    rule__Node__Group_2__0();
                    _fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group__2__Impl


    // $ANTLR start rule__Node__Group_2__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:747:1: rule__Node__Group_2__0 : rule__Node__Group_2__0__Impl rule__Node__Group_2__1 ;
    public final void rule__Node__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:751:1: ( rule__Node__Group_2__0__Impl rule__Node__Group_2__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:752:2: rule__Node__Group_2__0__Impl rule__Node__Group_2__1
            {
            pushFollow(FOLLOW_rule__Node__Group_2__0__Impl_in_rule__Node__Group_2__01530);
            rule__Node__Group_2__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01533);
            rule__Node__Group_2__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_2__0


    // $ANTLR start rule__Node__Group_2__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:759:1: rule__Node__Group_2__0__Impl : ( ( ':' )? ) ;
    public final void rule__Node__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:763:1: ( ( ( ':' )? ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:764:1: ( ( ':' )? )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:764:1: ( ( ':' )? )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:765:1: ( ':' )?
            {
             before(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:766:1: ( ':' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:767:2: ':'
                    {
                    match(input,25,FOLLOW_25_in_rule__Node__Group_2__0__Impl1562); 

                    }
                    break;

            }

             after(grammarAccess.getNodeAccess().getColonKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_2__0__Impl


    // $ANTLR start rule__Node__Group_2__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:778:1: rule__Node__Group_2__1 : rule__Node__Group_2__1__Impl ;
    public final void rule__Node__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:782:1: ( rule__Node__Group_2__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:783:2: rule__Node__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Node__Group_2__1__Impl_in_rule__Node__Group_2__11595);
            rule__Node__Group_2__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_2__1


    // $ANTLR start rule__Node__Group_2__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:789:1: rule__Node__Group_2__1__Impl : ( ( rule__Node__DescriptionAssignment_2_1 ) ) ;
    public final void rule__Node__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:793:1: ( ( ( rule__Node__DescriptionAssignment_2_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:794:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:794:1: ( ( rule__Node__DescriptionAssignment_2_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:795:1: ( rule__Node__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:796:1: ( rule__Node__DescriptionAssignment_2_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:796:2: rule__Node__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__1__Impl1622);
            rule__Node__DescriptionAssignment_2_1();
            _fsp--;


            }

             after(grammarAccess.getNodeAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__Group_2__1__Impl


    // $ANTLR start rule__Link__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:810:1: rule__Link__Group__0 : rule__Link__Group__0__Impl rule__Link__Group__1 ;
    public final void rule__Link__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:814:1: ( rule__Link__Group__0__Impl rule__Link__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:815:2: rule__Link__Group__0__Impl rule__Link__Group__1
            {
            pushFollow(FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__01656);
            rule__Link__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__1_in_rule__Link__Group__01659);
            rule__Link__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__0


    // $ANTLR start rule__Link__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:822:1: rule__Link__Group__0__Impl : ( ( rule__Link__AfromAssignment_0 ) ) ;
    public final void rule__Link__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:826:1: ( ( ( rule__Link__AfromAssignment_0 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:827:1: ( ( rule__Link__AfromAssignment_0 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:827:1: ( ( rule__Link__AfromAssignment_0 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:828:1: ( rule__Link__AfromAssignment_0 )
            {
             before(grammarAccess.getLinkAccess().getAfromAssignment_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:829:1: ( rule__Link__AfromAssignment_0 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:829:2: rule__Link__AfromAssignment_0
            {
            pushFollow(FOLLOW_rule__Link__AfromAssignment_0_in_rule__Link__Group__0__Impl1686);
            rule__Link__AfromAssignment_0();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getAfromAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__0__Impl


    // $ANTLR start rule__Link__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:839:1: rule__Link__Group__1 : rule__Link__Group__1__Impl rule__Link__Group__2 ;
    public final void rule__Link__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:843:1: ( rule__Link__Group__1__Impl rule__Link__Group__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:844:2: rule__Link__Group__1__Impl rule__Link__Group__2
            {
            pushFollow(FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__11716);
            rule__Link__Group__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__Link__Group__2_in_rule__Link__Group__11719);
            rule__Link__Group__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__1


    // $ANTLR start rule__Link__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:851:1: rule__Link__Group__1__Impl : ( ( rule__Link__LinkAssignment_1 ) ) ;
    public final void rule__Link__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:855:1: ( ( ( rule__Link__LinkAssignment_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:856:1: ( ( rule__Link__LinkAssignment_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:856:1: ( ( rule__Link__LinkAssignment_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:857:1: ( rule__Link__LinkAssignment_1 )
            {
             before(grammarAccess.getLinkAccess().getLinkAssignment_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:858:1: ( rule__Link__LinkAssignment_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:858:2: rule__Link__LinkAssignment_1
            {
            pushFollow(FOLLOW_rule__Link__LinkAssignment_1_in_rule__Link__Group__1__Impl1746);
            rule__Link__LinkAssignment_1();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getLinkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__1__Impl


    // $ANTLR start rule__Link__Group__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:868:1: rule__Link__Group__2 : rule__Link__Group__2__Impl ;
    public final void rule__Link__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:872:1: ( rule__Link__Group__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:873:2: rule__Link__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__21776);
            rule__Link__Group__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__2


    // $ANTLR start rule__Link__Group__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:879:1: rule__Link__Group__2__Impl : ( ( rule__Link__ToNode1Assignment_2 ) ) ;
    public final void rule__Link__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:883:1: ( ( ( rule__Link__ToNode1Assignment_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:884:1: ( ( rule__Link__ToNode1Assignment_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:884:1: ( ( rule__Link__ToNode1Assignment_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:885:1: ( rule__Link__ToNode1Assignment_2 )
            {
             before(grammarAccess.getLinkAccess().getToNode1Assignment_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:886:1: ( rule__Link__ToNode1Assignment_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:886:2: rule__Link__ToNode1Assignment_2
            {
            pushFollow(FOLLOW_rule__Link__ToNode1Assignment_2_in_rule__Link__Group__2__Impl1803);
            rule__Link__ToNode1Assignment_2();
            _fsp--;


            }

             after(grammarAccess.getLinkAccess().getToNode1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__Group__2__Impl


    // $ANTLR start rule__SplitCommas__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:902:1: rule__SplitCommas__Group__0 : rule__SplitCommas__Group__0__Impl rule__SplitCommas__Group__1 ;
    public final void rule__SplitCommas__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:906:1: ( rule__SplitCommas__Group__0__Impl rule__SplitCommas__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:907:2: rule__SplitCommas__Group__0__Impl rule__SplitCommas__Group__1
            {
            pushFollow(FOLLOW_rule__SplitCommas__Group__0__Impl_in_rule__SplitCommas__Group__01839);
            rule__SplitCommas__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SplitCommas__Group__1_in_rule__SplitCommas__Group__01842);
            rule__SplitCommas__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__Group__0


    // $ANTLR start rule__SplitCommas__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:914:1: rule__SplitCommas__Group__0__Impl : ( ruleSplitConnective ) ;
    public final void rule__SplitCommas__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:918:1: ( ( ruleSplitConnective ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:919:1: ( ruleSplitConnective )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:919:1: ( ruleSplitConnective )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:920:1: ruleSplitConnective
            {
             before(grammarAccess.getSplitCommasAccess().getSplitConnectiveParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSplitConnective_in_rule__SplitCommas__Group__0__Impl1869);
            ruleSplitConnective();
            _fsp--;

             after(grammarAccess.getSplitCommasAccess().getSplitConnectiveParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__Group__0__Impl


    // $ANTLR start rule__SplitCommas__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:931:1: rule__SplitCommas__Group__1 : rule__SplitCommas__Group__1__Impl ;
    public final void rule__SplitCommas__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:935:1: ( rule__SplitCommas__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:936:2: rule__SplitCommas__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SplitCommas__Group__1__Impl_in_rule__SplitCommas__Group__11898);
            rule__SplitCommas__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__Group__1


    // $ANTLR start rule__SplitCommas__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:942:1: rule__SplitCommas__Group__1__Impl : ( ( rule__SplitCommas__Group_1__0 )* ) ;
    public final void rule__SplitCommas__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:946:1: ( ( ( rule__SplitCommas__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:947:1: ( ( rule__SplitCommas__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:947:1: ( ( rule__SplitCommas__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:948:1: ( rule__SplitCommas__Group_1__0 )*
            {
             before(grammarAccess.getSplitCommasAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:949:1: ( rule__SplitCommas__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:949:2: rule__SplitCommas__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SplitCommas__Group_1__0_in_rule__SplitCommas__Group__1__Impl1925);
            	    rule__SplitCommas__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getSplitCommasAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__Group__1__Impl


    // $ANTLR start rule__SplitCommas__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:963:1: rule__SplitCommas__Group_1__0 : rule__SplitCommas__Group_1__0__Impl rule__SplitCommas__Group_1__1 ;
    public final void rule__SplitCommas__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:967:1: ( rule__SplitCommas__Group_1__0__Impl rule__SplitCommas__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:968:2: rule__SplitCommas__Group_1__0__Impl rule__SplitCommas__Group_1__1
            {
            pushFollow(FOLLOW_rule__SplitCommas__Group_1__0__Impl_in_rule__SplitCommas__Group_1__01960);
            rule__SplitCommas__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SplitCommas__Group_1__1_in_rule__SplitCommas__Group_1__01963);
            rule__SplitCommas__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__Group_1__0


    // $ANTLR start rule__SplitCommas__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:975:1: rule__SplitCommas__Group_1__0__Impl : ( () ) ;
    public final void rule__SplitCommas__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:979:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:980:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:980:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:981:1: ()
            {
             before(grammarAccess.getSplitCommasAccess().getSplitCommasLeftAction_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:982:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:984:1: 
            {
            }

             after(grammarAccess.getSplitCommasAccess().getSplitCommasLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__Group_1__0__Impl


    // $ANTLR start rule__SplitCommas__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:994:1: rule__SplitCommas__Group_1__1 : rule__SplitCommas__Group_1__1__Impl rule__SplitCommas__Group_1__2 ;
    public final void rule__SplitCommas__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:998:1: ( rule__SplitCommas__Group_1__1__Impl rule__SplitCommas__Group_1__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:999:2: rule__SplitCommas__Group_1__1__Impl rule__SplitCommas__Group_1__2
            {
            pushFollow(FOLLOW_rule__SplitCommas__Group_1__1__Impl_in_rule__SplitCommas__Group_1__12021);
            rule__SplitCommas__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SplitCommas__Group_1__2_in_rule__SplitCommas__Group_1__12024);
            rule__SplitCommas__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__Group_1__1


    // $ANTLR start rule__SplitCommas__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1006:1: rule__SplitCommas__Group_1__1__Impl : ( ',' ) ;
    public final void rule__SplitCommas__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1010:1: ( ( ',' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1011:1: ( ',' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1011:1: ( ',' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1012:1: ','
            {
             before(grammarAccess.getSplitCommasAccess().getCommaKeyword_1_1()); 
            match(input,26,FOLLOW_26_in_rule__SplitCommas__Group_1__1__Impl2052); 
             after(grammarAccess.getSplitCommasAccess().getCommaKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__Group_1__1__Impl


    // $ANTLR start rule__SplitCommas__Group_1__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1025:1: rule__SplitCommas__Group_1__2 : rule__SplitCommas__Group_1__2__Impl ;
    public final void rule__SplitCommas__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1029:1: ( rule__SplitCommas__Group_1__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1030:2: rule__SplitCommas__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SplitCommas__Group_1__2__Impl_in_rule__SplitCommas__Group_1__22083);
            rule__SplitCommas__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__Group_1__2


    // $ANTLR start rule__SplitCommas__Group_1__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1036:1: rule__SplitCommas__Group_1__2__Impl : ( ( rule__SplitCommas__RightAssignment_1_2 ) ) ;
    public final void rule__SplitCommas__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1040:1: ( ( ( rule__SplitCommas__RightAssignment_1_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1041:1: ( ( rule__SplitCommas__RightAssignment_1_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1041:1: ( ( rule__SplitCommas__RightAssignment_1_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1042:1: ( rule__SplitCommas__RightAssignment_1_2 )
            {
             before(grammarAccess.getSplitCommasAccess().getRightAssignment_1_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1043:1: ( rule__SplitCommas__RightAssignment_1_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1043:2: rule__SplitCommas__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SplitCommas__RightAssignment_1_2_in_rule__SplitCommas__Group_1__2__Impl2110);
            rule__SplitCommas__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getSplitCommasAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__Group_1__2__Impl


    // $ANTLR start rule__SplitConnective__Group__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1059:1: rule__SplitConnective__Group__0 : rule__SplitConnective__Group__0__Impl rule__SplitConnective__Group__1 ;
    public final void rule__SplitConnective__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1063:1: ( rule__SplitConnective__Group__0__Impl rule__SplitConnective__Group__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1064:2: rule__SplitConnective__Group__0__Impl rule__SplitConnective__Group__1
            {
            pushFollow(FOLLOW_rule__SplitConnective__Group__0__Impl_in_rule__SplitConnective__Group__02146);
            rule__SplitConnective__Group__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SplitConnective__Group__1_in_rule__SplitConnective__Group__02149);
            rule__SplitConnective__Group__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__Group__0


    // $ANTLR start rule__SplitConnective__Group__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1071:1: rule__SplitConnective__Group__0__Impl : ( ruleSplitParentheses ) ;
    public final void rule__SplitConnective__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1075:1: ( ( ruleSplitParentheses ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1076:1: ( ruleSplitParentheses )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1076:1: ( ruleSplitParentheses )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1077:1: ruleSplitParentheses
            {
             before(grammarAccess.getSplitConnectiveAccess().getSplitParenthesesParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSplitParentheses_in_rule__SplitConnective__Group__0__Impl2176);
            ruleSplitParentheses();
            _fsp--;

             after(grammarAccess.getSplitConnectiveAccess().getSplitParenthesesParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__Group__0__Impl


    // $ANTLR start rule__SplitConnective__Group__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1088:1: rule__SplitConnective__Group__1 : rule__SplitConnective__Group__1__Impl ;
    public final void rule__SplitConnective__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1092:1: ( rule__SplitConnective__Group__1__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1093:2: rule__SplitConnective__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SplitConnective__Group__1__Impl_in_rule__SplitConnective__Group__12205);
            rule__SplitConnective__Group__1__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__Group__1


    // $ANTLR start rule__SplitConnective__Group__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1099:1: rule__SplitConnective__Group__1__Impl : ( ( rule__SplitConnective__Group_1__0 )* ) ;
    public final void rule__SplitConnective__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1103:1: ( ( ( rule__SplitConnective__Group_1__0 )* ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1104:1: ( ( rule__SplitConnective__Group_1__0 )* )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1104:1: ( ( rule__SplitConnective__Group_1__0 )* )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1105:1: ( rule__SplitConnective__Group_1__0 )*
            {
             before(grammarAccess.getSplitConnectiveAccess().getGroup_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1106:1: ( rule__SplitConnective__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=18 && LA12_0<=19)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1106:2: rule__SplitConnective__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SplitConnective__Group_1__0_in_rule__SplitConnective__Group__1__Impl2232);
            	    rule__SplitConnective__Group_1__0();
            	    _fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getSplitConnectiveAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__Group__1__Impl


    // $ANTLR start rule__SplitConnective__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1120:1: rule__SplitConnective__Group_1__0 : rule__SplitConnective__Group_1__0__Impl rule__SplitConnective__Group_1__1 ;
    public final void rule__SplitConnective__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1124:1: ( rule__SplitConnective__Group_1__0__Impl rule__SplitConnective__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1125:2: rule__SplitConnective__Group_1__0__Impl rule__SplitConnective__Group_1__1
            {
            pushFollow(FOLLOW_rule__SplitConnective__Group_1__0__Impl_in_rule__SplitConnective__Group_1__02267);
            rule__SplitConnective__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SplitConnective__Group_1__1_in_rule__SplitConnective__Group_1__02270);
            rule__SplitConnective__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__Group_1__0


    // $ANTLR start rule__SplitConnective__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1132:1: rule__SplitConnective__Group_1__0__Impl : ( () ) ;
    public final void rule__SplitConnective__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1136:1: ( ( () ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1137:1: ( () )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1137:1: ( () )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1138:1: ()
            {
             before(grammarAccess.getSplitConnectiveAccess().getSplitConnectiveLeftAction_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1139:1: ()
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1141:1: 
            {
            }

             after(grammarAccess.getSplitConnectiveAccess().getSplitConnectiveLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__Group_1__0__Impl


    // $ANTLR start rule__SplitConnective__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1151:1: rule__SplitConnective__Group_1__1 : rule__SplitConnective__Group_1__1__Impl rule__SplitConnective__Group_1__2 ;
    public final void rule__SplitConnective__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1155:1: ( rule__SplitConnective__Group_1__1__Impl rule__SplitConnective__Group_1__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1156:2: rule__SplitConnective__Group_1__1__Impl rule__SplitConnective__Group_1__2
            {
            pushFollow(FOLLOW_rule__SplitConnective__Group_1__1__Impl_in_rule__SplitConnective__Group_1__12328);
            rule__SplitConnective__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SplitConnective__Group_1__2_in_rule__SplitConnective__Group_1__12331);
            rule__SplitConnective__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__Group_1__1


    // $ANTLR start rule__SplitConnective__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1163:1: rule__SplitConnective__Group_1__1__Impl : ( ( rule__SplitConnective__ConnectiveAssignment_1_1 ) ) ;
    public final void rule__SplitConnective__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1167:1: ( ( ( rule__SplitConnective__ConnectiveAssignment_1_1 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1168:1: ( ( rule__SplitConnective__ConnectiveAssignment_1_1 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1168:1: ( ( rule__SplitConnective__ConnectiveAssignment_1_1 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1169:1: ( rule__SplitConnective__ConnectiveAssignment_1_1 )
            {
             before(grammarAccess.getSplitConnectiveAccess().getConnectiveAssignment_1_1()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1170:1: ( rule__SplitConnective__ConnectiveAssignment_1_1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1170:2: rule__SplitConnective__ConnectiveAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SplitConnective__ConnectiveAssignment_1_1_in_rule__SplitConnective__Group_1__1__Impl2358);
            rule__SplitConnective__ConnectiveAssignment_1_1();
            _fsp--;


            }

             after(grammarAccess.getSplitConnectiveAccess().getConnectiveAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__Group_1__1__Impl


    // $ANTLR start rule__SplitConnective__Group_1__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1180:1: rule__SplitConnective__Group_1__2 : rule__SplitConnective__Group_1__2__Impl ;
    public final void rule__SplitConnective__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1184:1: ( rule__SplitConnective__Group_1__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1185:2: rule__SplitConnective__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SplitConnective__Group_1__2__Impl_in_rule__SplitConnective__Group_1__22388);
            rule__SplitConnective__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__Group_1__2


    // $ANTLR start rule__SplitConnective__Group_1__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1191:1: rule__SplitConnective__Group_1__2__Impl : ( ( rule__SplitConnective__RightAssignment_1_2 ) ) ;
    public final void rule__SplitConnective__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1195:1: ( ( ( rule__SplitConnective__RightAssignment_1_2 ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1196:1: ( ( rule__SplitConnective__RightAssignment_1_2 ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1196:1: ( ( rule__SplitConnective__RightAssignment_1_2 ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1197:1: ( rule__SplitConnective__RightAssignment_1_2 )
            {
             before(grammarAccess.getSplitConnectiveAccess().getRightAssignment_1_2()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1198:1: ( rule__SplitConnective__RightAssignment_1_2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1198:2: rule__SplitConnective__RightAssignment_1_2
            {
            pushFollow(FOLLOW_rule__SplitConnective__RightAssignment_1_2_in_rule__SplitConnective__Group_1__2__Impl2415);
            rule__SplitConnective__RightAssignment_1_2();
            _fsp--;


            }

             after(grammarAccess.getSplitConnectiveAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__Group_1__2__Impl


    // $ANTLR start rule__SplitParentheses__Group_1__0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1214:1: rule__SplitParentheses__Group_1__0 : rule__SplitParentheses__Group_1__0__Impl rule__SplitParentheses__Group_1__1 ;
    public final void rule__SplitParentheses__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1218:1: ( rule__SplitParentheses__Group_1__0__Impl rule__SplitParentheses__Group_1__1 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1219:2: rule__SplitParentheses__Group_1__0__Impl rule__SplitParentheses__Group_1__1
            {
            pushFollow(FOLLOW_rule__SplitParentheses__Group_1__0__Impl_in_rule__SplitParentheses__Group_1__02451);
            rule__SplitParentheses__Group_1__0__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SplitParentheses__Group_1__1_in_rule__SplitParentheses__Group_1__02454);
            rule__SplitParentheses__Group_1__1();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitParentheses__Group_1__0


    // $ANTLR start rule__SplitParentheses__Group_1__0__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1226:1: rule__SplitParentheses__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SplitParentheses__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1230:1: ( ( '(' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1231:1: ( '(' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1231:1: ( '(' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1232:1: '('
            {
             before(grammarAccess.getSplitParenthesesAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,27,FOLLOW_27_in_rule__SplitParentheses__Group_1__0__Impl2482); 
             after(grammarAccess.getSplitParenthesesAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitParentheses__Group_1__0__Impl


    // $ANTLR start rule__SplitParentheses__Group_1__1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1245:1: rule__SplitParentheses__Group_1__1 : rule__SplitParentheses__Group_1__1__Impl rule__SplitParentheses__Group_1__2 ;
    public final void rule__SplitParentheses__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1249:1: ( rule__SplitParentheses__Group_1__1__Impl rule__SplitParentheses__Group_1__2 )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1250:2: rule__SplitParentheses__Group_1__1__Impl rule__SplitParentheses__Group_1__2
            {
            pushFollow(FOLLOW_rule__SplitParentheses__Group_1__1__Impl_in_rule__SplitParentheses__Group_1__12513);
            rule__SplitParentheses__Group_1__1__Impl();
            _fsp--;

            pushFollow(FOLLOW_rule__SplitParentheses__Group_1__2_in_rule__SplitParentheses__Group_1__12516);
            rule__SplitParentheses__Group_1__2();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitParentheses__Group_1__1


    // $ANTLR start rule__SplitParentheses__Group_1__1__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1257:1: rule__SplitParentheses__Group_1__1__Impl : ( ruleSplitCommas ) ;
    public final void rule__SplitParentheses__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1261:1: ( ( ruleSplitCommas ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1262:1: ( ruleSplitCommas )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1262:1: ( ruleSplitCommas )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1263:1: ruleSplitCommas
            {
             before(grammarAccess.getSplitParenthesesAccess().getSplitCommasParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleSplitCommas_in_rule__SplitParentheses__Group_1__1__Impl2543);
            ruleSplitCommas();
            _fsp--;

             after(grammarAccess.getSplitParenthesesAccess().getSplitCommasParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitParentheses__Group_1__1__Impl


    // $ANTLR start rule__SplitParentheses__Group_1__2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1274:1: rule__SplitParentheses__Group_1__2 : rule__SplitParentheses__Group_1__2__Impl ;
    public final void rule__SplitParentheses__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1278:1: ( rule__SplitParentheses__Group_1__2__Impl )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1279:2: rule__SplitParentheses__Group_1__2__Impl
            {
            pushFollow(FOLLOW_rule__SplitParentheses__Group_1__2__Impl_in_rule__SplitParentheses__Group_1__22572);
            rule__SplitParentheses__Group_1__2__Impl();
            _fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitParentheses__Group_1__2


    // $ANTLR start rule__SplitParentheses__Group_1__2__Impl
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1285:1: rule__SplitParentheses__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SplitParentheses__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1289:1: ( ( ')' ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1290:1: ( ')' )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1290:1: ( ')' )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1291:1: ')'
            {
             before(grammarAccess.getSplitParenthesesAccess().getRightParenthesisKeyword_1_2()); 
            match(input,28,FOLLOW_28_in_rule__SplitParentheses__Group_1__2__Impl2600); 
             after(grammarAccess.getSplitParenthesesAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitParentheses__Group_1__2__Impl


    // $ANTLR start rule__ArgumentDiagram__NameAssignment_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1311:1: rule__ArgumentDiagram__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ArgumentDiagram__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1315:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1316:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1316:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1317:1: RULE_ID
            {
             before(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArgumentDiagram__NameAssignment_12642); 
             after(grammarAccess.getArgumentDiagramAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__NameAssignment_1


    // $ANTLR start rule__ArgumentDiagram__HighlightAssignment_2_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1326:1: rule__ArgumentDiagram__HighlightAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__ArgumentDiagram__HighlightAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1330:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1331:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1331:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1332:1: ( RULE_ID )
            {
             before(grammarAccess.getArgumentDiagramAccess().getHighlightNodeCrossReference_2_1_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1333:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1334:1: RULE_ID
            {
             before(grammarAccess.getArgumentDiagramAccess().getHighlightNodeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__ArgumentDiagram__HighlightAssignment_2_12677); 
             after(grammarAccess.getArgumentDiagramAccess().getHighlightNodeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getArgumentDiagramAccess().getHighlightNodeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__HighlightAssignment_2_1


    // $ANTLR start rule__ArgumentDiagram__NodesAssignment_3_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1345:1: rule__ArgumentDiagram__NodesAssignment_3_0 : ( ruleNode ) ;
    public final void rule__ArgumentDiagram__NodesAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1349:1: ( ( ruleNode ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1350:1: ( ruleNode )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1350:1: ( ruleNode )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1351:1: ruleNode
            {
             before(grammarAccess.getArgumentDiagramAccess().getNodesNodeParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_ruleNode_in_rule__ArgumentDiagram__NodesAssignment_3_02712);
            ruleNode();
            _fsp--;

             after(grammarAccess.getArgumentDiagramAccess().getNodesNodeParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__NodesAssignment_3_0


    // $ANTLR start rule__ArgumentDiagram__LinksAssignment_3_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1360:1: rule__ArgumentDiagram__LinksAssignment_3_1 : ( ruleLink ) ;
    public final void rule__ArgumentDiagram__LinksAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1364:1: ( ( ruleLink ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1365:1: ( ruleLink )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1365:1: ( ruleLink )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1366:1: ruleLink
            {
             before(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_ruleLink_in_rule__ArgumentDiagram__LinksAssignment_3_12743);
            ruleLink();
            _fsp--;

             after(grammarAccess.getArgumentDiagramAccess().getLinksLinkParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__ArgumentDiagram__LinksAssignment_3_1


    // $ANTLR start rule__Node__NameAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1375:1: rule__Node__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Node__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1379:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1380:1: ( RULE_ID )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1380:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1381:1: RULE_ID
            {
             before(grammarAccess.getNodeAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Node__NameAssignment_02774); 
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


    // $ANTLR start rule__Node__TypeAssignment_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1390:1: rule__Node__TypeAssignment_1 : ( ruleNodeType ) ;
    public final void rule__Node__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1394:1: ( ( ruleNodeType ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1395:1: ( ruleNodeType )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1395:1: ( ruleNodeType )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1396:1: ruleNodeType
            {
             before(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_12805);
            ruleNodeType();
            _fsp--;

             after(grammarAccess.getNodeAccess().getTypeNodeTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__TypeAssignment_1


    // $ANTLR start rule__Node__DescriptionAssignment_2_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1405:1: rule__Node__DescriptionAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Node__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1409:1: ( ( RULE_STRING ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1410:1: ( RULE_STRING )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1410:1: ( RULE_STRING )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1411:1: RULE_STRING
            {
             before(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_12836); 
             after(grammarAccess.getNodeAccess().getDescriptionSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Node__DescriptionAssignment_2_1


    // $ANTLR start rule__Link__AfromAssignment_0
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1420:1: rule__Link__AfromAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__Link__AfromAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1424:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1425:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1425:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1426:1: ( RULE_ID )
            {
             before(grammarAccess.getLinkAccess().getAfromNodeCrossReference_0_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1427:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1428:1: RULE_ID
            {
             before(grammarAccess.getLinkAccess().getAfromNodeIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Link__AfromAssignment_02871); 
             after(grammarAccess.getLinkAccess().getAfromNodeIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getLinkAccess().getAfromNodeCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__AfromAssignment_0


    // $ANTLR start rule__Link__LinkAssignment_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1439:1: rule__Link__LinkAssignment_1 : ( ruleLinkType ) ;
    public final void rule__Link__LinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1443:1: ( ( ruleLinkType ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1444:1: ( ruleLinkType )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1444:1: ( ruleLinkType )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1445:1: ruleLinkType
            {
             before(grammarAccess.getLinkAccess().getLinkLinkTypeEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLinkType_in_rule__Link__LinkAssignment_12906);
            ruleLinkType();
            _fsp--;

             after(grammarAccess.getLinkAccess().getLinkLinkTypeEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__LinkAssignment_1


    // $ANTLR start rule__Link__ToNode1Assignment_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1454:1: rule__Link__ToNode1Assignment_2 : ( ruleSplitCommas ) ;
    public final void rule__Link__ToNode1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1458:1: ( ( ruleSplitCommas ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1459:1: ( ruleSplitCommas )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1459:1: ( ruleSplitCommas )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1460:1: ruleSplitCommas
            {
             before(grammarAccess.getLinkAccess().getToNode1SplitCommasParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSplitCommas_in_rule__Link__ToNode1Assignment_22937);
            ruleSplitCommas();
            _fsp--;

             after(grammarAccess.getLinkAccess().getToNode1SplitCommasParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__Link__ToNode1Assignment_2


    // $ANTLR start rule__SplitCommas__RightAssignment_1_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1469:1: rule__SplitCommas__RightAssignment_1_2 : ( ruleSplitConnective ) ;
    public final void rule__SplitCommas__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1473:1: ( ( ruleSplitConnective ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1474:1: ( ruleSplitConnective )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1474:1: ( ruleSplitConnective )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1475:1: ruleSplitConnective
            {
             before(grammarAccess.getSplitCommasAccess().getRightSplitConnectiveParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSplitConnective_in_rule__SplitCommas__RightAssignment_1_22968);
            ruleSplitConnective();
            _fsp--;

             after(grammarAccess.getSplitCommasAccess().getRightSplitConnectiveParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitCommas__RightAssignment_1_2


    // $ANTLR start rule__SplitConnective__ConnectiveAssignment_1_1
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1484:1: rule__SplitConnective__ConnectiveAssignment_1_1 : ( ruleConnectiveType ) ;
    public final void rule__SplitConnective__ConnectiveAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1488:1: ( ( ruleConnectiveType ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1489:1: ( ruleConnectiveType )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1489:1: ( ruleConnectiveType )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1490:1: ruleConnectiveType
            {
             before(grammarAccess.getSplitConnectiveAccess().getConnectiveConnectiveTypeEnumRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleConnectiveType_in_rule__SplitConnective__ConnectiveAssignment_1_12999);
            ruleConnectiveType();
            _fsp--;

             after(grammarAccess.getSplitConnectiveAccess().getConnectiveConnectiveTypeEnumRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__ConnectiveAssignment_1_1


    // $ANTLR start rule__SplitConnective__RightAssignment_1_2
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1499:1: rule__SplitConnective__RightAssignment_1_2 : ( ruleSplitParentheses ) ;
    public final void rule__SplitConnective__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1503:1: ( ( ruleSplitParentheses ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1504:1: ( ruleSplitParentheses )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1504:1: ( ruleSplitParentheses )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1505:1: ruleSplitParentheses
            {
             before(grammarAccess.getSplitConnectiveAccess().getRightSplitParenthesesParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_ruleSplitParentheses_in_rule__SplitConnective__RightAssignment_1_23030);
            ruleSplitParentheses();
            _fsp--;

             after(grammarAccess.getSplitConnectiveAccess().getRightSplitParenthesesParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__SplitConnective__RightAssignment_1_2


    // $ANTLR start rule__NodeLiteral__ValueAssignment
    // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1514:1: rule__NodeLiteral__ValueAssignment : ( ( RULE_ID ) ) ;
    public final void rule__NodeLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1518:1: ( ( ( RULE_ID ) ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1519:1: ( ( RULE_ID ) )
            {
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1519:1: ( ( RULE_ID ) )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1520:1: ( RULE_ID )
            {
             before(grammarAccess.getNodeLiteralAccess().getValueNodeCrossReference_0()); 
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1521:1: ( RULE_ID )
            // ../argument.ui/src-gen/uk/ac/open/argument/ui/contentassist/antlr/internal/InternalArgument.g:1522:1: RULE_ID
            {
             before(grammarAccess.getNodeLiteralAccess().getValueNodeIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__NodeLiteral__ValueAssignment3065); 
             after(grammarAccess.getNodeLiteralAccess().getValueNodeIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getNodeLiteralAccess().getValueNodeCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end rule__NodeLiteral__ValueAssignment


 

    public static final BitSet FOLLOW_ruleArgumentDiagram_in_entryRuleArgumentDiagram61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentDiagram68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__0_in_ruleArgumentDiagram94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_entryRuleNode121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNode128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0_in_ruleNode154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_entryRuleLink181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLink188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0_in_ruleLink214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitCommas_in_entryRuleSplitCommas241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitCommas248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitCommas__Group__0_in_ruleSplitCommas274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitConnective_in_entryRuleSplitConnective301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitConnective308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitConnective__Group__0_in_ruleSplitConnective334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitParentheses_in_entryRuleSplitParentheses361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSplitParentheses368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitParentheses__Alternatives_in_ruleSplitParentheses394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLiteral_in_entryRuleNodeLiteral421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNodeLiteral428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeLiteral__ValueAssignment_in_ruleNodeLiteral454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__NodeType__Alternatives_in_ruleNodeType491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ConnectiveType__Alternatives_in_ruleConnectiveType527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LinkType__Alternatives_in_ruleLinkType563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__NodesAssignment_3_0_in_rule__ArgumentDiagram__Alternatives_3598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__LinksAssignment_3_1_in_rule__ArgumentDiagram__Alternatives_3616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeLiteral_in_rule__SplitParentheses__Alternatives649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitParentheses__Group_1__0_in_rule__SplitParentheses__Alternatives666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__NodeType__Alternatives700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__NodeType__Alternatives721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__NodeType__Alternatives742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__NodeType__Alternatives763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__NodeType__Alternatives784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__NodeType__Alternatives805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__ConnectiveType__Alternatives841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__ConnectiveType__Alternatives862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__LinkType__Alternatives898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__LinkType__Alternatives919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__LinkType__Alternatives940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__0__Impl_in_rule__ArgumentDiagram__Group__0973 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__1_in_rule__ArgumentDiagram__Group__0976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__ArgumentDiagram__Group__0__Impl1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__1__Impl_in_rule__ArgumentDiagram__Group__11035 = new BitSet(new long[]{0x0000000001000012L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__2_in_rule__ArgumentDiagram__Group__11038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__NameAssignment_1_in_rule__ArgumentDiagram__Group__1__Impl1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__2__Impl_in_rule__ArgumentDiagram__Group__21095 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__3_in_rule__ArgumentDiagram__Group__21098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_2__0_in_rule__ArgumentDiagram__Group__2__Impl1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group__3__Impl_in_rule__ArgumentDiagram__Group__31156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Alternatives_3_in_rule__ArgumentDiagram__Group__3__Impl1183 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_2__0__Impl_in_rule__ArgumentDiagram__Group_2__01222 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_2__1_in_rule__ArgumentDiagram__Group_2__01225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__ArgumentDiagram__Group_2__0__Impl1253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__Group_2__1__Impl_in_rule__ArgumentDiagram__Group_2__11284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArgumentDiagram__HighlightAssignment_2_1_in_rule__ArgumentDiagram__Group_2__1__Impl1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__0__Impl_in_rule__Node__Group__01345 = new BitSet(new long[]{0x000000000203F022L});
    public static final BitSet FOLLOW_rule__Node__Group__1_in_rule__Node__Group__01348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__NameAssignment_0_in_rule__Node__Group__0__Impl1375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__1__Impl_in_rule__Node__Group__11405 = new BitSet(new long[]{0x0000000002000022L});
    public static final BitSet FOLLOW_rule__Node__Group__2_in_rule__Node__Group__11408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__TypeAssignment_1_in_rule__Node__Group__1__Impl1435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group__2__Impl_in_rule__Node__Group__21466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0_in_rule__Node__Group__2__Impl1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__0__Impl_in_rule__Node__Group_2__01530 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1_in_rule__Node__Group_2__01533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Node__Group_2__0__Impl1562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__Group_2__1__Impl_in_rule__Node__Group_2__11595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Node__DescriptionAssignment_2_1_in_rule__Node__Group_2__1__Impl1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__0__Impl_in_rule__Link__Group__01656 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_rule__Link__Group__1_in_rule__Link__Group__01659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__AfromAssignment_0_in_rule__Link__Group__0__Impl1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__1__Impl_in_rule__Link__Group__11716 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__Link__Group__2_in_rule__Link__Group__11719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__LinkAssignment_1_in_rule__Link__Group__1__Impl1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__Group__2__Impl_in_rule__Link__Group__21776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Link__ToNode1Assignment_2_in_rule__Link__Group__2__Impl1803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitCommas__Group__0__Impl_in_rule__SplitCommas__Group__01839 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__SplitCommas__Group__1_in_rule__SplitCommas__Group__01842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitConnective_in_rule__SplitCommas__Group__0__Impl1869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitCommas__Group__1__Impl_in_rule__SplitCommas__Group__11898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitCommas__Group_1__0_in_rule__SplitCommas__Group__1__Impl1925 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_rule__SplitCommas__Group_1__0__Impl_in_rule__SplitCommas__Group_1__01960 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__SplitCommas__Group_1__1_in_rule__SplitCommas__Group_1__01963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitCommas__Group_1__1__Impl_in_rule__SplitCommas__Group_1__12021 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__SplitCommas__Group_1__2_in_rule__SplitCommas__Group_1__12024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__SplitCommas__Group_1__1__Impl2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitCommas__Group_1__2__Impl_in_rule__SplitCommas__Group_1__22083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitCommas__RightAssignment_1_2_in_rule__SplitCommas__Group_1__2__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitConnective__Group__0__Impl_in_rule__SplitConnective__Group__02146 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__SplitConnective__Group__1_in_rule__SplitConnective__Group__02149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitParentheses_in_rule__SplitConnective__Group__0__Impl2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitConnective__Group__1__Impl_in_rule__SplitConnective__Group__12205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitConnective__Group_1__0_in_rule__SplitConnective__Group__1__Impl2232 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_rule__SplitConnective__Group_1__0__Impl_in_rule__SplitConnective__Group_1__02267 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rule__SplitConnective__Group_1__1_in_rule__SplitConnective__Group_1__02270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitConnective__Group_1__1__Impl_in_rule__SplitConnective__Group_1__12328 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__SplitConnective__Group_1__2_in_rule__SplitConnective__Group_1__12331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitConnective__ConnectiveAssignment_1_1_in_rule__SplitConnective__Group_1__1__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitConnective__Group_1__2__Impl_in_rule__SplitConnective__Group_1__22388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitConnective__RightAssignment_1_2_in_rule__SplitConnective__Group_1__2__Impl2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitParentheses__Group_1__0__Impl_in_rule__SplitParentheses__Group_1__02451 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_rule__SplitParentheses__Group_1__1_in_rule__SplitParentheses__Group_1__02454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SplitParentheses__Group_1__0__Impl2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitParentheses__Group_1__1__Impl_in_rule__SplitParentheses__Group_1__12513 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SplitParentheses__Group_1__2_in_rule__SplitParentheses__Group_1__12516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitCommas_in_rule__SplitParentheses__Group_1__1__Impl2543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SplitParentheses__Group_1__2__Impl_in_rule__SplitParentheses__Group_1__22572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SplitParentheses__Group_1__2__Impl2600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArgumentDiagram__NameAssignment_12642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__ArgumentDiagram__HighlightAssignment_2_12677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNode_in_rule__ArgumentDiagram__NodesAssignment_3_02712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLink_in_rule__ArgumentDiagram__LinksAssignment_3_12743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Node__NameAssignment_02774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNodeType_in_rule__Node__TypeAssignment_12805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Node__DescriptionAssignment_2_12836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Link__AfromAssignment_02871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLinkType_in_rule__Link__LinkAssignment_12906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitCommas_in_rule__Link__ToNode1Assignment_22937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitConnective_in_rule__SplitCommas__RightAssignment_1_22968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConnectiveType_in_rule__SplitConnective__ConnectiveAssignment_1_12999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSplitParentheses_in_rule__SplitConnective__RightAssignment_1_23030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__NodeLiteral__ValueAssignment3065 = new BitSet(new long[]{0x0000000000000002L});

}